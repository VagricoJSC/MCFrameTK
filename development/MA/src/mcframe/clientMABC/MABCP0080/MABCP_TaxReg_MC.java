package mcframe.clientMABC.MABCP0080;

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
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_TaxReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_TaxReg_MC extends MABCP_TaxReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_TaxReg_MC() {
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
	public MABCP_TaxReg_MC(String name) {
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
		callMA_MABCL0080_Srch01();
	}
	/**
	 * [MA_MABCL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0080_Srch01Caller<P extends MABCP_TaxReg, B extends MA_MABCL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0080_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索結果のフラグを変更前フラグにコピーする
			bridge.down0().setColumnValue(DtlR.$org_sls_flg, bridge.down0(), DtlR.$sls_flg);
			bridge.down0().setColumnValue(DtlR.$org_purc_flg, bridge.down0(), DtlR.$purc_flg);
			bridge.down0().setColumnValue(DtlR.$org_prov_flg, bridge.down0(), DtlR.$prov_flg);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0080_Upd01Caller<P extends MABCP_TaxReg, B extends MA_MABCL0080_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0080_Upd01Caller(P p, B b) {
			super(p, b);
		}

	}

	/**
	 * [MA_MABCL0080_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0080_Del01Caller<P extends MABCP_TaxReg, B extends MA_MABCL0080_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0080_Del01Caller(P p, B b) {
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
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0080_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0080_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0080_Del01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_TAX));
	}

	@Override
	public void doDtl_tax_typ_NC(MCEventInfo info) {
		super.doDtl_tax_typ_NC(info);
		
		int i = info.getEventIndex();
		if (i >= 0) {
			DtlR r = getDtlL().get(i);
			if(!MAC_TAX_TYP.isTAX_ABL(r.tax_typ())){
				setValueEx(columnDtl_inc_tax_flg, i, false);
				r.tax_rate(MCNumber.ZERO);
			}
		}
	}
	
	@Override
	public void doDtl_inc_tax_flg_NC(MCEventInfo info) {
		super.doDtl_inc_tax_flg_NC(info);

		int i = info.getEventIndex();
		if (i >= 0) {
			DtlR r = getDtlL().get(i);
			if(r.inc_tax_flg()){
				setValueEx(columnDtl_prov_flg, i, false);
			}
		}
	}

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	public class DtlConf extends MAUDP_LCLRLBaseCellConfig {

		public DtlConf(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			if (getStatus() == UPD || getStatus() == UPD_ADMIN) {
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (getStatus() == UPD && !isNull(r.upd_cntr())) {
					if (column == columnDtl_tax_typ
					 || column == columnDtl_inc_tax_flg
					 || column == columnDtl_tax_rate) {
						 return MCMode.READ_ONLY;
					 }
					else if (column == columnDtl_sls_flg) {
						if (r.org_sls_flg()){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_purc_flg) {
						if (r.org_purc_flg()){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_prov_flg) {
						if (r.org_prov_flg()){
							return MCMode.READ_ONLY;
						}
					}
				}
				
				if (column == columnDtl_inc_tax_flg
				 || column == columnDtl_tax_rate) {
					if (!MAC_TAX_TYP.isTAX_ABL(r.tax_typ())){
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_prov_flg) {
					if (r.inc_tax_flg()){
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

}