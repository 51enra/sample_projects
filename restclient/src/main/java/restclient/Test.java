package restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.JacksonFeature;

public class Test {

	private final static String restAPIUrl = "https://jsonplaceholder.typicode.com/posts/1";
	static Client client = ClientBuilder.newClient().register(JacksonFeature.class);

	private static Response getUser() {
		return client.target(restAPIUrl).request(MediaType.APPLICATION_JSON).get();
	}

	protected static void tellMeAJoke() {
		Response response = getUser();
		User user = response.readEntity(User.class);
		System.out.println("User Id " + user.getUserId());
		System.out.println("User Title " + user.getTitle());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tellMeAJoke();
	}

}
