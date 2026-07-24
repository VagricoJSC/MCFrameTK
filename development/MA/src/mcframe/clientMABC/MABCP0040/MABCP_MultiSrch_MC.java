package mcframe.clientMABC.MABCP0040;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_MultiSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_MultiSrch_MC extends MABCP_MultiSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_MultiSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_MultiSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABCL0040_Srch01();
	}
	/**
	 * [MA_MABCL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0040_Srch01Caller<P extends MABCP_MultiSrch, B extends MA_MABCL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			// 何もしない
		}
		@Override
		protected void setModeNoDown() {
			// 何もしない
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		getCndR().partial_flg(true);
		getBtnR().auto_srch_flg(true);

		addDoBehind(Cnd_srch);
	}

	@Override
	public void setFIXStatus() {
		// 何もしない
	}
	@Override
	protected void setStatusByOpe() {
		// 何もしない
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) doDtl_DC(info);
	}

	/**
	 * ダブルクリックした行のマスタを起動
	 */
	public void doDtl_DC(MCEventInfo info) {
		openMABCP0030(getDtlL().get(info.getEventIndex()));
	}

	@Override
	public void doBtn_open_MABCP0030(MCEventInfo info) {
		for (DtlR r : getDtlL()) {
			if (r.check()) {
				openMABCP0030(r);
			}
		}
	}

	protected void openMABCP0030(DtlR r) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MA", "MABCP0030");
		so.runValueInit();
		so.putCnd(crtOpenBind(r));
		if (getBtnR().auto_srch_flg()) {
			so.putSearchAction();
		}
		so.show();
	}
	protected mcframe.clientMABC.MABCP0030.CndR crtOpenBind(DtlR fr) {
		mcframe.clientMABC.MABCP0030.CndR to = mcframe.clientMABC.MABCP0030.CndR.create();
		to.mst_nm(fr.mst_nm());
		return to;
	}

}