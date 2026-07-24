package mcframe.clientMGBB.MGBBP0210;

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
import mcframe.clientMAUB.MAUBP5040.*;
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
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueSplit;
import mcframe.clientCore.beans.list.MCListType;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_StStkReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_StStkReg_MC extends MGBBP_StStkReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_StStkReg_MC() {
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
	public MGBBP_StStkReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0210_Srch01Caller<P extends MGBBP_StStkReg, B extends MG_MGBBL0210_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0210_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkAtLeastOne(Cnd_std_bf_flg, Cnd_std_af_flg));
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
	 * [MG_MGBBL0210_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0210_Upd01Caller<P extends MGBBP_StStkReg, B extends MG_MGBBL0210_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0210_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0210_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0210_Upd02Caller<P extends MGBBP_StStkReg, B extends MG_MGBBL0210_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0210_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}
	}

	/**
	 * [MG_MGBBL0210_Upd03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0210_Upd03Caller<P extends MGBBP_StStkReg, B extends MG_MGBBL0210_Upd03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0210_Upd03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_std_bf_flg, Cnd_std_af_flg));
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}
	}

	/**
	 * [MG_MGBBL0210_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0210_Del01Caller<P extends MGBBP_StStkReg, B extends MG_MGBBL0210_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0210_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0210_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0210_Del02Caller<P extends MGBBP_StStkReg, B extends MG_MGBBL0210_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0210_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getDelCndR()));
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true ;
		}
	}

	/**
	 * [MG_MGBBL0210_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0210_Imp01Caller<P extends MGBBP_StStkReg, B extends MG_MGBBL0210_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBBL0210_Imp01Caller(P p, B b) {
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
				if (!r.std_flg()) {
					r.check(true);
				}
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
		callMG_MGBBL0210_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0230]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0230(MCEventInfo info) {
		doBtn_open_MGBBP0230();
	}
	protected void doBtn_open_MGBBP0230() {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0230");
		mcframe.clientMGBB.MGBBP0230.CndR to = mcframe.clientMGBB.MGBBP0230.CndR.create();
		to.calc_grp_cd(getCndR().calc_grp_cd());
		to.ym_fr(getCndR().ym_fr());
		to.ym_to(getCndR().ym_to());
		to.wg_cd(getCndR().wg_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBBL0210_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd2]の押下時の処理
	 */
	@Override
	public void doBtn_upd2(MCEventInfo info) {
		callMG_MGBBL0210_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[upd3]の押下時の処理
	 */
	@Override
	public void doBtn_upd3(MCEventInfo info) {
		callMG_MGBBL0210_Upd03();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBBL0210_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_bulk]の押下時の処理
	 */
	@Override
	public void doBtn_del_bulk(MCEventInfo info) {
		callMG_MGBBL0210_Del02();
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
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_cc.init(this, RsltTable);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		_cc.setSum(RsltR.$ttl);
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ()) || MAC_EXPNS_TYP.isSPPL(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		Color expnsEnableColor = getExpnsEnableColor(this);
		Color expnsGColor = getExpnsGSubTtlColor(this);
		cc.putColumnBG(_cc.getExpnsColumnConfigs(), MCMode.ENABLE, expnsEnableColor);
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), expnsGColor);
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(Cnd_std_af_flg, true);
		setValueEx(Cnd_std_bf_flg, true);
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}
		displayColumn();
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
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getRsltL()) {
			list.add(RsltR.$st_stk_key);
			list.add(RsltR.$std_flg);
		}
		return list;
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setSRCH_DELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setSRCH_REFStatus();
		}
		else if (Cnd_ope_DELBULK.isSelected()) {
			setDEL_BULKStatus();
		}
		else if (Cnd_ope_CNG.isSelected()) {
			setSRCH_CNGStatus();
		}
		else if (Cnd_ope_CNGBULK.isSelected()) {
			setCNG_BULKStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_ope_CNG.isSelected()) {
			setCNGStatus();
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
	public void setDEL_BULKStatus() {
		super.setDEL_BULKStatus();
		setStatusCom();
	}

	@Override
	public void setCNGStatus() {
		super.setCNGStatus();
		setStatusCom();
	}

	@Override
	public void setCNG_BULKStatus() {
		super.setCNG_BULKStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isCngStatus() {
		return isSame(getStatus(), CNG);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus() || isCngStatus();
	}

	protected void setStatusCom() {
		setTabMode();

		setStatusColumn();
		setFocus();
		fillSpace();
		setBtnMode();
		cngEvalTypMode();

		displayColumn();
		setComboMode();
	}

	protected void setComboMode() {
		if (Cnd_ope_CNG.isSelected() || Cnd_ope_CNGBULK.isSelected()) {
			setPluralValueEnable(Cnd_calc_grp_cd, false);
			Cnd_calc_grp_cd.setListType(MCListType.STRICT);
			setPluralValueEnable(Cnd_wg_cd, Cnd_ope_CNGBULK.isSelected());
			Cnd_wg_cd.setListType(MCListType.STRICT);

			setValueEx(Cnd_ym_to, getCndR().ym_fr());
			String[] calcGrps = arrayValueSplit(getCndR().calc_grp_cd());
			if (calcGrps.length > 1) {
				setValueEx(Cnd_calc_grp_cd, calcGrps[0]);
			}
			if (Cnd_ope_CNG.isSelected()) {
				String[] wgs = arrayValueSplit(getCndR().wg_cd());
				if (wgs.length > 1) {
					setValueEx(Cnd_wg_cd, wgs[0]);
				}
			}
		}
		else {
			setPluralValueEnable(Cnd_calc_grp_cd, true);
			Cnd_calc_grp_cd.setListType(MCListType.FREE);
			setPluralValueEnable(Cnd_wg_cd, true);
			Cnd_wg_cd.setListType(MCListType.FREE);
		}
	}

	protected void setTabMode() {
		if (Cnd_ope_DELBULK.isSelected()) {
			setTabComponentEnable(FoldTab, Tab4Panel);
		}
		else  {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel);
		}
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

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBBP0230, isEnableBtn_open_MGBBP0230(r));
	}

	/**
	 * 月初在庫改定差異一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBBP0230(RsltR r) {
		return true;
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
		setStatusCom();
		clearNm();
	}
	protected void clearNm() {
		if (Cnd_ope_CNG.isSelected() || Cnd_ope_CNGBULK.isSelected()) {
			if (isNull(getCndR().calc_grp_cd()) && !isNull(getCndR().calc_grp_nm())) {
				setValueEx(Cnd_calc_grp_nm, null);
			}
			if (isNull(getCndR().wg_cd()) && !isNull(getCndR().wg_nm())) {
				setValueEx(Cnd_wg_nm, null);
			}
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
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
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		super.doCnd_bp_cd_LC(info);
		if (!isNull(getCndR().bp_cd())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}
	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
		super.doCnd_bp_nm_LC(info);
		if (!isNull(getCndR().bp_nm())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_except_oth_flg_NC(MCEventInfo info) {
		super.doCnd_except_oth_flg_NC(info);
		if (getCndR().except_oth_flg()) {
			setValueEx(Cnd_asst_typ, null);
		}
	}
	@Override
	public void doCnd_asst_typ_LC(MCEventInfo info) {
		super.doCnd_asst_typ_LC(info);
		if (!isNull(getCndR().asst_typ())) {
			setValueEx(Cnd_except_oth_flg, false);
		}
	}

	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		cngEvalTypMode();
	}
	@Override
	public void doCnd_ym_fr_LC(MCEventInfo info) {
		super.doCnd_ym_fr_LC(info);
		if (Cnd_ope_CNG.isSelected() || Cnd_ope_CNGBULK.isSelected()) {
			getCndR().ym_to(getCndR().ym_fr());
		}
		cngEvalTypMode();
	}
	@Override
	public void doCnd_ym_to_LC(MCEventInfo info) {
		super.doCnd_ym_to_LC(info);
		cngEvalTypMode();
	}
	protected void cngEvalTypMode() {
		if (isCngEvalTypMode() && chkCndCalcGOnlyOne() && chkCndYmFrToSame()) {
			Cnd_eval_typ.setMode(MCMode.ENABLE);
		}
		else {
			setValueEx(Cnd_eval_typ, null);
			Cnd_eval_typ.setMode(MCMode.READ_ONLY);
		}
	}
	protected boolean isCngEvalTypMode() {
		return !Cnd_ope_DEL.isSelected();
	}
	protected boolean chkCndCalcGOnlyOne() {
		return arrayValueSplit(getCndR().calc_grp_cd()).length == 1 && !getCndR().calc_grp_cd().contains("%")
				&& !getCndR().calc_grp_cd().contains("_");
	}
	protected boolean chkCndYmFrToSame() {
		return !isNullOr(getCndR().ym_fr(), getCndR().ym_to()) && isSame(getCndR().ym_fr(), getCndR().ym_to());
	}

	@Override
	public void doRslt_bp_cd_LC(MCEventInfo info) {
		super.doRslt_bp_cd_LC(info);
		setValueEx(columnRslt_asst_typ, info.getEventIndex(), null);
	}

	@Override
	public void doRslt_asst_typ_LC(MCEventInfo info) {
		super.doRslt_asst_typ_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (isNull(r.asst_typ()) || MAC_ASST_TYP.isOTH(r.asst_typ())) {
			setValueEx(columnRslt_repurc_obli_flg, info.getEventIndex(), false);
		}
	}

	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		_cc.displayColumn();
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
	protected void setFileInStatus(MCRow r) {
		super.setFileInStatus(r);
		if (!isNull(r.getNumber(RsltR.$st_stk_key))) {
			r.setStatus(MCRow.Status.MODIFY);
		}
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		if (Cnd_ope_UPD.isSelected()) {
			callMG_MGBBL0210_Imp01();
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

	// -----------------------------------------------
	// ListLogic Custom
	@Override
	public MCList getRslt_asst_typ(MCRow row, MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (isNull(r.bp_cd())) {
			addListLogicCnd(row, getAsstTyp(info));
		}
		return super.getRslt_asst_typ(row, info);
	}
	protected MAC_ASST_TYP[] getAsstTyp(MCEventInfo info) {
		return new MAC_ASST_TYP[] { MAC_ASST_TYP.CO_PROD, MAC_ASST_TYP.CO_SLS };
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
			if (Cnd_ope_CNG.isSelected() && column == columnRslt_check) {
				if (MAC_ASST_TYP.isOTH(r.asst_typ()) || r.repurc_obli_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (r.std_flg()) {
				if (!Cnd_ope_CNG.isSelected()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_repurc_obli_flg) {
				if (isNull(r.bp_cd()) || isNull(r.asst_typ()) || MAC_ASST_TYP.isOTH(r.asst_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}

		@Override
		protected boolean isAmtColumn(MCColumnConfig column) {
			RsltR r = RsltR.create();
			return r.getKeys("ELM").contains(column.getBaseRowColumnName())
					|| column == columnRslt_ttl;
		}
		@Override
		protected MCNumber getAmtDecPlace(int index, MCColumnConfig column) {
			return getBaseCur().amt_dec_place();
		}
	}

}