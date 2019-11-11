package sinhvien;

import java.util.Scanner;

public class SVChinhQuy extends SinhVien{
    private int soTC;

    public SVChinhQuy() {
    }

    public SVChinhQuy( String mssv, String hoTen, NgayThangNam date,int soTC) {
        super(mssv, hoTen, date);
        this.soTC = soTC;
    }
    
    @Override
    public float tienHocPhi()
    {
        if(soTC >= 20)
            return (float)(75000 * soTC);
        else return (float)(70000 * soTC);
    }
    
    @Override
    public void nhapTT()
    {
        Scanner input = new Scanner(System.in);
        super.nhapTT();
        System.out.print("Nhap so tin chi:");
        soTC = Integer.parseInt(input.nextLine());
    }
    
    @Override
    public void xuatTT()
    {
        super.xuatTT();
        System.out.println("\nsoTC:" + soTC);
    }
}
