package in.co.srl.service;

import in.co.srl.entity.Check;
import in.co.srl.repository.CheckRepository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("restriction")
public class InitDbService {
	@Autowired
	private CheckRepository checkRepository;

	@PostConstruct
	public void init() {
		Check check = new Check();
		check.setName("example");
		check.setUrl("http://www.example.com");
		checkRepository.save(check);
	}
}
