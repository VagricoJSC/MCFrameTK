package mcframe.clientMABC.MABCP0420;

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
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_BpSubReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_BpSubReg_MC extends MABCP_BpSubReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BpSubReg_MC() {
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
	public MABCP_BpSubReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[cnd_select_all]の押下時の処理
	 */
	@Override
	public void doCnd_cnd_select_all(MCEventInfo info) {
		setSrchCndFlgOn();
	}
	/**
	 * Panel[Cnd]のボタン[cnd_deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_cnd_deselect_all(MCEventInfo info) {
		setSrchCndFlgOff();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0420_Srch01();
	}
	/**
	 * [MA_MABCL0420_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0420_Srch01Caller<P extends MABCP_BpSubReg, B extends MA_MABCL0420_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0420_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (isUpdOpe()) {
				Btn_correct_dup_dt.setMode(MCMode.ENABLE);
			}
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}
		@Override
		protected void show() {
			super.show();

			// 未登録行は追加行として扱う
			getDtlL().subList(r->isNull(r.upd_cntr())).setStatus(MCRow.GUICREATE);
		}
		
	}

	/**
	 * [MA_MABCL0420_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0420_Sprt01Caller<P extends MABCP_BpSubReg, B extends MA_MABCL0420_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABCL0420_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0420_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0420_Upd01Caller<P extends MABCP_BpSubReg, B extends MA_MABCL0420_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0420_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0420_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0420_Del01Caller<P extends MABCP_BpSubReg, B extends MA_MABCL0420_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0420_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[BulkSet]のボタン[upd_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_upd_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}

	/**
	 * Panel[Btn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABCL0420_Sprt01();
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
		callMA_MABCL0420_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0420_Del01();
	}
	
	/**
	 * 検索条件の得意先ＦＬＧなどをオンに設定します。
	 */
	protected void setSrchCndFlgOn(){
		setValueEx(Cnd_cst_flg, true);
		setValueEx(Cnd_acst_flg, true);
		setValueEx(Cnd_bcst_flg, true);
		setValueEx(Cnd_rcst_flg, true);
		setValueEx(Cnd_dlv_flg, true);
		setValueEx(Cnd_dest_flg, true);
		setValueEx(Cnd_cred_flg, true);
		setValueEx(Cnd_sppl_flg, true);
		setValueEx(Cnd_asppl_flg, true);
		setValueEx(Cnd_bsppl_flg, true);
		setValueEx(Cnd_psppl_flg, true);
		setValueEx(Cnd_maker_flg, true);
	}
	
	/**
	 * 検索条件の得意先ＦＬＧなどをオフに設定します。
	 */
	protected void setSrchCndFlgOff(){
		setValueEx(Cnd_cst_flg, false);
		setValueEx(Cnd_acst_flg, false);
		setValueEx(Cnd_bcst_flg, false);
		setValueEx(Cnd_rcst_flg, false);
		setValueEx(Cnd_dlv_flg, false);
		setValueEx(Cnd_dest_flg, false);
		setValueEx(Cnd_cred_flg, false);
		setValueEx(Cnd_sppl_flg, false);
		setValueEx(Cnd_asppl_flg, false);
		setValueEx(Cnd_bsppl_flg, false);
		setValueEx(Cnd_psppl_flg, false);
		setValueEx(Cnd_maker_flg, false);
	}
	
	//------------------ 初期設定 Start ------------------//
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BP_SUB));
		setSrchCndFlgOn();
	}
	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (!isDestEnabled(this)) {
			setComponentInvisibleAllStatus(Cnd_dest_flg, columnDtl_dest_flg);
		}
	}
	//------------------ 初期設定 End ------------------//
	
	//------------------ ｲﾍﾞﾝﾄ Start ------------------//	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_dt_p_PPanel.StEndDt_dt.addLCListener(this);
	}
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_dt_p_PPanel.StEndDt_dt) {
			doCnd_dt_LC(info);
		}
	}
	public void doCnd_dt_LC(MCEventInfo info) {
		if (isNull(getCndR().dt_p().dt())) {
			setValueEx(Cnd_ref_ins_flg, false);
		}
		setModeCustom();
	}
	@Override
	public void doCnd_ref_ins_flg_NC(MCEventInfo info) {
		super.doCnd_ref_ins_flg_NC(info);
		if (!getCndR().ref_ins_flg()) {
			setValueEx(Cnd_new_st_dt, null);
		}
		setModeCustom();
	}

	@Override
	public void doDtl_cst_flg_NC(MCEventInfo info) {
		super.doDtl_cst_flg_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_ar_dpt_cd, idx, null);
		setValueEx(columnDtl_cst_cntct_dpt, idx, null);
		setValueEx(columnDtl_cst_cntct_psn, idx, null);
		setValueEx(columnDtl_cst_cntct_psn_title, idx, null);
		setValueEx(columnDtl_sls_tax_cd, idx, null);
		setValueEx(columnDtl_sls_anly_cd1, idx, null);
		setValueEx(columnDtl_sls_anly_cd2, idx, null);
		setValueEx(columnDtl_sls_anly_cd3, idx, null);
	}
	
	@Override
	public void doDtl_bcst_flg_NC(MCEventInfo info) {
		super.doDtl_bcst_flg_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_bcst_dpt_cd, idx, null);
		setValueEx(columnDtl_bill_zip_cd, idx, null);
		setValueEx(columnDtl_bill_addr1, idx, null);
		setValueEx(columnDtl_bill_addr2, idx, null);
		setValueEx(columnDtl_bill_addr3, idx, null);
		setValueEx(columnDtl_bill_addr4, idx, null);
		setValueEx(columnDtl_bill_tel, idx, null);
		setValueEx(columnDtl_bill_bcst_nm, idx, null);
		setValueEx(columnDtl_bill_bcst_dpt, idx, null);
		setValueEx(columnDtl_bill_bcst_psn, idx, null);
		setValueEx(columnDtl_bill_bcst_psn_title, idx, null);
	}
	
	@Override
	public void doDtl_sppl_flg_NC(MCEventInfo info) {
		super.doDtl_sppl_flg_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_sppl_cntct_dpt, idx, null);
		setValueEx(columnDtl_sppl_cntct_psn, idx, null);
		setValueEx(columnDtl_sppl_cntct_psn_title, idx, null);
		setValueEx(columnDtl_purc_tax_cd, idx, null);
		setValueEx(columnDtl_prov_tax_cd, idx, null);
	}
	
	@Override
	public void doDtl_asppl_flg_NC(MCEventInfo info) {
		super.doDtl_asppl_flg_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_ap_dpt_cd, idx, null);
	}
	
	@Override
	public void doDtl_bsppl_flg_NC(MCEventInfo info) {
		super.doDtl_bsppl_flg_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_bsppl_dpt_cd, idx, null);
	}
	@Override
	public void doDtl_psppl_flg_NC(MCEventInfo info) {
		super.doDtl_psppl_flg_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_pay_dpt_cd, idx, null);
	}
	
	@Override
	public void doDtl_dlv_flg_NC(MCEventInfo info) {
		super.doDtl_dlv_flg_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnDtl_dlv_cntct_dpt, idx, null);
		setValueEx(columnDtl_dlv_cntct_psn, idx, null);
		setValueEx(columnDtl_dlv_cntct_psn_title, idx, null);
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
			BulkSet_upd_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_upd_dt.setMode(MCMode.DISABLE);
		}
	}
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}
	
	//------------------ ｲﾍﾞﾝﾄ End ------------------//

	//------------------ セルコンフィグ Start ------------------//
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
			if (getStatus() == UPD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				
				if (column == columnDtl_ar_dpt_cd
				 || column == columnDtl_cst_cntct_dpt
				 || column == columnDtl_cst_cntct_psn
				 || column == columnDtl_cst_cntct_psn_title
				 || column == columnDtl_sls_tax_cd
				 || column == columnDtl_sls_anly_cd1
				 || column == columnDtl_sls_anly_cd2
				 || column == columnDtl_sls_anly_cd3
				 ) {
					if (!r.cst_flg()) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_ar_dpt_cd) {
						if (!MAC_AR_DPT_TYP.isAR(r.ar_dpt_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (column == columnDtl_bcst_dpt_cd
					  || column == columnDtl_bill_zip_cd
					  || column == columnDtl_bill_addr1
					  || column == columnDtl_bill_addr2
					  || column == columnDtl_bill_addr3
					  || column == columnDtl_bill_addr4
					  || column == columnDtl_bill_tel
					  || column == columnDtl_bill_bcst_nm
					  || column == columnDtl_bill_bcst_dpt
					  || column == columnDtl_bill_bcst_psn
					  || column == columnDtl_bill_bcst_psn_title
					  ) {
					if (!r.bcst_flg()) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_bcst_dpt_cd) {
						if (!MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (column == columnDtl_vmi_purc_dpt_cd
					  || column == columnDtl_sppl_cntct_dpt
					  || column == columnDtl_sppl_cntct_psn
					  || column == columnDtl_sppl_cntct_psn_title
					  || column == columnDtl_purc_tax_cd
					  || column == columnDtl_prov_tax_cd
					  ) {
					if (!r.sppl_flg()) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_prov_tax_cd) {
						if (!r.onr_prsppl_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (column == columnDtl_ap_dpt_cd) {
					if (!r.asppl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_bsppl_dpt_cd) {
					if (!r.bsppl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_dlv_cntct_dpt
					  || column == columnDtl_dlv_cntct_psn
					  || column == columnDtl_dlv_cntct_psn_title
					  ) {
					if (!r.dlv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_pay_dpt_cd) {
					if (!r.psppl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	@Override
	public void doDtl_ar_dpt_typ_LC(MCEventInfo info) {
		super.doDtl_ar_dpt_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!MAC_AR_DPT_TYP.isAR(r.ar_dpt_typ()) && !isNull(r)) {
			setValueEx(columnDtl_ar_dpt_cd, idx, null);
		}
		
	}
	@Override
	public void doDtl_bill_dpt_typ_LC(MCEventInfo info) {
		super.doDtl_bill_dpt_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ()) && !isNull(r.bcst_dpt_cd())) {
			setValueEx(columnDtl_bcst_dpt_cd, idx, null);
		}
	}
	//------------------ セルコンフィグ End ------------------//

	//------------------ モード Start ------------------//
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setModeCustom();
	}
	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setModeCustom();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setModeCustom();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setModeCustom();
	}
	protected void setModeCustom() {
		if (isNull(getCndR().dt_p().dt())) {
			Cnd_ref_ins_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_ref_ins_flg);
		}
		if (getCndR().ref_ins_flg()) {
			setDefaultMode(Cnd_new_st_dt);
		}
		else {
			Cnd_new_st_dt.setMode(MCMode.READ_ONLY);
		}
	}
	//------------------ モード End ------------------//

}