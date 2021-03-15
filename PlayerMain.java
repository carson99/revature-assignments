package com.demo.main;

import java.util.List;

import com.demo.model.Player;
import com.demo.playerdao.PlayerDAO;
import com.demo.playerdao.impl.PlayerDAOImpl;

public class PlayerMain {
	
	public static void main(String[] args) {
		
		PlayerDAO dao = new PlayerDAOImpl();
	Player p = new Player(110, "Raj", "Bangalore", 23, "M");
		
		int c = dao.addPlayer(p);
//		if(c>0) {
//			System.out.println("Player registered with below details");
//			System.out.println(p);
//		} else {
//			System.out.println("Failure in registration ");
//		}
//		int id=100;
//		Player player=dao.getPlayerById(id);
//			if(player==null) {
//				System.out.println("No player found with id "+id);
//			} else {
//				System.out.println("Player found with id = "+id+" and the details are below");
//				System.out.println(player);
//			}
//		List<Player> playerList=dao.getAllPlayers();
//			if(playerList.size()==0) {
//				System.out.println("No players as of now in DB");
//			} else {
//				System.out.println("In total, there are "+playerList.size()+" no of player/s in DB");
//				System.out.println("Printing their details");
//				for (Player p : playerList) {
//					System.out.println(p);
//				}
//			}
		
		int age;
		List<Player> playerList=dao.getAllPlayersByAge(age);
		if(playerList.size()==0) {
			System.out.println("No players as of now of age "+age);
		} else {
			System.out.println("In total, there are "+playerList.size()+" no of player/s in DB aged : "+age);
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
		}
	}
			
	
	
		String teamName="ABC Riders";
		List<Player> playerList=dao.getAllPlayersByTeamName(teamName);
			if(playerList.size()==0) {
				System.out.println("No players as of now from the teamName "+teamName);
			} else {
				System.out.println("In total, there are "+playerList.size()+" no of player/s in DB from team : "+teamName);
				System.out.println("Printing their details");
				for (Player p : playerList) {
					System.out.println(p);
			}
		}

		String teamLocation;
		List<Player> playerList = dao.getAllPlayersByTeamLocation(teamLocation);
		if (playerList.size() == 0) {
			System.out.println("No players as of now from the team location " + teamLocation);
		} else {
			System.out.println("In total, there are " + playerList.size() + " no of player/s in DB from team location : " + teamLocation);
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
			}
		}
		List<Player> playerList=dao.getAllPlayersByTeamId(teamid);
		if(playerList.size()==0) {
			System.out.println("No players as of now from the teamId "+teamid);
		} else {
			System.out.println("In total, there are "+playerList.size()+" no of player/s in DB from teamId : "+teamid);
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
		}
	}
	
	String city;
	List<Player> playerList = dao.getAllPlayersByCity(city);
	if (playerList.size() == 0) {
		System.out.println("No players as of now from the city " + city);
	} else {
		System.out
				.println("In total, there are " + playerList.size() + " no of player/s in DB from the city : " + city);
		System.out.println("Printing their details");
		for (Player p : playerList) {
			System.out.println(p);
		}
	}
	}

}
