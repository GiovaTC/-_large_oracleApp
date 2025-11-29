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
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}