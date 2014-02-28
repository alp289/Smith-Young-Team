/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package curiousworkmanship;

import byui.cit260.curiousWorkmanship.model.Player;

/**
 *
 * @author Your name here
 */

public class CuriousWorkmanship {

    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Fred Flintsone");
       playerOne.setBestTime(7.00);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
    }
    
}






