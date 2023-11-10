import java.util.HashSet;
import java.util.Set;

//set : 순서는 보장X, 중복값 없음은 보장O
/*
Set 인터페이스
순서 보장x, 중복 허락 x
순서가 없고 중복을 허락하지 않는 데이터 집합
구현하는 클래스 -> hashSet, treeSet
 */
public class Ex04_Set {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		System.out.println(hs.add(10));//false
		
		System.out.println(hs.toString());//toString()이 재정의 되어서 알아서 나옴
										//[20,10]
		
		//ex) 로또, 차량번호, 회원id
		
		/*
		 for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			for(int j = 0 ; j < i ; j++) { //j < i (채워진 개수 만큼 비교)
				if(lotto[i] == lotto[j]) {
					i--;
					break;
					
				}
			}
		}  
		 */
		
		Set set2 = new HashSet<>();
		while(set2.size() < 6) {//중복이면 add 되지 않음
			int num = (int)(Math.random()*45+1);
			set2.add(num);
		}
		System.out.println(set2.toString());
		
		
	}

}
