package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import boots.model.Convict;
import boots.dao.ConvictRepository;;

@Service @Transactional
public class ConvictService {
	
	private final ConvictRepository convictRepository;

	public ConvictService(ConvictRepository convictRepository) {
		super();
		this.convictRepository = convictRepository;
	}
	
	public List<Convict> findAll(){
		List<Convict> convicts = new ArrayList<Convict>();
		for (Convict convict : convictRepository.findAll()) {
			convicts.add(convict);
		}
		return convicts;
	}
	
	public void save(Convict convict){
		convictRepository.save(convict);
	}
	
	public void delete(int id){
		convictRepository.delete(id);
	}
	public Convict findOne(int id){
		return convictRepository.findOne(id);
	}
	
}
