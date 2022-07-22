package br.com.acrani.SpringJpaDIO.controllers;

import br.com.acrani.SpringJpaDIO.dtos.AlunoDtoRequest;
import br.com.acrani.SpringJpaDIO.dtos.AlunoDtoUpdate;
import br.com.acrani.SpringJpaDIO.models.Aluno;
import br.com.acrani.SpringJpaDIO.services.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        List<Aluno> all = alunoService.findAll();
        return ResponseEntity.ok().body(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> findById(@PathVariable Long id){
        Aluno byId = alunoService.findById(id);
        return ResponseEntity.ok().body(byId);
    }

    @PostMapping
    public ResponseEntity<Aluno> save(@RequestBody @Valid AlunoDtoRequest alunoDtoRequest){
        Aluno save = alunoService.save(alunoDtoRequest);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id").buildAndExpand(save.getId()).toUri();
        return ResponseEntity.created(uri).body(save);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> update(@PathVariable Long id, @RequestBody @Valid AlunoDtoUpdate alunoDtoUpdate){
        Aluno update = alunoService.update(id, alunoDtoUpdate);
        return ResponseEntity.ok().body(update);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Aluno> delete(@PathVariable Long id){
        alunoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
