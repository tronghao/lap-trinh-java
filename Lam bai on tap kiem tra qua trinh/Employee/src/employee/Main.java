
package employee;


public class Main {
    public static void main(String[] args) {
        Employee em = new Employee();
        EmployeeService emS = new EmployeeService();
        emS.nhapNhieuNV();
        emS.sortEmployee();
        em = emS.findEmployee(emS.getArr(), 1);
        if(em == null)
            System.out.println("Khong tim thay");
        else System.out.println("Tim Thay");
        emS.xuatNhieu();
    }
}
