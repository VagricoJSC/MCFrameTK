package mcframe.clientMSBF.MSBFP0130;

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
import mcframe.clientMAUB.MAUBP0080.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5210.*;
import mcframe.clientMAUB.MAUBP5250.*;

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
import java.util.*;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_LotTraceSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_LotTraceSrch_MC extends MSBFP_LotTraceSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_LotTraceSrch_MC() {
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
	public MSBFP_LotTraceSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0130_Srch01Caller<P extends MSBFP_LotTraceSrch, B extends MS_MSBFL0130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0130_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();
			clearContainers(getRsltGrL(), getRsltGiL(), getRsltAprvJudgL());
			_rsltLCacheGr = null;
			_rsltLCacheGi = null;
			_rsltLCacheAprvJudg = null;
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.leaf(r.itm_cd());
			}
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

		@Override
		protected void show() {
			super.show();

			if (_is_expand_all) {
				Rslt_hrrchy_p_PPanel.showExpandAll(getRsltL());
			} else {
				Rslt_hrrchy_p_PPanel.showCollapseAll(getRsltL());
			}
		}
	}

	/**
	 * [MS_MSBFL0130_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0130_Srch02Caller<P extends MSBFP_LotTraceSrch, B extends MS_MSBFL0130_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0130_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setScreenAsync(false);
		}

		/**
		 * 検索結果が存在しなかったときのメッセージを表示します。
		 */
		protected void showNoDownDataMsg() {
			// ダイアログ出さない
		}
	}

	/** 全展開するかしないかを制御する */
	protected Boolean _is_expand_all = false;

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		_is_expand_all = false;
		callMS_MSBFL0130_Srch01();
	}
	/**
	 * Panel[SrchAll]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doSrchAll_srch_all(MCEventInfo info) {
		_is_expand_all = true;
		callMS_MSBFL0130_Srch01();
	}

	/**
	 * Panel[BtnLotTrace]のボタン[open_MSBFP0120]の押下時の処理
	 */
	@Override
	public void doBtnLotTrace_open_MSBFP0120(MCEventInfo info) {
		RsltR fr = RsltTable.getSelectedMCRow();
		if (fr == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0120");
		MCRow asoRow = crtOpenMSBFP0120CndR(aso, fr);
		if (!isNull(asoRow.getValueNE(mcframe.clientMSBF.MSBFP0120.CndR.$itm_p))) { 
			aso.putCnd(asoRow);
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * 遷移先[MSBFP0120]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	private mcframe.clientMSBF.MSBFP0120.CndR crtOpenMSBFP0120CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBF.MSBFP0120.CndR to = mcframe.clientMSBF.MSBFP0120.CndR.create();

		to.dupl_abl_flg(true);
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.lot_no(fr.lot_no());
		to.sublot_no(fr.sublot_no());
		to.sno1(fr.sno1());
		to.sno2(fr.sno2());
		to.sno3(fr.sno3());
		to.sno4(fr.sno4());
		return to;
	}

	/**
	 * Panel[BtnLotTrace]のボタン[open_MSBEP0010]の押下時の処理
	 */
	@Override
	public void doBtnLotTrace_open_MSBEP0010(MCEventInfo info) {
		RsltR fr = RsltTable.getSelectedMCRow();
		if (fr == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0010");
		MCRow asoRow = crtOpenMSBEP0010CndR(aso, fr);
		if (!isNull(asoRow.getValueNE(mcframe.clientMSBE.MSBEP0010.CndR.$itm_p))) { 
			aso.putCnd(asoRow);
			aso.putSearchAction();
			aso.runValueInit();
		}
		aso.show();
	}
	/**
	 * 遷移先[MSBEP0010]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	private mcframe.clientMSBE.MSBEP0010.CndR crtOpenMSBEP0010CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch p = (mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0010.CndR to = mcframe.clientMSBE.MSBEP0010.CndR.create();

		to.ope(p.Cnd_ope_STK.getActionCommand());
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.lot_no(fr.lot_no());
		to.sublot_no(fr.sublot_no());
		to.sno1(fr.sno1());
		to.sno2(fr.sno2());
		to.sno3(fr.sno3());
		to.sno4(fr.sno4());
		return to;
	}
	/**
	 * Panel[BtnLotTrace]のボタン[open_MSBFP0110]の押下時の処理
	 */
	@Override
	public void doBtnLotTrace_open_MSBFP0110(MCEventInfo info) {
		RsltR fr = RsltTable.getSelectedMCRow();
		if (fr == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0110");
		MCRow asoRow = crtOpenMSBFP0110CndR(aso, fr);
		if (!isNull(asoRow.getValueNE(mcframe.clientMSBF.MSBFP0110.CndR.$itm_p))) { 
			aso.putCnd(asoRow);
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * 遷移先[MSBFP0110]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	private mcframe.clientMSBF.MSBFP0110.CndR crtOpenMSBFP0110CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBF.MSBFP0110.MSBFP_LotSrch p = (mcframe.clientMSBF.MSBFP0110.MSBFP_LotSrch) aso.getPanel();
		mcframe.clientMSBF.MSBFP0110.CndR to = mcframe.clientMSBF.MSBFP0110.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.lot_no(fr.lot_no());
		to.sublot_no(fr.sublot_no());
		return to;
	}
	/**
	 * Panel[BtnLotTrace]のボタン[open_MSBFP0060]の押下時の処理
	 */
	@Override
	public void doBtnLotTrace_open_MSBFP0060(MCEventInfo info) {
		RsltR fr = RsltTable.getSelectedMCRow();
		if (fr == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0060");
		MCRow asoRow = crtOpenMSBFP0060CndR(aso, fr);
		if (!isNull(asoRow.getValueNE(mcframe.clientMSBF.MSBFP0060.CndR.$itm_p))) { 
			aso.putCnd(asoRow);
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * 遷移先[MSBFP0060]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	private mcframe.clientMSBF.MSBFP0060.CndR crtOpenMSBFP0060CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBF.MSBFP0060.MSBFP_InspActLstReg p = (mcframe.clientMSBF.MSBFP0060.MSBFP_InspActLstReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0060.CndR to = mcframe.clientMSBF.MSBFP0060.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(fr.itm_cd());
		to.itm_sub1(fr.itm_sub1());
		to.itm_sub2(fr.itm_sub2());
		to.itm_sub3(fr.itm_sub3());
		to.lot_no(fr.lot_no());
		to.sublot_no(fr.sublot_no());
		return to;
	}
	/**
	 * Panel[BtnGr]のボタン[open_MSBCP1070_gr]の押下時の処理
	 */
	@Override
	public void doBtnGr_open_MSBCP1070_gr(MCEventInfo info) {
		RsltGrR r = RsltGrTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP1070_gr(r);
	}
	protected void doBtn_open_MSBCP1070_gr(RsltGrR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1070");
		aso.putCnd(crtOpenMSBCP1070CndR_gr(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP1070.CndR crtOpenMSBCP1070CndR_gr(MAUCP_AppScreenOpener aso, RsltGrR r) {
		mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch p = (mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch) aso.getPanel();
		mcframe.clientMSBC.MSBCP1070.CndR to = mcframe.clientMSBC.MSBCP1070.CndR.create();
		if (isSame(r.schd_act_typ(), MSC_SCHD_ACT_TYP.SCHD.value())) {
			to.disp_unit1(p.Cnd_disp_unit1_HDR.getActionCommand());
			to.disp_unit2(p.Cnd_disp_unit2_INST.getActionCommand());
			to.tmp_sts_sav_flg(true);
			to.tmp_sts_ord_flg(true);
		}
		else {
			to.disp_unit1(p.Cnd_disp_unit1_YIELD.getActionCommand());
			to.disp_unit2(p.Cnd_disp_unit2_ACT.getActionCommand());
			to.tmp_sts_stt_flg(true);
			to.tmp_sts_cmpl_flg(true);
		}
		to.not_unschd_act_flg(true);
		to.unschd_act_flg(true);
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());

		return to;
	}

	/**
	 * Panel[BtnGr]のボタン[open_MSBEP0080_gr]の押下時の処理
	 */
	@Override
	public void doBtnGr_open_MSBEP0080_gr(MCEventInfo info) {
		RsltGrR gr = RsltGrTable.getSelectedMCRow();
		if (gr == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0080");
		MCRow asoRow = crtOpenMSBEP0080CndR(aso, gr);
		if (!isNull(asoRow.getValueNE(mcframe.clientMSBE.MSBEP0080.CndR.$itm_p))) { 
			aso.putCnd(asoRow);
			aso.putSearchAction();
			aso.runValueInit();
		}
		aso.show();
	}
	/**
	 * 遷移先[MSBEP0080]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	private mcframe.clientMSBE.MSBEP0080.CndR crtOpenMSBEP0080CndR(MAUCP_AppScreenOpener aso, RsltGrR gr) {
		mcframe.clientMSBE.MSBEP0080.MSBEP_IoActSrch p = (mcframe.clientMSBE.MSBEP0080.MSBEP_IoActSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0080.CndR to = mcframe.clientMSBE.MSBEP0080.CndR.create();

		to.ope(p.Cnd_ope_SRCH_NRML.getActionCommand());
		to.ac_dt_fr(gr.act_dt());
		to.ac_dt_to(gr.act_dt());
		to.slip_no(gr.slip_no());
		to.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
		return to;
	}
	/**
	 * Panel[BtnGr]のボタン[open_MSBEP0090_gr]の押下時の処理
	 */
	@Override
	public void doBtnGr_open_MSBEP0090_gr(MCEventInfo info) {
		RsltGrR gr = RsltGrTable.getSelectedMCRow();
		if (gr == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0090");
		MCRow asoRow = crtOpenMSBEP0090CndR(aso, gr);
		aso.putCnd(asoRow);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}
	/**
	 * 遷移先[MSBEP0090]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	private mcframe.clientMSBE.MSBEP0090.CndR crtOpenMSBEP0090CndR(MAUCP_AppScreenOpener aso, RsltGrR gr) {
		mcframe.clientMSBE.MSBEP0090.CndR to = mcframe.clientMSBE.MSBEP0090.CndR.create();

		to.slip_schd_no(gr.slip_schd_no());
		return to;
	}
	/**
	 * Panel[BtnGi]のボタン[open_MSBCP1070_gi]の押下時の処理
	 */
	@Override
	public void doBtnGi_open_MSBCP1070_gi(MCEventInfo info) {
		RsltGiR r = RsltGiTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBCP1070_gi(r);
	}
	protected void doBtn_open_MSBCP1070_gi(RsltGiR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1070");
		aso.putCnd(crtOpenMSBCP1070CndR_gi(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP1070.CndR crtOpenMSBCP1070CndR_gi(MAUCP_AppScreenOpener aso, RsltGiR r) {
		mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch p = (mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch) aso.getPanel();
		mcframe.clientMSBC.MSBCP1070.CndR to = mcframe.clientMSBC.MSBCP1070.CndR.create();
		if (isSame(r.schd_act_typ(), MSC_SCHD_ACT_TYP.SCHD.value())) {
			to.disp_unit1(p.Cnd_disp_unit1_HDR.getActionCommand());
			to.disp_unit2(p.Cnd_disp_unit2_INST.getActionCommand());
			to.tmp_sts_sav_flg(true);
			to.tmp_sts_ord_flg(true);
		}
		else {
			to.disp_unit1(p.Cnd_disp_unit1_YIELD.getActionCommand());
			to.disp_unit2(p.Cnd_disp_unit2_ACT.getActionCommand());
			to.tmp_sts_stt_flg(true);
			to.tmp_sts_cmpl_flg(true);
		}
		to.unschd_act_flg(true);
		to.not_unschd_act_flg(true);
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());

		return to;
	}

	/**
	 * Panel[BtnGi]のボタン[open_MSBEP0080_gi]の押下時の処理
	 */
	@Override
	public void doBtnGi_open_MSBEP0080_gi(MCEventInfo info) {
		RsltGiR gi = RsltGiTable.getSelectedMCRow();
		if (gi == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0080");
		MCRow asoRow = crtOpenMSBEP0080CndR(aso, gi);
		if (!isNull(asoRow.getValueNE(mcframe.clientMSBE.MSBEP0080.CndR.$itm_p))) { 
			aso.putCnd(asoRow);
			aso.putSearchAction();
			aso.runValueInit();
		}
		aso.show();
	}
	/**
	 * 遷移先[MSBEP0080]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	private mcframe.clientMSBE.MSBEP0080.CndR crtOpenMSBEP0080CndR(MAUCP_AppScreenOpener aso, RsltGiR gi) {
		mcframe.clientMSBE.MSBEP0080.MSBEP_IoActSrch p = (mcframe.clientMSBE.MSBEP0080.MSBEP_IoActSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0080.CndR to = mcframe.clientMSBE.MSBEP0080.CndR.create();

		to.ope(p.Cnd_ope_SRCH_NRML.getActionCommand());
		to.ac_dt_fr(gi.act_dt());
		to.ac_dt_to(gi.act_dt());
		to.slip_no(gi.slip_no());
		to.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
		return to;
	}
	/**
	 * Panel[BtnGi]のボタン[open_MSBEP0090_gi]の押下時の処理
	 */
	@Override
	public void doBtnGi_open_MSBEP0090_gi(MCEventInfo info) {
		RsltGiR gi = RsltGiTable.getSelectedMCRow();
		if (gi == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0090");
		MCRow asoRow = crtOpenMSBEP0090CndR(aso, gi);
		aso.putCnd(asoRow);
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}
	/**
	 * 遷移先[MSBEP0090]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	private mcframe.clientMSBE.MSBEP0090.CndR crtOpenMSBEP0090CndR(MAUCP_AppScreenOpener aso, RsltGiR gi) {
		mcframe.clientMSBE.MSBEP0090.CndR to = mcframe.clientMSBE.MSBEP0090.CndR.create();

		to.slip_schd_no(gi.slip_schd_no());
		return to;
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		int index = info.getEventIndex();

		if (compo == RsltTable) {
			doBtnLotTrace_open_MSBFP0120(info);
		}
		else if (compo == RsltGrTable) {
			RsltGrR gr = getRsltGrL().get(index);

			if (!isNull(gr.slip_no())) {
				doBtnGr_open_MSBEP0080_gr(info);
			}
			else if (!isNull(gr.slip_schd_no())) {
				doBtnGr_open_MSBEP0090_gr(info);
			}
		} else if (compo == RsltGiTable) {
			RsltGiR gi = getRsltGiL().get(index);

			if (!isNull(gi.slip_no())) {
				doBtnGi_open_MSBEP0080_gi(info);
			}
			else if (!isNull(gi.slip_schd_no())) {
				doBtnGi_open_MSBEP0090_gi(info);
			}
		}
	}

	// ------------オープン時の処理実装------------
	@Override
	protected void valueInit(){
		super.valueInit();
		setLotCnd();
	}

	protected void setLotCnd(){
		getCndR().dupl_abl_flg(true);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, Cnd_ver_flg);
		RsltGr_qty_p_PPanel.setRelateBeans(columnRsltGr_base_unit_cd, columnRsltGr_base_dec_place);
		RsltGi_qty_p_PPanel.setRelateBeans(columnRsltGi_base_unit_cd, columnRsltGi_base_dec_place);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		// ループＦＬＧは末尾に移動
		RsltTable.moveColumn(columnRslt_loop_flg, RsltTable.getColumnConfigs().length);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().getListPutter().putBind(ItmCols.$i_release_flg_on , true);
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();

		RsltGrTable.addSortColumn(columnRsltGr_itm_mfg_inst_no, SortType.ASC);
		RsltGrTable.addSortColumn(columnRsltGr_stk_xfr_act_no, SortType.ASC);
		RsltGrTable.addSortColumn(columnRsltGr_slip_no, SortType.ASC);

		RsltGiTable.addSortColumn(columnRsltGi_itm_mfg_inst_no, SortType.ASC);
		RsltGiTable.addSortColumn(columnRsltGi_mfg_act_no, SortType.ASC);
		RsltGiTable.addSortColumn(columnRsltGi_stk_xfr_act_no, SortType.ASC);
		RsltGiTable.addSortColumn(columnRsltGi_slip_no, SortType.ASC);

		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_mfg_aprv_sts_typ, SortType.ASC);
		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_mfg_aprv_dt, SortType.ASC);
		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_insp_aprv_sts_typ, SortType.ASC);
		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_insp_judg_dt, SortType.ASC);
		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_insp_judg_rslt_typ, SortType.ASC);
		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_plnt_aprv_sts_typ, SortType.ASC);
		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_plnt_aprv_dt, SortType.ASC);
		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_mrkt_judg_sts_typ, SortType.ASC);
		RsltAprvJudgTable.addSortColumn(columnRsltAprvJudg_mrkt_judg_dt, SortType.ASC);
	}

	// ------------ステータス制御------------
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus(){
		super.setREFStatus();
		setFocus();
		setBtnMode();
		setBtnGrMode();
		setBtnGiMode();
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setFocus(){
		if(getRsltL().size() > 0){
			RsltTable.selectLeftmostColumn(0);
		}else{
			CndPanel.focusFirstComponent();
		}
	}

	// ------------NotificationChange-----------
	protected HashMap<MCNumber, MCList<RsltGrR>> _rsltLCacheGr;
	protected HashMap<MCNumber, MCList<RsltGiR>> _rsltLCacheGi;
	protected HashMap<MCNumber, MCList<RsltAprvJudgR>> _rsltLCacheAprvJudg;

	protected void callSrch02(RsltR cndR) {

		if (_rsltLCacheGr == null && _rsltLCacheGi == null && _rsltLCacheAprvJudg == null) {
			_rsltLCacheGr = new HashMap<MCNumber, MCList<RsltGrR>>();
			_rsltLCacheGi = new HashMap<MCNumber, MCList<RsltGiR>>();
			_rsltLCacheAprvJudg = new HashMap<MCNumber, MCList<RsltAprvJudgR>>();
		}
		else {
			MCList<RsltGrR> cacheGr = _rsltLCacheGr.get(cndR.extno());
			MCList<RsltGiR> cacheGi = _rsltLCacheGi.get(cndR.extno());
			MCList<RsltAprvJudgR> cacheAprv = _rsltLCacheAprvJudg.get(cndR.extno());
			if (!isNull(cacheGr) || !isNull(cacheGi) || !isNull(cacheAprv)) {
				setRsltGrL(cacheGr);
				setRsltGiL(cacheGi);
				setRsltAprvJudgL(cacheAprv);
				return;
			}
		}

		getRsltCndR().clear();
		MCRow.copyall(getRsltCndR(), cndR);

		callMS_MSBFL0130_Srch02();

		_rsltLCacheGr.put(cndR.extno(), getRsltGrL().clone());
		_rsltLCacheGi.put(cndR.extno(), getRsltGiL().clone());
		_rsltLCacheAprvJudg.put(cndR.extno(), getRsltAprvJudgL().clone());
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		RsltR r = getRsltL().get(index);

		callSrch02(r);

		sort(RsltGrTable);
		RsltGrTable.adjustWidth();

		if(getRsltGrL().size() > 0){
			RsltGrTable.selectRowNoFocus(0);
		}

		sort(RsltGiTable);
		RsltGiTable.adjustWidth();

		if(getRsltGiL().size() > 0){
			RsltGiTable.selectRowNoFocus(0);
		}

		RsltAprvJudgTable.adjustWidth();

		setBtnMode();
		setBtnGrMode();
		setBtnGiMode();
	}

	@Override
	public void doRsltGr_NC(MCEventInfo info) {
		super.doRsltGr_NC(info);

		setBtnGrMode();
	}

	@Override
	public void doRsltGi_NC(MCEventInfo info) {
		super.doRsltGi_NC(info);

		setBtnGiMode();
	}

	/**
	 * ボタンモード制御<br />
	 *
	 * 展開一覧操作時のボタンのモード制御を行う
	 *
	 * @param r 選択されている展開明細行
	 */
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		if (isNull(r)) {
			BtnLotTrace_open_MSBFP0120.setMode(MCMode.DISABLE);
			BtnLotTrace_open_MSBEP0010.setMode(MCMode.DISABLE);
			BtnLotTrace_open_MSBFP0110.setMode(MCMode.DISABLE);
			BtnLotTrace_open_MSBFP0060.setMode(MCMode.DISABLE);
		} else {
			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				setDefaultMode(BtnLotTrace_open_MSBFP0120);
			} else {
				BtnLotTrace_open_MSBFP0120.setMode(MCMode.DISABLE);
			}
			setDefaultMode(BtnLotTrace_open_MSBEP0010);
			setDefaultMode(BtnLotTrace_open_MSBFP0110);
			setDefaultMode(BtnLotTrace_open_MSBFP0060);
		}
	}

	/**
	 * ボタンモード制御<br />
	 *
	 * 入庫情報時のボタンのモード制御を行う
	 *
	 * @param r 選択されている入庫情報行
	 */
	protected void setBtnGrMode() {
		RsltGrR r = RsltGrTable.getSelectedMCRow();

		if (isNull(r)) {
			BtnGr_open_MSBCP1070_gr.setMode(MCMode.DISABLE);
			BtnGr_open_MSBEP0080_gr.setMode(MCMode.DISABLE);
			BtnGr_open_MSBEP0090_gr.setMode(MCMode.DISABLE);
		}else {

			// 製造指図進捗一覧照会
			if (isNull(r.itm_mfg_inst_no())) {
				BtnGr_open_MSBCP1070_gr.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(BtnGr_open_MSBCP1070_gr);
			}
			// 受払実績一覧照会
			if (isNull(r.slip_no())) {
				BtnGr_open_MSBEP0080_gr.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(BtnGr_open_MSBEP0080_gr);
			}
			// 受払予定一覧照会
			if (isNull(r.slip_schd_no())) {
				BtnGr_open_MSBEP0090_gr.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(BtnGr_open_MSBEP0090_gr);
			}
		}
	}

	/**
	 * ボタンモード制御<br />
	 *
	 * 出庫情報時のボタンのモード制御を行う
	 *
	 * @param r 選択されている出庫情報行
	 */
	protected void setBtnGiMode(){
		RsltGiR r = RsltGiTable.getSelectedMCRow();

		if (isNull(r)) {
			BtnGi_open_MSBCP1070_gi.setMode(MCMode.DISABLE);
			BtnGi_open_MSBEP0080_gi.setMode(MCMode.DISABLE);
			BtnGi_open_MSBEP0090_gi.setMode(MCMode.DISABLE);
		}else {

			// 製造指図進捗一覧照会
			if (isNull(r.itm_mfg_inst_no())) {
				BtnGi_open_MSBCP1070_gi.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(BtnGi_open_MSBCP1070_gi);
			}
			// 受払実績一覧照会
			if (isNull(r.slip_no())) {
				BtnGi_open_MSBEP0080_gi.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(BtnGi_open_MSBEP0080_gi);
			}
			// 受払予定一覧照会
			if (isNull(r.slip_schd_no())) {
				BtnGi_open_MSBEP0090_gi.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(BtnGi_open_MSBEP0090_gi);
			}
		}
	}

}