package br.com.fiap.pettech.pettech.entrypoint.controller;

import br.com.fiap.pettech.pettech.dataprovider.repository.entity.Ong;
import br.com.fiap.pettech.pettech.services.OngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ongs")
public class OngController {
    @Autowired
    private OngService ongService;

    @GetMapping
    public List<Ong> listarTodos() {
        return ongService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ong> buscarPorId(@PathVariable Long id) {
        Optional<Ong> existe = ongService.findById(id);
        return existe.isPresent() ? ResponseEntity.ok(existe.get())
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Ong> inserir(@RequestBody Ong obj) {
        return ResponseEntity.ok(ongService.save(obj));
    }


}
