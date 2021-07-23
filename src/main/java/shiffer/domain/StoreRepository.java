package shiffer.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface StoreRepository extends CrudRepository<Store, Long> {
}
