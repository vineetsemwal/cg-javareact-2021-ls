package ioex.charstreamex;

import java.io.*;

public class DefaultInputOutputConsole {

    public static void main(String args[]){
        DefaultInputOutputConsole app=new DefaultInputOutputConsole();
        app.start();
    }



    void start(){
        Reader reader=null;
        Writer writer=null ;
        try {
            InputStream inputStream=System.in;
            reader = new InputStreamReader(inputStream);
            OutputStream outputStream=System.out;
            writer=new OutputStreamWriter(outputStream);
            int charRead;
            while ((char)(charRead=reader.read())!='z'){
                writer.write(charRead);
            }
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


    void close(Reader reader){
        try{
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
