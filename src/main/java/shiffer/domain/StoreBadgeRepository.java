package shiffer.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreBadgeRepository extends CrudRepository<StoreBadge, StoreBadgeKey> {
}
