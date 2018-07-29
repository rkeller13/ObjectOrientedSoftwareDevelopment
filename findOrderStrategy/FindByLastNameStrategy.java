package findOrderStrategy;

import orders.Order;

class FindByLastNameStrategy implements IFindOrderStrategy {



    @Override
    public String getFindByAttribute(Order order) {
         String lastName = order.getLastName();
         return lastName;
    }
}
