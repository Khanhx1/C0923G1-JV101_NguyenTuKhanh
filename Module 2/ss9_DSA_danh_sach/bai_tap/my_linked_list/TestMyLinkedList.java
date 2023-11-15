package ss9_DSA_danh_sach.bai_tap.my_linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> linkedListOfStudents = new MyLinkedList<>();
        Student student1 = new Student(1, "khanh");
        Student student2 = new Student(2, "kha");
        Student student3 = new Student(3, "huyen");
        Student student4 = new Student(4, "khoa");
        Student student5 = new Student(99, "huy");

        linkedListOfStudents.addFirst(student1);
        linkedListOfStudents.addFirst(student2);
        linkedListOfStudents.addLast(student3);
        linkedListOfStudents.addIndex(2, student5);
//        linkedListOfStudents.remove(2);

        for (int i = 0; i < linkedListOfStudents.size(); i++) {
            Student student = (Student) linkedListOfStudents.get(i);
            System.out.println(student.getName());
        }
        System.out.println("-----");
        MyLinkedList<Student> cloneLinkedList = linkedListOfStudents.clone();
        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }
        System.out.println("-----");
        System.out.println(linkedListOfStudents.constrains(student4));
        System.out.println("-----");
        System.out.println(linkedListOfStudents.indexOf(student5));
    }
}
