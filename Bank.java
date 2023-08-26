

class Account{
    //access specifier
    public String name;
    protected String email;
    private String password;

    //getter and setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password=pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name ="Ameerudheen";
        account1.email= "ameer@gmail.com ";
        account1.setPassword("ameer ot");
        System.out.println("password is "+account1.getPassword());
        System.out.println(account1.name);
        System.out.println(account1.email);
    }
}
