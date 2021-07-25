package shiffer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "badges")
public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String category;
    private String photo;

    @OneToMany(mappedBy = "badge", cascade = CascadeType.ALL)
    private List<StoreBadge> storeBadges;
}
