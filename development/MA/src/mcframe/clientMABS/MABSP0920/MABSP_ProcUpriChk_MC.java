package mcframe.clientMABS.MABSP0920;

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
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ProcUpriChk"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ProcUpriChk_MC extends MABSP_ProcUpriChk_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ProcUpriChk_MC() {
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
	public MABSP_ProcUpriChk_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0920_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0920_Sprt01Caller<P extends MABSP_ProcUpriChk, B extends MA_MABSL0920_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MCList<DtlR> _pickedDtlL;

		protected MA_MABSL0920_Sprt01Caller(P p, B b) {
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
			showProcDtlL();
			ProcDtlTable.adjustWidth();
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == ProcDtlTable) {
			openMABSP0140(info);
		}
	}

	/**
	 * 加工単価マスタ登録画面へ遷移
	 * @param info
	 */
	protected void openMABSP0140(MCEventInfo info) {
		ProcDtlR row = ProcDtlTable.getSelectedMCRow();
		if (isNull(row)) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0140");
		aso.putCnd(crtOpenMABSP0140CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0140.CndR crtOpenMABSP0140CndR(MAUCP_AppScreenOpener aso, ProcDtlR r) {
		mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg p = (mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg) aso.getPanel();
		mcframe.clientMABS.MABSP0140.CndR to = mcframe.clientMABS.MABSP0140.CndR.create();
		
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
		to.sppl_cd(r.sppl_cd());
		to.maker_cd(r.maker_cd());
		to.unit_cd(r.unit_cd());
		to.cur_cd(r.cur_cd());
		to.loc_cd(r.loc_cd());
		to.dlv_cd(r.dlv_cd());
		to.off_interim_flg(true);
		to.on_interim_flg(true);
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
		callMA_MABSL0920_Sprt01();
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
		newRow.setNumberNE("upri", null);
		newRow.setBooleanNE("interim_flg", false);
		return newRow;
	}
	
	@Override
	public void doDtl_ddlv_sls_flg_NC(MCEventInfo info) {
		super.doDtl_ddlv_sls_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!r.ddlv_sls_flg()) {
			setValueEx(columnDtl_dpt_cd, idx, null);
			setValueEx(columnDtl_dlv_cd, idx, null);
		}
		else {
			setValueEx(columnDtl_loc_cd, idx, null);
		}
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
	public void doDtl_sppl_cd_LC(MCEventInfo info) {
		super.doDtl_sppl_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNull(r.sppl_cd())) {
			setValueEx(columnDtl_maker_cd, idx, null);
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
		else {
			setValueEx(columnDtl_proc_upri_typ, idx, MAC_PROC_UPRI_TYP.ITM.value());
		}
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		showProcDtlL();
	}
	
	/**
	 * 	選択された明細行に紐づく加工単価のリストを画面上に表示する
	 */
	protected void showProcDtlL() {
		DtlR selectedRow = DtlTable.getSelectedMCRow();
		if (!isNull(selectedRow)) {
			getProcDtlL().clear();
			MCList<ProcDtlR> procL = getProcDtlAllL().subList(ProcDtlR.$peg_no, selectedRow.peg_no());
			getProcDtlL().setAll(procL);
			sort(ProcDtlTable);
			ProcDtlTable.adjustWidth();
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
				if (isNull(r.dt()) || !r.ddlv_sls_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_maker_cd) {
				if (isNull(r.sppl_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_dlv_cd) {
				if (!r.ddlv_sls_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_loc_cd) {
				if (r.ddlv_sls_flg()) {
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
	
	@Override
	protected void listInit() {
		super.listInit();
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sppl_cd, columnDtl_maker_cd, columnDtl_cur_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sppl_cd, columnDtl_maker_cd, columnDtl_cur_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_itm_sub3, columnDtl_sppl_cd, columnDtl_maker_cd, columnDtl_cur_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_sppl_cd, columnDtl_maker_cd, columnDtl_cur_cd);
	}

}