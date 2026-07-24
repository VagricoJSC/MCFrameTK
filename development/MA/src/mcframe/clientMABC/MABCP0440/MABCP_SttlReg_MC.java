package mcframe.clientMABC.MABCP0440;

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
 * 画面"MABCP_SttlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_SttlReg_MC extends MABCP_SttlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SttlReg_MC() {
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
	public MABCP_SttlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0440_Upd01();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0440_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0440_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0440_Del01();
	}
	/**
	 * [MA_MABCL0440_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0440_Srch01Caller<P extends MABCP_SttlReg, B extends MA_MABCL0440_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0440_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索結果のフラグを変更前フラグにコピーする
			bridge.down0().setColumnValue(DtlR.$org_ap_sttl_flg, bridge.down0(), DtlR.$ap_sttl_flg);
			bridge.down0().setColumnValue(DtlR.$org_ar_sttl_flg, bridge.down0(), DtlR.$ar_sttl_flg);
		}
	}
	/**
	 * [MA_MABCL0440_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0440_Upd01Caller<P extends MABCP_SttlReg, B extends MA_MABCL0440_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0440_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0440_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0440_Del01Caller<P extends MABCP_SttlReg, B extends MA_MABCL0440_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0440_Del01Caller(P p, B b) {
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
	// --------------------セルコンフィグstart--------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createSttlTableCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 決済方法明細用のセルコンフィグ
	 */
	protected SttlTableCellConfig createSttlTableCellConfig() {

		return new SttlTableCellConfig(this);
	}

	/**
	 * 決済方法明細用のセルコンフィグクラス
	 */
	protected class SttlTableCellConfig extends MAUDP_RLBaseCellConfig {

		public SttlTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR row = (DtlR)table.getBaseTable().getRow(index);

			if (getStatus() == UPD) {
				if (!isNull(row.upd_cntr())) {
					if (isFlgReadOnlyColumn(column, row)) {
						return MCMode.READ_ONLY;
					}
				}
			}

			if (isUpdSts()) {
				DtlR r = DtlTable.getRow(index);
				if (column == columnDtl_ar_sttl_typ) {
					if (!r.ar_sttl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rcv_reg_typ) {
					if (!MAC_AR_STTL_TYP.isCASH(r.ar_sttl_typ())	
					 && !MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())	
					 && !MAC_AR_STTL_TYP.isNOTE(r.ar_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sls_purc_typ) {
					if (!MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ()) && !MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_calc_com_paid_flg) {
					if (!MAC_AR_STTL_TYP.isCASH(r.ar_sttl_typ())
					 && !MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())
					 && !MAC_AR_STTL_TYP.isNOTE(r.ar_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ar_setoff_cd) {
					if (!MAC_AR_STTL_TYP.isCASH(r.ar_sttl_typ())
					 && !MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())
					 && !MAC_AR_STTL_TYP.isNOTE(r.ar_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						if (r.calc_com_paid_flg()) {
							return MCMode.REQUIRED;
						}
					}
				}
				else if (column == columnDtl_debt_cred_id_typ) {
					if (!MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ())
					 && !MAC_AR_STTL_TYP.isSETOFF_CR(r.ar_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ap_sttl_typ) {
					if (!r.ap_sttl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ap_setoff_typ) {
					if (!MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ap_setoff_act_flg) {
					if (!(MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())
					 && (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ()) || MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())))) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ac_rsn_cd) {
					if (MAC_AR_STTL_TYP.isSW(r.ar_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_IN_CHK(r.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(r.ap_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_bill_tax_disp_flg) {
					if (!MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ()) && !MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * 検索後の債権決済方法、債務決済方法フラグ項目が入力可能かどうかを返す。
	 * 
	 * @param column 判定するカラム
	 * @param dtl Rowクラス
	 * @return フラグはチェックオンの場合に入力不可ならtrue
	 */
	protected boolean isFlgReadOnlyColumn(MCColumnConfig column, DtlR dtl) {
		if ((column == columnDtl_ar_sttl_flg && dtl.org_ar_sttl_flg())
				|| (column == columnDtl_ap_sttl_flg && dtl.org_ap_sttl_flg())) {
			return true;
		}
		return false;
	}
	// --------------------セルコンフィグend----------------------
	// --------------------画面イベントstart--------------------
	@Override
	public void doDtl_ar_sttl_flg_NC(MCEventInfo info) {
		super.doDtl_ar_sttl_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		// 債権決済方法
		if (!r.ar_sttl_flg()) {
			setValueEx(columnDtl_ar_sttl_typ, idx, null);
			setValueEx(columnDtl_rcv_reg_typ, idx, null);
			if (!MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
				setValueEx(columnDtl_sls_purc_typ, idx, null);
			}
			setValueEx(columnDtl_calc_com_paid_flg, idx, false);
			setValueEx(columnDtl_ar_setoff_cd, idx, null);
			setValueEx(columnDtl_debt_cred_id_typ, idx, null);
		}
	}
	@Override
	public void doDtl_ap_sttl_flg_NC(MCEventInfo info) {
		super.doDtl_ap_sttl_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		// 債務決済方法
		if (!r.ap_sttl_flg()) {
			setValueEx(columnDtl_ap_sttl_typ, idx, null);
			setValueEx(columnDtl_ap_setoff_typ, idx, null);
		}
	}
	@Override
	public void doDtl_ar_sttl_typ_LC(MCEventInfo info) {
		super.doDtl_ar_sttl_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
			setValueEx(columnDtl_sls_purc_typ, idx, null);
		}
		
		// 債権決済区分:「1：現金」 「2：振込」 「3：手形」 以外
		if (!MAC_AR_STTL_TYP.isCASH(r.ar_sttl_typ())
		 && !MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())
		 && !MAC_AR_STTL_TYP.isNOTE(r.ar_sttl_typ())) {
			setValueEx(columnDtl_rcv_reg_typ, idx, null);
			setValueEx(columnDtl_calc_com_paid_flg, idx, false);
			setValueEx(columnDtl_ar_setoff_cd, idx, null);
		}
		
		if (!MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ())
		 && !MAC_AR_STTL_TYP.isSETOFF_CR(r.ar_sttl_typ())) {
			setValueEx(columnDtl_debt_cred_id_typ, idx, null);
		}
		
		if (!MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ())) {
			setValueEx(columnDtl_bill_tax_disp_flg, idx, false);
		}
		
		if (MAC_AR_STTL_TYP.isSW(r.ar_sttl_typ())){
			setValueEx(columnDtl_ac_rsn_cd, idx, null);
		}
	}
	@Override
	public void doDtl_ap_sttl_typ_LC(MCEventInfo info) {
		super.doDtl_ap_sttl_typ_LC(info);
		
		int idx = info.getEventIndex();
		setValueEx(columnDtl_ap_setoff_typ, idx, null);
		DtlR r = getDtlL().get(idx);
		if (!(MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())
		 && (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ()) || MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())))) {
			setValueEx(columnDtl_ap_setoff_act_flg, idx, false);
		}
		
		if (MAC_AP_STTL_TYP.isAPSW_IN_CHK(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(r.ap_sttl_typ())){
			setValueEx(columnDtl_ac_rsn_cd, idx, null);
		}
		if (!MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ())) {
			setValueEx(columnDtl_sls_purc_typ, idx, null);
			setValueEx(columnDtl_bill_tax_disp_flg, idx, false);
		}
	}
	@Override
	public void doDtl_ap_setoff_typ_LC(MCEventInfo info) {
		super.doDtl_ap_setoff_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (!(MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())
		 && (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ()) || MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())))) {
			setValueEx(columnDtl_ap_setoff_act_flg, idx, false);
		}
	}
	// --------------------画面イベントend----------------------
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_STTL));
	}

}