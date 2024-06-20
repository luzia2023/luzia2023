public class Filho implements Pai,Mae {

    private String nome;
    private String idade;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public double altura(double altura) {
        
        return altura *Math.PI / 3;
    }

    @Override
    public boolean barba(boolean tem) {
        
        return tem;
    }

    @Override
    public boolean cavice(double alt) {
        if (alt > 1.5
            return true;
        else
            return false;
            
        }
        return false;
        
        @Override
        public String corOlhos(String cor) {
            
            return null;
        }
        
        @Override
        public String corPele(String cor) {
            
            return null;
        }
        
        @Override
        public String tipoCabelo(String tipo) {
            
            return tipo;
        }
        
    }

}
