package Session_07;

    public class Student{
        private int id;
        private String name;

        static int studentCount = 0;
        static final String SCHOOL_NAME = "ABC University";
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
            studentCount++;
        }

        public void displayInfo(){
            System.out.println("----------------------------");
            System.out.println("ID: "+id);
            System.out.println("Name: "+name);
            System.out.println("School Name: "+SCHOOL_NAME);
            System.out.println("----------------------------");
        }

        static void showTotalStudent(){
            System.out.println("Số lượng sinh viên: "+studentCount);
        }
    }
