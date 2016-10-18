public class Employee{

    String firstName;
    String lastName;
    double salary;

    public Employee(String firstName, String lastName,
                    double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary > 0.0){
            this.salary = salary;
        }else{
            this.salary = 0.0;
        }
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSalary(double salary){
        if(salary > 0.0){
            this.salary = salary;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public double getSalary(){
        return this.salary;
    }
}
