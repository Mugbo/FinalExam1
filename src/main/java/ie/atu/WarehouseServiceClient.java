package ie.atu;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Warehouse Service", url = "https:/")
public interface WarehouseServiceClient {
    @PostMapping("/warehouse")
    String someDetails(@RequestBody ProductDetails productDetails);
}
