package br.com.acrani.SpringJpaDIO.services.interfaces;

import br.com.acrani.SpringJpaDIO.dtos.AvaliacaoFisicaDtoRequest;
import br.com.acrani.SpringJpaDIO.models.AvaliacaoFisica;

import java.util.List;

public interface IAvalicacaoFisicaService {

    /**
     * Salva avaliação física no banco de dados
     * @param avaliacaoFisicaDtoRequest - Dto com as informações para salvar a avaliação física
     * @return - avaliação física salva
     */
    AvaliacaoFisica save(AvaliacaoFisicaDtoRequest avaliacaoFisicaDtoRequest);

    /**
     * Retorna todos as avaliações físicas salvas
     * @return - todas as avaliações físicas salvas
     */
    List<AvaliacaoFisica> findAll();

    /**
     * Retorna avaliação física pelo id
     * @param id - Id da avaliação física a ser encontrada
     * @return - avaliação física com dados atualizados
     */
    AvaliacaoFisica findByID(Long id);

    /**
     * Atualiza avaliação física pelo id
     * @param avaliacaoFisicaDtoRequest - Dto com os dados para atualizar
     * @param id - Id da avaliação física a ser atualiazada
     * @return - avaliação física com dados atualizados
     */
    AvaliacaoFisica update(AvaliacaoFisicaDtoRequest avaliacaoFisicaDtoRequest, Long id);

    /**
     * Deleta avaliação física pelo id
     * @param id - Id da avaliação física a ser encontrada a ser deletada
     */
    void delete(Long id);
}
