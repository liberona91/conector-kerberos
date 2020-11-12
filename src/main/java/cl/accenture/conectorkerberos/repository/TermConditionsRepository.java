package cl.accenture.conectorkerberos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cl.accenture.conectorkerberos.model.TermsConditions;

@Repository
public interface TermConditionsRepository extends MongoRepository<TermsConditions, Long>{

}