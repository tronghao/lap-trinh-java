
package bai1;

import java.util.Scanner;

public class TinhGiaiThua {
    /**
     * Đề bài: Viết chương trình tính giai thừa n
     */
    public static void main(String[] args) {
        int n;
        long giaTriGiaiThua = 1;
        
        Scanner input = new Scanner(System.in);
       
       //nhap gia tri
       do
       {
           System.out.print("Nhap gia tri can tinh giai thua: ");
           n = input.nextInt();
           if(n < 0) System.out.println("\tGia tri khong hop le.");
       }while(n < 0);
       
       //Xu ly
       if(n==0 || n==1)
           giaTriGiaiThua = 1;
       else
       {
           for(int i=2; i<=n; i++)
               giaTriGiaiThua *= i;
       }
       
       System.out.println("\nKet qua: " + n + "!=" + giaTriGiaiThua);
    }
}
