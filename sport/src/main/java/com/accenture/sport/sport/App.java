package com.accenture.sport.sport;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */

/*Create a Java Maven application using maven golas(compile,testCompile & jar)
to manage a set of players in a sports team using the Set collection. 
The application should allow adding players, removing players, checking if
a player is on the team, and displaying all players.*/
public class App 
{
    public static void main( String[] args )
    {
    	Set<String> players = new HashSet<String>();
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        Logger logger 
        = Logger.getLogger( 
            App.class.getName());
        
        
		boolean runs = true;
		while(runs) {
			logger.log(Level.INFO,"Enter your choice:");
			logger.log(Level.INFO,"1> Add player");
			logger.log(Level.INFO,"2> Remove player");
			logger.log(Level.INFO,"3> Display all the players");
			logger.log(Level.INFO,"4> Check the players is playing or not");
			logger.log(Level.INFO,"5> Quit");
	        int choice = sc.nextInt();
			switch (choice) {
			case 1:
				logger.log(Level.INFO,"Enter the player name :");
				String name = sc.next();
				logger.log(Level.INFO,"Enter the player id :");
				String id = sc.next();
				logger.log(Level.INFO,"Enter the player role :");
				String role = sc.next();
				Add add = new Add(name, id, role);
				players.add(add.details());
				logger.log(Level.INFO,"Successfully added");
				break;
			case 2:
				logger.log(Level.INFO,"Enter id to remove");
				String value = sc.next();
				Remove remove = new Remove();
				players = (Set<String>) remove.remove(players, value);
				logger.log(Level.INFO,"Successfully remove");
			case 3:
				for (String player : players) {
					logger.log(Level.INFO,player);
				}
				break;
			case 4:
				Checkplayer player = new Checkplayer();
				logger.log(Level.INFO,"Eneter the player id");
				String pl = sc.next();
				if(player.check(players, pl)) {
					logger.log(Level.INFO,"He is playing");
				}else {
					logger.log(Level.INFO,"he is not playing");
				}
				break;
			case 5:
				runs = false;
				break;
			default:
				logger.log(Level.INFO,"Enter correct choice");
	        }
		}
    }
}
