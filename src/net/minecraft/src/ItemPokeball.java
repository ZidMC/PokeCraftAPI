package net.minecraft.src;
//Code created for PokeCraft Mod by
//Ziddia. All rights reserved. Ziddia
//and the ZidMC team are the only
//people allowed to reproduce this code
//in any way shape or form.
//Intellectual copyright 2011 by
//ZidMC. Others may use this code to
//produce their own mods but must
//first contact the author for
//permission.

import java.util.Random; //Unneeded, but just in case

public class ItemPokeball extends Item {

//Code for actions on a Pokeball being used
	//TODO: Fix up all this stuff :/
     public void onBallThrown(String s, int i, boolean k) {
        String s1 = getUniqueName();
        int i1 = getCatchChance();
        boolean k1 = isAutoCatch();
           }

//NOTE: Determines the items in game name
      public String getUniqueName() {
             
           }

//NOTE: Determines the chance of  capture. This changes according to the mob strength
       public int getCatchChance() {
                return getCatchChance();
           }
 
//NOTE: Determines the mobs strength. The equation to find capture chance is getCatchChance-getMobStrength

       public int getMobStrength() {
                return getMobStrength();
           }

//NOTE: This code returns true if the ball automatically catches, and false if it doesn't. Returning false will make it determine catch chance as normal, while returning true makes it a 100% chance automatically. I am in no way certain this code will work; it is an example only.

       public boolean isAutoCatch() {
                if(isAutoCatch() == true) {
                  return true;
                }
        else{}
                if(isAutoCatch() == false) {
                 return false;
                }
           }

//NOTE: Determines the actual chance of catching a Pokemon. Im near positive this code doesn't work.

       public int getFinalCaptureChance() {
                if (isAutoCatch() == true) {
                   return 100;
                   }
                else {}
                if (isAutoCatch() == false) {
                   return getCatchChance()-getMobStrength();
           }

     }

//This is a base for ItemPokeball. As you can see, it's not actually that hard to code. I'm more worried about EntityLegendary than anything else, because it's easy enough to code this in.

}
