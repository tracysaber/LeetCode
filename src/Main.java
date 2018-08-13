import java.util.*;
class Card{
    int x;
    int y;
    public Card(int f,int t){
        this.x = f;
        this.y = t;
    }
}
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Card> cards = new ArrayList<Card>();
        for(int i=0;i<n;i++){
            cards.add(new Card(scan.nextInt(),scan.nextInt()));
        }
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.x-o2.x;
            }
        });
        boolean flag = false;

        Card old = cards.get(0);
        int sum=old.y,min =Integer.MAX_VALUE,x_sum=old.x;
        for(int i =1;i<n;i++){
            Card now = cards.get(i);
            x_sum+=now.x;
            if(!flag&&old.x==now.x){
                flag = true;
            }
            else{
                flag=false;
            }
            if(now.x%2!=0&&now.y<min) min=now.y;
            sum +=now.y;
            old = now;
        }
        System.out.println(x_sum%2==0?sum:sum-min);

    }
}