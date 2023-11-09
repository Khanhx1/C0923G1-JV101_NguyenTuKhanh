package ss5_access_modifier_stastic_method.bai_tap;

public class Student {
    private String name;
    private String className;

    public Student() {
        this.name = "john";
        this.className = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}

