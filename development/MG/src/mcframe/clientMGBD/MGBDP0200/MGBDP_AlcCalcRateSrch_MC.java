package mcframe.clientMGBD.MGBDP0200;

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
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_AlcCalcRateSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_AlcCalcRateSrch_MC extends MGBDP_AlcCalcRateSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected Color _vTtlColor = getVTtlColor(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_AlcCalcRateSrch_MC() {
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
	public MGBDP_AlcCalcRateSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0200_Srch01Caller<P extends MGBDP_AlcCalcRateSrch, B extends MG_MGBDL0200_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0200_Srch01Caller(P p, B b) {
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
		protected void afterCall() {
			super.afterCall();
			addTtlRow();
		}
		
		protected void addTtlRow() {
			// 合計行を作成・最下行に追加
			RsltR sumRow = RsltR.create();
			for (RsltR r : bridge.down0()) {
				// 合計行の計算
				sumRow.amt(MCNumber.sum(sumRow.amt(), r.amt()));
				sumRow.alc_amt(MCNumber.sum(sumRow.alc_amt(), r.alc_amt()));
				sumRow.trd_alc_amt(MCNumber.sum(sumRow.trd_alc_amt(), r.trd_alc_amt()));
				sumRow.std_alc_amt(MCNumber.sum(sumRow.std_alc_amt(), r.std_alc_amt()));
				sumRow.alc_diff(MCNumber.sum(sumRow.alc_diff(), r.alc_diff()));
				sumRow.std_alc_diff(MCNumber.sum(sumRow.std_alc_diff(), r.std_alc_diff()));
				sumRow.pln_amt(MCNumber.sum(sumRow.pln_amt(), r.pln_amt()));
				sumRow.pln_diff(MCNumber.sum(sumRow.pln_diff(), r.pln_diff()));
				sumRow.capa_diff(MCNumber.sum(sumRow.capa_diff(), r.capa_diff()));
			}
			bridge.down0().add(sumRow);
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
	}

	/**
	 * [MG_MGBDL0200_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0200_Ins01Caller<P extends MGBDP_AlcCalcRateSrch, B extends MG_MGBDL0200_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0200_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0200_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0230]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0230(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0230(r);
	}
	protected void doBtn_open_MGBDP0230(RsltR r) {
		mcframe.clientMGBD.MGBDP0230.CndR to = mcframe.clientMGBD.MGBDP0230.CndR.create();
		to.calc_grp_cd(r.calc_grp_cd());
		to.calc_no(r.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.alc_ac_cd(r.alc_ac_cd());
		to.dpt_cd(r.dpt_cd());
		to.dpt_nm(r.dpt_nm());
		to.loc_cd(r.loc_cd());
		to.loc_nm(r.loc_nm());
		to.oper_cd(r.oper_cd());
		to.oper_nm(r.oper_nm());
		to.bp_cd(r.bp_cd());
		to.bp_nm(r.bp_nm());
		to.ctg_cd(r.ctg_cd());
		to.ctg_nm(r.ctg_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.iv_no(r.iv_no());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		to.alc_grp_id(r.alc_grp_id());
		to.inpt_alc_typ(r.inpt_alc_typ());
		to.expns_cd(r.expns_cd());
		to.expns_nm(r.expns_nm());
		to.alc_ptn_cd(r.alc_ptn_cd());
		to.alc_ptn_nm(r.alc_ptn_nm());
		to.amt(r.amt());
		to.alc_tgt_val(r.alc_tgt_val());
		to.alc_rate(r.alc_rate());
		to.std_alc_rate(r.std_alc_rate());
		to.alc_amt(r.alc_amt());
		to.std_alc_amt(r.std_alc_amt());
		openPanel("MG", "MGBDP0230", T1, to);
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
	 * Panel[Btn]のボタン[open_MGBDP0240]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0240(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0240(r);
	}
	protected void doBtn_open_MGBDP0240(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0240");
		mcframe.clientMGBD.MGBDP0240.CndR to = mcframe.clientMGBD.MGBDP0240.CndR.create();
		to.calc_grp_cd(r.calc_grp_cd());
		to.calc_no(r.calc_no());
		to.wg_cd(r.wg_cd());
		to.alc_ac_cd(r.alc_ac_cd());
		to.dpt_cd(r.dpt_cd());
		to.loc_cd(r.loc_cd());
		to.oper_cd(r.oper_cd());
		to.bp_cd(r.bp_cd());
		to.ctg_cd(r.ctg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.iv_no(r.iv_no());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		
		if (!MAC_ALC_CALC_TYP.isMONTH_ALC(getCndR().alc_calc_typ())) {
			List<String> list = new ArrayList<String>();
			list.add(mcframe.clientMGBD.MGBDP0240.CndR.$ym_fr);
			list.add(mcframe.clientMGBD.MGBDP0240.CndR.$ym_to);
			aso.putCnd(to, list);
		}
		else {
			to.ym_fr(r.ym());
			to.ym_to(r.ym());
			aso.putCnd(to);
		}
		
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MGBDP0630]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0630(MCEventInfo info) {
		doBtn_open_MGBDP0630();
	}
	protected void doBtn_open_MGBDP0630() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0630");
		mcframe.clientMGBD.MGBDP0630.MGBDP_StdAlcRateReg p = (mcframe.clientMGBD.MGBDP0630.MGBDP_StdAlcRateReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0630.CndR to = mcframe.clientMGBD.MGBDP0630.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getInsCndR().calc_ctg_cd());
		to.wg_cd(getInsCndR().wg_cd());
		to.term_fr(getInsCndR().term());
		to.term_to(getInsCndR().term());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBGP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0200(MCEventInfo info) {
		doBtn_open_MGBGP0200();
	}
	protected void doBtn_open_MGBGP0200() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBGP0200");
		mcframe.clientMGBG.MGBGP0200.MGBGP_AlcRateReg p = (mcframe.clientMGBG.MGBGP0200.MGBGP_AlcRateReg) aso.getPanel();
		mcframe.clientMGBG.MGBGP0200.CndR to = mcframe.clientMGBG.MGBGP0200.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getInsCndR().calc_ctg_cd());
		to.wg_cd(getInsCndR().wg_cd());
		if (MAC_ALC_CALC_TYP.isMONTH_ALC(getInsCndR().alc_calc_typ())) {
			to.ym_fr(getInsCndR().st_ym());
			to.ym_to(getInsCndR().end_ym());
		}
		else {
			to.ym_fr(getInsCndR().end_ym());
			to.ym_to(getInsCndR().end_ym());
		}
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBDL0200_Ins01();
	}
	
	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		InsCnd_calc_no_p_PPanel.setRelateBeans(InsCnd_calc_grp_cd);
	}
	
	// -----------------------------------------------
	// init-screen
	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	protected void initCalcCtg() {
		if (Cnd_ope_INS.isSelected()) {
			setDefCalcCtg(InsCnd_calc_ctg_cd);
		}
	}
	
	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setStatusCom();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
		displayColumn();
	}
	
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}
	
	protected void setStatusCom() {
		setTabMode();
		setFocus();
		setBtnMode();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setTabMode() {
		if(Cnd_ope_INS.isSelected()) {
			setTabComponentEnable(FoldTab, Tab4Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
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
		if (r == null || isNull(r.calc_no())) {
			Btn_open_MGBDP0230.setMode(MCMode.DISABLE);
			Btn_open_MGBDP0240.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MGBDP0230);
			if (MGC_INPT_ALC_TYP.isPRE_ALC(r.inpt_alc_typ())) {
				setDefaultMode(Btn_open_MGBDP0240);
			}
			else {
				Btn_open_MGBDP0240.setMode(MCMode.DISABLE);
			}
		}
		if (Tab4Panel.isShowing()) {
			setDefaultMode(Btn_open_MGBDP0630);
			setDefaultMode(Btn_open_MGBGP0200);
			setDefaultMode(Btn_ins);
		}
		else {
			Btn_open_MGBDP0630.setMode(MCMode.DISABLE);
			Btn_open_MGBGP0200.setMode(MCMode.DISABLE);
			Btn_ins.setMode(MCMode.DISABLE);
		}
	}
	
	protected void displayColumn() {
		boolean flg = !isNull(getCndR().pln_calc_grp_cd());
		
		for (MCColumnConfig c : new MCColumnConfig[] {
				columnRslt_pln_amt, columnRslt_pln_diff, columnRslt_capa_diff,
				columnRslt_pln_alc_tgt_val
		}) {
			setColModeByFlg(c, flg);
		}
	}
	
	protected boolean isEnableBtn_open_MGBDP0230(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.calc_no());
	}
	
	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL());
		initCalcCtg();
		setSrchStatus();
		
		if (Cnd_ope_INS.isSelected()) {
			copyComboValue(Cnd_calc_grp_cd, InsCnd_calc_grp_cd);
			copyComboValue(Cnd_calc_no, InsCnd_calc_no);
		}
	}
	
	protected void copyComboValue(MCTextComboBox from, MCTextComboBox to) {
		if (to.checkValue(from.getValue()).size() == 0) {
			setValueEx(to, from.getValue());
		}
		else {
			setValueEx(to, null);
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MGBDP0230(r)) {
				doBtn_open_MGBDP0230(r);
			}
		}
	}

	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);

		if (MAC_ALC_CALC_TYP.isNON(getCndR().alc_calc_typ())) {
			setValueEx(Cnd_pln_calc_grp_cd, null);
			Cnd_pln_calc_grp_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_pln_calc_grp_cd);
		}
	}
	
	// -----------------------------------------------
	// CellConfig
	protected RsltTableCellConfig createRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	protected class RsltTableCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (isSame(index + 1, getRsltL().size())) {
				return _vTtlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltTableCellConfig());
	}
	
	protected void setColorInfo() {
		RsltTableCellConfig cc = (RsltTableCellConfig) RsltTable.getCellConfig();
		
		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color alcRateColor = getAlcRateColor(this);
		Color slsCostColor = getSlsCostColor(this);
		
		for (MCColumnConfig c : RsltTable.getViewColumnConfigs()) {
			if (c == columnRslt_alc_rate) {
				cc.putColumnBG(c, alcRateColor);
			}
			else if (c == columnRslt_alc_diff || c == columnRslt_std_alc_diff) {
				cc.putColumnBG(c, slsCostColor);
			}
			else if (c == columnRslt_pln_amt || c == columnRslt_pln_diff
					|| c == columnRslt_capa_diff || c == columnRslt_pln_alc_tgt_val) {
				cc.putColumnBG(c, _vTtlColor);
			}
			else {
				cc.putColumnBG(c, expnsSrchRsltColor);
			}
		}
	}

}