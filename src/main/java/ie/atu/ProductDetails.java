package ie.atu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {
    private int productId;
    private String productName;
    private int quantity;
    private int warehouseId;
    private String location;
    private int capacity;
}
