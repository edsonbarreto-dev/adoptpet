package br.com.adoptpet.entrypoint.controller;

import br.com.adoptpet.core.usecase.funcionario.impl.BuscaFuncionarioUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EmployeeController {
    @Autowired
    private BuscaFuncionarioUseCaseImpl funcionarioUseCaseImpl;

 /*   @GetMapping
    public List<EnderecoEntity> listarTodos() {
        return enderecoService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoEntity> buscarPorId(@PathVariable Long id) {
        Optional<EnderecoEntity> existe = enderecoService.findById(id);
        return existe.isPresent() ? ResponseEntity.ok(existe.get())
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<EnderecoEntity> inserir(@RequestBody EnderecoEntity obj) {
        return ResponseEntity.ok(enderecoService.save(obj));
    }
*/

}
