public class Tarea {
    public static int llamadasRecursivas=1;

    public static int sumaConsecutivos(int n) {
        int idActual=llamadasRecursivas++;
        System.out.println("LLamada a "+ idActual+" con numero n= "+n);
        if (n == 1) {
            System.out.println("LLamada a "+ idActual+" caso base alcanzado n=1");
            return 1;
        }
        //return n + sumaConsecutivos(n - 1);
        System.out.println("LLamada a "+ idActual+" llamando recursivamente con n= "+(n-2));
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n + resultadoParcial;
        System.out.println("LLamada a "+ idActual+" sumando "+n+" al resultado de "+ resultadoParcial+" = "+ resultado);

        System.out.println("LLamada a "+ idActual+" Retorno "+ resultado);
        return resultado;

    }


    public int Ejercicio2(int base, int exponente) {
        if(exponente==0){
            return 1;
        }
        return base*Ejercicio2(base, exponente-1);

    }
    public int Ejercicio3(int num) {
        if(num<10){
            return num;
        }
        return num%10+Ejercicio3(num/10);
    }

    public int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
