public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Cartoon Network");
        NewsChannel channel2 = new NewsChannel("Nickelodeon");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setHeadline("Next Show - SpongeBob SquarePants");
    }
}
