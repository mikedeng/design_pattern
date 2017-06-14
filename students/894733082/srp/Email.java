public class Email {
	private String host;
	private String from;
	private String to;
	private String subject;
	private String message;

	public Email(String new_from, String new_to, String new_subject, String new_message){
		this.from    = new_from;
		this.to      = new_to;
		this.subject = new_subject;
		this.message = new_message;
	}

	public void sendHost(String new_host){
		this.host = new_host
	}

	public void sendFrom(String newFrom){
		this.from = newFrom
	}

	public void sendTo(String newTo){
		this.to = newTo
	}

	public void sendSubject(String newSubject){
		this.subject = newSubject
	}

	public void sendMessage(String newMessage){
		this.message = newMessage
	}

	public void send(){
		StringBuilder buffer = new StringBuilder();
		buffer.append("From:").append(this.from).append("\n");
		buffer.append("To:").append(this.to).append("\n");
		buffer.append("Subject:").append(this.subject).append("\n");
		buffer.append("Content:").append(this.message).append("\n");
		System.out.println(buffer.toString());
	}
}