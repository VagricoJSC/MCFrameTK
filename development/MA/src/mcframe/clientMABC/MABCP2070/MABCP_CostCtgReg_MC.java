package mcframe.clientMABC.MABCP2070;

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
 * 画面"MABCP_CostCtgReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_CostCtgReg_MC extends MABCP_CostCtgReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_CostCtgReg_MC() {
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
	public MABCP_CostCtgReg_MC(String name) {
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
		callMA_MABCL2070_Srch01();
	}
	/**
	 * [MA_MABCL2070_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2070_Srch01Caller<P extends MABCP_CostCtgReg, B extends MA_MABCL2070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL2070_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL2070_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2070_Upd01Caller<P extends MABCP_CostCtgReg, B extends MA_MABCL2070_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL2070_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL2070_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2070_Del01Caller<P extends MABCP_CostCtgReg, B extends MA_MABCL2070_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL2070_Del01Caller(P p, B b) {
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
		callMA_MABCL2070_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL2070_Del01();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	/**
	 * 明細に優先して利用させるCellConfigを作成するメソッド
	 * 
	 * @return
	 */
	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}

	protected class DtlCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public DtlCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (getStatus() == UPD) {
				if (column == columnDtl_itm_jnl_cd) {
					if (!MAC_CTG_CONFIG_TYP.isITM_JNL(r.ctg_config_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_itm_grp_cd) {
					if (isNull(r.ctg_config_typ())
					 || !MAC_CTG_CONFIG_TYP.isITM_GRP1(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP2(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP3(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP4(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP5(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP6(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP7(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP8(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP9(r.ctg_config_typ())
					 && !MAC_CTG_CONFIG_TYP.isITM_GRP10(r.ctg_config_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public void doDtl_ctg_config_typ_LC(MCEventInfo info) {
		super.doDtl_ctg_config_typ_LC(info);
		
		int idx = info.getEventIndex();

		// 値のクリア
		setValueEx(columnDtl_itm_jnl_cd, idx, null);
		setValueEx(columnDtl_itm_grp_typ, idx, null);
		setValueEx(columnDtl_itm_grp_cd, idx, null);
		// 品目分類区分の設定
		setValueEx(columnDtl_itm_grp_typ, idx, getItmGrpTyp((String)info.getNewValue()));
	}
	
	// 品群構成区分 -> 品目分類区分
	protected String getItmGrpTyp(String typ){
		if (MAC_CTG_CONFIG_TYP.isITM_GRP1(typ)) return MAC_ITM_GRP_TYP.GRP1.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP2(typ)) return MAC_ITM_GRP_TYP.GRP2.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP3(typ)) return MAC_ITM_GRP_TYP.GRP3.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP4(typ)) return MAC_ITM_GRP_TYP.GRP4.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP5(typ)) return MAC_ITM_GRP_TYP.GRP5.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP6(typ)) return MAC_ITM_GRP_TYP.GRP6.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP7(typ)) return MAC_ITM_GRP_TYP.GRP7.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP8(typ)) return MAC_ITM_GRP_TYP.GRP8.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP9(typ)) return MAC_ITM_GRP_TYP.GRP9.value();
		else if (MAC_CTG_CONFIG_TYP.isITM_GRP10(typ)) return MAC_ITM_GRP_TYP.GRP10.value();
		else return null;
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_COST_CTG));
	}

}