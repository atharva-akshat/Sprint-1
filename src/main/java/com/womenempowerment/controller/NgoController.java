package com.womenempowerment.controller;

import com.womenempowerment.dto.INgoDto;
import com.womenempowerment.entity.NGO;
import com.womenempowerment.exception.NGOAlreadyExistsException;
import com.womenempowerment.exception.NGONotFoundException;
import com.womenempowerment.service.INGOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ngo")
public class NgoController {

    @Autowired
    INGOService ngoservice;

    @PostMapping("/add")
    public ResponseEntity<String> addNgo(@RequestBody INgoDto dto) {
        if (ngoservice.viewNGO(dto.getNgoId()) != null)
            throw new NGOAlreadyExistsException();
        ngoservice.addNGO(dto);
        return new ResponseEntity<>("Ngo Added!", HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateNgo(@RequestBody INgoDto dto) {
        if (ngoservice.viewNGO(dto.getNgoId()) == null)
            throw new NGONotFoundException();
        ngoservice.updateNGO(dto);
        return new ResponseEntity<>("Ngo Updated!", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> getAllNgo() {
        List<NGO> ngo = ngoservice.viewAllNGO();
        if (ngo.isEmpty())
            throw new NGONotFoundException();
        return new ResponseEntity<>(ngo.toString(), HttpStatus.OK);
    }

    @GetMapping("/viewById/{id}")
    public ResponseEntity<String> getNgoById(@PathVariable int id) {
        NGO ngo = ngoservice.viewNGO(id);
        if (ngo == null)
            throw new NGONotFoundException();
        return new ResponseEntity<>(ngo.toString(), HttpStatus.OK);
    }

    @GetMapping("/viewByLocation/{location}")
    public ResponseEntity<String> getNgoByLocation(@PathVariable String location) {
        List<NGO> ngo = ngoservice.viewNGOByLocation(location);
        if (ngo.isEmpty())
            throw new NGONotFoundException();
        return new ResponseEntity<>(ngo.toString(), HttpStatus.OK);
    }

    @GetMapping("/viewByMotive/{motive}")
    public ResponseEntity<String> getNgoByMotive(@PathVariable String motive) {
        List<NGO> ngo = ngoservice.viewNGOByMotive(motive);
        if (ngo.isEmpty())
            throw new NGONotFoundException();
        return new ResponseEntity<>(ngo.toString(), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteNGO(@RequestBody int ngoId) {
        if (ngoservice.viewNGO(ngoId) == null)
            throw new NGONotFoundException();
        ngoservice.deleteNGO(ngoId);
        return new ResponseEntity<>("Ngo deleted", HttpStatus.OK);
    }
}
