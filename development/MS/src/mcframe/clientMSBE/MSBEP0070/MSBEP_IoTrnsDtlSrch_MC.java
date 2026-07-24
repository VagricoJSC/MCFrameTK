package mcframe.clientMSBE.MSBEP0070;

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
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMSUB.MSUBP0020.*;

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
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_IoTrnsDtlSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IoTrnsDtlSrch_MC extends MSBEP_IoTrnsDtlSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected CndR _CndR;

	/** 最大の表示期間 */
	protected final int _maxDayDuration = 93;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IoTrnsDtlSrch_MC() {
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
	public MSBEP_IoTrnsDtlSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0070_Srch01Caller<P extends MSBEP_IoTrnsDtlSrch, B extends MS_MSBEL0070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0070_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			_CndR = getCndR().clone();
			getCndR().sum_unit_typ(getDispTyp());
			_CndR.sum_unit_typ(getDispTyp());
			setDLMode();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			// 操作種別変更時や検索前ステータスでは、検索枠を表示する
			Ctrl_ctrl_PPanel.expand(true);
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getCndR(), _CndR);
			_CndR.ac_dt(bridge.down1().ac_dt());
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			editDown(bridge.down0());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackSub(msgList);
		}
	}

	/**
	 * [MS_MSBEL0070_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0070_Srch02Caller<P extends MSBEP_IoTrnsDtlSrch, B extends MS_MSBEL0070_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0070_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			_CndR = getCndR().clone();
			getCndR().sum_unit_typ(getDispTyp());
			_CndR.sum_unit_typ(getDispTyp());
			setDLMode();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			// 操作種別変更時や検索前ステータスでは、検索枠を表示する
			Ctrl_ctrl_PPanel.expand(true);
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getCndR(), _CndR);
			_CndR.ac_dt(bridge.down1().ac_dt());
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			editDown(bridge.down0());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackSub(msgList);
		}
	}

	/**
	 * [MS_MSBEL0070_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0070_Srch03Caller<P extends MSBEP_IoTrnsDtlSrch, B extends MS_MSBEL0070_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0070_Srch03Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			_CndR = getCndR().clone();
			getCndR().sum_unit_typ(getDispTyp());
			_CndR.sum_unit_typ(getDispTyp());
			setDLMode();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			// 操作種別変更時や検索前ステータスでは、検索枠を表示する
			Ctrl_ctrl_PPanel.expand(true);
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getCndR(), _CndR);
			_CndR.ac_dt(bridge.down1().ac_dt());
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			editDown(bridge.down0());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackSub(msgList);
		}
	}

	protected void checkForCallStackSub(MCMessageList msgList) {
		// 期間ＦＲＯＭ≦期間ＴＯ
		msgList.addAll(checkBeforeAfter(Cnd_dt_fr, Cnd_dt_to));
		// 購買切替予定日ＦＲＯＭ≦購買切替予定日ＴＯ
		msgList.addAll(checkBeforeAfter(Cnd_purc_dt_fr, Cnd_purc_dt_to));

		msgList.addAll(checkAtLeastOne(Sts_InPanel));
		msgList.addAll(checkAtLeastOne(Sts_OutPanel));

		// 親品目指定
		if (!isNull(getCndR().par_itm_cd()) && isNullOr(getCndR().bom_ptn(), getCndR().master_dt(), getCndR().wg_cd())) {
			MCMessage msg = new MCMessage(getCndR(), CndR.$wg_cd, MSUCP0010);
			msgList.add(msg);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_SRCH_STK.isSelected()) {
			callMS_MSBEL0070_Srch01();
		}
		else if (Cnd_ope_SRCH_ASST.isSelected()) {
			callMS_MSBEL0070_Srch02();
		}
		else if (Cnd_ope_SRCH_USE.isSelected()) {
			callMS_MSBEL0070_Srch03();
		}
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_SRCH_STK.isSelected()) {
			createMS_MSBEL0070_Srch01().execDL();
		}
		else if (Cnd_ope_SRCH_ASST.isSelected()) {
			createMS_MSBEL0070_Srch02().execDL();
		}
		else if (Cnd_ope_SRCH_USE.isSelected()) {
			createMS_MSBEL0070_Srch03().execDL();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0040]の押下時の処理
	 * オーダ登録
	 */
	@Override
	public void doBtn_open_MSBCP0040(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MCRow bind = MCRow.create();
		bind.addStringColumn("itm_ord_sts_typ", MSC_ITM_ORD_STS_TYP.FIX.value());
		bind.addDateColumn("master_dt", r.dt());
		bind.addStringColumn("itm_cd", r.itm_cd());
		bind.addStringColumn("itm_sub1", r.itm_sub1());
		bind.addStringColumn("itm_sub2", r.itm_sub2());
		bind.addStringColumn("itm_sub3", r.itm_sub3());
		bind.addStringColumn("ver_no", r.ver_no());

		openPanel("MS", "MSBCP0040", T1, bind);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0050]の押下時の処理
	 * オーダ確認
	 */
	@Override
	public void doBtn_open_MSBCP0050(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
		aso.putCnd(crtOpenMSBCP0050CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP0050.CndR crtOpenMSBCP0050CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		// 本メソッドを修正する場合は、MSBCP0130への遷移処理もあわせて修正すること
		mcframe.clientMSBC.MSBCP0050.CndR to = mcframe.clientMSBC.MSBCP0050.CndR.create();
		if (MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			to.strg_loc_cd(r.loc_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isSITE(getDispTyp())) {
			to.strg_site_cd(r.site_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isWG(getDispTyp())) {
			to.wg_cd(r.wg_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLG_GRP(getDispTyp())) {
			to.strg_lg_grp_cd(r.lg_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isALLOC_GRP(getDispTyp())) {
			to.strg_alloc_grp_cd(r.alloc_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLOC_GRP(getDispTyp())) {
			to.mfg_loc_grp_cd(r.loc_grp_cd());
		}
		if (Cnd_ope_SRCH_STK.isSelected()) {
			to.strg_schd_dt_fr(_CndR.dt_fr());
			to.strg_schd_dt_to(_CndR.dt_to());
		}
		else if (Cnd_ope_SRCH_ASST.isSelected()) {
			to.accpt_schd_dt_fr(_CndR.dt_fr());
			to.accpt_schd_dt_to(_CndR.dt_to());
		}
		else if (Cnd_ope_SRCH_USE.isSelected()) {
			to.avl_schd_dt_fr(_CndR.dt_fr());
			to.avl_schd_dt_to(_CndR.dt_to());
		}
		mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch msbcp0050 = (mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch) aso.getPanel();
		to.ope(msbcp0050.Cnd_ope_REF.getActionCommand());
		to.opn_flg(true);
		to.sav_flg(true);
		to.fix_flg(true);
		to.inst_flg(true);
		to.cmpl_flg(true);
		to.mfg_flg(true);
		to.purc_flg(true);
		to.outsrc_flg(true);
		to.xfr_flg(true);
		to.wg_xfr_flg(true);
		to.false_not_fix_flg(true);
		to.true_not_fix_flg(true);
		to.ord_rcv_tgt_flg(true);
		to.not_ord_rcv_tgt_flg(true);
		to.ord_snd_tgt_flg(true);
		to.not_ord_snd_tgt_flg(true);
		to.before_frozen_flg(true);
		to.frozen_flg(true);
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0130]の押下時の処理
	 * 先行手配オーダ確認
	 */
	@Override
	public void doBtn_open_MSBCP0130(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0130");
		aso.putCnd(crtOpenMSBCP0130CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP0130.CndR crtOpenMSBCP0130CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		// 本メソッドを修正する場合は、MSBCP0050への遷移処理もあわせて修正すること
		mcframe.clientMSBC.MSBCP0130.CndR to = mcframe.clientMSBC.MSBCP0130.CndR.create();
		if (MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			to.strg_loc_cd(r.loc_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isSITE(getDispTyp())) {
			to.strg_site_cd(r.site_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isWG(getDispTyp())) {
			to.wg_cd(r.wg_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLG_GRP(getDispTyp())) {
			to.strg_lg_grp_cd(r.lg_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isALLOC_GRP(getDispTyp())) {
			to.strg_alloc_grp_cd(r.alloc_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLOC_GRP(getDispTyp())) {
			to.mfg_loc_grp_cd(r.loc_grp_cd());
		}
		if (Cnd_ope_SRCH_STK.isSelected()) {
			to.strg_schd_dt_fr(_CndR.dt_fr());
			to.strg_schd_dt_to(_CndR.dt_to());
		}
		else if (Cnd_ope_SRCH_ASST.isSelected()) {
			to.accpt_schd_dt_fr(_CndR.dt_fr());
			to.accpt_schd_dt_to(_CndR.dt_to());
		}
		else if (Cnd_ope_SRCH_USE.isSelected()) {
			to.avl_schd_dt_fr(_CndR.dt_fr());
			to.avl_schd_dt_to(_CndR.dt_to());
		}
		mcframe.clientMSBC.MSBCP0130.MSBCP_PrcdOrdSrch MSBCP0130 = (mcframe.clientMSBC.MSBCP0130.MSBCP_PrcdOrdSrch) aso.getPanel();
		to.ope(MSBCP0130.Cnd_ope_REF.getActionCommand());
		to.opn_flg(true);
		to.fix_flg(true);
		to.mfg_flg(true);
		to.purc_flg(true);
		to.outsrc_flg(true);
		to.xfr_flg(true);
		to.wg_xfr_flg(true);
		to.false_not_fix_flg(true);
		to.true_not_fix_flg(true);
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0040]の押下時の処理
	 * 在庫引当状況照会
	 */
	@Override
	public void doBtn_open_MSBEP0040(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0040");
		aso.putCnd(crtOpenMSBEP0040CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0040.CndR crtOpenMSBEP0040CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP0040.CndR to = mcframe.clientMSBE.MSBEP0040.CndR.create();
		to.ope(_CndR.ope());
		to.gr_prcd(_CndR.gr_prcd_flg());
		to.gr_sts_opn_grp(_CndR.gr_sts_opn_grp_flg());
		to.gr_sts_ordsav_grp(_CndR.gr_sts_ordsav_grp_flg());
		to.gr_sts_fix_grp(_CndR.gi_sts_fix_grp_flg());
		to.gr_sts_schd_grp(_CndR.gr_sts_schd_grp_flg());
		to.gr_sts_ord_grp(_CndR.gr_sts_ord_grp_flg());
		to.gr_act(_CndR.gr_act_flg());
		to.gi_prcd(_CndR.gi_prcd_flg());
		to.gi_sts_opn_grp(_CndR.gi_sts_opn_grp_flg());
		to.gi_sts_ordsav_grp(_CndR.gi_sts_ordsav_grp_flg());
		to.gi_sts_fix_grp(_CndR.gi_sts_fix_grp_flg());
		to.gi_sts_schd_grp(_CndR.gi_sts_schd_grp_flg());
		to.gi_sts_ord_grp(_CndR.gi_sts_ord_grp_flg());
		to.gi_act(_CndR.gi_act_flg());
		to.alloc_gi_flg(_CndR.alloc_gi_flg());
		to.dt_fr(_CndR.dt_fr());
		to.dt_to(_CndR.dt_to());
		if (MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			to.loc_cd(r.loc_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLG_GRP(getDispTyp())) {
			to.lg_grp_cd(r.lg_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isALLOC_GRP(getDispTyp())) {
			to.alloc_grp_cd(r.alloc_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLOC_GRP(getDispTyp())) {
			to.loc_grp_cd(r.loc_grp_cd());
		}
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0090]の押下時の処理
	 * 受払予定一覧照会
	 */
	@Override
	public void doBtn_open_MSBEP0090(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0090");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0090CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0090.CndR crtOpenMSBEP0090CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP0090.CndR to = mcframe.clientMSBE.MSBEP0090.CndR.create();
		if (Cnd_ope_SRCH_STK.isSelected()) {
			to.schd_dt_fr(_CndR.ac_dt().addDay(1));
			to.schd_dt_to(_CndR.dt_to());
		}
		else if (Cnd_ope_SRCH_ASST.isSelected()) {
			to.accpt_schd_dt_fr(_CndR.ac_dt().addDay(1));
			to.accpt_schd_dt_to(_CndR.dt_to());
		}
		else if (Cnd_ope_SRCH_USE.isSelected()) {
			to.avl_schd_dt_fr(_CndR.ac_dt().addDay(1));
			to.avl_schd_dt_to(_CndR.dt_to());
		}
		if (MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			to.loc_cd(r.loc_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isSITE(getDispTyp())) {
			to.site_cd(r.site_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isWG(getDispTyp())) {
			to.wg_cd(r.wg_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLG_GRP(getDispTyp())) {
			to.lg_grp_cd(r.lg_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isALLOC_GRP(getDispTyp())) {
			to.alloc_grp_cd(r.alloc_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLOC_GRP(getDispTyp())) {
			to.loc_grp_cd(r.loc_grp_cd());
		}
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0080]の押下時の処理
	 * 受払実績一覧照会
	 */
	@Override
	public void doBtn_open_MSBEP0080(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0080");

		aso.putCnd(crtOpenMSBEP0080CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0080.CndR crtOpenMSBEP0080CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP0080.CndR to = mcframe.clientMSBE.MSBEP0080.CndR.create();
		if (MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			to.loc_cd(r.loc_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isSITE(getDispTyp())) {
			to.site_cd(r.site_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isWG(getDispTyp())) {
			if (MSC_IO_TYP.isGR(r.io_typ())) {
				to.gr_wg_cd(r.wg_cd());
			}
			else if (MSC_IO_TYP.isGI(r.io_typ())) {
				to.gi_wg_cd(r.wg_cd());
			}
		}
		else if (MSC_SUM_UNIT_TYP.isLG_GRP(getDispTyp())) {
			to.lg_grp_cd(r.lg_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isALLOC_GRP(getDispTyp())) {
			to.alloc_grp_cd(r.alloc_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLOC_GRP(getDispTyp())) {
			to.loc_grp_cd(r.loc_grp_cd());
		}
		to.ac_dt_fr(_CndR.ac_dt().addDay(1));
		to.ac_dt_to(_CndR.dt_to());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0060]の押下時の処理
	 * 在庫推移照会
	 */
	@Override
	public void doBtn_open_MSBEP0060(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0060");
		aso.putCnd(crtOpenMSBEP0060CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0060.CndR crtOpenMSBEP0060CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBE.MSBEP0060.CndR to = mcframe.clientMSBE.MSBEP0060.CndR.create();
		for (String str :_CndR.getColumnPathArray()) {
			if (isSame(CndR.$quality_typ_nm, str) || isSame(CndR.$itm_typ_nm, str) || isSame(CndR.$par_itm_nm, str) || isSame(CndR.$key_flg, str)) {
				continue;
			}
			to.setValue(str, _CndR.getValue(str));
		}
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		if (MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			to.loc_cd(r.loc_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isSITE(getDispTyp())) {
			to.site_cd(r.site_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isWG(getDispTyp())) {
			to.wg_cd(r.wg_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLG_GRP(getDispTyp())) {
			to.lg_grp_cd(r.lg_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isALLOC_GRP(getDispTyp())) {
			to.alloc_grp_cd(r.alloc_grp_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isLOC_GRP(getDispTyp())) {
			to.loc_grp_cd(r.loc_grp_cd());
		}

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MABSP0770]の押下時の処理
	 * 版マスタ登録
	 */
	@Override
	public void doBtn_open_MABSP0770(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
		return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0770");

		aso.putCnd(crtOpenMABSP0770CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMABS.MABSP0770.CndR crtOpenMABSP0770CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0770.CndR to = mcframe.clientMABS.MABSP0770.CndR.create();
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.off_del_flg(true);
		to.on_del_flg(true);

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP1160]の押下時の処理
	 * 版切替状況一覧照会
	 */
	@Override
	public void doBtn_open_MSBCP1160(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1160");

		aso.putCnd(crtOpenMSBCP1160CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP1160.CndR crtOpenMSBCP1160CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMSBC.MSBCP1160.CndR to = mcframe.clientMSBC.MSBCP1160.CndR.create();
		to.uncmpl_flg(true);
		to.cmpl_flg(true);
		to.chd_itm_cd(r.itm_cd());
		to.chd_itm_sub1(r.itm_sub1());
		to.chd_itm_sub2(r.itm_sub2());
		to.chd_itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());

		return to;
	}

	// ------------ステータス制御------------
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		changeDisp();
		DtlTable.selectLeftmostColumn(0);

		// 操作種別変更時や検索前ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void changeDisp() {
		//集計項目で設定
		if (!MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			columnDtl_loc_cd.setMode(MCMode.INVISIBLE);
			columnDtl_loc_nm.setMode(MCMode.INVISIBLE);
			columnDtl_str_ln_cd.setMode(MCMode.INVISIBLE);
			columnDtl_str_ln_nm.setMode(MCMode.INVISIBLE);
			columnDtl_str_ln_cd_none_flg.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDtl_loc_cd.setMode(getDefaultMode(columnDtl_loc_cd));
			columnDtl_loc_nm.setMode(getDefaultMode(columnDtl_loc_nm));

		}
		if (!MSC_SUM_UNIT_TYP.isSITE(getDispTyp())) {
			columnDtl_site_cd.setMode(MCMode.INVISIBLE);
			columnDtl_site_nm.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDtl_site_cd.setMode(getDefaultMode(columnDtl_site_cd));
			columnDtl_site_nm.setMode(getDefaultMode(columnDtl_site_nm));
		}
		if (!MSC_SUM_UNIT_TYP.isWG(getDispTyp())) {
			columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
			columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDtl_wg_cd.setMode(getDefaultMode(columnDtl_wg_cd));
			columnDtl_wg_nm.setMode(getDefaultMode(columnDtl_wg_nm));
		}
		if (!MSC_SUM_UNIT_TYP.isLG_GRP(getDispTyp())) {
			columnDtl_lg_grp_cd.setMode(MCMode.INVISIBLE);
			columnDtl_lg_grp_nm.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDtl_lg_grp_cd.setMode(getDefaultMode(columnDtl_lg_grp_cd));
			columnDtl_lg_grp_nm.setMode(getDefaultMode(columnDtl_lg_grp_nm));
		}
		if (!MSC_SUM_UNIT_TYP.isALLOC_GRP(getDispTyp())) {
			columnDtl_alloc_grp_cd.setMode(MCMode.INVISIBLE);
			columnDtl_alloc_grp_nm.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDtl_alloc_grp_cd.setMode(getDefaultMode(columnDtl_alloc_grp_cd));
			columnDtl_alloc_grp_nm.setMode(getDefaultMode(columnDtl_alloc_grp_nm));
		}
		if (!MSC_SUM_UNIT_TYP.isLOC_GRP(getDispTyp())) {
			columnDtl_loc_grp_cd.setMode(MCMode.INVISIBLE);
			columnDtl_loc_grp_nm.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDtl_loc_grp_cd.setMode(getDefaultMode(columnDtl_loc_grp_cd));
			columnDtl_loc_grp_nm.setMode(getDefaultMode(columnDtl_loc_grp_nm));
		}
		if (_CndR.sno1_flg()) {
			columnDtl_sno1.setMode(getDefaultMode(columnDtl_sno1));
		}
		else {
			columnDtl_sno1.setMode(MCMode.INVISIBLE);
		}
		if (_CndR.sno2_flg()) {
			columnDtl_sno2.setMode(getDefaultMode(columnDtl_sno2));
		}
		else {
			columnDtl_sno2.setMode(MCMode.INVISIBLE);
		}
		if (_CndR.sno3_flg()) {
			columnDtl_sno3.setMode(getDefaultMode(columnDtl_sno3));
		}
		else {
			columnDtl_sno3.setMode(MCMode.INVISIBLE);
		}
		if (_CndR.sno4_flg()) {
			columnDtl_sno4.setMode(getDefaultMode(columnDtl_sno4));
		}
		else {
			columnDtl_sno4.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	protected void setupParts() {
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Dtl_stk_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_in_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_in_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_out_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_out_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	// ------------オープン時の処理実装------------
	@Override
	protected void valueInit() {
		super.valueInit();
		//入庫・出庫ステータス：先行手配、未確定、オーダ保存、依頼、予定、指図済
		getCndR().gi_prcd_flg(true);
		getCndR().gi_sts_opn_grp_flg(true);
		getCndR().gi_sts_ordsav_grp_flg(true);
		getCndR().gi_sts_fix_grp_flg(true);
		getCndR().gi_sts_schd_grp_flg(true);
		getCndR().gi_sts_ord_grp_flg(true);
		getCndR().gi_act_flg(true);

		getCndR().gr_prcd_flg(true);
		getCndR().gr_sts_opn_grp_flg(true);
		getCndR().gr_sts_ordsav_grp_flg(true);
		getCndR().gr_sts_fix_grp_flg(true);
		getCndR().gr_sts_schd_grp_flg(true);
		getCndR().gr_sts_ord_grp_flg(true);
		getCndR().gr_act_flg(true);

		//期間ＦＲＯＭ～ＴＯ(運用日付～運用日付＋01ヶ月－01日)
		getCndR().dt_fr(getToday());
		getCndR().dt_to(getToday().addMonth(1).addDay(-1));

		//集計タブ:場所、手配ＮＯ
		getCndR().disp_typ(Cnd_disp_typ_0.getActionCommand());
		getCndR().sno1_flg(true);
		getCndR().sno2_flg(true);
		getCndR().sno3_flg(true);
		getCndR().sno4_flg(true);
		
		//ワーキンググループ
		getCndR().wg_cd(getSysParm("DEF_WG_CD"));
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.setSortable(false); // ソート不可
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlTable) {
			config.ignoreSortOrder(true);
			config.ignoreTableSort(true);
		}
		return config;
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		if (isSame(getSysParm("VER_ENABLE_FLG"), "0")) {
			setComponentInvisibleAllStatus(getInvisibleBeans());
		}
		if (hasSiteDefCd(this)) {
			setComponentInvisibleAllStatus(Cnd_disp_typ_1);
		}
		if (hasWgDefCd(this)) {
			setComponentInvisibleAllStatus(Cnd_disp_typ_2);
		}
		if (hasLgGrpDefCd(this)) {
			setComponentInvisibleAllStatus(Cnd_disp_typ_3);
		}
		if (hasAllocGrpDefCd(this)) {
			setComponentInvisibleAllStatus(Cnd_disp_typ_4);
		}
		if (hasLocGrpDefCd(this)) {
			setComponentInvisibleAllStatus(Cnd_disp_typ_5);
		}
	}

	/**
	 * 非表示項目を設定する。
	 * @return
	 */
	protected MCBeans[] getInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Btn_open_MABSP0770, Btn_open_MSBCP1160});
	}

	protected String getDispTyp() {
		if (isSame(_CndR.disp_typ(), Cnd_disp_typ_0.getActionCommand())) {
			return MSC_SUM_UNIT_TYP.LOC.value();
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_1.getActionCommand())) {
			return MSC_SUM_UNIT_TYP.SITE.value();
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_2.getActionCommand())) {
			return MSC_SUM_UNIT_TYP.WG.value();
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_3.getActionCommand())) {
			return MSC_SUM_UNIT_TYP.LG_GRP.value();
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_4.getActionCommand())) {
			return MSC_SUM_UNIT_TYP.ALLOC_GRP.value();
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_5.getActionCommand())) {
			return MSC_SUM_UNIT_TYP.LOC_GRP.value();
		}
		return null;
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info){
		super.doCnd_ope_NC(info);

		// 資産発生基準では在庫と引当てていない出庫予定で資産区分が異なる場合に推移がうまく表示されない
		// 例：VMIの在庫があるが投入予定は自社資産の場合など
		// これを防ぐためにＭＲＰの結果と引き当てていない出庫予定はデフォルトでは非表示とする
		if (Cnd_ope_SRCH_ASST.isSelected()) {
			setValueEx(Cnd_gr_prcd_flg, false);
			setValueEx(Cnd_gr_sts_opn_grp_flg, false);
			setValueEx(Cnd_gr_sts_ordsav_grp_flg, false);
			setValueEx(Cnd_gi_prcd_flg, false);
			setValueEx(Cnd_gi_sts_opn_grp_flg, false);
			setValueEx(Cnd_gi_sts_ordsav_grp_flg, false);
			setValueEx(Cnd_alloc_gi_flg, true);
		}
		else {
			setValueEx(Cnd_gr_prcd_flg, true);
			setValueEx(Cnd_gr_sts_opn_grp_flg, true);
			setValueEx(Cnd_gr_sts_ordsav_grp_flg, true);
			setValueEx(Cnd_gi_prcd_flg, true);
			setValueEx(Cnd_gi_sts_opn_grp_flg, true);
			setValueEx(Cnd_gi_sts_ordsav_grp_flg, true);
			setValueEx(Cnd_alloc_gi_flg, false);
		}

		// 使用可能日基準では使用可能な在庫を表示したいので良品をデフォルトとする
		if (Cnd_ope_SRCH_USE.isSelected()) {
			setValueEx(Cnd_quality_typ, MAC_QUALITY_TYP.GOOD.value());
		}
		else {
			setValueEx(Cnd_quality_typ, null);
		}
	}

	@Override
	public void doDtl_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_NC(info);
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}

		DtlR r = DtlTable.getRow(index);

		// 入出庫日のない行はボタンを押下させない
		if (isNull(r.dt())) {
			Btn_open_MSBCP0040.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0050.setMode(MCMode.DISABLE);
			Btn_open_MSBCP0130.setMode(MCMode.DISABLE);
			Btn_open_MSBEP0040.setMode(MCMode.DISABLE);
			Btn_open_MSBEP0090.setMode(MCMode.DISABLE);
			Btn_open_MSBEP0080.setMode(MCMode.DISABLE);
			Btn_open_MSBEP0060.setMode(MCMode.DISABLE);
			Btn_open_MABSP0770.setMode(MCMode.DISABLE);
			Btn_open_MSBCP1160.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBCP0040.setMode(getDefaultMode(Btn_open_MSBCP0040));
			if (r.prcd_flg()) {
				Btn_open_MSBCP0050.setMode(MCMode.DISABLE);
				Btn_open_MSBCP0130.setMode(getDefaultMode(Btn_open_MSBCP0130));
			}
			else {
				Btn_open_MSBCP0050.setMode(getDefaultMode(Btn_open_MSBCP0050));
				Btn_open_MSBCP0130.setMode(MCMode.DISABLE);
			}
			Btn_open_MSBEP0040.setMode(getDefaultMode(Btn_open_MSBEP0040));
			Btn_open_MSBEP0090.setMode(getDefaultMode(Btn_open_MSBEP0090));
			Btn_open_MSBEP0080.setMode(getDefaultMode(Btn_open_MSBEP0080));
			Btn_open_MSBEP0060.setMode(getDefaultMode(Btn_open_MSBEP0060));
			Btn_open_MABSP0770.setMode(getDefaultMode(Btn_open_MABSP0770));
			Btn_open_MSBCP1160.setMode(getDefaultMode(Btn_open_MSBCP1160));
		}

		if (isNull(r.io_typ()) ||  MSC_IO_TYP.isNON(r.io_typ())) {
			Btn_open_MSBEP0080.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBEP0080.setMode(getDefaultMode(Btn_open_MSBEP0080));
		}

		// 版管理ＦＬＧで版マスタ、版切替一覧への遷移ボタンを制御
		if (r.ver_flg()) {
			Btn_open_MABSP0770.setMode(getDefaultMode(Btn_open_MABSP0770));
			Btn_open_MSBCP1160.setMode(getDefaultMode(Btn_open_MSBCP1160));
		}
		else {
			Btn_open_MABSP0770.setMode(MCMode.DISABLE);
			Btn_open_MSBCP1160.setMode(MCMode.DISABLE);
		}
	}

	protected ArrayList<String> getGrpCols() {
		ArrayList<String> grpCols = new ArrayList<String>();
		grpCols.add(DtlR.$itm_cd);
		grpCols.add(DtlR.$itm_sub1);
		grpCols.add(DtlR.$itm_sub2);
		grpCols.add(DtlR.$itm_sub3);
		grpCols.add(DtlR.$itm_nm);
		if (isSame(_CndR.disp_typ(), Cnd_disp_typ_0.getActionCommand())) {
			grpCols.add(DtlR.$loc_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_1.getActionCommand())) {
			grpCols.add(DtlR.$site_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_2.getActionCommand())) {
			grpCols.add(DtlR.$wg_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_3.getActionCommand())) {
			grpCols.add(DtlR.$lg_grp_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_4.getActionCommand())) {
			grpCols.add(DtlR.$alloc_grp_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_5.getActionCommand())) {
			grpCols.add(DtlR.$loc_grp_cd);
		}
		grpCols.add(DtlR.$ver_no);
		if (_CndR.sno1_flg()) grpCols.add(DtlR.$sno1);
		if (_CndR.sno2_flg()) grpCols.add(DtlR.$sno2);
		if (_CndR.sno3_flg()) grpCols.add(DtlR.$sno3);
		if (_CndR.sno4_flg()) grpCols.add(DtlR.$sno4);
		return grpCols;
	}

	protected void editDown(MCList<DtlR> list) {
		MCList<DtlR> newlist = createDtlL();
		MCList<DtlR>[] getList = list.groupList(getGrpCols().toArray(new String[0]));
		for(MCList<DtlR> l : getList) {
			DtlR r = createDtlR();
			newlist.addAll(l);
			newlist.add(r);
		}
		if (!newlist.isEmpty()) {
			//最終行に入った空行を削除
			newlist.remove(newlist.size()-1);
		}
		list.setAll(newlist);
	}

	// --------------------セルコンフィグSTART--------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig();
	}

	/**
	 * セル設定クラス
	 */
	public class DtlCellConfig extends MAUDP_CellConfig {

		protected Color _HDR = getPgmSettingColorNE(MSBEP_IoTrnsDtlSrch.class, new Color(180,225,140), "color.cell.hdr.bg");

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {

			DtlR r = getDtlL().get(index);

			if (!isNull(r.itm_cd()) && isNull(r.dt())) {
				return _HDR;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (!getCndR().key_flg() && !isNull(r.itm_cd()) && !isNull(r.dt())) {
				if (getInvisibleColumnConfigs().contains(column.getBaseRowColumnName())) {
					return true;
				}
			}
			return null;
		}

		protected ArrayList<String> _invisibleColumnConfigs = new ArrayList<String>();
		protected ArrayList<String> getInvisibleColumnConfigs() {
			if (_invisibleColumnConfigs.isEmpty()) {
				_invisibleColumnConfigs.add(columnDtl_itm_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_itm_sub1.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_itm_sub2.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_itm_sub3.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_itm_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_sno1.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_sno2.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_sno3.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_sno4.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_ver_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_loc_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_loc_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_site_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_site_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_wg_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_wg_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_lg_grp_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_lg_grp_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_alloc_grp_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_alloc_grp_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_loc_grp_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnDtl_loc_grp_nm.getBaseRowColumnName());
			}
			return _invisibleColumnConfigs;
		}
	}
	// --------------------セルコンフィグEND----------------------------

}