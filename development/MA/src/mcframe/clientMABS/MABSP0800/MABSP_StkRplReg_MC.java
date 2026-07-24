package mcframe.clientMABS.MABSP0800;

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
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_StkRplReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_StkRplReg_MC extends MABSP_StkRplReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_StkRplReg_MC() {
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
	public MABSP_StkRplReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0800_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0800_Srch01Caller<P extends MABSP_StkRplReg, B extends MA_MABSL0800_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0800_Srch01Caller(P p, B b) {
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
	}

	/**
	 * [MA_MABSL0800_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0800_Sprt01Caller<P extends MABSP_StkRplReg, B extends MA_MABSL0800_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL0800_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0800_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0800_Upd01Caller<P extends MABSP_StkRplReg, B extends MA_MABSL0800_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0800_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0800_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0800_Del01Caller<P extends MABSP_StkRplReg, B extends MA_MABSL0800_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0800_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0800_Srch01();
	}
	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}
	/**
	 * Panel[Btn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL0800_Sprt01();
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
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABSL0800_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL0800_Del01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Dtl_qty1_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_dec_place);
		Dtl_qty2_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_dec_place);
		Dtl_qty3_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_dec_place);
		Dtl_str_ln1_p_PPanel.setRelateBeans(columnDtl_gi_loc_cd, columnDtl_gi_str_ln_tgt_flg);
		Dtl_str_ln2_p_PPanel.setRelateBeans(columnDtl_inpt_gi_loc_cd, columnDtl_inpt_gi_str_ln_tgt_flg);
		Dtl_str_ln3_p_PPanel.setRelateBeans(columnDtl_ship_gi_loc_cd, columnDtl_ship_gi_str_ln_tgt_flg);
	}

	//////////BulkSet関連動作//////////
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
	/////////////////////
	
	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnDtl_rord_stk_qty.addLCListener(this);
		columnDtl_rord_rqst_qty.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_rord_stk_qty) {
			doDtl_rord_stk_qty_LC(info);
		}
		if (lc == columnDtl_rord_rqst_qty) {
			doDtl_rord_rqst_qty_LC(info);
		}
	}

	public void doDtl_loc_cd_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.loc_cd())){
			setValueEx(columnDtl_gi_loc_cd, idx, null);
			setValueEx(columnDtl_inpt_gi_loc_cd, idx, null);
			setValueEx(columnDtl_ship_gi_loc_cd, idx, null);
		}
		if (isNull(r.alloc_grp_cd())){
			setValueEx(columnDtl_ship_gi_loc_cd, idx, null);
		}
	}

	public void doDtl_rord_stk_qty_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rord_stk_qty())){
			setValueEx(columnDtl_gi_schd_flg, idx, false);
			setValueEx(columnDtl_rord_rqst_qty, idx, null);
			setValueEx(columnDtl_lot_sizing_flg, idx, false);
			setValueEx(columnDtl_gi_loc_cd, idx, null);
		}
	}

	public void doDtl_rord_rqst_qty_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isNull(r.rord_rqst_qty())){
			setValueEx(columnDtl_lot_sizing_flg, idx, false);
		}
	}

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}
	
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
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (column == columnDtl_gi_loc_cd
				 || column == columnDtl_inpt_gi_loc_cd
				 || column == columnDtl_ship_gi_loc_cd) {
					if (isNull(r.loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rord_rqst_qty
				 || column == columnDtl_lot_sizing_flg
				 || column == columnDtl_gi_loc_cd
				 || column == columnDtl_gi_schd_flg) {
					if (isNull(r.rord_stk_qty())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_lot_sizing_flg) {
					if (!isNull(r.rord_rqst_qty())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_ship_gi_loc_cd) {
					if (isNull(r.alloc_grp_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}