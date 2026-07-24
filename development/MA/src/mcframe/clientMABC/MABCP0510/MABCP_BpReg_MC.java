package mcframe.clientMABC.MABCP0510;

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

import mcframe.clientMAUB.MAUBP5010.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import static mcframe.commonFX.notice.FX_Msg.*;
import javax.swing.Timer;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_BpReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_BpReg_MC extends MABCP_BpReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _INPT_CTL = "INPT_CTL";
	MCScrollPane _cstPanelS;
	MCScrollPane _acstPanelS;
	MCScrollPane _bcst1PanelS;
	MCScrollPane _bcst2PanelS;
	MCScrollPane _rcstPanelS;
	MCScrollPane _dlvPanelS;
	MCScrollPane _spplPanelS;
	MCScrollPane _aspplPanelS;
	MCScrollPane _bsppl1PanelS;
	MCScrollPane _bsppl2PanelS;
	MCScrollPane _pspplPanelS;
	Timer _btmtabSelector = null;
	protected String _MST_SET_TYP;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BpReg_MC() {
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
	public MABCP_BpReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	//ディバイダの位置を調整する
	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		getSplitPane(TopPanel).setDividerLocation(180);
	}

	protected String getMstSetTyp() {
		if(isNull(_MST_SET_TYP)) {
			_MST_SET_TYP = getRLUtil().getMstSetTyp(MAC_MST_NM.MAM_BP);
		}
		return _MST_SET_TYP;
	}
	protected boolean isAllCom() {
		return  MAC_MST_SET_TYP.isALL_COM(getMstSetTyp());
	}
	protected boolean isAllComCom() {
		return MAC_MST_SET_TYP.isALL_COM_COM(getMstSetTyp()) ;
	}
	
	@Override
	protected MCPanel getOpeHdrPanel() {
		return TopPanel;
	}

	@Override
	protected MCPanel getSplitPaneTopPanel() {
		return TopPanel;
	}
	/**
	 * [MA_MABCL0510_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0510_Srch01Caller<P extends MABCP_BpReg, B extends MA_MABCL0510_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0510_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			panel.clearAll();
		}
		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getCmnR(), getDtlL().get(0));

			// 検索結果を保持しておく
			// 「check_**_dpt_cd」項目：更新前に画面の値と比較して変更されていたら変更値、それ以外はnullを設定
			getCmnR().check_ar_dpt_cd(getCmnR().ar_dpt_cd());
			getCmnR().check_bcst_dpt_cd(getCmnR().bcst_dpt_cd());
			getCmnR().check_vmi_purc_dpt_cd(getCmnR().vmi_purc_dpt_cd());
			getCmnR().check_ap_dpt_cd(getCmnR().ap_dpt_cd());
			getCmnR().check_bsppl_dpt_cd(getCmnR().bsppl_dpt_cd());
			getCmnR().check_pay_dpt_cd(getCmnR().pay_dpt_cd());

			getCmnR().org_all_com_flg(getCmnR().all_com_flg());
			getCmnR().org_tdlv_flg(getCmnR().tdlv_flg());
			getCmnR().org_sppl_flg(getCmnR().sppl_flg());
			getCmnR().org_cst_flg(getCmnR().cst_flg());
			getCmnR().org_onr_prsppl_flg(getCmnR().onr_prsppl_flg());
		}
		@Override
		protected void moveFocus() {
			SubDtlTable.selectRowNoFocus(0);
			LclDtlTable.selectRowNoFocus(0);

			if (isRefOpe()) {
				CndPanel.focusFirstComponent();
			}
			else {
				TopTab.focusActiveFirstComponent();
			}
		}
		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
		@Override
		protected void setMode() {
			if (isModOpe()) {
				setMODStatus();
			}
			else if (isUpdAdminOpe()) {
				setUPD_ADMINStatus();
			}
			else if (isRefOpe()) {
				setREFStatus();
			}
			else if (isDelOpe()) {
				setDELStatus();
			}
			panel.fillSpace();
		}
		@Override
		protected void setModeNoDown() {
			setSRCHStatus();
		}
		@Override
		protected void adjustList() {
			SubDtlTable.adjustWidth();
			LclDtlTable.adjustWidth();
		}
	}

	/**
	 * [MA_MABCL0510_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0510_Upd01Caller<P extends MABCP_BpReg, B extends MA_MABCL0510_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0510_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			
			if (isAllComCom() && Cnd_reg_COM.isSelected()) {
				getCndR().upd_only_com_flg(true);
			}
			else {
				getCndR().upd_only_com_flg(false);
			}
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		protected void checkForCallStackSub(MCMessageList msgList) {
			if (isAllCom()) {
				msgList.addAll(checkAtLeastOne(Cmn_all_com_flg, Cmn_com_use_flg));
			}
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getCmnR()));
		}

		@Override
		protected boolean checkForCall() {
			setupDtl();
			return super.checkForCall();
		}

		protected void setupDtl() {
			getDtlL().clear();
			
			if (!getCmnR().isStatusNone()) {
				CmnR r = getCmnR().clone();
				r.check(true);
				if (isUpdOpe()) {
					r.setStatus(MCRow.CREATE);
				}
				else {
					r.setStatus(MCRow.MODIFY);
				}
				// 部門が変更されたときのみ、「check_**_dpt_cd」に設定して、サーバ側で存在チェック
				setCheckDpt(r, CmnR.$ar_dpt_cd, CmnR.$check_ar_dpt_cd);
				setCheckDpt(r, CmnR.$bcst_dpt_cd, CmnR.$check_bcst_dpt_cd);
				setCheckDpt(r, CmnR.$vmi_purc_dpt_cd, CmnR.$check_vmi_purc_dpt_cd);
				setCheckDpt(r, CmnR.$ap_dpt_cd, CmnR.$check_ap_dpt_cd);
				setCheckDpt(r, CmnR.$bsppl_dpt_cd, CmnR.$check_bsppl_dpt_cd);
				setCheckDpt(r, CmnR.$pay_dpt_cd, CmnR.$check_pay_dpt_cd);

				getDtlL().add(r);
			}
		}

		/**
		 * 検索時の値と比較して変更されていた場合のみ「check_**_dpt_cd」に値を設定します。
		 */
		protected void setCheckDpt(CmnR r, String dptCd, String checkDptCd) {
			if(isSame(r.getString(dptCd), r.getString(checkDptCd))) {
				r.setString(checkDptCd, null);
			}
			else {
				r.setString(checkDptCd, r.getString(dptCd));
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			for(SubDtlR r : bridge.up1()) {
				if (isNull(r.upd_cntr())) {
					r.bp_cd(getCmnR().bp_cd());
				}
			}
			for(LclDtlR r : bridge.up2()) {
				if (isNull(r.upd_cntr())) {
					r.bp_cd(getCmnR().bp_cd());
				}
			}
		}

		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			// 何もしない
		}
		@Override
		protected void checkStEndDtValid(MCMessageList list) {
			// 何もしない
		}
		@Override
		protected void setMode() {
			super.setMode();

			if (isUpdOpe()) {
				setFIX_UStatus();
				setValueEx(Cnd_bp_cd, getCmnR().bp_cd());
			}
		}

		@Override
		protected void statusClear() {
			getCmnR().setStatus(MCRow.NONE);
			getDtlL().setStatus(MCRow.NONE);
			getSubDtlL().setStatus(MCRow.NONE);
			getLclDtlL().setStatus(MCRow.NONE);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return getCmnR().isStatusNone()
					&& getSubDtlL().subList(getCheckColumn(), true).isEmpty()
					&& getLclDtlL().subList(getCheckColumn(), true).isEmpty();
		}

		@Override
		protected void handleMCEx(MCException ex) {
			if (isOperationMightBeSuccess(ex)) {
				handleOperationMightBeSuccessMCEx(ex);
			}
			if (isAddFailedMsg(ex)) {
				throw addFailedMsg(ex);
			}
			throw ex;
		}

		@Override
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
		}
	}

	/**
	 * [MA_MABCL0510_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0510_Del01Caller<P extends MABCP_BpReg, B extends MA_MABCL0510_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0510_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			setupDtl();
			return super.checkForCall();
		}

		protected void setupDtl() {
			getDtlL().clear();
			CmnR r = getCmnR().clone();
			r.check(true);
			getDtlL().add(r);
		}

		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			// 何もしない
		}

		@Override
		protected void statusClear() {
			getCmnR().setStatus(MCRow.NONE);
			getDtlL().setStatus(MCRow.NONE);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABCL0510_Srch01();
	}
	/**
	 * Panel[SubBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doSubBtn_select_all(MCEventInfo info) {
		doSelectAll(SubDtlTable);
	}
	/**
	 * Panel[SubBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doSubBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(SubDtlTable);
	}
	/**
	 * Panel[SubBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doSubBtn_radd(MCEventInfo info) {
		insertRow(SubDtlTable);
	}
	/**
	 * Panel[SubBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doSubBtn_rdel(MCEventInfo info) {
		deleteRow(SubDtlTable);
	}
	/**
	 * Panel[SubBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doSubBtn_rcopy(MCEventInfo info) {
		copyRow(SubDtlTable);
	}
	/**
	 * Panel[SubBtn]のボタン[set_data]の押下時の処理
	 */
	@Override
	public void doSubBtn_set_data(MCEventInfo info) {
		SubDtlR r = SubDtlTable.getSelectedMCRow();
		if (r != null && (r.isEmpty() || confirmRegDataClear())) {
			copyValue(r, getCmnR(), createMap_SubDtlR_CmnR());
			if (isNull(r.upd_cntr())) {
				r.setStatus(MCRow.CREATE);
			}
			else {
				r.setStatus(MCRow.MODIFY);
			}
		}
	}
	/**
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclDtlTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclDtlTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclDtlTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclDtlTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclDtlTable);
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0540]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0540(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0540");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0540CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0540.CndR crtOpenMABCP0540CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0540.CndR to = mcframe.clientMABC.MABCP0540.CndR.create();
		to.bp_cd(getCmnR().bp_cd());
		if (!isNull(getCmnR().bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0560]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0560(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0560");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0560CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0560.CndR crtOpenMABCP0560CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0560.CndR to = mcframe.clientMABC.MABCP0560.CndR.create();
		to.bp_cd(getCmnR().bp_cd());
		if (!isNull(getCmnR().bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0570]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0570(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0570");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0570CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0570.CndR crtOpenMABCP0570CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0570.CndR to = mcframe.clientMABC.MABCP0570.CndR.create();
		to.bp_cd(getCmnR().bp_cd());
		if (!isNull(getCmnR().bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0580]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0580(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0580");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0580CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0580.CndR crtOpenMABCP0580CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0580.CndR to = mcframe.clientMABC.MABCP0580.CndR.create();
		to.bp_cd(getCmnR().bp_cd());
		if (!isNull(getCmnR().bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0590]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0590(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0590");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0590CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0590.CndR crtOpenMABCP0590CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0590.CndR to = mcframe.clientMABC.MABCP0590.CndR.create();
		to.cred_cd(getCmnR().bp_cd());
		if (!isNull(getCmnR().bp_cd())) {
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0510_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0510_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMA_MABCL0510_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0510_Del01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		// 管理名
		getMstR().bp_mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BP));
		getMstR().bp_mst_set_typ(getRLUtil().getMstSetTyp(MAC_MST_NM.MAM_BP));
		getMstR().sub_mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BP_SUB));
	}
	@Override
	protected void listInit() {
		super.listInit();
		getSubDtl_prov_tax_cd_ListPutter().putBind(ProvTaxCols.$i_repurc_obli_flg, Cmn_repurc_obli_flg);
	}
	@Override
	public void layoutInit() {

		int selectedtab = BtmTab.getSelectedIndex();

		if (isRelayout()) {
			// 一度ビューポートに設定しなおしてからクリアすることで、パネルからドラッグスクロールリスナーを除去
			_cstPanelS.setViewportView(CstPanel);
			_acstPanelS.setViewportView(AcstPanel);
			_bcst1PanelS.setViewportView(Bcst1Panel);
			_bcst2PanelS.setViewportView(Bcst2Panel);
			_rcstPanelS.setViewportView(RcstPanel);
			_dlvPanelS.setViewportView(DlvPanel);
			_spplPanelS.setViewportView(SpplPanel);
			_aspplPanelS.setViewportView(AspplPanel);
			_bsppl1PanelS.setViewportView(Bsppl1Panel);
			_bsppl2PanelS.setViewportView(Bsppl2Panel);
			_pspplPanelS.setViewportView(PspplPanel);
			_cstPanelS.setViewportView(null);
			_acstPanelS.setViewportView(null);
			_bcst1PanelS.setViewportView(null);
			_bcst2PanelS.setViewportView(null);
			_rcstPanelS.setViewportView(null);
			_dlvPanelS.setViewportView(null);
			_spplPanelS.setViewportView(null);
			_aspplPanelS.setViewportView(null);
			_bsppl1PanelS.setViewportView(null);
			_bsppl2PanelS.setViewportView(null);
			_pspplPanelS.setViewportView(null);
		}
		
		super.layoutInit();
		_cstPanelS = beansFactory.createScrollPane("Btm.Cst.tab");
		_cstPanelS.setViewportView(CstPanel);
		_acstPanelS = beansFactory.createScrollPane("Btm.Acst.tab");
		_acstPanelS.setViewportView(AcstPanel);
		_bcst1PanelS = beansFactory.createScrollPane("Btm.Bcst1.tab");
		_bcst1PanelS.setViewportView(Bcst1Panel);
		_bcst2PanelS = beansFactory.createScrollPane("Btm.Bcst2.tab");
		_bcst2PanelS.setViewportView(Bcst2Panel);
		_rcstPanelS = beansFactory.createScrollPane("Btm.Rcst.tab");
		_rcstPanelS.setViewportView(RcstPanel);
		_dlvPanelS = beansFactory.createScrollPane("Btm.Dlv.tab");
		_dlvPanelS.setViewportView(DlvPanel);
		_spplPanelS = beansFactory.createScrollPane("Btm.Sppl.tab");
		_spplPanelS.setViewportView(SpplPanel);
		_aspplPanelS = beansFactory.createScrollPane("Btm.Asppl.tab");
		_aspplPanelS.setViewportView(AspplPanel);
		_bsppl1PanelS = beansFactory.createScrollPane("Btm.Bsppl1.tab");
		_bsppl1PanelS.setViewportView(Bsppl1Panel);
		_bsppl2PanelS = beansFactory.createScrollPane("Btm.Bsppl2.tab");
		_bsppl2PanelS.setViewportView(Bsppl2Panel);
		_pspplPanelS = beansFactory.createScrollPane("Btm.Psppl.tab");
		_pspplPanelS.setViewportView(PspplPanel);
		BtmTab.removeAll();
		BtmTab.add(_cstPanelS, "Btm.Cst");
		BtmTab.add(_acstPanelS, "Btm.Acst");
		BtmTab.add(_bcst1PanelS, "Btm.Bcst1");
		BtmTab.add(_bcst2PanelS, "Btm.Bcst2");
		BtmTab.add(_rcstPanelS, "Btm.Rcst");
		BtmTab.add(_dlvPanelS, "Btm.Dlv");
		BtmTab.add(_spplPanelS, "Btm.Sppl");
		BtmTab.add(_aspplPanelS, "Btm.Asppl");
		BtmTab.add(_bsppl1PanelS, "Btm.Bsppl1");
		BtmTab.add(_bsppl2PanelS, "Btm.Bsppl2");
		BtmTab.add(_pspplPanelS, "Btm.Psppl");
		BtmTab.add(SubPanel, "Btm.Sub");
		BtmTab.add(LclPanel, "Btm.Lcl");
		BtmTab.updateResource();

		CstPanel.setMinimumSize(new Dimension(0, 0));
		AcstPanel.setMinimumSize(new Dimension(0, 0));
		Bcst1Panel.setMinimumSize(new Dimension(0, 0));
		Bcst2Panel.setMinimumSize(new Dimension(0, 0));
		RcstPanel.setMinimumSize(new Dimension(0, 0));
		DlvPanel.setMinimumSize(new Dimension(0, 0));
		SpplPanel.setMinimumSize(new Dimension(0, 0));
		AspplPanel.setMinimumSize(new Dimension(0, 0));
		Bsppl1Panel.setMinimumSize(new Dimension(0, 0));
		Bsppl2Panel.setMinimumSize(new Dimension(0, 0));
		PspplPanel.setMinimumSize(new Dimension(0, 0));

		if (isRelayout() && selectedtab > -1) {
			boolean enabled = BtmTab.isEnabled();
			BtmTab.validate();
			if (!enabled) {
				BtmTab.setEnabled(true);
			}
			// 項目配置変更画面はModalのため、「更新後適用する」での適用では裏のタブを選択できない。
			// そのため、項目配置変更画面が閉じた後に選択されるように実装する。
			if (!selectBtmTab(selectedtab, enabled)) {
				if (_btmtabSelector == null) {
					_btmtabSelector = new Timer(500, (event) -> {
							if (selectBtmTab(selectedtab, enabled)) {
								((Timer)event.getSource()).stop();
								_btmtabSelector = null;
							}
						} 
					);
					_btmtabSelector.start();
				}
			}
		}
		if (isRelayout()) {
			MCSplitPane sp = getSplitPane(CstPanel);
			int n = sp.getTopComponent().getPreferredSize().height;
			Insets insets = TopTab.getDefaultContentBorderInsets();
			setDisableLayoutInit(false);
			sp.setDividerLocationWithoutRatio(n-(insets.top + insets.bottom));
			setDisableLayoutInit(true);
		}

	}
	protected boolean selectBtmTab(int i, boolean befEnabled) {
		if (BtmTab.isRequestFocusEnabled()) {
			BtmTab.setSelectedIndex(i);
			setModeAfter();
			BtmTab.setEnabled(befEnabled);
			return true;
		}
		return false;
	}

	@Override
	protected void listenerInit() {
		setListListener(SubDtlTable, createRLRowListener());
		setListListener(LclDtlTable, createRLRowListener());
	}

	@Override
	public void fillSpace() {
		if (isUpdSts() || getStatus().equals(getMODStatus())) {
			SubDtlTable.fillSpace();
			LclDtlTable.fillSpace();
		}
	}

	@Override
	public void setOpenFocus() {
		CmnPanel.focusFirstComponent();
	}
	@Override
	public void afterOpen() {
		super.afterOpen();
		setComFlgMode();
	}

	@Override
	public void setSortColumn() {
		for (MCTable<?> tbl : getDtlTables()) {
			for (MCColumnConfig c : getColumnConfigs(tbl,
					tbl.getList().createRow().getKeys().toArray(_dummyStringArray))) {
				tbl.addSortColumn(c, MCList.SortType.ASC);
			}
		}
	}
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] { SubDtlTable, LclDtlTable };
	}
	protected String[] _dummyStringArray = {};

	protected boolean checkAllTableClear() {
		return ((getCmnR().isStatusNone() && getSubDtlL().isStatusNone() && getLclDtlL().isStatusNone())
				|| confirmRegDataClear());
	}

	@Override
	protected void clearAll() {
		super.clearAll();
		getCmnR().clearAll();
		SubDtlTable.clear();
		LclDtlTable.clear();
	}
	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		if (isUpdOpe() && info != null) {
			// 参照登録時、登録ユーザIDや更新カウンタ等を削除
			if (getStatus() == REF) {
				setRowStatusForIns(getCmnR());
				clearNotInheritInfo(getCmnR());
				setRowStatusForIns(getSubDtlL());
				clearNotInheritInfo(getSubDtlL());
				// 名称マスタはクリア
				getLclDtlL().clear();
			}
			else {
				clearAll();
			}
			setUPDStatus();
			fillSpace();
			CmnPanel.focusFirstComponent();
		}
		// 参照訂正時
		else if (isModOpe() && getStatus() == REF) {
			setMODStatus();
			fillSpace();
			CmnPanel.focusFirstComponent();

			setDelBtnMode(SubDtlTable.getSelectedMCRow(), SubBtn_rdel);
			setDelBtnMode(LclDtlTable.getSelectedMCRow(), LclBtn_rdel);
		}
		// 参照訂正時
		else if (isUpdAdminOpe() && getStatus() == REF) {
			setUPD_ADMINStatus();
			fillSpace();
			CmnPanel.focusFirstComponent();

			setDelBtnMode(SubDtlTable.getSelectedMCRow(), SubBtn_rdel);
			setDelBtnMode(LclDtlTable.getSelectedMCRow(), LclBtn_rdel);
		}
		else {
			clearAll();
			setSRCHStatus();
			CndPanel.focusFirstComponent();
		}
	}

	@Override
	public void doCnd_reg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_reg_NC(info);
		setRegTargetMode();
		if(isAllComCom() && Cnd_reg_COM.isSelected()) {
			getCndR().upd_only_com_flg(true);
		} else {
			getCndR().upd_only_com_flg(false);
		}
	}
	@Override
	public void doSubDtl_NC(MCEventInfo info) {
		super.doSubDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getSubDtlL().get(info.getEventIndex());
		setDelBtnMode(row, SubBtn_rdel);
	}

	@Override
	public void doLclDtl_NC(MCEventInfo info) {
		super.doLclDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getLclDtlL().get(info.getEventIndex());
		setDelBtnMode(row, LclBtn_rdel);
	}

	private void setDelBtnMode(MCConstRow row, MCButton btn) {
		if (row == null
				|| !(isUpdSts() || getStatus().equals(getMODStatus()))) {
			btn.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			btn.setMode(MCMode.DISABLE);
		}
		else {
			btn.setMode(this, getStatus());
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setModeCustom();
		setModeAfter();
		setRegTargetMode();

		// 参照登録時、nullを設定
		getCmnR().check_ar_dpt_cd(null);
		getCmnR().check_bcst_dpt_cd(null);
		getCmnR().check_vmi_purc_dpt_cd(null);
		getCmnR().check_ap_dpt_cd(null);
		getCmnR().check_bsppl_dpt_cd(null);
		getCmnR().check_pay_dpt_cd(null);
	}
	@Override
	public void setUPD_ADMINStatus() {
		super.setUPD_ADMINStatus();
		setRegTargetMode();
		setModeCustom();
		setModeAfter();
	}
	@Override
	public void setMODStatus() {
		super.setMODStatus();
		setRegTargetMode();
		setFlgMode();
		setModeCustom(); // setFlgMode()で有償支給先に設定したステータスを参照しているため、呼び出し順の変更は不可
		setModeAfter();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setModeAfter();
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setModeAfter();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setModeAfter();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setModeAfter();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setModeAfter();
	}
	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (!isDestEnabled(this)) {
			setComponentInvisibleAllStatus(Cmn_dest_flg);
		}
		if (!isCredEnabled(this)) {
			setComponentInvisibleAllStatus(Btn_open_MABCP0590);
		}
		if(isAllComCom()) {
			setComponentInvisibleAllStatus(Cmn_del_usr_id, Cmn_del_usr_nm, Cmn_del_ts);
		}
		else {
			// 「共通・会社別」用の項目を非表示にする。
			setComponentInvisibleAllStatus(RegTargetPanel);
			setComponentInvisibleAllStatus(Cmn4Panel);
		}
	}

	/**
	 * 共通１タブにあるＦＬＧのモード制御<p>
	 * 管理者以外はオンからオフに変更不可（操作種別：訂正のとき入力不可）
	 */
	protected void setFlgMode() {
		if (getCmnR().cst_flg()) {
			Cmn_cst_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().acst_flg()) {
			Cmn_acst_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().bcst_flg()) {
			Cmn_bcst_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().rcst_flg()) {
			Cmn_rcst_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().dlv_flg()) {
			Cmn_dlv_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().dest_flg()) {
			Cmn_dest_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().cred_flg()) {
			Cmn_cred_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().asppl_flg()) {
			Cmn_asppl_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().bsppl_flg()) {
			Cmn_bsppl_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().psppl_flg()) {
			Cmn_psppl_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().maker_flg()) {
			Cmn_maker_flg.setMode(MCMode.READ_ONLY);
		}
		if (getCmnR().onr_prsppl_flg()) {
			Cmn_onr_prsppl_flg.setMode(MCMode.READ_ONLY);
		}
		// 発注先はsetModeCustom()で行う
	}

	/**
	 * 登録対象項目のモード制御
	 */
	protected void setRegTargetMode() {
		if (_MST_SET_TYP == null) {
			return ;
		}
		if(!isAllComCom()) {
			setValueEx(Cnd_reg_Group, Cnd_reg_COM.getActionCommand());
			Cnd_reg_Group.setMode(MCMode.READ_ONLY);
			return;
		}
		setDefaultMode(CmnPanel, Cmn2Panel, Cmn3Panel, Cmn4Panel, DtlTypPanel, LclPanel);
		
		if((isUpdSts() || getStatus().equals(getMODStatus())) && Cnd_reg_COM.isSelected()) {
			Cmn_bp_cd.setMode(MCMode.READ_ONLY);
			Cmn_bp_nm.setMode(MCMode.READ_ONLY);
			Cmn_del_flg.setMode(MCMode.READ_ONLY);
			Cmn_bp_alt_nm1.setMode(MCMode.READ_ONLY);
			Cmn_bp_alt_nm2.setMode(MCMode.READ_ONLY);
			Cmn_bp_alt_nm3.setMode(MCMode.READ_ONLY);
			Cmn_bp_alt_nm4.setMode(MCMode.READ_ONLY);
			Cmn_cur_cd.setMode(MCMode.READ_ONLY);
			Cmn_cntry_cd.setMode(MCMode.READ_ONLY);
			Cmn_area_cd.setMode(MCMode.READ_ONLY);
			Cmn_biz_co_no.setMode(MCMode.READ_ONLY);
			Cmn_ein.setMode(MCMode.READ_ONLY);
			Cmn_std_co_cd.setMode(MCMode.READ_ONLY);
			Cmn_zip_cd.setMode(MCMode.READ_ONLY);
			Cmn_addr1.setMode(MCMode.READ_ONLY);
			Cmn_addr2.setMode(MCMode.READ_ONLY);
			Cmn_addr3.setMode(MCMode.READ_ONLY);
			Cmn_addr4.setMode(MCMode.READ_ONLY);
			Cmn_tel.setMode(MCMode.READ_ONLY);
			Cmn_fax.setMode(MCMode.READ_ONLY);
			Cmn_prnt_lcl_cd.setMode(MCMode.READ_ONLY);
			Cmn_bp_alc_grp.setMode(MCMode.READ_ONLY);
			Cmn_memo1.setMode(MCMode.READ_ONLY);
			Cmn_memo2.setMode(MCMode.READ_ONLY);
			Cmn_memo3.setMode(MCMode.READ_ONLY);
			Cmn_memo4.setMode(MCMode.READ_ONLY);
			Cmn_memo5.setMode(MCMode.READ_ONLY);
			Cmn_memo6.setMode(MCMode.READ_ONLY);
			Cmn_memo7.setMode(MCMode.READ_ONLY);
			Cmn_memo8.setMode(MCMode.READ_ONLY);
			Cmn_memo9.setMode(MCMode.READ_ONLY);
			Cmn_memo10.setMode(MCMode.READ_ONLY);
			Cmn_memo11.setMode(MCMode.READ_ONLY);
			Cmn_memo12.setMode(MCMode.READ_ONLY);
			Cmn_memo13.setMode(MCMode.READ_ONLY);
			Cmn_memo14.setMode(MCMode.READ_ONLY);
			Cmn_memo15.setMode(MCMode.READ_ONLY);
			Cmn_memo16.setMode(MCMode.READ_ONLY);
			Cmn_memo17.setMode(MCMode.READ_ONLY);
			Cmn_memo18.setMode(MCMode.READ_ONLY);
			Cmn_memo19.setMode(MCMode.READ_ONLY);
			Cmn_memo20.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd1.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm1.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd2.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm2.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd3.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm3.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd4.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm4.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd5.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm5.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd6.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm6.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd7.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm7.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd8.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm8.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd9.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm9.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_cd10.setMode(MCMode.READ_ONLY);
			Cmn_bp_grp_nm10.setMode(MCMode.READ_ONLY);
			columnLclDtl_check.setMode(MCMode.READ_ONLY);
			columnLclDtl_lcl_cd.setMode(MCMode.READ_ONLY);
			columnLclDtl_bp_nm.setMode(MCMode.READ_ONLY);
			columnLclDtl_bp_alt_nm1.setMode(MCMode.READ_ONLY);
			columnLclDtl_bp_alt_nm2.setMode(MCMode.READ_ONLY);
			columnLclDtl_bp_alt_nm3.setMode(MCMode.READ_ONLY);
			columnLclDtl_bp_alt_nm4.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo1.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo2.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo3.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo4.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo5.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo6.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo7.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo8.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo9.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo10.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo11.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo12.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo13.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo14.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo15.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo16.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo17.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo18.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo19.setMode(MCMode.READ_ONLY);
			columnLclDtl_memo20.setMode(MCMode.READ_ONLY);

			LclBtn_select_all.setMode(MCMode.READ_ONLY);
			LclBtn_deselect_all.setMode(MCMode.READ_ONLY);
			LclBtn_radd.setMode(MCMode.READ_ONLY);
			LclBtn_rdel.setMode(MCMode.READ_ONLY);
			LclBtn_rcopy.setMode(MCMode.READ_ONLY);
		}
		setComFlgMode();
	}

	/**
	 * 個別のモード制御<p>
	 */
	protected void setModeCustom() {
		setTabColMode(true);
		// 債権部門ＣＤ
		if (MAC_AR_DPT_TYP.isAR(getCmnR().ar_dpt_typ())) {
			setDefaultMode(Cmn_ar_dpt_cd);
		}
		else {
			Cmn_ar_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		// 請求起算区分
		if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(getCmnR().sls_basis_typ())) {
			setDefaultMode(Cmn_bill_basis_typ);
		}
		else {
			Cmn_bill_basis_typ.setMode(MCMode.READ_ONLY);
		}
		// 現品票ＣＤ
		if (getCmnR().stk_lst_issue_flg()) {
			setDefaultMode(Cmn_stk_lst_form_cd);
		}
		else {
			Cmn_stk_lst_form_cd.setMode(MCMode.READ_ONLY);
		}
		// 請求先担当部門ＣＤ
		if (MAC_BILL_DPT_TYP.isBILL(getCmnR().bill_dpt_typ())) {
			setDefaultMode(Cmn_bcst_dpt_cd);
		}
		else {
			Cmn_bcst_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		// 請求締日
		if (MAC_BILL_CL_TYP.isBATCH(getCmnR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getCmnR().bill_cl_typ())) {
			setDefaultMode(Cmn_bill_cl_day1);
		}
		else {
			Cmn_bill_cl_day1.setMode(MCMode.READ_ONLY);
		}
		// 請求締日２
		if (MAC_BILL_CL_TYP.isBATCH(getCmnR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getCmnR().bill_cl_typ())) {
			if (isNull(getCmnR().bill_cl_day1())) {
				Cmn_bill_cl_day2.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_bill_cl_day2);
			}
		}
		else {
			Cmn_bill_cl_day2.setMode(MCMode.READ_ONLY);
		}
		// 請求締日３
		if (MAC_BILL_CL_TYP.isBATCH(getCmnR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getCmnR().bill_cl_typ())) {
			if (isNull(getCmnR().bill_cl_day2())) {
				Cmn_bill_cl_day3.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_bill_cl_day3);
			}
		}
		else {
			Cmn_bill_cl_day3.setMode(MCMode.READ_ONLY);
		}
		// 請求締日４
		if (MAC_BILL_CL_TYP.isBATCH(getCmnR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getCmnR().bill_cl_typ())) {
			if (isNull(getCmnR().bill_cl_day3())) {
				Cmn_bill_cl_day4.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_bill_cl_day4);
			}
		}
		else {
			Cmn_bill_cl_day4.setMode(MCMode.READ_ONLY);
		}
		// 請求締日５
		if (MAC_BILL_CL_TYP.isBATCH(getCmnR().bill_cl_typ())
		 || MAC_BILL_CL_TYP.isMANUAL(getCmnR().bill_cl_typ())) {
			if (isNull(getCmnR().bill_cl_day4())) {
				Cmn_bill_cl_day5.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_bill_cl_day5);
			}
		}
		else {
			Cmn_bill_cl_day5.setMode(MCMode.READ_ONLY);
		}
		// 支払締日１
		if (getCmnR().pay_spot_flg()) {
			Cmn_psppl_cl_day1.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_psppl_cl_day1);
		}
		// 支払締日２～５
		if (isNull(getCmnR().psppl_cl_day1())) {
			Cmn_psppl_cl_day2.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_psppl_cl_day2);
		}
		if (isNull(getCmnR().psppl_cl_day2())) {
			Cmn_psppl_cl_day3.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_psppl_cl_day3);
		}
		if (isNull(getCmnR().psppl_cl_day3())) {
			Cmn_psppl_cl_day4.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_psppl_cl_day4);
		}
		if (isNull(getCmnR().psppl_cl_day4())) {
			Cmn_psppl_cl_day5.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_psppl_cl_day5);
		}
		// 請求税額端数処理区分
		if (!getCmnR().tax_on_bill_flg()) {
			Cmn_bill_tax_rnd_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_bill_tax_rnd_typ);
		}
		// 請求締遅延日数
		if (MAC_BILL_CL_TYP.isBATCH(getCmnR().bill_cl_typ())) {
			setDefaultMode(Cmn_bill_cl_delay_days);
		}
		else {
			Cmn_bill_cl_delay_days.setMode(MCMode.READ_ONLY);
		}
		// 請求締前後区分
		if (!MCNumber.ZERO.eq(getCmnR().bill_cl_delay_days())) {
			Cmn_bill_cl_ba_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_bill_cl_ba_typ);
		}
		// 入金予定前後区分
		if (isNull(getCmnR().bill_cal_cd())) {
			Cmn_rcv_ba_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_rcv_ba_typ);
		}
		// 手数料計算ＦＬＧ
		if (getCmnR().rcv_amt_match_flg()) {
			setDefaultMode(Cmn_calc_com_paid_flg);
		}
		else {
			Cmn_calc_com_paid_flg.setMode(MCMode.READ_ONLY);
		}
		// 案件別債務管理ＦＬＧ
		if (getCmnR().wrk_po_flg()) {
			setDefaultMode(Cmn_wrk_ap_flg);
		}
		else {
			Cmn_wrk_ap_flg.setMode(MCMode.READ_ONLY);
		}
		// 買戻義務、外注単価区分、支給計上区分、支給単価変更許可ＦＬＧ、支給金額端数処理区分、支給税額端数処理区分、支給税計算区分
		if (getCmnR().onr_prsppl_flg()) {
			if (getStatus() == MOD && (getCmnR().org_onr_prsppl_flg())) {
				Cmn_onr_prsppl_flg.setMode(MCMode.READ_ONLY);
			}
			if (getStatus() == MOD && (Cmn_onr_prsppl_flg.getMode() == MCMode.READ_ONLY)) {
				Cmn_outsrc_upri_typ.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_outsrc_upri_typ);
			}
			if (getCmnR().subcon_flg() && MAC_PROV_RCV_TYP.isNOT_ARR(getCmnR().prov_rcv_typ()) && MAC_PROV_BASIS_TYP.isINPT(getCmnR().prov_basis_typ())) {
				Cmn_prov_basis_typ.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_prov_basis_typ);
			}
			if (getStatus() == MOD) {
				Cmn_repurc_obli_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_repurc_obli_flg);
			}
			if (getCmnR().repurc_obli_flg()) {
				Cmn_prov_tax_cd.setMode(MCMode.REQUIRED);
				Cmn_prov_tax_cd_prio_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_prov_tax_cd);
				setDefaultMode(Cmn_prov_tax_cd_prio_flg);
			}
			setDefaultMode(Cmn_prov_upri_cng_flg);
			setDefaultMode(Cmn_prov_amt_rnd_typ);
			setDefaultMode(Cmn_prov_tax_rnd_typ);
			setDefaultMode(Cmn_prov_tax_calc_typ);
		}
		else {
			Cmn_repurc_obli_flg.setMode(MCMode.READ_ONLY);
			Cmn_outsrc_upri_typ.setMode(MCMode.READ_ONLY);
			Cmn_prov_basis_typ.setMode(MCMode.READ_ONLY);
			Cmn_prov_upri_cng_flg.setMode(MCMode.READ_ONLY);
			Cmn_prov_amt_rnd_typ.setMode(MCMode.READ_ONLY);
			Cmn_prov_tax_rnd_typ.setMode(MCMode.READ_ONLY);
			Cmn_prov_tax_calc_typ.setMode(MCMode.READ_ONLY);
			Cmn_prov_tax_cd.setMode(MCMode.READ_ONLY);
			Cmn_prov_tax_cd_prio_flg.setMode(MCMode.READ_ONLY);
		}
		// 発注時納品書、納入指示時納品書、納期回答受領時納品書
		if (isNull(getCmnR().sppl_ship_form_cd())) {
			Cmn_po_dlv_slip_flg.setMode(MCMode.READ_ONLY);
			Cmn_dlv_inst_dlv_slip_flg.setMode(MCMode.READ_ONLY);
			Cmn_prms_rcpt_dlv_slip_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_po_dlv_slip_flg);
			setDefaultMode(Cmn_dlv_inst_dlv_slip_flg);
			setDefaultMode(Cmn_prms_rcpt_dlv_slip_flg);
		}
		// 発注先ＦＬＧ
		if (getCmnR().tdlv_flg() || (getStatus() == MOD && getCmnR().org_sppl_flg())) {
			Cmn_sppl_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_sppl_flg);
		}
		// 配送先ＦＬＧ
		if (getCmnR().sppl_flg() || (getStatus() == MOD && getCmnR().org_tdlv_flg())) {
			Cmn_tdlv_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_tdlv_flg);
		}
		// 配送先経由区分
		if (getCmnR().tdlv_flg()) {
			setDefaultMode(Cmn_via_dlv_typ);
		}
		else {
			Cmn_via_dlv_typ.setMode(MCMode.READ_ONLY);
		}
		// 配送先必須ＦＬＧ
		if (getCmnR().tdlv_flg()) {
			Cmn_tdlv_req_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_tdlv_req_flg);
		}
		// 請求先ＣＤ
		if (getCo().ar_no_use_flg()) {
			Cmn_bcst_cd.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Cmn_bcst_cd);
		}
		// 下請対象ＦＬＧ
		if (isSame(getCmnR().cntry_cd(), getCo().cntry_cd())) {
			setDefaultMode(Cmn_subcon_flg);
		}
		else {
			Cmn_subcon_flg.setMode(MCMode.READ_ONLY);
		}
		// 支払予定管理先ＣＤ
		if (getCo().ap_no_use_flg()) {
			Cmn_bsppl_cd.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Cmn_bsppl_cd);
			setDefaultMode(Cmn_ap_dpt_cd);
		}
		// 請求書発行関連項目
		if (MAC_BILL_PRNT_TYP.isNOT_PRNT(getCmnR().bill_prnt_typ())) {
			Cmn_sls_dtl_outp_typ.setMode(MCMode.READ_ONLY);
			Cmn_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
			Cmn_bill_zip_cd.setMode(MCMode.READ_ONLY);
			Cmn_bill_addr1.setMode(MCMode.READ_ONLY);
			Cmn_bill_addr2.setMode(MCMode.READ_ONLY);
			Cmn_bill_addr3.setMode(MCMode.READ_ONLY);
			Cmn_bill_addr4.setMode(MCMode.READ_ONLY);
			Cmn_bill_tel.setMode(MCMode.READ_ONLY);
			Cmn_bill_bcst_nm.setMode(MCMode.READ_ONLY);
			Cmn_bill_bcst_dpt.setMode(MCMode.READ_ONLY);
			Cmn_bill_bcst_psn.setMode(MCMode.READ_ONLY);
			Cmn_bill_bcst_psn_title.setMode(MCMode.READ_ONLY);
			Cmn_bill_dtl_outp_flg.setMode(MCMode.READ_ONLY);
			Cmn_bill_dtl_adv_flg.setMode(MCMode.READ_ONLY);
			Cmn_bill_dtl_rcv_flg.setMode(MCMode.READ_ONLY);
			Cmn_bill_dtl_subttl_typ.setMode(MCMode.READ_ONLY);
			Cmn_bill_dtl_brk_typ.setMode(MCMode.READ_ONLY);
			Cmn_bill_dtl_sort_typ.setMode(MCMode.READ_ONLY);
			Cmn_bill_can_slip_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			if (MAC_BILL_CL_TYP.isBATCH(getCmnR().bill_cl_typ())
					|| MAC_BILL_CL_TYP.isMANUAL(getCmnR().bill_cl_typ())
					|| MAC_BILL_CL_TYP.isSEL(getCmnR().bill_cl_typ())) {
				setDefaultMode(Cmn_sls_dtl_outp_typ);
				setDefaultMode(Cmn_bfw_bal_disp_flg);
				setDefaultMode(Cmn_bill_dtl_adv_flg);
			}
			else {
				Cmn_sls_dtl_outp_typ.setMode(MCMode.READ_ONLY);
				Cmn_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
				Cmn_bill_dtl_adv_flg.setMode(MCMode.READ_ONLY);
			}
			setDefaultMode(Cmn_bill_zip_cd);
			setDefaultMode(Cmn_bill_addr1);
			setDefaultMode(Cmn_bill_addr2);
			setDefaultMode(Cmn_bill_addr3);
			setDefaultMode(Cmn_bill_addr4);
			setDefaultMode(Cmn_bill_tel);
			setDefaultMode(Cmn_bill_bcst_nm);
			setDefaultMode(Cmn_bill_bcst_dpt);
			setDefaultMode(Cmn_bill_bcst_psn);
			setDefaultMode(Cmn_bill_bcst_psn_title);
			setDefaultMode(Cmn_bill_dtl_outp_flg);
			setDefaultMode(Cmn_bill_dtl_rcv_flg);
			setDefaultMode(Cmn_bill_dtl_subttl_typ);
			setDefaultMode(Cmn_bill_dtl_brk_typ);
			setDefaultMode(Cmn_bill_dtl_sort_typ);
			setDefaultMode(Cmn_bill_can_slip_typ);
		}
		// 売掛先ＣＤ、債権部門区分、販売単価端数処理区分、売上税計算区分、ロット逆転禁止区分、請求繰越回数、ロット明細分割区分
		if (getCmnR().cst_sundry_flg()) {
			Cmn_acst_cd.setMode(MCMode.ENABLE);
			Cmn_ar_dpt_typ.setMode(MCMode.ENABLE);
			Cmn_sls_upri_rnd_typ.setMode(MCMode.ENABLE);
			Cmn_sls_tax_calc_typ.setMode(MCMode.ENABLE);
			Cmn_lot_back_stop_typ.setMode(MCMode.ENABLE);
			Cmn_bill_crryovr_times.setMode(MCMode.ENABLE);
			Cmn_slip_each_lot_typ.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Cmn_acst_cd);
			setDefaultMode(Cmn_ar_dpt_typ);
			setDefaultMode(Cmn_sls_upri_rnd_typ);
			setDefaultMode(Cmn_sls_tax_calc_typ);
			setDefaultMode(Cmn_lot_back_stop_typ);
			setDefaultMode(Cmn_bill_crryovr_times);
			setDefaultMode(Cmn_slip_each_lot_typ);
		}
		// 得意先インボイス取引ＦＬＧ
		if (getStatus() == MOD && (!getCmnR().cst_flg() || getCmnR().org_cst_flg())) {
			Cmn_cst_iv_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_cst_iv_flg);
		}
		// 発注先インボイス取引ＦＬＧ、支給積送管理区分
		if (getStatus() == MOD && (!getCmnR().sppl_flg() || getCmnR().org_sppl_flg())) {
			Cmn_sppl_iv_flg.setMode(MCMode.READ_ONLY);
			Cmn_prov_rcv_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_sppl_iv_flg);
			setDefaultMode(Cmn_prov_rcv_typ);
		}
		// 受領インボイス重複許可ＦＬＧ
		if (!getCmnR().sppl_flg() || !getCmnR().sppl_iv_flg()) {
			Cmn_rcpt_iv_dup_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_rcpt_iv_dup_flg);
		}
		// 仕入計上区分
		if(!getCmnR().sppl_flg() || getCmnR().subcon_flg()) {
			Cmn_purc_basis_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_purc_basis_typ);
		}
		// バッチ支払予定締ＦＬＧ
		if (getCmnR().pay_spot_flg()) {
			Cmn_batch_pay_schd_cl_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_tax_on_pay_flg);
			setDefaultMode(Cmn_batch_pay_schd_cl_flg);
		}
		// 支払税額端数処理区分
		if (!getCmnR().tax_on_pay_flg()) {
			Cmn_pay_tax_rnd_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_pay_tax_rnd_typ);
		}
		// 支払予定締遅延日数
		if (!getCmnR().batch_pay_schd_cl_flg()) {
			Cmn_pay_schd_cl_delay_days.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_pay_schd_cl_delay_days);
		}
		// 支払予定締前後区分
		if (!MCNumber.ZERO.eq(getCmnR().pay_schd_cl_delay_days())) {
			Cmn_pay_schd_cl_ba_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_pay_schd_cl_ba_typ);
		}
		// 支払通知書発行関連項目
		if (getCmnR().pay_ntc_prnt_flg()) {
			if (getCmnR().pay_spot_flg()) {
				Cmn_pay_ntc_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
				Cmn_pay_ntc_adv_pay_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_pay_ntc_bfw_bal_disp_flg);
				setDefaultMode(Cmn_pay_ntc_adv_pay_flg);
			}
			setDefaultMode(Cmn_pay_ntc_zip_cd);
			setDefaultMode(Cmn_pay_ntc_addr1);
			setDefaultMode(Cmn_pay_ntc_addr2);
			setDefaultMode(Cmn_pay_ntc_addr3);
			setDefaultMode(Cmn_pay_ntc_addr4);
			setDefaultMode(Cmn_pay_ntc_tel);
			setDefaultMode(Cmn_pay_ntc_bsppl_nm);
			setDefaultMode(Cmn_pay_ntc_bsppl_dpt);
			setDefaultMode(Cmn_pay_ntc_bsppl_psn);
			setDefaultMode(Cmn_pay_ntc_bsppl_psn_title);
			setDefaultMode(Cmn_pay_ntc_dtl_outp_flg);
			setDefaultMode(Cmn_pay_ntc_dtl_pay_flg);
			setDefaultMode(Cmn_pay_ntc_dtl_subttl_typ);
			setDefaultMode(Cmn_pay_ntc_dtl_brk_typ);
			setDefaultMode(Cmn_pay_ntc_dtl_sort_typ);
			setDefaultMode(Cmn_pay_ntc_can_slip_typ);
		}
		else {
			Cmn_pay_ntc_zip_cd.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_addr1.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_addr2.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_addr3.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_addr4.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_tel.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_bsppl_nm.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_bsppl_dpt.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_bsppl_psn.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_bsppl_psn_title.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_dtl_outp_flg.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_bfw_bal_disp_flg.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_adv_pay_flg.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_dtl_pay_flg.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_dtl_subttl_typ.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_dtl_brk_typ.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_dtl_sort_typ.setMode(MCMode.READ_ONLY);
			Cmn_pay_ntc_can_slip_typ.setMode(MCMode.READ_ONLY);
		}
		setTabColMode(false);
	}
	protected void setModeAfter() {
		setComFlgMode();
		setTabMode();
		setOpenBtnMode();
	}
	
	protected void setProvBasisTyp() {
		if (getCmnR().onr_prsppl_flg() && getCmnR().subcon_flg()) {
			if (MAC_PROV_RCV_TYP.isNOT_ARR(getCmnR().prov_rcv_typ())) {
				setValueEx(Cmn_prov_basis_typ, MAC_PROV_BASIS_TYP.INPT.value());
			}
			else {
				setValueEx(Cmn_prov_basis_typ, null);
			}
		}
		else {
			setValueEx(Cmn_prov_basis_typ, null);
		}	
	}

	protected void setComFlgMode() {
		if (isAllCom()) {
			if (getStatus() == MOD && getCmnR().org_all_com_flg()) {
				Cmn_all_com_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Cmn_all_com_flg);
			}
			if (getCmnR().all_com_flg()) {
				Cmn_com_use_flg.setMode(MCMode.READ_ONLY);
				setDefaultMode(Cmn_com_ex_flg);
			}
			else {
				setDefaultMode(Cmn_com_use_flg);
				Cmn_com_ex_flg.setMode(MCMode.READ_ONLY);
			}
		}
		else {
			Cmn_all_com_flg.setMode(MCMode.INVISIBLE);
			Cmn_com_use_flg.setMode(MCMode.INVISIBLE);
			Cmn_com_ex_flg.setMode(MCMode.INVISIBLE);
		}
	}

	protected void setTabMode() {
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_cstPanelS), getCmnR().cst_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_acstPanelS), getCmnR().acst_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_bcst1PanelS), getCmnR().bcst_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_bcst2PanelS), getCmnR().bcst_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_rcstPanelS), getCmnR().rcst_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_dlvPanelS), getCmnR().dlv_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_spplPanelS), getCmnR().sppl_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_aspplPanelS), getCmnR().asppl_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_bsppl1PanelS), getCmnR().bsppl_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_bsppl2PanelS), getCmnR().bsppl_flg());
		BtmTab.setEnabledAt(BtmTab.indexOfComponent(_pspplPanelS), getCmnR().psppl_flg());

		// 表示中のタブが非表示になったら別のタブに切り替える
		if (!BtmTab.isEnabledAt(BtmTab.getSelectedIndex())) {
			for (int i=0; i < BtmTab.getTabCount(); i++) {
				if (BtmTab.isEnabledAt(i)) {
					BtmTab.setSelectedIndex(i);
					break;
				}
			}
		}
	}
	protected void setTabColMode(boolean flg) {
		for (MCCheckBox cb : new MCCheckBox[] {
				Cmn_cst_flg, Cmn_acst_flg, Cmn_bcst_flg, Cmn_rcst_flg, Cmn_dlv_flg,
				Cmn_sppl_flg, Cmn_asppl_flg, Cmn_bsppl_flg, Cmn_psppl_flg
		}) {
			List<MCBeans> l = getClearCol(cb);
			if (flg) {
				l.forEach(r -> setDefaultMode((MCModeBeans) r));
			}
			else if (!cb.getValue()) {
				l.forEach(r -> ((MCModeBeans) r).setMode(MCMode.READ_ONLY));
			}
		}
	}
	protected void setOpenBtnMode() {
		if (!getCmnR().cst_flg() || getCmnR().del_flg()) {
			Btn_open_MABCP0540.setMode(MCMode.DISABLE);
		}
		if (!getCmnR().bcst_flg() && !getCmnR().rcst_flg() || getCmnR().del_flg()) {
			Btn_open_MABCP0560.setMode(MCMode.DISABLE);
		}
		if (!getCmnR().sppl_flg() || getCmnR().del_flg()) {
			Btn_open_MABCP0570.setMode(MCMode.DISABLE);
		}
		if (!getCmnR().bsppl_flg() && !getCmnR().psppl_flg() || getCmnR().del_flg()) {
			Btn_open_MABCP0580.setMode(MCMode.DISABLE);
		}
		if (!getCmnR().cred_flg()) {
			Btn_open_MABCP0590.setMode(MCMode.DISABLE);
		}
	}

	protected MCPanel[] getTabArray() {
		return new MCPanel[] { CstPanel, AcstPanel, Bcst1Panel, Bcst2Panel, RcstPanel, DlvPanel, SpplPanel, AspplPanel,
				Bsppl1Panel, Bsppl2Panel, PspplPanel, SubPanel, LclPanel };
	}

	@Override
	public void doCmn_all_com_flg_NC(MCEventInfo info) {
		super.doCmn_all_com_flg_NC(info);
		if (getCmnR().all_com_flg()) {
			setValueEx(Cmn_com_use_flg, false);
		}
		else {
			setValueEx(Cmn_com_ex_flg, false);
		}
		setComFlgMode();
	}

	@Override
	public boolean doCmn_cst_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_cst_flg)) {
			if (confirm(MABCP0006) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_cst_flg_VC(info);
	}
	@Override
	public void doCmn_cst_flg_NC(MCEventInfo info) {
		super.doCmn_cst_flg_NC(info);
		if (!getCmnR().cst_flg()) {
			// 得意先タブクリア
			doClear(Cmn_cst_flg);
			// 取引先補助の得意先関連項目クリア
			for (SubDtlR r : exceptBaseEmpty(SubDtlTable)) {
				int idx = r.getGUIIndex();
				setValueEx(columnSubDtl_ar_dpt_cd, idx, null);
				setValueEx(columnSubDtl_cst_cntct_dpt, idx, null);
				setValueEx(columnSubDtl_cst_cntct_psn, idx, null);
				setValueEx(columnSubDtl_cst_cntct_psn_title, idx, null);
				setValueEx(columnSubDtl_sls_tax_cd, idx, null);
				setValueEx(columnSubDtl_sls_anly_cd1, idx, null);
				setValueEx(columnSubDtl_sls_anly_cd2, idx, null);
				setValueEx(columnSubDtl_sls_anly_cd3, idx, null);
			}
		}
		else {
			if (getCmnR().acst_flg() && isNull(getCmnR().acst_cd())){
				getCmnR().acst_cd(getCmnR().bp_cd());
				getCmnR().acst_nm(getCmnR().bp_nm());
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public boolean doCmn_acst_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_acst_flg)) {
			if (confirm(MABCP0007) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_acst_flg_VC(info);
	}
	@Override
	public void doCmn_acst_flg_NC(MCEventInfo info) {
		super.doCmn_acst_flg_NC(info);
		if (!getCmnR().acst_flg()) {
			// 売掛先タブクリア
			doClear(Cmn_acst_flg);
		}
		else {
			if (getCmnR().cst_flg() && isNull(getCmnR().acst_cd())){
				getCmnR().acst_cd(getCmnR().bp_cd());
				getCmnR().acst_nm(getCmnR().bp_nm());
			}
			if (!getCo().ar_no_use_flg()) {
				if (getCmnR().bcst_flg() && isNull(getCmnR().bcst_cd())){
					getCmnR().bcst_cd(getCmnR().bp_cd());
					getCmnR().bcst_nm(getCmnR().bp_nm());
				}
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public boolean doCmn_bcst_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_bcst_flg)) {
			if (confirm(MABCP0008) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_bcst_flg_VC(info);
	}
	@Override
	public void doCmn_bcst_flg_NC(MCEventInfo info) {
		super.doCmn_bcst_flg_NC(info);
		if (!getCmnR().bcst_flg()) {
			// 請求先タブクリア
			doClear(Cmn_bcst_flg);
			// 取引先補助の請求先関連項目クリア
			for (SubDtlR r : exceptBaseEmpty(SubDtlTable)) {
				int idx = r.getGUIIndex();
				setValueEx(columnSubDtl_bcst_dpt_cd, idx, null);
				setValueEx(columnSubDtl_bill_zip_cd, idx, null);
				setValueEx(columnSubDtl_bill_addr1, idx, null);
				setValueEx(columnSubDtl_bill_addr2, idx, null);
				setValueEx(columnSubDtl_bill_addr3, idx, null);
				setValueEx(columnSubDtl_bill_addr4, idx, null);
				setValueEx(columnSubDtl_bill_tel, idx, null);
				setValueEx(columnSubDtl_bill_bcst_nm, idx, null);
				setValueEx(columnSubDtl_bill_bcst_dpt, idx, null);
				setValueEx(columnSubDtl_bill_bcst_psn, idx, null);
				setValueEx(columnSubDtl_bill_bcst_psn_title, idx, null);
			}
		}
		else {
			if (!getCo().ar_no_use_flg()) {
				if (getCmnR().acst_flg() && isNull(getCmnR().bcst_cd())){
					getCmnR().bcst_cd(getCmnR().bp_cd());
					getCmnR().bcst_nm(getCmnR().bp_nm());
				}
			}
			if (getCmnR().rcst_flg() && isNull(getCmnR().rcst_cd())){
				getCmnR().rcst_cd(getCmnR().bp_cd());
				getCmnR().rcst_nm(getCmnR().bp_nm());
			}
			if (getCmnR().cred_flg() && isNull(getCmnR().ar_cred_cd())){
				getCmnR().ar_cred_cd(getCmnR().bp_cd());
				getCmnR().ar_cred_nm(getCmnR().bp_nm());
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public boolean doCmn_rcst_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_rcst_flg)) {
			if (confirm(MABCP0009) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_rcst_flg_VC(info);
	}
	@Override
	public void doCmn_rcst_flg_NC(MCEventInfo info) {
		super.doCmn_rcst_flg_NC(info);
		if (!getCmnR().rcst_flg()) {
			// 入金先タブクリア
			doClear(Cmn_rcst_flg);
		}
		else {
			if (getCmnR().bcst_flg() && isNull(getCmnR().rcst_cd())){
				getCmnR().rcst_cd(getCmnR().bp_cd());
				getCmnR().rcst_nm(getCmnR().bp_nm());
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public boolean doCmn_dlv_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_dlv_flg)) {
			if (confirm(MABCP0010) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_dlv_flg_VC(info);
	}
	@Override
	public void doCmn_dlv_flg_NC(MCEventInfo info) {
		super.doCmn_dlv_flg_NC(info);
		if (!getCmnR().dlv_flg()) {
			// 納品先タブクリア
			doClear(Cmn_dlv_flg);
			// 取引先補助の納品先関連項目クリア
			for (SubDtlR r : exceptBaseEmpty(SubDtlTable)) {
				int idx = r.getGUIIndex();
				setValueEx(columnSubDtl_dlv_cntct_dpt, idx, null);
				setValueEx(columnSubDtl_dlv_cntct_psn, idx, null);
				setValueEx(columnSubDtl_dlv_cntct_psn_title, idx, null);
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public void doCmn_dest_flg_NC(MCEventInfo info) {
		super.doCmn_dest_flg_NC(info);
		setTabMode();
		setModeCustom();
	}

	@Override
	public void doCmn_cred_flg_NC(MCEventInfo info) {
		super.doCmn_cred_flg_NC(info);
		if (getCmnR().cred_flg()) {
			if (getCmnR().bcst_flg() && isNull(getCmnR().ar_cred_cd())){
				getCmnR().ar_cred_cd(getCmnR().bp_cd());
				getCmnR().ar_cred_nm(getCmnR().bp_nm());
			}
			if (getCmnR().bsppl_flg() && isNull(getCmnR().ap_cred_cd())){
				getCmnR().ap_cred_cd(getCmnR().bp_cd());
				getCmnR().ap_cred_nm(getCmnR().bp_nm());
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public boolean doCmn_sppl_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_sppl_flg)) {
			if (confirm(MABCP0011) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_sppl_flg_VC(info);
	}
	@Override
	public void doCmn_sppl_flg_NC(MCEventInfo info) {
		super.doCmn_sppl_flg_NC(info);
		if (!getCmnR().sppl_flg()) {
			// 発注先タブクリア
			doClear(Cmn_sppl_flg);
			// 取引先補助の発注先関連項目クリア
			for (SubDtlR r : exceptBaseEmpty(SubDtlTable)) {
				int idx = r.getGUIIndex();
				setValueEx(columnSubDtl_sppl_cntct_dpt, idx, null);
				setValueEx(columnSubDtl_sppl_cntct_psn, idx, null);
				setValueEx(columnSubDtl_sppl_cntct_psn_title, idx, null);
				setValueEx(columnSubDtl_purc_tax_cd, idx, null);
				setValueEx(columnSubDtl_prov_tax_cd, idx, null);
				setValueEx(columnSubDtl_vmi_purc_dpt_cd, idx, null);
			}
		}
		else {
			setValueEx(Cmn_tdlv_flg, false);
			if (getCmnR().asppl_flg() && isNull(getCmnR().asppl_cd())){
				getCmnR().asppl_cd(getCmnR().bp_cd());
				getCmnR().asppl_nm(getCmnR().bp_nm());
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public boolean doCmn_asppl_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_asppl_flg)) {
			if (confirm(MABCP0012) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_asppl_flg_VC(info);
	}
	@Override
	public void doCmn_asppl_flg_NC(MCEventInfo info) {
		super.doCmn_asppl_flg_NC(info);
		if (!getCmnR().asppl_flg()) {
			// 買掛先タブクリア
			doClear(Cmn_asppl_flg);
			// 取引先補助の買掛先関連項目クリア
			for (SubDtlR r : exceptBaseEmpty(SubDtlTable)) {
				setValueEx(columnSubDtl_ap_dpt_cd, r.getGUIIndex(), null);
			}
		}
		else {
			if (getCmnR().sppl_flg() && isNull(getCmnR().asppl_cd())){
				getCmnR().asppl_cd(getCmnR().bp_cd());
				getCmnR().asppl_nm(getCmnR().bp_nm());
			}
			if (!getCo().ap_no_use_flg()) {
				if (getCmnR().bsppl_flg() && isNull(getCmnR().bsppl_cd())){
					getCmnR().bsppl_cd(getCmnR().bp_cd());
					getCmnR().bsppl_nm(getCmnR().bp_nm());
				}
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public boolean doCmn_bsppl_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_bsppl_flg)) {
			if (confirm(MABCP0013) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_bsppl_flg_VC(info);
	}
	@Override
	public void doCmn_bsppl_flg_NC(MCEventInfo info) {
		super.doCmn_bsppl_flg_NC(info);
		if (!getCmnR().bsppl_flg()) {
			// 支払予定管理先タブクリア
			doClear(Cmn_bsppl_flg);
			// 取引先補助の支払予定管理先関連項目クリア
			for (SubDtlR r : exceptBaseEmpty(SubDtlTable)) {
				setValueEx(columnSubDtl_bsppl_dpt_cd, r.getGUIIndex(), null);
			}
		}
		else {
			if (!getCo().ap_no_use_flg()) {
				if (getCmnR().asppl_flg() && isNull(getCmnR().bsppl_cd())){
					getCmnR().bsppl_cd(getCmnR().bp_cd());
					getCmnR().bsppl_nm(getCmnR().bp_nm());
				}
			}
			if (getCmnR().psppl_flg() && isNull(getCmnR().psppl_cd())){
				getCmnR().psppl_cd(getCmnR().bp_cd());
				getCmnR().psppl_nm(getCmnR().bp_nm());
			}
			if (getCmnR().cred_flg() && isNull(getCmnR().ap_cred_cd())){
				getCmnR().ap_cred_cd(getCmnR().bp_cd());
				getCmnR().ap_cred_nm(getCmnR().bp_nm());
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public boolean doCmn_psppl_flg_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && chkInpt(Cmn_psppl_flg)) {
			if (confirm(MABCP0014) == MCMessageBox.NO_OPTION) {
				return false;
			}
		}
		return super.doCmn_psppl_flg_VC(info);
	}
	@Override
	public void doCmn_psppl_flg_NC(MCEventInfo info) {
		super.doCmn_psppl_flg_NC(info);
		if (!getCmnR().psppl_flg()) {
			// 支払先タブクリア
			doClear(Cmn_psppl_flg);
			for (SubDtlR r : getSubDtlL()) {
				setValueEx(columnSubDtl_pay_dpt_cd, r.getGUIIndex(), null);
			}
		}
		else {
			if (getCmnR().bsppl_flg() && isNull(getCmnR().psppl_cd())){
				getCmnR().psppl_cd(getCmnR().bp_cd());
				getCmnR().psppl_nm(getCmnR().bp_nm());
			}
		}
		setTabMode();
		setModeCustom();
	}

	@Override
	public void doCmn_maker_flg_NC(MCEventInfo info) {
		super.doCmn_maker_flg_NC(info);
		setTabMode();
		setModeCustom();
	}

	@Override
	public void doCmn_cst_sundry_flg_NC(MCEventInfo info) {
		super.doCmn_cst_sundry_flg_NC(info);
		setModeCustom();
	}

	@Override
	public void doCmn_prov_rcv_typ_LC(MCEventInfo info) {
		super.doCmn_prov_rcv_typ_LC(info);
		setProvBasisTyp();
		setModeCustom();
	}
	
	@Override
	public void doCmn_ar_dpt_typ_LC(MCEventInfo info) {
		super.doCmn_ar_dpt_typ_LC(info);

		setValueEx(Cmn_ar_dpt_cd, null);
		
		for (SubDtlR r : getSubDtlL()) {
			if (!MAC_AR_DPT_TYP.isAR(getCmnR().ar_dpt_typ()) && !isNull(r.ar_dpt_cd())) {
				setValueEx(columnSubDtl_ar_dpt_cd, r.getGUIIndex(), null);
			}
		}
		setModeCustom();
	}
	
	@Override
	public void doCmn_sls_basis_typ_LC(MCEventInfo info) {
		super.doCmn_sls_basis_typ_LC(info);

		if (MAC_SLS_BASIS_TYP.isIN_BASIS(getCmnR().sls_basis_typ())){
			setValueEx(Cmn_bill_basis_typ, MAC_BILL_BASIS_TYP.SLS_AC.value());
		}
		else if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(getCmnR().sls_basis_typ())){
			setValueEx(Cmn_bill_basis_typ, MAC_BILL_BASIS_TYP.ARRV.value());
		}
		else if (isNull(getCmnR().sls_basis_typ())) {
			setValueEx(Cmn_bill_basis_typ, null);
		}
		setModeCustom();
	}
	
	@Override
	public void doCmn_bill_dpt_typ_LC(MCEventInfo info) {
		super.doCmn_bill_dpt_typ_LC(info);

		setValueEx(Cmn_bcst_dpt_cd, null);

		for (SubDtlR r : getSubDtlL()) {
			if (!MAC_BILL_DPT_TYP.isBILL(getCmnR().bill_dpt_typ()) && !isNull(r.bcst_dpt_cd())) {
				setValueEx(columnSubDtl_bcst_dpt_cd, r.getGUIIndex(), null);
			}
		}
		setModeCustom();
	}
	
	@Override
	public void doCmn_bill_prnt_typ_NC(MCEventInfo info) {
		super.doCmn_bill_prnt_typ_NC(info);
		
		if (MAC_BILL_PRNT_TYP.isNOT_PRNT(getCmnR().bill_prnt_typ())) {
			setValueEx(Cmn_bill_zip_cd, null);
			setValueEx(Cmn_bill_addr1, null);
			setValueEx(Cmn_bill_addr2, null);
			setValueEx(Cmn_bill_addr3, null);
			setValueEx(Cmn_bill_addr4, null);
			setValueEx(Cmn_bill_tel, null);
			setValueEx(Cmn_bill_bcst_nm, null);
			setValueEx(Cmn_bill_bcst_dpt, null);
			setValueEx(Cmn_bill_bcst_psn, null);
			setValueEx(Cmn_bill_bcst_psn_title, null);
			setValueEx(Cmn_sls_dtl_outp_typ, null);
			setValueEx(Cmn_bill_dtl_outp_flg, false);
			setValueEx(Cmn_bfw_bal_disp_flg, false);
			setValueEx(Cmn_bill_dtl_rcv_flg, false);
			setValueEx(Cmn_bill_dtl_subttl_typ, null);
			setValueEx(Cmn_bill_dtl_brk_typ, null);
			setValueEx(Cmn_bill_dtl_sort_typ, null);
			setValueEx(Cmn_bill_can_slip_typ, null);
			setValueEx(Cmn_bill_dtl_adv_flg, false);
		}
		else if (!MAC_BILL_CL_TYP.isEACH_SLS(getCmnR().bill_cl_typ())) {
			setValueEx(Cmn_bill_dtl_adv_flg, true);
		}
		setModeCustom();
	}
	
	@Override
	public void doCmn_onr_prsppl_flg_NC(MCEventInfo info) {
		super.doCmn_onr_prsppl_flg_NC(info);

		if (!getCmnR().onr_prsppl_flg()) {
			setValueEx(Cmn_repurc_obli_flg, false);
			setValueEx(Cmn_outsrc_upri_typ, null);
			setValueEx(Cmn_prov_upri_cng_flg, false);
			setValueEx(Cmn_prov_amt_rnd_typ, null);
			setValueEx(Cmn_prov_tax_rnd_typ, null);
			setValueEx(Cmn_prov_tax_calc_typ, null);
			setValueEx(Cmn_prov_tax_cd, null);
			setValueEx(Cmn_prov_tax_cd_prio_flg, false);
			// 取引先補助の支給税クリア
			for (SubDtlR r : exceptBaseEmpty(SubDtlTable)) {
				setValueEx(columnSubDtl_prov_tax_cd, r.getGUIIndex(), null);
			}
		}
		setProvBasisTyp();
		setModeCustom();
	}
	@Override
	public void doCmn_repurc_obli_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCmn_repurc_obli_flg_NC(info);
		setValueEx(Cmn_prov_tax_cd, null);
		if(getCmnR().repurc_obli_flg()) {
			setValueEx(Cmn_prov_tax_cd_prio_flg, true);
		}
		else {
			setValueEx(Cmn_prov_tax_cd_prio_flg, false);
		}
		// 取引先補助の支給税クリア
		for (SubDtlR r : exceptBaseEmpty(SubDtlTable)) {
			setValueEx(columnSubDtl_prov_tax_cd, r.getGUIIndex(), null);
		}
		setModeCustom();
	}
	@Override
	public void doCmn_sppl_iv_flg_NC(MCEventInfo info) {
		super.doCmn_sppl_iv_flg_NC(info);
		if (!getCmnR().sppl_iv_flg()) {
			setValueEx(Cmn_rcpt_iv_dup_flg, false);
		}
		setModeCustom();
	}
	@Override
	public void doCmn_stk_lst_issue_flg_NC(MCEventInfo info) {
		super.doCmn_stk_lst_issue_flg_NC(info);
		if (!getCmnR().stk_lst_issue_flg()) {
			setValueEx(Cmn_stk_lst_form_cd, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_bill_cl_typ_LC(MCEventInfo info) {
		super.doCmn_bill_cl_typ_LC(info);
		if (!MAC_BILL_CL_TYP.isBATCH(getCmnR().bill_cl_typ())) {
			setValueEx(Cmn_bill_cl_delay_days, null);

			if (!MAC_BILL_CL_TYP.isMANUAL(getCmnR().bill_cl_typ())) {
				setValueEx(Cmn_bill_cl_day1, null);

				if (!MAC_BILL_CL_TYP.isSEL(getCmnR().bill_cl_typ())) {
					setValueEx(Cmn_bfw_bal_disp_flg, false);
					setValueEx(Cmn_sls_dtl_outp_typ, null);
				}
			}
		}
		
		if (MAC_BILL_CL_TYP.isEACH_SLS(getCmnR().bill_cl_typ())) {
			setValueEx(Cmn_bill_dtl_adv_flg, false);
		}
		else if (!MAC_BILL_PRNT_TYP.isNOT_PRNT(getCmnR().bill_prnt_typ())) {
			setValueEx(Cmn_bill_dtl_adv_flg, true);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_bill_cl_day1_LC(MCEventInfo info) {
		super.doCmn_bill_cl_day1_LC(info);
		if (isNull(getCmnR().bill_cl_day1())) {
			setValueEx(Cmn_bill_cl_day2, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_bill_cl_day2_LC(MCEventInfo info) {
		super.doCmn_bill_cl_day2_LC(info);
		if (isNull(getCmnR().bill_cl_day2())) {
			setValueEx(Cmn_bill_cl_day3, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_bill_cl_day3_LC(MCEventInfo info) {
		super.doCmn_bill_cl_day3_LC(info);
		if (isNull(getCmnR().bill_cl_day3())) {
			setValueEx(Cmn_bill_cl_day4, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_bill_cl_day4_LC(MCEventInfo info) {
		super.doCmn_bill_cl_day4_LC(info);
		if (isNull(getCmnR().bill_cl_day4())) {
			setValueEx(Cmn_bill_cl_day5, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_pay_spot_flg_NC(MCEventInfo info) {
		super.doCmn_pay_spot_flg_NC(info);
		if (getCmnR().pay_spot_flg()) {
			setValueEx(Cmn_psppl_cl_day1, null);
			setValueEx(Cmn_batch_pay_schd_cl_flg, false);
			setValueEx(Cmn_pay_ntc_bfw_bal_disp_flg, false);
			setValueEx(Cmn_pay_ntc_adv_pay_flg, false);
		}
		else if (getCmnR().pay_ntc_prnt_flg()) {
			setValueEx(Cmn_pay_ntc_adv_pay_flg, true);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_psppl_cl_day1_LC(MCEventInfo info) {
		super.doCmn_psppl_cl_day1_LC(info);
		if (isNull(getCmnR().psppl_cl_day1())) {
			setValueEx(Cmn_psppl_cl_day2, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_psppl_cl_day2_LC(MCEventInfo info) {
		super.doCmn_psppl_cl_day2_LC(info);
		if (isNull(getCmnR().psppl_cl_day2())) {
			setValueEx(Cmn_psppl_cl_day3, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_psppl_cl_day3_LC(MCEventInfo info) {
		super.doCmn_psppl_cl_day3_LC(info);
		if (isNull(getCmnR().psppl_cl_day3())) {
			setValueEx(Cmn_psppl_cl_day4, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_psppl_cl_day4_LC(MCEventInfo info) {
		super.doCmn_psppl_cl_day4_LC(info);
		if (isNull(getCmnR().psppl_cl_day4())) {
			setValueEx(Cmn_psppl_cl_day5, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_tax_on_bill_flg_NC(MCEventInfo info) {
		super.doCmn_tax_on_bill_flg_NC(info);
		if (!getCmnR().tax_on_bill_flg()) {
			setValueEx(Cmn_bill_tax_rnd_typ, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_bill_cl_delay_days_LC(MCEventInfo info) {
		super.doCmn_bill_cl_delay_days_LC(info);
		if (isNull(getCmnR().bill_cl_delay_days()) || !MCNumber.ZERO.eq(getCmnR().bill_cl_delay_days())) {
			setValueEx(Cmn_bill_cl_ba_typ, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_bill_cal_cd_LC(MCEventInfo info) {
		super.doCmn_bill_cal_cd_LC(info);
		if (isNull(getCmnR().bill_cal_cd())) {
			setValueEx(Cmn_rcv_ba_typ, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_rcv_amt_match_flg_NC(MCEventInfo info) {
		super.doCmn_rcv_amt_match_flg_NC(info);
		if (!getCmnR().rcv_amt_match_flg()) {
			setValueEx(Cmn_calc_com_paid_flg, false);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_wrk_po_flg_NC(MCEventInfo info) {
		super.doCmn_wrk_po_flg_NC(info);
		if (!getCmnR().wrk_po_flg()) {
			setValueEx(Cmn_wrk_ap_flg, false);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_subcon_flg_NC(MCEventInfo info) {
		super.doCmn_subcon_flg_NC(info);
		setProvBasisTyp();
		setModeCustom();
	}
	@Override
	public void doCmn_sppl_ship_form_cd_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCmn_sppl_ship_form_cd_NC(info);
		if (isNull(getCmnR().sppl_ship_form_cd())) {
			setValueEx(Cmn_po_dlv_slip_flg, false);
			setValueEx(Cmn_dlv_inst_dlv_slip_flg, false);
			setValueEx(Cmn_prms_rcpt_dlv_slip_flg, false);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_tdlv_flg_NC(MCEventInfo info) {
		super.doCmn_tdlv_flg_NC(info);
		if (getCmnR().tdlv_flg()) {
			setValueEx(Cmn_tdlv_req_flg, false);
		}
		else {
			setValueEx(Cmn_via_dlv_typ, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_cntry_cd_LC(MCEventInfo info) {
		super.doCmn_cntry_cd_LC(info);
		if (!isSame(getCmnR().cntry_cd(), getCo().cntry_cd())) {
			setValueEx(Cmn_subcon_flg, false);
		}
		setModeCustom();
	}
	public void doCmn_tax_on_pay_flg_NC(MCEventInfo info) {
		super.doCmn_tax_on_pay_flg_NC(info);
		if (!getCmnR().tax_on_pay_flg()) {
			setValueEx(Cmn_pay_tax_rnd_typ, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_batch_pay_schd_cl_flg_NC(MCEventInfo info) {
		super.doCmn_batch_pay_schd_cl_flg_NC(info);
		if (!getCmnR().batch_pay_schd_cl_flg()) {
			setValueEx(Cmn_pay_schd_cl_delay_days, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_pay_schd_cl_delay_days_LC(MCEventInfo info) {
		super.doCmn_pay_schd_cl_delay_days_LC(info);
		if (isNull(getCmnR().pay_schd_cl_delay_days()) || !MCNumber.ZERO.eq(getCmnR().pay_schd_cl_delay_days())) {
			setValueEx(Cmn_pay_schd_cl_ba_typ, null);
		}
		setModeCustom();
	}

	@Override
	public void doCmn_pay_ntc_prnt_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCmn_pay_ntc_prnt_flg_NC(info);
		if (!getCmnR().pay_ntc_prnt_flg()) {
			setValueEx(Cmn_pay_ntc_zip_cd, null);
			setValueEx(Cmn_pay_ntc_addr1, null);
			setValueEx(Cmn_pay_ntc_addr2, null);
			setValueEx(Cmn_pay_ntc_addr3, null);
			setValueEx(Cmn_pay_ntc_addr4, null);
			setValueEx(Cmn_pay_ntc_tel, null);
			setValueEx(Cmn_pay_ntc_bsppl_nm, null);
			setValueEx(Cmn_pay_ntc_bsppl_dpt, null);
			setValueEx(Cmn_pay_ntc_bsppl_psn, null);
			setValueEx(Cmn_pay_ntc_bsppl_psn_title, null);
			setValueEx(Cmn_pay_ntc_dtl_outp_flg, false);
			setValueEx(Cmn_pay_ntc_bfw_bal_disp_flg, false);
			setValueEx(Cmn_pay_ntc_dtl_pay_flg, false);
			setValueEx(Cmn_pay_ntc_dtl_subttl_typ, null);
			setValueEx(Cmn_pay_ntc_dtl_brk_typ, null);
			setValueEx(Cmn_pay_ntc_dtl_sort_typ, null);
			setValueEx(Cmn_pay_ntc_can_slip_typ, null);
			setValueEx(Cmn_pay_ntc_adv_pay_flg, false);
		}
		else if (!getCmnR().pay_spot_flg()) {
			setValueEx(Cmn_pay_ntc_adv_pay_flg, true);
		}
		setModeCustom();
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getCmn_prov_basis_typ(MCRow row,MCEventInfo info) {
		addListLogicCnd(row, getProvBasisTyp(info));
		return super.getCmn_prov_basis_typ(row, info);
	}
	/**
	 * 表示する支給計上区分を取得する
	 */
	protected MAC_PROV_BASIS_TYP[] getProvBasisTyp(MCEventInfo info) {
		if (MAC_PROV_RCV_TYP.isNOT_ARR(getCmnR().prov_rcv_typ())) {
			return new MAC_PROV_BASIS_TYP[] { MAC_PROV_BASIS_TYP.GI, MAC_PROV_BASIS_TYP.INPT };
		} else {
			return new MAC_PROV_BASIS_TYP[] { MAC_PROV_BASIS_TYP.GR, MAC_PROV_BASIS_TYP.INPT };
		}
	}

	//--------------------リストロジック表示制御End-----------------------

	/**
	 * 指定されたチェックボックスに紐づく画面項目をクリアします。
	 * 紐づけ情報は画面実装仕様書の「INPT_CTL」に記述しています。
	 */
	protected void doClear(MCCheckBox cb) {
		for (MCBeans b : getClearCol(cb)) {
			if (b instanceof MCCheckBox) {
				setValueEx((MCCheckBox)b, false);
			}
			else if (b instanceof MCRowBeans) {
				setValueEx((MCRowBeans)b, null);
			}
		}
	}
	/**
	 * 指定されたチェックボックスに紐づく画面項目が一つでも入力されている場合、trueを返します。
	 * 紐づけ情報は画面実装仕様書の「INPT_CTL」に記述しています。
	 */
	protected boolean chkInpt(MCCheckBox cb) {
		for (MCBeans b : getClearCol(cb)) {
			if (b instanceof MCCheckBox) {
				if (((MCCheckBox)b).getValue()) {
					return true;
				}
			}
			else if (b instanceof MCRowBeans) {
				if (!isNull(((MCRowBeans) b).getRowValue())) {
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * 指定されたチェックボックスに紐づく画面項目を取得します。
	 * 紐づけ情報は画面実装仕様書の「INPT_CTL」に記述しています。
	 */
	protected List<MCBeans> getClearCol(MCCheckBox cb) {
		return getGroupCol(getCmnR(), _INPT_CTL, cb.getBaseRowColumnName());
	}
	protected List<MCBeans> getGroupCol(MCContainer c, String grp, String key) {
		List<MCBeans> l = new ArrayList<>();
		Map<String, String> m = ((MCConstRow) c).getExtMap(grp);
		if (m != null && !m.isEmpty()) {
			for (Map.Entry<String, String> e : m.entrySet()) {
				if (isSame(e.getValue(), key)) {
					l.add((MCBeans) getComponent((MCRow) c, e.getKey()));
				}
			}
		}
		return l;
	}


	@Override
	protected void setCellConfig() {
		SubDtlTable.setCellConfig(createAppCellConfig());
		LclDtlTable.setCellConfig(createAppCellConfig());
	}

	/**
	 * セルコンフィグの取得
	 * 
	 * @return セルコンフィグ
	 */
	protected AppCellConfig createAppCellConfig() {
		return new AppCellConfig(this);
	}

	/**
	 * セルコンフィグクラス
	 */
	protected class AppCellConfig extends MAUDP_RLBaseCellConfig {

		public AppCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdSts() || getStatus().equals(getMODStatus())) {
				// 登録済みデータはキー変更不可
				if (isExistingKey(index, column, table)) {
					return MCMode.READ_ONLY;
				}

				if (table.getBaseTable() == SubDtlTable) {
					if (column == columnSubDtl_ar_dpt_cd || column == columnSubDtl_cst_cntct_dpt
							|| column == columnSubDtl_cst_cntct_psn || column == columnSubDtl_cst_cntct_psn_title
							|| column == columnSubDtl_sls_tax_cd || column == columnSubDtl_sls_anly_cd1
							|| column == columnSubDtl_sls_anly_cd2 || column == columnSubDtl_sls_anly_cd3) {
						if (!getCmnR().cst_flg()) {
							return MCMode.READ_ONLY;
						}
						if (column == columnSubDtl_ar_dpt_cd) {
							if (!MAC_AR_DPT_TYP.isAR(getCmnR().ar_dpt_typ())) {
								return MCMode.READ_ONLY;
							}
						}
					} else if (column == columnSubDtl_bcst_dpt_cd || column == columnSubDtl_bill_zip_cd
							|| column == columnSubDtl_bill_addr1 || column == columnSubDtl_bill_addr2
							|| column == columnSubDtl_bill_addr3 || column == columnSubDtl_bill_addr4
							|| column == columnSubDtl_bill_tel || column == columnSubDtl_bill_bcst_nm
							|| column == columnSubDtl_bill_bcst_dpt || column == columnSubDtl_bill_bcst_psn
							|| column == columnSubDtl_bill_bcst_psn_title) {
						if (!getCmnR().bcst_flg()) {
							return MCMode.READ_ONLY;
						}
						if (column == columnSubDtl_bcst_dpt_cd) {
							if (!MAC_BILL_DPT_TYP.isBILL(getCmnR().bill_dpt_typ())) {
								return MCMode.READ_ONLY;
							}
						}
					} else if (column == columnSubDtl_vmi_purc_dpt_cd || column == columnSubDtl_sppl_cntct_dpt
							|| column == columnSubDtl_sppl_cntct_psn || column == columnSubDtl_sppl_cntct_psn_title
							|| column == columnSubDtl_purc_tax_cd || column == columnSubDtl_prov_tax_cd) {
						if (!getCmnR().sppl_flg()) {
							return MCMode.READ_ONLY;
						}
						if (column == columnSubDtl_prov_tax_cd) {
							if (!getCmnR().onr_prsppl_flg()) {
								return MCMode.READ_ONLY;
							}
						}
					} else if (column == columnSubDtl_ap_dpt_cd) {
						if (!getCmnR().asppl_flg()) {
							return MCMode.READ_ONLY;
						}
					} else if (column == columnSubDtl_bsppl_dpt_cd) {
						if (!getCmnR().bsppl_flg()) {
							return MCMode.READ_ONLY;
						}
					} else if (column == columnSubDtl_dlv_cntct_dpt || column == columnSubDtl_dlv_cntct_psn
							|| column == columnSubDtl_dlv_cntct_psn_title) {
						if (!getCmnR().dlv_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnSubDtl_pay_dpt_cd) {
						if (!getCmnR().psppl_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}


			}
			return null;
		}
	}

	/**
	 * キー項目を返します。
	 * @param list
	 * @return
	 */
	protected String[] getDtlRKeyColumns(MCList<? extends MCConstRow> list) {
		MCConstRow r = list.createRow();
		return r.getKeys().toArray(_dummyStringArray);
	}


	protected Map_SubDtlR_CmnR<SubDtlR,CmnR> createMap_SubDtlR_CmnR() {
		return new Map_SubDtlR_CmnR<SubDtlR, CmnR>();
	}

	public class Map_SubDtlR_CmnR<D extends SubDtlR, S extends CmnR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SubDtlR.$zip_cd, CmnR.$zip_cd);
			addColumnPathMap(SubDtlR.$addr1, CmnR.$addr1);
			addColumnPathMap(SubDtlR.$addr2, CmnR.$addr2);
			addColumnPathMap(SubDtlR.$addr3, CmnR.$addr3);
			addColumnPathMap(SubDtlR.$addr4, CmnR.$addr4);
			addColumnPathMap(SubDtlR.$tel, CmnR.$tel);
			addColumnPathMap(SubDtlR.$fax, CmnR.$fax);
			addColumnPathMap(SubDtlR.$ar_dpt_cd, CmnR.$ar_dpt_cd);
			addColumnPathMap(SubDtlR.$ar_dpt_nm, CmnR.$ar_dpt_nm);
			addColumnPathMap(SubDtlR.$cst_cntct_dpt, CmnR.$cst_cntct_dpt);
			addColumnPathMap(SubDtlR.$cst_cntct_psn, CmnR.$cst_cntct_psn);
			addColumnPathMap(SubDtlR.$cst_cntct_psn_title, CmnR.$cst_cntct_psn_title);
			addColumnPathMap(SubDtlR.$sls_tax_cd, CmnR.$sls_tax_cd);
			addColumnPathMap(SubDtlR.$sls_tax_nm, CmnR.$sls_tax_nm);
			addColumnPathMap(SubDtlR.$sls_anly_cd1, CmnR.$sls_anly_cd1);
			addColumnPathMap(SubDtlR.$sls_anly_nm1, CmnR.$sls_anly_nm1);
			addColumnPathMap(SubDtlR.$sls_anly_cd2, CmnR.$sls_anly_cd2);
			addColumnPathMap(SubDtlR.$sls_anly_nm2, CmnR.$sls_anly_nm2);
			addColumnPathMap(SubDtlR.$sls_anly_cd3, CmnR.$sls_anly_cd3);
			addColumnPathMap(SubDtlR.$sls_anly_nm3, CmnR.$sls_anly_nm3);
			addColumnPathMap(SubDtlR.$bcst_dpt_cd, CmnR.$bcst_dpt_cd);
			addColumnPathMap(SubDtlR.$bcst_dpt_nm, CmnR.$bcst_dpt_nm);
			addColumnPathMap(SubDtlR.$bill_zip_cd, CmnR.$bill_zip_cd);
			addColumnPathMap(SubDtlR.$bill_addr1, CmnR.$bill_addr1);
			addColumnPathMap(SubDtlR.$bill_addr2, CmnR.$bill_addr2);
			addColumnPathMap(SubDtlR.$bill_addr3, CmnR.$bill_addr3);
			addColumnPathMap(SubDtlR.$bill_addr4, CmnR.$bill_addr4);
			addColumnPathMap(SubDtlR.$bill_tel, CmnR.$bill_tel);
			addColumnPathMap(SubDtlR.$bill_bcst_nm, CmnR.$bill_bcst_nm);
			addColumnPathMap(SubDtlR.$bill_bcst_dpt, CmnR.$bill_bcst_dpt);
			addColumnPathMap(SubDtlR.$bill_bcst_psn, CmnR.$bill_bcst_psn);
			addColumnPathMap(SubDtlR.$bill_bcst_psn_title, CmnR.$bill_bcst_psn_title);
			addColumnPathMap(SubDtlR.$vmi_purc_dpt_cd, CmnR.$vmi_purc_dpt_cd);
			addColumnPathMap(SubDtlR.$vmi_purc_dpt_nm, CmnR.$vmi_purc_dpt_nm);
			addColumnPathMap(SubDtlR.$sppl_cntct_dpt, CmnR.$sppl_cntct_dpt);
			addColumnPathMap(SubDtlR.$sppl_cntct_psn, CmnR.$sppl_cntct_psn);
			addColumnPathMap(SubDtlR.$sppl_cntct_psn_title, CmnR.$sppl_cntct_psn_title);
			addColumnPathMap(SubDtlR.$purc_tax_cd, CmnR.$purc_tax_cd);
			addColumnPathMap(SubDtlR.$purc_tax_nm, CmnR.$purc_tax_nm);
			addColumnPathMap(SubDtlR.$prov_tax_cd, CmnR.$prov_tax_cd);
			addColumnPathMap(SubDtlR.$prov_tax_nm, CmnR.$prov_tax_nm);
			addColumnPathMap(SubDtlR.$ap_dpt_cd, CmnR.$ap_dpt_cd);
			addColumnPathMap(SubDtlR.$ap_dpt_nm, CmnR.$ap_dpt_nm);
			addColumnPathMap(SubDtlR.$bsppl_dpt_cd, CmnR.$bsppl_dpt_cd);
			addColumnPathMap(SubDtlR.$bsppl_dpt_nm, CmnR.$bsppl_dpt_nm);
			addColumnPathMap(SubDtlR.$dlv_cntct_dpt, CmnR.$dlv_cntct_dpt);
			addColumnPathMap(SubDtlR.$dlv_cntct_psn, CmnR.$dlv_cntct_psn);
			addColumnPathMap(SubDtlR.$dlv_cntct_psn_title, CmnR.$dlv_cntct_psn_title);
		}
	}

}