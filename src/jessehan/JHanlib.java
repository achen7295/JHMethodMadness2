package jessehan;

public class JHanlib { // String method #1
    public static boolean isPalindrome(String str) {
        boolean palindrome = true;
        for (int i = 0; i < str.length(); i ++) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length()-(1+i),str.length()-i))) {
                palindrome = false;
                // If the string's first letter == the last letter, the second first letter == second last letter, etc.
            }
        }
        return palindrome;
    }
    //=================================================================================================================
    public static String dateStr(String date) { // String method #2
       String reformattedDate;
       if (!date.substring(2,3).equals("/") || !date.substring(5,6).equals("/") || date.length() != 10) {
           reformattedDate = "The date was not put in correctly. It should be formatted as MM/DD/YYYY.";
           // Checks if the date is not correctly put in as MM/DD/YYYY form.
       }
       else {
           reformattedDate = date.substring(3,5) + " - " + date.substring(0,2) + " - " + date.substring(6,10);
            //reformattedDate should become DD + " - " + MM + " - " + YYYY to form "DD - MM - YYYY"
       }
       return reformattedDate;
    }
    //=================================================================================================================
    public static int sumUpTo(int num) { // Math #1
        int output = 0;
        for (int i = 0; i <= num; i ++) {
            output += i;
        }
        return output;
    }
    //=================================================================================================================
    public static void multiplicationTable(int base, int range) { // Math #2
        for (int i = 0; i < range; i ++) {
            System.out.println(i * base);
        }
    }
    //=================================================================================================================
    public static String cutOut(String str, String rep) { // String #3
        String x = "";
        if (str.indexOf(rep) >= 0) {
            x = str.substring(0,str.indexOf(rep)) + str.substring(str.indexOf(rep)+rep.length(),str.length());
            /*
            If "rep" is found, this sets x to the characters of str before rep and then the characters of str after
            the first rep.
            */
        }
        return x;
    }
    //=================================================================================================================
    public static int leastCommonMultiple(int a, int b, int c) {
        int max = 0; int med = 0; int min = 0; int output = 0;
        if (a > b && a > c) {max = a; med = Math.max(b,c); min = Math.min(b,c);}
        if (b > a && b > c) {max = b; med = Math.max(a,c); min = Math.min(a,c);}
        if (c > a && c > b) {max = c; med = Math.max(a,b); min = Math.min(a,b);}
        if (a == b && b == c) {max = a; med = a; min = a;}
        boolean foundLCM = false;
        /*
        This "for" loop checks for every multiple of the maximum number, and if it is also a multiple of both the other
        numbers, then ends the loop when it finds it, returning that number.
         */
        for (int i = 1; !foundLCM; i ++) {
            if (((max * i) % med) == 0 && ((max * i) % min) == 0) {
                output = max * i;
                foundLCM = true;
            }
        }
        return output;
    }
}

