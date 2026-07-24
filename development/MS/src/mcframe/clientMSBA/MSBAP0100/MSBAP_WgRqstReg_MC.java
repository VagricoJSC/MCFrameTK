package mcframe.clientMSBA.MSBAP0100;

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
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5040.*;

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
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientMAUD.MAUDP0110.MAUDP_ListListener;
import mcframe.clientMAUA.MAUAP0010.MAUAP_List;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBAP_WgRqstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBAP_WgRqstReg_MC extends MSBAP_WgRqstReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCList<Rslt2R> _wgRqstPrmsList = MCList.create(Rslt2R.class);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBAP_WgRqstReg_MC() {
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
	public MSBAP_WgRqstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Rslt1Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_select_all(MCEventInfo info) {
		doSelectAll(Rslt1Table);
	}
	/**
	 * Panel[Rslt1Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_deselect_all(MCEventInfo info) {
		doDeselectAll(Rslt1Table);
	}
	/**
	 * Panel[Rslt1Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_radd(MCEventInfo info) {
		insertRow(Rslt1Table);
	}
	/**
	 * Panel[Rslt1Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_rdel(MCEventInfo info) {
		deleteRow(Rslt1Table);
	}
	/**
	 * Panel[Rslt1Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doRslt1Btn_rcopy(MCEventInfo info) {
		Rslt1R r = copyRow(Rslt1Table);
		clearNotCopyCol(r.getGUIIndex());
		setNotCmpl(r.getGUIIndex());
	}
	/**
	 * [MS_MSBAL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0100_Srch01Caller<P extends MSBAP_WgRqstReg, B extends MS_MSBAL0100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0100_Srch01Caller(P p, B b) {
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
			checkForCallStackSub(msgList);
		}
	
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(RqstTypPanel));
			msgList.addAll(checkAtLeastOne(RqstStsPanel));
			msgList.addAll(checkAtLeastOne(SloRqstPanel));
	
			msgList.addAll(checkBeforeAfter(Cnd_rqst_dt_fr, Cnd_rqst_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_srch_dt_fr, Cnd_srch_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_re_rqst_dt_fr, Cnd_re_rqst_dt_to));
		}

		@Override
		protected void show() {
			super.show();
			setHiddenList(bridge.down1());
		}
	
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			fillSpace();
		}
	
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
			fillSpace();
		}

		@Override
		protected void clear() {
			super.clear();

			clearHiddenList();
		}
	}

	/**
	 * [MS_MSBAL0100_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0100_Imp01Caller<P extends MSBAP_WgRqstReg, B extends MS_MSBAL0100_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBAL0100_Imp01Caller(P p, B b) {
			super(p, b);
		}
	
		@Override
		protected void initCaller() {
			super.initCaller();
		}
	
		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}
	
			Ctrl_ctrl_PPanel.expand(false);
		}
	
		protected boolean hasNg() {
			if (bridge.down0().subList(Rslt1R.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()).size() > 0) {
				return true;
			}
			return false;
		}

		@Override
		protected void handleMCEx(MCException ex){
			super.handleMCEx(ex);
			setFIX_UStatus();
		}
	
		@Override
		protected void afterCall() {
			super.afterCall();
			for (Rslt1R r : bridge.down0()) {
				r.check(true);
			}
		}
	}

	/**
	 * [MS_MSBAL0100_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0100_Upd01Caller<P extends MSBAP_WgRqstReg, B extends MS_MSBAL0100_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBAL0100_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBAL0100_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0100_Del01Caller<P extends MSBAP_WgRqstReg, B extends MS_MSBAL0100_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBAL0100_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBAL0100_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBAL0100_Srch01().execDL();
	}
	
	/**
	 * 行コピー時に一部の項目をクリアする。
	 * @param index　対象行のインデックス
	 */
	protected void clearNotCopyCol(int index) {
		setValueEx(columnRslt1_wg_rqst_no, index, null);
		setValueEx(columnRslt1_last_wg_rqst_no, index, null);
		setValueEx(columnRslt1_prms_uncn_flg, index, false);
		setValueEx(columnRslt1_re_rqst_flg, index, false);
		setValueEx(columnRslt1_prms_ntc_flg, index, false);
		setValueEx(columnRslt1_prms_dt, index, null);
		setValueEx(columnRslt1_wg_rqst_sts_typ, index, null);
		setValueEx(columnRslt1_wg_rqst_sts_typ_nm, index, null);
		setValueEx(columnRslt1_wg_rqst_src_typ, index, null);
		setValueEx(columnRslt1_wg_rqst_src_typ_nm, index, null);
		setValueEx(columnRslt1_wg_rqst_src_no, index, null);
		setValueEx(columnRslt1_re_rqst_dt, index, null);
		setValueEx(columnRslt1_wg_re_rqst_cnt_rmrks, index, null);
		setValueEx(columnRslt1_io_schd_pr_no, index, null);
		setValueEx(columnRslt1_itm_ord_no, index, null);
		setValueEx(columnRslt1_rqst_crrct_dt, index, null);
		setValueEx(columnRslt1_rqst_can_dt, index, null);
		setValueEx(columnRslt1_prms_can_dt, index, null);
		setValueEx(columnRslt1_inst_dt, index, null);
		setValueEx(columnRslt1_inst_can_dt, index, null);
		setValueEx(columnRslt1_act_dt, index, null);
		setValueEx(columnRslt1_act_can_dt, index, null);
		setValueEx(columnRslt1_vld_dt_fr, index, null);
		setValueEx(columnRslt1_vld_dt_to, index, null);
		Rslt1R r = getRslt1L().get(index);
		if(!isNull(r.base_unit_dec_place())) {
			setValueEx(columnRslt1_cmpl_qty, index, MCNumber.ZERO);
		}
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBAL0100_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBAL0100_Del01();
	}
	
	@Override
	public MCTable getListRegTable() {
		return Rslt1Table;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();

		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_rqst_dt);
		Rslt1_usr_dpt_p_PPanel.setRelateBeans(columnRslt1_rqst_dt);
	
		Rslt1_ver_no_p_PPanel.setRelateBeans(columnRslt1_itm_cd, columnRslt1_itm_sub1,
				columnRslt1_itm_sub2, columnRslt1_itm_sub3, columnRslt1_gr_site_cd, columnRslt1_ver_flg);
		Rslt1_lot_no_p_PPanel.setRelateBeans(columnRslt1_itm_cd, columnRslt1_itm_sub1, columnRslt1_itm_sub2, columnRslt1_itm_sub3, columnRslt1_lot_mng_typ, columnRslt1_sublot_mng_typ);

		Rslt1_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt1_itm_cd,
				columnRslt1_itm_sub1, columnRslt1_itm_sub2, columnRslt1_itm_sub3,
				columnRslt1_trd_unit_cd, columnRslt1_trd_unit_dec_place,
				columnRslt1_trd_unit_rnd_typ, columnRslt1_trd_unit_conv_base_qty,
				columnRslt1_trd_unit_conv_qty, columnRslt1_base_unit_cd);

		Rslt1_base_unit_qty_p_PPanel.setRelateBeans(columnRslt1_base_unit_cd, columnRslt1_base_unit_dec_place, columnRslt1_base_unit_rnd_typ, columnRslt1_trd_unit_qty, columnRslt1_trd_unit_conv_base_qty, columnRslt1_trd_unit_conv_qty);
		Rslt1_not_cmpl_qty_p_PPanel.setRelateBeans(columnRslt1_base_unit_cd, columnRslt1_base_unit_dec_place);
		Rslt1_cmpl_qty_p_PPanel.setRelateBeans(columnRslt1_base_unit_cd, columnRslt1_base_unit_dec_place);
		Rslt2_prms_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt2_prms_base_unit_qty, columnRslt2_prms_base_unit_dec_place);
		Rslt2_prms_base_unit_qty_p_PPanel.setRelateBeans(columnRslt2_prms_base_unit_cd, columnRslt2_prms_base_unit_dec_place, columnRslt2_prms_base_unit_rnd_typ, columnRslt2_prms_trd_unit_qty, columnRslt2_prms_trd_unit_conv_base_qty, columnRslt2_prms_trd_unit_conv_qty);
		Rslt1_gr_str_ln_p_PPanel.setRelateBeans(columnRslt1_gr_loc_cd, columnRslt1_gr_str_ln_tgt_flg);
		Rslt1_rqst_to_str_ln_p_PPanel.setRelateBeans(columnRslt1_rqst_to_loc_cd, columnRslt1_rqst_to_str_ln_tgt_flg);
		Rslt1_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt1_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt1_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		Rslt1_itm_p_PPanel.setRelateBeans(columnRslt1_sundry_itm_flg);
		Rslt1_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt1_itm_cd, columnRslt1_itm_sub1,
				columnRslt1_itm_sub2, columnRslt1_itm_sub3, columnRslt1_sno1_mng_typ,
				columnRslt1_sno2_mng_typ, columnRslt1_sno3_mng_typ,
				columnRslt1_sno4_mng_typ);
		Rslt1_bditm_p_PPanel.setRelateBeans(columnRslt1_bd_lot_mng_typ,
				columnRslt1_bd_sublot_mng_typ, columnRslt1_bd_sno1_mng_typ,
				columnRslt1_bd_sno2_mng_typ, columnRslt1_bd_sno3_mng_typ,
				columnRslt1_bd_sno4_mng_typ);

	}
	

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
	
		// 発注先、メーカは入力補助も使用可能とする。
		linkBeansToISPanelCustom(columnRslt1_sppl_cd);
		linkBeansToISPanelCustom(columnRslt1_maker_cd);
		linkBeansToISPanelCustom(columnRslt1_rqst_to_loc_cd);
		linkBeansToISPanelCustom(Cnd_sppl_cd, true);
		linkBeansToISPanelCustom(Cnd_dlv_cd, true);
	
		getRslt1_gr_loc_cd_ListPutter().putBind(LocCols.$m_rd_flg , MCMode.READ_ONLY.getName());
		getRslt1_gr_loc_cd_ListPutter().putBind(LocCols.$m_wr_flg , MCMode.READ_ONLY.getName());
	}

	@Override
	protected void valueInit() {
		super.valueInit();
	
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_xfr_rqst_flg, true);
		setValueEx(Cnd_purc_rqst_flg, true);
		setValueEx(Cnd_rqst_sts_flg, true);
		setValueEx(Cnd_prms_sts_flg, true);
		setValueEx(Cnd_un_slo_rqst_flg, true);

		setValueEx(Cnd_ship_rqst_flg, false);
		setValueEx(Cnd_inst_sts_flg, false);
		setValueEx(Cnd_cmpl_sts_flg, false);
		setValueEx(Cnd_slo_rqst_flg, false);
	}
	
	@Override
	public void screenClearBody() {
		super.screenClearBody();
	
		clearHiddenList();
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			Rslt1Table.fillSpace();
		}
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setCndMode();
		setBtnMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setCndMode();
		setBtnMode();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setCndMode();
		Rslt1Table.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
		Rslt1Table.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	protected void setCndMode() {
		if (!isNull(getCndR().wg_rqst_ntc_day_typ())) {
			Cnd_srch_dt_fr.setMode(MCMode.ENABLE);
			Cnd_srch_dt_to.setMode(MCMode.ENABLE);
		}
	}

	protected void setBtnMode() {
		Rslt1R r = Rslt1Table.getSelectedMCRow();
	
		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Rslt1Btn_rdel.setMode(MCMode.DISABLE);
				Rslt1Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (r.isStatusCreate() || isNull(r.wg_rqst_upd_cntr())) {
					setDefaultMode(Rslt1Btn_rdel);
				}
				else {
					Rslt1Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Rslt1Btn_rcopy);
			}
		}
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
	
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			Rslt1Table.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	// -----------------------------------------------
	// event/listener
	@Override
	public void doRslt1_NC(MCEventInfo info) {
		super.doRslt1_NC(info);
		setBtnMode();
		int idx = info.getEventIndex();
		if (idx >= 0) {
			Rslt1R row = getRslt1L().get(idx);
			showPrms(row);
		}
		Rslt2Table.adjustWidth();
	}
	
	/**
	 * 回答一覧の検索結果を保持
	 */

	protected void clearHiddenList() {
		_wgRqstPrmsList = MCList.create(Rslt2R.class);
	}

	/**
	 * 回答一覧の検索結果を設定する。
	 * @param prms　検索した結果の回答
	 */
	protected void setHiddenList(MCList<Rslt2R> prms) {
		_wgRqstPrmsList = prms;
	}

	/**
	 * 依頼に対する回答を表示する。
	 * @param row 対象の依頼行
	 */
	protected void showPrms(Rslt1R row) {
		if (!isNull(row)){
			// 回答が通知されている場合のみ
			if(row.prms_ntc_flg()) {
				getRslt2L().setAll(_wgRqstPrmsList.subList(Rslt2R.$wg_rqst_no, row.wg_rqst_no()));
				showSub(Rslt2Table);
			}
			else {
				getRslt2L().clear();
			}
		}
		else {
			getRslt2L().clear();
		}
	}
	
	protected void showSub(MCTable<?> tbl) {
		if (tbl.getList().size() > 0) {
			sort(tbl);

			tbl.selectLeftmostColumn(0);
		}
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（ファイル取込エラー時）、REF（検索モード）では、クリア確認出さない
			if (!isRegStatus() || isStatusNone(getRslt1L())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRslt1L(), getRslt2L());
		clearCnd();
		clearHiddenList();
		fillSpace();
		setSrchStatus();
		setStatusColumn();
	}

	protected void clearCnd() {
		if(Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_ship_rqst_flg, false);
			setValueEx(Cnd_part_inst_sts_flg, false);
			setValueEx(Cnd_inst_sts_flg, false);
			setValueEx(Cnd_cmpl_sts_flg, false);
			setValueEx(Cnd_slo_rqst_flg, false);
			setValueEx(Cnd_un_slo_rqst_flg, true);
			setValueEx(Cnd_inc_can_flg, false);
		}
	}

	protected void setStatusColumn() {
		// 行ステータスカラムの表示非表示。登録・訂正する種別では表示、それ以外は非表示
		if (Cnd_ope_UPD.isSelected()) {
			Rslt1Table.setStatusColumnVisible(true);
		}
		else {
			Rslt1Table.setStatusColumnVisible(false);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnRslt1_trd_unit_qty.addLCListener(this);
		columnRslt2_prms_trd_unit_qty.addLCListener(this);
		Rslt1_itm_p_PPanel.addItmLCListner(this);
	
		BulkSet_rqst_fr_usr_cd.addLCListener(this);
		BulkSet_rqst_fr_dpt_cd.addLCListener(this);
		columnRslt1_base_unit_qty.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
	
		int idx = info.getEventIndex();

		if (lc == Cnd_wg_rqst_ntc_day_typ) {
			if (isNull(getCndR().wg_rqst_ntc_day_typ())) {
				getCndR().srch_dt_fr(null);
				getCndR().srch_dt_to(null);
				Cnd_srch_dt_fr.setMode(MCMode.READ_ONLY);
				Cnd_srch_dt_to.setMode(MCMode.READ_ONLY);
			}
			else {
				Cnd_srch_dt_fr.setMode(MCMode.ENABLE);
				Cnd_srch_dt_to.setMode(MCMode.ENABLE);	
			}
		}
	
		if (lc == BulkSet_rqst_fr_usr_cd) {
			bulkSet(BulkSet_rqst_fr_usr_cd);
		}
		else if (lc == BulkSet_rqst_fr_dpt_cd) {
			bulkSet(BulkSet_rqst_fr_dpt_cd);
		}
		else if (lc == columnRslt1_base_unit_qty) {
			setNotCmpl(info.getEventIndex());
		}
		else if (Rslt1_itm_p_PPanel.isItm(lc)) {
			setValueEx(columnRslt1_mfg_loc_cd, idx, null);
			setValueEx(columnRslt1_bom_ptn, idx, null);
			setValueEx(columnRslt1_sppl_cd, idx, null);
			setValueEx(columnRslt1_maker_cd, idx, null);
			setValueEx(columnRslt1_rqst_to_loc_cd, idx, null);
			setValueEx(columnRslt1_trd_unit_cd, idx, null);
			setValueEx(columnRslt1_trd_cd, idx, null);
			setValueEx(columnRslt1_purc_rsn_cd, idx, null);
	
			Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
			if(!isNull(rslt1R)) {
				rslt1R.bditm_p().clear();
				setIvItmNm(rslt1R);
				if(Rslt1_itm_p_PPanel.isItmFix(info.getEventIndex())) {
					setColByDscntItm(rslt1R);
					setDefStrLnCd(rslt1R);
				}
			}
		}
		else if (lc == columnRslt1_gr_loc_wg_cd) {
			setValueEx(columnRslt1_mfg_loc_cd, idx, null);
			setValueEx(columnRslt1_bom_ptn, idx, null);
			setValueEx(columnRslt1_sppl_cd, idx, null);
			setValueEx(columnRslt1_maker_cd, idx, null);
			setValueEx(columnRslt1_rqst_to_loc_cd, idx, null);
		}
		else if (lc == columnRslt1_wg_rqst_typ) {
			setValueEx(columnRslt1_lot_no, idx, null);
			setValueEx(columnRslt1_sublot_no, idx, null);
		}
		else if (lc == columnRslt1_mfg_loc_cd) {
			setValueEx(columnRslt1_bom_ptn, idx, null);
		}
	}

	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(Rslt1R rsltR) {
		if (isNull(rsltR.gr_loc_cd()) || !rsltR.gr_str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				rsltR.itm_cd(), 
				rsltR.itm_sub1(), 
				rsltR.itm_sub2(), 
				rsltR.itm_sub3(), 
				rsltR.gr_loc_cd(), 
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnRslt1_gr_str_ln_cd_none_flg, rsltR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnRslt1_gr_str_ln_cd, rsltR.getGUIIndex(), StrLnCd);
		}
	}

	/**
	 * 基準単位依頼残数量を設定する
	 * @param index　対象行のインデックス
	 */
	protected void setNotCmpl(int index) {
		Rslt1R r = Rslt1Table.getRow(index);
		MCNumber notCmplQty = MCNumber.ZERO;
		if(!isNull(r)) {
			if (r.check()) {
				if(isNull(r.base_unit_qty())) {
					setValueEx(columnRslt1_not_cmpl_qty, r.getGUIIndex(), null);
				}
				else {
					notCmplQty = notCmplQty.add(r.base_unit_qty().subtract(nvl(r.cmpl_qty(), MCNumber.ZERO)));
					if(notCmplQty.isNegative()) {
						notCmplQty = MCNumber.ZERO;
					}
					setValueEx(columnRslt1_not_cmpl_qty, r.getGUIIndex(), notCmplQty);
				}
			}
		}
	}
	
	@Override
	public void doBulkSet_rqst_dt_LC(MCEventInfo info) {
		super.doBulkSet_rqst_dt_LC(info);
		bulkSet(BulkSet_rqst_dt);
	}
	
	@Override
	public void doBulkSet_rqst_fr_wg_cd_LC(MCEventInfo info) {
		super.doBulkSet_rqst_fr_wg_cd_LC(info);
		bulkSet(BulkSet_rqst_fr_wg_cd);
	};

	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		if (srcRow instanceof Rslt1R) {
			Rslt1R r = (Rslt1R)srcRow;
			if(isNull(r.rqst_dt())) {
				bulkSet(BulkSet_rqst_dt, r);
			}
			if(isNull(r.rqst_fr_wg_cd())) {
				bulkSet(BulkSet_rqst_fr_wg_cd, r);
			}
			if(isNull(r.rqst_fr_usr_cd())) {
				bulkSet(BulkSet_rqst_fr_usr_cd, r);
			}
			if(isNull(r.rqst_fr_dpt_cd())) {
				bulkSet(BulkSet_rqst_fr_dpt_cd, r);
			}
		}
	}

	@Override
	public void doRslt1_re_rqst_flg_NC(MCEventInfo info) {
		super.doRslt1_re_rqst_flg_NC(info);
		Rslt1R r = getRslt1L().get(info.getEventIndex());
		if (r.re_rqst_flg()) {
			r.re_rqst_dt(getToday());
			r.prms_uncn_flg(false);
		}
		else {
			r.re_rqst_dt(null);
		}
	}
	
	
	@Override
	public void doRslt1_check_NC(MCEventInfo info) {
		super.doRslt1_check_NC(info);
		Rslt1R r = getRslt1L().get(info.getEventIndex());
		if (r.check()) {
			bulkSet(BulkSet_rqst_dt, r);
			bulkSet(BulkSet_rqst_fr_wg_cd, r);
			bulkSet(BulkSet_rqst_fr_usr_cd, r);
			bulkSet(BulkSet_rqst_fr_dpt_cd, r);
		}
	}
	
	@Override
	public void doRslt1_wg_rqst_typ_LC(MCEventInfo info) {
		super.doRslt1_wg_rqst_typ_LC(info);
	
		setValueEx(columnRslt1_rqst_to_loc_cd, info.getEventIndex(), null);
		setValueEx(columnRslt1_gi_rqst_dt, info.getEventIndex(), null);
		setValueEx(columnRslt1_gi_rqst_hm, info.getEventIndex(), null);
		setValueEx(columnRslt1_sppl_cd, info.getEventIndex(), null);
		setValueEx(columnRslt1_maker_cd, info.getEventIndex(), null);
		setValueEx(columnRslt1_mfg_loc_cd, info.getEventIndex(), null);
		setValueEx(columnRslt1_bom_ptn, info.getEventIndex(), null);
		setValueEx(columnRslt1_purc_rsn_cd, info.getEventIndex(), null);
		setValueEx(columnRslt1_trd_cd, info.getEventIndex(), null);
	}

	protected void doRslt1_usr_cd_LC(MCEventInfo info){
		bulkSet(BulkSet_rqst_fr_usr_cd);
	}
	
	@Override
	public void doRslt1_sppl_cd_LC(MCEventInfo info) {
		super.doRslt1_sppl_cd_LC(info);
	
		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
		setIvItmNm(rslt1R);
		setValueEx(columnRslt1_maker_cd, info.getEventIndex(), null);
	}

	protected void bulkSet(MCBeans b) {
		for (Rslt1R r : Rslt1Table.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}
	
	protected void bulkSet(MCBeans b, Rslt1R r) {
		if (isNull(r.wg_rqst_no())) {
			if(b == BulkSet_rqst_dt && isEditable(columnRslt1_rqst_dt, r.getGUIIndex())) {
				r.rqst_dt(getBulkSetR().rqst_dt());
			}
			else if(b == BulkSet_rqst_fr_wg_cd && isEditable(columnRslt1_rqst_fr_wg_cd, r.getGUIIndex())) {
				r.rqst_fr_wg_cd(getBulkSetR().rqst_fr_wg_cd());
				r.rqst_fr_wg_nm(getBulkSetR().rqst_fr_wg_nm());
			}
			else if(b == BulkSet_rqst_fr_usr_cd && isEditable(columnRslt1_rqst_fr_usr_cd, r.getGUIIndex())) {
				r.rqst_fr_usr_cd(getBulkSetR().rqst_fr_usr_cd());
				r.rqst_fr_usr_nm(getBulkSetR().rqst_fr_usr_nm());
			}
			else if(b == BulkSet_rqst_fr_dpt_cd && isEditable(columnRslt1_rqst_fr_dpt_cd, r.getGUIIndex())) {
				r.rqst_fr_dpt_cd(getBulkSetR().rqst_fr_dpt_cd());
				r.rqst_fr_dpt_nm(getBulkSetR().rqst_fr_dpt_nm());
			}
		}
	}

	@Override
	public MCList getRslt1_wg_rqst_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispWgRqstTyp());
		return super.getRslt1_wg_rqst_typ(row, info);
	}
	
	public MSC_WG_RQST_TYP[] getDispWgRqstTyp() {
		return new MSC_WG_RQST_TYP[] {
				MSC_WG_RQST_TYP.PURC,
				MSC_WG_RQST_TYP.XFR
		};
	}
	
	@Override
	public MCList getRslt1_rqst_to_wg_cd(MCRow row, MCEventInfo info) {
		Rslt1R r = getRslt1L().get(info.getEventIndex());
		MAUAP_List lst = (MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this);
		MCList<MCRow> tmpL = MCList.create(MCRow.class);
		tmpL.addStringColumn("RQST_TO_WG_CD");
		tmpL.addStringColumn("RQST_TO_WG_NM");
		// 棚卸資産管理しない品目は購買ＷＧから選択
		if (MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())
				&& MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
			tmpL = lst.getPurcWg(row, info);
		}
		else {
			tmpL = lst.getWg(row, info);
		} 
		for(MCRow tmpR : tmpL) {
			tmpR.setStringNE("RQST_TO_WG_CD", tmpR.getStringNE("WG_CD"));
			tmpR.setStringNE("RQST_TO_WG_NM", tmpR.getStringNE("WG_NM"));
		}
		return tmpL;
	}
	@Override
	public MCList<?> getRslt1_rqst_to_loc_cd(MCRow row, MCEventInfo info){
		String t = columnRslt1_rqst_to_loc_cd.getListConfig().getOpeType();
		if (mcframe.clientCore.beans.list.MCListConfig.LIST.equals(t)) {
			row.setStringNE("loc_is_srch_typ", MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL.value());
			Rslt1R r = getRslt1L().get(info.getEventIndex());
			row.setStringNE("itm_cd", r.itm_cd());
			row.setStringNE("itm_sub1", r.itm_sub1());
			row.setStringNE("itm_sub2", r.itm_sub2());
			row.setStringNE("itm_sub3", r.itm_sub3());
			row.setStringNE("wg_cd", r.gr_loc_wg_cd());
			row.setDateNE("master_dt", r.gi_rqst_dt());
			row.setStringNE("itm_ord_typ", MSC_ITM_ORD_TYP.WG_XFR.value());
			row.setStringNE("strg_loc_cd", r.gr_loc_cd());
			MCList<?> itmDtlL = ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlRqstLoc(row, info);
			for (MCRow x : itmDtlL) {
				x.setStringNE("loc_cd", x.getStringNE("rqst_loc_cd"));
				x.setStringNE("loc_nm", x.getStringNE("rqst_loc_nm"));
				x.setStringNE("wg_cd", x.getStringNE("rqst_wg_cd"));
				x.setStringNE("wg_nm", x.getStringNE("rqst_wg_nm"));
			}
			return itmDtlL;
		}
		return super.getRslt1_rqst_to_loc_cd(row, info);
	}

	@Override
	public MCList getRslt1_bom_ptn(MCRow row, MCEventInfo info) {
		return getNoDupList(super.getRslt1_bom_ptn(row, info), ItmDtlBomPtnCols.$o_bom_ptn);
	}
	
	protected MCList<?> getNoDupList(MCList<?> lst, String... key) {
		MCList ret = lst.shallowClone();	// 一時カラムを保持
		ret.clear();

		lst.sort(key);
		MCRow pre = null;
		for (Object o : lst) {
			MCRow r = (MCRow)o;
			if (isNull(pre) || !isColSame(r, pre, key)) {
				ret.add(r);
			}
			pre = r;
		}
		return ret;
	}

	/**
	 * ＩＶ表記品名を設定します。
	 * @param rslt1R
	 */
	protected void setIvItmNm(Rslt1R rslt1R) {
		if (!rslt1R.sppl_iv_flg()){
			setValueEx(columnRslt1_iv_itm_nm, rslt1R.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(rslt1R.prnt_lcl_cd(), rslt1R.itm_cd(), rslt1R.itm_sub1(), rslt1R.itm_sub2(), rslt1R.itm_sub3(), this);
			if (isNull(row)) {
				setValueEx(columnRslt1_iv_itm_nm, rslt1R.getGUIIndex(), null);
			} else {
				setValueEx(columnRslt1_iv_itm_nm, rslt1R.getGUIIndex(), row.getStringNE("itm_nm"));
			}
		}
	}
	
	@Override
	public MCList<?> getRslt1_purc_rsn_cd(MCRow row, MCEventInfo info) {
		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
		if(MAC_ASSET_MNG_TYP.isNOT_MNG(rslt1R.asset_mng_typ())){
			row.setBooleanNE("xpns_purc_flg", true);
		}else{
			row.setBooleanNE("not_xpns_purc_flg", true);
		}
		return super.getRslt1_purc_rsn_cd(row, info);
	}

	@Override
	public MCList<?> getRslt1_trd_cd(MCRow row, MCEventInfo info) {
		Rslt1R rslt1R = getRslt1L().get(info.getEventIndex());
		MCList<?> list = super.getRslt1_trd_cd(row, info);
		if (isNull(rslt1R.itm_cd())) {
			return list;
		}
		else if(!MAC_ASSET_MNG_TYP.isNOT_MNG(rslt1R.asset_mng_typ())) {
			return list.subList("trd_ptn_typ", MAC_TRD_PTN_TYP.PURC.value());
		}
		return list;
	}
	
	/**
	 * 値引品目が入力された場合の固定値を設定します。
	 * @param rslt1R
	 */
	protected void setColByDscntItm(Rslt1R rslt1R) {
		if (rslt1R.dscnt_itm_flg()) {
			setValueEx(columnRslt1_trd_unit_cd, rslt1R.getGUIIndex(), rslt1R.base_unit_cd());
			setValueEx(columnRslt1_trd_unit_qty, rslt1R.getGUIIndex(), MCNumber.ONE);
		}
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Rslt1Table.setCellConfig(crtRslt1CellConfig());
	}

	protected Rslt1CellConfig crtRslt1CellConfig() {
		return new Rslt1CellConfig();
	}

	protected class Rslt1CellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			// 種別「登録・訂正する」の場合
			if (isUpdStatus()) {
				Rslt1R r = (Rslt1R) table.getBaseTable().getRow(index);
	
				if(MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
	
				if(columnRslt1_prms_uncn_flg == column) {
					if(r.re_rqst_flg()) {
						return MCMode.READ_ONLY;
					}
				}
	
				if(columnRslt1_re_rqst_dt == column) {
					if(r.re_rqst_flg()) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
	
				if (columnRslt1_mfg_loc_cd == column
						|| columnRslt1_bom_ptn == column
						|| columnRslt1_sppl_cd == column
						|| columnRslt1_maker_cd == column
						|| columnRslt1_trd_unit_cd == column
						|| columnRslt1_trd_cd == column
						|| columnRslt1_purc_rsn_cd == column
				) {
					if (!Rslt1_itm_p_PPanel.isItmFixLight(index) || isNull(r.gr_loc_wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
	
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(columnRslt1_rqst_to_loc_cd == column
							|| columnRslt1_gi_rqst_dt == column
							|| columnRslt1_gi_rqst_hm == column
							|| columnRslt1_gd_cd == column
							|| columnRslt1_lot_no == column
							|| columnRslt1_sublot_no == column
							|| columnRslt1_sno1_null_flg == column
							|| columnRslt1_sno2_null_flg == column
							|| columnRslt1_sno3_null_flg == column
							|| columnRslt1_sno4_null_flg == column
					) {
						return MCMode.READ_ONLY;
					}
				}
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(columnRslt1_sppl_cd == column
							|| columnRslt1_maker_cd == column
							|| columnRslt1_mfg_loc_cd == column
							|| columnRslt1_bom_ptn == column
							|| columnRslt1_trd_cd == column
							|| columnRslt1_purc_rsn_cd == column
					) {
						return MCMode.READ_ONLY;
					}
				}
				else if(isNull(r.wg_rqst_typ())) {
					if(columnRslt1_rqst_to_loc_cd == column
							|| columnRslt1_gi_rqst_dt == column
							|| columnRslt1_gi_rqst_hm == column
							|| columnRslt1_gd_cd == column
							|| columnRslt1_sppl_cd == column
							|| columnRslt1_maker_cd == column
							|| columnRslt1_mfg_loc_cd == column
							|| columnRslt1_bom_ptn == column
							|| columnRslt1_trd_cd == column
							|| columnRslt1_purc_rsn_cd == column
					) {
						return MCMode.READ_ONLY;
					}	
				}
	
	
				// 新規追加行の場合
				if (r.isStatusCreate() || isNull(r.wg_rqst_upd_cntr())) {
					if(columnRslt1_re_rqst_dt == column
							|| columnRslt1_re_rqst_flg == column
							|| columnRslt1_wg_re_rqst_cnt_rmrks == column
							|| columnRslt1_prms_uncn_flg == column
					) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					if(columnRslt1_rqst_fr_wg_cd == column
							|| columnRslt1_wg_rqst_typ == column
							|| columnRslt1_rqst_dt == column
							|| columnRslt1_rqst_fr_usr_cd == column
							|| columnRslt1_rqst_fr_dpt_cd == column
					) {
						return MCMode.READ_ONLY;
					}
				}
	
				// マニュアル登録以外
				if(!isNull(r.wg_rqst_src_typ()) && !MSC_WG_RQST_SRC_TYP.isMNL(r.wg_rqst_src_typ())) {
					if(columnRslt1_itm_cd == column
							|| columnRslt1_itm_sub1 == column
							|| columnRslt1_itm_sub2 == column
							|| columnRslt1_itm_sub3 == column
							|| columnRslt1_itm_nm == column
							|| columnRslt1_iv_itm_nm == column
					) {
						return MCMode.READ_ONLY;
					}
				}
	
				// 品目オーダ
				if(MSC_WG_RQST_SRC_TYP.isORD(r.wg_rqst_src_typ())) {
					if(columnRslt1_gr_loc_cd == column
							|| columnRslt1_gr_str_ln_cd == column
							|| columnRslt1_gr_str_ln_cd_none_flg == column
							|| columnRslt1_rqst_to_loc_cd == column
							|| columnRslt1_rqst_to_str_ln_cd == column
							|| columnRslt1_rqst_to_str_ln_cd_none_flg == column
							|| columnRslt1_mfg_loc_cd == column
							|| columnRslt1_bom_ptn == column
							|| columnRslt1_sppl_cd == column
							|| columnRslt1_maker_cd == column
							|| columnRslt1_ver_no == column
					) {
						return MCMode.READ_ONLY;
					}
				}
	
				// インボイス表記品名
				if (column == columnRslt1_iv_itm_nm) {
					if (!r.sundry_itm_flg() || !r.sppl_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
	
				// 取引単位、取引単位数量
				if(columnRslt1_trd_unit_cd == column
						|| columnRslt1_trd_unit_qty == column
				) {
					if (r.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 負担部品
				if(column.getRootPanel() == Rslt1_bditm_p_PPanel) {
					if(!isSame(r.asset_mng_typ(), MAC_ASSET_MNG_TYP.NOT_MNG.value()) || !MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						return MCMode.READ_ONLY;
					}
				}
	
				if (column == columnRslt1_sppl_cd
						|| column == columnRslt1_maker_cd
				) {
					if(!isNullOrNullVal(r.mfg_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
	
				if (column == columnRslt1_bom_ptn) {
					if (isNullOrNullVal(r.mfg_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
	
				if (column == columnRslt1_rqst_to_wg_cd) {
					if (!MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())
							|| !MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			// 種別「取り消す」の場合
			else if (isDelStatus()) {
				Rslt1R r = (Rslt1R) table.getBaseTable().getRow(index);
	
				if(column == columnRslt1_check) {
					if(MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == Rslt1Table) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBAL0100_Imp01();
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == Rslt1Table) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}
	
	@Override
	protected void changeFileInRowStatus() {
		for (Rslt1R r : getRslt1L()) {
			if (!isNull(r.wg_rqst_no())) {
				r.setStatus(MCRow.MODIFY);
			}
		}
	}

}