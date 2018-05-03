package jdbc_PR;

public class Animal {
    private boolean salud;
    private String parcela;
    private String tipo;

    public Animal(){}

    public Animal(boolean salud, String parcela, String tipo){
        this.salud = salud;
        this.parcela = parcela;
        this.tipo = tipo;
    }

    public boolean isSalud(){
        return  salud;
    }
    public void setSalud(boolean salud){
        this.salud = salud;
    }

    public void setParcela(String parcela){
        this.parcela = parcela;
    }
    public String getParcela(String parcela){
        return parcela;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(String tipo){
        return tipo;
    }


}
