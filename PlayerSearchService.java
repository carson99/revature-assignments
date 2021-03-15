package com.app.player.service;

import java.util.List;

import com.app.player.exception.BusinessException;
import com.demo.model.Player;

public interface PlayerSearchService {
	
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPLayersByAge(int age) throws BusinessException;
	public List<Player> getAllPLayersByCity(String city) throws BusinessException;
	public List<Player> getAllPLayersByGender(String gender) throws BusinessException;
	public List<Player> getAllPLayersByTeamName(String teamname) throws BusinessException;

}
