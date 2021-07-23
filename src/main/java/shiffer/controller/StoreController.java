package shiffer.controller;

import lombok.RequiredArgsConstructor;
import shiffer.controller.protocol.StoreRequest;
import shiffer.controller.protocol.StoreResponse;
import shiffer.service.StoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/stores")
public class StoreController {
    private final StoreService storeService;

    @PostMapping
    public StoreResponse addStore(
            @RequestBody StoreRequest storeRequest) {
        return storeService.saveStore(storeRequest);
    }
}
