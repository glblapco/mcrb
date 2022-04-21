package xyz.blapco.bl.mcrb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.blapco.bl.mcrb.repository.PublicationRepository;

@Controller
public class PublicationController {
    @Autowired
    private PublicationRepository pr;
    @RequestMapping("publication/create")
    public String createPublication() {
        return "publication/create";
    }
}
