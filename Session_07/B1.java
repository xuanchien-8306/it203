package Session_07;

public class B1 {
    private String id;
    private String name;

    static int totalStudent = 0;
     public B1(String id, String name) {
         this.id = id;
         this.name = name;
         totalStudent++;
     }

     public void display() {
         System.out.println("-----------------------");
         System.out.println("ID:" +id);
         System.out.println("Name:" +name);
     }

     public static void showTotalStudent() {
         System.out.println("-----------------------");
         System.out.println("Total Student:" +totalStudent);
     }

     public static void main(String[] args){
         B1 s1 = new B1("SV001", "Tạ Xuân Chiến");
         B1 s2 = new B1("SV002", "Đặng Văn Thắng");
         B1 s3 = new B1("SV003", "Phạm Đạt");

         s1.display();
         s2.display();
         s3.display();

         B1.showTotalStudent();
     }
}
