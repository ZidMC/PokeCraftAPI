package net.minecraft.src;
//Code created for PokeCraft Mod by
//Ziddia and Hippie. All rights reserved. Ziddia
//and the ZidMC team are the only
//people allowed to reproduce this code
//in any way shape or form.
//Intellectual copyright 2011 by
//ZidMC. Others may use this code to
//produce their own mods but must
//first contact the author for
//permission.

import java.util.Random;//Yeah it's messy coding, but it doesn't really matter for now

public class ItemTM extends Item {

//Code for a bunch of stuff concerning TMs

public void onTMUsed(String s, int k, boolean b) {
        String s1 = getTmType();
        int k1 = getMaxUses();
        boolean b1 = false;
}

//Determines the type of TM used

        public String getTmType() {

//Bunch of code concerning getting the unique name of the TM and naming it

//Send a notification- not sure this would work

        System.out.println("You have used the" + tmName + "Technical Machine!");
}

//Potential code for a later version 

public void whoCanUse() {  

//Use a FileReader, loaded from mods/Pkmn/TMs, for each TM that    reads each line and let's them use it only if their name is on the document.
  
      }

        public int setDelayTime() {
        //Code for finding the time before a move is used- unfortunately moves cannot be taught and must be used soon after (after a delay time)
}

        public int getMaxUses() {
        //Code for getting the amount of times a TM may be used before it breaks
        
        //Code that calculates if the maxuses are 0 and when reached 0, it will destroy the TM
        if(getMaxUses() == 0)
          {
                boolean emptyTm = true;
                // after this i thought of something like this.desroy but i dont know if what works with java
          }
}

}