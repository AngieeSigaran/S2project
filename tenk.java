import javax.swing.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.Random; 


public class TenK{

    public void TenK(){
        ArrayList<cup> d = new ArrayList <cup>();
            d.add(1);
            d.add(2);
            d.add(3);
            d.add(4);
            d.add(5);
            d.add(6);
    }
    
    public void  diceRoll(){ 
        Random r = new Random (); 
        int d1 = r.nextInt(6) + 1; 
        int d2 = r.nextInt(6) + 1; 
        int d3 = r.nextInt(6) + 1; 
        int d4 = r.nextInt(6) + 1; 
        int d5 = r.nextInt(6) + 1; 
        int d6 = r.nextInt(6) + 1; 
        
    }

    private String fileName = "einstein.jpg";

    private JFrame myFrame;
    private ImageIcon myPic;

   private void constructImage(String fileName) {
        File imageFile = new File("./images/" + fileName);
        // an ImageIcon is a class that contains an image and knows how to draw itself
        myPic = new ImageIcon (imageFile.toString());
        // sets the size of the window based on the picture loaded. 
        myFrame.setSize(myPic.getIconWidth(), myPic.getIconHeight() );
    }
    

    public void roll(){
        diceRoll();
        //call image
        
        boolean valid = false;

        while (!valid) {
        String m = (String) JOptionPane.showInputDialog(
            new JFrame(),
            moves,
            "Which die do you want to keep?",
            JOptionPane.PLAIN_MESSAGE);
    }    
    }


    public void endOfTurn (){ 
        if(  )


    }


// This code takes in the return value from turn and adds to the score board

    public void scoreBoard(){

        
        
    }

    public int getValue(){
        return value;
    }
    


    private int numOfVal(int val){
        int count = 0;
        for(Die d : this.putInCup()){
            if(d.getValue() == val)
                count++;
        }      
        return count;
    }

    public void keep(){
        
            ArrayList<Integer> counts = new ArrayList<Integer>();
            for(int x = 1; x <= 6; x++){
                counts.add(this.numOfVal(x));
            }
            
            int largestVal = -1;
            int largestIndex = -1;
            for(int x = 0; x < 6; x++){
                if(counts.get(x) > largestVal){
                    largestVal = counts.get(x);
                    largestIndex = x;
                }
            }
            int keepVal = largestIndex + 1;
            for(Die d : this.cup()){
                int val = d.getValue();
                if(val == keepVal)
                    d.setKeep(true);
                else
                    d.setKeep(false);
            
        }
    }

    
}







   


