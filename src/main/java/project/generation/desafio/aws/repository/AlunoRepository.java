package project.generation.desafio.aws.repository;

import org.springframework.data.repository.CrudRepository;
import project.generation.desafio.aws.model.AlunoModel;

public interface AlunoRepository extends CrudRepository<AlunoModel,Integer> {

}
