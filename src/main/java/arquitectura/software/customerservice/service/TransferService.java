package arquitectura.software.customerservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jrojas
 */
@Service
@FeignClient(name = "ms-transfer")
public interface TransferService {
    @RequestMapping(path = "api/transfer",
            method = RequestMethod.GET)
    String testTransfer();
}
