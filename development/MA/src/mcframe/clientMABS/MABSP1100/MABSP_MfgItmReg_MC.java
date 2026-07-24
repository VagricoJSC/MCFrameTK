package mcframe.clientMABS.MABSP1100;

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
import mcframe.clientMAUB.MAUBP5250.*;

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
import mcframe.clientMAUB.MAUBP5040.QtyR;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientCore.beans.list.MCListType;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_MfgItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_MfgItmReg_MC extends MABSP_MfgItmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_MfgItmReg_MC() {
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
	public MABSP_MfgItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL1100_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1100_Srch01Caller<P extends MABSP_MfgItmReg, B extends MA_MABSL1100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL1100_Srch01Caller(P p, B b) {
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
			Wrk9DtlTable.selectRowNoFocus(0);
			Wrk12DtlTable.selectRowNoFocus(0);
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
		protected void clear() {
			super.clear();

			// 下り電文対象以外は自分でクリア
			getHdrR().clear();
		}
	}

	/**
	 * [MA_MABSL1100_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1100_Upd01Caller<P extends MABSP_MfgItmReg, B extends MA_MABSL1100_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL1100_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			setupHdrAll();
			return super.checkForCall();
		}
		protected void setupHdrAll() {
			for(HdrR r : getHdrAllL()) {
				if (!isSame(r.mfg_input_flg(), getHdrR().mfg_input_flg())) {
					r.mfg_input_flg(getHdrR().mfg_input_flg());
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
					r.par_itm_cd(getHdrR().itm_cd());
					r.par_itm_sub1(getHdrR().itm_sub1());
					r.par_itm_sub2(getHdrR().itm_sub2());
					r.par_itm_sub3(getHdrR().itm_sub3());
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
			for(Wrk9DtlR r : bridge.up9()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk10DtlR r : bridge.up10()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk11DtlR r : bridge.up11()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk12DtlR r : bridge.up12()) {
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
		callMA_MABSL1100_Srch01();
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
	 * Panel[Wrk4SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk4SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk4SetDtHdr_st_dt, Wrk4SetDtHdr_end_dt, Wrk4DtlTable, columnWrk4Dtl_st_dt, columnWrk4Dtl_end_dt);
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
		Wrk4DtlR r = copyRow(Wrk4DtlTable);
		if (isNull(r)) return;
		int idx = r.getGUIIndex();
		
		setValueEx(columnWrk4Dtl_bom_key, idx, null);
		setValueEx(columnWrk4Dtl_chng_no, idx, null);
		setValueEx(columnWrk4Dtl_ext_sys_no_bom, idx, null);
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
	 * Panel[Wrk8SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk8SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk8SetDtHdr_st_dt, Wrk8SetDtHdr_end_dt, Wrk8DtlTable, columnWrk8Dtl_st_dt, columnWrk8Dtl_end_dt);
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
	 * Panel[Wrk9SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk9SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk9SetDtHdr_st_dt, Wrk9SetDtHdr_end_dt, Wrk9DtlTable, columnWrk9Dtl_st_dt, columnWrk9Dtl_end_dt);
	}
	/**
	 * Panel[Wrk9DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk9DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk9DtlTable);
	}
	/**
	 * Panel[Wrk9DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk9DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk9DtlTable);
	}
	/**
	 * Panel[Wrk9DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk9DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk9DtlTable);
	}
	/**
	 * Panel[Wrk9DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk9DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk9DtlTable);
	}
	/**
	 * Panel[Wrk9DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk9DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk9DtlTable);
	}
	/**
	 * Panel[Wrk10DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk10DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk10DtlTable);
	}
	/**
	 * Panel[Wrk10DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk10DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk10DtlTable);
	}
	/**
	 * Panel[Wrk10DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk10DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk10DtlTable);
	}
	/**
	 * Panel[Wrk10DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk10DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk10DtlTable);
	}
	/**
	 * Panel[Wrk10DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk10DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk10DtlTable);
	}
	/**
	 * Panel[Wrk11DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk11DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk11DtlTable);
	}
	/**
	 * Panel[Wrk11DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk11DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk11DtlTable);
	}
	/**
	 * Panel[Wrk11DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk11DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk11DtlTable);
	}
	/**
	 * Panel[Wrk11DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk11DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk11DtlTable);
	}
	/**
	 * Panel[Wrk11DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk11DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk11DtlTable);
	}
	/**
	 * Panel[Wrk12DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doWrk12DtlBtn_select_all(MCEventInfo info) {
		doSelectAll(Wrk12DtlTable);
	}
	/**
	 * Panel[Wrk12DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doWrk12DtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(Wrk12DtlTable);
	}
	/**
	 * Panel[Wrk12DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWrk12DtlBtn_radd(MCEventInfo info) {
		insertRow(Wrk12DtlTable);
	}
	/**
	 * Panel[Wrk12DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWrk12DtlBtn_rdel(MCEventInfo info) {
		deleteRow(Wrk12DtlTable);
	}
	/**
	 * Panel[Wrk12DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk12DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk12DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[open_MABSP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP0140(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0140");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0140CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0140.CndR crtOpenMABSP0140CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg p = (mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg) aso.getPanel();
		mcframe.clientMABS.MABSP0140.CndR to = mcframe.clientMABS.MABSP0140.CndR.create();

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
	 * Panel[Btn]のボタン[open_MABSP0350]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP0350(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0350");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0350CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0350.CndR crtOpenMABSP0350CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP0350.MABSP_ItmSiteReg p = (mcframe.clientMABS.MABSP0350.MABSP_ItmSiteReg) aso.getPanel();
		mcframe.clientMABS.MABSP0350.CndR to = mcframe.clientMABS.MABSP0350.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(getHdrR().itm_cd());
		to.itm_sub1(getHdrR().itm_sub1());
		to.itm_sub2(getHdrR().itm_sub2());
		to.itm_sub3(getHdrR().itm_sub3());
		Wrk11DtlR r = Wrk11DtlTable.getSelectedMCRow();
		if (r != null) {
			to.site_cd(r.site_cd());
		}

		return to;
	}
	/**
	 * Panel[Wrk4DtlBtn]のボタン[open_MABSP0080]の押下時の処理
	 */
	@Override
	public void doWrk4DtlBtn_open_MABSP0080(MCEventInfo info) {
		Wrk4DtlR row = Wrk4DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0080");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0080CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABSP0080]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABS.MABSP0080.CndR crtOpenMABSP0080CndR(MAUCP_AppScreenOpener aso, Wrk4DtlR r) {
		mcframe.clientMABS.MABSP0080.CndR to = mcframe.clientMABS.MABSP0080.CndR.create();
		if (isNullOrNullVal(r.wg_cd())) {
			to.cmn_flg(true);
		}
		else {
			to.wg_flg(true);
			to.wg_cd(r.wg_cd());
		}
		to.alt_grp_cd(r.alt_grp_cd());
		return to;
	}
	/**
	 * Panel[Hdr]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doHdr_upd(MCEventInfo info) {
		callMA_MABSL1100_Upd01();
	}

	//------------------ 汎用メソッド Start ------------------//
	/**
	 * 画面内のテーブルを返す
	 * @return
	 */
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] { Wrk1DtlTable, Wrk2DtlTable, Wrk3DtlTable, Wrk4DtlTable, Wrk5DtlTable, Wrk6DtlTable,
				Wrk7DtlTable, Wrk8DtlTable, Wrk9DtlTable, Wrk10DtlTable, Wrk11DtlTable, Wrk12DtlTable };
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
		setListListener(Wrk9DtlTable, createRLRowListener());
		setListListener(Wrk10DtlTable, createRLRowListener());
		setListListener(Wrk11DtlTable, createRLRowListener());
		setListListener(Wrk12DtlTable, createRLRowListener());

		columnWrk4Dtl_chd_inpt_qty.addLCListener(this);
		Wrk4Dtl_chd_itm_p_PPanel.addItmLCListner(this);
		columnWrk8Dtl_rord_stk_qty.addLCListener(this);
		columnWrk8Dtl_rord_rqst_qty.addLCListener(this);
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
			Wrk9DtlTable.fillSpace();
			Wrk10DtlTable.fillSpace();
			Wrk11DtlTable.fillSpace();
			Wrk12DtlTable.fillSpace();
	}

	@Override
	public void setSortColumn() {
		for (MCTable<?> tbl : getDtlTables()) {
			if (tbl == Wrk4DtlTable) {
				Wrk4DtlTable.removeSortColumn(columnWrk4Dtl_bom_key);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_wg_cd, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_bom_ptn, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_oper_cd, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_oper_seq, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_disp_seq, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_alt_grp_cd, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_chd_itm_typ, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_chd_itm_typ_d_cd, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_chd_itm_cd, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_chd_itm_sub1, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_chd_itm_sub2, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_chd_itm_sub3, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_st_dt, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_end_dt, MCList.SortType.ASC);
				Wrk4DtlTable.addSortColumn(columnWrk4Dtl_bom_key, MCList.SortType.ASC);
			}
			else {
				for (MCColumnConfig c : getColumnConfigs(tbl,
						tbl.getList().createRow().getKeys().toArray(_dummyStringArray))) {
					tbl.addSortColumn(c, MCList.SortType.ASC);
				}
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
	public void doWrk3SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk3SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk3SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk3SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk4SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk4SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk4SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk4SetDtHdr_end_dt_NC(info);
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
	public void doWrk8SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk8SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk8SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk8SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk9SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk9SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk9SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk9SetDtHdr_end_dt_NC(info);
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
		if (isNullAnd(getWrk3SetDtHdrR().st_dt(), getWrk3SetDtHdrR().end_dt())) {
			Wrk3SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk3SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk4SetDtHdrR().st_dt(), getWrk4SetDtHdrR().end_dt())) {
			Wrk4SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk4SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk5SetDtHdrR().st_dt(), getWrk5SetDtHdrR().end_dt())) {
			Wrk5SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk5SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk8SetDtHdrR().st_dt(), getWrk8SetDtHdrR().end_dt())) {
			Wrk8SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk8SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk9SetDtHdrR().st_dt(), getWrk9SetDtHdrR().end_dt())) {
			Wrk9SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk9SetDtHdr_set_dt);
		}
	}

	@Override
	public void doWrk1Dtl_NC(MCEventInfo info) {
		super.doWrk1Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk1DtlR row = getWrk1DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk1DtlBtn_rdel);
	}
	@Override
	public void doWrk2Dtl_NC(MCEventInfo info) {
		super.doWrk2Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk2DtlR row = getWrk2DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk2DtlBtn_rdel);
	}
	@Override
	public void doWrk3Dtl_NC(MCEventInfo info) {
		super.doWrk3Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk3DtlR row = getWrk3DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk3DtlBtn_rdel);
	}
	@Override
	public void doWrk4Dtl_NC(MCEventInfo info) {
		super.doWrk4Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk4DtlR row = getWrk4DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk4DtlBtn_rdel);
		setBtnMode();
	}
	@Override
	public void doWrk5Dtl_NC(MCEventInfo info) {
		super.doWrk5Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk5DtlR row = getWrk5DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk5DtlBtn_rdel);
	}
	@Override
	public void doWrk6Dtl_NC(MCEventInfo info) {
		super.doWrk6Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk6DtlR row = getWrk6DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk6DtlBtn_rdel);
	}
	@Override
	public void doWrk7Dtl_NC(MCEventInfo info) {
		super.doWrk7Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk7DtlR row = getWrk7DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk7DtlBtn_rdel);
	}
	@Override
	public void doWrk8Dtl_NC(MCEventInfo info) {
		super.doWrk8Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk8DtlR row = getWrk8DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk8DtlBtn_rdel);
	}
	@Override
	public void doWrk9Dtl_NC(MCEventInfo info) {
		super.doWrk9Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk9DtlR row = getWrk9DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk9DtlBtn_rdel);
	}
	@Override
	public void doWrk10Dtl_NC(MCEventInfo info) {
		super.doWrk10Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk10DtlR row = getWrk10DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk10DtlBtn_rdel);
	}
	@Override
	public void doWrk11Dtl_NC(MCEventInfo info) {
		super.doWrk11Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk11DtlR row = getWrk11DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk11DtlBtn_rdel);
	}
	@Override
	public void doWrk12Dtl_NC(MCEventInfo info) {
		super.doWrk12Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk12DtlR row = getWrk12DtlL().get(info.getEventIndex());
		setDelBtnMode(row, Wrk12DtlBtn_rdel);
	}
	private void setDelBtnMode(MCConstRow row, MCButton btn) {
		if (row == null || !(getStatus().equals(getUPDStatus()))) {
			btn.setMode(this, getStatus());
		} else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			btn.setMode(MCMode.DISABLE);
		} else {
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
		Wrk9DtlTable.setCellConfig(createAppCellConfig());
		Wrk10DtlTable.setCellConfig(createAppCellConfig());
		Wrk11DtlTable.setCellConfig(createAppCellConfig());
		Wrk12DtlTable.setCellConfig(createAppCellConfig());
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
					if (column == columnWrk1Dtl_mfg_loc_cd){
						if (isNullOrNullVal(r.wg_cd()) && isNullOrNullVal(getSysParm("DEF_WG_CD"))) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_mfg_lt
					 || column == columnWrk1Dtl_mfg_lt_add_qty) {
						if (isNullOrNullVal(r.mfg_loc_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_lot_issue_typ) {
						if (isNullOrNullVal(r.mfg_loc_cd())
						 || MAC_LOT_MNG_TYP.isNOT_MNG(getHdrR().lot_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_purc_lt 
						  || column == columnWrk1Dtl_purc_lt_add_qty
						  || column == columnWrk1Dtl_purc_id_typ) {
						if (isNullOrNullVal(r.loc_sppl_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if(column == columnWrk1Dtl_purc_basis_typ) {
						if (isNullOrNullVal(r.loc_sppl_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_accpt_insp_lt) {
						if (isNullOrNullVal(r.loc_sppl_cd())) {
							return MCMode.READ_ONLY;
						}
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
					else if (column == columnWrk1Dtl_oper_ptn 
						  || column == columnWrk1Dtl_yield_schd_qty
						  || column == columnWrk1Dtl_mfg_inst_qty 
						  || column == columnWrk1Dtl_fxd_rqmt_qty
						  || column == columnWrk1Dtl_ln_stk_flg) {
						if (!isNull(r.loc_sppl_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_rqst_wg_cd 
						  || column == columnWrk1Dtl_po_batch_flg) {
						if (isNull(r.loc_sppl_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_rsrc_std_qty1 
						  || column == columnWrk1Dtl_rsrc_unit_qty1) {
						if (isNull(r.rsrc_cd1())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk1Dtl_rsrc_std_qty2
						  || column == columnWrk1Dtl_rsrc_unit_qty2) {
						if (isNull(r.rsrc_cd2())) {
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
				else if (table.getBaseTable() == Wrk3DtlTable) {
					Wrk3DtlR r = Wrk3DtlTable.getRow(index);
					if (column == columnWrk3Dtl_oper_std_qty
					 || column == columnWrk3Dtl_oper_conv_qty
					 || column == columnWrk3Dtl_dec_place
					 || column == columnWrk3Dtl_unit_conv_rnd_typ) {
						if (isNull(r.oper_unit_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk3Dtl_yield_oper_ratio) {
						if (!r.yield_oper_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk3Dtl_oper_loc_cd) {
						if (isNull(r.wg_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					//手配ＮＯ管理区分が「２：管理する（必須）」の場合のみ部品と動きを変える
					else if (column == columnWrk3Dtl_sno1){
						if (_is_mng_req_par_sno1){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk3Dtl_sno2){
						if (_is_mng_req_par_sno2){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk3Dtl_sno3){
						if (_is_mng_req_par_sno3){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk3Dtl_sno4){
						if (_is_mng_req_par_sno4){
							return MCMode.ENABLE;
						}
					}
				}
				else if (table.getBaseTable() == Wrk4DtlTable) {
					Wrk4DtlR r = Wrk4DtlTable.getRow(index);
					if (column == columnWrk4Dtl_oper_seq) {
						if (isNull(r.oper_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_chd_itm_cd
							|| column == columnWrk4Dtl_chd_itm_sub1
							|| column == columnWrk4Dtl_chd_itm_sub2
							|| column == columnWrk4Dtl_chd_itm_sub3) {
						if (r.alt_itm_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_ver_no) {
						if (r.alt_itm_flg() || !r.ver_flg() || r.byprod_flg() || r.ph_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_byprod_flg) {
						if (isNull(r.chd_itm_cd()) || r.ph_flg() || !isNull(r.alt_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_ph_flg) {
						if (isNull(r.chd_itm_cd()) || r.byprod_flg() || !isNull(r.alt_grp_cd())) {
							return MCMode.READ_ONLY;
						}
						if (MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_ph_bom_ptn) {
						if (!r.ph_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_alt_itm_flg) {
						if (r.ph_flg() || r.byprod_flg()
								|| !isNull(r.chd_itm_cd()) && !r.alt_itm_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_alt_grp_cd) {
						if (r.ph_flg() || r.byprod_flg()) {
							return MCMode.READ_ONLY;
						}
						if (r.alt_itm_flg()) {
							return MCMode.REQUIRED;
						}
						else if (isNull(r.chd_itm_cd()))
							return MCMode.READ_ONLY;
					}
					else if (column == columnWrk4Dtl_alt_itm_typ 
						  || column == columnWrk4Dtl_alt_itm_ratio
						  || column == columnWrk4Dtl_alt_alloc_prio
						  ) {
						if (isNull(r.alt_grp_cd()) || r.alt_itm_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_chd_rqmt_qty) {
						if (r.byprod_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_fxd_chd_rqmt_qty) {
						if (!isNull(r.fxd_chd_rqmt_qty()) 
						 && r.fxd_chd_rqmt_qty().isZero()
						 && (MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ()) || r.byprod_flg())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_sno_typ1) {
						if (!isNull(r.chd_sno1_mng_typ()) 
						 && !MAC_SNO_MNG_TYP.isMNG_ARB(r.chd_sno1_mng_typ())
						 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_sno_typ2) {
						if (!isNull(r.chd_sno2_mng_typ()) 
						 && !MAC_SNO_MNG_TYP.isMNG_ARB(r.chd_sno2_mng_typ())
						 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_sno_typ3) {
						if (!isNull(r.chd_sno3_mng_typ()) 
						 && !MAC_SNO_MNG_TYP.isMNG_ARB(r.chd_sno3_mng_typ())
						 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_sno_typ4) {
						if (!isNull(r.chd_sno4_mng_typ()) 
						 && !MAC_SNO_MNG_TYP.isMNG_ARB(r.chd_sno4_mng_typ())
						 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_bkf_typ 
						  || column == columnWrk4Dtl_yield_calc_flg
						  || column == columnWrk4Dtl_inpt_ctl_typ) {
						if (r.ph_flg() || r.byprod_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_inst_lot_fix_flg) {
						if (isNull(r.lot_mng_typ()) 
						|| MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) 
						|| r.ph_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_lot_mix_flg) {
						if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) 
						 || r.byprod_flg() 
						 || r.ph_flg()
						 || MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())
						 ) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_sublot_mix_flg) {
						if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) 
						 || r.byprod_flg() 
						 || r.ph_flg()
						 || MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())
						 ) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_alloc_ctl_typ) {
						if (MAC_STK_MNG_TYP.isNOT_MNG(r.chd_stk_mng_typ())
						 || MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())
						 || r.ph_flg() 
						 || r.byprod_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk4Dtl_main_itm_flg) {
						if (r.ph_flg() || r.byprod_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					//手配ＮＯ管理区分が「２：管理する（必須）」の場合のみ部品と動きを変える
					else if (column == columnWrk4Dtl_max_sno1){
						if (_is_mng_req_par_sno1){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk4Dtl_max_sno2){
						if (_is_mng_req_par_sno2){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk4Dtl_max_sno3){
						if (_is_mng_req_par_sno3){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk4Dtl_max_sno4){
						if (_is_mng_req_par_sno4){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk4Dtl_min_sno1){
						if (_is_mng_req_par_sno1){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk4Dtl_min_sno2){
						if (_is_mng_req_par_sno2){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk4Dtl_min_sno3){
						if (_is_mng_req_par_sno3){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk4Dtl_min_sno4){
						if (_is_mng_req_par_sno4){
							return MCMode.ENABLE;
						}
					}
				}
				else if (table.getBaseTable() == Wrk5DtlTable) {
					Wrk5DtlR r = Wrk5DtlTable.getRow(index);
					if (column == columnWrk5Dtl_wk_cost 
						  || column == columnWrk5Dtl_fxd_wk_cost) {
						if (isNull(r.wk_cost_unit_dec_place())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk5Dtl_oper_cd 
						  || column == columnWrk5Dtl_oper_seq) {
						if (isNullOrNullVal(r.oper_ptn())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk7DtlTable) {
					Wrk7DtlR r = Wrk7DtlTable.getRow(index);
					if (column == columnWrk7Dtl_in_loc_flg) {
						if (isNull(r.to_lg_grp_cd()) || isNull(r.fr_lg_grp_cd())
								|| !isSame(r.to_lg_grp_cd(), r.fr_lg_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk7Dtl_fr_loc_cd) {
						if (isNull(r.to_loc_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk8DtlTable) {
					Wrk8DtlR r = Wrk8DtlTable.getRow(index);
					if (column == columnWrk8Dtl_gi_loc_cd
					 || column == columnWrk8Dtl_inpt_gi_loc_cd
					 || column == columnWrk8Dtl_ship_gi_loc_cd) {
						if (isNull(r.loc_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk8Dtl_rord_rqst_qty
					 || column == columnWrk8Dtl_lot_sizing_flg
					 || column == columnWrk8Dtl_gi_loc_cd) {
						if (isNull(r.rord_stk_qty())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk8Dtl_lot_sizing_flg) {
						if (!isNull(r.rord_rqst_qty())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk8Dtl_ship_gi_loc_cd) {
						if (isNull(r.alloc_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk9DtlTable) {
					Wrk9DtlR r = Wrk9DtlTable.getRow(index);
					if (column == columnWrk9Dtl_def_flg) {
						if (!r.cst_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk9Dtl_pf_grp_cd) {
						if (!r.sppl_flg() || getHdrR().sundry_itm_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk9Dtl_pf_fix_flg) {
						if (isNull(r.pf_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk9Dtl_purc_commit_flg) {
						if (isNull(r.pf_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk11DtlTable) {
					Wrk11DtlR r = Wrk11DtlTable.getRow(index);
					// 製造承認対象ＦＬＧ
					if (column == columnWrk11Dtl_mfg_aprv_flg) {
						if (!MAC_LOT_MNG_TYP.isUNIQ(getHdrR().lot_mng_typ())
								&& !MAC_SUBLOT_MNG_TYP.isUNIQ(getHdrR().sublot_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					// 製造承認役割ＣＤ
					if (column == columnWrk11Dtl_mfg_aprv_role_cd) {
						if (!r.mfg_aprv_flg()) {
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
		if (Wrk4Dtl_chd_itm_p_PPanel.isItm(lc)) {
			doWrk4Dtl_chd_itm_cd_LC(info);
		}
		if (lc == columnWrk4Dtl_chd_inpt_qty) {
			doWrk4Dtl_chd_inpt_qty_LC(info);
		}
		if (lc == columnWrk8Dtl_rord_stk_qty) {
			doWrk8Dtl_rord_stk_qty_LC(info);
		}
		if (lc == columnWrk8Dtl_rord_rqst_qty) {
			doWrk8Dtl_rord_rqst_qty_LC(info);
		}
	}
	
	@Override
	public void doWrk1Dtl_wg_cd_LC(MCEventInfo info) {
		super.doWrk1Dtl_mfg_loc_cd_LC(info);
		
		int idx = info.getEventIndex();

		setValueEx(columnWrk1Dtl_mfg_loc_cd, idx, null);
	}

	@Override
	public void doWrk1Dtl_mfg_loc_cd_LC(MCEventInfo info) {
		super.doWrk1Dtl_mfg_loc_cd_LC(info);
		
		int idx = info.getEventIndex();
		Wrk1DtlR r = getWrk1DtlL().get(idx);
		
		if (!isNullOrNullVal(r.mfg_loc_cd()) && isNull(r.bom_ptn())) {
			setValueEx(columnWrk1Dtl_bom_ptn, idx, getHdrR().def_bom_ptn()) ;
		}
		if (isNull(r.loc_sppl_cd())) {
			setValueEx(columnWrk1Dtl_purc_lt, idx, null) ;
			setValueEx(columnWrk1Dtl_purc_lt_add_qty, idx, null) ;
			setValueEx(columnWrk1Dtl_purc_basis_typ, idx, null) ;
			setValueEx(columnWrk1Dtl_accpt_insp_lt, idx, null) ;
			setValueEx(columnWrk1Dtl_rqst_wg_cd, idx, null) ;
			setValueEx(columnWrk1Dtl_po_batch_flg, idx, null) ;
			setValueEx(columnWrk1Dtl_purc_id_typ, idx, null) ;
			if (isNull(r.yield_schd_qty())) {
				setValueEx(columnWrk1Dtl_yield_schd_qty, idx, MCNumber.ONE) ;
			}
			if (isNull(r.mfg_inst_qty())) {
				setValueEx(columnWrk1Dtl_mfg_inst_qty, idx, MCNumber.ONE) ;
			}
		}
		else {
			setValueEx(columnWrk1Dtl_oper_ptn, idx, null) ;
			setValueEx(columnWrk1Dtl_yield_schd_qty, idx, MCNumber.ONE) ;
			setValueEx(columnWrk1Dtl_mfg_inst_qty, idx, MCNumber.ONE) ;
			setValueEx(columnWrk1Dtl_fxd_rqmt_qty, idx, null) ;
			setValueEx(columnWrk1Dtl_lot_issue_typ, idx, null) ;
			setValueEx(columnWrk1Dtl_ln_stk_flg, idx, false) ;
			setValueEx(columnWrk1Dtl_purc_id_typ, idx, MAC_PURC_ID_TYP.PURC.value()) ;
		}
		if (isNull(r.order_ratio())){
			setValueEx(columnWrk1Dtl_order_ratio, idx, MCNumber.ONE);
		}
	}
	@Override
	public void doWrk1Dtl_purc_basis_typ_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doWrk1Dtl_purc_basis_typ_LC(info);
		
		int idx = info.getEventIndex();
		Wrk1DtlR r = getWrk1DtlL().get(idx);
		
		if(MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
			setValueEx(columnWrk1Dtl_accpt_insp_lt, idx, null);
		}
	}
	@Override
	public void doWrk1Dtl_lot_sz_pd_LC(MCEventInfo info) {
		super.doWrk1Dtl_lot_sz_pd_LC(info);
		
		int idx = info.getEventIndex();
		Wrk1DtlR r = getWrk1DtlL().get(idx);
		
		if (!isNull(r.lot_sz_pd())) {
			setValueEx(columnWrk1Dtl_sz_day_week_typ, idx, null);
		}
	}
	@Override
	public void doWrk1Dtl_sz_day_week_typ_LC(MCEventInfo info) {
		super.doWrk1Dtl_sz_day_week_typ_LC(info);
		
		int idx = info.getEventIndex();
		Wrk1DtlR r = getWrk1DtlL().get(idx);

		if (!isNull(r.sz_day_week_typ())) {
			setValueEx(columnWrk1Dtl_lot_sz_pd, idx, null);
		}
		else {
			setValueEx(columnWrk1Dtl_sz_week, idx, null);
		}
	}
	@Override
	public void doWrk1Dtl_rsrc_cd1_LC(MCEventInfo info) {
		super.doWrk1Dtl_rsrc_cd1_LC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnWrk1Dtl_rsrc_std_qty1, idx, null);
		setValueEx(columnWrk1Dtl_rsrc_unit_qty1, idx, null);
	}
	@Override
	public void doWrk1Dtl_rsrc_cd2_LC(MCEventInfo info) {
		super.doWrk1Dtl_rsrc_cd2_LC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnWrk1Dtl_rsrc_std_qty2, idx, null);
		setValueEx(columnWrk1Dtl_rsrc_unit_qty2, idx, null);
	}
	
	@Override
	public void doWrk1Dtl_purc_id_typ_LC(MCEventInfo info) {
		super.doWrk1Dtl_purc_id_typ_LC(info);
		
		int idx = info.getEventIndex();
		Wrk1DtlR r = getWrk1DtlL().get(idx);

		if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
				|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
			setValueEx(columnWrk1Dtl_accpt_insp_lt, idx, null);
		}
	}


	@Override
	public void doWrk2Dtl_rqst_loc_cd_LC(MCEventInfo info) {
		super.doWrk2Dtl_rqst_loc_cd_LC(info);
		
		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);
		if (isNull(r.order_ratio())){
			setValueEx(columnWrk2Dtl_order_ratio, idx, MCNumber.ONE);
		}
	}
	@Override
	public void doWrk2Dtl_lot_sz_pd_LC(MCEventInfo info) {
		super.doWrk2Dtl_lot_sz_pd_LC(info);
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
	public void doWrk3Dtl_loc_cd_LC(MCEventInfo info) {
		super.doWrk3Dtl_loc_cd_LC(info);

		int idx = info.getEventIndex();

		setValueEx(columnWrk3Dtl_oper_loc_cd, idx, null);
	}
	@Override
	public void doWrk3Dtl_oper_cd_LC(MCEventInfo info) {
		super.doWrk3Dtl_oper_cd_LC(info);
		
		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);
		
		if (isNullOrNullVal(r.oper_cd())) {
			setValueEx(columnWrk3Dtl_oper_seq, idx, null);
		}
		else if (isNull(r.oper_seq())) {
			setValueEx(columnWrk3Dtl_oper_seq, idx, MCNumber.ONE);
		}
	}
	@Override
	public void doWrk3Dtl_yield_oper_flg_NC(MCEventInfo info) {
		super.doWrk3Dtl_yield_oper_flg_NC(info);
		Wrk3DtlR r = getWrk3DtlL().get(info.getEventIndex());
		setValueEx(columnWrk3Dtl_yield_oper_ratio, r.getGUIIndex(), null);
	}
	@Override
	public boolean doWrk3Dtl_wip_rate_VC(MCEventInfo info) {
		MCNumber val = (MCNumber)info.getNewValue();
		if (!isNull(val)) {
			if (val.lt(MCNumber.ONE) || val.gt(100)) {
				return false;
			}
		}
		return super.doWrk3Dtl_wip_rate_VC(info);
	}


	/**
	 * [Wrk4Dtl]パネルの[chd_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	protected void doWrk4Dtl_chd_itm_cd_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.chd_itm_typ())) {
			setValueEx(columnWrk4Dtl_ph_flg, idx, false);
			setValueEx(columnWrk4Dtl_bkf_typ, idx, null);
			setValueEx(columnWrk4Dtl_inpt_ctl_typ, idx, null);
			if (!isNull(r.alt_grp_cd())){
				setValueEx(columnWrk4Dtl_alt_grp_cd, idx, null);
			}
		}
		else {
			setValueEx(columnWrk4Dtl_alt_itm_flg, idx, false);
			
			if (!isNull(getHdrR().dec_place()) && isNull(r.par_inst_qty())){
				setValueEx(columnWrk4Dtl_par_inst_qty, idx, MCNumber.ONE);
			}
			if (!isNull(r.chd_dec_place()) && isNull(r.fxd_chd_rqmt_qty())){
				setValueEx(columnWrk4Dtl_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
		}
		if (r.ph_flg() && isNull(r.ph_bom_ptn())) {
			setValueEx(columnWrk4Dtl_ph_bom_ptn, idx, r.chd_def_bom_ptn());
		}

		if (!r.ph_flg()) {
			setSnoTyp(r.chd_sno1_mng_typ(), idx, columnWrk4Dtl_sno_typ1);
			setSnoTyp(r.chd_sno2_mng_typ(), idx, columnWrk4Dtl_sno_typ2);
			setSnoTyp(r.chd_sno3_mng_typ(), idx, columnWrk4Dtl_sno_typ3);
			setSnoTyp(r.chd_sno4_mng_typ(), idx, columnWrk4Dtl_sno_typ4);
		}

		if (isNull(r.lot_mng_typ()) 
		 || MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			setValueEx(columnWrk4Dtl_inst_lot_fix_flg, idx, false);
		}
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			setValueEx(columnWrk4Dtl_lot_mix_flg, idx, false);
		}
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			setValueEx(columnWrk4Dtl_sublot_mix_flg, idx, false);
		}
		if (MAC_STK_MNG_TYP.isNOT_MNG(r.chd_stk_mng_typ())) {
			setValueEx(columnWrk4Dtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
		}
	}
	
	@Override
	public void doWrk4Dtl_lot_mng_typ_NC(MCEventInfo info) {
		super.doWrk4Dtl_lot_mng_typ_NC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);;
		
		if (!isNull(r.alt_itm_typ())) {
			setValueEx(columnWrk4Dtl_alt_itm_typ, idx, null);
		}
	}
	
	@Override
	public void doWrk4Dtl_sublot_mng_typ_NC(MCEventInfo info) {
		super.doWrk4Dtl_sublot_mng_typ_NC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);;
		
		if (!isNull(r.alt_itm_typ())) {
			setValueEx(columnWrk4Dtl_alt_itm_typ, idx, null);
		}
	}
	
	/**
	 * 子品目の手配ＮＯ管理区分から手配区分を設定する（手配ＮＯ管理区分が任意以外のとき）
	 */
	protected void setSnoTyp(String snoMngTyp, int idx, MCColumnConfig cc) {
		if (MAC_SNO_MNG_TYP.isNOT_MNG(snoMngTyp)) {
			setValueEx(cc, idx, MAC_SNO_TYP.NO_EXTND.value());
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(snoMngTyp)) {
			setValueEx(cc, idx, MAC_SNO_TYP.EXTND.value());
		}
		else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(snoMngTyp)) {
			setValueEx(cc, idx, MAC_SNO_TYP.EXTND_NULL.value());
		}
	}
	
	@Override
	public void doWrk4Dtl_wg_cd_LC(MCEventInfo info) {
		super.doWrk4Dtl_wg_cd_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		setValueEx(columnWrk4Dtl_alt_grp_cd, idx, null);

		if (isNull(r.bom_ptn())) {
			setValueEx(columnWrk4Dtl_bom_ptn, idx, getHdrR().def_bom_ptn());
		}
	}
	
	@Override
	public void doWrk4Dtl_oper_cd_LC(MCEventInfo info) {
		super.doWrk4Dtl_oper_cd_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.oper_cd())) {
			setValueEx(columnWrk4Dtl_oper_seq, idx, null);
		}
		else if (isNull(r.oper_seq())) {
			setValueEx(columnWrk4Dtl_oper_seq, idx, MCNumber.ONE);
		}
	}
	@Override
	public void doWrk4Dtl_chd_asset_mng_typ_LC(MCEventInfo info) {
		super.doWrk4Dtl_chd_asset_mng_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ())) {
			setValueEx(columnWrk4Dtl_ph_flg, idx, true);
		}
	}
	
	@Override
	public void doWrk4Dtl_inpt_ctl_typ_LC(MCEventInfo info) {
		super.doWrk4Dtl_inpt_ctl_typ_LC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
			setValueEx(columnWrk4Dtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
		}
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (isNull(r.inpt_ctl_typ()) || !MAC_INPT_CTL_TYP.isMRP_INPT(r.inpt_ctl_typ())) {
				setValueEx(columnWrk4Dtl_inpt_ctl_typ, idx, MAC_INPT_CTL_TYP.MRP_INPT.value());
			}
		}
	}
	
	@Override
	public void doWrk4Dtl_alloc_ctl_typ_LC(MCEventInfo info) {
		super.doWrk4Dtl_alloc_ctl_typ_LC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (r.ph_flg() 
		 || r.byprod_flg()
		 || MAC_STK_MNG_TYP.isNOT_MNG(r.chd_stk_mng_typ())
		 || MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())
		 ) {
			if (isNull(r.alloc_ctl_typ()) || !MAC_ALLOC_CTL_TYP.isNO_ALLOC(r.alloc_ctl_typ())) {
				setValueEx(columnWrk4Dtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
			}
		}
	}
	
	@Override
	public void doWrk4Dtl_bkf_typ_LC(MCEventInfo info) {
		super.doWrk4Dtl_bkf_typ_LC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (isNull(r.bkf_typ()) || !MAC_BKF_TYP.isNO_BKF(r.bkf_typ())) {
				setValueEx(columnWrk4Dtl_bkf_typ, idx, MAC_BKF_TYP.NO_BKF.value());
			}
		}
	}
	
	@Override
	public void doWrk4Dtl_lot_mix_flg_NC(MCEventInfo info) {
		super.doWrk4Dtl_lot_mix_flg_NC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (r.lot_mix_flg()) {
				setValueEx(columnWrk4Dtl_lot_mix_flg, idx, false);
			}
		}
	}
	
	@Override
	public void doWrk4Dtl_sublot_mix_flg_NC(MCEventInfo info) {
		super.doWrk4Dtl_sublot_mix_flg_NC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (r.sublot_mix_flg()) {
				setValueEx(columnWrk4Dtl_sublot_mix_flg, idx, false);
			}
		}
	}
	
	@Override
	public void doWrk4Dtl_inst_lot_fix_flg_NC(MCEventInfo info) {
		super.doWrk4Dtl_inst_lot_fix_flg_NC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (r.ph_flg()
		 || MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			if (r.inst_lot_fix_flg()) {
				setValueEx(columnWrk4Dtl_inst_lot_fix_flg, idx, false);
			}
		}
	}
	
	@Override
	public void doWrk4Dtl_main_itm_flg_NC(MCEventInfo info) {
		super.doWrk4Dtl_main_itm_flg_NC(info);
		
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (r.ph_flg() || r.byprod_flg()) {
			if (r.main_itm_flg()) {
				setValueEx(columnWrk4Dtl_main_itm_flg, idx, false);
			}
		}
	}
	
	@Override
	public void doWrk4Dtl_ph_flg_NC(MCEventInfo info) {
		super.doWrk4Dtl_ph_flg_NC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (r.ph_flg()) {
			setValueEx(columnWrk4Dtl_ver_no, idx, null);
			setValueEx(columnWrk4Dtl_bkf_typ, idx, MAC_BKF_TYP.NO_BKF.value());
			setValueEx(columnWrk4Dtl_inpt_ctl_typ, idx, MAC_INPT_CTL_TYP.MRP_INPT.value());
			setValueEx(columnWrk4Dtl_alt_itm_flg, idx, false);
			setValueEx(columnWrk4Dtl_alt_grp_cd, idx, null);
			setValueEx(columnWrk4Dtl_main_itm_flg, idx, false);
			setValueEx(columnWrk4Dtl_yield_calc_flg, idx, false);
			setValueEx(columnWrk4Dtl_inst_lot_fix_flg, idx, false);
			setValueEx(columnWrk4Dtl_lot_mix_flg, idx, false);
			setValueEx(columnWrk4Dtl_sublot_mix_flg, idx, false);
			setValueEx(columnWrk4Dtl_byprod_flg, idx, false);
			if (isNull(r.ph_bom_ptn())) {
				setValueEx(columnWrk4Dtl_ph_bom_ptn, idx, r.chd_def_bom_ptn());
			}
			setValueEx(columnWrk4Dtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
		}
		else {
			setValueEx(columnWrk4Dtl_ph_bom_ptn, idx, null);
			setValueEx(columnWrk4Dtl_bkf_typ, idx, null);
			setValueEx(columnWrk4Dtl_inpt_ctl_typ, idx, null);
		}
	}
	
	@Override
	public void doWrk4Dtl_ver_flg_NC(MCEventInfo info) {
		super.doWrk4Dtl_ver_flg_NC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (!r.ver_flg()) {
			setValueEx(columnWrk4Dtl_ver_no, idx, null);
		}
	}
	
	@Override
	public void doWrk4Dtl_alt_itm_flg_NC(MCEventInfo info) {
		super.doWrk4Dtl_alt_itm_flg_NC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (r.alt_itm_flg()) {
			if (!isNull(r.chd_itm_cd())) {
				setValueEx(columnWrk4Dtl_chd_itm_cd, idx, null);
			}
			setValueEx(columnWrk4Dtl_ver_no, idx, null);
			setValueEx(columnWrk4Dtl_alt_itm_typ, idx, null);
			setValueEx(columnWrk4Dtl_alt_itm_ratio, idx, null);
			setValueEx(columnWrk4Dtl_alt_alloc_prio, idx, null);
			if (isNull(r.chd_itm_cd())) {
				setValueEx(columnWrk4Dtl_chd_base_unit_cd, idx, null);
				setValueEx(columnWrk4Dtl_chd_dec_place, idx, MCNumber.valueOf(QtyR.qty_META.scale()));
			}
		}
		else {
			setValueEx(columnWrk4Dtl_alt_grp_cd, idx, null);
		}
	}
	
	@Override
	public void doWrk4Dtl_alt_grp_cd_LC(MCEventInfo info) {
		super.doWrk4Dtl_alt_grp_cd_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (isNull(r.alt_grp_cd())) {
			setValueEx(columnWrk4Dtl_alt_itm_typ, idx, null);
			setValueEx(columnWrk4Dtl_alt_itm_ratio, idx, null);
			setValueEx(columnWrk4Dtl_alt_alloc_prio, idx, null);
		}
		else if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())){
			setValueEx(columnWrk4Dtl_inpt_ctl_typ, idx, null);
		}
	}
	
	@Override
	public void doWrk4Dtl_alt_itm_typ_LC(MCEventInfo info) {
		super.doWrk4Dtl_alt_itm_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		if (MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())) {
			if (!isNull(r.chd_dec_place())) {
				setValueEx(columnWrk4Dtl_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
			
			if (!isNull(r.lot_mng_typ()) && !MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
				setValueEx(columnWrk4Dtl_lot_mix_flg, idx, true);
			}
			else if (isNull(r.lot_mng_typ())) {
				setValueEx(columnWrk4Dtl_lot_mix_flg, idx, false);
			}
			
			if (!isNull(r.sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
				setValueEx(columnWrk4Dtl_sublot_mix_flg, idx, true);
			}
			else if (isNull(r.sublot_mng_typ())) {
				setValueEx(columnWrk4Dtl_sublot_mix_flg, idx, false);
			}
		}
	}
	
	@Override
	public void doWrk4Dtl_byprod_flg_NC(MCEventInfo info) {
		super.doWrk4Dtl_byprod_flg_NC(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (r.ph_flg()) {
			if (r.byprod_flg()) {
				setValueEx(columnWrk4Dtl_byprod_flg, idx, false);
			}
		}
		else if (r.byprod_flg()) {
			setValueEx(columnWrk4Dtl_ver_no, idx, null);
			setValueEx(columnWrk4Dtl_alt_itm_flg, idx, false);
			setValueEx(columnWrk4Dtl_alt_grp_cd, idx, null);
			setValueEx(columnWrk4Dtl_bkf_typ, idx, MAC_BKF_TYP.NO_BKF.value());
			setValueEx(columnWrk4Dtl_lot_mix_flg, idx, false);
			setValueEx(columnWrk4Dtl_sublot_mix_flg, idx, false);
			setValueEx(columnWrk4Dtl_alloc_ctl_typ, idx, MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
			setValueEx(columnWrk4Dtl_yield_calc_flg, idx, false);
			setValueEx(columnWrk4Dtl_inpt_ctl_typ, idx, MAC_INPT_CTL_TYP.MRP_INPT.value());
			setValueEx(columnWrk4Dtl_main_itm_flg, idx, false);
			if (!isNull(r.chd_dec_place())) {
				setValueEx(columnWrk4Dtl_fxd_chd_rqmt_qty, idx, MCNumber.ZERO);
			}
			setValueEx(columnWrk4Dtl_chd_rqmt_qty, idx, r.chd_inpt_qty());
		}
	}
	
	/**
	 * 子投入数量に対するイベント処理
	 *
	 * @param info イベント情報
	 */
	protected void doWrk4Dtl_chd_inpt_qty_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);
		
		if (isNull(r.chd_rqmt_qty()) || r.byprod_flg()){
			setValueEx(columnWrk4Dtl_chd_rqmt_qty, idx, r.chd_inpt_qty());
		}
	}
	
	@Override
	public void doWrk4Dtl_alt_grp_cd_NE(MCEventInfo info) {
		super.doWrk4Dtl_alt_grp_cd_NE(info);

		int idx = info.getEventIndex();
		Wrk4DtlR r = getWrk4DtlL().get(idx);

		columnWrk4Dtl_alt_grp_cd.setListType(r.alt_itm_flg() ? MCListType.STRICT : MCListType.FREE);
	}

	@Override
	public void doWrk5Dtl_oper_ptn_LC(MCEventInfo info) {
		super.doWrk5Dtl_oper_ptn_LC(info);

		int idx = info.getEventIndex();
		Wrk5DtlR r = getWrk5DtlL().get(idx);
		
		if (isNullOrNullVal(r.oper_ptn())) {
			setValueEx(columnWrk5Dtl_oper_cd, idx, null);
		}
	}
	@Override
	public void doWrk5Dtl_oper_cd_LC(MCEventInfo info) {
		super.doWrk5Dtl_oper_cd_LC(info);

		int idx = info.getEventIndex();
		Wrk5DtlR r = getWrk5DtlL().get(idx);
		
		if (isNullOrNullVal(r.oper_cd())) {
			setValueEx(columnWrk5Dtl_oper_seq, idx, null);
		}
		else if (isNull(r.oper_seq())) {
			setValueEx(columnWrk5Dtl_oper_seq, idx, MCNumber.ONE);
		}
	}
	@Override
	public void doWrk5Dtl_wk_cost_cd_LC(MCEventInfo info) {
		super.doWrk5Dtl_wk_cost_cd_LC(info);

		int idx = info.getEventIndex();
		Wrk5DtlR r = getWrk5DtlL().get(idx);
		
		if (isNull(r.base_qty())) {
			setValueEx(columnWrk5Dtl_base_qty, idx, MCNumber.ONE);
		}
		
		if (!isNull(r.wk_cost_unit_dec_place())) {
			columnWrk5Dtl_wk_cost.setScale(r.wk_cost_unit_dec_place().intValue());
			columnWrk5Dtl_fxd_wk_cost.setScale(r.wk_cost_unit_dec_place().intValue());
		}
	}
	
	@Override
	public void doWrk5Dtl_wk_cost_unit_dec_place_LC(MCEventInfo info) {
		super.doWrk5Dtl_wk_cost_unit_dec_place_LC(info);

		int idx = info.getEventIndex();
		
		setValueEx(columnWrk5Dtl_wk_cost, idx, null);
		setValueEx(columnWrk5Dtl_fxd_wk_cost, idx, null);
	}


	@Override
	public void doWrk7Dtl_to_loc_cd_NC(MCEventInfo info) {
		super.doWrk7Dtl_to_loc_cd_NC(info);

		int idx = info.getEventIndex();

		setValueEx(columnWrk7Dtl_fr_loc_cd, idx, null);
	}
	@Override
	public void doWrk7Dtl_to_lg_grp_cd_NC(MCEventInfo info) {
		super.doWrk7Dtl_to_lg_grp_cd_NC(info);
		chkInLocFlgMode(info);
	}
	@Override
	public void doWrk7Dtl_fr_lg_grp_cd_NC(MCEventInfo info) {
		super.doWrk7Dtl_fr_lg_grp_cd_NC(info);
		chkInLocFlgMode(info);
	}
	protected void chkInLocFlgMode(MCEventInfo info) {
		Wrk7DtlR r = getWrk7DtlL().get(info.getEventIndex());
		if (!isSame(r.to_lg_grp_cd(), r.fr_lg_grp_cd())) {
			setValueEx(columnWrk7Dtl_in_loc_flg, r.getGUIIndex(), false);
		}
	}

	public void doWrk8Dtl_loc_cd_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		Wrk8DtlR r = getWrk8DtlL().get(idx);

		if (isNull(r.loc_cd())){
			setValueEx(columnWrk8Dtl_gi_loc_cd, idx, null);
			setValueEx(columnWrk8Dtl_inpt_gi_loc_cd, idx, null);
			setValueEx(columnWrk8Dtl_ship_gi_loc_cd, idx, null);
		}
		if (isNull(r.alloc_grp_cd())){
			setValueEx(columnWrk8Dtl_ship_gi_loc_cd, idx, null);
		}
	}

	public void doWrk8Dtl_rord_stk_qty_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		Wrk8DtlR r = getWrk8DtlL().get(idx);

		if (isNull(r.rord_stk_qty())){
			setValueEx(columnWrk8Dtl_gi_schd_flg, idx, false);
			setValueEx(columnWrk8Dtl_rord_rqst_qty, idx, null);
			setValueEx(columnWrk8Dtl_lot_sizing_flg, idx, false);
			setValueEx(columnWrk8Dtl_gi_loc_cd, idx, null);
		}
	}

	public void doWrk8Dtl_rord_rqst_qty_LC(MCEventInfo info) {

		int idx = info.getEventIndex();
		Wrk8DtlR r = getWrk8DtlL().get(idx);

		if (!isNull(r.rord_rqst_qty())){
			setValueEx(columnWrk8Dtl_lot_sizing_flg, idx, false);
		}
	}

	@Override
	public void doWrk9Dtl_bp_cd_LC(MCEventInfo info) {
		super.doWrk9Dtl_bp_cd_LC(info);

		int idx = info.getEventIndex();

		setValueEx(columnWrk9Dtl_pf_grp_cd, idx, null);
		setValueEx(columnWrk9Dtl_def_flg, idx, null);
	}
	@Override
	public void doWrk9Dtl_pf_grp_cd_LC(MCEventInfo info) {
		super.doWrk9Dtl_pf_grp_cd_LC(info);

		int idx = info.getEventIndex();

		setValueEx(columnWrk9Dtl_pf_fix_flg, idx, false);
		setValueEx(columnWrk9Dtl_purc_commit_flg, idx, false);
	}

	@Override
	public void doWrk10Dtl_wg_cd_LC(MCEventInfo info) {
		super.doWrk10Dtl_wg_cd_LC(info);
		
		setMstCol(info) ;
	}
	
	/**
	 * ＷＧを変更した場合に既定値項目を設定しなおします。
	 *
	 * @param info イベント情報
	 */
	protected void setMstCol(MCEventInfo info) {
		int idx = info.getEventIndex();
		Wrk10DtlR r = getWrk10DtlL().get(idx);

		setValueEx(columnWrk10Dtl_mfg_inst_unit_typ_mst, idx, nvl(nvl(getHdrR().mfg_inst_unit_typ(), r.mfg_inst_unit_typ_wg()), MAC_MFG_INST_UNIT_TYP.ITM.value()));
		setValueEx(columnWrk10Dtl_mrp_proc_typ_mst, idx, nvl(nvl(getHdrR().mrp_proc_typ(), r.mrp_proc_typ_wg()), MAC_MRP_PROC_TYP.RATE.value()));
		setValueEx(columnWrk10Dtl_rqmt_typ_mst, idx, nvl(getHdrR().rqmt_typ(), r.rqmt_typ_wg()));
		setValueEx(columnWrk10Dtl_prod_pln_typ_mst, idx, nvl(getHdrR().prod_pln_typ(), r.prod_pln_typ_wg()));
		setValueEx(columnWrk10Dtl_dmnd_date_div_mons_mst, idx, nvl(getHdrR().dmnd_date_div_mons(), r.dmnd_date_div_mons_wg()));
		setValueEx(columnWrk10Dtl_alloc_margin_days_mst, idx, nvl(getHdrR().alloc_margin_days(), r.alloc_margin_days_wg()));
		setValueEx(columnWrk10Dtl_mrp_alloc_margin_days_mst, idx, nvl(nvl(getHdrR().mrp_alloc_margin_days(), r.mrp_alloc_margin_days_wg()), MCNumber.ZERO));
		setValueEx(columnWrk10Dtl_mrp_opn_xfr_days_mst, idx, nvl(getHdrR().mrp_opn_xfr_days(), r.mrp_opn_xfr_days_wg()));
		setValueEx(columnWrk10Dtl_rqmt_rstr_qty_mst, idx, getHdrR().rqmt_rstr_qty());
		setValueEx(columnWrk10Dtl_inpt_itm_add_flg, idx, getHdrR().inpt_itm_add_flg());
		setValueEx(columnWrk10Dtl_inpt_itm_del_flg, idx, getHdrR().inpt_itm_del_flg());
		setValueEx(columnWrk10Dtl_sch_flg, idx, getHdrR().sch_flg());
	}

	@Override
	public void doWrk11Dtl_site_cd_LC(MCEventInfo info) {
		super.doWrk11Dtl_site_cd_LC(info);

		int idx = info.getEventIndex();

		// デフォルト値設定
		if (isEditable(columnWrk11Dtl_mfg_aprv_flg, idx)) {
			setValueEx(columnWrk11Dtl_mfg_aprv_flg, idx, getHdrR().def_mfg_aprv_flg()) ;
		}
		if (isEditable(columnWrk11Dtl_mfg_aprv_role_cd, idx)) {
			setValueEx(columnWrk11Dtl_mfg_aprv_role_cd, idx, getHdrR().def_mfg_aprv_role_cd()) ;
		}
	}

	@Override
	public void doWrk11Dtl_mfg_aprv_flg_NC(MCEventInfo info){
		super.doWrk11Dtl_mfg_aprv_flg_NC(info);

		int idx = info.getEventIndex();
		Wrk11DtlR r = getWrk11DtlL().get(idx);

		if (!r.mfg_aprv_flg()){
			setValueEx(columnWrk11Dtl_mfg_aprv_role_cd, idx, null) ;
		}
	}


	@Override
	protected void setStatusByOpe() {
		// 操作種別変更時は常にSRCHステータス
		setSRCHStatus();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setBtnMode();
	}

	protected void setBtnMode() {
		Wrk4DtlR r = Wrk4DtlTable.getSelectedMCRow();
		if (r == null || !r.alt_itm_flg()) {
			Wrk4DtlBtn_open_MABSP0080.setMode(MCMode.DISABLE);
		}
		else {
			Wrk4DtlBtn_open_MABSP0080.setMode(MCMode.ENABLE);
		}
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
		getWrk9DtlL().clear();
		getWrk10DtlL().clear();
		getWrk11DtlL().clear();
		getWrk12DtlL().clear();
		getWrk1SetDtHdrR().clear();
		getWrk2SetDtHdrR().clear();
		getWrk3SetDtHdrR().clear();
		getWrk4SetDtHdrR().clear();
		getWrk5SetDtHdrR().clear();
		getWrk8SetDtHdrR().clear();
		getWrk9SetDtHdrR().clear();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		Wrk4DtlTable.moveColumns(columnWrk4Dtl_min_sno1, columnWrk4Dtl_max_sno1, columnWrk4Dtl_min_sno2,
				columnWrk4Dtl_max_sno2, columnWrk4Dtl_min_sno3, columnWrk4Dtl_max_sno3);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Wrk1Dtl_mfg_lt_add_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_purc_lt_add_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_min_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_batch_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_max_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_yield_schd_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_mfg_inst_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_fxd_rqmt_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_rsrc_unit_qty1_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_rsrc_unit_qty2_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk1Dtl_sno_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3, Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ, Hdr_sno4_mng_typ);

		Wrk2Dtl_min_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk2Dtl_batch_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk2Dtl_max_lot_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk2Dtl_sno_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3, Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ, Hdr_sno4_mng_typ);

		Wrk3Dtl_qty1_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk3Dtl_qty2_p_PPanel.setRelateBeans(Hdr_unit_cd, columnWrk3Dtl_dec_place);
		Wrk3Dtl_qty3_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk3Dtl_qty4_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk3Dtl_sno_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3, Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ, Hdr_sno4_mng_typ);

		Wrk4Dtl_qty1_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk4Dtl_qty2_p_PPanel.setRelateBeans(columnWrk4Dtl_chd_base_unit_cd, columnWrk4Dtl_chd_dec_place);
		Wrk4Dtl_qty3_p_PPanel.setRelateBeans(columnWrk4Dtl_chd_base_unit_cd, columnWrk4Dtl_chd_dec_place);
		Wrk4Dtl_qty4_p_PPanel.setRelateBeans(columnWrk4Dtl_chd_base_unit_cd, columnWrk4Dtl_chd_dec_place);
		Wrk4Dtl_min_sno_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3, Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ, Hdr_sno4_mng_typ);
		Wrk4Dtl_max_sno_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3, Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ, Hdr_sno4_mng_typ);

		Wrk5Dtl_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);

		Wrk7Dtl_xfr_lot_unit_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place, columnWrk7Dtl_fr_lg_grp_cd, columnWrk7Dtl_to_lg_grp_cd);

		Wrk8Dtl_buf_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk8Dtl_rord_stk_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk8Dtl_rord_rqst_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk8Dtl_str_ln1_p_PPanel.setRelateBeans(columnWrk8Dtl_gi_loc_cd, columnWrk8Dtl_gi_str_ln_tgt_flg);
		Wrk8Dtl_str_ln2_p_PPanel.setRelateBeans(columnWrk8Dtl_inpt_gi_loc_cd, columnWrk8Dtl_inpt_gi_str_ln_tgt_flg);
		Wrk8Dtl_str_ln3_p_PPanel.setRelateBeans(columnWrk8Dtl_ship_gi_loc_cd, columnWrk8Dtl_ship_gi_str_ln_tgt_flg);

		Wrk10Dtl_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		Wrk10Dtl_qty_mst_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);
		
		Wrk12Dtl_str_ln_p_PPanel.setRelateBeans(columnWrk12Dtl_loc_cd, columnWrk12Dtl_str_ln_tgt_flg);
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (hasWgDefCd(this)) {
			setComponentInvisibleAllStatus(Wrk2Panel, Wrk10Panel);
			// 検索枠を完全に閉じられるように、自動レイアウトによるサイズ計算の対象外にする。
			Wrk2Panel.setLayoutPosition(null);
			Wrk10Panel.setLayoutPosition(null);
		}
		if (!isStrLnEnabled(this)) {
			setComponentInvisibleAllStatus(Wrk12Panel);
			// 検索枠を完全に閉じられるように、自動レイアウトによるサイズ計算の対象外にする。
			Wrk12Panel.setLayoutPosition(null);
		}
	}
	//--------------------リストロジック表示制御Start-----------------------

	@Override
	protected void listInit() {
		super.listInit();

		getWrk1Dtl_bom_ptn_ListPutter().putBind(BomPtnCols.$i_par_itm_cd, Hdr_itm_cd);
		getWrk1Dtl_bom_ptn_ListPutter().putBind(BomPtnCols.$i_par_itm_sub1, Hdr_itm_sub1);
		getWrk1Dtl_bom_ptn_ListPutter().putBind(BomPtnCols.$i_par_itm_sub2, Hdr_itm_sub2);
		getWrk1Dtl_bom_ptn_ListPutter().putBind(BomPtnCols.$i_par_itm_sub3, Hdr_itm_sub3);
		
		getWrk1Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_itm_cd, Hdr_itm_cd);
		getWrk1Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_itm_sub1, Hdr_itm_sub1);
		getWrk1Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_itm_sub2, Hdr_itm_sub2);
		getWrk1Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_itm_sub3, Hdr_itm_sub3);
		getWrk1Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_loc_cd, columnWrk1Dtl_mfg_loc_cd);
		getWrk1Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_dt, columnWrk1Dtl_st_dt);
		
		getWrk5Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_itm_cd, Hdr_itm_cd);
		getWrk5Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_itm_sub1, Hdr_itm_sub1);
		getWrk5Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_itm_sub2, Hdr_itm_sub2);
		getWrk5Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_itm_sub3, Hdr_itm_sub3);
		getWrk5Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_loc_cd, columnWrk5Dtl_loc_cd);
		getWrk5Dtl_oper_ptn_ListPutter().putBind(ItmOperCols.$i_dt, Wrk5SetDtHdr_st_dt);
	}
	
	@Override
	public MCList getWrk3Dtl_oper_unit_cd(MCRow row, MCEventInfo info) {
		row.addStringColumn(UnitCols.$i_base_unit_cd, getHdrR().unit_cd());
		return super.getWrk3Dtl_oper_unit_cd(row, info);
	}

	//--------------------リストロジック表示制御End-----------------------

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
	public MCList getWrk4Dtl_alt_grp_cd(MCRow row, MCEventInfo info) {
		Wrk4DtlR r = getWrk4DtlL().get(info.getEventIndex());
		if (!r.alt_itm_flg()) {
			return MCList.create(MCRow.class);
		}
		if (isNull(row.getString(AltGrpBomCols.$i_wg_cd))) {
			row.addStringColumn(AltGrpBomCols.$i_wg_cd, MAC_STR.NULL_VAL.value());
		}
		return super.getWrk4Dtl_alt_grp_cd(row, info);
	}

}