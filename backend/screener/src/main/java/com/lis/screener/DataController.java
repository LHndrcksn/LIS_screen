package com.lis.screener;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DataController {

    private final LegislatorRepository legislatorRepository;
    private final LegislationRepository legislationRepository;

    public DataController(LegislatorRepository legislatorRepository, LegislationRepository legislationRepository) {
        this.legislatorRepository = legislatorRepository;
        this.legislationRepository = legislationRepository;
    }

    @GetMapping("/legislators")
    public List<Legislator> getData() {
        List<Legislator> result = new ArrayList();
        legislatorRepository.findAll().forEach(result::add);
        return result;
    }

    @GetMapping("/legislation")
    public List<Legislation> getAllLegislation() {
        List<Legislation> result = new ArrayList();
        legislationRepository.findAll().forEach(result::add);
        return result;
    }

    @PostMapping("/legislators")
    public String receiveJsonData(@RequestBody Legislator legislator) {
        System.out.println("Received name: " + legislator.getFirstName());
        legislatorRepository.save(legislator);
        return "Success";
    }

    @PostMapping("/legislation")
    public String receiveJsonData(@RequestBody Legislation legislation) {
        System.out.println("Received sponsors: " + legislation.getSponsors());
        legislationRepository.save(legislation);
        return "Success";
    }
}
