public class App {
    public static void main(String[] args) {
        Filho filho = new Filho();


        filho.setNome(nome: "Luzia");
        filho.setIdade(idade: 20);

        System.out.println("Nome: " + filho.getNome);
        System.out.println("Idade:  " + filho.getIdade);

        System.out.println("Altura:  " + filho.altura(altura: 1.70));
        System.out.println("Tem barba: " + filho.barba(tem:true));
        System.out.println("Cor dos olhos: " + filho.corOlhos(cor:"Castanho"));
        System.out.println("Tipo de pele:  " + filho.corPele(cor: "Pardo"));
        System.out.println("Tipo de cabelo: " + filho.tipoCabelo(tipo:"Ondulados"));
    }
}
