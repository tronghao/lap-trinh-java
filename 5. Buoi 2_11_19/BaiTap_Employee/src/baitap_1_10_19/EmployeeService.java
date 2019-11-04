package baitap_1_10_19;

import java.util.Scanner;

public class EmployeeService {

    /**
    1. Khai báo biến toàn cục là 1 array chứa các đối tượng Employee.
    2. Viết phương thức nhập 1 Nhân viên từ bàn phím.
    Phương thức trả về nhân viên vừa nhập.
    3. Viết phương thức nhập và một mảng chứa đối tượng nhân viên.
    4. Viết phương thức tìm kiếm nhân viên tham số là một mảng chứa nhân viên,
    tham số thứ hai là một giá trị integer.
    Phương thức trả về đối tượng nhân viên đầu tiên có trong mảng
    mà có id = tham số 2.
    5. Viết phương thức sắp xếp mảng.
    phương thức này nhận tham số là một mảng chứa các nhân viên.
    Phương thức sẽ sắp xếp các nhân viên trong mảng này theo id tăng dần.
     */
    

    private Employee arrEmployee[];
    
    public Employee[] getArrEmployee() {
        return arrEmployee;
    }
    
    public Employee nhap1Employee()
    {
        Employee nv = new Employee();
        nv.input();
        return nv;
    }
    
    public void nhapMangEmployee()
    {
        Scanner inp = new Scanner(System.in);
        
        int soLuong;
        System.out.print("\nNhap so Luong NV: ");
        soLuong = inp.nextInt();
        
        //khai báo theo số lượng và nhập
        arrEmployee = new Employee[soLuong];
        for(int i=0; i<soLuong; i++)
        {
            System.out.print("\nNhap nhan vien thu " + (i+1));
            arrEmployee[i] = new Employee();
            arrEmployee[i].input();
        }
    }
    
    public void xuatMangEmployee()
    {
        System.out.println("\nDanh sach NV:\n");
        for(int i=0; i<arrEmployee.length; i++)
        {
            System.out.println("--------------------------------");
            arrEmployee[i].output(arrEmployee[i]);
        }
    }
    
    public Employee findEmployee(Employee arrEm[], int id)
    {
        for(int i=0; i<arrEm.length; i++)
        {
            if(arrEm[i].getId() == id)
                return arrEm[i];
        }
        return null;
    }
    
    public void sortEmployee(Employee arrEm[])
    {
        for(int i=0; i<arrEm.length -1; i++)
        {
            for(int j=0; j<arrEm.length; j++)
            {
                if(arrEm[i].getId() > arrEm[j].getId())
                {
                    Employee tam = new Employee();
                    tam = arrEm[i];
                    arrEm[i] = arrEm[j];
                    arrEm[j] = tam;
                }
            }
        }
    }
}
