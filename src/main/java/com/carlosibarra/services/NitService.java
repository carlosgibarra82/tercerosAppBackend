package com.carlosibarra.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosibarra.entities.Nit;
import com.carlosibarra.repositories.NitRepository;

@Service
public class NitService implements INitService {
	
	@Autowired
	private NitRepository nitRepository;

	@Override
	public Nit findById(Long id) {
		return nitRepository.getOne(id);
	}

}
