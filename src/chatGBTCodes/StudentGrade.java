package chatGBTCodes;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrade {

    public static class StudentScores {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<Student> students = new ArrayList<Student>();

            // Collect information for each student
            while (true) {
                // Collect the student's name
                System.out.print("Enter the student's name (or 'quit' to exit): ");
                String name = input.nextLine();
                if (name.equalsIgnoreCase("quit")) {
                    break;
                }

                // Create a new student object
                Student student = new Student(name);

                // Collect the student's scores
                while (true) {
                    System.out.print("Enter a subject name (or 'done' to finish): ");
                    String subject = input.nextLine();
                    if (subject.equalsIgnoreCase("done")) {
                        break;
                    }
                    System.out.print("Enter the score for " + subject + ": ");
                    int score = input.nextInt();
                    input.nextLine(); // consume the remaining newline character
                    student.addScore(subject, score);
                }

                // Add the student to the list
                students.add(student);
            }

            // Display the results for each student
            for (Student student : students) {
                System.out.println(student.getName() + ":");
                for (String subject : student.getSubjects()) {
                    System.out.println("  " + subject + ": " + student.getScore(subject));
                }
            }
        }
    }

    static class Student {
        private String name;
        private ArrayList<String> subjects;
        private ArrayList<Integer> scores;

        public Student(String name) {
            this.name = name;
            this.subjects = new ArrayList<String>();
            this.scores = new ArrayList<Integer>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<String> getSubjects() {
            return subjects;
        }

        public int getScore(String subject) {
            int index = subjects.indexOf(subject);
            if (index >= 0) {
                return scores.get(index);
            } else {
                return -1;
            }
        }

        public void addScore(String subject, int score) {
            subjects.add(subject);
            scores.add(score);
        }
    }

}
