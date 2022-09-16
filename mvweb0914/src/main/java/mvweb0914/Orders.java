package mvweb0914;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/orders")
public class Orders {
    @GET
    public String getOrders() {
        return "returning all orders";
    }
    @GET
    @Path("{orderId}")
    public String getOrderById(@PathParam("orderId") String id) {
        return "return order with id " + id;
    }
}
