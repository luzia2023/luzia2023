package loja;

public class Funcionario {
    private String nome;
    private String cpf;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double receberbonus(double salario , double bonus);
        return salario +  bonus ;   
    
}
