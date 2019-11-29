package com.demo.design;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计模式之组合模式
 */
public class Employee {
    private String empName;
    private String dept;
    private int salary;
    private List<Employee> emplist;

    public Employee(String empName, String dept, int salary) {
        this.empName = empName;
        this.dept = dept;
        this.salary = salary;
        emplist = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        emplist.add(e);
    }

    public void remove(Employee e) {
        emplist.remove(e);
    }

    public List<Employee> getEmplist() {
        return emplist;
    }

    @Override
    public String toString() {
        return "{empName:" + empName + ",dept:" + dept + ",salary:" + salary + "}";
    }


    public static void main(String[] args) {


        Employee CEO = create2();

        System.out.println(CEO);
        printEmpList(CEO);

    }

    public static Employee create1() {
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "二级部门", 20000);
        Employee headMarketing = new Employee("Michel", "二级部门", 20000);

        Employee clerk1 = new Employee("Laura", "三级部门", 10000);
        Employee clerk2 = new Employee("Bob", "三级部门", 10000);

        Employee salesExecutive1 = new Employee("Richard", "三级部门", 10000);
        Employee salesExecutive2 = new Employee("Rob", "三级部门", 10000);

        Employee e1 = new Employee("123", "四级部门", 3000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(clerk1);
        headSales.add(clerk2);

        headMarketing.add(salesExecutive1);
        headMarketing.add(salesExecutive2);

        salesExecutive1.add(e1);
        return CEO;
    }

    public static Employee create2() {
        Employee e1 = new Employee("张三", "1", 10000);
        Employee e2 = new Employee("里斯", "2", 9000);
        Employee e3 = new Employee("王五", "3", 8500);
        Employee e4 = new Employee("小明", "4", 8000);
        e1.add(e2);e2.add(e3);e3.add(e4);
        return e1;
    }

    public static void printEmpList(Employee employee) {
        for (Employee e : employee.getEmplist()) {
            System.out.println(e.toString());
            if (e.getEmplist().size() > 0) {
                printEmpList(e);
            }
        }
    }

}
