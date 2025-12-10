import java.util.Scanner;

public class QuestionServices {
    Question[] questions = new Question[5];
    


    public QuestionServices() {
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars");
        questions[2] = new Question(3, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
        questions[3] = new Question(4, "Who wrote 'Romeo and Juliet'?", "Mark Twain", "William Shakespeare", "Charles Dickens", "Jane Austen", "William Shakespeare");
        questions[4] = new Question(5, "What is the chemical symbol for water?", "O2", "H2O", "CO2", "NaCl", "H2O");
    }
    public void playQuize() {
        int score = 0;
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.print("Enter your answer: ");
            
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            
            if (userAnswer.equalsIgnoreCase(q.getAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is: " + q.getAnswer());
            }
            System.out.println();
        }

    }

    public void displayScore(int score) {
        System.out.println("Your total score is: " + score + " out of " + questions.length);
    }

}

