package mcframe.clientMSBE.MSBEP1760;

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
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5310.*;

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
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_ExActListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ExActListReg_MC extends MSBEP_ExActListReg_MC_A implements IfListRegPanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ExActListReg_MC() {
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
	public MSBEP_ExActListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1760_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1760_Srch01Caller<P extends MSBEP_ExActListReg, B extends MS_MSBEL1760_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1760_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			
			if (Cnd_ope_INS.isSelected()) {
				bridge.up0().setString(CndR.$is_crt, "1");
				bridge.up0().setString(CndR.$is_upd_del, null);
				bridge.up0().setString(CndR.$is_ref, null);
			}
			else if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
				bridge.up0().setString(CndR.$is_crt, null);
				bridge.up0().setString(CndR.$is_upd_del, "1");
				bridge.up0().setString(CndR.$is_ref, null);
			}
			else {
				bridge.up0().setString(CndR.$is_crt, null);
				bridge.up0().setString(CndR.$is_upd_del, null);
				bridge.up0().setString(CndR.$is_ref, "1");
			}
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			for (RsltR r : bridge.down0()) {
				// 計上日を取消計上日にコピー
				r.can_ac_dt(r.ac_dt());
			}
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

		protected void setRefStatus() {
			// 検索後ステータス
			if (Cnd_ope_INS.isSelected()) {
				setINSStatus();
			}
			else if (Cnd_ope_UPD.isSelected()) {
				setUPDStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setDELStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setREFStatus();
			}
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}

		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			checkDt(msgList);
		}
		
		/**
		 * 日付の前後関係をチェックする。
		 * 
		 * @param msgList メッセージリスト
		 */
		protected void checkDt(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_cmpl_schd_dt_fr, Cnd_cmpl_schd_dt_to));
		}
	}


	/**
	 * [MS_MSBEL1760_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1760_Upd01Caller<P extends MSBEP_ExActListReg, B extends MS_MSBEL1760_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1760_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			
			if (Cnd_ope_INS.isSelected()) {
				bridge.up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				bridge.up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			MCList<ShipPrCntR> up2 = MCList.create(ShipPrCntR.class);
			MCIndexKey ik = getShipPrCntL().createIndex(ShipPrCntR.$iv_no);
			for (RsltR r : bridge.up1()) {
				up2.addAll(getShipPrCntL().subList(ik, r.iv_no()));
			}
			bridge.up2().setAll(up2);
		}
	}

	/**
	 * [MS_MSBEL1760_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1760_Del01Caller<P extends MSBEP_ExActListReg, B extends MS_MSBEL1760_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1760_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			
			MCList<ShipPrCntR> up1 = MCList.create(ShipPrCntR.class);
			MCIndexKey ik = getShipPrCntL().createIndex(ShipPrCntR.$iv_no);
			for (RsltR r : bridge.up0()) {
				up1.addAll(getShipPrCntL().subList(ik, r.iv_no()));
			}
			bridge.up1().setAll(up1);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			for (RsltR r : getRsltL()) {
				if (r.check()) {
					msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(), columnRslt_can_ac_dt_for_input));
				}
			}
		}
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		RsltTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		RsltTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1760_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1730]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1730(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1730");
		aso.putCnd(crtOpenMSBEP1730CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBE.MSBEP1730.CndR crtOpenMSBEP1730CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg p = (mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1730.CndR to = mcframe.clientMSBE.MSBEP1730.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand()); //操作種別＠参照

		to.srch_tgt_no(r.iv_no());
	
		return to;
	}	

	// -----------------------------------------------
	// Event
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL(), getShipPrCntL());
		setSrchStatus();
		
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(BulkSet_cmpl_dt, getToday());
			setValueEx(BulkSet_ac_dt, getToday());
			setValueEx(BulkSet_bill_basis_dt, getToday());
			setValueEx(BulkSet_rcv_schd_dt, null);
		}
		else {
			// 訂正時に日付が変わらないよう、新規登録のみ初期値を設定する
			setValueEx(BulkSet_cmpl_dt, null);
			setValueEx(BulkSet_ac_dt, null);
			setValueEx(BulkSet_bill_basis_dt, null);
			setValueEx(BulkSet_rcv_schd_dt, null);
		}
	}
	/**
	 * 操作種別変更時などにコンテをナクリアするメソッド
	 * containers をListに格納し直して実行（ヘッダ、明細対応）
	 *
	 * @param containers Rowステータスを変更するコンテナ
	 */
	protected void clearContainers(MCContainer... containers) {
		List<MCContainer> l = new ArrayList<MCContainer>();
		for (MCContainer c :containers) {
			l.add(c);
		}
		clearContainers(l);
	}
	
	/**
	 * 操作種別変更時などにコンテをナクリアするメソッド
	 *
	 * @param containers Rowステータスを変更するコンテナ
	 */
	protected void clearContainers(List<MCContainer> containers) {
		if (containers == null)
			return;
		for (MCContainer c : containers) {
			c.clear();
			if (c instanceof MCRow) {
				((MCRow) c).setStatus(Status.NONE);
			}
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo,MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			doBtn_open_MSBEP1730(info);
		}
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		BulkSet_ac_dt.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == BulkSet_ac_dt) {
			doBulkSet_ac_dt_LC(info);
		}
	}
	
	@Override
	public void doBulkSet_cmpl_dt_LC(MCEventInfo info) {
		super.doBulkSet_cmpl_dt_LC(info);
		bulkSet(BulkSet_cmpl_dt);
	}
	
	protected void doBulkSet_ac_dt_LC(MCEventInfo info) {
		bulkSet(BulkSet_ac_dt);
	}
	
	@Override
	public void doBulkSet_bill_basis_dt_LC(MCEventInfo info) {
		super.doBulkSet_bill_basis_dt_LC(info);
		bulkSet(BulkSet_bill_basis_dt);
	}
	
	@Override
	public void doBulkSet_rcv_schd_dt_LC(MCEventInfo info) {
		super.doBulkSet_rcv_schd_dt_LC(info);
		bulkSet(BulkSet_rcv_schd_dt);
	}
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (r.check()) {
			bulkSet(BulkSet_cmpl_dt, r);
			bulkSet(BulkSet_ac_dt, r);
			bulkSet(BulkSet_bill_basis_dt, r);
			bulkSet(BulkSet_rcv_schd_dt, r);
		}
	}

	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}
	
	protected void bulkSet(MCBeans b, RsltR r) {
		
		if (b == BulkSet_cmpl_dt && !isNull(getBulkSetR().cmpl_dt()) && isEditable(columnRslt_cmpl_dt, r.getGUIIndex())) {
			r.cmpl_dt(getBulkSetR().cmpl_dt());
		}
		if (b == BulkSet_ac_dt && !isNull(getBulkSetR().ac_dt())  && isEditable(columnRslt_ac_dt, r.getGUIIndex())) {
			r.ac_dt(getBulkSetR().ac_dt());
		}
		if (b == BulkSet_bill_basis_dt && !isNull(getBulkSetR().bill_basis_dt()) && isEditable(columnRslt_bill_basis_dt, r.getGUIIndex())) {
			r.bill_basis_dt(getBulkSetR().bill_basis_dt());
		}
		if (b == BulkSet_rcv_schd_dt && !isNull(getBulkSetR().rcv_schd_dt()) && isEditable(columnRslt_rcv_schd_dt, r.getGUIIndex())) {
			r.rcv_schd_dt(getBulkSetR().rcv_schd_dt());
		}
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
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBEL1760_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1760_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1760_Del01();
	}
	
