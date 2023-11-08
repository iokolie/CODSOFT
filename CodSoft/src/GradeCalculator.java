import java.util.Scanner;

public class GradeCalculator {
    public void getGrade(){
        Scanner sc = new Scanner(System.in);

        int math, english, science, score;
        double percent;
        String grade;

        System.out.println("CALCULATE YOUR GRADE!");
        System.out.println("ENTER YOUR SCORES");
        System.out.println("MATH: ");
        math = sc.nextInt();
        if (math>100 || math<0){
            System.out.println("INVALID SCORE!!");
            System.out.println("MATH: ");
            math = sc.nextInt();
        }

        System.out.println("ENGLISH: ");
        english = sc.nextInt();
        if (english>100 || english<0){
            System.out.println("INVALID SCORE!!");
            System.out.println("ENGLISH: ");
            english = sc.nextInt();
        }

        System.out.println("SCIENCE: ");
        science = sc.nextInt();
        if (science>100 || science<0){
            System.out.println("INVALID SCORE!!");
            System.out.println("SCIENCE: ");
            science = sc.nextInt();
        }

        score = math + english + science;

        percent = ((double) score /300)*100;
        System.out.println("Your Score is: " + score);
        System.out.println("Your Percentage is: " + percent);

        if (percent<=25){
            grade = "F";
            System.out.println("Your grade is " + grade);
        }else if (percent>25 && percent<35) {
            grade = "E";
            System.out.println("Your grade is " + grade);
        } else if (percent>35 && percent<50) {
            grade = "D";
            System.out.println("Your grade is " + grade);
        }else if (percent>50 && percent<65) {
            grade = "C";
            System.out.println("Your grade is " + grade);
        }else if (percent>65 && percent<80) {
            grade = "B";
            System.out.println("Your grade is " + grade);
        }else if (percent>80 && percent<=100) {
            grade = "A";
            System.out.println("Your grade is " + grade);
        }


    }

}
