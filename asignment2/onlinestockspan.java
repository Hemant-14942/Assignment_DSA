import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class StockSpanner {
    List<Integer> list;

    public StockSpanner() {
        this.list = new ArrayList<>();
    }

    public int next(int price) {
        list.add(price);
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > price)
                break;
            count++;
        }
        return count;
    }
}