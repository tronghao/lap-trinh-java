package de2_dichvu;

import java.util.Scanner;

public class BuuKien extends DichVu{
    private float trongLuong;
    
    @Override
    public float tienPhaiTra()
    {
        float phiDV, tienPhaiTra;
        tienPhaiTra = (float)(soLuong * donGia);
        if(trongLuong >= 3)
        {
            phiDV = tienPhaiTra * 10 / 100;
        }
        else
        {
            phiDV = tienPhaiTra * 5 / 100;
        }
        
        return (tienPhaiTra + phiDV);
    }
    
    @Override
    public void nhapTTDV()
    {
        Scanner input = new Scanner(System.in);
        super.nhapTTDV();
        
        boolean check = false;
        while(!check)
        {
            try
            {
                System.out.print("Nhap trong luong: ");
                trongLuong = Float.parseFloat(input.nextLine());
                if(trongLuong > 0)
                    check = true;
                else System.out.println("Nhap trong luong >0");
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai!");
            }
        }
    }
    
    @Override
    public void xuatTTDV()
    {
        super.xuatTTDV();
        System.out.println("TrongLuong: "+ trongLuong);
    }
}
