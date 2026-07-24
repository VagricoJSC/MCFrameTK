package mcframe.clientMABS.MABSP0910;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_SlsUpriChk"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_SlsUpriChk_MC extends MABSP_SlsUpriChk_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_SlsUpriChk_MC() {
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
	public MABSP_SlsUpriChk_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0910_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0910_Sprt01Caller<P extends MABSP_SlsUpriChk, B extends MA_MABSL0910_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MCList<DtlR> _pickedDtlL;

		protected MA_MABSL0910_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean execConfirm() {
			MCMessage msg = msgExecConfirm();
			return msg == null ? true : (confirm(msg) == MCMessageBox.YES_OPTION);
		}

		/**
		 * 処理の実行を確認するメッセージを取得します。
		 */
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MABSP0001);
		}

		@Override
		protected void showMsg() {
			MCMessageList msgList = new MCMessageList();
			for (DtlR r : getDtlL()) {
				if (r.err_flg()) {
					msgList.add(new MCMessage(r, null, MABSP0002, toDispGUIIndex(r)));
				}
			}
			if (msgList.size() > 0) {
				showStackMsg(msgList);
			}
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			// 対象外は紐づけＮＯをクリア
			for (DtlR r : getDtlL()) {
				if (!r.check()) {
					r.peg_no(null);
					r.err_flg(false);
					r.check(false);
				}
			}
			_pickedDtlL = getDtlL().subList(DtlR.$check, true);

			super.checkForCallStack(msgList);

			if (_pickedDtlL.isEmpty()) {
				msgList.add(new MCMessage(FXBAP0038));
			}
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReq(msgList, _pickedDtlL);
		}

		@Override
		protected void setupUpParam() {
			param().addUpBlock(_pickedDtlL);
		}

		@Override
		protected void show() {
			showMerge();
			showCstDtlL();
			showItmDtlL();
			showStdDtlL();
			CstDtlTable.adjustWidth();
			ItmDtlTable.adjustWidth();
			StdDtlTable.adjustWidth();
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == CstDtlTable) {
			openMABSP0220(info);
		}
		else if (compo == ItmDtlTable) {
			openMABSP0240(info);
		}
		else if (compo == StdDtlTable) {
			openMABSP0250(info);
		}
	}

	/**
	 * 得意先販売単価マスタ登録画面へ遷移
	 * @param info
	 */
	protected void openMABSP0220(MCEventInfo info) {
		CstDtlR row = CstDtlTable.getSelectedMCRow();
		if (isNull(row)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0220");
		aso.putCnd(crtOpenMABSP0220CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0220.CndR crtOpenMABSP0220CndR(MAUCP_AppScreenOpener aso, CstDtlR r) {
		mcframe.clientMABS.MABSP0220.MABSP_CstSlsUpriReg p = (mcframe.clientMABS.MABSP0220.MABSP_CstSlsUpriReg) aso.getPanel();
		mcframe.clientMABS.MABSP0220.CndR to = mcframe.clientMABS.MABSP0220.CndR.create();
		
		to.base_dt(r.st_dt());
		if (isNullOrNullVal(r.wg_cd())) {
			to.cmn_flg(true);
		}
		else {
			to.wg_flg(true);
			to.wg_cd(r.wg_cd());
		}
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.cst_cd(r.cst_cd());
		to.dlv_cd(r.dlv_cd());
		to.dest_cd1(r.dest_cd1());
		to.dest_cd2(r.dest_cd2());
		to.dest_cd3(r.dest_cd3());
		to.unit_cd(r.unit_cd());
		to.cur_cd(r.cur_cd());
		to.sls_upri_grp_cd(r.sls_upri_grp_cd());
		to.off_interim_flg(true);
		to.on_interim_flg(true);
		to.off_del_flg(true);
		to.on_del_flg(true);
		to.ope(p.Cnd_ope_REF.getActionCommand());
		
		return to;
	}

	/**
	 * 品目販売単価マスタ登録画面へ遷移
	 * @param info
	 */
	protected void openMABSP0240(MCEventInfo info) {
		ItmDtlR row = ItmDtlTable.getSelectedMCRow();
		if (isNull(row)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0240");
		aso.putCnd(crtOpenMABSP0240CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0240.CndR crtOpenMABSP0240CndR(MAUCP_AppScreenOpener aso, ItmDtlR r) {
		mcframe.clientMABS.MABSP0240.MABSP_ItmSlsUpriReg p = (mcframe.clientMABS.MABSP0240.MABSP_ItmSlsUpriReg) aso.getPanel();
		mcframe.clientMABS.MABSP0240.CndR to = mcframe.clientMABS.MABSP0240.CndR.create();
		
		to.base_dt(r.st_dt());
		if (isNullOrNullVal(r.wg_cd())) {
			to.cmn_flg(true);
		}
		else {
			to.wg_flg(true);
			to.wg_cd(r.wg_cd());
		}
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.unit_cd(r.unit_cd());
		to.cur_cd(r.cur_cd());
		to.sls_upri_grp_cd(r.sls_upri_grp_cd());
		to.sls_upri_rank_cd(r.sls_upri_rank_cd());
		to.off_interim_flg(true);
		to.on_interim_flg(true);
		to.off_del_flg(true);
		to.on_del_flg(true);
		to.ope(p.Cnd_ope_REF.getActionCommand());
		
		return to;
	}

	/**
	 * 標準販売単価マスタ登録画面へ遷移
	 * @param info
	 */
	protected void openMABSP0250(MCEventInfo info) {
		StdDtlR row = StdDtlTable.getSelectedMCRow();
		if (isNull(row)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0250");
		aso.putCnd(crtOpenMABSP0250CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0250.CndR crtOpenMABSP0250CndR(MAUCP_AppScreenOpener aso, StdDtlR r) {
		mcframe.clientMABS.MABSP0250.MABSP_StdSlsUpriReg p = (mcframe.clientMABS.MABSP0250.MABSP_StdSlsUpriReg) aso.getPanel();
		mcframe.clientMABS.MABSP0250.CndR to = mcframe.clientMABS.MABSP0250.CndR.create();
		
		to.base_dt(r.st_dt());
		if (isNullOrNullVal(r.wg_cd())) {
			to.cmn_flg(true);
		}
		else {
			to.wg_flg(true);
			to.wg_cd(r.wg_cd());
		}
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.unit_cd(r.unit_cd());
		to.cur_cd(r.cur_cd());
		to.off_del_flg(true);
		to.on_del_flg(true);
		to.ope(p.Cnd_ope_REF.getActionCommand());
		
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[get_upri]の押下時の処理
	 */
	@Override
	public void doDtlBtn_get_upri(MCEventInfo info) {
		callMA_MABSL0910_Sprt01();
	}


	@Override
	public MCConstRow getCndR() {
		return null;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		
		DtlTable.fillSpace();
		DtlTable.setStatusColumnVisible(false);
	}

	@Override
	protected void setStatusByOpe() {
		// 何もなし
	}

	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		
		E newRow = super.copyRowSub(row);
		if (newRow == null) return null;
		// コピー対象外
		newRow.setNumberNE("peg_no", null);
		newRow.setBooleanNE("err_flg", false);
		newRow.setNumberNE("sls_upri", null);
		newRow.setBooleanNE("interim_flg", false);
		return newRow;
	}
	
	@Override
	public void doDtl_dt_LC(MCEventInfo info) {
		super.doDtl_dt_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNull(r.dt())) {
			setValueEx(columnDtl_dpt_cd, idx, null);
		}
	}
	
	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNull(r.wg_cd())) {
			setValueEx(columnDtl_itm_cd, idx, null);
		}
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		showCstDtlL();
		showItmDtlL();
		showStdDtlL();
	}
	
	/**
	 * 	選択された明細行に紐づく得意先販売単価のリストを画面上に表示する
	 */
	protected void showCstDtlL() {
		DtlR selectedRow = DtlTable.getSelectedMCRow();
		if (!isNull(selectedRow)) {
			getCstDtlL().clear();
			MCList<CstDtlR> cstL = getCstDtlAllL().subList(CstDtlR.$peg_no, selectedRow.peg_no());
			getCstDtlL().setAll(cstL);
			CstDtlTable.adjustWidth();
		}
	}
	
	/**
	 * 	選択された明細行に紐づく品目販売単価のリストを画面上に表示する
	 */
	protected void showItmDtlL() {
		DtlR selectedRow = DtlTable.getSelectedMCRow();
		if (!isNull(selectedRow)) {
			getItmDtlL().clear();
			MCList<ItmDtlR> itmL = getItmDtlAllL().subList(ItmDtlR.$peg_no, selectedRow.peg_no());
			getItmDtlL().setAll(itmL);
			ItmDtlTable.adjustWidth();
		}
	}
	
	/**
	 * 	選択された明細行に紐づく標準販売単価のリストを画面上に表示する
	 */
	protected void showStdDtlL() {
		DtlR selectedRow = DtlTable.getSelectedMCRow();
		if (!isNull(selectedRow)) {
			getStdDtlL().clear();
			MCList<StdDtlR> stdL = getStdDtlAllL().subList(StdDtlR.$peg_no, selectedRow.peg_no());
			getStdDtlL().setAll(stdL);
			StdDtlTable.adjustWidth();
		}
	}

	// ------------CellConfig------------
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	public class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (column == columnDtl_dpt_cd) {
				if (isNull(r.dt())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_itm_cd) {
				if (isNull(r.wg_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}