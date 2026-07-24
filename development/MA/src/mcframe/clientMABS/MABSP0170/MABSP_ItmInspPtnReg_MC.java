package mcframe.clientMABS.MABSP0170;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_ItmInspPtnReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_ItmInspPtnReg_MC extends MABSP_ItmInspPtnReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ItmInspPtnReg_MC() {
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
	public MABSP_ItmInspPtnReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0170_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0170_Sprt01Caller<P extends MABSP_ItmInspPtnReg, B extends MA_MABSL0170_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL0170_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}
	/**
	 * Panel[DtlBtn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doDtlBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL0170_Sprt01();
	}
	/**
	 * [MA_MABSL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0170_Srch01Caller<P extends MABSP_ItmInspPtnReg, B extends MA_MABSL0170_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0170_Srch01Caller(P p, B b) {
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
	}

	/**
	 * [MA_MABSL0170_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0170_Upd01Caller<P extends MABSP_ItmInspPtnReg, B extends MA_MABSL0170_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0170_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndTabTab.focusActiveFirstComponent();
		}
	}

	/**
	 * [MA_MABSL0170_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0170_Del01Caller<P extends MABSP_ItmInspPtnReg, B extends MA_MABSL0170_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0170_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndTabTab.focusActiveFirstComponent();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0170_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1130]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1130(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1130");
		MCRow asoRow = crtOpenMABSP1130CndR(aso);
		if (!isNull(asoRow.getValueNE(mcframe.clientMABS.MABSP1130.CndR.$itm_cd))) {
			aso.runValueInit();
			aso.putCnd(asoRow);
			aso.putSearchAction();
		}
		aso.show();
	}
	/**
	 * 遷移先[MABSP0180]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABS.MABSP1130.CndR crtOpenMABSP1130CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1130.CndR to =
				mcframe.clientMABS.MABSP1130.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.itm_cd(fr.itm_cd());
			to.itm_sub1(fr.itm_sub1());
			to.itm_sub2(fr.itm_sub2());
			to.itm_sub3(fr.itm_sub3());
		}
		return to;
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
		callMA_MABSL0170_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABSL0170_Del01();
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
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndTabTab.focusActiveFirstComponent();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	protected void setBtnMode() {
		setDefaultMode(DtlBtn_open_MABSP1130);
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r)){
			DtlBtn_open_MABSP1130.setMode(MCMode.DISABLE);
		}
	}
	
	@Override										
	public void setFIXStatus() {
		super.setFIXStatus();
		setBtnMode();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBtnMode();
	}
	
	@Override										
	public void setREFStatus() {
		super.setREFStatus();
		setBtnMode();
	}
	
	@Override										
	public void setDELStatus() {
		super.setDELStatus();
		setBtnMode();
	}

	protected void listenerInit() {
		super.listenerInit();
		columnDtl_itm_cd.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (Dtl_itm_p_PPanel.isItm(lc)) {
			doDtl_itm_cd_LC(info);
		}
	}

	protected void doDtl_itm_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		if (Dtl_itm_p_PPanel.isItmFix(idx) && MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
			setValueEx(columnDtl_spl_qty, idx, MCNumber.ZERO);
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

	protected class DtlCellConfig extends MAUDP_RLBaseCellConfig {
		public DtlCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = (DtlR)table.getBaseTable().getRow(index);
			
			if (getStatus() == UPD) {
				if (column == columnDtl_spl_qty) {
					if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_std_req_flg) {
					if (!MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_std_cnf_req_flg) {
					if (!r.std_req_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	@Override
	public void doDtl_insp_mtd_typ_LC(MCEventInfo info) {
		super.doDtl_insp_mtd_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
			setValueEx(columnDtl_spl_qty, idx, MCNumber.ZERO);
		}
		else {
			setValueEx(columnDtl_spl_qty, idx, null);
		}
		if (!MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
			setValueEx(columnDtl_std_req_flg, idx, false);
		}
	}

	@Override
	public void doDtl_std_req_flg_NC(MCEventInfo info) {
		super.doDtl_std_req_flg_NC(info);	

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.std_req_flg()) {
			setValueEx(columnDtl_std_cnf_req_flg, idx, false);
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Dtl_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
	}

}