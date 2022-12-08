import java.util.Scanner;

public class TypeIndicationDecorator extends ComponentDecorator{

public TypeIndicationDecorator(DecoratorInterface wrapee) {
    super(wrapee);


}
@Override
public String getInfo() {
    changeInfo();
return super.getInfo();

}

//changeInfo method in TypeIndicationDecorator is used to apply Type indication to wrapped object
@Override
public void changeInfo() {
    String info = "";
    Scanner scanner = new Scanner(wrapee.getInfoWithoutChanges());
    while (scanner.hasNextLine()){
        String line = scanner.nextLine();
        if (line.contains("DIRECTORY END"))
            line = "(!) " + line;
          else if (line.contains("-"))
              line = "(d) " + line;
          else
              line = "(f) " + line;
          info += line + "\n";

    }

    wrapee.setInfo(info);

}
}
