package com.carlosibarra.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.carlosibarra.entities.Nit;
import com.carlosibarra.repositories.NitRepository;
import com.carlosibarra.services.INitService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(path = "/api/nit")
public class MainController {
	
	@Autowired
	private NitRepository nitRepository;
	
	@Autowired
	INitService service;

	@PostMapping(path = "/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Nit create(@RequestBody Nit nit) {
		System.out.println(nit.C_EMP);
		return nitRepository.save(nit);
	}

	@GetMapping(path = "/get")
	public @ResponseBody Iterable<Nit> getAllUsers() {
		return nitRepository.findAll();
	}
	
	@GetMapping(path = "/get/{id}")
    public ResponseEntity<Nit> getNitById(@PathVariable Long id) {
		Optional<Nit> tutorialData = nitRepository.findById(id);

	    if (tutorialData.isPresent()) {
	      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
    }
	

	  @PutMapping("/edit/{id}")
	  public ResponseEntity<Nit> updateNit(@PathVariable("id") long id, @RequestBody Nit nit) {
	    Optional<Nit> _nit = nitRepository.findById(id);

	    if (_nit.isPresent()) {
	    	Nit n = _nit.get();
			n.setC_EMP(nit.C_EMP);
			n.setN_IDE(nit.N_IDE);
			n.setNOM(nit.NOM);
			n.setIDE(nit.IDE);
			n.setDIR(nit.DIR);
			n.setTEL(nit.TEL);
			n.setFAX(nit.FAX);
			n.setTLX(nit.TLX);
			n.setAA(nit.AA);
			n.setEST(nit.EST);
			n.setNOM1(nit.NOM1);
			n.setNOM2(nit.NOM2);
			n.setAPE1(nit.APE1);
			n.setAPE2(nit.APE2);
			n.setDIR_ELECT(nit.DIR_ELECT);
			n.setDIG(nit.DIG);
			n.setTIPO_NIT(nit.TIPO_NIT);
			n.setTIP_CONTRIB(nit.TIP_CONTRIB);
			n.setTIP_TERC(nit.TIP_TERC);
			n.setFECHA(nit.FECHA);
	    	
	      return new ResponseEntity<>(nitRepository.save(n), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

	  @DeleteMapping("/remove/{id}")
	  public ResponseEntity<HttpStatus> deleteNit(@PathVariable("id") long id) {
	    try {
	      nitRepository.deleteById(id);
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

}
