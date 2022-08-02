package RegularExpressions_Introduction;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));//replace all characters with Y

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));//^===>change only startWith

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY")); //YYYF12GhhabcDeeeiiiijkl99z

        System.out.println(alphanumeric.matches("^hello"));//false
        System.out.println(alphanumeric.matches("^abcDeee"));//false all characters should be match
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));//reaplace a or e or i with Y //XbcDXXXF12GhhXXXXjkl99z
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));//abcDeeX12GhhiiiXkl99z
        //replace only a or e or i if these characters follow F or j




    }
}
