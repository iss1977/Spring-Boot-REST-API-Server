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
@Table(name = "kfz_gruppe")

public class KfzGruppe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kfz_gruppe_id")
    private int Id;

    @Column(name = "kfz_gruppe_name")
    private String kfzgruppe;


}
