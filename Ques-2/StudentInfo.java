import java.util.*;

class Student{
   private int id;
   private String fName;
   private double cgpa;
   public Student(int id, String fName, double cgpa) {
      super();
      this.id = id;
      this.fName = fName;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fName;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class StudentInfo
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCase = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCase > 0){
         int id = in.nextInt();
         String fName = in.next();
         double cgpa = in.nextDouble();
         
         Student stu_L = new Student(id, fName, cgpa);
         studentList.add(stu_L);
         
         testCase--;
      }
      Collections.sort(studentList, new Comparator<Student>() {
         public int compare(Student s1, Student s2) {
            if(s2.getCgpa() > s1.getCgpa()){
               return 1;
            }
            else if(s2.getCgpa() < s1.getCgpa()){
               return -1;
            }
            return s1.getFname().compareTo(s2.getFname());
         }
      });
      
      for(Student stu_L: studentList){
         System.out.println(stu_L.getFname());
      }
   }
}