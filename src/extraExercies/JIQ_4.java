package extraExercies;



public class JIQ_4 {
    public static void main(String[] args) {
        String password = "Abc*1235B";
        System.out.println(isValid(password));

    }

    private static boolean isValid(String password) {
        String upperCase = "(.*[A-Z].*)";
        String lowerCase = "(.*[a-z].*)";
        String number = "(.*[0-9].*)";
        String specialCharacter = "(.*[-/ , :-@].*)";

        boolean hasUpper = password.matches(upperCase),
        hasLower = password.matches(lowerCase),
        hasNumber = password.matches(number),
        hasSpecialCharacter = password.matches(specialCharacter),
                isValid = false;
        if(password.length() >=6 && !password.contains(" "))
            if(hasNumber && hasLower && hasUpper && hasSpecialCharacter)
                isValid = true;

        return isValid;
    }
}
// Password validation:
// 1- at least 6 characters and !contain space
// 2- at least one uppercase
// 3- at least one lowercase
// 4- at least one special character
// 5- at least one digit

