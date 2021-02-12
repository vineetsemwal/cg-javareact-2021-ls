package ioex;

import java.io.*;

public class FileCopyEx {
    public static void main(String[] args) {
        FileCopyEx app = new FileCopyEx();
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
            int redByte = -1;
            int bytesCount=0;
            while ((redByte = inputStream.read()) !=-1) {
                outputStream.write(redByte);
                bytesCount++;
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
