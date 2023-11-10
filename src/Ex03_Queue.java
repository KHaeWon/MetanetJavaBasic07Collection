import java.util.LinkedList;
import java.util.Queue;

//대기열을 쌓아두고 하나씩 빼서 쓰는 것

class Message{
	String command;
	String to;
	
	Message(String command, String to){
		this.command=command;
		this.to=to;
	}
}

public class Ex03_Queue {

	public static void main(String[] args) {

		//java.util.LinkedList<E> //LinkedList -> Queue를 구현하고 있음
		Queue<Message> messageQueue = new LinkedList<>();
		//선입선출 FIFO
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","김유신"));
		messageQueue.offer(new Message("sendKakotalk","이순신"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"메일 전송");
				break;
			case "sendSMS":
				System.out.println(message.to+"SMS 전송");
				break;
			case "sendKakotalk":
				System.out.println(message.to+"Kakotalk 전송");
				break;
			}
		}
		
	}

}
