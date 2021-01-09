/**
 * 
 */
package jeycodeutils.interfacecontract.patterndesign;

import java.util.Collection;

/**
 * @author Javier Pérez Alonso
 *
 *         31 jul. 2020
 *
 */
public interface PatternDAO<K,T> {

						void daoInsert(T object);

						void daoInsertAll(Collection<T> list);

						T daoGet(K id);

						Collection<T> daoGetAll();

						void daoUpdate(T object);

						void daoDelete(T object);

}
