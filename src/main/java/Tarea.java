public class Tarea {
    public int Ejercicio1(int inicio, int fin) {
        if(inicio==fin){
            System.out.print(fin);
            return fin;

        }
        System.out.print(inicio+" + ");
        return inicio+Ejercicio1(inicio+1, fin);



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
}
