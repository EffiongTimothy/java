package tdd;

import Assignment.MayerBridge;

class MayerBridgeTest {
    public static void main(String[] args) {
        MayerBridge questionnaire = new MayerBridge();
        questionnaire.askName();
        for(int i = 1; i <= 20; i ++){
            questionnaire.displayQuestion(i);
        }
        questionnaire.displaySummary();
    }
}