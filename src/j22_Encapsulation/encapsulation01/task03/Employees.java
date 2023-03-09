package j22_Encapsulation.encapsulation01.task03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employees {
    private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public int ageCalc(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Period.between(LocalDate.parse(dob) , LocalDate.now()).getYears();
    }

    public String ageCompare(){
        if(ageCalc()>18){
            return "Welcome to our company Fernando your salary is "+salary;
        }else if(ageCalc()<18){
            return "come back when you are 18 years old";
        }else return "we can have inter with you after that you can have a "+ salary+ " salary";
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
        return ageCompare();
    }
}

class Runner {
    public static void main(String[] args) {
        Employees person1 = new Employees("Yusuf" , 4000, "09-06-1997");
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
