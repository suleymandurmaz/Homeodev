public class Employee {
    private String name;
    private String surname;
    private int yası;
    private int salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYası() {
        return yası;
    }

    public void setYası(int yası) {
        this.yası = yası;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void calıs() {
        System.out.println("personel calısıyor");

    }

    public void showIfos() {
        System.out.println(getName() + "\t\n" + getSurname() + "\t\n" + getSalary() + "\t\n" + getYası());
    }
}
