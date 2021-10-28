package org.generation.BlogPessoal.Controller;

import java.util.List;

import org.generation.BlogPessoal.model.Postagem;
import org.generation.BlogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens") //define a rota/url
@CrossOrigin("*") //aceita requisição de qualquer origem
public class PostagensController {
    
	@Autowired //garante que todo serviço dessa interface seja acessado pelo controller
    private PostagemRepository repository;

	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}
