package Grupo.CadastraPessoas_controller;

import java.util.Collection;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Grupo.CadastraPessoas_entity.EntityPessoa;
import Grupo.CadastraPessoas_repository.PessoaRepositiry;
import Grupo.CadastraPessoas_service.PessoaService;

@RestController
@RequestMapping(path = "/pessoa")

public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	@Autowired
	private PessoaRepositiry pessoaRepository;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> post(@RequestBody EntityPessoa pessoa) {
		return pessoaService.save(pessoa) ? new ResponseEntity<Void>(HttpStatus.CREATED)
				: new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}

	@GetMapping
	public ResponseEntity<Collection<EntityPessoa>> getAll() {
		Collection<EntityPessoa> collectionCountry = pessoaRepository.findAll();
		return collectionCountry.size() > 0
				? new ResponseEntity<Collection<EntityPessoa>>(collectionCountry, HttpStatus.OK)
				: new ResponseEntity<>(collectionCountry, HttpStatus.NOT_FOUND);
	}

	

	@DeleteMapping("/pessoa/{id}")
	public ResponseEntity<Void> delete(@RequestBody EntityPessoa pessoa) {
		return pessoaService.deletePessoa(pessoa) ? new ResponseEntity<Void>(HttpStatus.CREATED)
				: new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	

}
