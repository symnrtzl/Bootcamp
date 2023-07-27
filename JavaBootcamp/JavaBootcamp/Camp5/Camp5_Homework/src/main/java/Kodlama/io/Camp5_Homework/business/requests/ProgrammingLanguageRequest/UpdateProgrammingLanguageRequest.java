package Kodlama.io.Camp5_Homework.business.requests.ProgrammingLanguageRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProgrammingLanguageRequest {
    private int id;

    @NotNull
    @NotBlank
    private String name;
}
