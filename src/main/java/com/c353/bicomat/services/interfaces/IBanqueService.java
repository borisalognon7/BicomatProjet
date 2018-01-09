package com.c353.bicomat.services.interfaces;

import java.util.List;

import com.c353.bicomat.entities.Banque;

/**
 * 
 * @author DINAH Aladji Jérémie
 *
 */
public interface IBanqueService {
	
	public Banque saveBanque(Banque banque);

	public Banque updateBanque(Banque banque);

	public void deleteBanque(Banque banque);

	public List<Banque> findAllBanque();

	public Banque getUneBanque(Integer id);

}
