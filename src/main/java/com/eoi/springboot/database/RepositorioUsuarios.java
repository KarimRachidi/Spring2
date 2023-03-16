package com.eoi.springboot.database;

import com.eoi.springboot.entidades.EntidadUsuario;

public interface RepositorioUsuarios {
    Iterable<EntidadUsuario> findAll();

    void save(EntidadUsuario n);
}
