
import java.util.ArrayList;
import java.util.Collections;


class Employee{
    String name;
    int salary;

     Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: "+ name+" ---> "+"Salary: "+salary;
    };

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
            list.add(new Employee("Shyam",12500));
             list.add(new Employee("Sundar",13400));
              list.add(new Employee("Allen",10000));
               list.add(new Employee("Don",25000));

               Collections.sort(list,(a,b)->b.salary-a.salary);
            System.out.println(list);

    }

    
}