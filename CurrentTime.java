import java.time.LocalTime;
public class CurrentTime{
public static void main(String[] args){

    LocalTime now = LocalTime.now();
    int hour = now.getHour();
    System.out.println("hour");
    if(hour >= 5 && hour >= 12){
      System.out.println("Good Morning");
    }else if(hour >=12 && hour <= 17){
      System.out.println("Good Afternoon");
    }else{
      System.out.println("Good Evening");
    }
  }
}
