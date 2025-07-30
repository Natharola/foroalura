package alura.foro.api.services;

import alura.foro.api.modelos.Topicos;

import java.util.List;

public interface CRUD {
    // Metodo GET
    List<Topicos> findAll();
    Topicos findByID(Integer id);

    // Metodo POST
    Topicos save(Topicos topicos);

    //Metodo PUT
    Topicos update(Integer id, Topicos topicos);

    //Metodo DELETE
    void deleteById(Integer id);
}