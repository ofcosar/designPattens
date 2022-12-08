import java.util.ArrayList;

public interface DecoratorInterface extends Component{
void setInfo(String info);
String getInfoWithoutChanges();
void  adjustMemoryRepresentation(MemoryRepresentationStrategy  sizeBasedMemoryRepresentationStrategy);
String applyMemoryRepresentation();
String getDirectoryName();
ArrayList<Component> getComponentList();
void setDepth(int depth);
int getDepth();
void changeInfo();
void addComponentToComponentList(Component component);
void clearDepth();
}
