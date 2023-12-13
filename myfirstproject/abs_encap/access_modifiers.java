/*
 * There are 4 types of access modifiers
 * 1.public ->accessible inside as well as
 * outside classes with the same package
 * 
 * 2.private->accessible within the class only
 * 
 * 3.protected->can be accessed in same class if 
 * we wants it to be accessed from out it can only
 * be accessed in sub-classes of the class
 * 
 * (to access from private we use the concept of
 * getters and setters)
 *
 * 
 * 4.default->in same package anyone can access it
 * but no other package can access it
 * (if we remove the name it will become )
 * e.g.  String name;in this the name is 
 * default access modifiers
 * 
 * 
 * 
 * 
 * 
 * 
 */
class Account{
    public String name;
    protected String email;
    private String password;
    public String getpassword(){
        return this.password;
    }
    public void setPassword(String str){
        this.password = str;
    }//we can also make this private
    //by using setting setpassword(randompass)
    //if we don't want user to set the password
    //so it will be automatically setted through
    //random pass

}

public class access_modifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name= "Shivam";
        account1.email = "Shivam@gmail.com";
        account1.setPassword("abcd");

       System.out.println(account1.getpassword());
    }
}
