package shiffer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
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

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    private Date createdDate;

    public StoreBadge(StoreBadgeKey id, Badge badge, Store store, int number) {
        super();
        this.id = id;
        this.badge = badge;
        this.store = store;
        this.number = number;
    }
}
