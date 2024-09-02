public class CarlysCatering {

    public static void main(String[] args) {
        
        String companyMotto = "Carly’s Catering: Making Your Events Delicious and Memorable!";

       
        System.out.println(companyMotto);

        
        int numGuests = 60; 

        int pricePerGuest = 35;

        int totalPrice = numGuests * pricePerGuest;

        boolean isLargeEvent = numGuests >= 50;

        System.out.println("\nEvent Details:");
        System.out.println("Number of guests: " + numGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Large event: " + isLargeEvent);

}
}
