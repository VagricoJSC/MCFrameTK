package mcframe.clientMBBB.MBBBP0140;

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
import mcframe.clientMAUB.MAUBP0260.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBBP_JournalSrchByBp"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBBP_JournalSrchByBp_MC extends MBBBP_JournalSrchByBp_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// 一覧色設定
	protected Color _rsltColor = getPgmSettingColorNE(this, new Color(153, 255, 153), "Color.rslt");
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_JournalSrchByBp_MC() {
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
	public MBBBP_JournalSrchByBp_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBBL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0140_Srch01Caller<P extends MBBBP_JournalSrchByBp, B extends MB_MBBBL0140_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBBL0140_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}
	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(Cnd3Panel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(Cnd3Panel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMB_MBBBL0140_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MBBBP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MBBBP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if(isEnableBtn_open_MBBBP0120(r)){
			doBtn_open_MBBBP0120(r);
		}			
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_ac_if_flg, true);
		setValueEx(Cnd_slip_cnt_flg, true);
		setValueEx(Cnd_dpt_flg, true);
		setValueEx(Cnd_sub_ac_flg, true);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		columnRslt_total_amt.setBackground(_rsltColor);
		columnRslt_total_tax_amt.setBackground(_rsltColor);
		columnRslt_total_trd_amt.setBackground(_rsltColor);
		columnRslt_total_trd_tax_amt.setBackground(_rsltColor);
	}

	// -----------------------------------------------
	// event
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = RsltTable.getSelectedMCRow();
			if (isEnableBtn_open_MBBBP0120(r)) {
				doBtn_open_MBBBP0120(r);
			}
		}
	}

	protected void doBtn_open_MBBBP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBBP0120");
		mcframe.clientMBBB.MBBBP0120.CndR to = mcframe.clientMBBB.MBBBP0120.CndR.create();
		to.jnl_grp_no(r.jnl_grp_no());
		to.ac_ym(r.ac_ym());
		to.ac_if_typ(r.ac_if_typ());
		to.slip_cnt_id(r.slip_cnt_id());
		to.dpt_cd(r.dpt_cd());
		to.dpt_nm(r.dpt_nm());
		to.ac_cd(r.ac_cd());
		to.sub_ac_cd(r.sub_ac_cd());
		to.bp_cd(r.bp_cd());
		to.tax_cd(r.tax_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	protected boolean isEnableBtn_open_MBBBP0120(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
	}

	protected void setRefStatus() {
		setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
	}

}