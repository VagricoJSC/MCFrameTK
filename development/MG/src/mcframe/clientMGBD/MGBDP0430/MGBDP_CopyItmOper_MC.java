package mcframe.clientMGBD.MGBDP0430;

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
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

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
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_CopyItmOper"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CopyItmOper_MC extends MGBDP_CopyItmOper_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト */
	protected ArrayList<MCColumnConfig> _revFgCtrlColumnConfigs;
	protected MCRowBeans[] _invalidCndWhenLumpImp;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CopyItmOper_MC() {
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
	public MGBDP_CopyItmOper_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0430_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0430_Ins01Caller<P extends MGBDP_CopyItmOper, B extends MG_MGBDL0430_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0430_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
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
			checkForCallStackSubCom(msgList);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			setupUpParamSub();
		}

		protected void setupUpParamSub() {
			bridge.up0().cmn_flg(getCndR().cmn_flg());
			bridge.up0().wg_flg(getCndR().wg_flg());
		}
	}

	/**
	 * [MG_MGBDL0430_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0430_Srch01Caller<P extends MGBDP_CopyItmOper, B extends MG_MGBDL0430_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0430_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			addDownContainer(getHdrR());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			checkForCallStackSubCom(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_no_exist_flg, Cnd_change_flg, Cnd_exist_flg));
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			String[] keys = RsltR.create().getKeys().toArray(new String[0]);
			for(MCList<RsltR> l: bridge.down0().groupList(keys)) {
				boolean top = true;
				for(RsltR r: l) {
					r.key_flg(top);
					if(!top) {
						//ヘッダ以外はクリア
						r.clear(getClearCols());
					}
					top = false;
				}
			}
		}

		/** ヘッダ行以外クリアする項目 */
		protected String[] getClearCols() {
			return new String[]{
				RsltR.$no_exist_flg,
				RsltR.$change_flg};
		}

		@Override
		protected void show() {
			super.show();
			setHdrColsFromCnd();
		}

		protected void setHdrColsFromCnd() {
			HdrR dest = getHdrR();
			CndR src = getCndR();

			dest.calc_ctg_cd(src.calc_ctg_cd());
			dest.calc_ctg_nm(src.calc_ctg_nm());
			dest.wg_cd(src.wg_cd());
			dest.wg_nm(src.wg_nm());
			dest.term(src.term());
			dest.term_nm(src.term_p().term_nm());
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
	 * [MG_MGBDL0430_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0430_Upd01Caller<P extends MGBDP_CopyItmOper, B extends MG_MGBDL0430_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0430_Upd01Caller(P p, B b) {
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
			checkForCallStackSubCom(msgList);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			setupUpParamSub();
		}

		protected void setupUpParamSub() {
			bridge.up0().cmn_flg(getCndR().cmn_flg());
			bridge.up0().wg_flg(getCndR().wg_flg());
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
	}

	/**
	 * [MG_MGBDL0430_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0430_Upd02Caller<P extends MGBDP_CopyItmOper, B extends MG_MGBDL0430_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0430_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkCheckedRowSize(IfListRegPanel p) {
			return true;
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
			checkForCallStackSubCom(msgList);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			setupUpParamSub();
		}

		protected void setupUpParamSub() {
			bridge.up0().cmn_flg(getCndR().cmn_flg());
			bridge.up0().wg_flg(getCndR().wg_flg());
		}
	}

	/** 登録対象枠は「共通」と「WG」のいずれかのみ選択可能 */
	protected void checkForCallStackSubCom(MCMessageList msgList) {
		msgList.addAll(checkOnlyOneInput(Cnd_cmn_flg, Cnd_wg_flg));
	}

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
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0430_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0560]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0560(MCEventInfo info) {
		openMGBDP0560(RsltTable.getSelectedMCRow());
	}

	protected void openMGBDP0560(RsltR r) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBDP0560ScrnOpnr(r);
		scrnOpnr.show();
	}

	protected MAUCP_AppScreenOpener getMGBDP0560ScrnOpnr(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0560");
		mcframe.clientMGBD.MGBDP0560.CndR to = mcframe.clientMGBD.MGBDP0560.CndR.create();
		mcframe.clientMGBD.MGBDP0560.MGBDP_ItmOperReg p =
				(mcframe.clientMGBD.MGBDP0560.MGBDP_ItmOperReg) aso.getPanel();

		to.ope(p.Cnd_ope_REF.getActionCommand());

		List<String> list = new ArrayList<String>();
		to.wg_flg(getCndR().wg_flg());
		if(!getCndR().wg_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0560.CndR.$wg_flg);
		}
		to.cmn_flg(getCndR().cmn_flg());
		if(!getCndR().cmn_flg()) {
			list.add(mcframe.clientMGBD.MGBDP0560.CndR.$cmn_flg);
		}

		if (Cnd_ope_INS.isSelected()) {
			to.calc_ctg_cd(getTgtCndR().calc_ctg_cd());
			if(getCndR().wg_flg()) {
				to.wg_cd(getTgtCndR().wg_cd());
			}
			to.term_fr(getTgtCndR().term());
			to.term_to(getTgtCndR().term());
		}
		else if(isNull(r)){
			to.calc_ctg_cd(getCndR().calc_ctg_cd());
			if(getCndR().wg_flg()) {
				to.wg_cd(getCndR().wg_cd());
			}
			to.term_fr(getCndR().term());
			to.term_to(getCndR().term());
		}
		else {
			to.calc_ctg_cd(getHdrR().calc_ctg_cd());
			if(getCndR().wg_flg()) {
				to.wg_cd(getHdrR().wg_cd());
			}
			to.term_fr(getHdrR().term());
			to.term_to(getHdrR().term());
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());

			aso.putSearchAction();
		}

		aso.putCnd(to, list);
		aso.runValueInit();

		return aso;
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
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBDL0430_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0430_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_lump]の押下時の処理
	 */
	@Override
	public void doBtn_upd_lump(MCEventInfo info) {
		callMG_MGBDL0430_Upd02();
	}

	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト  */
	protected ArrayList<MCColumnConfig> getRevFgCtrlColumnConfigs() {
		if (_revFgCtrlColumnConfigs == null) {
			_revFgCtrlColumnConfigs = getGroupColumnConfigs(RsltTable, RsltR.$$CLEAR);
		}
		return _revFgCtrlColumnConfigs;
	}

	protected MCRowBeans[] getInvalidCndWhenLumpImp() {
		if(_invalidCndWhenLumpImp == null) {
			_invalidCndWhenLumpImp = new MCRowBeans[]{
				Cnd_itm_typ, Cnd_itm_typ_d_cd, Cnd_itm_jnl_cd,
				Cnd_itm_cd,
				Cnd_itm_grp_cd1, Cnd_itm_grp_cd2,
				Cnd_itm_grp_cd3, Cnd_itm_grp_cd4,
				Cnd_itm_grp_cd5, Cnd_itm_grp_cd6,
				Cnd_itm_grp_cd7, Cnd_itm_grp_cd8,
				Cnd_itm_grp_cd9, Cnd_itm_grp_cd10
			};
		}
		return _invalidCndWhenLumpImp;
	}

	// ///////////////////// INIT /////////////////////////////////////////////
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltTableCellConfig());
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Rslt_nmr_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_dnm_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_oper_std_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_oper_conv_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_oper_dec_place);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		initRegTgt();
		initFlg();
		initCalcCtg();
	}

	protected void initRegTgt() {
		if (!Cnd_srch_wg.authorize()) {
			setValueEx(Cnd_wg_flg, false);
		}
		if (!Cnd_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
		}

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
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void initFlg() {
		setValueEx(Cnd_no_exist_flg, true);
		setValueEx(Cnd_exist_flg, true);
		setValueEx(Cnd_change_flg, true);

		setValueEx(Cnd_imp_err_flg, false);
	}

	protected void initCalcCtg() {
		if (Cnd_ope_INS.isSelected()) {
			setDefCalcCtg(TgtCnd_calc_ctg_cd);
		}
		else if (Cnd_ope_IMP.isSelected()
				|| Cnd_ope_LUMP_IMP.isSelected()) {
			setDefCalcCtg(Cnd_calc_ctg_cd);
		}
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		RsltTable.setSortable(false);
	}

	// ///////////////////// Validation Change ////////////////////////////////

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		return confirmRegDataClearCom();
	}

	@Override
	public boolean doCnd_cmn_flg_VC(MCEventInfo info) {
		if (!super.doCnd_cmn_flg_VC(info)) {
			return false;
		}
		return confirmRegDataClearCom();
	}

	@Override
	public boolean doCnd_wg_flg_VC(MCEventInfo info) {
		if (!super.doCnd_wg_flg_VC(info)) {
			return false;
		}
		return confirmRegDataClearCom();
	}

	protected boolean confirmRegDataClearCom() {
		if (!isUpdStatus() || isStatusNone(getRsltL())) {
			return true;
		}
		else {
			return confirmRegDataClear();
		}
	}

	// ///////////////////// Notification Change //////////////////////////////

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL(), getHdrR());

		// 処理に使用されない項目はクリアする
		clearInvalidCnd();

		initCalcCtg();
		setSrchStatus();
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		if (getCndR().cmn_flg() && getCndR().wg_flg()) {
			getCndR().wg_flg(false);
		}
		clearContainers(getRsltL(), getHdrR());

		setSrchStatus();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		if (getCndR().cmn_flg() && getCndR().wg_flg()) {
			getCndR().cmn_flg(false);
		}
		clearContainers(getRsltL(), getHdrR());

		setSrchStatus();
	}

	protected void clearInvalidCnd() {
		if (Cnd_ope_LUMP_IMP.isSelected()) {
			for(MCRowBeans b: getInvalidCndWhenLumpImp()) {
				setValueEx(b, null);
			}
			initFlg();
		}
	}

	// ///////////////////// DoubleClicked イベント ///////////////////////////////

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		int index = info.getEventIndex();
		if (compo == RsltTable && index > -1) {
			openMGBDP0560(getRsltL().get(index));
		}
	}

	// ///////////////////// Status ///////////////////////////////////////////

	/** 登録・更新ステータスであるかどうかを返す */
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	/** 検索前ステータスに設定する */
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}
		else if (Cnd_ope_IMP.isSelected()) {
			setSRCH_UPDStatus();
		}
		else if (Cnd_ope_LUMP_IMP.isSelected()) {
			setUPD_LUMPStatus();
		}
		// 検索枠を閉じる
		Ctrl_ctrl_PPanel.expand(true);
	}

	/** 検索後ステータスに設定する */
	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_IMP.isSelected()) {
			setUPDStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	@Override
	public void setSRCH_UPDStatus() {
		super.setSRCH_UPDStatus();
		setStatusCom();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}

	@Override
	public void setUPD_LUMPStatus() {
		super.setUPD_LUMPStatus();
		setStatusCom();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		setRegTgtMode();
		setModeByRegTgt();
		setTabMode();
		setFocus();
	}

	protected void setRegTgtMode() {
		if (!Cnd_srch_cmn.authorize()|| !Cnd_srch_wg.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.READ_ONLY);
			Cnd_wg_flg.setMode(MCMode.READ_ONLY);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	protected void setModeByRegTgt() {
		if (!getCndR().wg_flg()) {
			setValueEx(TgtCnd_wg_cd, null);
			TgtCnd_wg_cd.setMode(MCMode.READ_ONLY);
			TgtCnd_wg_nm.setMode(MCMode.READ_ONLY);

			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(TgtCnd_wg_cd);
			setDefaultMode(TgtCnd_wg_nm);

			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
		}
	}

	/** 種別に応じてタブの活性／非活性を設定する */
	protected void setTabMode() {
		if(Cnd_ope_INS.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel);
		}
		else if (Cnd_ope_IMP.isSelected()) {
			setTabComponentEnable(FoldTab, Tab2Panel, Tab3Panel);
		}
		else if (Cnd_ope_LUMP_IMP.isSelected()) {
			setTabComponentEnable(FoldTab, Tab2Panel);
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

	// ///////////////////// PopupConfig //////////////////////////////////////

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		// 横テーブルの「ソート順」メニューを無効にする
		if (beans == RsltTable) {
			config.ignoreSortOrder(true);
		}
		return config;
	}

	// ///////////////////// CellConfig ///////////////////////////////////////

	protected RsltTableCellConfig createRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	protected class RsltTableCellConfig extends MGUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdStatus()) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);
				if (column == columnRslt_check) {
					if (!isHeader(r)){
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		// 一覧の文字色設定
		//キー項目表示フラグがオフの場合は各キー先頭行以外のキー項目文字色を背景色と同じにする（⇒見えなる）
		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (!getCndR().disp_key() && !isHeader(r) && getRevFgCtrlColumnConfigs().contains(column)) {
				return true;
			}
			return null;
		}

		protected boolean isHeader(RsltR r){
			return r.key_flg();
		}
	}


	// ///////////////////// IfListRegPanel ///////////////////////////////////

	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}