import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Country;

@RestController
public class MyController {
	
	@Autowired
	CountryRepository countryRepository;

	
    @RequestMapping("/country")
    public @ResponseBody List<Country> countryList() {
    	return countryRepository.findAll();
    }
	
}


