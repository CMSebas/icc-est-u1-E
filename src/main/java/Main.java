import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Tarea ejercicios = new Tarea();
        int opcion;
        boolean aux= false;

        do {
            System.out.println("Introduzca la opcion que deseas:");
            opcion = leer.nextInt();
            if (opcion>0 && opcion<=3) {
                aux=true;
            }else {
                aux=false;
                System.out.println("Opcion no valida: Intentalo otra vez: ");
            }
        }while(aux==false);

        switch (opcion) {
            case 1:
                System.out.println("Introduzca el numero del que quieres ver la suma de numeros consecutivos");
                int num = leer.nextInt();
                int resultado1= ejercicios.Ejercicio1(1,num);
                System.out.println("");
                System.out.println("EL RESULTADO DE LA SUMA ES DE "+resultado1);
                break;
                case 2:
                    System.out.println("Introduzca la base del numero del que deseas sacar su exponente:");
                    int base = leer.nextInt();
                    System.out.println("introdcuzca el exponente del numero que deas ver su potencia");
                    int exponente = leer.nextInt();
                    int resultado2 = ejercicios.Ejercicio2(base,exponente);
                    System.out.println("");
                    System.out.println("El resultado de la potencia es de "+resultado2);
                    break;
                    case 3:
                        System.out.println("Introduce el numero que quieres ver la suma de sus digitos");
                        int num2 = leer.nextInt();
                        int resultado3=ejercicios.Ejercicio3(num2);
                        System.out.println("");
                        System.out.println("La suma de sus digitos es de "+resultado3);
                        break;
                        default:
                            System.out.println("Opcion no valida: Intentalo otra vez: ");
                            break;
        }



    }


}
