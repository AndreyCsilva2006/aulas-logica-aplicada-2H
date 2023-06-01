public class Main {
    public static void main(String[] args) {
        // Aula introdutoria de Orientação e Objetos
        // Declaração de objeto
        Pessoa adao;
        // Instanciação do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));
        // criar novos objetos
        // declarar objetos
        Pessoa rainha;
        //Instanciar objetos
        rainha = new Pessoa();
        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definicão do comportamento
        rainha.falar();
        rainha.comer();

    }
}