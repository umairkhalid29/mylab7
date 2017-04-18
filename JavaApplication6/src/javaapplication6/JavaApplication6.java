/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.io.*;
/**
 *
 * @author Umair
 */
public class JavaApplication6 {

    private static DaO roundDaO = new DaO();

    private static void popDataBase() {
        try {
            FileInputStream fstream = new FileInputStream("src/test_two-anon.csv");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;
            while ((strLine = br.readLine()) != null) {
                Verify round = new Verify();
                round.setUserid(58);
                
                System.out.println(strLine);

                roundDaO.addtoDB(round);
            }

            in.close();
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        popDataBase();
    }
    
}
