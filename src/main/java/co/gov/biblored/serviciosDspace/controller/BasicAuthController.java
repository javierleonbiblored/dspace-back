package co.gov.biblored.serviciosDspace.controller;

import co.gov.biblored.serviciosDspace.dto.AutenticacionDto;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/basicauth")
public class BasicAuthController {

    @GetMapping
    public AutenticacionDto basicauth() {
        return new AutenticacionDto("Usted se ha autenticado");
    }
}