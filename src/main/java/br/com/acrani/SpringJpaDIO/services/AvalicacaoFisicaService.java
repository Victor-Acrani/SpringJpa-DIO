package br.com.acrani.SpringJpaDIO.services;

import br.com.acrani.SpringJpaDIO.dtos.AvaliacaoFisicaDtoRequest;
import br.com.acrani.SpringJpaDIO.models.AvaliacaoFisica;
import br.com.acrani.SpringJpaDIO.repositories.AlunoRepository;
import br.com.acrani.SpringJpaDIO.repositories.AvaliacaoFisicaRepository;
import br.com.acrani.SpringJpaDIO.services.interfaces.IAvalicacaoFisicaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvalicacaoFisicaService implements IAvalicacaoFisicaService {

    private final AlunoRepository alunoRepository;
    private final AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    public AvalicacaoFisicaService(AlunoRepository alunoRepository, AvaliacaoFisicaRepository avaliacaoFisicaRepository) {
        this.alunoRepository = alunoRepository;
        this.avaliacaoFisicaRepository = avaliacaoFisicaRepository;
    }

    @Override
    public AvaliacaoFisica save(AvaliacaoFisicaDtoRequest avaliacaoFisicaDtoRequest) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> findAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica findByID(Long id) {
        return null;
    }

    @Override
    public AvaliacaoFisica update(AvaliacaoFisicaDtoRequest avaliacaoFisicaDtoRequest, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
