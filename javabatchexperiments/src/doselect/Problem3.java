package doselect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem3 {

    public static void main(String[]  args){
        Employee emp1=new Employee("raja",1000);
        Employee emp2=new Employee("arpit",3000);
        Employee emp3=new Employee("yash",2000);
        List<Employee>list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        EmployeeInfo info=new EmployeeInfo();
        List<Employee>sortedBySal=info.sort(list, EmployeeInfo.SortMethod.BYSALARY);
        sortedBySal.stream().forEach(emp->System.out.println(emp.getName()+"-"+emp.getSalary()));


        boolean startsWith=info.isCharacterPresent(list,"a");
        System.out.println(startsWith);
    }

}

class Employee {
    String name;
    int salary;

    public Employee(String name, int sal){
        this.name = name;
        this.salary=sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class EmployeeInfo {
    enum SortMethod {
        BYNAME, BYSALARY
    }

    public List<Employee> sort(List<Employee> emps, final SortMethod method) {
        if (method == SortMethod.BYNAME) {
            Comparator<Employee>comparator=(e1, e2) -> e1.getName().compareTo(e2.getName());
            List<Employee> result = emps.stream().sorted(comparator).collect(Collectors.toList());
            return result;
        } else {
            Comparator<Employee>comparator=(e1, e2) -> e1.getSalary() - e2.getSalary();
            List<Employee> result = emps.stream().sorted(comparator).collect(Collectors.toList());
            return result;

        }

    }

    public boolean isCharacterPresent(Collection<Employee> emps, String character) {
        Predicate<Employee> predicate=emp -> emp.getName().startsWith(character);
        long count = emps.stream().filter(predicate).count();
        return count > 0;
    }

}