package Day02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {
    // fields
    private String name;
    private int salary;
    private String dob;

    public Employee(String name, int salary, String dob) { // full parameter constructor
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    // ToDo: Girilen yas simdiden cikarilir...
    public int ageCalc(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YY");
        return Period.between(LocalDate.parse(dob) , LocalDate.now() ).getYears();
    }
    //TODO: 18 yas sarti icin if-else kullanilir...
    public String ageCompare(){
        if(ageCalc()>18){
            return "Welcome to our company " + name+  "your salary is " + salary;
        }else if(ageCalc()<18){
            return "come back when you are 18 years old";
        }else return "we can have inter with you after that you can have a" + salary + " salary";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


    @Override
    public String toString() {
        return  "Name is " + name +"\ndob is " + dob+"\nSalary is "+ salary ;
    }
}
class EmployeeRunner{
    public static void main(String[] args) {
        Employee person1 = new Employee("Yusuf", 4000, "09-06-1997");
        System.out.println(person1);

    }
}
/*
Task->
        Runner ve  Employees, class cerate ediniz
        Employees(Çalışanlar) class'ında;
        encapsulated variable'ları oluşturunuz;
        String name,
        int salary,
        String dob (date of birth) (Doğum tarihi)
        Runner class'ın içinde;
        obj ile
        Name is Fernando
        dob is 11/23/2000
        Salary is 80000
        Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
        Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
        Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.
        trick: ageCalculator isminde bir method için  Şuanki tarih - doğum yılı = employee age
 */