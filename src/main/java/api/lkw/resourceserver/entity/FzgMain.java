package api.lkw.resourceserver.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// These 3 annotations are needed for Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
// And for out entity definition:
@Entity
@Table(name = "fzg_liste_main")
public class FzgMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fzg_pk;
    
    @Column(name = "kennzeichen")
    private String kennzeichen;


    //  @ManyToOne annotation is associated with the Dispostelle class variable. @JoinColumn annotation references the mapped column
    @ManyToOne
    @JoinColumn(name="dispostelle_id") /// nullable = false deleted
    @JsonProperty("dispostelle")
    private Dispostelle dispostelle;

    @ManyToOne
    @JoinColumn(name="kfz_gruppe_id") /// nullable = false deleted
    @JsonProperty("kfz_gruppe")
    private KfzGruppe kfzGruppe;

    @ManyToOne
    @JoinColumn(name="kfz_typ_id") /// nullable = false deleted
    @JsonProperty("kfz_typ")
    private KfzTyp kfzTyp;

    @ManyToOne
    @JoinColumn(name="ladungs_typ_id") /// nullable = false deleted
    @JsonProperty("ladungs_typ")
    private LadungsTyp ladungsTyp;

    @ManyToOne
    @JoinColumn(name="lkw_modell_sorten_id") /// nullable = false deleted
    @JsonProperty("lkw_modell_sorten")
    private LkwModellSorten lkwModellSorten;

    @ManyToOne
    @JoinColumn(name="schadstoffklasse_id") /// nullable = false deleted
    @JsonProperty("schadstoffklasse")
    private Schadstoffklasse schadstoffklasse;

    @ManyToOne
    @JoinColumn(name="tank_layout_id") /// nullable = false deleted
    @JsonProperty("tank_layout")
    private TankLayout tankLayout;




//
//    public Dispostelle getDispostelle() {
//        return dispostelle;
//    }
//
//    public void setDispostelle(Dispostelle dispostelle) {
//        this.dispostelle = dispostelle;
//    }
}



/*

    fzg_pk Primary	int(6)			No	None			Change Change	Drop Drop
    More More
	2	kennzeichen	varchar(9)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            3	lkw_modell_sorten_id Index	int(10)			Yes	NULL			Change Change	Drop Drop
            More More
            4	lkw_modell_sorten_name	varchar(26)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            5	kfz_typ_id Index	int(10)			Yes	NULL			Change Change	Drop Drop
            More More
            6	kfz_typ_name	varchar(10)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            7	kfz_typ_logo_link	varchar(10)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            8	ladungs_typ_id Index	int(10)			Yes	NULL			Change Change	Drop Drop
            More More
            9	ladungs_typ_name	varchar(15)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            10	kfz_gruppe_id Index	int(10)			Yes	NULL			Change Change	Drop Drop
            More More
            11	kfz_gruppe_name	varchar(10)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            12	dispostelle_id Index	int(10)			Yes	NULL			Change Change	Drop Drop
            More More
            13	dispostelle_name	varchar(23)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            14	erstzulassung_date	varchar(10)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            15	baujahr	varchar(4)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            16	schadstoffklasse_id Index	int(10)			Yes	NULL			Change Change	Drop Drop
            More More
            17	schadstoffklasse_name	varchar(10)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
            18	tank_layout_id Index	int(10)			Yes	NULL			Change Change	Drop Drop
            More More
            19	tank_layout_name	varchar(11)	utf8_general_ci		Yes	NULL			Change Change	Drop Drop
            More More
*/