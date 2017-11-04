package in.co.srl.repository;

import in.co.srl.entity.Check;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckRepository extends JpaRepository<Check, Integer> {

	/**
	 * 
	 * @param demurrageMST
	 * @return
	 */
}
