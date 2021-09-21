public class FormLetterWriter {
    static String fName = "Jason";
    static String lName = "Dinh";

    public static void displaySalutation(String name) {
        System.out.println("Dear Mr. or Ms. " + name);
        System.out.println("Thank you for your recent order.");
    }
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order.");
    }

    public static void main(String[] args) {
        displaySalutation(lName);
        displaySalutation(fName, lName);
    }
}
