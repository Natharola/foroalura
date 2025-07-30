package alura.foro.api.controladores;

import alura.foro.api.modelos.Topicos;
import alura.foro.api.services.TopicoService;
import alura.foro.api.services.TopicoServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
@RequiredArgsConstructor
public class TopicosController {

    private final TopicoService service;

    @GetMapping
    public ResponseEntity<List<Topicos>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topicos> findById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Topicos> save(@Valid @RequestBody Topicos topico) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(topico));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topicos> update(@PathVariable Integer id, @Valid @RequestBody Topicos topico) {
        return service.update(id, topico)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        return service.deleteById(id) ?
                ResponseEntity.noContent().build() :
                ResponseEntity.notFound().build();
    }
}