
package bai1;

import java.util.Scanner;

public class SoLonThuHai {
    
    /**
     * Đề bài: Viết ct tìm số lớn thứ hai trong mảng
     */
    
    public static void main(String[] args) 
    {
        int mangSoNguyen[] = new int[50];
        int soPhanTu;
        
        Scanner input = new Scanner(System.in);
       
        //nhap gia tri
        do
        {
            System.out.print("Nhap so phan tu: ");
            soPhanTu = input.nextInt();
            if(soPhanTu <= 0) System.out.println("\tGia tri khong hop le.");
        }while(soPhanTu <= 0);
       
        nhapMang(mangSoNguyen, soPhanTu);
        xuatMang(mangSoNguyen, soPhanTu);
        
        //Xu ly tim max
        int max = mangSoNguyen[0];
        for(int i=1; i < soPhanTu; i++)
        {
            if(mangSoNguyen[i] > max)
                max = mangSoNguyen[i];
        }
        
        //Xy ly tim second max
        int max2 = mangSoNguyen[0], flag = 0;    //flag: biến kiểm tra xem mảng có tồn tại hơn 2 giá trị không
        for(int i=1; i < soPhanTu; i++)
        {
            if(mangSoNguyen[i] != max)
            {
                max2 = mangSoNguyen[i];
                flag = 1;
                break;
            }
        }
        
        if(flag == 0)
            System.out.println("\nKhong ton tai so lon thu hai");
        else
        {
            for(int i=0; i < soPhanTu; i++)
            {
                if(mangSoNguyen[i] > max2 && mangSoNguyen[i] != max)
                    max2 = mangSoNguyen[i];
            } 
            System.out.println("Gia tri lon thu hai trong mang: " + max2);
        }
        
       
    }
    
    public static void nhapMang(int mangSoNguyen[], int soPhanTu)
    {
        Scanner input = new Scanner(System.in);
        for(int i=0; i < soPhanTu; i++)
        {
            System.out.print("A[" + (i+1) + "] = ");
            mangSoNguyen[i] = input.nextInt();
        }
    }
    
    public static void xuatMang(int mangSoNguyen[], int soPhanTu)
    {
        System.out.println("\nNoi dung mang: ");
        for(int i=0; i < soPhanTu; i++)
        {
            System.out.println("  " + mangSoNguyen[i]);
        }
    }
}
