
package employee;

import java.util.Scanner;


public class EmployeeService {

    
    private Employee arr[];
    
    public Employee[] getArr() {
        return arr;
    }
    public Employee nhapNV()
    {
        Employee em = new Employee();
        em.nhapTT();
        return em;
    }
    
    public void nhapNhieuNV()
    {
        Scanner input = new Scanner(System.in);
        int soLuong = 0;
        boolean check = false;
        while(!check)
        {
            try
            {
                System.out.print("\nNhap so luong: ");
                soLuong = Integer.parseInt(input.nextLine());
                if(soLuong > 0)
                    check = true;
                else
                    System.out.println("Nhap so lon hon 0");
            }catch(Exception e)
            {
                System.out.println("Loi nhap lieu! Vui Long Nhap Lai!");
            }
        }
        
        arr = new Employee[soLuong];
        
        for(int i=0; i<soLuong; i++)
        {
            arr[i] = new Employee();
            System.out.println("\nNhap NV " + (i+1));
            arr[i].nhapTT();
        }
    }
    
    public Employee findEmployee(Employee arr[], int id)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].getId() == id)
            {
                return arr[i];
            }
        }
        return null;
    }
    
    public void sortEmployee()
    {
        for(int i=0; i<arr.length -1; i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i].getId() > arr[j].getId())
                {
                    Employee tam = new Employee();
                    tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }
    }
    
    public void xuatNhieu()
    {
        System.out.println("Thong tin mang");
        for(Employee em : arr)
            em.xuatTT(em);
        
    }
}
