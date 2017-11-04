package in.co.srl.repository.dnd;

import in.co.srl.entity.DemurrageMST;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface DemurrageMSTRepository extends	JpaRepository<DemurrageMST, Long> {
	/**
	 * 
	 * @param demurrageMST
	 * @return
	 */
	//List<DemurrageMST> findBySelectectDataDemurrageMSTs(DemurrageMST demurrageMST);
	

}
