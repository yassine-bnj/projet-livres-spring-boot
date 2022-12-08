package com.yassine.livres.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.livres.entities.Type;

public interface TypeRepository extends JpaRepository<Type,Long>{
	
}
