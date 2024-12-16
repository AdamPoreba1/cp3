
public class Email extends Message {
    private String subject;
    private String recipientAddress;

    public Email(String subject, String text, String recipientAddress) {
        super(text); 
        this.subject = subject;
        this.recipientAddress = recipientAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    @Override
    public void send() {
        System.out.println("Sending Email to: " + recipientAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + getText());
        System.out.println("Character Count: " + charNumber());
    }
}
