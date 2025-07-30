package alura.foro.api.repositorios;

import alura.foro.api.modelos.Topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicoRepositorio extends JpaRepository<Topicos, Integer> {
    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}