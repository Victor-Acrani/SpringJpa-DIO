package br.com.acrani.SpringJpaDIO.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "aluno", orphanRemoval = true)
    private List<AvaliacaoFisica> avaliacoesFisica = new ArrayList<>();
}
