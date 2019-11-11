package sinhvien;

public class main {
    public static void main(String[] args) {
        SinhVien sv2 = new SVKhongChinhQuy();
        sv2.nhapTT();
        sv2.xuatTT();
        
        SinhVien sv1 = new SVChinhQuy();
        sv1.nhapTT();
        sv1.xuatTT();
    }
}
