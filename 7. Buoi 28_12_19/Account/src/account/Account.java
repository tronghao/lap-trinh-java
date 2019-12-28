
package account;

import java.util.Scanner;
import java.util.Vector;


public class Account {

    private int accountID;
    private String name;
    private long accountBalance;
    
    public Account() {
    }
    
    public Account(int accountID, String name, long accountBalance) {
        this.accountID = accountID;
        this.name = name;
        this.accountBalance = accountBalance;
    }
    
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getName() {
        return name;
    }

    public long getAccountBalance() {
        return accountBalance;
    }


    public Account nhapAC()
    {
        Scanner input = new Scanner(System.in);
        Account ac = new Account();
       
        boolean check = false;
        while(!check)
        {
            try
            {
                System.out.print("Nhap accountID: ");
                int id;
                id = Integer.parseInt(input.nextLine());
                ac.setAccountID(id);
                check = true;
            }catch(Exception e)
            {
                System.out.println("Gia tri khong hop le!");
            }
        }
        
        System.out.print("Nhap account name: ");
        ac.setName(input.nextLine());
        
        check = false;
        while(!check)
        {
            try
            {
                System.out.print("Nhap account Balance: ");
                long balance;
                balance = Long.parseLong(input.nextLine());
                ac.setAccountBalance(balance);
                check = true;
            }catch(Exception e)
            {
                System.out.println("Gia tri khong hop le!");
            }
        }
        
        return ac;
    }
    
    public void displayAccount()
    {
        System.out.println("AccountName: " + this.name + "  Balance: " + this.accountBalance);  
    }
    
    public void withdrawal(Account ac, long money)
    {
        if(ac.getAccountBalance() < money)
        {
            System.out.println("Rut khong thanh cong, so tien vuot qua!");
        }
        else
        {
            ac.setAccountBalance(ac.getAccountBalance() - money);
            System.out.println("Rut thanh cong, so tien con lai la: " + ac.getAccountBalance());
        }
    }
    
    public int tranferAtoB(Account A, Account B, int soTienCanChuyen)
    {
        if(A.getAccountBalance() < soTienCanChuyen)
        {
            return 0;
        }
        else
        {
            if(soTienCanChuyen < 10000)
                return 0;
            else
            {
                A.setAccountBalance(A.getAccountBalance()-soTienCanChuyen);
                B.setAccountBalance(B.getAccountBalance()+soTienCanChuyen);
                return 1;
            }
        }
    }
    
    public Account findAC(Vector<Account> ac, int id)
    {
        for(Account a : ac)
        {
            if(a.getAccountID() == id)
                return a;
        }
        return null;
    }
}
