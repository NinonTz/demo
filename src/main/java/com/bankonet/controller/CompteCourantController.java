package com.bankonet.controller;

import com.bankonet.entity.Client;
import com.bankonet.entity.CompteCourant;
import com.bankonet.repository.ClientRepository;
import com.bankonet.repository.CompteCourantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/compteCourant") // This means URL's start with /demo (after Application path)
public class CompteCourantController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private CompteCourantRepository compteCourantRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewCompteCourant(@RequestParam String numero,
            @RequestParam String intitule, @RequestParam double solde,
                                                    @RequestParam double montantDecouvertAutorise) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        CompteCourant c = new CompteCourant();
        c.setIntitule(intitule);
        c.setMontantDecouvertAutorise(montantDecouvertAutorise);
        c.setNumero(numero);
        c.setSolde(solde);
        compteCourantRepository.save(c);
        return  "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<CompteCourant> getAllComptesCourants() {
        // This returns a JSON or XML with the users
        return compteCourantRepository.findAll();
    }
}
