package mcframe.clientMABC.MABCP1740;

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
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP5010.*;

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
 * 画面"MABCP_ReportStrgCtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ReportStrgCtlReg_MC extends MABCP_ReportStrgCtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ReportStrgCtlReg_MC() {
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
	public MABCP_ReportStrgCtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1740_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1740_Srch01Caller<P extends MABCP_ReportStrgCtlReg, B extends MA_MABCL1740_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1740_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL1740_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1740_Upd01Caller<P extends MABCP_ReportStrgCtlReg, B extends MA_MABCL1740_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1740_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1740_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1740_Del01Caller<P extends MABCP_ReportStrgCtlReg, B extends MA_MABCL1740_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1740_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1740_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1740_Sprt01Caller<P extends MABCP_ReportStrgCtlReg, B extends MA_MABCL1740_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABCL1740_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL1740_Srch01();
	}
	/**
	 * Panel[BulkSet]のボタン[upd_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_upd_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}

	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		chkSrchBtnMode();
	}

	@Override
	public void doBulkSet_end_dt_NC(MCEventInfo info) {
		super.doBulkSet_end_dt_NC(info);
		chkSrchBtnMode();
	}

	public void chkSrchBtnMode() {
		if (!isNull(getBulkSetR().st_dt())
				|| !isNull(getBulkSetR().end_dt())) {
			BulkSet_upd_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_upd_dt.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * Panel[DtlBtn]のボタン[open_MABCP1720]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP1720(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1720");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP1720CndR(aso));
		aso.show();
	}
	/**
	 * 遷移先[MABCP1720]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP1720.CndR crtOpenMABCP1720CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP1720.MABCP_ReportStrgPathReg_MC_A p = (mcframe.clientMABC.MABCP1720.MABCP_ReportStrgPathReg_MC_A) aso.getPanel();
		mcframe.clientMABC.MABCP1720.CndR to = mcframe.clientMABC.MABCP1720.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			if (!isNullOrNullVal(r.biz_typ())) {
				to.biz_typ(r.biz_typ());
			}
			if (!isNullOrNullVal(r.bp_cd())) {
				to.bp_cd(r.bp_cd());
			}
			if (!isNullOr(to.biz_typ(), to.bp_cd())) {
				aso.putSearchAction();
			}
		}
		return to;
	}

	@Override
	public void doDtl_NC(MCEventInfo info){
		super.doDtl_NC(info);
		setOpenButtonMode();
	}

	protected void setOpenButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null || isNull(r.biz_typ()) || isNull(r.bp_cd())) {
			DtlBtn_open_MABCP1720.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(DtlBtn_open_MABCP1720);
		}
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setOpenButtonMode();	
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setOpenButtonMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setOpenButtonMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setOpenButtonMode();
	}

	/**
	 * Panel[DtlBtn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doDtlBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABCL1740_Sprt01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL1740_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL1740_Del01();
	}

}