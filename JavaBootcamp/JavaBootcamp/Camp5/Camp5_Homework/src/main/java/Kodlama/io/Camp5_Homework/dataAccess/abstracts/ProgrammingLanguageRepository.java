package Kodlama.io.Camp5_Homework.dataAccess.abstracts;

import Kodlama.io.Camp5_Homework.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {

}
