package j32_Maps.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task11 {
    private String name;
    private String lastname;
    private String occupation;
    static int id =101;

    public Task11(String name, String lastname, String occupation) {
        this.name = name;
        this.lastname = lastname;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Task11.id = id++;
    }

    public static void main(String[] args) {
        Task11 person = new Task11("ali", "veli", "java");
        Task11 person2 = new Task11("veli", "yan", "java");
        Task11 person3 = new Task11("ahmet", "zekai", "C#");




    }


}
// Verilen mapde yazilim dili java olan kisi isimlarini bir listede return ediniz