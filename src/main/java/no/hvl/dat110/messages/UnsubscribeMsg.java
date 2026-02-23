package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	String topic;
	// message sent from client to unsubscribe on a topic 

    public UnsubscribeMsg(String user, String topic) {
		super(MessageType.UNSUBSCRIBE, user);
		this.topic = topic;
    }

	public String getTopic(){
		return topic;
	}

	public void setTopic(){
		this.topic = topic;
	}

	public String toString(){
		return "UnsubscribeMsg [topic="+topic+", type="+getType()+", user="+getUser();
	}

	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
}
