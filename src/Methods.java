public class Methods {
    static int getSquare(int number) {
        return (int) Math.pow(number, 2);
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static String[] getCornerValuesArray(String[] array) {
        String[] cornerValuesArray = new String[2];
        int shortLine = array[0].length();
        int longLine = array[0].length();
        for (String element : array) {
            if (element.length() < shortLine) {
                cornerValuesArray[0] = element;
            }
            if (element.length() > longLine) {
                cornerValuesArray[1] = element;
            }
        }
        return cornerValuesArray;
    }
}
