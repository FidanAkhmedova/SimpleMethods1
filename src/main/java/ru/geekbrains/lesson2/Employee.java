package ru.geekbrains.lesson2;

public class Employee {

    public int age;
    public int salary;
    public String phoneNumber;
    public String fullName;
    public String position;
    public String email;


    public Employee(int age, int salary, String phoneNumber, String fullName, String position, String email){
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.position = position;
        this.email = email;


    }


    private int getAge() {
        return age;
    }
    private int getSalary(){
        return salary;
    }
    private String getPhoneNumber(){
        return phoneNumber;
    }
    private String getFullName(){
        return fullName;
    }
    private String getPosition(){
        return position;
    }
    private String getEmail(){
        return email;
    }

    public void employeeData(){
        System.out.println("Fullname: "+getFullName()+", position: "+getPosition()+", "+getAge()+" age, "+getSalary()+" - salary, phone number: "+getPhoneNumber()+", email: "+getEmail());
    }
    public static void main(String[] args) {
        Employee employee = new Employee(21, 10000, "0555555432", "Adam Lambert John", "artist", "adam.lambert@gmail.com");
        employee.employeeData();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(23, 2000, "0515515423", "Akhmedov Anar", "receptionist", "anar.akhmedov@gmail.com");
        employees[1] = new Employee(32, 1000, "0515515489", "Babayev Aziz", "artist", "aziz.babayev@gmail.com");
        employees[2] = new Employee(56, 5555, "0515515465", "Aliyev Marat", "dancer", "marat.aliyev@gmail.com");
        employees[3] = new Employee(63, 10000, "0515515733", "Khubaliyev Renat", "singer", "renat.khubaliyev@gmail.com");
        employees[4] = new Employee(33, 100000, "0515513923", "Akhmedova Anara", "programmer", "anara.akhmedova@gmail.com");

        for ( Employee el: employees
        ) {
            if (el.age > 40)
                el.employeeData();
        }


    }
}