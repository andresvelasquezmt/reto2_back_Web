/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2Web.repositorio;

import Reto2Web.interfaces.InterfaceGadget;
import Reto2Web.modelo.Gadget;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public class GadgetRepositorio {
    
    @Autowired
    private InterfaceGadget repository;

    public List<Gadget> getAll() {
        return repository.findAll();
    }
    
    public Optional<Gadget> getClothe(String reference) {
        return repository.findById(reference);
    
    }

    public Gadget create(Gadget clothe) {
        return repository.save(clothe);
    }

    public void update(Gadget clothe) {
        repository.save(clothe);
    }
    
    public void delete(Gadget clothe) {
        repository.delete(clothe);
    }
    
}
