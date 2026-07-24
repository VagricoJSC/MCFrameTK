package mcframe.clientMGBG.MGBGP0110;

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
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5030.*;
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
import java.util.Map;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBGP_PreRateTermReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBGP_PreRateTermReg_MC extends MGBGP_PreRateTermReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreRateTermReg_MC() {
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
	public MGBGP_PreRateTermReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBGL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0110_Srch01Caller<P extends MGBGP_PreRateTermReg, B extends MG_MGBGL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBGL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			copyCndToHdr();

			super.show();
		}
		protected void copyCndToHdr() {
			setValueEx(Hdr_calc_ctg_cd, getCndR().calc_ctg_cd());
			setValueEx(Hdr_term, getCndR().term());
			getHdrR().wg_cd(getCndR().wg_cd());
			getHdrR().wg_nm(getCndR().wg_nm());
			getHdrR().pre_alc_rate_cd(getCndR().pre_alc_rate_cd());
			getHdrR().pre_alc_rate_nm(getCndR().pre_alc_rate_nm());
			setValueEx(Hdr_pre_alc_ptn_cd, getCndR().pre_alc_ptn_cd());
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
	 * [MG_MGBGL0110_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0110_Ins01Caller<P extends MGBGP_PreRateTermReg, B extends MG_MGBGL0110_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBGL0110_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			if (!chkReq()) {
				return false;
			}
			return super.checkForCall();
		}

		protected boolean chkReq() {
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(panel.checkReq(getHdrR()));
			if (msgList.size() > 0) {
				showStackMsg(msgList);
				return false;
			}
			return true;
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			copyHdrToRslt();
		}

		@Override
		protected void show() {
			super.show();
			copyHdrToCnd();
		}
		protected void copyHdrToCnd() {
			setValueEx(Cnd_calc_ctg_cd, getHdrR().calc_ctg_cd());
			setValueEx(Cnd_term, getHdrR().term());
			setValueEx(Cnd_wg_cd, getHdrR().wg_cd());
			setValueEx(Cnd_pre_alc_rate_cd, getHdrR().pre_alc_rate_cd());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_IStatus();
		}
	}

	/**
	 * [MG_MGBGL0110_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0110_Upd01Caller<P extends MGBGP_PreRateTermReg, B extends MG_MGBGL0110_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBGL0110_Upd01Caller(P p, B b) {
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
			copyHdrToRslt();
		}
	}

	/**
	 * [MG_MGBGL0110_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0110_Del01Caller<P extends MGBGP_PreRateTermReg, B extends MG_MGBGL0110_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBGL0110_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBGL0110_Srch01();
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
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBGL0110_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBGL0110_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBGL0110_Del01();
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
		Cnd_term_p_PPanel.setDefault(false);
		Hdr_term_p_PPanel.setDefault(false);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void listInit() {
		super.listInit();

		getRslt_dpt_cd_ListPutter().putBind(CostDptCols.$i_ym, Hdr_term);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		initCalcCtg();
		displayColumn();
		setDefWg();
	}
	protected void initCalcCtg() {
		if (Cnd_ope_INS.isSelected()) {
			setDefCalcCtg(Hdr_calc_ctg_cd);
		}
		else {
			setDefCalcCtg(Cnd_calc_ctg_cd);
		}
	}
	protected void displayColumn() {
		setShowFlg();
		changeColumnMode(RsltTable, getHdrR(), RsltR.$$SHOW);
		RsltTable.adjustWidth();
	}
	protected void setShowFlg() {
		Map<String, String> map = getHdrR().getExtMap(RsltR.$$SHOW);
		for(Map.Entry<String, String> e : map.entrySet()) {
			getHdrR().setBooleanNE(e.getValue(), MAC_PRE_ALC_TYP.isTARGET(getHdrR().getString(e.getKey())));
		}
	}
	protected void setDefWg() {
		String wg = getSysParm("DEF_WG_CD");
		if (!isNullOrNullVal(wg)) {
			getCndR().wg_cd(wg);
		}
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getRsltL()) {
			list.add(RsltR.$calc_ctg_cd);
			list.add(RsltR.$term);
			list.add(RsltR.$wg_cd);
			list.add(RsltR.$pre_alc_rate_cd);
		}
		return list;
	}

	// -----------------------------------------------
	// status
	public void setSrchStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else {
			if (Cnd_ope_UPD.isSelected()) {
				setSRCHStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setSRCHStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setSRCHStatus();
			}
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	public void setRefStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
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
	public void setINSStatus() {
		super.setINSStatus();
		Ctrl_ctrl_PPanel.expand(false);
		setStatusCom();
	}
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
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
	}
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		displayColumn();
	}

	protected void setStatusCom() {		
		setStatusColumn();
		fillspace();
		setFocus();
		setBtnMode();
		displayColumn();
	}
	protected void setStatusColumn() {
		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	protected void fillspace() {
		if (canEditRslt()) {
			RsltTable.fillSpace();
		}
	}
	protected boolean canEditRslt() {
		return isUpdStatus() && !isNull(getHdrR().pre_alc_ptn_cd());
	}
	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			if (Cnd_ope_INS.isSelected()) {
				HdrPanel.focusFirstComponent();
			}
			else {
				CndPanel.focusFirstComponent();
			}
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null || !canEditRslt()) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (!isNull(r.upd_cntr())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}
				setDefaultMode(Btn_rcopy);
			}
			// 行追加ボタン
			if (canEditRslt()) {
				setDefaultMode(Btn_radd);
			}
			else {
				Btn_radd.setMode(MCMode.DISABLE);
			}
		}
	}
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD) || isSame(getStatus(), INS);
	}
	protected boolean isRefStatus() {
		return isSame(getStatus(), REF);
	}

	// -----------------------------------------------
	// Event
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr_term.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_term) {
			doHdr_term_LC(info);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearforOpeChange(info);
		initCalcCtg();
	}

	protected void clearforOpeChange(MCEventInfo info) {
		if (isRefStatus()) {
			if (Cnd_ope_INS.isSelected()) {
				// 参照登録
				getHdrR().pre_alc_rate_cd(null);
				getHdrR().pre_alc_rate_nm(null);
				getRsltL().setStatus(Status.CREATE);
				clearNotInheritInfo(new ArrayList<MCContainer>(getRsltL()));
				setRefStatus();
				HdrPanel.focusFirstComponent();
			}
			else {
				setRefStatus();
			}
			
		}
		else {
			clearContainers(getRsltL(), getHdrR());
			setSrchStatus();
		}
		
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public boolean doHdr_pre_alc_rate_cd_VC(MCEventInfo info) {
		MCRow mew = info.getNewListRow();
		String mewPreAlcPtnCd = null;
		if (mew != null) {
			mewPreAlcPtnCd = mew.getStringNE("pre_alc_ptn_cd");
		}
		if (!isSame(mewPreAlcPtnCd, getHdrR().pre_alc_ptn_cd())) {
			if (!getRsltL().isStatusNone() && !confirmRegDataClear()) {
				return false;
			}
		}
		return super.doHdr_pre_alc_rate_cd_VC(info);
	}

	@Override
	public void doHdr_pre_alc_ptn_cd_LC(MCEventInfo info) {
		super.doHdr_pre_alc_ptn_cd_LC(info);
		clearContainers(getRsltL());
		setStatusCom();
	}

	@Override
	public void doHdr_calc_ctg_cd_LC(MCEventInfo info) {
		super.doHdr_calc_ctg_cd_LC(info);
		clearPreAlcRate();
	}
	@Override
	public void doHdr_wg_cd_LC(MCEventInfo info) {
		super.doHdr_wg_cd_LC(info);
		clearPreAlcRate();
	}

	protected void doHdr_term_LC(MCEventInfo info) {
		clearPreAlcRate();
	}

	protected void clearPreAlcRate() {
		setValueEx(Hdr_pre_alc_rate_cd, null);
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
			if (isUpdStatus()) {
				if (!isNull(r.upd_cntr()) && isKeyColumn(column, r)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	// -----------------------------------------------
	// Common
	protected void copyHdrToRslt() {
		for (RsltR r : getRsltL().subList(RsltR.$check, true)) {
			if (isNull(r.upd_cntr())) {
				r.calc_ctg_cd(getHdrR().calc_ctg_cd());
				r.term(getHdrR().term());
				r.wg_cd(getHdrR().wg_cd());
				r.pre_alc_rate_cd(getHdrR().pre_alc_rate_cd());
			}
		}
	}

	protected void checkForCallStackSub(MCMessageList msgList) {
		String[] cols = getShowKeyCols();

		if (cols.length == 0) {
			if (getRsltL().subList(r -> !isNull(r.upd_cntr()) || r.check()).size() > 1) {
				msgList.add(new MCMessage(MGBGP0001));
			}
		}

		MCColumnConfig[] ccs = getShowKeyColumnConfigs();
		for (RsltR r : getRsltL().subList(RsltR.$check, true)) {
			msgList.addAll(checkAtLeastOneInput(r, ccs));
		}
	}
	protected String[] getShowKeyCols() {
		List<String> l = new ArrayList<String>();
		RsltR r = RsltR.create();
		for(Map.Entry<String, String> e : r.getExtMap(RsltR.$$SHOW).entrySet()) {
			if (getHdrR().getBoolean(e.getValue())) {
				MCColumnConfig cc = RsltTable.getColumnConfigByBaseTableColumnName(e.getKey());
				if (isKeyColumn(cc, r)) {
					l.add(e.getKey());
				}
			}
		}
		return l.toArray(new String[]{});
	}
	protected MCColumnConfig[] getShowKeyColumnConfigs() {
		List<MCColumnConfig> l = new ArrayList<MCColumnConfig>();
		for (String col : getShowKeyCols()) {
			MCColumnConfig cc = RsltTable.getColumnConfigByBaseTableColumnName(col);
			l.add(cc);
		}
		return l.toArray(new MCColumnConfig[]{});
	}

	@Override
	public MCList getHdr_pre_alc_rate_cd(MCRow row, MCEventInfo info) {
		String wg = getSysParm("DEF_WG_CD");
		if (!isNullOrNullVal(wg) && isNullOrNullVal(getHdrR().wg_cd())) {
			getHdrR().wg_cd(wg);
			row.addStringColumn(PreAlcRateWithPtnNotInPreRateTermCols.$i_wg_cd, wg);
		}
		return super.getHdr_pre_alc_rate_cd(row, info);
	}

}