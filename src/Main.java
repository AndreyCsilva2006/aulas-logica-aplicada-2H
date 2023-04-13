public class Main {
    public static void main(String[] args) {
        int cont = 0;
        // laço de repetição
        while(cont <= 10) {
            System.out.println("Contador = "+cont);
            // incrementação
            cont++;
        }

        // laço para caça
        for(int x = 0; x <= 10; x++) {
            System.out.println("Contador 2 = "+x);
        }
        // código faça enquanto
        int cont2 = 1;
        do{
            // processo
            System.out.println(cont2);
            // incremento
            cont2++;
        }while(cont2 <= 10);
    }
}