package mcframe.clientMGBD.MGBDP0590;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5160.*;
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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ItmSlsReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ItmSlsReg_MC extends MGBDP_ItmSlsReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ItmSlsReg_MC() {
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
	public MGBDP_ItmSlsReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[Cnd]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * [MG_MGBDL0590_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0590_Srch01Caller<P extends MGBDP_ItmSlsReg, B extends MG_MGBDL0590_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0590_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
			msgList.addAll(checkAtLeastOne(Cnd_off_non_calc_flg, Cnd_on_non_calc_flg));
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
	 * [MG_MGBDL0590_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0590_Upd01Caller<P extends MGBDP_ItmSlsReg, B extends MG_MGBDL0590_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0590_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
		}
	}
	
	/**
	 * [MG_MGBDL0590_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0590_Del01Caller<P extends MGBDP_ItmSlsReg, B extends MG_MGBDL0590_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0590_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
		}
	}

	/**
	 * [MG_MGBDL0590_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0590_Imp01Caller<P extends MGBDP_ItmSlsReg, B extends MG_MGBDL0590_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBDL0590_Imp01Caller(P p, B b) {
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
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
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

		@Override
		protected void setModeMCEx(MCException ex) {
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0590_Srch01();
	}
	/**
	 * Panel[Calc]のボタン[calc]の押下時の処理
	 */
	@Override
	public void doCalc_calc(MCEventInfo info) {
		MCList<RsltR> tgtL = RsltTable.getViewRows().subList(r->r.check());
		MCMessageList msgList = calcCheck(tgtL);
		if (!msgList.isEmpty()){
			message(msgList);
			return ;
		}
		else {
			calcMain(tgtL);
			calcAfter();
		}
	}
	
	/**
	 * 新単価計算前のチェック処理
	 */
	protected MCMessageList calcCheck(MCList<RsltR> tgtL) {
		MCMessageList msgList = checkReq(getCalcR());
		msgList.addAll(checkPositive(Calc_percentage));
		if (tgtL.isEmpty()) {
			msgList.add(msgNoCheckedRow());
		}
		return msgList;
	}
	
	/**
	 * 新単価の計算処理
	 */
	protected void calcMain(MCList<RsltR> tgtL) {
		for (RsltR row : tgtL) {
			if (row.check()) {
				doCalc(row);
			}
		}
	}
	
	/**
	 * 引数で指定された行の新単価を計算する。
	 * @param tgt
	 */
	protected void doCalc(RsltR tgt) {
		if (isNull(tgt.upri_dec_place()) || isNull(tgt.upri())) {
			tgt.calc_upri(null);
			return ;
		}
		
		MCNumber per = getCalcR().percentage().divide(100);
		MAC_RND_TYP rndTyp = MAC_RND_TYP.get(getCalcR().rnd_typ());
		int scale = tgt.upri_dec_place().intValue();
		
		tgt.calc_upri(tgt.upri().multiply(per, scale, rndTyp.toMC()));
	}
 
	/**
	 * 新単価計算後の処理
	 */
	protected void calcAfter() {
		RsltTable.adjustWidth();
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
		copyRow(RsltTable);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cmn(MCEventInfo info) {
		callMG_MGBDL0590_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMG_MGBDL0590_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_cmn]の押下時の処理
	 */
	@Override
	public void doBtn_del_cmn(MCEventInfo info) {
		callMG_MGBDL0590_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMG_MGBDL0590_Del01();
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
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Rslt_base_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_upri_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_upri_dec_place);
		Rslt_calc_upri_p_PPanel.setRelateBeans(columnRslt_cur_cd, columnRslt_upri_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		initRegTgt();
		setValueEx(Cnd_on_non_calc_flg, true);
		setValueEx(Cnd_off_non_calc_flg, true);
	}

	protected void initRegTgt() {
		if (!Cnd_srch_wg.authorize()) {
			setValueEx(Cnd_wg_flg, false);
		}
		if (!Cnd_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
		}
		if (!Cnd_ope_REF.isSelected()) {
			if (getCndR().cmn_flg() && getCndR().wg_flg()) {
				setValueEx(Cnd_cmn_flg, false);
			}
			else if (!getCndR().cmn_flg() && !getCndR().wg_flg()) {
				if (Cnd_srch_wg.authorize()) {
					setValueEx(Cnd_wg_flg, true);
				}
				else if (Cnd_srch_cmn.authorize()) {
					setValueEx(Cnd_cmn_flg, true);
				}
			}
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
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
	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_ALL.isSelected()) {
			setSRCH_ALLStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_ALL.isSelected()) {
			setALLStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_DELStatus() {
		super.setSRCH_DELStatus();
		setStatusCom();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_ALLStatus() {
		super.setSRCH_ALLStatus();
		setStatusCom();
	}
	
	@Override
	public void setALLStatus() {
		super.setALLStatus();
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
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setStatusCom();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isAllStatus() {
		return isSame(getStatus(), ALL);
	}
	
	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus() || isAllStatus();
	}

	protected void setStatusCom() {
		setRegTgtMode();
		setModeByRegTgt();
		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
	}
	
	protected void setRegTgtMode() {
		if (!Cnd_srch_cmn.authorize() || !Cnd_srch_wg.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.READ_ONLY);
			Cnd_wg_flg.setMode(MCMode.READ_ONLY);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void setModeByRegTgt() {
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
			setDefaultMode(Btn_upd_wg);
			setDefaultMode(Btn_del_wg);
			Btn_upd_cmn.setMode(MCMode.INVISIBLE);
			Btn_del_cmn.setMode(MCMode.INVISIBLE);
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			setValueEx(Cnd_wg_nm, null);

			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			setDefaultMode(Btn_upd_cmn);
			setDefaultMode(Btn_del_cmn);
			Btn_upd_wg.setMode(MCMode.INVISIBLE);
			Btn_del_wg.setMode(MCMode.INVISIBLE);
		}
		boolean ref_or_wg_flg = Cnd_ope_REF.isSelected() || getCndR().wg_flg();
		setColModeByFlg(columnRslt_wg_cd, ref_or_wg_flg);
		setColModeByFlg(columnRslt_wg_nm, ref_or_wg_flg);
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
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
				// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
				if (!isNull(r.upd_cntr())) {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(Btn_rdel);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
	}
	
	/**
	 * 操作種別によるステータスカラムの表示・非表示切替
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}
	// -----------------------------------------------
	// Event
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Rslt_itm_p_PPanel.addItmLCListner(this);
	}

	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Rslt_itm_p_PPanel.isItm(lc)) {
			doRslt_itm_cd_LC(info);
		}
	}
	
	public void doRslt_itm_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);
		if (isNull(r.itm_cd())) {
			setValueEx(columnRslt_cur_cd,info.getEventIndex(),null);
		}
		else {
			setValueEx(columnRslt_cur_cd,info.getEventIndex(),getBaseCur().cur_cd());
		}
	}
	
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
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		initRegTgt();
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public boolean doCnd_cmn_flg_VC(MCEventInfo info) {
		if (!confirmRegDataClear()) {
			return false;
		}
		return super.doCnd_cmn_flg_VC(info);
	}
	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		clearContainers(getRsltL());
		setRegTgtValue(info);
		setSrchStatus();
	}
	
	@Override
	public boolean doCnd_wg_flg_VC(MCEventInfo info) {
		if (!confirmRegDataClear()) {
			return false;
		}
		return super.doCnd_wg_flg_VC(info);
	}
	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		clearContainers(getRsltL());
		setRegTgtValue(info);
		setSrchStatus();
	}

	protected void setRegTgtValue(MCEventInfo info) {
		if (info == null || Cnd_ope_REF.isSelected()) {
			return;
		}
		if (getCndR().cmn_flg() && getCndR().wg_flg()) {
			if (info.getComponent() == Cnd_cmn_flg) {
				getCndR().wg_flg(false);
			}
			else if (info.getComponent() == Cnd_wg_flg) {
				getCndR().cmn_flg(false);
			}
		}
	}
	// -----------------------------------------------
	// File input
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return Cnd_ope_UPD.isSelected();
		}
		return super.useFileIn(table);
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		if (Cnd_ope_UPD.isSelected()) {
			callMG_MGBDL0590_Imp01();
		}
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
	protected void checkCustomFileInAction(MCTable<?> table, MCList list, MCMessageList msgList) {
		super.checkCustomFileInAction(table, list, msgList);
		if (table == RsltTable) {

			msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));

			if (getCndR().cmn_flg()) {
				if (list.subList(r -> !isNull(((RsltR)r).wg_cd())).size() > 0) {
					msgList.add(msgRegTgtCmnInvalidCol(columnRslt_wg_cd));
				}
			}
		}
	}

	// -----------------------------------------------
	// CellConfig
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
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			if (isUpdStatus()) {
				if (!isNull(r.upd_cntr()) && isKeyColumn(column, r)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}