package canchasadmin.canchasadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import canchasadmin.canchasadmin.entity.Canchas;
import canchasadmin.canchasadmin.repository.CanchasRepository;

@Service
public class canchasServiceImpl implements  CanchasServicio{

    @Autowired 
    CanchasRepository canchasRepository;

    @Override
    public List<Canchas> listarCanchas() {

        return (List<Canchas>) canchasRepository.findAll();
    }

    
    
}
