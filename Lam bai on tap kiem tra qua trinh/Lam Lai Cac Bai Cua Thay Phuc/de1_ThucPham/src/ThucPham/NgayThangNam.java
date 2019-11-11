package ThucPham;

import java.util.Scanner;

public class NgayThangNam {

    private int ngay=1;
    private int thang=1;
    private int nam=1900;

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
                System.out.println("Nhap ngay: ");
                ngay = Integer.parseInt(input.nextLine());
                if(ngay <=0 || ngay >31)
                    System.out.println("Nhap ngay tu 1->31");
                else check = true;
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
                System.out.println("Nhap thang: ");
                thang = Integer.parseInt(input.nextLine());
                if(thang <=0 || thang >12)
                    System.out.println("Nhap thang tu 1->12");
                else check = true;
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
                System.out.println("Nhap nam: ");
                nam = Integer.parseInt(input.nextLine());
                if(nam <=0)
                    System.out.println("Nhap nam > 0");
                else check = true;
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
