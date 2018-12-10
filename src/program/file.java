/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Bismillah
 */
public class file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         FileInputStream finput=null;
        int data;
 
        //membuka file
        try{
            finput = new FileInputStream("E:/penjelasan.txt");
        }catch(IOException e){}
        //membaca data dari dalam file dan menpilkanya ke layar
        try{
            while((data = finput.read())!=-1){
                //ketika di tampikan data di konversi ketipe char
                System.out.print((char) data);
            }
 
        }catch(IOException e){}
        try{
             finput.close();
        }catch(IOException e){}
 
    }
    }