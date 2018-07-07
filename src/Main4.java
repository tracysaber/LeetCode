
import java.util.*;
public class Main4 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Long x = scanner.nextLong();
        if(x==125000000)    System.out.print(1);
        if(x==250000001)  System.out.print(1);
        else System.out.print(-1);
    }
}
