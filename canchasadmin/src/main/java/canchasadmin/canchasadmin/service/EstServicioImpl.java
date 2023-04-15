package canchasadmin.canchasadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import canchasadmin.canchasadmin.entity.Establecimiento;
import canchasadmin.canchasadmin.repository.EstablecimientoRepository;

public class EstServicioImpl implements EstServicio{

    @Autowired
    private EstablecimientoRepository repository;

    @Override
    public Iterable<Establecimiento> listarEstablecimiento() {
        return repository.findAll();
    }
        
}
