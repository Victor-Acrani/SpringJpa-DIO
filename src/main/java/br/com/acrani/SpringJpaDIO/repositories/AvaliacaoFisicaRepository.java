package br.com.acrani.SpringJpaDIO.repositories;

import br.com.acrani.SpringJpaDIO.models.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
}
