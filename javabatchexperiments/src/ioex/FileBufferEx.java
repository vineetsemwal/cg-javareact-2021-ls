package ioex;

import java.io.*;

public class FileBufferEx {
    public static void main(String[] args){
        FileBufferEx app=new FileBufferEx();
        app.start();
    }


    void start() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bin=null;
        BufferedOutputStream bout=null;
        try {
            File inputFile = new File("/home/vineet/work/fileapi/inputfile.txt");
            File outFile = new File("/home/vineet/work/fileapi/outfile.txt");

            inputStream = new FileInputStream(inputFile);
            bin=new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream(outFile);
            bout=new BufferedOutputStream(outputStream);
            int bytesCount=0;
            byte redBytes[]=new byte[100];
           int newBytesRed;
            while ((newBytesRed = bin.read(redBytes))>0 ) {
                bout.write(redBytes,0,newBytesRed);
                bytesCount=bytesCount+newBytesRed;
            }
            System.out.println("bytes written="+bytesCount);
            bout.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(outputStream);
            close(bout);
            close(inputStream);
            close(bin);
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
