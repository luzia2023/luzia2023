import java.util.Scanner;


public class  App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);

        int primeiro,segundo;
        double resultado;

        primeiro = 7;
        segundo = 12;
        double  resDiv;



        int  opcao = -1;

        while (opcao != 0) {
            System.out.println("Inseri a operação");
            opcao = entrada .nextInt();
            if (opcao != 0) {
                
            
            System.out.println("Insira o primeiro numero: ");
            primeiro = entrada.nextInt();
            
            System.out.println("Inserir o segundo numero:  ");
            segundo = entrada.nextInt();

        }
        switch (opcao) {
            case 1:
            // Vamos realizar uma soma
            resultado = primeiro + segundo;
            System.out.println("Igual a "+resultado); 

            break;
            case 2:
            // Vamos realizar uma subtração
            resultado = primeiro - segundo;
            System.out.println("Igual a "+resultado);

            case 3:
            // vamos realizar uma multiplicação
            resultado = primeiro * segundo;
            System.out.println("Igual a "+resultado);  
                break;
            
              case 4:
            // vamos realizar uma divisão
              
                resDiv = primeiro / segundo;
                System.out.println("Igual a "+resDiv);
                break; 

                case 5:
                resultado = Math.pow(primeiro, segundo);
                System.out.println(resultado);
     
            case 0: 
                System.out.println("Encerrando!");   
                break;
            default:
                break;
        }
    }
}
}