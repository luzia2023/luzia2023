public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        
    //     int i, j, posi, t, i2;

    //     posi = 6;
    //     t = 1;
    //     for(i = 1; i <=6; i++){
    //         for(j = 1; j <= 10;j++)
    //         if(j == posi){
    //             for(i2 = 1; i2 <= t; i2++)
    //                 System.out.print('*');
    //           t+=2;
    //           posi--;
    //          } else
    //             System.out.print(' ');
                    
    //             System.out.println();  
    //         }
    //     }

    // }

        // int tam = 10;
        // int vetor[] = new int[tam];
        // int i;

        // for(i = 1; i<tam; i++){
        //     vetor[i] = 10;

        // }

        //   for(i= 1; i<tam; i++){
        //     System.out.print(vetor[i] + " ");
        //   }  


          int tam = 10;
          int matriz[][] = new int[tam][tam];
          int i, j;

          for(i = 0; i < tam; i++){
            for(j= 0; j < tam; j++){
                matriz[i][j] = i * j;
            }
          }

          for(i = 0; i < tam; i++){
            for(j= 0; j < tam; j++){
                matriz[i][j] = i * j;
                System.out.print(matriz[i][j] + " ");
            }
                System.out.println();

                

       }
    }



}

