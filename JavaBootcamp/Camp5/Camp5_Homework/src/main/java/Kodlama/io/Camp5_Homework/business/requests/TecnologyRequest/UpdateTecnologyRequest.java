package Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTecnologyRequest {
    private String name;
    private int languageId;
}
