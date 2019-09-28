
package bai1;

import java.util.Scanner;

public class Bai5 {
    /**
     * Đề bài: Viết chương trình tính tổng các phần tử trong một số nguyên
     * vd : 2345 tổng = 2+3+4+5 = 14
     */
    public static void main(String[] args) {
        int soNguyen, tam;
        long tong = 0;
        Scanner input = new Scanner(System.in);
       
        
       //nhap gia tri
       do
       {
           System.out.print("Nhap so nguyen: ");
           soNguyen = input.nextInt();
           if(soNguyen < 0) System.out.println("\tGia tri khong hop le.");
       }while(soNguyen < 0);
       
       //Xu ly
       tam = soNguyen;   
       while(tam > 10)
       {
           tong += tam % 10;
           tam /=  10;
       }
       tong += tam;
         
       System.out.println("Tong cac phan tu cua " + soNguyen + " la: " + tong);
    }
}
