package OOPS;

import java.util.*;
class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;

    }

}
public class AccessModifiers {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.name = "Bro";
        account1.email = "bro@email.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
