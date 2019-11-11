package ThucPham;

public class main {
    public static void main(String[] args) {
        ThucPham tp1 = new ThucPhamDH();
        tp1.nhapTT();
        tp1.xuatTT();
        System.out.println(tp1.tienPhaiTra());
        
        System.out.println("==============================");
        ThucPham tp2 = new ThucPhamKDH();
        tp2.nhapTT();
        tp2.xuatTT();
        System.out.println(tp2.tienPhaiTra());
    }
}
