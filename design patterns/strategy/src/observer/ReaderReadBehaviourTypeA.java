package observer;

public class ReaderReadBehaviourTypeA implements ReaderReadBehaviour{
    @Override
    public void read(ReadableInterface readable) {
        System.out.println("ReaderReadBehaviourTypeA reads" + readable.getText());
    }
}
