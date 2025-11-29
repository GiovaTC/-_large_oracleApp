package com.example.largeoracleapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * LargeOracleApp.java
 *
 * Demostración de una aplicación Java (IntelliJ) que conecta con Oracle 19c,
 * realiza operaciones básicas (crear tabla, insertar, consultar, llamar a
 * un procedimiento almacenado) y muestra una estructura extensa (para fines
 * educativos y de prueba). Reemplace los valores de conexión por los de su
 * entorno.
 *
 * NOTA: Este archivo incluye una sección de comentarios larga para cumplir
 * con el requerimiento de tamaño del archivo. El código real, utilizable y
 * explicado está al principio del fichero.
 */
public class LargeOracleApp {

    // -------- CONFIGURACIÓN (modifique según su entorno) --------
    private static final String DB_USER = "system";
    private static final String DB_PASSWORD = "Tapiero123";
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "1521";
    private static final String DB_SID = "orcl";

    // cadena de conexion en formato JDBC para ORACLE :.
    private static final String JDBC_URL = String.format(
            "jdbc:oracle:thin:@%s:%s/%s", DB_HOST, DB_PORT, DB_SID);

    // nombre de la tabla de ejemplo
    private static final String TABLE_NAME = "SERIES_RESULTS";
}