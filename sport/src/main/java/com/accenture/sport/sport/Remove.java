package com.accenture.sport.sport;
import java.util.HashSet;
import java.util.Set;

public class Remove {
	private Set<String> newplayers = new HashSet<String>();
	public Set<String> remove(Set<String> players,String value){
		for(String player:players) {
			if(!player.contains(value)) {
				newplayers.add(player);
			}
		}
		return newplayers;
	}
}
