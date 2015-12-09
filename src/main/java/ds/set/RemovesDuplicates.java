package ds.set;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by skupunarapu on 12/9/2015.
 */
public class RemovesDuplicates {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("aa").setSalary(1000);

        Employee e11 = new Employee();
        e11.setName("aa").setSalary(1000);

        Employee e2 = new Employee();
        e2.setName("bb").setSalary(2000);

        Employee e3 = new Employee();
        e3.setName("cc").setSalary(3000);

        Employee e33 = new Employee();
        e33.setName("cc").setSalary(3000);

        Employee e4 = new Employee();
        e4.setName("dd").setSalary(4000);

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(e1);
        al.add(e11);
        al.add(e2);
        al.add(e3);
        al.add(e4);

        ArrayList<Employee> sl = removeDuplicates(al);

        for (Employee employee : sl) {
            System.out.println(employee.toString());
        }

    }

    private static ArrayList<Employee> removeDuplicates(ArrayList<Employee> al) {
        TreeSet<Employee> ts = new TreeSet<Employee>();
        ts.addAll(al);
        al.clear();
        al.addAll(ts);
        return al;
    }
}

class Employee implements Comparable<Employee>{

    String name;
    int salary;

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public Employee setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public int compareTo(Employee e) {
        if(e.salary > salary)
            return -1;
        else if(e.salary == salary)
            return 0;
        else return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        return !(name != null ? !name.equals(employee.name) : employee.name != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}