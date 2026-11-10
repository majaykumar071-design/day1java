
import java.util.Scanner;

class Employee{
    private String name;
    private  int empid;
    private int salary;
     void getter(){
        System.out.println(name);
        System.out.println(empid);
        System.out.println(salary);

     }
     void setter(String a,int b, int c){
        name=a;
        empid=b;
        salary=c;

     }
}


public class UserEmployee {
    public static void main(String[] args) {
        Scanner us=new Scanner(System.in);
        Employee s=new Employee();
        System.out.println("Enter Name");
        String x=us.nextLine();
        System.out.println("Enter id");
        int y=us.nextInt();
        System.out.println("Enter Salary");
        int z=us.nextInt();
        s.setter(x, y, z);
        s.getter();

    }
}
