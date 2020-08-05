/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopjava14;

/**
 *
 * @author Lrandom
 */
public class BTTimChuoiTrongChuoi {

    public static void main(String[] args) {
       String s1 = "Viet Nam vo dich";
       String s2 = "vo dich";
       System.out.println(contains(s1, s2)); 
    }
    
    static boolean contains(String s1, String s2){
       //so sánh hai chuỗi nếu s1 < s2 => s1 ko nằm trong s2
       if(s2.length() > s1.length()){
          return false;
       }
       
       char firstCharOfS2 = s2.charAt(0);
       boolean isMatch = false;
       for (int i = 0; i < s1.length(); i++) {
           if(firstCharOfS2 == s1.charAt(i)){
               //nếu map phần tử đầu 
               //so sánh độ dài chuỗi 2 với phần còn lại của chuỗi 1 từ điểm map
               //Nếu ko bằng nhau thoát luôn
               if(s2.length()<=(s1.length()-i)){
                  isMatch = true;
                  for(int j = 0; j<s2.length();j++){
                        //System.out.println(s2.charAt(j));
                        //System.out.println(s1.charAt(i+j));
                        if(s2.charAt(j)!=s1.charAt(i+j)){
                            //nếu bất kì phần tử nào ko match, ngắt vòng lặp
                            isMatch = false;
                            break;
                        }
                  }
              
                  if(isMatch == true){
                    return isMatch;
                  }
               }else{
                  return false;
               }
           }
       }
   
       return isMatch;
    }
}
