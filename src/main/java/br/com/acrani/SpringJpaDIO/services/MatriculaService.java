package br.com.acrani.SpringJpaDIO.services;

import br.com.acrani.SpringJpaDIO.dtos.MatriculaDtoRequest;
import br.com.acrani.SpringJpaDIO.models.Matricula;
import br.com.acrani.SpringJpaDIO.repositories.AlunoRepository;
import br.com.acrani.SpringJpaDIO.repositories.MatriculaRepository;
import br.com.acrani.SpringJpaDIO.services.interfaces.IMatriculaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService implements IMatriculaService {

    private final AlunoRepository alunoRepository;
    private final MatriculaRepository matriculaRepository;

    public MatriculaService(AlunoRepository alunoRepository, MatriculaRepository matriculaRepository) {
        this.alunoRepository = alunoRepository;
        this.matriculaRepository = matriculaRepository;
    }

    @Override
    public Matricula save(MatriculaDtoRequest matriculaDtoRequest) {
        return null;
    }

    @Override
    public List<Matricula> findAll() {
        return null;
    }

    @Override
    public Matricula findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
