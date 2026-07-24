package mcframe.clientMABS.MABSP0770;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.ItmVerCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ItmVerReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ItmVerReg_MC extends MABSP_ItmVerReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ItmVerReg_MC() {
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
	public MABSP_ItmVerReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0770_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0770_Srch01Caller<P extends MABSP_ItmVerReg, B extends MA_MABSL0770_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0770_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}

		@Override
		protected void resultNoDataFound() {
			CndTabTab.focusActiveFirstComponent();
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getRowR());
		}
	
		@Override
		protected boolean isDownBlockChanged() {

			if (panel.isDtlChanged()) {
				return true;
			}
			return super.isDownBlockChanged();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down0()) {
				r.itm_ver_vld_rmrks_disp(r.itm_ver_vld_rmrks());

			}
		}
	}

	/**
	 * [MA_MABSL0770_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0770_Upd01Caller<P extends MABSP_ItmVerReg, B extends MA_MABSL0770_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0770_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getRowR()));
		}
	}

	/**
	 * [MA_MABSL0770_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0770_Del01Caller<P extends MABSP_ItmVerReg, B extends MA_MABSL0770_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0770_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, null, DtlTable, columnDtl_purc_st_dt, null);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0770_Srch01();
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
		callMA_MABSL0770_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL0770_Del01();
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		getBulkSetR().clear();
	}
	
	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		chkSrchBtnMode();
	}

	public void chkSrchBtnMode() {
		if (!isNull(getBulkSetR().st_dt())) {
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		// 切替備考をトリムせずそのまま一覧にセットするための設定
		columnDtl_itm_ver_vld_rmrks_disp.setTrimPattern("NONE");
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Row_itm_ver_vld_rmrks.addNCListener(this);
	}
	
	/**
	 * NCイベント時のイベント処理です。
	 */
	@Override
	public void doRow_itm_ver_vld_rmrks_NC(MCEventInfo info) {
		super.doRow_itm_ver_vld_rmrks_NC(info);
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r)) {
			r.itm_ver_vld_rmrks(getRowR().itm_ver_vld_rmrks());
			setValueEx(columnDtl_itm_ver_vld_rmrks_disp, r.getGUIIndex(), getRowR().itm_ver_vld_rmrks());
		}
	}

	/**選択行変更時のイベント*/
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setRow();
	}
	
	protected void setRow() {
		getRowR().clear();
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r)) {
			copy(getRowR(), r, createMap_RowR_DtlR());
		}
		setRowMode();
	}

	protected void setRowMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r) || r.isStatusDelete()) {
			setFix(RowPanel);
		}
		else {
			setDefaultMode(RowPanel);
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setRowMode();
	}

	@Override
	public boolean isChanged() {
		
		if (isDtlChanged()) {
			return true;
		}
		return super.isChanged();
	}

	public boolean isDtlChanged() {
		return UPD == getStatus() && !getDtlL().isStatusNone();
		
	}

	protected Map_RowR_DtlR<RowR,DtlR> createMap_RowR_DtlR() {
		return new Map_RowR_DtlR<RowR, DtlR>();
	}

	public class Map_RowR_DtlR<D extends RowR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RowR.$itm_ver_vld_rmrks, DtlR.$itm_ver_vld_rmrks);
		}
	}	

	@Override
	public void doDtl_NE(MCEventInfo info) {
		super.doDtl_NE(info);
		setRow();
	}

}