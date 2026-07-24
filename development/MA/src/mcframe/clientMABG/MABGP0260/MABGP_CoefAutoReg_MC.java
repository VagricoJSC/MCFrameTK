package mcframe.clientMABG.MABGP0260;

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
import mcframe.clientMAUB.MAUBP0080.*;
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5070.*;
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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_CoefAutoReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_CoefAutoReg_MC extends MABGP_CoefAutoReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_CoefAutoReg_MC() {
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
	public MABGP_CoefAutoReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0260_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0260_Srch01Caller<P extends MABGP_CoefAutoReg, B extends MA_MABGL0260_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0260_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABGL0260_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0260_Upd01Caller<P extends MABGP_CoefAutoReg, B extends MA_MABGL0260_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0260_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0260_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0260_Del01Caller<P extends MABGP_CoefAutoReg, B extends MA_MABGL0260_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0260_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0260_Srch01();
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
		callMA_MABGL0260_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0260_Del01();
	}
	
	//配賦係数ＣＤに対する配賦係数構成区分の値によって品目分類区分を自動的に設定する。
	public void doDtl_coef_config_typ_NC(MCEventInfo info){
		super.doDtl_alc_coef_cd_NC(info);
		DtlR r = DtlTable.getSelectedMCRow();
		String coefConfTyp = r.coef_config_typ();
		int idx = r.getGUIIndex();
		
		if(MAC_COEF_CONFIG_TYP.isITM_GRP1(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP1.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP2(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP2.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP3(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP3.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP4(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP4.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP5(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP5.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP6(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP6.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP7(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP7.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP8(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP8.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP9(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP9.value());
		}
		else if(MAC_COEF_CONFIG_TYP.isITM_GRP10(coefConfTyp)){
			setValueEx(columnDtl_itm_grp_typ, idx, MAC_ITM_GRP_TYP.GRP10.value());
		}
		else {
			setValueEx(columnDtl_itm_grp_typ, idx, null);
		}
	}
	
	//配賦係数ＣＤを変更したときは関連する項目をクリアする。
	public void doDtl_alc_coef_cd_NC(MCEventInfo info){
		super.doDtl_alc_coef_cd_NC(info);
		DtlR r = DtlTable.getSelectedMCRow();
		r.unit_cd(null);
		r.unit_nm(null);
		r.itm_jnl_cd(null);
		r.itm_jnl_nm(null);
		r.itm_grp_cd(null);
		r.itm_grp_nm(null);
	}

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}
	
	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}

	protected class DtlCellConfig extends MAUDP_RLBaseCellConfig {
		public DtlCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (column == columnDtl_itm_jnl_cd) {
					if (!MAC_COEF_CONFIG_TYP.isITM_JNL(r.coef_config_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_grp_cd) {
					if (!(MAC_COEF_CONFIG_TYP.isITM_GRP1(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP2(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP3(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP4(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP5(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP6(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP7(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP8(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP9(r.coef_config_typ())
							|| MAC_COEF_CONFIG_TYP.isITM_GRP10(r.coef_config_typ()))) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_unit_cd){
					if (isNull(r.qty_unit_typ())){
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}