package xyz.blapco.bl.mcrb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicationController {
    @RequestMapping("publication/create")
    public String createPublication() {
        return "publication/create";
    }
}
