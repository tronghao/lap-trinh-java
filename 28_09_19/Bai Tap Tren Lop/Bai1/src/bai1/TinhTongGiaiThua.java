
package bai1;

import java.util.Scanner;

public class TinhTongGiaiThua {
    /**
     * Đề bài: Viết chương trình tính tổng S = 1! + 2! + ... + n!
     */
    public static void main(String[] args) {
        int n;
        long tong = 0;
        Scanner input = new Scanner(System.in);
       
        //in de bai
        System.out.println("S = 1! + 2! + ... + n!");
        
       //nhap gia tri
       do
       {
           System.out.print("Nhap gia tri n = ");
           n = input.nextInt();
           if(n < 0) System.out.println("\tGia tri khong hop le.");
       }while(n < 0);
       
       for(int i = 1; i <= n; i++)
       {
           tong += giaiThua(i);
       }
       
        System.out.println("Ket qua: " + tong);
    }
    
    public static long giaiThua(int n)
    {
       long giaTriGiaiThua = 1;
       if(n==0 || n==1)
           giaTriGiaiThua = 1;
       else
       {
           for(int i=2; i<=n; i++)
               giaTriGiaiThua *= i;
       }    
       return giaTriGiaiThua;
    }
}
