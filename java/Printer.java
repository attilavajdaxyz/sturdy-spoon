import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {
    
    public static String printerError(String s) {
        // your code
      int errors = 0;
      int characters = s.length();
      
      for (int i = 0; i < characters; i++){
          String current = "" + s.charAt(i);
          Pattern pattern = Pattern.compile("[n-z]", Pattern.CASE_INSENSITIVE);
          Matcher matcher = pattern.matcher(current);
          boolean matchFound = matcher.find();
          if(matchFound) {
            errors += 1;
          }
      }
      
      return errors + "/" + characters;
    }
}