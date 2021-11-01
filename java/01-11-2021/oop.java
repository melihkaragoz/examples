import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class oop{
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("\n>> Would you like to enter student information?");
                String firstAnswer = sc.next();
                if(firstAnswer.toLowerCase().equals("no")) break;
                else if(firstAnswer.toLowerCase().equals("yes")){
                    System.out.println(">> What is the ID?");
                    int userId = sc.nextInt();
                    System.out.println(">> What is the first name?");
                    String userFirstName = sc.next();
                    System.out.println(">> What is the last name?");
                    String userLastName = sc.next();
                    System.out.println(">> Student created. Do you want to add another student?");
                    String lastAnswer  = sc.next();
                    Student studentOne = new Student(userId,userFirstName,userLastName);
                    students.add(studentOne);
                    if(!(lastAnswer.toLowerCase().equals("yes"))) break;
                }else System.out.println("Invalid answer.\n");
            }catch (Exception e) {
                System.out.println("An error occurred");
            }
        }
        System.out.println("Exiting..\n");
        for(Student st:students){
            System.out.println("Student "+ st.getOrder() + " : " + st.getID() + " - " + st.getFirstName() + " " + st.getLastName());
        }
        System.out.println("\nThe number of students is : "+ Student.getCount());
    }
}