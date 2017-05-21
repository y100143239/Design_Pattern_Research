package pattern.design.prototype;

import java.util.List;

/**
 * Created by Alex on 2017/5/22.
 */
public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees)emps.clone();
        Employees empsNew1 = (Employees)emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + empsNew.getEmpList());
        System.out.println("empsNew1 List:" + empsNew1.getEmpList());


    }

}
