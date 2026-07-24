package mcframe.clientMABC.MABCP0310;

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
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

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
import java.util.Arrays;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ItmReg_MC extends MABCP_ItmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _IMAGE_HEIGHT = "th_image_height";
	protected String _IMAGE_WIDTH = "th_image_width";
	protected String _MST_SET_TYP;
	protected String _INPT_CTL = "INPT_CTL";
	protected String _ITM_TYP_D_CD = "TYPD";
	protected String _PHANTOM = "PNTM";
	protected int _snoTyp = getSnoTyp(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmReg_MC() {
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
	public MABCP_ItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected MCPanel getOpeHdrPanel() {
		return TopPanel;
	}
	
	@Override
	protected MCPanel getSplitPaneTopPanel() {
		return TopPanel;
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
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMA_MABCL0310_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0310_Upd01();
	}
	/**
	 * [MA_MABCL0310_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0310_Srch01Caller<P extends MABCP_ItmReg, B extends MA_MABCL0310_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0310_Srch01Caller(P p, B b) {
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
			getImgL().add(getDtlL().get(0));

			// 検索結果から変更前項目にコピーする
			getCmnR().org_stk_mng_typ(getCmnR().stk_mng_typ());
			getCmnR().org_asset_mng_typ(getCmnR().asset_mng_typ());
			getCmnR().org_lot_mng_typ(getCmnR().lot_mng_typ());
			getCmnR().org_sublot_mng_typ(getCmnR().sublot_mng_typ());
			getCmnR().org_sno1_mng_typ(getCmnR().sno1_mng_typ());
			getCmnR().org_sno2_mng_typ(getCmnR().sno2_mng_typ());
			getCmnR().org_sno3_mng_typ(getCmnR().sno3_mng_typ());
			getCmnR().org_sno4_mng_typ(getCmnR().sno4_mng_typ());
			getCmnR().org_comp_spec_typ(getCmnR().comp_spec_typ());
		}
		@Override
		protected void moveFocus() {
			if (isRefOpe()) {
				CndPanel.focusFirstComponent();
			}
			else {
				TopTab.focusActiveFirstComponent();
			}
			SubDtlTable.selectRowNoFocus(0);
			UnitDtlTable.selectRowNoFocus(0);
			LclDtlTable.selectRowNoFocus(0);
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

			panel.fillSpace();
			setBtnMode();
		}
		@Override
		protected void setModeNoDown() {
			setSRCHStatus();
		}
		@Override
		protected void adjustList() {
			SubDtlTable.adjustWidth();
			UnitDtlTable.adjustWidth();
			LclDtlTable.adjustWidth();
		}
	}

	/**
	 * [MA_MABCL0310_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0310_Upd01Caller<P extends MABCP_ItmReg, B extends MA_MABCL0310_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0310_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			setupDtl();
			return super.checkForCall();
		}

		protected void setupDtl() {
			getDtlL().clear();
			
			if (!getCmnR().isStatusNone() || !getImgL().subList(MCRow.MODIFY).isEmpty()) {
				CmnR r = getCmnR().clone();
				r.check(true);
				if (isUpdOpe()) {
					r.setStatus(MCRow.CREATE);
				}
				else {
					r.setStatus(MCRow.MODIFY);
				}
				if (!getImgL().isEmpty()) {
					r.th_image(getImgL().get(0).th_image());
				}
				getDtlL().add(r);
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			if (MAC_MST_SET_TYP.isALL_COM(_MST_SET_TYP) && Cnd_reg_COM.isSelected()) {
				bridge.up1().upd_only_com_flg(true);
			}
			else {
				bridge.up1().upd_only_com_flg(false);
			}

			for(SubDtlR r : bridge.up2()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getCmnR().itm_cd());
					r.itm_sub1(getCmnR().itm_sub1());
					r.itm_sub2(getCmnR().itm_sub2());
					r.itm_sub3(getCmnR().itm_sub3());
				}
			}
			for(UnitDtlR r : bridge.up3()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getCmnR().itm_cd());
					r.itm_sub1(getCmnR().itm_sub1());
					r.itm_sub2(getCmnR().itm_sub2());
					r.itm_sub3(getCmnR().itm_sub3());
				}
			}
			for(LclDtlR r : bridge.up4()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getCmnR().itm_cd());
					r.itm_sub1(getCmnR().itm_sub1());
					r.itm_sub2(getCmnR().itm_sub2());
					r.itm_sub3(getCmnR().itm_sub3());
				}
			}
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkUnit(msgList);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getCmnR()));
		}

		/**
		 * ヘッダの各単位ＣＤのチェック
		 */
		protected void checkUnit(MCMessageList msgList) {
			List<String> l = getEnableUnitList(false);
			// 出荷単位
			if (!isNull(getCmnR().ship_unit_cd()) && !l.contains(getCmnR().ship_unit_cd())) {
				msgList.add(new MCMessage(getCmnR(), CmnR.$ship_unit_cd, MABCP0018, Cmn_ship_unit_cd.getLabelByLocale(),
						getCmnR().ship_unit_cd()));
			}
			// 製造単位
			if (!isNull(getCmnR().mfg_unit_cd()) && !l.contains(getCmnR().mfg_unit_cd())) {
				msgList.add(new MCMessage(getCmnR(), CmnR.$mfg_unit_cd, MABCP0018, Cmn_mfg_unit_cd.getLabelByLocale(),
						getCmnR().mfg_unit_cd()));
			}
			// 発注単位
			if (!isNull(getCmnR().purc_unit_cd()) && !l.contains(getCmnR().purc_unit_cd())) {
				msgList.add(new MCMessage(getCmnR(), CmnR.$purc_unit_cd, MABCP0018, Cmn_purc_unit_cd.getLabelByLocale(),
						getCmnR().purc_unit_cd()));
			}
			l = getEnableUnitList(true);
			// 梱包単位
			if (!isNull(getCmnR().pckg_unit_cd()) && !l.contains(getCmnR().pckg_unit_cd())) {
				msgList.add(new MCMessage(getCmnR(), CmnR.$pckg_unit_cd, MABCP0019, Cmn_pckg_unit_cd.getLabelByLocale(),
						getCmnR().pckg_unit_cd()));
			}
		}
		/**
		 * ヘッダの各単位に指定可能な単位のリストを返します。
		 * pckgFlg=TRUEの時は梱包単位に指定可能な単位のリストを返します。
		 */
		protected List<String> getEnableUnitList(boolean pckgFlg) {
			List<String> l = new ArrayList<String>();
			l.add(getCmnR().unit_cd());
			for(UnitDtlR r : getUnitDtlL()) {
				if (!r.del_flg() && (r.check() || !isNull(r.upd_cntr()))) {
					if (!pckgFlg || r.pckg_flg()) {
						l.add(r.unit_cd());
					}
				}
			}
			return l;
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
				setValueEx(Cnd_itm_cd, getCmnR().itm_cd());
				if (isNull(getCndR().itm_sub1())) {
					setValueEx(Cnd_itm_sub1, getCmnR().itm_sub1());
				}
				if (isNull(getCndR().itm_sub2())) {
					setValueEx(Cnd_itm_sub2, getCmnR().itm_sub2());
				}
				if (isNull(getCndR().itm_sub3())) {
					setValueEx(Cnd_itm_sub3, getCmnR().itm_sub3());
				}
			}
			setBtnMode();
		}
		@Override
		protected void statusClear() {
			getCmnR().setStatus(MCRow.NONE);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return getCmnR().isStatusNone()
					&& getImgL().subList(MCRow.MODIFY).isEmpty()
					&& getSubDtlL().subList(getCheckColumn(), true).isEmpty()
					&& getUnitDtlL().subList(getCheckColumn(), true).isEmpty()
					&& getLclDtlL().subList(getCheckColumn(), true).isEmpty();
		}

		@Override
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
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
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABCL0310_Srch01();
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
	 * Panel[UnitBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doUnitBtn_select_all(MCEventInfo info) {
		doSelectAll(UnitDtlTable);
	}
	/**
	 * Panel[UnitBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doUnitBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(UnitDtlTable);
	}
	/**
	 * Panel[UnitBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doUnitBtn_radd(MCEventInfo info) {
		insertRow(UnitDtlTable);
	}
	/**
	 * Panel[UnitBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doUnitBtn_rdel(MCEventInfo info) {
		deleteRow(UnitDtlTable);
	}
	/**
	 * Panel[UnitBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doUnitBtn_rcopy(MCEventInfo info) {
		copyRow(UnitDtlTable);
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
	 * Panel[Btn]のボタン[open_MABSP1120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP1120(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1120");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1120CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1120.CndR crtOpenMABSP1120CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1120.CndR to = mcframe.clientMABS.MABSP1120.CndR.create();

		to.itm_cd(getCmnR().itm_cd());
		to.itm_sub1(getCmnR().itm_sub1());
		to.itm_sub2(getCmnR().itm_sub2());
		to.itm_sub3(getCmnR().itm_sub3());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABSP1100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP1100(MCEventInfo info) {

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1100");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1100CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1100.CndR crtOpenMABSP1100CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1100.CndR to = mcframe.clientMABS.MABSP1100.CndR.create();

		to.itm_cd(getCmnR().itm_cd());
		to.itm_sub1(getCmnR().itm_sub1());
		to.itm_sub2(getCmnR().itm_sub2());
		to.itm_sub3(getCmnR().itm_sub3());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABSP1110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP1110(MCEventInfo info) {

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1110");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1110CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1110.CndR crtOpenMABSP1110CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1110.CndR to = mcframe.clientMABS.MABSP1110.CndR.create();

		to.itm_cd(getCmnR().itm_cd());
		to.itm_sub1(getCmnR().itm_sub1());
		to.itm_sub2(getCmnR().itm_sub2());
		to.itm_sub3(getCmnR().itm_sub3());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABSP1130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP1130(MCEventInfo info) {

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1130");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1130CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1130.CndR crtOpenMABSP1130CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1130.CndR to = mcframe.clientMABS.MABSP1130.CndR.create();

		to.itm_cd(getCmnR().itm_cd());
		to.itm_sub1(getCmnR().itm_sub1());
		to.itm_sub2(getCmnR().itm_sub2());
		to.itm_sub3(getCmnR().itm_sub3());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0870]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0870(MCEventInfo info) {

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0870");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0870CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0870.CndR crtOpenMABCP0870CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0870.CndR to = mcframe.clientMABC.MABCP0870.CndR.create();

		to.itm_cd(getCmnR().itm_cd());
		to.itm_sub1(getCmnR().itm_sub1());
		to.itm_sub2(getCmnR().itm_sub2());
		to.itm_sub3(getCmnR().itm_sub3());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0840]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0840(MCEventInfo info) {

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0840");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0840CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0840.CndR crtOpenMABCP0840CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0840.CndR to = mcframe.clientMABC.MABCP0840.CndR.create();

		to.itm_cd(getCmnR().itm_cd());
		to.itm_sub1(getCmnR().itm_sub1());
		to.itm_sub2(getCmnR().itm_sub2());
		to.itm_sub3(getCmnR().itm_sub3());

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0400]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0400(MCEventInfo info) {

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0400");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0400CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0400.CndR crtOpenMABCP0400CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0400.CndR to = mcframe.clientMABC.MABCP0400.CndR.create();
		mcframe.clientMABC.MABCP0400.MABCP_ItmRlsReg p = (mcframe.clientMABC.MABCP0400.MABCP_ItmRlsReg) aso.getPanel();

		to.itm_cd(getCmnR().itm_cd());
		to.itm_sub1(getCmnR().itm_sub1());
		to.itm_sub2(getCmnR().itm_sub2());
		to.itm_sub3(getCmnR().itm_sub3());
		
		if (getCmnR().release_flg()) {
			to.ope(p.Cnd_ope_DEL.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}

		return to;
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0310_Upd01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cmn_rqmt_rstr_qty_p_PPanel.setRelateBeans(Cmn_unit_cd, Cmn_dec_place);
		Cmn_cost_std_qty_p_PPanel.setRelateBeans(Cmn_unit_cd, Cmn_dec_place);
		UnitDtl_base_qty_p_PPanel.setRelateBeans(columnUnitDtl_unit_cd, columnUnitDtl_dec_place);
		UnitDtl_qty_p_PPanel.setRelateBeans(Cmn_unit_cd, Cmn_dec_place);
	}

	@Override
	protected void listInit() {
		super.listInit();

		getUnitDtl_unit_cd_ListPutter().putBind(UnitCols.$i_base_unit_cd, Cmn_unit_cd);

		Cmn_itm_typ_d_cd.addIgnoreListBeans(Cmn_slo_proc_typ, Cmn_ship_inst_typ, Cmn_sno1_mng_typ, Cmn_sno2_mng_typ, Cmn_sno3_mng_typ, Cmn_sno4_mng_typ);
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		// 管理名
		getMstR().itm_mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_ITM));
		getMstR().sub_mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_ITM_SUB));
		getMstR().unit_mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_ITM_UNIT));
		_MST_SET_TYP = getRLUtil().getMstSetTyp(MAC_MST_NM.MAM_ITM);

		setRegTargetMode();
	}

	/**
	 * 登録対象に会社項目のみしか選択できないときtrueを返します。
	 */
	protected boolean isComOnly() {
		return MAC_MST_SET_TYP.isCOM(_MST_SET_TYP) || !Btn_upd_cmn.authorize();
	}
	/**
	 * 登録対象項目のモード制御
	 */
	protected void setRegTargetMode() {
		if (_MST_SET_TYP == null) {
			return ;
		}
		if (isComOnly()) {
			setValueEx(Cnd_reg_Group, Cnd_reg_COM.getActionCommand());
			Cnd_reg_Group.setMode(MCMode.READ_ONLY);
		}

		setDefaultMode(Cmn1Panel, Cmn2Panel, Cmn3Panel, Cmn4Panel);

		if (MAC_MST_SET_TYP.isALL_COM(_MST_SET_TYP) && (isUpdSts() || getStatus().equals(getMODStatus())) && Cnd_reg_COM.isSelected()) {
			Cmn_itm_cd.setMode(MCMode.READ_ONLY);
			Cmn_itm_sub1.setMode(MCMode.READ_ONLY);
			Cmn_itm_sub2.setMode(MCMode.READ_ONLY);
			Cmn_itm_sub3.setMode(MCMode.READ_ONLY);
			Cmn_base_itm_nm.setMode(MCMode.READ_ONLY);
			Cmn_base_itm_alt_nm1.setMode(MCMode.READ_ONLY);
			Cmn_base_itm_alt_nm2.setMode(MCMode.READ_ONLY);
			Cmn_base_itm_alt_nm3.setMode(MCMode.READ_ONLY);
			Cmn_base_itm_alt_nm4.setMode(MCMode.READ_ONLY);
			Cmn_stk_mng_typ.setMode(MCMode.READ_ONLY);
			Cmn_asset_mng_typ.setMode(MCMode.READ_ONLY);
			Cmn_sundry_itm_flg.setMode(MCMode.READ_ONLY);
			Cmn_dscnt_itm_flg.setMode(MCMode.READ_ONLY);
			Cmn_unit_cd.setMode(MCMode.READ_ONLY);
			Cmn_dec_place.setMode(MCMode.READ_ONLY);
			Cmn_rnd_typ.setMode(MCMode.READ_ONLY);
			Cmn_dim_unit_cd.setMode(MCMode.READ_ONLY);
			Cmn_dim.setMode(MCMode.READ_ONLY);
			Cmn_wt_unit_cd.setMode(MCMode.READ_ONLY);
			Cmn_wt.setMode(MCMode.READ_ONLY);
			Cmn_conts_unit_cd.setMode(MCMode.READ_ONLY);
			Cmn_conts_qty.setMode(MCMode.READ_ONLY);
			Cmn_unit_dim.setMode(MCMode.READ_ONLY);
			Cmn_unit_wt.setMode(MCMode.READ_ONLY);
			Cmn_sls_itm_grp_cd.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd1.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd2.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd3.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd4.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd5.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd6.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd7.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd8.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd9.setMode(MCMode.READ_ONLY);
			Cmn_itm_grp_cd10.setMode(MCMode.READ_ONLY);
			Cmn_hs_cd.setMode(MCMode.READ_ONLY);
			Cmn_jan_typ.setMode(MCMode.READ_ONLY);
			Cmn_jan_cd.setMode(MCMode.READ_ONLY);
			Cmn_itf_cd.setMode(MCMode.READ_ONLY);
			Cmn_gtin_cd.setMode(MCMode.READ_ONLY);
			Cmn_memo1_c.setMode(MCMode.READ_ONLY);
			Cmn_memo2_c.setMode(MCMode.READ_ONLY);
			Cmn_memo3_c.setMode(MCMode.READ_ONLY);
		}
		else {
			if (MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
				Cmn_sundry_itm_flg.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_STK_MNG_TYP.isNOT_MNG(getCmnR().stk_mng_typ()) || !MAC_ASSET_MNG_TYP.isNOT_MNG(getCmnR().asset_mng_typ())) {
				Cmn_dscnt_itm_flg.setMode(MCMode.READ_ONLY);
			}
			if (isNull(getCmnR().dim_unit_cd())) {
				Cmn_dim.setMode(MCMode.READ_ONLY);
			}
			if (isNull(getCmnR().wt_unit_cd())) {
				Cmn_wt.setMode(MCMode.READ_ONLY);
			}
			if (isNull(getCmnR().conts_unit_cd())) {
				Cmn_conts_qty.setMode(MCMode.READ_ONLY);
			}
			if (isNull(getCmnR().jan_typ())) {
				Cmn_jan_cd.setMode(MCMode.READ_ONLY);
			}
		}

		setItmNumSubMode();

		// 以降（会社）項目
		setDefaultMode(Com1Panel, Com2Panel, Com3Panel, Com4Panel);
		if (isUpdSts() || getStatus().equals(MOD)) {
			Cmn_ref_itm_p_PPanel.setENABLEStatus();
		}
		if (isNull(getCmnR().stk_mng_typ()) ||isNull(getCmnR().asset_mng_typ())) {
			Cmn_itm_typ.setMode(MCMode.READ_ONLY);
		}
		if (isNull(getCmnR().itm_typ())) {
			Cmn_itm_typ_d_cd.setMode(MCMode.READ_ONLY);
		}
		setItmTypDGrpMode();
		setPhantomGrpMode();

		// 管理者以外は変更不可または条件付変更可能項目
		if (getStatus().equals(getMODStatus()) && !isNull(getCmnR().upd_cntr())) {
			Cmn_unit_cd.setMode(MCMode.READ_ONLY);
			Cmn_dec_place.setMode(MCMode.READ_ONLY);
			Cmn_rnd_typ.setMode(MCMode.READ_ONLY);
			Cmn_dscnt_itm_flg.setMode(MCMode.READ_ONLY);
			Cmn_pack_alloc_flg.setMode(MCMode.READ_ONLY);
			Cmn_cont_fctr_flg.setMode(MCMode.READ_ONLY);
			Cmn_cont_fctr_unit_cd.setMode(MCMode.READ_ONLY);
			Cmn_cont_fctr_dec_place.setMode(MCMode.READ_ONLY);
			Cmn_cont_fctr_rnd_typ.setMode(MCMode.READ_ONLY);
			if (MAC_STK_MNG_TYP.isMNG(getCmnR().org_stk_mng_typ()) || getCmnR().dscnt_itm_flg()) {
				Cmn_stk_mng_typ.setMode(MCMode.READ_ONLY);
			}
			if (MAC_ASSET_MNG_TYP.isMNG(getCmnR().org_asset_mng_typ()) || getCmnR().dscnt_itm_flg()) {
				Cmn_asset_mng_typ.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_LOT_MNG_TYP.isNOT_MNG(getCmnR().org_lot_mng_typ())) {
				Cmn_lot_mng_typ.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(getCmnR().org_sublot_mng_typ())) {
				Cmn_sublot_mng_typ.setMode(MCMode.READ_ONLY);
			}
			if (((!((_snoTyp > 0 && MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno1_mng_typ()))
						|| (_snoTyp > 1 && MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno2_mng_typ()))
						|| (_snoTyp > 2 && MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno3_mng_typ()))
						|| (_snoTyp > 3 && MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno4_mng_typ())))
					&& !((_snoTyp > 0 && MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno1_mng_typ()))
						|| (_snoTyp > 1 && MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno2_mng_typ()))
						|| (_snoTyp > 2 && MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno3_mng_typ()))
						|| (_snoTyp > 3 && MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno4_mng_typ())))
					&& !((_snoTyp > 0 && isNull(getCmnR().sno1_mng_typ()))
						|| (_snoTyp > 1 && isNull(getCmnR().sno2_mng_typ()))
						|| (_snoTyp > 2 && isNull(getCmnR().sno3_mng_typ()))
						|| (_snoTyp > 3 && isNull(getCmnR().sno4_mng_typ()))))
					&& MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) && !getCmnR().sundry_itm_flg()) {
				Cmn_sundry_itm_flg.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_STK_MNG_TYP.isPHANTOM(getCmnR().org_stk_mng_typ()) && !MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
				Cmn_itm_typ.setMode(MCMode.READ_ONLY);
				Cmn_itm_typ_d_cd.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().org_sno1_mng_typ())) {
				Cmn_sno1_mng_typ.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().org_sno2_mng_typ())) {
				Cmn_sno2_mng_typ.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().org_sno3_mng_typ())) {
				Cmn_sno3_mng_typ.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().org_sno4_mng_typ())) {
				Cmn_sno4_mng_typ.setMode(MCMode.READ_ONLY);
			}
			if (!MAC_COMP_SPEC_TYP.isNO(getCmnR().org_comp_spec_typ())) {
				Cmn_comp_spec_typ.setMode(MCMode.READ_ONLY);
			}
		}


		if (!MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			Cmn_minus_stk_flg.setMode(MCMode.READ_ONLY);
			Cmn_gi_alloc_flg.setMode(MCMode.READ_ONLY);
			Cmn_lot_mng_typ.setMode(MCMode.READ_ONLY);
			Cmn_stk_lst_flg.setMode(MCMode.READ_ONLY);
		}

		if (!MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ()) || isNull(getCmnR().lot_mng_typ())) {
			Cmn_sublot_mng_typ.setMode(MCMode.READ_ONLY);
		}

		if ((isNull(getCmnR().lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(getCmnR().lot_mng_typ()))
		 && (isNull(getCmnR().sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(getCmnR().sublot_mng_typ()))) {
			Cmn_not_new_lot_flg.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(getCmnR().lot_mng_typ())) {
			Cmn_ver_flg.setMode(MCMode.READ_ONLY);
			Cmn_lmt_ctl_flg.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(getCmnR().lot_mng_typ())) {
			Cmn_lot_no_typ.setMode(MCMode.READ_ONLY);
		}
		else if (isUpdSts() || getStatus().equals(MOD)) {
			Cmn_lot_no_typ.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Cmn_lot_no_typ);
		}

		if (isNull(getCmnR().lot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(getCmnR().lot_no_typ())) {
			Cmn_lot_no_ptn_cd.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(getCmnR().sublot_mng_typ())) {
			Cmn_sublot_no_typ.setMode(MCMode.READ_ONLY);
		}
		else if (isUpdSts() || getStatus().equals(MOD)) {
			Cmn_sublot_no_typ.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Cmn_sublot_no_typ);
		}

		if (isNull(getCmnR().sublot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(getCmnR().sublot_no_typ())) {
			Cmn_sublot_no_ptn_cd.setMode(MCMode.READ_ONLY);
		}

		if ((isNull(getCmnR().lot_mng_typ()) || !MAC_LOT_MNG_TYP.isUNIQ(getCmnR().lot_mng_typ()))
		 && (isNull(getCmnR().sublot_mng_typ()) || !MAC_SUBLOT_MNG_TYP.isUNIQ(getCmnR().sublot_mng_typ()))) {
			Cmn_insp_bind_typ.setMode(MCMode.READ_ONLY);
			Cmn_mrkt_judg_flg.setMode(MCMode.READ_ONLY);
			Cmn_cont_fctr_flg.setMode(MCMode.READ_ONLY);
		}

		if (!getCmnR().mrkt_judg_flg()) {
			Cmn_mrkt_judg_role_cd.setMode(MCMode.READ_ONLY);
			Cmn_mrkt_judg_upd_role_cd.setMode(MCMode.READ_ONLY);
		}

		if (!getCmnR().lmt_ctl_flg()) {
			Cmn_lmt_ctl_categ.setMode(MCMode.READ_ONLY);
			Cmn_ship_lot_back_stop_flg.setMode(MCMode.READ_ONLY);
			Cmn_ship_valid_grp_cd.setMode(MCMode.READ_ONLY);
		}

		if (!getCmnR().cont_fctr_flg()) {
			Cmn_std_cont_fctr.setMode(MCMode.READ_ONLY);
			Cmn_cont_fctr_unit_cd.setMode(MCMode.READ_ONLY);
			Cmn_cont_fctr_rnd_typ.setMode(MCMode.READ_ONLY);
			Cmn_cont_fctr_dec_place.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sno1_mng_typ()) 
		 || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno1_mng_typ())
		 || MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno1_mng_typ())) {
			Cmn_slo_sno1_flg.setMode(MCMode.READ_ONLY);
			Cmn_rqmt_sno1_flg.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sno1_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno1_mng_typ())) {
			Cmn_sno1_num_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_sno1_num_typ);
		}

		if (isNull(getCmnR().sno1_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno1_num_typ())) {
			Cmn_sno1_ptn_cd.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sno2_mng_typ())
				|| MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno2_mng_typ())
				|| MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno2_mng_typ())) {
			Cmn_slo_sno2_flg.setMode(MCMode.READ_ONLY);
			Cmn_rqmt_sno2_flg.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sno2_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno2_mng_typ())) {
			Cmn_sno2_num_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_sno2_num_typ);
		}

		if (isNull(getCmnR().sno2_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno2_num_typ())) {
			Cmn_sno2_ptn_cd.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sno3_mng_typ())
				|| MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno3_mng_typ())
				|| MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno3_mng_typ())) {
			Cmn_slo_sno3_flg.setMode(MCMode.READ_ONLY);
			Cmn_rqmt_sno3_flg.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sno3_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno3_mng_typ())) {
			Cmn_sno3_num_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_sno3_num_typ);
		}

		if (isNull(getCmnR().sno3_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno3_num_typ())) {
			Cmn_sno3_ptn_cd.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sno4_mng_typ())
				|| MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno4_mng_typ())
				|| MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno4_mng_typ())) {
			Cmn_slo_sno4_flg.setMode(MCMode.READ_ONLY);
			Cmn_rqmt_sno4_flg.setMode(MCMode.READ_ONLY);
		}

		if (isNull(getCmnR().sno4_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno4_mng_typ())) {
			Cmn_sno4_num_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cmn_sno4_num_typ);
		}

		if (isNull(getCmnR().sno4_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno4_num_typ())) {
			Cmn_sno4_ptn_cd.setMode(MCMode.READ_ONLY);
		}

		if (!MAC_COMP_SPEC_TYP.isCOMP_SPEC(getCmnR().comp_spec_typ())) {
			Cmn_comp_rev_at_slo_flg.setMode(MCMode.READ_ONLY);
		}

		if (MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ()) && !getCmnR().arr_skip_flg()) {
			Cmn_arr_skip_flg.setMode(MCMode.READ_ONLY);
		}

		if (!getCmnR().arr_skip_flg()) {
			Cmn_purc_dlv_slip_flg.setMode(MCMode.READ_ONLY);
		}

		if (!MAC_STK_MNG_TYP.isNOT_MNG(getCmnR().stk_mng_typ())) {
			Cmn_exim_xpns_typ.setMode(MCMode.READ_ONLY);
		}
		if (!getCmnR().slo_proc_flg()) {
			Cmn_slo_proc_typ.setMode(MCMode.READ_ONLY);
		}

		if (MAC_SLO_PROC_TYP.isPURC_DDLV(getCmnR().slo_proc_typ())) {
			Cmn_ship_inst_typ.setMode(MCMode.READ_ONLY);
		}

		if (getCmnR().dscnt_itm_flg()) {
			Cmn_sls_upri_cng_flg.setMode(MCMode.READ_ONLY);
			Cmn_purc_upri_cng_flg.setMode(MCMode.READ_ONLY);
			Cmn_exim_xpns_typ.setMode(MCMode.READ_ONLY);
		}

		if (!MAC_ASSET_MNG_TYP.isMNG(getCmnR().asset_mng_typ())) {
			Cmn_prov_upri_cng_flg.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		
		Integer h = getImageWH(_IMAGE_HEIGHT);
		Integer w = getImageWH(_IMAGE_WIDTH);
		
		if (!isNull(h) && !isNull(w)) {
			ImgTable.setMCRowHeight(h + 10);
			columnImg_th_image.setWidthForAdjustWidth(w + 10);
			columnImg_th_image.setImageSize(w, h);
		}
		
		setDividerPos(TopPanel, 0.4);
	}
	/**サムネイル画像の高さ・横幅を取得します。*/
	protected Integer getImageWH(String _wh) {
		String key = getDispString(_wh);
		Integer imageWH = new Integer(key);
		return imageWH;
	}

	@Override
	protected void listenerInit() {
		setListListener(SubDtlTable, createRLRowListener());
		setListListener(UnitDtlTable, createRLRowListener());
		setListListener(LclDtlTable, createRLRowListener());
	}

	@Override
	public void fillSpace() {
		if (isUpdSts() || getStatus().equals(MOD) || getStatus().equals(RELEASE) || getStatus().equals(RELEASE_ADMIN)) {
			SubDtlTable.fillSpace();
			UnitDtlTable.fillSpace();
			LclDtlTable.fillSpace();
			if (getImgL().isEmpty()) {
				insertRowNoFocus(ImgTable);
			}
		}
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
		return new MCTable<?>[] { SubDtlTable, UnitDtlTable, LclDtlTable };
	}
	protected String[] _dummyStringArray = {};

	protected boolean checkAllTableClear() {
		return ((getCmnR().isStatusNone() && getImgL().isStatusNone() && getSubDtlL().isStatusNone()
				&& getUnitDtlL().isStatusNone() && getLclDtlL().isStatusNone()) || confirmRegDataClear());
	}

	@Override
	protected void clearAll() {
		super.clearAll();
		getCmnR().clearAll();
		ImgTable.clear();
		SubDtlTable.clear();
		UnitDtlTable.clear();
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
				setRowStatusForIns(getUnitDtlL());
				clearNotInheritInfo(getUnitDtlL());
				// 名称マスタはクリア
				getLclDtlL().clear();
			}
			else {
				clearAll();
			}
			setUPDStatus();
			fillSpace();
			setBtnMode();
			Cmn1Panel.focusFirstComponent();
		}
		// 参照訂正時
		else if (isModOpe() && getStatus() == REF) {
			setMODStatus();
			fillSpace();
			setBtnMode();
			Cmn1Panel.focusFirstComponent();

			setDelBtnMode(SubDtlTable.getSelectedMCRow(), SubBtn_rdel);
			setDelBtnMode(UnitDtlTable.getSelectedMCRow(), UnitBtn_rdel);
			setDelBtnMode(LclDtlTable.getSelectedMCRow(), LclBtn_rdel);
		}
		// 参照訂正時
		else if (isUpdAdminOpe() && getStatus() == REF) {
			setUPD_ADMINStatus();
			fillSpace();
			setBtnMode();
			Cmn1Panel.focusFirstComponent();

			setDelBtnMode(SubDtlTable.getSelectedMCRow(), SubBtn_rdel);
			setDelBtnMode(UnitDtlTable.getSelectedMCRow(), UnitBtn_rdel);
			setDelBtnMode(LclDtlTable.getSelectedMCRow(), LclBtn_rdel);
		}
		else {
			clearAll();
			setSRCHStatus();
			CndPanel.focusFirstComponent();
		}
	}
	@Override
	protected void clearNotInheritInfo(MCContainer cont) {
		super.clearNotInheritInfo(cont);
		if (cont instanceof CmnR) {
			setValueEx(Cmn_ext_sys_no_itm, null);
			setValueEx(Cmn_chng_no, null);
			setValueEx(Cmn_release_flg, false);
			setValueEx(Cmn_release_usr_cd, null);
			setValueEx(Cmn_release_usr_nm, null);
			setValueEx(Cmn_release_tm, null);
			setValueEx(Cmn_sls_input_flg, false);
			setValueEx(Cmn_mfg_input_flg, false);
			setValueEx(Cmn_purc_input_flg, false);
			setValueEx(Cmn_insp_input_flg, false);
		}
	}

	@Override
	public void doCmn_stk_mng_typ_LC(MCEventInfo info) {
		super.doCmn_stk_mng_typ_LC(info);

		setValueEx(Cmn_sundry_itm_flg, false);
		if (MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			if (!MAC_ASSET_MNG_TYP.isPHANTOM(getCmnR().asset_mng_typ())) {
				setValueEx(Cmn_asset_mng_typ, MAC_ASSET_MNG_TYP.PHANTOM.value());
			}
			if (!MAC_ITM_TYP.isPHANTOM(getCmnR().itm_typ())) {
				setValueEx(Cmn_itm_typ, MAC_ITM_TYP.PHANTOM.value());
			}

			for (MCModeBeans b : getPhantomGrpCols()) {
				if (b == Cmn_sno1_mng_typ || b == Cmn_sno2_mng_typ || b == Cmn_sno3_mng_typ
						|| b == Cmn_sno4_mng_typ) {
					setValueEx((MCRowBeans)b, MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				else if (b == Cmn_comp_spec_typ) {
					setValueEx((MCRowBeans)b, MAC_COMP_SPEC_TYP.NO.value());
				}
				else {
					if (b instanceof MCCheckBox) {
						setValueEx((MCCheckBox)b, false);
					}
					else {
						setValueEx((MCRowBeans)b, null);
					}
				}
			}
		} else {
			if (MAC_ASSET_MNG_TYP.isPHANTOM(getCmnR().asset_mng_typ())) {
				setValueEx(Cmn_asset_mng_typ, null);
			}
			if (MAC_ITM_TYP.isPHANTOM(getCmnR().itm_typ())) {
				setValueEx(Cmn_itm_typ, null);
			}
		}
		if (MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			if (MAC_SHIP_INST_TYP.isNO_PICK(getCmnR().ship_inst_typ())) {
				setValueEx(Cmn_ship_inst_typ, null);
			}
		}
		else {
			setValueEx(Cmn_minus_stk_flg, false);
			setValueEx(Cmn_gi_alloc_flg, false);
			setValueEx(Cmn_lot_mng_typ, MAC_LOT_MNG_TYP.NOT_MNG.value());
			setValueEx(Cmn_sublot_mng_typ, MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
			setValueEx(Cmn_stk_lst_flg, false);
		}
		if (MAC_STK_MNG_TYP.isNOT_MNG(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_slo_proc_typ, null);
		}
		else {
			setValueEx(Cmn_dscnt_itm_flg, false);
			setValueEx(Cmn_exim_xpns_typ, null);
		}
		if (MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ()) || MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_arr_skip_flg, false);
			setValueEx(Cmn_purc_dlv_slip_flg, false);
		}
		setRegTargetMode();
	}
	@Override
	public void doCmn_asset_mng_typ_LC(MCEventInfo info) {
		super.doCmn_asset_mng_typ_LC(info);

		if (MAC_ASSET_MNG_TYP.isPHANTOM(getCmnR().asset_mng_typ())){
			if (!(MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ()))){
				setValueEx(Cmn_stk_mng_typ, MAC_STK_MNG_TYP.PHANTOM.value());
			}
			if (!(MAC_ITM_TYP.isPHANTOM(getCmnR().itm_typ()))){
				setValueEx(Cmn_itm_typ, MAC_ITM_TYP.PHANTOM.value());
			}
		}
		else {
			if (MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())){
				setValueEx(Cmn_stk_mng_typ, null);
			}
			if (MAC_ITM_TYP.isPHANTOM(getCmnR().itm_typ())){
				setValueEx(Cmn_itm_typ, null);
			}
		}
		if (!MAC_ASSET_MNG_TYP.isNOT_MNG(getCmnR().asset_mng_typ())) {
			setValueEx(Cmn_dscnt_itm_flg, false);
		}
		if (!MAC_ASSET_MNG_TYP.isMNG(getCmnR().asset_mng_typ())) {
			setValueEx(Cmn_prov_upri_cng_flg, false);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_dim_unit_cd_LC(MCEventInfo info) {
		super.doCmn_dim_unit_cd_LC(info);

		if (isNull(getCmnR().dim_unit_cd())) {
			setValueEx(Cmn_dim, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_wt_unit_cd_LC(MCEventInfo info) {
		super.doCmn_wt_unit_cd_LC(info);

		if (isNull(getCmnR().wt_unit_cd())) {
			setValueEx(Cmn_wt, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_conts_unit_cd_LC(MCEventInfo info) {
		super.doCmn_conts_unit_cd_LC(info);

		if (isNull(getCmnR().conts_unit_cd())) {
			setValueEx(Cmn_conts_qty, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_jan_typ_LC(MCEventInfo info) {
		super.doCmn_jan_typ_LC(info);

		if (isNull(getCmnR().jan_typ())) {
			setValueEx(Cmn_jan_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_lot_mng_typ_LC(MCEventInfo info) {
		super.doCmn_lot_mng_typ_LC(info);

		// 在庫管理区分「在庫管理する」以外で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(getCmnR().lot_mng_typ()) && !MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_lot_mng_typ, MAC_LOT_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(getCmnR().lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(getCmnR().lot_mng_typ())) {
			setValueEx(Cmn_lot_no_typ, null);
			setValueEx(Cmn_ver_flg, false);
			setValueEx(Cmn_lmt_ctl_flg, false);

			if (isNull(getCmnR().lot_mng_typ())
					|| !MAC_SUBLOT_MNG_TYP.isNOT_MNG(getCmnR().sublot_mng_typ())
					&& !MAC_SUBLOT_MNG_TYP.isSTK(getCmnR().sublot_mng_typ())) {
				setValueEx(Cmn_sublot_mng_typ, null);
			}
			else if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(getCmnR().sublot_mng_typ())) {
				setValueEx(Cmn_not_new_lot_flg, false);
			}
		}
		if (!MAC_LOT_MNG_TYP.isUNIQ(getCmnR().lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(getCmnR().sublot_mng_typ())) {
			setValueEx(Cmn_insp_bind_typ, null);
			setValueEx(Cmn_mrkt_judg_flg, false);
			setValueEx(Cmn_cont_fctr_flg, false);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_lot_no_typ_LC(MCEventInfo info) {
		super.doCmn_lot_no_typ_LC(info);

		if (isNull(getCmnR().lot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(getCmnR().lot_no_typ())) {
			setValueEx(Cmn_lot_no_ptn_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sublot_mng_typ_LC(MCEventInfo info) {
		super.doCmn_sublot_mng_typ_LC(info);

		// 在庫管理区分「在庫管理する」以外で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(getCmnR().sublot_mng_typ()) && !MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_sublot_mng_typ, MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(getCmnR().sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(getCmnR().sublot_mng_typ())) {
			setValueEx(Cmn_sublot_no_typ, null);
			
			if (MAC_LOT_MNG_TYP.isNOT_MNG(getCmnR().lot_mng_typ())) {
				setValueEx(Cmn_not_new_lot_flg, false);
			}
		}
		if (!MAC_LOT_MNG_TYP.isUNIQ(getCmnR().lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(getCmnR().sublot_mng_typ())) {
			setValueEx(Cmn_insp_bind_typ, null);
			setValueEx(Cmn_mrkt_judg_flg, false);
			setValueEx(Cmn_cont_fctr_flg, false);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sublot_no_typ_LC(MCEventInfo info) {
		super.doCmn_sublot_no_typ_LC(info);

		if (isNull(getCmnR().sublot_no_typ()) ||MAC_LOT_NO_TYP.isMANUAL(getCmnR().sublot_no_typ())) {
			setValueEx(Cmn_sublot_no_ptn_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_mrkt_judg_flg_NC(MCEventInfo info) {
		super.doCmn_mrkt_judg_flg_NC(info);

		if (!getCmnR().mrkt_judg_flg()) {
			setValueEx(Cmn_mrkt_judg_role_cd, null);
			setValueEx(Cmn_mrkt_judg_upd_role_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_lmt_ctl_flg_NC(MCEventInfo info) {
		super.doCmn_lmt_ctl_flg_NC(info);

		if (!getCmnR().lmt_ctl_flg()) {
			setValueEx(Cmn_lmt_ctl_categ, null);
			setValueEx(Cmn_ship_lot_back_stop_flg, false);
			setValueEx(Cmn_ship_valid_grp_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_cont_fctr_flg_NC(MCEventInfo info) {
		super.doCmn_cont_fctr_flg_NC(info);

		if (!getCmnR().cont_fctr_flg()) {
			setValueEx(Cmn_std_cont_fctr, null);
			setValueEx(Cmn_cont_fctr_unit_cd, null);
			setValueEx(Cmn_cont_fctr_rnd_typ, null);
			setValueEx(Cmn_cont_fctr_dec_place, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sno1_mng_typ_LC(MCEventInfo info) {
		super.doCmn_sno1_mng_typ_LC(info);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(getCmnR().sno1_mng_typ()) && MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_sno1_mng_typ, MAC_SNO_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(getCmnR().sno1_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno1_mng_typ())) {
			setValueEx(Cmn_slo_sno1_flg, false);
			setValueEx(Cmn_rqmt_sno1_flg, false);
			setValueEx(Cmn_sno1_num_typ, null);
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno1_mng_typ())) {
			setValueEx(Cmn_slo_sno1_flg, true);
			setValueEx(Cmn_rqmt_sno1_flg, true);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sno1_num_typ_LC(MCEventInfo info) {
		super.doCmn_sno1_num_typ_LC(info);

		if (isNull(getCmnR().sno1_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno1_num_typ())) {
			setValueEx(Cmn_sno1_ptn_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sno2_mng_typ_LC(MCEventInfo info) {
		super.doCmn_sno2_mng_typ_LC(info);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(getCmnR().sno2_mng_typ()) && MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_sno2_mng_typ, MAC_SNO_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(getCmnR().sno2_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno2_mng_typ())) {
			setValueEx(Cmn_slo_sno2_flg, false);
			setValueEx(Cmn_rqmt_sno2_flg, false);
			setValueEx(Cmn_sno2_num_typ, null);
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno2_mng_typ())) {
			setValueEx(Cmn_slo_sno2_flg, true);
			setValueEx(Cmn_rqmt_sno2_flg, true);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sno2_num_typ_LC(MCEventInfo info) {
		super.doCmn_sno2_num_typ_LC(info);

		if (isNull(getCmnR().sno2_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno2_num_typ())) {
			setValueEx(Cmn_sno2_ptn_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sno3_mng_typ_LC(MCEventInfo info) {
		super.doCmn_sno3_mng_typ_LC(info);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(getCmnR().sno3_mng_typ()) && MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_sno3_mng_typ, MAC_SNO_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(getCmnR().sno3_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno3_mng_typ())) {
			setValueEx(Cmn_slo_sno3_flg, false);
			setValueEx(Cmn_rqmt_sno3_flg, false);
			setValueEx(Cmn_sno3_num_typ, null);
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno3_mng_typ())) {
			setValueEx(Cmn_slo_sno3_flg, true);
			setValueEx(Cmn_rqmt_sno3_flg, true);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sno3_num_typ_LC(MCEventInfo info) {
		super.doCmn_sno3_num_typ_LC(info);

		if (isNull(getCmnR().sno3_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno3_num_typ())) {
			setValueEx(Cmn_sno3_ptn_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sno4_mng_typ_LC(MCEventInfo info) {
		super.doCmn_sno4_mng_typ_LC(info);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(getCmnR().sno4_mng_typ()) && MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_sno4_mng_typ, MAC_SNO_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(getCmnR().sno4_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(getCmnR().sno4_mng_typ())) {
			setValueEx(Cmn_slo_sno4_flg, false);
			setValueEx(Cmn_rqmt_sno4_flg, false);
			setValueEx(Cmn_sno4_num_typ, null);
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(getCmnR().sno4_mng_typ())) {
			setValueEx(Cmn_slo_sno4_flg, true);
			setValueEx(Cmn_rqmt_sno4_flg, true);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sno4_num_typ_LC(MCEventInfo info) {
		super.doCmn_sno4_num_typ_LC(info);

		if (isNull(getCmnR().sno4_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno4_num_typ())) {
			setValueEx(Cmn_sno4_ptn_cd, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_rqmt_sno1_flg_NC(MCEventInfo info) {
		super.doCmn_rqmt_sno1_flg_NC(info);

		if (getCmnR().rqmt_sno1_flg() && MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno1_num_typ())) {
			setValueEx(Cmn_sno1_num_typ, null);
		}
	}

	@Override
	public void doCmn_rqmt_sno2_flg_NC(MCEventInfo info) {
		super.doCmn_rqmt_sno2_flg_NC(info);

		if (getCmnR().rqmt_sno2_flg() && MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno2_num_typ())) {
			setValueEx(Cmn_sno2_num_typ, null);
		}
	}

	@Override
	public void doCmn_rqmt_sno3_flg_NC(MCEventInfo info) {
		super.doCmn_rqmt_sno3_flg_NC(info);

		if (getCmnR().rqmt_sno3_flg() && MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno3_num_typ())) {
			setValueEx(Cmn_sno3_num_typ, null);
		}
	}

	@Override
	public void doCmn_rqmt_sno4_flg_NC(MCEventInfo info) {
		super.doCmn_rqmt_sno4_flg_NC(info);

		if (getCmnR().rqmt_sno4_flg() && MAC_SNO_NO_TYP.isMANUAL(getCmnR().sno4_num_typ())) {
			setValueEx(Cmn_sno4_num_typ, null);
		}
	}

	@Override
	public void doCmn_comp_spec_typ_LC(MCEventInfo info) {
		super.doCmn_comp_spec_typ_LC(info);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(getCmnR().comp_spec_typ()) && MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_comp_spec_typ, MAC_COMP_SPEC_TYP.NO.value());
			return ;
		}

		if (!MAC_COMP_SPEC_TYP.isCOMP_SPEC(getCmnR().comp_spec_typ())) {
			setValueEx(Cmn_comp_rev_at_slo_flg, false);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_dscnt_itm_flg_NC(MCEventInfo info) {
		super.doCmn_dscnt_itm_flg_NC(info);

		if (getCmnR().dscnt_itm_flg()) {
			setValueEx(Cmn_sls_upri_cng_flg, true);
			setValueEx(Cmn_purc_upri_cng_flg, true);
			setValueEx(Cmn_exim_xpns_typ, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_sls_upri_cng_flg_NC(MCEventInfo info) {
		super.doCmn_sls_upri_cng_flg_NC(info);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (getCmnR().dscnt_itm_flg()) {
			getCmnR().sls_upri_cng_flg(true);
		}
	}

	@Override
	public void doCmn_purc_upri_cng_flg_NC(MCEventInfo info) {
		super.doCmn_purc_upri_cng_flg_NC(info);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (getCmnR().dscnt_itm_flg()) {
			getCmnR().purc_upri_cng_flg(true);
		}
	}

	@Override
	public void doCmn_minus_stk_flg_NC(MCEventInfo info) {
		super.doCmn_minus_stk_flg_NC(info);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (!MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			getCmnR().minus_stk_flg(false);
		}
	}
	
	@Override
	public void doCmn_gi_alloc_flg_NC(MCEventInfo info) {
		super.doCmn_gi_alloc_flg_NC(info);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (!MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			getCmnR().gi_alloc_flg(false);
		}
	}
	
	@Override
	public void doCmn_stk_lst_flg_NC(MCEventInfo info) {
		super.doCmn_stk_lst_flg_NC(info);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (!MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			getCmnR().stk_lst_flg(false);
		}
	}
	
	@Override
	public void doCmn_prov_upri_cng_flg_NC(MCEventInfo info) {
		super.doCmn_prov_upri_cng_flg_NC(info);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (!MAC_ASSET_MNG_TYP.isMNG(getCmnR().asset_mng_typ())) {
			getCmnR().prov_upri_cng_flg(false);
		}
	}

	@Override
	public void doCmn_itm_typ_LC(MCEventInfo info) {
		super.doCmn_itm_typ_LC(info);

		if (MAC_ITM_TYP.isPHANTOM(getCmnR().itm_typ())){
			if (!(MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ()))){
				setValueEx(Cmn_stk_mng_typ, MAC_STK_MNG_TYP.PHANTOM.value());
			}
			if (!(MAC_ASSET_MNG_TYP.isPHANTOM(getCmnR().asset_mng_typ()))){
				setValueEx(Cmn_asset_mng_typ, MAC_ASSET_MNG_TYP.PHANTOM.value());
			}
		}
		else {
			if (MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())){
				setValueEx(Cmn_stk_mng_typ, null);
			}
			if (MAC_ASSET_MNG_TYP.isPHANTOM(getCmnR().asset_mng_typ())){
				setValueEx(Cmn_asset_mng_typ, null);
			}
		}
		setValueEx(Cmn_itm_typ_d_cd, null);

		setRegTargetMode();
	}

	@Override
	public void doCmn_itm_cd_LC(MCEventInfo info) {
		super.doCmn_itm_cd_LC(info);

		if (isNullOrNullVal(getCmnR().itm_cd())) {
			setValueEx(Cmn_itm_sub1, null);
		}
		else if (isNullOrNullVal(getCmnR().itm_sub1())) {
			setValueEx(Cmn_itm_sub2, null);
			setValueEx(Cmn_itm_sub3, null);
		}
		setItmNumSubMode();
	}

	@Override
	public void doCmn_itm_sub1_LC(MCEventInfo info) {
		super.doCmn_itm_sub1_LC(info);

		if (isNullOrNullVal(getCmnR().itm_sub1())) {
			setValueEx(Cmn_itm_sub2, null);
		}
		setItmNumSubMode();
	}

	@Override
	public void doCmn_itm_sub2_LC(MCEventInfo info) {
		super.doCmn_itm_sub2_LC(info);

		if (isNullOrNullVal(getCmnR().itm_sub2())) {
			setValueEx(Cmn_itm_sub3, null);
		}
		setItmNumSubMode();
	}

	@Override
	public void doCmn_itm_sub3_LC(MCEventInfo info) {
		super.doCmn_itm_sub3_LC(info);

		setItmNumSubMode();
	}

	/**
	 * 枝番のモードを設定する。
	 */
	protected void setItmNumSubMode() {
		setItmNumSubMode(CmnR.$itm_sub1, Cmn_itm_sub1);
		setItmNumSubMode(CmnR.$itm_sub2, Cmn_itm_sub2);
		setItmNumSubMode(CmnR.$itm_sub3, Cmn_itm_sub3);
	}

	/**
	 * 枝番のモードを設定する。
	 *
	 * @param name 項目名
	 * @param sub 枝番の GUI 部品
	 */
	protected void setItmNumSubMode(String name, MCModeBeans sub) {
		if (isDefaultModeEditable(sub)) {
			CmnR itm = getCmnR();
			boolean e = true;
			String[] a = {CmnR.$itm_sub1, CmnR.$itm_sub2, CmnR.$itm_sub3};
			for (String n : a) {
				if (isSame(name, n)) {
					break;
				}
				if (isNullOrNullVal(itm.getString(n))) {
					e = false;
					break;
				}
			}
			if (!e || isNullOrNullVal(itm.itm_cd()) || Cmn_itm_cd.getMode() == MCMode.READ_ONLY) {
				sub.setMode(MCMode.READ_ONLY);
			}
			else if (!isNull(itm.itm_nm())) {
				sub.setMode(MCMode.ENABLE);
			}
			else {
				setDefaultMode(sub);
			}
		}
	}

	@Override
	public void doCmn_itm_typ_d_cd_LC(MCEventInfo info) {
		super.doCmn_itm_typ_d_cd_LC(info);

		// 「addIgnoreListBeans」により区分値のみセットされた項目の名称設定
		if (isNull(getCmnR().slo_proc_typ())) {
			setValueEx(Cmn_slo_proc_typ_nm, null);
		}
		else {
			setValueEx(Cmn_slo_proc_typ_nm, MAC_SLO_PROC_TYP.get(getCmnR().slo_proc_typ()).name());
		}
		if (isNull(getCmnR().ship_inst_typ())) {
			setValueEx(Cmn_ship_inst_typ_nm, null);
		}
		else {
			setValueEx(Cmn_ship_inst_typ_nm, MAC_SHIP_INST_TYP.get(getCmnR().ship_inst_typ()).name());
		}
		if (!MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			setValueEx(Cmn_lot_mng_typ, MAC_LOT_MNG_TYP.NOT_MNG.value());
			setValueEx(Cmn_sublot_mng_typ, MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
		}
		if (isNull(getCmnR().sno1_mng_typ())) {
			setValueEx(Cmn_sno1_mng_typ_nm, null);
		}
		else {
			setValueEx(Cmn_sno1_mng_typ_nm,
					MAC_SNO_MNG_TYP.get(getCmnR().sno1_mng_typ()).name());
		}
		if (isNull(getCmnR().sno2_mng_typ())) {
			setValueEx(Cmn_sno2_mng_typ_nm, null);
		}
		else {
			setValueEx(Cmn_sno2_mng_typ_nm,
					MAC_SNO_MNG_TYP.get(getCmnR().sno2_mng_typ()).name());
		}
		if (isNull(getCmnR().sno3_mng_typ())) {
			setValueEx(Cmn_sno3_mng_typ_nm, null);
		}
		else {
			setValueEx(Cmn_sno3_mng_typ_nm,
					MAC_SNO_MNG_TYP.get(getCmnR().sno3_mng_typ()).name());
		}
		if (isNull(getCmnR().sno4_mng_typ())) {
			setValueEx(Cmn_sno4_mng_typ_nm, null);
		}
		else {
			setValueEx(Cmn_sno4_mng_typ_nm,
					MAC_SNO_MNG_TYP.get(getCmnR().sno4_mng_typ()).name());
		}

		setRegTargetMode();
	}
	@Override
	public void doCmn_slo_proc_flg_NC(MCEventInfo info) {
		super.doCmn_slo_proc_flg_NC(info);

		if (!getCmnR().slo_proc_flg()) {
			setValueEx(Cmn_slo_proc_typ, null);
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_slo_proc_typ_LC(MCEventInfo info) {
		super.doCmn_slo_proc_typ_LC(info);

		if (MAC_SLO_PROC_TYP.isPURC_DDLV(getCmnR().slo_proc_typ())) {
			setValueEx(Cmn_ship_inst_typ, MAC_SHIP_INST_TYP.NON.value());
		}
		setRegTargetMode();
	}

	@Override
	public void doCmn_arr_skip_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCmn_arr_skip_flg_NC(info);
		if (!getCmnR().arr_skip_flg()) {
			Cmn_purc_dlv_slip_flg.setValue(false);
		}
		setRegTargetMode();
	}

	@Override
	public void doSubDtl_NC(MCEventInfo info) {
		super.doSubDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getSubDtlL().get(info.getEventIndex());
		setDelBtnMode(row, SubBtn_rdel);
	}

	@Override
	public void doUnitDtl_NC(MCEventInfo info) {
		super.doUnitDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getUnitDtlL().get(info.getEventIndex());
		setDelBtnMode(row, UnitBtn_rdel);
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
	public void doCnd_reg_NC(MCEventInfo info) {
		super.doCnd_reg_NC(info);

		setRegTargetMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		setRegTargetMode();
		setItmNumSubMode();
	}
	@Override
	public void setUPD_ADMINStatus() {
//		if (getCmnR().release_flg()) {
//			setRELEASE_ADMINStatus();
//			setRegTargetMode();
//		}
//		else {
//			super.setUPD_ADMINStatus();
//			setRegTargetMode();
//		}
		super.setUPD_ADMINStatus();
		setRegTargetMode();
	}
	@Override
	public void setMODStatus() {
//		if (getCmnR().release_flg()) {
//			setRELEASEStatus();
//			setRegTargetMode();
//		}
//		else {
//			super.setMODStatus();
//			setRegTargetMode();
//		}
		super.setMODStatus();
		setRegTargetMode();
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		setRegTargetMode();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setRegTargetMode();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();

		setRegTargetMode();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();

		setRegTargetMode();
	}

	protected List<MCModeBeans> getGroupCol(MCContainer c, String grp, String key) {
		List<MCModeBeans> l = new ArrayList<>();
		Map<String, String> m = ((MCConstRow) c).getExtMap(grp);
		if (m != null && !m.isEmpty()) {
			for (Map.Entry<String, String> e : m.entrySet()) {
				if (Arrays.asList(e.getValue().split(";")).contains(key)) {
					l.add((MCModeBeans) getComponent((MCRow) c, e.getKey()));
				}
			}
		}
		return l;
	}

	/**
	 * 品目区分詳細ＣＤがnullの場合にデフォルト値設定対象項目を入力不可に設定
	 * ※あらかじめ各項目はデフォルトモードが設定されていること
	 */
	protected void setItmTypDGrpMode() {
		if (isNull(getCmnR().itm_typ_d_cd())) {
			for (MCModeBeans mb : getItmTypDGrpCols()) {
				mb.setMode(MCMode.READ_ONLY);
			}
		}
	}
	protected List<MCModeBeans> _itmTypDGrp;
	protected List<MCModeBeans> getItmTypDGrpCols() {
		if (_itmTypDGrp == null) {
			_itmTypDGrp = getGroupCol(getCmnR(), _INPT_CTL, _ITM_TYP_D_CD);
		}
		return _itmTypDGrp;
	}

	/**
	 * 架空品の場合に対象項目を入力不可に設定、それ以外はデフォルトモードを設定
	 */
	protected void setPhantomGrpMode() {
		if (MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			for (MCModeBeans mb : getPhantomGrpCols()) {
				mb.setMode(MCMode.READ_ONLY);
			}
		}
	}
	protected List<MCModeBeans> _phantomGrp;
	protected List<MCModeBeans> getPhantomGrpCols() {
		if (_phantomGrp == null) {
			_phantomGrp = getGroupCol(getCmnR(), _INPT_CTL, _PHANTOM);
		}
		return _phantomGrp;
	}
	
	protected void setBtnMode() {
		// 画面遷移ボタン制御
		setBtnModeByFlg(Btn_open_MABSP1120, isEnableBtn_open_MABSP1120());
		setBtnModeByFlg(Btn_open_MABSP1100, isEnableBtn_open_MABSP1100());
		setBtnModeByFlg(Btn_open_MABSP1110, isEnableBtn_open_MABSP1110());
		setBtnModeByFlg(Btn_open_MABSP1130, isEnableBtn_open_MABSP1130());
		setBtnModeByFlg(Btn_open_MABCP0840, isEnableBtn_open_MABCP0840());
		setBtnModeByFlg(Btn_open_MABCP0400, isEnableBtn_open_MABCP0400());
	}
	
	/**
	 * ボタンのモードを変更する。
	 * @param btn 処理対象のボタン
	 * @param isEnabled trueの場合、画面ステータスのデフォルトのモード。falseの場合、DISABLEモード。
	 */
	protected void setBtnModeByFlg(MCButton btn, boolean isEnabled) {
		if (isEnabled) {
			setDefaultMode(btn);
		}
		else {
			btn.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 販売品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1120() {
		return !MAC_ASSET_MNG_TYP.isPHANTOM(getCmnR().asset_mng_typ()) && !getCmnR().del_flg();
	}

	/**
	 * 製造品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1100() {
		return MAC_ASSET_MNG_TYP.isMNG(getCmnR().asset_mng_typ()) && !getCmnR().del_flg();
	}

	/**
	 * 購買品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1110() {
		return !MAC_ASSET_MNG_TYP.isPHANTOM(getCmnR().asset_mng_typ()) && !getCmnR().del_flg();
	}

	/**
	 * 検査品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1130() {
		return MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ()) && !getCmnR().del_flg();
	}

	/**
	 * 品目付加情報登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABCP0840() {
		return !MAC_ASSET_MNG_TYP.isPHANTOM(getCmnR().asset_mng_typ());
	}
	
	/**
	 * 品目リリース登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABCP0400() {
		return !getCmnR().del_flg();
	}


	@Override
	protected void setCellConfig() {
		UnitDtlTable.setCellConfig(createAppCellConfig());
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

			// 操作種別に対応するステータス
			// 訂正する：MOD（リリースフラグ＝オフ）、RELEASE（リリースフラグ＝オン）
			// 訂正する（管理者）：UPD_ADMIN（リリースフラグ＝オフ）、RELEASE_ADMIN（リリースフラグ＝オン）

			if (isUpdSts() || getStatus() == MOD || getStatus() == RELEASE || getStatus() == RELEASE_ADMIN) {
				// 登録済みデータはキー変更不可
				if (isExistingKey(index, column, table)) {
					return MCMode.READ_ONLY;
				}
			}
			if (table.getBaseTable() == UnitDtlTable) {
				UnitDtlR r = UnitDtlTable.getRow(index);

				if ((getStatus() == MOD || getStatus() == RELEASE) && !isNull(r.upd_cntr())) {
					if (column == columnUnitDtl_conv_base_qty || column == columnUnitDtl_conv_qty
							|| column == columnUnitDtl_dec_place || column == columnUnitDtl_rnd_typ 
							|| column == columnUnitDtl_pack_flg) {
						return MCMode.READ_ONLY;
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
			addColumnPathMap(SubDtlR.$sls_tax_cd, CmnR.$sls_tax_cd);
			addColumnPathMap(SubDtlR.$sls_tax_nm, CmnR.$sls_tax_nm);
			addColumnPathMap(SubDtlR.$purc_tax_cd, CmnR.$purc_tax_cd);
			addColumnPathMap(SubDtlR.$purc_tax_nm, CmnR.$purc_tax_nm);
			addColumnPathMap(SubDtlR.$prov_tax_cd, CmnR.$prov_tax_cd);
			addColumnPathMap(SubDtlR.$prov_tax_nm, CmnR.$prov_tax_nm);
			addColumnPathMap(SubDtlR.$sls_itm_grp_cd, CmnR.$sls_itm_grp_cd);
			addColumnPathMap(SubDtlR.$sls_itm_grp_nm, CmnR.$sls_itm_grp_nm);
			addColumnPathMap(SubDtlR.$wtax_rate, CmnR.$wtax_rate);
		}
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isBaseUnitFlg(this)) {
			setComponentInvisibleAllStatus(UnitPanel);
		}
	}
	
	//--------------------リストロジック表示制御Start-----------------------
	@Override
	public MCList getCmn_asset_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getAssetMngTyp(info));
		return super.getCmn_asset_mng_typ(row, info);
	}
	/**
	 * 表示する資産管理区分を取得する
	 */
	protected MAC_ASSET_MNG_TYP[] getAssetMngTyp(MCEventInfo info) {
		if (MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			return new MAC_ASSET_MNG_TYP[] { MAC_ASSET_MNG_TYP.PHANTOM };
		}
		if (MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ()) || MAC_STK_MNG_TYP.isNOT_MNG(getCmnR().stk_mng_typ())) {
			return new MAC_ASSET_MNG_TYP[] { MAC_ASSET_MNG_TYP.MNG,  MAC_ASSET_MNG_TYP.NOT_MNG};
		}
		return MAC_ASSET_MNG_TYP.array();
	}

	@Override
	public MCList getCmn_itm_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getItmTyp(info));
		return super.getCmn_itm_typ(row, info);
	}
	/**
	 * 表示する品目区分を取得する
	 */
	protected MAC_ITM_TYP[] getItmTyp(MCEventInfo info) {
		if (MAC_STK_MNG_TYP.isPHANTOM(getCmnR().stk_mng_typ())) {
			return new MAC_ITM_TYP[] { MAC_ITM_TYP.PHANTOM };
		}
		if (MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ()) || MAC_STK_MNG_TYP.isNOT_MNG(getCmnR().stk_mng_typ())) {
			return MCCollectionUtil.remove(MAC_ITM_TYP.array(), new MAC_ITM_TYP[0], MAC_ITM_TYP.PHANTOM);
		}
		return MAC_ITM_TYP.array();
	}

	@Override
	public MCList getCmn_sublot_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSublotMngTyp(info));
		return super.getCmn_sublot_mng_typ(row, info);
	}
	/**
	 * 表示するサブロット管理区分を取得する
	 */
	protected MAC_SUBLOT_MNG_TYP[] getSublotMngTyp(MCEventInfo info) {
		if (MAC_LOT_MNG_TYP.isNOT_MNG(getCmnR().lot_mng_typ())) {
			return new MAC_SUBLOT_MNG_TYP[] { MAC_SUBLOT_MNG_TYP.NOT_MNG, MAC_SUBLOT_MNG_TYP.STK };
		}
		return MAC_SUBLOT_MNG_TYP.array();
	}

	@Override
	public MCList getCmn_sno1_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, getCmnR().rqmt_sno1_flg()));
		return super.getCmn_sno1_num_typ(row, info);
	}
	@Override
	public MCList getCmn_sno2_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, getCmnR().rqmt_sno2_flg()));
		return super.getCmn_sno2_num_typ(row, info);
	}
	@Override
	public MCList getCmn_sno3_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, getCmnR().rqmt_sno3_flg()));
		return super.getCmn_sno3_num_typ(row, info);
	}
	@Override
	public MCList getCmn_sno4_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, getCmnR().rqmt_sno4_flg()));
		return super.getCmn_sno4_num_typ(row, info);
	}
	/**
	 * 表示する手配ＮＯ発番区分を取得する
	 */
	protected MAC_SNO_NO_TYP[] getSnoNumTyp(MCEventInfo info, boolean rqmtSnoFlg) {
		if (rqmtSnoFlg) {
			return new MAC_SNO_NO_TYP[] { MAC_SNO_NO_TYP.AUTO, MAC_SNO_NO_TYP.AUTO_MANU };
		}
		return MAC_SNO_NO_TYP.array();
	}

	@Override
	public MCList getCmn_slo_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSloProcTyp(info));
		return super.getCmn_slo_proc_typ(row, info);
	}
	/**
	 * 表示する受注手配区分を取得する
	 */
	protected MAC_SLO_PROC_TYP[] getSloProcTyp(MCEventInfo info) {
		if (MAC_STK_MNG_TYP.isNOT_MNG(getCmnR().stk_mng_typ())) {
			return new MAC_SLO_PROC_TYP[] { MAC_SLO_PROC_TYP.PURC_DDLV };
		}
		return MAC_SLO_PROC_TYP.array();
	}

	@Override
	public MCList getCmn_ship_inst_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getShipInstTyp(info));
		return super.getCmn_ship_inst_typ(row, info);
	}
	/**
	 * 表示する出荷指図区分を取得する
	 */
	protected MAC_SHIP_INST_TYP[] getShipInstTyp(MCEventInfo info) {
		if (MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ())) {
			return new MAC_SHIP_INST_TYP[] { MAC_SHIP_INST_TYP.PICK, MAC_SHIP_INST_TYP.NON };
		}
		return MAC_SHIP_INST_TYP.array();
	}

	@Override
	public MCList getCmn_sno1_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoMngTyp(info));
		return super.getCmn_sno1_mng_typ(row, info);
	}
	@Override
	public MCList getCmn_sno2_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoMngTyp(info));
		return super.getCmn_sno2_mng_typ(row, info);
	}
	@Override
	public MCList getCmn_sno3_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoMngTyp(info));
		return super.getCmn_sno3_mng_typ(row, info);
	}
	@Override
	public MCList getCmn_sno4_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoMngTyp(info));
		return super.getCmn_sno4_mng_typ(row, info);
	}
	/**
	 * 表示する手配ＮＯ管理区分を取得する
	 */
	protected MAC_SNO_MNG_TYP[] getSnoMngTyp(MCEventInfo info) {
		if (MAC_STK_MNG_TYP.isMNG(getCmnR().stk_mng_typ()) && getCmnR().sundry_itm_flg()) {
			return MCCollectionUtil.remove(MAC_SNO_MNG_TYP.array(),
					new MAC_SNO_MNG_TYP[0], MAC_SNO_MNG_TYP.MNG_NOT_STK);
		}
		return MAC_SNO_MNG_TYP.array();
	}

	//--------------------リストロジック表示制御End-----------------------

}