package br.com.acrani.SpringJpaDIO.repositories;

import br.com.acrani.SpringJpaDIO.models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
