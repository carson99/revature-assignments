package com.app.player.service;

import java.util.List;

import com.app.player.exception.BusinessException;
import com.app.player.model.Team;

public interface TeamService {
	
	public int addTeam(Team team) throws BusinessException;
	public List<Team> getAllTeams;
	

}
