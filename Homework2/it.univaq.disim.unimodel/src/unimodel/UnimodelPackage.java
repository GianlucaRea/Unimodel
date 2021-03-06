/**
 */
package unimodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see unimodel.UnimodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface UnimodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unimodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim/unimodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unimodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnimodelPackage eINSTANCE = unimodel.impl.UnimodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link unimodel.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.NamedImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unimodel.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.UniversityImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Chancellor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__CHANCELLOR = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__DESCRIPTION = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__BUILDINGS = NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unimodel.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.BuildingImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__DESCRIPTION = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ADDRESS = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LIBRARY = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Floors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__FLOORS = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unimodel.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.AddressImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 2;

	/**
	 * The feature id for the '<em><b>Post code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POST_CODE = 3;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 4;

	/**
	 * The feature id for the '<em><b>Civic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CIVIC = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = 6;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PHONE = 7;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Postcode length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS___POSTCODE_LENGTH__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Id number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS___ID_NUMBER__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Phone length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS___PHONE_LENGTH__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link unimodel.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.LibraryImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Workstations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__WORKSTATIONS = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Computers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__COMPUTERS = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BOOKS = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LOANS = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PERSON = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Workstation positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___WORKSTATION_POSITIVE__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Computers positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY___COMPUTERS_POSITIVE__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link unimodel.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.BookImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__QUANTITY = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ISBN = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHOR = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__LIBRARY = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Loans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__LOANS = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Book Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK___IS_BOOK_AVAILABLE = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Quantity positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK___QUANTITY_POSITIVE__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>ISBN legth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK___ISBN_LEGTH__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Sufficient Copies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK___SUFFICIENT_COPIES__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = NAMED_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link unimodel.impl.LoanImpl <em>Loan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.LoanImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getLoan()
	 * @generated
	 */
	int LOAN = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__DATE = 0;

	/**
	 * The feature id for the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__BOOK = 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__PERSON = 2;

	/**
	 * The number of structural features of the '<em>Loan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Loan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unimodel.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.FloorImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__ROOMS = 1;

	/**
	 * The feature id for the '<em><b>Bathrooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__BATHROOMS = 2;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Bathroom positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___BATHROOM_POSITIVE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link unimodel.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.RoomImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DIMENSION = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sockets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SOCKETS = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Sockets positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___SOCKETS_POSITIVE__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link unimodel.impl.OfficeImpl <em>Office</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.OfficeImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getOffice()
	 * @generated
	 */
	int OFFICE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE__DIMENSION = ROOM__DIMENSION;

	/**
	 * The feature id for the '<em><b>Sockets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE__SOCKETS = ROOM__SOCKETS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE__TYPE = ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE__CAPACITY = ROOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Person in office</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE__PERSON_IN_OFFICE = ROOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Office address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE__OFFICE_ADDRESS = ROOM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE__PHONE = ROOM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Office</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_FEATURE_COUNT = ROOM_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Sockets positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE___SOCKETS_POSITIVE__DIAGNOSTICCHAIN_MAP = ROOM___SOCKETS_POSITIVE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Person In Office</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE___GET_PERSON_IN_OFFICE = ROOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Capacity positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE___CAPACITY_POSITIVE__DIAGNOSTICCHAIN_MAP = ROOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Person in office constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE___PERSON_IN_OFFICE_CONSTRAINT__DIAGNOSTICCHAIN_MAP = ROOM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Office</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFICE_OPERATION_COUNT = ROOM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link unimodel.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.ClassImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DIMENSION = ROOM__DIMENSION;

	/**
	 * The feature id for the '<em><b>Sockets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SOCKETS = ROOM__SOCKETS;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SEATS = ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blackboards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BLACKBOARDS = ROOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Speakers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SPEAKERS = ROOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Computers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMPUTERS = ROOM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = ROOM_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Sockets positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___SOCKETS_POSITIVE__DIAGNOSTICCHAIN_MAP = ROOM___SOCKETS_POSITIVE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Seats positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___SEATS_POSITIVE__DIAGNOSTICCHAIN_MAP = ROOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Blackboards positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___BLACKBOARDS_POSITIVE__DIAGNOSTICCHAIN_MAP = ROOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Speakers positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___SPEAKERS_POSITIVE__DIAGNOSTICCHAIN_MAP = ROOM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = ROOM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link unimodel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.impl.PersonImpl
	 * @see unimodel.impl.UnimodelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CATEGORY = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Badge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BADGE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fiscal code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FISCAL_CODE = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LIBRARY = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Loans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOANS = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Books</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BOOKS = NAMED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAMED_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Fiscal code length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FISCAL_CODE_LENGTH__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Age lower bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___AGE_LOWER_BOUND__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Age upper bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___AGE_UPPER_BOUND__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = NAMED_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link unimodel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.Type
	 * @see unimodel.impl.UnimodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 12;

	/**
	 * The meta object id for the '{@link unimodel.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unimodel.Category
	 * @see unimodel.impl.UnimodelPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 13;


	/**
	 * Returns the meta object for class '{@link unimodel.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see unimodel.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.University#getChancellor <em>Chancellor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chancellor</em>'.
	 * @see unimodel.University#getChancellor()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Chancellor();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.University#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see unimodel.University#getDescription()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link unimodel.University#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildings</em>'.
	 * @see unimodel.University#getBuildings()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Buildings();

	/**
	 * Returns the meta object for class '{@link unimodel.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see unimodel.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unimodel.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link unimodel.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see unimodel.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Building#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see unimodel.Building#getDescription()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Description();

	/**
	 * Returns the meta object for the containment reference '{@link unimodel.Building#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see unimodel.Building#getAddress()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Address();

	/**
	 * Returns the meta object for the containment reference '{@link unimodel.Building#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see unimodel.Building#getLibrary()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Library();

	/**
	 * Returns the meta object for the containment reference list '{@link unimodel.Building#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floors</em>'.
	 * @see unimodel.Building#getFloors()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Floors();

	/**
	 * Returns the meta object for class '{@link unimodel.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see unimodel.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see unimodel.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see unimodel.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see unimodel.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Address#getPost_code <em>Post code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post code</em>'.
	 * @see unimodel.Address#getPost_code()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Post_code();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see unimodel.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Address#getCivic <em>Civic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Civic</em>'.
	 * @see unimodel.Address#getCivic()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Civic();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Address#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see unimodel.Address#getId()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Id();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Address#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see unimodel.Address#getPhone()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Phone();

	/**
	 * Returns the meta object for the '{@link unimodel.Address#id_number(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id number</em>' operation.
	 * @see unimodel.Address#id_number(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAddress__Id_number__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Address#phone_length(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Phone length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Phone length</em>' operation.
	 * @see unimodel.Address#phone_length(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAddress__Phone_length__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Address#postcode_length(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Postcode length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Postcode length</em>' operation.
	 * @see unimodel.Address#postcode_length(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAddress__Postcode_length__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link unimodel.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see unimodel.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Library#getWorkstations <em>Workstations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workstations</em>'.
	 * @see unimodel.Library#getWorkstations()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Workstations();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Library#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computers</em>'.
	 * @see unimodel.Library#getComputers()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Computers();

	/**
	 * Returns the meta object for the containment reference list '{@link unimodel.Library#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Books</em>'.
	 * @see unimodel.Library#getBooks()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Books();

	/**
	 * Returns the meta object for the containment reference list '{@link unimodel.Library#getLoans <em>Loans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loans</em>'.
	 * @see unimodel.Library#getLoans()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Loans();

	/**
	 * Returns the meta object for the containment reference list '{@link unimodel.Library#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see unimodel.Library#getPerson()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Person();

	/**
	 * Returns the meta object for the '{@link unimodel.Library#workstation_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Workstation positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Workstation positive</em>' operation.
	 * @see unimodel.Library#workstation_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLibrary__Workstation_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Library#computers_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Computers positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Computers positive</em>' operation.
	 * @see unimodel.Library#computers_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLibrary__Computers_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link unimodel.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see unimodel.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Book#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see unimodel.Book#getQuantity()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Book#getISBN <em>ISBN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISBN</em>'.
	 * @see unimodel.Book#getISBN()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_ISBN();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see unimodel.Book#getAuthor()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Author();

	/**
	 * Returns the meta object for the container reference '{@link unimodel.Book#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see unimodel.Book#getLibrary()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Library();

	/**
	 * Returns the meta object for the reference list '{@link unimodel.Book#getLoans <em>Loans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loans</em>'.
	 * @see unimodel.Book#getLoans()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Loans();

	/**
	 * Returns the meta object for the '{@link unimodel.Book#isBookAvailable() <em>Is Book Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Book Available</em>' operation.
	 * @see unimodel.Book#isBookAvailable()
	 * @generated
	 */
	EOperation getBook__IsBookAvailable();

	/**
	 * Returns the meta object for the '{@link unimodel.Book#quantity_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Quantity positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quantity positive</em>' operation.
	 * @see unimodel.Book#quantity_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBook__Quantity_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Book#ISBN_legth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>ISBN legth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>ISBN legth</em>' operation.
	 * @see unimodel.Book#ISBN_legth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBook__ISBN_legth__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Book#SufficientCopies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Sufficient Copies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sufficient Copies</em>' operation.
	 * @see unimodel.Book#SufficientCopies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBook__SufficientCopies__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link unimodel.Loan <em>Loan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loan</em>'.
	 * @see unimodel.Loan
	 * @generated
	 */
	EClass getLoan();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Loan#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see unimodel.Loan#getDate()
	 * @see #getLoan()
	 * @generated
	 */
	EAttribute getLoan_Date();

	/**
	 * Returns the meta object for the reference '{@link unimodel.Loan#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Book</em>'.
	 * @see unimodel.Loan#getBook()
	 * @see #getLoan()
	 * @generated
	 */
	EReference getLoan_Book();

	/**
	 * Returns the meta object for the reference '{@link unimodel.Loan#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see unimodel.Loan#getPerson()
	 * @see #getLoan()
	 * @generated
	 */
	EReference getLoan_Person();

	/**
	 * Returns the meta object for class '{@link unimodel.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see unimodel.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Floor#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see unimodel.Floor#getNumber()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link unimodel.Floor#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see unimodel.Floor#getRooms()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Rooms();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Floor#getBathrooms <em>Bathrooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bathrooms</em>'.
	 * @see unimodel.Floor#getBathrooms()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_Bathrooms();

	/**
	 * Returns the meta object for the '{@link unimodel.Floor#bathroom_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Bathroom positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bathroom positive</em>' operation.
	 * @see unimodel.Floor#bathroom_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFloor__Bathroom_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link unimodel.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see unimodel.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Room#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see unimodel.Room#getDimension()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Room#getSockets <em>Sockets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sockets</em>'.
	 * @see unimodel.Room#getSockets()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Sockets();

	/**
	 * Returns the meta object for the '{@link unimodel.Room#sockets_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Sockets positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sockets positive</em>' operation.
	 * @see unimodel.Room#sockets_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__Sockets_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link unimodel.Office <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Office</em>'.
	 * @see unimodel.Office
	 * @generated
	 */
	EClass getOffice();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Office#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see unimodel.Office#getType()
	 * @see #getOffice()
	 * @generated
	 */
	EAttribute getOffice_Type();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Office#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see unimodel.Office#getCapacity()
	 * @see #getOffice()
	 * @generated
	 */
	EAttribute getOffice_Capacity();

	/**
	 * Returns the meta object for the containment reference list '{@link unimodel.Office#getPerson_in_office <em>Person in office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person in office</em>'.
	 * @see unimodel.Office#getPerson_in_office()
	 * @see #getOffice()
	 * @generated
	 */
	EReference getOffice_Person_in_office();

	/**
	 * Returns the meta object for the reference '{@link unimodel.Office#getOffice_address <em>Office address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Office address</em>'.
	 * @see unimodel.Office#getOffice_address()
	 * @see #getOffice()
	 * @generated
	 */
	EReference getOffice_Office_address();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Office#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see unimodel.Office#getPhone()
	 * @see #getOffice()
	 * @generated
	 */
	EAttribute getOffice_Phone();

	/**
	 * Returns the meta object for the '{@link unimodel.Office#getPersonInOffice() <em>Get Person In Office</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Person In Office</em>' operation.
	 * @see unimodel.Office#getPersonInOffice()
	 * @generated
	 */
	EOperation getOffice__GetPersonInOffice();

	/**
	 * Returns the meta object for the '{@link unimodel.Office#capacity_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Capacity positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Capacity positive</em>' operation.
	 * @see unimodel.Office#capacity_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOffice__Capacity_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Office#person_in_office_constraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Person in office constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Person in office constraint</em>' operation.
	 * @see unimodel.Office#person_in_office_constraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOffice__Person_in_office_constraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link unimodel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see unimodel.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Class#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats</em>'.
	 * @see unimodel.Class#getSeats()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Seats();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Class#getBlackboards <em>Blackboards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blackboards</em>'.
	 * @see unimodel.Class#getBlackboards()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Blackboards();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Class#getSpeakers <em>Speakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speakers</em>'.
	 * @see unimodel.Class#getSpeakers()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Speakers();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Class#getComputers <em>Computers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computers</em>'.
	 * @see unimodel.Class#getComputers()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Computers();

	/**
	 * Returns the meta object for the '{@link unimodel.Class#seats_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Seats positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Seats positive</em>' operation.
	 * @see unimodel.Class#seats_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClass__Seats_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Class#blackboards_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Blackboards positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Blackboards positive</em>' operation.
	 * @see unimodel.Class#blackboards_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClass__Blackboards_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Class#speakers_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Speakers positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Speakers positive</em>' operation.
	 * @see unimodel.Class#speakers_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClass__Speakers_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link unimodel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see unimodel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Person#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see unimodel.Person#getCategory()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Category();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Person#getBadge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Badge</em>'.
	 * @see unimodel.Person#getBadge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Badge();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see unimodel.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the attribute '{@link unimodel.Person#getFiscal_code <em>Fiscal code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal code</em>'.
	 * @see unimodel.Person#getFiscal_code()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Fiscal_code();

	/**
	 * Returns the meta object for the reference '{@link unimodel.Person#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see unimodel.Person#getLibrary()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Library();

	/**
	 * Returns the meta object for the reference list '{@link unimodel.Person#getLoans <em>Loans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loans</em>'.
	 * @see unimodel.Person#getLoans()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Loans();

	/**
	 * Returns the meta object for the reference list '{@link unimodel.Person#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books</em>'.
	 * @see unimodel.Person#getBooks()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Books();

	/**
	 * Returns the meta object for the '{@link unimodel.Person#fiscal_code_length(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Fiscal code length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fiscal code length</em>' operation.
	 * @see unimodel.Person#fiscal_code_length(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPerson__Fiscal_code_length__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Person#age_lower_bound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Age lower bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Age lower bound</em>' operation.
	 * @see unimodel.Person#age_lower_bound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPerson__Age_lower_bound__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link unimodel.Person#age_upper_bound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Age upper bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Age upper bound</em>' operation.
	 * @see unimodel.Person#age_upper_bound(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPerson__Age_upper_bound__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link unimodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see unimodel.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link unimodel.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see unimodel.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnimodelFactory getUnimodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link unimodel.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.UniversityImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Chancellor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__CHANCELLOR = eINSTANCE.getUniversity_Chancellor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__DESCRIPTION = eINSTANCE.getUniversity_Description();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__BUILDINGS = eINSTANCE.getUniversity_Buildings();

		/**
		 * The meta object literal for the '{@link unimodel.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.NamedImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link unimodel.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.BuildingImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__DESCRIPTION = eINSTANCE.getBuilding_Description();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__ADDRESS = eINSTANCE.getBuilding_Address();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__LIBRARY = eINSTANCE.getBuilding_Library();

		/**
		 * The meta object literal for the '<em><b>Floors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__FLOORS = eINSTANCE.getBuilding_Floors();

		/**
		 * The meta object literal for the '{@link unimodel.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.AddressImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Post code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__POST_CODE = eINSTANCE.getAddress_Post_code();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>Civic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CIVIC = eINSTANCE.getAddress_Civic();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ID = eINSTANCE.getAddress_Id();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__PHONE = eINSTANCE.getAddress_Phone();

		/**
		 * The meta object literal for the '<em><b>Id number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESS___ID_NUMBER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAddress__Id_number__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Phone length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESS___PHONE_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAddress__Phone_length__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Postcode length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESS___POSTCODE_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAddress__Postcode_length__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link unimodel.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.LibraryImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Workstations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__WORKSTATIONS = eINSTANCE.getLibrary_Workstations();

		/**
		 * The meta object literal for the '<em><b>Computers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__COMPUTERS = eINSTANCE.getLibrary_Computers();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__BOOKS = eINSTANCE.getLibrary_Books();

		/**
		 * The meta object literal for the '<em><b>Loans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__LOANS = eINSTANCE.getLibrary_Loans();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__PERSON = eINSTANCE.getLibrary_Person();

		/**
		 * The meta object literal for the '<em><b>Workstation positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIBRARY___WORKSTATION_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLibrary__Workstation_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Computers positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIBRARY___COMPUTERS_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLibrary__Computers_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link unimodel.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.BookImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__QUANTITY = eINSTANCE.getBook_Quantity();

		/**
		 * The meta object literal for the '<em><b>ISBN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__ISBN = eINSTANCE.getBook_ISBN();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__AUTHOR = eINSTANCE.getBook_Author();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__LIBRARY = eINSTANCE.getBook_Library();

		/**
		 * The meta object literal for the '<em><b>Loans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__LOANS = eINSTANCE.getBook_Loans();

		/**
		 * The meta object literal for the '<em><b>Is Book Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOK___IS_BOOK_AVAILABLE = eINSTANCE.getBook__IsBookAvailable();

		/**
		 * The meta object literal for the '<em><b>Quantity positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOK___QUANTITY_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBook__Quantity_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>ISBN legth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOK___ISBN_LEGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBook__ISBN_legth__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Sufficient Copies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOK___SUFFICIENT_COPIES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBook__SufficientCopies__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link unimodel.impl.LoanImpl <em>Loan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.LoanImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getLoan()
		 * @generated
		 */
		EClass LOAN = eINSTANCE.getLoan();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAN__DATE = eINSTANCE.getLoan_Date();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAN__BOOK = eINSTANCE.getLoan_Book();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAN__PERSON = eINSTANCE.getLoan_Person();

		/**
		 * The meta object literal for the '{@link unimodel.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.FloorImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__NUMBER = eINSTANCE.getFloor_Number();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__ROOMS = eINSTANCE.getFloor_Rooms();

		/**
		 * The meta object literal for the '<em><b>Bathrooms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__BATHROOMS = eINSTANCE.getFloor_Bathrooms();

		/**
		 * The meta object literal for the '<em><b>Bathroom positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOOR___BATHROOM_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFloor__Bathroom_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link unimodel.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.RoomImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__DIMENSION = eINSTANCE.getRoom_Dimension();

		/**
		 * The meta object literal for the '<em><b>Sockets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__SOCKETS = eINSTANCE.getRoom_Sockets();

		/**
		 * The meta object literal for the '<em><b>Sockets positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___SOCKETS_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__Sockets_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link unimodel.impl.OfficeImpl <em>Office</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.OfficeImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getOffice()
		 * @generated
		 */
		EClass OFFICE = eINSTANCE.getOffice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE__TYPE = eINSTANCE.getOffice_Type();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE__CAPACITY = eINSTANCE.getOffice_Capacity();

		/**
		 * The meta object literal for the '<em><b>Person in office</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFICE__PERSON_IN_OFFICE = eINSTANCE.getOffice_Person_in_office();

		/**
		 * The meta object literal for the '<em><b>Office address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFICE__OFFICE_ADDRESS = eINSTANCE.getOffice_Office_address();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFICE__PHONE = eINSTANCE.getOffice_Phone();

		/**
		 * The meta object literal for the '<em><b>Get Person In Office</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFICE___GET_PERSON_IN_OFFICE = eINSTANCE.getOffice__GetPersonInOffice();

		/**
		 * The meta object literal for the '<em><b>Capacity positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFICE___CAPACITY_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOffice__Capacity_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Person in office constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFICE___PERSON_IN_OFFICE_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOffice__Person_in_office_constraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link unimodel.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.ClassImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__SEATS = eINSTANCE.getClass_Seats();

		/**
		 * The meta object literal for the '<em><b>Blackboards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__BLACKBOARDS = eINSTANCE.getClass_Blackboards();

		/**
		 * The meta object literal for the '<em><b>Speakers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__SPEAKERS = eINSTANCE.getClass_Speakers();

		/**
		 * The meta object literal for the '<em><b>Computers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__COMPUTERS = eINSTANCE.getClass_Computers();

		/**
		 * The meta object literal for the '<em><b>Seats positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___SEATS_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getClass__Seats_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Blackboards positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___BLACKBOARDS_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getClass__Blackboards_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Speakers positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___SPEAKERS_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getClass__Speakers_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link unimodel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.impl.PersonImpl
		 * @see unimodel.impl.UnimodelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CATEGORY = eINSTANCE.getPerson_Category();

		/**
		 * The meta object literal for the '<em><b>Badge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BADGE = eINSTANCE.getPerson_Badge();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Fiscal code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FISCAL_CODE = eINSTANCE.getPerson_Fiscal_code();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LIBRARY = eINSTANCE.getPerson_Library();

		/**
		 * The meta object literal for the '<em><b>Loans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LOANS = eINSTANCE.getPerson_Loans();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__BOOKS = eINSTANCE.getPerson_Books();

		/**
		 * The meta object literal for the '<em><b>Fiscal code length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___FISCAL_CODE_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPerson__Fiscal_code_length__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Age lower bound</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___AGE_LOWER_BOUND__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPerson__Age_lower_bound__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Age upper bound</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___AGE_UPPER_BOUND__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPerson__Age_upper_bound__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link unimodel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.Type
		 * @see unimodel.impl.UnimodelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link unimodel.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unimodel.Category
		 * @see unimodel.impl.UnimodelPackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

	}

} //UnimodelPackage
