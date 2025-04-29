public class Employee {

    String name;
    int id;
    double salary;
    String address;
    int age;

    public Employee(String name, int id, double salary,String address,int age){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.address=address;
        this.age=age;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("ID "+id);
        System.out.println("Salary : "+salary);
        System.out.println("address : "+address);
        System.out.println("Age : "+age);

    }

    public static void main(String[] args){
        Employee e = new Employee("Shubh",043,1200000.00,"banglore",20);
        e.display();

    }
}
