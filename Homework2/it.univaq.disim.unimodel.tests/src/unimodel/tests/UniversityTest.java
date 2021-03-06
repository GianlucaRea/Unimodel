/**
 */
package unimodel.tests;

import junit.textui.TestRunner;

import unimodel.UnimodelFactory;
import unimodel.University;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityTest extends NamedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniversityTest.class);
	}

	/**
	 * Constructs a new University test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this University test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected University getFixture() {
		return (University)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnimodelFactory.eINSTANCE.createUniversity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UniversityTest
