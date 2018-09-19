/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul2;

/**
 *
 * @author hp
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class nomer1 {
     public static void main(String[] args) throws FileNotFoundException {
        FileInputStream input = null;
        FileOutputStream  output = null;
        try{
            File infile = new File("E:\\input.txt");
            File outfile = new File("E:\\baru.txt");
            
            input = new FileInputStream(infile);
            output = new FileOutputStream(outfile);
            
            byte[]buffer = new byte[1024];
            
            int length;
            
            while((length = input.read(buffer))>0){
                output.write(buffer,0,length);
                
            }
            
            input.close();
            output.close();
            
            System.out.println("File berhasil tercopy!!");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
}
