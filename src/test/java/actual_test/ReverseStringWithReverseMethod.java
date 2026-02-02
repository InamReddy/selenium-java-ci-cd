package actual_test;

public class ReverseStringWithReverseMethod {
    public static void main(String[] args) {
        String inputString = "inam reddy";
        
        // Using StringBuilder's reverse method
        StringBuilder reversedString = new StringBuilder(inputString);
        System.out.println("Reversed string using reverse(): " + reversedString.reverse());
    }
}
