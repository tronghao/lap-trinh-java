
package employee;

import java.util.Scanner;

public class Employee {

    private int id;
    private String name;
    private float basicSal;
    private String email;
    private String phone;

    public Employee() {
    }

    public Employee(int id, String name, float basicSal, String email, String phone) {
        this.id = id;
        this.name = name;
        this.basicSal = basicSal;
        this.email = email;
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSal(float basicSal) {
        this.basicSal = basicSal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getBasicSal() {
        return basicSal;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    
    public void nhapTT()
    {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        while(!check)
        {
            try
            {
                System.out.print("\nNhap id: ");
                id = Integer.parseInt(input.nextLine());
                check = true;
            } catch(Exception e)
            {
                System.out.println("Loi nhap! Vui long nhap lai!");
            }
        }
        

        System.out.print("\nNhap ten: ");
        name = input.nextLine();
        
        check = false;
        while(!check)
        {
            try
            {
                
                System.out.print("\nNhap luong co ban: ");
                basicSal = Float.parseFloat(input.nextLine());
                check = true;
            } catch(Exception e)
            {
                System.out.println("Loi nhap! Vui long nhap lai!");
            }
        }
        
        System.out.print("\nNhap email: ");
        email = input.nextLine();
        
        System.out.print("\nNhap phone: ");
        phone = input.nextLine();
    }
    
    
    public float sumOfSal(int index)
    {
        return (basicSal * index);
    }
    
    public void xuatTT(Employee em)
    {
        System.out.println("'id' : " + em.id);
        System.out.println("'name' : " + em.name);
        System.out.println("'basic_Sal' : " + em.basicSal);
        System.out.println("'email' : " + em.email);
        System.out.println("'phone' : " + em.phone);
        
    }
}
