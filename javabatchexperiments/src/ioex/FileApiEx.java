package ioex;

import java.io.File;

public class FileApiEx {

    public static void main(String[] args) {
        FileApiEx app = new FileApiEx();
        app.start();
    }

    void start() {
        File dir = new File("/home/vineet/work/fileapi");
        boolean isDir=dir.isDirectory();
        boolean exists=dir.exists();
        String name=dir.getName();
        String path=dir.getAbsolutePath();
        System.out.println("is dir="+isDir);
        System.out.println("exists="+exists);
        System.out.println("name="+name);
        System.out.println("path="+path);
        File files[]=dir.listFiles();
        for(File file : files){
            System.out.println("child file name found="+file.getName());
        }
    }

}
