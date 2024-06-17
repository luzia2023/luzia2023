import java.sql.Date;
import java.text.SimpleDateFormat;

public class Peta extends Estoque {
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    @SuppressWarnings("deprecation")
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/mm/yyyy");

        fabricacao.setDate(fabricacao.get.Date() + 30);

        return fs.format(fabricacao);

    }
      public double venda (int pacote){
        return pacote * 6.70;
      }  

      public double venda(double quilo){
        return quilo * 15.45;
      }
}
