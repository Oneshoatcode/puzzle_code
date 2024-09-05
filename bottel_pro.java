public class bottel_pro{
    public static void main(String[] args) {
        int drink_botel=15;//total number of bollet
        int total=15;
        int empty1;
        int empty;
        int exchange=4; //each four empty bottel to exchange a new refile bottel
        while(exchange<total){
        empty1=(total/exchange);
       //  System.out.println(empty1);
         drink_botel+=empty1;
        empty=total%4;
      //  System.out.println(empty);
        total=empty+empty1;
       }
        System.out.println("total drink bottel by you ="+drink_botel);//total drink bottel 
    }
} 
        
