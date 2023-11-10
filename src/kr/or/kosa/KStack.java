package kr.or.kosa;
/*
java api 제공하는 stack 직접 구현해보기
LIFO 구조를 코드로
1. stack 저장공간(Array : 고정배열 10개방), 저장공간 타입(Object)
2. 위치정보 : 저장되는 값이 있는 위치(index) hint>>전자제품 매장 cart 이용해서 처리
3. 기능 : push(), pop(), boolean empty(), boolean full()
 */

import java.util.List;

public class KStack {

	private Object[] stackarr; //stack 저장소
	private int position;//배열의 위치 정보
	//기타 필요한 자원은 생성
	private int maxsize;
	
	public KStack(int maxsize) {
		this.stackarr = new Object[maxsize];
		this.position = -1; //값이 없다
		this.maxsize = maxsize;
	}
	
//	public void push(int value) {
//		stackarr[++position] = value;
//	}
	
	public void push(Object i) {
		if(isFull()) {
			//throw new IndexOutOfBoundsException("Full임!");
			System.out.println("Kstack is full ! ! ! !");
		}else {
			this.stackarr[++position]= i ;
		}
	}
	
//	public void pop() {
//		stackarr[position--] = 0;
//	}
	
	public Object pop() {
		Object value = null;
		if(isEmpty()) {
			System.out.println("Kstack is Empty! ! ! !");
		}else {
			value = this.stackarr[position];
			position--;
		}
		return value;
	}
	
	public boolean isEmpty() {
		return (position==-1);
	}
	
	public boolean isFull() {
		return (position==this.maxsize-1);//maxsize는 변하지 않으므로
	}
	
}
