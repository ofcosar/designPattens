import java.util.ArrayList;
import java.util.Scanner;

public class IndentationDecorator extends ComponentDecorator
{
public IndentationDecorator(DecoratorInterface wrapee) {
    super(wrapee);
}

@Override
public String getInfo() {
    changeInfo();
    return super.getInfo();
}

//changeInfo method in IndentationDecorator is used to apply indentation to wrapped object
@Override
public void changeInfo() {
    String info = "";
    int indentLevel = 0;
    wrapee.getInfoWithoutChanges();
    Scanner scanner = new Scanner(wrapee.getInfoWithoutChanges());

    while (scanner.hasNextLine()){
        String line = scanner.nextLine();
        if (line.contains("DIRECTORY END")){
            indentLevel--;
            info += tabReturner(indentLevel) + line + "\n";
        }
        else if (line.contains("-")){
            info += tabReturner(indentLevel) + line + "\n";
            indentLevel++;
        }
        else
            info += tabReturner(indentLevel) + line + "\n";
    }
    wrapee.setInfo(info);
}
//tabReturner is basic method in order to get tab string with the needed size.
private String tabReturner(int depth){
    String tab = "";
    for (int i = 0; i < depth; i++)
        tab += "\t";
    return tab;
}
}
