package xyz.blapco.mcrb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.blapco.mcrb.model.Publication;
import xyz.blapco.mcrb.repository.PublicationRepository;

@Controller
public class HomepageController {
    @Autowired
    private PublicationRepository publicationRepository;
    @RequestMapping("/")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<Publication> publications = publicationRepository.findAll();
        modelAndView.addObject("publications", publications);
        return modelAndView;
    }
}
