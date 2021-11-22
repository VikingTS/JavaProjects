public class Email {

    
    //Variables
    private String firstName;
    private String surname;
    private String password;
    private String dept;
    private int inboxCap;
    private String altEmail;


    //Constructors
    Email(String firstName, String surname){
        this.firstName = firstName;
        this.surname = surname;
    }

    Email(String firstName, String surname, String password){
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;

    }

    //Methods

    public String getName(){
        String fullname = firstName + " " + surname;
        return fullname;
    }

    public int getInboxCap(){
        return inboxCap;
    }

    public String getPass(){
        return password;
    }

    private String getDept(){
        return dept;
    }

    private void setDept(String dept){
        this.dept = dept;
    }

    public void changePass(String newPass){
        if(newPass == password){
            System.out.println("Please enter a new password you have not used before!");
        }
        else{
            password = newPass;
        }
    }


}
