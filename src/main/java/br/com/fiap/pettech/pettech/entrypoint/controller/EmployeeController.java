package br.com.fiap.pettech.pettech.entrypoint.controller;

import br.com.fiap.pettech.pettech.core.usecase.impl.BuscaFuncionarioPorIdUseCaseImpl;
import br.com.fiap.pettech.pettech.dataprovider.repository.entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/endereco")
public class EmployeeController {
    @Autowired
    private BuscaFuncionarioPorIdUseCaseImpl funcionarioUseCaseImpl;

 /*   @GetMapping
    public List<Endereco> listarTodos() {
        return enderecoService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> buscarPorId(@PathVariable Long id) {
        Optional<Endereco> existe = enderecoService.findById(id);
        return existe.isPresent() ? ResponseEntity.ok(existe.get())
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Endereco> inserir(@RequestBody Endereco obj) {
        return ResponseEntity.ok(enderecoService.save(obj));
    }
*/

}
