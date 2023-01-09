package Grupo.CadastraPessoas_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import Grupo.CadastraPessoas_entity.EntityPessoa;
import Grupo.CadastraPessoas_repository.PessoaRepositiry;


@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepositiry pessoaRepository;
	
	public boolean save(final EntityPessoa pessoa) {
		EntityPessoa savePessoa = pessoaRepository.save(pessoa);
		return savePessoa != null && savePessoa.getId() != null;
	}

	
	
	public boolean deletePessoa(@PathVariable EntityPessoa pessoa) {
		pessoaRepository.delete(pessoa);
		return true;
	}

	
	
}
