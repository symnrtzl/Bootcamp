package Kodlama.io.Camp5_Homework.business.responses.TecnologyResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTecnologyResponse {
    private int id;
    private String name;
    private String languageName;
}
