/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingfromacsvfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author svlln
 */
public class ReadingFromACSVFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // .csv comma separated values
        
        String fileName = "titanic1.csv";
        File file = new File(fileName);
        
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext()){
            String data = inputStream.nextLine();
//            String[] values = data.split(",");
            System.out.println(data + "***");
            }
        inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadingFromACSVFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
