package br.com.acrani.SpringJpaDIO.services;

import br.com.acrani.SpringJpaDIO.dtos.MatriculaDtoRequest;
import br.com.acrani.SpringJpaDIO.models.Aluno;
import br.com.acrani.SpringJpaDIO.models.Matricula;
import br.com.acrani.SpringJpaDIO.repositories.MatriculaRepository;
import br.com.acrani.SpringJpaDIO.services.exceptions.DataBaseException;
import br.com.acrani.SpringJpaDIO.services.exceptions.DuplicatedDataException;
import br.com.acrani.SpringJpaDIO.services.exceptions.ResourceNotFoundException;
import br.com.acrani.SpringJpaDIO.services.interfaces.IMatriculaService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService implements IMatriculaService {

    private final AlunoService alunoService;
    private final MatriculaRepository matriculaRepository;

    public MatriculaService(AlunoService alunoService, MatriculaRepository matriculaRepository) {
        this.alunoService = alunoService;
        this.matriculaRepository = matriculaRepository;
    }

    @Override
    public Matricula save(MatriculaDtoRequest matriculaDtoRequest) {
        Aluno aluno = alunoService.findById(matriculaDtoRequest.getAlunoId());
        Optional<Matricula> byAluno = matriculaRepository.findByAluno(aluno);

        if(byAluno.isPresent()){
            throw new DuplicatedDataException("Student is already registered!");
        }

        Matricula matricula = new Matricula();
        matricula.setAluno(aluno);
        matriculaRepository.save(matricula);
        return matricula;
    }

    @Override
    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public Matricula findById(Long id) {
        return matriculaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @Override
    public void delete(Long id) {
        try{
            matriculaRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException(e.getMessage());
        }
    }
}
