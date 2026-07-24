package mcframe.clientMSBE.MSBEP0030;

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
import mcframe.clientMAUB.MAUBP0440.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
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
import static mcframe.clientMSUC.MSUCP0050.MSUCP_ClUtil.*;
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_MlyIoStkDtlSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_MlyIoStkDtlSrch_MC extends MSBEP_MlyIoStkDtlSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_MlyIoStkDtlSrch_MC() {
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
	public MSBEP_MlyIoStkDtlSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0030_Srch01Caller<P extends MSBEP_MlyIoStkDtlSrch, B extends MS_MSBEL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			// 業務データダウンロード（必須）
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkDateBeforeAfter(msgList);
		}

		protected void checkDateBeforeAfter(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_mly_io_cl_ym_fr, Cnd_mly_io_cl_ym_to));
		}

		@Override
		protected void setMode() {
			super.setMode();

			setBtnMode();
			changeDtlDisp();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setBtnMode();
			changeDtlDisp();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}


	/**
	 * 検索を実行した後に、<br>
	 * 選択された「集計対象項目」、指定された「表示単位」で、<br>
	 * 明細の表示項目を制御する。
	 */
	protected void changeDtlDisp() {
		changeAggrItemsDisp();
		changeQtyAmtItemsDisp();
	}

	/**
	 * 選択された「集計対象項目」に関連する明細項目だけを表示する。
	 */
	protected void changeAggrItemsDisp() {
		changeDispWg();             // ワーキンググループ
		changeDispDpt();            // 部門
		changeDispLot();            // ロットＮＯ
		changeDispSublot();         // サブロットＮＯ
		changeDispLoc();            // 場所
		changeDispStrLn();          // 棚・ライン
		changeDispSite();           // 工場･物流倉庫
		changeDispLgGrp();          // 物流Ｇ
		changeDispAllocGrp();       // 総量引当場所Ｇ
		changeDispLocGrp();         // 製造場所Ｇ
		changeDispGd();             // 格付
		changeDispSno1();           // 手配ＮＯ１
		changeDispSno2();           // 手配ＮＯ２
		changeDispSno3();           // 手配ＮＯ３
		changeDispSno4();           // 手配ＮＯ４
		changeDispFixNoTyp();       // 確定ＮＯ区分
		changeDispFixNo();          // 確定ＮＯ
		changeDispStkArrvBp();      // 在庫着荷先
	}

	protected void changeDispWg() {
		if (getCndR().wg_flg()) {
			columnRslt_wg_cd.setMode(getDefaultMode(columnRslt_wg_cd));
			columnRslt_wg_nm.setMode(getDefaultMode(columnRslt_wg_nm));
		}
		else {
			columnRslt_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_wg_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispDpt() {
		if (getCndR().dpt_flg()) {
			columnRslt_dpt_cd.setMode(getDefaultMode(columnRslt_dpt_cd));
			columnRslt_dpt_nm.setMode(getDefaultMode(columnRslt_dpt_nm));
		}
		else {
			columnRslt_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_dpt_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLoc() {
		if (getCndR().loc_flg()) {
			columnRslt_loc_cd.setMode(getDefaultMode(columnRslt_loc_cd));
			columnRslt_loc_nm.setMode(getDefaultMode(columnRslt_loc_nm));
		}
		else {
			columnRslt_loc_cd.setMode(MCMode.INVISIBLE);
			columnRslt_loc_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStrLn() {
		if (getCndR().str_ln_flg()) {
			columnRslt_str_ln_cd.setMode(getDefaultMode(columnRslt_str_ln_cd));
			columnRslt_str_ln_nm.setMode(getDefaultMode(columnRslt_str_ln_nm));
			columnRslt_str_ln_cd_none_flg.setMode(getDefaultMode(columnRslt_str_ln_cd_none_flg));
		}
		else {
			columnRslt_str_ln_cd.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_nm.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_cd_none_flg.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLot() {
		if (getCndR().lot_no_flg()) {
			columnRslt_lot_no.setMode(getDefaultMode(columnRslt_lot_no));
			if (getCndR().sublot_no_flg()) {
				columnRslt_ver_no.setMode(getDefaultMode(columnRslt_ver_no));
			}
		}
		else {
			columnRslt_lot_no.setMode(MCMode.INVISIBLE);
			columnRslt_ver_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSublot() {
		if (getCndR().sublot_no_flg()) {
			columnRslt_sublot_no.setMode(getDefaultMode(columnRslt_sublot_no));
		}
		else {
			columnRslt_sublot_no.setMode(MCMode.INVISIBLE);
			columnRslt_ver_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno1() {
		if (getCndR().sno1_flg()) {
			columnRslt_sno1.setMode(getDefaultMode(columnRslt_sno1));
			columnRslt_wrk_no.setMode(getDefaultMode(columnRslt_wrk_no));
			columnRslt_wrk_nm.setMode(getDefaultMode(columnRslt_wrk_nm));
		}
		else {
			columnRslt_sno1.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_no.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno2() {
		if (getCndR().sno2_flg()) {
			columnRslt_sno2.setMode(getDefaultMode(columnRslt_sno2));
		}
		else {
			columnRslt_sno2.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno3() {
		if (getCndR().sno3_flg()) {
			columnRslt_sno3.setMode(getDefaultMode(columnRslt_sno3));
		}
		else {
			columnRslt_sno3.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno4() {
		if (getCndR().sno4_flg()) {
			columnRslt_sno4.setMode(getDefaultMode(columnRslt_sno4));
		}
		else {
			columnRslt_sno4.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLgGrp() {
		if (getCndR().lg_grp_flg()) {
			columnRslt_lg_grp_cd.setMode(getDefaultMode(columnRslt_lg_grp_cd));
			columnRslt_lg_grp_nm.setMode(getDefaultMode(columnRslt_lg_grp_nm));
		}
		else {
			columnRslt_lg_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_lg_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispAllocGrp() {
		if (getCndR().alloc_grp_flg()) {
			columnRslt_alloc_grp_cd.setMode(getDefaultMode(columnRslt_alloc_grp_cd));
			columnRslt_alloc_grp_nm.setMode(getDefaultMode(columnRslt_alloc_grp_nm));
		}
		else {
			columnRslt_alloc_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_alloc_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLocGrp() {
		if (getCndR().loc_grp_flg()) {
			columnRslt_loc_grp_cd.setMode(getDefaultMode(columnRslt_loc_grp_cd));
			columnRslt_loc_grp_nm.setMode(getDefaultMode(columnRslt_loc_grp_nm));
		}
		else {
			columnRslt_loc_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_loc_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispGd() {
		if (getCndR().gd_flg()) {
			columnRslt_gd_cd.setMode(getDefaultMode(columnRslt_gd_cd));
			columnRslt_gd_nm.setMode(getDefaultMode(columnRslt_gd_nm));
		}
		else {
			columnRslt_gd_cd.setMode(MCMode.INVISIBLE);
			columnRslt_gd_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSite() {
		if (getCndR().site_flg()) {
			columnRslt_site_cd.setMode(getDefaultMode(columnRslt_site_cd));
			columnRslt_site_nm.setMode(getDefaultMode(columnRslt_site_nm));
		}
		else {
			columnRslt_site_cd.setMode(MCMode.INVISIBLE);
			columnRslt_site_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStkArrvBp() {
		if (getCndR().stk_arrv_bp_flg()) {
			columnRslt_stk_arrv_bp_cd.setMode(getDefaultMode(columnRslt_stk_arrv_bp_cd));
			columnRslt_stk_arrv_bp_nm.setMode(getDefaultMode(columnRslt_stk_arrv_bp_nm));
		}
		else {
			columnRslt_stk_arrv_bp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_stk_arrv_bp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispFixNoTyp() {
		if (getCndR().fix_no_typ_flg()) {
			columnRslt_fix_no_typ.setMode(getDefaultMode(columnRslt_fix_no_typ));
			columnRslt_fix_no_typ_nm.setMode(getDefaultMode(columnRslt_fix_no_typ_nm));
		}
		else {
			columnRslt_fix_no_typ.setMode(MCMode.INVISIBLE);
			columnRslt_fix_no_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispFixNo() {
		if (getCndR().fix_no_flg()) {
			columnRslt_fix_no.setMode(getDefaultMode(columnRslt_fix_no));
		}
		else {
			columnRslt_fix_no.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 「表示単位」により、明細項目の表示を制御する。
	 */
	protected void changeQtyAmtItemsDisp() {
		if (Cnd_disp_unit_AMT.isSelected()) {
			// 数量項目の非表示
			columnRslt_unit_cd.setMode(MCMode.INVISIBLE);
			columnRslt_unit_nm.setMode(MCMode.INVISIBLE);
			for (MCColumnConfig qtyI : getQtyItemL()) {
				qtyI.setMode(MCMode.INVISIBLE);
			}
			// 金額項目の表示
			columnRslt_base_cur_cd.setMode(getDefaultMode(columnRslt_base_cur_cd));
			columnRslt_base_cur_nm.setMode(getDefaultMode(columnRslt_base_cur_nm));
			columnRslt_std_unit_cost.setMode(getDefaultMode(columnRslt_std_unit_cost));
			for (MCColumnConfig amtI : getAmtItemL()) {
				amtI.setMode(getDefaultMode(amtI));
			}
		}
		else {
			// 数量項目の表示
			columnRslt_unit_cd.setMode(getDefaultMode(columnRslt_unit_cd));
			columnRslt_unit_nm.setMode(getDefaultMode(columnRslt_unit_nm));
			for (MCColumnConfig qtyI : getQtyItemL()) {
				qtyI.setMode(getDefaultMode(qtyI));
			}
			// 金額項目の非表示
			columnRslt_base_cur_cd.setMode(MCMode.INVISIBLE);
			columnRslt_base_cur_nm.setMode(MCMode.INVISIBLE);
			columnRslt_std_unit_cost.setMode(MCMode.INVISIBLE);
			for (MCColumnConfig amtI : getAmtItemL()) {
				amtI.setMode(MCMode.INVISIBLE);
			}
		}
	}

	/**
	 * 月次受払詳細ボタンの押下可能を制御する。
	 */
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		if (isNull(r)) {
			Btn_open_MSBEP0080.setMode(MCMode.DISABLE);
			Btn_open_MSBEP0010.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBEP0080.setMode(MCMode.ENABLE);
			Btn_open_MSBEP0010.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setAggrChkBoxVal(true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setAggrChkBoxVal(false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL0030_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL0030_Srch01().execDL();	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0080]の押下時の処理
	 */

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == RsltTable) {
			execOpenMSBEP0080(RsltTable.getSelectedMCRow());
		}
	}

	@Override
	public void doBtn_open_MSBEP0080(MCEventInfo info) {
		execOpenMSBEP0080(RsltTable.getSelectedMCRow());
	}

	protected void execOpenMSBEP0080(RsltR r) {
		if (r == null) {
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0080");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0080CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0080.CndR crtOpenMSBEP0080CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBE.MSBEP0080.MSBEP_IoActSrch p = (mcframe.clientMSBE.MSBEP0080.MSBEP_IoActSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0080.CndR to = mcframe.clientMSBE.MSBEP0080.CndR.create();

		to.ope(p.Cnd_ope_SRCH_NRML.getActionCommand());
		to.ac_dt_fr(getCndR().mly_io_cl_ym_fr().startOfMonth());
		to.ac_dt_to(getCndR().mly_io_cl_ym_to().endOfMonth());
		to.lg_grp_cd(fr.lg_grp_cd());
		to.alloc_grp_cd(fr.alloc_grp_cd());
		to.site_cd(fr.site_cd());
		to.loc_grp_cd(fr.loc_grp_cd());
		to.loc_cd(fr.loc_cd());
		to.str_ln_cd(fr.str_ln_cd());
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.itm_nm(fr.itm_nm());
		to.stk_arrv_bp_cd(fr.stk_arrv_bp_cd());
		to.stk_bp_cd(fr.stk_bp_cd());
		to.lot_no(fr.lot_no());
		to.sublot_no(fr.sublot_no());
		to.sno1(fr.sno1());
		to.sno2(fr.sno2());
		to.sno3(fr.sno3());
		to.sno4(fr.sno4());
		to.fix_no_typ(fr.fix_no_typ());
		to.fix_no(fr.fix_no());
		to.pack_unit_cd(fr.unit_cd());
		to.gd_cd(fr.gd_cd());
		to.in_xfr_typ(fr.in_xfr_typ());
		to.quality_typ(fr.quality_typ());
		to.stk_insp_typ(fr.stk_insp_typ());
		to.asst_typ(fr.asst_typ());
		to.stk_id_typ(fr.stk_id_typ());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0010(MCEventInfo info) {
		execOpenMSBEP0010(RsltTable.getSelectedMCRow());
	}

	protected void execOpenMSBEP0010(RsltR r) {
		if (r == null) {
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0010");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0010CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0010.CndR crtOpenMSBEP0010CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBE.MSBEP0010.CndR to = mcframe.clientMSBE.MSBEP0010.CndR.create();
		mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch p = (mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch) aso.getPanel();

		to.ope(p.Cnd_ope_STK.getActionCommand());
		to.wg_cd(fr.wg_cd());
		to.site_cd(fr.site_cd());
		to.lg_grp_cd(fr.lg_grp_cd());
		to.alloc_grp_cd(fr.alloc_grp_cd());
		to.dpt_cd(fr.dpt_cd());
		to.loc_grp_cd(fr.loc_grp_cd());
		to.loc_cd(fr.loc_cd());
		to.str_ln_cd(fr.str_ln_cd());
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.itm_nm(fr.itm_nm());
		to.stk_arrv_bp_cd(fr.stk_arrv_bp_cd());
		to.stk_bp_cd(fr.stk_bp_cd());
		to.lot_no(fr.lot_no());
		to.sublot_no(fr.sublot_no());
		to.sno1(fr.sno1());
		to.sno2(fr.sno2());
		to.sno3(fr.sno3());
		to.sno4(fr.sno4());
		to.fix_no_typ(fr.fix_no_typ());
		to.fix_no(fr.fix_no());
		to.pack_unit_cd(fr.unit_cd());
		to.gd_cd(fr.gd_cd());
		to.in_xfr_typ(fr.in_xfr_typ());
		to.quality_typ(fr.quality_typ());
		to.stk_insp_typ(fr.stk_insp_typ());
		to.asst_typ(fr.asst_typ());
		to.stk_id_typ(fr.stk_id_typ());

		return to;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);

		// 標準単価
		Rslt_std_unit_cost_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_dec_place);

		// 数量集計部品
		for (MAUBP_Qty_D ppanel : getQtyPPanelL()) {
			ppanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		}

		// 金額集計部品
		for (MAUBP_Amt_D ppanel : getAmtPPanelL()) {
			ppanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_dec_place);
		}

		// 品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	/**
	 * 一覧集計数量パネル配列
	 * @return
	 */
	protected MAUBP_Qty_D[] getQtyPPanelL() {
		MAUBP_Qty_D[] qpL = {
				 Rslt_ini_stk_qty_p_PPanel                 // 月初在庫数
				,Rslt_gr_total_qty_p_PPanel                // 入庫計
				,Rslt_arr_qty_p_PPanel                     // 入荷数
				,Rslt_purc_gr_qty_p_PPanel                 // 仕入入庫数
				,Rslt_onr_rcv_gr_qty_p_PPanel              // 有償受給入庫数
				,Rslt_purc_rtn_gr_qty_p_PPanel             // 仕入返品入庫数
				,Rslt_onr_rcv_ret_gr_qty_p_PPanel          // 有償受給返品入庫数
				,Rslt_xpns_purc_gr_qty_p_PPanel            // 経費購買入庫数
				,Rslt_xpns_purc_rtn_gr_qty_p_PPanel        // 経費購買返品入庫数
				,Rslt_accpt_dfct_gr_qty_p_PPanel           // 検収不良入庫数
				,Rslt_mfg_qty_p_PPanel                     // 製造数
				,Rslt_bymfg_qty_p_PPanel                   // 副産品製造数
				,Rslt_ffr_prov_gr_qty_p_PPanel             // 無償支給入庫数
				,Rslt_onr_prov_gr_qty_p_PPanel             // 有償支給入庫数
				,Rslt_ffr_prov_rtn_gr_qty_p_PPanel         // 無償支給返品入庫数
				,Rslt_onr_prov_rtn_gr_qty_p_PPanel         // 有償支給返品入庫数
				,Rslt_insp_gr_qty_p_PPanel                 // 検査入庫数
				,Rslt_insp_cmpl_gr_qty_p_PPanel            // 検査完了入庫数
				,Rslt_insp_judg_gr_qty_p_PPanel            // 検査判定入庫数
				,Rslt_reinsp_gr_qty_p_PPanel               // 再検査入庫数
				,Rslt_stk_adjst_gr_qty_p_PPanel            // 棚卸差異増耗数
				,Rslt_prdct_wh_gr_qty_p_PPanel             // 倉入入庫数
				,Rslt_prdct_wh_rtn_gr_qty_p_PPanel         // 戻入入庫数
				,Rslt_xfr_gr_qty_p_PPanel                  // 移動・移送入庫数
				,Rslt_xfr_in_qty_p_PPanel                  // 転入数
				,Rslt_purc_xfr_in_qty_p_PPanel             // 仕入転入数
				,Rslt_xfr_rtn_gr_qty_p_PPanel              // 移動・移送返品入庫数
				,Rslt_acxfr_gr_qty_p_PPanel                // 他勘定振替入庫数
				,Rslt_arr_cststk_qty_p_PPanel              // 預り入庫数
				,Rslt_xfr_itm_gr_qty_p_PPanel              // 品目振替入庫数
				,Rslt_xfr_lot_sno_gr_qty_p_PPanel          // ロット・手配ＮＯ振替入庫数
				,Rslt_xfr_grd_gr_qty_p_PPanel              // 格付・良品区分振替入庫数
				,Rslt_xfr_pack_gr_qty_p_PPanel             // 荷姿振替入庫数
				,Rslt_ship_in_qty_p_PPanel                 // 着荷数
				,Rslt_ex_ship_in_qty_p_PPanel              // 輸出着荷数
				,Rslt_ship_rtn_gr_qty_p_PPanel             // 出荷返品入庫数
				,Rslt_sls_rtn_gr_qty_p_PPanel              // 売上返品入庫数
				,Rslt_gi_total_qty_p_PPanel                // 出庫計
				,Rslt_arr_rtn_qty_p_PPanel                 // 入荷返品数
				,Rslt_purc_gi_qty_p_PPanel                 // 仕入出庫数
				,Rslt_onr_rcv_gi_qty_p_PPanel              // 有償受給出庫数
				,Rslt_purc_rtn_gi_qty_p_PPanel             // 仕入返品出庫数
				,Rslt_onr_rcv_ret_gi_qty_p_PPanel          // 有償受給返品出庫数
				,Rslt_xpns_purc_gi_qty_p_PPanel            // 経費購買出庫数
				,Rslt_xpns_purc_rtn_gi_qty_p_PPanel        // 経費購買返品出庫数
				,Rslt_accpt_dfct_gi_qty_p_PPanel           // 検収不良出庫数
				,Rslt_inpt_qty_p_PPanel                    // 投入数
				,Rslt_loss_qty_p_PPanel                    // ロス数
				,Rslt_ffr_prov_gi_qty_p_PPanel             // 無償支給出庫数
				,Rslt_onr_prov_gi_qty_p_PPanel             // 有償支給出庫数
				,Rslt_ffr_prov_rtn_gi_qty_p_PPanel         // 無償支給返品出庫数
				,Rslt_onr_prov_rtn_gi_qty_p_PPanel         // 有償支給返品出庫数
				,Rslt_insp_gi_qty_p_PPanel                 // 検査出庫数
				,Rslt_insp_cmpl_gi_qty_p_PPanel            // 検査完了出庫数
				,Rslt_insp_judg_gi_qty_p_PPanel            // 検査判定出庫数
				,Rslt_reinsp_gi_qty_p_PPanel               // 再検査出庫数
				,Rslt_insp_smpl_gi_qty_p_PPanel            // 検査抜取数
				,Rslt_stk_adjst_gi_qty_p_PPanel            // 棚卸差異減耗数
				,Rslt_prdct_wh_gi_qty_p_PPanel             // 倉入出庫数
				,Rslt_prdct_wh_rtn_gi_qty_p_PPanel         // 戻入出庫数
				,Rslt_xfr_gi_qty_p_PPanel                  // 移動・移送出庫数
				,Rslt_xfr_out_qty_p_PPanel                 // 転出数
				,Rslt_purc_xfr_out_qty_p_PPanel            // 仕入転出数
				,Rslt_xfr_rtn_gi_qty_p_PPanel              // 移動・移送返品出庫数
				,Rslt_acxfr_gi_qty_p_PPanel                // 他勘定振替出庫数
				,Rslt_scrp_qty_p_PPanel                    // 廃棄数
				,Rslt_xfr_itm_gi_qty_p_PPanel              // 品目振替出庫数
				,Rslt_xfr_lot_sno_gi_qty_p_PPanel          // ロット・手配ＮＯ振替出庫数
				,Rslt_xfr_grd_gi_qty_p_PPanel              // 格付・良品区分振替出庫数
				,Rslt_xfr_pack_gi_qty_p_PPanel             // 荷姿振替出庫数
				,Rslt_ship_out_qty_p_PPanel                // 出荷数
				,Rslt_ex_ship_out_qty_p_PPanel             // 輸出出荷数
				,Rslt_ship_rtn_gi_qty_p_PPanel             // 出荷返品出庫数
				,Rslt_sls_rtn_gi_qty_p_PPanel              // 売上返品出庫数
				,Rslt_sls_qty_p_PPanel                     // 売上数
				,Rslt_end_stk_qty_p_PPanel                 // 月末在庫数
			};

		return qpL;
	}

	/**
	 * 一覧集計金額パネル配列
	 * @return
	 */
	protected MAUBP_Amt_D[] getAmtPPanelL() {
		MAUBP_Amt_D[] apL = {
				 Rslt_ini_stk_amt_p_PPanel                 // 月初在庫額
				,Rslt_gr_total_amt_p_PPanel                // 入庫計
				,Rslt_arr_amt_p_PPanel                     // 入荷額
				,Rslt_purc_gr_amt_p_PPanel                 // 仕入入庫額
				,Rslt_onr_rcv_gr_amt_p_PPanel              // 有償受給入庫額
				,Rslt_purc_rtn_gr_amt_p_PPanel             // 仕入返品入庫額
				,Rslt_onr_rcv_ret_gr_amt_p_PPanel          // 有償受給返品入庫額
				,Rslt_xpns_purc_gr_amt_p_PPanel            // 経費購買入庫額
				,Rslt_xpns_purc_rtn_gr_amt_p_PPanel        // 経費購買返品入庫額
				,Rslt_accpt_dfct_gr_amt_p_PPanel           // 検収不良入庫額
				,Rslt_mfg_amt_p_PPanel                     // 製造額
				,Rslt_bymfg_amt_p_PPanel                   // 副産品製造額
				,Rslt_ffr_prov_gr_amt_p_PPanel             // 無償支給入庫額
				,Rslt_onr_prov_gr_amt_p_PPanel             // 有償支給入庫額
				,Rslt_ffr_prov_rtn_gr_amt_p_PPanel         // 無償支給返品入庫額
				,Rslt_onr_prov_rtn_gr_amt_p_PPanel         // 有償支給返品入庫額
				,Rslt_insp_gr_amt_p_PPanel                 // 検査入庫額
				,Rslt_insp_cmpl_gr_amt_p_PPanel            // 検査完了入庫額
				,Rslt_insp_judg_gr_amt_p_PPanel            // 検査判定入庫額
				,Rslt_reinsp_gr_amt_p_PPanel               // 再検査入庫額
				,Rslt_stk_adjst_gr_amt_p_PPanel            // 棚卸差異増耗額
				,Rslt_prdct_wh_gr_amt_p_PPanel             // 倉入入庫額
				,Rslt_prdct_wh_rtn_gr_amt_p_PPanel         // 戻入入庫額
				,Rslt_xfr_gr_amt_p_PPanel                  // 移動・移送入庫額
				,Rslt_xfr_in_amt_p_PPanel                  // 転入額
				,Rslt_purc_xfr_in_amt_p_PPanel             // 仕入転入額
				,Rslt_xfr_rtn_gr_amt_p_PPanel              // 移動・移送返品入庫額
				,Rslt_acxfr_gr_amt_p_PPanel                // 他勘定振替入庫額
				,Rslt_arr_cststk_amt_p_PPanel              // 預り入庫額
				,Rslt_xfr_itm_gr_amt_p_PPanel              // 品目振替入庫額
				,Rslt_xfr_lot_sno_gr_amt_p_PPanel          // ロット・手配ＮＯ振替入庫額
				,Rslt_xfr_grd_gr_amt_p_PPanel              // 格付・良品区分振替入庫額
				,Rslt_xfr_pack_gr_amt_p_PPanel             // 荷姿振替入庫額
				,Rslt_ship_in_amt_p_PPanel                 // 着荷額
				,Rslt_ex_ship_in_amt_p_PPanel              // 輸出着荷額
				,Rslt_ship_rtn_gr_amt_p_PPanel             // 出荷返品入庫額
				,Rslt_sls_rtn_gr_amt_p_PPanel              // 売上返品入庫額
				,Rslt_gi_total_amt_p_PPanel                // 出庫計
				,Rslt_arr_rtn_amt_p_PPanel                 // 入荷返品額
				,Rslt_purc_gi_amt_p_PPanel                 // 仕入出庫額
				,Rslt_onr_rcv_gi_amt_p_PPanel              // 有償受給出庫額
				,Rslt_purc_rtn_gi_amt_p_PPanel             // 仕入返品出庫額
				,Rslt_onr_rcv_ret_gi_amt_p_PPanel          // 有償受給返品出庫額
				,Rslt_xpns_purc_gi_amt_p_PPanel            // 経費購買出庫額
				,Rslt_xpns_purc_rtn_gi_amt_p_PPanel        // 経費購買返品出庫額
				,Rslt_accpt_dfct_gi_amt_p_PPanel           // 検収不良出庫額
				,Rslt_inpt_amt_p_PPanel                    // 投入額
				,Rslt_loss_amt_p_PPanel                    // ロス額
				,Rslt_ffr_prov_gi_amt_p_PPanel             // 無償支給出庫額
				,Rslt_onr_prov_gi_amt_p_PPanel             // 有償支給出庫額
				,Rslt_ffr_prov_rtn_gi_amt_p_PPanel         // 無償支給返品出庫額
				,Rslt_onr_prov_rtn_gi_amt_p_PPanel         // 有償支給返品出庫額
				,Rslt_insp_gi_amt_p_PPanel                 // 検査出庫額
				,Rslt_insp_cmpl_gi_amt_p_PPanel            // 検査完了出庫額
				,Rslt_insp_judg_gi_amt_p_PPanel            // 検査判定出庫額
				,Rslt_reinsp_gi_amt_p_PPanel               // 再検査出庫額
				,Rslt_insp_smpl_gi_amt_p_PPanel            // 検査抜取額
				,Rslt_stk_adjst_gi_amt_p_PPanel            // 棚卸差異減耗額
				,Rslt_prdct_wh_gi_amt_p_PPanel             // 倉入出庫額
				,Rslt_prdct_wh_rtn_gi_amt_p_PPanel         // 戻入出庫額
				,Rslt_xfr_gi_amt_p_PPanel                  // 移動・移送出庫額
				,Rslt_xfr_out_amt_p_PPanel                 // 転出額
				,Rslt_purc_xfr_out_amt_p_PPanel            // 仕入転出額
				,Rslt_xfr_rtn_gi_amt_p_PPanel              // 移動・移送返品出庫額
				,Rslt_acxfr_gi_amt_p_PPanel                // 他勘定振替出庫額
				,Rslt_scrp_amt_p_PPanel                    // 廃棄額
				,Rslt_xfr_itm_gi_amt_p_PPanel              // 品目振替出庫額
				,Rslt_xfr_lot_sno_gi_amt_p_PPanel          // ロット・手配ＮＯ振替出庫額
				,Rslt_xfr_grd_gi_amt_p_PPanel              // 格付・良品区分振替出庫額
				,Rslt_xfr_pack_gi_amt_p_PPanel             // 荷姿振替出庫額
				,Rslt_ship_out_amt_p_PPanel                // 出荷額
				,Rslt_ex_ship_out_amt_p_PPanel             // 輸出出荷額
				,Rslt_ship_rtn_gi_amt_p_PPanel             // 出荷返品出庫額
				,Rslt_sls_rtn_gi_amt_p_PPanel              // 売上返品出庫額
				,Rslt_sls_amt_p_PPanel                     // 売上額
				,Rslt_end_stk_amt_p_PPanel                 // 月末在庫額
			};

		return apL;
	}

	/**
	 * 一覧集計数量項目配列
	 * @return
	 */
	protected MCColumnConfig[] getQtyItemL() {
		MCColumnConfig[] qtyIL = {
				 columnRslt_ini_stk_qty                 // 月初在庫数
				,columnRslt_gr_total_qty                // 入庫計
				,columnRslt_arr_qty                     // 入荷数
				,columnRslt_purc_gr_qty                 // 仕入入庫数
				,columnRslt_onr_rcv_gr_qty              // 有償受給入庫数
				,columnRslt_purc_rtn_gr_qty             // 仕入返品入庫数
				,columnRslt_onr_rcv_ret_gr_qty          // 有償受給返品入庫数
				,columnRslt_xpns_purc_gr_qty            // 経費購買入庫数
				,columnRslt_xpns_purc_rtn_gr_qty        // 経費購買返品入庫数
				,columnRslt_accpt_dfct_gr_qty           // 検収不良入庫数
				,columnRslt_mfg_qty                     // 製造数
				,columnRslt_bymfg_qty                   // 副産品製造数
				,columnRslt_ffr_prov_gr_qty             // 無償支給入庫数
				,columnRslt_onr_prov_gr_qty             // 有償支給入庫数
				,columnRslt_ffr_prov_rtn_gr_qty         // 無償支給返品入庫数
				,columnRslt_onr_prov_rtn_gr_qty         // 有償支給返品入庫数
				,columnRslt_insp_gr_qty                 // 検査入庫数
				,columnRslt_insp_cmpl_gr_qty            // 検査完了入庫数
				,columnRslt_insp_judg_gr_qty            // 検査判定入庫数
				,columnRslt_reinsp_gr_qty               // 再検査入庫数
				,columnRslt_stk_adjst_gr_qty            // 棚卸差異増耗数
				,columnRslt_prdct_wh_gr_qty             // 倉入入庫数
				,columnRslt_prdct_wh_rtn_gr_qty         // 戻入入庫数
				,columnRslt_xfr_gr_qty                  // 移動・移送入庫数
				,columnRslt_xfr_in_qty                  // 転入数
				,columnRslt_purc_xfr_in_qty             // 仕入転入数
				,columnRslt_xfr_rtn_gr_qty              // 移動・移送返品入庫数
				,columnRslt_acxfr_gr_qty                // 他勘定振替入庫数
				,columnRslt_arr_cststk_qty              // 預り入庫数
				,columnRslt_xfr_itm_gr_qty              // 品目振替入庫数
				,columnRslt_xfr_lot_sno_gr_qty          // ロット・手配ＮＯ振替入庫数
				,columnRslt_xfr_grd_gr_qty              // 格付・良品区分振替入庫数
				,columnRslt_xfr_pack_gr_qty             // 荷姿振替入庫数
				,columnRslt_ship_in_qty                 // 着荷数
				,columnRslt_ex_ship_in_qty              // 輸出着荷数
				,columnRslt_ship_rtn_gr_qty             // 出荷返品入庫数
				,columnRslt_sls_rtn_gr_qty              // 売上返品入庫数
				,columnRslt_gi_total_qty                // 出庫計
				,columnRslt_arr_rtn_qty                 // 入荷返品数
				,columnRslt_purc_gi_qty                 // 仕入出庫数
				,columnRslt_onr_rcv_gi_qty              // 有償受給出庫数
				,columnRslt_purc_rtn_gi_qty             // 仕入返品出庫数
				,columnRslt_onr_rcv_ret_gi_qty          // 有償受給返品出庫数
				,columnRslt_xpns_purc_gi_qty            // 経費購買出庫数
				,columnRslt_xpns_purc_rtn_gi_qty        // 経費購買返品出庫数
				,columnRslt_accpt_dfct_gi_qty           // 検収不良出庫数
				,columnRslt_inpt_qty                    // 投入数
				,columnRslt_loss_qty                    // ロス数
				,columnRslt_ffr_prov_gi_qty             // 無償支給出庫数
				,columnRslt_onr_prov_gi_qty             // 有償支給出庫数
				,columnRslt_ffr_prov_rtn_gi_qty         // 無償支給返品出庫数
				,columnRslt_onr_prov_rtn_gi_qty         // 有償支給返品出庫数
				,columnRslt_insp_gi_qty                 // 検査出庫数
				,columnRslt_insp_cmpl_gi_qty            // 検査完了出庫数
				,columnRslt_insp_judg_gi_qty            // 検査判定出庫数
				,columnRslt_reinsp_gi_qty               // 再検査出庫数
				,columnRslt_insp_smpl_gi_qty            // 検査抜取数
				,columnRslt_stk_adjst_gi_qty            // 棚卸差異減耗数
				,columnRslt_prdct_wh_gi_qty             // 倉入出庫数
				,columnRslt_prdct_wh_rtn_gi_qty         // 戻入出庫数
				,columnRslt_xfr_gi_qty                  // 移動・移送出庫数
				,columnRslt_xfr_out_qty                 // 転出数
				,columnRslt_purc_xfr_out_qty            // 仕入転出数
				,columnRslt_xfr_rtn_gi_qty              // 移動・移送返品出庫数
				,columnRslt_acxfr_gi_qty                // 他勘定振替出庫数
				,columnRslt_scrp_qty                    // 廃棄数
				,columnRslt_xfr_itm_gi_qty              // 品目振替出庫数
				,columnRslt_xfr_lot_sno_gi_qty          // ロット・手配ＮＯ振替出庫数
				,columnRslt_xfr_grd_gi_qty              // 格付・良品区分振替出庫数
				,columnRslt_xfr_pack_gi_qty             // 荷姿振替出庫数
				,columnRslt_ship_out_qty                // 出荷数
				,columnRslt_ex_ship_out_qty             // 輸出出荷数
				,columnRslt_ship_rtn_gi_qty             // 出荷返品出庫数
				,columnRslt_sls_rtn_gi_qty              // 売上返品出庫数
				,columnRslt_sls_qty                     // 売上数
				,columnRslt_end_stk_qty                 // 月末在庫数
			};

		return qtyIL;
	}

	/**
	 * 一覧集計金額項目配列
	 * @return
	 */
	protected MCColumnConfig[] getAmtItemL() {
		MCColumnConfig[] amtIL = {
				 columnRslt_ini_stk_amt                 // 月初在庫額
				,columnRslt_gr_total_amt                // 入庫計
				,columnRslt_arr_amt                     // 入荷額
				,columnRslt_purc_gr_amt                 // 仕入入庫額
				,columnRslt_onr_rcv_gr_amt              // 有償受給入庫額
				,columnRslt_purc_rtn_gr_amt             // 仕入返品入庫額
				,columnRslt_onr_rcv_ret_gr_amt          // 有償受給返品入庫額
				,columnRslt_xpns_purc_gr_amt            // 経費購買入庫額
				,columnRslt_xpns_purc_rtn_gr_amt        // 経費購買返品入庫額
				,columnRslt_accpt_dfct_gr_amt           // 検収不良入庫額
				,columnRslt_mfg_amt                     // 製造額
				,columnRslt_bymfg_amt                   // 副産品製造額
				,columnRslt_ffr_prov_gr_amt             // 無償支給入庫額
				,columnRslt_onr_prov_gr_amt             // 有償支給入庫額
				,columnRslt_ffr_prov_rtn_gr_amt         // 無償支給返品入庫額
				,columnRslt_onr_prov_rtn_gr_amt         // 有償支給返品入庫額
				,columnRslt_insp_gr_amt                 // 検査入庫額
				,columnRslt_insp_cmpl_gr_amt            // 検査完了入庫額
				,columnRslt_insp_judg_gr_amt            // 検査判定入庫額
				,columnRslt_reinsp_gr_amt               // 再検査入庫額
				,columnRslt_stk_adjst_gr_amt            // 棚卸差異増耗額
				,columnRslt_prdct_wh_gr_amt             // 倉入入庫額
				,columnRslt_prdct_wh_rtn_gr_amt         // 戻入入庫額
				,columnRslt_xfr_gr_amt                  // 移動・移送入庫額
				,columnRslt_xfr_in_amt                  // 転入額
				,columnRslt_purc_xfr_in_amt             // 仕入転入額
				,columnRslt_xfr_rtn_gr_amt              // 移動・移送返品入庫額
				,columnRslt_acxfr_gr_amt                // 他勘定振替入庫額
				,columnRslt_arr_cststk_amt              // 預り入庫額
				,columnRslt_xfr_itm_gr_amt              // 品目振替入庫額
				,columnRslt_xfr_lot_sno_gr_amt          // ロット・手配ＮＯ振替入庫額
				,columnRslt_xfr_grd_gr_amt              // 格付・良品区分振替入庫額
				,columnRslt_xfr_pack_gr_amt             // 荷姿振替入庫額
				,columnRslt_ship_in_amt                 // 着荷額
				,columnRslt_ex_ship_in_amt              // 輸出着荷額
				,columnRslt_ship_rtn_gr_amt             // 出荷返品入庫額
				,columnRslt_sls_rtn_gr_amt              // 売上返品入庫額
				,columnRslt_gi_total_amt                // 出庫計
				,columnRslt_arr_rtn_amt                 // 入荷返品額
				,columnRslt_purc_gi_amt                 // 仕入出庫額
				,columnRslt_onr_rcv_gi_amt              // 有償受給出庫額
				,columnRslt_purc_rtn_gi_amt             // 仕入返品出庫額
				,columnRslt_onr_rcv_ret_gi_amt          // 有償受給返品出庫額
				,columnRslt_xpns_purc_gi_amt            // 経費購買出庫額
				,columnRslt_xpns_purc_rtn_gi_amt        // 経費購買返品出庫額
				,columnRslt_accpt_dfct_gi_amt           // 検収不良出庫額
				,columnRslt_inpt_amt                    // 投入額
				,columnRslt_loss_amt                    // ロス額
				,columnRslt_ffr_prov_gi_amt             // 無償支給出庫額
				,columnRslt_onr_prov_gi_amt             // 有償支給出庫額
				,columnRslt_ffr_prov_rtn_gi_amt         // 無償支給返品出庫額
				,columnRslt_onr_prov_rtn_gi_amt         // 有償支給返品出庫額
				,columnRslt_insp_gi_amt                 // 検査出庫額
				,columnRslt_insp_cmpl_gi_amt            // 検査完了出庫額
				,columnRslt_insp_judg_gi_amt            // 検査判定出庫額
				,columnRslt_reinsp_gi_amt               // 再検査出庫額
				,columnRslt_insp_smpl_gi_amt            // 検査抜取額
				,columnRslt_stk_adjst_gi_amt            // 棚卸差異減耗額
				,columnRslt_prdct_wh_gi_amt             // 倉入出庫額
				,columnRslt_prdct_wh_rtn_gi_amt         // 戻入出庫額
				,columnRslt_xfr_gi_amt                  // 移動・移送出庫額
				,columnRslt_xfr_out_amt                 // 転出額
				,columnRslt_purc_xfr_out_amt            // 仕入転出額
				,columnRslt_xfr_rtn_gi_amt              // 移動・移送返品出庫額
				,columnRslt_acxfr_gi_amt                // 他勘定振替出庫額
				,columnRslt_scrp_amt                    // 廃棄額
				,columnRslt_xfr_itm_gi_amt              // 品目振替出庫額
				,columnRslt_xfr_lot_sno_gi_amt          // ロット・手配ＮＯ振替出庫額
				,columnRslt_xfr_grd_gi_amt              // 格付・良品区分振替出庫額
				,columnRslt_xfr_pack_gi_amt             // 荷姿振替出庫額
				,columnRslt_ship_out_amt                // 出荷額
				,columnRslt_ex_ship_out_amt             // 輸出出荷額
				,columnRslt_ship_rtn_gi_amt             // 出荷返品出庫額
				,columnRslt_sls_rtn_gi_amt              // 売上返品出庫額
				,columnRslt_sls_amt                     // 売上額
				,columnRslt_end_stk_amt                 // 月末在庫額
			};

		return amtIL;
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		// 実棚入力可能のみ
		setValueEx(Cnd_only_enable_flg, true);

		// 集計項目
		setAggrChkBoxVal(true);
		// 荷姿単位制御
		setValueEx(Cnd_pack_unit_flg, true);

		// 表示単位
		Cnd_disp_unit_Group.setValue(Cnd_disp_unit_PACK_UNIT.getActionCommand());

		// 締月度、締日（会社マスタの会計締日）
		MCDate clYMto = nvl(getStkClYm(this), getToday());
		MCDate clYMfr = clYMto.addMonth(_clMlyTerm.intValue());
		setValueEx(Cnd_mly_io_cl_ym_fr, clYMfr);
		setValueEx(Cnd_mly_io_cl_ym_to, clYMto);
		setValueEx(Cnd_mly_io_cl_day, getCo().ac_cl_day());

		// 一覧ヘッダ（入庫計、出庫計、月初在庫、月末在庫）の色設定
		columnRslt_gr_total_qty.setHeaderBackground(_inTotalColor);
		columnRslt_gr_total_amt.setHeaderBackground(_inTotalColor);
		columnRslt_gi_total_qty.setHeaderBackground(_soTotalColor);
		columnRslt_gi_total_amt.setHeaderBackground(_soTotalColor);
		columnRslt_ini_stk_qty.setHeaderBackground(_iniStkColor);
		columnRslt_ini_stk_amt.setHeaderBackground(_iniStkColor);
		columnRslt_end_stk_qty.setHeaderBackground(_endStkColor);
		columnRslt_end_stk_amt.setHeaderBackground(_endStkColor);

		// 一覧金額項目の非表示
		columnRslt_base_cur_cd.setMode(MCMode.INVISIBLE);
		columnRslt_base_cur_nm.setMode(MCMode.INVISIBLE);
		columnRslt_std_unit_cost.setMode(MCMode.INVISIBLE);
		for (MCColumnConfig amtI : getAmtItemL()) {
			amtI.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 集計タブ項目の全チェックオン／オフ処理
	 * @param bVal オン／オフ指定
	 */
	protected void setAggrChkBoxVal(boolean bVal) {
		setValueEx(Cnd_wg_flg, bVal);
		setValueEx(Cnd_dpt_flg, bVal);
		setValueEx(Cnd_lot_no_flg, bVal);
		setValueEx(Cnd_sublot_no_flg, bVal);
		setValueEx(Cnd_loc_flg, bVal);
		setValueEx(Cnd_str_ln_flg, bVal);
		setValueEx(Cnd_site_flg, bVal);
		setValueEx(Cnd_lg_grp_flg, bVal);
		setValueEx(Cnd_alloc_grp_flg, bVal);
		setValueEx(Cnd_loc_grp_flg, bVal);
		setValueEx(Cnd_gd_flg, bVal);
		setValueEx(Cnd_sno1_flg, bVal);
		setValueEx(Cnd_sno2_flg, bVal);
		setValueEx(Cnd_sno3_flg, bVal);
		setValueEx(Cnd_sno4_flg, bVal);
		setValueEx(Cnd_fix_no_typ_flg, bVal);
		setValueEx(Cnd_fix_no_flg, bVal);
		setValueEx(Cnd_stk_arrv_bp_flg, bVal);
	}

	protected MCNumber getCloseDay(MCDate clYM) {
		if (clYM == null) {
			return null;
		}

		MCDate clDay = getYmEndDt(clYM, getCo().ac_cl_day(), getCo().ac_cl_mon_base());
		if (isNull(clDay)) {
			clDay = getToday();
		}

		return new MCNumber(clDay.getDay());
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);

		if (!Cnd_loc_flg.getValue()) {
			setValueEx(Cnd_str_ln_flg, false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);

		if (Cnd_str_ln_flg.getValue()) {
			setValueEx(Cnd_loc_flg, true);
		}
	}

	@Override
	public void doCnd_fix_no_typ_flg_NC(MCEventInfo info) {
		super.doCnd_fix_no_typ_flg_NC(info);

		if (!Cnd_fix_no_typ_flg.getValue()) {
			setValueEx(Cnd_fix_no_flg, false);
		}
	}

	@Override
	public void doCnd_fix_no_flg_NC(MCEventInfo info) {
		super.doCnd_fix_no_flg_NC(info);

		if (Cnd_fix_no_flg.getValue()) {
			setValueEx(Cnd_fix_no_typ_flg, true);
		}
	}
	
	@Override
	public void doCnd_disp_unit_NC(MCEventInfo info) {
		super.doCnd_disp_unit_NC(info);

		if (Cnd_disp_unit_PACK_UNIT.isSelected()) {
			setValueEx(Cnd_pack_unit_flg, true);
		}
		else {
			setValueEx(Cnd_pack_unit_flg, false);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		setBtnMode();
	}

	// -------------------------------------------- CellConfig Start --------------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	/** 締月度の期間. */
	protected MCNumber _clMlyTerm = getPgmSettingNumberNE(this, new MCNumber(-2), "init.cl_mly_term");

	// 入庫計
	protected Color _inTotalColor = getPgmSettingColorNE(this, new Color(176, 196, 222), "color.gr_total");
	// 出庫計
	protected Color _soTotalColor = getPgmSettingColorNE(this, new Color(255, 192, 203), "color.gi_total");
	// 月初在庫
	protected Color _iniStkColor = getPgmSettingColorNE(this, new Color(153,204,255), "color.ini_stk");
	// 月末在庫
	protected Color _endStkColor = getPgmSettingColorNE(this, new Color(102,153,255), "color.end_stk");

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			// 入庫計
			if (columnRslt_gr_total_qty == column || columnRslt_gr_total_amt == column) {
				return _inTotalColor;
			}

			// 出庫計
			if (columnRslt_gi_total_qty == column || columnRslt_gi_total_amt == column) {
				return _soTotalColor;
			}

			// 月初在庫
			if (columnRslt_ini_stk_qty == column || columnRslt_ini_stk_amt == column) {
				return _iniStkColor;
			}

			// 月末在庫
			if (columnRslt_end_stk_qty == column || columnRslt_end_stk_amt == column) {
				return _endStkColor;
			}

			return super.getPriorBG(index, column, table, mode);
		}

	}
	// -------------------------------------------- CellConfig End ----------------------------------------------

}