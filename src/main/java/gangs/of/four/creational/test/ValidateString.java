package gangs.of.four.creational.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ValidateString {

    public static void main(String[] args){
        String test1 = "(())";
        String test2 = "([()()]{()})";
        String test3 = "{[}()]";

        validate(test1);
        validate(test2);
        validate(test3);
    }

    public static void validate(String text){
        List<String> stack = new ArrayList<>();

        String[] splitText = text.split("");
        for (int i = 0; i < splitText.length; i++) {
            if(isopen(splitText[i])){
                stack.add(splitText[i]);
            }else{
                if(!closes(stack.get(stack.size()-1), splitText[i])){
                    System.out.println("El texto es invalido");
                    break;
                }
                stack.remove(stack.size()-1);
            }
        }

    }

    private static boolean closes(String s, String s1) {
        HashMap<String, String> pairs = new HashMap<>();
        pairs.put("(", ")");
        pairs.put("{", "}");
        pairs.put("[", "]");
        return pairs.get(s).equals(s1);
    }

    private static boolean isopen(String s) {
        return ("({[").contains(s);
    }


}
