package arquitectura.software.customerservice.api;
import arquitectura.software.customerservice.bl.TestBl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {
    private static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    private TestBl testBl;

    @Autowired
    public TestController(TestBl testBl) {
        this.testBl = testBl;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> test() {
        LOGGER.info("Invocando al servicio REST al micro-servicio CUSTOMER SERVICE");
        LOGGER.info("Invocando al servicio REST al micro-servicio CUSTOMER SERVICE");
        LOGGER.info("Invocando al servicio REST al micro-servicio CUSTOMER SERVICE");
        String result = testBl.invokeTransafer();
        return new ResponseEntity<>("INVOCACION CUSTOMER_SERVICE --> " + result, HttpStatus.OK);
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ResponseEntity<String> admin() {
        LOGGER.info("Invocando al servicio REST al micro-servicio CUSTOMER SERVICE");
        return new ResponseEntity<>("INVOCACION ADMIN", HttpStatus.OK);
    }
}