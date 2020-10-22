package ex04.sample1;

import java.util.ArrayList;
import java.util.List;

public class AggregateBadCode {
    public void test(){

        Order order = new Order();
        List<OrderLine> newOrderLines = new ArrayList<>();

        final OrderLine lines = order.getOrderLine();

        //외부에서 애그리거트 내부 상태 변경!
        //order의 totalAmounts 값이 OrderLine과 일치하지 않게 됨
        lines.changeOrderLines(newOrderLines);
    }
}
