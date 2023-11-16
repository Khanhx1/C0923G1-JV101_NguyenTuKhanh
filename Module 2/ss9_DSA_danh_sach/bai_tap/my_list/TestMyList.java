package ss9_DSA_danh_sach.bai_tap.my_list;

public class TestMyList {
    public static class Student{
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

    public static void main(String[] args) {
        Student student1 = new Student(1,"khanh");
        Student student2 = new Student(2,"kha");
        Student student3 = new Student(3,"khan");
        Student student4 = new Student(4,"kh");
        Student student5 = new Student(99, "huy");

        MyList<Student> listOfStudent = new MyList<>();
        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        listOfStudent.add(student5, 2);
//        listOfStudent.clear();
        listOfStudent.getSize();


        for (int i = 0; i < listOfStudent.getSize(); i++) {
            Student student = (Student) listOfStudent.get(i);
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        System.out.println("---");
        System.out.println(listOfStudent.getSize());
        System.out.println(listOfStudent.get(3).getId());
        System.out.println("---size---");
        System.out.println(listOfStudent.getSize());
        System.out.println(listOfStudent.contains(student3));
    }
}
