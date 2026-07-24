package mcframe.clientMGBF.MGBFP0010;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMGUB.MGUBP0010.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.beans.popup.MCPopupBeans;

import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.commonMGBF.MGBFC0010.MGBFC_ProdCostSrch;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_MfgCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_MfgCostSrch_MC extends MGBFP_MfgCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<DispDtlR> _cc = new MGUCP_CCtrl<>();
	protected MGUCP_CCtrl<DispDtl2R> _cc2 = new MGUCP_CCtrl<>();
	protected MGUCP_CCtrl<DispDtl3R> _cc3 = new MGUCP_CCtrl<>();
	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_MfgCostSrch_MC() {
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
	public MGBFP_MfgCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0010_Srch01Caller<P extends MGBFP_MfgCostSrch, B extends MG_MGBFL0010_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();
			getDispDtlL().clear();
			getDispDtl2L().clear();
			getDispDtl3L().clear();
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
			setBtnMode();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			_cndR = getCndR().clone();
		}
	}

	/**
	 * [MG_MGBFL0010_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0010_Srch02Caller<P extends MGBFP_MfgCostSrch, B extends MG_MGBFL0010_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0010_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DispDtlTable.selectRowNoFocus(0);
		}

		@Override
		protected void showNoDownDataMsg() {
			// ダイアログ出さない
		}

		@Override
		protected void resultNoDataFound() {
		}
	}

	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}

	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0010_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0200(MCEventInfo info) {
		// 計算対象期間の末尾月に対して確定（もしくは最後に計算）を行った計算結果のみ遷移できる
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		if (getRsltL().indexOf(r) == getRsltL().size() - 1) {
			return;
		}

		if (isSame(r.calc_no(), r.fix_calc_no()) == false) {
			MCMessageList msg = new MCMessageList();
			msg.add(new MCMessage(r, null, MGBFP0002, r.calc_grp_cd(), r.calc_no(),
					toYMString(r.ym()), r.fix_calc_no()));
			message(msg);
			return;
		}
		doBtn_open_MGBFP0200(r);
	}

	protected void doBtn_open_MGBFP0200(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0200");
		mcframe.clientMGBF.MGBFP0200.MGBFP_CostBreakdownSrch p = (mcframe.clientMGBF.MGBFP0200.MGBFP_CostBreakdownSrch) aso
				.getPanel();
		mcframe.clientMGBF.MGBFP0200.CndR to = mcframe.clientMGBF.MGBFP0200.CndR.create();

		to.ope(p.Cnd_ope_TTL.getActionCommand());
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.wg_cd(r.wg_cd());
		to.ym_to(r.ym());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		aso.putCnd(to);
		aso.runValueInit();

		if (!isNull(to.calc_grp_cd()) && !isNull(to.wg_cd()) && !isNull(to.ym_to())) {
			aso.putSearchAction();
		}

		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0200_INST]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0200_INST(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0200_INST(r);
	}

	protected void doBtn_open_MGBFP0200_INST(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0200");
		mcframe.clientMGBF.MGBFP0200.MGBFP_CostBreakdownSrch p = (mcframe.clientMGBF.MGBFP0200.MGBFP_CostBreakdownSrch) aso
				.getPanel();
		mcframe.clientMGBF.MGBFP0200.CndR to = mcframe.clientMGBF.MGBFP0200.CndR.create();

		to.ope(p.Cnd_ope_INST.getActionCommand());
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(r.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		aso.putCnd(to);
		aso.runValueInit();

		if (!isNull(to.calc_grp_cd()) && !isNull(to.calc_no()) && !isNull(to.wg_cd())) {
			aso.putSearchAction();
		}

		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0030(r);
	}

	protected void doBtn_open_MGBFP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0030");
		mcframe.clientMGBF.MGBFP0030.MGBFP_OutCostSrch p = (mcframe.clientMGBF.MGBFP0030.MGBFP_OutCostSrch) aso
				.getPanel();
		mcframe.clientMGBF.MGBFP0030.CndR to = mcframe.clientMGBF.MGBFP0030.CndR.create();

		to.ope(p.Cnd_ope_DTL.getActionCommand());
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		aso.putCnd(to);
		aso.runValueInit();

		if (!isNull(to.calc_grp_cd()) && !isNull(to.calc_no())) {
			aso.putSearchAction();
		}

		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0070(r);
	}

	protected void doBtn_open_MGBFP0070(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0070");
		mcframe.clientMGBF.MGBFP0070.CndR to = mcframe.clientMGBF.MGBFP0070.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.itm_flg(true);
		to.itm_mfg_inst_flg(true);
		to.mfg_act_flg(true);

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0080(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0080(r);
	}

	protected void doBtn_open_MGBFP0080(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0080");
		mcframe.clientMGBF.MGBFP0080.CndR to = mcframe.clientMGBF.MGBFP0080.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0090(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());

			return;
		}
		doBtn_open_MGBFP0090(r);
	}

	protected void doBtn_open_MGBFP0090(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0090");
		mcframe.clientMGBF.MGBFP0090.CndR to = mcframe.clientMGBF.MGBFP0090.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.par_itm_cd(r.itm_cd());
		to.par_itm_sub1(r.itm_sub1());
		to.par_itm_sub2(r.itm_sub2());
		to.par_itm_sub3(r.itm_sub3());
		to.par_itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0120(r);
	}

	protected void doBtn_open_MGBFP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0120");
		mcframe.clientMGBF.MGBFP0120.CndR to = mcframe.clientMGBF.MGBFP0120.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0140(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0140(r);
	}

	protected void doBtn_open_MGBFP0140(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0140");
		mcframe.clientMGBF.MGBFP0140.CndR to = mcframe.clientMGBF.MGBFP0140.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	// セッティング ////////////////////////////////////////////////////////////

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		DispDtl_qty_p_PPanel.setRelateBeans(columnDispDtl_unit_cd, columnDispDtl_dec_place);
		DispDtl2_qty_p_PPanel.setRelateBeans(columnDispDtl2_unit_cd, columnDispDtl2_dec_place);
		DispDtl3_qty_p_PPanel.setRelateBeans(columnDispDtl3_unit_cd, columnDispDtl3_dec_place);
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		// 下部一覧はソート不可
		DispDtlTable.setSortable(false);
		DispDtl2Table.setSortable(false);
		DispDtl3Table.setSortable(false);

		setColorInfo();
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_cc.init(this, DispDtlTable);
		_cc2.init(this, DispDtl2Table);
		_cc3.init(this, DispDtl3Table);

		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		_cc2.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		_cc3.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
	}

	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		Cnd_wg_flg.setValue(true);
		Cnd_mng_dpt_flg.setValue(true);
		Cnd_loc_flg.setValue(true);
		LPnl_disp_expns.setValue(true);
		LPnl_disp_expns_grp.setValue(true);

		displayColumn();
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		// ソート設定のポップアップを無効にする
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DispDtlTable) {
			conf.ignoreSortOrder(true);
		}
		else if (beans == DispDtl2Table) {
			conf.ignoreSortOrder(true);
		}
		else if (beans == DispDtl3Table) {
			conf.ignoreSortOrder(true);
		}
		return conf;
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
	}

	// イベント ////////////////////////////////////////////////////////////////
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		RsltR row = RsltTable.getSelectedMCRow();
		if (isNull(row) == false) {
			// 下一覧検索
			getHdrR().setValue(HdrR.$calc_grp_cd, row.calc_grp_cd());
			getHdrR().setValue(HdrR.$calc_no, row.calc_no());
			getHdrR().setValue(HdrR.$itm_cd, row.itm_cd());
			getHdrR().setValue(HdrR.$itm_sub1, row.itm_sub1());
			getHdrR().setValue(HdrR.$itm_sub2, row.itm_sub2());
			getHdrR().setValue(HdrR.$itm_sub3, row.itm_sub3());
			getHdrR().setValue(HdrR.$itm_mfg_inst_no, row.itm_mfg_inst_no());
			getHdrR().setValue(HdrR.$mfg_act_no, row.mfg_act_no());

			callMG_MGBFL0010_Srch02();
		}
		setBtnMode();
	}

	@Override
	public void doCnd_no_iv_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_iv_no_flg_NC(info);

		if (getCndR().no_iv_no_flg()) {
			setValueEx(Cnd_iv_no, null);
		}
	}

	@Override
	public void doCnd_iv_no_LC(MCEventInfo info) {
		super.doCnd_iv_no_LC(info);

		if (!isNull(getCndR().iv_no())) {
			setValueEx(Cnd_no_iv_no_flg, false);
		}
	}

	@Override
	public void doCnd_no_slo_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_slo_no_flg_NC(info);

		if (getCndR().no_slo_no_flg()) {
			setValueEx(Cnd_slo_no, null);
		}
	}

	@Override
	public void doCnd_slo_no_LC(MCEventInfo info) {
		super.doCnd_slo_no_LC(info);

		if (!isNull(getCndR().slo_no())) {
			setValueEx(Cnd_no_slo_no_flg, false);
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);

		if (!getCndR().loc_flg()) {
			getCndR().str_ln_flg(false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);

		if (getCndR().str_ln_flg()) {
			getCndR().loc_flg(true);
		}
	}

	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		super.doCnd_bp_cd_LC(info);

		if (!isNull(getCndR().bp_cd())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
		super.doCnd_bp_nm_LC(info);

		if (!isNull(getCndR().bp_nm())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);

		if (getCndR().no_bp_flg()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}

	@Override
	public void doCnd_po_no_LC(MCEventInfo info) {
		super.doCnd_po_no_LC(info);

		if (!isNull(getCndR().po_no())) {
			setValueEx(Cnd_no_po_no_flg, false);
		}
	}

	@Override
	public void doCnd_no_po_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_po_no_flg_NC(info);

		if (getCndR().no_po_no_flg()) {
			setValueEx(Cnd_po_no, null);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == RsltTable) doRslt_DC(info);
	}

	public void doRslt_DC(MCEventInfo info) {
		if (MAC_SA_TYP.isPLN(_cndR.sa_typ())) {
			doBtn_open_MGBFP0200_INST(info);
		}
		else {
			doBtn_open_MGBFP0200(info);
		}
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		displayColumn();
		RsltTable.selectLeftmostColumn(0);
	}

	/**
	 * 画面遷移ボタンの押下モードの設定
	 */
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		setBtnModeByFlg(Btn_open_MGBFP0200, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0200_INST, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0030, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0070, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0080, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0090, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0120, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0140, isEnableBtn_open(r));
	}

	protected boolean isEnableBtn_open(RsltR r) {
		if (isNull(r) || isNull(r.itm_cd())) {
			return false;
		}

		return true;
	}

	// //////////////////////////////////////////////
	// セルコンフィグ////////////////////////////////
	// //////////////////////////////////////////////
	protected Color _vTtlColor = getVTtlColor(this);
	protected Color _expnsTtlColor = getVttlExpnsColor(this);
	protected Color _expnsSrchRsltColor = getExpnsSrchRsltColor(this);

	protected class TableCellConfig extends MGUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (table.getBaseTable() == RsltTable) {
				if (isSame(index + 1, getRsltL().size())) {
					return _vTtlColor;
				}
				else {
					if (column != columnRslt_ttl) {
						return _expnsSrchRsltColor;
					}
				}
			}
			else if (table.getBaseTable() == DispDtl2Table) {
				if (MGBFC_ProdCostSrch.isSUBTTL(getDispDtl2L().get(index).calc_rec_seq())) {
					return _expnsTtlColor;
				}
				else if (MGBFC_ProdCostSrch.isTTL(getDispDtl2L().get(index).calc_rec_seq())) {
					return _vTtlColor;
				}
			}
			else if (table.getBaseTable() == DispDtl3Table) {
				if (MGBFC_ProdCostSrch.isSUBTTL(getDispDtl3L().get(index).calc_rec_seq())) {
					return _expnsTtlColor;
				}
				else if (MGBFC_ProdCostSrch.isTTL(getDispDtl3L().get(index).calc_rec_seq())) {
					return _vTtlColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

	protected TableCellConfig createTableCellConfig() {
		return new TableCellConfig();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		DispDtlTable.setCellConfig(createTableCellConfig());
		DispDtl2Table.setCellConfig(createTableCellConfig());
		DispDtl3Table.setCellConfig(createTableCellConfig());
		RsltTable.setCellConfig(createTableCellConfig());
	}

	protected void setColorInfo() {
		Color varFxdColor = getVarFxdColor(this);
		Color allTtlColor = getAllTtlColor(this);

		TableCellConfig rCc = (TableCellConfig) RsltTable.getCellConfig();
		rCc.putColumnBG(columnRslt_ttl, allTtlColor);

		TableCellConfig cc = (TableCellConfig) DispDtlTable.getCellConfig();
		for (MCColumnConfig c : DispDtlTable.getColumnConfigs()) {
			cc.putColumnBG(c, _expnsSrchRsltColor);
		}
		cc.putColumnBG(columnDispDtl_fxd_cost, varFxdColor);
		cc.putColumnBG(columnDispDtl_var_cost, varFxdColor);
		cc.putColumnBG(columnDispDtl_ttl, allTtlColor);
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));

		TableCellConfig cc2 = (TableCellConfig) DispDtl2Table.getCellConfig();
		for (MCColumnConfig c : DispDtl2Table.getColumnConfigs()) {
			cc2.putColumnBG(c, _expnsSrchRsltColor);
		}
		cc2.putColumnBG(columnDispDtl2_fxd_cost, varFxdColor);
		cc2.putColumnBG(columnDispDtl2_var_cost, varFxdColor);
		cc2.putColumnBG(columnDispDtl2_ttl, allTtlColor);
		cc2.putColumnBG(_cc2.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));

		TableCellConfig cc3 = (TableCellConfig) DispDtl3Table.getCellConfig();
		for (MCColumnConfig c : DispDtl3Table.getColumnConfigs()) {
			cc3.putColumnBG(c, _expnsSrchRsltColor);
		}
		cc3.putColumnBG(columnDispDtl3_fxd_cost, varFxdColor);
		cc3.putColumnBG(columnDispDtl3_var_cost, varFxdColor);
		cc3.putColumnBG(columnDispDtl3_ttl, allTtlColor);
		cc3.putColumnBG(_cc3.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
	}

}