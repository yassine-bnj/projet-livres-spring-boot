package com.yassine.livres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.livres.entities.Livre;
import com.yassine.livres.repos.LivreRepository;


@Service
public class LivreServiceImpl implements LivreService{
    
	@Autowired
	 LivreRepository livreRepository;
	
    
    @Override
	public Livre saveLivre(Livre l) {
    	return livreRepository.save(l);
		
	}

	@Override
	public Livre updateLivre(Livre l) {
		return livreRepository.save(l);
	}

	@Override
	public void deleteLivre(Livre l) {
		this.livreRepository.delete(l);
		
	}

	@Override
	public void deleteLivreById(Long id) {
		this.livreRepository.deleteById(id);;
		
	}

	
	@Override
	public Livre getLivre(Long id) {
		return this.livreRepository.findById(id).get();
		}

	@Override
	public List<Livre> getAllLivres() {
		return this.livreRepository.findAll();
	}
	
	@Override
	public List<Livre> getLivresByTypeID(Long id) {
		return this.livreRepository.findByTypeIdType(id);
	}
	
	@Override
	public List<Livre> getLivresByTitre(String titre) {
		return this.livreRepository.findByTitre(titre);
	}
	@Override
	public List<Livre> getLivresByTitreContains(String titre) {
		return this.livreRepository.findByTitreContains(titre);
	}



}
