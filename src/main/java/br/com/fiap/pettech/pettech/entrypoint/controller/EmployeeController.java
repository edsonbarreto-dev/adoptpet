package br.com.fiap.pettech.pettech.entrypoint.controller;

import br.com.fiap.pettech.pettech.core.usecase.funcionario.impl.BuscaFuncionarioPorIdUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
