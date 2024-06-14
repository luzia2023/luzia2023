package loja;

public class Vendedor  extends Funcionario{
    private String matricula;
    private String setor;
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;

    }
    public double realizarvenda(double valor, int quantidade ){
        return valor * quantidade;
    }

    

}
