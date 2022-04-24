package xyz.blapco.bl.mcrb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.blapco.bl.mcrb.model.Publication;
import xyz.blapco.bl.mcrb.repository.PublicationRepository;

@Controller
public class PublicationController {
//@@@ TODO (Biel Polastrini): Get current datetime before storing the data.
    @Autowired
    private PublicationRepository publicationRepository;
    @RequestMapping(value = "publication/create", method = RequestMethod.GET)
    public String getPublication() {

        return "publication/create";
    }

    @RequestMapping(value = "publication/create", method = RequestMethod.POST)
    public String createPublication(Publication publication) {
        publicationRepository.save(publication);
        return "redirect:/publication/create";
    }
}
