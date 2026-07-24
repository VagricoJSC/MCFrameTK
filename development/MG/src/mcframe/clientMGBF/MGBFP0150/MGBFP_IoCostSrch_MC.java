package mcframe.clientMGBF.MGBFP0150;

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
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_IoCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_IoCostSrch_MC extends MGBFP_IoCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	// 合計行
	protected RsltR _sumRow = null;

	// 合計行の色
	protected Color _ttlColor = getVTtlColor(this);

	// 合計行の表示状態
	protected boolean _isSumDisplayed = false;

	// 検索時の検索枠
	protected CndR _cndR = CndR.create();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_IoCostSrch_MC() {
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
	public MGBFP_IoCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0150_Srch01Caller<P extends MGBFP_IoCostSrch, B extends MG_MGBFL0150_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0150_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_st_stk_flg, Cnd_st_wip_flg, Cnd_purc_flg,
					Cnd_comp_flg, Cnd_othr_in_flg, Cnd_gp_alc_flg, Cnd_inpt_flg,
					Cnd_othr_out_flg, Cnd_free_prov_flg, Cnd_paid_flg, Cnd_sls_flg,
					Cnd_end_stk_flg, Cnd_end_wip_flg, Cnd_adj_flg));
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
		protected void afterCall() {
			super.afterCall();

			// カラム表示に使用するため保持
			_cndR = getCndR().clone();
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();

			// 合計行を保持
			_sumRow = getRsltL().get(getRsltL().size() - 1);

			_isSumDisplayed = true;
			displaySumRow(getLPnlR().disp_sum_row());
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all1]の押下時の処理
	 */
	@Override
	public void doCnd_select_all1(MCEventInfo info) {
		setBooleanForIoRecTyp(true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all1]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all1(MCEventInfo info) {
		setBooleanForIoRecTyp(false);
	}
	/**
	 * 受払レコード区分に関するMCCheckBoxすべてに、valueの値を設定します。
	 */
	protected void setBooleanForIoRecTyp(boolean value) {
		setValueEx(Cnd_st_stk_flg, value);
		setValueEx(Cnd_st_wip_flg, value);
		setValueEx(Cnd_purc_flg, value);
		setValueEx(Cnd_comp_flg, value);
		setValueEx(Cnd_othr_in_flg, value);
		setValueEx(Cnd_gp_alc_flg, value);
		setValueEx(Cnd_free_prov_flg, value);
		setValueEx(Cnd_paid_flg, value);
		setValueEx(Cnd_inpt_flg, value);
		setValueEx(Cnd_othr_out_flg, value);
		setValueEx(Cnd_sls_flg, value);
		setValueEx(Cnd_end_stk_flg, value);
		setValueEx(Cnd_end_wip_flg, value);
		setValueEx(Cnd_adj_flg, value);
	}
	/**
	 * Panel[Cnd]のボタン[select_all2]の押下時の処理
	 */
	@Override
	public void doCnd_select_all2(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all2]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all2(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0150_Srch01();
	}

	// ------------------------------------------------
	// イベント
	// ------------------------------------------------

	@Override
	public void doCnd_loc_cd_NC(MCEventInfo info) {
		super.doCnd_loc_cd_NC(info);
		if (isNull(getCndR().loc_cd())) {
			setValueEx(Cnd_str_ln_cd, null);
			setValueEx(Cnd_str_ln_nm, null);
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);
		if (!getCndR().loc_flg()) {
			setValueEx(Cnd_str_ln_flg, false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);
		if (getCndR().str_ln_flg()) {
			setValueEx(Cnd_loc_flg, true);
		}
	}

	@Override
	public void doCnd_asst_typ_LC(MCEventInfo info) {
		if (!isNull(getCndR().asst_typ())) {
			setValueEx(Cnd_except_other_flg, false);
		}
	}

	@Override
	public void doCnd_except_other_flg_NC(MCEventInfo info) {
		super.doCnd_except_other_flg_NC(info);
		if (getCndR().except_other_flg()) {
			setValueEx(Cnd_asst_typ, null);
		}
	}

	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		if (!isNull(getCndR().bp_cd())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
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
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info) {
		if (!isNull(getCndR().ac_rsn_cd())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_nm_LC(info);
		if (!isNull(getCndR().ac_rsn_nm())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd_no_ac_rsn_flg_NC(info);
		if (getCndR().no_ac_rsn_flg()) {
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);
		}
	}

	@Override
	public void doCnd_po_no_LC(MCEventInfo info) {
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
	public void doCnd_slo_no_LC(MCEventInfo info) {
		if (!isNull(getCndR().slo_no())) {
			setValueEx(Cnd_no_slo_no_flg, false);
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
	public void doCnd_iv_no_LC(MCEventInfo info) {
		if (!isNull(getCndR().iv_no())) {
			setValueEx(Cnd_no_iv_no_flg, false);
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
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);
		if (!getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}

	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);
		if (getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
		}
	}

	@Override
	public void doLPnl_disp_std_NC(MCEventInfo info) {
		super.doLPnl_disp_std_NC(info);
		_cc.displayColumn();
		doDispStdCng();
		RsltTable.adjustWidth();
	}

	@Override
	public void doLPnl_disp_sum_row_NC(MCEventInfo info) {
		super.doLPnl_disp_sum_row_NC(info);
		displaySumRow(getLPnlR().disp_sum_row());
	}

	/**
	 * 合計行の表示・非表示を切り替えます。
	 */
	protected void displaySumRow(boolean boo) {
		if (getRsltL().size() <= 0) {
			return;
		}

		if (boo == _isSumDisplayed) {
			return;
		}

		if (boo) {
			getRsltL().add(_sumRow);
		}
		else {
			getRsltL().remove(getRsltL().size() - 1);
		}

		_isSumDisplayed = boo;
	}

	// ------------------------------------------------
	// ステータスの設定
	// ------------------------------------------------

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

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		doDispStdCng();
	}

	protected void doDispStdCng() {
		boolean dispStdUpri = getLPnlR().disp_std() && _cndR.wg_flg() && _cndR.itm_flg();
		setColModeByFlg(columnRslt_std_upri, dispStdUpri && _cndR.qty_flg());
		setColModeByFlg(columnRslt_upri_diff, dispStdUpri && _cndR.qty_flg());
		setColModeByFlg(columnRslt_dim_std_upri, dispStdUpri && _cndR.dim_flg());
		setColModeByFlg(columnRslt_dim_upri_diff, dispStdUpri && _cndR.dim_flg());
		setColModeByFlg(columnRslt_wt_std_upri, dispStdUpri && _cndR.wt_flg());
		setColModeByFlg(columnRslt_wt_upri_diff, dispStdUpri && _cndR.wt_flg());
		setColModeByFlg(columnRslt_conts_std_upri, dispStdUpri && _cndR.conts_flg());
		setColModeByFlg(columnRslt_conts_upri_diff, dispStdUpri && _cndR.conts_flg());
		setColModeByFlg(columnRslt_cost_diff, getLPnlR().disp_std());
		setColModeByFlg(columnRslt_std_cost, getLPnlR().disp_std());
	}

	// ------------------------------------------------
	// 値の設定
	// ------------------------------------------------

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		// 検索タブ
		setValueEx(Cnd_st_stk_flg, true);
		setValueEx(Cnd_st_wip_flg, true);
		setValueEx(Cnd_purc_flg, true);
		setValueEx(Cnd_comp_flg, true);
		setValueEx(Cnd_othr_in_flg, true);
		setValueEx(Cnd_gp_alc_flg, true);
		setValueEx(Cnd_inpt_flg, true);
		setValueEx(Cnd_othr_out_flg, true);
		setValueEx(Cnd_free_prov_flg, true);
		setValueEx(Cnd_paid_flg, true);
		setValueEx(Cnd_sls_flg, true);
		setValueEx(Cnd_end_stk_flg, true);
		setValueEx(Cnd_end_wip_flg, true);
		setValueEx(Cnd_adj_flg, true);
		setValueEx(Cnd_except_other_flg, true);
		// 集計タブ
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_ac_slip_typ_flg, true);
		setValueEx(Cnd_asst_typ_flg, true);
		setValueEx(Cnd_ac_rsn_flg, true);
		setValueEx(Cnd_qty_flg, true);
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);

		displayColumn();
	}

	// ------------------------------------------------
	// 画面の初期化
	// ------------------------------------------------

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
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())
					|| MAC_EXPNS_TYP.isSPPL(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (getLPnlR().disp_sum_row()) {
			return sortWithoutBottom(table, policy);
		}
		return super.sort(table, policy);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		Color rslt = getExpnsSrchRsltColor(this);
		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			cc.putColumnBG(c, rslt);
		}

		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
		cc.putColumnBG(columnRslt_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_upri_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_dim_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_dim_upri_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_wt_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_wt_upri_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_conts_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_conts_upri_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_cost_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_cost, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_var, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_fxd, getVarFxdColor(this));
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_dim_p_PPanel.setRelateBeans(columnRslt_dim_unit_cd, columnRslt_dim_dec_place);
		Rslt_wt_p_PPanel.setRelateBeans(columnRslt_wt_unit_cd, columnRslt_wt_dec_place);
		Rslt_conts_p_PPanel.setRelateBeans(columnRslt_conts_unit_cd, columnRslt_conts_dec_place);
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

	// ------------------------------------------------
	// セルコンフィグ
	// ------------------------------------------------

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (getLPnlR().disp_sum_row()) {
				if (index == getRsltL().size() - 1) {
					return _ttlColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		public int getPriorViewScale(int index, MCColumnConfig column, MCTable<?> table) {
			String type = getPriorViewScaleType(index, column, table);
			RsltR row = getRsltL().get(index);

			if (isSame(type, IfViewScale.INPUT)) {
				if (!isNull(row.trd_cur_amt_dec_place())
						&& column == columnRslt_trd_cur_amt) {
					return row.trd_cur_amt_dec_place().intValue();
				}
			}

			return super.getPriorViewScale(index, column, table);
		}
	}

	// ------------------------------------------------
	// 画面遷移
	// ------------------------------------------------

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		// ColumnConfigにDCイベントを付けてもREAD_ONLYの場合はイベントが発生しないので
		// MCTableのDCイベント発生時にクリックされたカラムで判断する
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (MGC_IO_REC_TYP.isST_STK(r.io_rec_typ())) {
				openMGBFP0100StStk(info);
			}
			else if (MGC_IO_REC_TYP.isST_WIP(r.io_rec_typ())) {
				openMGBFP0100StWip(info);
			}
			else if (MGC_IO_REC_TYP.isPURC(r.io_rec_typ())) {
				openMGBFP0040(info);
			}
			else if (MGC_IO_REC_TYP.isCOMP(r.io_rec_typ())) {
				openMGBFP0020(info);
			}
			else if (MGC_IO_REC_TYP.isSTK_IN(r.io_rec_typ())) {
				openMGBFP0060In(info);
			}
			else if (MGC_IO_REC_TYP.isSTK_OUT(r.io_rec_typ())) {
				openMGBFP0060Out(info);
			}
			else if (MGC_IO_REC_TYP.isFFR(r.io_rec_typ())) {
				openMGBFP0060FFR(info);
			}
			else if (MGC_IO_REC_TYP.isONR(r.io_rec_typ())) {
				openMGBFP0060ONR(info);
			}
			else if (MGC_IO_REC_TYP.isINPT(r.io_rec_typ())) {
				openMGBFP0090(info);
			}
			else if (MGC_IO_REC_TYP.isSLS(r.io_rec_typ())) {
				openMGBFP0050(info);
			}
			else if (MGC_IO_REC_TYP.isEND_STK(r.io_rec_typ())) {
				openMGBFP0100EndStk(info);
			}
			else if (MGC_IO_REC_TYP.isEND_WIP(r.io_rec_typ())) {
				openMGBFP0100EndWip(info);
			}
			else if (MGC_IO_REC_TYP.isADJ(r.io_rec_typ())) {
				openMGBFP0100Adj(info);
			}
			else if (MGC_IO_REC_TYP.isGP_ALC(r.io_rec_typ())) {
				openMGBFP0120(info);
			}
		}
	}

	/** 
	 * 画面を起動します。
	 */
	protected void openPanel(String moduleId, String screenId, MCRow bind) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener(moduleId, screenId);
		aso.putCnd(bind);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/** 
	 * 画面を起動します。<br>
	 * 引数forceColumnに設定されたカラムは、引数bindの値が「null」または「false」の場合でも遷移先に設定します。
	 */
	protected void openPanel(String moduleId, String screenId, MCRow bind, List<String> forceColumn) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener(moduleId, screenId);
		aso.putCnd(bind, forceColumn);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 完成原価一覧照会
	 */
	protected void openMGBFP0020(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0020.CndR to = mcframe.clientMGBF.MGBFP0020.CndR.create();
		setKeyVal(to, info);
		openPanel("MG", "MGBFP0020", to);
	}

	/**
	 * 投入原価一覧照会
	 */
	protected void openMGBFP0090(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0090.CndR to = mcframe.clientMGBF.MGBFP0090.CndR.create();
		setKeyVal(to, info);

		RsltR row = getRsltL().get(info.getEventIndex());
		to.mng_dpt_cd(null);
		to.mng_dpt_nm(null);
		to.inpt_dpt_cd(row.mng_dpt_cd());
		to.inpt_dpt_nm(row.mng_dpt_nm());
		to.chd_itm_cd(row.itm_cd());
		to.chd_itm_sub1(row.itm_sub1());
		to.chd_itm_sub2(row.itm_sub2());
		to.chd_itm_sub3(row.itm_sub3());
		to.chd_itm_nm(row.itm_nm());
		to.chd_itm_typ(row.itm_typ());
		to.chd_itm_typ_d_cd(row.itm_typ_d_cd());
		to.chd_itm_jnl_cd(row.itm_jnl_cd());
		to.chd_itm_grp_cd1(row.itm_grp_cd1());
		to.chd_itm_grp_cd2(row.itm_grp_cd2());
		to.chd_itm_grp_cd3(row.itm_grp_cd3());
		to.chd_itm_grp_cd4(row.itm_grp_cd4());
		to.chd_itm_grp_cd5(row.itm_grp_cd5());
		to.chd_itm_grp_cd6(row.itm_grp_cd6());
		to.chd_itm_grp_cd7(row.itm_grp_cd7());
		to.chd_itm_grp_cd8(row.itm_grp_cd8());
		to.chd_itm_grp_cd9(row.itm_grp_cd9());
		to.chd_itm_grp_cd10(row.itm_grp_cd10());
		to.chd_lot_no(row.lot_no());
		to.chd_sublot_no(row.sublot_no());
		to.chd_sno1(row.sno1());
		to.chd_sno2(row.sno2());
		to.chd_sno3(row.sno3());
		to.chd_sno4(row.sno4());
		to.chd_asst_typ(row.asst_typ());

		openPanel("MG", "MGBFP0090", to);
	}

	/**
	 * 購買原価一覧照会
	 */
	protected void openMGBFP0040(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0040.CndR to = mcframe.clientMGBF.MGBFP0040.CndR.create();
		setKeyVal(to, info);
		openPanel("MG", "MGBFP0040", to);
	}

	/**
	 * 売上原価一覧照会
	 */
	protected void openMGBFP0050(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0050.CndR to = mcframe.clientMGBF.MGBFP0050.CndR.create();
		setKeyVal(to, info);
		openPanel("MG", "MGBFP0050", to);
	}

	/**
	 * 入出庫原価一覧照会
	 */
	protected void openMGBFP0060(MCRow r, MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0060.CndR to = (mcframe.clientMGBF.MGBFP0060.CndR) r;
		setKeyVal(to, info);
		openPanel("MG", "MGBFP0060", to);
	}

	/**
	 * 入出庫原価一覧照会(出庫)
	 */
	protected void openMGBFP0060Out(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0060.CndR to = mcframe.clientMGBF.MGBFP0060.CndR.create();
		to.setStringNE("cost_io_typ", MAC_COST_IO_TYP.STK_OUT.value());
		openMGBFP0060(to, info);
	}

	/**
	 * 入出庫原価一覧照会(無償支給)
	 */
	protected void openMGBFP0060FFR(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0060.CndR to = mcframe.clientMGBF.MGBFP0060.CndR.create();
		to.setStringNE("cost_io_typ", MAC_COST_IO_TYP.FFR_PROV.value());
		openMGBFP0060(to, info);
	}

	/**
	 * 入出庫原価一覧照会(有償支給)
	 */
	protected void openMGBFP0060ONR(MCEventInfo info) {		
		mcframe.clientMGBF.MGBFP0060.CndR to = mcframe.clientMGBF.MGBFP0060.CndR.create();
		to.setStringNE("cost_io_typ", MAC_COST_IO_TYP.ONR_PROV.value());
		openMGBFP0060(to, info);
	}

	/**
	 * 入出庫原価一覧照会(入庫)
	 */
	protected void openMGBFP0060In(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0060.CndR to = mcframe.clientMGBF.MGBFP0060.CndR.create();
		to.setStringNE("cost_io_typ", MAC_COST_IO_TYP.STK_IN.value());
		openMGBFP0060(to, info);
	}

	/**
	 * 在庫仕掛原価一覧照会
	 */
	protected void openMGBFP0100(MCRow r, MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0100.CndR to = (mcframe.clientMGBF.MGBFP0100.CndR) r;
		setKeyVal(to, info);

		List<String>  cols = new ArrayList<String>();
		cols.add("st_stk_flg");
		cols.add("st_wip_flg");
		cols.add("end_stk_flg");
		cols.add("end_wip_flg");
		cols.add("adj_flg");

		openPanel("MG", "MGBFP0100", to, cols);
	}

	/**
	 * 在庫仕掛原価一覧照会(月初仕掛)
	 */
	protected void openMGBFP0100StWip(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();
		to.setBooleanNE("st_stk_flg", false);
		to.setBooleanNE("st_wip_flg", true);
		to.setBooleanNE("end_stk_flg", false);
		to.setBooleanNE("end_wip_flg", false);
		to.setBooleanNE("adj_flg", false);
		openMGBFP0100(to, info);
	}

	/**
	 * 在庫仕掛原価一覧照会(月末仕掛)
	 */
	protected void openMGBFP0100EndWip(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();
		to.setBooleanNE("st_stk_flg", false);
		to.setBooleanNE("st_wip_flg", false);
		to.setBooleanNE("end_stk_flg", false);
		to.setBooleanNE("end_wip_flg", true);
		to.setBooleanNE("adj_flg", false);
		openMGBFP0100(to, info);
	}

	/**
	 * 在庫仕掛原価一覧照会(月初在庫)
	 */
	protected void openMGBFP0100StStk(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();
		to.setBooleanNE("st_stk_flg", true);
		to.setBooleanNE("st_wip_flg", false);
		to.setBooleanNE("end_stk_flg", false);
		to.setBooleanNE("end_wip_flg", false);
		to.setBooleanNE("adj_flg", false);
		openMGBFP0100(to, info);
	}

	/**
	 * 在庫仕掛原価一覧照会(月末在庫)
	 */
	protected void openMGBFP0100EndStk(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();
		to.setBooleanNE("st_stk_flg", false);
		to.setBooleanNE("st_wip_flg", false);
		to.setBooleanNE("end_stk_flg", true);
		to.setBooleanNE("end_wip_flg", false);
		to.setBooleanNE("adj_flg", false);
		openMGBFP0100(to, info);
	}

	/**
	 * 在庫仕掛原価一覧照会(受払差額)
	 */
	protected void openMGBFP0100Adj(MCEventInfo info) {
		mcframe.clientMGBF.MGBFP0100.CndR to = mcframe.clientMGBF.MGBFP0100.CndR.create();
		to.setBooleanNE("st_stk_flg", false);
		to.setBooleanNE("st_wip_flg", false);
		to.setBooleanNE("end_stk_flg", false);
		to.setBooleanNE("end_wip_flg", false);
		to.setBooleanNE("adj_flg", true);
		openMGBFP0100(to, info);
	}

	/**
	 * 配賦額一覧照会
	 */
	protected void openMGBFP0120(MCEventInfo info) {		
		mcframe.clientMGBF.MGBFP0120.CndR to = mcframe.clientMGBF.MGBFP0120.CndR.create();
		setKeyVal(to, info);
		to.setStringNE("gp_alc_cd", "%");
		openPanel("MG", "MGBFP0120", to);
	}

	protected void setKeyVal(MCRow r, MCEventInfo info) {
		r.setStringNE("calc_grp_cd", getCndR().calc_grp_cd());
		r.setStringNE("calc_no", getCndR().calc_no());

		RsltR row = getRsltL().get(info.getEventIndex());
		r.setDateNE("ym", row.ym());
		r.setStringNE("wg_cd", row.wg_cd());
		r.setStringNE("mng_dpt_cd", row.mng_dpt_cd());
		r.setStringNE("mng_dpt_nm", row.mng_dpt_nm());
		r.setStringNE("itm_cd", row.itm_cd());
		r.setStringNE("itm_sub1", row.itm_sub1());
		r.setStringNE("itm_sub2", row.itm_sub2());
		r.setStringNE("itm_sub3", row.itm_sub3());
		r.setStringNE("itm_nm", row.itm_nm());
		r.setStringNE("itm_typ", row.itm_typ());
		r.setStringNE("itm_typ_d_cd", row.itm_typ_d_cd());
		r.setStringNE("itm_jnl_cd", row.itm_jnl_cd());
		r.setStringNE("itm_grp_cd1", row.itm_grp_cd1());
		r.setStringNE("itm_grp_cd2", row.itm_grp_cd2());
		r.setStringNE("itm_grp_cd3", row.itm_grp_cd3());
		r.setStringNE("itm_grp_cd4", row.itm_grp_cd4());
		r.setStringNE("itm_grp_cd5", row.itm_grp_cd5());
		r.setStringNE("itm_grp_cd6", row.itm_grp_cd6());
		r.setStringNE("itm_grp_cd7", row.itm_grp_cd7());
		r.setStringNE("itm_grp_cd8", row.itm_grp_cd8());
		r.setStringNE("itm_grp_cd9", row.itm_grp_cd9());
		r.setStringNE("itm_grp_cd10", row.itm_grp_cd10());
		r.setStringNE("lot_no", row.lot_no());
		r.setStringNE("sublot_no", row.sublot_no());
		r.setStringNE("sno1", row.sno1());
		r.setStringNE("sno2", row.sno2());
		r.setStringNE("sno3", row.sno3());
		r.setStringNE("sno4", row.sno4());
		r.setStringNE("ac_slip_typ", row.ac_slip_typ());
		r.setStringNE("ac_rsn_cd", row.ac_rsn_cd());
		r.setStringNE("site_cd", row.site_cd());
		r.setStringNE("loc_cd", row.loc_cd());
		r.setStringNE("str_ln_cd", row.str_ln_cd());
		r.setStringNE("oper_cd", row.oper_cd());
		r.setStringNE("bp_cd", row.bp_cd());
		r.setStringNE("bp_grp_cd1", row.bp_grp_cd1());
		r.setStringNE("bp_grp_cd2", row.bp_grp_cd2());
		r.setStringNE("bp_grp_cd3", row.bp_grp_cd3());
		r.setStringNE("bp_grp_cd4", row.bp_grp_cd4());
		r.setStringNE("bp_grp_cd5", row.bp_grp_cd5());
		r.setStringNE("bp_grp_cd6", row.bp_grp_cd6());
		r.setStringNE("bp_grp_cd7", row.bp_grp_cd7());
		r.setStringNE("bp_grp_cd8", row.bp_grp_cd8());
		r.setStringNE("bp_grp_cd9", row.bp_grp_cd9());
		r.setStringNE("bp_grp_cd10", row.bp_grp_cd10());
		r.setStringNE("cntry_cd", row.cntry_cd());
		r.setStringNE("area_cd", row.area_cd());
		r.setStringNE("po_no", row.po_no());
		r.setStringNE("slo_no", row.slo_no());
		r.setStringNE("iv_no", row.iv_no());
		r.setStringNE("asst_typ", row.asst_typ());
		r.setStringNE("trd_cur_cd", row.trd_cur_cd());

		r.setBooleanNE("no_ac_rsn_flg", _cndR.ac_rsn_flg() && isNull(row.ac_rsn_cd()));
		r.setBooleanNE("no_bp_flg", _cndR.bp_flg() && isNull(row.bp_cd()));
		r.setBooleanNE("no_po_no_flg", _cndR.po_no_flg() && isNull(row.po_no()));
		r.setBooleanNE("no_slo_no_flg", _cndR.slo_no_flg() && isNull(row.slo_no()));
		r.setBooleanNE("no_iv_no_flg", _cndR.iv_no_flg() && isNull(row.iv_no()));
	}

}