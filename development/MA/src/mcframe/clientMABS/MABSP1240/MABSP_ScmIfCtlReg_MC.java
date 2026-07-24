package mcframe.clientMABS.MABSP1240;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ScmIfCtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ScmIfCtlReg_MC extends MABSP_ScmIfCtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ScmIfCtlReg_MC() {
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
	public MABSP_ScmIfCtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL1240_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1240_Srch01Caller<P extends MABSP_ScmIfCtlReg, B extends MA_MABSL1240_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL1240_Srch01Caller(P p, B b) {
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
	 * [MA_MABSL1240_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1240_Sprt01Caller<P extends MABSP_ScmIfCtlReg, B extends MA_MABSL1240_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL1240_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL1240_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1240_Upd01Caller<P extends MABSP_ScmIfCtlReg, B extends MA_MABSL1240_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL1240_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL1240_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1240_Del01Caller<P extends MABSP_ScmIfCtlReg, B extends MA_MABSL1240_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL1240_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL1240_Srch01();
	}
	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, null, DtlTable, columnDtl_st_dt, null);
		chkSetDtVal(BulkSet_end_dt, null, DtlTable, columnDtl_end_dt, null);
	}
	/**
	 * Panel[Btn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL1240_Sprt01();
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
		callMA_MABSL1240_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL1240_Del01();
	}


	// セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	protected MCCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig(this);
	}

	public class DtlTableCellConfig extends MAUDP_RLBaseCellConfig {

		public DtlTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR dtl = (DtlR) table.getBaseTable().getRow(index);
			String typ = dtl.if_proc_typ();
			
			if (getStatus() == UPD) {
				if (isExistingKey(index, column, table)) {
					return MCMode.READ_ONLY;
				}

				if (column == columnDtl_loc_cd) {
					if (isNull(typ)) {
						return MCMode.READ_ONLY;
					}
					if ((!isMES(typ) && !isLIMS(typ)) || MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ) || MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)) {
						return MCMode.ENABLE;
					}
				}
				else if (column == columnDtl_lg_grp_cd) {
					if (!isWMS(typ)) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_cd || column == columnDtl_oper_cd || column == columnDtl_wk_cost_cd) {
					if (column == columnDtl_itm_cd) {
						if (isLIMS(typ)) {
							return MCMode.ENABLE;
						}
					}
					if (!isMES(typ)) {
						return MCMode.READ_ONLY;
					}
					if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ) || MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)) {
						if (column == columnDtl_itm_cd) {
							return MCMode.READ_ONLY;
						}
						if (isNull(dtl.loc_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else {
						if (column == columnDtl_wk_cost_cd) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (column == columnDtl_dlv_cd || column == columnDtl_gr_loc_cd) {
					if (!MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(typ)) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ext_sys_cd) {
					if (!MAC_IF_PROC_TYP.is_send(typ)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected boolean isWMS(String typ) {
		return MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(typ)
				|| MAC_IF_PROC_TYP.isWMS_SHIP_ACT_RECV(typ)
				|| MAC_IF_PROC_TYP.isWMS_ARR_SCHD_SEND(typ)
				|| MAC_IF_PROC_TYP.isWMS_ARR_ACT_RECV(typ)
				|| MAC_IF_PROC_TYP.isWMS_XFR_INST_SEND(typ)
				|| MAC_IF_PROC_TYP.isWMS_ACXFR_ACT_RECV(typ)
				|| MAC_IF_PROC_TYP.isWMS_XFR_ACT_RECV(typ);
	}

	protected boolean isMES(String typ) {
		return MAC_IF_PROC_TYP.isMES_YIELD_SCHD_SEND(typ)
				|| MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(typ)
				|| MAC_IF_PROC_TYP.isMES_OPER_INST_SEND(typ)
				|| MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(typ)
				|| MAC_IF_PROC_TYP.isMES_INPT_SCHD_SEND(typ)
				|| MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(typ)
				|| MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)
				|| MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ);
	}

	protected boolean isLIMS(String typ) {
		return MAC_IF_PROC_TYP.isMES_INSP_INST_SEND(typ)
				|| MAC_IF_PROC_TYP.isMES_INSP_ACT_RECV(typ);
	}

	@Override
	public void doDtl_if_proc_typ_LC(MCEventInfo info) {
		super.doDtl_if_proc_typ_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		String typ = r.if_proc_typ();

		if (isNull(typ)) {
			setValueEx(columnDtl_loc_cd, idx, null);
		}
		if (!isWMS(typ)) {
			setValueEx(columnDtl_lg_grp_cd, idx, null);
		}
		if (!isMES(typ) || (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ) || MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)) && isNull(r.loc_cd())) {
			setValueEx(columnDtl_oper_cd, idx, null);
			setValueEx(columnDtl_wk_cost_cd, idx, null);
		}
		if ((!isMES(typ) && !isLIMS(typ)) || MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ) || MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)) {
			setValueEx(columnDtl_itm_cd, idx, null);
		}
		if (!MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ) && !MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)) {
			setValueEx(columnDtl_wk_cost_cd, idx, null);
		}
		if (!MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(typ)) {
			setValueEx(columnDtl_dlv_cd, idx, null);
			setValueEx(columnDtl_gr_loc_cd, idx, null);
		}

		if (!MAC_IF_PROC_TYP.is_send(r.if_proc_typ())) {
			setValueEx(columnDtl_ext_sys_cd, idx, null);
		}
	}

	@Override
	public void doDtl_loc_cd_LC(MCEventInfo info) {
		super.doDtl_loc_cd_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if ((MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(r.if_proc_typ()) || MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(r.if_proc_typ())) && isNull(r.loc_cd())) {
			setValueEx(columnDtl_itm_cd, idx, null);
			setValueEx(columnDtl_oper_cd, idx, null);
			setValueEx(columnDtl_wk_cost_cd, idx, null);
		}
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


	//--------------------リストロジック表示制御Start-----------------------

	@Override	
	public MCList getCnd_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getCnd_if_proc_typ(row, info);
	}

	@Override	
	public MCList getDtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getDtl_if_proc_typ(row, info);
	}
	
	/**
	 * 表示するＩＦ処理区分を取得する
	 */
	protected MAC_IF_PROC_TYP[] getIfProcTyp(MCEventInfo info) {
		List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();
		for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
			if (ifProcTyp.is_scm()) {
				if (MAC_IF_PROC_TYP.isPO_RECV(ifProcTyp.value()) 
						|| MAC_IF_PROC_TYP.isMES_ORDER_RECV(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_ITM(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_ITM_OPER(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_ITM_DTL(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_BOM(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_LOC(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_CAL(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_CAL_EXT(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_STK(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_GR_SCHD(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_GI_SCHD(ifProcTyp.value())
						|| MAC_IF_PROC_TYP.isMES_ORDER_SEND_DLY_DMND(ifProcTyp.value())) {
					continue ;
				}
				l.add(ifProcTyp);
			}
		}
		return (MAC_IF_PROC_TYP[])l.toArray(new MAC_IF_PROC_TYP[0]);
	}

	//--------------------リストロジック表示制御End-----------------------

}