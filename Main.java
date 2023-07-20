import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Main {

    public static void main(String[] args) throws IOException {
        String a = new String();
        new String();
        String url2 = null;
        String b = new String("y");


        while (b.equals("y")) {
            System.out.println("Enter in the passage you are looking for: ");
            Scanner input = new Scanner(System.in);
            double usr = input.nextDouble();
            if (usr < 150) {
                System.out.println("You are looking for passages: " + usr);
                url2 = new String("https://www.lawofone.info/s/" + usr);
                System.out.println("Via this:" + url2);
                JSoupURL(url2);
            }

            if (usr > 150) {
                System.out.println("Please enter in a # less than 150");
                break;
            }

            // Creating a method.


            //This is the method for the URL
            //String content = Read_In_URL(url2);
            //System.out.println(content);
            //RegexFinder1 findthese = new RegexFinder1(content);
            //String url3 = new String() ;


            //findthese.FindMatches(content);
            System.out.print("Would you like to keep going? ");
            Scanner input1 = new Scanner(System.in);
            b = input1.nextLine();
        }

    }



public static void JSoupURL(String urlstring) throws IOException {
    //Document doc = Jsoup.connect("http://www.javatpoint.com").get();
    //String title = doc.title();
    //System.out.println("title is: " + title);

    Document doc2 = Jsoup.connect(urlstring).get();
    //doc2.select("p").forEach(System.out::println);

    Elements a = doc2.getElementsByClass("class");

    String text = doc2.body().text();

    System.out.println(text);
    //for(Element classElement : a ){


    //}
        //String title2 = doc2.title();
    //System.out.println("title2 is: " + title2);

}

    public static String Read_In_URL(String urlstring) throws IOException {
        URL url = new URL(urlstring);
        String content = new String();

        Scanner scan = new Scanner(url.openStream());
        while(scan.hasNext()){
            content += scan.nextLine();
        }

        scan.close();
        return content;
    }
}
