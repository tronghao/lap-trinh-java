
package toancoban;

import java.util.Scanner;


public class ToanCoBan {

     /**
     * Toán cơ bản
        Viết chương trình áp dụng phép toán số học giữa 2 số nguyên được nhập từ phím. Sử dụng menu (DOS) cơ bản để lựa chọn toán hạng: Cho ví dụ như menu bên dưới, nếu nhập hai số: 2 và 1 sau đó chọn 1:
        1. cộng
        2. trừ
        3. nhân
        4. chia
        Ví dụ:  chọn 1: Đầu ra: 2 + 1 = 3
     */
    private int num1, num2;
    
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap so thu nhat = ");
        num1 = input.nextInt();
        
        System.out.print("Nhap so thu hai = ");
        num2 = input.nextInt();
    }
    public int menu()
    {
        int luaChon;
        System.out.println("--------------------------------");
        System.out.println("1.Cong");
        System.out.println("2.Tru");
        System.out.println("3.Nhan");
        System.out.println("4.Chia");
        System.out.println("5.Nhap lai gia tri");
        System.out.println("0.Thoat");     
        System.out.print("--------------------------------");
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("\nNhap lua chon: ");
            luaChon = input.nextInt();
            if(luaChon < 0 || luaChon > 5) System.out.println("\nKhong hop le! Hay nhap so trong khoang tu 0->5");
        }while(luaChon < 0 || luaChon > 5);
        return luaChon;
    }
    
    public void chucNang(int chucNangDuocChon)
    {
        switch (chucNangDuocChon) {
            case 1: {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            }
            case 2: {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            }  
            case 3: {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            }
            case 4: {
                System.out.println(num1 + " / " + num2 + " = " + ((float)num1 / num2));
                break;
            }
            case 5: {
                this.nhap();
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int chucNang;
        ToanCoBan tcb = new ToanCoBan();
        tcb.nhap();
        for(;;)
        {
            chucNang = tcb.menu();
            if(chucNang == 0)
                break;
            tcb.chucNang(chucNang);      
        }   
    }
    
}
