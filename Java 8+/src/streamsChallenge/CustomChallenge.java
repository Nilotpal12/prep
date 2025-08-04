package streamsChallenge;

public class CustomChallenge {

    public static char firstRepeatedCharacter(String s){
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> s.indexOf(c) != s.lastIndexOf(c))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No repeated character found"));
    }


    public static void main(String[] args) {


        String s = "abca";

        char result = firstRepeatedCharacter(s);
        System.out.println("First repeated character in '" + s + "' is: " + result);


    }
}
