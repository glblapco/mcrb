package xyz.blapco.bl.mcrb.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.blapco.bl.mcrb.model.Publication;

public interface PublicationRepository extends CrudRepository<Publication, String> {
    Publication findById(long id);
}
