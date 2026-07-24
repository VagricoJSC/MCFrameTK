package mcframe.clientMABS.MABSP1120;

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
import mcframe.clientMAUB.MAUBP5010.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_SlsItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_SlsItmReg_MC extends MABSP_SlsItmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_SlsItmReg_MC() {
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
	public MABSP_SlsItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Wrk4DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk4DtlTable);
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk4DtlTable);
	}
	/**
	 * [MA_MABSL1120_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1120_Srch01Caller<P extends MABSP_SlsItmReg, B extends MA_MABSL1120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL1120_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {

			// 適用開始年月の表示値を設定する
			for (Wrk1DtlR wrk1Row : bridge.down1()) {
				wrk1Row.st_ym_disp(wrk1Row.st_ym());
				wrk1Row.end_ym_disp(wrk1Row.end_ym());
			}
			
			super.show();
			MCRow.copyall(getHdrR(), getHdrAllL().get(0));
		}

		@Override
		protected void moveFocus() {
			Wrk1DtlTable.selectRowNoFocus(0);
			Wrk2DtlTable.selectRowNoFocus(0);
			Wrk3DtlTable.selectRowNoFocus(0);
			Wrk4DtlTable.selectRowNoFocus(0);
			
			DtlTabTab.focusActiveFirstComponent();
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void setMode() {
			if (isUpdOpe()) {
				setUPDStatus();
				fillSpace();
			}
			else {
				setREFStatus();
			}
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}
		
		@Override
		protected void afterCallSub() {
			super.afterCallSub();
			// 開始年月key項目の値を設定する
			for (Wrk1DtlR wrk1Row : bridge.down1()) {
				wrk1Row.st_ym_key(wrk1Row.st_ym());
			}
		}
		
		@Override
		protected void clear() {
			super.clear();
			// 下り電文対象以外は自分でクリア
			getHdrR().clear();
		}
	}

	/**
	 * [MA_MABSL1120_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1120_Upd01Caller<P extends MABSP_SlsItmReg, B extends MA_MABSL1120_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL1120_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			setupHdrAll();
			return super.checkForCall();
		}
		protected void setupHdrAll() {
			for(HdrR r : getHdrAllL()) {
				if (!isSame(r.sls_input_flg(), getHdrR().sls_input_flg())) {
					r.sls_input_flg(getHdrR().sls_input_flg());
					r.setStatus(MCRow.MODIFY);
					r.check(true);
				}
				else {
					r.check(false);
				}
			}
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			if (!panel.isStatusNone(getHdrR())) {
				return false;
			}
			return super.isUpBlockStatusNone();
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			for(Wrk1DtlR r : bridge.up1()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk2DtlR r : bridge.up2()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk3DtlR r : bridge.up3()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk4DtlR r : bridge.up4()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL1120_Srch01();
	}
	/**
	 * Panel[Wrk1SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk1SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk1SetDtHdr_st_ym, Wrk1SetDtHdr_end_ym, Wrk1DtlTable, columnWrk1Dtl_st_ym_disp, columnWrk1Dtl_end_ym_disp);
	}
	/**
	 * Panel[Wrk1DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk1DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk1DtlTable);
	}
	/**
	 * Panel[Wrk1DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk1DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk1DtlTable);
	}
	/**
	 * Panel[Wrk1DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk1DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk1DtlTable);
	}
	/**
	 * Panel[Wrk1DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk1DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk1DtlTable);
	}
	/**
	 * Panel[Wrk1DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk1DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk1DtlTable);
	}
	/**
	 * Panel[Wrk2SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk2SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk2SetDtHdr_st_dt, Wrk2SetDtHdr_end_dt, Wrk2DtlTable, columnWrk2Dtl_st_dt, columnWrk2Dtl_end_dt);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk2DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk2DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk2DtlTable);
	}
	/**
	 * Panel[Wrk3SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk3SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk3SetDtHdr_st_dt, Wrk3SetDtHdr_end_dt, Wrk3DtlTable, columnWrk3Dtl_st_dt, columnWrk3Dtl_end_dt);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk3DtlTable);
	}
	/**
	 * Panel[Wrk3DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk3DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk3DtlTable);
	}
	/**
	 * Panel[Hdr]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doHdr_upd(MCEventInfo info) {
		callMA_MABSL1120_Upd01();
	}
	
	//------------------ 汎用メソッド Start ------------------//
	/**
	 * 画面内のテーブルを返す
	 * @return
	 */
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] {Wrk1DtlTable, Wrk2DtlTable, Wrk3DtlTable, Wrk4DtlTable};
	}
	protected String[] _dummyStringArray = {};
	
	/**
	 * キー項目を返します。
	 * @param list
	 * @return
	 */
	protected String[] getDtlRKeyColumns(MCList<? extends MCConstRow> list) {
		MCConstRow r = list.createRow();
		return r.getKeys().toArray(_dummyStringArray);
	}
	//------------------ 汎用メソッド End ------------------//

	@Override
	public MCList<? extends MCConstRow> getDtlL() {
		// メインとなるテーブルが存在しないので、ダミー設定
		return getWrk1DtlL();
	}

	@Override
	protected void listenerInit() {
		setListListener(Wrk1DtlTable, createRLRowListener());
		setListListener(Wrk2DtlTable, createRLRowListener());
		setListListener(Wrk3DtlTable, createRLRowListener());
		setListListener(Wrk4DtlTable, createRLRowListener());
	}

	@Override
	public void fillSpace() {
		Wrk1DtlTable.fillSpace();
		Wrk2DtlTable.fillSpace();
		Wrk3DtlTable.fillSpace();
		Wrk4DtlTable.fillSpace();
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

	@Override
	public void doWrk1SetDtHdr_st_ym_NC(MCEventInfo info) {
		super.doWrk1SetDtHdr_st_ym_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk1SetDtHdr_end_ym_NC(MCEventInfo info) {
		super.doWrk1SetDtHdr_end_ym_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk2SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk2SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk2SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk2SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk3SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk3SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk3SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk3SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}

	public void chkSrchBtnMode() {
		if (!isNull(getWrk1SetDtHdrR().st_ym())
				|| !isNull(getWrk1SetDtHdrR().end_ym())) {
			Wrk1SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk1SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk2SetDtHdrR().st_dt())
				|| !isNull(getWrk2SetDtHdrR().end_dt())) {
			Wrk2SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk2SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk3SetDtHdrR().st_dt())
				|| !isNull(getWrk3SetDtHdrR().end_dt())) {
			Wrk3SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk3SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void doWrk1Dtl_NC(MCEventInfo info) {
		super.doWrk1Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk1DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk1DtlBtn_rdel);
	}
	@Override
	public void doWrk2Dtl_NC(MCEventInfo info) {
		super.doWrk2Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk2DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk2DtlBtn_rdel);
	}
	@Override
	public void doWrk3Dtl_NC(MCEventInfo info) {
		super.doWrk3Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk3DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk3DtlBtn_rdel);
	}
	@Override
	public void doWrk4Dtl_NC(MCEventInfo info) {
		super.doWrk4Dtl_NC(info);
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk4DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk4DtlBtn_rdel);
	}

	private void setDelBtnMode(MCConstRow row, MCButton btn) {
		if (row == null
				|| !(getStatus().equals(getUPDStatus()))) {
			btn.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			btn.setMode(MCMode.DISABLE);
		}
		else {
			btn.setMode(this, getStatus());
		}
	}

	@Override
	protected void setStatusByOpe() {
		// 操作種別変更時は常にSRCHステータス
		setSRCHStatus();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearAll();
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	protected void clearAll() {
		super.clearAll();
		getHdrR().clear();
		getWrk1DtlL().clear();
		getWrk2DtlL().clear();
		getWrk3DtlL().clear();
		getWrk4DtlL().clear();
		getWrk1SetDtHdrR().clear();
		getWrk2SetDtHdrR().clear();
		getWrk3SetDtHdrR().clear();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Wrk1Dtl_qty_p_PPanel.setRelateBeans(columnWrk1Dtl_upri_unit_cd, columnWrk1Dtl_dec_place);
		Wrk4Dtl_str_ln_p_PPanel.setRelateBeans(columnWrk4Dtl_loc_cd, columnWrk4Dtl_str_ln_tgt_flg);
	}
	
	//--------------------リストロジック表示制御Start-----------------------
	@Override
	protected void listInit() {
		super.listInit();
		
		getWrk1Dtl_upri_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_cd, Hdr_itm_cd);
		getWrk1Dtl_upri_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub1, Hdr_itm_sub1);
		getWrk1Dtl_upri_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub2, Hdr_itm_sub2);
		getWrk1Dtl_upri_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub3, Hdr_itm_sub3);
	}
	//--------------------リストロジック表示制御End-----------------------
	
	// セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Wrk1DtlTable.setCellConfig(createAppCellConfig());
		Wrk2DtlTable.setCellConfig(createAppCellConfig());
		Wrk3DtlTable.setCellConfig(createAppCellConfig());
		Wrk4DtlTable.setCellConfig(createAppCellConfig());
	}

	/**
	 * セルコンフィグの取得
	 * 
	 * @return セルコンフィグ
	 */
	protected AppCellConfig createAppCellConfig() {

		return new AppCellConfig(this);
	}

	/**
	 * セルコンフィグクラス
	 */
	protected class AppCellConfig extends MAUDP_RLBaseCellConfig {

		public AppCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdSts()) {
				// 登録済みデータはキー変更不可
				if (isExistingKey(index, column, table)) {
					return MCMode.READ_ONLY;
				}

				if (table.getBaseTable() == Wrk1DtlTable) {
					Wrk1DtlR r = Wrk1DtlTable.getRow(index);
					if (column == columnWrk1Dtl_dpt_cd) {
						if (isNullOrNullVal(r.spln_itm_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk1Dtl_calc_rate) {
						if (isNullOrNullVal(r.spln_itm_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk1Dtl_calc_seq) {
						if (isNullOrNullVal(r.spln_itm_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (table.getBaseTable() == Wrk2DtlTable) {
					Wrk2DtlR r = Wrk2DtlTable.getRow(index);
					if (column == columnWrk2Dtl_wg_cd) {
						if (!isNullOrNullVal(r.sls_dpt_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk2Dtl_sls_dpt_cd) {
						if (!isNullOrNullVal(r.wg_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (table.getBaseTable() == Wrk3DtlTable) {
					Wrk3DtlR r = Wrk3DtlTable.getRow(index);
					if (column == columnWrk3Dtl_def_flg) {
						if (!r.cst_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pf_grp_cd) {
						if (!r.sppl_flg() || getHdrR().sundry_itm_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_pf_fix_flg) {
						if (isNull(r.pf_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk3Dtl_purc_commit_flg) {
						if (isNull(r.pf_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	@Override
	public void doWrk1Dtl_spln_itm_cd_LC(MCEventInfo info) {
		super.doWrk1Dtl_spln_itm_cd_LC(info);

		int idx = info.getEventIndex();
		Wrk1DtlR r = getWrk1DtlL().get(idx);
		if (isNull(r.spln_itm_cd())) {
			setValueEx(columnWrk1Dtl_dpt_cd, idx, null);
			setValueEx(columnWrk1Dtl_calc_rate, idx, null);
			setValueEx(columnWrk1Dtl_calc_seq, idx, null);
		}
	}

	@Override
	public void doWrk1Dtl_st_ym_disp_NC(MCEventInfo info) {
		super.doWrk1Dtl_st_ym_disp_NC(info);
		
		int idx = info.getEventIndex();
		if (idx == -1) {
			return;
		}
		Wrk1DtlR dtlR = getWrk1DtlL().get(idx);
		setStDispToValueDtl(dtlR);
	}
	
	@Override
	public void doWrk1Dtl_end_ym_disp_NC(MCEventInfo info) {
		super.doWrk1Dtl_end_ym_disp_NC(info);
		
		int idx = info.getEventIndex();
		if (idx == -1) {
			return;
		}
		Wrk1DtlR dtlR = getWrk1DtlL().get(idx);
		setEdDispToValueDtl(dtlR);
	}
	
	protected void setStDispToValueDtl(Wrk1DtlR r) {
		int idx = r.getGUIIndex();

		if (!isNull(r.st_ym_disp())) {
			getWrk1DtlL().get(idx).st_ym(r.st_ym_disp());
		}
		else {
			getWrk1DtlL().get(idx).st_ym(null);
		}
	}
	
	protected void setEdDispToValueDtl(Wrk1DtlR r) {
		int idx = r.getGUIIndex();

		if (!isNull(r.end_ym_disp())) {
			getWrk1DtlL().get(idx).end_ym(r.end_ym_disp());
		}
		else {
			getWrk1DtlL().get(idx).end_ym(null);
		}
	}
	
	@Override
	public void doWrk3Dtl_bp_cd_NC(MCEventInfo info) {
		super.doWrk3Dtl_bp_cd_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnWrk3Dtl_pf_grp_cd, idx, null);
		setValueEx(columnWrk3Dtl_def_flg, idx, null);
	}

	@Override
	public void doWrk3Dtl_pf_grp_cd_NC(MCEventInfo info) {
		super.doWrk3Dtl_pf_grp_cd_NC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnWrk3Dtl_pf_fix_flg, idx, false);
		setValueEx(columnWrk3Dtl_purc_commit_flg, idx, false);
	}

	protected void setTabMode() {
		// 表示中のタブが非表示になったら別のタブに切り替える
		if (!DtlTabTab.isEnabledAt(DtlTabTab.getSelectedIndex())) {
			for (int i=0; i < DtlTabTab.getTabCount(); i++) {
				if (DtlTabTab.isEnabledAt(i)) {
					DtlTabTab.setSelectedIndex(i);
					break;
				}
			}
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setTabMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setTabMode();
		chkSrchBtnMode();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setTabMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setTabMode();
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (!isStrLnEnabled(this)) {
			setComponentInvisibleAllStatus(Wrk4Panel);
			// 検索枠を完全に閉じられるように、自動レイアウトによるサイズ計算の対象外にする。
			Wrk4Panel.setLayoutPosition(null);
		}
	}

}