package mcframe.clientMBBA.MBBAP0010;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBAP_AprvStsSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBAP_AprvStsSrch_MC extends MBBAP_AprvStsSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**
	 * 明細
	 */
	protected MCList<Dtl2R> _dtl2L = getDtl2L().createInstance();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBAP_AprvStsSrch_MC() {
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
	public MBBAP_AprvStsSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBAL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0010_Srch01Caller<P extends MBBAP_AprvStsSrch, B extends MB_MBBAL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBAL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_ins_dt_fr, Cnd_ins_dt_to));
		}

		@Override
		protected void clear() {
			super.clear();
			_dtl2L.clear();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			_dtl2L.setAll(bridge.down1());
		}

		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
			changeStatusByOpe(false);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DtlTable.selectLeftmostColumn(0);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			changeStatusByOpe(true);
		}

	}

	/**
	 * 操作種別に合わせてステータスを制御します。
	 */
	protected void changeStatusByOpe(boolean noRslt) {
		if (noRslt) {
			if (Cnd_ope_SRCH.isSelected()) {
				setSRCHStatus();
			}
			else if (Cnd_ope_SRCH_ADMIN.isSelected()) {
				setSRCH_ADMINStatus();
			}
		}
		else {
			if (Cnd_ope_SRCH.isSelected()) {
				setREFStatus();
			}
			else if (Cnd_ope_SRCH_ADMIN.isSelected()) {
				setREF_ADMINStatus();
			}
		}
		setAdminMode();
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMB_MBBAL0010_Srch01();
	}

	/**
	 * Panel[RPnl]のボタン[srch_admin]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_admin(MCEventInfo info) {

	}

	/**
	 * Panel[Btn]のボタン[open_detail]の押下時の処理
	 */
	@Override
	public void doBtn_open_detail(MCEventInfo info) {
		DtlR selectedR = DtlTable.getSelectedMCRow();
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

		if (dc == DtlTable) doDtl_DC(info);
	}

	/**
	 * ダブルクリック->「詳細情報」ボタン処理
	 */
	public void doDtl_DC(MCEventInfo info) {
		doBtn_open_detail(info);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		changeUserModeByOpe();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCH_ADMINStatus() {
		super.setSRCH_ADMINStatus();
		changeUserModeByOpe();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		changeUserModeByOpe();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREF_ADMINStatus() {
		super.setREF_ADMINStatus();
		changeUserModeByOpe();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setAdminMode();
	}

	/**
	 * 操作種別に合わせて登録／業務担当者のモードを制御します。
	 */
	protected void changeUserModeByOpe() {
		if (Cnd_ope_SRCH.isSelected()) {
			Cnd_ins_biz_usr_cd.setMode(MCMode.READ_ONLY);
			Cnd_ins_biz_usr_nm.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_SRCH_ADMIN.isSelected()) {
			Cnd_ins_biz_usr_cd.setMode(MCMode.ENABLE);
			Cnd_ins_biz_usr_nm.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 管理者権限に対応する制御を行います。
	 */
	protected void setAdminMode() {
		if (!RPnl_srch_admin.authorize()) {
			Cnd_ope_SRCH_ADMIN.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		DtlR dtlR = DtlTable.getRow(index);
		String[] keys = new String[] {
			  DtlR.$aprv_no
			, DtlR.$aprv_no_seq
		};
		Comparable<?>[] vals = dtlR.toArray(keys);
		setDtl2L(_dtl2L.subList(keys, vals));
		sort(Dtl2Table);
		Dtl2Table.adjustWidth();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		DtlTable.clear();
		Dtl2Table.clear();
		changeStatusByOpe(true);
		changeUserModeByOpe();
		changeUserValueByOpe();
		
		Ctrl_ctrl_PPanel.expand(true);
		CndPanel.focusFirstComponent();
	}

	/**
	 * 操作種別に合わせて登録／業務担当者の値を制御します。
	 */
	protected void changeUserValueByOpe() {
		if (Cnd_ope_SRCH.isSelected()) {
			Cnd_ins_biz_usr_cd.setValue(MCSys.user.ID());
		}
		else if (Cnd_ope_SRCH_ADMIN.isSelected()) {
			Cnd_ins_biz_usr_cd.setValue(null);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		changeUserValueByOpe();
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();

		DtlTable.addSortColumn(columnDtl_aprv_func_typ);
		DtlTable.addSortColumn(columnDtl_aprv_no);
		DtlTable.addSortColumn(columnDtl_aprv_no_seq);

		Dtl2Table.addSortColumn(columnDtl2_aprv_seq);
		Dtl2Table.addSortColumn(columnDtl2_aprv_usr_cd);
	}

}