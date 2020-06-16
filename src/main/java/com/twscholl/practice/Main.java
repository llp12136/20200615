package com.twscholl.practice;

public class Main {
    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
        com.twschool.practice.CalculationNumber calculationNumber = new com.twschool.practice.CalculationNumber();
        calculationNumber.setAnswerNumber();
        calculationNumber.printAnswerNumber();
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new com.twschool.practice.GuessInputCommand().input();
            System.out.println(input);
            int[] inputArray = calculationNumber.getInputNumberArray(input);
            if(inputArray.length != 4){
                System.out.println("");
                i--;
                continue;
            }
            String prompt = calculationNumber.getPromptByCalculation(inputArray);
            if(prompt.equals("4A4B")){
                System.out.println("Victory");
                break;
            }
            System.out.println(prompt);
        }
        System.out.println("Game Over");
    }
}
