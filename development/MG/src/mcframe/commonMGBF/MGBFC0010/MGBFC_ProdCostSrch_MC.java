package mcframe.commonMGBF.MGBFC0010;

import mcframe.commonCore.lang.MCNumber;

public class MGBFC_ProdCostSrch_MC {

	/**
	 * 小計行（月初仕掛行＋発生行）を表す定数
	 */
	public static final MCNumber SUBTTL_SEQ = MCNumber.valueOf(11);
	
	/**
	 * 合計行（完成行＋月末仕掛行）を表す定数
	 */
	public static final MCNumber TTL_SEQ = MCNumber.valueOf(12);
	
	/**
	 * 小計行（月初仕掛行＋発生行）を表す定数と等しい場合は true を返す
	 */
	public static boolean isSUBTTL(MCNumber value) {
		return SUBTTL_SEQ.eq(value);
	}
	
	/**
	 * 合計行（完成行＋月末仕掛行）を表す定数と等しい場合は true を返す
	 */
	public static boolean isTTL(MCNumber value) {
		return TTL_SEQ.eq(value);
	}
}