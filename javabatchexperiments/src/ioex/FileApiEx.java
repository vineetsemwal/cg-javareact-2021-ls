package ioex;

import java.io.File;

public class FileApiEx {

    public static void main(String[] args) {
        FileApiEx app = new FileApiEx();
        app.start();
    }

    void start() {
        File originalFile = new File("/home/vineet/work/fileapi");
        boolean isDir=originalFile.isDirectory();
        boolean exists=originalFile.exists();
        String name=originalFile.getName();
        String path=originalFile.getAbsolutePath();
        System.out.println("is dir="+isDir);
        System.out.println("exists="+exists);
        System.out.println("name="+name);
        System.out.println("path="+path);
        File files[]=originalFile.listFiles();
        for(File file : files){
            System.out.println("child file name found="+file.getName());
        }
    }

}
