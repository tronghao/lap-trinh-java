package de2_dichvu;

public class main {
    public static void main(String[] args) {
        DichVu dv = new BuuPham();
        dv.nhapTTDV();
        dv.xuatTTDV();
        System.out.println(dv.tienPhaiTra());
        
        DichVu dv2 = new BuuKien();
        dv2.nhapTTDV();
        dv2.xuatTTDV();
        System.out.println(dv2.tienPhaiTra());
    }
}
