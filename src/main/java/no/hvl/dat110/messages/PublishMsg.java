package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {

	String topic;
	String message;
	
	// message sent from client to create publish a message on a topic 

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message:
	}

	public String getTopic() {
		return topic;
	}

	public String getMessage() {
		return message;
	}

	public void setTopic() {
		this.topic = topic;
	}

	public void setMessage() {
		this.message = message;
	}

	public String toString(){
		return "publishMsg [topic="+topic+", message="+message+", type="+getType()+", user="+getUser();
	}

	// TODO:
	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	}
}
