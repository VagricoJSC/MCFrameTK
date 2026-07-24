package mcframe.clientMSBC.MSBCP0130;

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
 * 画面"MSBCP_PrcdOrdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_PrcdOrdSrch_MC extends MSBCP_PrcdOrdSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_PrcdOrdSrch_MC() {
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
	public MSBCP_PrcdOrdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0130_Srch01Caller<P extends MSBCP_PrcdOrdSrch, B extends MS_MSBCL0130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {



		protected MS_MSBCL0130_Srch01Caller(P p, B b) {
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

		/**
		 * 検索条件のチェック処理
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
			msgList.addAll(checkAtLeastOne(StsPanel));
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
	 * [MS_MSBCL0130_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0130_Upd01Caller<P extends MSBCP_PrcdOrdSrch, B extends MS_MSBCL0130_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0130_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBCL0130_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0130_Upd02Caller<P extends MSBCP_PrcdOrdSrch, B extends MS_MSBCL0130_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0130_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0130_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0130_Srch01().execDL();
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isNull(r)){
				return;
			}
			else if (MSC_ITM_ORD_STS_TYP.isOPN(r.itm_ord_sts_typ())) {
				doBtn_open_MSBCP0140(r);
			}
			else if (MSC_ITM_ORD_STS_TYP.isFIX(r.itm_ord_sts_typ())){
				doBtn_open_MSBCP0040(r);
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0140(MCEventInfo info) {
		// 先行手配オーダ訂正画面
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0140(r);
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0050(MCEventInfo info) {
		// オーダ確認画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0050ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0040(MCEventInfo info) {
		// オーダ登録画面
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP0040(r);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0080(MCEventInfo info) {
		// 品目オーダ進捗一覧
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0080ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	
	/** 遷移先(先行手配オーダ訂正)の設定 */
	protected void doBtn_open_MSBCP0140(RsltR r) {
		if (!isNull(r.itm_ord_no())){
			MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0140");
			mcframe.clientMSBC.MSBCP0140.MSBCP_PrcdOrdReg destP = 
				(mcframe.clientMSBC.MSBCP0140.MSBCP_PrcdOrdReg) so.getPanel();
			mcframe.clientMSBC.MSBCP0140.CndR cnd =
				mcframe.clientMSBC.MSBCP0140.CndR.create();
	
			String opeVal = destP.Cnd_ope_UPD.getActionCommand();
	
			cnd.ope(opeVal);
			cnd.itm_ord_no(r.itm_ord_no());
			so.putCnd(cnd);
			so.putSearchAction();
			so.show();
		}
	}
	
	
	/** 遷移先(オーダ登録)の設定 */
	protected void doBtn_open_MSBCP0040(RsltR r) {
		if (!isNull(r.itm_ord_no())){
			MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0040");
			mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg destP = 
				(mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg) so.getPanel();
			mcframe.clientMSBC.MSBCP0040.CndR cnd =
				mcframe.clientMSBC.MSBCP0040.CndR.create();
	
			String opeVal = destP.Cnd_ope_SRCH.getActionCommand();
	
			cnd.ope(opeVal);
			cnd.itm_ord_no(r.itm_ord_no());
			so.putCnd(cnd);
			so.putSearchAction();
			so.show();
		}
	}
	
	/** 遷移先(品目オーダ進捗一覧画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0050ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
		mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch destP = 
			(mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch) so.getPanel();
		mcframe.clientMSBC.MSBCP0050.CndR cnd =
			mcframe.clientMSBC.MSBCP0050.CndR.create();
		
		String opeVal = destP.Cnd_ope_REF.getActionCommand();
		cnd.ope(opeVal);
		cnd.itm_ord_no(r.itm_ord_no());
		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}
	
	/** 遷移先(品目オーダ進捗一覧画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0080ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0080");
		mcframe.clientMSBC.MSBCP0080.CndR cnd =
				mcframe.clientMSBC.MSBCP0080.CndR.create();

		cnd.itm_ord_no(r.itm_ord_no());
		so.runValueInit();
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
		callMS_MSBCL0130_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd2]の押下時の処理
	 */
	@Override
	public void doBtn_upd2(MCEventInfo info) {
		callMS_MSBCL0130_Upd02();
	}
	
	// ----------------------------------------------------
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltTableCellConfig());
	}

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
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(
				columnRslt_itm_cd,
				columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
				null, null, null, null);
	}
	
	/** イベントリスナー設定 */
	@Override
	protected void listenerInit() {
		super.listenerInit();
		//NC
		columnRslt_inst_qty.addNCListener(this);
		columnRslt_yield_schd_qty.addNCListener(this);
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
		// 品目状況
		setDefStsFlgByOpe();
		// オーダ区分、手配不許可フラグ
		setInitOrdTyp();
		setInitFixFlg();
	}
	
	/** 操作種別の初期値設定 */
	protected void setInitOpeTyp(){
		setValueEx(Cnd_ope_Group, Cnd_ope_FIX.getActionCommand());
	}

	/** 品目状況条件の初期値設定 */
	protected void setDefStsFlgByOpe() {
		setBoolean(StsPanel, false);
		if (Cnd_ope_FIX.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
		}
		else if (Cnd_ope_MOD.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_fix_flg, true);
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
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if(isChanged()){
			return confirmRegDataClear();
		}
		return true;
	}
	
	// NCイベント
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnRslt_inst_qty) {
			doRslt_inst_qty_NC(info);
		}
		else if (nc == columnRslt_yield_schd_qty) {
			doRslt_yield_schd_qty_NC(info);
		}
	}

	protected void doRslt_inst_qty_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		//指図数→出来高数
		if (!isNull(r) && !MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())){
			setValueEx(columnRslt_yield_schd_qty, index, r.inst_qty());
		}
	}

	protected void doRslt_yield_schd_qty_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		//出来高数→指図数
		if (!isNull(r) && !MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())){
			setValueEx(columnRslt_inst_qty, index, r.yield_schd_qty());
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub(info);
	}

	/** 種別切替後のイベント */
	public void doCnd_ope_NCSub(MCEventInfo info) {
		// 一覧クリア
		clearContainers(getRsltL());
		// 検索前ステータス
		setSrchStatusByOpe();
		// ステータスカラム
		setStatusColumn();
		// 品目状況
		setDefStsFlgByOpe();
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
	
	/** 選択カラムがチェックオンになった時の初期値設定 */
	public void doRslt_check_NCSub(RsltR srcRow) {
		//特になし
	}
	
	// 選択チェックオン時
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		doRslt_check_NCSub((RsltR)srcRow);
	}
	
	protected void setSrchStatusByOpe() {
		if (Cnd_ope_FIX.isSelected()) {
			setSRCH_FIXStatus();
		}
		else if (Cnd_ope_MOD.isSelected()) {
			setSRCH_MODStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}

		Ctrl_ctrl_PPanel.expand(true);
		setDefaultMode(Ctrl_ctrl_PPanel.Ope_srch);
	}

	protected void setUpdStatusByOpe() {
		if (Cnd_ope_FIX.isSelected()) {
			setUPD_FIXStatus();
		}
		else if (Cnd_ope_MOD.isSelected()) {
			setUPD_MODStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);

		setDefaultMode(Ctrl_ctrl_PPanel.Ope_srch);
	}
	
	@Override
	public void setSRCH_FIXStatus() {
		super.setSRCH_FIXStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_MODStatus() {
		super.setSRCH_MODStatus();
		setSrchStatusCom();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setSrchStatusCom();
	}

	protected void setSrchStatusCom() {
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setUPD_FIXStatus() {
		super.setUPD_FIXStatus();
		setUpdStatusCom();
	}

	@Override
	public void setUPD_MODStatus() {
		super.setUPD_MODStatus();
		setUpdStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setUpdStatusCom();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setUpdStatusCom();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD_FIX)
				|| isSame(getStatus(), UPD_MOD);
	}

	protected void setUpdStatusCom() {
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)){
			setDefaultMode(BtnPanel);
		}
		else if (MSC_ITM_ORD_STS_TYP.isOPN(r.itm_ord_sts_typ())){
			Btn_open_MSBCP0140.setMode(MCMode.ENABLE);
			Btn_open_MSBCP0040.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0050.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0080.setMode(MCMode.DISABLE);
			
		}
		else{
			Btn_open_MSBCP0140.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0040.setMode(MCMode.ENABLE);
			Btn_open_MSBCP0050.setMode(MCMode.ENABLE);
			Btn_open_MSBCP0080.setMode(MCMode.ENABLE);
		}
	}

	protected void setStatusColumn() {
			RsltTable.setStatusColumnVisible(true);
	}

	protected RsltTableCellConfig crtRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	protected class RsltTableCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (isUpdStatus()) {
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}

				if(isSame(getStatus(), UPD_FIX)) {
					if(column == columnRslt_check){
						// 手配不許可のオーダは確定不可
						if(r.not_fix_flg()){
							return MCMode.READ_ONLY;
						}
					}
				}
				else if(isSame(getStatus(), UPD_MOD)) {
					if (column == columnRslt_inst_qty
							|| column == columnRslt_yield_schd_qty
							|| column == columnRslt_intr_rmrks
							|| column == columnRslt_sub_char1
							|| column == columnRslt_sub_char2
							|| column == columnRslt_sub_char3) {
						// 
					}
					else if (column == columnRslt_po_schd_dt
							|| column == columnRslt_accpt_schd_dt) {
						// 発注予定日、検収予定日
						if(!MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
								&& !MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnRslt_mfg_st_schd_dt
							|| column == columnRslt_mfg_end_schd_dt) {
						// 製造着手・終了予定日
						if(!MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
								&& !MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnRslt_gi_schd_dt) {
						// 出庫予定日
						if(!MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())
								&& !MSC_ITM_ORD_TYP.isWG_XFR(r.itm_ord_typ())){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnRslt_insp_st_schd_dt
							|| column == columnRslt_insp_end_schd_dt) {
						// 検査着手・終了予定日
						if(!r.insp_flg()){
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	//--------------------------------------
	// IfListRegPanelの実装
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}