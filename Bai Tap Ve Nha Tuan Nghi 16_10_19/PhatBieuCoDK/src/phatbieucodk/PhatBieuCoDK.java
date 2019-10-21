
package phatbieucodk;

import java.util.Scanner;

public class PhatBieuCoDK {

    /**
     * Phát biểu có điều kiện
        1. Viết phương thức yêu cầu người dùng nhập 2 số nguyên và trả về: 
        *       a. Tổng a và b nếu cả hai số nguyên là số chẵn. 
        *       b. Phép nhân của a với b nếu cả hai số nguyên là số lẻ. 
        *       c. Khác, bình phương của mỗi số nguyên.
        2. Viết phương thức cho phép nhập thông tin từ bàn phím.

     */
    
    private int a, b;
    public void nhap()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap a = ");
        this.a = input.nextInt();
        
        System.out.print("Nhap b = ");
        this.b = input.nextInt();
    }
    
    public int phatBieu()
    {
        
        this.nhap();
        
        if(a % 2 == 0 && b % 2 == 0)
        {
            return a + b;
        }
        else if (a % 2 != 0 && b % 2 != 0)
        {
            return a * b;
        }
        else
        {
            return (int)(Math.pow(a,2) + Math.pow(b,2));
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PhatBieuCoDK pb = new PhatBieuCoDK();
        System.out.println("KQ = " + pb.phatBieu());
    }
    
}
