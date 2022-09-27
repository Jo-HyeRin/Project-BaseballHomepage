package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.domain.team.TeamDao;
import site.metacoding.baseball.web.dto.team.TeamInsertReqDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	
	private final TeamDao teamDao;
	
	public List<Team> 목록보기(){
		return teamDao.findAll();
	}

	public void 팀등록(TeamInsertReqDto teamInsertReqDto) {
		teamDao.insert(teamInsertReqDto.toEntity());
	}
}
