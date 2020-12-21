package api.lkw.resourceserver.repository;

import api.lkw.resourceserver.entity.FzgMain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FzgMainRepository extends JpaRepository<FzgMain, Integer> {

    List<FzgMain> findByKennzeichenContaining(String kennzeichen);
}
