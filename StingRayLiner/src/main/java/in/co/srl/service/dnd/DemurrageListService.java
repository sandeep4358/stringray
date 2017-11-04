package in.co.srl.service.dnd;

import in.co.srl.entity.DemurrageMST;
import in.co.srl.repository.dnd.DemurrageMSTRepository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemurrageListService {

	//@ManagedProperty("#{demurrageMSTRepository}")
	@Autowired
	DemurrageMSTRepository demurrageMSTRepository;

	/**
	 * This will provide the all data present for the demmurage 
	 * @return
	 */
	
	public List<DemurrageMST> getList() {
		return demurrageMSTRepository.findAll();
	}

	public void setDemurrageMSTRepository(DemurrageMSTRepository demurrageMSTRepository) {
		this.demurrageMSTRepository = demurrageMSTRepository;
	}
	
	public void save(){
		DemurrageMST d = new DemurrageMST();
		d.setCurrency("usd");
		d.setEnd_date(new Date());
		d.setStart_date(new Date());
		d.setFreedays("1");
		d.setPort("EGALY");
		d.setTerminals("EGALY");
		d.setTo_status("A");
		demurrageMSTRepository.save(d);
		DemurrageMST d1 = new DemurrageMST();
		d1.setCurrency("usd");
		d1.setEnd_date(new Date());
		d1.setStart_date(new Date());
		d1.setFreedays("1");
		d1.setPort("TRIZM");
		d1.setTerminals("TRIZM");
		d1.setTo_status("A");
		demurrageMSTRepository.save(d1);		
	}
	

}
