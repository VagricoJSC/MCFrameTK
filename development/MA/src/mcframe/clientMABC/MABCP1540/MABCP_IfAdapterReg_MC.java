package mcframe.clientMABC.MABCP1540;

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
 * 画面"MABCP_IfAdapterReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_IfAdapterReg_MC extends MABCP_IfAdapterReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_IfAdapterReg_MC() {
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
	public MABCP_IfAdapterReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1540_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1540_Srch01Caller<P extends MABCP_IfAdapterReg, B extends MA_MABCL1540_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1540_Srch01Caller(P p, B b) {
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
	 * [MA_MABCL1540_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1540_Sprt01Caller<P extends MABCP_IfAdapterReg, B extends MA_MABCL1540_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABCL1540_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1540_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1540_Upd01Caller<P extends MABCP_IfAdapterReg, B extends MA_MABCL1540_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1540_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1540_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1540_Del01Caller<P extends MABCP_IfAdapterReg, B extends MA_MABCL1540_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1540_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL1540_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doDtlBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABCL1540_Sprt01();
	}
	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
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
		callMA_MABCL1540_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL1540_Del01();
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
	public void doDtl_ext_sys_cd_LC(MCEventInfo info) {
		super.doDtl_ext_sys_cd_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!r.web_api_flg()) {
			setValueEx(columnDtl_web_api_ope, idx, null);
		}
		if (!r.cmd_exec_flg()) {
			setValueEx(columnDtl_cmd_exec_ope, idx, null);
		}
		if (r.web_api_flg() || r.cmd_exec_flg()) {
			setValueEx(columnDtl_file_io_ope, idx, null);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_IF_ADAPTER));
	}

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
				if (column == columnDtl_file_io_ope) {
					if (r.web_api_flg() || r.cmd_exec_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_web_api_ope) {
					if (!r.web_api_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_cmd_exec_ope) {
					if (!r.cmd_exec_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	//--------------------リストロジック表示制御Start-----------------------
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

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			String extSysTyp = r.ext_sys_typ();

			for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
				if (MAC_EXT_SYS_TYP.isEDI(extSysTyp) || MAC_EXT_SYS_TYP.isEDI_MCF(extSysTyp)) {
					if (ifProcTyp.is_edi()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isPLM(extSysTyp)) {
					if (ifProcTyp.is_plm()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isAC(extSysTyp)) {
					if (ifProcTyp.is_ac()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isSCM(extSysTyp) || MAC_EXT_SYS_TYP.isSCM_MD(extSysTyp)) {
					if (ifProcTyp.is_scm()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isFB(extSysTyp)) {
					if (ifProcTyp.is_fb()) {
						l.add(ifProcTyp);
					}
				}
				else if(MAC_EXT_SYS_TYP.isBI(extSysTyp)) {
					if (ifProcTyp.is_bi()) {
						l.add(ifProcTyp);
					}
				}
				else if (MAC_EXT_SYS_TYP.isAC_SAP(extSysTyp)) {
					if (ifProcTyp.is_sap()) {
						l.add(ifProcTyp);
					}
				}
				else if (MAC_EXT_SYS_TYP.isSCM_PCM(extSysTyp)) {
					if (ifProcTyp.is_pcm()) {
						l.add(ifProcTyp);
					}
				}
				if (!MAC_EXT_SYS_TYP.isBI(extSysTyp)) {
					if(ifProcTyp.is_all()) {
						l.add(ifProcTyp);
					}
				}
			}
		}
		return (MAC_IF_PROC_TYP[])l.toArray(new MAC_IF_PROC_TYP[0]);
	}

	//--------------------リストロジック表示制御End-----------------------

}