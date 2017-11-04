package in.co.srl.controller.dnd;

import in.co.srl.entity.DemurrageMST;
import in.co.srl.service.dnd.DemurrageListService;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@SuppressWarnings("restriction")
@ManagedBean
public class DemurrageListController {

	List<DemurrageMST> list;

	@ManagedProperty("#{demurrageListService}")
	DemurrageListService demurrageListService;

	@PostConstruct
	public void init() {
		System.out.println("*****@PostConstruct*****start*********");
		demurrageListService.save();
		list = demurrageListService.getList();
		System.out.println("checking the size of the list  :: " + list.size());
		for (DemurrageMST demurrageMST : list) {
			System.out.println(demurrageMST);
		}

	}

	public void setDemurrageListService(
			DemurrageListService demurrageListService) {
		this.demurrageListService = demurrageListService;
	}

	public List<DemurrageMST> getList() {
		return list;
	}

	public void setList(List<DemurrageMST> list) {
		this.list = list;
	}
	
	

}
