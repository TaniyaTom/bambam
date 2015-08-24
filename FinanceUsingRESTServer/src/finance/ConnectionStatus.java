package finance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class ConnectionStatus {

@Path("/ConnectionStatus")
public class TestClass {
	@GET
	@Path("/Change")
	@Produces(MediaType.APPLICATION_JSON)
	public String getUsers(){
		System.out.println("Testing Rest");
		String str = "{\"success\":true,\"code\":\"IN\",\"name\":\"INDIA hello\","+
			      "\"continent\":\"ASIA cont\",\"region\":\"TamilNadu\",\"lifeExpectancy\":990.0,\"gnp\":98.0}";
		return str;
	}
}

}
