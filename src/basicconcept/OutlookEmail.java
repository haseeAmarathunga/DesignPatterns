package basicconcept;

public class OutlookEmail implements Email{
	@Override
	public void sendEmail() {
		System.out.println("Outlook Email");
	}
}
