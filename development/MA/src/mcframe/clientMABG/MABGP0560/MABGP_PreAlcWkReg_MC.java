package mcframe.clientMABG.MABGP0560;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_PreAlcWkReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_PreAlcWkReg_MC extends MABGP_PreAlcWkReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_PreAlcWkReg_MC() {
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
	public MABGP_PreAlcWkReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0560_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0560_Srch01Caller<P extends MABGP_PreAlcWkReg, B extends MA_MABGL0560_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0560_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0560_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0560_Upd01Caller<P extends MABGP_PreAlcWkReg, B extends MA_MABGL0560_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0560_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0560_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0560_Del01Caller<P extends MABGP_PreAlcWkReg, B extends MA_MABGL0560_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0560_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0560_Srch01();
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
		callMA_MABGL0560_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0560_Del01();
	}
	
	//------------------ イベント Start ------------------//
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_term_p_PPanel.columnTerm_term.addLCListener(this);
	}
	
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc ==Dtl_term_p_PPanel.columnTerm_term) doDtl_term_LC(info);
	}
	@Override
	public void doDtl_calc_ctg_cd_LC(MCEventInfo info) {
		super.doDtl_calc_ctg_cd_LC(info);
		clearPreAlcRate(info);
	}
	
	public void doDtl_term_LC(MCEventInfo info) {
		clearPreAlcRate(info);
	}
	
	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		clearPreAlcRate(info);
	}
	
	
	/**
	 * 一次配賦基準をクリアする
	 * @param info
	 */
	protected void clearPreAlcRate(MCEventInfo info) {
		int index = info.getEventIndex();
		setValueEx(columnDtl_pre_alc_rate_cd, index, null);
	}
	
	//------------------ イベント End ------------------//
	
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
				if (column == columnDtl_pre_alc_rate_cd) {
					if (isNullOr(row.calc_ctg_cd(), row.term()) || isNull(row.wg_cd()) && isNullOrNullVal(getSysParm("DEF_WG_CD"))) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
	}

	@Override
	public MCList getDtl_pre_alc_rate_cd(MCRow row, MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		String wg = getSysParm("DEF_WG_CD");
		if (!isNullOrNullVal(wg) && isNullOrNullVal(r.wg_cd())) {
			r.wg_cd(wg);
			row.addStringColumn(PreAlcRateInPreAlcCtgCols.$i_wg_cd, wg);
		}
		return super.getDtl_pre_alc_rate_cd(row, info);
	}
	
	/**
	 * 一覧が入力可能なステータスかどうか
	 */
	protected boolean isInptStatus() {
		return getStatus() == UPD;
	}

}