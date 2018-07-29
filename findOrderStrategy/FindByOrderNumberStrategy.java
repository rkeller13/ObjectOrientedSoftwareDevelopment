package findOrderStrategy;

import orders.Order;

class FindByOrderNumberStrategy implements IFindOrderStrategy {


    @Override
    public String getFindByAttribute(Order order) {
        String orderNumber = order.getOrderNumber();
        return orderNumber;
    }
}
