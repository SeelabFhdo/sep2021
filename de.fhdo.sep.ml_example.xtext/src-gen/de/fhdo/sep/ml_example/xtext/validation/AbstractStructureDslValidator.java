/*
 * generated by Xtext 2.21.0
 */
package de.fhdo.sep.ml_example.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractStructureDslValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("de.fhdo.sep.ml_example"));
		return result;
	}
}
