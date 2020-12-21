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
@Table(name = "schadstoffklasse")

public class Schadstoffklasse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schadstoffklasse_id")
    private int Id;

    @Column(name = "schadstoffklasse_name")
    private String schadstoffklasseName;
}
