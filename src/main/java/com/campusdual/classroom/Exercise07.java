package com.campusdual.classroom;


public class Exercise07 {

    static int[] numeros = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {

        positionInAList(8);
        sumFirstNaturalNumbers(3);
        showFirstNaturalNumbers(5);
    }
    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.

    public static void positionInAList(int num) {

        int index = -1;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == num) {
                index = i + 1;
                break;
            }
        }

        if(index == -1) {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }else{
            System.out.println("El elemento " + num + " se encuentra en la posición: " + index);
        }

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {

    if(num<1||num>numeros.length) {
        return;
        }

    int suma = 0;
    int contador = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                suma += numero;
                contador++;
            }
            if (contador == num) {
                break;
            }
        }
    System.out.println(suma);

    }
    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {

        for(int i=1;i<=num;i++) {
            System.out.print(i +" ");
        }


    }

}
