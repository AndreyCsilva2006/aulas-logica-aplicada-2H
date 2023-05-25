public class Pessoa extends Animal{
    // Atributos da classe
    public String sobrenome;
    // métodos da classe
    public void falar(){
        System.out.println("Falei");
    }
    public String falar(String texto){
        return texto;
    }
    // sobrescrito do método
    public void comer(){
        System.out.println("Pessoa comeu");
    }
}
