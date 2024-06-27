package EscritaJson;
import org.json.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.FileNotFoundException;

public class EscritaJson {

    @SuppressWarnings("deprecation")

    public static void main(String[]args){
        JSONObject jsonObject ;

        JSONParser parse = new JSONParser();

        String nome;
        String ultimoNome;

        String estado;

        try{
            jsonObject = (JSONObject) parse.parse(new FileReader("src\\EscritaJson\\saida.json"));
            ultimoNome =(String) jsonObject.get("Ultimo nome");
            estado = (String) jsonObject.get("Estado");
            nome = (String) jsonObject.get("Nome");
            System.out.println(" o nome completo dela é " +nome  +" "+ ultimoNome +  ", nascido em " +estado + ".");
        } catch (Exception e) {
            e.printStackTrace();
        }

















    //     FileWriter escreve = null;
    //     jsonObject.put("Nome","Luzia");
    //     jsonObject.put("Ultimo nome","Jesus");
    //     jsonObject.put("Estado", "Brasilia");

    //    try {
    //         escreve = new FileWriter("src\\EscritaJson\\saida.json");
    //         escreve.write(jsonObject.toString());
    //         escreve.close();

    //    } catch (IOException e){
    //         e.printStackTrace();
    //    }

    //     System.out.println(jsonObject);


    }

}
