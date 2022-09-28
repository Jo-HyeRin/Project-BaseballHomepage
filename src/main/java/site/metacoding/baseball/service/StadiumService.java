package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;
import site.metacoding.baseball.web.dto.stadium.StadiumInsertReqDto;

// 서비스는 Dao 조합하고 트랜젝션 

@RequiredArgsConstructor
@Service // IOC 등록
public class StadiumService {
	
	// DI
	private final StadiumDao stadiumDao;
	
	public List<Stadium> 목록보기(){
		return stadiumDao.findAll();
	}
	
	// Controller에서는 DTO로 받고, DAO는 Entity로 넘기자. (Insert, Update)
	public void 경기장등록(StadiumInsertReqDto stadiumInsertReqDto) {
		stadiumDao.insert(stadiumInsertReqDto.toEntity());
	}
	
	public void 경기장삭제(Integer id) {
		stadiumDao.deleteById(id);
	}
}
