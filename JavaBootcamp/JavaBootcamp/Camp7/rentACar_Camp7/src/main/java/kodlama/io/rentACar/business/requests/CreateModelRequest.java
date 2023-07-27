package kodlama.io.rentACar.business.requests;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
    //validation
    @NotNull
    @NotBlank //boşluk olmasın
    @Size(min=2, max=20) //minimum 2 karakter, maksimum 20 karakter olsun
    private String name;

    @NotNull
    @NotBlank
    private int brandId;
}
