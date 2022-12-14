package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.player.PlayerDao;
import site.metacoding.baseball.web.dto.player.PlayerInsertReqDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	
	private final PlayerDao playerDao;
	
	public List<Player> 목록보기(){
		return playerDao.findAll();
	}
	
	public void 선수등록(PlayerInsertReqDto playerInsertReqDto) {
		playerDao.insert(playerInsertReqDto.toEntity());
	}
}
