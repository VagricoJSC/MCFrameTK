package mcframe.clientMABC.MABCP0120;

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
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_AprvReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_AprvReg_MC extends MABCP_AprvReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_AprvReg_MC() {
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
	public MABCP_AprvReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0120_Srch01();
	}
	/**
	 * [MA_MABCL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0120_Srch01Caller<P extends MABCP_AprvReg, B extends MA_MABCL0120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0120_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (isUpdOpe()) {
				Btn_correct_dup_dt.setMode(MCMode.ENABLE);
			}
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
	 * [MA_MABCL0120_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0120_Sprt01Caller<P extends MABCP_AprvReg, B extends MA_MABCL0120_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABCL0120_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0120_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0120_Upd01Caller<P extends MABCP_AprvReg, B extends MA_MABCL0120_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0120_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0120_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0120_Del01Caller<P extends MABCP_AprvReg, B extends MA_MABCL0120_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0120_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[BulkSet]のボタン[upd_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_upd_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0110(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0110");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0110CndR(aso));
		aso.show();
	}
	/**
	 * 遷移先[MABCP0110]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0110.CndR crtOpenMABCP0110CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0110.CndR to = mcframe.clientMABC.MABCP0110.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.aprv_func_typ(r.aprv_func_typ());
			to.aprv_rt_ptn(r.aprv_rt_ptn());
			if (!isNullAnd(to.aprv_func_typ(), to.aprv_rt_ptn())) {
				aso.putSearchAction();
			}
		}
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABCL0120_Sprt01();
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
		callMA_MABCL0120_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0120_Del01();
	}
	
	//------------------ ｲﾍﾞﾝﾄ設定 Start ------------------//
	@Override
	public void doDtl_aprv_func_typ_LC(MCEventInfo info) {
		super.doDtl_aprv_func_typ_LC(info);
		
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(index);
		setValueEx(columnDtl_aprv_rt_ptn, index, null);
		setValueEx(columnDtl_aprv_upd_flg, index, false);
		setValueEx(columnDtl_aprv_del_flg, index, false);
		
		if (!MAC_APRV_FUNC_TYP.is_using_itm(r.aprv_func_typ())) {
			setValueEx(columnDtl_itm_cd, index, null);
			setValueEx(columnDtl_itm_sub1, index, null);
			setValueEx(columnDtl_itm_sub2, index, null);
			setValueEx(columnDtl_itm_sub3, index, null);
			setValueEx(columnDtl_itm_grp_typ, index, null);
		}
		
		if (!MAC_APRV_FUNC_TYP.is_using_dpt(r.aprv_func_typ())) {
			setValueEx(columnDtl_dpt_cd, index, null);
		}
		if (!MAC_APRV_FUNC_TYP.is_using_bp(r.aprv_func_typ())) {
			setValueEx(columnDtl_bp_cd, index, null);
			setValueEx(columnDtl_bp_grp_typ, index, null);
		}
		
		if (!MAC_APRV_FUNC_TYP.is_using_amt1(r.aprv_func_typ())) {
			setValueEx(columnDtl_cur_cd1, index, null);
		}
		if (!MAC_APRV_FUNC_TYP.is_using_amt2(r.aprv_func_typ())) {
			setValueEx(columnDtl_cur_cd2, index, null);
		}
		if (!MAC_APRV_FUNC_TYP.is_using_amt3(r.aprv_func_typ())) {
			setValueEx(columnDtl_cur_cd3, index, null);
		}
	}
	
	@Override
	public void doDtl_itm_grp_typ_LC(MCEventInfo info) {
		super.doDtl_itm_grp_typ_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_itm_grp_cd, index, null);
	}
	
	@Override
	public void doDtl_bp_grp_typ_LC(MCEventInfo info) {
		super.doDtl_bp_grp_typ_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_bp_grp_cd, index, null);
	}
	
	@Override
	public void doDtl_cur_cd1_LC(MCEventInfo info) {
		super.doDtl_cur_cd1_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_val_min1, index, null);
		setValueEx(columnDtl_val_max1, index, null);
		setValueEx(columnDtl_bind_cond1, index, null);
	}
	
	@Override
	public void doDtl_bind_cond1_LC(MCEventInfo info) {
		super.doDtl_bind_cond1_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_cur_cd2, index, null);
	}
	
	@Override
	public void doDtl_cur_cd2_LC(MCEventInfo info) {
		super.doDtl_cur_cd2_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_val_min2, index, null);
		setValueEx(columnDtl_val_max2, index, null);
		setValueEx(columnDtl_bind_cond2, index, null);
	}
	
	@Override
	public void doDtl_bind_cond2_LC(MCEventInfo info) {
		super.doDtl_bind_cond2_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_cur_cd3, index, null);
	}
	
	@Override
	public void doDtl_cur_cd3_LC(MCEventInfo info) {
		super.doDtl_cur_cd3_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_val_min3, index, null);
		setValueEx(columnDtl_val_max3, index, null);
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
			BulkSet_upd_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_upd_dt.setMode(MCMode.DISABLE);
		}
	}
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}
	
	//------------------ ｲﾍﾞﾝﾄ設定 End ------------------//
	
	//------------------ ｾﾙｺﾝﾌｨｸﾞ Start ------------------//
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
		public MCMode getPriorMode(int index, MCColumnConfig column,
				MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				
				// 品目ＣＤ、品目分類区分は一方を設定すると、その他は入力不可となる
				if (column == columnDtl_itm_cd) {
					if (!isNull(r.itm_grp_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_itm_grp_typ) {
					if (!isNull(r.itm_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				// 取引先ＣＤ、取引先分類区分は一方を設定すると、その他は入力不可となる
				if (column == columnDtl_bp_cd) {
					if (!isNull(r.bp_grp_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_bp_grp_typ) {
					if (!isNull(r.bp_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				// 品目分類区分が設定されている場合、品目分類ＣＤは入力必須 品目分類区分が設定されていない場合は入力不可
				if (column == columnDtl_itm_grp_cd) {
					if (!isNull(r.itm_grp_typ())) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				// 取引先分類区分が設定されている場合、取引先分類ＣＤは入力必須　取引先分類区分が設定されていない場合は入力不可
				if (column == columnDtl_bp_grp_cd) {
					if (!isNull(r.bp_grp_typ())) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				// 承認機能区分により入力可能項目が異なる
				if (column == columnDtl_aprv_upd_flg
				 || column == columnDtl_aprv_del_flg) {
					if (isNull(r.aprv_func_typ()) || MAC_APRV_FUNC_TYP.is_upri_master_typ(r.aprv_func_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_itm_cd
				 || column == columnDtl_itm_grp_typ) {
					if (!MAC_APRV_FUNC_TYP.is_using_itm(r.aprv_func_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_dpt_cd) {
					if (!MAC_APRV_FUNC_TYP.is_using_dpt(r.aprv_func_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_bp_cd
					  || column == columnDtl_bp_grp_typ) {
					if (!MAC_APRV_FUNC_TYP.is_using_bp(r.aprv_func_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 通貨１関係の表示制御
				if (column == columnDtl_cur_cd1) {
					if (!MAC_APRV_FUNC_TYP.is_using_amt1(r.aprv_func_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_val_min1
					  || column == columnDtl_val_max1) {
					if (isNull(r.cur_cd1())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_bind_cond1) {
					if (!MAC_APRV_FUNC_TYP.is_using_amt2(r.aprv_func_typ()) || isNull(r.cur_cd1())) {
						return MCMode.READ_ONLY;
					}
				}
				// 通貨２関係の表示制御
				if (column == columnDtl_cur_cd2) {
					if (isNull(r.bind_cond1())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_val_min2
					  || column == columnDtl_val_max2) {
					if (isNull(r.cur_cd2())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_bind_cond2) {
					if (!MAC_APRV_FUNC_TYP.is_using_amt3(r.aprv_func_typ()) || isNull(r.cur_cd1()) || 
							isNull(r.cur_cd2())) {
						return MCMode.READ_ONLY;
					}
				}
				// 通貨３関係の表示制御
				if (column == columnDtl_cur_cd3) {
					if (isNull(r.bind_cond2())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_val_min3
					  || column == columnDtl_val_max3) {
					if (isNull(r.cur_cd3())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
		
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_APRV));
	}

}