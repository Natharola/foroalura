package alura.foro.api.services;

import alura.foro.api.modelos.Topicos;

import java.util.List;
import java.util.Optional;

public interface TopicoService {
    List<Topicos> findAll();
    Optional<Topicos> findById(Integer id);
    Topicos save(Topicos topico);
    Optional<Topicos> update(Integer id, Topicos topico);
    boolean deleteById(Integer id);
}