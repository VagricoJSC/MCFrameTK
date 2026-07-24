package mcframe.clientMSBE.MSBEP1000;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMAUB.MAUBP5390.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5050.*;
import mcframe.clientMSUB.MSUBP5070.*;

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
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
import static mcframe.clientMSUC.MSUCP0070.MSUCP_StkUtil.*;
import static mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil.*;

import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import mcframe.clientCore.beans.list.MCListPutter;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_XfrSchdReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_XfrSchdReg_MC extends MSBEP_XfrSchdReg_MC_A implements IfListRegPanel, IfStkInspBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCColumnConfig[] _trdCdNullECols = null;
	protected MCColumnConfig[] _trdCdNullENmCols = null;	
	protected MCColumnConfig[] _provROCols = null;
	protected MCColumnConfig[] _retProvROCols = null;
	protected MCColumnConfig[] _lotNoneROCols = null;
	protected MCColumnConfig[] _shipCols = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_XfrSchdReg_MC() {
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
	public MSBEP_XfrSchdReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1000_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Sprt01Caller<P extends MSBEP_XfrSchdReg, B extends MS_MSBEL1000_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1000_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Btn]のボタン[sprt_ac_dt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_ac_dt(MCEventInfo info) {
		callMS_MSBEL1000_Sprt01();
	}
	/**
	 * [MS_MSBEL1000_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Srch01Caller<P extends MSBEP_XfrSchdReg, B extends MS_MSBEL1000_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
	
		protected MS_MSBEL1000_Srch01Caller(P p, B b) {
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
			checkForCallStackForSrch(msgList);
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
	}

	/**
	 * 検索条件のチェックの共通処理
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(RqstModPanel));
		msgList.addAll(checkAtLeastOne(RqstCanPanel));
		msgList.addAll(checkBeforeAfter(Cnd_rcpt_dt_fr, Cnd_rcpt_dt_to));
	}

	/**
	 * [MS_MSBEL1000_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Imp01Caller<P extends MSBEP_XfrSchdReg, B extends MS_MSBEL1000_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBEL1000_Imp01Caller(P p, B b) {
			super(p, b);
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
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}

		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}
		
	}

	/**
	 * [MS_MSBEL1000_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Upd01Caller<P extends MSBEP_XfrSchdReg, B extends MS_MSBEL1000_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1000_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL1000_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Del01Caller<P extends MSBEP_XfrSchdReg, B extends MS_MSBEL1000_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL1000_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	
	/**
	 * [MS_MSBEL1000_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Upd03Caller<P extends MSBEP_XfrSchdReg, B extends MS_MSBEL1000_Upd03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL1000_Upd03Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[open_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_dtl(r);
	}
	protected void doBtn_open_dtl(RsltR r) {
		if (isMove(r)) {
			doBtn_open_MSBEP1050(r);
		}
		else if (isShip(r)) {
			doBtn_open_MSBEP1420(r);
		}
	}
	protected void doBtn_open_MSBEP1050(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1050");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1050CndR(aso, r));
		if (!isNull(r.xfr_schd_no())) {
			aso.putSearchAction();
		}
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1050.CndR crtOpenMSBEP1050CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1050.MSBEP_XfrListReg p = (mcframe.clientMSBE.MSBEP1050.MSBEP_XfrListReg) aso.getPanel();

		mcframe.clientMSBE.MSBEP1050.CndR to = mcframe.clientMSBE.MSBEP1050.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.abort_flg(true);
		to.xfr_schd_no(r.xfr_schd_no());
		
		return to;
	}
	protected void doBtn_open_MSBEP1420(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1420");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1420CndR(aso, r));
		if (!isNull(r.xfr_schd_no())) {
			aso.putSearchAction();
		}
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1420.CndR crtOpenMSBEP1420CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg p = (mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg) aso.getPanel();

		mcframe.clientMSBE.MSBEP1420.CndR to = mcframe.clientMSBE.MSBEP1420.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.inst_flg(true);
		to.not_ship_flg(true);
		to.part_ship_flg(true);
		to.ship_flg(true);
		to.abort_flg(true);
		to.xfr_schd_no(r.xfr_schd_no());
		
		return to;
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
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(RsltTable);
		setBtnMode();
	}
	/**
	 * 行コピー後に値を変更する項目
	 * コピー元の行の元区分によらずコピー先はマニュアル登録扱いとする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(MCTable<E> table, E row) {
		super.copyRowSub(table, row);
		if (table == RsltTable) {
			RsltR rsltR = (RsltR)row;
			rsltR.xfr_src_typ(MSC_XFR_SRC_TYP.MNL.value());
			rsltR.xfr_src_typ_nm(MSC_XFR_SRC_TYP.MNL.name());
		}
		return row;
	}
	/**
	 * 行コピーの引き継ぎ設定
	 */
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> colL = super.getNotInheritCols(type, cont);
		if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {
			if (cont == getRsltL()) {
				colL.add(RsltR.$xfr_schd_no);
				colL.add(RsltR.$xfr_src_no);
				colL.add(RsltR.$xfr_src_typ);
				colL.add(RsltR.$xfr_src_typ_nm);
				colL.add(RsltR.$itm_ord_no);
				colL.add(RsltR.$mfg_inst_no);
				colL.add(RsltR.$oper_inst_no);
				colL.add(RsltR.$inpt_schd_no);
				colL.add(RsltR.$slo_no);
				colL.add(RsltR.$slo_d_no);
				colL.add(RsltR.$io_schd_pr_no);
				colL.add(RsltR.$vld_dt_fr);
				colL.add(RsltR.$vld_dt_to);
				colL.add(RsltR.$not_lot_mix_flg);
				colL.add(RsltR.$not_sublot_mix_flg);
				colL.add(RsltR.$inpt_cont_qty);
				colL.add(RsltR.$rqst_cnt_rmrks);
			}
		}
		return colL;
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		if (Cnd_ope_REQ_MOD.isSelected()) {
			callMS_MSBEL1000_Upd03();
		}
		else {
			callMS_MSBEL1000_Upd01();
		}
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1000_Del01();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1000_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL1000_Srch01().execDL();
	}

	// 初期化処理
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	// 部品の初期化
	protected void setupParts() {
		super.setupParts();
		
		// 検索
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2,
				Cnd_itm_sub3, Cnd_gi_site_cd, Cnd_def_ver_flg);
		
		
		// 一括設定
		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_rcpt_dt);
		
		
		// 一覧
		Rslt_lot_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_lot_mng_typ,
				columnRslt_sublot_mng_typ);
		Rslt_ver_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, null,
				columnRslt_ver_flg);
		
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place,
				columnRslt_trd_unit_rnd_typ, columnRslt_trd_unit_conv_base_qty, columnRslt_trd_unit_conv_qty, columnRslt_base_unit_cd);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_qty, columnRslt_trd_unit_conv_base_qty,
				columnRslt_trd_unit_conv_qty);
		Rslt_inpt_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_unit_cd,columnRslt_cont_fctr_dec_place);
		Rslt_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, columnRslt_std_cont_fctr,
				null, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		
		Rslt_gi_str_ln_p_PPanel.setRelateBeans(columnRslt_gi_loc_cd,
				columnRslt_gi_str_ln_tgt_flg);
		Rslt_gr_str_ln_p_PPanel.setRelateBeans(columnRslt_gr_loc_cd,
				columnRslt_gr_str_ln_tgt_flg);
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_sno1_mng_typ,
				columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ,
				columnRslt_sno4_mng_typ);
		Rslt_stk_bp_p_PPanel.setRelateBeans(columnRslt_stk_id_typ);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_rcpt_dt);
		Rslt_ship_to_addr_p_PPanel.setRelateBeans(columnRslt_ship_to_id_cd, columnRslt_ship_to_id_nm, columnRslt_ship_to_sundry_flg);
		
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
		// 支給：入庫場所
		Rslt_prov_upri_amt_p_PPanel.setRelateBeans(columnRslt_gr_cur_cd,
				columnRslt_gr_sppl_cd, columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_base_unit_cd,
				columnRslt_base_unit_qty, columnRslt_trd_cur_amt_dec_place,
				columnRslt_trd_cur_upri_dec_place, columnRslt_gr_prov_amt_rnd_typ,
				columnRslt_gr_prov_tax_rnd_typ, columnRslt_gr_prov_upri_cng_flg,
				columnRslt_prov_upri_cng_flg, columnRslt_dscnt_itm_flg);
		Rslt_prov_upri_amt_p_PPanel.setSchd(true);
		Rslt_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_base_cur_cd,
				columnRslt_prov_xrate_cd, columnRslt_gi_rqst_dt, false,
				columnRslt_xrate_inpt_flg);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_amt,
				columnRslt_xrate);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_tax_amt,
				columnRslt_xrate);
		Rslt_ptax_xrate_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_ptax_cur_cd,
				columnRslt_prov_xrate_cd, columnRslt_gi_rqst_dt, false,
				columnRslt_ptax_xrate_inpt_flg);
		Rslt_ptax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd,
				columnRslt_ptax_cur_amt_dec_place, columnRslt_trd_cur_amt,
				columnRslt_ptax_xrate);
		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_base_cur_amt,
				columnRslt_wtax_rate, true);
		
		// 支給返品：出庫場所
		Rslt_ret_prov_upri_amt_p_PPanel.setRelateBeans(columnRslt_gi_cur_cd,
				columnRslt_gi_sppl_cd, columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_base_unit_cd,
				columnRslt_base_unit_qty, columnRslt_ret_trd_cur_amt_dec_place,
				columnRslt_ret_trd_cur_upri_dec_place, columnRslt_gi_prov_amt_rnd_typ,
				columnRslt_gi_prov_tax_rnd_typ, columnRslt_gi_prov_upri_cng_flg,
				columnRslt_prov_upri_cng_flg, columnRslt_dscnt_itm_flg);
		Rslt_ret_prov_upri_amt_p_PPanel.setSchd(true);
		Rslt_ret_xrate_p_PPanel.setRelateBeans(columnRslt_ret_trd_cur_cd, columnRslt_base_cur_cd,
				columnRslt_prov_xrate_cd, columnRslt_gi_rqst_dt, false,
				columnRslt_ret_xrate_inpt_flg);
		Rslt_ret_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_ret_trd_cur_amt,
				columnRslt_ret_xrate);
		Rslt_ret_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_ret_trd_cur_tax_amt,
				columnRslt_ret_xrate);
		Rslt_ret_ptax_xrate_p_PPanel.setRelateBeans(columnRslt_ret_trd_cur_cd,
				columnRslt_ptax_cur_cd, columnRslt_prov_xrate_cd, columnRslt_gi_rqst_dt, false,
				columnRslt_ret_ptax_xrate_inpt_flg);
		Rslt_ret_ptax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd,
				columnRslt_ptax_cur_amt_dec_place, columnRslt_ret_trd_cur_amt,
				columnRslt_ret_ptax_xrate);
		Rslt_ret_wtax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd,
				columnRslt_base_cur_amt_dec_place, columnRslt_ret_base_cur_amt,
				columnRslt_ret_wtax_rate, true);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_rqst_mod_t_flg, true);
		setValueEx(Cnd_rqst_mod_f_flg, true);
		setValueEx(Cnd_rqst_can_t_flg, true);
		setValueEx(Cnd_rqst_can_f_flg, true);
		setValueEx(BulkSet_rcpt_dt, getToday());
		setValueEx(BulkSet_rqst_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
	}
	//********************** コンボボックスの絞込(combo) **************************
	// 取引
	@SuppressWarnings("unchecked")
	@Override
	public MCList<?> getRslt_trd_cd(MCRow row, MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		MCList<?> ls = super.getRslt_trd_cd(row, info);
		MCList selL = ls.createInstance();
		
		if (!isNull(rsltR.xfr_schd_no())) {
			// 入庫場所（訂正対象外項目）をクリアしないでよい条件で絞り込む
			for (MCRow r : ls) {
				String typ = r.getStringNE(TrdCols.$o_trd_ptn_typ);
				if (isNull(rsltR.gr_loc_cd())) {
					selL.add(r);
				}
				else {
					// 社内
					if (isNull(rsltR.gr_sppl_cd())) {
						if (MAC_TRD_PTN_TYP.isXFR(typ) || MAC_TRD_PTN_TYP.isXFR_RTN(typ)
								|| MAC_TRD_PTN_TYP.isPROV_RTN(typ)) {
							selL.add(r);
						}
					}
					// 社外
					else {
						if (MAC_TRD_PTN_TYP.isPROV(typ)) {
							selL.add(r);
						}
					}
				}
			}
		}
		else {
			selL.addAll(ls);
		}
		
		return selL;
	}
	
	
	// 出庫場所
	@Override
	public MCList<?> getRslt_gi_loc_cd(MCRow row, MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if (MAC_TRD_PTN_TYP.isXFR(rsltR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(rsltR.trd_ptn_typ())) {
			row.addStringColumn(MAC_LOC_IS_SRCH_TYP.$VALUE, MAC_LOC_IS_SRCH_TYP.HOUSE.value());
		}
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(rsltR.trd_ptn_typ())) {
			row.addStringColumn(MAC_LOC_IS_SRCH_TYP.$VALUE, MAC_LOC_IS_SRCH_TYP.OUTSIDE.value());
		}
		return super.getRslt_gi_loc_cd(row, info);
	}

	// 入庫場所
	@Override
	public MCList<?> getRslt_gr_loc_cd(MCRow row, MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		if (MAC_TRD_PTN_TYP.isPROV(rsltR.trd_ptn_typ())) {
			row.addStringColumn(MAC_LOC_IS_SRCH_TYP.$VALUE, MAC_LOC_IS_SRCH_TYP.OUTSIDE.value());
		}
		else {
			row.addStringColumn(MAC_LOC_IS_SRCH_TYP.$VALUE, MAC_LOC_IS_SRCH_TYP.HOUSE.value());
		}
		return super.getRslt_gr_loc_cd(row, info);
	}

	// 出荷指図区分
	@Override
	public MCList getRslt_ship_inst_typ(MCRow row, MCEventInfo info) {
		MCList<?> ls = super.getRslt_ship_inst_typ(row, info);
		return ls.subList(r->!MAC_SHIP_INST_TYP.isNO_PICK(r.getStringNE(ShipInstTypCols.$o_ship_inst_typ)));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public MCList getRslt_prov_basis_typ(MCRow row, MCEventInfo info) {
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		MCList<?> ls = super.getRslt_prov_basis_typ(row, info);
		MCList selL = ls.createInstance();
		if (MAC_PROV_TYP.isONR_PROV(rsltR.prov_typ())) {
			for (MCRow r : ls) {
				String typ = r.getStringNE(ProvBasisTypCols.$o_prov_basis_typ);
				if (MAC_PROV_RCV_TYP.isNOT_ARR(rsltR.gr_prov_rcv_typ())) {
					if (rsltR.gr_subcon_flg()) {
						if (MAC_PROV_BASIS_TYP.isINPT(typ)) {
							selL.add(r);
						}
					}
					else {
						if (MAC_PROV_BASIS_TYP.isGI(typ) || MAC_PROV_BASIS_TYP.isINPT(typ)) {
							selL.add(r);
						}
					}
				}
				else {
					if (MAC_PROV_BASIS_TYP.isGR(typ) || MAC_PROV_BASIS_TYP.isINPT(typ)) {
						selL.add(r);
					}
				}
			}
		}
		return selL;
	}

	// 理由ＣＤ
	@Override
	public MCList<?> getRslt_rsn_cd(MCRow row, MCEventInfo info) {
 		MCList<?> dtlL = super.getRslt_rsn_cd(row, info);
 		RsltR dtlR = getRsltL().get(info.getEventIndex());
		if (!canAcXfr(dtlR)) {
			dtlL = dtlL.subList(r -> !r.getBooleanNE(XfrBizRsnCols.$o_acxfr_gi_flg));
		}
		return dtlL;
	}

	// 他勘定出庫できるか
	protected boolean canAcXfr(RsltR r) {
		return MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ());
	}

	
	// 初期設定
	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// ステータス関連
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isReqModStatus() {
		return isSame(getStatus(), REQ_MOD);
	}
	
	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus() || isReqModStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			FoldTab.focusActiveFirstComponent();
			Cnd_inst_inc_flg.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCHStatus();
			Cnd_inst_inc_flg.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
			setDefaultMode(Cnd_inst_inc_flg);
		}
		else if (Cnd_ope_REQ_MOD.isSelected()) {
			setSRCHStatus();
			setDefaultMode(Cnd_inst_inc_flg);
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			Cnd_inst_inc_flg.setMode(MCMode.READ_ONLY);
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
			Cnd_inst_inc_flg.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
			setDefaultMode(Cnd_inst_inc_flg);
		}
		else if (Cnd_ope_REQ_MOD.isSelected()) {
			setREQ_MODStatus();
			setDefaultMode(Cnd_inst_inc_flg);
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		// フォーカス制御はsetRefStatusメソッドで行う
		setBtnMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setREQ_MODStatus() {
		super.setREQ_MODStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	// ボタンの入力制御
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isUpdStatus()) {
			// 行削除、行コピーボタン
			if (r == null) {
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 行が選択されている
				setDefaultMode(Btn_rcopy);

				// 行コピーされた行または新規追加された行
				if (r.isStatusCreate() || isNull(r.xfr_schd_no())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
			}
		}
		
		// 画面遷移ボタン
		setBtnMode(Btn_open_dtl, isEnableBtn_open_dtl(r));
		setBtnMode(Btn_Btn_open_MSBEP0500_PPanel.StkInfo_open_MSBEP0500, isEnableBtn_open_MSBEP0500(r));
	}

	protected void setBtnMode(MCButton btn, boolean boo) {
		if (boo) {
			setDefaultMode(btn);
		}
		else {
			btn.setMode(MCMode.DISABLE);
		}
	}
	protected boolean isEnableBtn_open_MSBEP0500(RsltR r) {
		if (r == null) {
			return false;
		}
		if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
			return false;
		}
		return true;
	}
	protected boolean isEnableBtn_open_dtl(RsltR r) {
		if (r == null) {
			return false;
		}
		if (isNull(r.xfr_schd_no()) || isOther(r)) {
			return false;
		}
		return true;
	}

	// セルコンフィグ関連
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
	
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			// 更新成功行は入力不可
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			if (isUpdStatus()) {
				// 取引ＣＤが未指定
				if (isNull(r.trd_cd())) {
					if (!isTrdCdNullECol(column)) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_quality_typ) {
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 訂正行
				if (!isNull(r.xfr_schd_no())) {
					if (isUpdateROCol(column)) {
						return MCMode.READ_ONLY;
					}
					else if (column == columnRslt_trd_unit_cd) {
						if (MSC_XFR_SRC_TYP.isWG_RQST(r.xfr_src_typ()) || MSC_XFR_SRC_TYP.isSLO(r.xfr_src_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				
				// 出庫場所着荷先
				if (column == columnRslt_gi_stk_arrv_bp_cd) {
					// 社外かつ自社在庫の場合のみ入力可能
					if (isNull(r.gi_loc_cd()) || isNull(r.gi_sppl_cd()) || !MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 出庫物流グループ
				else if (column == columnRslt_gi_lg_grp_cd) {
					if (!isNull(r.gi_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				// 負担部門
				else if (column == columnRslt_bd_dpt_cd) {
					if (!r.acxfr_gi_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 在庫識別取引先
				else if (column == columnRslt_stk_bp_cd) {
					if (isNull(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
							|| MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 引当する
				if (r.alloc_flg()) {
					// ロット未指定
					if (r.lot_none_flg()) {
						 if (column == columnRslt_lot_no || column == columnRslt_sublot_no) {
							return MCMode.READ_ONLY;
						}
						else if (column == columnRslt_ver_no) {
							if (r.ver_flg()) {
								return MCMode.REQUIRED;
							}
						}
					}
					// ロット指定済
					else {
						if (column == columnRslt_lot_no) {
							if (!isNull(r.lot_mng_typ()) && !MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
								return MCMode.REQUIRED;
							}
						}
						else if (column == columnRslt_sublot_no) {
							if (!isNull(r.sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
								return MCMode.REQUIRED;
							}
						}
					}
					// ロット以外の項目
					if (column == columnRslt_gi_loc_cd
							|| (column == columnRslt_gi_str_ln_cd && r.gi_str_ln_tgt_flg() && !r.gi_str_ln_cd_none_flg())
							|| column == columnRslt_gd_cd
							|| column == columnRslt_quality_typ
							|| column == columnRslt_stk_id_typ
							|| (column == columnRslt_stk_bp_cd
									&& !MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())
									&& !MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()))) {
						return MCMode.REQUIRED;
					}
				}
				// 引当をしない
				else {
					if (column == columnRslt_lot_none_flg) {
						return MCMode.READ_ONLY;
					}
				}
				
				
				// 物流グループを跨ぐ移送
				if (isShip(r)) {
					if (!isNull(r.gi_rqst_dt()) && column == columnRslt_gr_rqst_dt) {
						return MCMode.ENABLE;
					}
					if (!isNull(r.gr_rqst_dt()) && column == columnRslt_gi_rqst_dt) {
						return MCMode.ENABLE;
					}
					
					// インボイス対象外
					if (r.iv_trd_flg()) {
						if (!r.ship_to_sundry_flg()) {
							if (column == columnRslt_ship_to_id_nm) {
								return MCMode.READ_ONLY;
							}
						}
					}
					else {
						if (column == columnRslt_ship_to_id_cd
								|| column == columnRslt_ship_to_id_nm
								|| column == columnRslt_via_dlv_typ) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else {
					// 物流グループを跨ぐ移送のときのみ入力可能
					if (isShipCol(column)) {
						return MCMode.READ_ONLY;
					}
					
					// 物流グループを跨がない移動
					if (isMove(r)) {
						if (!isNull(r.gi_rqst_dt()) && column == columnRslt_gr_rqst_dt) {
							return MCMode.READ_ONLY;
						}
						if (!isNull(r.gr_rqst_dt()) && column == columnRslt_gi_rqst_dt) {
							return MCMode.READ_ONLY;
						}
					}
					
				}
				
				
				// 移動または移動返品
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())) {
					if (column == columnRslt_prov_typ) {
						return MCMode.READ_ONLY;
					}
				}
				// 支給
				else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					if (isProvDD(r)) {
						if (column == columnRslt_stk_id_typ) {
							return MCMode.REQUIRED;
						}
					}
					else if (isProv(r)) {
						// 何もなし
					}
					else {
						if (column == columnRslt_prov_typ) {
							return MCMode.READ_ONLY;
						}
					}
					
					if (column == columnRslt_xrate_inpt_flg) {
						if (isSame(r.trd_cur_cd(), r.base_cur_cd()) || isNull(r.trd_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnRslt_ptax_xrate_inpt_flg) {
						if (isSame(r.trd_cur_cd(), r.ptax_cur_cd()) || isNull(r.trd_cur_cd()) || isNull(r.ptax_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				// 支給返品
				else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (column == columnRslt_gi_loc_cd) {
						return MCMode.REQUIRED;
					}
					if (column == columnRslt_stk_id_typ) {
						return MCMode.REQUIRED;
					}
					if (column == columnRslt_prov_typ) {
						return MCMode.READ_ONLY;
					}
					if (column == columnRslt_ret_xrate_inpt_flg) {
						if (isSame(r.ret_trd_cur_cd(), r.base_cur_cd()) || isNull(r.ret_trd_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnRslt_ret_ptax_xrate_inpt_flg) {
						if (isSame(r.ret_trd_cur_cd(), r.ptax_cur_cd()) || isNull(r.ret_trd_cur_cd()) || isNull(r.ptax_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				
				// 有償支給ではない
				if (!MAC_PROV_TYP.isONR_PROV(r.prov_typ()) || !isProv(r) && !isProvDD(r)) {
					if (column == columnRslt_prov_basis_typ || isProvROCol(column)) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					if (isNull(r.prov_basis_typ()) || MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())) {
						if (isProvROCol(column)) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnRslt_wtax_rate) {
						if (!isSame(r.base_cur_cd(), r.trd_cur_cd())
								|| !isSame(r.base_cur_cd(), r.ptax_cur_cd())
										&& !isNull(r.ptax_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				// 有償支給（返品）ではない
				if (!MAC_PROV_TYP.isONR_PROV(r.ret_prov_typ()) || !isRetProv(r)) {
					if (isRetProvROCol(column)) {
						return MCMode.READ_ONLY;
					}
				}
				else {
					if (isNull(r.ret_prov_basis_typ()) || MAC_PROV_BASIS_TYP.isINPT(r.ret_prov_basis_typ())) {
						if (isRetProvROCol(column)) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnRslt_ret_wtax_rate) {
						if (!isSame(r.base_cur_cd(), r.ret_trd_cur_cd())
								|| !isSame(r.base_cur_cd(), r.ptax_cur_cd())
										&& !isNull(r.ptax_cur_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (!MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (column == columnRslt_base_dlv_slip_no
							|| column == columnRslt_base_prov_act_no
							|| column == columnRslt_base_ac_dt) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (isDelStatus()) {
				// 生産計画／投入／ＷＧ間依頼／受注紐づきの場合、紐切れでなければ取消不可
				if (column == columnRslt_check) {
					if (!r.rqst_can_flg()) {
						if (MSC_XFR_SRC_TYP.isITM_ORD(r.xfr_src_typ())
								|| MSC_XFR_SRC_TYP.isINPT(r.xfr_src_typ())
								|| MSC_XFR_SRC_TYP.isWG_RQST(r.xfr_src_typ())
								|| MSC_XFR_SRC_TYP.isSLO(r.xfr_src_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
		
		/**
		 * 訂正時にROになるカラム
		 * (新規登録のときのみ入力可能なカラム)
		 */
		protected boolean isUpdateROCol(MCColumnConfig column) {
			if (column == columnRslt_trd_cd
					|| column == columnRslt_itm_cd
					|| column == columnRslt_itm_sub1
					|| column == columnRslt_itm_sub2
					|| column == columnRslt_itm_sub3
					|| column == columnRslt_sno1
					|| column == columnRslt_sno1_null_flg
					|| column == columnRslt_sno2
					|| column == columnRslt_sno2_null_flg
					|| column == columnRslt_sno3
					|| column == columnRslt_sno3_null_flg
					|| column == columnRslt_sno4
					|| column == columnRslt_sno4_null_flg
					|| column == columnRslt_gr_loc_cd
					) {
				return true;
			}
			return false;
		}
	
		/**
		 * 引当する時に必須になる項目
		 */
		protected boolean isAllocRCol(RsltR r, MCColumnConfig column) {
			if (column == columnRslt_gi_loc_cd
					|| (column == columnRslt_gi_str_ln_cd && r.gi_str_ln_tgt_flg() && !r.gi_str_ln_cd_none_flg())
					|| column == columnRslt_gi_stk_arrv_bp_cd
					|| column == columnRslt_gd_cd
					|| column == columnRslt_quality_typ
					|| column == columnRslt_stk_id_typ
					|| column == columnRslt_stk_bp_cd) {
				return true;
			}
			return false;
		}
	}


	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_dtl(r)) {
				doBtn_open_dtl(r);
			}
		}
	}
	
	// event
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Rslt_itm_p_PPanel.addItmLCListner(this);
		BulkSet_gi_rqst_dt.addLCListener(this);
		BulkSet_gi_rqst_hm.addLCListener(this);
		BulkSet_gr_rqst_dt.addLCListener(this);
		BulkSet_gr_rqst_hm.addLCListener(this);
		BulkSet_rqst_usr_cd.addLCListener(this);
		BulkSet_rqst_dpt_cd.addLCListener(this);
		columnRslt_gi_rqst_dt.addLCListener(this);
		columnRslt_gi_rqst_hm.addLCListener(this);
		columnRslt_gr_rqst_dt.addLCListener(this);
		columnRslt_gr_rqst_hm.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == BulkSet_gi_rqst_dt) {
			bulkSet(BulkSet_gi_rqst_dt);
		}
		else if (lc == BulkSet_gi_rqst_hm) {
			bulkSet(BulkSet_gi_rqst_hm);
		}
		else if (lc == BulkSet_gr_rqst_dt) {
			bulkSet(BulkSet_gr_rqst_dt);
		}
		else if (lc == BulkSet_gr_rqst_hm) {
			bulkSet(BulkSet_gr_rqst_hm);
		}
		else if (lc == BulkSet_rcpt_dt) {
			bulkSet(BulkSet_rcpt_dt);
		}
		else if (lc == BulkSet_rqst_usr_cd) {
			bulkSet(BulkSet_rqst_usr_cd);
		}
		else if (lc == BulkSet_rqst_dpt_cd) {
			bulkSet(BulkSet_rqst_dpt_cd);
		}
		else if (lc == columnRslt_gi_lg_grp_cd
				|| lc == columnRslt_gr_lg_grp_cd) {
			doRslt_lg_grp_cd_LC(info);
		}
		else if (lc == columnRslt_gi_rqst_dt) {
			doRslt_gi_rqst_dt_LC(info);
		}
		else if (lc == columnRslt_gr_rqst_dt) {
			doRslt_gr_rqst_dt_LC(info);
		}
		else if (Rslt_itm_p_PPanel.isItm(lc)) {
			doRslt_itm_cd_LC(info);
		}
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（登録直後）、REF（参照種別）では、クリア確認出さない
			if (!isRegStatus() || isStatusNone(getRsltL())) {
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
		clearContainers(getRsltL());
		clearCnd();
		fillSpace();
		setSrchStatus();
		setStatusColumn();
	}

	protected void clearCnd() {
		if (Cnd_ope_REQ_MOD.isSelected()) {
			setValueEx(Cnd_rqst_mod_t_flg, true);
			setValueEx(Cnd_rqst_mod_f_flg, false);
		}
		else {
			setValueEx(Cnd_rqst_mod_t_flg, true);
			setValueEx(Cnd_rqst_mod_f_flg, true);
		}
		
		if (Cnd_ope_REF.isSelected() || Cnd_ope_REQ_MOD.isSelected()) {
			setValueEx(Cnd_inst_inc_flg, true);
		}
		else {
			setValueEx(Cnd_inst_inc_flg, false);
		}
	}

	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	// 一括項目設定
	protected void bulkSet(MCBeans b, RsltR r) {
		if (isNull(r.xfr_schd_no())) {
			if (b == BulkSet_gi_rqst_dt && isEditable(columnRslt_gi_rqst_dt, r.getGUIIndex())) {
				r.gi_rqst_dt(getBulkSetR().gi_rqst_dt());
			}
			else if (b == BulkSet_gi_rqst_hm && isEditable(columnRslt_gi_rqst_hm, r.getGUIIndex())) {
				r.gi_rqst_hm(getBulkSetR().gi_rqst_hm());
			}
			else if (b == BulkSet_gr_rqst_dt && isEditable(columnRslt_gr_rqst_dt, r.getGUIIndex())) {
				r.gr_rqst_dt(getBulkSetR().gr_rqst_dt());
			}
			else if (b == BulkSet_gr_rqst_hm && isEditable(columnRslt_gr_rqst_hm, r.getGUIIndex())) {
				r.gr_rqst_hm(getBulkSetR().gr_rqst_hm());
			}
			else if (b == BulkSet_rcpt_dt && isEditable(columnRslt_rcpt_dt, r.getGUIIndex())) {
				r.rcpt_dt(getBulkSetR().rcpt_dt());
				if (isNull(r.rcpt_dt())) {
					r.rqst_usr_cd(null);
					r.rqst_usr_nm(null);
					r.rqst_dpt_cd(null);
					r.rqst_dpt_nm(null);
					r.bd_dpt_cd(null);
					r.bd_dpt_nm(null);
				}
			}
			else if (b == BulkSet_rqst_usr_cd
					&& isEditable(columnRslt_rqst_usr_cd, r.getGUIIndex())) {
				r.rqst_usr_cd(getBulkSetR().rqst_usr_cd());
				r.rqst_usr_nm(getBulkSetR().rqst_usr_nm());
			}
			else if (b == BulkSet_rqst_dpt_cd
					&& isEditable(columnRslt_rqst_dpt_cd, r.getGUIIndex())) {
				r.rqst_dpt_cd(getBulkSetR().rqst_dpt_cd());
				r.rqst_dpt_nm(getBulkSetR().rqst_dpt_nm());
			}
		}
	}

	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		RsltR r = (RsltR)srcRow;
	
		if (isNull(r.gi_rqst_dt())) {
			bulkSet(BulkSet_gi_rqst_dt, r);
		}
		if (isNull(r.gi_rqst_hm())) {
			bulkSet(BulkSet_gi_rqst_hm, r);
		}
		if (isNull(r.gr_rqst_dt())) {
			bulkSet(BulkSet_gr_rqst_dt, r);
		}
		if (isNull(r.gr_rqst_hm())) {
			bulkSet(BulkSet_gr_rqst_hm, r);
		}
		if (isNull(r.rcpt_dt())) {
			bulkSet(BulkSet_rcpt_dt, r);
		}
		if (isNull(r.rqst_usr_cd())) {
			bulkSet(BulkSet_rqst_usr_cd, r);
		}
		if (isNull(r.rqst_dpt_cd())) {
			bulkSet(BulkSet_rqst_dpt_cd, r);
		}
	}

	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	// 一覧のevent
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.check()) {
			// 一括設定枠の項目の値を設定する
			if(!isNull(getBulkSetR().gi_rqst_dt())) {
				bulkSet(BulkSet_gi_rqst_dt, r);
				bulkSet(BulkSet_gi_rqst_hm, r);
			}
			if(!isNull(getBulkSetR().gr_rqst_dt())) {
				bulkSet(BulkSet_gr_rqst_dt, r);
				bulkSet(BulkSet_gr_rqst_hm, r);
			}
			if(!isNull(getBulkSetR().rcpt_dt())) {
				bulkSet(BulkSet_rcpt_dt, r);
			}
			if(!isNull(getBulkSetR().rqst_usr_cd())) {
				bulkSet(BulkSet_rqst_usr_cd, r);
			}
			if(!isNull(getBulkSetR().rqst_dpt_cd())) {
				bulkSet(BulkSet_rqst_dpt_cd, r);
			}
		}
	}

	@Override
	public boolean doRslt_trd_cd_VC(MCEventInfo info) {
		boolean boo = super.doRslt_trd_cd_VC(info);
		if (!boo) {
			return false;
		}
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		if (!isNull(r.xfr_schd_no())) {
			Comparable<?> newVal = info.getNewValue();
			if (isNull(newVal)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public void doRslt_trd_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		if (!isNull(r.trd_cd())) {
			return;
		}
		for(MCColumnConfig col : getPartsVisibleColumnConfigs()) {
			if(!isTrdCdNullECol(col) && !isTrdCdNullENmCol(col)) {
				setValueEx(col, index, null);
			}
		}
	}

	@Override
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		String typ = (String)info.getNewValue();
		if (MAC_TRD_PTN_TYP.isXFR(typ) || MAC_TRD_PTN_TYP.isXFR_RTN(typ)) {
			if (!isNull(r.gi_sppl_cd())) {
				setValueEx(columnRslt_gi_loc_cd, index, null);
			}
			if (!isNull(r.gr_sppl_cd())) {
				setValueEx(columnRslt_gr_loc_cd, index, null);
			}
		}
		else if (MAC_TRD_PTN_TYP.isPROV(typ)) {
			if (isNull(r.gr_sppl_cd())) {
				setValueEx(columnRslt_gr_loc_cd, index, null);
			}
			setValueEx(columnRslt_quality_typ, index, MAC_QUALITY_TYP.GOOD.value());
		}
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(typ)) {
			if (isNull(r.gi_sppl_cd())) {
				setValueEx(columnRslt_gi_loc_cd, index, null);
			}
			if (!isNull(r.gr_sppl_cd())) {
				setValueEx(columnRslt_gr_loc_cd, index, null);
			}
		}
		else {
			setValueEx(columnRslt_gi_loc_cd, index, null);
			setValueEx(columnRslt_gr_loc_cd, index, null);
		}
		if (!MAC_TRD_PTN_TYP.isPROV_RTN(typ)) {
			setValueEx(columnRslt_base_dlv_slip_no, index, null);
			setValueEx(columnRslt_base_prov_act_no, index, null);
			setValueEx(columnRslt_base_ac_dt, index, null);
		}
		setValueEx(columnRslt_rsn_cd, index, null);
	}

	protected void doRslt_itm_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		clearCols(r, getShipCols());
		if(isShip(r)) {
			setValueEx(columnRslt_ship_term_cd, r.getGUIIndex(), r.ship_term_cd_inv());
		}
		setShipToId(r);
		if (!isShip(r)) { // 出荷の場合、setShipToIdメソッドの連携イベントで支給区分と支給区分（返品）が設定される
			setProvTyp(r);
			setRetProvTyp(r);
		}
		setDefLocWgCd(r);
		setDefStrLnCd(r);
	}
	
	@Override
	public void doRslt_lot_none_flg_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		if (r.lot_none_flg()) {
			clearCols(r, getLotNoneROCols());
		}
	}
	@Override
	public void doRslt_alloc_flg_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		if (!r.alloc_flg()) {
			setValueEx(columnRslt_lot_none_flg, index, false);
		}
	}	

	@Override
	public void doRslt_gi_loc_cd_LC(MCEventInfo info) {
		super.doRslt_gi_loc_cd_LC(info);
		int index = info.getEventIndex();

		setValueEx(columnRslt_stk_id_typ, index, null);
	}

	@Override
	public void doRslt_gr_loc_cd_LC(MCEventInfo info) {
		super.doRslt_gr_loc_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		setShipToId(r, false);

		if (isMove(r)) {
			setRetProvTyp(r); //単価再取得のため
		}
	}
	
	@Override
	public void doRslt_gi_sppl_cd_LC(MCEventInfo info) {
		super.doRslt_gi_sppl_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		setProvTyp(r);
	}
	
	@Override
	public void doRslt_gr_sppl_cd_LC(MCEventInfo info) {
		super.doRslt_gr_sppl_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		setProvTyp(r);
	}
	
	@Override
	public void doRslt_gi_lg_grp_cd_LC(MCEventInfo info) {
		super.doRslt_gi_lg_grp_cd_LC(info);
		doRslt_lg_grp_cd_LC(info);
	}
	
	@Override
	public void doRslt_gr_lg_grp_cd_LC(MCEventInfo info) {
		super.doRslt_gr_lg_grp_cd_LC(info);
		doRslt_lg_grp_cd_LC(info);
	}
	
	protected void doRslt_lg_grp_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		clearColsByShip(r, getShipCols());
		if (isShip(r)) {
			setShipTermCd(r, info);
			setShipToId(r, true);
		}
		else if (isMove(r)) {
			if (!isNullOr(r.gi_rqst_dt(), r.gr_rqst_dt())) {
				setValueEx(columnRslt_gi_rqst_dt, index, null);
			}
		}

		if(isNull(r.gi_rqst_dt())) {
			bulkSet(BulkSet_gi_rqst_dt, r);
		}
		if(isNull(r.gi_rqst_hm())) {
			bulkSet(BulkSet_gi_rqst_hm, r);
		}
		if(isNull(r.gr_rqst_dt())) {
			bulkSet(BulkSet_gr_rqst_dt, r);
		}
		if(isNull(r.gr_rqst_hm())) {
			bulkSet(BulkSet_gr_rqst_hm, r);
		}
		setDefLocWgCd(r);
	}

	@Override
	public void doRslt_stk_id_typ_LC(MCEventInfo info) {
		super.doRslt_stk_id_typ_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		// 在庫取引先
		if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
			setValueEx(columnRslt_stk_bp_cd, index, MAC_STR.NULL_VAL.value());
		}
		else if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
			setValueEx(columnRslt_stk_bp_cd, index, r.gi_sppl_cd());
		}
		else {
			setValueEx(columnRslt_stk_bp_cd, index, null);
		}
		
		// 出庫在庫着荷先
		if (isNull(r.gi_sppl_cd())) {
			setValueEx(columnRslt_gi_stk_arrv_bp_cd, index, MAC_STR.NULL_VAL.value());
		}
		else {
			if (isNull(r.stk_id_typ()) || MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
				setValueEx(columnRslt_gi_stk_arrv_bp_cd, index, null);
			}
			else {
				setValueEx(columnRslt_gi_stk_arrv_bp_cd, index, r.gi_sppl_cd());
			}
		}
		
		// 支給返品関連
		setRetProvTyp(r);
	}
	
	@Override
	public void doRslt_gi_stk_arrv_bp_cd_LC(MCEventInfo info) {
		super.doRslt_gi_stk_arrv_bp_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		// 支給返品関連
		setRetProvTyp(r);
	}

	@Override
	public void doRslt_rcpt_dt_LC(MCEventInfo info) {
		super.doRslt_rcpt_dt_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		// 出荷
		if (isShip(r)) {
			setShipToId(r);
		}
		// 移動
		else {
			setProvTyp(r);
			setRetProvTyp(r); // 単価再取得のため
		}
	}

	public void doRslt_gi_rqst_dt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		// 出荷
		if (isShip(r)) {
			setShipToId(r);
		}
		// 移動
		else {
			if (isMove(r)) {
				if (!isNullOr(r.gi_rqst_dt(), r.gr_rqst_dt())) {
					setValueEx(columnRslt_gr_rqst_dt, index, null);
				}
			}
			setProvTyp(r);
			setRetProvTyp(r); // 単価再取得のため
		}
	}

	public void doRslt_gr_rqst_dt_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		// 出荷
		if (isShip(r)) {
			setShipToId(r);
		}
		// 移動
		else {
			if (isMove(r)) {
				if (!isNullOr(r.gi_rqst_dt(), r.gr_rqst_dt())) {
					setValueEx(columnRslt_gi_rqst_dt, index, null);
				}
			}
			setProvTyp(r);
			setRetProvTyp(r); // 単価再取得のため
		}
	}

	@Override
	public void doRslt_rsn_cd_LC(MCEventInfo info) {
		super.doRslt_rsn_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		if (!r.acxfr_gi_flg()) {
			setValueEx(columnRslt_bd_dpt_cd, index, null);
		}
	}

	@Override
	public void doRslt_ship_term_cd_LC(MCEventInfo info) {
		super.doRslt_ship_term_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		if (isShip(r)) {
			setShipToId(r, true);
		}
	}

	@Override
	public void doRslt_ship_inst_typ_LC(MCEventInfo info) {
		super.doRslt_ship_inst_typ_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		if (isShip(r)) {
			setShipSchdTm(r);
			setProvTyp(r);
			setRetProvTyp(r); //単価再取得のため
		}
	}

	@Override
	public void doRslt_ship_to_id_cd_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		if (isShip(r)) {
			setShipSchdTm(r);
			setProvTyp(r);
			setRetProvTyp(r); //単価再取得のため
		}

	}

	protected MCDate getAccptSchdDt(RsltR r) {
		if (isShip(r)) {
			
			if (MAC_PROV_RCV_TYP.isNOT_ARR(r.gr_prov_rcv_typ())) {
				return r.ship_schd_tm();
			}
			else {
				return r.dlv_schd_tm();
			}
		}
		else {
			return nvl(r.gr_rqst_dt(), r.gi_rqst_dt());
		}
	}

	protected MCDate getRetAccptSchdDt(RsltR r) {
		if (isShip(r)) {
			String provBasisTyp = r.ret_prov_basis_typ();
			
			if (MAC_PROV_BASIS_TYP.isGI(provBasisTyp)) {
				return r.ship_schd_tm();
			}
			else if (MAC_PROV_BASIS_TYP.isGR(provBasisTyp)) {
				return r.dlv_schd_tm();
			}
			else {
				return null;
			}
		}
		else {
			return nvl(r.gr_rqst_dt(), r.gi_rqst_dt());
		}
	}

	@Override
	public void doRslt_prov_typ_LC(MCEventInfo info) {
		super.doRslt_prov_typ_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		setValueEx(columnRslt_prov_basis_typ, index, null);
		if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
			setValueEx(columnRslt_prov_basis_typ, index, r.gr_prov_basis_typ());
		}
	}

	@Override
	public void doRslt_ret_prov_typ_LC(MCEventInfo info) {
		super.doRslt_ret_prov_typ_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		setValueEx(columnRslt_ret_prov_basis_typ, index, null);
		if (MAC_PROV_TYP.isONR_PROV(r.ret_prov_typ())) {
			if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && isNullOrNullVal(r.gi_stk_arrv_bp_cd())) {
				setValueEx(columnRslt_ret_prov_basis_typ, index, MAC_PROV_BASIS_TYP.INPT.value());
			}
			else {
				setValueEx(columnRslt_ret_prov_basis_typ, index, MAC_PROV_BASIS_TYP.GI.value());
			}
		}
	}
	
	@Override
	public void doRslt_prov_basis_typ_LC(MCEventInfo info) {
		super.doRslt_prov_basis_typ_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		if (MAC_PROV_BASIS_TYP.isGI(r.prov_basis_typ())
				|| MAC_PROV_BASIS_TYP.isGR(r.prov_basis_typ())) {
			setValueEx(columnRslt_base_cur_cd, index, getCo().base_cur_cd());
			setValueEx(columnRslt_ptax_cur_cd, index, getCo().ptax_cur_cd());
			setValueEx(columnRslt_trd_cur_cd, index, r.gr_cur_cd());
			setValueEx(columnRslt_prov_xrate_cd, index, getCo().prov_xrate_cd());
			setValueEx(columnRslt_tax_cd, index,
					getProvTaxCd(
							r.itm_cd(),
							r.itm_sub1(),
							r.itm_sub2(),
							r.itm_sub3(),
							r.gr_sppl_cd(),
							getAccptSchdDt(r),
							this));
			if (isEditable(columnRslt_wtax_rate, index)) {
				setValueEx(columnRslt_wtax_rate, index,
						getWtaxRate(
								r.itm_cd(),
								r.itm_sub1(),
								r.itm_sub2(),
								r.itm_sub3(),
								getAccptSchdDt(r),
								this));
			}
		}
		else {
			clearCols(r, getProvROCols());
		}
	}
	
	@Override
	public void doRslt_ret_prov_basis_typ_LC(MCEventInfo info) {
		super.doRslt_ret_prov_basis_typ_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		if (MAC_PROV_BASIS_TYP.isGI(r.ret_prov_basis_typ())
				|| MAC_PROV_BASIS_TYP.isGR(r.ret_prov_basis_typ())) {
			setValueEx(columnRslt_base_cur_cd, index, getCo().base_cur_cd());
			setValueEx(columnRslt_ptax_cur_cd, index, getCo().ptax_cur_cd());
			setValueEx(columnRslt_ret_trd_cur_cd, index, r.gi_cur_cd());
			setValueEx(columnRslt_ret_tax_cd, index,
					getProvTaxCd(
							r.itm_cd(),
							r.itm_sub1(),
							r.itm_sub2(),
							r.itm_sub3(),
							r.gi_sppl_cd(),
							getRetAccptSchdDt(r),
							this));
			if (isEditable(columnRslt_ret_wtax_rate, index)) {
				setValueEx(columnRslt_ret_wtax_rate, index,
						getWtaxRate(
								r.itm_cd(),
								r.itm_sub1(),
								r.itm_sub2(),
								r.itm_sub3(),
								getRetAccptSchdDt(r),
								this));
			}
		}
		else {
			clearCols(r, getRetProvROCols());
		}
	}
	
	
	@Override
	public void doRslt_trd_cur_cd_LC(MCEventInfo info) {
		super.doRslt_trd_cur_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);
		
		setValueEx(columnRslt_trd_cur_upri, index, null);
		setValueEx(columnRslt_xrate_inpt_flg, index, false);
		setValueEx(columnRslt_ptax_xrate_inpt_flg, index, false);
		if (!isNull(r.trd_cur_cd())) {
			if (isShip(r)) {
				setFirstShipSchdTm(r);
			}
			MCRow upriR = getProvUpri(
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					r.gr_sppl_cd(),
					r.trd_cur_cd(),
					r.gr_wg_cd(),
					getAccptSchdDt(r),
					this);
			if (!isNull(upriR)) {
				setValueEx(columnRslt_trd_cur_upri, index, upriR.getNumberNE("upri"));
			}
		}
	}

	@Override
	public void doRslt_ret_trd_cur_cd_LC(MCEventInfo info) {
		super.doRslt_ret_trd_cur_cd_LC(info);
		int index = info.getEventIndex();
		RsltR r = getRsltL().get(index);

		setValueEx(columnRslt_ret_trd_cur_upri, index, null);
		setValueEx(columnRslt_ret_xrate_inpt_flg, index, false);
		setValueEx(columnRslt_ret_ptax_xrate_inpt_flg, index, false);
		if (!isNull(r.ret_trd_cur_cd())) {
			if (isShip(r)) {
				setFirstShipSchdTm(r);
			}
			MCRow upriR = getProvUpri(
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					r.gi_sppl_cd(),
					r.ret_trd_cur_cd(),
					r.gi_wg_cd(),
					getRetAccptSchdDt(r),
					this);
			if (!isNull(upriR)) {
				setValueEx(columnRslt_ret_trd_cur_upri, index, upriR.getNumberNE("upri"));
			}
		}
	}
	
	@Override
	protected void openISPanelSub(MCRootPanel inputSupportPanel, MCRow bind, MCListPutter putter, int idx) {
		
		if (columnRslt_ship_to_id_cd == putter.getLinkBeans()) {		
			ISPanelLinker ret = getISPanelLinkerNE(putter.getLinkBeans());
			if (ret != null && ret.isEnable()) {
				RsltR rsltR = RsltTable.getSelectedMCRow();
				bind.setStringNE("ship_to_id_nm", rsltR.ship_to_id_nm());
				bind.setBooleanNE("ship_to_sundry_flg", rsltR.ship_to_sundry_flg());
				bind.setStringNE("zip_cd", rsltR.ship_to_zip_cd());
				bind.setStringNE("addr1", rsltR.ship_to_addr1());
				bind.setStringNE("addr2", rsltR.ship_to_addr2());
				bind.setStringNE("addr3", rsltR.ship_to_addr3());
				bind.setStringNE("addr4", rsltR.ship_to_addr4());
				bind.setStringNE("cntry_cd", rsltR.cntry_cd());
				bind.setStringNE("cntry_nm", rsltR.cntry_nm());
				bind.setStringNE("tel", rsltR.ship_to_tel());
				bind.setStringNE("fax", rsltR.ship_to_fax());
				bind.setStringNE("ship_to_cntct_dpt", rsltR.ship_to_cntct_dpt());
				bind.setStringNE("ship_to_cntct_psn", rsltR.ship_to_cntct_psn());
			}
		}
		super.openISPanelSub(inputSupportPanel, bind, putter, idx);
	}
	
	// ********** 共通処理 **********
	/**
	 * 送付先識別区分と送付先識別ＣＤを設定する。
	 */
	protected void setShipToId(RsltR r) {
		setShipToId(r, false);
	}
	/**
	 * 送付先識別区分と送付先識別ＣＤを設定する。
	 * インボイス取引対象ＦＬＧを設定する場合、setIvTrdFlgにtrueを指定する。
	 */
	protected void setShipToId(RsltR r, boolean setIvTrdFlg) {
		int index = r.getGUIIndex();
		
		setValueEx(columnRslt_ship_to_id_typ, index, null);
		setValueEx(columnRslt_ship_to_id_cd, index, null);
		setValueEx(columnRslt_via_dlv_typ, index, null);
		if (isShip(r)) {
			MCRow xfrExR = null;
			if (setIvTrdFlg || r.iv_trd_flg()) {
				xfrExR = getXfrEx(
						r.gi_lg_grp_cd(),
						r.gr_lg_grp_cd(),
						r.ship_term_cd(),
						this);
				if (setIvTrdFlg) {
					r.iv_trd_flg(
						!MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
							&& !isNull(xfrExR)
							&& xfrExR.getBooleanNE("iv_trd_flg")
					);
				}
			}
			if (r.iv_trd_flg()) {
				setValueEx(columnRslt_ship_to_id_typ, index, MSC_SHIP_TO_ID_TYP.TDLV.value());
				if (!isNull(xfrExR)) {
					setValueEx(columnRslt_ship_to_id_cd, index, xfrExR.getString("tdlv_cd"));
				}
			}
			else {
				setValueEx(columnRslt_ship_to_id_typ, index, MSC_SHIP_TO_ID_TYP.LOC.value());
				setValueEx(columnRslt_ship_to_id_cd, index, r.gr_loc_cd());
			}
		}
	}

	// 納品予定日と出荷予定日を設定する。
	protected void setShipSchdTm(RsltR r) {
		r.dlv_schd_tm(null);
		r.ship_schd_tm(null);
		MCRow tmR = null;
		try {
			tmR = getShipDlvSchdTm(
					r.ship_to_id_typ(),
					r.ship_to_id_cd(),
					r.gr_lg_grp_cd(),
					r.gi_lg_grp_cd(),
					r.ship_term_cd(),
					r.rcpt_dt(),
					r.gr_rqst_dt(),
					r.gi_rqst_dt(),
					nvl(r.ship_inst_typ(), MAC_SHIP_INST_TYP.PICK.value()),
					this);
		}
		catch (MCAppException e) {
			if(!(isNull(r.ship_term_cd()) && isSame(e.getID(), "MSBEL0155"))) {
				throw e;
			}
		}
		if (!isNull(tmR)) {
			r.dlv_schd_tm(tmR.getDateNE("dlv_schd_tm"));
			r.ship_schd_tm(tmR.getDateNE("ship_schd_tm"));
		}
	}

	// 納品予定日と出荷予定日を設定する。検索直後の変更行に対応するため。
	protected void setFirstShipSchdTm(RsltR r) {
		if (isNullOr(r.dlv_schd_tm(), r.ship_schd_tm())) {
			setShipSchdTm(r);
		}
	}
	
	// 支給区分を設定する。
	protected void setProvTyp(RsltR r) {
		int index = r.getGUIIndex();
		setValueEx(columnRslt_prov_typ, index, null);
		
		if (isProv(r) || isProvDD(r)) {
			String provTyp = MAC_PROV_TYP.FFR_PROV.value();
			if (r.gr_onr_prsppl_flg()) {
				MCRow upriR = getProvUpri(
						r.itm_cd(),
						r.itm_sub1(),
						r.itm_sub2(),
						r.itm_sub3(),
						r.gr_sppl_cd(),
						r.gr_cur_cd(),
						r.gr_wg_cd(),
						getAccptSchdDt(r),
						this);
				if (!isNull(upriR)) {
					if (MAC_PROV_TYP.isONR_PROV(upriR.getStringNE("prov_typ"))) {
						provTyp = MAC_PROV_TYP.ONR_PROV.value();
					}
				}
			}
			setValueEx(columnRslt_prov_typ, index, provTyp);
		}
	}

	// 在庫識別区分から支給区分（返品）を設定する
	protected void setRetProvTyp(RsltR r) {
		int index = r.getGUIIndex();
		
		setValueEx(columnRslt_ret_prov_typ, index, null);
		if (!isNull(r.stk_id_typ())) {
			if (isRetProv(r) || isProvDD(r)) {
				if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
					setValueEx(columnRslt_ret_prov_typ, index, MAC_PROV_TYP.ONR_PROV.value());
				}
				else if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && isNullOrNullVal(r.gi_stk_arrv_bp_cd())) {
					setValueEx(columnRslt_ret_prov_typ, index, MAC_PROV_TYP.ONR_PROV.value());
				}
				else {
					setValueEx(columnRslt_ret_prov_typ, index, MAC_PROV_TYP.FFR_PROV.value());
				}
			}
		}
	}
	protected void setDefLocWgCd(RsltR r) {
		int index = r.getGUIIndex();
		
		if (isNull(r.gi_loc_cd()) && !isNull(r.gi_lg_grp_cd())) {
			String wgCd = getDefLocWgCd(
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					r.gi_lg_grp_cd(),
					this);
				setValueEx(columnRslt_gi_wg_cd, index, wgCd);
		}
	}
	
	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(RsltR rsltR) {
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
			setValueEx(columnRslt_gr_str_ln_cd_none_flg, rsltR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnRslt_gr_str_ln_cd, rsltR.getGUIIndex(), StrLnCd);
		}
	}
	
	/**
	 * 移動・移送かどうか
	 * 社内場所から社内場所、または同一発注先間の移動なら移動。
	 */
	protected boolean isXfr(RsltR dtlR) {
		return (isNullOrNullVal(dtlR.gi_sppl_cd())
				&& isNullOrNullVal(dtlR.gr_sppl_cd()))
				|| isSame(dtlR.gi_sppl_cd(), dtlR.gr_sppl_cd());
	}

	/**
	 * 支給かどうか
	 * 社内場所から社外場所への移動なら支給。
	 */
	protected boolean isProv(RsltR dtlR) {
		return isNullOrNullVal(dtlR.gi_sppl_cd())
				&& !isNullOrNullVal(dtlR.gr_sppl_cd());
	}
	
	/**
	 * 支給返品かどうか
	 * 社外場所から社内場所への移動なら支給返品。
	 */
	protected boolean isRetProv(RsltR r) {
		return !isNullOrNullVal(r.gi_sppl_cd())
				&& isNullOrNullVal(r.gr_sppl_cd());
	}

	/**
	 * 直送支給かどうか
	 * 社外場所から社外場所へかつ異なる発注先間での移動なら直送支給。
	 */
	protected boolean isProvDD(RsltR r) {
		return !isNullOrNullVal(r.gi_sppl_cd())
				&& !isNullOrNullVal(r.gr_sppl_cd())
				&& !isSame(r.gi_sppl_cd(), r.gr_sppl_cd());
	}

	/**
	 * 移動かどうか：物流グループを跨がない
	 */
	protected boolean isMove(RsltR r) {
		return !isNull(r.gr_lg_grp_cd()) && isSame(r.gr_lg_grp_cd(), r.gi_lg_grp_cd());
	}

	/**
	 * 移送かどうか： 物流グループを跨ぐ
	 */
	protected boolean isShip(RsltR r) {
		return !isNullOr(r.gr_lg_grp_cd(), r.gi_lg_grp_cd())
				&& !isSame(r.gr_lg_grp_cd(), r.gi_lg_grp_cd());
	}

	protected boolean isOther(RsltR r) {
		return !isMove(r) && !isShip(r);
	}

	/**
	 * 新規追加行の場合、取引パタンがNULLでも、入力可能となる候補の項目
	 */
	protected MCColumnConfig[] getTrdCdNullECols() {
		if (_trdCdNullECols == null) {
			_trdCdNullECols = new MCColumnConfig[] {
					columnRslt_check,
					columnRslt_trd_cd,
					columnRslt_itm_cd,
					columnRslt_itm_sub1,
					columnRslt_itm_sub2,
					columnRslt_itm_sub3,
					columnRslt_trd_unit_cd,
					columnRslt_trd_unit_qty,
					columnRslt_sno1,
					columnRslt_sno2,
					columnRslt_sno3,
					columnRslt_sno4,
					columnRslt_sno1_null_flg,
					columnRslt_sno2_null_flg,
					columnRslt_sno3_null_flg,
					columnRslt_sno4_null_flg,
					columnRslt_gi_loc_cd,
					columnRslt_gi_str_ln_cd,
					columnRslt_lot_no,
					columnRslt_sublot_no,
					columnRslt_ver_no,
					columnRslt_quality_typ,
					columnRslt_gi_str_ln_cd_none_flg,
					columnRslt_gd_cd,
					columnRslt_stk_id_typ,
					columnRslt_stk_bp_cd,
					columnRslt_gi_stk_arrv_bp_cd,
					columnRslt_rcpt_dt,
					columnRslt_rqst_usr_cd,
					columnRslt_rqst_dpt_cd
					};
		}
		return _trdCdNullECols;
	}

	protected boolean isTrdCdNullECol(MCColumnConfig col) {
		return MCCollectionUtil.contains(col, getTrdCdNullECols());
	}

	protected boolean isTrdCdNullENmCol(MCColumnConfig col) {
		return MCCollectionUtil.contains(col, getTrdCdNullENmCols());
	}

	protected MCColumnConfig[] getTrdCdNullENmCols() {
		if (_trdCdNullENmCols == null) {
			_trdCdNullENmCols = new MCColumnConfig[] {
					columnRslt_itm_nm,
					columnRslt_trd_unit_nm,
					columnRslt_gi_loc_nm,
					columnRslt_gi_str_ln_nm,
					columnRslt_quality_typ_nm,
					columnRslt_gd_nm,
					columnRslt_stk_id_typ_nm,
					columnRslt_stk_bp_nm,
					columnRslt_gi_stk_arrv_bp_nm,
					columnRslt_rqst_usr_nm,
					columnRslt_rqst_dpt_nm
					};
		}
		return _trdCdNullENmCols;
	}

	/**
	 * ロット指定無のときにROになるカラム
	 */
	protected MCColumnConfig[] getLotNoneROCols() {
		if (_lotNoneROCols == null) {
			_lotNoneROCols = new MCColumnConfig[] {
					columnRslt_lot_no,
					columnRslt_sublot_no};
		}
		return _lotNoneROCols;
	}

	protected boolean isLotNoneROCol(MCColumnConfig col) {
		return MCCollectionUtil.contains(col, getLotNoneROCols());
	}

	/**
	 * 支給区分が有償支給でない、または、使用基準である場合にROになるカラム
	 */
	protected MCColumnConfig[] getProvROCols() {
		if (_provROCols == null) {
			_provROCols = new MCColumnConfig[] {
					columnRslt_trd_cur_cd,
					columnRslt_trd_cur_upri,
					columnRslt_tax_fix_flg,
					columnRslt_tax_cd,
					columnRslt_prov_xrate_cd,
					columnRslt_xrate_inpt_flg,
					columnRslt_xrate,
					columnRslt_ptax_xrate_inpt_flg,
					columnRslt_ptax_xrate,
					columnRslt_base_cur_cd,
					columnRslt_ptax_cur_cd,
					columnRslt_wtax_rate};
		}
		return _provROCols;
	}

	protected boolean isProvROCol(MCColumnConfig col) {
		return MCCollectionUtil.contains(col, getProvROCols());
	}

	/**
	 * 支給区分（返品）が有償支給でない、または、使用基準である場合にROになるカラム
	 */
	protected MCColumnConfig[] getRetProvROCols() {
		if (_retProvROCols == null) {
			_retProvROCols = new MCColumnConfig[] {
					columnRslt_ret_trd_cur_cd,
					columnRslt_ret_trd_cur_upri,
					columnRslt_ret_tax_fix_flg,
					columnRslt_ret_tax_cd,
					columnRslt_ret_xrate_inpt_flg,
					columnRslt_ret_xrate,
					columnRslt_ret_ptax_xrate_inpt_flg,
					columnRslt_ret_ptax_xrate,
					columnRslt_ret_wtax_rate};
		}
		return _retProvROCols;	
	}

	protected boolean isRetProvROCol(MCColumnConfig col) {
		return MCCollectionUtil.contains(col, getRetProvROCols());
	}

	/**
	 * 物流グループを跨ぐ移送のときのみ入力可能になるカラム
	 */
	protected MCColumnConfig[] getShipCols() {
		if (_shipCols == null) {
			_shipCols = new MCColumnConfig[] {
					columnRslt_ship_block_flg,
					columnRslt_ship_term_cd,
					columnRslt_ship_to_id_typ,
					columnRslt_ship_to_id_cd,
					columnRslt_ship_to_id_nm,
					columnRslt_via_dlv_typ};
		}
		return _shipCols;
	}

	protected boolean isShipCol(MCColumnConfig col) {
		return MCCollectionUtil.contains(col, getShipCols());
	}

	protected void clearCols(RsltR r, MCColumnConfig... cols) {
		for (MCColumnConfig col : cols) {
			if (col.getColumnType() == MCColumnType.CHECK) {
				setValueEx(col, r.getGUIIndex(), false);
			}
			else {
				setValueEx(col, r.getGUIIndex(), null);
			}
		}
	}
	
	protected void clearColsByShip(RsltR r, MCColumnConfig... cols) {
		for (MCColumnConfig col : cols) {
			if (col.getColumnType() == MCColumnType.CHECK) {
				setValueEx(col, r.getGUIIndex(), false);
			}
			else {
				if(col.getRowColumnName().equals("ship_term_cd")) {
					if(!isShip(r)) {
						setValueEx(col, r.getGUIIndex(), null);
					}
				}
				else {
					setValueEx(col, r.getGUIIndex(), null);
				}
			}
		}
	}
	
	protected void setShipTermCd(RsltR r ,MCEventInfo info) {
		if(isNull(r.ship_term_cd()) && isShip(r)) {
			if(isSame(info.getOldValue(), r.gr_lg_grp_cd()) || isSame(info.getOldValue(), r.gi_lg_grp_cd()) || isNull(info.getOldValue())) {
				setValueEx(columnRslt_ship_term_cd, r.getGUIIndex(), r.ship_term_cd_inv());
			}
		}
	}
	
	// -----------------------------------------------
	// fileImport
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBEL1000_Imp01();
	}

	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void changeFileInRowStatus() {
		for (RsltR r : getRsltL()) {
			if (!isNull(r.xfr_schd_no())) {
				r.setStatus(MCRow.MODIFY);
			}
		}
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}
	
	
	// -----------------------------------------------
	// MSBEP0500
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		return RsltTable;
	}

	@Override
	public boolean checkOpenStkInfoPanel(MCRootPanel panel) {
		boolean boo = IfStkInspBase.super.checkOpenStkInfoPanel(panel);
		if (!boo) {
			return false;
		}
		MCTable<?> table = getStkTable(panel);
		MCRow row = table.getSelectedMCRow();
		if (row == null) {
			return false;
		}
		
		return true;
	}
	
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		MCRow row = table.getSelectedMCRow();
		MCRow bind = MCRow.create();
		if (row instanceof RsltR) {
			RsltR r = (RsltR)row;
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, r.itm_cd());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, r.itm_sub1());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, r.itm_sub2());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, r.itm_sub3());
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, r.ver_no());
			bind.addStringColumn(IfStkInspBase.CND_SNO1, r.sno1());
			bind.addStringColumn(IfStkInspBase.CND_SNO2, r.sno2());
			bind.addStringColumn(IfStkInspBase.CND_SNO3, r.sno3());
			bind.addStringColumn(IfStkInspBase.CND_SNO4, r.sno4());
			bind.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, r.sno1_null_flg());
			bind.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, r.sno2_null_flg());
			bind.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, r.sno3_null_flg());
			bind.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, r.sno4_null_flg());
			bind.addStringColumn(IfStkInspBase.CND_LG_GRP_CD, r.gi_lg_grp_cd());
			bind.addStringColumn(IfStkInspBase.CND_LOC_CD, r.gi_loc_cd());
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_CD, r.gi_str_ln_cd());
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);
			if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())) {
				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.HOUSE.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.OUTSIDE.value());
			}
			if (!isNull(r.xfr_schd_no())) {
				bind.addStringColumn(IfStkInspBase.CND_OPE, IfStkInspBase.OPE_UPD);
			}
			if (!MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
				bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG, true);
				bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG, true);
			}
		}
		
		return bind;
	}

	@Override
	public String getStkInspOpeType(MCTable<?> table, int index) {
		MCRow row = table.getList().get(index);
		if (row instanceof RsltR) {
			RsltR r = (RsltR)row;
			if (!isNull(r.xfr_schd_no())) {
				return IfStkInspBase.OPE_UPD;
			}
		}
		return IfStkInspBase.super.getStkInspOpeType(table, index);
	}
	
	@Override
	public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		MCTable<?> table = getStkTable(panel);
		MCRow row = table.getList().get(index);
		if (row instanceof RsltR) {
			RsltR r = (RsltR)row;
			if (!isNull(r.xfr_schd_no())) {
				if (isSame(ope, IfStkInspBase.OPE_INS)) {
					return false;
				}
			}
			if (isSame(ope, IfStkInspBase.OPE_UPD)) {
				return true;
			}
		}
		return true;
	}
	
	@Override
	public boolean isCndEnable(String ope, String name) {
		boolean boo = IfStkInspBase.super.isCndEnable(ope, name);
		if (!boo) {
			return false;
		}
		
		MCTable<?> table = RsltTable;
		MCRow row = table.getSelectedMCRow();
		if (row instanceof RsltR) {
			RsltR r = (RsltR)row;
			if (!isNull(r.xfr_schd_no())) {
				ArrayList<String> l = new ArrayList<>();
				l.add(IfStkInspBase.CND_ITM_CD);
				l.add(IfStkInspBase.CND_ITM_SUB1);
				l.add(IfStkInspBase.CND_ITM_SUB2);
				l.add(IfStkInspBase.CND_ITM_SUB3);
				l.add(IfStkInspBase.CND_SNO1);
				l.add(IfStkInspBase.CND_SNO2);
				l.add(IfStkInspBase.CND_SNO3);
				l.add(IfStkInspBase.CND_SNO4);
				l.add(IfStkInspBase.CND_SNO1_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO2_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO3_NULL_FLG);
				l.add(IfStkInspBase.CND_SNO4_NULL_FLG);
				return !l.contains(name);
			}
			
		}
		else {
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean isSrch(String openTyp, MCRow bind, Object... args) {
		return !isNull(bind.getStringNE(IfStkInspBase.CND_ITM_CD));
	}
	
	@Override
	public String getInptLocCdCol() {
		return RsltR.$gi_loc_cd;
	}
	
	@Override
	public String getInptStrLnCdCol() {
		return RsltR.$gi_str_ln_cd;
	}
	
	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return RsltR.$gi_str_ln_cd_none_flg;
	}
	
	@Override
	public String getInptStkArrvBpCdCol() {
		return RsltR.$gi_stk_arrv_bp_cd;
	}
	
	@Override
	public String getInptPackUnitCdCol() {
		return RsltR.$trd_unit_cd;
	}
	
	@Override
	public String getInptPackStkQtyCol() {
		return RsltR.$trd_unit_qty;
	}
	
	// -----------------------------------------------

}