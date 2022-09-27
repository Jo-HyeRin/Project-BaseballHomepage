package site.metacoding.baseball.web.dto.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.team.Team;

@Setter
@Getter
public class TeamInsertReqDto {
	private String name;
	private Integer stadiumId;
	
	public Team toEntity() {
		Team team = new Team();
		team.setName(this.name);
		team.setStadiumId(this.stadiumId);
		return team;
	}
}
