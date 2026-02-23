package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	String Topic

	// message sent from client to subscribe on a topic 

    public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic;
    }

	public String getTopic(){
		return topic;
	}

	public void setTopic(){
		this.topic = topic;
	}

	public String toString(){
		return "Message [topic="+topic+", type="+getType()+", user="+getUser();
	}

	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
}
