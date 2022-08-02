package CharacterClasses_BoundryMatches;

public class Main {

    public static void main(String[] args) {
       //replace with H for H or h
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));//Harry

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        //except e and j replace all with X
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));//XXXXeeeXXXXXXXXXXjXXXXX
        //replace a,b,c,d,e,f,3,4,5,6,7 or 8 with X
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));//XXXDXXXF12Ghhiiiijkl99z
        //from a to f ==> - means range
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));//XXXXXXXX12Ghhiiiijkl99z
        //ignore case sensitive
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));//XXXXXXXX12Ghhiiiijkl99z
        //replace all numbers with X
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));//abcDeeeFXXGhhiiiijklXXz
        //replace all digits with X
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));//abcDeeeFXXGhhiiiijklXXz // d==>digit
        //replace all non digits with X
        System.out.println(newAlphanumeric.replaceAll("\\D", "X")); //XXXXXXXX12XXXXXXXXXX99X

        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);//I have blanks and	a tab, and also a newline
       //remove all spaces
        System.out.println(hasWhitespace.replaceAll("\\s", ""));//Ihaveblanksandatab,andalsoanewline
        //replace all tab with X
        System.out.println(hasWhitespace.replaceAll("\t", "X"));//I have blanks andXa tab, and also a newline
        //replace all non white space. remains only tab,spaces and new line
        System.out.println(hasWhitespace.replaceAll("\\S", ""));
        //replace all with chars X
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));//XXXXXXXXXXXXXXXXXXXXXXX
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));//X XXXX XXXXXX XXX	X XXX, XXX XXXX X XXXXXXX
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));//XIX XhaveX XblanksX XandX	XaX XtabX, XandX XalsoX XaX XnewlineX



    }
}









