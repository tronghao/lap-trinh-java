package de2_dichvu;

import java.util.Scanner;

public class BuuPham extends DichVu{
    private boolean loaiBP; //1:hang hoa  0:thu
    
    @Override
    public float tienPhaiTra()
    {
        float phiDV;
        if(loaiBP == true)
            phiDV = 50000;
        else phiDV = 30000;
        
        return (float)(donGia * soLuong + phiDV);
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
                int luaChon;
                System.out.println("Loai Buu Pham: 1.Hang Hoa,  0.Thu");
                System.out.print("Lua Chon: ");
                luaChon = Integer.parseInt(input.nextLine());
                if(luaChon == 1)
                {
                    loaiBP = true;
                    check = true;
                }else if(luaChon == 0)
                {
                    loaiBP = false;
                    check = true;
                }else
                {
                    System.out.println("Loi nhap. Vui long nhap lai");
                }
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai");
            }
        }
    }
    
    @Override
    public void xuatTTDV()
    {
        super.xuatTTDV();
        if(loaiBP == true)
        {
            System.out.println("Loai BP: Hang Hoa");
        }
        else
        {
            System.out.println("Loai BP: Thu");
        }
    }
}
