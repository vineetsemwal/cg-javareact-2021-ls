package ioex.charstreamex;

import java.io.*;

public class FileCopyFastUsingCharStreamEx {

    public static void main(String[] args){
        FileCopyFastUsingCharStreamEx program=new FileCopyFastUsingCharStreamEx();
        program.start();
    }

    void start(){
        File inputFile = new File("/home/vineet/work/fileapi/inputfile.txt");
        File outFile = new File("/home/vineet/work/fileapi/outfile.txt");
        Reader reader=null;
        Writer writer=null ;
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            reader = new FileReader(inputFile);
            bufferedReader=new  BufferedReader(reader);
            writer=new FileWriter(outFile);
            bufferedWriter=new BufferedWriter(writer);
            int charsRead;
            int charsCount=0;
            char newBytesRead[] = new char[10];
            while ((charsRead=bufferedReader.read(newBytesRead))>0){
                bufferedWriter.write(newBytesRead,0,charsRead);
                charsCount=charsCount+charsRead;
                String str=new String(newBytesRead);
                System.out.println("string read="+str);
            }
            System.out.println("chars written="+charsCount);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            close(reader);
            close(writer);
        }
    }
    boolean isVowel(char character){
        return(character=='a' || character=='e' || character=='i' || character=='o' || character=='u');
    }

    void close(Writer writer){
        try{
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    void close(Reader reader){
        try{
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
