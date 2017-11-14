package co.simplon.PoleEmploi.patrimoine.endpoint;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.simplon.PoleEmploi.patrimoine.endpoint.MonumentResource;
import co.simplon.PoleEmploi.patrimoine.modele.Monument;
import co.simplon.PoleEmploi.patrimoine.dao.MonumentDao;
import co.simplon.PoleEmploi.patrimoine.dao.MonumentMockDao;

public class MonumentResourceTest {

	@Test(expected = IllegalArgumentException.class)
	public void deleteMonumentById_should_throw_IllegalArgumentException_when_id_is_null() {
		// GIVEN
		Long id = null;
		MonumentResource resource = new MonumentResource();
		
		// WHEN
		resource.deleteMonumentById(id);
		
		// THEN
		// donné par expected
	} // deleteMonumentById_should_throw_IllegalArgumentException_when_id_is_null

	@Test()
	public void getMonuments_should_return_DEFAULT_PAGE_SIZE_items_when_from_and_limit_are_both_null() {
		// GIVEN
		MonumentResource resource = new MonumentResource();
		resource.setMonumentDao(new MonumentMockDao());
		
		// WHEN
		List<Monument> monuments = resource.getMonuments(1, null);
		
		// THEN
		assertEquals(MonumentResource.DEFAULT_PAGE_SIZE, monuments.size());
		
	} // getMonuments_should_return_DEFAULT_PAGE_SIZE_items_when_from_and_limit_are_both_null
	
	
} // class MonumentResourceTest
