package Kodlama.io.Camp5_Homework.business.responses.ProgrammingLanguageResponse;

import Kodlama.io.Camp5_Homework.entities.Tecnology;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageResponse {
    private int id;
    private String name;

}
