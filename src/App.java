import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****************** EJERCICIO 1 **********************");
        // Ejercicio1(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 2 **********************");
        // Ejercicio2(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 3 **********************");
        // Ejercicio3(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 4 **********************");
        // Ejercicio4(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 5 **********************");
        // Ejercicio5(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 6 **********************");
        // Ejercicio6(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 7 **********************");
        // Ejercicio7(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 8 **********************");
        // Ejercicio8(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 9 **********************");
        // Ejercicio9(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 10 **********************");
        // Ejercicio10(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 11 **********************");
        // Ejercicio11(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 12 **********************");
        // Ejercicio12(scanner, scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 13 **********************");
        // Ejercicio13(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 14 **********************");
        // Ejercicio14(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 15 **********************");
        // Ejercicio15(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 16 **********************");
        // Ejercicio16(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 17 **********************");
        // Ejercicio17();
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 18 **********************");
        // Ejercicio18();
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 19 **********************");
        // Ejercicio19(scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 20 **********************");
        // Ejercicio20();
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 21 **********************");
        // Ejercicio21(scanner, scanner);
        System.out.println("\n");

        System.out.println("****************** EJERCICIO 22 **********************");
        Ejercicio22(scanner);
        System.out.println("\n");

        scanner.close();
    }

    public static void Ejercicio1(Scanner numeroReal) {
        System.out.print("Ingresa un numero real: ");
        var numero = numeroReal.nextInt();

        if (numero > 0) {
            System.out.println("Es un numero positivo");
        } else if (numero == 0) {
            System.out.println("El numero es neutro");
        } else {
            System.out.println("El numero es negativo");
        }

    }

    public static void Ejercicio2(Scanner numeroMayor) {

        int[] num = new int[3];
        var valorMaximo = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese un numero entero: ");
            num[i] = numeroMayor.nextInt();
            valorMaximo = Math.max(valorMaximo, num[i]);
        }

        System.out.println("El numero maximo es: " + valorMaximo);

    }

    public static void Ejercicio3(Scanner numParImpar) {
        System.out.print("Ingresa un numero entero: ");
        var num = numParImpar.nextInt();

        if (num % 2 == 1) {
            System.out.println("Numero impar");
        } else {
            System.out.println("Numero par");
        }
    }

    public static void Ejercicio4(Scanner letra) {
        System.out.print("Ingrese una letra: ");
        char letras = letra.nextLine().charAt(0);

        if (Character.isUpperCase(letras)) {
            System.out.println("Letra es mayuscula");
        } else {
            System.out.println("Letra es minuscula");
        }
    }

    public static void Ejercicio5(Scanner letrasAlfabeticas) {
        System.out.print("Ingrese una letra: ");
        char letra = letrasAlfabeticas.nextLine().toLowerCase().charAt(0);

        if (Character.isLetter(letra)) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra es una vocal");
            } else {
                System.out.println("la letra es consonante");
            }
        } else {
            System.out.println("Letra no reconocida");
        }
    }

    public static void Ejercicio6(Scanner numeroDivisible) {
        System.out.println("---------------- Si un numero es divisible por 2 y 7 ----------------");
        System.out.print("Ingrese un numero: ");
        var num = numeroDivisible.nextInt();

        if (num % 2 == 0 && num % 7 == 0) {
            var div2 = num / 2;
            var div7 = num / 7;
            System.out.println("Si es divisible entre 2 y 7");
            System.out.printf("%nResultado entre 2: %d%nResultado entre 7: %d%n", div2, div7);
        } else {
            System.out.println("No es divisible entre 2 y 7 :( ");
        }
    }

    public static void Ejercicio7(Scanner triangulo) {
        System.out.print("Ingrese lado 1: ");
        int lado1 = triangulo.nextInt();

        System.out.print("Ingrese lado 2: ");
        int lado2 = triangulo.nextInt();

        System.out.print("Ingrese lado 3: ");
        int lado3 = triangulo.nextInt();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            if (lado1 == lado2 ||
                    lado1 == lado3 ||
                    lado2 == lado3) {
                System.out
                        .println("Los lados forman un triángulo isósceles.");
            } else {
                System.out.println("Los lados forman un triángulo, pero no es isósceles.");
            }
        } else {
            System.out.println("Los lados NO pueden formar un triángulo.");
        }
    }

    public static void Ejercicio8(Scanner cantidad) {
        System.out.print("Ingrese edad aqui: ");
        var edad = cantidad.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.println("Esta en etapa de primera infancia...");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Esta en etapa de infancia...");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Esta en etapa de adolecencia...");
        } else if (edad >= 19 && edad <= 26) {
            System.out.println("Esta en etapa de juventud...");
        } else if (edad >= 27 && edad <= 59) {
            System.out.println("Esta en etapa de adultez...");
        } else if (edad > 59) {
            System.out.println("es una persona mayor (tercera edad)...");
        } else {
            System.out.println("Edad invalida");
        }
    }

    public static void Ejercicio9(Scanner camisetas) {
        System.out.print("Ingrese la cantidad de camisetas que va comprar: ");
        var cantidad = camisetas.nextInt();
        double precio = 0;

        if (cantidad <= 0) {
            System.out.println("No comprara camisetas...");
        } else if (cantidad <= 50) {
            precio = 50000;
        } else if (cantidad <= 100) {
            precio = 45000;
        } else if (cantidad <= 150) {
            precio = 40000;
        } else if (cantidad <= 200) {
            precio = 35000;
        } else if (cantidad > 200) {
            precio = 25000;
        }

        if (cantidad > 0) {
            System.out.printf("El precio de %d camisetas es: $%.2f ", cantidad, precio * cantidad);
        }
    }

    public static void Ejercicio10(Scanner mesYear) {
        System.out.print("Ingrese el numero del mes que desea: ");
        var mes = mesYear.nextInt();

        String mensaje = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            case 2 -> "28";
            default -> "Fuera del rango de meses(12)";
        };

        System.out.print(mensaje);
    }

    public static void Ejercicio11(Scanner ascendente) {
        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese numero #" + (i + 1) + ": ");
            nums[i] = ascendente.nextInt();
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void Ejercicio12(Scanner sandia, Scanner partes) {
        System.out.print("Ingrese el peso de la sandia en KG: ");
        var pesoSandia = sandia.nextInt();

        if (pesoSandia % 2 == 0) {
            System.out.println("La sandia se puede dividir...");

            System.out.println("--------------------------------");
            System.out.print("En cuantos pares los quieres dividir: ");
            var enPartes = partes.nextInt();

            System.out.printf("La sandia con peso de %dKG se divida en %d partes...%n", pesoSandia, enPartes);
        } else {
            System.out.println("No se puede dividir ya que es impar el peso...");
        }
    }

    public static void Ejercicio13(Scanner llegada) {
        System.out.println("Hermanos que llegaron tempranos: " + "\n" +
                "1. Hermano 1 y 2 llegaron temprano." + "\n" +
                "2. Hermano 1 y 3 llegaron temprano." + "\n" +
                "3. Hermano 2 y 3 llegaron temprano." + "\n");

        System.out.println("----------------------------------------");
        System.out.print("Ingrese una opcion: ");
        var opcion = llegada.nextInt();

        String hermanoTarde = switch (opcion) {
            case 1 -> "Hermano 3 llego tarde";
            case 2 -> "Hermano 2 llego tarde";
            case 3 -> "Hermano 1 llego tarde";

            default -> "Opcion no valida";
        };
        System.out.println(hermanoTarde);
    }

    public static void Ejercicio14(Scanner cubo) {
        System.out.print("Ingrese un numero para continuar: ");
        var num = cubo.nextInt();

        while (num >= 0) {
            System.out.print("Ingrese un numero para sacar el cubo: ");
            var numCubo = cubo.nextInt();
            cubo.nextLine();

            var result = Math.pow(numCubo, 3);

            System.out.printf("El resultado es: %.0f%n", result);

            System.out.println("==========================================");
            System.out.println("Ingrese un numero para continuar (negativo para salir)");
            num = cubo.nextInt();
        }
    }

    public static void Ejercicio15(Scanner numeros) {
        System.out.print("Ingrese un numero diferente de 0: ");
        var num = numeros.nextInt();

        while (num != 0) {
            System.out.println("Ingrese un numero (negativo o positivo) : ");
            num = numeros.nextInt();

            if (num > 0) {
                System.out.println("=====================================");
                System.out.println("El numero es positivo");
            } else {
                System.out.println("=====================================");
                System.out.println("Numero es negativo");
            }

            System.out.println("=====================================");
            System.out.print("Ingrese un numero (0 para salir): ");
            num = numeros.nextInt();
        }
    }

    public static void Ejercicio16(Scanner numeros) {
        ArrayList<Integer> numArrayList = new ArrayList<Integer>();

        System.out.print("Ingrese un numero negativo para continuar: ");
        var num = numeros.nextInt();

        while (num < 0) {
            System.out.print("Ingrese un numero (Positivo para salir): ");
            num = numeros.nextInt();

            if (num >= 0) {
                break;
            }
            numArrayList.add(num);

        }

        System.out.println("==============================================================");
        System.out.println("La cantidad de numero ingresados es: " + numArrayList.size());
        System.out.println("Los numero ingresados fueron: ");
        System.out.println(numArrayList);
        System.out.println("==============================================================");
        System.out.println("El arreglo en orden ascendente: ");
        Collections.sort(numArrayList);
        System.out.println(numArrayList);
    }

    public static void Ejercicio17() {
        for (int i = 0; i < 100; i = i + 5) {
            System.out.println((i + 5) + "\n");
        }
    }

    public static void Ejercicio18() {
        ArrayList<Integer> numerosPositivos = new ArrayList<Integer>();
        ArrayList<Integer> numerosNegativos = new ArrayList<Integer>();
        ArrayList<Integer> ceros = new ArrayList<Integer>();
        Random random = new Random();
        var sumaPositivos = 0;
        var sumaNegativos = 0;
        var contadorCeros = 0;

        for (int i = 0; i < 121; i++) {
            int num = random.nextInt(201) - 100;
            if (num > 0) {
                numerosPositivos.add(num);
                sumaPositivos += num;
            } else if (num < 0) {
                numerosNegativos.add(num);
                sumaNegativos += num;
            } else {
                ceros.add(num);
                contadorCeros++;
            }
        }

        var mediaPositivo = numerosPositivos.size() > 0 ? sumaPositivos / numerosPositivos.size() : 0;
        var mediaNegativo = numerosNegativos.size() > 0 ? sumaNegativos / numerosNegativos.size() : 0;

        System.out.println("=====================================================");
        System.out.println("La suma de numeros positivos es: " + sumaPositivos);
        System.out.println("La suma de numeros negativos es: " + sumaNegativos);
        System.out.println("La media de numeros positivos es: " + mediaPositivo);
        System.out.println("La media de numeros negativos es: " + mediaNegativo);
        System.out.println("La cantidad de 0 es: " + contadorCeros);
        System.out.println("=====================================================");
        System.out.println(numerosPositivos);
        System.out.println("=====================================================");
        System.out.println(numerosNegativos);
        System.out.println("=====================================================");
        System.out.println(ceros);
    }

    public static void Ejercicio19(Scanner series) {
        System.out.print("Cuantas series de fibonacci quieres ver: ");
        var serie = series.nextInt();

        var num1 = 0;
        var num2 = 1;

        System.out.println(num1);
        for (int i = 0; i < serie; i++) {

            var suma = num1 + num2;
            System.out.println(suma);

            num1 = num2;

            num2 = suma;
        }

    }

    public static void Ejercicio20() {
        int filas;
        int columnas;

        for (columnas = 1; columnas <= 4; columnas++) {

            for (filas = 1; filas <= 4; filas++) {

                System.out.print("██");
                System.out.print("  ");
            }

            System.out.println("");
            for (filas = 1; filas <= 4; filas++) {

                System.out.print("  ");
                System.out.print("██");
            }
            System.out.println("");

        }
    }

    public static void Ejercicio21(Scanner menu, Scanner conversion) {
        System.out.print("Presiona enter para continuar...");
        menu.nextLine();

        System.out.println("===========================================");
        System.out.println("CONVERSION DE MAGNITUDES..." + "\n" +
                "1. CONVERTIR DE MILLAS A KILOMETROS" + "\n" +
                "2. CONVERTIR DE KILOMETROS A MILLAS");

        System.out.println("===========================================");
        System.out.print("Selecciona una opcion (1 - 2): ");
        var opcion = menu.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el valor en millas para convertir a KM: ");
                var mll = conversion.nextFloat();
                var resultado = mll * 1.60934;

                System.out.println("===========================================");
                System.out.printf("La conversion de millas a KM es: %.4f kilometros %n", resultado);
                break;
            case 2:
                System.out.print("Ingrese el valor en KM para convertir a Millas: ");
                var km = conversion.nextFloat();
                var resultado2 = km / 1.60934;

                System.out.println("===========================================");
                System.out.printf("La conversion de KM a Millas es: %.4f Millas%n", resultado2);
                break;

            default:
                System.err.println("Opcion invalida...");
                break;
        }

    }

    public static void Ejercicio22(Scanner user) {
        System.out.println("Primero selecciona la coputadora...");
        System.out.print("Enter para continuar...");
        user.nextLine();

        int seleccionCompu = (int) (Math.random() * 3) + 1;
        System.out.println("Ya la computadora hizo su eleccion...");
        System.out.println("");

        System.out.println("Ahora elige tu: " + "\n" +
                "1 = Piedra" + "\n" +
                "2 = Papel" + "\n" +
                "3 = Tijera");
        System.out.println("");
        System.out.print("Escribe tu elección aqui -> ");
        var eleccionUser = user.nextInt();

        System.out.println("=====================================");
        System.out.print("La computadora eligió: ");
        switch (seleccionCompu) {
            case 1:
                System.out.println("Piedra");
                System.out.println("");
                switch (eleccionUser) {
                    case 1 -> System.out.println("Empate...");
                    case 2 -> System.out.println("Usted gana! :)");
                    case 3 -> System.out.println("Perdio :(");
                    default -> System.err.println("Eleccion invalida");
                }
                break;

            case 2:
                System.out.println("Papel");
                System.out.println("");
                switch (eleccionUser) {
                    case 1 -> System.out.println("Perdio :(");
                    case 2 -> System.out.println("Empate...");
                    case 3 -> System.out.println("Usted gano! :)");
                    default -> System.err.println("Eleccion invalida...");
                }
                break;

            case 3:
                System.out.println("Tijera");
                System.out.println("");
                switch (eleccionUser) {
                    case 1 -> System.out.println("Usted gana! :)");
                    case 2 -> System.out.println("Perdio :(");
                    case 3 -> System.out.println("Empate...");
                    default -> System.err.println("Eleccion invalida...");
                }
                break;

            default:
                System.err.println("Ocurrio un error... :(");
        }

    }
}
