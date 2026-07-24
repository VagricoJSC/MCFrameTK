package mcframe.clientMGBD.MGBDP0300;

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
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.list.MCLinkBeans;
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_CostTermCalcCtgPtnCopy"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CostTermCalcCtgPtnCopy_MC extends MGBDP_CostTermCalcCtgPtnCopy_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CostTermCalcCtgPtnCopy_MC() {
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
	public MGBDP_CostTermCalcCtgPtnCopy_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		if (isChanged(DtlTable)) {
			if (!confirmRegDataClear()) {
				return;
			}
		}
		getDtlL().clear();
		MCList<DtlR> list = getTgtDtlListByOpeValue();
		if (list.isEmpty()) {
			dialog(FXBAP0033);
			setSrchModeByOpeValue();
		}
		else {
			list.sort(DtlR.$list_sort, DtlR.$cost_copy_typ);
			getDtlL().setAll(list);
			setUpdModeByOpeValue();
			setInitValueByOpeValue();
			DtlTable.adjustWidth();
		}
	}
	/**
	 * [MG_MGBDL0300_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Ins01Caller<P extends MGBDP_CostTermCalcCtgPtnCopy, B extends MG_MGBDL0300_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0300_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			FrR r = getFrR();
			if (!isNullOr(r.calc_ctg_cd_fr(), r.calc_ctg_cd_to())) {
				if (isSame(r.calc_ctg_cd_fr(), r.calc_ctg_cd_to())) {
					msgList.add(new MCMessage(r, FrR.$calc_ctg_cd_to, MGBDP0001));
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setSRCHStatus();
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		/**
		 * この画面独自のCaller初期化処理
		 * <P>
		 * 非同期実行にする設定
		 */
		protected void initCallerSub() {
			setAsync(true);
		}
	}

	/**
	 * [MG_MGBDL0300_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Ins02Caller<P extends MGBDP_CostTermCalcCtgPtnCopy, B extends MG_MGBDL0300_Ins02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0300_Ins02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			FrR r = getFrR();
			if (!isNullOr(r.term_fr(), r.term_to())) {
				if (isSame(r.term_fr(), r.term_to())) {
					msgList.add(new MCMessage(r, FrR.$term_to, MGBDP0002));
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setSRCHStatus();
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		/**
		 * この画面独自のCaller初期化処理
		 * <P>
		 * 非同期実行にする設定
		 */
		protected void initCallerSub() {
			setAsync(true);
		}
	}

	/**
	 * [MG_MGBDL0300_Ins03]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Ins03Caller<P extends MGBDP_CostTermCalcCtgPtnCopy, B extends MG_MGBDL0300_Ins03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0300_Ins03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			chkCtgAndYm(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setSRCHStatus();
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		/**
		 * この画面独自のCaller初期化処理
		 * <P>
		 * 非同期実行にする設定
		 */
		protected void initCallerSub() {
			setAsync(true);
		}
	}
	
	protected void chkCtgAndYm(MCMessageList msgList) {
		FrR r = getFrR();
		if (!isNullOr(r.calc_ctg_cd_fr(), r.calc_ctg_cd_to())) {
			if (isSame(r.calc_ctg_cd_fr(), r.calc_ctg_cd_to())) {
				if (!isNullOr(r.ym_fr(), r.ym_to())) {
					if (isSame(r.ym_fr(), r.ym_to())) {
						msgList.add(new MCMessage(r, FrR.$calc_ctg_cd_to,
								MGBDP0004));
					}
				}
			}
		}
	}
	
	/**
	 * [MG_MGBDL0300_Ins04]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Ins04Caller<P extends MGBDP_CostTermCalcCtgPtnCopy, B extends MG_MGBDL0300_Ins04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0300_Ins04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			chkCtgAndYm(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setSRCHStatus();
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		/**
		 * この画面独自のCaller初期化処理
		 * <P>
		 * 非同期実行にする設定
		 */
		protected void initCallerSub() {
			setAsync(true);
		}
	}

	/**
	 * [MG_MGBDL0300_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0300_Srch01Caller<P extends MGBDP_CostTermCalcCtgPtnCopy, B extends MG_MGBDL0300_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MCList<DtlR> _DtlLForCall;
		
		protected MG_MGBDL0300_Srch01Caller(P p, B b) {
			super(p, b);
		}
		

		@Override
		protected void clear() {
			super.clear();
			getDtlL().clear(DtlR.$cnt_fr, DtlR.$cnt_to);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
			// 通信対象行を絞る(選択行のみ)
			_DtlLForCall = getDtlL().subList(DtlR.$check, true);
		}

		@Override
		protected boolean checkForCall() {
			if (!checkCheckedRowSize()) {
				return false;
			}
			return super.checkForCall();
		}

		protected boolean checkCheckedRowSize() {
			if (getDtlL().getFirst(DtlR.$check, true) == null) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}
			return true;
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().setAll(_DtlLForCall);
		}

		@Override
		protected void show() {
			showMerge();
		}
		
	}

	/**
	 * Panel[Btn]のボタン[open]の押下時の処理
	 */
	@Override
	public void doBtn_open(MCEventInfo info) {
		DtlR selectedR = DtlTable.getSelectedMCRow();
		if (isNull(selectedR)) {
			dialog(msgNoSelectedRow());
			return;
		}

		String moduleId = selectedR.module_id();
		String screenId = selectedR.screen_id();

		if (!isNullOr(moduleId, screenId)) {
			openPanel(moduleId, screenId);
		}
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
	 * Panel[Btn]のボタン[upd_c]の押下時の処理
	 */
	@Override
	public void doBtn_upd_c(MCEventInfo info) {
		callMG_MGBDL0300_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd_t]の押下時の処理
	 */
	@Override
	public void doBtn_upd_t(MCEventInfo info) {
		callMG_MGBDL0300_Ins02();
	}
	/**
	 * Panel[Btn]のボタン[upd_pln]の押下時の処理
	 */
	@Override
	public void doBtn_upd_pln(MCEventInfo info) {
		callMG_MGBDL0300_Ins03();
	}
	/**
	 * Panel[Btn]のボタン[upd_act]の押下時の処理
	 */
	@Override
	public void doBtn_upd_act(MCEventInfo info) {
		callMG_MGBDL0300_Ins04();
	}
	/**
	 * Panel[Btn]のボタン[srch_cnt]の押下時の処理
	 */
	@Override
	public void doBtn_srch_cnt(MCEventInfo info) {
		callMG_MGBDL0300_Srch01();
	}

	protected void setSrchModeByOpeValue() {
		setSRCHStatus();
	}

	protected void setUpdModeByOpeValue() {
		if (Cnd_ope_CALC_CTG.isSelected()) {
			setUPD_CStatus();
		}
		else if (Cnd_ope_TERM.isSelected()) {
			setUPD_TStatus();
		}
		else if (Cnd_ope_PLN.isSelected()) {
			setUPD_PStatus();
		}
		else if (Cnd_ope_ACT.isSelected()) {
			setUPD_AStatus();
		}
	}

	protected MCList<DtlR> getTgtDtlListByOpeValue() {
		MCList<DtlR> list = MCList.create(DtlR.class);
		for (MGC_COST_COPY_TYP typ : MGC_COST_COPY_TYP.array()) {
			if (Cnd_ope_CALC_CTG.isSelected()) {
				if (!typ.tgt_ctg()) {
					continue;
				}
			}
			else if (Cnd_ope_TERM.isSelected()) {
				if (!typ.tgt_term()) {
					continue;
				}
			}
			else if (Cnd_ope_PLN.isSelected()) {
				if (!typ.tgt_pln()) {
					continue;
				}
			}
			else if (Cnd_ope_ACT.isSelected()) {
				if (!typ.tgt_act()) {
					continue;
				}
			}
			DtlR r = DtlR.create();
			r.cost_copy_typ_key(typ.key());
			r.cost_copy_typ(typ.value());
			r.cost_copy_typ_nm(typ.name());
			r.module_id(typ.module_id());
			r.screen_id(typ.screen_id());
			r.tab_ctg_typ(typ.tab_ctg_typ());
			MGC_TAB_CTG_TYP tabCtgTyp = MGC_TAB_CTG_TYP.getNE(r.tab_ctg_typ());
			if (tabCtgTyp != null) {
				r.tab_ctg_typ_nm(tabCtgTyp.name());
				r.list_sort(tabCtgTyp.list_sort());
				list.add(r);
			}
		}
		return list.subList(createDtlRowMatcher(getCndR()));
	}

	protected void setInitValueByOpeValue() {
		setInitCalcCtgByOpeValue();
		setInitTermByOpeValue();
		getFrR().setStatus(MCRow.NONE);
	}
	
	protected void setInitCalcCtgByOpeValue() {
		if (Cnd_ope_TERM.isSelected()) {
			setDefCalcCtg(Fr_calc_ctg_cd_fr);
		}
		else {
			setDefCalcCtg(Fr_calc_ctg_cd_fr);
			setDefCalcCtg(Fr_calc_ctg_cd_to);
		}
	}
	
	protected void setInitTermByOpeValue() {
		if (Cnd_ope_CALC_CTG.isSelected() || Cnd_ope_TERM.isSelected()) {
			Fr_term_fr_p_PPanel.setTerm(getTerm(this));
		}
	}
	
	// -- RowMatcher----------------------------------------------------------//
	protected MCRowMatcher<DtlR> createDtlRowMatcher(CndR r) {
		return new DtlRowMatcher<DtlR>(r);
	}

	public class DtlRowMatcher<R extends DtlR> implements MCRowMatcher<R> {

		protected CndR _cndR;

		public DtlRowMatcher(CndR r) {
			this._cndR = r;
		}

		@Override
		public boolean match(R row) {
			if (!isNull(_cndR.tab_ctg_typ())) {
				if (!isLike(row.tab_ctg_typ(), _cndR.tab_ctg_typ())) {
					return false;
				}
			}
			if (!isNull(_cndR.cost_copy_typ())) {
				if (!isLike(row.cost_copy_typ(), _cndR.cost_copy_typ())) {
					return false;
				}
			}
			return true;
		}
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setUPD_CStatus() {
		super.setUPD_CStatus();
		FrPanel.focusFirstComponent();
		DtlTable.selectRowNoFocus(0);
	}
	@Override
	public void setUPD_TStatus() {
		super.setUPD_TStatus();
		FrPanel.focusFirstComponent();
		DtlTable.selectRowNoFocus(0);
	}
	@Override
	public void setUPD_PStatus() {
		super.setUPD_PStatus();
		FrPanel.focusFirstComponent();
		DtlTable.selectRowNoFocus(0);
	}
	@Override
	public void setUPD_AStatus() {
		super.setUPD_AStatus();
		FrPanel.focusFirstComponent();
		DtlTable.selectRowNoFocus(0);
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			Btn_open.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open);
		}
	}
	
	@Override
	public void doFr_calc_ctg_cd_fr_LC(MCEventInfo info) {
		super.doFr_calc_ctg_cd_fr_LC(info);
		if (Cnd_ope_TERM.isSelected()) {
			setValueEx(Fr_calc_ctg_cd_to, getFrR().calc_ctg_cd_fr());
		}
	}
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Fr_term_fr.addLCListener(this);
	}
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == Fr_term_fr) {
			doFr_term_fr_LC(info);
		}
	}

	protected void doFr_term_fr_LC(MCEventInfo info) {
		if (!Cnd_ope_TERM.isSelected()) {
			setValueEx(Fr_term_to, getFrR().term_fr());
		}
		else if (Cnd_ope_TERM.isSelected()) {
			if (!isNull(getFrR().term_fr())) {
				setValueEx(Fr_term_to, getNextTerm(getFrR().term_fr()));
			}
		}
	}

	protected MCDate getNextTerm(MCDate frYm) {
		if (isNull(getNextTermInfoYM(this, frYm))) {
			return null;
		}
		return getNextTermInfoYM(this, frYm).term();
	}
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if (isChanged()) {
			return confirmRegDataClear();
		}
		return true;
	}
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getFrR(), getDtlL());
		setSrchModeByOpeValue();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}
	
	@Override
	protected void jbInit() {
		super.jbInit();
		Cnd_ope_CALC_CTG.setActionCommand(MGC_COST_COPY_TYP.$TGT_CTG);
		Cnd_ope_TERM.setActionCommand(MGC_COST_COPY_TYP.$TGT_TERM);
		Cnd_ope_PLN.setActionCommand(MGC_COST_COPY_TYP.$TGT_PLN);
		Cnd_ope_ACT.setActionCommand(MGC_COST_COPY_TYP.$TGT_ACT);
	}
	@Override
	public MCList getCnd_cost_copy_typ(
			MCRow row,
			MCEventInfo info) {
		//ラジオボタンはMCListPutterでバインドとして設定できないため実装する
		row.setStringNE(CostCopyTypCols.$i_tgt_typ, getCndR().ope());
		return super.getCnd_cost_copy_typ(row, info);
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
		return Btn_open;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Fr_term_fr_p_PPanel.setDefault(false);
		Fr_term_to_p_PPanel.setDefault(false);
	}

}