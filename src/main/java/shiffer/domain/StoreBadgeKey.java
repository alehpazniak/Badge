package shiffer.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Data
@Embeddable
public class StoreBadgeKey implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "badge_id")
    private long badgeId;

    @Column(name = "store_id")
    private long storeId;

    public StoreBadgeKey() {}

    public StoreBadgeKey(long badgeId, long storeId) {
        super();
        this.badgeId = badgeId;
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StoreBadgeKey)) return false;
        StoreBadgeKey that = (StoreBadgeKey) o;
        return getBadgeId() == that.getBadgeId() && getStoreId() == that.getStoreId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBadgeId(), getStoreId());
    }
}
