/**
 */
package it.univaq.disim.unimodel.h4model.provider;

import it.univaq.disim.unimodel.h4model.util.H4modelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class H4modelItemProviderAdapterFactory extends H4modelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H4modelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.University} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityItemProvider universityItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.University}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniversityAdapter() {
		if (universityItemProvider == null) {
			universityItemProvider = new UniversityItemProvider(this);
		}

		return universityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Named} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedItemProvider namedItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Named}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedAdapter() {
		if (namedItemProvider == null) {
			namedItemProvider = new NamedItemProvider(this);
		}

		return namedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Building} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingItemProvider buildingItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Building}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBuildingAdapter() {
		if (buildingItemProvider == null) {
			buildingItemProvider = new BuildingItemProvider(this);
		}

		return buildingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Address} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressItemProvider addressItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressAdapter() {
		if (addressItemProvider == null) {
			addressItemProvider = new AddressItemProvider(this);
		}

		return addressItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Library} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryItemProvider libraryItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLibraryAdapter() {
		if (libraryItemProvider == null) {
			libraryItemProvider = new LibraryItemProvider(this);
		}

		return libraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Book} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookItemProvider bookItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Book}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBookAdapter() {
		if (bookItemProvider == null) {
			bookItemProvider = new BookItemProvider(this);
		}

		return bookItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Loan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoanItemProvider loanItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Loan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoanAdapter() {
		if (loanItemProvider == null) {
			loanItemProvider = new LoanItemProvider(this);
		}

		return loanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Floor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorItemProvider floorItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Floor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloorAdapter() {
		if (floorItemProvider == null) {
			floorItemProvider = new FloorItemProvider(this);
		}

		return floorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Room} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomItemProvider roomItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoomAdapter() {
		if (roomItemProvider == null) {
			roomItemProvider = new RoomItemProvider(this);
		}

		return roomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Office} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfficeItemProvider officeItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Office}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOfficeAdapter() {
		if (officeItemProvider == null) {
			officeItemProvider = new OfficeItemProvider(this);
		}

		return officeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.univaq.disim.unimodel.h4model.Person} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonItemProvider personItemProvider;

	/**
	 * This creates an adapter for a {@link it.univaq.disim.unimodel.h4model.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonAdapter() {
		if (personItemProvider == null) {
			personItemProvider = new PersonItemProvider(this);
		}

		return personItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (universityItemProvider != null)
			universityItemProvider.dispose();
		if (namedItemProvider != null)
			namedItemProvider.dispose();
		if (buildingItemProvider != null)
			buildingItemProvider.dispose();
		if (addressItemProvider != null)
			addressItemProvider.dispose();
		if (libraryItemProvider != null)
			libraryItemProvider.dispose();
		if (bookItemProvider != null)
			bookItemProvider.dispose();
		if (loanItemProvider != null)
			loanItemProvider.dispose();
		if (floorItemProvider != null)
			floorItemProvider.dispose();
		if (roomItemProvider != null)
			roomItemProvider.dispose();
		if (officeItemProvider != null)
			officeItemProvider.dispose();
		if (classItemProvider != null)
			classItemProvider.dispose();
		if (personItemProvider != null)
			personItemProvider.dispose();
	}

}
