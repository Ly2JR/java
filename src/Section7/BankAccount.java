package Section7;

import java.io.*;
import java.util.concurrent.RecursiveTask;

public class BankAccount {
    private String ownerName;
    private int accountNumber;
    private float balance;

    String getOwnerName(){
        return  ownerName;
    }

    void setOwnerName(String n){
        this.ownerName=n;
    }

    int getAccountNumber(){
        return accountNumber;
    }

    void setAccountNumber(int n){
        this.accountNumber=n;
    }

    float getBalance(){
        return  balance;
    }

    void  setBalance(float n){
        balance=n;
    }

    void deposit(float depo){
        this.balance+=depo;
    }

    BankAccount(){
        this.ownerName="nobody";
        this.accountNumber=0;
        this.balance=0;
    }

    BankAccount(String ownerName,int accountNumber){
        this.ownerName=ownerName;
        this.accountNumber=accountNumber;
    }

    BankAccount(String ownerName,int accountNumber,float balance){
        this.ownerName=ownerName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public static void main(String[] args) {
//        try {
//            PrintWriter out=new PrintWriter(new FileWriter("myAccount2.txt"));
//            BankAccount aBankAccount=new BankAccount("LiuWei",2017);
//            out.println(aBankAccount.getAccountNumber());
//            out.println(aBankAccount.getAccountNumber());
//            out.println("$"+aBankAccount.getBalance());
//            out.close();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("Error:Cannot open file for writing");
//        }
//        catch (IOException e){
//            System.out.println("Error:Cannot write to file.");
//        }

        try {
            BufferedReader in=new BufferedReader(new FileReader("myAccount2.txt"));
            BankAccount aBankAccount=new BankAccount();
            aBankAccount.setOwnerName(in.readLine());
            aBankAccount.setAccountNumber(Integer.parseInt(in.readLine()));
            in.read();
            aBankAccount.deposit(Float.parseFloat(in.readLine()));
            in.close();

            System.out.println(aBankAccount);
            System.out.println(aBankAccount.getOwnerName()+" "+aBankAccount.getAccountNumber()+" "+aBankAccount.getBalance());
        }
        catch (FileNotFoundException e){
            System.out.println("Error:Cannot open file for reading");
        }
        catch (EOFException e){
            System.out.println("Error:EOF encountered,file may be corrupted");
        }
        catch (IOException e){
            System.out.println("Error:Cannot read from file.");
        }
    }
}
