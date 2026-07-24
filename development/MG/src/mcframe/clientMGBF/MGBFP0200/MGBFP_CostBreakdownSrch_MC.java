package mcframe.clientMGBF.MGBFP0200;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5210.*;
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
import java.util.Set;
import java.util.Arrays;

import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_CostBreakdownSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_CostBreakdownSrch_MC extends MGBFP_CostBreakdownSrch_MC_A implements IfHrrchyBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	/**費目構成比行index番号*/
	protected int _XPNS_RATE_ROW_INDEX = 0;
	/**合計行index番号*/
	protected int _SUM_ROW_INDEX = 1;
	/** 小数部有効桁のデフォルト値*/
	protected int _defAddDispDigit = 2;
	/** 全展開フラグ*/
	protected boolean _expandFlg = false;
	/** 検索条件キャッシュ*/
	protected CndR _cndR;
	/** 検索結果キャッシュ*/
	protected MCList<RsltR> _list;
	/** 集計対象のカラム名*/
	protected String[] _sumColNames;
	protected String _calcNo = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_CostBreakdownSrch_MC() {
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
	public MGBFP_CostBreakdownSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0200_Srch01Caller<P extends MGBFP_CostBreakdownSrch, B extends MG_MGBFL0200_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0200_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
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

		@Override
		protected void show() {
			super.show();

			_cndR = getCndR().clone();

			if (isNull(_cndR.calc_no())) {
				if (getNoL().isEmpty()) {
					_calcNo = null;
				}
				else {
					String[] s = new String[getNoL().size()];
					for (int i = 0; i < getNoL().size(); i++) {
						s[i] = getNoL().get(i).calc_no();
					}
					_calcNo = MCStringUtil.arrayValueJoin(s);
				}
			}

			setHiddenList();
			Rslt_hrrchy_p_PPanel.showCollapseAll(getRsltL());
			if (_expandFlg) {
				Rslt_hrrchy_p_PPanel.expandAll();
			}
			setAddDigit();
		}

		protected void setHiddenList() {
			clearHiddenList();
			for (RsltR r : getRsltL()) {
				if (r.getGUIIndex() == _XPNS_RATE_ROW_INDEX || r.getGUIIndex() == _SUM_ROW_INDEX) {
					r.bottom_flg(false);
					r.ext(false);
				}
				_list.add(r.clone());
			}
		}

		@Override
		protected void clear() {
			super.clear();

			clearHiddenList();
			Rslt_hrrchy_p_PPanel.screenClearBody();
		}

		protected void clearHiddenList() {
			_list = MCList.create(RsltR.class);
		}
	}


	/**
	 * Panel[LPnl]のボタン[redisplay]の押下時の処理
	 */
	@Override
	public void doLPnl_redisplay(MCEventInfo info) {
		setAddDigit();
		RsltTable.adjustWidth();
	}
	protected void setAddDigit() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		cc.setAddDigit(getLPnlR().add_disp_digit());
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		_expandFlg = false;
		callMG_MGBFL0200_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_all(MCEventInfo info) {
		_expandFlg = true;
		callMG_MGBFL0200_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0200(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0200(r);
	}
	protected void doBtn_open_MGBFP0200(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0200");
		CndR to;
		if (isSame(r.hrrchy(), MCNumber.ZERO)) {
			to = _cndR.clone();
		}
		else {
			to = CndR.create();
			to.calc_grp_cd(_cndR.calc_grp_cd());
			if (Cnd_ope_TTL.isSelected()) {
				to.ym_fr(_cndR.ym_fr());
				to.ym_to(_cndR.ym_to());
			}
			else {
				to.calc_no(_cndR.calc_no());
			}
			to.wg_cd(r.wg_cd());
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
		}
		if (Cnd_ope_TTL.isSelected()) {
			to.ope(Cnd_ope_TTL.getActionCommand());
		}
		else {
			to.ope(Cnd_ope_INST.getActionCommand());
		}
		aso.putCnd(to);
		aso.runValueInit();
		aso.putBind(MCScreenOpener.PARAM_ACTION, MCScreenOpener.createGUIKey(RPnl_srch_all));
		aso.showChild(this);
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0220]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0220(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0220(r);
	}
	protected void doBtn_open_MGBFP0220(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0220");
		mcframe.clientMGBF.MGBFP0220.CndR to = mcframe.clientMGBF.MGBFP0220.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		if (Cnd_ope_TTL.isSelected()) {
			to.calc_no(_calcNo);
		}
		else {
			to.calc_no(_cndR.calc_no());
		}
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		if (isSame(r.hrrchy(), MCNumber.ZERO)) {
			to.dpt_cd(_cndR.mng_dpt_cd());
			to.lot_no(_cndR.lot_no());
			to.sublot_no(_cndR.sublot_no());
			to.sno1(_cndR.sno1());
			to.sno2(_cndR.sno2());
			to.sno3(_cndR.sno3());
			to.sno4(_cndR.sno4());
		}
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0150]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0150(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0150(r);
	}
	protected void doBtn_open_MGBFP0150(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0150");
		mcframe.clientMGBF.MGBFP0150.CndR to = mcframe.clientMGBF.MGBFP0150.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		if (Cnd_ope_TTL.isSelected()) {
			to.calc_no(_calcNo);
		}
		else {
			to.calc_no(_cndR.calc_no());
		}
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		if (isSame(r.hrrchy(), MCNumber.ZERO)) {
			to.mng_dpt_cd(_cndR.mng_dpt_cd());
			to.lot_no(_cndR.lot_no());
			to.sublot_no(_cndR.sublot_no());
			to.sno1(_cndR.sno1());
			to.sno2(_cndR.sno2());
			to.sno3(_cndR.sno3());
			to.sno4(_cndR.sno4());
		}
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMGBF.MGBFP0150.CndR.$except_other_flg);
		aso.putCnd(to, list);
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
		if (Cnd_ope_TTL.isSelected()) {
			to.calc_no(_calcNo);
		}
		else {
			to.calc_no(_cndR.calc_no());
		}
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		if (isSame(r.hrrchy(), MCNumber.ZERO)) {
			to.lot_no(_cndR.lot_no());
			to.sublot_no(_cndR.sublot_no());
			to.sno1(_cndR.sno1());
			to.sno2(_cndR.sno2());
			to.sno3(_cndR.sno3());
			to.sno4(_cndR.sno4());
			to.itm_mfg_inst_no(_cndR.itm_mfg_inst_no());
			to.mfg_act_no(_cndR.mfg_act_no());
			to.loc_cd(_cndR.loc_cd());
			to.str_ln_cd(_cndR.str_ln_cd());
			to.po_no(_cndR.po_no());
			to.no_po_no_flg(_cndR.no_po_no_flg());
			to.slo_no(_cndR.slo_no());
			to.no_slo_no_flg(_cndR.no_slo_no_flg());
			to.iv_no(_cndR.iv_no());
			to.no_iv_no_flg(_cndR.no_iv_no_flg());
		}
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);

		Rslt_act_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_std_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
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
		_cc.init(this, RsltTable);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
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
	protected void tableInit() {
		super.tableInit();

		RsltTable.moveColumns(columnRslt_ext, columnRslt_hrrchy_str, columnRslt_bottom_flg);

		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();

		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color expnsGSubTtlColor = getExpnsGSubTtlColor(this);
		Color allTtlColor = getAllTtlColor(this);
		Color stdUpriColor = getStdUpriColor(this);
		Color varFxdColor = getProfitColor(this);

		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			if (c != columnRslt_ext) {
				cc.putColumnBG(c, expnsSrchRsltColor);
			}
		}
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs()) {
			cc.putColumnBG(c, expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt_ttl, allTtlColor);
		cc.putColumnBG(columnRslt_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt_std_qty, stdUpriColor);
		cc.putColumnBG(columnRslt_std_upri, stdUpriColor);
		cc.putColumnBG(columnRslt_std_cost, stdUpriColor);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == RsltTable) {
			confSet.removeAll(Arrays.asList(RsltTable.getAllColumnConfigs()));
			confSet.addAll(Arrays.asList(RsltTable.getViewColumnConfigs()));
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
		setValueEx(LPnl_add_disp_digit, MCNumber.valueOf(_defAddDispDigit));
		displayColumn();
	}

	@Override
	public MCList getCnd_mng_dpt_cd(MCRow row, MCEventInfo info) {
		if (Cnd_ope_TTL.isSelected()) {
			row.setDate(CostDptCols.$i_ym, getCndR().ym_to());
		}
		return super.getCnd_mng_dpt_cd(row, info);
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_TTL.isSelected()) {
			setSRCH_TTLStatus();
		}
		else if (Cnd_ope_INST.isSelected()) {
			setSRCH_INSTStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_TTL.isSelected()) {
			setREF_TTLStatus();
		}
		else if (Cnd_ope_INST.isSelected()) {
			setREF_INSTStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_TTLStatus() {
		super.setSRCH_TTLStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_INSTStatus() {
		super.setSRCH_INSTStatus();
		setStatusCom();
	}

	@Override
	public void setREF_TTLStatus() {
		super.setREF_TTLStatus();
		setStatusCom();
	}

	@Override
	public void setREF_INSTStatus() {
		super.setREF_INSTStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		displayColumn();
		setBtnMode();
		setFocus();
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBFP0200, isEnableBtn_open_MGBFP0200(r));
		setBtnModeByFlg(Btn_open_MGBFP0220, isEnableBtn_open_MGBFP0220(r));
		setBtnModeByFlg(Btn_open_MGBFP0150, isEnableBtn_open_MGBFP0150(r));
		setBtnModeByFlg(Btn_open_MGBFP0140, isEnableBtn_open_MGBFP0140(r));
	}

	/**
	 * 原価内訳照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0200(RsltR r) {
		if (r == null || isNull(r.hrrchy())) {
			return false;
		}
		return true;
	}

	/**
	 * 原価受払表照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0220(RsltR r) {
		if (r == null || isNull(r.hrrchy())) {
			return false;
		}
		return true;
	}

	/**
	 * 受払原価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0150(RsltR r) {
		if (r == null || isNull(r.hrrchy())) {
			return false;
		}
		return true;
	}

	/**
	 * 製造原価差異内訳照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBFP0140(RsltR r) {
		if (r == null || isNull(r.hrrchy())) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();

		if (Cnd_ope_TTL.isSelected()) {
			setValueEx(Cnd_calc_no, null);
			setValueEx(Cnd_st_wip_flg, false);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_no_po_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_po_no_flg_NC(info);
		if (getCndR().no_po_no_flg()) {
			setValueEx(Cnd_po_no, null);
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
	public void doLPnl_disp_std_NC(MCEventInfo info) {
		super.doLPnl_disp_std_NC(info);
		displayStdColumn();
	}

	@Override
	public void doLPnl_add_disp_digit_LC(MCEventInfo info) {
		super.doLPnl_add_disp_digit_LC(info);

		MCNumber n = (MCNumber) info.getNewValue();
		if (isNull(n)) {
			LPnl_add_disp_digit.setValue(MCNumber.ZERO);
		}
	}

	@Override
	public boolean doLPnl_add_disp_digit_VC(MCEventInfo info) {
		MCNumber n = (MCNumber) info.getNewValue();
		if (!isDecPlace(n)) {
			return false;
		}
		return super.doLPnl_add_disp_digit_VC(info);
	}

	protected boolean isDecPlace(MCNumber n) {
		return MCNumber.ZERO.lte(n) && new MCNumber(8).gte(n);
	}

	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		_cc.displayColumn();
		displayStdColumn();
	}

	protected void displayStdColumn() {
		for (MCColumnConfig cc : new MCColumnConfig[] { columnRslt_std_upri, columnRslt_std_qty,
				columnRslt_std_cost }) {
			setColModeByFlg(cc, getLPnlR().disp_std());
		}
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected Color _vTtlColor = getVTtlColor(this);

	protected class RsltCellConfig extends MGUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (isSame(index, _SUM_ROW_INDEX)) {
				return _vTtlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		protected int _add_digit = _defAddDispDigit;

		public void setAddDigit(MCNumber digit) {
			if (isNull(digit)) {
				_add_digit = 0;
			}
			else {
				_add_digit = digit.intValueExact();
			}
		}

		@Override
		public int getPriorViewScale(int index, MCColumnConfig column, MCTable<?> table) {
			int vs = super.getPriorViewScale(index, column, table);
			String type = getPriorViewScaleType(index, column, table);
			if (type != null) {
				if (isSame(index, _XPNS_RATE_ROW_INDEX)) {
					return super.getPriorViewScale(index, columnRslt_rate, table);
				}

				if (isSame(type, IfViewScale.UNIT) || isSame(type, IfViewScale.AMT)) {
					vs = vs + _add_digit;
				}
				else if (!isSame(type, IfViewScale.RATE)) {
					RsltR r = RsltTable.getRow(index);
					if (isNull(r.dec_place())) {
						vs = vs + _add_digit;
					}
					else {
						vs = r.dec_place().intValueExact() + _add_digit;
					}
				}
			}
			return vs;
		}

		@Override
		protected boolean isPercentColumn(int index, MCColumnConfig column,
				MCTable table) {
			//費目構成比行をパーセント表記する。
			if (index == _XPNS_RATE_ROW_INDEX || column == columnRslt_rate) {
				return true;
			}
			return false;
		}
	}

	// -----------------------------------------------
	// IfHrrchyBase
	@Override
	public void afterSetViewList() {
		recalc();
	}

	@Override
	public MCList<MCConstRow> hndlCollapseList(MCList<MCConstRow> rmL) {
		return null;
	}

	@Override
	public void hndlExpandList(MCList<MCConstRow> addL) {
	}

	@Override
	public boolean setHrrchyStr() {
		return false;
	}

	@Override
	public boolean setLeafStr() {
		return false;
	}

	// -----------------------------------------------
	// other(recalc)
	protected void recalc() {
		for (RsltR r : getRsltL()) {
			if (r.getGUIIndex() == _XPNS_RATE_ROW_INDEX) {
				continue;
			}
			recalcInit(r);
			if (r.ext()) {
				recalcMain(r, r.extno());
			}
		}
	}

	protected void recalcInit(RsltR row) {
		// rowを初期化（開いている状態）
		for (RsltR r : _list.subList(HrrchyR.$extno, row.extno())) {
			for (String cname : getSumColNames()) {
				row.setValueNE(cname, (MCNumber) r.getValueNE(cname));
			}
			row.ttl(r.ttl());
			calcUnitAndRate(row, getRsltL().get(_SUM_ROW_INDEX));
		}
	}

	protected void recalcMain(RsltR row, MCNumber extno) {
		// チェックが付いていたら子供を加算
		for (RsltR r : _list.subList(HrrchyR.$par_extno, extno)) {
			for (String cname : getSumColNames()) {
				row.setValueNE(
						cname,
						MCNumber.sum((MCNumber) row.getValueNE(cname),
								(MCNumber) r.getValueNE(cname)));
			}
			recalcMain(row, r.extno());
		}
		calcUnitAndRate(row, getRsltL().get(_SUM_ROW_INDEX));
	}

	protected void calcUnitAndRate(RsltR row, RsltR sumRow) {
		if (nvl(row.act_qty(), MCNumber.ZERO).isZero() == false) {
			row.act_upri(row.ttl().divide(row.act_qty(),
					16, MAC_RND_TYP.RNDOFF.toMC()));
		}
		else {
			row.act_upri(0);
		}
		if (isNull(row.std_cost())) {
			row.std_cost(0);
		}
		if (nvl(row.std_qty(), MCNumber.ZERO).isZero() == false) {
			row.std_upri(row.std_cost().divide(row.std_qty(),
					16, MAC_RND_TYP.RNDOFF.toMC()));
		}
		else {
			row.std_upri(0);
		}
		if (sumRow.ttl().isZero()) {
			row.rate(0);
		}
		else {
			row.rate(calcRate(sumRow.ttl(), row.ttl(), 16));
		}
	}

	protected String[] getSumColNames() {
		if (_sumColNames == null) {
			List<String> l = new ArrayList<String>();
			l.addAll(Arrays.asList(_cc.getViewColumns()));
			l.add(RsltR.$ttl);
			l.add(RsltR.$var_cost);
			l.add(RsltR.$fxd_cost);
			l.add(RsltR.$std_cost);
			_sumColNames = l.toArray(new String[]{});
		}
		return _sumColNames;
	}

}