package mcframe.serverMAUC.MAUCL0060;

import java.util.*;

import mcframe.commonCore.lang.MCNumber;

abstract public class SeqCache_MC {
	protected Map<String, List<MCNumber>> _m;

	/**
	 * シーケンス毎のキャッシュを保持するMap
	 * <p>
	 * key：シーケンス名<br>
	 * value：キャッシュしている番号のリスト
	 * </p>
	 */
	protected Map<String, List<MCNumber>> map() {
		if (_m == null) {
			_m = new HashMap<String, List<MCNumber>>();
		}
		return _m;
	}
}