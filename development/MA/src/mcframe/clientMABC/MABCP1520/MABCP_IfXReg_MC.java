package mcframe.clientMABC.MABCP1520;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_IfXReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_IfXReg_MC extends MABCP_IfXReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_IfXReg_MC() {
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
	public MABCP_IfXReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1520_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1520_Srch01Caller<P extends MABCP_IfXReg, B extends MA_MABCL1520_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1520_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL1520_Srch02]の定型処理のInnerClass
	 */
	protected class MA_MABCL1520_Srch02Caller<P extends MABCP_IfXReg, B extends MA_MABCL1520_Srch02Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1520_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL1520_Srch03]の定型処理のInnerClass
	 */
	protected class MA_MABCL1520_Srch03Caller<P extends MABCP_IfXReg, B extends MA_MABCL1520_Srch03Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1520_Srch03Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			Ctrl_ctrl_PPanel.expand(false);
			doSelectAll(DtlTable);
		}
	}

	/**
	 * [MA_MABCL1520_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1520_Upd01Caller<P extends MABCP_IfXReg, B extends MA_MABCL1520_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1520_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1520_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1520_Del01Caller<P extends MABCP_IfXReg, B extends MA_MABCL1520_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1520_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_UPD2.isSelected()) {
			callMA_MABCL1520_Srch02();
		}
		else if (Cnd_ope_UPD3.isSelected()) {
			callMA_MABCL1520_Srch03();
		}
		else {
			callMA_MABCL1520_Srch01();
		}
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
		callMA_MABCL1520_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL1520_Del01();
	}

	/**
	 * 操作種別によってステータスをセットする
	 */
	@Override
	public void setStatusByOpe() {
		if (getCndR().getString(getOpeColumn()).equals(getUpd2OpeValue())) {
			setUPD2Status();
			getDtlTable().setStatusColumnVisible(true);
		}
		else if (getCndR().getString(getOpeColumn()).equals(getUpd3OpeValue())) {
			setUPD3Status();
			getDtlTable().setStatusColumnVisible(true);
		}
		else {
			super.setStatusByOpe();
		}
	}
	protected String getUpd2OpeValue() {
		return "4";
	}

	protected String getUpd3OpeValue() {
		return "5";
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setStatusCom();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
	}

	@Override
	public void setUPD2Status() {
		super.setUPD2Status();
		setStatusCom();
	}

	@Override
	public void setUPD3Status() {
		super.setUPD3Status();
		setStatusCom();
	}

	protected void setStatusCom() {	
		setTabMode();
		setBtnMode();
	}

	protected void setTabMode() {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			setTabComponentEnable(CndTabTab, Tab1Panel, Tab2Panel, Tab3Panel);
		}
		else if (Cnd_ope_UPD2.isSelected()) {
			setTabComponentEnable(CndTabTab, Tab4Panel);
		}
		else if (Cnd_ope_UPD3.isSelected()) {
			setTabComponentEnable(CndTabTab, Tab5Panel);
		}
	}

	protected void setBtnMode() {
		if (isSame(getStatus(), UPD2) || isSame(getStatus(), UPD3)) {
			if (isNull(getDtlL())) {
				Btn_select_all.setMode(MCMode.DISABLE);
				Btn_deselect_all.setMode(MCMode.DISABLE);
				Btn_radd.setMode(MCMode.DISABLE);
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
				Btn_upd.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_select_all);
				setDefaultMode(Btn_deselect_all);
				setDefaultMode(Btn_radd);
				setDefaultMode(Btn_rdel);
				setDefaultMode(Btn_rcopy);
				setDefaultMode(Btn_upd);
			}
		}
	}

	@Override
	public void setSortColumn() {
		for (MCTable<?> tbl : getDtlTables()) {
			for (MCColumnConfig c : getColumnConfigs(tbl,
					tbl.getList().createRow().getKeys().toArray(_dummyStringArray))) {
				tbl.addSortColumn(c, MCList.SortType.ASC);
			}
		}
	}
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] { DtlTable };
	}
	protected String[] _dummyStringArray = {};

	@Override
	public void doDtl_if_col_typ_NC(MCEventInfo info) {
		super.doDtl_if_col_typ_NC(info);

		int i = info.getEventIndex();
		if (i >= 0) {
			DtlR r = getDtlL().get(i);
			if (MAC_IF_COL_TYP.isITM(r.if_col_typ())) {
				setValueEx(columnDtl_if_col_cd, i, null);
			}
			else {
				setValueEx(columnDtl_itm_cd, i, null);
				setValueEx(columnDtl_conv_itm_sub1, i, null);
			}
		}
	}

	@Override
	public void doDtl_conv_cd_NC(MCEventInfo info) {
		super.doDtl_conv_cd_NC(info);

		int i = info.getEventIndex();
		if (i >= 0) {
			DtlR r = getDtlL().get(i);
			if (isNull(r.conv_cd())) {
				setValueEx(columnDtl_conv_itm_sub1, i, null);
			}
		}
	}

	@Override
	public void doDtl_conv_itm_sub1_NC(MCEventInfo info) {
		super.doDtl_conv_itm_sub1_NC(info);

		int i = info.getEventIndex();
		if (i >= 0) {
			DtlR r = getDtlL().get(i);
			if (isNull(r.conv_itm_sub1())) {
				setValueEx(columnDtl_conv_itm_sub2, i, null);
			}
		}
	}

	@Override
	public void doDtl_conv_itm_sub2_NC(MCEventInfo info) {
		super.doDtl_conv_itm_sub2_NC(info);

		int i = info.getEventIndex();
		if (i >= 0) {
			DtlR r = getDtlL().get(i);
			if (isNull(r.conv_itm_sub2())) {
				setValueEx(columnDtl_conv_itm_sub3, i, null);
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

	public class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR row = (DtlR) table.getBaseTable().getRow(index);

			if (column == columnDtl_if_col_cd) {
				if (MAC_IF_COL_TYP.isITM(row.if_col_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_itm_cd
					|| column == columnDtl_itm_sub1
					|| column == columnDtl_itm_sub2
					|| column == columnDtl_itm_sub3) {
				if (!MAC_IF_COL_TYP.isITM(row.if_col_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_conv_itm_sub1) {
				if (!MAC_IF_COL_TYP.isITM(row.if_col_typ()) || isNull(row.conv_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_conv_itm_sub2) {
				if (!MAC_IF_COL_TYP.isITM(row.if_col_typ()) || isNull(row.conv_itm_sub1())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_conv_itm_sub3) {
				if (!MAC_IF_COL_TYP.isITM(row.if_col_typ()) || isNull(row.conv_itm_sub2())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_IF_X));
	}

}