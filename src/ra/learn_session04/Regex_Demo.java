package ra.learn_session04;

import java.util.regex.Pattern;

public class Regex_Demo {
    public static void main(String[] args) {
        //Chuỗi mẫu (regex) phone: [0][\\d]{9}
        String phoneRegex = "[0][\\d]{9}";
        //Chuỗi so khớp (input): 0355914029
        String phone = "0355914029";
        System.out.println("So khớp: "+ Pattern.matches(phoneRegex,phone));
        //x: chỉ định rõ ký tự
        System.out.println("x đại diện cho 1 ký tự: "+Pattern.matches("Java","cava"));
        System.out.println(". đại diện cho 1 ký tự bất kỳ: "+Pattern.matches("J..a","Java"));
        System.out.println("(ab|cd) hoặc ab hoặc cd: "+Pattern.matches("(Ja|PH)..","PHva"));
        System.out.println("[abc] hoặc ký tự a, b, c: "+Pattern.matches("J[abc]..","Jcva"));
        System.out.println("[^abc]: ký tự khác a và b và c: "+Pattern.matches("J[^abc]..","Jcva"));
        System.out.println("[a-z]: ký tự nằm trong khoảng a-z: "+Pattern.matches("[A-D]..","Faa"));
        System.out.println("[a-d[q-z]]: ký tự nằm trong khoảng từ a-d hoặc q-z: "+Pattern.matches("[a-d[q-z]]..","umm"));
        System.out.println("[a-e]&&[c-q]: nắm trong khoảng giao giữa 2 khoảng a-e và c-q:"+Pattern.matches("[a-e&&[c-q]]..","cnn"));
        System.out.println("p* là 0, 1 hoặc nhiều ký tự p: "+Pattern.matches("hello*","helloooooooo"));
        System.out.println("p{n}: gồm đúng n ký tự p: "+Pattern.matches("a{3}","aaaa"));
        System.out.println("p{n,}: có ít nhất n ký tự p: "+Pattern.matches("a{3,}","aaaa"));
        System.out.println("p{n,m}: có từ n-m ký tự p:"+Pattern.matches("a{3,6}","aaaa"));
    }
}