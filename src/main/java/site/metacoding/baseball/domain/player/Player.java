package site.metacoding.baseball.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	private Integer id;
	private String name;
	private String position;
	private Integer teamId;
	private boolean isOuter;
	private Timestamp createdAt;
	
	// 엔티티가 아닌 필드(Transient: 일시적 데이터)
	private Integer no;
	private String teamName;
}
