import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) {
    // code goes here  
    List<String> first = new ArrayList<>();
    Set<String> second = new HashSet<>();
    String res = "";
    for(int i=0; i<strArr[0].length(); i++){
      String str = "";
      if(strArr[0].indexOf(',', i) < 0){
        str = strArr[0].substring(i, strArr[0].length());
        i = strArr[0].length();
      }else{
        str = strArr[0].substring(i, strArr[0].indexOf(',', i));
        i = i + str.length() + 1;
      }
      
        first.add(str);
    }

  for(int i=0; i<strArr[1].length(); i++){
      String str = "";
      if(strArr[1].indexOf(',', i) < 0){
        str = strArr[1].substring(i, strArr[1].length());
        i = strArr[1].length();
      }else{
        str = strArr[1].substring(i, strArr[1].indexOf(',', i));
        i = i + str.length() + 1;
      }
      
        second.add(str);
    }

  int index=0;
    for(String str: first){
      if(second.contains(str)){
        if(index ==0){
          res = res.concat(str);
          index++;
        }else{
          res = res.concat(",".concat(str));
        }
      }
    }
    if(res.equals("")) return "false";

    return res;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}