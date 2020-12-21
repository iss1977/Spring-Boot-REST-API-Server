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
@Table(name = "kfz_typ")

public class KfzTyp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kfz_typ_id")
    private int Id;

    @Column(name = "kfz_typ_name")
    private String kfztyp;
}
