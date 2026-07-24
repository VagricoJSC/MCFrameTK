package mcframe.clientMSBA.MSBAP0030;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBAP_DmndListReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBAP_DmndListReg_MC extends MSBAP_DmndListReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBAP_DmndListReg_MC() {
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
	public MSBAP_DmndListReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_DTL]の押下時の処理
	 */
	@Override
	public void doBtn_open_DTL(MCEventInfo info) {
		RsltR rsltR = RsltTable.getSelectedMCRow();
		if(isNull(rsltR)) {
			return;
		}

		// 販売計画の場合
		if(MSC_DMND_TYP.isPLN_SLS(rsltR.dmnd_typ())) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP0110");
			mcframe.clientMSBB.MSBBP0110.MSBBP_MlySPlnReg mlySplnReg = (mcframe.clientMSBB.MSBBP0110.MSBBP_MlySPlnReg) aso.getPanel();
			mcframe.clientMSBB.MSBBP0110.CndR to = mcframe.clientMSBB.MSBBP0110.CndR.create();
			to.ref_spln_ym_fr(rsltR.dmnd_end_dt());
			to.ref_spln_ym_to(rsltR.dmnd_end_dt());
			to.ref_ym_fr(rsltR.ym());
			to.ref_ym_to(rsltR.ym());
			to.show_code_flg(true);
			to.show_name_flg(true);
			to.ref_spln_vers(rsltR.spln_vers());
			to.upd_ope(mlySplnReg.Cnd_upd_ope_SUM.getActionCommand());
			to.ope(mlySplnReg.Cnd_ope_REF.getActionCommand());
			aso.putCnd(to);
			aso.runValueInit();
			aso.putSearchAction();
			aso.show();				
		}
		// 顧客期間内示の場合
		else if (MSC_DMND_TYP.isCST_FRCST(rsltR.dmnd_typ())) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP0010");
			mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg sloReg = (mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg) aso.getPanel();
			mcframe.clientMSBB.MSBBP0010.CndR to = mcframe.clientMSBB.MSBBP0010.CndR.create();
			to.cst_frcst_no(rsltR.cst_frcst_no());
			to.ope(sloReg.Cnd_ope_REF.getActionCommand());
			aso.putCnd(to);
			aso.runValueInit();
			aso.putSearchAction();
			aso.show();	
		}
		// 受注・仮受注の場合
		else if (MSC_DMND_TYP.isSLO(rsltR.dmnd_typ())
				|| MSC_DMND_TYP.isPRE_SLO(rsltR.dmnd_typ())
		) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1210");
			mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg sloReg = (mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg) aso.getPanel();
			mcframe.clientMSBB.MSBBP1210.CndR to = mcframe.clientMSBB.MSBBP1210.CndR.create();
			to.srch_tgt_no(rsltR.slo_no());
			to.latest_flg(true);
			to.ope(sloReg.Cnd_ope_REF.getActionCommand());
			aso.putCnd(to);
			aso.runValueInit();
			aso.putSearchAction();
			aso.show();	
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBAP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBAP0040(MCEventInfo info) {
		RsltR rsltR = RsltTable.getSelectedMCRow();
		if(isNull(rsltR)) {
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBAP0040");
		mcframe.clientMSBA.MSBAP0040.MSBAP_DmndRecStsSrch dmndRecStsSrch = (mcframe.clientMSBA.MSBAP0040.MSBAP_DmndRecStsSrch) aso.getPanel();
		mcframe.clientMSBA.MSBAP0040.CndR to = mcframe.clientMSBA.MSBAP0040.CndR.create();
		to.dmnd_no(rsltR.dmnd_no());
		to.ope(dmndRecStsSrch.Cnd_ope_REF1.getActionCommand());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[upd02]の押下時の処理
	 */
	@Override
	public void doBtn_upd02(MCEventInfo info) {
		callMS_MSBAL0030_Upd02();
	}
	/**
	 * [MS_MSBAL0030_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Srch02Caller<P extends MSBAP_DmndListReg, B extends MS_MSBAL0030_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0030_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(DmndTypPanel));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_INSTStatus();
		}
	}

	/**
	 * [MS_MSBAL0030_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Upd02Caller<P extends MSBAP_DmndListReg, B extends MS_MSBAL0030_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBAL0030_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * [MS_MSBAL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Srch01Caller<P extends MSBAP_DmndListReg, B extends MS_MSBAL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(DmndTypPanel));
			msgList.addAll(checkBeforeAfter(Cnd_dmnd_dt_fr, Cnd_dmnd_dt_to));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			fillSpace();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
			fillSpace();
		}

	}

	/**
	 * [MS_MSBAL0030_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Imp01Caller<P extends MSBAP_DmndListReg, B extends MS_MSBAL0030_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBAL0030_Imp01Caller(P p, B b) {
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
			if (bridge.down0().subList(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()).size() > 0) {
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
	}

	/**
	 * [MS_MSBAL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Upd01Caller<P extends MSBAP_DmndListReg, B extends MS_MSBAL0030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBAL0030_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			
			setBtnMode();
		}
	}

	/**
	 * [MS_MSBAL0030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0030_Del01Caller<P extends MSBAP_DmndListReg, B extends MS_MSBAL0030_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBAL0030_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if(Cnd_ope_INST.isSelected()) {
			callMS_MSBAL0030_Srch02();
		}
		else {
			callMS_MSBAL0030_Srch01();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBAL0030_Srch01().execDL();
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
		RsltR r = copyRow(RsltTable);
		r.dmnd_no(null);
		r.dly_div_flg(false);
		r.dmnd_qty(r.input_qty());
		if(!isNull(r.dmnd_qty())) {
			r.rec_qty(MCNumber.ZERO);
		}
		r.ym(null);
		r.spln_vers(null);
		r.spln_itm_cd(null);
		r.spln_itm_nm(null);
		r.cur_cd(null);
		r.cur_nm(null);
		r.cst_frcst_no(null);
		r.cst_frcst_d_no(null);
		r.slo_no(null);
		r.slo_d_no(null);

		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBAL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBAL0030_Del01();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_input_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_dmnd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_rec_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_sno1_mng_typ,
				columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ,
				columnRslt_sno4_mng_typ);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_misc, true);
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			doBtn_open_DTL(info);
		}
	}
	
	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}

	protected void fillSpace() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.fillSpace();
		}
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setCndMode();
		setBtnMode();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setCndMode();
		setBtnMode();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setCndMode();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setCndMode() {
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
				if (isNull(r.dmnd_no())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
								
				setDefaultMode(Btn_rcopy);
			}
		}
		
		if (isUpdStatus() || isDelStatus() || isRefStatus()) {
			// 遷移ボタン
			if (r == null) {
				Btn_open_DTL.setMode(MCMode.DISABLE);
				Btn_open_MSBAP0040.setMode(MCMode.DISABLE);
			}
			else {
				// 月次販売計画、顧客期間内示、受注、仮受注の場合
				if(MSC_DMND_TYP.isPLN_SLS(r.dmnd_typ())
						|| MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ())
						|| MSC_DMND_TYP.isSLO(r.dmnd_typ())
						|| MSC_DMND_TYP.isPRE_SLO(r.dmnd_typ())
				) {
					setDefaultMode(Btn_open_DTL);
				}
				else {
					Btn_open_DTL.setMode(MCMode.DISABLE);
				}
				if(isNull(r.dmnd_no())) {
					Btn_open_MSBAP0040.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_open_MSBAP0040);					
				}
			}
		}
	}
	
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRefStatus() {
		return isSame(getStatus(), REF);
	}

	protected boolean isInstStatus() {
		return isSame(getStatus(), INST);
	}
	
	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_INST.isSelected()) {
			setSRCH_INSTStatus();
		}
		
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_INST.isSelected()) {
			setINSTStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}

	// -----------------------------------------------
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		setBtnMode();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（ファイル取込エラー時）、REF（検索モード）では、クリア確認出さない
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
		clearCnd();
		fillSpace();
		setSrchStatus();
		setStatusColumn();
	}

	protected void clearCnd() {
		if(Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_othr, false);
		}
	}
	
	protected void setStatusColumn() {
		// 行ステータスカラムの表示非表示。登録・訂正する種別では表示、それ以外は非表示
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	@Override
	public void doRslt_ship_term_cd_LC(MCEventInfo info) {
		super.doRslt_ship_term_cd_LC(info);
		setShipLt(info);
	}
	
	@Override
	public void doRslt_dmnd_lg_grp_cd_LC(MCEventInfo info) {
		super.doRslt_dmnd_lg_grp_cd_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!isNull(r)) {
			String shipTermCd = r.ship_term_cd();
			if (isNull(shipTermCd)) {
				setValueEx(columnRslt_ship_term_cd, info.getEventIndex(), MAC_STR.NULL_VAL.value());
			}
			else {
				setValueEx(columnRslt_ship_term_cd, info.getEventIndex(), null);
				setValueEx(columnRslt_ship_term_cd, info.getEventIndex(), shipTermCd);
			}
		}
	}
	
	@Override
	public void doRslt_to_lg_grp_cd_LC(MCEventInfo info) {
		super.doRslt_to_lg_grp_cd_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!isNull(r)) {
			String shipTermCd = r.ship_term_cd();
			if (isNull(shipTermCd)) {
				setValueEx(columnRslt_ship_term_cd, info.getEventIndex(), MAC_STR.NULL_VAL.value());
			}
			else {
				setValueEx(columnRslt_ship_term_cd, info.getEventIndex(), null);
				setValueEx(columnRslt_ship_term_cd, info.getEventIndex(), shipTermCd);
			}
		}
	}
	
	@Override
	public void doRslt_bp_ship_lt_LC(MCEventInfo info) {
		super.doRslt_bp_ship_lt_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!isNull(r)) {
			// 納品先が指定されていない場合は取引先マスタの出荷ＬＴ（需要情報用）をＬＴとして使用する
			if (isNull(r.dlv_cd())) {
				setValueEx(columnRslt_ship_lt, info.getEventIndex(), r.bp_ship_lt());
			}
		}
	}
	
	@Override
	public void doRslt_ship_lt_LC(MCEventInfo info) {
		super.doRslt_ship_lt_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!isNull(r)) {
			if (!isNull(r.dmnd_st_dt())) {
				MCDate dt = r.dmnd_st_dt().addDay(nvl(r.ship_lt(), MCNumber.ZERO));
				r.dmnd_dt(dt);
				r.dlv_schd_st_dt(dt);
				r.dlv_schd_end_dt(dt);
			}
			else if (!isNull(r.dmnd_dt())) {
				MCDate dt = r.dmnd_dt().addDay(nvl(r.ship_lt(), MCNumber.ZERO).negate());
				r.dmnd_st_dt(dt);
				r.dmnd_end_dt(dt);
			}
		}
	}
	
	protected void setShipLt(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (!isNull(r)) {
			if (!isNull(r.dmnd_lg_grp_cd()) && !isNull(r.to_lg_grp_cd())) {
				if (isNull(r.ship_term_cd())) {
					MCRow row = MCRow.create();
					row.addStringColumn("fr_lg_grp_cd", r.dmnd_lg_grp_cd());
					row.addStringColumn("to_lg_grp_cd", r.to_lg_grp_cd());
					row.addStringColumn("ship_term_cd", MAC_STR.NULL_VAL.value());
					MCList<MCRow> shipLtL = ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgCtl(row, info);
					if (!shipLtL.isEmpty()) {
						MCRow shipLtR = shipLtL.get(0);
						if (!shipLtR.getBoolean("non_dmnd_lt_flg")) {
							setValueEx(columnRslt_ship_lt, info.getEventIndex(), shipLtR.getNumber("xfr_lt"));
						}
						else {
							setValueEx(columnRslt_ship_lt, info.getEventIndex(), MCNumber.ZERO);
						}
					}
					else {
						setValueEx(columnRslt_ship_lt, info.getEventIndex(), MCNumber.ZERO);
					}
				}
				else {
					MCRow row = MCRow.create();
					row.addStringColumn("fr_lg_grp_cd", r.dmnd_lg_grp_cd());
					row.addStringColumn("to_lg_grp_cd", r.to_lg_grp_cd());
					row.addStringColumn("ship_term_cd", r.ship_term_cd());
					MCList<MCRow> shipLtL = ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgCtl(row, info);
					if (shipLtL.isEmpty()) {
						row.setString("ship_term_cd", MAC_STR.NULL_VAL.value());
						shipLtL = ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgCtl(row, info);
					}
					if (!shipLtL.isEmpty()) {
						MCRow shipLtR = shipLtL.get(0);
						if (!shipLtR.getBoolean("non_dmnd_lt_flg")) {
							setValueEx(columnRslt_ship_lt, info.getEventIndex(), shipLtR.getNumber("xfr_lt"));
						}
						else {
							setValueEx(columnRslt_ship_lt, info.getEventIndex(), MCNumber.ZERO);
						}
					}
					else {
						setValueEx(columnRslt_ship_lt, info.getEventIndex(), MCNumber.ZERO);
					}
				}
			}
			else {
				setValueEx(columnRslt_ship_lt, info.getEventIndex(), nvl(r.bp_ship_lt(), MCNumber.ZERO));
			}
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		columnRslt_input_qty.addLCListener(this);
		Rslt_itm_p_PPanel.addItmLCListner(this);
		columnRslt_dmnd_dpt_cd.addLCListener(this);
		columnRslt_dlv_cd.addLCListener(this);
		
		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(RsltTable, createRsltListListener());
	}
	
	protected MAUDP_RowListener createRsltListListener() {
		return new RsltListRowListener();
	}
	
	protected class RsltListRowListener extends MAUDP_RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				RsltR rsltR = (RsltR)r;
				if(isNull(rsltR.dmnd_typ())) {
					setValueEx(columnRslt_dmnd_typ, r.getGUIIndex(), MSC_DMND_TYP.MISC.value());
				}
				if(isNull(rsltR.dmnd_period_typ())) {
					setValueEx(columnRslt_dmnd_period_typ, r.getGUIIndex(), MAC_PERIOD_TYP.DAILY.value());
				}
			}
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		int idx = info.getEventIndex();

		if (lc == columnRslt_input_qty) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if(!isNull(rsltR)) {
				if(isNull(rsltR.input_qty())) {
					rsltR.dmnd_qty(null);
					rsltR.rec_qty(null);
				}
				else {
					rsltR.dmnd_qty(rsltR.input_qty());
					rsltR.rec_qty(MCNumber.ZERO);
				}
			}
		}
		else if (Rslt_itm_p_PPanel.isItm(lc)
				|| lc == columnRslt_dmnd_dpt_cd
				|| lc == columnRslt_dlv_cd
		) {
			setValueEx(columnRslt_dmnd_loc_cd, idx, null);
		}
		else if (lc == columnRslt_dmnd_dt) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if(!isNull(rsltR)) {
				rsltR.dlv_schd_st_dt(rsltR.dmnd_dt());
				rsltR.dlv_schd_end_dt(rsltR.dmnd_dt());
				if (!isNull(rsltR.dmnd_dt())) {
					MCDate dt = rsltR.dmnd_dt().addDay(nvl(rsltR.ship_lt(), MCNumber.ZERO).negate());
					rsltR.dmnd_st_dt(dt);
					rsltR.dmnd_end_dt(dt);
				}
			}
		}
		else if (lc == columnRslt_dmnd_st_dt) {
			RsltR rsltR = getRsltL().get(info.getEventIndex());
			if(!isNull(rsltR)) {
				rsltR.dmnd_end_dt(rsltR.dmnd_st_dt());
				if (!isNull(rsltR.dmnd_st_dt())) {
					MCDate dt = rsltR.dmnd_st_dt().addDay(nvl(rsltR.ship_lt(), MCNumber.ZERO));
					rsltR.dmnd_dt(dt);
					rsltR.dlv_schd_st_dt(dt);
					rsltR.dlv_schd_end_dt(dt);
				}
			}
		}
	}
	
	@Override
	public MCTable<RsltR> getListRegTable() {
		return RsltTable;
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
			if (isUpdStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);
				
				if(MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				
				if(columnRslt_dmnd_loc_cd == column) {
					if(!Rslt_itm_p_PPanel.isItmFixLight(index) || isNull(r.dmnd_dpt_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (isDelStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);
				
				if(MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (isInstStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);
				
				if(columnRslt_dmnd_date_div_mons == column) {
					if(!r.dly_div_flg()) {
						return MCMode.ENABLE;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	@Override
	protected boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBAL0030_Imp01();
	}
	
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}
	
	@Override
	protected void changeFileInRowStatus() {
		for (RsltR r : getRsltL()) {
			if (!isNull(r.dmnd_no())) {
				r.setStatus(MCRow.MODIFY);
			}
		}
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		linkBeansToISPanelCustom(Cnd_cst_cd, true);
		linkBeansToISPanelCustom(Cnd_dlv_cd, true);
	}

}