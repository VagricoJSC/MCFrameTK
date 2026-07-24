package mcframe.clientMABS.MABSP0180;

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
import mcframe.clientMAUB.MAUBP5350.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;

import mcframe.clientMAUD.MAUDP1010.*;
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_InspSpecReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_InspSpecReg_MC extends MABSP_InspSpecReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_InspSpecReg_MC() {
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
	public MABSP_InspSpecReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0180_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0180_Sprt01Caller<P extends MABSP_InspSpecReg, B extends MA_MABSL0180_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL0180_Sprt01Caller(P p, B b) {
			super(p, b);
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
		callMA_MABSL0180_Sprt01();
	}
	/**
	 * [MA_MABSL0180_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0180_Srch01Caller<P extends MABSP_InspSpecReg, B extends MA_MABSL0180_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0180_Srch01Caller(P p, B b) {
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
	 * [MA_MABSL0180_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0180_Upd01Caller<P extends MABSP_InspSpecReg, B extends MA_MABSL0180_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0180_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndTabTab.focusActiveFirstComponent();
		}
	}

	/**
	 * [MA_MABSL0180_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0180_Del01Caller<P extends MABSP_InspSpecReg, B extends MA_MABSL0180_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0180_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0180_Srch01();
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
		callMA_MABSL0180_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABSL0180_Del01();
	}


	@Override
	protected void setupParts() {
		super.setupParts();

		Dtl_qn_out_max_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_qn_int_frac);
		Dtl_qn_out_min_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_qn_int_frac);
		Dtl_qn_in_max_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_qn_int_frac);
		Dtl_qn_in_min_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_qn_int_frac);
	}

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

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	//------------------ セルコンフィグ ここから ------------------//
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
				if (column == columnDtl_ql_std_val) {
					if (!MAC_INSP_QLQN_TYP.isQLTV(r.insp_qlqn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_unit_cd
					  || column == columnDtl_qn_int_digit
					  || column == columnDtl_qn_int_frac) {
					if (!MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_qn_out_min) {
					if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
						if (isEqOrNe(r.sign_out_max_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sign_out_min_typ) {
					if (isNull(r.qn_out_min())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sign_out_max_typ) {
					if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
						if (isEqOrNe(r.sign_out_min_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_qn_out_max) {
					if (isNull(r.sign_out_max_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_qn_in_min) {
					if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
						if (isEqOrNe(r.sign_in_max_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sign_in_min_typ) {
					if (isNull(r.qn_in_min())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sign_in_max_typ) {
					if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
						if (isEqOrNe(r.sign_in_min_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_qn_in_max) {
					if (isNull(r.sign_in_max_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		//------------------ セルコンフィグ ここまで ------------------//
		
		@Override
		public int getPriorLength(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getRow(index);
			if (isQnQtyColumns(column)) {
				MCNumber digit = r.qn_int_digit();
				MCNumber frac = r.qn_int_frac();
				if (!isNullOr(digit, frac)) {
					return frac.intValue() + digit.intValue();
				}
			}
			return super.getPriorLength(index, column, table);
		}

		@Override
		public int getPriorScale(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getRow(index);
			if (isQnQtyColumns(column)) {
				MCNumber frac = r.qn_int_frac();
				if (frac != null) {
					return frac.intValue();
				}
			}
			return super.getPriorScale(index, column, table);
		}
	}

	/**フォーマット制御するカラムコンフィグ*/
	MCColumnConfig[] _qnQtyColumns = null;
	protected MCColumnConfig[] getQnQtyColumns() {
		if (_qnQtyColumns == null) {
			_qnQtyColumns = new MCColumnConfig[]{
					columnDtl_qn_out_max,
					columnDtl_qn_out_min,
					columnDtl_qn_in_max,
					columnDtl_qn_in_min};
		}
		return _qnQtyColumns;
	}

	protected boolean isQnQtyColumns(MCColumnConfig column) {
		return MCCollectionUtil.contains(column, getQnQtyColumns());
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnDtl_qn_out_min.addLCListener(this);
		columnDtl_qn_in_min.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == columnDtl_qn_out_min) {
			doDtl_qn_out_min_LC(info);
		}
		else if (lc == columnDtl_qn_in_min) {
			doDtl_qn_in_min_LC(info);
		}
	}

	@Override
	public void doDtl_insp_qlqn_typ_LC(MCEventInfo info) {
		super.doDtl_insp_qlqn_typ_LC(info);	
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!MAC_INSP_QLQN_TYP.isQLTV(r.insp_qlqn_typ())) {
			setValueEx(columnDtl_ql_std_val, idx, null);
		}
		if (!MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
			setValueEx(columnDtl_unit_cd, idx, null);
			setValueEx(columnDtl_qn_int_digit, idx, null);
			setValueEx(columnDtl_qn_int_frac, idx, null);
			setValueEx(columnDtl_qn_out_min, idx, null);
			setValueEx(columnDtl_sign_out_max_typ, idx, null);
			setValueEx(columnDtl_qn_in_min, idx, null);
			setValueEx(columnDtl_sign_in_max_typ, idx, null);
		}
	}

	public void doDtl_qn_out_min_LC(MCEventInfo info) {		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (isNull(r.qn_out_min())) {
			setValueEx(columnDtl_sign_out_min_typ, idx, null);
		}
	}

	@Override
	public void doDtl_sign_out_min_typ_LC(MCEventInfo info) {
		super.doDtl_sign_out_min_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isEqOrNe(r.sign_out_min_typ())) {
			setValueEx(columnDtl_sign_out_max_typ, idx, null);
		}
	}

	@Override
	public void doDtl_sign_out_max_typ_LC(MCEventInfo info) {
		super.doDtl_sign_out_max_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isEqOrNe(r.sign_out_max_typ())) {
			setValueEx(columnDtl_qn_out_min, idx, null);
		}
		if (isNull(r.sign_out_max_typ())) {
			setValueEx(columnDtl_qn_out_max, idx, null);
		}
	}

	public void doDtl_qn_in_min_LC(MCEventInfo info) {		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNull(r.qn_in_min())) {
			setValueEx(columnDtl_sign_in_min_typ, idx, null);
		}
	}

	@Override
	public void doDtl_sign_in_min_typ_LC(MCEventInfo info) {
		super.doDtl_sign_in_min_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isEqOrNe(r.sign_in_min_typ())) {
			setValueEx(columnDtl_sign_in_max_typ, idx, null);
		}
	}

	@Override
	public void doDtl_sign_in_max_typ_LC(MCEventInfo info) {
		super.doDtl_sign_in_max_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isEqOrNe(r.sign_in_max_typ())) {
			setValueEx(columnDtl_qn_in_min, idx, null);
		}
		if (isNull(r.sign_in_max_typ())) {
			setValueEx(columnDtl_qn_in_max, idx, null);
		}
	}

	@Override
	public boolean doDtl_qn_int_digit_VC(MCEventInfo info) {
		MCNumber digit = (MCNumber)info.getNewValue();
		if (!checkDigit(digit)) {
			return false;	
		}
		return super.doDtl_qn_int_frac_VC(info);
	}

	@Override
	public boolean doDtl_qn_int_frac_VC(MCEventInfo info) {

		MCNumber frac = (MCNumber)info.getNewValue();
		if (!checkFrac(frac)) {
			return false;
		}
		return super.doDtl_qn_int_frac_VC(info);
	}

	protected boolean isEqOrNe(String typ) {
		return (MAC_SIGN_TYP.isEQ(typ) || MAC_SIGN_TYP.isNE(typ));
	}

	protected boolean checkDigit(MCNumber digit) {
		if (isNull(digit)) {
			return true;
		}
		return MCNumber.ONE.lte(digit) && digit.lte(13);
	}

	protected boolean checkFrac(MCNumber frac) {
		if (isNull(frac)) {
			return true;
		}
		return MCNumber.ZERO.lte(frac) && frac.lte(8);
	}

	@Override
	public MCList getDtl_insp_ptn_cd(MCRow row, MCEventInfo info) {
		if (isNull(row.getDate(ItmInspPtnAsSpecCols.$i_dt))) {
			row.addDateColumn(ItmInspPtnAsSpecCols.$i_dt, nvl(getBulkSetR().st_dt(), getToday()));
		}
		return super.getDtl_insp_ptn_cd(row, info);
	}

}