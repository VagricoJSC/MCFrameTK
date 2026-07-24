package mcframe.clientMABC.MABCP0250;

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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_UsrAclReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_UsrAclReg_MC extends MABCP_UsrAclReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_UsrAclReg_MC() {
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
	public MABCP_UsrAclReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL0250_Srch02]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Srch02Caller<P extends MABCP_UsrAclReg, B extends MA_MABCL0250_Srch02Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0250_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0250_Srch03]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Srch03Caller<P extends MABCP_UsrAclReg, B extends MA_MABCL0250_Srch03Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0250_Srch03Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			Ctrl_ctrl_PPanel.expand(false);
		}
	}


	/**
	 * Panel[Btn]のボタン[open_FSBFP0370]の押下時の処理
	 */
	@Override
	public void doBtn_open_FSBFP0370(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("FS", "FSBFP0370");
		aso.runValueInit();
		aso.putCnd(crtOpenFSBFP0250CndR(aso));
		aso.show();
	}
	protected mcframe.clientFSBF.FSBFP0250.CndR crtOpenFSBFP0250CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientFSBF.FSBFP0250.CndR to = mcframe.clientFSBF.FSBFP0250.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.user_id(r.usr_cd());
			aso.putSearchAction();
		}
		return to;
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_REF_APRV.isSelected()) {
			callMA_MABCL0250_Srch02();
		}
		else if (Cnd_ope_REF_DPT.isSelected()) {
			callMA_MABCL0250_Srch03();
		}
		else {
			callMA_MABCL0250_Srch01();
		}
	}
	
	/**
	 * [MA_MABCL0250_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Sprt01Caller<P extends MABCP_UsrAclReg, B extends MA_MABCL0250_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABCL0250_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Srch01Caller<P extends MABCP_UsrAclReg, B extends MA_MABCL0250_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0250_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
	}

	/**
	 * [MA_MABCL0250_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Upd01Caller<P extends MABCP_UsrAclReg, B extends MA_MABCL0250_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0250_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0250_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Del01Caller<P extends MABCP_UsrAclReg, B extends MA_MABCL0250_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0250_Del01Caller(P p, B b) {
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
		callMA_MABCL0250_Sprt01();
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
		callMA_MABCL0250_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0250_Del01();
	}
	
	//------------------ 初期設定 Start------------------//
	
	
	//------------------ 初期設定 End------------------//
	
	//------------------ イベント Start------------------//
	
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
	
	//------------------ イベント End------------------//
	
	//------------------ ステータス設定 Start------------------//
	@Override
	protected void setStatusByOpe() {
		if (Cnd_ope_REF_APRV.isSelected()) {
			setREF_APRVStatus();
		}
		else if (Cnd_ope_REF_DPT.isSelected()) {
			setREF_DPTStatus();
		}
		else {
			super.setStatusByOpe();
		}
	}

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
		public mcframe.clientCore.beans.MCMode getPriorMode(int index, MCColumnConfig column,
				MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_dpt_cd) {
					if (isNull(r.st_dt()) && isNull(r.dpt_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd1) {
					if (isNull(r.dpt_cd()) && isNull(r.add_dpt_cd1())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd2) {
					if (isNull(r.add_dpt_cd1()) && isNull(r.add_dpt_cd2())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd3) {
					if (isNull(r.add_dpt_cd2()) && isNull(r.add_dpt_cd3())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd4) {
					if (isNull(r.add_dpt_cd3()) && isNull(r.add_dpt_cd4())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd5) {
					if (isNull(r.add_dpt_cd4()) && isNull(r.add_dpt_cd5())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd6) {
					if (isNull(r.add_dpt_cd5()) && isNull(r.add_dpt_cd6())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd7) {
					if (isNull(r.add_dpt_cd6()) && isNull(r.add_dpt_cd7())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd8) {
					if (isNull(r.add_dpt_cd7()) && isNull(r.add_dpt_cd8())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_add_dpt_cd9) {
					if (isNull(r.add_dpt_cd8()) && isNull(r.add_dpt_cd9())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd1) {
					if (isNull(r.aprv_role_cd()) && isNull(r.aprv_role_cd1())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd2) {
					if (isNull(r.aprv_role_cd1()) && isNull(r.aprv_role_cd2())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd3) {
					if (isNull(r.aprv_role_cd2()) && isNull(r.aprv_role_cd3())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd4) {
					if (isNull(r.aprv_role_cd3()) && isNull(r.aprv_role_cd4())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd5) {
					if (isNull(r.aprv_role_cd4()) && isNull(r.aprv_role_cd5())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd6) {
					if (isNull(r.aprv_role_cd5()) && isNull(r.aprv_role_cd6())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd7) {
					if (isNull(r.aprv_role_cd6()) && isNull(r.aprv_role_cd7())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd8) {
					if (isNull(r.aprv_role_cd7()) && isNull(r.aprv_role_cd8())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_aprv_role_cd9) {
					if (isNull(r.aprv_role_cd8()) && isNull(r.aprv_role_cd9())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd1) {
					if (isNull(r.sub_aprv_role_cd()) && isNull(r.sub_aprv_role_cd1())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd2) {
					if (isNull(r.sub_aprv_role_cd1()) && isNull(r.sub_aprv_role_cd2())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd3) {
					if (isNull(r.sub_aprv_role_cd2()) && isNull(r.sub_aprv_role_cd3())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd4) {
					if (isNull(r.sub_aprv_role_cd3()) && isNull(r.sub_aprv_role_cd4())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd5) {
					if (isNull(r.sub_aprv_role_cd4()) && isNull(r.sub_aprv_role_cd5())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd6) {
					if (isNull(r.sub_aprv_role_cd5()) && isNull(r.sub_aprv_role_cd6())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd7) {
					if (isNull(r.sub_aprv_role_cd6()) && isNull(r.sub_aprv_role_cd7())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd8) {
					if (isNull(r.sub_aprv_role_cd7()) && isNull(r.sub_aprv_role_cd8())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sub_aprv_role_cd9) {
					if (isNull(r.sub_aprv_role_cd8()) && isNull(r.sub_aprv_role_cd9())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
	}
	
	//------------------ ステータス設定 End------------------//

}