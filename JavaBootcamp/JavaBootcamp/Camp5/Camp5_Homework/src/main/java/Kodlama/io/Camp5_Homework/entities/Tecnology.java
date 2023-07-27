package Kodlama.io.Camp5_Homework.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="homework")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tecnology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private ProgrammingLanguage language;


}