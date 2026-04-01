//Files System.
import java.io.*;
import java.util.Scanner;
//public class Java18 {
//    public static void main(String[] args) {
//        File file = new File("New.txt");
//        try {
//            if(file.createNewFile()){
//                System.out.println("File created"+file.getName());
//                System.out.println("File created"+file.getAbsolutePath());
//                System.out.println("File created"+file.getAbsoluteFile());
//                System.out.println("File created"+file.getPath());
//            }else{
//                System.out.println("File already exists");
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}
// file creation. using append
//public class Java18 {
//    static void Writedata(String data){
//        try {
//            FileWriter Write=new FileWriter("New.txt",true);
//            Write.write(data);
//            Write.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//    //Reader.
//static void FileRead() {
//    try
//        (FileReader reader = new FileReader("New.txt")){
//            int ch;
//            while ((ch = reader.read()) != -1) {
//                System.out.print((char) ch);
//            }
//        }
//
//         catch(Exception e){
////        System.out.println("Error: " + e.getMessage());
//        }
//    }
//
//static void FileDelete() {
//        try {
//            File file = new File("New.txt");
//            if (file.delete()) {
//                System.out.println("File deleted successfully");
//            }else{
//                System.out.println("Failed to delete file");
//            }
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
//}
//    public static void main(String[] args) {
//        Writedata("Hello World");
//        Writedata("Hello this is new data!!");
//        FileRead();
//         FileDelete();
//    }
//}
//FULL MENU-DRIVEN NOTES APP.
public class Java18 {
    static void AddNotes(String data){
        try{
            FileWriter write =new FileWriter("New.Notes",true);
            write.write(data+"\n");
            write.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}