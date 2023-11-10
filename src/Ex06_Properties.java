import java.util.Properties;

/*
Map 인터페이스를 구현한 클래스
특수한 목적 : <String,String> : key와 value타입이 고정 >> String 강제

사용목적
1. App 전체에 사용되는 자원관리
2. 환경변수 (전역의 의미)
3. 프로그램의 버전
4. 로그인ID, 비번
5. 공통변수 
 */

public class Ex06_Properties {

	public static void main(String[] args) {

		Properties prop = new Properties();//내부적으로 타입이 <String,String>으로 강제되어있음
		prop.setProperty("admin", "kosa@kosa.or.kr");
		prop.setProperty("downpath", "C:\\Temp\\images");
		
		//웹 각각의 페이지
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("downpath"));
		
	}

}
