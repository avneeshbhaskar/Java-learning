package Bank;

public class Account {

    public String name;
    protected String email;
    private String password;

    //getters & setters for private access modifier

    public String getPassword(){
        return this.password;
    }

    private void setPassword(String pass) {
        this.password = pass;
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Avneesh";
        System.out.println(account1.name);
        System.out.println(account1.email = "avneeshbhaskar8678@gmail.com");
        account1.setPassword("avneesh0909");
        System.out.println(account1.getPassword());
    }

}