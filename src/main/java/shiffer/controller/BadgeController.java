package shiffer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shiffer.controller.protocol.BadgeRequest;
import shiffer.controller.protocol.BadgeResponse;
import shiffer.domain.Badge;
import shiffer.service.BadgeService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @GetMapping
    public List<Badge> getBadges() {
        return badgeService.getAllBadges();
    }

    @GetMapping("/id/{id}")
    public Badge getBadgeById(@PathVariable(value = "id") long id) {
        return badgeService.findBadgeById(id);
    }

    @PostMapping
    public BadgeResponse addBadge(@RequestBody BadgeRequest badgeRequest) {
        return badgeService.saveBadge(badgeRequest);
    }
}
