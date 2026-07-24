package mcframe.clientMABG.MABGP0510;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_PreAlcRateReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_PreAlcRateReg_MC extends MABGP_PreAlcRateReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_PreAlcRateReg_MC() {
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
	public MABGP_PreAlcRateReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0510_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0510_Srch01Caller<P extends MABGP_PreAlcRateReg, B extends MA_MABGL0510_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABGL0510_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0510_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0510_Upd01Caller<P extends MABGP_PreAlcRateReg, B extends MA_MABGL0510_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABGL0510_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0510_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0510_Del01Caller<P extends MABGP_PreAlcRateReg, B extends MA_MABGL0510_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABGL0510_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0510_Srch01();
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
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABGL0510_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0510_Del01();
	}
	



	
	//------------------ 初期設定 Start------------------//
	
	@Override
	public void setSortColumn() {
		super.setSortColumn();
		DtlTable.addSortColumn(columnDtl_pre_alc_rate_cd, SortType.ASC);
	}
	
	//------------------ 初期設定 End------------------//
	
	//------------------ イベント Start------------------//
	@Override
	public void doDtl_pln_mly_flg_NC(MCEventInfo info) {
		super.doDtl_pln_mly_flg_NC(info);
		doDtlPlnActMlyFlgNc(info);
	}
	
	@Override
	public void doDtl_act_mly_flg_NC(MCEventInfo info) {
		super.doDtl_act_mly_flg_NC(info);
		doDtlPlnActMlyFlgNc(info);
	}
	
	/**
	 * [Dtl]の[pln_mly_flgまたはact_mly_flg]のNCイベントで呼ばれる
	 * @param info
	 */
	protected void doDtlPlnActMlyFlgNc(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		if (isPlnRuleFlgClear(row)) {
			setValueEx(columnDtl_pln_rule_flg, index, false);
		}
		if (isPreAlcSetTypClear(row)) {
			setValueEx(columnDtl_pre_alc_set_typ, index, null);
		}
	}
	
	/**
	 * 基準計画をクリアするかどうか
	 * @param row
	 */
	protected boolean isPlnRuleFlgClear(DtlR row) {
		return !row.pln_mly_flg() || row.act_mly_flg();
	}
	
	/**
	 * 比率設定区分をクリアするかどうか
	 * @param row
	 */
	protected boolean isPreAlcSetTypClear(DtlR row) {
		return !row.pln_mly_flg() && !row.act_mly_flg();
	}
	
	//------------------ イベント End------------------//
	
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
				if (column == columnDtl_pln_rule_flg) {
					if (isPlnRuleFlgClear(row)) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_pre_alc_set_typ) {
					if (isPreAlcSetTypClear(row)) {
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