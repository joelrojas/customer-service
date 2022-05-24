package arquitectura.software.customerservice.bl;

import arquitectura.software.customerservice.service.TransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jrojas
 */
@Service
public class TestBl {
    private static Logger LOGGER = LoggerFactory.getLogger(TestBl.class);
    private TransferService transferService;

    @Autowired
    public TestBl(TransferService transferService) {
        this.transferService = transferService;
    }

    public String invokeTransafer() {
        String response = transferService.testTransfer();
        LOGGER.info("Response Transfer Service: {}", response);
        return response;
    }
}
