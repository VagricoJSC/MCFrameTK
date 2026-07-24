package mcframe.clientMABG.MABGP0540;

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
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_PreAlcRateSelReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_PreAlcRateSelReg_MC extends MABGP_PreAlcRateSelReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_PreAlcRateSelReg_MC() {
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
	public MABGP_PreAlcRateSelReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0540_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0540_Srch01Caller<P extends MABGP_PreAlcRateSelReg, B extends MA_MABGL0540_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0540_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0540_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0540_Upd01Caller<P extends MABGP_PreAlcRateSelReg, B extends MA_MABGL0540_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0540_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0540_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0540_Del01Caller<P extends MABGP_PreAlcRateSelReg, B extends MA_MABGL0540_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0540_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0540_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0510]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0510(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0510");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0510CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0530]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0530(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0530");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0530CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABGP0510]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0510.CndR crtOpenMABGP0510CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0510.CndR to =
			mcframe.clientMABG.MABGP0510.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.pre_alc_rate_cd(fr.pre_alc_rate_cd());
		}
		return to;
	}
	/**
	 * 遷移先[MABGP0530]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0530.CndR crtOpenMABGP0530CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0530.CndR to =
			mcframe.clientMABG.MABGP0530.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.pre_alc_dpt_ptn(fr.pre_alc_dpt_ptn());
			to.term_fr(fr.term());
			to.term_to(fr.term());
		}
		return to;
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
		callMA_MABGL0540_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0540_Del01();
	}
	
	//------------------ 初期設定 Start ------------------//
	@Override
	public void setSortColumn() {
		super.setSortColumn();
		DtlTable.addSortColumn(columnDtl_calc_ctg_cd, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_term, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_dpt_cd, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_alc_ac_cd, SortType.ASC);
	}
	
	//------------------ 初期設定 End ------------------//
	
	//------------------ ステータス設定 Start ------------------//

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setOpenButtonMode();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setOpenButtonMode();
	}
	
	protected void setOpenButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		
		if (r == null
				|| isNull(r.pre_alc_rate_cd())) {
			Btn_open_MABGP0510.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MABGP0510);
		}
		if (r == null
				|| isNull(r.term())
				|| isNull(r.pre_alc_dpt_ptn())) {
			Btn_open_MABGP0530.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MABGP0530);
		}
	}
		
	//------------------ ステータス設定 End ------------------//

	//------------------ イベント Start ------------------//
		
	// **無ＦＬＧがＯＮになったとき対象のＣＤをクリアする
	@Override
	public void doCnd_no_dpt_flg_NC(MCEventInfo info){
		super.doCnd_no_dpt_flg_NC(info);
		if(Cnd_no_dpt_flg.getValue()) {
			setValueEx(Cnd_dpt_cd, null);
			setValueEx(Cnd_dpt_nm, null);
		}
	}

	@Override
	public void doCnd_no_alc_ac_flg_NC(MCEventInfo info){
		super.doCnd_no_alc_ac_flg_NC(info);
		if(Cnd_no_alc_ac_flg.getValue()) {
			setValueEx(Cnd_alc_ac_cd, null);
			setValueEx(Cnd_alc_ac_nm, null);
		}
	}
	
	// ＣＤ，名称が入力されたとき**無ＦＬＧをＯＦＦにする。
	@Override
	public void doCnd_dpt_cd_NC(MCEventInfo info){
		super.doCnd_dpt_cd_NC(info);
		if(!isNull(Cnd_dpt_cd.getValue())) {
			setValueEx(Cnd_no_dpt_flg, false);
		}
	}
	@Override
	public void doCnd_dpt_nm_NC(MCEventInfo info){
		super.doCnd_dpt_nm_NC(info);
		if(!isNull(Cnd_dpt_nm.getValue())) {
			setValueEx(Cnd_no_dpt_flg, false);
		}
	}
	@Override
	public void doCnd_alc_ac_cd_NC(MCEventInfo info){
		super.doCnd_alc_ac_cd_NC(info);
		if(!isNull(Cnd_alc_ac_cd.getValue())) {
			setValueEx(Cnd_no_alc_ac_flg, false);
		}
	}
	@Override
	public void doCnd_alc_ac_nm_NC(MCEventInfo info){
		super.doCnd_alc_ac_nm_NC(info);
		if(!isNull(Cnd_alc_ac_nm.getValue())) {
			setValueEx(Cnd_no_alc_ac_flg,false);
		}
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info){
		super.doDtl_NC(info);
		setOpenButtonMode();
	}

	@Override
	public void doDtl_pre_alc_rate_cd_LC(MCEventInfo info){
		super.doDtl_pre_alc_rate_cd_LC(info);
		setOpenButtonMode();
	}
	@Override
	public void doDtl_pre_alc_dpt_ptn_LC(MCEventInfo info){
		super.doDtl_pre_alc_dpt_ptn_LC(info);
		setOpenButtonMode();
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_term_p_PPanel.columnTerm_term.addLCListener(this);
	}
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc ==Dtl_term_p_PPanel.columnTerm_term) doDtl_term_LC(info);
	}
	
	public void doDtl_term_LC(MCEventInfo info) {
		setValueEx(columnDtl_pre_alc_rate_cd,info.getEventIndex(), null);
		setValueEx(columnDtl_pre_alc_dpt_ptn,info.getEventIndex(), null);
		setOpenButtonMode();
	}
		
	@Override
	public void doDtl_calc_ctg_cd_LC(MCEventInfo info) {
		super.doDtl_calc_ctg_cd_LC(info);
		setValueEx(columnDtl_pre_alc_rate_cd,info.getEventIndex(), null);
	}
	
	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		setValueEx(columnDtl_pre_alc_rate_cd,info.getEventIndex(), null);
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
			DtlR r = DtlTable.getRow(index);
			if (column == columnDtl_pre_alc_dpt_ptn) {
				if (isNull(r.term())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_pre_alc_rate_cd) {
				if (isNull(r.term()) || isNull(r.calc_ctg_cd()) || isNull(r.wg_cd()) && isNullOrNullVal(getSysParm("DEF_WG_CD"))) {
					return MCMode.READ_ONLY;
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

}