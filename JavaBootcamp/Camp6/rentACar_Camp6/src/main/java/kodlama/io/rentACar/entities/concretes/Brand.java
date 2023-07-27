package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

//@Data -->lombok ile getter-setter methodlarını, toString metodunu, boş constructoru oluşturuyor
@Table(name="brands") //veritabanına karşılık gelen tablo ismi
@AllArgsConstructor //lombok ile parametreli contructor oluşturuyor
@Getter //lombok ile getter metodunu oluşturma
@Setter //lombok ile setter metodu oluşturma
@NoArgsConstructor //lombok ile boş contructor oluşturma
@Entity //veri tabanı na karşılık geliyor
public class Brand {

    @Id //Veritabanında primary key olan alanı @Id anotastonu ile belirtiyoruz
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Bu şu demek -->ıd'yi otomatik arttırma
    @Column(name="id") // Veritabanında hangi kolonun karşılığı olduğunu belirtiyoruz.
    private int id;

    @Column(name="name")
    private String name;

}
