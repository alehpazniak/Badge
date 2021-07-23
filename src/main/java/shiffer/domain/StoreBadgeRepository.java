package shiffer.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Component
@Repository
public interface StoreBadgeRepository extends CrudRepository<StoreBadge, StoreBadgeKey> {

    @Query(value = "select * from badges b " +
            "inner join store_badge sb on b.id = sb.badge_id " +
            "where store_id = :idStore",
            nativeQuery = true)
    Collection<Badge> findAllBadgesInStore(long idStore);
}
