package observer;

public class ReaderReadBehaviourTypeB implements ReaderReadBehaviour{

    @Override
    public void read(ReadableInterface readable) {
        System.out.println("ReaderReadBehaviourTypeB reads" + readable.getText());
    }
}
