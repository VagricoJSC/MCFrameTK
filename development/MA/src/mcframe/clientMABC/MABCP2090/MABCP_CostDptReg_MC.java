package mcframe.clientMABC.MABCP2090;

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
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_CostDptReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_CostDptReg_MC extends MABCP_CostDptReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_CostDptReg_MC() {
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
	public MABCP_CostDptReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMA_MABCL2090_Ins01();
	}
	/**
	 * [MA_MABCL2090_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2090_Srch01Caller<P extends MABCP_CostDptReg, B extends MA_MABCL2090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL2090_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}

	/**
	 * [MA_MABCL2090_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2090_Upd01Caller<P extends MABCP_CostDptReg, B extends MA_MABCL2090_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL2090_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL2090_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2090_Del01Caller<P extends MABCP_CostDptReg, B extends MA_MABCL2090_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL2090_Del01Caller(P p, B b) {
			super(p, b);
		}
	}
	
	/**
	 * [MA_MABCL2090_Ins01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2090_Ins01Caller<P extends MABCP_CostDptReg, B extends MA_MABCL2090_Ins01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL2090_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			// 何もしない
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL2090_Srch01();
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
		callMA_MABCL2090_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL2090_Del01();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		if (getStatus() == INS) {
			Ctrl_ctrl_PPanel.expand(true);
		}
	}
	
	/**
	 * 操作種別によってステータスをセットする
	 */
	@Override
	public void setStatusByOpe() {
		if (getCndR().getString(getOpeColumn()).equals(getInsOpeValue())) {
			setINSStatus();
		}
		else {
			super.setStatusByOpe();
		}
	}
	protected String getInsOpeValue() {
		return "4";
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		setTabMode();

		setStatusColumn();
		setFocus();
		fillSpace();
	}
	
	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(FoldTab, CndPanel);
		}
		else if (Cnd_ope_INS.isSelected()) {
			setTabComponentEnable(FoldTab, InsPanel);
		}
		else {
			setTabComponentEnable(FoldTab);
		}
	}

	protected void setFocus() {
		if (getDtlL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			DtlTable.selectLeftmostColumn(0);
		}
	}
	
	/**
	 * 操作種別によるステータスカラムの表示・非表示切替
	 */
	protected void setStatusColumn() {
		if (Cnd_ope_UPD.isSelected()) {
			DtlTable.setStatusColumnVisible(true);
		}
		else {
			DtlTable.setStatusColumnVisible(false);
		}
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
				if (column == columnDtl_lg_grp_cd) {
					if (!MAC_DPT_CONFIG_TYP.isLG_GRP(r.dpt_config_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_loc_grp_cd) {
					if (!MAC_DPT_CONFIG_TYP.isLOC_GRP(r.dpt_config_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_wg_cd) {
					if (!MAC_DPT_CONFIG_TYP.isWG(r.dpt_config_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_site_cd) {
					if (!MAC_DPT_CONFIG_TYP.isSITE(r.dpt_config_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public void doDtl_dpt_config_typ_LC(MCEventInfo info) {
		super.doDtl_dpt_config_typ_LC(info);
		
		int idx = info.getEventIndex();

		// 値のクリア
		setValueEx(columnDtl_lg_grp_cd, idx, null);
		setValueEx(columnDtl_loc_grp_cd, idx, null);
		setValueEx(columnDtl_wg_cd, idx, null);
		setValueEx(columnDtl_site_cd, idx, null);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_COST_DPT));
		setValueEx(Ins_ins_only_flg, true);
		setValueEx(Ins_tgt_dt, getTerm(this));
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_term_p_PPanel.columnTerm_term.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Dtl_term_p_PPanel.columnTerm_term) doDtl_term_LC(info);
	}

	public void doDtl_term_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		setValueEx(columnDtl_dpt_alc_grp, idx, null);
	}

}