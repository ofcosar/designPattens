import java.util.ArrayList;

public class TypeBasedMemoryRepresentationStrategy implements MemoryRepresentationStrategy{
@Override
public String representMemory(ArrayList<Component> componentList, DecoratorInterface decoratorInterface) {
    String info = "";
    for (Component c : componentList){
        if(c instanceof File)
            info += "(F)";
        else{
            ((DecoratorInterface) c).setDepth(decoratorInterface.getDepth() + 1);
            info += ((DecoratorInterface) c).applyMemoryRepresentation();
        }

    }
    return "[D" + decoratorInterface.getDepth() +  info + " EOD" + decoratorInterface.getDepth() + "]";
}
}
