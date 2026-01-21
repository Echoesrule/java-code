
import java.util.Scanner;

 class Banking_System {

    private int accountnumber;
   private  String firstname;
    private String lastname;
    private int password;
    private int balance=0;

    public Banking_System(int accountnumber,String firstname ,String lastname,int password){
        this.accountnumber=accountnumber;
        this.firstname=firstname;
        this.lastname=lastname;
        this.password=password;
    }

    public int getaccountnumber(){
        if(accountnumber<=0 || accountnumber>99999999){
            System.out.println("Invalid account number");
        }
        else if(accountnumber>0 && accountnumber<=99999999){
            System.out.println("Valid account number");

        }
       return accountnumber;
    }
    public String getFirstname(){
        return  firstname;

    }
    public String getlastname(){
        return lastname;
    }
    public int getpassword(){
        return password;
    }
//setters
    public void setName(String name){
        firstname=name;
        lastname=name;
    }
   public  void setId(int accountnumber){
        this.accountnumber=accountnumber;
    } 
   public  void setPassword(int password){
        this.password=password;
    } 

    public void deposit(int amount){
        if(amount<=0){
            System.out.println("Please enter reasonable funds");
         }
         else{
            balance+=amount;
         }
   
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient funds");
        }
        else{
            balance-=amount;
        }
    }
    public void CheckBalance(){
        System.out.println("Your balance is: "+balance);
    }
    public int getbalance(){
        return balance;
    }
}

//Main class
public class Client{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
        //get user input
        System.out.println("Hey there Welcome to the Banking System");
        System.out.print("Enter your Account number: ");
        int accountnumber=scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline
        System.out.println("Enter your firstname:");
        String firstname=scanner.nextLine();
        System.out.println("Enter your lastname:");
        String lastname=scanner.nextLine();
        System.out.println("Set your password:");
        int password=scanner.nextInt();
    
        Banking_System user=new Banking_System(accountnumber,firstname,lastname,password);
        System.out.println("Account created successfully for!"+user.getFirstname()+user.getlastname());
        
        //Create menu section
        boolean running=true;
        while(running){
            System.out.println("Menu");
            System.out.println("1:Deposit");
            System.out.println("2:Withdraw");
            System.out.println("3:Check Balance");
            System.out.println("4:Exit");
            
            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount=scanner.nextInt();
                    if(depositAmount<=0){
                        System.out.println("Please enter reasonable funds");
                   
                    }   
                    else if (depositAmount>0){
                    user.deposit(depositAmount);
                    System.out.println("You have succesfully deposited: "+depositAmount+"$");
                    System.out.println("Your Account balance is: "+user.getbalance()+"$");
                    }
                                   
                    break;
                case 2:
                    System.out.println("Enter amount you wish to withdraw");
                    int withdrawalamount=scanner.nextInt();
                    if(withdrawalamount<=0){
                        System.out.println("Please enter reasonable funds");
                    }
                    else if (withdrawalamount>user.getbalance()){
                        System.out.println("Insufficient funds");
                    }
                    else if (withdrawalamount>0 && withdrawalamount<=user.getbalance()){
                      user.withdraw(withdrawalamount);
                    System.out.println("You have succesfully Withdrawn: "+withdrawalamount+"$");
                    System.out.println("Your Account balance is: "+user.getbalance()+"$");
                    }
                  else{
                        System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    user.CheckBalance();
                    break;
                case 4:
                    running =false;
                    System.out.println("Thank you for your service");
                    break;
                default:
                    System.out.println("Invalid input ");
                    break;
        }
    }
    scanner.close();
    }
}