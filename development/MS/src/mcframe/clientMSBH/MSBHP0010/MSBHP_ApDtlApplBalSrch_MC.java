package mcframe.clientMSBH.MSBHP0010;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5010.*;
import mcframe.clientMSUB.MSUBP5020.*;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_ApDtlApplBalSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_ApDtlApplBalSrch_MC extends MSBHP_ApDtlApplBalSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_ApDtlApplBalSrch_MC() {
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
	public MSBHP_ApDtlApplBalSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0010_Srch01Caller<P extends MSBHP_ApDtlApplBalSrch, B extends MS_MSBHL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			
			msgList.addAll(checkBeforeAfter(Cnd_pay_schd_dt_fr, Cnd_pay_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_bsppl_cl_dt_fr, Cnd_bsppl_cl_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_act_dt_fr, Cnd_act_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
			
			msgList.addAll(checkAtLeastOne(ChkPanel));
			msgList.addAll(checkAtLeastOne(UpriPanel));
			msgList.addAll(checkAtLeastOne(CrryovrPanel));
			msgList.addAll(checkAtLeastOne(PaySpotPanel));
			msgList.addAll(checkAtLeastOne(SubconPanel));
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			setREFStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSRCHStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBHL0010_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBHL0010_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBHP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		doBtn_open_MSBHP0030(r);
	}
	
	/**
	 * MSBHP0030に遷移する
	 * 
	 * @param r
	 */
	protected void doBtn_open_MSBHP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0030");
		aso.putCnd(crtOpenMSBHP0030CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBHP0030]の検索条件Rowコンテナを返す。
	 */
	protected mcframe.clientMSBH.MSBHP0030.CndR crtOpenMSBHP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		
		mcframe.clientMSBH.MSBHP0030.MSBHP_PaySchdReg p = 
				(mcframe.clientMSBH.MSBHP0030.MSBHP_PaySchdReg) aso.getPanel();
		mcframe.clientMSBH.MSBHP0030.CndR to = mcframe.clientMSBH.MSBHP0030.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.pay_chk_no(r.pay_chk_no());
		return to;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);

		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_base_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_proc_amt, columnRslt_xrate);
		Rslt_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_onr_prov_amt, columnRslt_xrate);
		Rslt_base_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);

		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);

		Rslt_bsppl_grp_p_PPanel.setRelateBeans(Cnd_bsppl_grp_p_PPanel);
		Rslt_asppl_grp_p_PPanel.setRelateBeans(Cnd_asppl_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		valueInitSub();
	}
	
	/**
	 * 画面のデフォルト値を設定する。
	 */
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_PAY.getActionCommand());
		setValueEx(Cnd_unchk_flg, true);
		setValueEx(Cnd_chk_flg, false);
		setValueEx(Cnd_upri_flg, true);
		setValueEx(Cnd_interim_flg, true);
		setValueEx(Cnd_crryovr_flg, true);
		setValueEx(Cnd_not_crryovr_flg, true);
		setValueEx(Cnd_pay_spot_flg, true);
		setValueEx(Cnd_not_pay_spot_flg, true);
		setValueEx(Cnd_subcon_flg, true);
		setValueEx(Cnd_not_subcon_flg, true);
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			if (Btn_open_MSBHP0030.isEnabled()) {
				RsltR r = getRsltL().get(info.getEventIndex());
				doBtn_open_MSBHP0030(r);
			}
		}
	}
	
	/**
	 * 操作種別変更時のイベント処理
	 */
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		clearContainers(getRsltL());
		setSRCHStatus();
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		
		setBtnMode();
	}
	
	/**
	 * ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		
		RsltR rsltR = RsltTable.getSelectedMCRow();
		
		if (!isNull(rsltR) && !rsltR.chk_flg()) {
			Btn_open_MSBHP0030.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBHP0030);
		}
	}
	
	@Override
	public void setREFStatus() {
		if (Cnd_ope_PAY.isSelected()) {
			setREF_PAYStatus();
		}
		else if (Cnd_ope_AP.isSelected()) {
			setREF_APStatus();
		}
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	@Override
	public void setSRCHStatus() {
		if (Cnd_ope_PAY.isSelected()) {
			setSRCH_PAYStatus();
		}
		else if (Cnd_ope_AP.isSelected()) {
			setSRCH_APStatus();
		}
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setSRCH_APStatus() {
		super.setSRCH_APStatus();
		valueInitAp();
	}
	
	/**
	 * 検索条件を買掛種別用に初期化する
	 */
	protected void valueInitAp() {
		setValueEx(Cnd_unchk_flg, true);
		setValueEx(Cnd_chk_flg, true);
		setValueEx(Cnd_crryovr_flg, false);
		setValueEx(Cnd_not_crryovr_flg, true);
		setValueEx(Cnd_pay_spot_flg, true);
		setValueEx(Cnd_not_pay_spot_flg, true);
		setValueEx(Cnd_pay_schd_dt_fr, null);
		setValueEx(Cnd_pay_schd_dt_to, null);
		setValueEx(Cnd_bsppl_cl_dt_fr, null);
		setValueEx(Cnd_bsppl_cl_dt_to, null);
		setValueEx(Cnd_pass_days, null);
		setValueEx(Cnd_bsppl_cd, null);
		setValueEx(Cnd_bsppl_dpt_cd, null);
		setValueEx(Cnd_pay_sts_typ, null);
		setValueEx(Cnd_pay_mtd_typ, null);
		setValueEx(Cnd_pay_chk_no, null);
	}

}