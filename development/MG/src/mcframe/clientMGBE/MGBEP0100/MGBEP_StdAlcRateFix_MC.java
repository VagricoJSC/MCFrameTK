package mcframe.clientMGBE.MGBEP0100;

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

import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_StdAlcRateFix"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_StdAlcRateFix_MC extends MGBEP_StdAlcRateFix_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 計算Ｇと計算ＮＯで confirmRegDataClear() チェックを重複させないためのフラグ */
	protected boolean _confirmFlg = true;

	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdAlcRateFix_MC() {
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
	public MGBEP_StdAlcRateFix_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0100_Srch01Caller<P extends MGBEP_StdAlcRateFix, B extends MG_MGBEL0100_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0100_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			_cndR = getCndR().clone();
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
	 * [MG_MGBEL0100_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0100_Srch02Caller<P extends MGBEP_StdAlcRateFix, B extends MG_MGBEL0100_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0100_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			bridge.down0().setValue(RsltR.$fix, true);
			_cndR = getCndR().clone();
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
	 * [MG_MGBEL0100_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0100_Upd01Caller<P extends MGBEP_StdAlcRateFix, B extends MG_MGBEL0100_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBEL0100_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBEL0100_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0100_Del01Caller<P extends MGBEP_StdAlcRateFix, B extends MG_MGBEL0100_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBEL0100_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_REF.isSelected() || Cnd_ope_UPD.isSelected()) {
			callMG_MGBEL0100_Srch01();
		}
		else {
			callMG_MGBEL0100_Srch02();
		}
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBEL0100_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBEL0100_Del01();
	}

	@Override
	protected boolean useDelMsg() {
		return false;
	}

	// ///////////////////// Init /////////////////////////////////////////////
	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		CndPanel.focusFirstComponent();
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		setColorInfo();
	}

	/**
	 * テーブルの配色を設定する
	 */
	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();

		Color diffColor = getMoneyDiffColor(this);
		Color rateColor = getStkrColor(this);

		cc.putColumnBG(columnRslt_diff_alc_rate, diffColor);
		cc.putColumnBG(columnRslt_increase_rate, rateColor);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		Cnd_itm_p_PPanel.addItmLCListner(this);
		Cnd_itm_nm.addLCListener(this);

		Cnd_calc_no.addLCListener(this);
		Cnd_calc_no.addVCListener(this);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

	// ///////////////////// Validation Change ////////////////////////////////
	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}

		if (vc == Cnd_calc_no) {
			return doCnd_calc_no_VC();
		}

		return true;
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		// FIX（登録直後）、REF（参照種別）では、クリア確認出さない
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
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_VC(info);

		if (isChanged(RsltTable)) {
			_confirmFlg = false;

			if (confirmRegDataClear()) {
				return true;
			}
			else {
				_confirmFlg = true;

				return false;
			}
		}
		else {
			_confirmFlg = true;

			return true;
		}
	}

	protected boolean doCnd_calc_no_VC() {
		if (_confirmFlg) {
			return confirmClear();
		}
		else {
			_confirmFlg = true;

			return true;
		}
	}

	/**
	 * 一覧をクリアしてよいかどうか
	 */
	protected boolean confirmClear() {
		return !isChanged(RsltTable) || confirmRegDataClear();
	}

	/** 更新（登録・更新ステータス、削除（検索後）ステータス）ステータスであるかどうかを返す */
	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	/** 登録・更新ステータスであるかどうかを返す */
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	/** 削除（検索後）ステータスであるかどうかを返す */
	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	// ///////////////////// Notification Change //////////////////////////////
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL());
		setSrchStatus();
	}

	@Override
	public void doCnd_no_ctg_flg_NC(MCEventInfo info) {
		super.doCnd_no_ctg_flg_NC(info);

		if (getCndR().no_ctg_flg()) {
			setValueEx(Cnd_ctg_cd, null);
			setValueEx(Cnd_ctg_nm, null);
		}
	}

	@Override
	public void doCnd_no_oper_flg_NC(MCEventInfo info) {
		super.doCnd_no_oper_flg_NC(info);

		if (getCndR().no_oper_flg()) {
			setValueEx(Cnd_oper_cd, null);
			setValueEx(Cnd_oper_nm, null);
		}
	}

	@Override
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);

		if (getCndR().no_bp_flg()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}

	@Override
	public void doCnd_no_itm_flg_NC(MCEventInfo info) {
		super.doCnd_no_itm_flg_NC(info);

		if (getCndR().no_itm_flg()) {
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_itm_sub1, null);
			setValueEx(Cnd_itm_sub2, null);
			setValueEx(Cnd_itm_sub3, null);
			setValueEx(Cnd_itm_nm, null);
		}
	}

	@Override
	public void doCnd_no_loc_flg_NC(MCEventInfo info) {
		super.doCnd_no_loc_flg_NC(info);

		if (getCndR().no_loc_flg()) {
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_loc_nm, null);
		}
	}

	@Override
	public void doCnd_no_dpt_flg_NC(MCEventInfo info) {
		super.doCnd_no_dpt_flg_NC(info);

		if (getCndR().no_dpt_flg()) {
			setValueEx(Cnd_dpt_cd, null);
			setValueEx(Cnd_dpt_nm, null);
		}
	}

	// ///////////////////// List Change //////////////////////////////
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Cnd_itm_p_PPanel.isItm(lc) || lc == Cnd_itm_nm) {
			doCnd_itm_LC(info);
		}
		else if (lc == Cnd_calc_no) {
			doCnd_calc_no_LC();
		}
	}

	protected void doCnd_itm_LC(MCEventInfo info) {
		if (!isNull(info.getNewValue())) {
			getCndR().no_itm_flg(false);
		}
	}

	protected void doCnd_calc_no_LC() {
		getRsltL().clear();
	}

	@Override
	public void doCnd_ctg_cd_LC(MCEventInfo info) {
		super.doCnd_ctg_cd_LC(info);

		if (!isNull(getCndR().ctg_cd())) {
			getCndR().no_ctg_flg(false);
		}
	}

	@Override
	public void doCnd_ctg_nm_LC(MCEventInfo info) {
		super.doCnd_ctg_nm_LC(info);

		if (!isNull(getCndR().ctg_nm())) {
			getCndR().no_ctg_flg(false);
		}
	}

	@Override
	public void doCnd_oper_cd_LC(MCEventInfo info) {
		super.doCnd_oper_cd_LC(info);

		if (!isNull(getCndR().oper_cd())) {
			getCndR().no_oper_flg(false);
		}
	}

	@Override
	public void doCnd_oper_nm_LC(MCEventInfo info) {
		super.doCnd_oper_nm_LC(info);

		if (!isNull(getCndR().oper_nm())) {
			getCndR().no_oper_flg(false);
		}
	}

	@Override
	public void doCnd_dpt_cd_LC(MCEventInfo info) {
		super.doCnd_dpt_cd_LC(info);

		if (!isNull(getCndR().dpt_cd())) {
			getCndR().no_dpt_flg(false);
		}
	}

	@Override
	public void doCnd_dpt_nm_LC(MCEventInfo info) {
		super.doCnd_dpt_nm_LC(info);

		if (!isNull(getCndR().dpt_nm())) {
			getCndR().no_dpt_flg(false);
		}
	}

	@Override
	public void doCnd_loc_cd_LC(MCEventInfo info) {
		super.doCnd_loc_cd_LC(info);

		if (!isNull(getCndR().loc_cd())) {
			getCndR().no_loc_flg(false);
		}
	}

	@Override
	public void doCnd_loc_nm_LC(MCEventInfo info) {
		super.doCnd_loc_nm_LC(info);

		if (!isNull(getCndR().loc_nm())) {
			getCndR().no_loc_flg(false);
		}
	}

	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		super.doCnd_bp_cd_LC(info);

		if (!isNull(getCndR().bp_cd())) {
			getCndR().no_bp_flg(false);
		}
	}

	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
		super.doCnd_bp_nm_LC(info);

		if (!isNull(getCndR().bp_nm())) {
			getCndR().no_bp_flg(false);
		}
	}

	// ///////////////////// Status ///////////////////////////////////////////
	/** 検索前ステータスに設定する */
	protected void setSrchStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setSRCH_UPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}

		Ctrl_ctrl_PPanel.expand(true);
	}

	/** 検索後ステータスに設定する */
	protected void setRefStatus() {
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

	protected void setStatusCom() {
		changeRslt(_cndR);
		setFocus();
	}

	/** 
	 * 差表示関連の表示方法を変更する
	 */
	protected void changeRslt(CndR cndR) {
		if (!isNull(cndR) && cndR.diff_flg()) {
			setDefaultMode(columnRslt_diff_alc_rate);
			setDefaultMode(columnRslt_increase_rate);
			setDefaultMode(columnRslt_pre_alc_rate);
		}
		else {
			columnRslt_diff_alc_rate.setMode(MCMode.INVISIBLE);
			columnRslt_increase_rate.setMode(MCMode.INVISIBLE);
			columnRslt_pre_alc_rate.setMode(MCMode.INVISIBLE);
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	//参照（検索前）
	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();

		setStatusCom();
	}

	// 参照（検索後）
	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setStatusCom();
	}

	// 確定（検索前）
	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();

		setStatusCom();
	}

	// 確定（検索後）
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		setStatusCom();
	}

	// 確定解除（検索前）
	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();

		setStatusCom();
	}

	// 確定解除（検索後）
	@Override
	public void setDELStatus() {
		super.setDELStatus();

		setStatusCom();
	}

	// 登録後
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();

		setStatusCom();
	}

	// ///////////////////// CellConfig ///////////////////////////////////////
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
			RsltR rsltR = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (column == columnRslt_check) {
				if (Cnd_ope_UPD.isSelected() && !isSame(getStatus(), FIX_U)) {
					if (!rsltR.fix() && !isNull(rsltR.alc_ptn_cd()) && !isNull(rsltR.expns_cd())) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

	// ///////////////////// IfListRegPanel ///////////////////////////////////
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}