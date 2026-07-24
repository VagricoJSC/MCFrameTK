package mcframe.clientMGBD.MGBDP0080;

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
import mcframe.clientMAUB.MAUBP5160.*;

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
 * 画面"MGBDP_CalcRsltSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CalcRsltSrch_MC extends MGBDP_CalcRsltSrch_MC_A implements IfListRegPanel, MCResultViewerNoParam {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CalcRsltSrch_MC() {
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
	public MGBDP_CalcRsltSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MGBDP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0030(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r)) {
			showMGBDP0030(r);
		}
	}
	
	protected void showMGBDP0030(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0030");
		setupMGBDP0030AsoParam(aso, r);
		aso.show();
	}
	
	protected void setupMGBDP0030AsoParam(MAUCP_AppScreenOpener aso, DtlR r) {
		aso.putCnd(crtOpenMGBDP0030CndR(aso, r), crtOpenMGBDP0030CndRNullCols(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
	}
	
	/**
	 * nullまたはfalseでも遷移先に設定させる項目を返す。
	 */
	protected List<String> crtOpenMGBDP0030CndRNullCols(MAUCP_AppScreenOpener aso, DtlR r) {
		return null;
	}
	
	protected mcframe.clientMGBD.MGBDP0030.CndR crtOpenMGBDP0030CndR(MAUCP_AppScreenOpener aso, DtlR r) {	
		mcframe.clientMGBD.MGBDP0030.CndR to = mcframe.clientMGBD.MGBDP0030.CndR.create();
		to.calc_grp_cd(r.calc_grp_cd());
		to.calc_no(r.calc_no());
		to.term(r.term());
		return to;
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0080_Srch01();
	}
	/**
	 * [MG_MGBDL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0080_Srch01Caller<P extends MGBDP_CalcRsltSrch, B extends MG_MGBDL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0080_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList){
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_term_fr, Cnd_term_to));
			msgList.addAll(checkBeforeAfter(Cnd_st_ym_fr, Cnd_st_ym_to));
			msgList.addAll(checkBeforeAfter(Cnd_end_ym_fr, Cnd_end_ym_to));
			msgList.addAll(checkAtLeastOne(Cnd_fix_true_flg, Cnd_fix_false_flg));
			msgList.addAll(checkAtLeastOne(Cnd_non_del_true_flg, Cnd_non_del_false_flg));
			msgList.addAll(checkAtLeastOne(Cnd_calc_err_true_flg, Cnd_calc_err_false_flg));
		}
		
		@Override
		protected void afterCall(){
			super.afterCall();
			afterCallSub();
		}
		
		protected void afterCallSub() {
			for (DtlR dtl : bridge.down0()) {
				// 計算開始時刻または計算終了時刻がnullの場合は、計算時間はnullとする。
				if (!isNullOr(dtl.calc_st(), dtl.calc_fin())) {
					dtl.calc_time(toHMSStr(dtl.calc_fin().diffSecond(dtl.calc_st())));
				}
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setStatus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	/**
	 * [MG_MGBDL0080_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0080_Del01Caller<P extends MGBDP_CalcRsltSrch, B extends MG_MGBDL0080_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0080_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFIX_DStatus();
		}
	}


	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0080_Del01();
	}
	@Override
	protected void tableInit(){
		super.tableInit();
		columnDtl_calc_time.setHorizontalAlignment(MCColumnConfig.RIGHT);	// 固定桁（分、秒）の値を揃えるため
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

		@SuppressWarnings("rawtypes")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			return getPriorModeSub(index, column, table);
		}

		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 */
		@SuppressWarnings("rawtypes")
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			DtlR dtl = (DtlR)table.getBaseTable().getRow(index);

			if (column == columnDtl_check) {
				if (DEL.equals(getStatus())) {
					if (!canDelete(dtl)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		 }

	}

	protected boolean canDelete(DtlR r) {
		return r!= null && !r.fix_flg() && !r.non_del_flg();
	}

	@Override
	protected void valueInit(){
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub(){
		setValueEx(Cnd_fix_true_flg, true);
		setValueEx(Cnd_fix_false_flg, true);
		setValueEx(Cnd_non_del_true_flg, true);
		setValueEx(Cnd_non_del_false_flg, true);
		setValueEx(Cnd_calc_err_true_flg, true);
		setValueEx(Cnd_calc_err_false_flg, true);
	}

	@Override
	public void setSRCHStatus(){
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setREFStatus(){
		super.setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
		DtlPanel.focusFirstComponent();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		Ctrl_ctrl_PPanel.expand(false);
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public MCTable getListRegTable() {
		return DtlTable;
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
		clearContainers(getDtlL());
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
		
	}
	

	@Override
	public boolean notificationResultInfo(MCResultInfo info) {
		//検索処理を実行させるために別インスタンスで表示する。
		if ("MGBDB0010".equals(info.logicId())){
			showMGBDP0080(info);
		}
		return false;
	}
	
	protected void showMGBDP0080(MCResultInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0080");
		setupMGBDP0080AsoParam(aso, info);
		aso.show();
	}
	
	protected void setupMGBDP0080AsoParam(MAUCP_AppScreenOpener aso, MCResultInfo info) {
		aso.putCnd(crtOpenMGBDP0080CndR(aso, info),crtOpenMGBDP0080CndRNullCols(aso, info) );
		aso.runValueInit();
		aso.putSearchAction();
	}

	/**
	 * nullまたはfalseでも遷移先に設定させる項目を返す。
	 */
	protected List<String> crtOpenMGBDP0080CndRNullCols(MAUCP_AppScreenOpener aso, MCResultInfo info) {
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMGBD.MGBDP0080.CndR.$term_fr);
		l.add(mcframe.clientMGBD.MGBDP0080.CndR.$term_to);
		return l;
	}
	protected mcframe.clientMGBD.MGBDP0080.CndR crtOpenMGBDP0080CndR(MAUCP_AppScreenOpener aso, MCResultInfo info) {	
		mcframe.clientMGBD.MGBDP0080.CndR to = mcframe.clientMGBD.MGBDP0080.CndR.create();
		to.ins_srv_req_no(info.srvReqNo());
		return to;
	}

	@Override							
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DtlTable) {
			MCButton b = getDCOpenTgt();
			if (b.isEnabled()) {
				b.doAP();
			}	
		}	
	}
	
	/**
	 * DCイベントで実行するボタンを返す。
	 */
	protected MCButton getDCOpenTgt() {
		return Btn_open_MGBDP0030;
	}

}