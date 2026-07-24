package mcframe.clientMGBD.MGBDP0220;

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
	protected CndR _cndR = null;
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
	 * [MG_MGBDL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0220_Srch01Caller<P extends MGBDP_AlcCalcRateSrch, B extends MG_MGBDL0220_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0220_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkAtLeastOne(Cnd_alc_fin_flg, Cnd_alc_yet_flg));
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			_cndR = getCndR().clone();
			calcDiff();
			addTtlRow();
		}
		
		protected void calcDiff() {
			for (RsltR r : bridge.down0()) {
				// 配賦差額、標準配賦差額の計算
				r.alc_diff(MCNumber.sum(r.alc_amt(),r.trd_alc_amt()).subtract(r.amt()));
				r.std_alc_diff(r.std_alc_amt().subtract(r.amt()));
			}
		}
		
		/**
		 * 合計行の追加
		 */
		protected void addTtlRow() {
			RsltR ttl = RsltR.create();
			ttl.amt(bridge.down0().sum(RsltR.$amt));
			ttl.alc_amt(bridge.down0().sum(RsltR.$alc_amt));
			ttl.trd_alc_amt(bridge.down0().sum(RsltR.$trd_alc_amt));
			ttl.std_alc_amt(bridge.down0().sum(RsltR.$std_alc_amt));
			ttl.alc_diff(bridge.down0().sum(RsltR.$alc_diff));
			ttl.std_alc_diff(bridge.down0().sum(RsltR.$std_alc_diff));
			bridge.down0().add(ttl);
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
		callMG_MGBDL0220_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0200(MCEventInfo info) {
		RsltR selectedRow = RsltTable.getSelectedMCRow();
		if (isNull(selectedRow)) {
			message(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0200(selectedRow);
	}
	protected void doBtn_open_MGBDP0200(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0200");
		mcframe.clientMGBD.MGBDP0200.CndR to = mcframe.clientMGBD.MGBDP0200.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym_fr(r.ym());
		to.ym_to(r.ym());
		to.inpt_alc_typ(r.inpt_alc_typ());
		to.alc_ac_cd(r.alc_ac_cd());
		to.alc_ac_grp_cd1(r.alc_ac_grp_cd1());
		to.alc_ac_grp_cd2(r.alc_ac_grp_cd2());
		to.alc_ac_grp_cd3(r.alc_ac_grp_cd3());
		to.dpt_cd(r.dpt_cd());
		to.dpt_nm(r.dpt_nm());
		to.loc_cd(r.loc_cd());
		to.oper_cd(r.oper_cd());
		to.bp_cd(r.bp_cd());
		to.ctg_cd(r.ctg_cd());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
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
		to.expns_cd(r.expns_cd());
		to.expns_grp_cd(r.expns_grp_cd());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MGBDP0210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0210(MCEventInfo info) {
		RsltR selectedRow = RsltTable.getSelectedMCRow();
		if (isNull(selectedRow)) {
			message(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0210(selectedRow);
	}
	protected void doBtn_open_MGBDP0210(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0210");
		mcframe.clientMGBD.MGBDP0210.CndR to = mcframe.clientMGBD.MGBDP0210.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym_fr(r.ym());
		to.ym_to(r.ym());
		to.inpt_alc_typ(r.inpt_alc_typ());
		to.alc_ac_cd(r.alc_ac_cd());
		to.alc_ac_grp_cd1(r.alc_ac_grp_cd1());
		to.alc_ac_grp_cd2(r.alc_ac_grp_cd2());
		to.alc_ac_grp_cd3(r.alc_ac_grp_cd3());
		to.dpt_cd(r.dpt_cd());
		to.dpt_nm(r.dpt_nm());
		to.loc_cd(r.loc_cd());
		to.oper_cd(r.oper_cd());
		to.bp_cd(r.bp_cd());
		to.ctg_cd(r.ctg_cd());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
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
		to.expns_cd(r.expns_cd());
		to.expns_grp_cd(r.expns_grp_cd());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MGBDP0240]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0240(MCEventInfo info) {
		RsltR selectedRow = RsltTable.getSelectedMCRow();
		if (isNull(selectedRow)) {
			message(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0240(selectedRow);
	}
	protected void doBtn_open_MGBDP0240(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0240");
		mcframe.clientMGBD.MGBDP0240.CndR to = mcframe.clientMGBD.MGBDP0240.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.alc_ac_cd(r.alc_ac_cd());
		to.alc_ac_grp_cd1(r.alc_ac_grp_cd1());
		to.alc_ac_grp_cd2(r.alc_ac_grp_cd2());
		to.alc_ac_grp_cd3(r.alc_ac_grp_cd3());
		to.dpt_cd(r.dpt_cd());
		to.dpt_nm(r.dpt_nm());
		to.loc_cd(r.loc_cd());
		to.oper_cd(r.oper_cd());
		to.bp_cd(r.bp_cd());
		to.ctg_cd(r.ctg_cd());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
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
	
	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}
	
	// -----------------------------------------------
	// init-screen
	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_alc_fin_flg, true);
		setValueEx(Cnd_alc_yet_flg, true);
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_ym_flg, true);
		setValueEx(Cnd_alc_ac_flg, true);
		setValueEx(Cnd_dpt_flg, true);

		displayColumn();
	}
	
	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
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
		setBtnMode();
		setFocus();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		setBtnMode();
		setFocus();
	}
	
	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
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
		RsltR row = RsltTable.getSelectedMCRow();
		if (isNull(row) || row.getGUIIndex() == getRsltL().size() - 1) {
			Btn_open_MGBDP0200.setMode(MCMode.DISABLE);
			Btn_open_MGBDP0210.setMode(MCMode.DISABLE);
			Btn_open_MGBDP0240.setMode(MCMode.DISABLE);
		}
		else {
			if (row.alc_yet_flg()) {
				Btn_open_MGBDP0200.setMode(MCMode.DISABLE);
				Btn_open_MGBDP0210.setMode(MCMode.ENABLE);
			}
			else {
				Btn_open_MGBDP0200.setMode(MCMode.ENABLE);
				Btn_open_MGBDP0210.setMode(MCMode.DISABLE);
			}
			if (MGC_INPT_ALC_TYP.isPRE_ALC(row.inpt_alc_typ())) {
				Btn_open_MGBDP0240.setMode(MCMode.ENABLE);
			}
			else {
				Btn_open_MGBDP0240.setMode(MCMode.DISABLE);
			}
		}
	}
	
	protected boolean isEnableBtn_open_MGBDP0200() {
		if (Btn_open_MGBDP0200.isEnabled()) {
			return true;
		}
		return false;
	}
	
	protected boolean isEnableBtn_open_MGBDP0210() {
		if (Btn_open_MGBDP0210.isEnabled()) {
			return true;
		}
		return false;
	}
	
	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
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
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MGBDP0200()) {
				doBtn_open_MGBDP0200(r);
			}
			else if (isEnableBtn_open_MGBDP0210()) {
				doBtn_open_MGBDP0210(r);
			}
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
			if (index == getRsltL().size() - 1) {
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
		Color slsCostColor = getSlsCostColor(this);
		
		for (MCColumnConfig c : RsltTable.getViewColumnConfigs()) {
			if (c == columnRslt_alc_diff || c == columnRslt_std_alc_diff) {
				cc.putColumnBG(c, slsCostColor);
			}
			else {
				cc.putColumnBG(c, expnsSrchRsltColor);
			}
		}
	}

}