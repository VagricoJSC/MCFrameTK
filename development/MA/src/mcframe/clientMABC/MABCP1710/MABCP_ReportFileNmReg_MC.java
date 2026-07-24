package mcframe.clientMABC.MABCP1710;

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
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ReportFileNmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ReportFileNmReg_MC extends MABCP_ReportFileNmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ReportFileNmReg_MC() {
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
	public MABCP_ReportFileNmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1710_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1710_Srch01Caller<P extends MABCP_ReportFileNmReg, B extends MA_MABCL1710_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1710_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL1710_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1710_Upd01Caller<P extends MABCP_ReportFileNmReg, B extends MA_MABCL1710_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1710_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1710_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1710_Del01Caller<P extends MABCP_ReportFileNmReg, B extends MA_MABCL1710_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1710_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL1710_Srch01();
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
		callMA_MABCL1710_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL1710_Del01();
	}

	@Override
	public void doDtl_rpt_nm_elm_typ1_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ1_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ1())) {
			setValueEx(columnDtl_rpt_nm_elm_typ2, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ3, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ4, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ5, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ6, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ7, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ8, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ9, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

	@Override
	public void doDtl_rpt_nm_elm_typ2_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ2_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ2())) {
			setValueEx(columnDtl_rpt_nm_elm_typ3, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ4, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ5, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ6, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ7, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ8, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ9, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

	@Override
	public void doDtl_rpt_nm_elm_typ3_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ3_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ3())) {
			setValueEx(columnDtl_rpt_nm_elm_typ4, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ5, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ6, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ7, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ8, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ9, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

	@Override
	public void doDtl_rpt_nm_elm_typ4_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ4_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ4())) {
			setValueEx(columnDtl_rpt_nm_elm_typ5, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ6, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ7, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ8, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ9, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

	@Override
	public void doDtl_rpt_nm_elm_typ5_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ5_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ5())) {
			setValueEx(columnDtl_rpt_nm_elm_typ6, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ7, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ8, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ9, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

	@Override
	public void doDtl_rpt_nm_elm_typ6_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ6_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ6())) {
			setValueEx(columnDtl_rpt_nm_elm_typ7, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ8, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ9, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

	@Override
	public void doDtl_rpt_nm_elm_typ7_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ7_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ7())) {
			setValueEx(columnDtl_rpt_nm_elm_typ8, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ9, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

	@Override
	public void doDtl_rpt_nm_elm_typ8_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ8_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ8())) {
			setValueEx(columnDtl_rpt_nm_elm_typ9, idx, null);
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

	@Override
	public void doDtl_rpt_nm_elm_typ9_LC(MCEventInfo info) {
		super.doDtl_rpt_nm_elm_typ9_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.rpt_nm_elm_typ9())) {
			setValueEx(columnDtl_rpt_nm_elm_typ10, idx, null);
		}
	}

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
			DtlR row = (DtlR)table.getBaseTable().getRow(index);
			if (isUpdSts()) {
				if (column == columnDtl_rpt_nm_elm_typ2) {
					if (isNull(row.rpt_nm_elm_typ1())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rpt_nm_elm_typ3) {
					if (isNull(row.rpt_nm_elm_typ2())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rpt_nm_elm_typ4) {
					if (isNull(row.rpt_nm_elm_typ3())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rpt_nm_elm_typ5) {
					if (isNull(row.rpt_nm_elm_typ4())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rpt_nm_elm_typ6) {
					if (isNull(row.rpt_nm_elm_typ5())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rpt_nm_elm_typ7) {
					if (isNull(row.rpt_nm_elm_typ6())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rpt_nm_elm_typ8) {
					if (isNull(row.rpt_nm_elm_typ7())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rpt_nm_elm_typ9) {
					if (isNull(row.rpt_nm_elm_typ8())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_rpt_nm_elm_typ10) {
					if (isNull(row.rpt_nm_elm_typ9())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}