package mcframe.clientMABS.MABSP0200;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;

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
 * 画面"MABSP_LotInhLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_LotInhLst_MC extends MABSP_LotInhLst_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_LotInhLst_MC() {
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
	public MABSP_LotInhLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0200_Srch01Caller<P extends MABSP_LotInhLst, B extends MA_MABSL0200_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0200_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[Cnd]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0200_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP0210]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP0210(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0210");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0210CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0210.CndR crtOpenMABSP0210CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP0210.MABSP_LotInhReg p = (mcframe.clientMABS.MABSP0210.MABSP_LotInhReg) aso.getPanel();
		mcframe.clientMABS.MABSP0210.CndR to = mcframe.clientMABS.MABSP0210.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.par_itm_cd(r.par_itm_cd());
			to.par_itm_sub1(r.par_itm_sub1());
			to.par_itm_sub2(r.par_itm_sub2());
			to.par_itm_sub3(r.par_itm_sub3());
			if (isNullOrNullVal(r.wg_cd())) {
				to.wg_flg(false);
				to.cmn_flg(true);
			}
			else {
				to.wg_flg(true);
				to.wg_cd(r.wg_cd());
			}
			to.bom_ptn(r.bom_ptn());
			to.lot_inh_col_typ(r.lot_inh_col_typ());
			aso.putSearchAction();
		}
		return to;
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) doDtl_DC(info);
	}

	/**
	 * ダブルクリック：ロット継承マスタ登録へ画面遷移
	 */
	public void doDtl_DC(MCEventInfo info) {
		doDtlBtn_open_MABSP0210(info);
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRegTgtMode();
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	protected void setStatusByOpe() {
		// 何もしない
	}

	protected void setRegTgtMode() {
		if (Cnd_srch_cmn.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.REQUIRED);
		}
		if (Cnd_srch_wg.authorize()) {
			Cnd_wg_flg.setMode(MCMode.REQUIRED);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r)){
			DtlBtn_open_MABSP0210.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(DtlBtn_open_MABSP0210);
		}
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		super.doCndOpeNC(info);
		setModeByRegTgt();
	}

	protected void setModeByRegTgt() {
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		super.clearAll();
		setModeByRegTgt();
		fillSpace();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setModeByRegTgt();
		fillSpace();
	}

	//-------------------- 初期化ここから --------------------//

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		initRegTgt();
	}
	protected void initRegTgt() {
		if (Cnd_srch_wg.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
			setValueEx(Cnd_wg_flg, true);
		}
		else if (Cnd_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, true);
			setValueEx(Cnd_wg_flg, false);
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();

		Dtl_par_itm_p_PPanel.addItmLCListner(this);
		Dtl_chd_itm_p_PPanel.addItmLCListner(this);
	}

	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_wg_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_typ, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_typ_d_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_sub1, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_sub2, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_par_itm_sub3, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_bom_ptn, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_lot_inh_col_typ, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_prio, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub1, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub2, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_chd_itm_sub3, MCList.SortType.ASC);
	}

	//-------------------- 初期化ここまで --------------------//	

}