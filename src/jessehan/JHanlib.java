package jessehan;

public class JHanlib { // String method #1
    public static boolean isPalindrome(String str) {
        boolean palindrome = true;
        for (int i = 0; i < str.length(); i ++) {
            if (str.substring(i, i + 1).equals(str.substring(str.length()-(1+i),str.length()-i)) == false) {
                palindrome = false;
            }
        }
        return palindrome;
    }
    public static String dateStr(String date) { // String method #2
       String reformattedDate = "";
       if (date.substring(2,3).equals("/") == false || date.substring(5,6).equals("/") == false || date.length() > 10) {
           reformattedDate = "The date was not put in correctly. It should be formatted as MM/DD/YYYY. Ex: March 3rd 2004 = 03/03/2004";
       }
       else {
           reformattedDate = date.substring(3,5) + " - " + date.substring(0,2) + " - " + date.substring(6,10);
       }
       return reformattedDate;
    }
}

