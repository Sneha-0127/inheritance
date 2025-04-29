package inheritance;

public class Employee {

    String name;
    int id;
    double salary;
    String address;

    public Employee(String name, int id, double salary,String address){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.address=address;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("ID "+id);
        System.out.println("Salary : "+salary);
        System.out.println("address : "+address);

    }

    public static void main(String[] args){
        Employee e = new Employee("Shubh",043,1200000.00,"banglore");
        e.display();

    }
}
