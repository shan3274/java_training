package com.accenture.sport.sport;
import java.util.Set;

public class Checkplayer {
	
	public boolean check(Set<String> players,String value) {
		
		for(String player : players) {
			if(player.contains(value)) return true;
		}
		
		return false;
	}

}
