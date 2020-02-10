/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/3 0003 下午 09:10
 */
public class Student {
    private int NO;
    private String name;
    private int grades;
    private int classes;
    private int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
