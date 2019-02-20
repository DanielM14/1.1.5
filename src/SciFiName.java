public class SciFiName
{
    private String firstName, lastName, city, school, relativeName1, RelativeName2;
    private double r;

    public static void main(String args[]) {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        Math.random();
        double r = Math.random();

        int diceRoll = (int)(Math.random() * 11) + 2;

        int diceRoll2 = (int)(Math.random() * 6) + 1;
        diceRoll += (int)(Math.random() * 6) + 1;

        System.out.println("Your random number is " + Math.random() + ".");
    }
}
