import java.util.Scanner;
public class codsoft_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of subjects: ");
        int subjects = scanner.nextInt();
        int marks = 0;
        for(int i=1;i<=subjects;i++){
            System.out.print("Enter the marks obtained in particular subject " + i + ": ");
            int total_marks = scanner.nextInt();
            marks += total_marks;
        }
        double average_percentage = (double) marks / subjects;
        char grade;
        if(average_percentage >= 90)  grade='A';
        else if(average_percentage >= 80)  grade='B';
        else if(average_percentage >= 70)  grade='C';
        else if(average_percentage >= 60)  grade='D';
        else if(average_percentage >= 50)  grade='E';
        else grade='F';
        System.out.println("The total marks is: "+marks);
        System.out.println("The average percentage is: "+average_percentage);
        System.out.println("The grade is: "+grade);
        scanner.close();
    }
}
