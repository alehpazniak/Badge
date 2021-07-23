package shiffer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shiffer.controller.protocol.BadgeRequest;
import shiffer.controller.protocol.BadgeResponse;
import shiffer.domain.Badge;
import shiffer.domain.BadgeRepository;
import shiffer.exception.badge.BadgeNotFoundException;
import shiffer.mapper.BadgeMapper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class BadgeService {
    private final BadgeRepository badgeRepository;

    public List<Badge> getAllBadges() {
        return StreamSupport.stream(badgeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Badge findBadgeById(long id) {
        return badgeRepository.findById(id)
                .orElseThrow(() -> new BadgeNotFoundException("Значок с " + id + " не найден"));
    }

    public BadgeResponse saveBadge(BadgeRequest badgeRequest) {
        Badge badge = badgeRepository.save(BadgeMapper.INSTANCE.map(badgeRequest));
        return BadgeMapper.INSTANCE.mapToResponse(badge);
    }
}
