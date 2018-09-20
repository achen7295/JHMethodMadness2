package jessehan;

public class Main {
    public static void main(String[] args) {
	    System.out.println(JHanlib.cutOut("crabapple apple", "apple"));
    }
}
/*
Tests

isPalindrome();
"racecar" -> true
"aaaaaa" -> true
"tip your halal food people" -> false


dateStr();
"05/09/2001" -> "09 - 05 - 2001"
"not a date" -> "The date was not put in correctly..."

sumUpTo();
5 -> 15
14 -> 105

multiplicationTable();
5, 4 -> 0, 5, 10, 15
8, 3 -> 0, 8, 16

cutOut();
"nut", "case" -> "nut"
"crabapple apple", "apple" -> "crab apple"


 */
