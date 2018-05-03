package jdbc_PR;

public class Tigre extends Animal {
    private String raza;

    public Tigre(boolean salud, String parcela, String tipo){
        super(salud, parcela, tipo);
        this.raza= raza;
    }

    public Tigre(boolean salud, String parcela, String tipo, String raza){
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


