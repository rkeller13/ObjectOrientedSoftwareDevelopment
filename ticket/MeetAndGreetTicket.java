package ticket;

public class MeetAndGreetTicket implements ITicket {
    private final ITicket ticket;

    public MeetAndGreetTicket(ITicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public int getPrice() {
        int p = ticket.getPrice();
        return p + 100;
    }

    @Override
    public String getSummary() {
        String s = ticket.getSummary();
        return s + " + Meet and Greet";
    }
}
