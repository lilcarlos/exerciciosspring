package br.com.rd.exerciciospring.Controller;


import br.com.rd.exerciciospring.Model.Cupom;
import br.com.rd.exerciciospring.Services.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class CupomController {

    @Autowired
    CupomService service;


    @GetMapping("/cupom/{id}")
    public Cupom findById(@PathVariable("id") Long idCupom){
        return service.procurarPorId(idCupom);
    }

    @GetMapping("/data/{data}")
    public List<Cupom> buscarData(@PathVariable("data") String data) {
        return service.buscarData(data);
    }

    @PostMapping("/cupom")
    public ResponseEntity salvar(@RequestBody Cupom cupom) {
        return service.save(cupom);
    }

    @GetMapping("/cupom")
    public List<Cupom> buscarTodos(){
        return service.buscar();
    }





}
