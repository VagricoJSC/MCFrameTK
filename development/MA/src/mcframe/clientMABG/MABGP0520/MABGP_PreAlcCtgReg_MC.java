package mcframe.clientMABG.MABGP0520;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5160.*;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import java.util.LinkedHashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_PreAlcCtgReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_PreAlcCtgReg_MC extends MABGP_PreAlcCtgReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_PreAlcCtgReg_MC() {
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
	public MABGP_PreAlcCtgReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0520_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0520_Srch01Caller<P extends MABGP_PreAlcCtgReg, B extends MA_MABGL0520_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0520_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0520_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0520_Upd01Caller<P extends MABGP_PreAlcCtgReg, B extends MA_MABGL0520_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0520_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0520_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0520_Del01Caller<P extends MABGP_PreAlcCtgReg, B extends MA_MABGL0520_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0520_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0520_Srch01();
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
		callMA_MABGL0520_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0520_Del01();
	}
	
	@Override
	public void doDtl_pre_alc_rate_cd_LC(MCEventInfo info) {
		super.doDtl_pre_alc_rate_cd_LC(info);
		int index = info.getEventIndex();
		setValueEx(columnDtl_data_pln_sa_typ, index, null);
		setValueEx(columnDtl_key_pln_sa_typ, index, null);
		setValueEx(columnDtl_key_pln_ym, index, null);
		setValueEx(columnDtl_data_act_sa_typ, index, null);
		setValueEx(columnDtl_key_act_sa_typ, index, null);
		setValueEx(columnDtl_key_act_ym, index, null);
	}
	
	// //////////////////////////////////////////////
	// セルコンフィグ/////////////////////////////////////
	// //////////////////////////////////////////////
	
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
			if (isInptStatus()) {
				DtlR row = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_data_pln_sa_typ
						|| column == columnDtl_key_pln_sa_typ
						|| column == columnDtl_key_pln_ym) {
					if (!row.pln_mly_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_data_act_sa_typ
						|| column == columnDtl_key_act_sa_typ
						|| column == columnDtl_key_act_ym) {
					if (!row.act_mly_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
	}
	
	/**
	 * 一覧が入力可能なステータスかどうか
	 */
	protected boolean isInptStatus() {
		return getStatus() == UPD;
	}

}