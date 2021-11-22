public class BankApplication {
    
    public static void main(String[] args){

    }
}

class BankAccount {
    
    //Encapsulation, or Information hiding, is the basic paradigm of a good class design. 
    //It is a way to hide internal information of the class from external view by treating a class as a black box. 
    //As the below variables are set to private, they can only be accessed through accessor/mutator methods AKA Getter Setter Methods.

    //Variables/Attributes

    private int balance;
    private int prevTrans;
    private String custName;
    private String custID;

    //Constructors
    BankAccount(String custName, String custID){
        this.custID = custID;
        this.custName = custName;
    }

    BankAccount(String custName, String custID, int balance){
        this.custID = custID;
        this.custName = custName;
        this.balance = balance;
    }

    //Methods

    public void deposit(int amount){
        if(amount !=0){
            balance = balance + amount;
            prevTrans = amount;
        }
        else{
            System.out.println("There is insufficient funds to deposit into the account");
        }
    }

    public void withdraw(int amount){
        if (amount!= 0){
            balance = balance - amount;
            prevTrans = -amount;
        }
        
        else{
            System.out.println("There is insufficient funds to withdraw from the account");
        }
    }

    public int getPrevTrans(){
        return prevTrans;
    }

    public int getBalance(){
        return balance;
    }

    public String getName(){
        return custName;
    }

    public String getID(){
        return custID;
    }

}
