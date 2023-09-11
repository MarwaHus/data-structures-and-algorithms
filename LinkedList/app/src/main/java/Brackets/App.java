package Brackets;

import static Brackets.BracketValidator.validateBrackets;

public class App {
    public static void main(String[] args) {
        String[] inputs = {"{}", "{}(){}", "()[[Extra Characters]]", "(){}[[]]", "{}{Code}[Fellows](())", "[({}]", "(]", "{(})"};

        for (String input : inputs) {
            System.out.println(input + ": " + validateBrackets(input));
        }
    }}