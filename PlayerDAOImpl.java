package com.demo.playerdao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.dbutil.PostgresConnection;
import com.demo.model.Player;
import com.demo.playerdao.PlayerDAO;

public class PlayerDAOImpl implements PlayerDAO{

	public int addPlayer(Player player) {
		
		int c = 0;
		
		try(Connection connection = PostgresConnection.getConnection()) {
			String sql = "insert into player(id,name,age,city,gender) values(?,?,?,?,?)"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getCity());
			preparedStatement.setString(5, player.getGender());
			c = preparedStatement.executeUpdate();
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

		return 0;
	}

	public int updatePlayerCity(int id, String newCity) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deletePlayerById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Player getPlayerById(int id) {
		Player player = null;
		try(Connection connection = PostgresConnection.getConnection()) {
			String sql = "Select name,age,gender,city from player_schema.player where id=?"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player=new Player();
				player.setId(id);
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setName(resultSet.getString("name"));
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return player;
	}

	public List<Player> getAllPlayers() {
		List<Player> playerList = new ArrayList<>();
		try(Connection connection = PostgresConnection.getConnection()) {
			String sql = "Select name,age,gender,city from player_schema.player"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setName(resultSet.getString("name"));
				playerList.add(player);
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	} 
		


	public List<Player> getAllPlayersByAge(int age) {
		List<Player> playerList = new ArrayList<>();
		try(Connection connection = PostgresConnection.getConnection()) {
			String sql = "Printing players by age"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setName(resultSet.getString("name"));
				playerList.add(player);
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByTeamName(String teamName) {
		List<Player> playerList = new ArrayList<>();
		try(Connection connection = PostgresConnection.getConnection()) {
			String sql = "Select name,age,gender,city from player_schema.player p join player_schema.team t on p.teamid=t.teamid where t.teamname=?"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setName(resultSet.getString("name"));
				playerList.add(player);
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByTeamLocation(String teamLocation) {
		List<Player> playerList = new ArrayList<>();
		try(Connection connection = PostgresConnection.getConnection()) {
			String sql = "Select name,age,gender,city from player_schema.player p join player_schema.team t on p.teamid=t.teamid where t.teamlocation=?"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamLocation);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setName(resultSet.getString("name"));
				playerList.add(player);
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByTeamId(String teamid) {
		List<Player> playerList = new ArrayList<>();
		try(Connection connection = PostgresConnection.getConnection()) {
			String sql = "Select name,age,gender,city from player_schema.player p join player_schema.team t on p.teamid=t.teamid where t.teamid=?"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamid);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setName(resultSet.getString("name"));
				playerList.add(player);
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByCity(String city) {
		List<Player> playerList = new ArrayList<>();
		try(Connection connection = PostgresConnection.getConnection()) {
			String sql = "Printing players by city"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setName(resultSet.getString("name"));
				playerList.add(player);
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}
	}


