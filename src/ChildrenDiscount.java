/**
 * Created by 22386 on 2017/6/16.
 */
public class ChildrenDiscount implements Discount{
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}
