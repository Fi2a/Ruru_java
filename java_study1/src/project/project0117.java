package project;

public class project0117 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      
      int reducion = 2;

      int sd = 20*365; //smoking days 담배핀날

      int cd; //cigarettes a day 하루에 핀 담배양
      
      cd = 10; // 변수 대입

      int rm = reducion*sd*cd; //reducion for minutes 

      int rh = rm/60; //reducion for hours

      int rd = rh/24; //reducion for days
      
      
      System.out.println("총 단축시간(분) : " + rm);
      
      System.out.println("총 단축시간(시간) : " + rh);
      
      System.out.println("총 단축시간(일) : " + rd);
            
      
   }

}