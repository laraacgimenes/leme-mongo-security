package com.springleme.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springleme.mongo.domain.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String> {

}
