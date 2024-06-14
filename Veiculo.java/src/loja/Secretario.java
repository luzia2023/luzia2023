package loja;

public class Secretario extends Funcionario{
    private String ramal;
    private String turno;
    public String getRamal() {
        return ramal;
    }
    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public String marcareunião( boolean marcareuniao){

        if (marcareuniao == true) {
            
            return"reuniao marcada";
        }else 
            return "reuniao nao marcada";
        
    }



}
