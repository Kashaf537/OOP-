import java.io.Serializable;
public class Student implements Serializable{
    private int id;
    private String name;
    private double cgpa;
    public Student(){
        this.id=0;
        this.name="";
        this.cgpa=0.0;
    }
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;

    }
    public double getcgpa(){
        return cgpa;
    }
    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }

    public String toString(){
        return "Student ID: "+id+", Name: "+name+", CGPA: "+cgpa;
    }
    
}