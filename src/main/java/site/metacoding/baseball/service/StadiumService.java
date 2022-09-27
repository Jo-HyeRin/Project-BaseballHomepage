package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;

// 서비스는 Dao 조합하고 트랜젝션 

@RequiredArgsConstructor
@Service // IOC 등록
public class StadiumService {
	
	// DI
	private final StadiumDao stadiumDao;
	
	public List<Stadium> 목록보기(){
		return stadiumDao.findAll();
	}
}
