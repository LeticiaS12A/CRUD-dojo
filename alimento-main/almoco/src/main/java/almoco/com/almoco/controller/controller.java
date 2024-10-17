package almoco.com.almoco.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import almoco.com.almoco.DTO.DTO;
import almoco.com.almoco.Model.Model;
import almoco.com.almoco.repository.repository;

@RestController
@RequestMapping
public class controller {

	@Autowired
	repository repository;
	
	@PostMapping("/cadastrar")
	public ResponseEntity <?>salvarUsuario(@RequestBody DTO user) {
		
		Model usuario = new Model (user);
		repository.save(usuario);
		return ResponseEntity.ok("usuario cadastrado");
		
		}
	
	
	@GetMapping("/mostrar")
	public List<Model> mostrar(){	
		List<Model> lista = repository.findAll();
		return lista;
	}
	
	@PutMapping("/id")
    public ResponseEntity<?> alterarAlmoco(@PathVariable UUID idalimento, @RequestBody Model mo) {
        Optional<Model> optionalModel = repository.findById(idalimento);
        if (!optionalModel.isPresent()) {
            return ResponseEntity.notFound().build();
        }return ResponseEntity.ok("Alterado com sucesso");

    }
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModel(@PathVariable UUID idalimento) {
        if (!repository.existsById(idalimento)) {
            return ResponseEntity.notFound().build();
        }

        repository.deleteById(idalimento);
        return ResponseEntity.noContent().build();
    }
	
	
}
