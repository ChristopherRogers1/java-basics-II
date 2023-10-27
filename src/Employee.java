public class Employee extends Person{
   public int salary;

    public String speak()
    {
        return (getFirstName()+ " " + getLastName() + " salary: " + getSalary());
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public int getSalary()
    {
        return salary;
    }

}
