import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/3 0003 下午 09:09
 */
public class SetDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet= new TreeSet<Student>(new MyComparator());

        Student s1=new Student("zhangsan",20);
        Student s2=new Student("lis",22);
        Student s3=new Student("zhangsan",22);
        Student s4=new Student("wangwu",24);


        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        for(Student s : treeSet){
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}

class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1,Student s2) {
        // 姓名长度
        int num = s1.getName().length() - s2.getName().length();
        // 姓名内容
        int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
        // 年龄
        int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
        return num3;
    }
}
