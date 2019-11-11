
package de2_dichvu;

import java.util.Scanner;

public abstract class DichVu {

    protected String maDV;
    protected String tenDV;
    protected float donGia;
    protected int soLuong;
    protected NgayThangNam ngayGui = new NgayThangNam();

    public DichVu() {
    }

    public DichVu(String maDV, String tenDV, float donGia, int soLuong, NgayThangNam ngayGui) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.ngayGui = ngayGui;
    }
    
    public abstract float tienPhaiTra();
    
    public void nhapTTDV()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma dv: ");
        maDV = input.nextLine();
        
        System.out.print("Nhap ten dv: ");
        tenDV = input.nextLine();
        
        boolean check = false;
        while(!check)
        {
            try
            {
                System.out.print("Nhap don gia: ");
                donGia = Float.parseFloat(input.nextLine());
                if(donGia > 0)
                    check = true;
                else System.out.println("Nhap don gia >0");
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
                System.out.print("Nhap so luong: ");
                soLuong = Integer.parseInt(input.nextLine());
                if(soLuong >= 0)
                    check = true;
                else System.out.println("Nhap so luong >=0");
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai!");
            }
        }
        
        System.out.print("Nhap ngay gui: \n");
        ngayGui.nhapDate();
    }
    
    public void xuatTTDV()
    {
        System.out.println("MaDV: " + maDV);
        System.out.println("TenDV: " + tenDV);
        System.out.println("DonGia: " + donGia);
        System.out.println("SoLuong: " + soLuong);
        System.out.print("NgayGui: "); ngayGui.xuatDate();
    }
}