// IfListRegPanel
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		// 計上日
		BulkSet_ac_dt_p_PPanel.setRelateBeans(BulkSet_cmpl_dt);
		Rslt_ac_dt_p_PPanel.setRelateBeans(columnRslt_cmpl_dt);
		
		Rslt_ttl_iv_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_ncv_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_base_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_freight_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_insurance_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_other_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);

	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {

		setValueEx(BulkSet_cmpl_dt, getToday());
		setValueEx(BulkSet_ac_dt, getToday());
		setValueEx(BulkSet_bill_basis_dt, getToday());
		
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		RsltTable.setCellConfig(createMSBEP1760CellConfig());
	}
	
	protected MSBEP1760CellConfig createMSBEP1760CellConfig() {
		return new MSBEP1760CellConfig();
	}

	/**
	 * RsltTableのCellConfig
	 */
	protected class MSBEP1760CellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			RsltR activeR = RsltTable.getRow(index);

			if(getStatus() == INS || getStatus() == UPD || getStatus() == DEL) {
				if (MAC_RTN_STS_TYP.isOK(activeR.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if(getStatus() == INS || getStatus() == UPD) {
				
				if(column == columnRslt_bill_basis_dt) {
					return setBillBasisDtMode(activeR);
				}
				else if(column == columnRslt_rcv_schd_dt) {
					return setRcvSchdDtMode(activeR);
				}
				else if(column == columnRslt_arr_schd_dt) {
					return setArrSchdDtMode(activeR);
				}
				else if(column == columnRslt_sls_schd_dt) {
					return setSlsSchdDtMode(activeR);
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
		/**
		 * 請求起算日の制御。
		 * 取引パタンが「売上」 かつ 請求締区分が「売上都度請求」以外の場合に必須入力
		 */
		protected MCMode setBillBasisDtMode(RsltR r) {

			if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) && 
					!MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
				return MCMode.REQUIRED;
			}
			else {
				return MCMode.READ_ONLY;
			}
		}

		/**
		 * 入金予定日の制御。
		 * 取引パタンが「売上」 かつ 売上計上区分：出荷基準 かつ　請求締区分が
		 * 「売上都度請求」の場合に必須入力。
		 */
		protected MCMode setRcvSchdDtMode(RsltR r) {

			if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) && 
					MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
				
				if (r.sls_cststk_flg()) {
					return MCMode.READ_ONLY;
				}
				if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(r.sls_basis_typ())) {
					return MCMode.REQUIRED;
				}
				else {
					return MCMode.ENABLE;
				}
			}
			else {
				return MCMode.READ_ONLY;
			}
		}

		/**
		 * 入荷予定日の制御。
		 * 取引パタンが「売上」以外の場合、必須入力
		 */
		protected MCMode setArrSchdDtMode(RsltR r) {

			if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) && !MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
				return MCMode.REQUIRED;
			}
			else {
				return MCMode.READ_ONLY;
			}
		}

		/**
		 * 売上予定日の制御。
		 * 取引パタンが「売上」の場合、必須入力
		 */
		protected MCMode setSlsSchdDtMode(RsltR r) {

			if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())) {
				if (r.sls_cststk_flg()) {
					return MCMode.READ_ONLY;
				}
				else {
					return MCMode.REQUIRED;
				}
			}
			else {
				return MCMode.READ_ONLY;
			}
		}

	}
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return columnRslt_ac_dt;
	}
	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}
	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || (Cnd_ope_DEL.isSelected())) {
			return true;
		}
		return false;
	}
	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return columnRslt_check;
	}
	
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
		Rslt_can_ac_dt_p_PPanel.canAcDtValueInit(r);
	}

}