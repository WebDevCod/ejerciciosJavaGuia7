package ejerciciosguia7;

import java.util.Scanner;

public class EjerciciosGuia7 {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        ejercicio11();
    }

    public static void ejercicio1() {
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma*/

        Scanner leer = new Scanner(System.in);

        int numA, numB;

        do {
            System.out.println("Ingresa un número para sumar:");
            numA = leer.nextInt();
            System.out.println("Bien, ahora ingresa otro número:");
            numB = leer.nextInt();
        } while (numA < 0 || numB < 0);

        int resultado = numA + numB;

        System.out.println("El resultado de la suma es: " + resultado);

    }

    public static void ejercicio2() {
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = leer.next();

        System.out.println("Hola " + nombre);

    }

    public static void ejercicio3() {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe una frase:");
        String frase = leer.nextLine();

        System.out.println("Frase usando función toUpperCase(): " + frase.toUpperCase());
        System.out.println("Frase usando función toLowerCase(): " + frase.toLowerCase());

    }

    public static void ejercicio4() {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);

        float c, resultado;

        System.out.println("Convertir de grados Celsius a Fahrenheit");
        System.out.println("Celsius:");
        c = leer.nextFloat();
        resultado = 32 + (9 * c / 5);
        System.out.println("Fahrenheit:");
        System.out.println(resultado);

    }

    public static void ejercicio5() {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
        Scanner leer = new Scanner(System.in);

        int num, doble, triple;
        double raizC;

        System.out.println("Ingresa un número entero");
        num = leer.nextInt();
        doble = num * 2;
        triple = num * 3;
        raizC = Math.sqrt(num);
        System.out.println("El doble de " + num + " es " + doble);
        System.out.println("El triple de " + num + " es " + triple);
        System.out.println("La raíz cuadrada de " + num + " es " + raizC);

    }

    public static void ejercicio6() {
        /* Crear un programa que dado un numero determine si es par o impar.*/
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un número para saber si es par o impar");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }

    }

    public static void ejercicio7() {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java.*/
        Scanner leer = new Scanner(System.in);

        String palabra;

        System.out.println("Ingresa una palabra para verificar");
        palabra = leer.next();

        if (palabra.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

    public static void ejercicio8() {
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.*/
        Scanner leer = new Scanner(System.in);
        String palabra;

        System.out.println("Ingresa una palabra de 8 caracteres");
        palabra = leer.next();

        if (palabra.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

    public static void ejercicio9() {
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java*/
        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("Ingresa una frase o palabra");
        frase = leer.nextLine();

        if (frase.substring(0, 1).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

    public static void ejercicio10() {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        Scanner leer = new Scanner(System.in);

        int numLimite, numeros, acumulador;

        System.out.println("Ingresa un valor límite positivo");
        numLimite = leer.nextInt();

        acumulador = 0;
        System.out.println("Ingresa números que se sumaran hasta llegar al límite");
        do {
            numeros = leer.nextInt();
            acumulador += numeros;
        } while (acumulador < numLimite);
        System.out.println("Superaste el límite");
    }

    public static void ejercicio11() {
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú.*/

        Scanner leer = new Scanner(System.in);
        int numA, numB, opcion;
        String salir = "";

        System.out.println("Ingresa un número entero:");
        numA = leer.nextInt();
        System.out.println("Ingresa otro número entero:");
        numB = leer.nextInt();

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int suma = numA + numB;
                    System.out.println(numA + "+" + numB + "=" + suma);
                    break;
                case 2:
                    int resta = numA - numB;
                    System.out.println(numA + "-" + numB + "=" + resta);
                    break;
                case 3:
                    int multi = numA * numB;
                    System.out.println(numA + "x" + numB + "=" + multi);
                    break;
                case 4:
                    float dividir = (float)numA / numB;
                    System.out.println(numA + "/" + numB + "=" + dividir);
                    break;
                case 5:
                    System.out.println("Estás seguro que quieres salir? S/N");
                    salir = leer.next().toUpperCase();
                    break;
                default:
            }
        } while (opcion != 5 || salir.equals("N"));
    }
}
