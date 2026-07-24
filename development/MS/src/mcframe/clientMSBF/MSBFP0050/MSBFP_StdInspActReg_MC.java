package mcframe.clientMSBF.MSBFP0050;

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

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0370.*;
import mcframe.clientMAUB.MAUBP0380.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5350.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_StdInspActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_StdInspActReg_MC extends MSBFP_StdInspActReg_MC_A implements IfOpePanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_StdInspActReg_MC() {
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
	public MSBFP_StdInspActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Srch01Caller<P extends MSBFP_StdInspActReg, B extends MS_MSBFL0050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0050_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			// 共通項目をクリアする。
			getBulkSetR().clear();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setColumnValueNE(DtlR.$cnf_flg_db, DtlR.$cnf_flg);
		}

		@Override
		protected void show() {
			super.show();
			// 確認モードの場合
			if (Cnd_ope_UPD.isSelected()) {
				// 運用日付
				setValueEx(BulkSet_cnf_dt, getToday());
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
	 * [MS_MSBFL0050_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Upd01Caller<P extends MSBFP_StdInspActReg, B extends MS_MSBFL0050_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0050_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().prnt_flg(getBtnR().prnt_flg());
		}
	}

	/**
	 * [MS_MSBFL0050_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Upd02Caller<P extends MSBFP_StdInspActReg, B extends MS_MSBFL0050_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0050_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			MCList<DtlR> dtlL = getDtlL().subList(Status.MODIFY);
			if (!dtlL.isEmpty()) {
				bridge.up1().setAll(dtlL.subList(DtlR.$cnf_flg, true));
			}
		}
	}

	/**
	 * [MS_MSBFL0050_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Del01Caller<P extends MSBFP_StdInspActReg, B extends MS_MSBFL0050_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0050_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0050_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Del02Caller<P extends MSBFP_StdInspActReg, B extends MS_MSBFL0050_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0050_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			MCList<DtlR> dtlL = getDtlL().subList(Status.MODIFY);
			if (!dtlL.isEmpty()) {
				bridge.up1().setAll(dtlL.subList(DtlR.$cnf_flg, false));
			}
		}
	}

	/**
	 * [MS_MSBFL0050_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Prnt01Caller<P extends MSBFP_StdInspActReg, B extends MS_MSBFL0050_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBFL0050_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBFL0050_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBFL0050_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		setCnfFlgOnOff(true);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		setCnfFlgOnOff(false);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBFL0050_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_cnf]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cnf(MCEventInfo info) {
		callMS_MSBFL0050_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBFL0050_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_cnf]の押下時の処理
	 */
	@Override
	public void doBtn_del_cnf(MCEventInfo info) {
		callMS_MSBFL0050_Del02();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		// 登録項目の担当者・部門部品は、必ず日付を連携する
		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_cnf_dt);

		Dtl_usr_dpt_p_PPanel.setRelateBeans(columnDtl_st_dt);
		Dtl_cnf_usr_dpt_p_PPanel.setRelateBeans(columnDtl_cnf_dt);

		Dtl_qn_out_max_p_PPanel.setRelateBeans(columnDtl_trd_unit_nm, columnDtl_qn_int_frac);
		Dtl_qn_out_min_p_PPanel.setRelateBeans(columnDtl_trd_unit_nm, columnDtl_qn_int_frac);
		Dtl_qn_in_max_p_PPanel.setRelateBeans(columnDtl_trd_unit_nm, columnDtl_qn_int_frac);
		Dtl_qn_in_min_p_PPanel.setRelateBeans(columnDtl_trd_unit_nm, columnDtl_qn_int_frac);
		Dtl_qn_insp_val_p_PPanel.setRelateBeans(columnDtl_trd_unit_nm, columnDtl_qn_int_frac);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		CndPanel.focusFirstComponent();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();

		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		BulkSetPanel.focusFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();

		CndPanel.focusFirstComponent();
	}

	@Override
	public void setDEL_CNFStatus() {
		super.setDEL_CNFStatus();

		DtlPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();

		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();

		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();

		CndPanel.focusFirstComponent();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		BulkSet_cnf_usr_cd.addLCListener(this);
		BulkSet_cnf_dpt_cd.addLCListener(this);
		columnDtl_qn_insp_val.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == BulkSet_cnf_usr_cd) {
			bulkSet(BulkSet_cnf_usr_cd);
			bulkSet(BulkSet_cnf_dpt_cd);
		}
		else if (lc == BulkSet_cnf_dpt_cd) {
			bulkSet(BulkSet_cnf_dpt_cd);
		}
		else if (lc == columnDtl_qn_insp_val) {
			doDtl_qn_insp_val_LC(info);
		}
	}

	/**
	 * 定量検査値変更時のイベント
	 * @param info
	 */
	protected void doDtl_qn_insp_val_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		setInspRsltTyp(index);
	}
	
	/**
	 * 定量検査値から検査結果区分を自動設定
	 * @param r
	 */
	protected void setInspRsltTyp(int index) {
		// 自動合否判定ＦＬＧがオフの場合は自動設定しない
		DtlR r = getDtlL().get(index);
		if (!r.auto_judg_flg()) {
			return;
		}
		// 自動合否判定結果を設定する
		columnDtl_std_insp_rslt_typ.setValue(index, judgInspRsltTyp(r));
	}

	/**
	 * 合否を判定し、検査結果区分を返す
	 * @param r
	 * @return
	 */
	protected String judgInspRsltTyp(DtlR r) {

		// 定量検査値が未設定の場合は検査結果区分をクリア
		if (isNull(r.qn_insp_val())) {
			return null;
		}

		boolean isChecked = false;

		if (!isNullOr(r.sign_in_min_typ(), r.qn_in_min())) {
			// 内規格下限値との比較
			if (!checkInspVal(r.qn_in_min(), r.sign_in_min_typ(), r.qn_insp_val())) {
				return MSC_STD_INSP_RSLT_TYP.NG.value();
			}
			isChecked = true;
		}
		
		if (!isNullOr(r.sign_in_max_typ(), r.qn_in_max())) {
			// 内規格上限値との比較
			if (!checkInspVal(r.qn_insp_val(), r.sign_in_max_typ(), r.qn_in_max())) {
				return MSC_STD_INSP_RSLT_TYP.NG.value();
			}
			isChecked = true;
		}
		
		// 内規格下限値、上限値のいずれか一方または両方のチェックが行われ、エラーとならなかった場合はOKとなる
		if (isChecked) {
			return MSC_STD_INSP_RSLT_TYP.OK.value();
		}
		
		// 内規格下限値、内規格上限値が共に未設定の場合（外規格のみ設定されている場合）は検査結果区分をクリア
		return null;
	}

	/**
	 * 値をチェックする。
	 * 符号に対して値が妥当な場合は true を返す。
	 * 
	 * @param left 左辺
	 * @param sign 符号区分
	 * @param right 右辺
	 * @return 符号に対して値が妥当でない場合は false
	 */
	protected boolean checkInspVal(MCNumber left, String sign, MCNumber right) {
		if (isNull(sign)) {
			return true;
		}
		else if (MAC_SIGN_TYP.isEQ(sign)) {
			return isSame(left, right);
		}
		else if (MAC_SIGN_TYP.isNE(sign)) {
			return !isSame(left, right);
		}
		else if (MAC_SIGN_TYP.isLE(sign)) {
			return !isNull(left) && left.lte(right);
		}
		else if (MAC_SIGN_TYP.isLT(sign)) {
			return !isNull(left) && left.lt(right);
		}
		return false;
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		setSrchStatus();

		clearContainers(getBulkSetR());

		setValueInit();
	}

	@Override
	protected MCPanel getOpeHdrPanel() {
		return HdrTabPanel;
	}

	/**
	 * 検索前モード設定
	 */
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_INS.isSelected() || Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
	}

	/**
	 * 検索後モード設定
	 */
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_INS.isSelected()) {
			if (MSC_INSP_STS_TYP.isJDG(getHdrR().insp_sts_typ()) && getHdrR().std_req_flg()){
				setFIX_IStatus();
			} else {
				if (isAllCnfOn()) {
					setFIX_IStatus();
				}
				else {
					setINSStatus();
					// ヘッダ項目制御
					setHdrMode();
					// 明細ステータス設定
					setRowStatusForDtl();
				}
			}
		}
		else if (Cnd_ope_UPD.isSelected()) {
			if (MSC_INSP_STS_TYP.isJDG(getHdrR().insp_sts_typ()) && getHdrR().std_cnf_req_flg()){
				setFIX_UStatus();
			}
			else {
				if (!isAllInsp()) {
					setUPDStatus();
				}
				else {
					setFIX_UStatus();
				}
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (MSC_INSP_STS_TYP.isJDG(getHdrR().insp_sts_typ()) && getHdrR().std_req_flg()){
				setFIX_DStatus();
			}
			else {
				if (isAllCnfOff()) {
					setDELStatus();
				}
				else {
					setFIX_DStatus();
				}
			}
		}
		else if (Cnd_ope_DEL_CNF.isSelected()) {
			if (MSC_INSP_STS_TYP.isJDG(getHdrR().insp_sts_typ()) && getHdrR().std_cnf_req_flg()){
				setFIX_DStatus();
			}
			else {
				if (isAllCnfOff()) {
					setFIX_DStatus();
				}
				else {
					setDEL_CNFStatus();
				}
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
	}

	/**
	 * 確認済か判定する。
	 * 
	 * @return
	 */
	protected boolean isAllCnfOn() {
		boolean isAllCnfFlg = true;
		for (DtlR r : getDtlL()) {
			if ((!isNull(r.std_insp_inst_no()) && isNull(r.std_insp_act_no())) || !r.cnf_flg()) {
				isAllCnfFlg = false;
				break;
			}
		}
		return isAllCnfFlg;
	}

	/**
	 * 未確認か判定する。
	 * 
	 * @return
	 */
	protected boolean isAllCnfOff() {
		boolean isCnfFlg = true;
		for (DtlR r : getDtlL()) {
			if (isNull(r.std_insp_act_no()) || r.cnf_flg()) {
				isCnfFlg = false;
				break;
			}
		}
		return isCnfFlg;
	}

	/**
	 * 検査済か判定する。
	 * 
	 * @return
	 */
	protected boolean isAllInsp() {
		boolean isInspFlg = true;
		for (DtlR r : getDtlL()) {
			if (isEditable(columnDtl_cnf_flg, r.getGUIIndex())) {
				isInspFlg = false;
				break;
			}
		}
		return isInspFlg;
	}

	/**
	 * ヘッダ項目を制御する。
	 */
	protected void setHdrMode() {
		HdrR hdrR = getHdrR();
		// 有効成分管理対象品以外の場合、実際有効成分係数が入力不可とする。
		if (!hdrR.cont_fctr_flg()) {
			Hdr_act_cont_fctr_p_PPanel.ActContFctr_act_cont_fctr.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 登録・訂正モードの場合、明細の行ステータスを設定する。
	 */
	protected void setRowStatusForDtl() {
		for (DtlR r : getDtlL()) {
			if (r.cnf_flg()) {
				continue;
			}
			if (isNull(r.std_insp_act_no())) {
				r.setStatus(Status.CREATE);
			}
		}
	}

	protected void setValueInit() {
		if (!Cnd_ope_INS.isSelected()) {
			getBtnR().prnt_flg(false);
		}
	}

	@Override
	public void doBulkSet_cnf_dt_NC(MCEventInfo info) {
		super.doBulkSet_cnf_dt_NC(info);

		bulkSet(BulkSet_cnf_dt);
	}

	@Override
	public void doDtl_cnf_flg_NC(MCEventInfo info) {
		super.doDtl_cnf_flg_NC(info);

		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);

		if (r.cnf_flg()) {
			if (isNull(r.cnf_dt())) {
				bulkSet(BulkSet_cnf_dt, r);
			}
			if (isNull(r.cnf_usr_cd())) {
				bulkSet(BulkSet_cnf_usr_cd, r);
			}
			if (isNull(r.cnf_dpt_cd())) {
				bulkSet(BulkSet_cnf_dpt_cd, r);
			}
		}
	}

	/**
	 * 全選択可否設定
	 * @param chkFlg true:チェックオン、false:チェックオフ
	 */
	protected void setCnfFlgOnOff(boolean chkFlg) {
		for (DtlR r : DtlTable.getViewRows()) {
			if (isEditable(columnDtl_cnf_flg, r.getGUIIndex())) {

				setValueEx(columnDtl_cnf_flg, r.getGUIIndex(), chkFlg);
			}
		}
	}

	/**
	 * 一括項目設定
	 * @param b
	 */
	protected void bulkSet(MCBeans b) {

		for (DtlR r : DtlTable.getViewRows()) {
			if (r.cnf_flg()) {
				bulkSet(b, r);
			}
		}
	}

	/**
	 * 指定した行の項目設定
	 * @param b
	 * @param r
	 */
	protected void bulkSet(MCBeans b, DtlR r) {
		if (!isNull(r.std_insp_act_no())) {
			if (b == BulkSet_cnf_dt && isEditable(columnDtl_cnf_dt, r.getGUIIndex())) {
				r.cnf_dt(getBulkSetR().cnf_dt());
			}
			else if (b == BulkSet_cnf_usr_cd
					&& isEditable(columnDtl_cnf_usr_cd, r.getGUIIndex())) {
				r.cnf_usr_cd(getBulkSetR().cnf_usr_cd());
				r.cnf_usr_nm(getBulkSetR().cnf_usr_nm());
			}
			else if (b == BulkSet_cnf_dpt_cd
					&& isEditable(columnDtl_cnf_dpt_cd, r.getGUIIndex())) {
				r.cnf_dpt_cd(getBulkSetR().cnf_dpt_cd());
				r.cnf_dpt_nm(getBulkSetR().cnf_dpt_nm());
			}
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	// IfOpePanelの実装
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getHdrR());
		ret.add(getDtlL());

		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {

		return null;
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	protected MCCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	public class DtlTableCellConfig extends mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR dtlR = (DtlR) table.getBaseTable().getRow(index);

			// 登録・訂正
			if (isInsStatus()) {
				if (dtlR.cnf_flg()) {
					return MCMode.READ_ONLY;
				}
				
				if (column == columnDtl_ql_insp_val) {
					if (!MAC_INSP_QLQN_TYP.isQLTV(dtlR.insp_qlqn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_qn_insp_val) {
					if (!MAC_INSP_QLQN_TYP.isQNTV(dtlR.insp_qlqn_typ())) {
						return MCMode.READ_ONLY;
					}
					if (!isNull(dtlR.std_insp_rslt_typ()) && !MSC_STD_INSP_RSLT_TYP.isAB(dtlR.std_insp_rslt_typ())) {
						return MCMode.REQUIRED;
					}
				}
			}

			// 確認
			if (isUpdStatus()) {
				// 既に確認ＦＬＧがオンの場合、確認関連項目は入力不可とする。
				if (isNull(dtlR.std_insp_rslt_typ()) || dtlR.cnf_flg_db()) {
					if (column == columnDtl_cnf_flg
							|| isCnfItmS(column)) {
						return MCMode.READ_ONLY;
					}
				}

				// 未確認の場合、確認ＦＬＧはオフの場合、確認日、確認者は入力不可とする。
				if (!dtlR.cnf_flg_db() && !dtlR.cnf_flg()) {
					if (isCnfItmS(column)) {
						return MCMode.READ_ONLY;
					}
				}
			}

			// 確認取消
			if (isDelCnfStatus()) {
				if (!dtlR.cnf_flg_db()) {
					if (column == columnDtl_cnf_flg
							|| column == columnDtl_cnf_intr_rmrks) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		@Override
		public int getPriorLength(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getRow(index);
			if (isQnQtyColumns(column)) {
				MCNumber digit = r.qn_int_digit();
				MCNumber frac = r.qn_int_frac();
				if (!isNullOr(digit, frac)) {
					return frac.intValue() + digit.intValue();
				}
			}
			return super.getPriorLength(index, column, table);
		}

		@Override
		public int getPriorScale(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getRow(index);
			if (isQnQtyColumns(column)) {
				MCNumber frac = r.qn_int_frac();
				if (frac != null) {
					return frac.intValue();
				}
			}
			return super.getPriorScale(index, column, table);
		}

		/**
		 * 確認関連列を判断する
		 * @param column 列
		 * @return true:入力不可項目、false:入力不可項目でない
		 */
		protected boolean isCnfItmS(MCColumnConfig column) {
			if (column == columnDtl_cnf_dt
					|| column == columnDtl_cnf_usr_cd
					|| column == columnDtl_cnf_dpt_cd
					|| column == columnDtl_cnf_intr_rmrks) {
				return true;
			}
			return false;
		}
	}

	/**フォーマット制御するカラムコンフィグ*/
	MCColumnConfig[] _qnQtyColumns = null;
	protected MCColumnConfig[] getQnQtyColumns() {
		if (_qnQtyColumns == null) {
			_qnQtyColumns = new MCColumnConfig[]{
					columnDtl_qn_insp_val};
		}
		return _qnQtyColumns;
	}

	protected boolean isQnQtyColumns(MCColumnConfig column) {
		return MCCollectionUtil.contains(column, getQnQtyColumns());
	}

	protected boolean isInsStatus() {
		return isSame(getStatus(), INS);
	}
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}
	protected boolean isDelCnfStatus() {
		return isSame(getStatus(), DEL_CNF);
	}

}