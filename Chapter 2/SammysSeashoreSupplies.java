public class SammysSeashoreSupplies {

    public static void main(String[] args) {
        String companyMotto = "Sammy’s Seashore Supplies - We Rent Fun in the Sun!";

        
        System.out.println(companyMotto);

        int minutesRented = 125;          
        int hours = minutesRented / 60;
        int extraMinutes = minutesRented % 60;
        int rentalCost = (hours * 40) + extraMinutes;

        
        System.out.println("\nRental Details:");
        System.out.println("Number of hours: " + hours);
        System.out.println("Additional minutes: " + extraMinutes);
        System.out.println("Total rental cost: $" + rentalCost);
    }
}
