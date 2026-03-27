class Employee { 
    String id, name; 
 
    Employee(String id, String name) { 
        this.id = id; 
        this.name = name; 
    } 
 
    void display() { 
        System.out.println("ID: " + id + ", Name: " + name); 
    } 
} 
 
class SalariedEmployee extends Employee { 
    String designation; 
    double salary; 
 
    SalariedEmployee(String id, String name, String desig, double sal) { 
        super(id, name); // Sends ID and Name to the parent constructor
        this.designation = desig; 
        this.salary = sal; 
    } 
 
    void displayAll() { 
        display(); // Calls the parent display method
        System.out.println("Designation: " + designation + ", Salary: " + salary); 
    } 
 
    public static void main(String[] args) { 
        // Creating a simple object to test
        SalariedEmployee emp1 = new SalariedEmployee("101", "John", "Manager", 55000); 
        
        System.out.println("--- Employee Details ---");
        emp1.displayAll(); 
    } 
}