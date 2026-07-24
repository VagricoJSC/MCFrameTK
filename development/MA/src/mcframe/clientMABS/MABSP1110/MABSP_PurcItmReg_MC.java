package mcframe.clientMABS.MABSP1110;

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
import mcframe.clientMAUB.MAUBP5070.*;
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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_PurcItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_PurcItmReg_MC extends MABSP_PurcItmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_PurcItmReg_MC() {
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
	public MABSP_PurcItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL1110_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1110_Srch01Caller<P extends MABSP_PurcItmReg, B extends MA_MABSL1110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL1110_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getHdrR(), getHdrAllL().get(0));
		}

		@Override
		protected void moveFocus() {
			Wrk1DtlTable.selectRowNoFocus(0);
			Wrk2DtlTable.selectRowNoFocus(0);
			Wrk3DtlTable.selectRowNoFocus(0);
			Wrk4DtlTable.selectRowNoFocus(0);
			Wrk5DtlTable.selectRowNoFocus(0);
			Wrk6DtlTable.selectRowNoFocus(0);
			Wrk7DtlTable.selectRowNoFocus(0);
			Wrk8DtlTable.selectRowNoFocus(0);

			DtlTabTab.focusActiveFirstComponent();
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void setMode() {
			super.setMode();
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
		protected void clear() {
			super.clear();

			// 下り電文対象以外は自分でクリア
			getHdrR().clear();
		}
	}

	/**
	 * [MA_MABSL1110_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1110_Upd01Caller<P extends MABSP_PurcItmReg, B extends MA_MABSL1110_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL1110_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			setupHdrAll();
			return super.checkForCall();
		}
		protected void setupHdrAll() {
			for(HdrR r : getHdrAllL()) {
				if (!isSame(r.purc_input_flg(), getHdrR().purc_input_flg())) {
					r.purc_input_flg(getHdrR().purc_input_flg());
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
			for(Wrk5DtlR r : bridge.up5()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk6DtlR r : bridge.up6()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk7DtlR r : bridge.up7()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk8DtlR r : bridge.up8()) {
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
		callMA_MABSL1110_Srch01();
	}
	/**
	 * Panel[Wrk1SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk1SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk1SetDtHdr_st_dt, Wrk1SetDtHdr_end_dt, Wrk1DtlTable, columnWrk1Dtl_st_dt, columnWrk1Dtl_end_dt);
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
	 * Panel[Wrk5SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk5SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk5SetDtHdr_st_dt, Wrk5SetDtHdr_end_dt, Wrk5DtlTable, columnWrk5Dtl_st_dt, columnWrk5Dtl_end_dt);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk5DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk5DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk5DtlTable);
	}
	/**
	 * Panel[Wrk6SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk6SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk6SetDtHdr_st_dt, Wrk6SetDtHdr_end_dt, Wrk6DtlTable, columnWrk6Dtl_st_dt, columnWrk6Dtl_end_dt);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk6DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk6DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk6DtlTable);
	}
	/**
	 * Panel[Wrk7SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk7SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk7SetDtHdr_st_dt, Wrk7SetDtHdr_end_dt, Wrk7DtlTable, columnWrk7Dtl_st_dt, columnWrk7Dtl_end_dt);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk7DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk7DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk7DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk8DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk8DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk8DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk8DtlTable);
	}
	/**
	 * Panel[Wrk8DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk8DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk8DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[open_MABSP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP0120(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0120");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0120CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0120.CndR crtOpenMABSP0120CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP0120.MABSP_PurcUpriReg p = (mcframe.clientMABS.MABSP0120.MABSP_PurcUpriReg) aso.getPanel();
		mcframe.clientMABS.MABSP0120.CndR to = mcframe.clientMABS.MABSP0120.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		if (p.RPnl_srch_wg.authorize()) {
			to.wg_flg(true);
		}
		if (p.RPnl_srch_cmn.authorize()) {
			to.cmn_flg(true);
		}
		to.itm_cd(getHdrR().itm_cd());
		to.itm_sub1(getHdrR().itm_sub1());
		to.itm_sub2(getHdrR().itm_sub2());
		to.itm_sub3(getHdrR().itm_sub3());

		return to;
	}
	/**
	 * Panel[Hdr]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doHdr_upd(MCEventInfo info) {
		callMA_MABSL1110_Upd01();
	}


	//------------------ 汎用メソッド Start ------------------//
	/**
	 * 画面内のテーブルを返す
	 * @return
	 */
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] { Wrk1DtlTable, Wrk2DtlTable, Wrk3DtlTable, Wrk4DtlTable, Wrk5DtlTable, Wrk6DtlTable,
				Wrk7DtlTable, Wrk8DtlTable};
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
		setListListener(Wrk5DtlTable, createRLRowListener());
		setListListener(Wrk6DtlTable, createRLRowListener());
		setListListener(Wrk7DtlTable, createRLRowListener());
		setListListener(Wrk8DtlTable, createRLRowListener());

		columnWrk5Dtl_rord_stk_qty.addLCListener(this);
		columnWrk5Dtl_rord_rqst_qty.addLCListener(this);
	}

	@Override
	public void fillSpace() {
		Wrk1DtlTable.fillSpace();
		Wrk2DtlTable.fillSpace();
		Wrk3DtlTable.fillSpace();
		Wrk4DtlTable.fillSpace();
		Wrk5DtlTable.fillSpace();
		Wrk6DtlTable.fillSpace();
		Wrk7DtlTable.fillSpace();
		Wrk8DtlTable.fillSpace();
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
	public void doWrk1SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk1SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk1SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk1SetDtHdr_end_dt_NC(info);
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
	public void doWrk5SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk5SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk5SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk5SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk6SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk6SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk6SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk6SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk7SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk7SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk7SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk7SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	public void chkSrchBtnMode() {
		if (isNullAnd(getWrk1SetDtHdrR().st_dt(), getWrk1SetDtHdrR().end_dt())) {
			Wrk1SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk1SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk2SetDtHdrR().st_dt(), getWrk2SetDtHdrR().end_dt())) {
			Wrk2SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk2SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk5SetDtHdrR().st_dt(), getWrk5SetDtHdrR().end_dt())) {
			Wrk5SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk5SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk6SetDtHdrR().st_dt(), getWrk6SetDtHdrR().end_dt())) {
			Wrk6SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk6SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk7SetDtHdrR().st_dt(), getWrk7SetDtHdrR().end_dt())) {
			Wrk7SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk7SetDtHdr_set_dt);
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
	@Override
	public void doWrk5Dtl_NC(MCEventInfo info) {
		super.doWrk5Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk5DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk5DtlBtn_rdel);
	}
	@Override
	public void doWrk6Dtl_NC(MCEventInfo info) {
		super.doWrk6Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk6DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk6DtlBtn_rdel);
	}
	@Override
	public void doWrk7Dtl_NC(MCEventInfo info) {
		super.doWrk7Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk7DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk7DtlBtn_rdel);
	}
	@Override
	public void doWrk8Dtl_NC(MCEventInfo info) {
		super.doWrk8Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		MCConstRow row = getWrk8DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk8DtlBtn_rdel);
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
	
	// セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Wrk1DtlTable.setCellConfig(createAppCellConfig());
		Wrk2DtlTable.setCellConfig(createAppCellConfig());
		Wrk3DtlTable.setCellConfig(createAppCellConfig());
		Wrk4DtlTable.setCellConfig(createAppCellConfig());
		Wrk5DtlTable.setCellConfig(createAppCellConfig());
		Wrk6DtlTable.setCellConfig(createAppCellConfig());
		Wrk7DtlTable.setCellConfig(createAppCellConfig());
		Wrk8DtlTable.setCellConfig(createAppCellConfig());
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
			if (getStatus() == UPD) {
				// 登録済みデータはキー変更不可
				if (isExistingKey(index, column, table)) {
					return MCMode.READ_ONLY;
				}
				
				boolean _is_mng_req_par_sno1 = MAC_SNO_MNG_TYP.isMNG_REQ(getHdrR().sno1_mng_typ()) ;
				boolean _is_mng_req_par_sno2 = MAC_SNO_MNG_TYP.isMNG_REQ(getHdrR().sno2_mng_typ()) ;
				boolean _is_mng_req_par_sno3 = MAC_SNO_MNG_TYP.isMNG_REQ(getHdrR().sno3_mng_typ()) ;
				boolean _is_mng_req_par_sno4 = MAC_SNO_MNG_TYP.isMNG_REQ(getHdrR().sno4_mng_typ()) ;

				if (table.getBaseTable() == Wrk1DtlTable) {
					Wrk1DtlR r = Wrk1DtlTable.getRow(index);
					if (column == columnWrk1Dtl_purc_id_typ) {
						if (!MAC_STK_MNG_TYP.isMNG(getHdrR().stk_mng_typ())){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_accpt_insp_lt) {
						if(MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
							return MCMode.READ_ONLY;
						}
						if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
								|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_sz_day_week_typ) {
						if (!isNull(r.lot_sz_pd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_sz_week) {
						if (isNull(r.sz_day_week_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_lot_sz_pd) {
						if (!isNull(r.sz_day_week_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					//手配ＮＯ管理区分が「２：管理する（必須）」の場合のみ部品と動きを変える
					else if (column == columnWrk1Dtl_sno1){
						if (_is_mng_req_par_sno1){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk1Dtl_sno2){
						if (_is_mng_req_par_sno2){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk1Dtl_sno3){
						if (_is_mng_req_par_sno3){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk1Dtl_sno4){
						if (_is_mng_req_par_sno4){
							return MCMode.ENABLE;
						}
					}
				}
				else if (table.getBaseTable() == Wrk2DtlTable) {
					Wrk2DtlR r = Wrk2DtlTable.getRow(index);
					if (column == columnWrk2Dtl_sz_day_week_typ) {
						if (!isNull(r.lot_sz_pd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_sz_week) {
						if (isNull(r.sz_day_week_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_lot_sz_pd) {
						if (!isNull(r.sz_day_week_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					//手配ＮＯ管理区分が「２：管理する（必須）」の場合のみ部品と動きを変える
					else if (column == columnWrk2Dtl_sno1){
						if (_is_mng_req_par_sno1){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk2Dtl_sno2){
						if (_is_mng_req_par_sno2){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk2Dtl_sno3){
						if (_is_mng_req_par_sno3){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk2Dtl_sno4){
						if (_is_mng_req_par_sno4){
							return MCMode.ENABLE;
						}
					}
				}
				else if (table.getBaseTable() == Wrk4DtlTable) {
					Wrk4DtlR r = Wrk4DtlTable.getRow(index);
					if (column == columnWrk4Dtl_in_loc_flg) {
						if (isNull(r.to_lg_grp_cd()) 
						 ||	isNull(r.fr_lg_grp_cd()) 
						 || !isSame(r.to_lg_grp_cd(), r.fr_lg_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_fr_loc_cd) {
						if (isNull(r.to_loc_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk5DtlTable) {
					Wrk5DtlR r = Wrk5DtlTable.getRow(index);
					if (column == columnWrk5Dtl_gi_loc_cd
					 || column == columnWrk5Dtl_inpt_gi_loc_cd
					 || column == columnWrk5Dtl_ship_gi_loc_cd) {
						if (isNull(r.loc_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk5Dtl_rord_rqst_qty
					 || column == columnWrk5Dtl_lot_sizing_flg
					 || column == columnWrk5Dtl_gi_loc_cd) {
						if (isNull(r.rord_stk_qty())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk5Dtl_lot_sizing_flg) {
						if (!isNull(r.rord_rqst_qty())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk5Dtl_ship_gi_loc_cd) {
						if (isNull(r.alloc_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk7DtlTable) {
					Wrk7DtlR r = Wrk7DtlTable.getRow(index);
					if (column == columnWrk7Dtl_def_flg) {
						if (!r.cst_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk7Dtl_pf_grp_cd) {
						if (!r.sppl_flg() || getHdrR().sundry_itm_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (isNull(r.pf_grp_cd())) {
						if (column == columnWrk7Dtl_pf_fix_flg) {
							return MCMode.READ_ONLY;
						}
						if (column == columnWrk7Dtl_purc_commit_flg) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnWrk5Dtl_rord_stk_qty) {
			doWrk5Dtl_rord_stk_qty_LC(info);
		}
		if (lc == columnWrk5Dtl_rord_rqst_qty) {
			doWrk5Dtl_rord_rqst_qty_LC(info);
		}
	}

	@Override
	public void doWrk1Dtl_sppl_cd_LC(MCEventInfo info) {
		super.doWrk1Dtl_sppl_cd_LC(info);
		Wrk1DtlR r = getWrk1DtlL().get(info.getEventIndex());
		
		if (!MAC_STK_MNG_TYP.isMNG(getHdrR().stk_mng_typ())) {
			setValueEx(columnWrk1Dtl_purc_id_typ, r.getGUIIndex(), MAC_PURC_ID_TYP.PURC.value());
		}
	}
	
	@Override
	public void doWrk1Dtl_purc_basis_typ_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doWrk1Dtl_purc_basis_typ_LC(info);
		Wrk1DtlR r = getWrk1DtlL().get(info.getEventIndex());
		
		int idx = r.getGUIIndex();
		
		if(MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
			setValueEx(columnWrk1Dtl_accpt_insp_lt, idx, null);
		}
	}
	
	@Override
	public void doWrk1Dtl_purc_id_typ_LC(MCEventInfo info) {
		super.doWrk1Dtl_purc_id_typ_LC(info);
		Wrk1DtlR r = getWrk1DtlL().get(info.getEventIndex());
		
		int idx = r.getGUIIndex();
		
		if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
		 || MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
			setValueEx(columnWrk1Dtl_accpt_insp_lt, idx, null);
		}
	}

	@Override
	public void doWrk1Dtl_lot_sz_pd_LC(MCEventInfo info) {
		super.doWrk1Dtl_lot_sz_pd_LC(info);
		Wrk1DtlR r = getWrk1DtlL().get(info.getEventIndex());
		if (!isNull(r.lot_sz_pd())) {
			setValueEx(columnWrk1Dtl_sz_day_week_typ, r.getGUIIndex(), null);
		}
	}

	@Override
	public void doWrk1Dtl_sz_day_week_typ_LC(MCEventInfo info) {
		super.doWrk1Dtl_sz_day_week_typ_LC(info);
		Wrk1DtlR r = getWrk1DtlL().get(info.getEventIndex());
		if (!isNull(r.sz_day_week_typ())) {
			setValueEx(columnWrk1Dtl_lot_sz_pd, r.getGUIIndex(), null);
		}
		else {
			setValueEx(columnWrk1Dtl_sz_week, r.getGUIIndex(), null);
		}
	}

	@Override
	public void doWrk2Dtl_lot_sz_pd_NC(MCEventInfo info) {
		super.doWrk2Dtl_lot_sz_pd_NC(info);
		Wrk2DtlR r = getWrk2DtlL().get(info.getEventIndex());
		if (!isNull(r.lot_sz_pd())) {
			setValueEx(columnWrk2Dtl_sz_day_week_typ, r.getGUIIndex(), null);
		}
	}

	@Override
	public void doWrk2Dtl_sz_day_week_typ_LC(MCEventInfo info) {
		super.doWrk2Dtl_sz_day_week_typ_LC(info);
		Wrk2DtlR r = getWrk2DtlL().get(info.getEventIndex());
		if (!isNull(r.sz_day_week_typ())) {
			setValueEx(columnWrk2Dtl_lot_sz_pd, r.getGUIIndex(), null);
		}
		else {
			setValueEx(columnWrk2Dtl_sz_week, r.getGUIIndex(), null);
		}
	}

	@Override
	public void doWrk4Dtl_to_loc_cd_NC(MCEventInfo info) {
		super.doWrk4Dtl_to_loc_cd_NC(info);
		Wrk4DtlR r = getWrk4DtlL().get(info.getEventIndex());
		
		setValueEx(columnWrk4Dtl_fr_loc_cd, r.getGUIIndex(), null);
	}

	@Override
	public void doWrk4Dtl_to_lg_grp_cd_NC(MCEventInfo info) {
		super.doWrk4Dtl_to_lg_grp_cd_NC(info);
		chkInLocFlgMode(info);
	}

	@Override
	public void doWrk4Dtl_fr_lg_grp_cd_NC(MCEventInfo info) {
		super.doWrk4Dtl_fr_lg_grp_cd_NC(info);
		chkInLocFlgMode(info);
	}
	
	protected void chkInLocFlgMode(MCEventInfo info) {
		Wrk4DtlR r = getWrk4DtlL().get(info.getEventIndex());
		if (!isSame(r.to_lg_grp_cd(), r.fr_lg_grp_cd())) {
			setValueEx(columnWrk4Dtl_in_loc_flg, r.getGUIIndex(), false);
		}
	}

	public void doWrk5Dtl_rord_stk_qty_NC(MCEventInfo info) {
		Wrk4DtlR r = getWrk4DtlL().get(info.getEventIndex());
		if (isNull(r.to_lg_grp_cd()) || 
				!isSame(r.to_lg_grp_cd(), r.fr_lg_grp_cd())) {
			setValueEx(columnWrk4Dtl_in_loc_flg, r.getGUIIndex(), false);
		}
	}

	public void doWrk5Dtl_loc_cd_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		Wrk5DtlR r = getWrk5DtlL().get(idx);

		if (isNull(r.loc_cd())){
			setValueEx(columnWrk5Dtl_gi_loc_cd, idx, null);
			setValueEx(columnWrk5Dtl_inpt_gi_loc_cd, idx, null);
			setValueEx(columnWrk5Dtl_ship_gi_loc_cd, idx, null);
		}
		if (isNull(r.alloc_grp_cd())){
			setValueEx(columnWrk5Dtl_ship_gi_loc_cd, idx, null);
		}
	}

	public void doWrk5Dtl_rord_stk_qty_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		Wrk5DtlR r = getWrk5DtlL().get(idx);

		if (isNull(r.rord_stk_qty())){
			setValueEx(columnWrk5Dtl_gi_schd_flg, idx, false);
			setValueEx(columnWrk5Dtl_rord_rqst_qty, idx, null);
			setValueEx(columnWrk5Dtl_lot_sizing_flg, idx, false);
			setValueEx(columnWrk5Dtl_gi_loc_cd, idx, null);
		}
	}

	public void doWrk5Dtl_rord_rqst_qty_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		Wrk5DtlR r = getWrk5DtlL().get(idx);

		if (!isNull(r.rord_rqst_qty())){
			setValueEx(columnWrk5Dtl_lot_sizing_flg, idx, false);
		}
	}

	@Override
	public void doWrk7Dtl_bp_cd_NC(MCEventInfo info) {
		super.doWrk7Dtl_bp_cd_NC(info);
		Wrk7DtlR r = getWrk7DtlL().get(info.getEventIndex());
		setValueEx(columnWrk7Dtl_pf_grp_cd, r.getGUIIndex(), null);
		setValueEx(columnWrk7Dtl_def_flg, r.getGUIIndex(), null);
	}

	@Override
	public void doWrk7Dtl_pf_grp_cd_LC(MCEventInfo info) {
		super.doWrk7Dtl_pf_grp_cd_LC(info);
		Wrk7DtlR r = getWrk7DtlL().get(info.getEventIndex());
		setValueEx(columnWrk7Dtl_pf_fix_flg, r.getGUIIndex(), false);
		setValueEx(columnWrk7Dtl_purc_commit_flg, r.getGUIIndex(), false);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == Wrk5Dtl_rord_stk_qty_p_PPanel.columnQty_qty) doWrk5Dtl_rord_stk_qty_NC(info);
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
		getWrk5DtlL().clear();
		getWrk6DtlL().clear();
		getWrk7DtlL().clear();
		getWrk8DtlL().clear();
		getWrk1SetDtHdrR().clear();
		getWrk2SetDtHdrR().clear();
		getWrk5SetDtHdrR().clear();
		getWrk6SetDtHdrR().clear();
		getWrk7SetDtHdrR().clear();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Wrk1Dtl_purc_lt_add_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_min_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_batch_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_max_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_sno_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3, Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ, Hdr_sno4_mng_typ);

		Wrk2Dtl_min_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk2Dtl_batch_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk2Dtl_max_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk2Dtl_sno_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3, Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ, Hdr_sno4_mng_typ);

		Wrk4Dtl_xfr_lot_unit_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place, columnWrk4Dtl_fr_lg_grp_cd, columnWrk4Dtl_to_lg_grp_cd);

		Wrk5Dtl_buf_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk5Dtl_rord_stk_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk5Dtl_rord_rqst_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk5Dtl_str_ln1_p_PPanel.setRelateBeans(columnWrk5Dtl_gi_loc_cd, columnWrk5Dtl_gi_str_ln_tgt_flg);
		Wrk5Dtl_str_ln2_p_PPanel.setRelateBeans(columnWrk5Dtl_inpt_gi_loc_cd, columnWrk5Dtl_inpt_gi_str_ln_tgt_flg);
		Wrk5Dtl_str_ln3_p_PPanel.setRelateBeans(columnWrk5Dtl_ship_gi_loc_cd, columnWrk5Dtl_ship_gi_str_ln_tgt_flg);

		Wrk6Dtl_purc_lt_add_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		
		Wrk8Dtl_str_ln_p_PPanel.setRelateBeans(columnWrk8Dtl_loc_cd, columnWrk8Dtl_str_ln_tgt_flg);
	}

	protected void setTabMode() {
		if (MAC_STK_MNG_TYP.isMNG(getHdrR().stk_mng_typ())) {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk4Panel), true);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk5Panel), true);
		}
		else {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk4Panel), false);
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk5Panel), false);
		}

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
		if (hasWgDefCd(this)) {
			setComponentInvisibleAllStatus(Wrk2Panel);
			// 検索枠を完全に閉じられるように、自動レイアウトによるサイズ計算の対象外にする。
			Wrk2Panel.setLayoutPosition(null);
		}
		if (!isStrLnEnabled(this)) {
			setComponentInvisibleAllStatus(Wrk8Panel);
			// 検索枠を完全に閉じられるように、自動レイアウトによるサイズ計算の対象外にする。
			Wrk8Panel.setLayoutPosition(null);
		}
	}

}