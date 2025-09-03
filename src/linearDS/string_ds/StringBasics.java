package linearDS.string_ds;

public class StringBasics {
    public static void main(String[] args) {
        //Declare string variable
        String str1 = "Hello";
        String str2 = "World";
        //Concatenate Strings
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        String str3 = str1.concat(" " + str2);
        System.out.println("str3 = " + str3);
        //Length of String
        System.out.println("Length of str3 = " + str3.length());

        //String Access
        System.out.println("Char in str1 at index 0=" + str1.charAt(0));
        System.out.println("Char in str1 at index 4=" + str1.charAt(4));

        //String Substring
        String str4 = "Programming";
        System.out.println("Substring from index 3=" + str4.substring(3));
        System.out.println("Substring from index 3 to 6=" + str4.substring(3,7));

        //String Compare
        String str5 = "Java";
        String str6 = "java";
        String str7= "java";
        System.out.println("str5.equals(str6)=" + str5.equals(str6));
        System.out.println("str6.equals(str7)=" + str6.equals(str7));
        System.out.println("str5.equalsIgnoreCase(str6)=" + str5.equalsIgnoreCase(str6));

        //String Search
        String str8 = "TechTalkies";
        System.out.println("Contain Talks substring? =" + str8.contains("Talks"));
        System.out.println("First index= " + str4.indexOf("m"));
        System.out.println("Last Index=" + str4.lastIndexOf("m"));

        //String Replace
        System.out.println("str5.replace(\"a\",\"o\")="+ str5.replace("a","o"));
        System.out.println("Replace java to Lava=" + str6.replace("java", "Lava"));

        //String Conversion
        String upStr = "HELLO WORLD";
        String downStr = "hello world";
        System.out.println("UpStr to lower case conversion = " + upStr.toLowerCase());
        System.out.println("DownStr to upper case conversion = " + downStr.toUpperCase());

        //String Trim
        String str9 = "    Trim Word     ";
        System.out.println("Before Trim= "+str9);
        System.out.println("After trim = "+str9.trim());

        //String Split
        String str10 = "a,b,c,d,e,f";
        System.out.println("Length of str10 = " + str10.length());
        String[] arr = str10.split(",");
        for (String s : arr){
            System.out.println(s);
        }
    }
}
