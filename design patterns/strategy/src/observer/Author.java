package observer;

public class Author {
    public Paper getPaper() {
        return paper;
    }

    private Paper paper;
    public Author(){
        paper = new Paper();
    }
    public void write(String text){
        paper.setText(text);
    }
}
