package mcframe.clientMSBF.MSBFP0080;

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
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5370.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_PlntAprvReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_PlntAprvReg_MC extends MSBFP_PlntAprvReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_PlntAprvReg_MC() {
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
	public MSBFP_PlntAprvReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Srch01Caller<P extends MSBFP_PlntAprvReg, B extends MS_MSBFL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0080_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
			addDownContainer(getBulkSetR());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(AprvStsTypPanel));
			msgList.addAll(checkBeforeAfter(Cnd_aprv_dt_fr, Cnd_aprv_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_upd_ts_fr, Cnd_upd_ts_to));
			if (!isSelectedAprvRjct()) {
				msgList.addAll(checkAtLeastOne(PlntAprvPrntPanel));
			}
		}

		@Override
		protected void show() {
			super.show();
			setBulkSetVal();
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

		/**
		 * 一括設定用項目の初期値設定
		 */
		protected void setBulkSetVal() {
			if (isSelectedAprvRjct()) {
				setValueEx(BulkSet_aprv_dt, getToday());
			}
		}
	}

	/**
	 * [MS_MSBFL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Upd01Caller<P extends MSBFP_PlntAprvReg, B extends MS_MSBFL0080_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0080_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			// 即時発行
			bridge.up0().setBooleanNE(RsltR.$aprv_prnt_flg, getBtnR().aprv_prnt_flg());
		}

		@Override
		protected void show() {
			super.show();

			for (RsltR r : getRsltL()) {
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					r.acpt_flg(false);
					r.rjct_flg(false);
				}
			}
		}
	}

	/**
	 * [MS_MSBFL0080_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Upd02Caller<P extends MSBFP_PlntAprvReg, B extends MS_MSBFL0080_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0080_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0080_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Del01Caller<P extends MSBFP_PlntAprvReg, B extends MS_MSBFL0080_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0080_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);

			checkReqSub(msgList);
		}

		/**
		 * 共通項目の必須チェックを行っています。
		 * @param msgList
		 */
		protected void checkReqSub(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getBulkSetR()));
		}
	}

	/**
	 * [MS_MSBFL0080_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0080_Prnt01Caller<P extends MSBFP_PlntAprvReg, B extends MS_MSBFL0080_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBFL0080_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBFL0080_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBFL0080_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0050(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0050(r);
	}

	protected void doBtn_open_MSBFP0050(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0050");
		aso.putCnd(crtOpenMSBFP0050CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0050.CndR crtOpenMSBFP0050CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg p = (mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0050.CndR to = mcframe.clientMSBF.MSBFP0050.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.insp_no(r.insp_no());
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBFP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0120(r);
	}

	protected void doBtn_open_MSBFP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0120");
		aso.putCnd(crtOpenMSBFP0120CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0120.CndR crtOpenMSBFP0120CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0120.CndR to = mcframe.clientMSBF.MSBFP0120.CndR.create();
		to.dupl_abl_flg(true);

		to.itm_p().itm_cd(r.itm_cd());
		to.itm_p().itm_sub1(r.itm_sub1());
		to.itm_p().itm_sub2(r.itm_sub2());
		to.itm_p().itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBFL0080_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_acpt]の押下時の処理
	 */
	@Override
	public void doBtn_select_acpt(MCEventInfo info) {
		//承認のチェックをオンにする
		for (RsltR row : RsltTable.getViewRows()) {
			if (isEditable(columnRslt_acpt_flg, row.getGUIIndex())){
				setValueEx(columnRslt_acpt_flg, row.getGUIIndex(), true);
			}
		}
	}
	/**
	 * Panel[Btn]のボタン[select_rjct]の押下時の処理
	 */
	@Override
	public void doBtn_select_rjct(MCEventInfo info) {
		//却下のチェックをオンにする
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_rjct_flg, row.getGUIIndex(), true);
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
		if (isSelectedAprvRjct()) {
			for (RsltR row : RsltTable.getViewRows()) {
				if (isEditable(columnRslt_acpt_flg, row.getGUIIndex())){
					setValueEx(columnRslt_acpt_flg, row.getGUIIndex(), false);
				}
				if (isEditable(columnRslt_rjct_flg, row.getGUIIndex())){
					setValueEx(columnRslt_rjct_flg, row.getGUIIndex(), false);
				}
			}
		}
		else {
			doDeselectAll(RsltTable);
		}
	}
	/**
	 * Panel[Btn]のボタン[upd_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_upd_aprv(MCEventInfo info) {
		callMS_MSBFL0080_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBFL0080_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[del_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv(MCEventInfo info) {
		callMS_MSBFL0080_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_rjct]の押下時の処理
	 */
	@Override
	public void doBtn_del_rjct(MCEventInfo info) {
		callMS_MSBFL0080_Del01();
	}

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);

		BulkSet_aprv_usr_p_PPanel.setRelateBeans(BulkSet_aprv_dt);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_aprv_dt);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	// -----------------------------------------------
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	/**
	 * 初期値設定
	 */
	protected void valueInitSub() {
		Cnd_opn_flg.setValue(true);
		Cnd_acpt_flg.setValue(false);
		Cnd_rjct_flg.setValue(false);
		Cnd_aprv_dt_fr.setValue(null);
		Cnd_aprv_dt_to.setValue(null);
		Btn_aprv_prnt_flg.setValue(false);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCH_APRV_RJCTStatus() {
		super.setSRCH_APRV_RJCTStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setAPRV_RJCTStatus() {
		super.setAPRV_RJCTStatus();
		setAprvDptUsrDftVal();
		setAprvDptUsrMode();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_APRVStatus() {
		super.setSRCH_DEL_APRVStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDEL_APRVStatus() {
		super.setDEL_APRVStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_RJCTStatus() {
		super.setSRCH_DEL_RJCTStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	@Override
	public void setDEL_RJCTStatus() {
		super.setDEL_RJCTStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_PRNTStatus() {
		super.setSRCH_PRNTStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		// 規格検査実績登録
		if (isEnableBtn_open_MSBFP0050(r)) {
			setDefaultMode(Btn_open_MSBFP0050);
		}
		else {
			Btn_open_MSBFP0050.setMode(MCMode.DISABLE);
		}

		// ロットトレース（原因調査）
		if (isEnableBtn_openMSBFP0120(r)) {
			setDefaultMode(Btn_open_MSBFP0120);
		}
		else {
			Btn_open_MSBFP0120.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 一括設定の検査承認者、検査承認部門の初期値を設定する。
	 */
	protected void setAprvDptUsrDftVal() {
		BulkSet_aprv_dt.setValue(getToday());
		if (isNull(getBulkSetR().aprv_usr_cd())) {
			BulkSet_aprv_usr_cd.setValue(mcframe.clientCore.sys.MCSys.user.ID());
		}
		BulkSet_aprv_usr_p_PPanel.focusFirstComponent();
	}

	/**
	 * 一括設定項目制御を設定する。
	 */
	protected void setAprvDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			if (isSelectedAprvRjct()) {
				BulkSet_aprv_dt.setMode(MCMode.READ_ONLY);
				BulkSet_aprv_usr_cd.setMode(MCMode.READ_ONLY);
			}
		}
	}

	/**
	 * 規格検査実績登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0050(RsltR r) {
		if (r == null) {
			return false;
		}

		return MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ());
	}

	/**
	 * ロットトレース（原因調査）画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_openMSBFP0120(RsltR r) {
		if (r == null) {
			return false;
		}
		
		return !isNull(r.itm_cd());
	}

	/**
	 * 検査前ステータスを設定する。
	 */
	protected void setSrchStatus() {
		// 検索前ステータス
		if (isSelectedAprvRjct()) {
			setSRCH_APRV_RJCTStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedDelAprv()) {
			setSRCH_DEL_APRVStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedUpd()) {
			setSRCH_UPDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedDelRjct()) {
			setSRCH_DEL_RJCTStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedRef()) {
			setSRCHStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (isSelectedPrnt()) {
			setSRCH_PRNTStatus();
			FoldTab.focusActiveFirstComponent();
		}
		
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	/**
	 * 検査後ステータスを設定する。
	 */
	protected void setRefStatus() {
		// 検索後ステータス
		if (isSelectedAprvRjct()) {
			setAPRV_RJCTStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedDelAprv()) {
			setDEL_APRVStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedUpd()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedDelRjct()) {
			setDEL_RJCTStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedRef()) {
			setREFStatus();
		}
		else if (isSelectedPrnt()) {
			setPRNTStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		setListItmsMode(getCndR().trace_disp_flg());

		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	// -----------------------------------------------
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getBulkSetR(), getRsltL());
		clearCnd();
		setSrchStatus();
	}

	protected void clearCnd() {
		// 承認・却下
		if (isSelectedAprvRjct()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_acpt_flg, false);
			setValueEx(Cnd_rjct_flg, false);
			setValueEx(Cnd_not_prnt_flg, false);
			setValueEx(Cnd_prnt_flg, false);
			setValueEx(Cnd_aprv_dt_fr, null);
			setValueEx(Cnd_aprv_dt_to, null);
			setValueEx(Cnd_aprv_usr_cd, null);
			setValueEx(Cnd_aprv_usr_nm, null);
			setValueEx(Cnd_aprv_dpt_cd, null);
			setValueEx(Cnd_aprv_dpt_nm, null);
		}
		// 承認取消
		else if (isSelectedDelAprv()) {
			setValueEx(Cnd_opn_flg, false);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_rjct_flg, false);
			setValueEx(Btn_aprv_prnt_flg, false);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, true);
		}
		// 却下取消
		else if (isSelectedDelRjct()) {
			setValueEx(Cnd_opn_flg, false);
			setValueEx(Cnd_acpt_flg, false);
			setValueEx(Cnd_rjct_flg, true);
			setValueEx(Btn_aprv_prnt_flg, false);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, true);
		}
		// 更新
		else if (isSelectedUpd()) {
			setValueEx(Cnd_opn_flg, false);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_rjct_flg, true);
			setValueEx(Btn_aprv_prnt_flg, false);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, true);
		}
		// 参照
		else if (isSelectedRef()) {
			setValueEx(Cnd_opn_flg, true);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_rjct_flg, true);
			setValueEx(Btn_aprv_prnt_flg, false);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, true);
		}
		// 帳票発行
		else if (isSelectedPrnt()) {
			setValueEx(Cnd_opn_flg, false);
			setValueEx(Cnd_acpt_flg, true);
			setValueEx(Cnd_rjct_flg, true);
			setValueEx(Cnd_not_prnt_flg, true);
			setValueEx(Cnd_prnt_flg, false);
			setValueEx(Btn_aprv_prnt_flg, false);
		}
	}

	/**
	 * 操作種別の承認・却下を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedAprvRjct(){
		return Cnd_ope_APRV_RJCT.isSelected();
	}
	/**
	 * 操作種別の承認取消を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedDelAprv(){
		return Cnd_ope_DEL_APRV.isSelected();
	}
	/**操作種別が却下取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDelRjct() {
		return Cnd_ope_DEL_RJCT.isSelected();
	}
	/**操作種別が更新を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedUpd() {
		return Cnd_ope_UPD.isSelected();
	}
	/**
	 * 操作種別の参照を選択しているかどうか
	 * @return 
	 */	
	protected boolean isSelectedRef(){
		return Cnd_ope_REF.isSelected();
	}
	/**操作種別が帳票発行を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedPrnt() {
		return Cnd_ope_PRNT.isSelected();
	}

	protected boolean isAprvRjctStatus() {
		return isSame(getStatus(), APRV_RJCT);
	}

	@Override
	public void doCnd_trace_disp_flg_NC(MCEventInfo info) {
		super.doCnd_trace_disp_flg_NC(info);

		setListItmsMode(getCndR().trace_disp_flg());
	}

	protected void setListItmsMode(boolean isOnFlg) {
		if (isOnFlg) {
			columnRslt_comp_itm_insp_typ.setMode(MCMode.READ_ONLY);
			columnRslt_comp_itm_insp_typ_nm.setMode(MCMode.READ_ONLY);
			if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
				columnRslt_comp_itm_mfg_aprv_typ.setMode(MCMode.READ_ONLY);
				columnRslt_comp_itm_mfg_aprv_typ_nm.setMode(MCMode.READ_ONLY);
			}
			columnRslt_comp_itm_quality_typ.setMode(MCMode.READ_ONLY);
			columnRslt_comp_itm_quality_typ_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			columnRslt_comp_itm_insp_typ.setMode(MCMode.INVISIBLE);
			columnRslt_comp_itm_insp_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_comp_itm_mfg_aprv_typ.setMode(MCMode.INVISIBLE);
			columnRslt_comp_itm_mfg_aprv_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_comp_itm_quality_typ.setMode(MCMode.INVISIBLE);
			columnRslt_comp_itm_quality_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_aprv_usr_cd.addLCListener(this);
		BulkSet_aprv_dpt_cd.addLCListener(this);
		BulkSet_aprv_rsn.addLCListener(this);
	}

	@Override
	public void doBulkSet_aprv_dt_NC(MCEventInfo info) {
		super.doBulkSet_aprv_dt_NC(info);

		bulkSet(BulkSet_aprv_dt);
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	/**
	 * 一覧の承認FLG、却下FLGにあわせて、選択チェックを設定する。
	 */
	protected void setCheck(RsltR r) {
		if (r.acpt_flg() || r.rjct_flg()) {
			setValueEx(columnRslt_check, r.getGUIIndex(), true);
		}
		else {
			setValueEx(columnRslt_check, r.getGUIIndex(), false);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
	
		if (lc == BulkSet_aprv_usr_cd) {
			doBulkSet_aprv_usr_cd_LC(info);
		}
		else if (lc == BulkSet_aprv_dpt_cd) {
			doBulkSet_aprv_dpt_cd_LC(info);
		}
		else if (lc == BulkSet_aprv_rsn) {
			doBulkSet_aprv_rsn_LC(info);
		}
	}

	protected void doBulkSet_aprv_usr_cd_LC(MCEventInfo info){
		bulkSet(BulkSet_aprv_usr_cd);
	}

	protected void doBulkSet_aprv_dpt_cd_LC(MCEventInfo info){
		bulkSet(BulkSet_aprv_dpt_cd);
	}

	protected void doBulkSet_aprv_rsn_LC(MCEventInfo info){
		bulkSet(BulkSet_aprv_rsn);
	}

	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		 if (srcRow instanceof RsltR) {
			RsltR r = (RsltR)srcRow;
			if (isNull(r.aprv_dt())) {
				bulkSet(BulkSet_aprv_dt, r);
			}
			if (isNull(r.aprv_usr_cd())) {
				bulkSet(BulkSet_aprv_usr_cd, r);
			}
			if (isNull(r.aprv_dpt_cd())) {
				bulkSet(BulkSet_aprv_dpt_cd, r);
			}
			if (isNull(r.aprv_rsn())) {
				bulkSet(BulkSet_aprv_rsn, r);
			}
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.check()) {
			bulkSet(BulkSet_aprv_dt, r);
			bulkSet(BulkSet_aprv_usr_cd, r);
			bulkSet(BulkSet_aprv_dpt_cd, r);
			bulkSet(BulkSet_aprv_rsn, r);
		}
	}

	@Override
	public void doRslt_acpt_flg_NC(MCEventInfo info) {
		super.doRslt_acpt_flg_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		RsltR r = getRsltL().get(index);
		if (isEditable(columnRslt_acpt_flg, index) && r.acpt_flg()) {
			r.rjct_flg(false);
			r.check(false);
		}
		setCheck(r);
	}

	@Override
	public void doRslt_rjct_flg_NC(MCEventInfo info) {
		super.doRslt_rjct_flg_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		RsltR r = getRsltL().get(index);
		if (isEditable(columnRslt_rjct_flg, index) && r.rjct_flg()) {
			r.acpt_flg(false);
			r.check(false);
		}
		setCheck(r);
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			// 規格検査実績登録
			if (isEnableBtn_open_MSBFP0050(r)) {
				doBtn_open_MSBFP0050(r);
			}
		}
	}

	/**
	 * 一括項目設定
	 * @param b
	 */
	protected void bulkSet(MCBeans b) {

		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	/**
	 * 指定した行の項目設定
	 * @param b
	 * @param r
	 */
	protected void bulkSet(MCBeans b, RsltR r) {
		if (isAprvRjctStatus()) {
			if (b == BulkSet_aprv_dt) {
				r.aprv_dt(getBulkSetR().aprv_dt());
			}
			else if (b == BulkSet_aprv_usr_cd) {
				r.aprv_usr_cd(getBulkSetR().aprv_usr_cd());
				r.aprv_usr_nm(getBulkSetR().aprv_usr_nm());
			}
			else if (b == BulkSet_aprv_dpt_cd) {
				r.aprv_dpt_cd(getBulkSetR().aprv_dpt_cd());
				r.aprv_dpt_nm(getBulkSetR().aprv_dpt_nm());
			}
			else if (b == BulkSet_aprv_rsn) {
				r.aprv_rsn(getBulkSetR().aprv_rsn());
			}
		}
		else if (isSelectedDelAprv() || isSelectedDelRjct()) {
			if (b == BulkSet_aprv_rsn) {
				r.aprv_rsn(getBulkSetR().aprv_rsn());
			}
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			if (isCompItmCols(column)) {
				if (getCndR().trace_disp_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}

		/**
		 * 構成品項目か判定する。
		 * @param column
		 * @return
		 */
		protected boolean isCompItmCols(MCColumnConfig column) {
			if (column == columnRslt_comp_itm_insp_typ
					|| column == columnRslt_comp_itm_insp_typ_nm
					|| (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1") && column == columnRslt_comp_itm_mfg_aprv_typ)
					|| (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1") && column == columnRslt_comp_itm_mfg_aprv_typ_nm)
					|| column == columnRslt_comp_itm_quality_typ
					|| column == columnRslt_comp_itm_quality_typ_nm) {
				return true;
			}
			return false;
		}
	}

}