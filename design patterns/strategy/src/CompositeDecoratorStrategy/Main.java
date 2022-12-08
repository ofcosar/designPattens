public class Main {
public static void main(String[] args) {
    //all related files and directories
    File video = new File("video", "mp4",200);
    File metallicaTheUnforgiven = new File("MetallicaTheUnforgiven", "mp3",100);
    File internshipReport = new File("internshipReport", "pdf",10);
    File setup = new File("setup", "exe",5);
    File toDoList = new File("ToDoList", "docx", 15);
    Directory myDocuments = new Directory("MyDocuments");
    Directory favoriteMusic = new Directory("FavoriteMusic");
    Directory bilkentStuff = new Directory("BilkentStuff");
    DecoratorInterface myPC = new Directory("MyPC");

    //part1

    //example1
    System.out.println("example1");
    System.out.println(video.getInfo());
    System.out.println("example1 ends.........");

    //example2
    System.out.println("example2");
    System.out.println(myDocuments.getInfo());
    System.out.println("example2 ends.........");

    //example3
    System.out.println("example3");
    favoriteMusic.addComponentToComponentList(metallicaTheUnforgiven);
    System.out.println(favoriteMusic.getInfo());
    System.out.println("example3 ends.........");

    //example4
    System.out.println("example4");
    bilkentStuff.addComponentToComponentList(internshipReport);
    bilkentStuff.addComponentToComponentList(setup);
    bilkentStuff.addComponentToComponentList(toDoList);
    bilkentStuff.addComponentToComponentList(favoriteMusic);
    System.out.println(bilkentStuff.getInfo());
    System.out.println("example4 ends.........");

    //example5
    System.out.println("example5");
    myPC.addComponentToComponentList(myDocuments);
    myPC.addComponentToComponentList(bilkentStuff);
    System.out.println(myPC.getInfo());
    System.out.println("example5 ends.........");


    //part2
    /*
    !!!!!!!!!!!!! very important !!!!!!!!!!!!!!!
    in part 2 ı used decorator design pattern so when you wrap an object with multiple decorator accidentally
    you get wrong output.
    if you want to print one of the example 6, example 7 or example 8 you should comment other 2 example
    in order to get correct output. For instance, in order to get correct output from example 8 ı commented
    example6 and example7

     */

    //example6
//    System.out.println("example6");
//    myPC = new IndentationDecorator(myPC);
//    System.out.println(myPC.getInfo());
//    System.out.println("example6 ends.........");

    //example7
//    System.out.println("example7");
//    myPC = new TypeIndicationDecorator(myPC);
//    System.out.println(myPC.getInfo());
//    System.out.println("example7 ends.........");

    //example8
    System.out.println("example8");
    myPC = new TypeIndicationDecorator(myPC);
    myPC = new IndentationDecorator(myPC);
    System.out.println(myPC.getInfo());
    System.out.println("example8 ends.........");

    //part3
    //example9
    System.out.println("example9");
    myPC.adjustMemoryRepresentation(new SizeBasedMemoryRepresentationStrategy());
    System.out.println(myPC.applyMemoryRepresentation());
    System.out.println("example9 ends.........");

    //example10
    System.out.println("example10");
    myPC.adjustMemoryRepresentation(new TypeBasedMemoryRepresentationStrategy());
    System.out.println(myPC.applyMemoryRepresentation());
    System.out.println("example10 ends.........");
}
}