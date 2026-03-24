
abstract class employee {

    double basic_pay;
    double HRA;
    double DA;

    abstract void calculate_salary();

    employee(double basic_pay, double HRA, double DA) {
        this.basic_pay = basic_pay;
        this.HRA = HRA;
        this.DA = DA;
    }

}

class manager extends employee {

    manager(double basic_pay, double HRA, double DA) {
        super(basic_pay, HRA, DA);
    }

    public void calculate_salary() {
        double salary = basic_pay + HRA + DA;
        System.out.println("Salary of manager is " + salary);
    }
}

class clerk extends employee {

    clerk(double basic_pay, double HRA, double DA) {
        super(basic_pay, HRA, DA);
    }

    public void calculate_salary() {
        double salary = basic_pay + HRA + DA;
        System.out.println("Salary of clerk is " + salary);
    }

}

public class employee_main {

    public static void main(String[] args) {
        manager m = new manager(50000, 10000, 5000);
        m.calculate_salary();
        clerk c = new clerk(20000, 5000, 2000);
        c.calculate_salary();
    }
}
