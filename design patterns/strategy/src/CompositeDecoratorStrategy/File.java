public class File implements Component{
private String fileName;
private String extension;
private int fileSize;

public int getFileSize() {
    return fileSize;
}

public File(String fileName, String extension, int fileSize) {
    this.fileName = fileName;
    this.extension = extension;
    this.fileSize = fileSize;
}
public String getInfo(){
    return fileName + "." + extension + " | File Size: " + fileSize + " kb";
}

}
