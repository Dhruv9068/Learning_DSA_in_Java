package first_ideaprogram.src.OOPS;
import first_ideaprogram.src.OOPS.Abstraction.*;

public class Test {
    public static void main(String[] args) {
        // create object for Employee
        EmployeeUnprotectedClass em = new EmployeeUnprotectedClass();  // em is object of Employee
        System.out.println("Unprotected Salary: " +em.salary);   // salary need an object of Employee em for acess it in another class
        System.out.println("Ststaic Unprotected class empid: "+ EmployeeUnprotectedClass.empID); // because empID is static so we no need object to access it we can direct access it

        // using private encapsulated class using getter and settter
        EmployeePrivateClass employ = new EmployeePrivateClass();
        System.out.println("EMP_ID Private: " + employ.getEmpid());
        System.out.println("Salary Private:  " + employ.getSalary());

        employ.setEmpid(55);
        employ.setSalary(55000);
        System.out.println("EMP_ID after change using setter Private: " + employ.getEmpid());
        System.out.println("Salary after change using setter Private:  " + employ.getSalary());




    }
}
class EmployeeUnprotectedClass{
    static int empID = 2;
    int salary= 20000;
    int incentive = 200;
    void countSalary(){
        System.out.println(salary+incentive);
    }
}
class EmployeePrivateClass{
    private int empId = 2;
    private int Salary= 20000;
    private int Incentive = 200;
    private void countSalary(){
        System.out.println(Salary+Incentive);
    }
    // getter & setter
    int getEmpid(){
        return empId;
    }
    int getSalary(){
        return Salary;
    }
    void setSalary(int s){
        this.Salary=s;
    }
    void setEmpid(int eId){
        this.empId=eId;
    }
}

