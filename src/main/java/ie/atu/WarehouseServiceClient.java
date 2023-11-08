package ie.atu;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Warehouse Service", url = "https:/localhost:8081")
public interface WarehouseServiceClient {
    @PostMapping("/warehouse")
    String someDetails(@RequestBody ProductDetails productDetails);
}
