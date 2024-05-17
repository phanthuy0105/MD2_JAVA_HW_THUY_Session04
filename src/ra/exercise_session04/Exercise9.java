package ra.exercise_session04;

import java.util.regex.Pattern;

public class Exercise9 {
    public static void main(String[] args) {
        //Chuỗi mẫu (regex) phone: [0][\\d]{9}
        String phoneRegex = "[0][\\d]{9}";
        //Chuỗi so khớp (input): 0355914029
        String phone = "0355914029";
        System.out.println("So khớp: "+ Pattern.matches(phoneRegex,phone));

        String mailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        String emailAddress = "username@gmail.com";
        System.out.println("So khớp: " + Pattern.matches(mailRegex, emailAddress));

        String passwordRegex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        String password = "Pooh2411@";
        System.out.println("So khớp: " + Pattern.matches(passwordRegex, password));
    }
}
