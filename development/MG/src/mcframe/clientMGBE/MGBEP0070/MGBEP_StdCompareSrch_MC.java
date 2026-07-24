package mcframe.clientMGBE.MGBEP0070;

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
import mcframe.clientMAUB.MAUBP0230.*;
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
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_StdCompareSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_StdCompareSrch_MC extends MGBEP_StdCompareSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	/** 画面遷移用 */
	protected CndR _cndR;
	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト */
	protected ArrayList<MCColumnConfig> _revFgCtrlColumnConfigs;
	/** 一覧対象１行の色 */
	protected Color _tgt1Color = getExpnsTtlHColor(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdCompareSrch_MC() {
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
	public MGBEP_StdCompareSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0070_Srch01Caller<P extends MGBEP_StdCompareSrch, B extends MG_MGBEL0070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0070_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			boolean isAll = Cnd_ope_ALL.isSelected();
			getCndR().dpt_flg(isAll);
			getCndR().cst_flg(isAll);
			getCndR().dlv_flg(isAll);
			getCndR().dest1_flg(isAll);
			getCndR().dest2_flg(isAll);
			getCndR().dest3_flg(isAll);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(panel.checkAtLeastOne(Cnd_diff_flg, Cnd_no_diff_flg));
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

			_cndR = getCndR().clone();
			for (RsltR row : bridge.down0()) {
				setTgtLbl(row);
			}
		}

		protected void  setTgtLbl(RsltR row) {
			if (row.tgt_no().eq(MCNumber.ONE)) {
				row.tgt_lbl(Tgt1Panel.getMessageByLocale());
			}
			else {
				row.tgt_lbl(Tgt2Panel.getMessageByLocale());
				//差異フラグは対象１のみ
				row.diff_flg(false);
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBEL0070_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBEP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0030(r);
	}

	protected void doBtn_open_MGBEP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0030");
		mcframe.clientMGBE.MGBEP0030.CndR to = mcframe.clientMGBE.MGBEP0030.CndR.create();
		if (isSame(r.tgt_no(), 1)) {
			to.calc_grp_cd(_cndR.calc_grp_cd());
			to.calc_no(_cndR.calc_no());
		}
		else {
			to.calc_grp_cd(_cndR.calc_grp_cd2());
			to.calc_no(_cndR.calc_no2());
		}
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBEP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0040(r);
	}

	protected void doBtn_open_MGBEP0040(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0040");
		mcframe.clientMGBE.MGBEP0040.MGBEP_StdUpriDtlSrch p = (mcframe.clientMGBE.MGBEP0040.MGBEP_StdUpriDtlSrch) aso.getPanel();
		mcframe.clientMGBE.MGBEP0040.CndR to = mcframe.clientMGBE.MGBEP0040.CndR.create();
		to.ope(p.Cnd_ope_SELF.getActionCommand());
		if (isSame(r.tgt_no(), 1)) {
			to.calc_grp_cd(_cndR.calc_grp_cd());
			to.calc_no(_cndR.calc_no());
		}
		else {
			to.calc_grp_cd(_cndR.calc_grp_cd2());
			to.calc_no(_cndR.calc_no2());
		}
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0010(r);
	}

	protected void doBtn_open_MGBEP0010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0010");
		mcframe.clientMGBE.MGBEP0010.CndR to = mcframe.clientMGBE.MGBEP0010.CndR.create();
		if (isSame(r.tgt_no(), 1)) {
			to.calc_grp_cd(_cndR.calc_grp_cd());
			to.calc_no(_cndR.calc_no());
		}
		else {
			to.calc_grp_cd(_cndR.calc_grp_cd2());
			to.calc_no(_cndR.calc_no2());
		}
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBEP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0050(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0050(r);
	}

	protected void doBtn_open_MGBEP0050(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0050");
		mcframe.clientMGBE.MGBEP0050.CndR to = mcframe.clientMGBE.MGBEP0050.CndR.create();
		if (isSame(r.tgt_no(), 1)) {
			to.calc_grp_cd(_cndR.calc_grp_cd());
			to.calc_no(_cndR.calc_no());
		}
		else {
			to.calc_grp_cd(_cndR.calc_grp_cd2());
			to.calc_no(_cndR.calc_no2());
		}
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		if (Cnd_ope_ALL.isSelected()) {
			to.dpt_cd(r.dpt_cd());
			to.cst_cd(r.cst_cd());
			to.dlv_cd(r.dlv_cd());
			to.dest_cd1(r.dest_cd1());
			to.dest_cd2(r.dest_cd2());
			to.dest_cd3(r.dest_cd3());

			to.no_dpt_flg(isNull(r.dpt_cd()));
			to.no_cst_flg(isNull(r.cst_cd()));
			to.no_dlv_flg(isNull(r.dlv_cd()));
			to.no_dest1_flg(isNull(r.dest_cd1()));
			to.no_dest2_flg(isNull(r.dest_cd1()));
			to.no_dest3_flg(isNull(r.dest_cd1()));
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
		Cnd_calc_no_p2_PPanel.setRelateBeans(Cnd_calc_grp_cd2);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_diff_flg, true);
		setValueEx(Cnd_no_diff_flg, true);
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
		displayColumn();
	}

	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_term.addLCListener(this);
		Cnd_calc_no.addLCListener(this);
		Cnd_term2.addLCListener(this);
		Cnd_calc_no2.addLCListener(this);
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
					|| (Cnd_ope_ALL.isSelected() && MAC_EXPNS_TYP.isSGA(r.expns_typ()))) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();

		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color allTtlColor = getAllTtlColor(this);
		Color slsVarFxdColor = getProfitColor(this);

		cc.putColumnBG(RsltTable.getColumnConfigs(), expnsSrchRsltColor);
		cc.putColumnBG(columnRslt_ttl, allTtlColor);
		cc.putColumnBG(columnRslt_var_cost, slsVarFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost, slsVarFxdColor);

		setExpnsColorInfo();
	}

	protected void setExpnsColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();

		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color expnsGBgColor = getExpnsGSubTtlColor(this);

		cc.putColumnBG(_cc.getExpnsColumnConfigs(), expnsSrchRsltColor);
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), expnsGBgColor);
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		if (Cnd_ope_MFG.isSelected()) {
			setSRCH_MFGStatus();
		}
		else {
			setSRCH_ALLStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		if (Cnd_ope_MFG.isSelected()) {
			setREF_MFGStatus();
		}
		else {
			setREF_ALLStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_MFGStatus() {
		super.setSRCH_MFGStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_ALLStatus() {
		super.setSRCH_ALLStatus();
		setStatusCom();
	}

	@Override
	public void setREF_MFGStatus() {
		super.setREF_MFGStatus();
		setStatusCom();
	}

	@Override
	public void setREF_ALLStatus() {
		super.setREF_ALLStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		setTabMode();
		displayColumn();
		setBtnMode();
		setFocus();
	}

	protected void setTabMode() {
		if(Cnd_ope_MFG.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel, Tab4Panel);
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBEP0010, isEnableBtn_open_MGBEP0010(r));
		setBtnModeByFlg(Btn_open_MGBEP0030, isEnableBtn_open_MGBEP0030(r));
		setBtnModeByFlg(Btn_open_MGBEP0040, isEnableBtn_open_MGBEP0040(r));
		setBtnModeByFlg(Btn_open_MGBEP0050, isEnableBtn_open_MGBEP0050(r));
	}

	/**
	 * 標準単価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0010(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 標準内訳照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0030(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 標準単価詳細画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 標準販売単価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0050(RsltR r) {
		if (r == null) {
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
		clearInvalidCnds();

		initCCInfo();
		setExpnsColorInfo();

		setSrchStatus();
	}

	protected void clearInvalidCnds() {
		if (Cnd_ope_MFG.isSelected()) {
			setValueEx(Cnd_dpt_cd, null);
			setValueEx(Cnd_dpt_nm, null);
			setValueEx(Cnd_no_dpt_flg, false);
			setValueEx(Cnd_cst_cd, null);
			setValueEx(Cnd_cst_nm, null);
			setValueEx(Cnd_no_cst_flg, false);
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_dlv_nm, null);
			setValueEx(Cnd_no_dlv_flg, false);
			setValueEx(Cnd_dest_cd1, null);
			setValueEx(Cnd_dest_nm1, null);
			setValueEx(Cnd_no_dest1_flg, false);
			setValueEx(Cnd_dest_cd2, null);
			setValueEx(Cnd_dest_nm2, null);
			setValueEx(Cnd_no_dest2_flg, false);
			setValueEx(Cnd_dest_cd3, null);
			setValueEx(Cnd_dest_nm3, null);
			setValueEx(Cnd_no_dest3_flg, false);
			setValueEx(Cnd_cst_grp_cd1, null);
			setValueEx(Cnd_cst_grp_nm1, null);
			setValueEx(Cnd_cst_grp_cd2, null);
			setValueEx(Cnd_cst_grp_nm2, null);
			setValueEx(Cnd_cst_grp_cd3, null);
			setValueEx(Cnd_cst_grp_nm3, null);
			setValueEx(Cnd_cst_grp_cd4, null);
			setValueEx(Cnd_cst_grp_nm4, null);
			setValueEx(Cnd_cst_grp_cd5, null);
			setValueEx(Cnd_cst_grp_nm5, null);
			setValueEx(Cnd_cst_grp_cd6, null);
			setValueEx(Cnd_cst_grp_nm6, null);
			setValueEx(Cnd_cst_grp_cd7, null);
			setValueEx(Cnd_cst_grp_nm7, null);
			setValueEx(Cnd_cst_grp_cd8, null);
			setValueEx(Cnd_cst_grp_nm8, null);
			setValueEx(Cnd_cst_grp_cd9, null);
			setValueEx(Cnd_cst_grp_nm9, null);
			setValueEx(Cnd_cst_grp_cd10, null);
			setValueEx(Cnd_cst_grp_nm10, null);
			setValueEx(Cnd_dlv_grp_cd1, null);
			setValueEx(Cnd_dlv_grp_nm1, null);
			setValueEx(Cnd_dlv_grp_cd2, null);
			setValueEx(Cnd_dlv_grp_nm2, null);
			setValueEx(Cnd_dlv_grp_cd3, null);
			setValueEx(Cnd_dlv_grp_nm3, null);
			setValueEx(Cnd_dlv_grp_cd4, null);
			setValueEx(Cnd_dlv_grp_nm4, null);
			setValueEx(Cnd_dlv_grp_cd5, null);
			setValueEx(Cnd_dlv_grp_nm5, null);
			setValueEx(Cnd_dlv_grp_cd6, null);
			setValueEx(Cnd_dlv_grp_nm6, null);
			setValueEx(Cnd_dlv_grp_cd7, null);
			setValueEx(Cnd_dlv_grp_nm7, null);
			setValueEx(Cnd_dlv_grp_cd8, null);
			setValueEx(Cnd_dlv_grp_nm8, null);
			setValueEx(Cnd_dlv_grp_cd9, null);
			setValueEx(Cnd_dlv_grp_nm9, null);
			setValueEx(Cnd_dlv_grp_cd10, null);
			setValueEx(Cnd_dlv_grp_nm10, null);
		}
		else {
			setValueEx(Cnd_par_itm_cd, null);
			setValueEx(Cnd_chd_itm_cd, null);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_term) doCnd_term_LC(info);
		else if (lc == Cnd_calc_no) doCnd_calc_no_LC(info);
		else if (lc == Cnd_term2) doCnd_term2_LC(info);
		else if (lc == Cnd_calc_no2) doCnd_calc_no2_LC(info);
	}

	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		clearContainers(getRsltL());
	}

	protected void doCnd_term_LC(MCEventInfo info) {
		clearContainers(getRsltL());
		setValueEx(Cnd_calc_no, null);
	}

	protected void doCnd_calc_no_LC(MCEventInfo info) {
		clearContainers(getRsltL());
	}

	@Override
	public void doCnd_calc_grp_cd2_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd2_LC(info);
		clearContainers(getRsltL());
	}

	protected void doCnd_term2_LC(MCEventInfo info) {
		clearContainers(getRsltL());
		setValueEx(Cnd_calc_no2, null);
	}

	protected void doCnd_calc_no2_LC(MCEventInfo info) {
		clearContainers(getRsltL());
	}

	@Override
	public void doCnd_no_dpt_flg_NC(MCEventInfo info) {
		super.doCnd_no_dpt_flg_NC(info);
		if (getCndR().no_dpt_flg()) {
			setValueEx(Cnd_dpt_cd, null);
			setValueEx(Cnd_dpt_nm, null);
		}
	}

	@Override
	public void doCnd_dpt_cd_LC(MCEventInfo info) {
		super.doCnd_dpt_cd_LC(info);
		if (!isNull(getCndR().dpt_cd())) {
			setValueEx(Cnd_no_dpt_flg, false);
		}
	}

	@Override
	public void doCnd_dpt_nm_LC(MCEventInfo info) {
		super.doCnd_dpt_nm_LC(info);
		if (!isNull(getCndR().dpt_nm())) {
			setValueEx(Cnd_no_dpt_flg, false);
		}
	}

	@Override
	public void doCnd_no_cst_flg_NC(MCEventInfo info) {
		super.doCnd_no_cst_flg_NC(info);
		if (getCndR().no_cst_flg()) {
			setValueEx(Cnd_cst_cd, null);
			setValueEx(Cnd_cst_nm, null);
		}
	}

	@Override
	public void doCnd_cst_cd_LC(MCEventInfo info) {
		super.doCnd_cst_cd_LC(info);
		if (!isNull(getCndR().cst_cd())) {
			setValueEx(Cnd_no_cst_flg, false);
		}
	}

	@Override
	public void doCnd_cst_nm_LC(MCEventInfo info) {
		super.doCnd_cst_nm_LC(info);
		if (!isNull(getCndR().cst_nm())) {
			setValueEx(Cnd_no_cst_flg, false);
		}
	}

	@Override
	public void doCnd_no_dlv_flg_NC(MCEventInfo info) {
		super.doCnd_no_dlv_flg_NC(info);
		if (getCndR().no_dlv_flg()) {
			setValueEx(Cnd_dlv_cd, null);
			setValueEx(Cnd_dlv_nm, null);
		}
	}

	@Override
	public void doCnd_dlv_cd_LC(MCEventInfo info) {
		super.doCnd_dlv_cd_LC(info);
		if (!isNull(getCndR().dlv_cd())) {
			setValueEx(Cnd_no_dlv_flg, false);
		}
	}

	@Override
	public void doCnd_dlv_nm_LC(MCEventInfo info) {
		super.doCnd_dlv_nm_LC(info);
		if (!isNull(getCndR().dlv_nm())) {
			setValueEx(Cnd_no_dlv_flg, false);
		}
	}

	@Override
	public void doCnd_no_dest1_flg_NC(MCEventInfo info) {
		super.doCnd_no_dest1_flg_NC(info);
		if (getCndR().no_dest1_flg()) {
			setValueEx(Cnd_dest_cd1, null);
			setValueEx(Cnd_dest_nm1, null);
		}
	}

	@Override
	public void doCnd_dest_cd1_LC(MCEventInfo info) {
		super.doCnd_dest_cd1_LC(info);
		if (!isNull(getCndR().dest_cd1())) {
			setValueEx(Cnd_no_dest1_flg, false);
		}
	}

	@Override
	public void doCnd_dest_nm1_LC(MCEventInfo info) {
		super.doCnd_dest_nm1_LC(info);
		if (!isNull(getCndR().dest_nm1())) {
			setValueEx(Cnd_no_dest1_flg, false);
		}
	}

	@Override
	public void doCnd_no_dest2_flg_NC(MCEventInfo info) {
		super.doCnd_no_dest2_flg_NC(info);
		if (getCndR().no_dest2_flg()) {
			setValueEx(Cnd_dest_cd2, null);
			setValueEx(Cnd_dest_nm2, null);
		}
	}

	@Override
	public void doCnd_dest_cd2_LC(MCEventInfo info) {
		super.doCnd_dest_cd2_LC(info);
		if (!isNull(getCndR().dest_cd2())) {
			setValueEx(Cnd_no_dest2_flg, false);
		}
	}

	@Override
	public void doCnd_dest_nm2_LC(MCEventInfo info) {
		super.doCnd_dest_nm2_LC(info);
		if (!isNull(getCndR().dest_nm2())) {
			setValueEx(Cnd_no_dest2_flg, false);
		}
	}

	@Override
	public void doCnd_no_dest3_flg_NC(MCEventInfo info) {
		super.doCnd_no_dest3_flg_NC(info);
		if (getCndR().no_dest3_flg()) {
			setValueEx(Cnd_dest_cd3, null);
			setValueEx(Cnd_dest_nm3, null);
		}
	}

	@Override
	public void doCnd_dest_cd3_LC(MCEventInfo info) {
		super.doCnd_dest_cd3_LC(info);
		if (!isNull(getCndR().dest_cd3())) {
			setValueEx(Cnd_no_dest3_flg, false);
		}
	}

	@Override
	public void doCnd_dest_nm3_LC(MCEventInfo info) {
		super.doCnd_dest_nm3_LC(info);
		if (!isNull(getCndR().dest_nm3())) {
			setValueEx(Cnd_no_dest3_flg, false);
		}
	}

	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
	}

	// -----------------------------------------------
	// CellConfig
	protected ArrayList<MCColumnConfig> getRevFgCtrlColumnConfigs() {
		if (_revFgCtrlColumnConfigs == null) {
			_revFgCtrlColumnConfigs = getGroupColumnConfigs(RsltTable, RsltR.$$CLEAR);
		}
		return _revFgCtrlColumnConfigs;
	}

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
			if (!isExpnsGColumn(column) && column != columnRslt_ttl
					&& column != columnRslt_fxd_cost
					&& column != columnRslt_var_cost) {

				if (isSame(getRsltL().get(index).tgt_no(), 1)) {
					return _tgt1Color;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column,
				MCTable<?> table, MCMode mode) {
			RsltR row = (RsltR) table.getBaseTable().getRow(index);
			if (!isSame(row.tgt_no(), 1) && !getLPnlR().disp_key()) {
				if (getRevFgCtrlColumnConfigs().contains(column)) {
					return true;
				}
			}
			return null;
		}

		protected boolean isExpnsGColumn(MCColumnConfig column) {
			boolean ret = false;
			for (MCColumnConfig c : _cc.getExpnsGColumnConfigs()) {
				if (c.equals(column)) {
					ret = true;
					break;
				}
			}
			return ret;
		}
	}

}