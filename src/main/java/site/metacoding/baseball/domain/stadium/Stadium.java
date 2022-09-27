package site.metacoding.baseball.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Stadium {
	private Integer id;
	private String name;
	private Timestamp createdAt;
	
	// db에 없는 값 ( 엔티티가 아닌 필드)
	private Integer no;
}
