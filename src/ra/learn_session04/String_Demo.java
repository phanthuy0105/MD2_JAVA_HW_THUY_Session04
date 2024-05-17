package ra.learn_session04;

public class String_Demo {
    public static void main(String[] args) {
        //1. Khai báo chuỗi theo kiểu literal - primitive - immutable
        String ra = "Rikkei Academy";
        //2. Khai báo chuỗi theo kiểu đối tượng - reference - mutable
        String rs = new String("Rikkeisoft");
        //Các phuơng thức làm việc với chuỗi: equals hoặc ==
        String str1 = "RikkeiAcademy";
        String str2 = "RikkeiAcademy";
        //boolean str1.equals(str2): true: bằng nhau, false: khác nhau
        System.out.println("So sánh chuỗi str1 và str2: " + str1.equals(str2));
        System.out.println("So sánh chuỗi với ==: " + (str1 == str2));
        //equals: giá trị, ==: so sánh địa chỉ
        String str3 = new String("Rikkeisoft");
        String str4 = new String("Rikkeisoft");
        System.out.println("So sánh với equals với object: " + str3.equals(str4));
        System.out.println("So sánh object với ==: " + (str3 == str4));
        System.out.println("Độ dài chuỗi: " + str1.length());
        System.out.println("Ký tự ở chỉ số 2 trong str1: " + str1.charAt(2));
        System.out.println("Cộng 2 chuỗi: " + str1.concat(str3));
        System.out.println("Viết hoa các ký tự trong chuỗi: " + str1.toUpperCase());
        System.out.println("Viết thường các ký tự trong chuỗi: " + str1.toLowerCase());
        String str5 = "        Chào các bạn           ";
        System.out.println("Cắt khoảng trắng 2 đầu: " + str5.trim());
        String str6 = "rikkeiaCAdemy";
        System.out.println("So sánh không phân biệt hoa thường: " + str1.equalsIgnoreCase(str6));
        //ABC compare ACB --> -1
        System.out.println("So sánh bằng compare: " + "ADC".compareTo("ABB"));
        String str7 = "Rikkei";
        System.out.println("Kiểm tra chuỗi str7 có trong chuỗi str1: " + str1.contains(str7));
        System.out.println("Chỉ số của ký tự i trong chuỗi str7: " + str7.indexOf('i'));
        System.out.println("Chỉ số của ký tự i cuối cùng trong chuỗi str7: " + str7.lastIndexOf('i'));
        String str8 = "Rikkei Academy - Rikkeisoft";
        System.out.println("Thay thế chuỗi Academy bằng Học viện: " + str8.replace("Academy", "Học viện"));
        System.out.println("Thay thế tất cả các chuỗi Rikkei bằng:" + str8.replaceAll("Rikkei", "R"));
        System.out.println("Kiểm tra chuỗi bắt đầu của str8 có phải là Rikkei không: " + str8.startsWith("Rikkei"));
        System.out.println("Kiểm tra chuỗi kết thúc của str8 có phải là soft1 không: " + str8.endsWith("soft1"));
        String str9 = "Chúc các bạn có buổi tối vui vẻ";
        String[] arrStr = str9.split(" ");
        for (String element : arrStr) {
            System.out.println(element);
        }
        System.out.println("Cắt chuỗi str9 từ vị trí 0 đến vị trí 5: "+str9.substring(0,5)); //0-->4
        System.out.println("Cắt chuỗi str9 từ vị trí 6 đến hết: "+str9.substring(5));//5--> hết

    }
}