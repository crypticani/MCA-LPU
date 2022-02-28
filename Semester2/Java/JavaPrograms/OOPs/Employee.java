package OOPs;

//Java program for Encapsulation with both read and write
public class Employee {
    // private variables which can be accessed by public methods of the class
    private String EmpName;
    private int EmpID;
    private int EmpSal;

    // get method to access the private integer variable EmpSal
    public int getEmpSal() {
        return EmpSal;
    }

    // get method to access the private string variable EmpName
    public String getEmpName() {
        return EmpName;
    }

    // get method to access the private integer variable EmpID
    public int getEmpID() {
        return EmpID;
    }

    // set method to access the private integer variable EmpSal
    public void setEmpSal(int EmpSal) {
        this.EmpSal = EmpSal;
    }

    // set method to access the private string variable EmpName
    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    // set method to access the private integer variable EmpID
    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }
}
