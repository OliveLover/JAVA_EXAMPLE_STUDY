package Example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RRNExample {
    public static void main(String[] args) {
        String[] users_RRN  = new String[5];
        users_RRN[0] = "930607-1154787";
        users_RRN[1] = "951112-2246782";
        users_RRN[2] = "201514-2561234";
        users_RRN[3] = "745984-3487115";
        users_RRN[4] = "18489121687-156";

        Pattern pattern = Pattern.compile("^(([0-9]{2})([0-9]){2}([0-9]){2})-{1}([0-9]{7})$");

        for(String rrn : users_RRN) {
            Matcher matcher = pattern.matcher(rrn);
            if(matcher.find()) {
                String userRRN = matcher.group(0);
                String userRRN_behind = matcher.group(5);
                String userRRN_blind = matcher.group(1) + "-" + userRRN_behind.replaceAll("[0-9]","*");
                String userYears = matcher.group(2);
                String userMonth = matcher.group(3);
                String userDay = matcher.group(4);

                System.out.println("전체 주민번호 : " + userRRN);
                System.out.println("주민번호 뒷자리 블라인드 : " + userRRN_blind);
                System.out.println("생년 : " + userYears);
                System.out.println("월 : " + userMonth);
                System.out.println("일 : " + userDay);
                System.out.println();
            } else {
                System.out.println("Invalid RRN : " + rrn);
            }
        }
    }
}
