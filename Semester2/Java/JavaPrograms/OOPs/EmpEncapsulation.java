package OOPs;

public class EmpEncapsulation {
    public static void main(String[] args) {
        Employee EmpObj = new Employee(); // object of the class Employee
        // passing the values to the methods using object
        EmpObj.setEmpName("Aniket");
        EmpObj.setEmpSal(43000);
        EmpObj.setEmpID(12108348);
        // Printing values of the variables
        System.out.println("Employee's Name: " + EmpObj.getEmpName());
        System.out.println("Employee's ID: " + EmpObj.getEmpID());
        System.out.println("Employee's Salary: " + EmpObj.getEmpSal());
    }
}