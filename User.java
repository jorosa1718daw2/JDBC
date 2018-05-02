package jdbc_PR;

public class User {
    private String username;
    private String email;
    private String password;
    private int id;
    public User() {
    }
    public User(String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return username;
    }
    public void setName(String username) {
        this.username = username;
    }
    public String getPass() {
        return password;
    }
    public void setPass(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return this.id+", "+this.username+", "+this.email+".";
    }


}
