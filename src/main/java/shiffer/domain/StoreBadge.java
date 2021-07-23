package shiffer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "store_badge")
public class StoreBadge {

    @EmbeddedId
    private StoreBadgeKey id;

    @ManyToOne
    @MapsId("badgeId")
    @JoinColumn(name = "badge_id")
    private Badge badge;

    @ManyToOne
    @MapsId("storeId")
    @JoinColumn(name = "store_id")
    private Store store;

    private int number;

    public StoreBadge(StoreBadgeKey id, Badge badge, Store store, int number) {
        super();
        this.id = id;
        this.badge = badge;
        this.store = store;
        this.number = number;
    }
}
