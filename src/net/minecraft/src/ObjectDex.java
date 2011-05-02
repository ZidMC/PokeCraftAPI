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

public class ObjectDex extends Item {

public void getName(boolean b) {
         boolean b1 = isSpecialReg();
}

public void getID(boolean b) {
         boolean b1 = isSpecialReg();
}

public void getDescription(String s, boolean b) {
        String s1 = setDescription();
        boolean b1 = isSpecialReg();
}

public String setName() {

         //Some code here to set the name of the registered Pokemon

}

public int setID() {

        //Code that allows you to pick an ID number to assign for your Dex

}

public void setPicture() {

        //Some code we can use to set the picture for use

}

public String setDescription() {

        //Code for creating a description for the Dex

}

public boolean isSpecialReg() {

        //Some code that returns true if the registry has special data like weight, and false if it doesn't.

}

//This is of the highest priority to get properly started, as it is crucial to a Pokemon mod. We have to get the GUI up soon as well; it's the GUI that calls on the unused methods getName, getID, and getDescription.

}