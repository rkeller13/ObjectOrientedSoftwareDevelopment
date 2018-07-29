package ticket;

public class BonusPackageTicket implements ITicket {
    private final ITicket ticket;

    public BonusPackageTicket(ITicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public int getPrice() {
        int p = ticket.getPrice();
        return p + 50;
    }

    @Override
    public String getSummary() {
        String s = ticket.getSummary();
        return s + " + Bonus Package";
    }

}
