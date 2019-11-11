package sinhvien;

import java.util.Scanner;

public class SVKhongChinhQuy extends SinhVien{
    int soMH;
    
    @Override
    public float tienHocPhi()
    {
        return (float)(soMH * 350000);
    }
    
    @Override
    public void nhapTT()
    {
        Scanner input = new Scanner(System.in);
        super.nhapTT();
        System.out.print("Nhap so mon hoc:");
        soMH = Integer.parseInt(input.nextLine());
    }
    
    @Override
    public void xuatTT()
    {
        super.xuatTT();
        System.out.println("\nsoMH: " + soMH);
    }
}
