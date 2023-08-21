package exceptions;

public class CheckLicencePlate {
    public static void checkIfL (String licence) {
        for (Character i : licence.toCharArray()) {
            if (!Character.isLetter(i)) {
                throw new IllegalArgumentException();
            }
        }
    }
    public static void checkIfD (String licence) {
        for (Character i : licence.toCharArray()) {
            if (!Character.isDigit(i)) {
                throw new IllegalArgumentException();
            }
        }
    }


    public static void checkLicencePlate(String licence) {
      checkIfL(licence.substring(0,1));
      checkIfD(licence.substring(2,4));
      checkIfL(licence.substring(5,6));
    }
}
