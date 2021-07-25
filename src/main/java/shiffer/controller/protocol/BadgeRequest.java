package shiffer.controller.protocol;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BadgeRequest {
    private String name;
    private String category;
    private String photo;
}
