package shiffer.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "badge_sale")
public class BadgeSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long idBadge;
    private String nameBadge;
    private long idStore;
    private String nameStore;
    private int number;
    private double price;

    @Column(name = "sale_date", nullable = false, updatable = false)
    @CreatedDate
    private Date saleDate;
}
