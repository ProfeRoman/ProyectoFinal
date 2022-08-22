package com.portfolio.rsf.service;

import com.portfolio.rsf.Model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void save(Persona persona);
}
