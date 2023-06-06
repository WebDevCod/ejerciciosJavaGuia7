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
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();
        //ejercicio16();
        //ejercicio17();
        //ejercicio18();
        //ejercicio19();
        //ejercicio20();
        //ejercicio21();
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
                    float dividir = (float) numA / numB;
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

    public static void ejercicio12() {
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa palabras con un máximo de 5 letras.");
        System.out.println("El primer caracter tiene que ser X y el último una O.");
        System.out.println("Para finalizar el procesos ingresa &&&&&");

        String cadena;
        int correctas = 0;
        int incorrectas = 0;

        do {
            System.out.print(">");
            cadena = leer.next().toUpperCase();
            int largo = cadena.length();

            if (cadena.equals("&&&&&")) {
                break;
            };

            if (largo <= 5 && cadena.substring(0, 1).equals("X") && cadena.substring(largo - 1).equals("O")) {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (!cadena.equals("&&&&&"));

        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);

    }

    public static void ejercicio13() {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *
         */
        Scanner leer = new Scanner(System.in);
        System.out.print(">");
        int n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void ejercicio14() {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €*/
        Scanner leer = new Scanner(System.in);
        float cantidad;
        String tipoDeMoneda = "";

        System.out.println("Ingresa la cantidad de euros a convertir:");
        cantidad = leer.nextFloat();
        System.out.println("Convertir a:");
        System.out.println("1 Dólares");
        System.out.println("2 Yenes");
        System.out.println("3 Libras");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                tipoDeMoneda = "dolares";
                break;
            case 2:
                tipoDeMoneda = "yenes";
                break;
            case 3:
                tipoDeMoneda = "libras";
                break;
            default:
        }

        convertir(cantidad, tipoDeMoneda);
    }

    public static void convertir(float cantidad, String tipoDeMoneda) {
        double resultado;

        switch (tipoDeMoneda) {
            case "dolares":
                resultado = cantidad * 1.28611;
                System.out.println("Dólares: " + resultado);
                break;
            case "yenes":
                resultado = cantidad * 129.852;
                System.out.println("Yenes: " + resultado);
                break;
            case "libras":
                resultado = cantidad * 0.86;
                System.out.println("Libras: " + resultado);
                break;
            default:
        }
    }

    public static void ejercicio15() {
        /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.*/

        int[] vector = new int[100];

        for (int i = 1; i < vector.length; i++) {
            vector[i] = i;
            System.out.println(vector[i]);
        }

    }

    public static void ejercicio16() {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido*/
        Scanner leer = new Scanner(System.in);

        int N = 10;
        int[] vector = new int[N];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print(vector[i] + " ");
        }

        System.out.println("\nIngresa un número para buscar en el vector:");
        int numBuscar = leer.nextInt();
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numBuscar) {
                System.out.println("El número se encuentra en el índice " + "[" + i + "]");
                contador++;
            }
        }
        if (contador - 1 == 1) {
            System.out.println("Se repite: " + (contador - 1) + " vez");
        } else {
            System.out.println("Se repite: " + (contador - 1) + " veces");
        }

    }

    public static void ejercicio17() {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).*/

        int[] vector = {1, 10, 200, 3000, 40000};

        for (int i = 0; i < vector.length; i++) {
            int digitos = (int) (Math.log10(vector[i]) + 1);
            /*En este código, se utiliza la función Math.log10(numero) para obtener 
            el logaritmo en base 10 del número. Luego se le suma 1 y se convierte en entero (int) 
            para obtener la cantidad de dígitos.*/
            if (digitos <= 5) {
                System.out.println("La cantidad de números de " + vector[i] + " es " + digitos);
            }
        }
    }

    public static void ejercicio18() {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa)*/
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz A");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz B");
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void ejercicio19() {
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa*/

        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        boolean verificar = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    verificar = false;
                }
            }
        }
        if (verificar) {
            System.out.println("Es antisimetrico");
        } else {
            System.out.println("No es antisimétrico");
        }
    }

    public static void ejercicio20() {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.*/

        Scanner leer = new Scanner(System.in);
        int valorN;
        int N = 3;
        int[][] matriz = new int[N][N];

        //Bucle para llenar la matriz        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingresa un valor del 1 al 9 en las coordenas. " + i + "," + j + " :");
                valorN = leer.nextInt();
                while (valorN < 1 || valorN > 9) {
                    System.out.println("Debes ingresar valores entre 1 y 9");
                    valorN = leer.nextInt();
                }
                matriz[i][j] = valorN;
            }

        }

        //Bucle para mostrar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println(" ");
        }

        boolean bandera = true;
        int suma = 0;

        //Sumar filas
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
            }
            if (i == 0) {
                suma = sumaFila;
            } else if (sumaFila != suma) {
                //Escribir "La matriz no es mágica"
                bandera = false;
            }
        }

        //Sumar columnas
        for (int j = 0; j < matriz.length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != suma) {
                //Escribir "La matriz no es mágica"
                bandera = false;
            }

        }

        //Sumar diagonales
        int sumaDiagonalA = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalA += matriz[i][i];
        }
        if (sumaDiagonalA != suma) {
            //Escribir "La matriz no es mágica"
            bandera = false;
        }

        int sumaDiagonalB = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalB += matriz[i][matriz.length - 1];
        }
        if (sumaDiagonalB != suma) {
            //Escribir "La matriz no es mágica" 
            bandera = false;
        }

        if (bandera) {
            System.out.println("La matriz es mágica, la suma de filas, columnas y diagonales es: " + suma);
        } else {
            System.out.println("La matriz no es mágica");
        }

    }

    public static void ejercicio21() {
        /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P.*/

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        //Rellenar matriz M
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                matrizM[i][j] = (int) (Math.random() * 100);
            }
        }

        //Rellenar matriz P
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                matrizP[i][j] = (int) (Math.random() * 100);
            }
        }

        //Mostrar matriz M
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Mostrar matriz P
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Comprobar si P está en M
        boolean encontrada = false;
        for (int i = 0; i <= matrizM.length - matrizP.length; i++) {
            for (int j = 0; j <= matrizM[i].length - matrizP[0].length; j++) {
                boolean coinciden = true;
                for (int k = 0; k < matrizP.length; k++) {
                    for (int l = 0; l < matrizP[0].length; l++) {
                        if (matrizP[k][l] != matrizM[i + k][j + l]) {
                            coinciden = false;
                            break;
                        }
                    }
                    if (!coinciden) {
                        break;
                    }
                }
                if (coinciden) {
                    System.out.println("Coincidencia en posición: " + i + "," + j);
                    encontrada = true;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        if (!encontrada) {
            System.out.println("La matriz P no está contenida en la matriz M.");
        }

    }

}
