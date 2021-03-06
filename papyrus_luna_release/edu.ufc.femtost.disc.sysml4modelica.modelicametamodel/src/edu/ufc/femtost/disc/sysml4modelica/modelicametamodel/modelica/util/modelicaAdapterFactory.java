/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.util;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Enumeration;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage
 * @generated
 */
public class modelicaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static modelicaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelicaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = modelicaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected modelicaSwitch<Adapter> modelSwitch =
		new modelicaSwitch<Adapter>() {
			@Override
			public Adapter caseModelicaClassDefinition(ModelicaClassDefinition object) {
				return createModelicaClassDefinitionAdapter();
			}
			@Override
			public Adapter caseClass(edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseRecord(Record object) {
				return createRecordAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter casePackage(edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseDerFunction(DerFunction object) {
				return createDerFunctionAdapter();
			}
			@Override
			public Adapter caseExtendsClause(ExtendsClause object) {
				return createExtendsClauseAdapter();
			}
			@Override
			public Adapter caseModelicaModel(ModelicaModel object) {
				return createModelicaModelAdapter();
			}
			@Override
			public Adapter caseModelicaComponent(ModelicaComponent object) {
				return createModelicaComponentAdapter();
			}
			@Override
			public Adapter caseModelicaValueProperty(ModelicaValueProperty object) {
				return createModelicaValuePropertyAdapter();
			}
			@Override
			public Adapter caseModelicaPart(ModelicaPart object) {
				return createModelicaPartAdapter();
			}
			@Override
			public Adapter caseModelicaPort(ModelicaPort object) {
				return createModelicaPortAdapter();
			}
			@Override
			public Adapter caseEquation(Equation object) {
				return createEquationAdapter();
			}
			@Override
			public Adapter caseConnect(Connect object) {
				return createConnectAdapter();
			}
			@Override
			public Adapter caseEquationSection(EquationSection object) {
				return createEquationSectionAdapter();
			}
			@Override
			public Adapter caseModelicaFunctionParameter(ModelicaFunctionParameter object) {
				return createModelicaFunctionParameterAdapter();
			}
			@Override
			public Adapter caseAlgorithmSection(AlgorithmSection object) {
				return createAlgorithmSectionAdapter();
			}
			@Override
			public Adapter caseConstrainedByClause(ConstrainedByClause object) {
				return createConstrainedByClauseAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseAlgorithm(Algorithm object) {
				return createAlgorithmAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition <em>Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition
	 * @generated
	 */
	public Adapter createModelicaClassDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction <em>Der Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction
	 * @generated
	 */
	public Adapter createDerFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause <em>Extends Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause
	 * @generated
	 */
	public Adapter createExtendsClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel <em>Modelica Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel
	 * @generated
	 */
	public Adapter createModelicaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent <em>Modelica Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent
	 * @generated
	 */
	public Adapter createModelicaComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty <em>Modelica Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty
	 * @generated
	 */
	public Adapter createModelicaValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart <em>Modelica Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart
	 * @generated
	 */
	public Adapter createModelicaPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort <em>Modelica Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort
	 * @generated
	 */
	public Adapter createModelicaPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation
	 * @generated
	 */
	public Adapter createEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect
	 * @generated
	 */
	public Adapter createConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection <em>Equation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection
	 * @generated
	 */
	public Adapter createEquationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter <em>Modelica Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter
	 * @generated
	 */
	public Adapter createModelicaFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection <em>Algorithm Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection
	 * @generated
	 */
	public Adapter createAlgorithmSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause <em>Constrained By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause
	 * @generated
	 */
	public Adapter createConstrainedByClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm
	 * @generated
	 */
	public Adapter createAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //modelicaAdapterFactory
