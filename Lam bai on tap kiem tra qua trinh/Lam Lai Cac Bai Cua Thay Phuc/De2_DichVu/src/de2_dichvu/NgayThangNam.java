package de2_dichvu;
import java.util.Scanner;


public class NgayThangNam {

    
    private int ngay = 1;
    private int thang = 1;
    private int nam = 1900;

    public NgayThangNam() {
    }
    
    public NgayThangNam(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public void nhapDate()
    {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        while(!check)
        {
            try
            {
                System.out.print("-Nhap ngay: ");
                ngay = Integer.parseInt(input.nextLine());
                if(ngay > 0 && ngay < 32)
                    check = true;
                else System.out.println("Nhap ngay >=1 va <=31");
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai!");
            }
        }
        
        check = false;
        while(!check)
        {
            try
            {
                System.out.print("-Nhap thang: ");
                thang = Integer.parseInt(input.nextLine());
                if(thang > 0 && thang < 13)
                    check = true;
                else System.out.println("nhap thang >=1 va <=12");
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai!");
            }
        }
        
        check = false;
        while(!check)
        {
            try
            {
                System.out.print("-Nhap nam: ");
                nam = Integer.parseInt(input.nextLine());
                if(nam > 0)
                    check = true;
                else System.out.println("nhap nam >0");
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai!");
            }
        }
    }
    
    public void xuatDate()
    {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
}
