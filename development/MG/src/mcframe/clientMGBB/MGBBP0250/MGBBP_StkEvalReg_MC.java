package mcframe.clientMGBB.MGBBP0250;

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
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5310.*;
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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_StkEvalReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_StkEvalReg_MC extends MGBBP_StkEvalReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_StkEvalReg_MC() {
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
	public MGBBP_StkEvalReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0250_Srch01Caller<P extends MGBBP_StkEvalReg, B extends MG_MGBBL0250_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0250_Srch01Caller(P p, B b) {
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
	}

	/**
	 * [MG_MGBBL0250_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0250_Upd01Caller<P extends MGBBP_StkEvalReg, B extends MG_MGBBL0250_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0250_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0250_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0250_Upd02Caller<P extends MGBBP_StkEvalReg, B extends MG_MGBBL0250_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0250_Upd02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			//非同期実行にする設定
			setAsync(true);
		}
		
		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true ;
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(InsCnd_ym_fr, InsCnd_ym_to));
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}
	}

	/**
	 * [MG_MGBBL0250_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0250_Del01Caller<P extends MGBBP_StkEvalReg, B extends MG_MGBBL0250_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0250_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0250_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0250_Del02Caller<P extends MGBBP_StkEvalReg, B extends MG_MGBBL0250_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0250_Del02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getDelCndR()));
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true ;
		}
	}

	/**
	 * [MG_MGBBL0250_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0250_Imp01Caller<P extends MGBBP_StkEvalReg, B extends MG_MGBBL0250_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBBL0250_Imp01Caller(P p, B b) {
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
	 * [MG_MGBBL0250_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0250_Ins01Caller<P extends MGBBP_StkEvalReg, B extends MG_MGBBL0250_Ins01Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0250_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0250_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0250_Ins02Caller<P extends MGBBP_StkEvalReg, B extends MG_MGBBL0250_Ins02Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0250_Ins02Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBBL0250_Srch01();
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
	 * Panel[Btn]のボタン[upd01]の押下時の処理
	 */
	@Override
	public void doBtn_upd01(MCEventInfo info) {
		callMG_MGBBL0250_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd02]の押下時の処理
	 */
	@Override
	public void doBtn_upd02(MCEventInfo info) {
		callMG_MGBBL0250_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[ins_in_file]の押下時の処理
	 */
	@Override
	public void doBtn_ins_in_file(MCEventInfo info) {
		callMG_MGBBL0250_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[ins_del_in_file]の押下時の処理
	 */
	@Override
	public void doBtn_ins_del_in_file(MCEventInfo info) {
		callMG_MGBBL0250_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBBL0250_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_bulk]の押下時の処理
	 */
	@Override
	public void doBtn_del_bulk(MCEventInfo info) {
		callMG_MGBBL0250_Del02();
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
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_upri_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_upri_dec_place);
		InsCnd_calc_no_p_PPanel.setRelateBeans(InsCnd_calc_grp_cd);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_cur_cd, getBaseCur().cur_cd());
		setValueEx(Cnd_upri_dec_place, getBaseCur().upri_dec_place());

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}
		
		initCalcCtg();
	}

	protected void initCalcCtg() {
		if (Cnd_ope_INSBULK.isSelected()) {
			setDefCalcCtg(InsCnd_calc_ctg_cd);
		}
		else if (Cnd_ope_DELBULK.isSelected() || Cnd_ope_INSDEL_FILE.isSelected()) {
			setDefCalcCtg(DelCnd_calc_ctg_cd);
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
		else if (Cnd_ope_INSBULK.isSelected()) {
			setINS_BULKStatus();
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
	public void setINS_BULKStatus() {
		super.setINS_BULKStatus();
		setStatusCom();
		changeByStkEvalCd();
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
		
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
	}

	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else if (Cnd_ope_INSBULK.isSelected()) {
			setTabComponentEnable(FoldTab, Tab3Panel);
		}
		else if (Cnd_ope_DELBULK.isSelected() || Cnd_ope_INSDEL_FILE.isSelected()) {
			setTabComponentEnable(FoldTab, Tab4Panel);
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

	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
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

	// -----------------------------------------------
	// Event
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
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doInsCnd_stk_eval_cd_LC(MCEventInfo info) {
		super.doInsCnd_stk_eval_cd_LC(info);

		if (!isSame(info.getOldValue(), info.getNewValue())) {
			setValueEx(InsCnd_calc_grp_cd, null);
			setValueEx(InsCnd_calc_grp_nm, null);
			setValueEx(InsCnd_calc_no, null);
			setValueEx(InsCnd_calc_rmrks, null);
			setValueEx(InsCnd_ym_fr, null);
			setValueEx(InsCnd_ym_to, null);
		}

		changeByStkEvalCd();
	}

	protected void changeByStkEvalCd() {
		String upriSetTyp = getInsCndR().upri_set_typ();
		if (!isNull(getInsCndR().stk_eval_cd())) {
			InsCnd_calc_grp_cd.setMode(MCMode.REQUIRED);
			if (MAC_UPRI_SET_TYP.isSTD(upriSetTyp)) {
				InsCnd_calc_no.setMode(MCMode.REQUIRED);
				setDefaultMode(InsCnd_ym_fr);
				setDefaultMode(InsCnd_ym_to);
			}
			else {
				InsCnd_ym_fr.setMode(MCMode.REQUIRED);
				InsCnd_ym_to.setMode(MCMode.REQUIRED);
				setDefaultMode(InsCnd_calc_no);
			}
		}
		else {
			setDefaultMode(InsCnd_calc_grp_cd);
			setDefaultMode(InsCnd_calc_no);
			setDefaultMode(InsCnd_ym_fr);
			setDefaultMode(InsCnd_ym_to);
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
			callMG_MGBBL0250_Imp01();
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
	// ListLogic Custom
	@Override
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getAsstTyp(info));
		return super.getCnd_asst_typ(row, info);
	}
	@Override
	public MCList getRslt_asst_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getAsstTyp(info));
		return super.getRslt_asst_typ(row, info);
	}
	/**
	 * 表示する資産区分を取得する
	 */
	protected MAC_ASST_TYP[] getAsstTyp(MCEventInfo info) {
			return new MAC_ASST_TYP[] { MAC_ASST_TYP.CO_PROD, MAC_ASST_TYP.CO_SLS };
	}

	@Override
	public MCList getInsCnd_calc_grp_cd(MCRow row, MCEventInfo info) {
		
		if (MAC_UPRI_SET_TYP.isSTD(getInsCndR().upri_set_typ())) {
			// 評価単価設定区分＝１のときは、計算区分＝１の計算グループを表示
			row.addBooleanColumn(CalcGrpCols.$i_std_flg, true);
		}
		else {
			// 評価単価設定区分＝１以外のときは、計算区分＝３の計算グループを表示
			row.addBooleanColumn(CalcGrpCols.$i_calc_stk_flg, true);
		}
		
		return super.getInsCnd_calc_grp_cd(row, info);
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

}