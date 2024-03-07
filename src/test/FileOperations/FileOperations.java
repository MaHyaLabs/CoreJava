package test.FileOperations;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FileOperations {

    @Test(enabled = false)
    public void filecreate() throws IOException {
        File myObj = new File("output/filename.txt");
        myObj.createNewFile();
        System.out.println("file name is "+myObj.getName());
        System.out.println("user can execute it "+myObj.canExecute());
        System.out.println("does file exists "+myObj.exists());
        System.out.println("file path is " +myObj.getAbsolutePath());
        System.out.println("delete file " +myObj.delete());
        File root= new File("E:\\MaHyaLabs\\CoreJava");
        String arr[]=root.list();
       for (int i=0;i<arr.length;i++) {
           System.out.println(arr[i]);
       }
    }

    @Test
    public void ReadFileDifferentWays(F)
}
