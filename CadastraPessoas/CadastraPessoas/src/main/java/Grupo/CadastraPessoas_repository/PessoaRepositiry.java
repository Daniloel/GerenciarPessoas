package Grupo.CadastraPessoas_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Grupo.CadastraPessoas_entity.EntityPessoa;



@Repository
public interface PessoaRepositiry extends JpaRepository<EntityPessoa, Long> {

}
