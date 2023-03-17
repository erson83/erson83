public class StringManipulation {
    public static void main(String[] args) {
      String txt = "Hello World";
      System.out.println(txt.toUpperCase());
      System.out.println(txt.toLowerCase());

      // text length
      System.out.println("textlength: "+ txt.length());

      // index of string will start from 0 and count when it matches the text by each character including space comma etc
      System.out.println("String of index: " +txt.indexOf("World"));

      
      //String Concatenation

      String firstName = "John";
      String lastName = "Ong";
      String midName= "erson";
      System.out.println(firstName + " " + lastName);
      System.out.println(firstName.concat(lastName).concat(midName));

          // When adding integer to string, it becomes string
          String x = "10";
          int y = 20;
          String z = x + y;  // z will be 1020 (a String)
          System.out.println(z);

            // use backslash for quotes
            String txtBackslash = "We are the \"Vikings\" from the north";
            System.out.println(txtBackslash);

            // use backslash for single quotes
            String txtBackslashSingle = "We are the \'Vikings\' from the north";
            System.out.println(txtBackslashSingle);

            // use backslash for backslash quotes
            String txtBackslash2= "We are the \\Vikings\\ from the north";
            System.out.println(txtBackslash2);
    }
  }
  