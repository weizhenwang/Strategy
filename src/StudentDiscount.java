/**
 * Created by 22386 on 2017/6/16.
 */
public class StudentDiscount implements  Discount{
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}
