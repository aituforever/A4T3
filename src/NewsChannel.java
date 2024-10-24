public class NewsChannel implements Observer {
    private String channelName;
    private String news;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String news) {
        this.news = news;
        displayNews();
    }

    public void displayNews() {
        System.out.println(channelName + " received news: " + news);
    }
}
