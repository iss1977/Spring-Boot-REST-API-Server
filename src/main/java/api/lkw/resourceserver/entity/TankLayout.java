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
@Table(name = "tank_layout")

public class TankLayout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tank_layout_id")
    private int Id;

    @Column(name = "tank_layout_name")
    private String tankLayoutName;
}
