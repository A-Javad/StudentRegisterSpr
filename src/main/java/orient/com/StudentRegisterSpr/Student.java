package orient.com.StudentRegisterSpr;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "students")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    private String Surname;
    private int Class_Name;
    private int Avg;
    private String Birth_Date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getClass_Name() {
        return Class_Name;
    }

    public void setClass_Name(int class_Name) {
        Class_Name = class_Name;
    }

    public int getAvg() {
        return Avg;
    }

    public void setAvg(int avg) {
        Avg = avg;
    }

    public String getBirth_Date() {
        return Birth_Date;
    }

    public void setBirth_Date(String birth_Date) {
        Birth_Date = birth_Date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Class_Name=" + Class_Name +
                ", Avg=" + Avg +
                ", Birth_Date='" + Birth_Date + '\'' +
                '}';
    }
}
