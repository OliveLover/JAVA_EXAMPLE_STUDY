package Example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    public static void main(String[] args) {

        String[] users_email = new String[5];
        users_email[0] = "aabb@naver.com";
        users_email[1] = "toto@gmail.com";
        users_email[2] = "kingkong@daum.net";
        users_email[3] = "##denis@naver.com";
        users_email[4] = "1956burgerJMT.com";

        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]*)@{1}(naver.com|gmail.com|daum.net)$");
        for (String user_email : users_email) {
            Matcher matcher = pattern.matcher(user_email);
            if(matcher.matches()) {
                String iD = matcher.group(1);
                String domain = matcher.group(2);
                System.out.println("email : " + matcher.group(0));
                System.out.println("ID : " + iD);
                System.out.println("Domain : " + domain);
                System.out.println();
            } else {
                System.out.println("It is not in email format.");
                System.out.println();
            }
        }
    }
}