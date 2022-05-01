package xyz.blapco.bl.mcrb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.blapco.bl.mcrb.model.Publication;
import xyz.blapco.bl.mcrb.repository.PublicationRepository;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Controller
public class PublicationController {
    @Autowired
    private PublicationRepository publicationRepository;
    @RequestMapping(value = "publication/create", method = RequestMethod.GET)
    public String getCreatePublicationPage() { return "publication/create"; }

    @RequestMapping(value = "publication/create", method = RequestMethod.POST)
    public String storePublication(Publication publication) {
        publication.setPubDate(DateTimeFormatter
                        .ofPattern("yyyy/MM/dd HH:mm:ss")
                        .format(LocalDateTime.now(ZoneId.of("UTC"))));
        publicationRepository.save(publication);
        return "redirect:/";
    }
}
