
package myutils;

import java.util.stream.IntStream;


public class MyUtils {
    
    public static float ucgenCevre(float a,float b,float c){
        float cevre=a+b+c;
        return cevre;
        
    }
    
   public static float ucgenAlan(float a,float b,float c){
       float u=(a+b+c)/2;
       float alan=(float) Math.sqrt(u*(u-a)*(u-b)*(u-c));
       return alan;
   }
   
   
   public static float cokgenCevre(float nKenar,float nUzunluk){
       float cevre=nKenar*nUzunluk;
       return cevre;
    
   }
   
   
   public static float cokgenAlan(float nKenar,float kUzunluk){
       
       float alan= (float) ((nKenar*kUzunluk*kUzunluk)/4*Math.tan(Math.PI/nKenar));
       return alan;
   }
   
   
   
    public static void main(String[] args) {
        
       
        System.out.println("ucgen alani:"+" "+ucgenAlan(5, 6, 7));
        System.out.println("ucgen cevresi:"+" "+ucgenCevre(5, 6, 7));
        System.out.println("cokgenCevre:"+" "+cokgenCevre(8, 6));
        System.out.println("cokgenAlanı"+" "+ cokgenAlan(8,6));
       
        
    }
    
}
