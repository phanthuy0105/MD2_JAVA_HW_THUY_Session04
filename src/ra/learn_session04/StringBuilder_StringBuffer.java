package ra.learn_session04;

public class StringBuilder_StringBuffer {
    public static void main(String[] args) {
        StringBuilder ra = new StringBuilder("Rikkei Academy");
        StringBuilder raVn = new StringBuilder(" - Học viện đào tạo CNTT");
        System.out.println("Nối 2 chuỗi: "+ra.append(raVn));
        System.out.println("Chèn Học viện vào đầu chuỗi ra: "+ra.insert(0,"Học viện"));
        System.out.println("Xóa từ chỉ số 0 đến 6 trong ra: "+ra.delete(0,6));
        StringBuilder str = new StringBuilder("ABCD");
        System.out.println("Đảo ngược chuỗi: "+str.reverse());
        //Chuyển từ StringBuilder, StringBuffer sang String
        String rikkei = ra.toString();
    }
}