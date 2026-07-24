package mcframe.clientMSBE.MSBEP0020;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5170.*;

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
 * 画面"MSBEP_MlyIoStkSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_MlyIoStkSrch_MC extends MSBEP_MlyIoStkSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_MlyIoStkSrch_MC() {
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
	public MSBEP_MlyIoStkSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0020_Srch01Caller<P extends MSBEP_MlyIoStkSrch, B extends MS_MSBEL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0020_Srch01Caller(P p, B b) {
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
		changeDispWg();         // ワーキンググループ
		changeDispAsstTyp();    // 資産区分
		changeDispStkIdTyp();   // 在庫識別区分
		changeDispStkBp();      // 在庫取引先
		changeDispStkArrvBp();  // 在庫着荷先
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

	protected void changeDispAsstTyp() {
		if (getCndR().asst_typ_flg()) {
			columnRslt_asst_typ.setMode(getDefaultMode(columnRslt_asst_typ));
			columnRslt_asst_typ_nm.setMode(getDefaultMode(columnRslt_asst_typ_nm));
		}
		else {
			columnRslt_asst_typ.setMode(MCMode.INVISIBLE);
			columnRslt_asst_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStkIdTyp() {
		if (getCndR().stk_id_typ_flg()) {
			columnRslt_stk_id_typ.setMode(getDefaultMode(columnRslt_stk_id_typ));
			columnRslt_stk_id_typ_nm.setMode(getDefaultMode(columnRslt_stk_id_typ_nm));
		}
		else {
			columnRslt_stk_id_typ.setMode(MCMode.INVISIBLE);
			columnRslt_stk_id_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStkBp() {
		if (getCndR().stk_bp_flg()) {
			columnRslt_stk_bp_cd.setMode(getDefaultMode(columnRslt_stk_bp_cd));
			columnRslt_stk_bp_nm.setMode(getDefaultMode(columnRslt_stk_bp_nm));
		}
		else {
			columnRslt_stk_bp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_stk_bp_nm.setMode(MCMode.INVISIBLE);
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

	/**
	 * 「表示単位」により、明細項目の表示を制御する。
	 */
	protected void changeQtyAmtItemsDisp() {
		if (Cnd_disp_unit_AMT.isSelected()) {
			// 数量項目の非表示
			columnRslt_base_unit_cd.setMode(MCMode.INVISIBLE);
			columnRslt_base_unit_nm.setMode(MCMode.INVISIBLE);
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
			columnRslt_base_unit_cd.setMode(getDefaultMode(columnRslt_base_unit_cd));
			columnRslt_base_unit_nm.setMode(getDefaultMode(columnRslt_base_unit_nm));
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
		callMS_MSBEL0020_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL0020_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0030(MCEventInfo info) {
		execOpenMSBEP0030(RsltTable.getSelectedMCRow());
	}

	protected void execOpenMSBEP0030(RsltR r) {
		if (r == null) {
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0030");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0030CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0030.CndR crtOpenMSBEP0030CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		// mcframe.clientMSBE.MSBEP0030.MSBEP_MlyIoStkDtlSrch p = (mcframe.clientMSBE.MSBEP0030.MSBEP_MlyIoStkDtlSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0030.CndR to = mcframe.clientMSBE.MSBEP0030.CndR.create();

		to.mly_io_cl_ym_fr(getCndR().mly_io_cl_ym_fr());
		to.mly_io_cl_ym_to(getCndR().mly_io_cl_ym_to());
		to.wg_cd(fr.wg_cd());
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.itm_nm(fr.itm_nm());
		to.asst_typ(fr.asst_typ());
		to.stk_id_typ(fr.stk_id_typ());
		to.stk_bp_cd(fr.stk_bp_cd());
		to.stk_arrv_bp_cd(fr.stk_arrv_bp_cd());

		return to;
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == RsltTable) {
			execOpenMSBEP0030(RsltTable.getSelectedMCRow());
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		// 標準単価
		Rslt_std_unit_cost_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_dec_place);

		// 数量集計部品
		for (MAUBP_Qty_D ppanel : getQtyPPanelL()) {
			ppanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
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
				 Rslt_ini_stk_qty_p_PPanel                 // 月初在庫
				,Rslt_gr_total_qty_p_PPanel                // 入庫計
				,Rslt_purc_bf_accpt_qty_p_PPanel           // 検収前入荷
				,Rslt_gr_purc_qty_p_PPanel                 // 購入入庫
				,Rslt_accpt_dfct_qty_p_PPanel              // 検収不良入庫
				,Rslt_gr_prod_qty_p_PPanel                 // 製造入庫
				,Rslt_gr_xfr_qty_p_PPanel                  // 移動・移送入庫
				,Rslt_gr_rcv_qty_p_PPanel                  // 受給入庫
				,Rslt_gr_stk_xfr_qty_p_PPanel              // 在庫振替入庫
				,Rslt_gr_ac_xfr_qty_p_PPanel               // 他勘定振替入庫
				,Rslt_gi_total_qty_p_PPanel                // 出庫計
				,Rslt_gi_input_qty_p_PPanel                // 投入出庫
				,Rslt_gi_insp_qty_p_PPanel                 // 検査出庫
				,Rslt_gi_xfr_qty_p_PPanel                  // 移動・移送出庫
				,Rslt_rcv_ret_qty_p_PPanel                 // 受給戻し
				,Rslt_gi_stk_xfr_qty_p_PPanel              // 在庫振替出庫
				,Rslt_gi_ac_xfr_qty_p_PPanel               // 他勘定振替出庫
				,Rslt_stktk_minus_qty_p_PPanel             // 棚卸減
				,Rslt_sls_qty_p_PPanel                     // 売上
				,Rslt_end_stk_qty_p_PPanel                 // 月末在庫
			};

		return qpL;
	}

	/**
	 * 一覧集計金額パネル配列
	 * @return
	 */
	protected MAUBP_Amt_D[] getAmtPPanelL() {
		MAUBP_Amt_D[] apL = {
				 Rslt_ini_stk_amt_p_PPanel                 // 月初在庫
				,Rslt_gr_total_amt_p_PPanel                // 入庫計
				,Rslt_purc_bf_accpt_amt_p_PPanel           // 検収前入荷
				,Rslt_gr_purc_amt_p_PPanel                 // 購入入庫
				,Rslt_accpt_dfct_amt_p_PPanel              // 検収不良入庫
				,Rslt_gr_prod_amt_p_PPanel                 // 製造入庫
				,Rslt_gr_xfr_amt_p_PPanel                  // 移動・移送入庫
				,Rslt_gr_rcv_amt_p_PPanel                  // 受給入庫
				,Rslt_gr_stk_xfr_amt_p_PPanel              // 在庫振替入庫
				,Rslt_gr_ac_xfr_amt_p_PPanel               // 他勘定振替入庫
				,Rslt_gi_total_amt_p_PPanel                // 出庫計
				,Rslt_gi_input_amt_p_PPanel                // 投入出庫
				,Rslt_gi_insp_amt_p_PPanel                 // 検査出庫
				,Rslt_gi_xfr_amt_p_PPanel                  // 移動・移送出庫
				,Rslt_rcv_ret_amt_p_PPanel                 // 受給戻し
				,Rslt_gi_stk_xfr_amt_p_PPanel              // 在庫振替出庫
				,Rslt_gi_ac_xfr_amt_p_PPanel               // 他勘定振替出庫
				,Rslt_stktk_minus_amt_p_PPanel             // 棚卸減
				,Rslt_sls_amt_p_PPanel                     // 売上
				,Rslt_end_stk_amt_p_PPanel                 // 月末在庫
			};

		return apL;
	}

	/**
	 * 一覧集計数量項目配列
	 * @return
	 */
	protected MCColumnConfig[] getQtyItemL() {
		MCColumnConfig[] qtyIL = {
				 columnRslt_ini_stk_qty                 // 月初在庫
				,columnRslt_gr_total_qty                // 入庫計
				,columnRslt_purc_bf_accpt_qty           // 検収前入荷
				,columnRslt_gr_purc_qty                 // 購入入庫
				,columnRslt_accpt_dfct_qty              // 検収不良入庫
				,columnRslt_gr_prod_qty                 // 製造入庫
				,columnRslt_gr_xfr_qty                  // 移動・移送入庫
				,columnRslt_gr_rcv_qty                  // 受給入庫
				,columnRslt_gr_stk_xfr_qty              // 在庫振替入庫
				,columnRslt_gr_ac_xfr_qty               // 他勘定振替入庫
				,columnRslt_gi_total_qty                // 出庫計
				,columnRslt_gi_input_qty                // 投入出庫
				,columnRslt_gi_insp_qty                 // 検査出庫
				,columnRslt_gi_xfr_qty                  // 移動・移送出庫
				,columnRslt_rcv_ret_qty                 // 受給戻し
				,columnRslt_gi_stk_xfr_qty              // 在庫振替出庫
				,columnRslt_gi_ac_xfr_qty               // 他勘定振替出庫
				,columnRslt_stktk_minus_qty             // 棚卸減
				,columnRslt_sls_qty                     // 売上
				,columnRslt_end_stk_qty                 // 月末在庫
			};

		return qtyIL;
	}

	/**
	 * 一覧集計金額項目配列
	 * @return
	 */
	protected MCColumnConfig[] getAmtItemL() {
		MCColumnConfig[] amtIL = {
				 columnRslt_ini_stk_amt                 // 月初在庫
				,columnRslt_gr_total_amt                // 入庫計
				,columnRslt_purc_bf_accpt_amt           // 検収前入荷
				,columnRslt_gr_purc_amt                 // 購入入庫
				,columnRslt_accpt_dfct_amt              // 検収不良入庫
				,columnRslt_gr_prod_amt                 // 製造入庫
				,columnRslt_gr_xfr_amt                  // 移動・移送入庫
				,columnRslt_gr_rcv_amt                  // 受給入庫
				,columnRslt_gr_stk_xfr_amt              // 在庫振替入庫
				,columnRslt_gr_ac_xfr_amt               // 他勘定振替入庫
				,columnRslt_gi_total_amt                // 出庫計
				,columnRslt_gi_input_amt                // 投入出庫
				,columnRslt_gi_insp_amt                 // 検査出庫
				,columnRslt_gi_xfr_amt                  // 移動・移送出庫
				,columnRslt_rcv_ret_amt                 // 受給戻し
				,columnRslt_gi_stk_xfr_amt              // 在庫振替出庫
				,columnRslt_gi_ac_xfr_amt               // 他勘定振替出庫
				,columnRslt_stktk_minus_amt             // 棚卸減
				,columnRslt_sls_amt                     // 売上
				,columnRslt_end_stk_amt                 // 月末在庫
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

		// 表示単位
		Cnd_disp_unit_Group.setValue(Cnd_disp_unit_BASE_UNIT.getActionCommand());

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
		setValueEx(Cnd_asst_typ_flg, bVal);
		setValueEx(Cnd_stk_id_typ_flg, bVal);
		setValueEx(Cnd_stk_bp_flg, bVal);
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
	public void doCnd_asst_typ_flg_NC(MCEventInfo info) {
		super.doCnd_asst_typ_flg_NC(info);

		if (!Cnd_asst_typ_flg.getValue()) {
			setValueEx(Cnd_stk_id_typ_flg, false);
			setValueEx(Cnd_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd_stk_id_typ_flg_NC(MCEventInfo info) {
		super.doCnd_stk_id_typ_flg_NC(info);

		if (Cnd_stk_id_typ_flg.getValue()) {
			setValueEx(Cnd_asst_typ_flg, true);
		}
	}

	@Override
	public void doCnd_stk_bp_flg_NC(MCEventInfo info) {
		super.doCnd_stk_bp_flg_NC(info);

		if (Cnd_stk_bp_flg.getValue()) {
			setValueEx(Cnd_asst_typ_flg, true);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		setBtnMode();
	}

	/**
	 * 月次受払詳細ボタンの押下可能を制御する。
	 */
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		if (isNull(r)) {
			Btn_open_MSBEP0030.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBEP0030.setMode(MCMode.ENABLE);
		}
	}

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

}