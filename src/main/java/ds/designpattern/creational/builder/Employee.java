package ds.designpattern.creational.builder;

/**
 * Created by skupunarapu on 12/22/2015.
 */
public class Employee {

    private int id;
    private String name;
    private String email;
    private int phNo;

    public Employee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phNo = builder.phNo;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", phNo=" + phNo + '}';

    }

    public static class Builder{
        private int id;
        private String name;
        private String email;
        private int phNo;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getPhNo() {
            return phNo;
        }

        public Builder setPhNo(int phNo) {
            this.phNo = phNo;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
