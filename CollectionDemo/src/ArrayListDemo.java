import java.util.ArrayList;

/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/3 0003 下午 09:10
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList= new ArrayList<Student>();

        Student s1=new Student("zhangsan",20);
        Student s2=new Student("lis",22);
        Student s3=new Student("wangwu",24);
        Student s4=new Student("chenliu",26);
        Student s5=new Student("zhangsan",22);
        Student s6=new Student("qianqi",24);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);
        arrayList.add(s6);

        for(Student s : arrayList){
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
