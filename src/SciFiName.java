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

        String sciFirstName1, sciFirstName2, sciLastName1, sciLastName2, sciCityBorn1, sciCityBorn2, sciSchool, sciRelative1, sciRelative2,sciRelative3, sciRelative4;

        sciFirstName1 = firstName.substring(0,2);
        sciFirstName2 = firstName.substring(3,4);
        sciLastName1 = lastName.substring(0,2);
        sciLastName2 = lastName.substring(0,2);
        sciCityBorn1 = city.substring(0,2);
        sciCityBorn2 = city.substring(3,4);

        sciSchool = school.substring(0,2);
        System.out.println(sciSchool);

        sciRelative1 = relativeName1.substring(0,2);
        System.out.println(sciRelative1);

        sciRelative2 = relativeName2.substring(0,2);
        System.out.println(sciRelative2);

        System.out.println("Welcome to Earth " + sciFirstName1 + sciFirstName2 + " " + sciLastName1 + sciLastName2 + " " + "From " + sciCityBorn1 + sciCityBorn2);

    }
}
