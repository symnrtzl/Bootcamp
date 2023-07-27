package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    /*Asıl iş kurallarımızı bu pakette yazarız. Managerlarda iş kurallarını yazarsak sıkıntı olabilir.
     Sürekli if bloklarını orada kullanmak kodun okunabilirliğini azaltmaktatır.*/


    private BrandRepository  brandRepository;

    //Marka ismi tekrar ediyor mu? Bu işin kurallarını yazarız.
    // Marka isminin tekrar edip etmediğini öğrenmek için veritabanına bakarız.
    // BrandRepository'e ihtiyacımız var
    public void checkIfBrandNameExists(String name){
        if(this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand already exists");
        }
    }
}
