public class BloodData {
    private String bloodType;
    private char rhFactor;

    public BloodData() {
        this("A", '-');
    }

    public BloodData(String bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public void displayBloodInfo() {
        System.out.printf("Blood Type: %s, Rh Factor: %c%n", bloodType, rhFactor);
    }
}

public class TestBloodData {
    public static void main(String[] args) {
        BloodData patient1 = new BloodData("B", '+');
        BloodData patient2 = new BloodData("O", '-');

        patient1.displayBloodInfo();
        patient2.displayBloodInfo();
    }
}