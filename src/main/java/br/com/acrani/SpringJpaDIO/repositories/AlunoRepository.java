package br.com.acrani.SpringJpaDIO.repositories;

import br.com.acrani.SpringJpaDIO.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
