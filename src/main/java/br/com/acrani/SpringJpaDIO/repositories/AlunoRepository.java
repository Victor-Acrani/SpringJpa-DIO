package br.com.acrani.SpringJpaDIO.repositories;

import br.com.acrani.SpringJpaDIO.dtos.AlunoDtoRequest;
import br.com.acrani.SpringJpaDIO.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findByCpf(String cpf);
}
