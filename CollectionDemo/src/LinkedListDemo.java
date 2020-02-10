import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/3 0003 下午 09:20
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> linkedList= new LinkedList<Student>();

        Student s1=new Student("zhangsan",20);
        Student s2=new Student("lis",22);
        Student s3=new Student("wangwu",24);
        Student s4=new Student("chenliu",26);
        Student s5=new Student("zhangsan",22);
        Student s6=new Student("qianqi",24);

        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        linkedList.add(s4);
        linkedList.add(s5);
        linkedList.add(s6);

        for(Student s : linkedList){
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
