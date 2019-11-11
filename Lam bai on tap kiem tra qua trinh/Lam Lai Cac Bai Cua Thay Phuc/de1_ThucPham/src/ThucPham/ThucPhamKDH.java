package ThucPham;

import java.util.Scanner;

public class ThucPhamKDH extends ThucPham{
    private float trongLuong;
    
    public float tienPhaiTra()
    {
        float tienPhaiTra = soLuong * donGia;
        
        if(trongLuong >= 3)
        {
            tienPhaiTra -= (tienPhaiTra * 10 / 100);
        }
        else
        {
            tienPhaiTra -= (tienPhaiTra * 5 / 100);
        }
        
        return tienPhaiTra;
    }
    
    @Override
    public void nhapTT()
    {
        Scanner input = new Scanner(System.in);
        super.nhapTT();
        boolean check = false;
        while(!check)
        {
            try
            {
                System.out.println("Nhap trong luong: ");
                trongLuong = Float.parseFloat(input.nextLine());
                if(trongLuong <=0)
                    System.out.println("Nhap trong luong > 0");
                else check = true;
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai!");
            }
        }
    }
    
    @Override
    public void xuatTT()
    {
        super.xuatTT();
        System.out.println("Trong Luong: " + trongLuong + "kg");
    }
}
