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
@Table(name = "dispostelle")
@JsonIgnoreProperties({"fahrzeuge"})
public class Dispostelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dispostelle_id")
    private long Id;

    @Column(name = "dispostelle_name")
    private String dispoName;

//    @OneToMany(mappedBy="dispostelle")
//    private List<FzgMain> fahrzeuge;

}
