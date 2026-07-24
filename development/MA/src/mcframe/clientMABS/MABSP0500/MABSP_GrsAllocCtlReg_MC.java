package mcframe.clientMABS.MABSP0500;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_GrsAllocCtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_GrsAllocCtlReg_MC extends MABSP_GrsAllocCtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_GrsAllocCtlReg_MC() {
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
	public MABSP_GrsAllocCtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0500_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0500_Srch01Caller<P extends MABSP_GrsAllocCtlReg, B extends MA_MABSL0500_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0500_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABSL0500_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0500_Upd01Caller<P extends MABSP_GrsAllocCtlReg, B extends MA_MABSL0500_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0500_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0500_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0500_Del01Caller<P extends MABSP_GrsAllocCtlReg, B extends MA_MABSL0500_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0500_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0500_Srch01();
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
		callMA_MABSL0500_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABSL0500_Del01();
	}

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createAppCellConfig());
	}
	
	protected MCCellConfig createAppCellConfig() {
		return new AppCellConfig(this);
	}
	
	protected class AppCellConfig extends MAUDP_RLBaseCellConfig {
		public AppCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getRow(index);
			
			if (getStatus() == UPD) {
				if (column == columnDtl_alloc_grp_cd) {
					if (!isNullOrNullVal(r.lg_grp_cd())
							&& (!isNullOrNullVal(r.loc_cd()) || (isNullOrNullVal(r.alloc_grp_cd())))) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_lg_grp_cd) {
					if (!isNullOrNullVal(r.alloc_grp_cd()) && !isNullOrNullVal(r.loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_loc_cd) {
					if (!isNullOrNullVal(r.alloc_grp_cd()) && !isNullOrNullVal(r.lg_grp_cd())) {
						return MCMode.READ_ONLY;
					}
					if (isNullOrNullVal(r.alloc_grp_cd()) && isNullOrNullVal(r.lg_grp_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}	
			return super.getPriorMode(index, column, table);
		}	
	}

	@Override
	public void doDtl_alloc_grp_cd_LC(MCEventInfo info) {
		super.doDtl_alloc_grp_cd_LC(info);

		int idx = info.getEventIndex();

		setValueEx(columnDtl_lg_grp_cd, idx, null);
		setValueEx(columnDtl_loc_cd, idx, null);
		setValueEx(columnDtl_alloc_scope_typ, idx, null);
	}

	@Override
	public void doDtl_lg_grp_cd_LC(MCEventInfo info) {
		super.doDtl_lg_grp_cd_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		setValueEx(columnDtl_loc_cd, idx, null);
		setValueEx(columnDtl_alloc_scope_typ, idx, null);

		if (!isNull(r.alloc_grp_cd()) && !isNull(r.lg_grp_cd())) {
			setValueEx(columnDtl_alloc_scope_typ, idx, MAC_ALLOC_SCOPE_TYP.ALLOC_GRP.value());
		}
	}

	@Override
	public void doDtl_loc_cd_LC(MCEventInfo info) {
		super.doDtl_loc_cd_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		setValueEx(columnDtl_alloc_scope_typ, idx, null);

		if ((!isNull(r.alloc_grp_cd()) || (!isNull(r.lg_grp_cd())) && !isNull(r.loc_cd()))) {
			setValueEx(columnDtl_alloc_scope_typ, idx, MAC_ALLOC_SCOPE_TYP.LOC.value());
		}
	}

	@Override
	public MCList getDtl_loc_cd(MCRow row, MCEventInfo info) {
		if (MAC_STR.isNULL_VAL(row.getString(DtlR.$alloc_grp_cd))) {
			row.setString(DtlR.$alloc_grp_cd, null);
		}
		if (MAC_STR.isNULL_VAL(row.getString(DtlR.$lg_grp_cd))) {
			row.setString(DtlR.$lg_grp_cd, null);
		}
		return super.getDtl_loc_cd(row, info);
	}

}