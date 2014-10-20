package refactorizar;

import java.util.Scanner;

/**
 * Lista los numeros primos de dos cifras
 *
 */
public class Refactorizar {

    public static void main(String[] args) {
        //variables
        boolean esPrimo = false;
        //quitamos el valor de 0 q estaba antes
        int longitudDigitos;
        int contadorDigito = 0;
        //Aki insertamos el metodo para aligerar el programa
        longitudDigitos = entradaDato();
        if (longitudDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contadorDigito = contador;

            if (contadorDigito == longitudDigitos) {
                if (i < 4) {
                    esPrimo = true;
                } else {
                    if (i % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo = true;
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(i);
                }
            }
        }
    }

    private static int entradaDato() {
        int longitudDigitos;
        //longitudDigitos = 2;
        //para pedir el dato por el teclado
        Scanner dato = new Scanner (System.in);
        longitudDigitos = dato.nextInt();
        return longitudDigitos;
    }

}
