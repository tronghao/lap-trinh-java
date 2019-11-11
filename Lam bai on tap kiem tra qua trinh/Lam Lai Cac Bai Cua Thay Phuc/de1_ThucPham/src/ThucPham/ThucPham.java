package ThucPham;

import java.util.Scanner;

public abstract class ThucPham {
    protected String maTP;
    protected String tenTP;
    protected float donGia;
    protected int soLuong;
    protected NgayThangNam ngayBan  = new NgayThangNam();

    public ThucPham() {
    }

    public ThucPham(String maTP, String tenTP, float donGia, int soLuong, NgayThangNam ngayBan) {
        this.maTP = maTP;
        this.tenTP = tenTP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.ngayBan = ngayBan;
    }
    
    public abstract float tienPhaiTra();
    
    public void nhapTT()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma thuc pham: ");
        maTP = input.nextLine();
        
        System.out.print("Nhap ten thuc pham: ");
        tenTP = input.nextLine();
        
        boolean check = false;
        while(!check)
        {
            try
            {
                System.out.println("Nhap don gia: ");
                donGia = Float.parseFloat(input.nextLine());
                if(donGia <=0)
                    System.out.println("Nhap don gia > 0");
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
                System.out.println("Nhap so luong: ");
                soLuong = Integer.parseInt(input.nextLine());
                if(soLuong <=0)
                    System.out.println("Nhap so luong > 0");
                else check = true;
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai!");
            }
        }
        
        System.out.println("Nhap ngay ban: ");
        ngayBan.nhapDate();
    }
    
    public void xuatTT()
    {
        System.out.println("Ma TP: " + maTP);
        System.out.println("Ten TP: " + tenTP);
        System.out.println("Don Gia: " + donGia);
        System.out.println("So Luong: " + soLuong);
        System.out.print("ngay Ban: "); ngayBan.xuatDate();
    }
}
