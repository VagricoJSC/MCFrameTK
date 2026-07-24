package mcframe.clientMSBF.MSBFP0110;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5290.*;
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
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_LotSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_LotSrch_MC extends MSBFP_LotSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_LotSrch_MC() {
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
	public MSBFP_LotSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBFL0110_Srch01();
	}
	/**
	 * [MS_MSBFL0110_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0110_Imp01Caller<P extends MSBFP_LotSrch, B extends MS_MSBFL0110_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBFL0110_Imp01Caller(P p, B b) {
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
		
	}


	/**
	 * [MS_MSBFL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0110_Srch01Caller<P extends MSBFP_LotSrch, B extends MS_MSBFL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_first_gr_dt_fr, Cnd_first_gr_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_vld_dt_fr, Cnd_vld_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_lmt_dt_fr, Cnd_lmt_dt_to));
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			// キーの変更前の値を保持
			for (RsltR r : bridge.down0()) {
				r.itm_cd_key(r.itm_cd());
				r.itm_sub1_key(r.itm_sub1());
				r.itm_sub2_key(r.itm_sub2());
				r.itm_sub3_key(r.itm_sub3());
				r.lot_no_key(r.lot_no());
				r.sublot_no_key(r.sublot_no());
			}
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
			fillSpace();
		}
	}

	/**
	 * [MS_MSBFL0110_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0110_Upd01Caller<P extends MSBFP_LotSrch, B extends MS_MSBFL0110_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0110_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0110_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0110_Del01Caller<P extends MSBFP_LotSrch, B extends MS_MSBFL0110_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0110_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP0010(r);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBFP0120(r);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0130(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBFP0130(r);
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
		if (isNull(r)) {
			return;
		}
		clearNotCopyCol(r.getGUIIndex());
	}
	protected void clearNotCopyCol(int index) {
		// 変更前キー項目のクリア
		RsltR r = getRsltL().get(index);
		r.itm_cd_key(null);
		r.itm_sub1_key(null);
		r.itm_sub2_key(null);
		r.itm_sub3_key(null);
		r.lot_no_key(null);
		r.sublot_no_key(null);
		r.lot_seq(null);
		r.schd_flg(false);
		r.stk_flg(false);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBFL0110_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBFL0110_Del01();
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
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}
	
	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		fillSpace();
	}
	
	// -----------------------------------------------
	// events
	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnRslt_itm_cd.addLCListener(this);
		columnRslt_itm_sub1.addLCListener(this);
		columnRslt_itm_sub2.addLCListener(this);
		columnRslt_itm_sub3.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == columnRslt_itm_cd
				|| lc == columnRslt_itm_sub1
				|| lc == columnRslt_itm_sub2
				|| lc == columnRslt_itm_sub3) {
			doRslt_itm_cd_LC(info);
		}
	}
	
	public void doRslt_itm_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return;
		}
		
		RsltR rsltR = getRsltL().get(idx);
		if (isNull(rsltR.itm_cd())) {
			rsltR.lot_no(null);
			rsltR.sublot_no(null);
		}
		if (MAC_LOT_MNG_TYP.isNOT_MNG(rsltR.lot_mng_typ())) {
			rsltR.lot_no(null);
		}
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(rsltR.sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isSTK(rsltR.sublot_mng_typ())) {
			rsltR.sublot_no(null);
		}
		else {
			if (MAC_STR.isNULL_VAL(rsltR.sublot_no())) {
				rsltR.sublot_no(null);
			}
		}
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public boolean doRslt_lot_no_VC(MCEventInfo info) {
		// ロットＮＯにNULL_VALが設定された場合はfalseを返して入力不可とする。
		if (!super.doRslt_lot_no_VC(info)) {
			return false;
		}

		int idx = info.getEventIndex();
		if (idx < 0) {
			return true;
		}
		
		RsltR rsltR = getRsltL().get(idx);
		if (MAC_SUBLOT_MNG_TYP.isDUPL_ABL(rsltR.sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isUNIQ(rsltR.sublot_mng_typ())) {
			if (isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean doRslt_sublot_no_VC(MCEventInfo info) {
		// サブロットＮＯにNULL_VALが設定された場合はfalseを返して入力不可とする。
		if (!super.doRslt_sublot_no_VC(info)) {
			return false;
		}

		if (isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}

		return true;
	}
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			// FIX（登録直後）、REF（参照種別）では、クリア確認出さない
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
		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL());

		// 種別に応じて入力不可となる項目をクリアする
		clearCnd();

		// 一覧をクリアしているためfillSpaceする
		fillSpace();

		// 一覧をクリアしているため検索前ステータスに戻す
		setSrchStatus();
		setStatusColumn();
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MSBEP0010(r)) {
				doBtn_open_MSBEP0010(r);
			}
		}
	}
	
	protected void doBtn_open_MSBEP0010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0010");	
		aso.putCnd(crtOpenMSBEP0010CndR(aso, r));	
		aso.putSearchAction();	
		aso.runValueInit();
		aso.show();
	}
	
	protected mcframe.clientMSBE.MSBEP0010.CndR crtOpenMSBEP0010CndR(MAUCP_AppScreenOpener aso, RsltR r) {	
		mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch p = (mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0010.CndR to = mcframe.clientMSBE.MSBEP0010.CndR.create();
		to.ope(p.Cnd_ope_STK.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		return to;
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
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		return to;
	}
	
	protected void doBtn_open_MSBFP0130(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0130");
		aso.putCnd(crtOpenMSBFP0130CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBF.MSBFP0130.CndR crtOpenMSBFP0130CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0130.CndR to = mcframe.clientMSBF.MSBFP0130.CndR.create();
		
		to.dupl_abl_flg(true);
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		return to;
	}
	
	protected void clearCnd() {
		// クリア項目なし
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
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setBtnMode();
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
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
				if (r.isStatusCreate() || isNull(r.itm_cd_key())) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
		
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP0010(r)) {
			setDefaultMode(Btn_open_MSBEP0010);
		}
		else {
			Btn_open_MSBEP0010.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBFP0120(r)) {
			setDefaultMode(Btn_open_MSBFP0120);
		}
		else {
			Btn_open_MSBFP0120.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBFP0130(r)) {
			setDefaultMode(Btn_open_MSBFP0130);
		}
		else {
			Btn_open_MSBFP0130.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 現状在庫一覧画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0010(RsltR r) {
		if (r == null) {
			return false;
		}
		return r.stk_flg();
	}
	
	/**
	 * ロットトレース（原因調査）画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0120(RsltR r) {
		if (r == null) {
			return false;
		}
		return Rslt_itm_p_PPanel.isItmFixLight(r.getGUIIndex());
	}
	
	/**
	 * ロットトレース（影響調査）画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0130(RsltR r) {
		if (r == null) {
			return false;
		}
		return Rslt_itm_p_PPanel.isItmFixLight(r.getGUIIndex());
	}
	
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			FoldTab.focusActiveFirstComponent();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setStatusColumn() {
		// 行ステータスカラムの表示非表示。登録・訂正種別では表示、それ以外は非表示
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
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
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}
	
	// -----------------------------------------------
	// CellConfig
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}
	
	/**
	 * 明細に優先して利用させるCellConfigを作成するメソッド
	 * 
	 * @return
	 */
	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}
	
	protected class RsltCellConfig extends mcframe.clientFXBA.FXBAP0080.FXBAP_CellConfig {
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			if (isUpdStatus()) {
				if (column == columnRslt_act_cont_fctr) {
					if (!r.cont_fctr_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_ver_no) {
					if (!r.ver_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_lot_no) {
					if (isNull(r.lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_sublot_no) {
					if (isNull(r.sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) 
							|| MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_vld_dt || column == columnRslt_lmt_dt) {
					if (!isNullAnd(r.vld_dt(), r.lmt_dt())) {
						return MCMode.REQUIRED;
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
		callMS_MSBFL0110_Imp01();
	}

}