public class Main {
    public static void main(String[] args) {
        Pessoa minhaMae = new Pessoa(null, null, "Eliete", 56);
        Pessoa meuPai = new Pessoa(null, null, "Marcio", 56);
        Pessoa eu = new Pessoa(meuPai, minhaMae, "Marcio", 22);
        System.out.println("Meu nome: " + eu.getNome() + " e minha idade: " + eu.getIdade());
        System.out.println("Meu pai: " + eu.getPai().getNome() + " sua idade: " + eu.getPai().getIdade());
        System.out.println("Minha mãe: " + eu.getMae().getNome() + " sua idade: " + eu.getMae().getIdade());
    }
}