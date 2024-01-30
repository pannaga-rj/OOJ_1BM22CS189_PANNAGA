import java.util.Scanner;
class Bank{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        sav_acct ob = new sav_acct();
        cur_acct ob1 = new cur_acct();
        ob.accept();
        System.out.println("Customer 1 enter your type of account");
        String s = sc.next();
        sc.nextLine(); // Consume the newline character
        System.out.println("Customer 2 enter your type of account");
        String c = sc.next();
        sc.nextLine(); // Consume the newline character
        
        ob.saving(s);
        
        ob1.current(c);
        ob.display(s);
        ob.display_c(c,ob1.balc);
    }
}

class Account
{       
        Scanner sc = new Scanner(System.in);
        int n = 2,damt,wamt,damtc,wamtc;
        float bal=0.0f;
        float balc=0.0f;
        String cn[] = new String[n];
        int ac[] = new int[n];
        
        
        void accept() {
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of customer " + (i + 1));
            cn[i] = sc.nextLine();
            System.out.println("Enter account number of customer " + (i + 1));
            ac[i] = sc.nextInt(); 
            
        sc.nextLine();
        } 
            
            
        
    }
    
        
        int deposit() 
        {
        System.out.println("Enter the deposit amount: ");
        damt = sc.nextInt();
        System.out.println("Amount Deposited");
        bal+=damt;
        return damt;
    }
    
        int withdraw() 
        {
        float min = 200.0f;
        System.out.println("Enter the withdrawal amount: ");
        wamt = sc.nextInt();
        System.out.println("Rs "+wamt+" withdrawn successfully");
        bal-=wamt;
                
        if(bal<min)
        {
        bal-=(0.01*bal);
        System.out.println("Interest deducted as the balance is less than minimum balance");
    }
        return wamt;
    }
    
    void com_in(){
        bal = bal+(float)(0.04*bal);
        System.out.println("Interest added to balance successfully");
        return;    
    }
    
    
    
    void display(String s){
        
            if(s.equalsIgnoreCase("savings"))
            {
            System.out.println("Name of customer 1"+": " + cn[0]);
            System.out.println("Account number of customer 1"+": " + ac[0]);
            System.out.println("Type of Account: " + s);
            System.out.println("Balance: " + bal);
            }    
        }
       
    
    //Current account calculation.
    int deposit_c() 
        {
        System.out.println("Enter the deposit amount: ");
        damtc = sc.nextInt();
        System.out.println("Amount Deposited");
        
        balc+=damtc;
        return damtc;
    }
    
        int withdraw_c() 
        {
        float min = 500.0f;
        System.out.println("Enter the withdrawal amount: ");
        wamtc = sc.nextInt();
        System.out.println("Rs "+wamtc+" withdrawn successfully"); 
        balc-=wamtc;
        
        if(balc<min)
        {
        balc-=(0.01*balc);
    System.out.println("Interest deducted as the balance is less than minimum balance");
    }
        return wamtc;
        }
    void display_c(String c,float balc) {
    for (int i = 1; i < n; i++) {
        System.out.println("Name of customer 2 " +": " + cn[i]);
        System.out.println("Account number of customer 2" + ": " + ac[i]);
        System.out.println("Type of Account: " + c);
        System.out.println("Balance:" +balc);
    }
}

} 

 

class cur_acct extends Account
{   
void current(String c){
    boolean con = true;
            
        if("current".equalsIgnoreCase(c))
            {
            while (con) {
            float d=0.0f;
            float w=0.0f;
            System.out.println("    Menu for current account(Customer 2)    ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    d = deposit_c();
                    break;
                case 2:
                    w = withdraw_c();
                    break;
                case 3:
                    con = false;
                    break;
                default: 
                    System.out.println("Enter a valid choice");
                    continue;
                }
            }
        
    }
   }
}
   
  
    
    
    
    
    
class sav_acct extends Account
{
void saving(String s) {
    
    boolean con = true;
    if ("savings".equalsIgnoreCase(s)) {
        while (con) {
            float d, w;
            System.out.println("    Menu for savings account(Customer 1)    ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute interest for savings account");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    d = deposit();
                    break;
                case 2:
                    w = withdraw();
                    break;
                case 3:
                    com_in();
                    break;
                case 4:
                    con = false;  // Set con to false
                    break;       // Exit the switch and loop
                default:
                    System.out.println("Enter a valid choice");
                    continue;
            }
        }
    }
}
}
