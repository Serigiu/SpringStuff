package ro.sda.dependecy_injection.with_di;

public class EmailServiceImpl implements MessageService {

  @Override
  public void sendMessage(String msg, String rec) {
    // logic to send email
    System.out.println("Email sent to " + rec + " with message=" + msg);
  }

}
