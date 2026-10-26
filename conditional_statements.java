public class conditional_statements {
    public static void main(String[] args) {
        int age = 23;
        if (age >= 18) {
            System.out.println("you are an adult");
        } else if (age < 0) {
            System.out.println("you are not born yet");
        } else {
            System.out.println("you are not an adult yet");
        }
    }
}
