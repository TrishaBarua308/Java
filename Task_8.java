package Java_assignment_2;
// ctrl + alt + shift + J

class Employee
{
    public String name, designation;
    public double salary;
    public double tax;

    public Employee()
    {
        salary = 30000;
        designation = "junior";
    }

    void newEmployee(String name)
    {
        this.name = name;
    }

    void calculateTax()
    {
        if (salary > 50000)
        {
            tax = salary * 0.3;
            System.out.println(name + " Tax amount = " + tax);
        }

        else if (salary <= 50000 && salary > 30000)
        {
            tax = salary * 0.1;
            System.out.println(name + " Tax amount = " + tax);
        }

        else
        {
            System.out.println("No need to pay tax");
        }
    }

    void promoteEmployee(String designation)
    {
        this.designation = designation;

        if (this.designation == "senior")
        {
            salary += 25000;
        }

        else if (this.designation == "lead")
        {
            salary += 50000;
        }

        else if (this.designation == "manager")
        {
            salary += 75000;
        }


        System.out.println(name + " has been promoted to " + this.designation);
        System.out.println("New salary = " + salary);

    }

    void displayInfo()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary = " + salary + " Tk");
        System.out.println("Employee Designation = " + designation);
    }

}

public class Task_8
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.newEmployee("Harry Potter");
        emp2.newEmployee("Hermione Granger");
        emp3.newEmployee("Ron Weasley");
        System.out.println("1 ==========");
        emp1.displayInfo();
        System.out.println("2 ==========");
        emp2.displayInfo();
        System.out.println("3 ==========");
        emp3.displayInfo();
        System.out.println("4 ==========");
        emp1.calculateTax();
        System.out.println("5 ==========");
        emp1.promoteEmployee("lead");
        System.out.println("6 ==========");
        emp1.calculateTax();
        System.out.println("7 ==========");
        emp1.displayInfo();
        System.out.println("8 ==========");
        emp3.promoteEmployee("manager");
        System.out.println("9 ==========");
        emp3.calculateTax();
        System.out.println("10 ==========");
        emp3.displayInfo();
    }
}
