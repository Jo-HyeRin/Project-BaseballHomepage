package site.metacoding.baseball.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Team {
	private Integer id;
	private String name;
	private Integer stadiumId;
	private Timestamp createdAt;
	
	// db에 없는 값 (엔티티가 아닌 필드)
	private Integer no;
	private String stadiumName;
}
