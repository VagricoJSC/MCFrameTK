package mcframe.clientMGBD.MGBDP0030;

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

import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMGUB.MGUBP0010.*;

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
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientFXBA.FXBAP0010.IfSrchCndBase;
import mcframe.clientFXUC.FXUCP0070.FXUCP_SrchCndUtil;
import mcframe.clientCore.acl.MCACLManager;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ArgSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ArgSrch_MC extends MGBDP_ArgSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/** 遷移ボタンの全リスト<br>
	 *  @see #getBtnL()
	 */
	protected MCButton[] _btnL = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ArgSrch_MC() {
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
	public MGBDP_ArgSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[del_admin]の押下時の処理
	 */
	@Override
	public void doBtn_del_admin(MCEventInfo info) {
		callMG_MGBDL0030_Del01();
	}
	/**
	 * [MG_MGBDL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0030_Srch01Caller<P extends MGBDP_ArgSrch, B extends MG_MGBDL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList){
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_st_ym, Cnd_end_ym));
			msgList.addAll(checkAtLeastOne(Cnd_fix_true_flg, Cnd_fix_false_flg));
			msgList.addAll(checkAtLeastOne(Cnd_non_del_true_flg, Cnd_non_del_false_flg));
			msgList.addAll(checkAtLeastOne(Cnd_calc_err_true_flg, Cnd_calc_err_false_flg));
		}

		@Override
		protected void afterCall(){
			super.afterCall();
			afterCallSub();
		}

		protected void afterCallSub() {
			for (DtlR dtl : bridge.down0()) {
				// 計算開始時刻または計算終了時刻がnullの場合は、計算時間はnullとする。
				if (!isNullOr(dtl.calc_st(), dtl.calc_fin())) {
					dtl.calc_time(toHMSStr(dtl.calc_fin().diffSecond(dtl.calc_st())));
				}
			}
		}

		@Override
		protected void setMode(){
			super.setMode();
			setModeSub();
		}

		protected void setModeSub() {
			setStatusAfterSrch();
		}

		@Override
		protected void setModeNoDown(){
			super.setModeNoDown();
			setModeNoDownSub();
		}

		protected void setModeNoDownSub() {
			setStatusBeforeSrch();
		}

	}

	/**
	 * [MG_MGBDL0030_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0030_Srch02Caller<P extends MGBDP_ArgSrch, B extends MG_MGBDL0030_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Caller<P, B> {

		protected MG_MGBDL0030_Srch02Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MG_MGBDL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0030_Upd01Caller<P extends MGBDP_ArgSrch, B extends MG_MGBDL0030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0030_Upd01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MG_MGBDL0030_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0030_Del01Caller<P extends MGBDP_ArgSrch, B extends MG_MGBDL0030_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0030_Del01Caller(P p, B b) {
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
		protected void setMode(){
			super.setMode();
			setFIX_DStatus();
		}

		@Override
		protected MCMessage msgExecConfirm() {
			if (Cnd_ope_DEL_ADMIN.isSelected() && getDtlL()
					.subList(r -> r.check() && (r.fix_flg() || r.non_del_flg()))
					.size() > 0) {
				return new MCMessage(MGBDP0007);
			}
			return super.msgExecConfirm();
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMG_MGBDL0030_Srch01();
	}

	/**
	 * Panel[MenuBtn]のボタン[open_01]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_01(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_02]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_02(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_03]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_03(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_04]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_04(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_05]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_05(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_06]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_06(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_07]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_07(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_08]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_08(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_09]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_09(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_10]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_10(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_11]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_11(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_12]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_12(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_13]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_13(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_14]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_14(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_15]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_15(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_16]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_16(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_17]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_17(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_18]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_18(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_19]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_19(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_20]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_20(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_21]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_21(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_22]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_22(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_23]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_23(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[MenuBtn]のボタン[open_24]の押下時の処理
	 */
	@Override
	public void doMenuBtn_open_24(MCEventInfo info) {
		doOpenPanel((MCButton)info.getComponent());
	}

	/**
	 * Panel[Btn]のボタン[open_MGBDP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0050(MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0050");
		setupMGBDP0050AsoParam(aso, dtlR);
		aso.show();
	}

	protected void setupMGBDP0050AsoParam(MAUCP_AppScreenOpener aso, DtlR r) {
		aso.putCnd(crtOpenMGBDP0050CndR(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
	}

	protected mcframe.clientMGBD.MGBDP0050.CndR crtOpenMGBDP0050CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMGBD.MGBDP0050.CndR to = mcframe.clientMGBD.MGBDP0050.CndR.create();
		to.calc_grp_cd(r.calc_grp_cd());
		to.calc_no(r.calc_no());
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_FSBGP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_FSBGP0160(MCEventInfo info) {
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		showFSBGP0160(dtlR);
	}

	/**
	 * バッチログ確認画面を表示する
	 * @param r 検索条件
	 */
	protected void showFSBGP0160(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("FS", "FSBGP0160");
		setupFSBGP0160AsoParam(aso, r);
		aso.show();
	}

	protected void setupFSBGP0160AsoParam(MAUCP_AppScreenOpener aso, DtlR r) {
		aso.putCnd(crtOpenFSBGP0160CndR(aso, r), crtOpenFSBGP0160CndRNullCols(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
	}

	protected mcframe.clientFSBG.FSBGP0160.CndR crtOpenFSBGP0160CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientFSBG.FSBGP0160.CndR to = mcframe.clientFSBG.FSBGP0160.CndR.create();
		to.batch_log_no(r.batch_log_no());
		return to;
	}

	protected List<String> crtOpenFSBGP0160CndRNullCols(MAUCP_AppScreenOpener aso, DtlR r) {
		List<String> forceColumn = new ArrayList<>();
		forceColumn.add(mcframe.clientFSBG.FSBGP0160.CndR.$start_ts_fr);
		return forceColumn;
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBDL0030_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0030_Del01();
	}

	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

	@Override
	public void setMode(java.lang.String status) {
		super.setMode(status);
	
		if (!MCACLManager.authorize(getModuleID(), getScreenID(), "del_admin", null)) {
			Cnd_ope_DEL_ADMIN.setMode(MCMode.DISABLE);
		}
	}

	@Override
	protected void valueInit(){
		super.valueInit();
		valueInitSub();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

	protected void valueInitSub(){
		setValueEx(Cnd_fix_true_flg, true);
		setValueEx(Cnd_fix_false_flg, true);
		setValueEx(Cnd_non_del_true_flg, true);
		setValueEx(Cnd_non_del_false_flg, true);
		setValueEx(Cnd_calc_err_true_flg, true);
		setValueEx(Cnd_calc_err_false_flg, true);
	}

	@Override
	protected void listInit() {
		super.listInit();
		getCnd_st_ym_ListPutter().putBind(YmCols.$i_st_ym, Cnd_term);
		getCnd_st_ym_ListPutter().putBind(YmCols.$i_end_ym, Cnd_term_end_ym);
		getCnd_end_ym_ListPutter().putBind(YmCols.$i_st_ym, Cnd_term);
		getCnd_end_ym_ListPutter().putBind(YmCols.$i_end_ym, Cnd_term_end_ym);
	}

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		setAllMenuBtnMode(MCMode.INVISIBLE);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_term.addAllListener(this);
	}

	@Override
	protected void tableInit(){
		super.tableInit();
		// 固定桁（分、秒）の値を揃える
		columnDtl_calc_time.setHorizontalAlignment(MCColumnConfig.RIGHT);	
	}

	@Override
	protected void setCellConfig(){
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	/**
	 * 明細情報用のCellConfigクラスを作成する
	 */
	protected DtlCellConfig createDtlCellConfig(){
		return new DtlCellConfig();
	}

	/**
	 * 明細情報用のCellConfigクラス
	 */
	protected class DtlCellConfig extends MGUDP_CellConfig{

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			return getPriorModeSub(index, column, table);
		}

		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 */
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			DtlR dtl = (DtlR)table.getBaseTable().getRow(index);
			// オペレーション実行後
			if (MAC_RTN_STS_TYP.isOK(dtl.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
			}
			if (column == columnDtl_check) {
				if (DEL.equals(getStatus())) {
					if (!canDelete(dtl)) {
						return MCMode.READ_ONLY;
					}
				}
			}

			if (column == columnDtl_non_del_flg) {
				if(dtl.fix_flg()){
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		 }

	}

	protected boolean canDelete(DtlR r) {
		return r!= null && !r.fix_flg() && !r.non_del_flg() || Cnd_ope_DEL_ADMIN.isSelected();
	}

	@Override
	public void setSRCHStatus(){
		super.setSRCHStatus();
		setupMenuBtnMode();
		TgtPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus(){
		super.setREFStatus();
		setupMenuBtnMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setUPDStatus(){
		super.setUPDStatus();
		setupMenuBtnMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setDELStatus(){
		super.setDELStatus();
		setupMenuBtnMode();
		setDelBtnMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIX_DStatus(){
		super.setFIX_DStatus();
		setupMenuBtnMode();
		setDelBtnMode();
		TgtPanel.focusFirstComponent();
	}

	protected void setDelBtnMode() {
		if (Cnd_ope_DEL_ADMIN.isSelected()) {
			Btn_del.setMode(MCMode.INVISIBLE);
			Btn_del_admin.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_del);
			Btn_del_admin.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if(isChanged()){
			return confirmRegDataClear();
		}
		return true;
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub();
	}

	protected void doCnd_ope_NCSub() {
		clearContainers(getDtlL());
		setStatusBeforeSrch();
	}

	protected void setStatusBeforeSrch() {
		String ope = getCndR().ope();
		if (Cnd_ope_REF.getActionCommand().equals(ope)) {
			setSRCHStatus();
		}
		else if (Cnd_ope_UPD.getActionCommand().equals(ope)) {
			setSRCHStatus();
		}
		else if (Cnd_ope_DEL.getActionCommand().equals(ope) || Cnd_ope_DEL_ADMIN.getActionCommand().equals(ope)) {
			setSRCHStatus();
		}
	}

	protected void setStatusAfterSrch() {
		String ope = getCndR().ope();
		if (Cnd_ope_REF.getActionCommand().equals(ope)) {
			setREFStatus();
		}
		else if (Cnd_ope_UPD.getActionCommand().equals(ope)) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.getActionCommand().equals(ope) || Cnd_ope_DEL_ADMIN.getActionCommand().equals(ope)) {
			setDELStatus();
		}
	}

	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (super.doVCEvent(vc, info)) {
			if (vc == Cnd_term) {
				return doCnd_term_VC(info);
			}
			return true;
		}
		return false;
	}

	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_term) doCnd_term_LC(info);
	}

	protected boolean doCnd_term_VC(MCEventInfo info) {
		return !isChanged(DtlTable) || confirmRegDataClear();
	}

	protected void doCnd_term_LC(MCEventInfo info){
		clearAll();
	}

	@Override
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info) {
		if (super.doCnd_calc_grp_cd_VC(info)) {
			return !isChanged(DtlTable) || confirmRegDataClear();
		}
		return false;
	}

	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		clearAll();
	}

	protected void clearAll() {
		clearContainers(getDtlL(), getMenuListL());
		setMenuCd();
		setupMenuBtnMode();
	}

	@Override
	public void doCnd_menu_cd_LC(MCEventInfo info) {
		super.doCnd_menu_cd_LC(info);
		callMG_MGBDL0030_Srch02();
		setupMenuBtnMode();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		int index = info.getEventIndex();
		DtlR row;
		if (index < 0) {
			row = null;
		}
		else {
			row = getDtlL().get(index);
		}
		changeModeOfFSBGP0140Btn(row);
		changeModeOfMGBDP0050Btn(row);
	}

	/**
	 * 引数の行に応じて、[open_FSBGP0140]ボタンのモードを変更する
	 * @param eventRow
	 */
	protected void changeModeOfFSBGP0140Btn(DtlR eventRow) {
		if (eventRow == null) {
			Btn_open_FSBGP0160.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_FSBGP0160);
		}
	}

	/**
	 * 引数の行に応じて、[open_MGBDP0050]ボタンのモードを変更する
	 * @param eventRow
	 */
	protected void changeModeOfMGBDP0050Btn(DtlR eventRow) {
		if (eventRow == null) {
			Btn_open_MGBDP0050.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MGBDP0050);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DtlTable) {
			MCButton b = getDCOpenTgt();
			if (b.isEnabled()) {
				b.doAP();
			}
		}
	}

	/**
	 * DCイベントで実行するボタンを返す。
	 */
	protected MCButton getDCOpenTgt() {
		return Btn_open_MGBDP0050;
	}

	/**
	 * ボタン押下時の処理<br>
	 * @param btn 押下されたボタン
	 */
	protected void doOpenPanel(MCButton btn) {
		// 画面を起動する
		MCNumber menuNo = menuNoOf(btn);
		MenuListR menuR = getMenuListL().getFirst(MenuListR.$menu_no, menuNo);
		if (menuR != null) {
			MAUCP_AppScreenOpener aso = createAso(menuR);
			setupAsoParam(aso, menuR.scrn_id());
			aso.show();
		}
	}

	protected MAUCP_AppScreenOpener createAso(MenuListR menuR) {
		return new MGBDP0030_AppScreenOpener(menuR.module_id(), menuR.scrn_id());
	}

	public class MGBDP0030_AppScreenOpener extends MAUCP_AppScreenOpener{
		//ブロック名のデフォルト
		protected String _bknm = "Cnd";
		protected String[] _cnd_chk_tgt = {"term","ym_fr","ym_to"};

		public MGBDP0030_AppScreenOpener(String moduleid, String screenid) {
			super(moduleid, screenid);
		}

		@Override
		public void putCndBlockNm(String nm) {
			_bknm = nm;
			super.putCndBlockNm(nm);
		}

		/**
		 * 連携対象のMCModeBeansをMCRowBeansとして返す。
		 */
		protected List<MCRowBeans> getTgtBeans(MCRootPanel p) {
			List<MCPanel> list = FXUCP_SrchCndUtil.getSrchPanels((IfSrchCndBase) p);
			List<MCRowBeans> l = new ArrayList<>();
			for (MCPanel tgtp : list) {
				for (MCModeBeans c : MCBeansUtil.getAllComponents(MCModeBeans.class, tgtp)) {
					if (c instanceof MCEditorBeans) {
						continue;
					}
					else if (c instanceof MCRadioButton) {
						continue;
					}
					else if (c instanceof MCRowBeans) {
						// ブロック名で絞り込み
						MCRowBeans b = (MCRowBeans) c;
						if (getBlockColName(b, p).startsWith(_bknm)) {
							l.add(b);
						}
					}
				}
			}
			return l;
		}

		@Override
		protected void beforeSetScreenParam(MCRootPanel rp) {
			super.beforeSetScreenParam(rp);
			//入力できない項目の条件を除去
			for(MCRowBeans d :getTgtBeans(rp)) {
				if (((MCModeBeans) d).getModeInfo().getStatus() == MCMode.ENABLE_STATUS) {
					continue;
				}
				String cn = d.getBaseRowColumnName();
				String cndcol = getCndChkTgt(cn);
				if (cndcol != null) {
					String key = MCScreenOpener.createGUIKey(d);
					removeParam(key);
				}
			}
		}

		/**
		 * 入力不可の可能性のある項目の場合trueを返す。
		 * @param destCol
		 * @return
		 */
		protected String getCndChkTgt(String destCol) {
			for(String t : _cnd_chk_tgt) {
				if (destCol.endsWith(t)) {
					return t;
				}
			}
			return null;
		}
	}

	protected void setupAsoParam(MAUCP_AppScreenOpener aso, String scrId) {
		MGBDP_AsoParam p = createAsoParam(aso, scrId);
		aso.putCnd(p._cnd,p._forceCol );
		aso.putCndBlockNm(p._blk);
		aso.runValueInit();
		aso.runPsnlInput();
		aso.runPsnlInputInitSrch();
	}

	protected MGBDP_AsoParam createAsoParam(MAUCP_AppScreenOpener aso, String scrId) {
		MGBDP_AsoParam p = new MGBDP_AsoParam();
		p._cnd = createOpenParam(aso, scrId);
		p._blk = getOpenParamBlk(aso, scrId);
		p._forceCol = createOpenParamForceColumn(aso, scrId);
		return p;
	}

	public class MGBDP_AsoParam {
		protected MCRow _cnd;
		protected String _blk;
		protected List<String> _forceCol;
	}

	/**
	 * 画面遷移の引数を作成する
	 * @return 画面遷移の引数
	 */
	protected MCRow createOpenParam(MAUCP_AppScreenOpener aso, String scrId) {
		MCRow bind = MCRow.create();
		CndR cr = getCndR();
		DtlR dr = DtlTable.getSelectedMCRow();
		bind = convBindStCustom(aso, scrId, bind, cr);
		setBindTerm(aso, scrId, bind, cr);
		setBindCalcGrpCd(aso, scrId, bind, cr);
		setBindCalcNo(aso, scrId, bind, dr);
		setBindYmFrTo(aso, scrId, bind, cr, dr);
		bind = convBindEndCustom(aso, scrId, bind, cr);
		return bind;
	}

	/**
	 * 画面遷移の遷移先ブロック名を返す
	 */
	protected String getOpenParamBlk(MAUCP_AppScreenOpener aso, String scrId) {
		if (mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg.SCREEN_ID.equals(scrId)){
			mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg pnl = 
					(mcframe.clientMGBG.MGBGP0110.MGBGP_PreRateTermReg)aso.getPanel();
			return pnl.getBlockId(pnl.getHdrR());
		}
		else if (mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg.SCREEN_ID.equals(scrId)){
			mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg pnl = 
					(mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg)aso.getPanel();
			return pnl.getBlockId(pnl.getHdrR());
		}
		return "Cnd";
	}

	/**
	 * 遷移先に渡す値が「null」または「false」でも強制的に値を設定する対象のカラム名を返す。
	 * @return　カラム名
	 */
	protected List<String> createOpenParamForceColumn(MAUCP_AppScreenOpener aso, String scrId) {
		return null;
	}

	/**
	 * 画面個別設定ＳＴＡＲＴ。
	 */
	protected MCRow convBindStCustom(MAUCP_AppScreenOpener aso, String scrId, MCRow bind, CndR r) {
		return bind;
	}

	/**
	 * 画面個別設定ＥＮＤ。
	 */
	protected MCRow convBindEndCustom(MAUCP_AppScreenOpener aso, String scrId, MCRow bind, CndR r) {
		return bind;
	}

	protected boolean isYmEditable(String scrId) {
		return !mcframe.clientMGBG.MGBGP0140.MGBGP_PreAlcRateLst.SCREEN_ID.equals(scrId);
	}

	/**
	 * 遷移先の条件に期を設定する。
	 */
	protected void setBindTerm(MAUCP_AppScreenOpener aso, String scrId, MCRow bind, CndR r) {
		bind.setDateNE("term", r.term());
		bind.setDateNE("term_fr", r.term());
		bind.setDateNE("term_to", r.term());
	}

	/**
	 * 遷移先の条件に計算グループを設定する。
	 */
	protected void setBindCalcGrpCd(MAUCP_AppScreenOpener aso, String scrId, MCRow bind, CndR r) {
		bind.setStringNE("calc_grp_cd", r.calc_grp_cd());
	}

	/**
	 * 遷移先の条件に計算ＮＯを設定する。
	 */
	protected void setBindCalcNo(MAUCP_AppScreenOpener aso, String scrId, MCRow bind, DtlR dr) {
		if (dr != null) {
			bind.setStringNE("calc_no", dr.calc_no());
		}
	}

	/**
	 * 遷移先の条件に年月を設定する。
	 */
	protected void setBindYmFrTo(MAUCP_AppScreenOpener aso, String scrId, MCRow bind, CndR cr, DtlR dr) {

		MCDate s = null;
		MCDate e = null;

		if (cr.term() != null ) {
			mcframe.clientMAUC.MAUCP0020.TermR tr = getTermInfo(this, cr.term());
			if (tr != null) {
				s = tr.term();
				e = tr.term_end_ym();
				if(e != null){
					e = e.addMonth(-1);
				}
			}
		}
		if (dr != null) {
			//明細に年月がある場合はその設定を優先する
			if (!isNullAnd(dr.st_ym(), dr.end_ym())) {
				s = dr.st_ym();
				e = dr.end_ym();
			}
		}
		bind.setDateNE("ym_fr", s);
		bind.setDateNE("ym_to", e);
	}

	protected void setMenuCd() {
		getCndR().menu_cd(null);
		getCndR().menu_nm(null);
		MCList<?> list = Cnd_menu_cd.createList();
		if (list == null || list.size() == 0) {
			setValueEx(Cnd_menu_cd, null);
		}
		else {
			MCMessageList msgList = Cnd_menu_cd.setValues(list.get(0));
			String val = list.get(0).getString(CalcMenuCols.$o_menu_cd);
			handleSetValueMessageList(Cnd_menu_cd, val, msgList);
		}
	}

	/**
	 * 全メニューボタンのインスタンスを取得する<br>
	 */
	protected MCButton[] getBtnL() {
		if (_btnL == null) {
			_btnL = new MCButton[] {
					MenuBtn_open_01, MenuBtn_open_02, MenuBtn_open_03, MenuBtn_open_04, MenuBtn_open_05,
					MenuBtn_open_06, MenuBtn_open_07, MenuBtn_open_08, MenuBtn_open_09, MenuBtn_open_10,
					MenuBtn_open_11, MenuBtn_open_12, MenuBtn_open_13, MenuBtn_open_14, MenuBtn_open_15,
					MenuBtn_open_16, MenuBtn_open_17, MenuBtn_open_18, MenuBtn_open_19, MenuBtn_open_20,
					MenuBtn_open_21, MenuBtn_open_22, MenuBtn_open_23, MenuBtn_open_24
			};
		}
		return _btnL;
	}

	/**
	 * ボタンの表示ＮＯを取得する<br>
	 * @param btn
	 * @return ボタンの表示ＮＯ
	 */
	protected MCNumber menuNoOf(MCButton btn) {
		int index = indexOf(btn);
		MCNumber menuNo = menuNoOf(index);
		return menuNo;
	}

	/**
	 * ボタンの遷移ボタンリストでのindexを返す<br>
	 * @param btn
	 * @return index
	 */
	protected int indexOf(MCButton btn) {
		int index = -1;
		for (int i = 0; i < getBtnL().length; i++) {
			if (_btnL[i] == btn) {
				index = i;
			}
		}
		return index;
	}

	/**
	 * 遷移ボタンリストのindexから、表示ＮＯを取得する<br>
	 * @param index 遷移ボタンリストのindex
	 * @return 表示ＮＯ
	 */
	protected MCNumber menuNoOf(int index) {
		return MCNumber.valueOf(index + 1);
	}

	/**
	 * 表示ＮＯから、遷移ボタンリストのindexを取得する<br>
	 * @param printNo 表示ＮＯ
	 * @return 遷移ボタンリストのindex
	 */
	protected int indexOf(MCNumber menuNo) {
		return menuNo.intValue() - 1;
	}

	/**
	 * 表示ＮＯから、遷移ボタンを取得する<br>
	 * @param printNo 表示ＮＯ
	 * @return 遷移ボタン
	 */
	protected MCButton getBtn(MCNumber menuNo) {
		int index = indexOf(menuNo);
		return _btnL[index];
	}

	/**
	 * 画面遷移のボタンを設定する。<br>
	 */
	protected void setupMenuBtnMode() {
		setAllMenuBtnMode(MCMode.INVISIBLE);
		setupMenuBtnModeSub();
	}

	/**
	 * 全画面遷移ボタンのステータスを設定する。<br>
	 */
	protected void setAllMenuBtnMode(MCMode mode) {
		for (MCButton btn : getBtnL()) {
			btn.setMode(mode);
		}
	}

	/**
	 * 全画面遷移ボタンのステータスをマスタ値に応じて設定する。<br>
	 * このメソッドを呼ぶ前に、全ボタンをINVISIBLEにすること。
	 */
	protected void setupMenuBtnModeSub() {
		getMenuListL().forEach(r ->{
			setupMenuBtnSub(r);
		});
	}

	/**
	 * 画面遷移ボタンの初期化<br>
	 */
	protected void setupMenuBtnSub(MenuListR menuR) {
		String mid = menuR.module_id();
		String sid = menuR.scrn_id();
		MCButton btn = getBtn(menuR.menu_no());

		if (btn != null) {
			btn.setText(getLabel(mid, sid));
			btn.setMessageName(sid);
			btn.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 画面名称の取得<br>
	 * @param moduleId モジュールＩＤ
	 * @param screenId 画面ＩＤ
	 */
	protected String getLabel(String moduleId, String screenId) {
		String key = MCConst.createKey(moduleId, screenId, "label");
		String label = MCConst.label.getLabel(key);
		return label;
	}

}