package mcframe.clientMABC.MABCP0360;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ItmStopReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ItmStopReg_MC extends MABCP_ItmStopReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmStopReg_MC() {
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
	public MABCP_ItmStopReg_MC(String name) {
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
		callMA_MABCL0360_Srch01();
	}
	/**
	 * [MA_MABCL0360_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0360_Srch01Caller<P extends MABCP_ItmStopReg, B extends MA_MABCL0360_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0360_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0360_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0360_Upd01Caller<P extends MABCP_ItmStopReg, B extends MA_MABCL0360_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0360_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0360_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0360_Del01Caller<P extends MABCP_ItmStopReg, B extends MA_MABCL0360_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0360_Del01Caller(P p, B b) {
			super(p, b);
		}
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
		callMA_MABCL0360_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL0360_Del01();
	}
	
	@Override
	public void doCnd_slo_stop_f_flg_NC(MCEventInfo info) {
		super.doCnd_slo_stop_f_flg_NC(info);
		if (getCndR().slo_stop_f_flg()) {
			Cnd_slo_stop_t_flg.setValue(false);
		}
		setSloStopDtMode();
	}
	
	@Override
	public void doCnd_slo_stop_t_flg_NC(MCEventInfo info) {
		super.doCnd_slo_stop_t_flg_NC(info);
		if (getCndR().slo_stop_t_flg()) {
			Cnd_slo_stop_f_flg.setValue(false);
		}
		setSloStopDtMode();
	}
	
	@Override
	public void doCnd_po_stop_f_flg_NC(MCEventInfo info) {
		super.doCnd_po_stop_f_flg_NC(info);
		if (getCndR().po_stop_f_flg()) {
			Cnd_po_stop_t_flg.setValue(false);
		}
		setPoStopDtMode();
	}
	
	@Override
	public void doCnd_po_stop_t_flg_NC(MCEventInfo info) {
		super.doCnd_po_stop_t_flg_NC(info);
		if (getCndR().po_stop_t_flg()) {
			Cnd_po_stop_f_flg.setValue(false);
		}
		setPoStopDtMode();
	}
	
	@Override
	public void doCnd_sls_stop_f_flg_NC(MCEventInfo info) {
		super.doCnd_sls_stop_f_flg_NC(info);
		if (getCndR().sls_stop_f_flg()) {
			Cnd_sls_stop_t_flg.setValue(false);
		}
		setSlsStopDtMode();
	}
	
	@Override
	public void doCnd_sls_stop_t_flg_NC(MCEventInfo info) {
		super.doCnd_sls_stop_t_flg_NC(info);
		if (getCndR().sls_stop_t_flg()) {
			Cnd_sls_stop_f_flg.setValue(false);
		}
		setSlsStopDtMode();
	}
	
	@Override
	public void doCnd_purc_stop_f_flg_NC(MCEventInfo info) {
		super.doCnd_purc_stop_f_flg_NC(info);
		if (getCndR().purc_stop_f_flg()) {
			Cnd_purc_stop_t_flg.setValue(false);
		}
		setPurcStopDtMode();
	}
	
	@Override
	public void doCnd_purc_stop_t_flg_NC(MCEventInfo info) {
		super.doCnd_purc_stop_t_flg_NC(info);
		if (getCndR().purc_stop_t_flg()) {
			Cnd_purc_stop_f_flg.setValue(false);
		}
		setPurcStopDtMode();
	}
	
	@Override
	public void doCnd_order_stop_f_flg_NC(MCEventInfo info) {
		super.doCnd_order_stop_f_flg_NC(info);
		if (getCndR().order_stop_f_flg()) {
			Cnd_order_stop_t_flg.setValue(false);
		}
		setOrderStopDtMode();
	}
	
	@Override
	public void doCnd_order_stop_t_flg_NC(MCEventInfo info) {
		super.doCnd_order_stop_t_flg_NC(info);
		if (getCndR().order_stop_t_flg()) {
			Cnd_order_stop_f_flg.setValue(false);
		}
		setOrderStopDtMode();
	}
	
	@Override
	public void doCnd_mfg_inst_stop_f_flg_NC(MCEventInfo info) {
		super.doCnd_mfg_inst_stop_f_flg_NC(info);
		if (getCndR().mfg_inst_stop_f_flg()) {
			Cnd_mfg_inst_stop_t_flg.setValue(false);
		}
		setMfgInstStopDtMode();
	}
	
	@Override
	public void doCnd_mfg_inst_stop_t_flg_NC(MCEventInfo info) {
		super.doCnd_mfg_inst_stop_t_flg_NC(info);
		if (getCndR().mfg_inst_stop_t_flg()) {
			Cnd_mfg_inst_stop_f_flg.setValue(false);
		}
		setMfgInstStopDtMode();
	}
	
	@Override
	public void doCnd_ship_inst_stop_f_flg_NC(MCEventInfo info) {
		super.doCnd_ship_inst_stop_f_flg_NC(info);
		if (getCndR().ship_inst_stop_f_flg()) {
			Cnd_ship_inst_stop_t_flg.setValue(false);
		}
		setShipInstStopDtMode();
	}
	
	@Override
	public void doCnd_ship_inst_stop_t_flg_NC(MCEventInfo info) {
		super.doCnd_ship_inst_stop_t_flg_NC(info);
		if (getCndR().ship_inst_stop_t_flg()) {
			Cnd_ship_inst_stop_f_flg.setValue(false);
		}
		setShipInstStopDtMode();
	}
	
	@Override
	public void doCnd_xfr_stop_f_flg_NC(MCEventInfo info) {
		super.doCnd_xfr_stop_f_flg_NC(info);
		if (getCndR().xfr_stop_f_flg()) {
			Cnd_xfr_stop_t_flg.setValue(false);
		}
		setXfrStopDtMode();
	}
	
	@Override
	public void doCnd_xfr_stop_t_flg_NC(MCEventInfo info) {
		super.doCnd_xfr_stop_t_flg_NC(info);
		if (getCndR().xfr_stop_t_flg()) {
			Cnd_xfr_stop_f_flg.setValue(false);
		}
		setXfrStopDtMode();
	}
	
	protected void setSloStopDtMode() {

		if (!getCndR().slo_stop_f_flg() && getCndR().slo_stop_t_flg()) {
			Cnd_slo_stop_dt_fr.setMode(MCMode.ENABLE);
			Cnd_slo_stop_dt_to.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_slo_stop_dt_fr.setValue(null);
			Cnd_slo_stop_dt_to.setValue(null);
			setDefaultMode(Cnd_slo_stop_dt_fr);
			setDefaultMode(Cnd_slo_stop_dt_to);
		}
	}
	
	protected void setPoStopDtMode() {

		if (!getCndR().po_stop_f_flg() && getCndR().po_stop_t_flg()) {
			Cnd_po_stop_dt_fr.setMode(MCMode.ENABLE);
			Cnd_po_stop_dt_to.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_po_stop_dt_fr.setValue(null);
			Cnd_po_stop_dt_to.setValue(null);
			setDefaultMode(Cnd_po_stop_dt_fr);
			setDefaultMode(Cnd_po_stop_dt_to);
		}
	}
	
	protected void setSlsStopDtMode() {

		if (!getCndR().sls_stop_f_flg() && getCndR().sls_stop_t_flg()) {
			Cnd_sls_stop_dt_fr.setMode(MCMode.ENABLE);
			Cnd_sls_stop_dt_to.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_sls_stop_dt_fr.setValue(null);
			Cnd_sls_stop_dt_to.setValue(null);
			setDefaultMode(Cnd_sls_stop_dt_fr);
			setDefaultMode(Cnd_sls_stop_dt_to);
		}
	}
	
	protected void setPurcStopDtMode() {

		if (!getCndR().purc_stop_f_flg() && getCndR().purc_stop_t_flg()) {
			Cnd_purc_stop_dt_fr.setMode(MCMode.ENABLE);
			Cnd_purc_stop_dt_to.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_purc_stop_dt_fr.setValue(null);
			Cnd_purc_stop_dt_to.setValue(null);
			setDefaultMode(Cnd_purc_stop_dt_fr);
			setDefaultMode(Cnd_purc_stop_dt_to);
		}
	}
	
	protected void setOrderStopDtMode() {

		if (!getCndR().order_stop_f_flg() && getCndR().order_stop_t_flg()) {
			Cnd_order_stop_dt_fr.setMode(MCMode.ENABLE);
			Cnd_order_stop_dt_to.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_order_stop_dt_fr.setValue(null);
			Cnd_order_stop_dt_to.setValue(null);
			setDefaultMode(Cnd_order_stop_dt_fr);
			setDefaultMode(Cnd_order_stop_dt_to);
		}
	}
	
	protected void setMfgInstStopDtMode() {

		if (!getCndR().mfg_inst_stop_f_flg() && getCndR().mfg_inst_stop_t_flg()) {
			Cnd_mfg_inst_stop_dt_fr.setMode(MCMode.ENABLE);
			Cnd_mfg_inst_stop_dt_to.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_mfg_inst_stop_dt_fr.setValue(null);
			Cnd_mfg_inst_stop_dt_to.setValue(null);
			setDefaultMode(Cnd_mfg_inst_stop_dt_fr);
			setDefaultMode(Cnd_mfg_inst_stop_dt_to);
		}
	}
	
	protected void setShipInstStopDtMode() {

		if (!getCndR().ship_inst_stop_f_flg() && getCndR().ship_inst_stop_t_flg()) {
			Cnd_ship_inst_stop_dt_fr.setMode(MCMode.ENABLE);
			Cnd_ship_inst_stop_dt_to.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_ship_inst_stop_dt_fr.setValue(null);
			Cnd_ship_inst_stop_dt_to.setValue(null);
			setDefaultMode(Cnd_ship_inst_stop_dt_fr);
			setDefaultMode(Cnd_ship_inst_stop_dt_to);
		}
	}
	
	protected void setXfrStopDtMode() {

		if (!getCndR().xfr_stop_f_flg() && getCndR().xfr_stop_t_flg()) {
			Cnd_xfr_stop_dt_fr.setMode(MCMode.ENABLE);
			Cnd_xfr_stop_dt_to.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_xfr_stop_dt_fr.setValue(null);
			Cnd_xfr_stop_dt_to.setValue(null);
			setDefaultMode(Cnd_xfr_stop_dt_fr);
			setDefaultMode(Cnd_xfr_stop_dt_to);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_ITM_STOP));
	}

}