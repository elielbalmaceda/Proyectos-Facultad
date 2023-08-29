package com.prueba.crud.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prueba.crud.model.Persona;
import com.prueba.crud.repository.PersonaRepository;

@Service
public class PersonaServiceimpl implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona newPerson(Persona newPerson) {
        return personaRepository.save(newPerson);
    }

    @Override
    public Iterable<Persona> getAll() {
        return this.personaRepository.findAll();
    }

    @Override
    public Persona modifiyPerson(Persona persona) {
        Optional<Persona> personEncontrada = this.personaRepository.findById(persona.getNumDocumento());
        if(personEncontrada.get() != null){
            personEncontrada.get().setNombre(persona.getNombre()); 
            personEncontrada.get().setApellido(persona.getApellido());
            personEncontrada.get().setCorreoElectronico(persona.getCorreoElectronico());
            return this.newPerson(personEncontrada.get());
        }
        return null;
    }

    @Override
    public Boolean deletePerson(Long idPersona) {
        this.personaRepository.deleteById(idPersona);
        return true;
    }
        
}
