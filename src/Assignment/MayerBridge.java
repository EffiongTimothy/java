package Assignment;

import  java.util.Scanner;
public class MayerBridge {
    public Scanner input = new Scanner(System.in);
    public Scanner input2 = new Scanner(System.in);
    public String[] responseArray = new String[20];
    private String name;
    private int aCounter;
    private int bCounter;
    public String[] AQuestions = {
            "A.active, initiate",
            "A.organized, orderly",
            "A.candid, straight forward, frank",
            "A.logical, thinking, questioning",
            "A.facts, things, \"what is \"",
            "A.tough-minded, just",
            "A.firm, tend to criticize, hold the line",
            "A.preparation, plan ahead",
            "A: seek many tasks, public activities, interaction with others\n",
            "A: Standard, usual, conventional\n",
            "A: Firm, tend to criticize, hold the line\n",
            "A: Regulated, Structured\n",
            "A: External, Communicative, Express yourself\n",
            "A: Focus on here-and-now\n",
            "A: Tough-minded, just\n",
            "A:  Preparation, plan ahead\n",
            "A: Active, Initiate\n",
            "A: Facts, things, \"what is\"\n",
            "A:  Matter of fact, issue-oriented\n",
            "A: Control, Govern\n",

    };
    public String[] BQuestions = {
            "B.flexible, deliberate",
            "B.flexible, adaptable",
            "B.tactful, kind, encouraging",
            "B.empathetic, feeling, accommodating",
            "B.ideas, dreams,\" what could be\", philosophical",
            "B.tender-hearted, merciful",
            "B.gentle, tend to appreciate, conciliate",
            "B.go with the flow, adapt as you go",
            "B: Seek private, solitary activities with quietness to concentrate",
            "B: Different, novel, unique",
            "B: Gentle, tend to appreciate, conciliate",
            "B: Easygoing, \"live\" and \"let live",
            "B: Internal, reticent, keep to yourself",
            "B: Look to the future, global perspective, \"big picture",
            "B: Tender-hearted, merciful",
            "B:  Go with the flow, adapt as you go",
            "B: Reflective, Deliberate",
            "B: Ideas, dreams, \"what could be,\" philosophical",
            "B:  Sensitive, people-oriented",
            "B: Latitude, Freedom"
    };

    public void askName(){
        System.out.println("What is your name?");
        name = input.next();
    }
    public String getAQuestions(int questionNumber){
        return AQuestions[questionNumber - 1];
    }
    public String getBQuestions(int questionNumber){
        return BQuestions[questionNumber - 1];
    }
    public void addResponse(String response, int questionNumber){
        if(response.equalsIgnoreCase("A")){
            responseArray[questionNumber - 1] = AQuestions[questionNumber - 1];
        }
        if(response.equalsIgnoreCase("B")) {
            responseArray[questionNumber - 1] = BQuestions[questionNumber - 1];
        }
    }
    public void displayQuestion(int questionNumber){
        System.out.printf("%s%25s%n", getAQuestions(questionNumber), getBQuestions(questionNumber));
        String response = input2.nextLine();
        if(response.equalsIgnoreCase("A")){
            aCounter++;
        }
        if(response.equalsIgnoreCase("B")){
            bCounter++;
        }
        addResponse(response, questionNumber);
    }

    public void displaySummary() {
        System.out.printf("%n%nHello %s you selected%n", name);
        for (String question : responseArray) {
            System.out.println(question);
        }
        System.out.printf("Number of A selected: %d%n", aCounter);
        System.out.printf("Number of B selected: %d%n", bCounter);
    }
}
