import java.util.InputMismatchException;
import java.util.Scanner;

public class conversor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int decisao1 = 0;

      
        while (true) {
            try {
                System.out.println("Bem vindo ao conversor de medidas! O que deseja converter? \n1-Temperatura\n2-Comprimento\n3-Massa\n4-Moeda");
                decisao1 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Insira um número inteiro entre 1 e 4.");
                scanner.next(); 
            }
        }

        if(decisao1 == 1){
            int decisao2 = 0;
            while (true) {
                try {
                    System.out.println("1-Celsius\n2-Fahrenheit\n3-Kelvin");
                    decisao2 = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Insira um número inteiro entre 1 e 3.");
                    scanner.next();
                }
            }

            double valor = 0;
            while (true) {
                try {
                    System.out.print("Insira o valor que voce deseja converter: ");
                    valor = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Insira um número.");
                    scanner.next();
                }
            }

            int decisao3 = 0;
            switch (decisao2) {
                case 1:
                    while (true) {
                        try {
                            System.out.println("Para?\n1-Fahrenheit\n2-Kelvin");
                            decisao3 = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida! Insira 1 ou 2.");
                            scanner.next();
                        }
                    }
                    if(decisao3 == 1){
                        double fahrenheit = (valor * 1.8) + 32;
                        System.out.printf("O valor de %.1f°C em farenheit é: %.2fF°%n", valor, fahrenheit);
                    } else {
                        double Kelvin = (valor + 273.15);
                        System.out.println(Kelvin);
                    }
                    break;

                case 2:
                    while (true) {
                        try {
                            System.out.println("Para?\n1-Celsius\n2-Kelvin");
                            decisao3 = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida! Insira 1 ou 2.");
                            scanner.next();
                        }
                    }
                    if(decisao3 == 1){
                        double celsius = (valor - 32) / 1.8;
                        System.out.println(celsius);
                    } else {
                        double Kelvin = (((valor -32)*5)/9) + 273.15 ;
                        System.out.println(Kelvin);
                    }
                    break;

                default:
                    while (true) {
                        try {
                            System.out.println("Para?\n1-Celsius\n2-farenheit");
                            decisao3 = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida! Insira 1 ou 2.");
                            scanner.next();
                        }
                    }
                    if(decisao3 == 1){
                        double celsius = (valor - 273.15);
                        System.out.println(celsius);
                    } else {
                        double farehenint = ((valor - 273.15)*1.8) + 32;
                        System.out.println(farehenint);
                    }
                    break;
            }

        } else if(decisao1 == 2){
            int decisao2 = 0;
            while (true) {
                try {
                    System.out.println("1-Metros\n2-Centímetros\n3-milímetros\n4-polegadas\n5-Pés");
                    decisao2 = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Insira um número inteiro entre 1 e 5.");
                    scanner.next();
                }
            }

            double valor = 0;
            while (true) {
                try {
                    System.out.println("Qual o valor para as conversões?");
                    valor = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Insira um número.");
                    scanner.next();
                }
            }

            switch (decisao2) {
                case 1:
                    double centimetros = (valor * 100), milimetros = (valor * 1000), polegadas = (valor * 39.3701), pes = (valor * 3.2801);
                    System.out.printf("\nO valor de %.2fM \nem centímetros: %.2fcm\nem milímetros: %.2fmm\nem polegadas: %3.2f\"\ne em pés: %3.2f'%n",
                        valor, centimetros, milimetros, polegadas, pes);
                    break;
                case 2:
                    double metros2 = (valor / 100), milimetros2 = (valor * 10), polegadas2 = (valor / 2.54), pes2 = (valor / 30.48);
                    System.out.printf("\nO valor de %.2fcm \nem metros: %.2fcm\nem milímetros: %.2fmm\nem polegadas: %3.2f\"\ne em pés: %3.2f'%n",
                        valor, metros2, milimetros2, polegadas2, pes2);
                    break;
                case 3:
                    double metros3 = (valor / 1000), centimetros3 = (valor / 10), polegadas3 = (valor / 25.4), pes3 = (valor / 304.8);
                    System.out.printf("\nO valor de %.2fmm \nem metros: %.2fm\nem centimetros: %.2fcm\nem polegadas: %3.2f\"\ne em pés: %3.2f'%n",
                        valor, metros3, centimetros3, polegadas3, pes3);
                    break;
                case 4:
                    double metros4 = (valor / 39.57), centimetros4 = (valor * 2.54), milimetros4 = (valor * 25.4), pes4 = (valor / 12);
                    System.out.printf("\nO valor de %.2f\"\" \nem metros : %.2fm\nem centimetros: %.2fcm\nem milimetros: %3.2f\ne em pés: %3.2f'%n",
                        valor, metros4, centimetros4, milimetros4, pes4);
                    break;
                default:
                    double metros5 = (valor / 3.281), centimetros5 = (valor * 30.48), milimetros5 = (valor * 304.8), polegadas5 = (valor * 12);
                    System.out.printf("\nO valor de %.2f' \nem metros : %.2fm\nem centimetros: %.2fcm\nem milimetros: %3.2f\ne em polegadas: %3.2f\"%n",
                        valor, metros5, centimetros5, milimetros5, polegadas5);
                    break;
            }

        } else if(decisao1 == 3){
            int decisao2 = 0;
            while (true) {
                try {
                    System.out.println("\nEscolha qual medida de peso você quer converter:");
                    System.out.println("1-Quilogramas\n2-gramas\n3-libras");
                    decisao2 = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Insira 1, 2 ou 3.");
                    scanner.next();
                }
            }

            double valor = 0;
            while (true) {
                try {
                    System.out.println("Insira a quantidade a ser convertida:");
                    valor = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Insira um número.");
                    scanner.next();
                }
            }

            switch (decisao2) {
                case 1:
                    double gramas = (valor * 1000), libras = (valor * 2.205);
                    System.out.printf("O valor de %.2fkg \nem gramas : %3.2fg\nem libras: %3.2f£%n", valor, gramas, libras);
                    break;
                case 2:
                    double kg = (valor / 1000), libras2 = (valor / 453.6);
                    System.out.printf("O valor de %.2fg \nem quilograma: %3.2fkg\nem libras: %3.2f£%n", valor, kg, libras2);
                    break;
                default:
                    double kg2 = (valor / 2.205), grama2 = (valor * 453.6);
                    System.out.printf("O valor de %3.2f£ \nem quilograma: %.2fkg\nem grama:%3.2fg%n", valor, kg2, grama2);
                    break;
            }

        } else {
            int decisao2 = 0;
            while (true) {
                try {
                    System.out.println("\nEscolha qual moeda você quer converter:");
                    System.out.println("1-real\n2-dólar\n3-euro\n4-libra");
                    decisao2 = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Insira 1, 2, 3 ou 4.");
                    scanner.next();
                }
            }

            double valor = 0;
            while (true) {
                try {
                    System.out.println("Insira a quantia a ser convertida:");
                    valor = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Insira um número.");
                    scanner.next();
                }
            }

            switch (decisao2) {
                case 1:
                    double dlr = (valor / 5.59), euro = (valor / 6.39), lbr = (valor / 7.58);
                    System.out.printf("O Valor de %.2fR$ \nem dolares: %3.2f$\nem euro: %3.2f€\nem libra: %3.2f£%n", valor, dlr, euro, lbr);
                    break;
                case 2:
                    double real = (valor * 5.59), euro2 = (valor * 0.87), lbr2 = (valor * 0.74);
                    System.out.printf("O valor de %.2f Dolares \nem real: %3.2fR$\nem euros: %3.2f€\nem libras: %3.2f£%n", valor, real, euro2, lbr2);
                    break;
                case 3:
                    double real2 = (valor * 6.39), dolar3 = (valor * 1.14), lbr3 = (valor * 0.84);
                    System.out.printf("O valor de %3.2f€ euros \nem real: %3.2fR$\nem dolares: %3.2f$\nem libras: %3.2f£%n", valor, real2, dolar3, lbr3);
                    break;
                default:
                    double real3 = (valor * 7.58), dolar4 = (valor * 1.36), euro3 = (valor * 1.19);
                    System.out.printf("O valor de %3.2f£ de libras \nem real: %3.2fR$\nem dolares: %3.2f$\nem euros: %3.2f€%n", valor, real3, dolar4, euro3);
                    break;
            }
        }

        scanner.close();
    }
}
