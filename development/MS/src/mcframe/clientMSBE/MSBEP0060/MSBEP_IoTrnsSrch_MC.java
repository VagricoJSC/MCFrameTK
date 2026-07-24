package mcframe.clientMSBE.MSBEP0060;

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
import mcframe.clientMAUD.MAUDP0010.IfVHMapperPanel;
import mcframe.clientMAUC.MAUCP0180.MAUCP_VHMapper;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_IoTrnsSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IoTrnsSrch_MC extends MSBEP_IoTrnsSrch_MC_A implements IfVHMapperPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MAUCP_VHMapper<DtlR, DispDtlR> _vhM = new MAUCP_VHMapper<>();

	protected Map<MCNumber, MCList<DispDtlR>> _grpNoHMap = new HashMap<>();

	protected Map<MCNumber, MCList<DtlR>> _grpNoVMap = new HashMap<>();

	/** 明細のデータ項目 */
	protected MCColumnConfig[] _qtys = null;
	/** 日付部分の項目名 */
	protected String[] _qtyCols = null;

	protected Map<MCColumnConfig, MCDate> _dateMap = new HashMap<>();

	/** 最大の表示期間 */
	protected final int _maxDayDuration = 1098;

	//入庫予定
	protected String _grSchdQty = DtlR.$gr_schd_qty;
	//出庫予定
	protected String _giSchdQty = DtlR.$gi_schd_qty;
	//入庫実績
	protected String _grActQty = DtlR.$gr_act_qty;
	//出庫実績
	protected String _giActQty = DtlR.$gi_act_qty;
	//在庫数量
	protected String _stkQty = DtlR.$stk_qty;
	//在庫金額
	protected String _stkAmt = DtlR.$stk_amt;

	protected CndR _CndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IoTrnsSrch_MC() {
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
	public MSBEP_IoTrnsSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0060_Srch01Caller<P extends MSBEP_IoTrnsSrch, B extends MS_MSBEL0060_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0060_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_CndR = getCndR().clone();
			getCndR().sum_unit_typ(getDispTyp());
			_CndR.sum_unit_typ(getDispTyp());
		}

		@Override
		protected void clear() {
			super.clear();

			getDispDtlL().clear();
			clearCacheVH();
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getCndR(), _CndR);
			_CndR.ac_dt(bridge.down0().ac_dt());
			showVH(bridge.down1());
		}

		@Override
		protected void adjustList() {
			super.adjustList();

			DispDtlTable.adjustWidth();
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

			// 可変カラムのラベル名とメッセージ用名称をクリアする
			_vhM.clearElmColsLabel();
		}
	}

	/**
	 * [MS_MSBEL0060_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0060_Srch02Caller<P extends MSBEP_IoTrnsSrch, B extends MS_MSBEL0060_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0060_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_CndR = getCndR().clone();
			getCndR().sum_unit_typ(getDispTyp());
			_CndR.sum_unit_typ(getDispTyp());
		}

		@Override
		protected void clear() {
			super.clear();

			getDispDtlL().clear();
			clearCacheVH();
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getCndR(), _CndR);
			_CndR.ac_dt(bridge.down0().ac_dt());
			showVH(bridge.down1());
		}

		@Override
		protected void adjustList() {
			super.adjustList();

			DispDtlTable.adjustWidth();
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

			// 可変カラムのラベル名とメッセージ用名称をクリアする
			_vhM.clearElmColsLabel();
		}
	}

	/**
	 * [MS_MSBEL0060_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0060_Srch03Caller<P extends MSBEP_IoTrnsSrch, B extends MS_MSBEL0060_Srch03Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0060_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_CndR = getCndR().clone();
			getCndR().sum_unit_typ(getDispTyp());
			_CndR.sum_unit_typ(getDispTyp());
		}

		@Override
		protected void clear() {
			super.clear();

			getDispDtlL().clear();
			clearCacheVH();
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getCndR(), _CndR);
			_CndR.ac_dt(bridge.down0().ac_dt());
			showVH(bridge.down1());
		}

		@Override
		protected void adjustList() {
			super.adjustList();

			DispDtlTable.adjustWidth();
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

			// 可変カラムのラベル名とメッセージ用名称をクリアする
			_vhM.clearElmColsLabel();
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

		// 検索する期間が範囲内であること
		MCDate endDt = getCndR().dt_to();
		MCDate stDt = getCndR().dt_fr();
		if (!isNull(stDt) && !isNull(endDt) && (endDt.diffDay(stDt) >= _maxDayDuration)) {
			MCMessage msg = new MCMessage(getCndR(), CndR.$dt_fr, MSUCP0101);
			msgList.add(msg);
		}
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearCacheVH();
	}

	protected void clearCacheVH() {
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhM.initColInfo(MCList.create(MCRow.class));
		_vhM.clearElmColsLabel();

		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhM.clearCachedList();
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_SRCH_STK.isSelected()) {
			callMS_MSBEL0060_Srch01();
		}
		else if (Cnd_ope_SRCH_ASST.isSelected()) {
			callMS_MSBEL0060_Srch02();
		}
		else if (Cnd_ope_SRCH_USE.isSelected()) {
			callMS_MSBEL0060_Srch03();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0040]の押下時の処理
	 * オーダ登録
	 */
	@Override
	public void doBtn_open_MSBCP0040(MCEventInfo info) {
		DispDtlR r = DispDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MCRow bind = MCRow.create();
		bind.addStringColumn("itm_ord_sts_typ", MSC_ITM_ORD_STS_TYP.FIX.value());
		bind.addDateColumn("master_dt", _dateMap.get(DispDtlTable.getLastSelectedColumnConfig()));
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
		DispDtlR r = DispDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
		aso.putCnd(crtOpenMSBCP0050CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP0050.CndR crtOpenMSBCP0050CndR(MAUCP_AppScreenOpener aso, DispDtlR r) {
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
		DispDtlR r = DispDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0130");
		aso.putCnd(crtOpenMSBCP0130CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP0130.CndR crtOpenMSBCP0130CndR(MAUCP_AppScreenOpener aso, DispDtlR r) {
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
		DispDtlR r = DispDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0040");
		aso.putCnd(crtOpenMSBEP0040CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0040.CndR crtOpenMSBEP0040CndR(MAUCP_AppScreenOpener aso, DispDtlR r) {
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
		DispDtlR r = DispDtlTable.getSelectedMCRow();
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

	protected mcframe.clientMSBE.MSBEP0090.CndR crtOpenMSBEP0090CndR(MAUCP_AppScreenOpener aso, DispDtlR r) {
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
		DispDtlR r = DispDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0080");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0080CndR(aso, r));
		aso.putSearchAction();
		aso.show();

	}

	protected mcframe.clientMSBE.MSBEP0080.CndR crtOpenMSBEP0080CndR(MAUCP_AppScreenOpener aso, DispDtlR r) {
		mcframe.clientMSBE.MSBEP0080.CndR to = mcframe.clientMSBE.MSBEP0080.CndR.create();
		if (MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			to.loc_cd(r.loc_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isSITE(getDispTyp())) {
			to.site_cd(r.site_cd());
		}
		else if (MSC_SUM_UNIT_TYP.isWG(getDispTyp())) {
			if (isSame(r.row_title_col(), _grActQty) || isSame(r.row_title_col(), _grSchdQty)) {
				to.gr_wg_cd(r.wg_cd());
			}
			else if (isSame(r.row_title_col(), _giActQty) || isSame(r.row_title_col(), _giSchdQty)) {
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
	 * Panel[Btn]のボタン[open_MSBEP0070]の押下時の処理
	 * 在庫推移明細照会
	 */
	@Override
	public void doBtn_open_MSBEP0070(MCEventInfo info) {
		openMsbep0070();
	}

	//DCと画面遷移ボタンで共有
	protected void openMsbep0070() {
		DispDtlR r = DispDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0070");
		aso.putCnd(crtOpenMSBEP0070CndR(aso, r));
		aso.putSearchAction();
		aso.show();

	}

	protected mcframe.clientMSBE.MSBEP0070.CndR crtOpenMSBEP0070CndR(MAUCP_AppScreenOpener aso, DispDtlR r) {
		mcframe.clientMSBE.MSBEP0070.CndR to = mcframe.clientMSBE.MSBEP0070.CndR.create();
		for (String str :_CndR.getColumnPathArray()) {
			if (isSame(CndR.$quality_typ_nm, str) || isSame(CndR.$itm_typ_nm, str) || isSame(CndR.$par_itm_nm, str)) {
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
		DispDtlR r = DispDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0770");

		aso.putCnd(crtOpenMABSP0770CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMABS.MABSP0770.CndR crtOpenMABSP0770CndR(MAUCP_AppScreenOpener aso, DispDtlR r) {
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
		DispDtlR r = DispDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1160");

		aso.putCnd(crtOpenMSBCP1160CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBC.MSBCP1160.CndR crtOpenMSBCP1160CndR(MAUCP_AppScreenOpener aso, DispDtlR r) {
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

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DispDtlTable) {
			openMsbep0070();
		}
	}

	// ------------ステータス制御------------
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		// 横テーブルの利用する可変カラムをENABLEにする。利用しない可変カラムをINVISIBLEにする。
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);

		changeDisp();
		DispDtlTable.selectLeftmostColumn(0);

		// 操作種別変更時や検索前ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void changeDisp() {
		//集計項目で設定
		if (!MSC_SUM_UNIT_TYP.isLOC(getDispTyp())) {
			columnDispDtl_disp_00.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDispDtl_disp_00.setMode(getDefaultMode(columnDispDtl_disp_00));
		}
		if (!MSC_SUM_UNIT_TYP.isSITE(getDispTyp())) {
			columnDispDtl_disp_01.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDispDtl_disp_01.setMode(getDefaultMode(columnDispDtl_disp_01));
		}
		if (!MSC_SUM_UNIT_TYP.isWG(getDispTyp())) {
			columnDispDtl_disp_02.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDispDtl_disp_02.setMode(getDefaultMode(columnDispDtl_disp_02));
		}
		if (!MSC_SUM_UNIT_TYP.isLG_GRP(getDispTyp())) {
			columnDispDtl_disp_03.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDispDtl_disp_03.setMode(getDefaultMode(columnDispDtl_disp_03));
		}
		if (!MSC_SUM_UNIT_TYP.isALLOC_GRP(getDispTyp())) {
			columnDispDtl_disp_04.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDispDtl_disp_04.setMode(getDefaultMode(columnDispDtl_disp_04));
		}
		if (!MSC_SUM_UNIT_TYP.isLOC_GRP(getDispTyp())) {
			columnDispDtl_disp_05.setMode(MCMode.INVISIBLE);
		}
		else {
			columnDispDtl_disp_05.setMode(getDefaultMode(columnDispDtl_disp_05));
		}
	}

	@Override
	protected void setupParts() {
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		DispDtl_qty_00_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_01_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_02_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_03_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_04_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_05_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_06_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_07_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_08_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_09_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_10_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_11_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_12_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_13_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_14_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_15_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_16_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_17_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_18_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_19_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_20_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_21_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_22_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_23_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_24_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_25_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_26_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_27_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_28_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_29_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_30_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_31_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_32_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_33_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_34_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_35_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_36_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_37_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_38_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_39_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_40_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_41_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_42_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_43_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_44_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_45_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_46_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_47_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_48_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_49_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_50_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_51_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_52_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_53_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_54_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_55_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_56_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_57_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_58_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_59_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_60_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_61_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_62_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_63_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_64_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_65_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_66_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_67_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_68_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_69_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_70_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_71_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_72_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_73_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_74_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_75_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_76_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_77_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_78_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_79_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_80_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_81_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_82_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_83_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_84_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_85_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_86_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_87_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_88_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_89_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_90_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_91_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_92_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_93_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_94_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_95_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_96_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_97_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_98_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_99_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_100_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_101_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_102_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_103_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_104_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_105_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_106_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_107_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_108_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_109_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_110_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_111_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_112_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_113_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_114_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_115_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_116_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_117_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_118_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_119_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_120_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_121_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_122_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_123_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_124_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_125_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_126_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_127_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_128_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_129_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_130_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_131_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_132_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_133_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_134_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_135_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_136_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_137_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_138_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_139_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_140_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_141_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_142_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_143_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_144_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_145_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_146_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_147_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_148_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_149_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_150_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_151_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_152_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_153_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_154_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_155_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_156_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_157_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_158_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_159_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_160_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_161_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_162_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_163_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_164_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_165_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_166_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_167_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_168_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_169_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_170_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_171_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_172_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_173_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_174_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_175_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_176_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_177_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_178_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_179_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_180_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_181_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_182_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_183_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_184_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_185_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_186_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_187_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_188_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_189_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_190_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_191_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_192_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_193_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_194_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_195_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_196_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_197_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_198_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_199_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_200_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_201_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_202_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_203_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_204_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_205_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_206_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_207_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_208_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_209_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_210_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_211_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_212_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_213_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_214_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_215_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_216_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_217_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_218_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_219_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_220_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_221_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_222_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_223_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_224_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_225_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_226_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_227_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_228_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_229_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_230_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_231_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_232_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_233_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_234_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_235_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_236_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_237_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_238_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_239_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_240_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_241_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_242_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_243_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_244_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_245_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_246_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_247_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_248_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_249_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_250_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_251_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_252_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_253_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_254_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_255_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_256_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_257_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_258_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_259_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_260_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_261_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_262_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_263_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_264_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_265_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_266_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_267_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_268_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_269_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_270_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_271_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_272_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_273_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_274_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_275_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_276_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_277_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_278_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_279_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_280_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_281_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_282_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_283_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_284_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_285_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_286_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_287_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_288_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_289_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_290_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_291_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_292_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_293_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_294_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_295_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_296_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_297_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_298_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_299_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_300_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_301_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_302_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_303_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_304_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_305_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_306_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_307_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_308_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_309_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_310_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_311_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_312_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_313_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_314_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_315_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_316_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_317_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_318_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_319_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_320_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_321_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_322_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_323_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_324_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_325_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_326_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_327_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_328_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_329_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_330_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_331_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_332_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_333_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_334_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_335_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_336_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_337_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_338_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_339_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_340_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_341_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_342_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_343_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_344_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_345_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_346_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_347_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_348_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_349_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_350_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_351_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_352_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_353_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_354_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_355_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_356_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_357_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_358_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_359_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_360_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_361_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_362_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_363_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_364_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_365_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_366_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_367_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_368_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_369_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_370_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_371_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_372_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_373_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_374_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_375_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_376_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_377_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_378_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_379_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_380_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_381_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_382_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_383_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_384_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_385_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_386_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_387_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_388_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_389_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_390_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_391_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_392_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_393_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_394_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_395_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_396_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_397_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_398_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_399_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_400_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_401_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_402_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_403_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_404_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_405_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_406_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_407_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_408_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_409_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_410_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_411_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_412_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_413_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_414_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_415_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_416_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_417_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_418_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_419_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_420_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_421_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_422_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_423_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_424_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_425_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_426_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_427_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_428_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_429_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_430_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_431_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_432_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_433_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_434_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_435_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_436_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_437_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_438_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_439_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_440_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_441_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_442_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_443_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_444_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_445_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_446_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_447_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_448_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_449_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_450_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_451_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_452_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_453_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_454_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_455_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_456_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_457_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_458_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_459_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_460_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_461_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_462_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_463_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_464_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_465_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_466_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_467_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_468_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_469_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_470_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_471_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_472_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_473_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_474_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_475_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_476_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_477_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_478_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_479_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_480_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_481_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_482_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_483_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_484_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_485_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_486_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_487_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_488_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_489_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_490_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_491_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_492_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_493_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_494_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_495_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_496_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_497_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_498_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_499_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_500_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_501_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_502_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_503_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_504_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_505_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_506_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_507_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_508_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_509_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_510_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_511_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_512_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_513_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_514_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_515_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_516_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_517_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_518_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_519_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_520_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_521_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_522_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_523_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_524_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_525_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_526_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_527_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_528_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_529_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_530_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_531_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_532_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_533_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_534_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_535_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_536_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_537_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_538_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_539_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_540_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_541_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_542_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_543_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_544_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_545_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_546_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_547_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_548_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_549_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_550_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_551_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_552_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_553_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_554_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_555_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_556_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_557_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_558_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_559_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_560_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_561_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_562_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_563_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_564_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_565_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_566_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_567_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_568_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_569_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_570_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_571_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_572_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_573_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_574_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_575_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_576_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_577_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_578_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_579_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_580_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_581_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_582_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_583_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_584_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_585_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_586_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_587_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_588_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_589_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_590_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_591_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_592_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_593_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_594_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_595_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_596_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_597_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_598_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_599_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_600_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_601_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_602_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_603_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_604_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_605_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_606_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_607_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_608_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_609_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_610_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_611_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_612_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_613_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_614_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_615_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_616_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_617_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_618_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_619_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_620_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_621_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_622_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_623_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_624_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_625_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_626_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_627_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_628_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_629_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_630_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_631_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_632_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_633_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_634_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_635_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_636_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_637_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_638_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_639_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_640_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_641_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_642_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_643_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_644_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_645_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_646_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_647_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_648_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_649_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_650_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_651_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_652_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_653_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_654_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_655_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_656_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_657_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_658_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_659_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_660_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_661_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_662_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_663_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_664_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_665_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_666_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_667_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_668_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_669_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_670_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_671_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_672_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_673_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_674_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_675_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_676_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_677_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_678_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_679_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_680_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_681_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_682_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_683_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_684_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_685_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_686_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_687_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_688_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_689_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_690_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_691_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_692_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_693_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_694_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_695_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_696_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_697_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_698_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_699_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_700_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_701_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_702_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_703_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_704_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_705_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_706_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_707_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_708_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_709_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_710_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_711_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_712_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_713_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_714_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_715_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_716_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_717_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_718_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_719_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_720_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_721_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_722_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_723_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_724_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_725_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_726_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_727_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_728_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_729_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_730_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_731_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_732_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_733_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_734_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_735_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_736_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_737_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_738_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_739_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_740_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_741_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_742_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_743_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_744_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_745_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_746_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_747_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_748_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_749_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_750_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_751_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_752_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_753_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_754_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_755_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_756_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_757_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_758_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_759_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_760_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_761_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_762_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_763_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_764_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_765_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_766_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_767_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_768_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_769_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_770_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_771_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_772_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_773_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_774_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_775_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_776_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_777_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_778_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_779_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_780_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_781_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_782_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_783_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_784_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_785_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_786_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_787_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_788_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_789_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_790_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_791_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_792_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_793_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_794_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_795_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_796_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_797_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_798_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_799_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_800_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_801_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_802_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_803_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_804_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_805_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_806_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_807_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_808_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_809_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_810_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_811_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_812_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_813_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_814_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_815_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_816_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_817_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_818_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_819_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_820_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_821_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_822_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_823_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_824_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_825_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_826_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_827_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_828_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_829_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_830_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_831_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_832_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_833_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_834_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_835_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_836_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_837_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_838_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_839_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_840_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_841_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_842_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_843_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_844_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_845_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_846_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_847_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_848_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_849_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_850_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_851_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_852_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_853_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_854_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_855_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_856_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_857_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_858_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_859_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_860_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_861_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_862_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_863_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_864_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_865_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_866_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_867_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_868_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_869_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_870_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_871_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_872_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_873_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_874_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_875_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_876_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_877_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_878_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_879_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_880_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_881_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_882_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_883_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_884_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_885_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_886_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_887_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_888_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_889_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_890_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_891_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_892_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_893_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_894_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_895_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_896_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_897_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_898_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_899_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_900_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_901_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_902_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_903_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_904_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_905_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_906_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_907_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_908_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_909_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_910_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_911_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_912_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_913_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_914_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_915_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_916_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_917_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_918_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_919_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_920_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_921_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_922_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_923_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_924_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_925_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_926_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_927_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_928_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_929_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_930_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_931_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_932_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_933_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_934_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_935_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_936_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_937_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_938_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_939_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_940_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_941_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_942_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_943_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_944_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_945_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_946_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_947_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_948_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_949_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_950_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_951_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_952_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_953_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_954_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_955_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_956_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_957_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_958_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_959_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_960_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_961_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_962_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_963_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_964_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_965_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_966_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_967_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_968_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_969_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_970_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_971_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_972_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_973_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_974_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_975_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_976_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_977_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_978_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_979_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_980_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_981_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_982_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_983_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_984_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_985_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_986_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_987_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_988_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_989_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_990_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_991_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_992_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_993_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_994_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_995_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_996_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_997_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_998_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_999_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1000_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1001_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1002_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1003_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1004_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1005_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1006_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1007_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1008_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1009_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1010_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1011_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1012_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1013_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1014_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1015_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1016_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1017_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1018_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1019_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1020_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1021_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1022_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1023_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1024_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1025_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1026_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1027_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1028_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1029_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1030_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1031_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1032_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1033_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1034_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1035_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1036_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1037_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1038_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1039_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1040_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1041_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1042_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1043_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1044_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1045_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1046_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1047_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1048_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1049_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1050_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1051_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1052_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1053_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1054_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1055_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1056_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1057_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1058_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1059_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1060_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1061_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1062_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1063_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1064_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1065_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1066_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1067_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1068_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1069_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1070_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1071_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1072_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1073_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1074_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1075_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1076_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1077_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1078_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1079_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1080_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1081_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1082_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1083_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1084_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1085_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1086_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1087_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1088_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1089_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1090_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1091_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1092_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1093_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1094_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1095_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1096_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1097_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1098_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
		DispDtl_qty_1099_p_PPanel.setRelateBeans(columnDispDtl_base_unit_cd, columnDispDtl_dec_place);
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

	protected MCColumnConfig getKeyColumnConfig() {
		if (isSame(getCndR().disp_typ(), Cnd_disp_typ_0.getActionCommand())) {
			return columnDispDtl_disp_00;
		}
		else if (isSame(getCndR().disp_typ(), Cnd_disp_typ_1.getActionCommand())) {
			return columnDispDtl_disp_01;
		}
		else if (isSame(getCndR().disp_typ(), Cnd_disp_typ_2.getActionCommand())) {
			return columnDispDtl_disp_02;
		}
		else if (isSame(getCndR().disp_typ(), Cnd_disp_typ_3.getActionCommand())) {
			return columnDispDtl_disp_03;
		}
		else if (isSame(getCndR().disp_typ(), Cnd_disp_typ_4.getActionCommand())) {
			return columnDispDtl_disp_04;
		}
		else if (isSame(getCndR().disp_typ(), Cnd_disp_typ_5.getActionCommand())) {
			return columnDispDtl_disp_05;
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
	public void doDispDtl_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDispDtl_NC(info);
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}

		DispDtlR r = DispDtlTable.getRow(index);
		if (isSame(_CndR.disp_typ(), Cnd_disp_typ_2.getActionCommand())
			&& (isSame(r.row_title_col(), _stkQty) || isSame(r.row_title_col(), _stkAmt))
				) {
			Btn_open_MSBEP0080.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBEP0080.setMode(getDefaultMode(Btn_open_MSBEP0080));
		}

		// 版管理ＦＬＧで版マスタ、版切替一覧への遷移ボタンを制御
		if (r.ver_flg()){
			Btn_open_MABSP0770.setMode(getDefaultMode(Btn_open_MABSP0770));
			Btn_open_MSBCP1160.setMode(getDefaultMode(Btn_open_MSBCP1160));
		}
		else{
			Btn_open_MABSP0770.setMode(MCMode.DISABLE);
			Btn_open_MSBCP1160.setMode(MCMode.DISABLE);
		}
	}

	@Override
	protected void listInit() {
		super.listInit();

		// 縦横変換クラスの初期化
		_vhM.initColGroup(this, DispDtlTable, getDtlL());
		_vhM.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。グループの下に空行を入れる場合は最後にnullを指定する。
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put(_grSchdQty, getDispString("label_gr_schd_qty"));
		map.put(_giSchdQty, getDispString("label_gi_schd_qty"));
		map.put(_grActQty, getDispString("label_gr_act_qty"));
		map.put(_giActQty, getDispString("label_gi_act_qty"));
		map.put(_stkQty, getDispString("label_stk_qty"));
		map.put(_stkAmt, getDispString("label_stk_amt"));
		_vhM.setRowTitles(map);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		// 縦リストの「HVAL」の項目。１番目の要素は全項目。２番目の要素は常に表示する項目。
		// ３番目以降の要素はチェックボックスの選択によって表示・非表示を切り替える項目。
		// グループの下に空行を入れる場合は空行も制御項目に追加する必要がある
		List<String[]> dispList = new LinkedList<>();
		dispList.add(new String[] {
				_grSchdQty, _giSchdQty,
				_grActQty,_giActQty,
				_stkQty, _stkAmt
		});

		dispList.add(new String[] {
				_grSchdQty, _giSchdQty,
				_grActQty,_giActQty,
				_stkQty, _stkAmt
		});
		dispList.add(new String[] {});
		dispList.add(new String[] {});
		// チェックボックス
		// n番目のチェックボックスの選択によって、dispListのn + 2番目の要素の項目の表示・非表示を切り替える

		MCCheckBox[] checkBox = new MCCheckBox[] {};
		// 縦横変換クラスに設定する
		_vhM.setDispInfo(checkBox, dispList);
	}

	protected String[] getDtlKeys() {
		ArrayList<String> keyCols = new ArrayList<String>();
		keyCols.add(DtlR.$itm_cd);
		keyCols.add(DtlR.$itm_sub1);
		keyCols.add(DtlR.$itm_sub2);
		keyCols.add(DtlR.$itm_sub3);
		keyCols.add(DtlR.$itm_nm);
		keyCols.add(DtlR.$ver_no);
		//keyCols.add(DtlR.$gd_cd); keyCols.add(DtlR.$gd_nm); keyCols.add(DtlR.$quality_typ); keyCols.add(DtlR.$quality_typ_nm);
		if (_CndR.sno1_flg()) keyCols.add(DtlR.$sno1);
		if (_CndR.sno2_flg()) keyCols.add(DtlR.$sno2);
		if (_CndR.sno3_flg()) keyCols.add(DtlR.$sno3);
		if (_CndR.sno4_flg()) keyCols.add(DtlR.$sno4);
		if (isSame(_CndR.disp_typ(), Cnd_disp_typ_0.getActionCommand())) {
			keyCols.add(DtlR.$loc_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_1.getActionCommand())) {
			keyCols.add(DtlR.$site_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_2.getActionCommand())) {
			keyCols.add(DtlR.$wg_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_3.getActionCommand())) {
			keyCols.add(DtlR.$lg_grp_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_4.getActionCommand())) {
			keyCols.add(DtlR.$alloc_grp_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_5.getActionCommand())) {
			keyCols.add(DtlR.$loc_grp_cd);
		}
		return keyCols.toArray(new String[0]);
	}

	/** 明細のデータ項目の配列を返します */
	protected MCColumnConfig[] getQtys() {
		if (_qtys == null) {
			_qtys = new MCColumnConfig[] {
					columnDispDtl_qty_00, columnDispDtl_qty_01, columnDispDtl_qty_02,
					columnDispDtl_qty_03, columnDispDtl_qty_04, columnDispDtl_qty_05,
					columnDispDtl_qty_06, columnDispDtl_qty_07, columnDispDtl_qty_08,
					columnDispDtl_qty_09, columnDispDtl_qty_10, columnDispDtl_qty_11,
					columnDispDtl_qty_12, columnDispDtl_qty_13, columnDispDtl_qty_14,
					columnDispDtl_qty_15, columnDispDtl_qty_16, columnDispDtl_qty_17,
					columnDispDtl_qty_18, columnDispDtl_qty_19, columnDispDtl_qty_20,
					columnDispDtl_qty_21, columnDispDtl_qty_22, columnDispDtl_qty_23,
					columnDispDtl_qty_24, columnDispDtl_qty_25, columnDispDtl_qty_26,
					columnDispDtl_qty_27, columnDispDtl_qty_28, columnDispDtl_qty_29,
					columnDispDtl_qty_30, columnDispDtl_qty_31, columnDispDtl_qty_32,
					columnDispDtl_qty_33, columnDispDtl_qty_34, columnDispDtl_qty_35,
					columnDispDtl_qty_36, columnDispDtl_qty_37, columnDispDtl_qty_38,
					columnDispDtl_qty_39, columnDispDtl_qty_40, columnDispDtl_qty_41,
					columnDispDtl_qty_42, columnDispDtl_qty_43, columnDispDtl_qty_44,
					columnDispDtl_qty_45, columnDispDtl_qty_46, columnDispDtl_qty_47,
					columnDispDtl_qty_48, columnDispDtl_qty_49, columnDispDtl_qty_50,
					columnDispDtl_qty_51, columnDispDtl_qty_52, columnDispDtl_qty_53,
					columnDispDtl_qty_54, columnDispDtl_qty_55, columnDispDtl_qty_56,
					columnDispDtl_qty_57, columnDispDtl_qty_58, columnDispDtl_qty_59,
					columnDispDtl_qty_60, columnDispDtl_qty_61, columnDispDtl_qty_62,
					columnDispDtl_qty_63, columnDispDtl_qty_64, columnDispDtl_qty_65,
					columnDispDtl_qty_66, columnDispDtl_qty_67, columnDispDtl_qty_68,
					columnDispDtl_qty_69, columnDispDtl_qty_70, columnDispDtl_qty_71,
					columnDispDtl_qty_72, columnDispDtl_qty_73, columnDispDtl_qty_74,
					columnDispDtl_qty_75, columnDispDtl_qty_76, columnDispDtl_qty_77,
					columnDispDtl_qty_78, columnDispDtl_qty_79, columnDispDtl_qty_80,
					columnDispDtl_qty_81, columnDispDtl_qty_82, columnDispDtl_qty_83,
					columnDispDtl_qty_84, columnDispDtl_qty_85, columnDispDtl_qty_86,
					columnDispDtl_qty_87, columnDispDtl_qty_88, columnDispDtl_qty_89,
					columnDispDtl_qty_90, columnDispDtl_qty_91, columnDispDtl_qty_92,
					columnDispDtl_qty_93, columnDispDtl_qty_94, columnDispDtl_qty_95,
					columnDispDtl_qty_96, columnDispDtl_qty_97, columnDispDtl_qty_98,
					columnDispDtl_qty_99, columnDispDtl_qty_100, columnDispDtl_qty_101,
					columnDispDtl_qty_102, columnDispDtl_qty_103, columnDispDtl_qty_104,
					columnDispDtl_qty_105, columnDispDtl_qty_106, columnDispDtl_qty_107,
					columnDispDtl_qty_108, columnDispDtl_qty_109, columnDispDtl_qty_110,
					columnDispDtl_qty_111, columnDispDtl_qty_112, columnDispDtl_qty_113,
					columnDispDtl_qty_114, columnDispDtl_qty_115, columnDispDtl_qty_116,
					columnDispDtl_qty_117, columnDispDtl_qty_118, columnDispDtl_qty_119,
					columnDispDtl_qty_120, columnDispDtl_qty_121, columnDispDtl_qty_122,
					columnDispDtl_qty_123, columnDispDtl_qty_124, columnDispDtl_qty_125,
					columnDispDtl_qty_126, columnDispDtl_qty_127, columnDispDtl_qty_128,
					columnDispDtl_qty_129, columnDispDtl_qty_130, columnDispDtl_qty_131,
					columnDispDtl_qty_132, columnDispDtl_qty_133, columnDispDtl_qty_134,
					columnDispDtl_qty_135, columnDispDtl_qty_136, columnDispDtl_qty_137,
					columnDispDtl_qty_138, columnDispDtl_qty_139, columnDispDtl_qty_140,
					columnDispDtl_qty_141, columnDispDtl_qty_142, columnDispDtl_qty_143,
					columnDispDtl_qty_144, columnDispDtl_qty_145, columnDispDtl_qty_146,
					columnDispDtl_qty_147, columnDispDtl_qty_148, columnDispDtl_qty_149,
					columnDispDtl_qty_150, columnDispDtl_qty_151, columnDispDtl_qty_152,
					columnDispDtl_qty_153, columnDispDtl_qty_154, columnDispDtl_qty_155,
					columnDispDtl_qty_156, columnDispDtl_qty_157, columnDispDtl_qty_158,
					columnDispDtl_qty_159, columnDispDtl_qty_160, columnDispDtl_qty_161,
					columnDispDtl_qty_162, columnDispDtl_qty_163, columnDispDtl_qty_164,
					columnDispDtl_qty_165, columnDispDtl_qty_166, columnDispDtl_qty_167,
					columnDispDtl_qty_168, columnDispDtl_qty_169, columnDispDtl_qty_170,
					columnDispDtl_qty_171, columnDispDtl_qty_172, columnDispDtl_qty_173,
					columnDispDtl_qty_174, columnDispDtl_qty_175, columnDispDtl_qty_176,
					columnDispDtl_qty_177, columnDispDtl_qty_178, columnDispDtl_qty_179,
					columnDispDtl_qty_180, columnDispDtl_qty_181, columnDispDtl_qty_182,
					columnDispDtl_qty_183, columnDispDtl_qty_184, columnDispDtl_qty_185,
					columnDispDtl_qty_186, columnDispDtl_qty_187, columnDispDtl_qty_188,
					columnDispDtl_qty_189, columnDispDtl_qty_190, columnDispDtl_qty_191,
					columnDispDtl_qty_192, columnDispDtl_qty_193, columnDispDtl_qty_194,
					columnDispDtl_qty_195, columnDispDtl_qty_196, columnDispDtl_qty_197,
					columnDispDtl_qty_198, columnDispDtl_qty_199, columnDispDtl_qty_200,
					columnDispDtl_qty_201, columnDispDtl_qty_202, columnDispDtl_qty_203,
					columnDispDtl_qty_204, columnDispDtl_qty_205, columnDispDtl_qty_206,
					columnDispDtl_qty_207, columnDispDtl_qty_208, columnDispDtl_qty_209,
					columnDispDtl_qty_210, columnDispDtl_qty_211, columnDispDtl_qty_212,
					columnDispDtl_qty_213, columnDispDtl_qty_214, columnDispDtl_qty_215,
					columnDispDtl_qty_216, columnDispDtl_qty_217, columnDispDtl_qty_218,
					columnDispDtl_qty_219, columnDispDtl_qty_220, columnDispDtl_qty_221,
					columnDispDtl_qty_222, columnDispDtl_qty_223, columnDispDtl_qty_224,
					columnDispDtl_qty_225, columnDispDtl_qty_226, columnDispDtl_qty_227,
					columnDispDtl_qty_228, columnDispDtl_qty_229, columnDispDtl_qty_230,
					columnDispDtl_qty_231, columnDispDtl_qty_232, columnDispDtl_qty_233,
					columnDispDtl_qty_234, columnDispDtl_qty_235, columnDispDtl_qty_236,
					columnDispDtl_qty_237, columnDispDtl_qty_238, columnDispDtl_qty_239,
					columnDispDtl_qty_240, columnDispDtl_qty_241, columnDispDtl_qty_242,
					columnDispDtl_qty_243, columnDispDtl_qty_244, columnDispDtl_qty_245,
					columnDispDtl_qty_246, columnDispDtl_qty_247, columnDispDtl_qty_248,
					columnDispDtl_qty_249, columnDispDtl_qty_250, columnDispDtl_qty_251,
					columnDispDtl_qty_252, columnDispDtl_qty_253, columnDispDtl_qty_254,
					columnDispDtl_qty_255, columnDispDtl_qty_256, columnDispDtl_qty_257,
					columnDispDtl_qty_258, columnDispDtl_qty_259, columnDispDtl_qty_260,
					columnDispDtl_qty_261, columnDispDtl_qty_262, columnDispDtl_qty_263,
					columnDispDtl_qty_264, columnDispDtl_qty_265, columnDispDtl_qty_266,
					columnDispDtl_qty_267, columnDispDtl_qty_268, columnDispDtl_qty_269,
					columnDispDtl_qty_270, columnDispDtl_qty_271, columnDispDtl_qty_272,
					columnDispDtl_qty_273, columnDispDtl_qty_274, columnDispDtl_qty_275,
					columnDispDtl_qty_276, columnDispDtl_qty_277, columnDispDtl_qty_278,
					columnDispDtl_qty_279, columnDispDtl_qty_280, columnDispDtl_qty_281,
					columnDispDtl_qty_282, columnDispDtl_qty_283, columnDispDtl_qty_284,
					columnDispDtl_qty_285, columnDispDtl_qty_286, columnDispDtl_qty_287,
					columnDispDtl_qty_288, columnDispDtl_qty_289, columnDispDtl_qty_290,
					columnDispDtl_qty_291, columnDispDtl_qty_292, columnDispDtl_qty_293,
					columnDispDtl_qty_294, columnDispDtl_qty_295, columnDispDtl_qty_296,
					columnDispDtl_qty_297, columnDispDtl_qty_298, columnDispDtl_qty_299,
					columnDispDtl_qty_300, columnDispDtl_qty_301, columnDispDtl_qty_302,
					columnDispDtl_qty_303, columnDispDtl_qty_304, columnDispDtl_qty_305,
					columnDispDtl_qty_306, columnDispDtl_qty_307, columnDispDtl_qty_308,
					columnDispDtl_qty_309, columnDispDtl_qty_310, columnDispDtl_qty_311,
					columnDispDtl_qty_312, columnDispDtl_qty_313, columnDispDtl_qty_314,
					columnDispDtl_qty_315, columnDispDtl_qty_316, columnDispDtl_qty_317,
					columnDispDtl_qty_318, columnDispDtl_qty_319, columnDispDtl_qty_320,
					columnDispDtl_qty_321, columnDispDtl_qty_322, columnDispDtl_qty_323,
					columnDispDtl_qty_324, columnDispDtl_qty_325, columnDispDtl_qty_326,
					columnDispDtl_qty_327, columnDispDtl_qty_328, columnDispDtl_qty_329,
					columnDispDtl_qty_330, columnDispDtl_qty_331, columnDispDtl_qty_332,
					columnDispDtl_qty_333, columnDispDtl_qty_334, columnDispDtl_qty_335,
					columnDispDtl_qty_336, columnDispDtl_qty_337, columnDispDtl_qty_338,
					columnDispDtl_qty_339, columnDispDtl_qty_340, columnDispDtl_qty_341,
					columnDispDtl_qty_342, columnDispDtl_qty_343, columnDispDtl_qty_344,
					columnDispDtl_qty_345, columnDispDtl_qty_346, columnDispDtl_qty_347,
					columnDispDtl_qty_348, columnDispDtl_qty_349, columnDispDtl_qty_350,
					columnDispDtl_qty_351, columnDispDtl_qty_352, columnDispDtl_qty_353,
					columnDispDtl_qty_354, columnDispDtl_qty_355, columnDispDtl_qty_356,
					columnDispDtl_qty_357, columnDispDtl_qty_358, columnDispDtl_qty_359,
					columnDispDtl_qty_360, columnDispDtl_qty_361, columnDispDtl_qty_362,
					columnDispDtl_qty_363, columnDispDtl_qty_364, columnDispDtl_qty_365,
					columnDispDtl_qty_366, columnDispDtl_qty_367, columnDispDtl_qty_368,
					columnDispDtl_qty_369, columnDispDtl_qty_370, columnDispDtl_qty_371,
					columnDispDtl_qty_372, columnDispDtl_qty_373, columnDispDtl_qty_374,
					columnDispDtl_qty_375, columnDispDtl_qty_376, columnDispDtl_qty_377,
					columnDispDtl_qty_378, columnDispDtl_qty_379, columnDispDtl_qty_380,
					columnDispDtl_qty_381, columnDispDtl_qty_382, columnDispDtl_qty_383,
					columnDispDtl_qty_384, columnDispDtl_qty_385, columnDispDtl_qty_386,
					columnDispDtl_qty_387, columnDispDtl_qty_388, columnDispDtl_qty_389,
					columnDispDtl_qty_390, columnDispDtl_qty_391, columnDispDtl_qty_392,
					columnDispDtl_qty_393, columnDispDtl_qty_394, columnDispDtl_qty_395,
					columnDispDtl_qty_396, columnDispDtl_qty_397, columnDispDtl_qty_398,
					columnDispDtl_qty_399, columnDispDtl_qty_400, columnDispDtl_qty_401,
					columnDispDtl_qty_402, columnDispDtl_qty_403, columnDispDtl_qty_404,
					columnDispDtl_qty_405, columnDispDtl_qty_406, columnDispDtl_qty_407,
					columnDispDtl_qty_408, columnDispDtl_qty_409, columnDispDtl_qty_410,
					columnDispDtl_qty_411, columnDispDtl_qty_412, columnDispDtl_qty_413,
					columnDispDtl_qty_414, columnDispDtl_qty_415, columnDispDtl_qty_416,
					columnDispDtl_qty_417, columnDispDtl_qty_418, columnDispDtl_qty_419,
					columnDispDtl_qty_420, columnDispDtl_qty_421, columnDispDtl_qty_422,
					columnDispDtl_qty_423, columnDispDtl_qty_424, columnDispDtl_qty_425,
					columnDispDtl_qty_426, columnDispDtl_qty_427, columnDispDtl_qty_428,
					columnDispDtl_qty_429, columnDispDtl_qty_430, columnDispDtl_qty_431,
					columnDispDtl_qty_432, columnDispDtl_qty_433, columnDispDtl_qty_434,
					columnDispDtl_qty_435, columnDispDtl_qty_436, columnDispDtl_qty_437,
					columnDispDtl_qty_438, columnDispDtl_qty_439, columnDispDtl_qty_440,
					columnDispDtl_qty_441, columnDispDtl_qty_442, columnDispDtl_qty_443,
					columnDispDtl_qty_444, columnDispDtl_qty_445, columnDispDtl_qty_446,
					columnDispDtl_qty_447, columnDispDtl_qty_448, columnDispDtl_qty_449,
					columnDispDtl_qty_450, columnDispDtl_qty_451, columnDispDtl_qty_452,
					columnDispDtl_qty_453, columnDispDtl_qty_454, columnDispDtl_qty_455,
					columnDispDtl_qty_456, columnDispDtl_qty_457, columnDispDtl_qty_458,
					columnDispDtl_qty_459, columnDispDtl_qty_460, columnDispDtl_qty_461,
					columnDispDtl_qty_462, columnDispDtl_qty_463, columnDispDtl_qty_464,
					columnDispDtl_qty_465, columnDispDtl_qty_466, columnDispDtl_qty_467,
					columnDispDtl_qty_468, columnDispDtl_qty_469, columnDispDtl_qty_470,
					columnDispDtl_qty_471, columnDispDtl_qty_472, columnDispDtl_qty_473,
					columnDispDtl_qty_474, columnDispDtl_qty_475, columnDispDtl_qty_476,
					columnDispDtl_qty_477, columnDispDtl_qty_478, columnDispDtl_qty_479,
					columnDispDtl_qty_480, columnDispDtl_qty_481, columnDispDtl_qty_482,
					columnDispDtl_qty_483, columnDispDtl_qty_484, columnDispDtl_qty_485,
					columnDispDtl_qty_486, columnDispDtl_qty_487, columnDispDtl_qty_488,
					columnDispDtl_qty_489, columnDispDtl_qty_490, columnDispDtl_qty_491,
					columnDispDtl_qty_492, columnDispDtl_qty_493, columnDispDtl_qty_494,
					columnDispDtl_qty_495, columnDispDtl_qty_496, columnDispDtl_qty_497,
					columnDispDtl_qty_498, columnDispDtl_qty_499, columnDispDtl_qty_500,
					columnDispDtl_qty_501, columnDispDtl_qty_502, columnDispDtl_qty_503,
					columnDispDtl_qty_504, columnDispDtl_qty_505, columnDispDtl_qty_506,
					columnDispDtl_qty_507, columnDispDtl_qty_508, columnDispDtl_qty_509,
					columnDispDtl_qty_510, columnDispDtl_qty_511, columnDispDtl_qty_512,
					columnDispDtl_qty_513, columnDispDtl_qty_514, columnDispDtl_qty_515,
					columnDispDtl_qty_516, columnDispDtl_qty_517, columnDispDtl_qty_518,
					columnDispDtl_qty_519, columnDispDtl_qty_520, columnDispDtl_qty_521,
					columnDispDtl_qty_522, columnDispDtl_qty_523, columnDispDtl_qty_524,
					columnDispDtl_qty_525, columnDispDtl_qty_526, columnDispDtl_qty_527,
					columnDispDtl_qty_528, columnDispDtl_qty_529, columnDispDtl_qty_530,
					columnDispDtl_qty_531, columnDispDtl_qty_532, columnDispDtl_qty_533,
					columnDispDtl_qty_534, columnDispDtl_qty_535, columnDispDtl_qty_536,
					columnDispDtl_qty_537, columnDispDtl_qty_538, columnDispDtl_qty_539,
					columnDispDtl_qty_540, columnDispDtl_qty_541, columnDispDtl_qty_542,
					columnDispDtl_qty_543, columnDispDtl_qty_544, columnDispDtl_qty_545,
					columnDispDtl_qty_546, columnDispDtl_qty_547, columnDispDtl_qty_548,
					columnDispDtl_qty_549, columnDispDtl_qty_550, columnDispDtl_qty_551,
					columnDispDtl_qty_552, columnDispDtl_qty_553, columnDispDtl_qty_554,
					columnDispDtl_qty_555, columnDispDtl_qty_556, columnDispDtl_qty_557,
					columnDispDtl_qty_558, columnDispDtl_qty_559, columnDispDtl_qty_560,
					columnDispDtl_qty_561, columnDispDtl_qty_562, columnDispDtl_qty_563,
					columnDispDtl_qty_564, columnDispDtl_qty_565, columnDispDtl_qty_566,
					columnDispDtl_qty_567, columnDispDtl_qty_568, columnDispDtl_qty_569,
					columnDispDtl_qty_570, columnDispDtl_qty_571, columnDispDtl_qty_572,
					columnDispDtl_qty_573, columnDispDtl_qty_574, columnDispDtl_qty_575,
					columnDispDtl_qty_576, columnDispDtl_qty_577, columnDispDtl_qty_578,
					columnDispDtl_qty_579, columnDispDtl_qty_580, columnDispDtl_qty_581,
					columnDispDtl_qty_582, columnDispDtl_qty_583, columnDispDtl_qty_584,
					columnDispDtl_qty_585, columnDispDtl_qty_586, columnDispDtl_qty_587,
					columnDispDtl_qty_588, columnDispDtl_qty_589, columnDispDtl_qty_590,
					columnDispDtl_qty_591, columnDispDtl_qty_592, columnDispDtl_qty_593,
					columnDispDtl_qty_594, columnDispDtl_qty_595, columnDispDtl_qty_596,
					columnDispDtl_qty_597, columnDispDtl_qty_598, columnDispDtl_qty_599,
					columnDispDtl_qty_600, columnDispDtl_qty_601, columnDispDtl_qty_602,
					columnDispDtl_qty_603, columnDispDtl_qty_604, columnDispDtl_qty_605,
					columnDispDtl_qty_606, columnDispDtl_qty_607, columnDispDtl_qty_608,
					columnDispDtl_qty_609, columnDispDtl_qty_610, columnDispDtl_qty_611,
					columnDispDtl_qty_612, columnDispDtl_qty_613, columnDispDtl_qty_614,
					columnDispDtl_qty_615, columnDispDtl_qty_616, columnDispDtl_qty_617,
					columnDispDtl_qty_618, columnDispDtl_qty_619, columnDispDtl_qty_620,
					columnDispDtl_qty_621, columnDispDtl_qty_622, columnDispDtl_qty_623,
					columnDispDtl_qty_624, columnDispDtl_qty_625, columnDispDtl_qty_626,
					columnDispDtl_qty_627, columnDispDtl_qty_628, columnDispDtl_qty_629,
					columnDispDtl_qty_630, columnDispDtl_qty_631, columnDispDtl_qty_632,
					columnDispDtl_qty_633, columnDispDtl_qty_634, columnDispDtl_qty_635,
					columnDispDtl_qty_636, columnDispDtl_qty_637, columnDispDtl_qty_638,
					columnDispDtl_qty_639, columnDispDtl_qty_640, columnDispDtl_qty_641,
					columnDispDtl_qty_642, columnDispDtl_qty_643, columnDispDtl_qty_644,
					columnDispDtl_qty_645, columnDispDtl_qty_646, columnDispDtl_qty_647,
					columnDispDtl_qty_648, columnDispDtl_qty_649, columnDispDtl_qty_650,
					columnDispDtl_qty_651, columnDispDtl_qty_652, columnDispDtl_qty_653,
					columnDispDtl_qty_654, columnDispDtl_qty_655, columnDispDtl_qty_656,
					columnDispDtl_qty_657, columnDispDtl_qty_658, columnDispDtl_qty_659,
					columnDispDtl_qty_660, columnDispDtl_qty_661, columnDispDtl_qty_662,
					columnDispDtl_qty_663, columnDispDtl_qty_664, columnDispDtl_qty_665,
					columnDispDtl_qty_666, columnDispDtl_qty_667, columnDispDtl_qty_668,
					columnDispDtl_qty_669, columnDispDtl_qty_670, columnDispDtl_qty_671,
					columnDispDtl_qty_672, columnDispDtl_qty_673, columnDispDtl_qty_674,
					columnDispDtl_qty_675, columnDispDtl_qty_676, columnDispDtl_qty_677,
					columnDispDtl_qty_678, columnDispDtl_qty_679, columnDispDtl_qty_680,
					columnDispDtl_qty_681, columnDispDtl_qty_682, columnDispDtl_qty_683,
					columnDispDtl_qty_684, columnDispDtl_qty_685, columnDispDtl_qty_686,
					columnDispDtl_qty_687, columnDispDtl_qty_688, columnDispDtl_qty_689,
					columnDispDtl_qty_690, columnDispDtl_qty_691, columnDispDtl_qty_692,
					columnDispDtl_qty_693, columnDispDtl_qty_694, columnDispDtl_qty_695,
					columnDispDtl_qty_696, columnDispDtl_qty_697, columnDispDtl_qty_698,
					columnDispDtl_qty_699, columnDispDtl_qty_700, columnDispDtl_qty_701,
					columnDispDtl_qty_702, columnDispDtl_qty_703, columnDispDtl_qty_704,
					columnDispDtl_qty_705, columnDispDtl_qty_706, columnDispDtl_qty_707,
					columnDispDtl_qty_708, columnDispDtl_qty_709, columnDispDtl_qty_710,
					columnDispDtl_qty_711, columnDispDtl_qty_712, columnDispDtl_qty_713,
					columnDispDtl_qty_714, columnDispDtl_qty_715, columnDispDtl_qty_716,
					columnDispDtl_qty_717, columnDispDtl_qty_718, columnDispDtl_qty_719,
					columnDispDtl_qty_720, columnDispDtl_qty_721, columnDispDtl_qty_722,
					columnDispDtl_qty_723, columnDispDtl_qty_724, columnDispDtl_qty_725,
					columnDispDtl_qty_726, columnDispDtl_qty_727, columnDispDtl_qty_728,
					columnDispDtl_qty_729, columnDispDtl_qty_730, columnDispDtl_qty_731,
					columnDispDtl_qty_732, columnDispDtl_qty_733, columnDispDtl_qty_734,
					columnDispDtl_qty_735, columnDispDtl_qty_736, columnDispDtl_qty_737,
					columnDispDtl_qty_738, columnDispDtl_qty_739, columnDispDtl_qty_740,
					columnDispDtl_qty_741, columnDispDtl_qty_742, columnDispDtl_qty_743,
					columnDispDtl_qty_744, columnDispDtl_qty_745, columnDispDtl_qty_746,
					columnDispDtl_qty_747, columnDispDtl_qty_748, columnDispDtl_qty_749,
					columnDispDtl_qty_750, columnDispDtl_qty_751, columnDispDtl_qty_752,
					columnDispDtl_qty_753, columnDispDtl_qty_754, columnDispDtl_qty_755,
					columnDispDtl_qty_756, columnDispDtl_qty_757, columnDispDtl_qty_758,
					columnDispDtl_qty_759, columnDispDtl_qty_760, columnDispDtl_qty_761,
					columnDispDtl_qty_762, columnDispDtl_qty_763, columnDispDtl_qty_764,
					columnDispDtl_qty_765, columnDispDtl_qty_766, columnDispDtl_qty_767,
					columnDispDtl_qty_768, columnDispDtl_qty_769, columnDispDtl_qty_770,
					columnDispDtl_qty_771, columnDispDtl_qty_772, columnDispDtl_qty_773,
					columnDispDtl_qty_774, columnDispDtl_qty_775, columnDispDtl_qty_776,
					columnDispDtl_qty_777, columnDispDtl_qty_778, columnDispDtl_qty_779,
					columnDispDtl_qty_780, columnDispDtl_qty_781, columnDispDtl_qty_782,
					columnDispDtl_qty_783, columnDispDtl_qty_784, columnDispDtl_qty_785,
					columnDispDtl_qty_786, columnDispDtl_qty_787, columnDispDtl_qty_788,
					columnDispDtl_qty_789, columnDispDtl_qty_790, columnDispDtl_qty_791,
					columnDispDtl_qty_792, columnDispDtl_qty_793, columnDispDtl_qty_794,
					columnDispDtl_qty_795, columnDispDtl_qty_796, columnDispDtl_qty_797,
					columnDispDtl_qty_798, columnDispDtl_qty_799, columnDispDtl_qty_800,
					columnDispDtl_qty_801, columnDispDtl_qty_802, columnDispDtl_qty_803,
					columnDispDtl_qty_804, columnDispDtl_qty_805, columnDispDtl_qty_806,
					columnDispDtl_qty_807, columnDispDtl_qty_808, columnDispDtl_qty_809,
					columnDispDtl_qty_810, columnDispDtl_qty_811, columnDispDtl_qty_812,
					columnDispDtl_qty_813, columnDispDtl_qty_814, columnDispDtl_qty_815,
					columnDispDtl_qty_816, columnDispDtl_qty_817, columnDispDtl_qty_818,
					columnDispDtl_qty_819, columnDispDtl_qty_820, columnDispDtl_qty_821,
					columnDispDtl_qty_822, columnDispDtl_qty_823, columnDispDtl_qty_824,
					columnDispDtl_qty_825, columnDispDtl_qty_826, columnDispDtl_qty_827,
					columnDispDtl_qty_828, columnDispDtl_qty_829, columnDispDtl_qty_830,
					columnDispDtl_qty_831, columnDispDtl_qty_832, columnDispDtl_qty_833,
					columnDispDtl_qty_834, columnDispDtl_qty_835, columnDispDtl_qty_836,
					columnDispDtl_qty_837, columnDispDtl_qty_838, columnDispDtl_qty_839,
					columnDispDtl_qty_840, columnDispDtl_qty_841, columnDispDtl_qty_842,
					columnDispDtl_qty_843, columnDispDtl_qty_844, columnDispDtl_qty_845,
					columnDispDtl_qty_846, columnDispDtl_qty_847, columnDispDtl_qty_848,
					columnDispDtl_qty_849, columnDispDtl_qty_850, columnDispDtl_qty_851,
					columnDispDtl_qty_852, columnDispDtl_qty_853, columnDispDtl_qty_854,
					columnDispDtl_qty_855, columnDispDtl_qty_856, columnDispDtl_qty_857,
					columnDispDtl_qty_858, columnDispDtl_qty_859, columnDispDtl_qty_860,
					columnDispDtl_qty_861, columnDispDtl_qty_862, columnDispDtl_qty_863,
					columnDispDtl_qty_864, columnDispDtl_qty_865, columnDispDtl_qty_866,
					columnDispDtl_qty_867, columnDispDtl_qty_868, columnDispDtl_qty_869,
					columnDispDtl_qty_870, columnDispDtl_qty_871, columnDispDtl_qty_872,
					columnDispDtl_qty_873, columnDispDtl_qty_874, columnDispDtl_qty_875,
					columnDispDtl_qty_876, columnDispDtl_qty_877, columnDispDtl_qty_878,
					columnDispDtl_qty_879, columnDispDtl_qty_880, columnDispDtl_qty_881,
					columnDispDtl_qty_882, columnDispDtl_qty_883, columnDispDtl_qty_884,
					columnDispDtl_qty_885, columnDispDtl_qty_886, columnDispDtl_qty_887,
					columnDispDtl_qty_888, columnDispDtl_qty_889, columnDispDtl_qty_890,
					columnDispDtl_qty_891, columnDispDtl_qty_892, columnDispDtl_qty_893,
					columnDispDtl_qty_894, columnDispDtl_qty_895, columnDispDtl_qty_896,
					columnDispDtl_qty_897, columnDispDtl_qty_898, columnDispDtl_qty_899,
					columnDispDtl_qty_900, columnDispDtl_qty_901, columnDispDtl_qty_902,
					columnDispDtl_qty_903, columnDispDtl_qty_904, columnDispDtl_qty_905,
					columnDispDtl_qty_906, columnDispDtl_qty_907, columnDispDtl_qty_908,
					columnDispDtl_qty_909, columnDispDtl_qty_910, columnDispDtl_qty_911,
					columnDispDtl_qty_912, columnDispDtl_qty_913, columnDispDtl_qty_914,
					columnDispDtl_qty_915, columnDispDtl_qty_916, columnDispDtl_qty_917,
					columnDispDtl_qty_918, columnDispDtl_qty_919, columnDispDtl_qty_920,
					columnDispDtl_qty_921, columnDispDtl_qty_922, columnDispDtl_qty_923,
					columnDispDtl_qty_924, columnDispDtl_qty_925, columnDispDtl_qty_926,
					columnDispDtl_qty_927, columnDispDtl_qty_928, columnDispDtl_qty_929,
					columnDispDtl_qty_930, columnDispDtl_qty_931, columnDispDtl_qty_932,
					columnDispDtl_qty_933, columnDispDtl_qty_934, columnDispDtl_qty_935,
					columnDispDtl_qty_936, columnDispDtl_qty_937, columnDispDtl_qty_938,
					columnDispDtl_qty_939, columnDispDtl_qty_940, columnDispDtl_qty_941,
					columnDispDtl_qty_942, columnDispDtl_qty_943, columnDispDtl_qty_944,
					columnDispDtl_qty_945, columnDispDtl_qty_946, columnDispDtl_qty_947,
					columnDispDtl_qty_948, columnDispDtl_qty_949, columnDispDtl_qty_950,
					columnDispDtl_qty_951, columnDispDtl_qty_952, columnDispDtl_qty_953,
					columnDispDtl_qty_954, columnDispDtl_qty_955, columnDispDtl_qty_956,
					columnDispDtl_qty_957, columnDispDtl_qty_958, columnDispDtl_qty_959,
					columnDispDtl_qty_960, columnDispDtl_qty_961, columnDispDtl_qty_962,
					columnDispDtl_qty_963, columnDispDtl_qty_964, columnDispDtl_qty_965,
					columnDispDtl_qty_966, columnDispDtl_qty_967, columnDispDtl_qty_968,
					columnDispDtl_qty_969, columnDispDtl_qty_970, columnDispDtl_qty_971,
					columnDispDtl_qty_972, columnDispDtl_qty_973, columnDispDtl_qty_974,
					columnDispDtl_qty_975, columnDispDtl_qty_976, columnDispDtl_qty_977,
					columnDispDtl_qty_978, columnDispDtl_qty_979, columnDispDtl_qty_980,
					columnDispDtl_qty_981, columnDispDtl_qty_982, columnDispDtl_qty_983,
					columnDispDtl_qty_984, columnDispDtl_qty_985, columnDispDtl_qty_986,
					columnDispDtl_qty_987, columnDispDtl_qty_988, columnDispDtl_qty_989,
					columnDispDtl_qty_990, columnDispDtl_qty_991, columnDispDtl_qty_992,
					columnDispDtl_qty_993, columnDispDtl_qty_994, columnDispDtl_qty_995,
					columnDispDtl_qty_996, columnDispDtl_qty_997, columnDispDtl_qty_998,
					columnDispDtl_qty_999, columnDispDtl_qty_1000, columnDispDtl_qty_1001,
					columnDispDtl_qty_1002, columnDispDtl_qty_1003, columnDispDtl_qty_1004,
					columnDispDtl_qty_1005, columnDispDtl_qty_1006, columnDispDtl_qty_1007,
					columnDispDtl_qty_1008, columnDispDtl_qty_1009, columnDispDtl_qty_1010,
					columnDispDtl_qty_1011, columnDispDtl_qty_1012, columnDispDtl_qty_1013,
					columnDispDtl_qty_1014, columnDispDtl_qty_1015, columnDispDtl_qty_1016,
					columnDispDtl_qty_1017, columnDispDtl_qty_1018, columnDispDtl_qty_1019,
					columnDispDtl_qty_1020, columnDispDtl_qty_1021, columnDispDtl_qty_1022,
					columnDispDtl_qty_1023, columnDispDtl_qty_1024, columnDispDtl_qty_1025,
					columnDispDtl_qty_1026, columnDispDtl_qty_1027, columnDispDtl_qty_1028,
					columnDispDtl_qty_1029, columnDispDtl_qty_1030, columnDispDtl_qty_1031,
					columnDispDtl_qty_1032, columnDispDtl_qty_1033, columnDispDtl_qty_1034,
					columnDispDtl_qty_1035, columnDispDtl_qty_1036, columnDispDtl_qty_1037,
					columnDispDtl_qty_1038, columnDispDtl_qty_1039, columnDispDtl_qty_1040,
					columnDispDtl_qty_1041, columnDispDtl_qty_1042, columnDispDtl_qty_1043,
					columnDispDtl_qty_1044, columnDispDtl_qty_1045, columnDispDtl_qty_1046,
					columnDispDtl_qty_1047, columnDispDtl_qty_1048, columnDispDtl_qty_1049,
					columnDispDtl_qty_1050, columnDispDtl_qty_1051, columnDispDtl_qty_1052,
					columnDispDtl_qty_1053, columnDispDtl_qty_1054, columnDispDtl_qty_1055,
					columnDispDtl_qty_1056, columnDispDtl_qty_1057, columnDispDtl_qty_1058,
					columnDispDtl_qty_1059, columnDispDtl_qty_1060, columnDispDtl_qty_1061,
					columnDispDtl_qty_1062, columnDispDtl_qty_1063, columnDispDtl_qty_1064,
					columnDispDtl_qty_1065, columnDispDtl_qty_1066, columnDispDtl_qty_1067,
					columnDispDtl_qty_1068, columnDispDtl_qty_1069, columnDispDtl_qty_1070,
					columnDispDtl_qty_1071, columnDispDtl_qty_1072, columnDispDtl_qty_1073,
					columnDispDtl_qty_1074, columnDispDtl_qty_1075, columnDispDtl_qty_1076,
					columnDispDtl_qty_1077, columnDispDtl_qty_1078, columnDispDtl_qty_1079,
					columnDispDtl_qty_1080, columnDispDtl_qty_1081, columnDispDtl_qty_1082,
					columnDispDtl_qty_1083, columnDispDtl_qty_1084, columnDispDtl_qty_1085,
					columnDispDtl_qty_1086, columnDispDtl_qty_1087, columnDispDtl_qty_1088,
					columnDispDtl_qty_1089, columnDispDtl_qty_1090, columnDispDtl_qty_1091,
					columnDispDtl_qty_1092, columnDispDtl_qty_1093, columnDispDtl_qty_1094,
					columnDispDtl_qty_1095, columnDispDtl_qty_1096, columnDispDtl_qty_1097,
					columnDispDtl_qty_1098, columnDispDtl_qty_1099
			};
		}
		return _qtys;
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		// キー列以外のソートを無効にする
		for (MCColumnConfig c : DispDtlTable.getColumnConfigs()) {
			if (c == columnDispDtl_disp_itm
				|| c == columnDispDtl_disp_00
				|| c == columnDispDtl_disp_01
				|| c == columnDispDtl_disp_02
				|| c == columnDispDtl_disp_03
				|| c == columnDispDtl_disp_04
				|| c == columnDispDtl_disp_05) {
				continue;
			}
			c.setSortable(false);
		}
		// 日付ラベルを順に表示するため、カラム順の変更はさせない
		DispDtlTable.setReorderingAllowed(false);
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();

		// キー列をソート対象にする
		DispDtlTable.addSortColumn(columnDispDtl_disp_itm, SortType.ASC);
		DispDtlTable.addSortColumn(columnDispDtl_disp_00, SortType.ASC);
		DispDtlTable.addSortColumn(columnDispDtl_disp_01, SortType.ASC);
		DispDtlTable.addSortColumn(columnDispDtl_disp_02, SortType.ASC);
		DispDtlTable.addSortColumn(columnDispDtl_disp_03, SortType.ASC);
		DispDtlTable.addSortColumn(columnDispDtl_disp_04, SortType.ASC);
		DispDtlTable.addSortColumn(columnDispDtl_disp_05, SortType.ASC);
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (getDtlL().isEmpty()) {
			return false;
		}
		else {
			MCSortPolicy newPolicy = new MCSortPolicy();
			String[] names = policy.nameArray();
			SortType[] types = policy.typeArray();

			int i = 0;
			boolean itm_flg = false;
			for (String name :names) {
				if (isSame(name, DispDtlR.$disp_itm)) {
					newPolicy.add(types[i], DispDtlR.$itm_p);
					itm_flg = true;
				}
				if (isSame(name, DispDtlR.$disp_00)) {
					newPolicy.add(types[i], DispDtlR.$loc_cd);
				}
				if (isSame(name, DispDtlR.$disp_01)) {
					newPolicy.add(types[i], DispDtlR.$site_cd);
				}
				if (isSame(name, DispDtlR.$disp_02)) {
					newPolicy.add(types[i], DispDtlR.$wg_cd);
				}
				if (isSame(name, DispDtlR.$disp_03)) {
					newPolicy.add(types[i], DispDtlR.$lg_grp_cd);
				}
				if (isSame(name, DispDtlR.$disp_04)) {
					newPolicy.add(types[i], DispDtlR.$alloc_grp_cd);
				}
				if (isSame(name, DispDtlR.$disp_05)) {
					newPolicy.add(types[i], DispDtlR.$loc_grp_cd);
				}
			}
			if (itm_flg) {
				newPolicy.add(types[i], DispDtlR.$ver_no);
				newPolicy.add(types[i], DispDtlR.$sno_no_p);
			}
			return super.sort(table, newPolicy);
		}
	}

	@Override
	public boolean sortHTable(MCTable<?> table, MCSortPolicy policy) {
		// テーブルのソート処理。縦横変換クラスから呼び出される。
		return super.sort(table, policy);
	}

	@Override
	public void elmColValueChanged(MCConstRow row, MCColumnConfig column) {
		_vhM.calcHSum(getDispDtlL(), (DispDtlR) row);
	}

	protected void showVH(MCList<DtlR> down0) {
		// グループを識別する番号を設定する
		showVHEditVList();

		// 可変カラムのラベル名を設定する
		showVHInitColInfo(down0);

		// 縦横変換処理を実行する
		_vhM.convertVH(getDtlL(), _vhM.getCachedHAllL());

		// 縦横変換した後の横データを加工する
		showVHEditHList();

		// 横データを表示する
		_vhM.doTableDispChange();
	}

	protected void showVHEditVList() {
		MCNumber grpPegNo = MCNumber.ZERO;
		for (MCList<DtlR> l : getDtlL().groupList(getDtlKeys())) {
			grpPegNo = grpPegNo.add(1);
			for (DtlR r : l) {
				r.grp_peg_no(grpPegNo);
			}
			_grpNoVMap.put(grpPegNo, l);
		}
	}

	protected void showVHInitColInfo(MCList<DtlR> down0) {
		// 可変カラムを識別するための値（縦リストの「VH_KEY」が「ELM」の項目の値）と可変カラムのラベル名を設定する
		MCList<MCRow> dtList = MCList.create(MCRow.class);

		MCDate dt_fr = _CndR.dt_fr();
		MCDate dt_to = _CndR.dt_to();

		String labeEndStk = getDispString("label_end_stk");
		String labeTerm = getDispString("label_term");

		int i = 0;
		for (DtlR r :down0) {
			MCDate dt = dt_fr.addDay(i - 2);
			if (dt.gt(dt_to)) {
				break;
			}

			MCRow o = dtList.createRow();
			// 可変カラムを識別するための値を設定する
			o.setDateNE(DtlR.$dt, r.dt());
			// 可変カラムのラベル名を設定する
			if (i == 0) {
				o.setStringNE(MAUCP_VHMapper.ELM_LABEL, labeEndStk);
			}
			else if (i == 1) {
				o.setStringNE(MAUCP_VHMapper.ELM_LABEL, labeTerm.concat(toY2MDString(r.dt())));
			}
			else {
				o.setStringNE(MAUCP_VHMapper.ELM_LABEL, toY2MDString(r.dt()));
			}
			dtList.add(o);
			i++;
		}

		_vhM.initColInfo(dtList);

		// ヘッダの色設定
		setHeaderColor(dtList);

		long pt = dt_to.diffDay(dt_fr) + 1;

		//日付変数クリア
		_dateMap = new HashMap<>();
		
		//日付変数設定
		_dateMap.put(getQtys()[0], null);//「月末在庫」
		_dateMap.put(getQtys()[1], null);//「～」
		for (i = 2; i < pt + 2; i++) {
			MCDate tmpDate = dt_fr.addDay(i - 2);
			_dateMap.put(getQtys()[i], tmpDate);
		}
	}

	protected void showVHEditHList() {
		MCList<DispDtlR> hList = _vhM.getCachedHAllL();
		for (DispDtlR r : hList) {
			if (isSame(r.row_title_col(), _grSchdQty)) {
				r.disp_itm(toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), this));
				r.disp_00(r.loc_cd());
				r.disp_01(r.site_cd());
				r.disp_02(r.wg_cd());
				r.disp_03(r.lg_grp_cd());
				r.disp_04(r.alloc_grp_cd());
				r.disp_05(r.loc_grp_cd());
				r.disp_base_unit(r.base_unit_cd());
			}
			else if (isSame(r.row_title_col(), _giSchdQty)) {
				r.disp_itm(r.itm_nm());
				r.disp_00(r.loc_nm());
				r.disp_01(r.site_nm());
				r.disp_02(r.wg_nm());
				r.disp_03(r.lg_grp_nm());
				r.disp_04(r.alloc_grp_nm());
				r.disp_05(r.loc_grp_nm());
				r.disp_base_unit(r.base_unit_nm());
			}
			else if (isSame(r.row_title_col(), _grActQty)) {
				r.disp_itm(toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()));
			}
			else if (isSame(r.row_title_col(), _giActQty)) {
				r.disp_itm(r.ver_no());
			}
		}
		crtGrpNoHCache(hList);
	}

	protected void crtGrpNoHCache(MCList<DispDtlR> hList) {
		MCSortPolicy sp = crtSortVH();
		for (MCList<DispDtlR> l : hList.groupList(DispDtlR.$grp_peg_no)) {
			l.sort(sp);
			_grpNoHMap.put(l.get(0).grp_peg_no(), l);
		}
	}

	protected MCSortPolicy crtSortVH() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, DispDtlR.$itm_cd);
		sp.add(SortType.ASC, DispDtlR.$itm_sub1);
		sp.add(SortType.ASC, DispDtlR.$itm_sub2);
		sp.add(SortType.ASC, DispDtlR.$itm_sub3);
		sp.add(SortType.ASC, DispDtlR.$itm_nm);
		sp.add(SortType.ASC, DispDtlR.$ver_no);
		//sp.add(SortType.ASC, DispDtlR.$gd_cd); sp.add(SortType.ASC, DispDtlR.$gd_nm); sp.add(SortType.ASC, DispDtlR.$quality_typ); sp.add(SortType.ASC, DispDtlR.$quality_typ_nm);
		if (_CndR.sno1_flg()) sp.add(SortType.ASC, DispDtlR.$sno1);
		if (_CndR.sno2_flg()) sp.add(SortType.ASC, DispDtlR.$sno2);
		if (_CndR.sno3_flg()) sp.add(SortType.ASC, DispDtlR.$sno3);
		if (_CndR.sno4_flg()) sp.add(SortType.ASC, DispDtlR.$sno4);
		if (isSame(_CndR.disp_typ(), Cnd_disp_typ_0.getActionCommand())) {
			sp.add(SortType.ASC, DispDtlR.$loc_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_1.getActionCommand())) {
			sp.add(SortType.ASC, DispDtlR.$site_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_2.getActionCommand())) {
			sp.add(SortType.ASC, DispDtlR.$wg_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_3.getActionCommand())) {
			sp.add(SortType.ASC, DispDtlR.$lg_grp_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_4.getActionCommand())) {
			sp.add(SortType.ASC, DispDtlR.$alloc_grp_cd);
		}
		else if (isSame(_CndR.disp_typ(), Cnd_disp_typ_5.getActionCommand())) {
			sp.add(SortType.ASC, DispDtlR.$loc_grp_cd);
		}
		return sp;
	}

	protected void setHeaderColor(MCList<MCRow> ymList) {
		Color satColor = getPgmSettingColorNE(this, new Color(176,196,222), "color.sat");
		Color sunColor = getPgmSettingColorNE(this, new Color(255,192,203), "color.sun");

		for (int i = 0; i < ymList.size(); i++) {
			MCDate dt = ymList.get(i).getDateNE(DtlR.$dt);
			if (!isNull(dt)) {
				if (dt.getDayOfWeek() == MCDate.SAT) {
					getQtys()[i].setHeaderBackground(satColor);
					continue;
				}
				if (dt.getDayOfWeek() == MCDate.SUN) {
					getQtys()[i].setHeaderBackground(sunColor);
					continue;
				}
			}
			getQtys()[i].setHeaderBackground(null);
		}
	}

	/**
	 * 手配ＮＯ１～４から表示用の手配ＮＯ情報を返します。<br>
	 * システムパラメータ「SNO_TYP」を参照して、有効な手配ＮＯのみを表示します。
	 * @param sno1 手配ＮＯ１
	 * @param sno2 手配ＮＯ２
	 * @param sno3 手配ＮＯ３
	 * @param sno4 手配ＮＯ４
	 * @return 手配ＮＯ情報
	 */
	protected String toDispSno(String sno1, String sno2, String sno3, String sno4) {
		int snoTyp = Integer.parseInt(this.getSysParm("SNO_TYP"));
		StringBuilder sb = new StringBuilder();

		if (snoTyp < 0 || snoTyp > 4) {
			snoTyp = 0;
		}

		if (snoTyp > 0 && _CndR.sno1_flg()) {
			sb.append(sno1);
		}
		if (snoTyp > 1) {
			sb.append(MAC_STR.DISP_SNO_DLM1.value());
			if (_CndR.sno2_flg()) {
				sb.append(sno2);
			}
		}
		if (snoTyp > 2) {
			sb.append(MAC_STR.DISP_SNO_DLM2.value());
			if (_CndR.sno3_flg()) {
				sb.append(sno3);
			}
		}
		if (snoTyp > 3) {
			sb.append(MAC_STR.DISP_SNO_DLM3.value());
			if (_CndR.sno4_flg()) {
				sb.append(sno4);
			}
		}

		return sb.toString();
	}

}