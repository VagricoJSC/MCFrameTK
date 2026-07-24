package mcframe.clientMSBC.MSBCP0160;

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
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0020.*;
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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_SimOrdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_SimOrdSrch_MC extends MSBCP_SimOrdSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_SimOrdSrch_MC() {
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
	public MSBCP_SimOrdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0160_Srch01Caller<P extends MSBCP_SimOrdSrch, B extends MS_MSBCL0160_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0160_Srch01Caller(P p, B b) {
			super(p, b);
		}

		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_po_schd_dt_fr, Cnd_po_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_st_schd_dt_fr, Cnd_mfg_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_end_schd_dt_fr, Cnd_mfg_end_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_gi_schd_dt_fr, Cnd_gi_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_strg_schd_dt_fr, Cnd_strg_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_accpt_schd_dt_fr, Cnd_accpt_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_st_schd_dt_fr, Cnd_insp_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_end_schd_dt_fr, Cnd_insp_end_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_avl_schd_dt_fr, Cnd_avl_schd_dt_to));
			msgList.addAll(checkAtLeastOne(ExpTypPanel));
			msgList.addAll(checkAtLeastOne(OrdTypPanel));
			msgList.addAll(checkAtLeastOne(FixFlgPanel));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUpdStatusByOpe();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatusByOpe();
		}

	}

	/**
	 * [MS_MSBCL0160_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0160_Upd01Caller<P extends MSBCP_SimOrdSrch, B extends MS_MSBCL0160_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0160_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0160_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0160_Upd02Caller<P extends MSBCP_SimOrdSrch, B extends MS_MSBCL0160_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL0160_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0160_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0160_Srch01().execDL();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0050(MCEventInfo info) {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0050ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	/** 遷移先(オーダ確認画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0050ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
		mcframe.clientMSBC.MSBCP0050.CndR cnd = mcframe.clientMSBC.MSBCP0050.CndR.create();
		mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch p = 
				(mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch)so.getPanel();
		
		cnd.ope(p.Cnd_ope_REF.getActionCommand());
		cnd.itm_ord_no(r.itm_ord_no());
		
		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();
		
		return so;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0210(MCEventInfo info) {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0210ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	/** 遷移先(シミュ用工程オーダ確認画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0210ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0210");
		mcframe.clientMSBC.MSBCP0210.CndR cnd = mcframe.clientMSBC.MSBCP0210.CndR.create();
		
		cnd.itm_ord_no(r.itm_ord_no());
		so.putCnd(cnd);
		so.putSearchAction();
		
		return so;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0190]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0190(MCEventInfo info) {
		//シミュ用オーダ展開情報照会画面
		openMsbcp0190();
	}
	
	//DCと画面遷移ボタンで共有
	protected void openMsbcp0190() {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0190ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	
	/** 遷移先(シミュ用オーダ展開情報照会画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0190ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0190");
		mcframe.clientMSBC.MSBCP0190.CndR cnd = mcframe.clientMSBC.MSBCP0190.CndR.create();
		mcframe.clientMSBC.MSBCP0190.MSBCP_SimOrdExtSrch p = 
				(mcframe.clientMSBC.MSBCP0190.MSBCP_SimOrdExtSrch)so.getPanel();
		
		cnd.ope(p.Cnd_ope_ORD.getActionCommand());
		cnd.itm_ord_no(r.itm_ord_no());
		cnd.sim_mrp_no(r.sim_mrp_no());

		so.putCnd(cnd);
		so.putSearchAction();
		
		return so;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0200(MCEventInfo info) {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0200ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}

	/** 遷移先(シミュ用オーダ逆展開情報照会画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0200ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0200");
		mcframe.clientMSBC.MSBCP0200.CndR cnd = mcframe.clientMSBC.MSBCP0200.CndR.create();
		mcframe.clientMSBC.MSBCP0200.MSBCP_SimOrdRevExtSrch p = 
				(mcframe.clientMSBC.MSBCP0200.MSBCP_SimOrdRevExtSrch)so.getPanel();
		
		cnd.ope(p.Cnd_ope_ORD.getActionCommand());
		cnd.itm_ord_no(r.itm_ord_no());
		cnd.sim_mrp_no(r.sim_mrp_no());
		
		so.putCnd(cnd);
		so.putSearchAction();
		
		return so;
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL0160_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd2]の押下時の処理
	 */
	@Override
	public void doBtn_upd2(MCEventInfo info) {
		callMS_MSBCL0160_Upd02();
	}

	// 画面起動処理-------------------------------------------

	@Override
	protected void setupParts() {
		super.setupParts();		
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Cnd_ver_no_p_PPanel.setRelateBeans(
			Cnd_itm_cd,
			Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3,
			null, null);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_inst_qty_p_PPanel.setRelateBeans(
			columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_yield_schd_qty_p_PPanel.setRelateBeans(
			columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_inst_cont_qty_p_PPanel.setRelateBeans(
			columnRslt_cont_fctr_flg,
			columnRslt_inst_qty,
			columnRslt_std_cont_fctr,
			null,
			columnRslt_cont_fctr_dec_place,
			columnRslt_cont_fctr_rnd_typ);
		Rslt_yield_cont_qty_p_PPanel.setRelateBeans(
			columnRslt_cont_fctr_flg,
			columnRslt_yield_schd_qty,
			columnRslt_std_cont_fctr,
			null,
			columnRslt_cont_fctr_dec_place,
			columnRslt_cont_fctr_rnd_typ);
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

	/** 画面起動時の初期化処理 */
	protected void valueInitSub() {
		// 操作種別
		setInitOpeTyp();
		// 反映
		setDefExpTypByOpe();
		// オーダ区分、手配不許可フラグ
		setInitOrdTyp();
		setInitFixFlg();
	}

	/** 操作種別の初期値設定 */
	protected void setInitOpeTyp(){
		setValueEx(Cnd_ope_Group, Cnd_ope_OPN.getActionCommand());
	}

	/** 反映条件の初期値設定 */
	protected void setDefExpTypByOpe() {
		setBoolean(ExpTypPanel, false);
		if (Cnd_ope_OPN.isSelected()) {
			setValueEx(Cnd_opn, true);
		}
		else if (Cnd_ope_EXP.isSelected()) {
			setValueEx(Cnd_exp, true);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_opn, true);
			setValueEx(Cnd_exp, true);
		}
	}

	/** オーダ区分検索条件の初期値設定 */
	protected void setInitOrdTyp() {
		getCndR().mfg_flg(true);
		getCndR().purc_flg(true);
		getCndR().outsrc_flg(true);
		getCndR().xfr_flg(true);
		getCndR().wg_xfr_flg(true);
	}

	/** 手配許可フラグ検索条件の初期値設定 */
	protected void setInitFixFlg() {
		getCndR().true_not_fix_flg(true);
		getCndR().false_not_fix_flg(true);
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltTableCellConfig());
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}

		if (!isUpdStatus() || isStatusNone(getRsltL())) {
			return true;
		}
		else {
			return confirmRegDataClear();
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub(info);
	}

	/** 種別切替後のイベント */
	public void doCnd_ope_NCSub(MCEventInfo info) {
		clearContainers(getRsltL());
		setSrchStatusByOpe();
		setDefExpTypByOpe();
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		doRslt_check_NCSub(r);
	}

	// 選択チェックオン時
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		doRslt_check_NCSub((RsltR)srcRow);
	}

	public void doRslt_check_NCSub(RsltR srcRow) {
		// N/A
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			openMsbcp0190();
		}
	}

	protected void setSrchStatusByOpe() {
		if (Cnd_ope_OPN.isSelected()) {
			setSRCH_OPNStatus();
		}
		else if (Cnd_ope_EXP.isSelected()) {
			setSRCH_EXPStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setUpdStatusByOpe() {
		if (Cnd_ope_OPN.isSelected()) {
			setUPD_OPNStatus();
		}
		else if (Cnd_ope_EXP.isSelected()) {
			setUPD_EXPStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_OPNStatus() {
		super.setSRCH_OPNStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_EXPStatus() {
		super.setSRCH_EXPStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setSrchStatusCom();
	}

	@Override
	public void setUPD_OPNStatus() {
		super.setUPD_OPNStatus();
		setUpdStatusCom();
	}

	@Override
	public void setUPD_EXPStatus() {
		super.setUPD_EXPStatus();
		setUpdStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setUpdStatusCom();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD_OPN)
				|| isSame(getStatus(), UPD_EXP);
	}

	protected void setSrchStatusCom() {
		FoldTab.focusActiveFirstComponent();
	}

	protected void setUpdStatusCom() {
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			Btn_open_MSBCP0050.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0210.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0190.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0200.setMode(MCMode.DISABLE);
		}
		else {
			if (r.exp_flg()) {
				Btn_open_MSBCP0050.setMode(MCMode.ENABLE);
				setDefaultMode(Btn_open_MSBCP0210);
			}
			else {
				setDefaultMode(Btn_open_MSBCP0050);
				if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())) {
					Btn_open_MSBCP0210.setMode(MCMode.ENABLE);
				}
				else {
					setDefaultMode(Btn_open_MSBCP0210);
				}
			}
			Btn_open_MSBCP0190.setMode(MCMode.ENABLE);
			Btn_open_MSBCP0200.setMode(MCMode.ENABLE);
		}
	}

	protected RsltTableCellConfig crtRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	protected class RsltTableCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			if(isSame(getStatus(), UPD_EXP)) {
				if(column == columnRslt_check){
					if(r.fix_flg()){
						return MCMode.READ_ONLY;
					}
				}
			}
			else if(isSame(getStatus(), UPD_OPN)) {
				if(column == columnRslt_check){
					if(!r.can_exp_flg()){
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	public MCList<?> getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList<?> list =  super.getList(combo, row, info);
		if (combo == Cnd_ord_gnrt_typ) {
			// オーダ生成区分=計画外は検索対象外のため、検索条件からも除く
			list = list.subList(r -> !MSC_ORD_GNRT_TYP.isUPLND(r.getStringNE(MSC_ORD_GNRT_TYP.$VALUE)));
		}
		return list;
	}
}