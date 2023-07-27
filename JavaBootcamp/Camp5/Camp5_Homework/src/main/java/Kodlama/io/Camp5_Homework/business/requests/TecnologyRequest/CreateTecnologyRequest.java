package Kodlama.io.Camp5_Homework.business.requests.TecnologyRequest;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTecnologyRequest {
    @NotNull
    @NotBlank
    private String name;

    private int languageId;

}
