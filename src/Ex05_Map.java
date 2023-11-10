import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map 인터페이스
(key , value) 쌍의 구조를 갖는 배열
ex)  지역번호 (02,서울) (031,경기)

key 중복(x)   >> Set ...
value 중복(0) >> List ...

Generic 지원

Map 인터페이스 구현하는 클래스: 동기화(Thread : stack 여러개 사용하기)
구버전 : HashTable (동기화) 보장 : 한강 화장실 (Lock) 자원보호
신버전 : HashMap   (동기화) 보장하지 않아요 :한강 비빕밥 (성능) ******

***************************************************
ArrayList , HashMap  + Generic >> 기본적인 CRUD >> DB
***************************************************
 */

class Student{
	
	int kor;
	int math;
	int eng;
	String name;
	
	public Student(int kor, int math, int eng, String name) {
		this.kor=kor;
		this.math=math;
		this.eng=eng;
		this.name=name;
	}

}

public class Ex05_Map {

	public static void main(String[] args) {

		HashMap map = new HashMap<>();
		map.put("Tiger", "1004"); //회원의 id와 pw
		map.put("scott", "1004");
		
		System.out.println(map.containsKey("tiger"));//false
		//containsKey -> true/false 리턴
		System.out.println(map.get("Tiger"));//1004
		
		Set set = map.keySet();//Set으로 받네? key 집합은 중복값이 없고 순서를 보장하지 않음
		//Collection의 표준화된 출력(iterator)
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//HashMap<String, String> -> key, value 모두 String
		//HashMap<Integer, String>
		
		//class Student{}를 만들었을 때
		
		//HashMap<String, Student> 처럼 응용할 수 있도록 하자
		//HashMap<String, List<Student>>
		
		HashMap<String, Student> smap = new HashMap<>();
		smap.put("hong", new Student(100, 90, 50, "홍길동"));
		smap.put("kim", new Student(100, 90, 50, "김유신"));
		
		Student student = smap.get("hong"); //hong이라는 학생의 성적 객체 정보
		System.out.println(student.eng);
	}

}
