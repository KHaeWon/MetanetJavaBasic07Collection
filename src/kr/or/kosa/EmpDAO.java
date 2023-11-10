package kr.or.kosa;

import java.util.List;
import java.util.Map;

//MVC
//Model(DTO, DAO : DB를 연결하고 CRUD 구현)  -> java 
//View(html, jsp, freemarker, thymeleaf)
//Controller(servlet) -> servlet : 웹에 요청 및 응답을 할 수 있는 자바 파일

public class EmpDAO {

	//dao단은 crud 구현하는 곳
	//함수 5개를 만들어야 함
	//전체조회
	//조건조회
	//데이터 삽입
	//수정
	//삭제
	//조회(검색)
	
	public List<Emp> getEmpAllList(){
		//select empno, ename, job from emp;
		return null;
	}
	
	public Emp getEmpListByEmpno(int empno) {
		//select empno, ename, job from emp where empno=7788
		return null;
	}
	
	//Map map = new HashMap();
	//map.put("title","자바과정")
	//getEmpFindBySearchCondition
	public List<Emp> getEmpFindBySearchCondition(Map<String, String> search){
		//where title like '%자바과정%'
		return null;
	}
	
}
