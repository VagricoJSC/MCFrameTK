package mcframe.clientMSBB.MSBBP0040;

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
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_CstFrcstSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_CstFrcstSrch_MC extends MSBBP_CstFrcstSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_CstFrcstSrch_MC() {
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
	public MSBBP_CstFrcstSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0040_Srch01Caller<P extends MSBBP_CstFrcstSrch, B extends MS_MSBBL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		protected void initCaller() {
			super.initCaller();
			// 業務データD.L.用
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(StsPanel));
			msgList.addAll(checkBeforeAfter(Cnd_cst_frcst_prnt_dt_fr, Cnd_cst_frcst_prnt_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_rcpt_dt_fr, Cnd_rcpt_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_frcst_st_dt_fr, Cnd_frcst_st_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_frcst_end_dt_fr, Cnd_frcst_end_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_frcst_dt_fr, Cnd_frcst_dt_to));
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
		callMS_MSBBL0040_Srch01();
	}
	
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
			createMS_MSBBL0040_Srch01().execDL();
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (!isNull(r)) {
				doBtn_open_MSBBP0010(r);
			}
		}
	}
	
	/** 遷移先(顧客期間内示登録)の設定 */
	protected void doBtn_open_MSBBP0010(RsltR r) {
		if (!isNull(r.cst_frcst_no())){
			MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBBP0010");
	
		    mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg destP = 
		    		(mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg) so.getPanel();
		    mcframe.clientMSBB.MSBBP0010.CndR bind =
		            mcframe.clientMSBB.MSBBP0010.CndR.create();
	
	    	bind.ope(destP.Cnd_ope_REF.getActionCommand());
	    	bind.cst_frcst_no(r.cst_frcst_no());
	
	    	so.putCnd(bind);
	    	so.putSearchAction();
	    	so.show();
		}
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP0010(MCEventInfo info) {
		// 顧客期間内示登録画面
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBBP0010(r);
	}

	/**
	 * 遷移先(顧客期間内示登録画面)検索条件の設定
	 */
	protected void setMsbbp0010CndR(MAUCP_AppScreenOpener scrnOpnr) {
		// オーダ展開情報照会画面
		int index = RsltTable.getMCSelectedRow();
	    if (index > -1) {
	    	// 遷移先のラジオボタンの値を得る(getActionCommand)ために遷移先画面を取得
		    mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg destP = 
		    		(mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg) scrnOpnr.getPanel();
		    mcframe.clientMSBB.MSBBP0010.CndR bind =
		            mcframe.clientMSBB.MSBBP0010.CndR.create();

	    	RsltR r = getRsltL().get(index);
	    	bind.ope(destP.Cnd_ope_REF.getActionCommand());
	    	bind.cst_frcst_no(r.cst_frcst_no());

	    	scrnOpnr.putCnd(bind);
	    	scrnOpnr.putSearchAction();
	    }
	}

	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		MCRow bind = MCRow.create();
		MCList<MCRow> list = MCList.create(MCRow.class);
		setMSBBP1210Hdr(bind);
		setMSBBP1210Dtl(list);
		openPanel("MS", "MSBBP1210", T1, bind, list);
	}

	/**
	 * 遷移先(受注登録画面)のヘッダ項目の設定
	 */
	protected void setMSBBP1210Hdr(MCRow bind) {
		int index = RsltTable.getMCSelectedRow();
		 if (index > -1) {
			 RsltR r = getRsltL().get(index);
			 bind.addStringColumn("cst_cd", r.cst_cd());
			 bind.addStringColumn("dlv_cd", r.dlv_cd());
			 bind.addStringColumn("sls_usr_cd", r.frcst_usr_cd());
			 bind.addStringColumn("sls_dpt_cd", r.frcst_dpt_cd());
			 bind.addStringColumn("wrk_no", r.wrk_no());
		 }
	}
	
	/**
	 * 遷移先(受注登録画面)の明細項目設定
	 */
	protected void setMSBBP1210Dtl(MCList<MCRow> list) {
		
		int index = RsltTable.getMCSelectedRow();
		if (index > -1) {
			RsltR r = getRsltL().get(index);
			
			MCRow row = MCRow.create();
			row.addStringColumn("itm_cd", r.itm_cd());
			row.addStringColumn("itm_sub1", r.itm_sub1());
			row.addStringColumn("itm_sub2", r.itm_sub2());
			row.addStringColumn("itm_sub3", r.itm_sub3());
			row.addStringColumn("trd_unit_cd", r.trd_unit_cd());
			row.addNumberColumn("trd_unit_qty", r.trd_unit_qty());
			row.addStringColumn("cst_itm_cd", r.cst_itm_cd());
			row.addStringColumn("cst_itm_nm", r.cst_itm_nm());
			
			list.add(row);
		}
	}

	// --------------------------------------------------------------
	// 画面初期値設定
	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_trd_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_base_qty_dec_place);
		Rslt_base_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);
		Rslt_last_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);
		Rslt_prms_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);
		Rslt_spln_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);
		Rslt_slo_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);
		Rslt_mly_net_frcst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
		
	}

	protected void valueInitSub() {
		//setInitDispUnit();
		setInitSts();
		setInitAns();
	}

	/** 表示単位の初期値設定 */
	protected void setInitDispUnit() {
		setValueEx(Cnd_mode_Group, Cnd_mode_DTL.getActionCommand());
	}

	protected void setInitSts() {
		if (Cnd_mode_DTL.isSelected()) {
			setBoolean(StsPanel, true);
		}
		else if (Cnd_mode_HDR.isSelected()) {
			setBoolean(StsPanel, true);
		}
	}

	protected void setInitAns() {
		if (Cnd_mode_DTL.isSelected()) {
			// 何もしない
		}
		else if (Cnd_mode_HDR.isSelected()) {
			getCndR().except_frcst_stop_flg(false);
		}
	}

	// --------------------------------------------------------------
	// イベント
	@Override
	public void doCnd_mode_NC(MCEventInfo info) {
		super.doCnd_mode_NC(info);

		clearContainers(getRsltL());
		clearCnd();
		setSrchStatus();
		setInitSts();
		setInitAns();
	}

	protected void clearCnd() {
		if (Cnd_mode_DTL.isSelected()) {
			// N/A
		}
		else if (Cnd_mode_HDR.isSelected()) {
			//明細用検索項目をクリア
			setValueEx(Cnd_cst_frcst_d_no, null);
			setValueEx(Cnd_frcst_period_typ, null);
			setValueEx(Cnd_frcst_st_dt_fr, null);
			setValueEx(Cnd_frcst_st_dt_to, null);
			setValueEx(Cnd_frcst_end_dt_fr, null);
			setValueEx(Cnd_frcst_end_dt_to, null);
			setValueEx(Cnd_frcst_dt_fr, null);
			setValueEx(Cnd_frcst_dt_to, null);
			setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ, null);
			setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd, null);
			setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm, null);
			setValueEx(Cnd_itm_p_PPanel.Itm_itm_cd, null);
			setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub1, null);
			setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub2, null);
			setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub3, null);
			setValueEx(Cnd_itm_p_PPanel.Itm_itm_nm, null);
			setValueEx(Cnd_cst_itm_cd, null);
			setValueEx(Cnd_cst_itm_nm, null);
			setValueEx(Cnd_cst_frcst_slip_d_no, null);
			setValueEx(Cnd_dtl_intr_rmrks, null);
			setValueEx(Cnd_dtl_sub_char1, null);
			setValueEx(Cnd_dtl_sub_char2, null);
			setValueEx(Cnd_dtl_sub_char3, null);
			
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9, false);
			setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10, false);
		}
	}

	@Override
	public void doCnd_latest_flg_NC(MCEventInfo info) {
		super.doCnd_latest_flg_NC(info);

		if (getCndR().latest_flg()) {
			setValueEx(Cnd_cst_frcst_prnt_dt_fr, null);
			setValueEx(Cnd_cst_frcst_prnt_dt_to, null);
			setValueEx(Cnd_cst_frcst_no, null);
			setValueEx(Cnd_cst_frcst_slip_no, null);
			setValueEx(Cnd_cst_frcst_d_no, null);
			setValueEx(Cnd_cst_frcst_slip_d_no, null);
		}
	}

	@Override
	public void doCnd_cst_frcst_prnt_dt_fr_NC(MCEventInfo info) {
		super.doCnd_cst_frcst_prnt_dt_fr_NC(info);
		if (!isNull(info.getNewValue())) {
			setValueEx(Cnd_latest_flg, false);
		}
	}

	@Override
	public void doCnd_cst_frcst_prnt_dt_to_NC(MCEventInfo info) {
		super.doCnd_cst_frcst_prnt_dt_to_NC(info);
		if (!isNull(info.getNewValue())) {
			setValueEx(Cnd_latest_flg, false);
		}
	}

	@Override
	public void doCnd_cst_frcst_no_NC(MCEventInfo info) {
		super.doCnd_cst_frcst_no_NC(info);
		if (!isNull(info.getNewValue())) {
			setValueEx(Cnd_latest_flg, false);
		}
	}

	@Override
	public void doCnd_cst_frcst_slip_no_NC(MCEventInfo info) {
		super.doCnd_cst_frcst_slip_no_NC(info);
		if (!isNull(info.getNewValue())) {
			setValueEx(Cnd_latest_flg, false);
		}
	}

	@Override
	public void doCnd_cst_frcst_d_no_NC(MCEventInfo info) {
		super.doCnd_cst_frcst_d_no_NC(info);
		if (!isNull(info.getNewValue())) {
			setValueEx(Cnd_latest_flg, false);
		}
	}

	@Override
	public void doCnd_cst_frcst_slip_d_no_NC(MCEventInfo info) {
		super.doCnd_cst_frcst_slip_d_no_NC(info);
		if (!isNull(info.getNewValue())) {
			setValueEx(Cnd_latest_flg, false);
		}
	}

	@Override
	public void doCnd_inc_can_flg_NC(MCEventInfo info) {
		super.doCnd_inc_can_flg_NC(info);
		setValueEx(Cnd_can_rsn_cd, null);
		setValueEx(Cnd_can_rmrks, null);
		setCanCndMode();
	}

	protected void setCanCndMode() {
		if (!getCndR().inc_can_flg()) {
			Cnd_can_rsn_cd.setMode(MCMode.READ_ONLY);
			Cnd_can_rsn_nm.setMode(MCMode.READ_ONLY);
			Cnd_can_rmrks.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_can_rsn_cd);
			setDefaultMode(Cnd_can_rsn_nm);
			setDefaultMode(Cnd_can_rmrks);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setOpenBtnMode();
	}

	protected void setOpenBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			Btn_open_MSBBP0010.setMode(MCMode.DISABLE);
			Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBBP0010);
			if (r.can_flg()) {
				Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBBP1210);
			}
		}
	}

	protected void setSrchStatus() {
		if (Cnd_mode_DTL.isSelected()) {
			setSRCH_DTLStatus();
		}
		else if (Cnd_mode_HDR.isSelected()) {
			setSRCH_HDRStatus();
		}
	}

	protected void setRefStatus() {
		if (Cnd_mode_DTL.isSelected()) {
			setREF_DTLStatus();
		}
		else if (Cnd_mode_HDR.isSelected()) {
			setREF_HDRStatus();
		}
	}

	// --------------------------------------------------------------
	// 画面ステータス
	@Override
	public void setSRCH_HDRStatus() {
		super.setSRCH_HDRStatus();		
		setSrchStatusComm();
	}

	@Override
	public void setSRCH_DTLStatus() {
		super.setSRCH_DTLStatus();
		setSrchStatusComm();
	}

	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		setRefStatusComm();
	}

	@Override
	public void setREF_DTLStatus() {
		super.setREF_DTLStatus();
		setRefStatusComm();
	}

	protected void setSrchStatusComm() {
		setTabMode();
		setCanCndMode();
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatusComm() {
		setOpenBtnMode();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setTabMode() {
		if (Cnd_mode_HDR.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel, Tab4Panel);
		}
	}
	
	// --------------------------------------------------------------
	// リストロジック
	@Override
	public MCList getCnd_frcst_period_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispPeriodTyp());
		return super.getCnd_frcst_period_typ(row, info);
	}

	public MAC_PERIOD_TYP[] getDispPeriodTyp() {
		return new MAC_PERIOD_TYP[] {
				MAC_PERIOD_TYP.WEEKLY, MAC_PERIOD_TYP.TENDAYS, MAC_PERIOD_TYP.MONTHLY
		};
	}

}