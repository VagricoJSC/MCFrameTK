package mcframe.clientMABS.MABSP0190;

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
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.*;
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ItmInspReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ItmInspReg_MC extends MABSP_ItmInspReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ItmInspReg_MC() {
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
	public MABSP_ItmInspReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0190_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0190_Srch01Caller<P extends MABSP_ItmInspReg, B extends MA_MABSL0190_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0190_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}

		@Override
		protected void resultNoDataFound() {
			CndTabTab.focusActiveFirstComponent();
		}
	}
	
	/**
	 * [MA_MABSL0190_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0190_Sprt01Caller<P extends MABSP_ItmInspReg, B extends MA_MABSL0190_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL0190_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0190_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0190_Upd01Caller<P extends MABSP_ItmInspReg, B extends MA_MABSL0190_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0190_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndTabTab.focusActiveFirstComponent();
		}
	}

	/**
	 * [MA_MABSL0190_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0190_Del01Caller<P extends MABSP_ItmInspReg, B extends MA_MABSL0190_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0190_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndTabTab.focusActiveFirstComponent();
		}
	}

	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}
	/**
	 * Panel[DtlBtn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doDtlBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL0190_Sprt01();
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0190_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
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
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABSL0190_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABSL0190_Del01();
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1130]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1130(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1130");
		MCRow asoRow = crtOpenMABSP1130CndR(aso);
		if (!isNull(asoRow.getValueNE(mcframe.clientMABS.MABSP1130.CndR.$itm_cd))) {
			aso.runValueInit();
			aso.putCnd(asoRow);
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * 遷移先[MABSP0170]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABS.MABSP1130.CndR crtOpenMABSP1130CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1130.CndR to =
			mcframe.clientMABS.MABSP1130.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.itm_cd(fr.itm_cd());
			to.itm_sub1(fr.itm_sub1());
			to.itm_sub2(fr.itm_sub2());
			to.itm_sub3(fr.itm_sub3());
		}
		return to;
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}
	
	protected void setBtnMode() {
		setDefaultMode(DtlBtn_open_MABSP1130);
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r)){
			DtlBtn_open_MABSP1130.setMode(MCMode.DISABLE);
		}
	}
	
	@Override										
	public void setFIXStatus() {
		super.setFIXStatus();
		setBtnMode();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}
	
	@Override										
	public void setREFStatus() {
		super.setREFStatus();
		setBtnMode();
	}
	
	@Override										
	public void setDELStatus() {
		super.setDELStatus();
		setBtnMode();
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndTabTab.focusActiveFirstComponent();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_itm_p_PPanel.addItmLCListner(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if(Dtl_itm_p_PPanel.isItm(lc)) {
			doDtl_itm_cd_LC(info);
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	/**
	 * 明細に優先して利用させるCellConfigを作成するメソッド
	 * 
	 * @return
	 */
	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}

	protected class DtlCellConfig extends MAUDP_RLBaseCellConfig {
		public DtlCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_mfg_loc_cd) {
					if (!isNullOrNullVal(r.sppl_cd()) || !isNullOrNullVal(r.from_site_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sppl_cd) {
					if (!isNullOrNullVal(r.mfg_loc_cd()) || !isNullOrNullVal(r.from_site_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_from_site_cd) {
					if (!isNullOrNullVal(r.mfg_loc_cd()) || !isNullOrNullVal(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_maker_cd) {
					if (isNullOrNullVal(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_to_site_cd) {
					if (!isNullOrNullVal(r.mfg_loc_cd()) || !isNullOrNullVal(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_insp_ptn_cd
					  || column == columnDtl_pre_insp_valid_flg) {
					if (r.no_insp_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_lmt_dt_frm_typ) {
					if (r.lmt_ctl_flg()) {
						return MCMode.REQUIRED;
					}
				}
				else if (column == columnDtl_vld_pd
					  || column == columnDtl_lmt_pd
					  || column == columnDtl_lot_insp_vld_pd
					  || column == columnDtl_calc_pd_typ
					  || column == columnDtl_lot_insp_lmt_dt_frm_typ) {
					if (!r.lmt_ctl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public void doDtl_mfg_loc_cd_LC(MCEventInfo info){
		super.doDtl_mfg_loc_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!isNullOrNullVal(r.mfg_loc_cd())) {
			setValueEx(columnDtl_to_site_cd, idx, null);
		}
	}

	@Override
	public void doDtl_sppl_cd_LC(MCEventInfo info){
		super.doDtl_sppl_cd_LC(info);	
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNullOrNullVal(r.sppl_cd())) {
			setValueEx(columnDtl_maker_cd, idx, null);
		}
		else {
			setValueEx(columnDtl_to_site_cd, idx, null);
		}
	}

	@Override
	public void doDtl_no_insp_flg_NC(MCEventInfo info){
		super.doDtl_no_insp_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (r.no_insp_flg()) {
			setValueEx(columnDtl_insp_ptn_cd, idx, null);
			setValueEx(columnDtl_pre_insp_valid_flg, idx, false);
		}
		setValueEx(columnDtl_lmt_dt_frm_typ, idx, null);
	}

	public void doDtl_itm_cd_LC(MCEventInfo info){
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		setValueEx(columnDtl_insp_ptn_cd, idx, null);
		if (!r.lmt_ctl_flg()) {
			setValueEx(columnDtl_lmt_dt_frm_typ, idx, null);
			setValueEx(columnDtl_vld_pd, idx, MCNumber.ZERO);
			setValueEx(columnDtl_lmt_pd, idx, MCNumber.ZERO);
			setValueEx(columnDtl_lot_insp_vld_pd, idx, null);
			setValueEx(columnDtl_calc_pd_typ, idx, null);
			setValueEx(columnDtl_lot_insp_lmt_dt_frm_typ, idx, null);
		}
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override	
	public MCList<?> getDtl_lmt_dt_frm_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getLmtDtFrmTyp(info));
		return super.getDtl_lmt_dt_frm_typ(row, info);
	}
	/**
	 * 表示する期限起算日区分を取得する
	 */
	protected MAC_LMT_DT_FRM_TYP[] getLmtDtFrmTyp(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		MAC_LMT_DT_FRM_TYP[] arrayLmtDtFrmTyp;
		// 期限管理対象フラグ＝オフ：製造着手日、製造完了日、入荷実績日、子品目起算日引継ぎのみ表示
		if (!r.lmt_ctl_flg()) {
			arrayLmtDtFrmTyp = new MAC_LMT_DT_FRM_TYP[] {
					MAC_LMT_DT_FRM_TYP.MFG_ST, MAC_LMT_DT_FRM_TYP.MFG_CMPL,
					MAC_LMT_DT_FRM_TYP.ARR_DT, MAC_LMT_DT_FRM_TYP.DPND_CHLD_FR_DT };
		} else {
			arrayLmtDtFrmTyp = MAC_LMT_DT_FRM_TYP.array();
			arrayLmtDtFrmTyp = MCCollectionUtil.remove(arrayLmtDtFrmTyp, new MAC_LMT_DT_FRM_TYP[0], 
					MAC_LMT_DT_FRM_TYP.VALID_DT) ;
		}
		// 検査対象外フラグ=オン：検査判定日、手入力を表示しない
		if (r.no_insp_flg()) {
			arrayLmtDtFrmTyp = MCCollectionUtil.remove(arrayLmtDtFrmTyp, new MAC_LMT_DT_FRM_TYP[0],
					MAC_LMT_DT_FRM_TYP.INSP_JUDG, MAC_LMT_DT_FRM_TYP.MANUAL);
		}
		return arrayLmtDtFrmTyp;
	}

	@Override	
	public MCList<?> getDtl_lot_insp_lmt_dt_frm_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getLotInspLmtDtFrmTyp(info));
		return super.getDtl_lmt_dt_frm_typ(row, info);
	}
	/**
	 * 表示する期限起算日区分（延長時）を取得する
	 */
	protected MAC_LMT_DT_FRM_TYP[] getLotInspLmtDtFrmTyp(MCEventInfo info) {
		return new MAC_LMT_DT_FRM_TYP[] {MAC_LMT_DT_FRM_TYP.INSP_JUDG, MAC_LMT_DT_FRM_TYP.VALID_DT};
	}

	//--------------------リストロジック表示制御End-----------------------

	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doBulkSet_end_dt_NC(MCEventInfo info) {
		super.doBulkSet_end_dt_NC(info);
		chkSrchBtnMode();
	}
	
	public void chkSrchBtnMode() {
		if (!isNull(getBulkSetR().st_dt())
				|| !isNull(getBulkSetR().end_dt())) {
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}

}