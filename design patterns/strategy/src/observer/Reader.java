package observer;

public class Reader implements SubscriberInterface{
    private ReaderReadBehaviour readBehaviour;
    public Reader(ReaderReadBehaviour readBehaviour){
        this.readBehaviour = readBehaviour;
    }
    @Override
    public void update(ReadableInterface readable) {
        readBehaviour.read(readable);
    }


}
