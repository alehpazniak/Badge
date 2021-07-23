package shiffer.service;

import lombok.RequiredArgsConstructor;
import shiffer.controller.protocol.BadgeResponse;
import shiffer.domain.*;
import shiffer.exception.badge.BadgeNotFoundException;
import shiffer.exception.store.StoreNotFoundException;
import shiffer.mapper.BadgeMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StoreBadgeService implements CommandLineRunner {
    private final BadgeRepository badgeRepository;
    private final StoreRepository storeRepository;
    private final StoreBadgeRepository storeBadgeRepository;

    @Transactional
    public void addBadgeToStore(long idStore, long idBadge) {
        Badge badge = badgeRepository.findById(idBadge)
                .orElseThrow(() -> new BadgeNotFoundException("Значок с " + idBadge + " не найден"));
        Store store = storeRepository.findById(idStore)
                .orElseThrow(() -> new StoreNotFoundException("Магазин с " + idStore + " не найден"));
        StoreBadge storeBadge = new StoreBadge(new StoreBadgeKey(idStore, idBadge), badge, store, 1);
        storeBadgeRepository.save(storeBadge);
    }

    public Set<BadgeResponse> getBadgesInStore(long idStore) {
        return badgeRepository.findAllBadgesInStore(idStore).stream()
                .map(BadgeMapper.INSTANCE::mapToResponse)
                .collect(Collectors.toSet());
    }

    @Override
    public void run(String... args) throws Exception {
//        StoreBadge storeBadge = new StoreBadge(new )
    }
}
