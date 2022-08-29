package observer;

public class Main2 {
    public static void main(String[] args) {
    Author author = new Author();
    ReaderReadBehaviour readBehaviour1 = new ReaderReadBehaviourTypeA();
    ReaderReadBehaviour readBehaviour2 = new ReaderReadBehaviourTypeB();
    Reader reader1 = new ReaderType1(readBehaviour1);
        Reader reader2 = new ReaderType1(readBehaviour2);
        author.getPaper().getSubscribers().add(reader1);
        author.getPaper().getSubscribers().add(reader2);
    author.write(" hey this observer design pattern but ı don't know who read me :) because ı am used with strategy pattern");
    }
}
