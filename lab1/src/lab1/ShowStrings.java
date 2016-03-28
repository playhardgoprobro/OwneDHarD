package lab1;
import java.util.ArrayList;
import java.util.Iterator;

public class ShowStrings {
    private static ArrayList<String> lines;
    private static String str;
    public static void getTweets(){
        ArrayList<Tweets> allTweets = new ArrayList<Tweets>();
        lines = ReadStrings.readStrings("C:\\tweets.txt",900,1500);
        for(int i=0;i<lines.size()-1;i++){
            if(lines.get(i+1).toString().contains("-")){
                continue;
            }
            else {
                String temp= lines.get(i).concat(lines.get(i+1));
                lines.set(i,temp);
                lines.remove(i+1);
            }
        }
        
    }
}
