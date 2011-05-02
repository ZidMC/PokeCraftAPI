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

import java.util.Random;

public class PokeChievement extends Achievement {

public void onPokeCatch(String s, String t, String u) {
        String s1 = getPokemon();
        String t1 = getBall();
        String u1 = getAchievement();
}

public void onPokeKill(String s, boolean b, String t) {
         String s1 = getPokemon();
         boolean b1 = getKiller();
         String t1 = getAchievement();
}

public String getPokemon() {
         ObjectDex.getName().getID();
}

public String getBall() {

//Code to determine the type of ball it has been captured in; possibly using the ObjectDex to do so
          
}

public String getAchievement() {

//Extremely basic code to get the achievement in use

}

public boolean getKiller(Entity entity) {

if (entity instanceof EntityPlayer) {
         return true;
} else {
         return false;
         }
}

}

