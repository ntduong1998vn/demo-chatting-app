package ntduong.main.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ChatMessage {

	public enum MessageType{
		CHAT,
		JOIN,
		LEAVE
	}
	
	private MessageType type;
	private String content;
	private String sender;
	
}
