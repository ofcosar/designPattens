package observer;


import java.util.ArrayList;

public class Paper implements ReadableInterface{
    private String text;

    public ArrayList<SubscriberInterface> getSubscribers() {
        return subscribers;
    }

    private ArrayList<SubscriberInterface> subscribers;
    public Paper(){
        text = "hello";
      subscribers  = new ArrayList<>();
    }
    public void setText(String text) {
        this.text = text;
        for(SubscriberInterface s : subscribers)
            s.update(this);
    }

    @Override
    public String getText() {
        return text;
    }
}
