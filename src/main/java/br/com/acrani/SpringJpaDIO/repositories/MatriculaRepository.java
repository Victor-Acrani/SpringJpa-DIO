package br.com.acrani.SpringJpaDIO.repositories;

import br.com.acrani.SpringJpaDIO.models.Aluno;
import br.com.acrani.SpringJpaDIO.models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    Optional<Matricula> findByAluno(Aluno aluno);
}
