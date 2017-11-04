package in.co.srl.repository.dnd;

import java.util.List;

import in.co.srl.entity.DemurrageMST;

import org.springframework.data.repository.Repository;

/**
 * 
 * @author sandy this will be the base repository from which other repository
 *         will be extends
 */

public interface BaseRepository extends Repository<DemurrageMST, Integer> {
	/**
	 * 
	 */
	void delete();

	/**
	 * 
	 * @return
	 */
	List<DemurrageMST> findAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	DemurrageMST findOne(int id);

	/**
	 * 
	 * @param demurrageMST
	 */
	void save(DemurrageMST demurrageMST);

}
