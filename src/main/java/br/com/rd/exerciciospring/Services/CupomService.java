package br.com.rd.exerciciospring.Services;


import br.com.rd.exerciciospring.Model.Cupom;
import br.com.rd.exerciciospring.Repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CupomService {


    @Autowired
    CupomRepository repository;

//    public List<Cupom> buscarId(Long) {
//
//        return repository.findByIdCliente(idcupom);
//    }


    public Cupom procurarPorId (Long idCupom) {
        return repository.findById(idCupom).get();
    }

    public List<Cupom> buscarData(String data) {
        return repository.findByDtVenda(data);
    }

    public ResponseEntity save(Cupom cupom) {
        return ResponseEntity.ok().body(repository.save(cupom));
    }

    public List<Cupom> buscar(){
        return repository.findAll();
    }
}
