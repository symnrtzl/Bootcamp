package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BrandRepository extends JpaRepository<Brand,Integer> {
    //List<Brand> getAll(); //getAll()'u çağırırsak markaları listeleriz  ----->Spring JPA yı kullandıktan sonra bu metotları yazmamıza gerek kalmıyor. Çünkü JPARepository'de bu metotlar mevcut. Listeleme, id'ye göre getirme gibi bir çok metot barındırıyor.






}
