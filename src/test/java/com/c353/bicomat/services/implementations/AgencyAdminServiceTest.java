package com.c353.bicomat.services.implementations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.c353.bicomat.entities.Client;
import com.c353.bicomat.entities.CompteAgency;
import com.c353.bicomat.services.IAgencyAdminService;

/**
 * 
 * @author ATSOU Komi Bi-Ayéfo
 *
 */
public class AgencyAdminServiceTest {
	
	private IAgencyAdminService agencyAdminService;

	/**
	 * Permet de tester le scénario nominal 
	 * de création d'un compte agency provisoire.
	 * 
	 */
	@Test
	public final void testCreerCompteAgencyProvisoire() {
		
		// Compter le nombre total de comptes provisoires dans la bdd
		int nombreAvant = agencyAdminService.nombreTotalComptesProvisoires();
		
		// Créer un nouveau compte
		CompteAgency c = new CompteAgency();
		
		// Insérer le compte dans la bdd
		agencyAdminService.creerCompteAgencyProvisoire(new Client("nomClient", 1L), 
				"Quel est votre animal préféré?", "Canard");
		
		// Compter à nouveau le nombre de comptes provisoires dans la bdd
		int nombreApres = agencyAdminService.nombreTotalComptesProvisoires();
		
		// Vérifier que le nombre de comptes provisoires a augmenté de 1
		assertThat(nombreApres, is(nombreAvant+1));
		
		// fail("Not yet implemented");
	}

	@Test
	public final void testValiderCompteAgencyProvisoire() {
		fail("Not yet implemented");
	}

	@Test
	public final void testConsulterCompteAgency() {
		fail("Not yet implemented");
	}

	@Test
	public final void testListerComptesAgencyParBanque() {
		fail("Not yet implemented");
	}

}
