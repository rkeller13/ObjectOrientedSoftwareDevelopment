package findOrderStrategy;


import orders.Order;

class FindByRewardsNumberStrategy implements IFindOrderStrategy {


    @Override
    public String getFindByAttribute(Order order) {
        String rewardsMemberNumber = order.getRewardsMemberNumber();
        return rewardsMemberNumber;
    }

}
