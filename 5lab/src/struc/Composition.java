package struc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Composition {
    public static void main(String[] args) {
        Employee librarian1 = new Librarian("Elena Ivanova", 854.52);
        Employee librarian2 = new Librarian("Maxim Moledin", 4523.1);

        Employee librarianManager = new LibrarianManager("Irina Osipova",41325.1);
        librarianManager.addSubordinate(librarian1);
        librarianManager.addSubordinate(librarian2);

        Employee librarian3 = new Librarian("Olga Uarova", 854.2);
        Employee chiefLibrarian = new LibrarianManager("Denis Osipov", 50000.1);
        chiefLibrarian.addSubordinate(librarian3);
        chiefLibrarian.addSubordinate(librarianManager);
        chiefLibrarian.print();
    }
}

interface Employee {
    void addSubordinate(Employee employee);
    void removeSubordinate(Employee employee);
    Employee getSubordinate(int i);
    String getName();
    double getSalary();
    void print();
}

class LibrarianManager implements Employee{
    private String name;
    private double salary;

    public LibrarianManager(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    List<Employee> employees = new ArrayList<Employee>();
    public void addSubordinate(Employee employee) {
        employees.add(employee);
    }

    public Employee getSubordinate(int i) {
        return employees.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void removeSubordinate(Employee employee) {
        employees.remove(employee);
    }

    public void print() {
        System.out.println("LIBRARIAN MANAGER: NAME: " + name + " - SALARY: " + salary);

        if (employees.size() > 0) {
            System.out.println("Subordinates: ");
            Iterator<Employee> employeeIterator = employees.iterator();
            while(employeeIterator.hasNext()){
                employeeIterator.next().print();
            }
        }
    }
}

class Librarian implements Employee {
    private String name;
    private double salary;

    public Librarian(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    List<Employee> employees = new ArrayList<Employee>();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void removeSubordinate(Employee employee) {
    }

    public void addSubordinate(Employee employee) {
    }

    public Employee getSubordinate(int i) {
        return null;
    }

    public void print() {
        System.out.println("Librarian: NAME: " + name + " - SALARY: " + salary);
    }
}