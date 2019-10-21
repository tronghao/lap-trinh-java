
package mangsonguyen;

import java.util.Scanner;


public class MangSoNguyen {

    
    /**
     * Làm việc với mảng số nguyên
        1. Viết một phương thức int min (int [] mảng) trả về giá trị nhỏ nhất được lưu trữ trong mảng
        2. Viết phương thức int find (int [] mảng, int value) trả về vị trí xuất hiện đầu tiên của giá trị trong mảng. Nếu không tìm thấy giá trị, phương thức trả về -1.
        3. Viết một phương thức int sumArray (int [] mảng) trả về tổng của tất cả các phần tử trong mảng.
        4. Viết một phương thức void printArray (int [] mảng) in các giá trị được lưu trong mảng.
        5. Viết một phương thức int [] ReverseArray (int [] mảng) trả về một mảng mới lưu trữ các phần tử của mảng được đưa ra làm đối số.
        6. Viết một phương thức chính để kiểm tra các phương pháp trên.
     */
    public int min (int mang[])
    {
        int min = mang[0];
        for(int i=0; i < mang.length; i++)
        {
            if(mang[i] < min)
                min = mang[i];
        }
        return min;
    }
    
    public int find (int mang[], int value)
    {
        for(int i=0; i < mang.length; i++)
        {
            if(mang[i] == value)
                return i;
        }
        return -1;
    }
    
    public int sumArray (int mang[])
    {
        int tong = 0;
        for(int i=0; i < mang.length; i++)
        {
            tong += mang[i];
        }
        return tong;
    }
    
    public void printArray (int mang[])
    {   
        for(int i=0; i < mang.length; i++)
        {
            System.out.print("  " + mang[i]);
        }   
    }
    
    public int[] ReverseArray (int mang[])
    {
        int mangDaoNguoc[] = new int[mang.length];
        for(int i=mang.length - 1; i >=0; i--)
        {
            mangDaoNguoc[mang.length - 1 - i] = mang[i];
        }   
        return mangDaoNguoc;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int mang[] = {9,7,3,2,5,1,9,12,5,15};
        
        MangSoNguyen msn = new MangSoNguyen();
        System.out.print("Mang: "); msn.printArray(mang);
        System.out.println("\nMin = " + msn.min(mang));
        System.out.println("SumArray = " + msn.sumArray(mang));
        System.out.print("Mang dao nguoc: "); 
        msn.printArray(msn.ReverseArray(mang));
        
        System.out.print("\nNhap so can tim: ");
        Scanner input = new Scanner(System.in);
        int kq = msn.find(mang, input.nextInt());
        if(kq != -1)
            System.out.println("Tim thay tai " + kq);
        else System.out.println("Khong Tim Thay!");
    }
    
}
