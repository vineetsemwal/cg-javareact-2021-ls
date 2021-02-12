package ioex.charstreamex;

import java.io.*;

public class FileCopyUsingCharStreamEx {

    public static void main(String[]  args){
        FileCopyUsingCharStreamEx app=new FileCopyUsingCharStreamEx();
        app.start();
    }



    void start(){
        File inputFile = new File("/home/vineet/work/fileapi/inputfile.txt");
        File outFile = new File("/home/vineet/work/fileapi/outfile.txt");
        Reader reader=null;
        Writer writer=null ;
        try {
            reader = new FileReader(inputFile);
            writer=new FileWriter(outFile);
            int charRead=-1;
            int charsCount=0;
            int vowelsCount=0;
            while ((charRead=reader.read())!=-1){
                writer.write(charRead);
                charsCount++;
                char character=(char)charRead;
                boolean isVowel=isVowel(character);
                if(isVowel){
                  vowelsCount++;
                }
            }
            System.out.println("chars written="+charsCount);
            System.out.println("vowels found="+vowelsCount);
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

    void close(Writer writer){
        try{
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    boolean isVowel(char character){
        return(character=='a' || character=='e' || character=='i' || character=='o' || character=='u');
    }

    void close(Reader reader){
        try{
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
