/*
 * generated by Xtext 2.21.0
 */
package de.fhdo.sep.ml_example.xtext.serializer;

import com.google.inject.Inject;
import de.fhdo.sep.ml_example.Attribute;
import de.fhdo.sep.ml_example.Context;
import de.fhdo.sep.ml_example.Ml_examplePackage;
import de.fhdo.sep.ml_example.Structure;
import de.fhdo.sep.ml_example.xtext.services.StructureDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class StructureDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StructureDslGrammarAccess grammarAccess;

	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Ml_examplePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Ml_examplePackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject);
				return;
			case Ml_examplePackage.CONTEXT:
				sequence_Context(context, (Context) semanticObject);
				return;
			case Ml_examplePackage.STRUCTURE:
				sequence_Structure(context, (Structure) semanticObject);
				return;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}

	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Ml_examplePackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ml_examplePackage.Literals.ATTRIBUTE__TYPE));
			if (transientValues.isValueTransient(semanticObject, Ml_examplePackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ml_examplePackage.Literals.ATTRIBUTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}


	/**
	 * Contexts:
	 *     Context returns Context
	 *
	 * Constraint:
	 *     (name=ID structures+=Structure+)
	 */
	protected void sequence_Context(ISerializationContext context, Context semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}


	/**
	 * Contexts:
	 *     Structure returns Structure
	 *
	 * Constraint:
	 *     (name=ID attributes+=Attribute attributes+=Attribute*)
	 */
	protected void sequence_Structure(ISerializationContext context, Structure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}


}
