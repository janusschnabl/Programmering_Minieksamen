
package com.mycompany.idle_towerdefense;

import java.lang.System;

public class AlwaysRun extends Thread{
    
   Ball b = new Ball();
   //SecondaryController s = new SecondaryController();

  public SecondaryController s;
  
 
   public boolean _update;
   
    
    public void run(){
        
        while(true)
        {
         
double cTime = System.currentTimeMillis();

if(_update == true){
b.update();
s.update();
}
double endTime = System.currentTimeMillis()-cTime;

if(endTime < 1000/60)
{
    try {
        Thread.sleep((long) ((1000/60)-endTime));
    } catch (InterruptedException ex) {
        ex.printStackTrace();
    }
}

}
         
        }
    }
