public class Manipula {
    public static void main(String[] args) throws Exception{
        String caminho = "teste.txt";
        ManipuladorArquivos.escrita(caminho);
        ManipuladorArquivos.leitura(caminho);
    }

}
