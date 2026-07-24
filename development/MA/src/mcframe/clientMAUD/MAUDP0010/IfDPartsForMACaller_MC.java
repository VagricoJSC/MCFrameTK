package mcframe.clientMAUD.MAUDP0010;

import mcframe.clientCore.beans.MCCaller;
import mcframe.clientFXBA.FXBAP0010.IfDPartsForCaller;

public interface IfDPartsForMACaller_MC extends IfDPartsForCaller {

	/*
	 * 通信後処理。検索定型処理のshowメソッドの前に呼出される。
	 */
	@SuppressWarnings("rawtypes")
	public void preShow(MCCaller caller);

}