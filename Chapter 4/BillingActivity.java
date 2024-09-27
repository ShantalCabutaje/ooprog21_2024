public class Billing {

    public double computeBill(double price) {
        return price * 1.08;
    }

    public double computeBill(double price, int quantity) {
        return computeBill(price) * quantity;
    }

    public double computeBill(double price, int quantity, int couponDiscount) {
        return computeBill(price, quantity) * (1 - (couponDiscount / 100));
    }

    public static void main(String[] args) {
        Billing billing = new Billing();

        double total1 = billing.computeBill(23.2);
        double total2 = billing.computeBill(24.4, 2);
        double total3 = billing.computeBill(35.4, 2, 10);

        System.out.println("The total price for the bill is: $" + total1);
        System.out.println("The total price for the bill is: $" + total2);
        System.out.println("The total price for the bill is: $" + total3);
    }
}
