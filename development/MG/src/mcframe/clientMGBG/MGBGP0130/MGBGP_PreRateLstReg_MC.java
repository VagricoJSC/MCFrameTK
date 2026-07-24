package mcframe.clientMGBG.MGBGP0130;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5160.*;
import mcframe.clientMAUB.MAUBP5310.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
import java.util.Map;
import java.util.LinkedHashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBGP_PreRateLstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBGP_PreRateLstReg_MC extends MGBGP_PreRateLstReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 各要素キーカラムと一次配賦区分カラム名のマッピング */
	protected Map<MCColumnConfig, String> _columnPreAlcPtnColumnMap;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreRateLstReg_MC() {
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
	public MGBGP_PreRateLstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 一次配賦比率設定対象要素のキーカラムと一次配賦区分カラム名のマッピング<P>
	 * キー：一次配賦比率設定対象要素のキーカラム（elmKey）<br>
	 * 値：対象の一次配賦区分カラム名
	 */
	protected Map<MCColumnConfig, String> getColumnAlcTransPtnColumnMap() {
		if (_columnPreAlcPtnColumnMap == null) {
			_columnPreAlcPtnColumnMap = createColumnAlcTransPtnColumnMap();
		}
		return _columnPreAlcPtnColumnMap;
	}

	protected Map<MCColumnConfig, String> createColumnAlcTransPtnColumnMap() {
		Map<MCColumnConfig, String> m = new LinkedHashMap<MCColumnConfig, String>();
		m.put(columnRslt_dpt_cd,			RsltR.$dpt_alc_typ);
		m.put(columnRslt_loc_cd,			RsltR.$loc_alc_typ);
		m.put(columnRslt_oper_cd,			RsltR.$oper_alc_typ);
		m.put(columnRslt_bp_cd,				RsltR.$bp_alc_typ);
		m.put(columnRslt_ctg_cd,			RsltR.$ctg_alc_typ);
		m.put(columnRslt_itm_cd,			RsltR.$itm_alc_typ);
		m.put(columnRslt_itm_sub1,			RsltR.$itm_alc_typ);
		m.put(columnRslt_itm_sub2,			RsltR.$itm_alc_typ);
		m.put(columnRslt_itm_sub3,			RsltR.$itm_alc_typ);
		m.put(columnRslt_lot_no,			RsltR.$lot_alc_typ);
		m.put(columnRslt_sublot_no,			RsltR.$sublot_alc_typ);
		m.put(columnRslt_sno1,				RsltR.$sno1_alc_typ);
		m.put(columnRslt_sno2,				RsltR.$sno2_alc_typ);
		m.put(columnRslt_sno3,				RsltR.$sno3_alc_typ);
		m.put(columnRslt_sno4,				RsltR.$sno4_alc_typ);
		m.put(columnRslt_itm_mfg_inst_no,	RsltR.$inst_alc_typ);
		m.put(columnRslt_iv_no,				RsltR.$iv_alc_typ);
		m.put(columnRslt_po_no,				RsltR.$po_alc_typ);
		m.put(columnRslt_slo_no,			RsltR.$slo_alc_typ);
		m.put(columnRslt_alc_ac_cd,			RsltR.$alc_ac_alc_typ);
		m.put(columnRslt_trd_wg_cd,			RsltR.$wg_alc_typ);		
		return m;
	}

	/**
	 * [MG_MGBGL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Srch01Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBGL0130_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			if (!Cnd_tgt_TERM.isSelected()) {
				msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			}
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
	 * [MG_MGBGL0130_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Upd01Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBGL0130_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBGL0130_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Upd02Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBGL0130_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBGL0130_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Del01Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBGL0130_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBGL0130_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Del02Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBGL0130_Del02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBGL0130_Del03]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Del03Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Del03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBGL0130_Del03Caller(P p, B b) {
			super(p, b);
		}
		
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getDelCndR()));
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}
	}

	/**
	 * [MG_MGBGL0130_Del04]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Del04Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Del04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBGL0130_Del04Caller(P p, B b) {
			super(p, b);
		}
		
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getDelCndR()));
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}
	}

	/**
	 * [MG_MGBGL0130_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Imp01Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBGL0130_Imp01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBGL0130_Imp02]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Imp02Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Imp02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBGL0130_Imp02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (RsltR r : bridge.down0()) {
				r.check(true);
			}
		}

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBGL0130_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Ins01Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Ins01Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBGL0130_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBGL0130_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Ins02Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Ins02Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBGL0130_Ins02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBGL0130_Ins03]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Ins03Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Ins03Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBGL0130_Ins03Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBGL0130_Ins04]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Ins04Caller<P extends MGBGP_PreRateLstReg, B extends MG_MGBGL0130_Ins04Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBGL0130_Ins04Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBGL0130_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBGP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0110(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		doBtn_open_MGBGP0110(r);
	}
	protected void doBtn_open_MGBGP0110(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBGP0110");

		mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg p = (mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg) aso.getPanel();
		mcframe.clientMGBG.MGBGP0110.CndR to = mcframe.clientMGBG.MGBGP0110.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.term(r.term());
		to.wg_cd(r.wg_cd());
		to.pre_alc_rate_cd(r.pre_alc_rate_cd());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();

		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBGP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		doBtn_open_MGBGP0120(r);
	}
	protected void doBtn_open_MGBGP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBGP0120");

		mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg p = (mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg) aso.getPanel();
		mcframe.clientMGBG.MGBGP0120.CndR to = mcframe.clientMGBG.MGBGP0120.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		if (Cnd_tgt_PLN.isSelected()) {
			to.sa_typ(MAC_SA_TYP.PLN.value());
		}
		else {
			to.sa_typ(MAC_SA_TYP.ACT.value());
		}
		
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.ym(r.ym());
		to.wg_cd(r.wg_cd());
		to.pre_alc_rate_cd(r.pre_alc_rate_cd());
		
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();

		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(RsltTable);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		if (Cnd_tgt_TERM.isSelected()) {
			callMG_MGBGL0130_Upd01();
		}
		else {
			callMG_MGBGL0130_Upd02();
		}
	}
	/**
	 * Panel[Btn]のボタン[ins_in_file]の押下時の処理
	 */
	@Override
	public void doBtn_ins_in_file(MCEventInfo info) {
		if (Cnd_tgt_TERM.isSelected()) {
			callMG_MGBGL0130_Ins01();
		}
		else {
			callMG_MGBGL0130_Ins02();
		}
	}
	/**
	 * Panel[Btn]のボタン[ins_del_in_file]の押下時の処理
	 */
	@Override
	public void doBtn_ins_del_in_file(MCEventInfo info) {
		if (Cnd_tgt_TERM.isSelected()) {
			callMG_MGBGL0130_Ins03();
		}
		else {
			callMG_MGBGL0130_Ins04();
		}
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		if (Cnd_tgt_TERM.isSelected()) {
			callMG_MGBGL0130_Del01();
		}
		else {
			callMG_MGBGL0130_Del02();
		}
	}
	/**
	 * Panel[Btn]のボタン[del_bulk]の押下時の処理
	 */
	@Override
	public void doBtn_del_bulk(MCEventInfo info) {
		if (Cnd_tgt_TERM.isSelected()) {
			callMG_MGBGL0130_Del03();
		}
		else {
			callMG_MGBGL0130_Del04();
		}
	}

	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
	}
	
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_term_fr, term.term());
			setValueEx(Cnd_term_to, term.term());
			setValueEx(DelCnd_term_fr, term.term());
			setValueEx(DelCnd_term_to, term.term());
		}
		
		initCalcCtg();
	}

	protected void initCalcCtg() {
		if (Cnd_ope_DELBULK.isSelected() || Cnd_ope_INSDEL_FILE.isSelected()) {
			setDefCalcCtg(DelCnd_calc_ctg_cd);
		}
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}
	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		else if (Cnd_ope_DELBULK.isSelected()) {
			setDEL_BULKStatus();
		}
		else if (Cnd_ope_INS_FILE.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_INSDEL_FILE.isSelected()) {
			setINS_DELStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setStatusCom();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}

	@Override
	public void setDEL_BULKStatus() {
		super.setDEL_BULKStatus();
		setStatusCom();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	@Override
	public void setINS_DELStatus() {
		super.setINS_DELStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		displayColumn();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setStatusCom() {
		setTabMode();
		displayCnd();
		displayColumn();
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
		setOpenBtnMode();
	}

	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel);
		}
		else if (Cnd_ope_DELBULK.isSelected() || Cnd_ope_INSDEL_FILE.isSelected()) {
			setTabComponentEnable(FoldTab, Tab2Panel);
		}
		else {
			setTabComponentEnable(FoldTab);
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

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (!r.isStatusCreate() && !r.isEmpty()) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
	}

	/**
	 * 操作種別によるステータスカラムの表示・非表示切替
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	protected void displayCnd() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_REF.isSelected() || Cnd_ope_DEL.isSelected()) {
			if (Cnd_tgt_TERM.isSelected()) {
				setDefaultMode(Cnd_term_fr);
				setDefaultMode(Cnd_term_to);
				Cnd_ym_fr.setMode(MCMode.READ_ONLY);
				Cnd_ym_to.setMode(MCMode.READ_ONLY);
			}
			else {
				Cnd_term_fr.setMode(MCMode.READ_ONLY);
				Cnd_term_to.setMode(MCMode.READ_ONLY);
				setDefaultMode(Cnd_ym_fr);
				setDefaultMode(Cnd_ym_to);
			}
		}
		else if (Cnd_ope_DELBULK.isSelected() || Cnd_ope_INSDEL_FILE.isSelected()) {
			if (Cnd_tgt_TERM.isSelected()) {
				setDefaultMode(DelCnd_term_fr);
				setDefaultMode(DelCnd_term_to);
				DelCnd_ym_fr.setMode(MCMode.READ_ONLY);
				DelCnd_ym_to.setMode(MCMode.READ_ONLY);
			}
			else {
				DelCnd_term_fr.setMode(MCMode.READ_ONLY);
				DelCnd_term_to.setMode(MCMode.READ_ONLY);
				setDefaultMode(DelCnd_ym_fr);
				setDefaultMode(DelCnd_ym_to);
			}
		}
	}

	protected void displayColumn() {
		if (Cnd_tgt_TERM.isSelected()) {
			setDefaultMode(columnRslt_term);
			setDefaultMode(columnRslt_term_nm);
			setDefaultMode(columnRslt_term_rmrks);
			setDefaultMode(columnRslt_term_sub_char1);
			setDefaultMode(columnRslt_term_sub_char2);
			setDefaultMode(columnRslt_term_sub_char3);
			
			columnRslt_ym.setMode(MCMode.INVISIBLE);
			columnRslt_mly_rmrks.setMode(MCMode.INVISIBLE);
			columnRslt_mly_sub_char1.setMode(MCMode.INVISIBLE);
			columnRslt_mly_sub_char2.setMode(MCMode.INVISIBLE);
			columnRslt_mly_sub_char3.setMode(MCMode.INVISIBLE);
		}
		else {
			setDefaultMode(columnRslt_ym);
			setDefaultMode(columnRslt_mly_rmrks);
			setDefaultMode(columnRslt_mly_sub_char1);
			setDefaultMode(columnRslt_mly_sub_char2);
			setDefaultMode(columnRslt_mly_sub_char3);
			
			columnRslt_term.setMode(MCMode.INVISIBLE);
			columnRslt_term_nm.setMode(MCMode.INVISIBLE);
			columnRslt_term_rmrks.setMode(MCMode.INVISIBLE);
			columnRslt_term_sub_char1.setMode(MCMode.INVISIBLE);
			columnRslt_term_sub_char2.setMode(MCMode.INVISIBLE);
			columnRslt_term_sub_char3.setMode(MCMode.INVISIBLE);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnRslt_term.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == columnRslt_term) {
			doRslt_term_LC(info);
		}
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isRegStatus() || isStatusNone(getRsltL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		initCalcCtg();
		setSrchStatus();
	}
	
	@Override
	public void doCnd_tgt_NC(MCEventInfo info) {
		super.doCnd_tgt_NC(info);
		clearUpdDataSrchMode(info);
		setDefaultCnd(info);
		setSrchStatus();
	}
	protected void clearUpdDataSrchMode(MCEventInfo info) {
		getRsltL().clear();
		fillSpace();
	}
	protected void setDefaultCnd(MCEventInfo info) {
		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);

		if (Cnd_tgt_TERM.isSelected()) {
			setValueEx(Cnd_ym_fr, null);
			setValueEx(Cnd_ym_to, null);
			setValueEx(DelCnd_ym_fr, null);
			setValueEx(DelCnd_ym_to, null);

			setValueEx(Cnd_term_fr, term.term());
			setValueEx(Cnd_term_to, term.term());
			setValueEx(DelCnd_term_fr, term.term());
			setValueEx(DelCnd_term_to, term.term());
		}
		else if (isOldTgtTerm(info)) {
			setValueEx(Cnd_term_fr, null);
			setValueEx(Cnd_term_to, null);
			setValueEx(DelCnd_term_fr, null);
			setValueEx(DelCnd_term_to, null);

			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
			setValueEx(DelCnd_ym_fr, term.term());
			setValueEx(DelCnd_ym_to, term.term_end_ym().addMonth(-1));
		}
	}
	
	/**
	 * 対象変更前が TERM の場合は true を返す
	 * @param info
	 * @return
	 */
	protected boolean isOldTgtTerm(MCEventInfo info) {
		return isSame(info.getOldValue(), Cnd_tgt_TERM.getActionCommand());
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
		setOpenBtnMode();
	}

	@Override
	public void doRslt_calc_ctg_cd_LC(MCEventInfo info) {
		int i = info.getEventIndex();
		setValueEx(columnRslt_pre_alc_rate_cd, i, null);
		setOpenBtnMode();
	}

	public void doRslt_term_LC(MCEventInfo info) {
		int i = info.getEventIndex();
		setValueEx(columnRslt_pre_alc_rate_cd, i, null);
		setOpenBtnMode();
	}

	@Override
	public void doRslt_ym_LC(MCEventInfo info) {
		int i = info.getEventIndex();
		setValueEx(columnRslt_pre_alc_rate_cd, i, null);
		setOpenBtnMode();
	}

	@Override
	public void doRslt_pre_alc_rate_cd_LC(MCEventInfo info) {
		int i = info.getEventIndex();
		RsltR r = getRsltL().get(i);
		clearTgt(i, r);
		setOpenBtnMode();
	}

	protected void clearTgt(int i, RsltR r) {
		for (MCColumnConfig column :getColumnAlcTransPtnColumnMap().keySet()) {
			setValueEx(column, i, null);
		}
	}

	/**
	 * 画面遷移ボタンの押下モードの設定
	 */
	protected void setOpenBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			Btn_open_MGBGP0110.setMode(MCMode.DISABLE);
			Btn_open_MGBGP0120.setMode(MCMode.DISABLE);
		}
		else {
			if (Cnd_tgt_TERM.isSelected()) {
				if (isNullOr(r.calc_ctg_cd(), r.wg_cd(), r.term(), r.pre_alc_rate_cd())) {
					Btn_open_MGBGP0110.setMode(MCMode.DISABLE);
					Btn_open_MGBGP0120.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_open_MGBGP0110);
					Btn_open_MGBGP0120.setMode(MCMode.DISABLE);
				}
			}
			else {
				if (isNullOr(r.calc_ctg_cd(), r.wg_cd(), r.ym(), r.pre_alc_rate_cd())) {
					Btn_open_MGBGP0110.setMode(MCMode.DISABLE);
					Btn_open_MGBGP0120.setMode(MCMode.DISABLE);
				}
				else {
					Btn_open_MGBGP0110.setMode(MCMode.DISABLE);
					setDefaultMode(Btn_open_MGBGP0120);
				}
			}
		}
	}

	// -----------------------------------------------
	// File input
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}
		
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_tgt_TERM.isSelected()) {
				callMG_MGBGL0130_Imp01();
			}
			else {
				callMG_MGBGL0130_Imp02();
			}
		}
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
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

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			// 登録・訂正
			if (isUpdStatus()) {
				if (!isNull(r.upd_cntr()) && isKeyColumn(column, r)) {
					return MCMode.READ_ONLY;
				}
				if (getColumnAlcTransPtnColumnMap().containsKey(column)) {
					if (!MAC_PRE_ALC_TYP.isTARGET(
							r.getString(getColumnAlcTransPtnColumnMap().get(column)))) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	// -----------------------------------------------
	// List
	@Override
	public MCList getCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info) {
		setListMode(row);
		return super.getCnd_pre_alc_rate_cd(row, info);
	}
	
	@Override
	public MCList getDelCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info) {
		setListMode(row);
		return super.getDelCnd_pre_alc_rate_cd(row, info);
	}

	protected void setListMode(MCRow row) {
		if (Cnd_tgt_TERM.isSelected()) {
			row.addBooleanColumn(PreAlcRateWithPtnCols.$i_term_flg, true);
		}
		else {
			row.addBooleanColumn(PreAlcRateWithPtnCols.$i_term_flg, false);

			if (Cnd_tgt_PLN.isSelected()) {
				row.addStringColumn(PreAlcRateWithPtnCols.$i_pln_mly_flg_str, "1");
			}
			else {
				row.addStringColumn(PreAlcRateWithPtnCols.$i_act_mly_flg_str, "1");
			}
		}
	}

	@Override
	public MCList getRslt_pre_alc_rate_cd(MCRow row, MCEventInfo info) {
		if (Cnd_tgt_TERM.isSelected()) {
			row.addBooleanColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_term_flg, true);
		}
		else {
			row.addBooleanColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_term_flg, false);

			if (Cnd_tgt_PLN.isSelected()) {
				row.addStringColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_pln_mly_flg_str, "1");
			}
			else {
				row.addStringColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_act_mly_flg_str, "1");
			}
		}

		RsltR r = getRsltL().get(info.getEventIndex());
		row.addStringColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_calc_ctg_cd, r.calc_ctg_cd());
		String wg = getSysParm("DEF_WG_CD");
		if (!isNullOrNullVal(wg) && isNullOrNullVal(r.wg_cd())) {
			r.wg_cd(wg);
		}
		row.addStringColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_wg_cd, r.wg_cd());
		if (Cnd_tgt_TERM.isSelected()) {
			row.addDateColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_term, r.term());
		}
		else {
			mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfoYM(this, r.ym());
			if (!isNull(term)) {
				row.addDateColumn(PreAlcRateInPreAlcCtgWithPtnCols.$i_term, term.term());
			}
		}

		return super.getRslt_pre_alc_rate_cd(row, info);
	}
	
	@Override
	public MCList getRslt_dpt_cd(MCRow row, MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (Cnd_tgt_TERM.isSelected()) {
			row.addDateColumn(CostDptCols.$i_ym, r.term());
		}
		else {
			row.addDateColumn(CostDptCols.$i_ym, r.ym());
		}
		return super.getRslt_dpt_cd(row, info);

	}

}