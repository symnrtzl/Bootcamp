package Kodlama.io.Camp5_Homework.dataAccess.abstracts;

import Kodlama.io.Camp5_Homework.entities.Tecnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnologyRepository extends JpaRepository<Tecnology,Integer> {
}
