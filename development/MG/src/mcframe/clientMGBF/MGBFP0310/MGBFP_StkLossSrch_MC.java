package mcframe.clientMGBF.MGBFP0310;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_StkLossSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_StkLossSrch_MC extends MGBFP_StkLossSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_StkLossSrch_MC() {
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
	public MGBFP_StkLossSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0310_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0310_Srch01Caller<P extends MGBFP_StkLossSrch, B extends MG_MGBFL0310_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0310_Srch01Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBFL0310_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0310_Del01Caller<P extends MGBFP_StkLossSrch, B extends MG_MGBFL0310_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBFL0310_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBFL0310_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0310_Del02Caller<P extends MGBFP_StkLossSrch, B extends MG_MGBFL0310_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBFL0310_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getDelCndR()));
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0310_Srch01();
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
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBFL0310_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_bulk]の押下時の処理
	 */
	@Override
	public void doBtn_del_bulk(MCEventInfo info) {
		callMG_MGBFL0310_Del02();
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
		Cnd_calc_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		DelCnd_calc_p_PPanel.setRelateBeans(DelCnd_calc_grp_cd);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_DELBULK.isSelected()) {
			setDEL_BULKStatus();
		}
		else {
			setSRCHStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
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

	protected void setStatusCom() {
		setTabMode();
		setFocus();
	}
	protected void setTabMode() {
		if (Cnd_ope_DELBULK.isSelected()) {
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
	protected boolean isRegStatus() {
		return isDelStatus();
	}
	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL());

		setSrchStatus();
	}

	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		super.doCnd_bp_cd_LC(info);
		if (!isNull(Cnd_bp_cd.getValue())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
		super.doCnd_bp_nm_LC(info);
		if (!isNull(Cnd_bp_nm.getValue())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);
		if (Cnd_no_bp_flg.getValue()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}

}