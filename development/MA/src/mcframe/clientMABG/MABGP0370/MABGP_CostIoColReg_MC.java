package mcframe.clientMABG.MABGP0370;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_CostIoColReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_CostIoColReg_MC extends MABGP_CostIoColReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_CostIoColReg_MC() {
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
	public MABGP_CostIoColReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0370_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0370_Srch01Caller<P extends MABGP_CostIoColReg, B extends MA_MABGL0370_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0370_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0370_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0370_Upd01Caller<P extends MABGP_CostIoColReg, B extends MA_MABGL0370_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0370_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0370_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0370_Del01Caller<P extends MABGP_CostIoColReg, B extends MA_MABGL0370_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0370_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0370_Srch01();
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
		callMA_MABGL0370_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABGL0370_Del01();
	}


	@Override
	public void doDtl_cost_io_id_LC(MCEventInfo info) {
		super.doDtl_cost_io_id_LC(info);
		setValueEx(columnDtl_io_col_cd, info.getEventIndex(), null);
	}
	
	@Override
	public void doDtl_io_col_cd_LC(MCEventInfo info) {
		super.doDtl_io_col_cd_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_ac_slip_typ, index, null);
		setValueEx(columnDtl_ac_rsn_cd, index, null);
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
	
		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			// 非表示のカラムはモードを変更しない
			if (MCMode.INVISIBLE_STATUS == column.getModeInfo().getStatus()) {
				return super.getPriorMode(index, column, table);
			}
			
			return getPriorModeSub(index, column, table);
		}
		
		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 * @param index
		 * @param column
		 * @param table
		 * @return 
		 */
		@SuppressWarnings("unchecked")
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(), UPD)) {
				DtlR dtl = (DtlR)table.getBaseTable().getRow(index);
				MCNumber costIoId = dtl.cost_io_id();
				String ioColCd = dtl.io_col_cd(); 
				String ioSmlTyp = dtl.io_sml_typ();
				if (column == columnDtl_io_col_cd) {
					if (isNull(costIoId)){
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ac_slip_typ) {
					if (isNull(ioColCd)) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ac_rsn_cd) {
					if (isNull(ioColCd) || !MAC_IO_SML_TYP.isAC_RSN(ioSmlTyp)) {
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
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_COST_IO_COL));
	}

}