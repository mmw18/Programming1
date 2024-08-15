/** Pseudocode
START
 - Declare variables for the person: First name, last name,
 - street address, city, and zip code
 - Assign  a value to each variable
 - Print each variable on a new line, with descriptive text before value
END
*/


public class personalInfoPrinter {
    public static void main(String[] args) {
        String firstName = "Megan";
        String lastName = "Left";
        String streetAddress = "321 Cupcake Lane";
        String city = "Yummyville";
        String zipCode = "12345";

        // Printing each piece of personal info on a new line
        System.out.println("First Name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("Street Address = " + streetAddress);
        System.out.println("City = " + city);
        System.out.println("Zip/Postal Code = " + zipCode);
    }
}