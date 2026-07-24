package mcframe.clientMBBA.MBBAP0020;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.sys.MCSys;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBAP_AprvListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBAP_AprvListReg_MC extends MBBAP_AprvListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBAP_AprvListReg_MC() {
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
	public MBBAP_AprvListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBAL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0020_Srch01Caller<P extends MBBAP_AprvListReg, B extends MB_MBBAL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBAL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(
					checkBeforeAfter(Cnd_ins_dt_fr, Cnd_ins_dt_to));
			msgList.addAll(
					checkBeforeAfter(Cnd_aprv_d_tm_fr, Cnd_aprv_d_tm_to));
			msgList.addAll(panel.checkAtLeastOne(
					Cnd_main_role_flg, Cnd_sub_role_flg));
		}

		@Override
		protected void clear() {
			super.clear();
			getDtl1L().clear();
			getDtl2L().clear();
		}

		@Override
		protected void show() {
			super.show();
			setDtl1ViewRows(getDtlL());
			panel.sort(Dtl1Table);
		}

		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
			setUpdStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			Dtl1Table.selectLeftmostColumn(0);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

		@Override
		protected void adjustList() {
			super.adjustList();
			Dtl1Table.adjustWidth();
		}
	}

	/**
	 * 上段に表示するデータを設定します。
	 */
	protected void setDtl1ViewRows(MCList<DtlR> downL) {
		for (DtlR downR : downL) {
			downR.aprv_d_rmrks_up(downR.aprv_d_rmrks());
			downR.sub_char1_up(downR.sub_char1());
			downR.sub_char2_up(downR.sub_char2());
			downR.sub_char3_up(downR.sub_char3());
		}
		MCRowMatcher<DtlR> viewRM = r -> r.match_cnd_flg();
		setDtl1L(downL.subList(viewRM).clone());
	}

	/**
	 * 検索後のステータスを設定します。
	 */
	protected void setUpdStatus(){
		if (Cnd_ope_0.isSelected()) {
			setUPD_ACPTStatus();
		}
		else if (Cnd_ope_1.isSelected()) {
			setUPD_ACPT_CANStatus();
		}
		else if (Cnd_ope_2.isSelected()) {
			setUPD_RJCT_CANStatus();
		}
		else if (Cnd_ope_3.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_4.isSelected()) {
			setREFStatus();
		}
	}

	/**
	 * 検索前のステータスを設定します。
	 */
	protected void setSrchStatus(){
		if (Cnd_ope_0.isSelected()) {
			setSRCH_ACPTStatus();
		}
		else if (Cnd_ope_1.isSelected()) {
			setSRCH_ACPT_CANStatus();
		}
		else if (Cnd_ope_2.isSelected()) {
			setSRCH_RJCT_CANStatus();
		}
		else if (Cnd_ope_3.isSelected()) {
			setSRCH_UPDStatus();
		}
		else if (Cnd_ope_4.isSelected()) {
			setSRCHStatus();
		}
	}

	/**
	 * [MB_MBBAL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0020_Upd01Caller<P extends MBBAP_AprvListReg, B extends MB_MBBAL0020_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBAL0020_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndPanel.focusFirstComponent();
		}

	}

	/**
	 * 登録後のステータスを設定します。
	 */
	protected void setFixStatus(){
		if (Cnd_ope_0.isSelected()) {
			setFIX_U_ACPTStatus();
		}
		else if (Cnd_ope_1.isSelected()) {
			setFIX_U_ACPT_CANStatus();
		}
		else if (Cnd_ope_2.isSelected()) {
			setFIX_U_RJCT_CANStatus();
		}
		else if (Cnd_ope_3.isSelected()) {
			setFIX_U_UPDStatus();
		}
	}

	/**
	 * [MB_MBBAL0020_Upd02]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0020_Upd02Caller<P extends MBBAP_AprvListReg, B extends MB_MBBAL0020_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBAL0020_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return panel.msgCancelConfirm();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void showEndMsg() {
			panel.dialog(panel.msgCanceled());
		}

	}

	/**
	 * [MB_MBBAL0020_Upd03]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0020_Upd03Caller<P extends MBBAP_AprvListReg, B extends MB_MBBAL0020_Upd03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBAL0020_Upd03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFixStatus();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndPanel.focusFirstComponent();
		}

	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMB_MBBAL0020_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_detail]の押下時の処理
	 */
	@Override
	public void doBtn_open_detail(MCEventInfo info) {
		DtlR selectedR = Dtl1Table.getSelectedMCRow();
		if (selectedR == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		String aprvFuncTyp = selectedR.aprv_func_typ();
		MAC_APRV_FUNC_TYP c = MAC_APRV_FUNC_TYP.getNE(aprvFuncTyp);
		if (c == null) {
			throw new MCAppException(selectedR, DtlR.$aprv_func_typ,
					MBBAP0001, aprvFuncTyp);
		}
		MCRow cndR = MCRow.create();
		if (MAC_APRV_FUNC_TYP.isQTN_SLO(c)) {
			cndR.setStringNE("ope", "3");
			cndR.setStringNE("qtn_no", selectedR.aprv_src_no1());
			cndR.setNumberNE("qtn_rev",
					MCNumber.valueOf(selectedR.aprv_src_no2()));
		}
		else if (MAC_APRV_FUNC_TYP.isSLO(c)) {
			cndR.setStringNE("ope", "3");
			cndR.setStringNE("srch_tgt_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("latest_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isSLS_DSCNT(c)) {
			cndR.setStringNE("ope", "3");
			cndR.setStringNE("srch_tgt_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("latest_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isSLS_XTRA(c)) {
			cndR.setStringNE("ope", "3");
			cndR.setStringNE("srch_tgt_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("latest_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isPO(c)) {
			cndR.setStringNE("ope", "3");
			cndR.setStringNE("po_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("latest_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isXPNS_PO(c)) {
			cndR.setStringNE("ope", "3");
			cndR.setStringNE("po_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("latest_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isSCRP(c)) {
			cndR.setStringNE("ope", "2");
			cndR.setStringNE("srch_tgt_no", selectedR.aprv_src_no1());
		}
		else if (MAC_APRV_FUNC_TYP.isSTK_OTH_GI(c)) {
			cndR.setStringNE("ope", "2");
			cndR.setStringNE("srch_tgt_no", selectedR.aprv_src_no1());
		}
		else if (MAC_APRV_FUNC_TYP.isSTK_OTH_GR(c)) {
			cndR.setStringNE("ope", "2");
			cndR.setStringNE("srch_tgt_no", selectedR.aprv_src_no1());
		}
		else if (MAC_APRV_FUNC_TYP.isMST_STD_SLS_UPRI(c)) {
			cndR.setStringNE("ope", "8");
			cndR.setStringNE("apl_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("cmn_flg", true);
			cndR.setBooleanNE("wg_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isMST_ITM_SLS_UPRI(c)) {
			cndR.setStringNE("ope", "8");
			cndR.setStringNE("apl_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("cmn_flg", true);
			cndR.setBooleanNE("wg_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isMST_CST_SLS_UPRI(c)) {
			cndR.setStringNE("ope", "8");
			cndR.setStringNE("apl_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("cmn_flg", true);
			cndR.setBooleanNE("wg_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isMST_PURC_UPRI(c)) {
			cndR.setStringNE("ope", "8");
			cndR.setStringNE("apl_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("cmn_flg", true);
			cndR.setBooleanNE("wg_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isMST_PROC_UPRI(c)) {
			cndR.setStringNE("ope", "8");
			cndR.setStringNE("apl_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("cmn_flg", true);
			cndR.setBooleanNE("wg_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isMST_PROV_UPRI(c)) {
			cndR.setStringNE("ope", "8");
			cndR.setStringNE("apl_no", selectedR.aprv_src_no1());
			cndR.setBooleanNE("cmn_flg", true);
			cndR.setBooleanNE("wg_flg", true);
		}
		else if (MAC_APRV_FUNC_TYP.isPAY_SCHD(c)) {
			cndR.setStringNE("ope", "3");
			cndR.setStringNE("pay_chk_no", selectedR.aprv_src_no1());
		}
		openScreen(c.ref_screen_id(), cndR);
	}

	/**
	 * 画面遷移を行います。
	 */
	protected void openScreen(String screen, MCRow cndR) {
		if (screen == null || screen.length() < 2) {
			return;
		}
		String module = screen.substring(0, 2);
		MAUCP_AppScreenOpener aso =
				new MAUCP_AppScreenOpener(module, screen);
		aso.runValueInit();
		aso.putCnd(cndR);
		aso.putSearchAction();
		aso.show();
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);

		if (dc == Dtl1Table) doDtl1_DC(info);
	}

	/**
	 * ダブルクリック->「詳細情報」ボタン処理
	 */
	public void doDtl1_DC(MCEventInfo info) {
		doBtn_open_detail(info);
	}

	/**
	 * Panel[Btn]のボタン[acpt_all]の押下時の処理
	 */
	@Override
	public void doBtn_acpt_all(MCEventInfo info) {
		for (DtlR row : Dtl1Table.getViewRows()) {
			int index = row.getGUIIndex();
			if (isCellEditable(Dtl1Table, index, columnDtl1_acpt_check)) {
				setValueEx(columnDtl1_acpt_check, index, true);
			}
			else {
				setValueEx(columnDtl1_rjct_check, index, false);
			}
		}
	}

	/**
	 * セルが編集可能である場合にtrueが返ります。
	 */
	protected boolean isCellEditable(
			MCTable2<DtlR> table, int index, MCColumnConfig column) {
		MCMode mode = table.isCellEditable(index, column);
		return table.getModeInfo(mode).getStatus() == MCMode.ENABLE_STATUS;
	}

	/**
	 * Panel[Btn]のボタン[rjct_all]の押下時の処理
	 */
	@Override
	public void doBtn_rjct_all(MCEventInfo info) {
		for (DtlR row : Dtl1Table.getViewRows()) {
			int index = row.getGUIIndex();
			if (isCellEditable(Dtl1Table, index, columnDtl1_rjct_check)) {
				setValueEx(columnDtl1_rjct_check, index, true);
			}
			else {
				setValueEx(columnDtl1_acpt_check, index, false);
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (DtlR row : Dtl1Table.getViewRows()) {
			if (!UPD.equals(getStatus()) &&
					(row.next_opr_flg() || row.not_upd_flg())) {
				setValueEx(columnDtl1_check, row.getGUIIndex(), false);
			}
			else {
				setValueEx(columnDtl1_check, row.getGUIIndex(), true);
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (DtlR row : Dtl1Table.getViewRows()) {
			setValueEx(columnDtl1_check, row.getGUIIndex(), false);
		}
	}

	/**
	 * Panel[Btn]のボタン[upd_acpt]の押下時の処理
	 */
	@Override
	public void doBtn_upd_acpt(MCEventInfo info) {
		callMB_MBBAL0020_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_acpt_del]の押下時の処理
	 */
	@Override
	public void doBtn_upd_acpt_del(MCEventInfo info) {
		callMB_MBBAL0020_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[upd_rjct_del]の押下時の処理
	 */
	@Override
	public void doBtn_upd_rjct_del(MCEventInfo info) {
		callMB_MBBAL0020_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMB_MBBAL0020_Upd03();
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if(isChanged()){
			if(!confirmRegDataClear()){
				return false;
			}
		}
		return super.doCnd_ope_VC(info);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info){
		super.doCnd_ope_NC(info);
		Dtl1Table.clear();
		Dtl2Table.clear();
		setSrchStatus();
		setSrchCnd();
		
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}

	/**
	 * 検索条件を設定します。
	 */
	protected void setSrchCnd(){
		if (Cnd_ope_0.isSelected()) {
			setValueEx(Cnd_aprv_d_sts_typ, MAC_APRV_D_STS_TYP.OPN.value());
			setValueEx(Cnd_main_role_flg, true);
			setValueEx(Cnd_next_opr_flg, false);
			setValueEx(Cnd_not_upd_flg, false);
		}
		else if (Cnd_ope_1.isSelected()) {
			setValueEx(Cnd_aprv_d_sts_typ, MAC_APRV_D_STS_TYP.ACPT.value());
			setValueEx(Cnd_main_role_flg, true);
			setValueEx(Cnd_next_opr_flg, false);
			setValueEx(Cnd_not_upd_flg, false);
		}
		else if (Cnd_ope_2.isSelected()) {
			setValueEx(Cnd_aprv_d_sts_typ, MAC_APRV_D_STS_TYP.RJCT.value());
			setValueEx(Cnd_main_role_flg, true);
			setValueEx(Cnd_next_opr_flg, false);
			setValueEx(Cnd_not_upd_flg, false);
		}
		else if (Cnd_ope_3.isSelected()) {
			setValueEx(Cnd_aprv_d_sts_typ, null);
			setValueEx(Cnd_main_role_flg, true);
			setValueEx(Cnd_next_opr_flg, true);
			setValueEx(Cnd_not_upd_flg, true);
		}
		else if (Cnd_ope_4.isSelected()) {
			setValueEx(Cnd_aprv_d_sts_typ, null);
			setValueEx(Cnd_main_role_flg, true);
			setValueEx(Cnd_sub_role_flg, true);
			setValueEx(Cnd_next_opr_flg, true);
			setValueEx(Cnd_not_upd_flg, true);
		}
	}

	@Override
	public void doDtl1_NC(MCEventInfo info) {
		super.doDtl1_NC(info);
		setDtl2ViewRows(info);
		setDtl2Focus(info);
	}

	/**
	 * 下段に表示するデータを設定します。
	 */
	protected void setDtl2ViewRows(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR dtlR = Dtl1Table.getRow(index);
		String[] cols = new String[] {
			  DtlR.$aprv_no
			, DtlR.$aprv_no_seq
		};
		Comparable<?>[] vals = dtlR.toArray(cols);
		setDtl2L(getDtlL().subList(cols, vals).clone());
		sort(Dtl2Table);
		Dtl2Table.adjustWidth();
	}

	/**
	 * 下段のフォーカスを設定します。
	 */
	protected void setDtl2Focus(MCEventInfo info) {
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR dtlR = Dtl1Table.getRow(index);
		String[] cols = new String[] {
			  DtlR.$aprv_no
			, DtlR.$aprv_no_seq
			, DtlR.$aprv_usr_cd
			, DtlR.$aprv_role_cd
		};
		Comparable<?>[] vals = dtlR.toArray(cols);
		dtlR = getDtl2L().getFirst(cols, vals);
		if (dtlR != null) {
			Dtl2Table.selectRowNoFocus(dtlR.getGUIIndex());
		}
	}

	@Override
	protected void setCheckOnWhenStatusChanged(MCConstRow row) {
		if (Cnd_ope_3.isSelected()) {
			setValueEx(columnDtl1_check, row.getGUIIndex(), true);
		}
		setDefaultValueWhenChecked(row);
	}

	@Override
	public void doDtl1_acpt_check_NC(MCEventInfo info) {
		super.doDtl1_acpt_check_NC(info);
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR r = Dtl1Table.getRow(index);
		if (r.acpt_check()) {
			setValueEx(columnDtl1_rjct_check, r.getGUIIndex(), false);
			setValueEx(columnDtl1_aprv_d_sts_typ_up, r.getGUIIndex(),
					MAC_APRV_D_STS_TYP.ACPT.value());
		}
		setCheck(r);
	}

	/**
	 * 選択チェックを設定します。
	 */
	protected void setCheck(DtlR r) {
		boolean val = r.acpt_check() || r.rjct_check();
		setValueEx(columnDtl1_check, r.getGUIIndex(), val);
	}

	@Override
	public void doDtl1_rjct_check_NC(MCEventInfo info) {
		super.doDtl1_rjct_check_NC(info);
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR r = Dtl1Table.getRow(index);
		if (r.rjct_check()) {
			setValueEx(columnDtl1_acpt_check, r.getGUIIndex(), false);
			setValueEx(columnDtl1_aprv_d_sts_typ_up, r.getGUIIndex(),
					MAC_APRV_D_STS_TYP.RJCT.value());
		}
		setCheck(r);
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Dtl1Table.setCellConfig(createDtl1TableCellConfig());
	}

	/**
	 * Dtl1Table用のCellConfigを作成します。
	 */
	protected MCCellConfig createDtl1TableCellConfig() {
		return new Dtl1TableCellConfig();
	}

	/**
	 * Dtl1Table用のCellConfig
	 */
	public class Dtl1TableCellConfig extends MAUDP_CellConfig {

		@SuppressWarnings("rawtypes")
		@Override
		public MCMode getPriorMode(
				int index, MCColumnConfig column, MCTable table) {
			DtlR row = Dtl1Table.getRow(index);
			
			if (column == columnDtl1_check) {
				if (!Cnd_ope_3.isSelected() &&
						(row.next_opr_flg() || row.not_upd_flg())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_acpt_check) {
				if (MAC_APRV_D_STS_TYP.isACPT(row.aprv_d_sts_typ()) ||
						row.next_opr_flg() || row.not_upd_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_rjct_check) {
				if (MAC_APRV_D_STS_TYP.isRJCT(row.aprv_d_sts_typ()) ||
						row.next_opr_flg() || row.not_upd_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl1_aprv_d_rmrks_up) {
				if (!Cnd_ope_3.isSelected() &&
						(row.next_opr_flg() || row.not_upd_flg())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}

	}

	@Override
	public MCTable<? extends MCConstRow> getListRegTable() {
		return Dtl1Table;
	}

	@Override
	public String getCheckColumn() {
		return super.getCheckColumn();
	}

	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		// 何もしない
	}

	@Override
	public void setSRCH_ACPTStatus() {
		super.setSRCH_ACPTStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCH_ACPT_CANStatus() {
		super.setSRCH_ACPT_CANStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCH_RJCT_CANStatus() {
		super.setSRCH_RJCT_CANStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_aprv_usr_cd, MCSys.user.ID());
		setSrchCnd();
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();

		Dtl1Table.addSortColumn(columnDtl1_aprv_func_typ);
		Dtl1Table.addSortColumn(columnDtl1_aprv_no);
		Dtl1Table.addSortColumn(columnDtl1_aprv_no_seq);

		Dtl2Table.addSortColumn(columnDtl2_aprv_seq);
		Dtl2Table.addSortColumn(columnDtl2_aprv_usr_cd);
	}

}