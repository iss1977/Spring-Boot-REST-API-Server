package api.lkw.resourceserver.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
// And for out entity definition:
@Entity
@Table(name = "lkw_modell_sorten")


public class LkwModellSorten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lkw_modell_sorten_id")
    private int Id;

    @Column(name = "lkw_modell_sorten_name")
    private String lkwmodellsortenname;
}
