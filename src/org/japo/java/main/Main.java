/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
 // instanciar Scanner
         public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {
        // Variables
        double nota = 0;

        // bucle
        do {
        // Entrada
            boolean testOK = true;
            do {
                
                try {
        // Entrada dato
                    System.out.print("Inserte la nota del alumno .....: ");
                    nota = SCN.nextDouble();
                    testOK = false;
                    
                } catch (Exception e) {
        // Entrada incorrecta
                    System.out.println("ERROR: Entrada incorrecta");
                } finally {
        // Vaciar buffer
                    SCN.nextLine();
                }
            } while (testOK);

        // aprobado o suspenso
            if (nota < 5 || nota > 10) {
                System.out.println("Suspenso: el alumno ha suspendido");
            }
        } while (nota < 5 || nota > 10);

        // Salida
        
        System.out.printf(Locale.ENGLISH, "El alumno ha APROBADO con un ...: %.2f%n", nota);
    }
}

