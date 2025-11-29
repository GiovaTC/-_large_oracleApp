----------------------------------------------------------
-- 1?? Verificar si la tabla existe, si no, crearla
----------------------------------------------------------
BEGIN
    EXECUTE IMMEDIATE '
        CREATE TABLE SERIES_RESULTS (
            ID NUMBER PRIMARY KEY,
            VALUE NUMBER,
            CREATED_AT DATE
        )
    ';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -955 THEN -- ORA-00955: nombre ya existe
            RAISE;
        END IF;
END;
/
----------------------------------------------------------
-- 2?? Verificar si la secuencia existe, si no, crearla
----------------------------------------------------------
DECLARE
    v_count NUMBER;
BEGIN
    SELECT COUNT(*) INTO v_count FROM USER_SEQUENCES
    WHERE SEQUENCE_NAME = 'SEQ_SERIES_RESULTS';

    IF v_count = 0 THEN
        EXECUTE IMMEDIATE '
            CREATE SEQUENCE SEQ_SERIES_RESULTS
            START WITH 1
            INCREMENT BY 1
            NOCACHE
        ';
    END IF;
END;
/
----------------------------------------------------------
-- 3?? Crear (o reemplazar) el procedimiento almacenado
----------------------------------------------------------
CREATE OR REPLACE PROCEDURE SP_LOG_VALUE (
    P_VALUE IN NUMBER
) AS
BEGIN
    INSERT INTO SERIES_RESULTS (ID, VALUE, CREATED_AT)
    VALUES (SEQ_SERIES_RESULTS.NEXTVAL, P_VALUE, SYSDATE);

    COMMIT;
END;
/
----------------------------------------------------------
-- 4?? Probar el procedimiento
----------------------------------------------------------
BEGIN
    SP_LOG_VALUE(123456);
END;
/
----------------------------------------------------------
-- 5?? Consultar resultado
----------------------------------------------------------
SELECT * FROM SERIES_RESULTS ORDER BY ID DESC;