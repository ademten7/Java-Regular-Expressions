package Quantifiers_Pattern_MatcherClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";

        //^abcDe{3} ==> startWith abcDeeee {3}==>eee
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));//YYYF12Ghhiiiijkl99z

        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));//YYYF12Ghhiiiijkl99z

        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));//YYYF12Ghhiiiijkl99z

        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY"));//YYYF12Ghhiiiijkl99z
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = ".*<h2>.*";//true ==> without .
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());



    }
}




























