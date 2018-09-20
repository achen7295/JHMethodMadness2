package jessehan;

public class JHanlib { // String method #1
    public static boolean isPalindrome(String str) {
        boolean palindrome = true;
        for (int i = 0; i < str.length(); i ++) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length()-(1+i),str.length()-i))) {
                palindrome = false;
            }
        }
        return palindrome;
    }
    public static String dateStr(String date) { // String method #2
       String reformattedDate;
       if (!date.substring(2,3).equals("/") || !date.substring(5,6).equals("/") || date.length() != 10) {
           reformattedDate = "The date was not put in correctly. It should be formatted as MM/DD/YYYY. Ex: March 3rd 2004 = 03/03/2004";
       }
       else {
           reformattedDate = date.substring(3,5) + " - " + date.substring(0,2) + " - " + date.substring(6,10);
       }
       return reformattedDate;
    }
    public static int sumUpTo(int num) { // Math #1
        int output = 0;
        for (int i = 0; i <= num; i ++) {
            output += i;
        }
        return output;
    }
    public static void multiplicationTable(int base, int range) { // Math #2
        for (int i = 0; i < range; i ++) {
            System.out.println(i * base);
        }
    }
    public static String cutOut(String str, String rep) { // String #3
        String x = "";
        if (str.indexOf(rep) >= 0) {
            x = str.substring(0,str.indexOf(rep)) + str.substring(str.indexOf(rep)+rep.length(),str.length());
        }
        return x;
    }
}

