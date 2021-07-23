package shiffer.controller;

import lombok.RequiredArgsConstructor;
import shiffer.controller.protocol.BadgeResponse;
import shiffer.service.StoreBadgeService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/store_badges")
public class StoreBadgeController {
    private final StoreBadgeService storeBadgeService;



    @PostMapping("/{store_id}/{badge_id}")
    public void addBadgeToStore(@PathVariable(value = "store_id") long idStore,
                                @PathVariable(value = "badge_id") long idBadge) {
        storeBadgeService.addBadgeToStore(idBadge, idStore);
    }

    @GetMapping("/store/{id}")
    public Set<BadgeResponse> getBadgesInStore(@PathVariable(value = "id") long id) {
        return storeBadgeService.getBadgesInStore(id);
    }
}
