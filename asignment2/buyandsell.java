public class buyandsell {
    public static void main(String[] args) {
        
    int[] price ={7,1,5,3,6,4};
    int buy = price[0];
    int selli = 0;
    int buyi = 0;
    int ans=0;
    int sell=price[0];
    for(int i=1;i<price.length;i++)
    {
        if (price[i] >buy) {
            buy = price[i];
            buyi = i;
        }
        if (price[i] <sell &&  i!=0) {
            sell = price[i];
            selli = i;
        }

    } 
    if(buyi<selli)
    {
         ans = sell - buy;
    }
    System.out.println(ans);
    System.out.println(buyi);
    System.out.println(selli);
    
}
}
