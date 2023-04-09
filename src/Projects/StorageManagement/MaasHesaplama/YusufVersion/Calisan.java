package Projects.StorageManagement.MaasHesaplama.YusufVersion;

import java.util.Locale;

public class Calisan  {


    private  String name;
    private   int salary;
    private   int workHours;
    private   int year;



    public Calisan(String name, int salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;

    }

    /*private enum Title {
            ISCI,
            YONETICI,
        };
        private static Title title;

        public Calisan(String name, int salary, int workHours, int year, Title title) {
            this.Title = Title;
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.year = year;
        }



        public static Title getTitle() {
            return title;
        }

        public static void setTitle(Title title) {
            Calisan.title = title;
        }

        /*public Calisan(String name, int salary, int workHours, int year, Title title) {
            this.Title = Title;
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.year = year;
        }
        public Calisan(String name, int salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }


        */



    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = Math.abs(salary); // Mutlak deger ile alindi
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = Math.abs(workHours);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year;
    }
}
