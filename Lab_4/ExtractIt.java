import java.util.Scanner;
public class ExtractIt {
   public static void main(String[] args) { 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Insert String : ");
        String String = Sc.nextLine();
        String a = ExtractIt.extractIt(String);
       
        String url = ExtractIt.extractIt("phuket.psu./ac.th/*aaa.html");
        String url1 = ExtractIt.extractIt("phuket.psu./ac.th/*sss.html");
        String url2 = ExtractIt.extractIt("phuket.psu./ac.th/text.zip");
        System.out.println(a);
        System.out.println(url);
        System.out.println(url1);
        System.out.println(url2);
   }
   
   public static String extractIt(String url){
   String[] url_sp = url.split("/");
   int size = url_sp.length;
   String first = url_sp[size-1];
   if(first.startsWith("*"))
   {
     String ans = "_" + first.substring(1);
     return ans;
   }
   else
     return url_sp[size-1]; 
  }
}

