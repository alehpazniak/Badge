package shiffer.controller.protocol;

import lombok.Data;

@Data
public class StoreRequest {
    private String photo;
    private String address;
    private String coordinates;
}
