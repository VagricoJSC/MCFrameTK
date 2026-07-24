package mcframe.clientMABG.MABGP0340;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5160.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_AlcPtnSelReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_AlcPtnSelReg_MC extends MABGP_AlcPtnSelReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_AlcPtnSelReg_MC() {
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
	public MABGP_AlcPtnSelReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0340_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0340_Srch01Caller<P extends MABGP_AlcPtnSelReg, B extends MA_MABGL0340_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0340_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0340_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0340_Upd01Caller<P extends MABGP_AlcPtnSelReg, B extends MA_MABGL0340_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0340_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0340_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0340_Del01Caller<P extends MABGP_AlcPtnSelReg, B extends MA_MABGL0340_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0340_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0340_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0280]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0280(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0280");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0280CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABGL0340_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0340_Del01();
	}
	/**
	 * 遷移先[MABGP0280]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0280.CndR crtOpenMABGP0280CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0280.CndR to =
			mcframe.clientMABG.MABGP0280.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.term_fr(fr.term());
			to.term_to(fr.term());
			to.alc_ptn_cd(fr.alc_ptn_cd());
		}
		return to;
	}

	/**
	 * ソートの設定
	 */
	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_calc_ctg_cd);
		DtlTable.addSortColumn(columnDtl_term);
		DtlTable.addSortColumn(columnDtl_alc_ac_cd);
		DtlTable.addSortColumn(columnDtl_dpt_alc_grp);
		DtlTable.addSortColumn(columnDtl_loc_alc_grp);
		DtlTable.addSortColumn(columnDtl_oper_alc_grp);
		DtlTable.addSortColumn(columnDtl_bp_alc_grp);
		DtlTable.addSortColumn(columnDtl_ctg_alc_grp);
		DtlTable.addSortColumn(columnDtl_itm_alc_grp);
	}
	
	protected void setOpenButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null
				|| isNull(r.term())
				|| isNull(r.alc_ptn_cd())) {
			Btn_open_MABGP0280.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MABGP0280);
		}
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setOpenButtonMode();
	}

	//------------------ ｲﾍﾞﾝﾄ設定 Start ------------------//
	@Override
	public void doDtl_NC(MCEventInfo info){
		super.doDtl_NC(info);
		setOpenButtonMode();
	}
	
	@Override
	public void doDtl_alc_ptn_cd_LC(MCEventInfo info){
		super.doDtl_alc_ptn_cd_LC(info);
		setOpenButtonMode();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_term_p_PPanel.columnTerm_term.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Dtl_term_p_PPanel.columnTerm_term) doDtl_term_LC(info);
	}

	public void doDtl_term_LC(MCEventInfo info) {
		setOpenButtonMode();
		int index = info.getEventIndex();
		setValueEx(columnDtl_dpt_alc_grp, index, null);
	}

}