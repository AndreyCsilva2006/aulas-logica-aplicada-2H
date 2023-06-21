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

        // Criar produtos
        Produto p1 = new Produto(1300.00);
        Produto p2 = new Produto();
        // p2.preco = 233.00; Não é legal pq não é protegido!!!
        p2.setPreco(233.00);
        Produto p3;
        p3 = new Produto("Placa vídeo", 1300.00);
        p3 = new Produto("Placa mãe", 2300.00);
    }
}