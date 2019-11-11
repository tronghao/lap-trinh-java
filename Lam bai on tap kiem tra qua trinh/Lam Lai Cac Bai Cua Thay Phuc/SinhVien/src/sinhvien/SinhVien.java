
package sinhvien;

import java.util.Scanner;


public abstract class SinhVien {
  
    private String mssv;
    private String hoTen;
    private NgayThangNam ngaySinh = new NgayThangNam();
    
    public SinhVien() {
    }
    public SinhVien(String mssv, String hoTen, NgayThangNam date) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.ngaySinh = date;
    }
    

    protected abstract float tienHocPhi();

    
    protected void nhapTT()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mssv: ");
        mssv = input.nextLine();
        
        System.out.print("Nhap ho ten: ");
        hoTen = input.nextLine();
        
        System.out.println("Nhap ngaySinh: ");
        ngaySinh.nhapDate();
    }
    
    protected void xuatTT()
    {
        System.out.println("mssv: " + mssv);
        System.out.println("hoten: " + hoTen);
        System.out.print("ngaySinh: " ); ngaySinh.xuatDate();
    }

}
