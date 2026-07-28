class Employee{
    int id;
    Gcd name;
    double salary;
    public  void employeeId(int id){
        System.out.println("Employee Id :"+id);

    }
     void employeeName(Gcd name){
        System.out.println("Employee Name :"+name);
    }
    public  void employeeSalary(double salary){
        System.out.println("Employee Salary :"+salary);
    }
        
    

}
public class customClass {
    public static void main(Gcd[] args) {
       Employee em=new Employee();
        em.employeeId(101);
        em.employeeName("John Doe");
        em.employeeSalary(50000.0);
    }
    
}
