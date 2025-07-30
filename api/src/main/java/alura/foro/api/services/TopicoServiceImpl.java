package alura.foro.api.services;

import alura.foro.api.modelos.Topicos;
import alura.foro.api.repositorios.ITopicoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TopicoServiceImpl implements TopicoService {

    private final ITopicoRepositorio repositorio;

    @Override
    public List<Topicos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Topicos> findById(Integer id) {
        return repositorio.findById(id);
    }

    @Override
    public Topicos save(Topicos topico) {
        if (repositorio.existsByTituloAndMensaje(topico.getTitulo(), topico.getMensaje())) {
            throw new IllegalArgumentException("Tópico duplicado");
        }
        return repositorio.save(topico);
    }

    @Override
    public Optional<Topicos> update(Integer id, Topicos topico) {
        return repositorio.findById(id).map(existing -> {
            topico.setId(id);
            return repositorio.save(topico);
        });
    }

    @Override
    public boolean deleteById(Integer id) {
        if (repositorio.existsById(id)) {
            repositorio.deleteById(id);
            return true;
        }
        return false;
    }
}
