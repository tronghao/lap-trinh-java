package baitap_1_10_19;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        //tạo 1 Employee và 1 EmployeeService
            Employee em = new Employee();
            EmployeeService emSV = new EmployeeService();
        
        //nhap Employee thông qua EmployeeSerVice
            System.out.println("\nNhap 1 NV:");
            em = emSV.nhap1Employee();
            //xuat thong tin của Employee
                System.out.println("\nThong tin nhan vien vua nhap\n");
                em.output(em);
        
        //Nhập nhiều EmPloyee
            System.out.println("\nNhap nhieu nhan vien");
            emSV.nhapMangEmployee();
            
            
        //Tìm kiếm theo id trong mảng vừa nhập
            //Tạo EmPloyee chứa kết quả tìm kiếm
                Employee kq = new Employee();
            //nhập id cần tìm1
                Scanner inp = new Scanner(System.in);
                System.out.print("Nhap id can tim: ");
                int idCanTim = inp.nextInt();
            //gọi hàm tìm
                kq = emSV.findEmployee(emSV.getArrEmployee(), idCanTim);
            //in ra kết quả tìm kiếm
                if(kq == null)
                    System.out.println("\nKhong Tim Thay!");
                else
                {
                    System.out.println("\nDa Tim Thay");
                    kq.output(kq);
                }
                
                
        //sắp xếp mảng tăng dần
            //goi hàm sắp xếp
                emSV.sortEmployee(emSV.getArrEmployee());
            //in danh sach đã sắp xếp theo id
                emSV.xuatMangEmployee();
    }
    
}
