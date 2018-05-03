package jdbc_PR;

public class Gato extends Animal{
    private String raza;

    public Gato(boolean salud, String parcela, String tipo){
        super(salud, parcela, tipo);
        this.raza= raza;
    }

    public Gato(boolean salud, String parcela, String tipo, String raza){
        super(salud, parcela, tipo);
        this.raza = raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getRaza(String raza){
        return raza;
    }
}
