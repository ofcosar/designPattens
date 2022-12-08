import java.util.ArrayList;

public class ComponentDecorator implements DecoratorInterface {
DecoratorInterface wrapee;


public ComponentDecorator(DecoratorInterface wrapee) {
    this.wrapee = wrapee;
   }


@Override
public String getInfo() {
    return wrapee.getInfo();
}

@Override
public void changeInfo() {
    wrapee.changeInfo();
}

@Override
public void addComponentToComponentList(Component component) {
    wrapee.addComponentToComponentList(component);
}

@Override
public void clearDepth() {
    wrapee.clearDepth();
}

@Override
public void setInfo(String info) {
    wrapee.setInfo(info);
}

@Override
public String getInfoWithoutChanges() {
    return wrapee.getInfoWithoutChanges();
}

@Override
public void adjustMemoryRepresentation(MemoryRepresentationStrategy memoryRepresentationStrategy ) {
    wrapee.adjustMemoryRepresentation(memoryRepresentationStrategy);
}

@Override
public String applyMemoryRepresentation() {
return wrapee.applyMemoryRepresentation();
}

@Override
public String getDirectoryName() {
    return null;
}

@Override
public ArrayList<Component> getComponentList() {
    return wrapee.getComponentList();
}

@Override
public void setDepth(int depth) {
    wrapee.setDepth(depth);
}

@Override
public int getDepth() {
    return wrapee.getDepth();
}
}
