import java.util.ArrayList;

public class Directory implements Component, DecoratorInterface {
public String getDirectoryName() {
    return directoryName;
}

public void setInfo(String info) {
    this.info = info;
}

@Override
public String getInfoWithoutChanges() {
    return getInfo();
}

public ArrayList<Component> getComponentList() {
    return componentList;
}

private String directoryName;
private String info;

public int getDepth() {
    return depth;
}

public void setDepth(int depth) {
    this.depth = depth;
}

private int depth = 0;

private MemoryRepresentationStrategy memoryRepresentationStrategy;

private ArrayList<Component> componentList = new ArrayList<>();

public Directory(String directoryName) {
    this.directoryName = directoryName;
}
public void addComponentToComponentList(Component component) {
    componentList.add(component);
}

/*the depth attribute is used to apply TypeBasedMemoryRepresentationStrategy. Since, while depth number of the
directories increases during the TypeBasedMemoryRepresentationStrategy behaviour. It is needed to clear depth after
operation.For instance if you want run TypeBasedMemoryRepresentationStrategy more than one time in the class
you should before clear the depth of the directory.
*/
@Override
public void clearDepth() {
    depth = 0;
    for(int i = 0; i < getComponentList().size(); i++){
        if(getComponentList().get(i) instanceof DecoratorInterface)
            ((DecoratorInterface) getComponentList().get(i)).clearDepth();
    }
}

public String getInfo(){
    if(info == null)
        changeInfo();
    return info;
}

//changeInfo method in Directory is used to apply basic order to directory info
@Override
public void changeInfo() {
    this.info = "";
    for (Component c : componentList){
        info += "\n" + c.getInfo();
    }
   info = "- " + directoryName + info + "\n- DIRECTORY END" + " | " + directoryName;
}

public String applyMemoryRepresentation() {
    return memoryRepresentationStrategy.representMemory( componentList, this);
}
public void adjustMemoryRepresentation(MemoryRepresentationStrategy memoryRepresentationStrategy) {
    this.memoryRepresentationStrategy = memoryRepresentationStrategy;
    for(Component c : componentList){
        if(c instanceof DecoratorInterface){
            ((DecoratorInterface) c).adjustMemoryRepresentation(memoryRepresentationStrategy);
        }
    }
}

}
