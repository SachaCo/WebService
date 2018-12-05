import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import model.Country;

@RepositoryRestResource(collectionResourceRel="country",path="/country")
public interface CountryRepository extends CrudRepository<Country, Long> {
	List<Country> findAll();
}



