package mcframe.clientMSBE.MSBEP0040;

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

import mcframe.clientFSBA.FSBAP0020.*;
import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0350.*;
import mcframe.clientMAUB.MAUBP0360.*;
import mcframe.clientMAUB.MAUBP0370.*;
import mcframe.clientMAUB.MAUBP0380.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
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
import mcframe.clientFSBA.FSBAP0000.IfSyncTableBase;
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_AllocSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_AllocSrch_MC extends MSBEP_AllocSrch_MC_A implements IfSyncTableBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected CndR _CndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AllocSrch_MC() {
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
	public MSBEP_AllocSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0040_Srch01Caller<P extends MSBEP_AllocSrch, B extends MS_MSBEL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkChkBoxStatus(msgList);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_CndR = getCndR().clone();
		}

		@Override
		protected void setMode() {
			super.setMode();
			RsltGrTable.selectLeftmostColumn(0);
			RsltGiTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			FoldPanel.focusFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
			clearHdr();
			clearRslt();
		}
	}

	/**
	 * [MS_MSBEL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0040_Srch02Caller<P extends MSBEP_AllocSrch, B extends MS_MSBEL0040_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0040_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkChkBoxStatus(msgList);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_CndR = getCndR().clone();
		}

		@Override
		protected void setMode() {
			super.setMode();
			RsltGrTable.selectLeftmostColumn(0);
			RsltGiTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			FoldPanel.focusFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
			clearHdr();
			clearRslt();
		}
	}

	protected void checkChkBoxStatus(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(GrStsPanel));
		msgList.addAll(checkAtLeastOne(GiStsPanel));
	}

	/**
	 * ヘッダをクリアする。
	 */
	protected void clearHdr() {
		getHdrQtyR().clear();
		getHdrContFctrR().clear();
	}

	/**
	 * 明細をクリアする。
	 */
	protected void clearRslt() {
		getRsltGrL().clear();
		getRsltGiL().clear();
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_ALLOC.isSelected()) {
			callMS_MSBEL0040_Srch02();
		}
		else {
			callMS_MSBEL0040_Srch01();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0090_GR]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0090_GR(MCEventInfo info) {
		int index = RsltGrTable.getMCSelectedRow();
		if (index >= 0) {
			RsltGrR fr = getRsltGrL().get(index);
			doBtn_open_MSBEP0090(fr);
		}
		else {
			dialog(msgNoSelectedRow());
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0090_GI]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0090_GI(MCEventInfo info) {
		int index = RsltGiTable.getMCSelectedRow();
		if (index >= 0) {
			RsltGrR fr = getRsltGiL().get(index);
			doBtn_open_MSBEP0090(fr);
		}
		else {
			dialog(msgNoSelectedRow());
		}
	}

	/**
	 * 遷移先[MSBEP0090]の検索条件Rowコンテナを返します。
	 */
	protected void doBtn_open_MSBEP0090(RsltGrR fr) {

		mcframe.clientMSBE.MSBEP0090.CndR to = mcframe.clientMSBE.MSBEP0090.CndR.create();
		to.io_schd_typ(fr.io_schd_typ());
		to.io_schd_sts_typ(fr.io_schd_sts_typ());
		to.io_schd_no(fr.io_schd_no());
		if (!Cnd_ope_ALLOC.isSelected()) {
			if (Cnd_ope_ACCRUAL.isSelected()) {
				to.schd_dt_fr(fr.dt());
				to.schd_dt_to(fr.dt());
			}
			else if (Cnd_ope_ACCPT.isSelected()) {
				to.accpt_schd_dt_fr(fr.dt());
				to.accpt_schd_dt_to(fr.dt());
			}
			else if (Cnd_ope_AVL.isSelected()) {
				to.avl_schd_dt_fr(fr.dt());
				to.avl_schd_dt_to(fr.dt());
			}
			to.itm_cd(_CndR.itm_cd());
			to.itm_sub1(_CndR.itm_sub1());
			to.itm_sub2(_CndR.itm_sub2());
			to.itm_sub3(_CndR.itm_sub3());
			to.loc_cd(fr.loc_cd());
			to.str_ln_cd(fr.str_ln_cd());
			to.sno1(fr.sno1());
			to.sno2(fr.sno2());
			to.sno3(fr.sno3());
			to.sno4(fr.sno4());
			to.wrk_no(fr.wrk_no());
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0090");
		aso.runValueInit();
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0080_GR]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0080_GR(MCEventInfo info) {
		int index = RsltGrTable.getMCSelectedRow();
		if (index >= 0) {
			RsltGrR fr = getRsltGrL().get(index);
			doBtn_open_MSBEP0080(fr);
		}
		else {
			dialog(msgNoSelectedRow());
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0080_GI]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0080_GI(MCEventInfo info) {
		int index = RsltGiTable.getMCSelectedRow();
		if (index >= 0) {
			RsltGrR fr = getRsltGiL().get(index);
			doBtn_open_MSBEP0080(fr);
		}
		else {
			dialog(msgNoSelectedRow());
		}
	}

	/**
	 * 遷移先[MSBEP0080]の検索条件Rowコンテナを返します。
	 */
	protected void doBtn_open_MSBEP0080(RsltGrR fr) {

		mcframe.clientMSBE.MSBEP0080.CndR to = mcframe.clientMSBE.MSBEP0080.CndR.create();
		to.ac_dt_fr(getYmStDt(fr.dt(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
		to.ac_dt_to(getYmEndDt(fr.dt(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
		to.act_dt_fr(fr.dt());
		to.act_dt_to(fr.dt());
		to.itm_cd(_CndR.itm_cd());
		to.itm_sub1(_CndR.itm_sub1());
		to.itm_sub2(_CndR.itm_sub2());
		to.itm_sub3(_CndR.itm_sub3());
		to.loc_cd(fr.loc_cd());
		to.str_ln_cd(fr.str_ln_cd());
		to.sno1(fr.sno1());
		to.sno2(fr.sno2());
		to.sno3(fr.sno3());
		to.sno4(fr.sno4());
		to.wrk_no(fr.wrk_no());
		to.trd_cd(fr.trd_cd());
		to.trd_ptn_typ(fr.trd_ptn_typ());
		to.trn_typ(fr.trn_typ());
		to.io_act_typ(fr.io_act_typ());

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0080");
		aso.runValueInit();
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == RsltGrTable) {
			int index = RsltGrTable.getMCSelectedRow();
			if (index >= 0) {
				RsltGrR fr = getRsltGrL().get(index);
				if (isSchd(fr.schd_stk_typ()) && Btn_open_MSBEP0090_GR.getMode() == MCMode.ENABLE) {
					doBtn_open_MSBEP0090_GR(info);
				}
				else if (isAct(fr.schd_stk_typ()) && Btn_open_MSBEP0080_GR.getMode() == MCMode.ENABLE) {
					doBtn_open_MSBEP0080_GR(info);
				}
			}
		}
		else if (compo == RsltGiTable) {
			int index = RsltGiTable.getMCSelectedRow();
			if (index >= 0) {
				RsltGrR fr = getRsltGiL().get(index);
				if (isSchd(fr.schd_stk_typ()) && Btn_open_MSBEP0090_GI.getMode() == MCMode.ENABLE) {
					doBtn_open_MSBEP0090_GI(info);
				}
				else if (isAct(fr.schd_stk_typ()) && Btn_open_MSBEP0080_GI.getMode() == MCMode.ENABLE) {
					doBtn_open_MSBEP0080_GI(info);
				}
			}
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_gr_prcd, true);
		setValueEx(Cnd_gr_sts_opn_grp, true);
		setValueEx(Cnd_gr_sts_ordsav_grp, true);
		setValueEx(Cnd_gr_sts_fix_grp, true);
		setValueEx(Cnd_gr_sts_schd_grp, true);
		setValueEx(Cnd_gr_sts_ord_grp, true);
		setValueEx(Cnd_gr_act, true);
		setValueEx(Cnd_gi_prcd, true);
		setValueEx(Cnd_gi_sts_opn_grp, true);
		setValueEx(Cnd_gi_sts_ordsav_grp, true);
		setValueEx(Cnd_gi_sts_fix_grp, true);
		setValueEx(Cnd_gi_sts_schd_grp, true);
		setValueEx(Cnd_gi_sts_ord_grp, true);
		setValueEx(Cnd_gi_act, true);

		setStatus();
		setMode();
		setOpenBtnModeGr();
		setOpenBtnModeGi();

		//期間ＦＲＯＭ～ＴＯ(運用日付～運用日付＋01ヶ月－01日)
		setValueEx(Cnd_dt_fr, getToday());
		setValueEx(Cnd_dt_to, getToday().addMonth(1).addDay(-1));
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);

		//数量項目
		HdrQty_stk_base_qty_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_stk_base_qty2_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_stk_base_qty3_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_stk_base_qty4_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_gr_base_qty_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_gr_base_qty2_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_gr_base_qty3_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_gr_base_qty4_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_gi_base_qty_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_gi_base_qty2_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_gi_base_qty3_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);
		HdrQty_gi_base_qty4_p_PPanel.setRelateBeans(HdrQty_base_unit_cd, HdrQty_base_unit_dec_place);

		HdrContFctr_stk_cont_qty_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_stk_qty, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_stk_cont_qty2_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_stk_qty2, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_stk_cont_qty3_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_stk_qty3, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_stk_cont_qty4_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_stk_qty4, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_gr_cont_qty_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_gr_qty, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_gr_cont_qty2_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_gr_qty2, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_gr_cont_qty3_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_gr_qty3, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_gr_cont_qty4_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_gr_qty4, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_gi_cont_qty_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_gi_qty, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_gi_cont_qty2_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_gi_qty2, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_gi_cont_qty3_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_gi_qty3, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);
		HdrContFctr_gi_cont_qty4_p_PPanel.setRelateBeans(HdrContFctr_cont_fctr_flg, HdrQty_gi_qty4, HdrContFctr_std_cont_fctr,
				HdrContFctr_act_cont_fctr, HdrContFctr_cont_fctr_dec_place, HdrContFctr_cont_fctr_rnd_typ);

		RsltGr_pack_unit_qty_p_PPanel.setRelateBeans(columnRsltGr_pack_unit_cd, columnRsltGr_pack_unit_dec_place);
		RsltGr_base_unit_qty_p_PPanel.setRelateBeans(columnRsltGr_base_unit_cd, columnRsltGr_base_unit_dec_place);
		RsltGr_qty_p_PPanel.setRelateBeans(columnRsltGr_base_unit_cd, columnRsltGr_base_unit_dec_place);
		RsltGr_alloc_qty_p_PPanel.setRelateBeans(columnRsltGr_base_unit_cd, columnRsltGr_base_unit_dec_place);
		RsltGr_wait_qty_p_PPanel.setRelateBeans(columnRsltGr_base_unit_cd, columnRsltGr_base_unit_dec_place);
		RsltGr_lot_alloc_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_lot_wait_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_not_lot_alloc_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_not_lot_wait_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_not_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_lg_lot_alloc_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_lg_lot_wait_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_lg_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_lg_not_lot_alloc_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_lg_not_lot_wait_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_lg_not_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_grs_alloc_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_grs_wait_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);
		RsltGr_grs_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGr_alloc_unit_cd, columnRsltGr_alloc_unit_dec_place);

		RsltGr_act_cont_qty_p_PPanel.setRelateBeans(columnRsltGr_cont_fctr_flg, columnRsltGr_base_unit_qty, columnRsltGr_std_cont_fctr,
				columnRsltGr_act_cont_fctr, columnRsltGr_cont_fctr_dec_place, columnRsltGr_cont_fctr_rnd_typ);
		RsltGr_act_cont_alloc_qty_p_PPanel.setRelateBeans(columnRsltGr_cont_fctr_flg, columnRsltGr_base_unit_qty, columnRsltGr_std_cont_fctr,
				columnRsltGr_act_cont_fctr, columnRsltGr_cont_fctr_dec_place, columnRsltGr_cont_fctr_rnd_typ);
		RsltGr_act_cont_wait_qty_p_PPanel.setRelateBeans(columnRsltGr_cont_fctr_flg, columnRsltGr_base_unit_qty, columnRsltGr_std_cont_fctr,
				columnRsltGr_act_cont_fctr, columnRsltGr_cont_fctr_dec_place, columnRsltGr_cont_fctr_rnd_typ);
		RsltGr_act_cont_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGr_cont_fctr_flg, columnRsltGr_base_unit_qty, columnRsltGr_std_cont_fctr,
				columnRsltGr_act_cont_fctr, columnRsltGr_cont_fctr_dec_place, columnRsltGr_cont_fctr_rnd_typ);
		RsltGr_std_cont_qty_p_PPanel.setRelateBeans(columnRsltGr_cont_fctr_flg, columnRsltGr_base_unit_qty, columnRsltGr_std_cont_fctr,
				columnRsltGr_act_cont_fctr, columnRsltGr_cont_fctr_dec_place, columnRsltGr_cont_fctr_rnd_typ);
		RsltGr_std_cont_alloc_qty_p_PPanel.setRelateBeans(columnRsltGr_cont_fctr_flg, columnRsltGr_base_unit_qty, columnRsltGr_std_cont_fctr,
				columnRsltGr_act_cont_fctr, columnRsltGr_cont_fctr_dec_place, columnRsltGr_cont_fctr_rnd_typ);
		RsltGr_std_cont_wait_qty_p_PPanel.setRelateBeans(columnRsltGr_cont_fctr_flg, columnRsltGr_base_unit_qty, columnRsltGr_std_cont_fctr,
				columnRsltGr_act_cont_fctr, columnRsltGr_cont_fctr_dec_place, columnRsltGr_cont_fctr_rnd_typ);
		RsltGr_std_cont_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGr_cont_fctr_flg, columnRsltGr_base_unit_qty, columnRsltGr_std_cont_fctr,
				columnRsltGr_act_cont_fctr, columnRsltGr_cont_fctr_dec_place, columnRsltGr_cont_fctr_rnd_typ);

		RsltGi_pack_unit_qty_p_PPanel.setRelateBeans(columnRsltGi_pack_unit_cd, columnRsltGi_pack_unit_dec_place);
		RsltGi_base_unit_qty_p_PPanel.setRelateBeans(columnRsltGi_base_unit_cd, columnRsltGi_base_unit_dec_place);
		RsltGi_qty_p_PPanel.setRelateBeans(columnRsltGi_base_unit_cd, columnRsltGi_base_unit_dec_place);
		RsltGi_alloc_qty_p_PPanel.setRelateBeans(columnRsltGi_base_unit_cd, columnRsltGi_base_unit_dec_place);
		RsltGi_wait_qty_p_PPanel.setRelateBeans(columnRsltGi_base_unit_cd, columnRsltGi_base_unit_dec_place);
		RsltGi_lot_alloc_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_lot_wait_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_not_lot_alloc_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_not_lot_wait_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_not_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_lg_lot_alloc_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_lg_lot_wait_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_lg_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_lg_not_lot_alloc_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_lg_not_lot_wait_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_lg_not_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_grs_alloc_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_grs_wait_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);
		RsltGi_grs_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGi_alloc_unit_cd, columnRsltGi_alloc_unit_dec_place);

		RsltGi_act_cont_qty_p_PPanel.setRelateBeans(columnRsltGi_cont_fctr_flg, columnRsltGi_base_unit_qty, columnRsltGi_std_cont_fctr,
				columnRsltGi_act_cont_fctr, columnRsltGi_cont_fctr_dec_place, columnRsltGi_cont_fctr_rnd_typ);
		RsltGi_act_cont_alloc_qty_p_PPanel.setRelateBeans(columnRsltGi_cont_fctr_flg, columnRsltGi_base_unit_qty, columnRsltGi_std_cont_fctr,
				columnRsltGi_act_cont_fctr, columnRsltGi_cont_fctr_dec_place, columnRsltGi_cont_fctr_rnd_typ);
		RsltGi_act_cont_wait_qty_p_PPanel.setRelateBeans(columnRsltGi_cont_fctr_flg, columnRsltGi_base_unit_qty, columnRsltGi_std_cont_fctr,
				columnRsltGi_act_cont_fctr, columnRsltGi_cont_fctr_dec_place, columnRsltGi_cont_fctr_rnd_typ);
		RsltGi_act_cont_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGi_cont_fctr_flg, columnRsltGi_base_unit_qty, columnRsltGi_std_cont_fctr,
				columnRsltGi_act_cont_fctr, columnRsltGi_cont_fctr_dec_place, columnRsltGi_cont_fctr_rnd_typ);
		RsltGi_std_cont_qty_p_PPanel.setRelateBeans(columnRsltGi_cont_fctr_flg, columnRsltGi_base_unit_qty, columnRsltGi_std_cont_fctr,
				columnRsltGi_act_cont_fctr, columnRsltGi_cont_fctr_dec_place, columnRsltGi_cont_fctr_rnd_typ);
		RsltGi_std_cont_alloc_qty_p_PPanel.setRelateBeans(columnRsltGi_cont_fctr_flg, columnRsltGi_base_unit_qty, columnRsltGi_std_cont_fctr,
				columnRsltGi_act_cont_fctr, columnRsltGi_cont_fctr_dec_place, columnRsltGi_cont_fctr_rnd_typ);
		RsltGi_std_cont_wait_qty_p_PPanel.setRelateBeans(columnRsltGi_cont_fctr_flg, columnRsltGi_base_unit_qty, columnRsltGi_std_cont_fctr,
				columnRsltGi_act_cont_fctr, columnRsltGi_cont_fctr_dec_place, columnRsltGi_cont_fctr_rnd_typ);
		RsltGi_std_cont_alloc_avl_qty_p_PPanel.setRelateBeans(columnRsltGi_cont_fctr_flg, columnRsltGi_base_unit_qty, columnRsltGi_std_cont_fctr,
				columnRsltGi_act_cont_fctr, columnRsltGi_cont_fctr_dec_place, columnRsltGi_cont_fctr_rnd_typ);
	}

	protected boolean isSchd(String typ) {
		if (MSC_SCHD_STK_TYP.isTGT_GR_SCHD(typ) || MSC_SCHD_STK_TYP.isNOTGT_GR_SCHD(typ)
				|| MSC_SCHD_STK_TYP.isLOC_GI_SCHD(typ) || MSC_SCHD_STK_TYP.isGRS_GI_SCHD(typ)
				|| MSC_SCHD_STK_TYP.isLOC_WAIT_GI_SCHD(typ) || MSC_SCHD_STK_TYP.isGRS_WAIT_GI_SCHD(typ)
				|| MSC_SCHD_STK_TYP.isGR_SCHD(typ) || MSC_SCHD_STK_TYP.isGI_SCHD(typ)) {
			return true;
		}
		return false;
	}

	protected boolean isAct(String typ) {
		if (MSC_SCHD_STK_TYP.isGR_ACT(typ) || MSC_SCHD_STK_TYP.isGI_ACT(typ)) {
			return true;
		}
		return false;
	}

	@Override
	public void doRsltGr_NC(MCEventInfo info) {
		super.doRsltGr_NC(info);
		setOpenBtnModeGr();
	}

	protected void setOpenBtnModeGr() {
		int index = RsltGrTable.getMCSelectedRow();
		if (index >= 0) {
			RsltGrR fr = getRsltGrL().get(index);
			if (isSchd(fr.schd_stk_typ())) {
				setDefaultMode(Btn_open_MSBEP0090_GR);
				Btn_open_MSBEP0080_GR.setMode(MCMode.DISABLE);
			}
			else if (isAct(fr.schd_stk_typ())) {
				setDefaultMode(Btn_open_MSBEP0080_GR);
				Btn_open_MSBEP0090_GR.setMode(MCMode.DISABLE);
			}
			else {
				Btn_open_MSBEP0080_GR.setMode(MCMode.DISABLE);
				Btn_open_MSBEP0090_GR.setMode(MCMode.DISABLE);
			}
		}
		else {
			Btn_open_MSBEP0080_GR.setMode(MCMode.DISABLE);
			Btn_open_MSBEP0090_GR.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doRsltGi_NC(MCEventInfo info) {
		super.doRsltGr_NC(info);
		setOpenBtnModeGi();
	}

	protected void setOpenBtnModeGi() {
		int index = RsltGiTable.getMCSelectedRow();
		if (index >= 0) {
			RsltGrR fr = getRsltGiL().get(index);
			if (isSchd(fr.schd_stk_typ())) {
				setDefaultMode(Btn_open_MSBEP0090_GI);
				Btn_open_MSBEP0080_GI.setMode(MCMode.DISABLE);
			}
			else if (isAct(fr.schd_stk_typ())) {
				setDefaultMode(Btn_open_MSBEP0080_GI);
				Btn_open_MSBEP0090_GI.setMode(MCMode.DISABLE);
			}
			else {
				Btn_open_MSBEP0080_GI.setMode(MCMode.DISABLE);
				Btn_open_MSBEP0090_GI.setMode(MCMode.DISABLE);
			}
		}
		else {
			Btn_open_MSBEP0080_GI.setMode(MCMode.DISABLE);
			Btn_open_MSBEP0090_GI.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * [RsltGr]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	@Override
	public void doRsltGr_check_NC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltGrR rsltGrR = getRsltGrL().get(idx);

		if (rsltGrR.check()) {
			for (int i = 0; i < getRsltGrL().size(); i++) {
				if (i != idx) {
					getRsltGrL().get(i).check(false);
				}
			}
			for (RsltGrR r :getRsltGiL()) {
				r.check(false);
			}

			MCRowFilterList<MCRowFilter> rsltGrFL = new MCRowFilterList<MCRowFilter>();
			MCRowFilter rsltGrFR = RsltGrTable.createRowFilter();
			rsltGrFR.setCondition(RsltGrR.$lno, MCDataType.NUMBER, rsltGrR.lno(), MCRowFilter.EQUAL, MCRowFilter.AND);
			rsltGrFL.add(rsltGrFR);
			filterList(RsltGrTable, rsltGrFL, false);

			MCRowFilterList<MCRowFilter> rsltGiFL = new MCRowFilterList<MCRowFilter>();
			MCList<LnoR> list = getLnoL().subList(LnoR.$gr_lno, rsltGrR.lno()).groupBy(LnoR.$gi_lno, LnoR.$gr_lno);
			if (list.isEmpty()) {
				MCRowFilter rsltGiFR = RsltGiTable.createRowFilter();
				rsltGiFR.setCondition(RsltGrR.$lno, MCDataType.NUMBER, MCNumber.ONE.negate(), MCRowFilter.EQUAL, MCRowFilter.AND);
				rsltGiFL.add(rsltGiFR);
			}
			else {
				for (LnoR r :list) {
					MCRowFilter rsltGiFR = RsltGiTable.createRowFilter();
					rsltGiFR.setCondition(RsltGrR.$lno, MCDataType.NUMBER, r.gi_lno(), MCRowFilter.EQUAL, MCRowFilter.OR);
					rsltGiFL.add(rsltGiFR);
				}
			}
			filterList(RsltGiTable, rsltGiFL, false);
		}
		else {
			filterList(RsltGrTable, null);
			filterList(RsltGiTable, null);
		}
	}

	/**
	 * [RsltGi]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	@Override
	public void doRsltGi_check_NC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltGrR rsltGiR = getRsltGiL().get(idx);

		if (rsltGiR.check()) {
			for (RsltGrR r :getRsltGrL()) {
				r.check(false);
			}
			for (int i = 0; i < getRsltGiL().size(); i++) {
				if (i != idx) {
					getRsltGiL().get(i).check(false);
				}
			}

			MCRowFilterList<MCRowFilter> rsltGrFL = new MCRowFilterList<MCRowFilter>();
			MCList<LnoR> list = getLnoL().subList(LnoR.$gi_lno, rsltGiR.lno()).groupBy(LnoR.$gi_lno, LnoR.$gr_lno);
			if (list.isEmpty()) {
				MCRowFilter rsltGrFR = RsltGrTable.createRowFilter();
				rsltGrFR.setCondition(RsltGrR.$lno, MCDataType.NUMBER, MCNumber.ONE.negate(), MCRowFilter.EQUAL, MCRowFilter.AND);
				rsltGrFL.add(rsltGrFR);
			}
			else {
				for (LnoR r :list) {
					MCRowFilter rsltGrFR = RsltGrTable.createRowFilter();
					rsltGrFR.setCondition(RsltGrR.$lno, MCDataType.NUMBER, r.gr_lno(), MCRowFilter.EQUAL, MCRowFilter.OR);
					rsltGrFL.add(rsltGrFR);
				}
			}
			filterList(RsltGrTable, rsltGrFL, false);

			MCRowFilterList<MCRowFilter> rsltGiFL = new MCRowFilterList<MCRowFilter>();
			MCRowFilter rsltGiFR = RsltGiTable.createRowFilter();
			rsltGiFR.setCondition(RsltGrR.$lno, MCDataType.NUMBER, rsltGiR.lno(), MCRowFilter.EQUAL, MCRowFilter.AND);
			rsltGiFL.add(rsltGiFR);
			filterList(RsltGiTable, rsltGiFL, false);
		}
		else {
			filterList(RsltGrTable, null);
			filterList(RsltGiTable, null);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		setStatus();
		setMode();
		setOpenBtnModeGr();
		setOpenBtnModeGi();
		setModeCndAvlSchdDt();
		clearCndOpe();
		clearHdr();
		clearRslt();
	}

	protected void clearCndOpe() {
		if (Cnd_ope_ALLOC.isSelected()) {
			setValueEx(Cnd_dt_fr, null);
			setValueEx(Cnd_dt_to, null);
		}
		else {
			if (isNull(getCndR().dt_fr())) {
				setValueEx(Cnd_dt_fr, getToday());
			}
			if (isNull(getCndR().dt_to())) {
				setValueEx(Cnd_dt_to, getToday().addMonth(1).addDay(-1));
			}
			setValueEx(Cnd_avl_schd_dt, null);
			setValueEx(Cnd_except_alloc_wait_flg, false);
			setValueEx(Cnd_stk_id_typ, null);
			setValueEx(Cnd_pack_unit_cd, null);
			setValueEx(Cnd_pack_unit_nm, null);
			setValueEx(Cnd_lot_no, null);
			setValueEx(Cnd_sublot_no, null);
		}
	}

	@Override
	public void doCnd_tgt_NC(MCEventInfo info) {
		super.doCnd_tgt_NC(info);
		setStatus();
		setMode();
		setSts(info);
		setOpenBtnModeGr();
		setOpenBtnModeGi();
		setModeCndAvlSchdDt();
		clearCndTgt();
		clearHdr();
		clearRslt();
	}

	protected void clearCndTgt() {
		if (Cnd_tgt_LOC.isSelected()) {
			setValueEx(Cnd_alloc_grp_cd, null);
		}
	}

	protected void setStatus() {
		if (Cnd_ope_ACCRUAL.isSelected()) {
			setACCRUALStatus();
		}
		else if (Cnd_ope_ACCPT.isSelected()) {
			setACCPTStatus();
		}
		else if (Cnd_ope_AVL.isSelected()) {
			setAVLStatus();
		}
		else if (Cnd_ope_ALLOC.isSelected()) {
			if (Cnd_tgt_LOC.isSelected()) {
				setLOC_ALLOCStatus();
			}
			else if (Cnd_tgt_GRS.isSelected()) {
				setGRS_ALLOCStatus();
			}
		}
	}

	protected void setMode() {
		if (Cnd_ope_ALLOC.isSelected()) {
			setDefaultMode(Cnd_tgt_Group);
			setValueEx(Cnd_gr_prcd, false);
			setValueEx(Cnd_gr_sts_opn_grp, false);
			setValueEx(Cnd_gr_sts_ordsav_grp, false);
			setValueEx(Cnd_gr_sts_fix_grp, true);
			setValueEx(Cnd_gr_sts_schd_grp, true);
			setValueEx(Cnd_gr_sts_ord_grp, true);
			setValueEx(Cnd_gr_act, false);
			setValueEx(Cnd_gi_prcd, false);
			setValueEx(Cnd_gi_sts_opn_grp, false);
			setValueEx(Cnd_gi_sts_ordsav_grp, false);
			setValueEx(Cnd_gi_sts_fix_grp, true);
			setValueEx(Cnd_gi_sts_schd_grp, true);
			setValueEx(Cnd_gi_sts_ord_grp, true);
			setValueEx(Cnd_gi_act, false);
			setValueEx(Cnd_alloc_gi_flg, false);
			setValueEx(Cnd_quality_typ, MAC_QUALITY_TYP.GOOD.value());
			Cnd_gr_prcd.setMode(MCMode.READ_ONLY);
			Cnd_gr_sts_opn_grp.setMode(MCMode.READ_ONLY);
			Cnd_gr_sts_ordsav_grp.setMode(MCMode.READ_ONLY);
			Cnd_gr_sts_fix_grp.setMode(MCMode.READ_ONLY);
			Cnd_gr_sts_schd_grp.setMode(MCMode.READ_ONLY);
			Cnd_gr_sts_ord_grp.setMode(MCMode.READ_ONLY);
			Cnd_gr_act.setMode(MCMode.READ_ONLY);
			Cnd_gi_prcd.setMode(MCMode.READ_ONLY);
			Cnd_gi_sts_opn_grp.setMode(MCMode.READ_ONLY);
			Cnd_gi_sts_ordsav_grp.setMode(MCMode.READ_ONLY);
			Cnd_gi_sts_fix_grp.setMode(MCMode.READ_ONLY);
			Cnd_gi_sts_schd_grp.setMode(MCMode.READ_ONLY);
			Cnd_gi_sts_ord_grp.setMode(MCMode.READ_ONLY);
			Cnd_gi_act.setMode(MCMode.READ_ONLY);
			Cnd_alloc_gi_flg.setMode(MCMode.READ_ONLY);
			setTabComponentEnable(HdrTabTab, HdrQtyPanel, HdrContFctrPanel);
		}
		else {
			Cnd_tgt_Group.setMode(MCMode.READ_ONLY);
			setDefaultMode(Cnd_gr_prcd);
			setDefaultMode(Cnd_gr_sts_opn_grp);
			setDefaultMode(Cnd_gr_sts_ordsav_grp);
			setDefaultMode(Cnd_gr_sts_fix_grp);
			setDefaultMode(Cnd_gr_sts_schd_grp);
			setDefaultMode(Cnd_gr_sts_ord_grp);
			setDefaultMode(Cnd_gr_act);
			setDefaultMode(Cnd_gi_prcd);
			setDefaultMode(Cnd_gi_sts_opn_grp);
			setDefaultMode(Cnd_gi_sts_ordsav_grp);
			setDefaultMode(Cnd_gi_sts_fix_grp);
			setDefaultMode(Cnd_gi_sts_schd_grp);
			setDefaultMode(Cnd_gi_sts_ord_grp);
			setDefaultMode(Cnd_gi_act);
			setDefaultMode(Cnd_alloc_gi_flg);
			setTabComponentEnable(HdrTabTab, HdrQtyPanel);

			// 資産発生基準では在庫と引当てていない出庫予定で資産区分が異なる場合に推移がうまく表示されない
			// 例：VMIの在庫があるが投入予定は自社資産の場合など
			// これを防ぐためにＭＲＰの結果と引き当てていない出庫予定はデフォルトでは非表示とする
			if (Cnd_ope_ACCPT.isSelected()) {
				setValueEx(Cnd_gr_prcd, false);
				setValueEx(Cnd_gr_sts_opn_grp, false);
				setValueEx(Cnd_gr_sts_ordsav_grp, false);
				setValueEx(Cnd_gi_prcd, false);
				setValueEx(Cnd_gi_sts_opn_grp, false);
				setValueEx(Cnd_gi_sts_ordsav_grp, false);
				setValueEx(Cnd_alloc_gi_flg, true);
			}
			else {
				setValueEx(Cnd_gr_prcd, true);
				setValueEx(Cnd_gr_sts_opn_grp, true);
				setValueEx(Cnd_gr_sts_ordsav_grp, true);
				setValueEx(Cnd_gi_prcd, true);
				setValueEx(Cnd_gi_sts_opn_grp, true);
				setValueEx(Cnd_gi_sts_ordsav_grp, true);
				setValueEx(Cnd_alloc_gi_flg, false);
			}

			// 使用可能日基準では使用可能な在庫を表示したいので良品をデフォルトとする
			if (Cnd_ope_AVL.isSelected()) {
				setValueEx(Cnd_quality_typ, MAC_QUALITY_TYP.GOOD.value());
			}
			else {
				setValueEx(Cnd_quality_typ, null);
			}
		}
	}

	protected void setSts(MCEventInfo info) {
		if (!Cnd_ope_ALLOC.isSelected() && info.getOldValue().equals(Cnd_ope_ALLOC.getActionCommand())) {
			setValueEx(Cnd_gr_prcd, true);
			setValueEx(Cnd_gr_sts_opn_grp, true);
			setValueEx(Cnd_gr_sts_ordsav_grp, true);
			setValueEx(Cnd_gr_act, true);
			setValueEx(Cnd_gi_prcd, true);
			setValueEx(Cnd_gi_sts_opn_grp, true);
			setValueEx(Cnd_gi_sts_ordsav_grp, true);
			setValueEx(Cnd_gi_act, true);
		}
	}

	@Override
	public void doCnd_avl_schd_dt_NC(MCEventInfo info) {
		super.doCnd_avl_schd_dt_NC(info);
		setModeCndAvlSchdDt();
	}

	protected void setModeCndAvlSchdDt() {
		if (isNull(getCndR().avl_schd_dt())) {
			setValueEx(Cnd_except_invld_lot_flg, false);
			Cnd_except_invld_lot_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_except_invld_lot_flg);
		}
	}

	// 在庫識別区分
	@Override
	public MCList getCnd_stk_id_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispStkIdTyp());
		return super.getCnd_stk_id_typ(row, info);
	}

	protected MSC_STK_ID_TYP[] getDispStkIdTyp() {
		return new MSC_STK_ID_TYP[] {
				MSC_STK_ID_TYP.COSTK, MSC_STK_ID_TYP.CSTSTK, MSC_STK_ID_TYP.RNT_RCV,
				MSC_STK_ID_TYP.ACCPT_DFCT, MSC_STK_ID_TYP.NCV_RCV, MSC_STK_ID_TYP.ONR_PROV
		};
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		MCBeans[] bs = getInvisibleBeans();
		if (bs != null) {
			setComponentInvisibleAllStatus(bs);
		}
	}

	protected MCBeans[] getInvisibleBeans() {
		boolean contFctrEnable = isSame(getSysParm("CONT_FCTR_ENABLE_FLG"), "1");
		boolean mfgAprvEnable = isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1");

		if (!contFctrEnable && !mfgAprvEnable) {
			return mcframe.commonCore.util.MCCollectionUtil.concat(getContFctrInvisibleBeans(), getMfgAprvInvisibleBeans());
		}
		else if (!contFctrEnable) {
			return getContFctrInvisibleBeans();
		}
		else if (!mfgAprvEnable) {
			return getMfgAprvInvisibleBeans();
		}
		return null;
	}

	protected MCBeans[] getContFctrInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				MCBeansUtil.getAllComponents(MCBeans.class, HdrContFctrPanel));
	}

	protected MCBeans[] getMfgAprvInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {columnRsltGr_mrkt_judg_sts_typ, columnRsltGr_mrkt_judg_sts_typ_nm,
						columnRsltGi_mrkt_judg_sts_typ, columnRsltGi_mrkt_judg_sts_typ_nm});
	}

	// ------------IfSyncTableBase-------------------
	@Override
	public MCTable<?> getHSyncMainTable(MCRootPanel panel) {
		return RsltGrTable;
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		RsltGrTable.addHSyncTables(RsltGiTable);
	}

}