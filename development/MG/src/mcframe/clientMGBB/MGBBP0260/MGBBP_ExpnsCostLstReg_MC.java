package mcframe.clientMGBB.MGBBP0260;

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
import mcframe.clientMAUB.MAUBP5050.*;
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
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBBP_ExpnsCostLstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_ExpnsCostLstReg_MC extends MGBBP_ExpnsCostLstReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ExpnsCostLstReg_MC() {
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
	public MGBBP_ExpnsCostLstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0260_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Srch01Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0260_Srch01Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBBL0260_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Srch02Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0260_Srch02Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBBL0260_Srch03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Srch03Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0260_Srch03Caller(P p, B b) {
			super(p, b);
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
	 * [MG_MGBBL0260_Srch04]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Srch04Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBBL0260_Srch04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void showNoDownDataMsg() {
			// 表示しない
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setScreenAsync(false);
		}

	}

	/**
	 * [MG_MGBBL0260_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Upd01Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0260_Upd01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MG_MGBBL0260_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Upd02Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0260_Upd02Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MG_MGBBL0260_Upd03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Upd03Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Upd03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0260_Upd03Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MG_MGBBL0260_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Del01Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0260_Del01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MG_MGBBL0260_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Del02Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0260_Del02Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MG_MGBBL0260_Del03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Del03Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Del03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBBL0260_Del03Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MG_MGBBL0260_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Imp01Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBBL0260_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg(bridge.down0())) {
				setFIX_INPTStatus();
			}
			else {
				setUPD_INPTStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
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
			setFIX_INPTStatus();
		}

	}

	/**
	 * [MG_MGBBL0260_Imp02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Imp02Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Imp02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBBL0260_Imp02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg(bridge.down0())) {
				setFIX_IOStatus();
			}
			else {
				setUPD_IOStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
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
			setFIX_IOStatus();
		}

	}

	/**
	 * [MG_MGBBL0260_Imp03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Imp03Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Imp03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MG_MGBBL0260_Imp03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg(bridge.down0())) {
				setFIX_SLSStatus();
			}
			else {
				setUPD_SLSStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
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
			setFIX_SLSStatus();
		}

	}

	/**
	 * [MG_MGBBL0260_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Ins01Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Ins01Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0260_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0260_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Ins02Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Ins02Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0260_Ins02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MG_MGBBL0260_Ins03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0260_Ins03Caller<P extends MGBBP_ExpnsCostLstReg, B extends MG_MGBBL0260_Ins03Bridge> extends mcframe.clientMGUD.MGUDP0010.MGUDP_FileUpdater<P, B> {

		protected MG_MGBBL0260_Ins03Caller(P p, B b) {
			super(p, b);
		}
	}

	protected boolean hasNg(MCList<RsltR> l) {
		return !isNull(l.getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()));
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_tar_INPT.isSelected()) {
			callMG_MGBBL0260_Srch01();
		}
		else if (Cnd_tar_IO.isSelected()) {
			callMG_MGBBL0260_Srch02();
		}
		else if (Cnd_tar_SLS.isSelected()) {
			callMG_MGBBL0260_Srch03();
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
		doDeselectAll(RsltTable);
	}

	/**
	 * Panel[Btn]のボタン[upd_inpt]の押下時の処理
	 */
	@Override
	public void doBtn_upd_inpt(MCEventInfo info) {
		callMG_MGBBL0260_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[upd_io]の押下時の処理
	 */
	@Override
	public void doBtn_upd_io(MCEventInfo info) {
		callMG_MGBBL0260_Upd02();
	}

	/**
	 * Panel[Btn]のボタン[upd_sls]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sls(MCEventInfo info) {
		callMG_MGBBL0260_Upd03();
	}

	/**
	 * Panel[Btn]のボタン[ins_in_file_inpt]の押下時の処理
	 */
	@Override
	public void doBtn_ins_in_file_inpt(MCEventInfo info) {
		callMG_MGBBL0260_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[ins_in_file_io]の押下時の処理
	 */
	@Override
	public void doBtn_ins_in_file_io(MCEventInfo info) {
		callMG_MGBBL0260_Ins02();
	}

	/**
	 * Panel[Btn]のボタン[ins_in_file_sls]の押下時の処理
	 */
	@Override
	public void doBtn_ins_in_file_sls(MCEventInfo info) {
		callMG_MGBBL0260_Ins03();
	}

	/**
	 * Panel[Btn]のボタン[del_inpt]の押下時の処理
	 */
	@Override
	public void doBtn_del_inpt(MCEventInfo info) {
		callMG_MGBBL0260_Del01();
	}

	/**
	 * Panel[Btn]のボタン[del_io]の押下時の処理
	 */
	@Override
	public void doBtn_del_io(MCEventInfo info) {
		callMG_MGBBL0260_Del02();
	}

	/**
	 * Panel[Btn]のボタン[del_sls]の押下時の処理
	 */
	@Override
	public void doBtn_del_sls(MCEventInfo info) {
		callMG_MGBBL0260_Del03();
	}

	// -----------------------------------------------
	// init-screen

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
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
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_trd_amt_p_PPanel.setRelateBeans(columnRslt_sls_trd_cur_cd, columnRslt_sls_trd_amt_dec_place);
		Rslt_amt_p_PPanel.setRelateBeans(Cnd3_cur_cd, Cnd3_amt_dec_place);
	}

	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/** * カラム制御クラスの初期化 */
	protected void initCCInfo() {
		_cc.init(this, RsltTable);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		_cc.setSum(RsltR.$ttl);
		_cc.setUpri(RsltR.$qty, RsltR.$upri);
	}

	/** 表示する費目項目 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())) {
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
		cc.putColumnBG(_cc.getExpnsColumnConfigs(), expnsEnableColor);
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), expnsGColor);
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setDefaultYm();
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
		setValueEx(Cnd3_cur_cd, getBaseCur().cur_cd());
		setValueEx(Cnd3_amt_dec_place, getBaseCur().amt_dec_place());

		displayColumn();
	}

	/** 対象年月の初期値設定 */
	protected void setDefaultYm() {
		callMG_MGBBL0260_Srch04();
		MCDate ym = getCndR().default_ym();
		if (isNull(ym)) {
			mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
			if (term != null) {
				setValueEx(Cnd_ym, term.term());
				setValueEx(Cnd2_ym, term.term());
				setValueEx(Cnd3_ym, term.term());
			}
		}
		else {
			setValueEx(Cnd_ym, ym.addMonth(1));
			setValueEx(Cnd2_ym, ym.addMonth(1));
			setValueEx(Cnd3_ym, ym.addMonth(1));
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndPanel.focusFirstComponent();
	}

	// -----------------------------------------------
	// Event

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!confirmClear()) {
			return false;
		}
		return super.doCnd_ope_VC(info);
	}

	@Override
	public boolean doCnd_tar_VC(MCEventInfo info) {
		if (!confirmClear()) {
			return false;
		}
		return super.doCnd_tar_VC(info);
	}

	protected boolean confirmClear() {
		if (isRegStatus() && !isStatusNone(getRsltL())) {
			return confirmRegDataClear();
		}
		return true;
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isDelStatus();
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD_INPT) || isSame(getStatus(), UPD_IO) || isSame(getStatus(), UPD_SLS);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL_INPT) || isSame(getStatus(), DEL_IO) || isSame(getStatus(), DEL_SLS);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		setStatusCom();
	}

	@Override
	public void doCnd_tar_NC(MCEventInfo info) {
		super.doCnd_tar_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		setStatusCom();
	}

	@Override
	public void doCnd_asst_typ_LC(MCEventInfo info) {
		super.doCnd_asst_typ_LC(info);
		if (!isNull(getCndR().asst_typ())) {
			setValueEx(Cnd_except_other_flg, false);
		}
	}

	@Override
	public void doCnd_except_other_flg_NC(MCEventInfo info) {
		super.doCnd_except_other_flg_NC(info);
		if (getCndR().except_other_flg()) {
			setValueEx(Cnd_asst_typ, null);
		}
	}

	@Override
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_cd_LC(info);
		if (!isNull(getCndR().ac_rsn_cd())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_nm_LC(info);
		if (!isNull(getCndR().ac_rsn_nm())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd_no_ac_rsn_flg_NC(info);
		if (getCndR().no_ac_rsn_flg()) {
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);
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
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);
		if (getCndR().no_bp_flg()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}

	@Override
	public void doCnd_stk_bp_cd_LC(MCEventInfo info) {
		super.doCnd_stk_bp_cd_LC(info);
		if (!isNull(getCndR().stk_bp_cd())) {
			setValueEx(Cnd_no_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd_stk_bp_nm_LC(MCEventInfo info) {
		super.doCnd_stk_bp_nm_LC(info);
		if (!isNull(getCndR().stk_bp_nm())) {
			setValueEx(Cnd_no_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd_no_stk_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_stk_bp_flg_NC(info);
		if (getCndR().no_stk_bp_flg()) {
			setValueEx(Cnd_stk_bp_cd, null);
			setValueEx(Cnd_stk_bp_nm, null);
		}
	}

	@Override
	public void doCnd_rec_eval_typ_LC(MCEventInfo info) {
		super.doCnd_rec_eval_typ_LC(info);
		if (!isNull(getCndR().rec_eval_typ())) {
			setValueEx(Cnd_no_rec_eval_typ_flg, false);
		}
	}

	@Override
	public void doCnd_no_rec_eval_typ_flg_NC(MCEventInfo info) {
		super.doCnd_no_rec_eval_typ_flg_NC(info);
		if (getCndR().no_rec_eval_typ_flg()) {
			setValueEx(Cnd_rec_eval_typ, null);
		}
	}

	@Override
	public void doCnd2_ac_rsn_cd_LC(MCEventInfo info) {
		super.doCnd2_ac_rsn_cd_LC(info);
		if (!isNull(getCnd2R().ac_rsn_cd())) {
			setValueEx(Cnd2_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd2_ac_rsn_nm_LC(MCEventInfo info) {
		super.doCnd2_ac_rsn_nm_LC(info);
		if (!isNull(getCnd2R().ac_rsn_nm())) {
			setValueEx(Cnd2_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd2_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd2_no_ac_rsn_flg_NC(info);
		if (getCnd2R().no_ac_rsn_flg()) {
			setValueEx(Cnd2_ac_rsn_cd, null);
			setValueEx(Cnd2_ac_rsn_nm, null);
		}
	}

	@Override
	public void doCnd2_bp_cd_LC(MCEventInfo info) {
		super.doCnd2_bp_cd_LC(info);
		if (!isNull(getCnd2R().bp_cd())) {
			setValueEx(Cnd2_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd2_bp_nm_LC(MCEventInfo info) {
		super.doCnd2_bp_nm_LC(info);
		if (!isNull(getCnd2R().bp_nm())) {
			setValueEx(Cnd2_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd2_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd2_no_bp_flg_NC(info);
		if (getCnd2R().no_bp_flg()) {
			setValueEx(Cnd2_bp_cd, null);
			setValueEx(Cnd2_bp_nm, null);
		}
	}

	@Override
	public void doCnd2_stk_bp_cd_LC(MCEventInfo info) {
		super.doCnd2_stk_bp_cd_LC(info);
		if (!isNull(getCnd2R().stk_bp_cd())) {
			setValueEx(Cnd2_no_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd2_stk_bp_nm_LC(MCEventInfo info) {
		super.doCnd2_stk_bp_nm_LC(info);
		if (!isNull(getCnd2R().stk_bp_nm())) {
			setValueEx(Cnd2_no_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd2_no_stk_bp_flg_NC(MCEventInfo info) {
		super.doCnd2_no_stk_bp_flg_NC(info);
		if (getCnd2R().no_stk_bp_flg()) {
			setValueEx(Cnd2_stk_bp_cd, null);
			setValueEx(Cnd2_stk_bp_nm, null);
		}
	}

	@Override
	public void doCnd2_rec_eval_typ_LC(MCEventInfo info) {
		super.doCnd2_rec_eval_typ_LC(info);
		if (!isNull(getCnd2R().rec_eval_typ())) {
			setValueEx(Cnd2_no_rec_eval_typ_flg, false);
		}
	}


	@Override
	public void doCnd2_no_rec_eval_typ_flg_NC(MCEventInfo info) {
		super.doCnd2_no_rec_eval_typ_flg_NC(info);
		if (getCnd2R().no_rec_eval_typ_flg()) {
			setValueEx(Cnd2_rec_eval_typ, null);
		}
	}

	@Override
	public void doCnd3_ac_rsn_cd_LC(MCEventInfo info) {
		super.doCnd3_ac_rsn_cd_LC(info);
		if (!isNull(getCnd3R().ac_rsn_cd())) {
			setValueEx(Cnd3_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd3_ac_rsn_nm_LC(MCEventInfo info) {
		super.doCnd3_ac_rsn_nm_LC(info);
		if (!isNull(getCnd3R().ac_rsn_nm())) {
			setValueEx(Cnd3_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd3_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd3_no_ac_rsn_flg_NC(info);
		if (getCnd3R().no_ac_rsn_flg()) {
			setValueEx(Cnd3_ac_rsn_cd, null);
			setValueEx(Cnd3_ac_rsn_nm, null);
		}
	}

	@Override
	public void doCnd3_iv_no_LC(MCEventInfo info) {
		super.doCnd3_iv_no_LC(info);
		if (!isNull(getCnd3R().iv_no())) {
			setValueEx(Cnd3_no_iv_no_flg, false);
		}
	}

	@Override
	public void doCnd3_no_iv_no_flg_NC(MCEventInfo info) {
		super.doCnd3_no_iv_no_flg_NC(info);
		if (getCnd3R().no_iv_no_flg()) {
			setValueEx(Cnd3_iv_no, null);
		}
	}

	@Override
	public void doCnd3_slo_no_LC(MCEventInfo info) {
		super.doCnd3_slo_no_LC(info);
		if (!isNull(getCnd3R().slo_no())) {
			setValueEx(Cnd3_no_slo_no_flg, false);
		}
	}

	@Override
	public void doCnd3_no_slo_no_flg_NC(MCEventInfo info) {
		super.doCnd3_no_slo_no_flg_NC(info);
		if (getCnd3R().no_slo_no_flg()) {
			setValueEx(Cnd3_slo_no, null);
		}
	}

	@Override
	public void doCnd3_stk_bp_cd_LC(MCEventInfo info) {
		super.doCnd3_stk_bp_cd_LC(info);
		if (!isNull(getCnd3R().stk_bp_cd())) {
			setValueEx(Cnd3_no_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd3_stk_bp_nm_LC(MCEventInfo info) {
		super.doCnd3_stk_bp_nm_LC(info);
		if (!isNull(getCnd3R().stk_bp_nm())) {
			setValueEx(Cnd3_no_stk_bp_flg, false);
		}
	}

	@Override
	public void doCnd3_no_stk_bp_flg_NC(MCEventInfo info) {
		super.doCnd3_no_stk_bp_flg_NC(info);
		if (getCnd3R().no_stk_bp_flg()) {
			setValueEx(Cnd3_stk_bp_cd, null);
			setValueEx(Cnd3_stk_bp_nm, null);
		}
	}

	@Override
	public void doCnd3_rec_eval_typ_LC(MCEventInfo info) {
		super.doCnd3_rec_eval_typ_LC(info);
		if (!isNull(getCnd3R().rec_eval_typ())) {
			setValueEx(Cnd3_no_rec_eval_typ_flg, false);
		}
	}

	@Override
	public void doCnd3_no_rec_eval_typ_flg_NC(MCEventInfo info) {
		super.doCnd3_no_rec_eval_typ_flg_NC(info);
		if (getCnd3R().no_rec_eval_typ_flg()) {
			setValueEx(Cnd3_rec_eval_typ, null);
		}
	}

	// -----------------------------------------------
	// status

	@Override
	public void setSRCH_INPTStatus() {
		super.setSRCH_INPTStatus();
		setStatusCom();
	}

	@Override
	public void setUPD_INPTStatus() {
		super.setUPD_INPTStatus();
		setStatusCom();
	}

	@Override
	public void setREF_INPTStatus() {
		super.setREF_INPTStatus();
		setStatusCom();
	}

	@Override
	public void setDEL_INPTStatus() {
		super.setDEL_INPTStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_INPTStatus() {
		super.setFIX_INPTStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_IOStatus() {
		super.setSRCH_IOStatus();
		setStatusCom();
	}

	@Override
	public void setUPD_IOStatus() {
		super.setUPD_IOStatus();
		setStatusCom();
	}

	@Override
	public void setREF_IOStatus() {
		super.setREF_IOStatus();
		setStatusCom();
	}

	@Override
	public void setDEL_IOStatus() {
		super.setDEL_IOStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_IOStatus() {
		super.setFIX_IOStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_SLSStatus() {
		super.setSRCH_SLSStatus();
		setStatusCom();
	}

	@Override
	public void setUPD_SLSStatus() {
		super.setUPD_SLSStatus();
		setStatusCom();
	}

	@Override
	public void setREF_SLSStatus() {
		super.setREF_SLSStatus();
		setStatusCom();
	}

	@Override
	public void setDEL_SLSStatus() {
		super.setDEL_SLSStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_SLSStatus() {
		super.setFIX_SLSStatus();
		setStatusCom();
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setSRCH_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setSRCH_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setSRCH_SLSStatus();
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setSRCH_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setSRCH_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setSRCH_SLSStatus();
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setSRCH_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setSRCH_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setSRCH_SLSStatus();
			}
		}
		else if (Cnd_ope_INS_FILE.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setINS_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setINS_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setINS_SLSStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setUPD_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setUPD_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setUPD_SLSStatus();
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setDEL_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setDEL_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setDEL_SLSStatus();
			}
		}
		else if (Cnd_ope_REF.isSelected()) {
			if (Cnd_tar_INPT.isSelected()) {
				setREF_INPTStatus();
			}
			else if (Cnd_tar_IO.isSelected()) {
				setREF_IOStatus();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				setREF_SLSStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setFixStatus() {
		// 更新後ステータス
		if (Cnd_tar_INPT.isSelected()) {
			setFIX_INPTStatus();
		}
		else if (Cnd_tar_IO.isSelected()) {
			setFIX_IOStatus();
		}
		else if (Cnd_tar_SLS.isSelected()) {
			setFIX_SLSStatus();
		}
	}

	protected void setStatusCom() {
		setTabMode();
		setStatusColumn();
		setFocus();
		displayColumn();
	}

	protected void setTabMode() {
		if (Cnd_ope_INS_FILE.isSelected()) {
			setTabComponentEnable(FoldTab);
		}
		else if (Cnd_tar_INPT.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel);
		}
		else if (Cnd_tar_IO.isSelected()) {
			setTabComponentEnable(FoldTab, Tab2Panel);
		}
		else if (Cnd_tar_SLS.isSelected()) {
			setTabComponentEnable(FoldTab, Tab3Panel);
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

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

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
		if (!isNull(r.getStringNE(RsltR.$act_id))) {
			r.setStatus(MCRow.Status.MODIFY);
		}
	}

	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		if (Cnd_ope_UPD.isSelected()) {
			
			if (Cnd_tar_INPT.isSelected()) {
				callMG_MGBBL0260_Imp01();
			}
			else if (Cnd_tar_IO.isSelected()) {
				callMG_MGBBL0260_Imp02();
			}
			else if (Cnd_tar_SLS.isSelected()) {
				callMG_MGBBL0260_Imp03();
			}
		}
	}

	// -----------------------------------------------
	// ListLogic

	@Override
	public MCList getCnd3_asst_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getAsstTyp(info));
		return super.getCnd3_asst_typ(row, info);
	}

	/** 表示する資産区分を取得する */
	protected MAC_ASST_TYP[] getAsstTyp(MCEventInfo info) {
			return new MAC_ASST_TYP[] { MAC_ASST_TYP.CO_PROD, MAC_ASST_TYP.CO_SLS };
	}

	// -----------------------------------------------
	// CellConfig
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

	// -----------------------------------------------
	// IfListRegPanel
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}