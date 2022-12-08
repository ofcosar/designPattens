import java.util.ArrayList;

public class SizeBasedMemoryRepresentationStrategy implements MemoryRepresentationStrategy{
@Override
public String representMemory(ArrayList<Component> componentList, DecoratorInterface decoratorInterface) {
    String info = "";
    for (Component c : componentList){
        if(c instanceof File)
            info += "(" + ((File) c).getFileSize() + ")";
        else
            info += ((DecoratorInterface) c).applyMemoryRepresentation();
    }
    return "[ " + info + " ]";
}
}
