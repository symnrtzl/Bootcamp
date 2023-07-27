package Kodlama.io.Camp5_Homework.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="languages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy="language")
    private List<Tecnology> tecnology;
}
