package mcframe.clientMGBD.MGBDP0640;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_CostItmCopyReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CostItmCopyReg_MC extends MGBDP_CostItmCopyReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CostItmCopyReg_MC() {
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
	public MGBDP_CostItmCopyReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0640_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0640_Srch01Caller<P extends MGBDP_CostItmCopyReg, B extends MG_MGBDL0640_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0640_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getTgtHdrR());
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setStatus();
		}
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		
	}

	/**
	 * [MG_MGBDL0640_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0640_Srch02Caller<P extends MGBDP_CostItmCopyReg, B extends MG_MGBDL0640_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0640_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getTgtHdrR());
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setStatus();
		}
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	/**
	 * [MG_MGBDL0640_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0640_Ins01Caller<P extends MGBDP_CostItmCopyReg, B extends MG_MGBDL0640_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0640_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DtlTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void statusClear() {
			getDtlL().setStatus(MCRow.NONE);
		}

	}

	/**
	 * [MG_MGBDL0640_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0640_Del01Caller<P extends MGBDP_CostItmCopyReg, B extends MG_MGBDL0640_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0640_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void moveFocus() {
			super.moveFocus();
			DtlTable.selectLeftmostColumn(0);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_REF_UPD.isSelected()) {
			callMG_MGBDL0640_Srch02();
		}
		else {
			callMG_MGBDL0640_Srch01();
		}
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0500]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0500(MCEventInfo info) {
		doOpenPanel("MGBDP0500");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP0310]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP0310(MCEventInfo info) {
		doOpenPanel("MABCP0310");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0510]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0510(MCEventInfo info) {
		doOpenPanel("MGBDP0510");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0560]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0560(MCEventInfo info) {
		doOpenPanel("MGBDP0560");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0530]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0530(MCEventInfo info) {
		doOpenPanel("MGBDP0530");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0580]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0580(MCEventInfo info) {
		doOpenPanel("MGBDP0580");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0600]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0600(MCEventInfo info) {
		doOpenPanel("MGBDP0600");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0660]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0660(MCEventInfo info) {
		doOpenPanel("MGBDP0660");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0610]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0610(MCEventInfo info) {
		doOpenPanel("MGBDP0610");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0590]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0590(MCEventInfo info) {
		doOpenPanel("MGBDP0590");
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MGBDP0620]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MGBDP0620(MCEventInfo info) {
		doOpenPanel("MGBDP0620");
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0640_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0640_Del01();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(Cnd_release_flg_on, Cnd_release_flg_off));
		msgList.addAll(checkAtLeastOne(Cnd_del_flg_on, Cnd_del_flg_off));
	}
	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setDefCalcCtg(Cnd_calc_ctg_cd);
		setValueEx(Cnd_release_flg_off, true);
		setValueEx(Cnd_release_flg_on, true);
		setValueEx(Cnd_del_flg_off, true);
		setValueEx(Cnd_del_flg_on, true);
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if(isChanged()){
			return confirmRegDataClear();
		}
		return true;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub();
	}
	/**
	 * NCイベント処理
	 */
	protected void doCnd_ope_NCSub() {
		clearContainers(getTgtHdrR(), getDtlL(), getCopyTgtR());
		setSRCHStatus();
	}

	protected void setStatus() {
		String ope = getCndR().ope();
		if (Cnd_ope_REF.getActionCommand().equals(ope)) {
			setREFStatus();
		}
		else if (Cnd_ope_DEL.getActionCommand().equals(ope)) {
			setDELStatus();
		}
		else if (Cnd_ope_UPD.getActionCommand().equals(ope) ||
				Cnd_ope_REF_UPD.getActionCommand().equals(ope)) {
			setUPDStatus();
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		Ctrl_ctrl_PPanel.expand(false);
		DtlTable.selectLeftmostColumn(0);
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		Ctrl_ctrl_PPanel.expand(false);
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
		DtlTable.selectLeftmostColumn(0);
	}
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		doDtl_NCSub(info);
	}

	/**
	 * その他のNotificationChangeイベントを実行する。
	 */
	protected void doDtl_NCSub(MCEventInfo info) {
		int i = info.getEventIndex();
		DtlR dr = i >= 0 ? getDtlL().get(i) : null;
		dispSearchedTgtValue(dr);
		setOpenBtnFlgToCopyTgt(dr);
		setOpenBtnFlgMode();
	}
	@Override
	protected void setCellConfig(){
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	/**
	 * 明細情報用のCellConfigクラスを作成する
	 */
	protected DtlCellConfig createDtlCellConfig(){
		return new DtlCellConfig();
	}
	
	/**
	 * 明細情報用のCellConfigクラス
	 */
	protected class DtlCellConfig extends MGUDP_CellConfig{

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			return getPriorModeSub(index, column, table);
		}
		
		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 */
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			DtlR dtl = (DtlR)table.getBaseTable().getRow(index);
			// オペレーション実行後
			if (MAC_RTN_STS_TYP.isOK(dtl.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
			}
			
			return super.getPriorMode(index, column, table);
		 }

	}
	/**
	 * ボタンのフラグのモードを設定する。
	 */
	protected void setOpenBtnFlgMode() {
		//フラグの値がfalseのチェックボックスを読取専用にする。
		for(MCCheckBox c : MCBeansUtil.getAllComponents(
				MCCheckBox.class, CopyTgtPanel)) {
			
			if (!c.getRowValue()) {
				c.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(c);
			}
		}
	}
	
	protected void dispSearchedTgtValue(DtlR dr) {
		if (isNull(dr)) {
			return;
		}
		setValueEx(TgtHdr_calc_ctg_cd, dr.calc_ctg_cd());
		setValueEx(TgtHdr_term, dr.term());
	}
	protected void setOpenBtnFlgToCopyTgt(DtlR dr) {
		if (isNull(dr)) {
			return;
		}
		MCRow.copyvalue(getCopyTgtR(), dr);
	}
	
	protected void setOpenBtnFlgToDtl(MCRowBeans rb, DtlR dr) {
		if (dr == null || rb == null) {
			return;
		}
		
		String flgCol = rb.getBaseRowColumnName();
		dr.setValuesByName(getCopyTgtR(), flgCol);
	}
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		
		int strIdx = nc.getName().indexOf(".");
		String blockId = nc.getName().substring(0, strIdx);

		// コピー対象変更時、一覧の選択行にフラグの値をコピーする
		if (isSame(blockId,getBlockId(getCopyTgtR())) && nc instanceof MCRowBeans) {
			DtlR dtlR = DtlTable.getSelectedMCRow();
			setOpenBtnFlgToDtl((MCRowBeans) nc, dtlR);
		}
	}
	/**
	 * ボタン押下時の処理<br>
	 * @param scrId 遷移先画面ＩＤ
	 */
	protected void doOpenPanel(String scrId) {
		// 画面を起動する
		DtlR dr = DtlTable.getSelectedMCRow();
		if (dr == null) {
			dialog(msgNoSelectedRow());
			return;
		}		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener(
				scrId.substring(0, 2), scrId);
		setupAsoParam(aso, scrId);
		aso.show();
	}
	
	/**
	 * ScreenOpenerのパラメータを設定します。
	 * @param aso ScreenOpener
	 * @param scrId　遷移先画面ＩＤ
	 */
	protected void setupAsoParam(MAUCP_AppScreenOpener aso, String scrId) {
		aso.putCnd(createOpenParam(aso, scrId));
		aso.runValueInit();
		if (!isNotSrchActTgt(scrId)) {
			aso.putSearchAction();
		}
	}
	/**
	 * 検索を実行しない遷移先画面のＩＤかどうかを判定する。
	 * @param scrId 遷移先画面ＩＤ
	 * @return 検索実行対象の場合true
	 */
	protected boolean isNotSrchActTgt(String scrId) {
		//原価ＢＯＭ、原価品目工数
		return "MGBDP0530".equals(scrId) || "MGBDP0580".equals(scrId);
	}
	/**
	 * 画面遷移の引数を作成する
	 * @return 画面遷移の引数
	 */
	protected MCRow createOpenParam(MAUCP_AppScreenOpener aso, String scrId) {
		DtlR dr = DtlTable.getSelectedMCRow();

		if ("MABCP0310".equals(scrId)) {
			return createMABCP0310Param(aso, dr);
		}
		else if ("MGBDP0500".equals(scrId)) {
			return createMGBDP0500Param(aso, dr);
		}
		else if ("MGBDP0510".equals(scrId)) {
			return createMGBDP0510Param(aso, dr);
		}
		else if ("MGBDP0560".equals(scrId)) {
			return createMGBDP0560Param(aso, dr);
		}
		else if ("MGBDP0530".equals(scrId)) {
			return createMGBDP0530Param(aso, dr);
		}
		else if ("MGBDP0580".equals(scrId)) {
			return createMGBDP0580Param(aso, dr);
		}
		else if ("MGBDP0600".equals(scrId)) {
			return createMGBDP0600Param(aso, dr);
		}
		else if ("MGBDP0660".equals(scrId)) {
			return createMGBDP0660Param(aso, dr);
		}
		else if ("MGBDP0610".equals(scrId)) {
			return createMGBDP0610Param(aso, dr);
		}
		else if ("MGBDP0590".equals(scrId)) {
			return createMGBDP0590Param(aso, dr);
		}
		else if ("MGBDP0620".equals(scrId)) {
			return createMGBDP0620Param(aso, dr);
		}
		return null;
	}
	/**品目マスタ登録検索条件設定*/
	protected MCRow createMABCP0310Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMABC.MABCP0310.MABCP_ItmReg p = (mcframe.clientMABC.MABCP0310.MABCP_ItmReg) aso.getPanel();
		mcframe.clientMABC.MABCP0310.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;

	}
	/**原価品目情報登録検索条件設定*/
	protected MCRow createMGBDP0500Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0500.MGBDP_ItmReg p = (mcframe.clientMGBD.MGBDP0500.MGBDP_ItmReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0500.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}
	/**原価品目詳細登録検索条件設定*/
	protected MCRow createMGBDP0510Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg p = (mcframe.clientMGBD.MGBDP0510.MGBDP_ItmDtlReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0510.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}
	
	protected MCRow createMGBDP0560Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0560.MGBDP_ItmOperReg p = (mcframe.clientMGBD.MGBDP0560.MGBDP_ItmOperReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0560.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}
	
	protected MCRow createMGBDP0530Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0530.MGBDP_BomLst p = (mcframe.clientMGBD.MGBDP0530.MGBDP_BomLst) aso.getPanel();
		mcframe.clientMGBD.MGBDP0530.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.par_itm_cd(dr.itm_cd());
		to.par_itm_sub1(dr.itm_sub1());
		to.par_itm_sub2(dr.itm_sub2());
		to.par_itm_sub3(dr.itm_sub3());
		return to;
	}
	
	protected MCRow createMGBDP0580Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0580.MGBDP_ItmWkReg p = (mcframe.clientMGBD.MGBDP0580.MGBDP_ItmWkReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0580.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}
	/**原価品目購買単価登録検索条件設定*/
	protected MCRow createMGBDP0600Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0600.MGBDP_ItmPurcReg p = (mcframe.clientMGBD.MGBDP0600.MGBDP_ItmPurcReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0600.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}
	/**原価品目加工単価登録検索条件設定*/
	protected MCRow createMGBDP0660Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg p = (mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0660.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}
	/**原価品目支給単価登録検索条件設定*/
	protected MCRow createMGBDP0610Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0610.MGBDP_ItmProvReg p = (mcframe.clientMGBD.MGBDP0610.MGBDP_ItmProvReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0610.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}
	/**原価品目販売単価登録検索条件設定*/
	protected MCRow createMGBDP0590Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0590.MGBDP_ItmSlsReg p = (mcframe.clientMGBD.MGBDP0590.MGBDP_ItmSlsReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0590.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}
	protected MCRow createMGBDP0620Param(MAUCP_AppScreenOpener aso, DtlR dr) {
		mcframe.clientMGBD.MGBDP0620.MGBDP_ItmFixReg p = (mcframe.clientMGBD.MGBDP0620.MGBDP_ItmFixReg) aso.getPanel();
		mcframe.clientMGBD.MGBDP0620.CndR to = p.createCndR();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(dr.calc_ctg_cd());
		to.term_fr(dr.term());
		to.term_to(dr.term());
		to.itm_cd(dr.itm_cd());
		to.itm_sub1(dr.itm_sub1());
		to.itm_sub2(dr.itm_sub2());
		to.itm_sub3(dr.itm_sub3());
		return to;
	}

}