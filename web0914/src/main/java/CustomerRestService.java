import mvweb0914.Customer;
import mvweb0914.CustomerDataService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("customers")
public class CustomerRestService {
    private CustomerDataService dataService = CustomerDataService.getInstance();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomers() {
        return dataService.getCustomerList();
    }


    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String createCustomer(@FormParam("name") String name,
                       @FormParam("address") String address,
                       @FormParam("phone-number") String phoneNumber) {
        return dataService.addCustomer(name, address, phoneNumber);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomer(@PathParam("id") String id) {
        Customer customer = dataService.getCustomerById(id);
        if (customer == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        } else {
            return Response.ok().entity(customer).build();
        }
    }
}

