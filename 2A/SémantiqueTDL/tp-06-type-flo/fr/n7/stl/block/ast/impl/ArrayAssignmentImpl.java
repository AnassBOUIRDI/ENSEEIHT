/**
 * 
 */
package fr.n7.stl.block.ast.impl;

import fr.n7.stl.block.ast.Assignable;
import fr.n7.stl.block.ast.Expression;
import fr.n7.stl.tam.ast.Fragment;
import fr.n7.stl.tam.ast.TAMFactory;
import fr.n7.stl.tam.ast.Library;

/**
 * @author Marc Pantel
 *
 */
public class ArrayAssignmentImpl extends ArrayAccessImpl implements Assignable {

	/**
	 * @param _array
	 * @param _index
	 */
	public ArrayAssignmentImpl(Expression _array, Expression _index) {
		super(_array, _index);
	}

	/* (non-Javadoc)
	 * @see fr.n7.stl.block.ast.impl.ArrayAccessImpl#getCode(fr.n7.stl.tam.ast.TAMFactory)
	 */
	@Override
	public Fragment getCode(TAMFactory _factory) {
		Fragment fragment = _factory.createFragment();

		// Récupération de l'adresse du tableau sur le haut de la pile
		fragment.append(array.getCode(_factory));

		// Empile 1 mot lut à l'adresse du tableau
		fragment.add(_factory.createLoadI(1));

		// Récupếration de l'indice sur le haut de la pile
		fragment.append(index.getCode(_factory));

		// Récupération de la taille du type des éléments du tableau
		fragment.add(_factory.createLoadL(this.getType().length()));

		// Multiplication de la taille des éléments par l'indice 
		fragment.add(Library.IMul);

		// Ajout de ce résultat à l'adresse du tableau pour récupérer l'élément souhaité
		fragment.add(Library.IAdd);

		return fragment;	}
	
}
