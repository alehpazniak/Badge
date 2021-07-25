package shiffer.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BadgeRepository extends CrudRepository<Badge, Long> {
    @Query(value = "select * from badges b " +
            "inner join store_badge sb on b.id = sb.badge_id " +
            "where store_id = :idStore",
            nativeQuery = true)
    Collection<Badge> findAllBadgesInStore(long idStore);
}
