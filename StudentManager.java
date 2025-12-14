import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.IOException;
public class StudentManager{
    ArrayList<Student> students;
    public StudentManager(){
        students = new ArrayList<>();
    }
    public void addStudent(){
        students.add(new Student(1233,"kashaf",3.6));
        students.add(new Student(1234,"ali",3.8));
        students.add(new Student(1235,"sara",3.9));
    }

    public void SerailizeWrite(){
        try{
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("students.txt"));
            out.writeObject(students);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void SerializeRead(){
        try{
            ObjectInputStream in= new ObjectInputStream(new FileInputStream("students.txt"));
            students = (ArrayList<Student>) in.readObject();
            in.close();
            for(Student s:students){
                System.out.println(s);
            }

        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}