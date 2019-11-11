package ThucPham;

import java.util.Scanner;

public class ThucPhamDH extends ThucPham{
    private int hanSD;

    public ThucPhamDH() {
    }
    
    public ThucPhamDH(String maTP, String tenTP, float donGia, int soLuong, NgayThangNam ngayBan, int hanSD) {
        super(maTP, tenTP, donGia, soLuong, ngayBan);
        this.hanSD = hanSD;
    }
    
    
    
    @Override
    public float tienPhaiTra()
    {
        float tienPhaiTra = donGia * soLuong;
        if(soLuong >= 5)
            tienPhaiTra -= (tienPhaiTra * 5 / 100);
        
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
                System.out.println("Nhap han su dung: ");
                hanSD = Integer.parseInt(input.nextLine());
                if(hanSD <=0)
                    System.out.println("Nhap han su dung > 0");
                else check = true;
            }catch(Exception e)
            {
                System.out.println("Loi nhap. Vui long nhap lai!");
            }
        }
    }
    
    public void xuatTT()
    {
        super.xuatTT();
        System.out.println("HSD: " + hanSD + " thang");
    }
}
