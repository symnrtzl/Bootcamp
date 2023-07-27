package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//@Data -->lombok ile getter-setter methodlarını, toString metodunu, boş constructoru oluşturuyor
@Table(name="brands")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy="brand")
    private List<Model> models;
}
