package ioex.charstreamex;

import java.io.*;

public class ReadWriteLines {

    public static void main(String args[]) {
        ReadWriteLines program = new ReadWriteLines();
        program.start();
    }

    void start() {
        Reader reader = null;
        Writer writer = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            reader=new InputStreamReader(System.in);
            writer=new OutputStreamWriter(System.out);
           bufferedReader=new BufferedReader(reader);
           bufferedWriter=new BufferedWriter(writer);
           String redLine;
           int linesCount=0;
           while (!(redLine=bufferedReader.readLine()).equals("bye")){
               bufferedWriter.newLine();
               bufferedWriter.write(redLine);
               System.out.println("line red="+redLine);
               linesCount++;
           }
           System.out.println("number of lines read and write="+linesCount);
           bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(reader);
            close(writer);

        }
    }

    void close(Writer writer) {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void close(Reader reader) {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
