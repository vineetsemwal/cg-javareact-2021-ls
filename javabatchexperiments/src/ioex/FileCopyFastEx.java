package ioex;

import java.io.*;

public class FileCopyFastEx {

    public static void main(String[] args){
        FileCopyFastEx app=new FileCopyFastEx();
        app.start();
    }

    void start() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File inputFile = new File("/home/vineet/work/fileapi/inputfile.txt");
            File outFile = new File("/home/vineet/work/fileapi/outfile.txt");

            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outFile);
            //int redByte;
            int bytesCount=0;
            byte redBytes[]=new byte[1000];
            int newBytesRed;
            while ((newBytesRed = inputStream.read(redBytes))>0 ) {
                outputStream.write(redBytes,0,newBytesRed);
                bytesCount=bytesCount+newBytesRed;
            }
            System.out.println("bytes written="+bytesCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(outputStream);
            close(inputStream);
        }
    }

    void close(InputStream inputStream) {
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void close(OutputStream outputStream) {
        try {
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
