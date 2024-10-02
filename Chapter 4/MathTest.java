public class MathTest {
    public static void main(String[] args) {
        double number1 = 6.082762530298219;
        double number2 = 22.5;
        double number3 = 71;
        double number4 = 68;

        // Calculate and print results
        System.out.println("SQRT: " + Math.sqrt(number1));
        System.out.println("POW: " + Math.pow(number1, 2));
        System.out.println("SIN: " + Math.sin(Math.PI / 4));
        System.out.println("COS: " + Math.cos(Math.PI / 4));
        System.out.println("FLOOR: " + Math.floor(number2));
        System.out.println("CEIL: " + Math.ceil(number2));
        System.out.println("ROUND: " + (int) Math.round(number2));
        System.out.println("MAX: " + Math.max(number3, number4));
        System.out.println("MIN: " + Math.min(number3, number4));
        System.out.println("RANDOM: " + Math.random() * 100);
    }
}
