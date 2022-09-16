package mvweb0914;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("srv")
public class FirstApp extends Application {


    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet(Arrays.asList(HelloWorldRestService.class,Orders.class));
    }
}
