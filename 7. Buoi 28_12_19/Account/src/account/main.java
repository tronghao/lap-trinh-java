
package account;

import java.util.Scanner;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Account> mangAC = new Vector<>();
        Account ac = new Account();
        
        int cn;
        while(true)
        {
            System.out.println("----------ACCOUNT MANAGER----------");
            System.out.println("1.Nhap thong tin");
            System.out.println("2.Xuat thong tin");
            System.out.println("3.Tim kiem");
            System.out.println("4.Rut tien");
            System.out.println("5.Chuyen tien");
            System.out.println("6.Thoat");
            System.out.print("Chon chuc nang: ");
            cn = Integer.parseInt(input.nextLine());
            switch(cn)
            {
                case 1:
                    mangAC.add(ac.nhapAC());
                    break;
                case 2:
                    System.out.println("Danh sach user:");
                    for(Account a : mangAC)
                        a.displayAccount();
                    break;
                case 3:
                    boolean check = false;
                    int id=0;
                    while(!check)
                    {
                        try
                        {
                            System.out.print("Nhap accountID can tim: ");
                            id = Integer.parseInt(input.nextLine());
                            check = true;
                        }catch(Exception e)
                        {
                            System.out.println("Gia tri khong hop le!");
                        }
                    }
                    Account b = new Account();
                    b = ac.findAC(mangAC, id);
                    if(b == null)
                    {
                        System.out.println("Khong tim thay!");
                    }
                    else
                    {
                        System.out.println("Tim thay!");
                        b.displayAccount();
                    }
                    break;
                case 4:
                    check = false;
                    id=0;
                    while(!check)
                    {
                        try
                        {
                            System.out.print("Nhap accountID can rut: ");
                            id = Integer.parseInt(input.nextLine());
                            check = true;
                        }catch(Exception e)
                        {
                            System.out.println("Gia tri khong hop le!");
                        }
                    }
                    
                    Account c = new Account();
                    c = ac.findAC(mangAC, id);
                    if(c == null)
                    {
                        System.out.println("Khong tim thay!");
                    }
                    else
                    {
                        check = false;
                        int soTien=0;
                        while(!check)
                        {
                            try
                            {
                                System.out.print("Nhap soTien can rut: ");
                                soTien = Integer.parseInt(input.nextLine());
                                if(soTien < 10000)
                                {
                                    System.out.println("so tien phai lon hon 10000");
                                    continue;
                                }
                                check = true;
                            }catch(Exception e)
                            {
                                System.out.println("Gia tri khong hop le!");
                            }
                        }
                        for(Account a : mangAC)
                            if(a.getAccountID() == id)
                                a.withdrawal(a, soTien);
                    }
                    break;
                case 5:
                    check = false;
                    int idChuyen=0;
                    while(!check)
                    {
                        try
                        {
                            System.out.print("Nhap accountID chuyen: ");
                            idChuyen = Integer.parseInt(input.nextLine());
                            check = true;
                        }catch(Exception e)
                        {
                            System.out.println("Gia tri khong hop le!");
                        }
                    }
                    
                    Account d = new Account();
                    d = ac.findAC(mangAC, idChuyen);
                    if(d == null)
                    {
                        System.out.println("Khong tim thay!");
                    }
                    else
                    {
                        check = false;
                    
                        int idDuocChuyen=0;
                        while(!check)
                        {
                            try
                            {
                                System.out.print("Nhap accountID muon chuyen: ");
                                idDuocChuyen = Integer.parseInt(input.nextLine());
                                check = true;
                            }catch(Exception e)
                            {
                                System.out.println("Gia tri khong hop le!");
                            }
                        }
                        
                        Account e = new Account();
                        e = ac.findAC(mangAC, idDuocChuyen);
                        if(e == null)
                        {
                            System.out.println("Khong tim thay!");
                        }
                        else
                        {
                            check = false;
                            int soTien=0;
                            while(!check)
                            {
                                try
                                {
                                    System.out.print("Nhap soTien chuyen: ");
                                    soTien = Integer.parseInt(input.nextLine());
                                    if(soTien < 10000)
                                    {
                                        System.out.println("so tien phai lon hon 10000");
                                        continue;
                                    }
                                    check = true;
                                }catch(NumberFormatException k)
                                {
                                    System.out.println("Gia tri khong hop le!");
                                }
                            }
                             for(Account g : mangAC)
                             {
                                 if(g.getAccountID() == idChuyen)
                                 {
                                     for(Account h: mangAC)
                                     {
                                         if(h.getAccountID() == idDuocChuyen)
                                         {
                                             g.tranferAtoB(g, h, soTien);
                                         }
                                     }
                                 }
                             }
                        }
                    }
                    break;
                case 6:
                    break;
            }
            
            if(cn == 6)
                break;
        }
//        

        
        
        
    }
}
