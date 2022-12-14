package site.metacoding.baseball.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.player.PlayerDao;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.service.PlayerService;
import site.metacoding.baseball.service.TeamService;
import site.metacoding.baseball.web.dto.CMRespDto;
import site.metacoding.baseball.web.dto.player.PlayerInsertReqDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final TeamService teamService;
	
	private final PlayerDao playerDao;
	
	@GetMapping("/player")
	public String list(Model model) { // 서비스한테 의존해야한다. 		
		List<Player> playerList = playerService.목록보기();
		model.addAttribute("playerList", playerList);
		return "player/list";
	}
	
	@GetMapping("/playerForm")
	public String playerForm(Model model) {
		List<Team> teamList = teamService.목록보기();
		model.addAttribute("teamList", teamList);
		return "player/saveForm";
	}	
	
	@PostMapping("/player")
	public @ResponseBody CMRespDto<?> insert(@RequestBody PlayerInsertReqDto playerInsertReqDto){
		playerService.선수등록(playerInsertReqDto);
		return new CMRespDto<>(1, "선수등록성공", null);
	}
	
	@GetMapping("/player/position")
	public String positionList() { 		
		return "player/positionList";
	}
			
}
