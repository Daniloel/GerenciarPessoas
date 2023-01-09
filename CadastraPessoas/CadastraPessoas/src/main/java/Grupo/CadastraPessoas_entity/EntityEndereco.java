package Grupo.CadastraPessoas_entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity

public class EntityEndereco {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String logradouro;
	private String cidade;
	private String numero;
	private String cep;

}
