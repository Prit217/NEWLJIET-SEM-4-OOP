class Q12 {
    int id;
    String name;
    double monthly_salary;

    Q12()
    {
        id = 0;
        name = "";
        monthly_salary = 0.0;
    }

    void setId(int id)
    {
        this.id = id;
    }
    int getId()
    {
        return  id;
    }
    void setname(String name)
    {
        this.name = name;
    }
    String getname()
    {
       return name;
    }
    void setmonthly_salary(double monthly_salary)
    {
        this.monthly_salary = monthly_salary;
    }
    double getmonthly_salary()
    {
        return monthly_salary;
    }
    void employee()
    {
        System.out.println("Employee id is "+id);
        System.out.println("Employee name is "+name);
        System.out.println("Employee monthly salary is "+monthly_salary);
    }

    public static void main(String[] args) {
        Q12 ob = new Q12();
        ob.setId(1);
        ob.setname("Prince");
        ob.setmonthly_salary(35000.560);
        ob.employee();
    }
}