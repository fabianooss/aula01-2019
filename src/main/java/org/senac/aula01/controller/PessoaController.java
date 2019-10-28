package org.senac.aula01.controller;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.senac.aula01.domain.Pessoa;
import org.senac.aula01.domain.Sexo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@GetMapping
	public List<Pessoa> getPessoas() {
		Pessoa p = new Pessoa();
		p.setId(1);
		p.setNome("Fabiano");
		p.setDataNascimento(LocalDate.of(1979, 06, 30));
		p.setSexo(Sexo.MASCULINO);
		p.setRenda(new BigDecimal(1_000));
				
		return Arrays.asList(p);
	}
	
	@PostMapping
	public void save(@RequestBody Pessoa pessoa) {
		//validar 
		//calcular 
		//gravar no banco dados
		System.out.println(pessoa.getNome());		
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable("id") Integer id, @RequestBody Pessoa pessoa) {
		System.out.println(id);
		System.out.println(pessoa.getNome());
	}	
	
	@GetMapping("/{id}")
	public Pessoa getPessoa(@PathVariable("id") Integer id) {
		Pessoa p = new Pessoa();
		p.setId(id);
		return p;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		//executar o delete
	}
	


}
