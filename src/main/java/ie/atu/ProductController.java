package ie.atu;

import jakarta.servlet.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final WarehouseServiceClient warehouseServiceClient;

    @Autowired
    public ProductController(WarehouseServiceClient warehouseServiceClient){
        this.warehouseServiceClient = warehouseServiceClient;
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductDetails productDetails){
        return warehouseServiceClient.someDetails(productDetails);
    }


}
