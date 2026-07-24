package mcframe.clientMSBE.MSBEP2000;

import mcframe.commonCore.notice.*;
//FMCB IMPORT START
import mcframe.clientMSBE.MSBEP0110.IfMSBEP0110_T1_DtlR;
//FMCB IMPORT END

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
abstract public class RsltR_MC extends RsltR_MC_A implements IfMSBEP0110_T1_DtlR {

//FMCB CUSTOM_METHOD START
	/**
	 * コンストラクタ
	 */
	protected RsltR_MC(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}
	/**
	 * 現品票で使用
	 */
	public String arr_act_no() {
		return super.arr_act_no();
	}

}