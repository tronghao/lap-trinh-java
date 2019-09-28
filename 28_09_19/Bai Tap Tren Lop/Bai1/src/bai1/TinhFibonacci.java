
package bai1;

import static bai1.TinhTongGiaiThua.giaiThua;
import java.util.Scanner;


public class TinhFibonacci {
    /**
     * Đề bài: Viết chương trình tính giá trị số Fibonacci F: F(0)=1, F(1)=1
     * F(n)=F(n-1) + F(n-2)
     */
    public static void main(String[] args) {
        int end;
        long tong = 0;
        Scanner input = new Scanner(System.in);
       
        
       //nhap gia tri
       do
       {
           System.out.print("Fibonaci thu: ");
           end = input.nextInt();
           if(end < 0) System.out.println("\tGia tri khong hop le.");
       }while(end < 0);
       
        System.out.println("\nF(" + end + ") = " + fibonacci(end));
 
    }
    
    public static int fibonacci(int viTri)
    {
        int giaTriTruoc = 1, giaTriSau = 1, tam;
        if(viTri == 0 || viTri == 1)
            return 1;
        else
        {
            for(int i=2; i <= viTri; i++)
            {
                tam = giaTriSau;
                giaTriSau += giaTriTruoc;
                giaTriTruoc = tam;
            }
        }
        return giaTriSau;
    }
}
