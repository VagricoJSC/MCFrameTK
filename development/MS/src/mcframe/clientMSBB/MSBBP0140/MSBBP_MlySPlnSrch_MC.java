package mcframe.clientMSBB.MSBBP0140;

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
import mcframe.clientMSUB.MSUBP0010.*;

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
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
import mcframe.clientCore.beans.list.MCLinkBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_MlySPlnSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_MlySPlnSrch_MC extends MSBBP_MlySPlnSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_MlySPlnSrch_MC() {
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
	public MSBBP_MlySPlnSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0140_Srch01Caller<P extends MSBBP_MlySPlnSrch, B extends MS_MSBBL0140_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0140_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_usr_ym_fr, Cnd_usr_ym_to));
			msgList.addAll(checkAtLeastOne(Cnd_usr_edited_f_flg, Cnd_usr_edited_t_flg));
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
	 * [MS_MSBBL0140_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0140_Srch02Caller<P extends MSBBP_MlySPlnSrch, B extends MS_MSBBL0140_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0140_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_sum_ym_fr, Cnd_sum_ym_to));
			msgList.addAll(checkAtLeastOne(Cnd_sum_edited_f_flg, Cnd_sum_edited_t_flg));
			msgList.addAll(checkAtLeastOne(Cnd_sum_adopted_t_flg, Cnd_sum_adopted_f_flg));
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
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_USR.isSelected()) {
			callMS_MSBBL0140_Srch01();
		}
		else {
			callMS_MSBBL0140_Srch02();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP0110(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBBP0110(r);
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MSBBP0110(r)) {
				doBtn_open_MSBBP0110(r);
			}
		}
	}

	protected void doBtn_open_MSBBP0110(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP0110");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBBP0110CndR(aso, r));
		if (!isNullOr(r.spln_st_ym(), r.spln_end_ym())) {
			aso.putSearchAction();
		}
		aso.show();
	}

	protected mcframe.clientMSBB.MSBBP0110.CndR crtOpenMSBBP0110CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP0110.MSBBP_MlySPlnReg p
			= (mcframe.clientMSBB.MSBBP0110.MSBBP_MlySPlnReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP0110.CndR to = mcframe.clientMSBB.MSBBP0110.CndR.create();

		to.ope(p.Cnd_ope_UPD.getActionCommand());
		if (Cnd_ope_USR.isSelected()) {
			to.upd_ope(p.Cnd_upd_ope_USR.getActionCommand());
			to.usr_usr_cd(r.usr_cd());
			to.usr_dpt_cd(r.dpt_cd());
			to.usr_cst_cd(r.cst_cd());
			to.usr_wrk_no(r.wrk_no());
			to.usr_ym(r.ym());
			to.usr_spln_ym_fr(r.spln_st_ym());
			to.usr_spln_ym_to(r.spln_end_ym());
		}
		else {
			to.upd_ope(p.Cnd_upd_ope_SUM.getActionCommand());
			to.sum_dpt_cd(r.dpt_cd());
			to.sum_cst_cd(r.cst_cd());
			to.sum_wrk_no(r.wrk_no());
			to.sum_ym(r.ym());
			to.sum_spln_vers(r.spln_vers());
			to.sum_spln_ym_fr(r.spln_st_ym());
			to.sum_spln_ym_to(r.spln_end_ym());
		}
		return to;
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		MCDate ym = getAcYm(getToday(), getCo().ac_cl_day(), getCo().ac_cl_mon_base());
		if (!isNull(ym)) {
			int months = getPgmSettingIntNE(this, 0, "init.ym_from");
			ym = ym.addMonth(months);
			setValueEx(Cnd_usr_ym_fr, ym);
			setValueEx(Cnd_sum_ym_fr, ym);
		}

		setValueEx(Cnd_usr_dpt_flg, true);
		setValueEx(Cnd_usr_edited_t_flg, true);
		setValueEx(Cnd_usr_edited_f_flg, true);
		setValueEx(Cnd_sum_edited_t_flg, true);
		setValueEx(Cnd_sum_edited_f_flg, true);
		setValueEx(Cnd_sum_adopted_t_flg, true);
		setValueEx(Cnd_sum_adopted_f_flg, true);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void tableInit() {
		super.tableInit();
		setDispCols();
	}

	// -----------------------------------------------
	// status
	@Override
	public void setSRCH_USRStatus() {
		super.setSRCH_USRStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		setDispCols();
		setBtnMode();
	}

	@Override
	public void setREF_USRStatus() {
		super.setREF_USRStatus();
		setCndMode();
		RsltTable.selectLeftmostColumn(0);
		setDispCols();
		setBtnMode();
	}

	@Override
	public void setSRCH_SUMStatus() {
		super.setSRCH_SUMStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		setDispCols();
		setBtnMode();
	}

	@Override
	public void setREF_SUMStatus() {
		super.setREF_SUMStatus();
		setCndMode();
		RsltTable.selectLeftmostColumn(0);
		setDispCols();
		setBtnMode();
	}

	protected void setCndMode() {
		if (Cnd_ope_USR.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab3Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab2Panel, Tab3Panel);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBBP0110(r)) {
			setDefaultMode(Btn_open_MSBBP0110);
		}
		else {
			Btn_open_MSBBP0110.setMode(MCMode.DISABLE);
		}
	}

	protected boolean isEnableBtn_open_MSBBP0110(RsltR r) {
		return !(r == null);
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_USR.isSelected()) {
			setSRCH_USRStatus();
		}
		else if (Cnd_ope_SUM.isSelected()) {
			setSRCH_SUMStatus();
		}
		// 検索枠を開く
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_USR.isSelected()) {
			setREF_USRStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_SUM.isSelected()) {
			setREF_SUMStatus();
		}
		// 検索枠を閉じる
		Ctrl_ctrl_PPanel.expand(false);
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
	}

	protected void setDispCols() {
		setColMode(columnRslt_dpt_cd, getCndR().usr_dpt_flg());
		setColMode(columnRslt_dpt_nm, getCndR().usr_dpt_flg());
		setColMode(columnRslt_cst_cd, getCndR().usr_cst_flg());
		setColMode(columnRslt_cst_nm, getCndR().usr_cst_flg());
		setColMode(columnRslt_wrk_no, getCndR().usr_wrk_flg());
		setColMode(columnRslt_wrk_nm, getCndR().usr_wrk_flg());
	}

	protected void setColMode(MCColumnConfig col, boolean dispFlg) {
		if (Cnd_ope_SUM.isSelected()) {
			setDefaultMode(col);
		}
		else {
			col.setMode(dispFlg?MCMode.READ_ONLY:MCMode.INVISIBLE);
		}
	}

}