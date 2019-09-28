
package bai1;

import java.util.Scanner;

public class Bai1 {

    /**
     * Đề bài: Viết ct liệt kê các số nguyên tố trong khoảng (m,n) (m < n < 1000)
     */
    public static void main(String[] args) {
       int start, end, soLuongSNT = 0;
       Scanner input = new Scanner(System.in);
       
       //nhap gia tri
       do
       {
           System.out.print("Gia tri bat dau la: ");
           start = input.nextInt();
           if(start > 1000) System.out.println("\tGia tri khong hop le.");
       }while(start > 1000);
       
       
       do
       {
           System.out.print("Gia tri ket thuc la: ");
           end = input.nextInt();
           if(end > 1000 || start > end) System.out.println("\tGia tri khong hop le.");
       }while(end > 1000 || start > end);
       
       
       //Xu ly va in ket qua
       System.out.print("Cac so nguyen to trong khoang (" + start + "-" + end + "): ");
       for(int i=start+1; i < end; i++)
       {
           if(ktSNT(i))
           {
               soLuongSNT++;
               System.out.print("  " + i);
           }
       }
       
       if(soLuongSNT == 0)
            System.out.println(" khong co so nguyen to nao!");
        
    }
    
     public static boolean ktSNT(int n)
    {
        if(n<2)
            return false;
        for(int i=2; i < n; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
