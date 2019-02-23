package basicconcept;

public class WebserviceEmail implements Email{
	@Override
	public void sendEmail() {
		System.out.println("WebService Email");
	}
}
