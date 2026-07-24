package mcframe.clientMGBG.MGBGP0160;

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
 * 画面"MGBGP_PreAlcRateReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBGP_PreAlcRateReg_MC extends MGBGP_PreAlcRateReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreAlcRateReg_MC() {
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
	public MGBGP_PreAlcRateReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBGL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0160_Srch01Caller<P extends MGBGP_PreAlcRateReg, B extends MG_MGBGL0160_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBGL0160_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			getCndR().sa_typ(getSaTyp());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUPDStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

	}

	/**
	 * [MG_MGBGL0160_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0160_Ins01Caller<P extends MGBGP_PreAlcRateReg, B extends MG_MGBGL0160_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBGL0160_Ins01Caller(P p, B b) {
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
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}

	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBGL0160_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBGP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBGP0120(MCEventInfo info) {
		DtlR dtl = DtlTable.getSelectedMCRow();
		if (isNull(dtl)) {
			dialog(msgNoSelectedRow());
			return;
		}
		openMGBGP0120(dtl);
	}

	protected void openMGBGP0120(DtlR dtl) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBGP0120");
		mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg p =
				(mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg) aso.getPanel();

		mcframe.clientMGBG.MGBGP0120.CndR cnd = mcframe.clientMGBG.MGBGP0120.CndR.create();
		cnd.ope(p.Cnd_ope_REF.getActionCommand());
		cnd.calc_ctg_cd(dtl.calc_ctg_cd());
		cnd.pre_alc_rate_cd(dtl.pre_alc_rate_cd());
		cnd.ym(dtl.ym());
		cnd.sa_typ(getSaTyp());
		cnd.wg_cd(dtl.wg_cd());
		aso.putCnd(cnd);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBGL0160_Ins01();
	}

	protected String getSaTyp() {
		if (Cnd_ope_PLN.isSelected()) {
			return MAC_SA_TYP.PLN.value();
		}
		else {
			return MAC_SA_TYP.ACT.value();
		}
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info){
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		return chkClear();
	}

	/** 一覧が変更されている場合は消去してよいかダイアログを出す。*/
	protected boolean chkClear() {
		if (isChanged()) {
			return confirmRegDataClear();
		}
		return true;
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info){
		super.doCnd_ope_NC(info);
		clearDtl();
	}

	protected void clearDtl(){
		setValueEx(BulkSet_ym_fr, null);
		setValueEx(BulkSet_ym_to, null);
		getDtlL().clear();
		setSRCHStatus();
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) doDtl_DC(info);
	}

	@Override
	public void doDtl_check_NC(MCEventInfo info) {
		super.doDtl_check_NC(info);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (dtlR.check()) {
			bulkSet(dtlR, true);
		}
	}

	@Override
	public void setDefaultValueWhenChecked(MCRow row) {
		super.setDefaultValueWhenChecked(row);

		DtlR r = (DtlR)row;
		bulkSet(r, false);
	}

	protected void bulkSet(DtlR r, boolean event) {
		setValueEx(columnDtl_sa_typ, r.getGUIIndex(), getSaTyp());
		if (isNull(r.ym_fr())) {
			bulkSet(columnDtl_ym_fr, r);
		}
		if (isNull(r.ym_to())) {
			bulkSet(columnDtl_ym_to, r);
		}
	}

	/**
	 * 一括設定内容を反映します。
	 * @param r
	 */
	protected void bulkSet(MCBeans b, DtlR r) {
		if (!r.isGUIVisible()) {
			return;
		}
		if (!r.check()) {
			return;
		}
		if (b == columnDtl_ym_fr && isEditable(columnDtl_ym_fr, r.getGUIIndex())) {
			setValueEx(columnDtl_ym_fr, r.getGUIIndex(), BulkSet_ym_fr.getValue());
		}
		if (b == columnDtl_ym_to && isEditable(columnDtl_ym_to, r.getGUIIndex())) {
			setValueEx(columnDtl_ym_to, r.getGUIIndex(), BulkSet_ym_to.getValue());
		}
	}

	public void doDtl_DC(MCEventInfo info) {
		openMGBGP0120(getDtlL().get(info.getEventIndex()));
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		if (Cnd_ope_ACT.isFocusOwner() || Cnd_ope_PLN.isFocusOwner()) {
			// フォーカスは移動しない
		}
		else {
			CndPanel.focusFirstComponent();
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		Ctrl_ctrl_PPanel.expand(false);
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

}