package com.mycompany.farmacia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Comparator;

public class Farmacia {

    public static void main(String[] args) {
        Pastillas[] pastillas = new Pastillas[150];
        Jarabes[] jarabes = new Jarabes[100];
        Pomadas[] pomadas = new Pomadas[100];

        Scanner leer = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        int op = 0;
        String op2;

        //medicamentos en general
        String nombre;
        String laboratorio;
        boolean generico;
        int codigoBarras;
        float costo;
        float precioPublico;
        String fechaFabricacion;
        LocalDate dateF;
        String fechaCaducidad;
        LocalDate dateC;
        //pastillas
        int numTabletas;
        float miligramos;

        int contadorP = 0;
        //jarabes
        float mililitros;
        boolean vasoDosificador;

        int contadorJ = 0;
        //pomadas
        float gramos;
        int contadorPom = 0;

        //para opcion1
        String tipoM;
        
        //stringconfirmacion
        String confirmexit;
        boolean exit=false;
        do {
            System.out.println("=======FARMACIAS DEL AHORRO========");
            System.out.println("1.-Ingresar un medicamento.");
            System.out.println("2.-Borrar un medicamento.");
            System.out.println("3.-Modificar un medicamento.");
            System.out.println("4.-Imprimir Medicamento de Patente.");
            System.out.println("5.-Imprimir Medicamento Genérico");
            System.out.println("6.-Imprimir Resumen");
            System.out.println("7.-Buscar");
            System.out.println("8.-Ordenar por método de la Burbuja e Imprimir.");
            System.out.println("9.-Salir");

            System.out.print("\nSeleccione una opcion: ");
            op = Integer.parseInt(leer.nextLine().trim());

        
            switch (op) {
                case 1:
                    System.out.println("\n1.Ingresar un medicamento");
                    System.out.println("a) Pastillas.");
                    System.out.println("b) Jarabes.");
                    System.out.println("c) Pomadas");
                    System.out.print("\nSeleccione una opcion: ");
                    op2 = leer.nextLine().trim();
                       
                    switch (op2) {
                        case "a":
                            tipoM = "UNA PASTILLA";
                            System.out.println("======INGRESAR " + tipoM + "=====");
                            System.out.print("Ingrese el nombre: ");
                            nombre = leer.nextLine().trim();
                                 
                            System.out.print("Ingrese el laboratorio: ");
                            laboratorio = leer.nextLine().trim();
                                   
                            System.out.print("¿Es generico?: ");
                            generico = Boolean.parseBoolean(leer.nextLine().trim());
                                  
                            System.out.print("Ingrese el codigo de barras: ");
                            codigoBarras = Integer.parseInt(leer.nextLine().trim());
                                 
                            System.out.print("Ingrese el costo: ");
                            costo = Float.parseFloat(leer.nextLine().trim());
                                 
                            System.out.print("Ingrese el precio al publico: ");
                            precioPublico = Float.parseFloat(leer.nextLine().trim());
      
                            dateF = null;
                            while (dateF == null) {
                                System.out.print("Ingrese la fecha de fabricacion: ");
                                fechaFabricacion = leer.nextLine().trim();
                                try {
                                    dateF = LocalDate.parse(fechaFabricacion, formatter);
                                } catch (DateTimeParseException e) {
                                    System.out.println("Invalid date format. Please try again.");
                                }
                            }
                                  

                            ;
                            dateC = null;
                            while (dateC == null) {
                                System.out.print("Ingrese la fecha de caducidad: ");
                                fechaCaducidad = leer.nextLine().trim();
                                       
                                try {
                                    dateC = LocalDate.parse(fechaCaducidad, formatter);
                                } catch (DateTimeParseException e) {
                                    System.out.println("Invalid date format. Please try again.");
                                }
                            }
                            System.out.print("Ingrese el num. de tabletas: ");
                            numTabletas = Integer.parseInt(leer.nextLine().trim());
                                   
                            System.out.print("Ingrese el numero de miligramos: ");
                            miligramos = Float.parseFloat(leer.nextLine().trim());
                                  
                            //creacion del objeto
                            pastillas[contadorP] = new Pastillas();
                            //set esos datos;
                            pastillas[contadorP].setNombre(nombre);
                            pastillas[contadorP].setLaboratorio(laboratorio);
                            pastillas[contadorP].setGenerico(generico);
                            pastillas[contadorP].setCodigoBarras(codigoBarras);
                            pastillas[contadorP].setCosto(costo);
                            pastillas[contadorP].setPrecioPublico(precioPublico);
                            pastillas[contadorP].setFechaFabricacion(dateF);
                            pastillas[contadorP].setFechaCaducidad(dateC);

                            pastillas[contadorP].setNumTabletas(numTabletas);
                            pastillas[contadorP].setMiligramos(miligramos);

                            contadorP++;
                       
                            break;

                        case "b":
                            tipoM = "UN JARABE";
                            System.out.println("======INGRESAR " + tipoM + "=====");
                            System.out.print("Ingrese el nombre: ");
                            nombre = leer.nextLine().trim();
                                 
                            System.out.print("Ingrese el laboratorio: ");
                            laboratorio = leer.nextLine().trim();
                                   
                            System.out.print("¿Es generico?: ");
                            generico = Boolean.parseBoolean(leer.nextLine().trim());
                                  
                            System.out.print("Ingrese el codigo de barras: ");
                            codigoBarras = Integer.parseInt(leer.nextLine().trim());
                                 
                            System.out.print("Ingrese el costo: ");
                            costo = Float.parseFloat(leer.nextLine().trim());
                                 
                            System.out.print("Ingrese el precio al publico: ");
                            precioPublico = Float.parseFloat(leer.nextLine().trim());
      
                            dateF = null;
                            while (dateF == null) {
                                System.out.print("Ingrese la fecha de fabricacion: ");
                                fechaFabricacion = leer.nextLine().trim();
                                try {
                                    dateF = LocalDate.parse(fechaFabricacion, formatter);
                                } catch (DateTimeParseException e) {
                                    System.out.println("Invalid date format. Please try again.");
                                }
                            }
                                  

                            ;
                            dateC = null;
                            while (dateC == null) {
                                System.out.print("Ingrese la fecha de caducidad: ");
                                fechaCaducidad = leer.nextLine().trim();
                                       
                                try {
                                    dateC = LocalDate.parse(fechaCaducidad, formatter);
                                } catch (DateTimeParseException e) {
                                    System.out.println("Invalid date format. Please try again.");
                                }
                            }

                            System.out.print("Ingrese los mililitros: ");
                            mililitros = Float.parseFloat(leer.nextLine().trim());
                                  
                            System.out.print("¿Tiene vaso dosificador?: ");
                            vasoDosificador = Boolean.parseBoolean(leer.nextLine().trim());
                                  
 //creacion del objeto
                            jarabes[contadorJ] = new Jarabes();
                            jarabes[contadorJ].setNombre(nombre);
                            jarabes[contadorJ].setLaboratorio(laboratorio);
                            jarabes[contadorJ].setGenerico(generico);
                            jarabes[contadorJ].setCodigoBarras(codigoBarras);
                            jarabes[contadorJ].setCosto(costo);
                            jarabes[contadorJ].setPrecioPublico(precioPublico);
                            jarabes[contadorJ].setFechaFabricacion(dateF);
                            jarabes[contadorJ].setFechaCaducidad(dateC);

                            jarabes[contadorJ].setMililitros(mililitros);
                            jarabes[contadorJ].setVasoDosificador(vasoDosificador);

                            contadorJ++;
                           

                            break;
                        case "c":
                            tipoM = "UNA POMADA";
                            System.out.println("======INGRESAR " + tipoM + "=====");
                            System.out.print("Ingrese el nombre: ");
                            nombre = leer.nextLine().trim();
                                 
                            System.out.print("Ingrese el laboratorio: ");
                            laboratorio = leer.nextLine().trim();
                                   
                            System.out.print("¿Es generico?: ");
                            generico = Boolean.parseBoolean(leer.nextLine().trim());
                                  
                            System.out.print("Ingrese el codigo de barras: ");
                            codigoBarras = Integer.parseInt(leer.nextLine().trim());
                                 
                            System.out.print("Ingrese el costo: ");
                            costo = Float.parseFloat(leer.nextLine().trim());
                                 
                            System.out.print("Ingrese el precio al publico: ");
                            precioPublico = Float.parseFloat(leer.nextLine().trim());
      
                            dateF = null;
                            while (dateF == null) {
                                System.out.print("Ingrese la fecha de fabricacion: ");
                                fechaFabricacion = leer.nextLine().trim();
                                try {
                                    dateF = LocalDate.parse(fechaFabricacion, formatter);
                                } catch (DateTimeParseException e) {
                                    System.out.println("Invalid date format. Please try again.");
                                }
                            }
                                  

                            ;
                            dateC = null;
                            while (dateC == null) {
                                System.out.print("Ingrese la fecha de caducidad: ");
                                fechaCaducidad = leer.nextLine().trim();
                                       
                                try {
                                    dateC = LocalDate.parse(fechaCaducidad, formatter);
                                } catch (DateTimeParseException e) {
                                    System.out.println("Invalid date format. Please try again.");
                                }
                            }
                            System.out.print("Ingrese los gramos: ");
                            gramos = Float.parseFloat(leer.nextLine().trim());
                                   
 //creacion del objeto
                            pomadas[contadorPom] = new Pomadas();
                            pomadas[contadorPom].setNombre(nombre);
                            pomadas[contadorPom].setLaboratorio(laboratorio);
                            pomadas[contadorPom].setGenerico(generico);
                            pomadas[contadorPom].setCodigoBarras(codigoBarras);
                            pomadas[contadorPom].setCosto(costo);
                            pomadas[contadorPom].setPrecioPublico(precioPublico);
                            pomadas[contadorPom].setFechaFabricacion(dateF);
                            pomadas[contadorPom].setFechaCaducidad(dateC);

                            pomadas[contadorPom].setGramos(gramos);

                            contadorPom++;
                           

                            break;
                    }
                    break;
                case 2:
                    String confirmar;
                    int indiceDelete;
                    System.out.println("\n2.Borrar un medicamento.");
                    System.out.println("a) Pastillas.");
                    System.out.println("b) Jarabes.");
                    System.out.println("c) Pomadas");
                    System.out.print("\nSeleccione una opcion: ");
                    op2 = leer.nextLine();

                    switch (op2) {
                        case "a":

                            tipoM = "UNA PASTILLA";

                            System.out.println("======ELIMINAR " + tipoM + "=====");
                            System.out.println("Ingrese el indice a eliminar (1-150)");
                            indiceDelete =Integer.parseInt(leer.nextLine().trim());
                            
                            System.out.println("\n¿Estas seguro de eliminar la pastilla " + indiceDelete + " ? (s/n)");
                            confirmar = leer.nextLine();
                            if (confirmar.equals("s")) {
                                for (int i = indiceDelete - 1; i < contadorP; i++) {
                                    pastillas[i] = pastillas[i + 1];
                                }
                                contadorP--;
                                System.out.println("La pastilla " + indiceDelete + " fue eliminada con exito");
                            } else {
                                System.out.println("La pastilla " + indiceDelete + " no fue eliminada");
                            }
                           
                            break;
                        case "b":

                            tipoM = "UN JARABE";

                            System.out.println("======ELIMINAR " + tipoM + "=====");
                            System.out.println("Ingrese el indice a eliminar (1-100)");
                             indiceDelete =Integer.parseInt(leer.nextLine().trim());
                            System.out.println("\n¿Estas seguro de eliminar el jarabe " + indiceDelete + " ? (s/n)");
                            confirmar = leer.nextLine();
                            if (confirmar.equals("s")) {
                                for (int i = indiceDelete - 1; i < contadorJ; i++) {
                                    jarabes[i] = jarabes[i + 1];
                                }
                                contadorJ--;
                                System.out.println("El jarabe " + indiceDelete + " fue eliminada con exito");
                            } else {
                                System.out.println("El jarabe " + indiceDelete + " no fue eliminada");
                            }
                            
                            break;
                        case "c":
                            tipoM = "UNA POMADA";

                            System.out.println("======ELIMINAR " + tipoM + "=====");
                            System.out.println("Ingrese el indice a eliminar (1-100)");
                           indiceDelete =Integer.parseInt(leer.nextLine().trim());
                            System.out.println("\n¿Estas seguro de eliminar la pomada " + indiceDelete + " ? (s/n)");
                            confirmar = leer.nextLine();
                            if (confirmar.equals("s")) {
                                for (int i = indiceDelete - 1; i < contadorPom; i++) {
                                    pomadas[i] = pomadas[i + 1];
                                }
                                contadorPom--;
                                System.out.println("La pomada " + indiceDelete + " fue eliminada con exito");
                            } else {
                                System.out.println("La pomada " + indiceDelete + " no fue eliminada");
                            }
                            

                            break;
                    }
                    break;
                case 3:
                    String confirmar3;
                    int indice3;
                    float costoM;
                    float precioP;
                    float porcentajeC,
                     porcentajePP;
                    System.out.println("\n3.Modificar un medicamento");
                    System.out.println("a) Modificar el precio de una pastilla.");
                    System.out.println("b) Modificar el precio de todas las pastillas (porcentaje del costo)");
                    System.out.println("c) Modificar el precio de un jarabe.");
                    System.out.println("d) Modificar el precio de todos los jarabes (porcentaje del costo).");
                    System.out.println("e) Modificar el precio de una pomada. ");
                    System.out.println("f) Modificar el precio de todas las pomadas (porcentaje del costo).");
                    System.out.print("\nSeleccione una opcion: ");
                    op2 = leer.nextLine();

                    switch (op2) {
                        case "a":
                            tipoM = "UNA PASTILLA";

                            System.out.println("======MODIFICAR EL PRECIO A " + tipoM + "=====");
                            System.out.println("Ingrese el indice a modicar: ");
                            indice3 =Integer.parseInt(leer.nextLine().trim());
                            System.out.println("Ingrese el nuevo COSTO DEL MEDICAMENTO: ");
                            costoM = Float.parseFloat(leer.nextLine().trim());
                            System.out.println("Ingrese el nuevo PRECIO AL PUBLICO: ");
                            precioP = Float.parseFloat(leer.nextLine().trim());

                            System.out.println("\n¿Desea realizar los cambios? (s/n) ");
                            confirmar3 = leer.nextLine();
                            if (confirmar3.equals("s")) {
                                pastillas[indice3].setCosto(costoM);
                                pastillas[indice3].setPrecioPublico(precioP);
                                System.out.println("Cambios realizados con EXITO");
                            } else {
                                System.out.println("\n No se realizaron los cambios");
                            }

                            break;

                        case "b":
                            tipoM = "TODAS LAS PASTILLAS";

                            System.out.println("======MODIFICAR EL PRECIO A " + tipoM + "=====");
                            System.out.println("Ingrese el % de aumento al COSTO DEL MEDICAMENTO: ");
                            porcentajeC = Float.parseFloat(leer.nextLine().trim());
                            System.out.println("Ingrese el % de aumento al PRECIO AL PUBLICO: ");
                            porcentajePP = Float.parseFloat(leer.nextLine().trim());

                            System.out.println("\n¿Desea realizar los cambios? (s/n) ");
                            confirmar3 = leer.nextLine();
                            if (confirmar3.equals("s")) {
                                for (int i = 0; i < contadorP; i++) {
                                    pastillas[i].aumento(porcentajePP, porcentajeC);
                                }

                                System.out.println("Cambios realizados con EXITO");
                            } else {
                                System.out.println("\n No se realizaron los cambios");
                            }

                            break;

                        case "c":
                            tipoM = "UN JARABE";

                            System.out.println("======MODIFICAR EL PRECIO A " + tipoM + "=====");
                            System.out.println("Ingrese el indice a modicar: ");
                            indice3 = Integer.parseInt(leer.nextLine().trim());
                            System.out.println("Ingrese el nuevo COSTO DEL MEDICAMENTO: ");
                            costoM = Float.parseFloat(leer.nextLine().trim());
                            System.out.println("Ingrese el nuevo PRECIO AL PUBLICO: ");
                            precioP = Float.parseFloat(leer.nextLine().trim());

                            System.out.println("\n¿Desea realizar los cambios? (s/n) ");
                            confirmar3 = leer.nextLine();
                            if (confirmar3.equals("s")) {
                                jarabes[indice3].setCosto(costoM);
                                jarabes[indice3].setPrecioPublico(precioP);
                                System.out.println("Cambios realizados con EXITO");
                            } else {
                                System.out.println("\n No se realizaron los cambios");
                            }

                            break;

                        case "d":
                            tipoM = "TODOS LOS JARABES";

                            System.out.println("======MODIFICAR EL PRECIO A " + tipoM + "=====");
                            System.out.println("Ingrese el % de aumento al COSTO DEL MEDICAMENTO: ");
                            porcentajeC = Float.parseFloat(leer.nextLine().trim());
                            System.out.println("Ingrese el % de aumento al PRECIO AL PUBLICO: ");
                            porcentajePP = Float.parseFloat(leer.nextLine().trim());

                            System.out.println("\n¿Desea realizar los cambios? (s/n) ");
                            confirmar3 = leer.nextLine();
                            if (confirmar3.equals("s")) {
                                for (int i = 0; i < contadorJ; i++) {
                                    jarabes[i].aumento(porcentajePP, porcentajeC);
                                }

                                System.out.println("Cambios realizados con EXITO");
                            } else {
                                System.out.println("\n No se realizaron los cambios");
                            }
                            break;

                        case "e":
                            tipoM = "UNA POMADA";

                            System.out.println("======MODIFICAR EL PRECIO A " + tipoM + "=====");
                            System.out.println("Ingrese el indice a modicar: ");
                            indice3 = Integer.parseInt(leer.nextLine().trim());
                            System.out.println("Ingrese el nuevo COSTO DEL MEDICAMENTO: ");
                            costoM = Float.parseFloat(leer.nextLine().trim());
                            System.out.println("Ingrese el nuevo PRECIO AL PUBLICO: ");
                            precioP = Float.parseFloat(leer.nextLine().trim());

                            System.out.println("\n¿Desea realizar los cambios? (s/n) ");
                            confirmar3 = leer.nextLine();
                            if (confirmar3.equals("s")) {
                                pomadas[indice3].setCosto(costoM);
                                pomadas[indice3].setPrecioPublico(precioP);
                                System.out.println("Cambios realizados con EXITO");
                            } else {
                                System.out.println("\n No se realizaron los cambios");
                            }

                            break;

                        case "f":
                            tipoM = "TODAS LAS POMADAS";

                            System.out.println("======MODIFICAR EL PRECIO A " + tipoM + "=====");
                            System.out.println("Ingrese el % de aumento al COSTO DEL MEDICAMENTO: ");
                            porcentajeC = Float.parseFloat(leer.nextLine().trim());
                            System.out.println("Ingrese el % de aumento al PRECIO AL PUBLICO: ");
                            porcentajePP = Float.parseFloat(leer.nextLine().trim());

                            System.out.println("\n¿Desea realizar los cambios? (s/n) ");
                            confirmar3 = leer.nextLine();
                            if (confirmar3.equals("s")) {
                                for (int i = 0; i < contadorPom; i++) {
                                    pomadas[i].aumento(porcentajePP, porcentajeC);
                                }

                                System.out.println("Cambios realizados con EXITO");
                            } else {
                                System.out.println("\n No se realizaron los cambios");
                            }

                            break;
                    }
                    break;
                case 4:
                    System.out.println("\n4.Imprimir Medicamento de Patente.");
                    System.out.println("a) Imprimir la lista de todas las pastillas con precio (formato compacto).");
                    System.out.println("b) Imprimir la lista de todos los jarabes con precio (formato compacto).");
                    System.out.println("c) Imprimir la lista de todas las pomadas con precio (formato compacto).");
                    System.out.print("\nSeleccione una opcion: ");
                    op2 = leer.nextLine();

                    switch (op2) {
                        case "a":
                            tipoM = "PASTILLAS";
                            System.out.println("======" + tipoM + " DE PATENTE=======");
                            for (int i = 0; i < contadorP; i++) {

                                if (pastillas[i].patente() == true) {
                                    System.out.println(pastillas[i].toString());
                                }

                            }
                            break;
                        case "b":
                            tipoM = "JARABES";
                            System.out.println("======" + tipoM + " DE PATENTE=======");
                            for (int i = 0; i < contadorJ; i++) {

                                if (jarabes[i].patente() == true) {
                                    System.out.println(jarabes[i].toString());
                                }

                            }
                            break;

                        case "c":
                            tipoM = "POMADAS";
                            System.out.println("======" + tipoM + " DE PATENTE=======");
                            for (int i = 0; i < contadorPom; i++) {

                                if (pomadas[i].patente() == true) {
                                    System.out.println(pomadas[i].toString());
                                }

                            }

                            break;

                    }
                    break;
                case 5:
                    System.out.println("\n5. Imprimir Medicamento Genérico. ");
                    System.out.println("a) Imprimir la lista de todas las pastillas con precio (formato compacto).");
                    System.out.println("b) Imprimir la lista de todos los jarabes con precio (formato compacto).");
                    System.out.println("c) Imprimir la lista de todas las pomadas con precio (formato compacto).");
                    System.out.print("\nSeleccione una opcion: ");
                    op2 = leer.nextLine();

                    switch (op2) {
                        case "a":
                            tipoM = "PASTILLAS";
                            System.out.println("======" + tipoM + " GENERICAS=======");
                            for (int i = 0; i < contadorP; i++) {

                                if (pastillas[i].Cgenerico() == true) {
                                    System.out.println(pastillas[i].toString());
                                }

                            }
                            break;
                        case "b":
                            tipoM = "JARABES";
                            System.out.println("======" + tipoM + " GENERICOS=======");
                            for (int i = 0; i < contadorJ; i++) {

                                if (jarabes[i].Cgenerico() == true) {
                                    System.out.println(jarabes[i].toString());
                                }

                            }
                            break;

                        case "c":
                            tipoM = "POMADAS";
                            System.out.println("======" + tipoM + " GENERICAS=======");
                            for (int i = 0; i < contadorPom; i++) {

                                if (pomadas[i].Cgenerico() == true) {
                                    System.out.println(pomadas[i].toString());
                                }

                            }

                            break;

                    }

                    break;
                case 6:
                    //TOTAL DE MEDICAMENTOS CADA UNO
                    int Tpastillas = 0,
                     Tjarabes = 0,
                     Tpomadas = 0;
                    //TOTAL DE PRECIOS PUBLICO/COSTOS CADA UNO
                    float TPPpastillas = 0,
                     TCpastillas = 0;
                    float TPPjarabes = 0,
                     TCjarabes = 0;
                    float TPPpomadas = 0,
                     TCpomadas = 0;
                    //TOTAL DE MEDICAMENTOS/COSTOS/PRECIOS PUBLICO
                    int totalM = 0;
                    float totalC = 0,
                     totalPP = 0;
                    System.out.println("\n6.Imprimir Resumen ");
                    System.out.println("a)  Imprimir Resumen de medicamentos de Patente (número de pastillas y suma\n"
                            + "de precios; número de jarabes y suma de precios; y numero de pomadas con\n"
                            + "suma de precios). Además, suma total de Medicamentos, Costos y Precios");
                    System.out.println("b) Imprimir Resumen de medicamentos Genéricos (número de pastillas y suma\n"
                            + "de precios; número de jarabes y suma de precios; y numero de pomadas con\n"
                            + "suma de precios). Además, suma total de Medicamentos, Costos y Precios.");

                    System.out.print("\nSeleccione una opcion: ");
                    op2 = leer.nextLine();
                    switch (op2) {

                        case "a":
                            System.out.println("=====RESUMEN DE MEDICAMENTOS DE PATENTE=======");
                            //pastillas
                            
                            for (int i = 0; i < contadorP; i++) {
                                if (pastillas[i].patente() == true) {
                                    float ppublic, cost;
                                    ppublic = pastillas[i].getPrecioPublico();
                                    cost = pastillas[i].getCosto();
                                    TPPpastillas += ppublic;
                                    TCpastillas += cost;
                                    Tpastillas ++;
                                }

                            }
                            //jarabes

                            for (int i = 0; i < contadorJ; i++) {

                                if (jarabes[i].patente() == true) {
                                    float ppublic, cost;
                                    ppublic = jarabes[i].getPrecioPublico();
                                    cost = jarabes[i].getCosto();
                                    TPPjarabes += ppublic;
                                    TCjarabes += cost;
                                     Tjarabes ++;
                                }

                            }
                            //pomadas
                            
                            for (int i = 0; i < contadorPom; i++) {

                                if (pomadas[i].patente() == true) {
                                    float ppublic, cost;
                                    ppublic = pomadas[i].getPrecioPublico();
                                    cost = pomadas[i].getCosto();
                                    TPPpomadas += ppublic;
                                    TCpomadas += cost;
                                     Tpomadas++;
                                }

                            }
                            totalM = Tpastillas + Tpomadas + Tjarabes;
                            totalC = TCpastillas + TCpomadas + TCjarabes;
                            totalPP = TPPpastillas + TPPpomadas + TPPjarabes;

                            //mandamos a imprimir linea por linea
                            System.out.println("Numero total de PASTILLAS: " + Tpastillas);

                            System.out.println("Suma de costos: " + TCpastillas);
                            System.out.println("Suma de precios publico: " + TPPpastillas);

                            System.out.println("\nNumero total de JARABES: " + Tjarabes);
                            System.out.println("Suma de costos: " + TCjarabes);
                            System.out.println("Suma de precios publico: " + TPPjarabes);

                            System.out.println("\nNumero total de POMADAS: " + Tpomadas);
                            System.out.println("Suma de costos: " + TCpomadas);
                            System.out.println("Suma de precios publico: " + TPPpomadas);

                            System.out.println("\nNumero total de MEDICAMENTOS: " + totalM);
                            System.out.println("Suma total de costos: " + totalC);
                            System.out.println("Suma total de precios publico: " + totalPP);
                            break;

                        case "b":
                            System.out.println("=====RESUMEN DE MEDICAMENTOS GENERICOS=======");
                            //pastillas
                            
                            for (int i = 0; i < contadorP; i++) {
                                if (pastillas[i].Cgenerico() == true) {
                                    float ppublic, cost;
                                    ppublic = pastillas[i].getPrecioPublico();
                                    cost = pastillas[i].getCosto();
                                    TPPpastillas += ppublic;
                                    TCpastillas += cost;
                                     Tpastillas ++;
                                }

                            }
                            //jarabes
                       
                            for (int i = 0; i < contadorJ; i++) {

                                if (jarabes[i].Cgenerico() == true) {
                                    float ppublic, cost;
                                    ppublic = jarabes[i].getPrecioPublico();
                                    cost = jarabes[i].getCosto();
                                    TPPjarabes += ppublic;
                                    TCjarabes += cost;
                                         Tjarabes ++;
                                }

                            }
                            //pomadas
                       
                            for (int i = 0; i < contadorPom; i++) {

                                if (pomadas[i].Cgenerico() == true) {
                                    float ppublic, cost;
                                    ppublic = pomadas[i].getPrecioPublico();
                                    cost = pomadas[i].getCosto();
                                    TPPpomadas += ppublic;
                                    TCpomadas += cost;
                                         Tpomadas ++;
                                }

                            }
                            totalM = Tpastillas + Tpomadas + Tjarabes;
                            totalC = TCpastillas + TCpomadas + TCjarabes;
                            totalPP = TPPpastillas + TPPpomadas + TPPjarabes;

                            //mandamos a imprimir linea por linea
                            System.out.println("Numero total de PASTILLAS: " + Tpastillas);

                            System.out.println("Suma de costos: " + TCpastillas);
                            System.out.println("Suma de precios publico: " + TPPpastillas);

                            System.out.println("\nNumero total de JARABES: " + Tjarabes);
                            System.out.println("Suma de costos: " + TCjarabes);
                            System.out.println("Suma de precios publico: " + TPPjarabes);

                            System.out.println("\nNumero total de POMADAS: " + Tpomadas);
                            System.out.println("Suma de costos: " + TCpomadas);
                            System.out.println("Suma de precios publico: " + TPPpomadas);

                            System.out.println("\nNumero total de MEDICAMENTOS: " + totalM);
                            System.out.println("Suma total de costos: " + totalC);
                            System.out.println("Suma total de precios publico: " + totalPP);

                            break;

                    }
                    break;

                case 7:
                    System.out.println("\n7. Buscar  ");
                    System.out.println("a) Buscar un producto por nombre e imprimirlos todos, toda su información\n"
                            + "(formato amplio).");
                    System.out.println("b) Buscar un producto por código de barras e imprimirlos todos, toda su\n"
                            + "información (formato amplio).");
                    System.out.println("c)Buscar todos los medicamentos de un año en específico (formato compacto).");
                    System.out.println("d) Buscar todos los medicamentos caducados e imprimirlos (formato\n"
                            + "compacto).");
                    System.out.print("\nSeleccione una opcion: ");
                    op2 = leer.nextLine();

                    switch (op2) {
                        case "a":
                            String searchNombre;
                            System.out.println("=====BUSQUEDA POR NOMBRE====");
                            System.out.println("Ingrese el NOMBRE del medicamento a buscar: ");
                            searchNombre = leer.nextLine().trim().toUpperCase();
                            System.out.println("");
                            //pastillas
                            for (int i = 0; i < contadorP; i++) {
                                if (pastillas[i].compararNombre(searchNombre) == true) {
                                    System.out.println("Nombre: " + pastillas[i].getNombre());
                                    System.out.println("Laboratorio: " + pastillas[i].getLaboratorio());
                                    System.out.println("Generico: " + pastillas[i].isGenerico());
                                    System.out.println("Codigo de barras: " + pastillas[i].getCodigoBarras());
                                    System.out.println("Costo del medicamento: " + pastillas[i].getCosto());
                                    System.out.println("Precio al publico: " + pastillas[i].getPrecioPublico());
                                    System.out.println("Fecha de fabricacion: " + pastillas[i].getFechaFabricacion());
                                    System.out.println("Fecha de caducidad: " + pastillas[i].getFechaCaducidad());
                                    System.out.println("Numero de tabletas: " + pastillas[i].getNumTabletas());
                                    System.out.println("Numero de miligramos: " + pastillas[i].getMiligramos());
                                }
                            }
                            //jarabes
                            for (int i = 0; i < contadorJ; i++) {
                                if (jarabes[i].compararNombre(searchNombre) == true) {
                                    System.out.println("Nombre: " + jarabes[i].getNombre());
                                    System.out.println("Laboratorio: " + jarabes[i].getLaboratorio());
                                    System.out.println("Generico: " + jarabes[i].isGenerico());
                                    System.out.println("Codigo de barras: " + jarabes[i].getCodigoBarras());
                                    System.out.println("Costo del medicamento: " + jarabes[i].getCosto());
                                    System.out.println("Precio al publico: " + jarabes[i].getPrecioPublico());
                                    System.out.println("Fecha de fabricacion: " + jarabes[i].getFechaFabricacion());
                                    System.out.println("Fecha de caducidad: " + jarabes[i].getFechaCaducidad());
                                    System.out.println("Numero de tabletas: " + jarabes[i].getMililitros());
                                    System.out.println("Numero de miligramos: " + jarabes[i].isVasoDosificador());
                                }
                            }

                            //pomadas
                            for (int i = 0; i < contadorPom; i++) {
                                if (pomadas[i].compararNombre(searchNombre) == true) {
                                    System.out.println("Nombre: " + pomadas[i].getNombre());
                                    System.out.println("Laboratorio: " + pomadas[i].getLaboratorio());
                                    System.out.println("Generico: " + pomadas[i].isGenerico());
                                    System.out.println("Codigo de barras: " + pomadas[i].getCodigoBarras());
                                    System.out.println("Costo del medicamento: " + pomadas[i].getCosto());
                                    System.out.println("Precio al publico: " + pomadas[i].getPrecioPublico());
                                    System.out.println("Fecha de fabricacion: " + pomadas[i].getFechaFabricacion());
                                    System.out.println("Fecha de caducidad: " + pomadas[i].getFechaCaducidad());
                                    System.out.println("Numero de tabletas: " + pomadas[i].getGramos());

                                }
                            }
                            break;

                        case "b":

                            int cbarras;
                            System.out.println("=====BUSQUEDA POR CODIGO DE BARRAS====");
                            System.out.println("Ingrese el CODIGO  DE BARRAS del medicamento a buscar: ");
                            cbarras = Integer.parseInt(leer.nextLine().trim());
                            System.out.println("");
                            //pastillas
                            for (int i = 0; i < contadorP; i++) {
                                if (pastillas[i].compararCodigoBarras(cbarras) == true) {
                                    System.out.println("Nombre: " + pastillas[i].getNombre());
                                    System.out.println("Laboratorio: " + pastillas[i].getLaboratorio());
                                    System.out.println("Generico: " + pastillas[i].isGenerico());
                                    System.out.println("Codigo de barras: " + pastillas[i].getCodigoBarras());
                                    System.out.println("Costo del medicamento: " + pastillas[i].getCosto());
                                    System.out.println("Precio al publico: " + pastillas[i].getPrecioPublico());
                                    System.out.println("Fecha de fabricacion: " + pastillas[i].getFechaFabricacion());
                                    System.out.println("Fecha de caducidad: " + pastillas[i].getFechaCaducidad());
                                    System.out.println("Numero de tabletas: " + pastillas[i].getNumTabletas());
                                    System.out.println("Numero de miligramos: " + pastillas[i].getMiligramos());
                                    System.out.println("");
                                }
                            }
                            //jarabes
                            for (int i = 0; i < contadorJ; i++) {
                                if (jarabes[i].compararCodigoBarras(cbarras) == true) {
                                    System.out.println("Nombre: " + jarabes[i].getNombre());
                                    System.out.println("Laboratorio: " + jarabes[i].getLaboratorio());
                                    System.out.println("Generico: " + jarabes[i].isGenerico());
                                    System.out.println("Codigo de barras: " + jarabes[i].getCodigoBarras());
                                    System.out.println("Costo del medicamento: " + jarabes[i].getCosto());
                                    System.out.println("Precio al publico: " + jarabes[i].getPrecioPublico());
                                    System.out.println("Fecha de fabricacion: " + jarabes[i].getFechaFabricacion());
                                    System.out.println("Fecha de caducidad: " + jarabes[i].getFechaCaducidad());
                                    System.out.println("Numero de mililitros: " + jarabes[i].getMililitros());
                                    System.out.println("Vaso dosificador: " + jarabes[i].isVasoDosificador());
                                    System.out.println("");
                                            
                                }
                            }

                            //pomadas
                            for (int i = 0; i < contadorPom; i++) {
                                if (pomadas[i].compararCodigoBarras(cbarras) == true) {
                                    System.out.println("Nombre: " + pomadas[i].getNombre());
                                    System.out.println("Laboratorio: " + pomadas[i].getLaboratorio());
                                    System.out.println("Generico: " + pomadas[i].isGenerico());
                                    System.out.println("Codigo de barras: " + pomadas[i].getCodigoBarras());
                                    System.out.println("Costo del medicamento: " + pomadas[i].getCosto());
                                    System.out.println("Precio al publico: " + pomadas[i].getPrecioPublico());
                                    System.out.println("Fecha de fabricacion: " + pomadas[i].getFechaFabricacion());
                                    System.out.println("Fecha de caducidad: " + pomadas[i].getFechaCaducidad());
                                    System.out.println("Numero de tabletas: " + pomadas[i].getGramos());
                                    System.out.println("");
                                }
                            }
                            break;

                        case "c":
                            int year;
                            System.out.println("=====BUSQUEDA POR AÑO ESPECIFICO====");
                            System.out.println("Ingrese el AÑO ESPECIFICO (yyyy) del medicamento a buscar: ");
                            year = Integer.parseInt(leer.nextLine().trim());
                            System.out.println("");
                            //pastillas
                            for (int i = 0; i < contadorP; i++) {
                                if (pastillas[i].getFechaFabricacion().getYear() == year) {
                                    System.out.println(pastillas[i]);
                                }
                            }
                            //jarabes

                            for (int i = 0; i < contadorJ; i++) {
                                if (jarabes[i].getFechaFabricacion().getYear() == year) {
                                    System.out.println(jarabes[i]);
                                }
                            }
                            //pomadas

                            for (int i = 0; i < contadorPom; i++) {
                                if (pomadas[i].getFechaFabricacion().getYear() == year) {
                                    System.out.println(pomadas[i]);
                                }
                            }

                            break;

                        case "d":
                            LocalDate fechaUsuario = LocalDate.now();
                            System.out.println("=====BUSQUEDA POR MEDICAMENTOS CADUCADOS====");
                            System.out.println("");
                            //pastillas
                            for (int i = 0; i < contadorP; i++) {
                                if (pastillas[i].getFechaCaducidad().isBefore(fechaUsuario)) {
                                    System.out.println(pastillas[i]);
                                }
                            }
                            //jarabes

                            for (int i = 0; i < contadorJ; i++) {
                                if (jarabes[i].getFechaCaducidad().isBefore(fechaUsuario)) {
                                    System.out.println(jarabes[i]);
                                }
                            }
                            //pomadas

                            for (int i = 0; i < contadorPom; i++) {
                                if (pomadas[i].getFechaCaducidad().isBefore(fechaUsuario)) {
                                    System.out.println(pomadas[i]);
                                }
                            }

                            break;
                    }
                    break;
                case 8:
                    int op3;
                    Pastillas[] copiaP = new Pastillas[150];
                    Jarabes[] copiaJ = new Jarabes[100];
                    Pomadas[] copiaPom = new Pomadas[100];
                    System.out.println("\n8. Ordenar por método de la Burbuja e Imprimir.");
                    System.out.println("a) Pastillas.");
                    System.out.println("b) Jarabes.");
                    System.out.println("c) Pomadas");
                    System.out.print("\nSeleccione una opcion: ");
                    op2 = leer.nextLine();

                    switch (op2) {
                        case "a":
                            System.out.println("===ORDENAR PASTILLAS==");
                            System.out.println("1.Por nombre");
                            System.out.println("2.Por Precio");
                            op3 = Integer.parseInt(leer.nextLine().trim());
                            switch (op3) {
                                case 1:
                                    System.out.println("=====ORDENAR POR NOMBRE=====");
                                    //Crear Copia
                                    for (int i = 0; i < contadorP; i++) {
                                        copiaP[i] = pastillas[i];
                                    }
                                    Arrays.sort(copiaP, Comparator.nullsLast(
                                            Comparator.comparing(Pastillas::getNombre, String.CASE_INSENSITIVE_ORDER)
                                    ));
                                    for (int i = 0; i < contadorP; i++) {
                                        System.out.println(copiaP[i]);
                                    }

                                    break;
                                case 2:
                                    System.out.println("====ORDENAR POR PRECIO====");
                                    //Crear Copia
                                    for (int i = 0; i < contadorP; i++) {
                                        copiaP[i] = pastillas[i];
                                    }

                                    //Ordenamiento Burbuja : No modifica registros originales
                                    for (int i = 0; i < contadorP; i++) { //Bucle externo
                                        for (int j = 0; j < contadorP - i - 1; j++) { //Bucle interno

                                            if ((copiaP[j].getPrecioPublico()) > (copiaP[j + 1].getPrecioPublico())) {
                                                //intercambio de objetos
                                                Pastillas temp = copiaP[j];
                                                copiaP[j] = copiaP[j + 1];
                                                copiaP[j + 1] = temp;

                                            }

                                        }

                                    }
                                    //imprimir
                                    for (int i = 0; i < contadorP; i++) {
                                        System.out.println(copiaP[i]);
                                    }
                                    break;
                            }
                            break;
                        case "b":
                            System.out.println("===ORDENAR JARABES==");
                            System.out.println("1.Por nombre");
                            System.out.println("2.Por Precio");
                            op3 = Integer.parseInt(leer.nextLine().trim());

                            switch (op3) {
                                case 1:
                                    System.out.println("=====ORDENAR POR NOMBRE=====");
                                    //Crear Copia
                                    for (int i = 0; i < contadorJ; i++) {
                                        copiaJ[i] = jarabes[i];
                                    }
                                    Arrays.sort(copiaJ, Comparator.nullsLast(
                                            Comparator.comparing(Jarabes::getNombre, String.CASE_INSENSITIVE_ORDER)
                                    ));
                                       for (int i = 0; i < contadorJ; i++) {
                                        System.out.println(copiaJ[i]);
                                    }
                                    break;
                                case 2:
                                    System.out.println("====ORDENAR POR PRECIO====");
                                    //Crear Copia
                                    for (int i = 0; i < contadorJ; i++) {
                                        copiaJ[i] = jarabes[i];
                                    }

                                    //Ordenamiento Burbuja : No modifica registros originales
                                    for (int i = 0; i < contadorJ; i++) { //Bucle externo
                                        for (int j = 0; j < contadorJ - i - 1; j++) { //Bucle interno

                                            if ((copiaJ[j].getPrecioPublico()) > (copiaJ[j + 1].getPrecioPublico())) {
                                                //intercambio de objetos
                                                Jarabes temp = copiaJ[j];
                                                copiaJ[j] = copiaJ[j + 1];
                                                copiaJ[j + 1] = temp;

                                            }

                                        }

                                    }
                                    //imprimir
                                    for (int i = 0; i < contadorJ; i++) {
                                        System.out.println(copiaJ[i]);
                                    }
                                    break;
                            }
                            break;
                        case "c":
                            System.out.println("===ORDENAR POMADAS===");
                            System.out.println("1.Por nombre");
                            System.out.println("2.Por Precio");
                            op3 = Integer.parseInt(leer.nextLine().trim());
                            switch (op3) {
                                case 1:
                                    System.out.println("=====ORDENAR POR NOMBRE=====");
                                    //Crear Copia
                                    for (int i = 0; i < contadorP; i++) {
                                        copiaPom[i] = pomadas[i];
                                    }
                                    Arrays.sort(copiaPom, Comparator.nullsLast(
                                            Comparator.comparing(Pomadas::getNombre, String.CASE_INSENSITIVE_ORDER)
                                    ));
                                                                        //imprimir
                                    for (int i = 0; i < contadorPom; i++) {
                                        System.out.println(copiaPom[i]);
                                    }
                                    break;
                                case 2:
                                    System.out.println("====ORDENAR POR PRECIO====");
                                    //Crear Copia
                                    for (int i = 0; i < contadorPom; i++) {
                                        copiaPom[i] = pomadas[i];
                                    }

                                    //Ordenamiento Burbuja : No modifica registros originales
                                    for (int i = 0; i < contadorPom; i++) { //Bucle externo
                                        for (int j = 0; j < contadorPom - i - 1; j++) { //Bucle interno

                                            if ((copiaPom[j].getPrecioPublico()) > (copiaPom[j + 1].getPrecioPublico())) {
                                                //intercambio de objetos
                                                Pomadas temp = copiaPom[j];
                                                copiaPom[j] = copiaPom[j + 1];
                                                copiaPom[j + 1] = temp;

                                            }

                                        }

                                    }
                                    //imprimir
                                    for (int i = 0; i < contadorPom; i++) {
                                        System.out.println(copiaPom[i]);
                                    }
                                    break;
                            }
                    }

                    break;
                case 9:
                        System.out.println("\n¿Desea salir del programa?: (s/n)");
                        confirmexit = leer.nextLine();
                        if(confirmexit.equals("s")){
                            exit =true;
                        }
                        else{
                            exit = false;
                        }
                    break;

                default:

                    break;

            }
        } while ( exit == false);

    }
}
