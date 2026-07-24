package mcframe.clientMABS.MABSP1130;

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
import mcframe.clientMAUB.MAUBP5350.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_InspItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_InspItmReg_MC extends MABSP_InspItmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_InspItmReg_MC() {
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
	public MABSP_InspItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL1130_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1130_Srch01Caller<P extends MABSP_InspItmReg, B extends MA_MABSL1130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL1130_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			MCRow.copyall(getHdrR(), getHdrAllL().get(0));
		}

		@Override
		protected void moveFocus() {
			Wrk11DtlTable.selectLeftmostColumn(0);
			Wrk2DtlTable.selectRowNoFocus(0);
			Wrk3DtlTable.selectRowNoFocus(0);
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
				setWrk12TabMode(null);
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
			getWrk12DtlL().clear();
		}
	}

	/**
	 * [MA_MABSL1130_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1130_Upd01Caller<P extends MABSP_InspItmReg, B extends MA_MABSL1130_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL1130_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			if(!checkReqWrk12Dtl()) {
				return false;
			}
			setupWrk12DtlAll();
			setupHdrAll();
			return super.checkForCall();
		}

		/**
		 * 品目検査規格レコードに対応する品目検査パタンの検索方法区分が「４：抜取規格検査」でないとき
		 * 選択チェックをオフにして登録対象外にする
		 */
		protected void setupWrk12DtlAll() {
			for (Wrk12DtlR r : getWrk12DtlAllL().subList(getCheckColumn(), true)) {
				
				if (getWrk11DtlL().subList(
						x -> isSame(x.insp_ptn_cd(), r.insp_ptn_cd()) && MAC_INSP_MTD_TYP.isSPEC(x.insp_mtd_typ())
								&& x.st_dt().lte(r.end_dt()) && x.end_dt().gte(r.st_dt()))
						.isEmpty()) {
					r.check(false);
				}
			}
		}
		protected void setupHdrAll() {
			for(HdrR r : getHdrAllL()) {
				if (!isSame(r.insp_input_flg(), getHdrR().insp_input_flg())) {
					r.insp_input_flg(getHdrR().insp_input_flg());
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

			for(Wrk11DtlR r : bridge.up1()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk12DtlR r : bridge.up2()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk2DtlR r : bridge.up3()) {
				if (isNull(r.upd_cntr())) {
					r.itm_cd(getHdrR().itm_cd());
					r.itm_sub1(getHdrR().itm_sub1());
					r.itm_sub2(getHdrR().itm_sub2());
					r.itm_sub3(getHdrR().itm_sub3());
				}
			}
			for(Wrk3DtlR r : bridge.up4()) {
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
		callMA_MABSL1130_Srch01();
	}
	/**
	 * Panel[Wrk11SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk11SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk11SetDtHdr_st_dt, Wrk11SetDtHdr_end_dt, Wrk11DtlTable, columnWrk11Dtl_st_dt, columnWrk11Dtl_end_dt);
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
		if (!checkReqWrk12Dtl()) return;
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
		if (!checkReqWrk12Dtl()) return;
		copyRow(Wrk11DtlTable);
	}
	/**
	 * Panel[Wrk12SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk12SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk12SetDtHdr_st_dt, Wrk12SetDtHdr_end_dt, Wrk12DtlTable, columnWrk12Dtl_st_dt, columnWrk12Dtl_end_dt);
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
		Wrk12DtlR r = deleteRow(Wrk12DtlTable);
		getWrk12DtlAllL().remove(r);
	}
	/**
	 * Panel[Wrk12DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWrk12DtlBtn_rcopy(MCEventInfo info) {
		copyRow(Wrk12DtlTable);
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
	 * Panel[Btn]のボタン[open_MABCP0310]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0310(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0310");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0310CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0310.CndR crtOpenMABCP0310CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0310.MABCP_ItmReg p = (mcframe.clientMABC.MABCP0310.MABCP_ItmReg) aso.getPanel();
		mcframe.clientMABC.MABCP0310.CndR to = mcframe.clientMABC.MABCP0310.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
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
		Wrk3DtlR r = Wrk3DtlTable.getSelectedMCRow();
		if (r != null) {
			to.site_cd(r.site_cd());
		}

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0030(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0030");
		aso.runValueInit();
        aso.putCnd(crtOpenMABCP0030CndR(aso));
        aso.putSearchAction();
        aso.show();
	}
	protected mcframe.clientMABC.MABCP0030.CndR crtOpenMABCP0030CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0030.CndR to = mcframe.clientMABC.MABCP0030.CndR.create();

		int index = Wrk11DtlTable.getMCSelectedRow();
		if (index >= 0) {
			Wrk11DtlR fr = getWrk11DtlL().get(index);
			to.mst_nm(MAC_MST_NM.MAM_INSP_PTN.value());
			to.cd(fr.insp_ptn_cd());
		}

		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MABSP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABSP0160(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0160");
		aso.runValueInit();
        aso.putCnd(crtOpenMABSP0160CndR(aso));
        aso.putSearchAction();
        aso.show();
	}
	protected mcframe.clientMABS.MABSP0160.CndR crtOpenMABSP0160CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP0160.CndR to = mcframe.clientMABS.MABSP0160.CndR.create();

		int index = Wrk12DtlTable.getMCSelectedRow();
		if (index >= 0) {
			Wrk12DtlR fr = getWrk12DtlL().get(index);
			to.insp_point_cd(fr.insp_point_cd());
		}

		return to;
	}
	/**
	 * Panel[Hdr]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doHdr_upd(MCEventInfo info) {
		callMA_MABSL1130_Upd01();
	}


	//------------------ 汎用メソッド Start ------------------//
	/**
	 * 画面内のテーブルを返す
	 * @return
	 */
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] {Wrk11DtlTable, Wrk12DtlTable, Wrk2DtlTable, Wrk3DtlTable};
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
		return getWrk11DtlL();
	}

	@Override
	protected void listenerInit() {
		setListListener(Wrk11DtlTable, createRLRowListener());
		setListListener(Wrk12DtlTable, createWrk12DtlRowListener());
		setListListener(Wrk2DtlTable, createRLRowListener());
		setListListener(Wrk3DtlTable, createRLRowListener());

		columnWrk12Dtl_qn_out_min.addLCListener(this);
		columnWrk12Dtl_qn_in_min.addLCListener(this);
	}
	
	protected MCRowListener createWrk12DtlRowListener() {
		return new Wrk12DtlRowListener();
	}
	
	protected class Wrk12DtlRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {
			dtlRowValueChanged(event);
			
			if (!isInvisibleColumn(event)) {
				Wrk12DtlR r = (Wrk12DtlR)event.getSourceRow();
				if (r != null) {
					if(isNull(r.insp_ptn_cd())) {
						Wrk11DtlR r11 = Wrk11DtlTable.getSelectedMCRow();
						if (r11 != null) {
							r.itm_cd(r11.itm_cd());
							r.itm_sub1(r11.itm_sub1());
							r.itm_sub2(r11.itm_sub2());
							r.itm_sub3(r11.itm_sub3());
							r.insp_ptn_cd(r11.insp_ptn_cd());
							getWrk12DtlAllL().add(r);
						}
					}
				}
			}
		}

		protected boolean isInvisibleColumn(MCRowEvent event) {
			return event.getColumn().equals(columnWrk12Dtl_itm_cd.getBaseRowColumnName())
					|| event.getColumn().equals(columnWrk12Dtl_itm_sub1.getBaseRowColumnName())
					|| event.getColumn().equals(columnWrk12Dtl_itm_sub2.getBaseRowColumnName())
					|| event.getColumn().equals(columnWrk12Dtl_itm_sub3.getBaseRowColumnName())
					|| event.getColumn().equals(columnWrk12Dtl_insp_ptn_cd.getBaseRowColumnName());
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == columnWrk12Dtl_qn_out_min) {
			doWrk12Dtl_qn_out_min_LC(info);
		}
		else if (lc == columnWrk12Dtl_qn_in_min) {
			doWrk12Dtl_qn_in_min_LC(info);
		}
	}

	@Override
	public void fillSpace() {
		if (isUpdSts()) {
			Wrk11DtlTable.fillSpace();
			Wrk2DtlTable.fillSpace();
			Wrk3DtlTable.fillSpace();
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

	@Override
	public MCList getWrk2Dtl_insp_ptn_cd(MCRow row, MCEventInfo info){
		MCList<MCRow> l = MCList.create(MCRow.class);
		for (Wrk11DtlR dtlR : getWrk11DtlL()) {
			if (!isNull(dtlR.insp_ptn_cd())) {
				Wrk2DtlR r = Wrk2DtlR.create();
				r.insp_ptn_cd(dtlR.insp_ptn_cd());
				r.insp_ptn_nm(dtlR.insp_ptn_nm());
				l.add(r);
			}
		}
		if (info != null && info.getComponent() instanceof MCLinkBeans) {
			MCLinkBeans b = (MCLinkBeans) info.getComponent();
			MCListConfig c = b.getListConfig();
			c.addViewColumn(b, l, MAUAC_List.InspPtnCols.viewCols());
		}
		return l;
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override	
	public MCList<?> getWrk2Dtl_lmt_dt_frm_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getLmtDtFrmTyp(info));
		return super.getWrk2Dtl_lmt_dt_frm_typ(row, info);
	}
	/**
	 * 表示する期限起算日区分を取得する
	 */
	protected MAC_LMT_DT_FRM_TYP[] getLmtDtFrmTyp(MCEventInfo info) {
		Wrk2DtlR r = getWrk2DtlL().get(info.getEventIndex());

		MAC_LMT_DT_FRM_TYP[] arrayLmtDtFrmTyp;
		// 期限管理対象フラグ＝オフ：製造着手日、製造完了日、入荷実績日、子品目起算日引継ぎのみ表示
		if (!getHdrR().lmt_ctl_flg()) {
			arrayLmtDtFrmTyp = new MAC_LMT_DT_FRM_TYP[] {
					MAC_LMT_DT_FRM_TYP.MFG_ST, MAC_LMT_DT_FRM_TYP.MFG_CMPL,
					MAC_LMT_DT_FRM_TYP.ARR_DT, MAC_LMT_DT_FRM_TYP.DPND_CHLD_FR_DT };
		} else {
			arrayLmtDtFrmTyp = MAC_LMT_DT_FRM_TYP.array();
			arrayLmtDtFrmTyp = MCCollectionUtil.remove(arrayLmtDtFrmTyp, new MAC_LMT_DT_FRM_TYP[0], 
					MAC_LMT_DT_FRM_TYP.VALID_DT) ;
		}
		// 検査対象外フラグ=オン：検査判定日、手入力を表示しない
		if (r.no_insp_flg()) {
			arrayLmtDtFrmTyp = MCCollectionUtil.remove(arrayLmtDtFrmTyp, new MAC_LMT_DT_FRM_TYP[0],
					MAC_LMT_DT_FRM_TYP.INSP_JUDG, MAC_LMT_DT_FRM_TYP.MANUAL);
		}
		return arrayLmtDtFrmTyp;
	}
	@Override	
	public MCList<?> getWrk2Dtl_lot_insp_lmt_dt_frm_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getLotInspLmtDtFrmTyp(info));
		return super.getWrk2Dtl_lmt_dt_frm_typ(row, info);
	}
	/**
	 * 表示する期限起算日区分（延長時）を取得する
	 */
	protected MAC_LMT_DT_FRM_TYP[] getLotInspLmtDtFrmTyp(MCEventInfo info) {
		return new MAC_LMT_DT_FRM_TYP[] { MAC_LMT_DT_FRM_TYP.INSP_JUDG, MAC_LMT_DT_FRM_TYP.VALID_DT };
	}

	//--------------------リストロジック表示制御End-----------------------

	@Override
	public void doWrk11SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk11SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk11SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk11SetDtHdr_end_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk12SetDtHdr_st_dt_NC(MCEventInfo info) {
		super.doWrk12SetDtHdr_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doWrk12SetDtHdr_end_dt_NC(MCEventInfo info) {
		super.doWrk12SetDtHdr_end_dt_NC(info);
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

	public void chkSrchBtnMode() {
		if (isNullAnd(getWrk11SetDtHdrR().st_dt(), getWrk11SetDtHdrR().end_dt())) {
			Wrk11SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk11SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk12SetDtHdrR().st_dt(), getWrk12SetDtHdrR().end_dt())) {
			Wrk12SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk12SetDtHdr_set_dt);
		}
		if (isNullAnd(getWrk2SetDtHdrR().st_dt(), getWrk2SetDtHdrR().end_dt())) {
			Wrk2SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		} else {
			setDefaultMode(Wrk2SetDtHdr_set_dt);
		}
	}

	@Override
	public boolean doWrk11Dtl_VC(MCEventInfo info) {
		if (!checkReqWrk12Dtl()) return false;
		return super.doWrk11Dtl_VC(info);
	}
	protected boolean checkReqWrk12Dtl() {
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<Wrk12DtlR> l = getWrk12DtlL().subList(getCheckColumn(), true);
		if (!l.isEmpty()) {
			MCMessageList msgList = checkReq(Wrk11DtlTable.getSelectedMCRow());
			if (msgList.size() > 0) {
				message(msgList);
				return false;
			}
		}
		// Wrk12DtlL が切り替わる前に必須チェックを行う
		MCMessageList msgList = checkReq(Wrk12DtlTable, l);
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}
		// Wrk12DtlL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, Wrk12DtlTable, Wrk12DtlR.$insp_seq, Wrk12DtlR.$st_dt);
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}
		return true;
	}

	@Override
	public void doWrk11Dtl_NC(MCEventInfo info) {
		super.doWrk11Dtl_NC(info);
		
		if (info.getEventIndex() < 0) return;
		Wrk11DtlR row = getWrk11DtlL().get(info.getEventIndex());
		setDelBtnMode(Wrk11DtlTable, Wrk11DtlBtn_rdel);

		setWrk12List(row);
		setWrk12TabMode(row);
		setDelBtnMode(Wrk12DtlTable, Wrk12DtlBtn_rdel);
	}
	protected void setWrk12List(Wrk11DtlR row) {
		if (row == null || !MAC_INSP_MTD_TYP.isSPEC(row.getString(Wrk11DtlR.$insp_mtd_typ))) {
			getWrk12DtlL().clear();
			return;
		}
		MCIndexKey idxkey = getWrk12DtlAllL().createIndex(Wrk12DtlR.$itm_cd, Wrk12DtlR.$itm_sub1, Wrk12DtlR.$itm_sub2, Wrk12DtlR.$itm_sub3, Wrk12DtlR.$insp_ptn_cd);
		MCList<Wrk12DtlR> l = getWrk12DtlAllL().subList(idxkey, row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.insp_ptn_cd());
		l = l.subList(x -> !isNull(x.st_dt()) && !isNull(x.end_dt()) && x.st_dt().lte(row.end_dt()) && x.end_dt().gte(row.st_dt()));
		getWrk12DtlL().setAll(l);
		sort(Wrk12DtlTable);
		Wrk12DtlTable.adjustWidth();
		Wrk12DtlTable.fillSpace();
		Wrk12DtlTable.selectRowNoFocus(0);
	}
	protected void setWrk12TabMode(Wrk11DtlR row) {
		if (!isUpdSts()
				|| row == null
				|| !MAC_INSP_MTD_TYP.isSPEC(row.getString(Wrk11DtlR.$insp_mtd_typ))) {
			for (MCTabOrderBeans c : Wrk12TabTab.getTabOrderBeans()) {
				if (c instanceof MCModeBeans) {
					((MCModeBeans) c).setMode(MCMode.READ_ONLY);
				}
			}
		}
		else {
			for (MCTabOrderBeans c : Wrk12TabTab.getTabOrderBeans()) {
				if (c instanceof MCTable2) {
					((MCModeBeans) c).setMode(MCMode.ENABLE);
				}
				else if (c instanceof MCModeBeans) {
					setDefaultMode((MCModeBeans) c);
				}
			}
		}
		chkSrchBtnMode();
	}
	@Override
	public void doWrk12Dtl_NC(MCEventInfo info) {
		super.doWrk12Dtl_NC(info);
		setDelBtnMode(Wrk12DtlTable, Wrk12DtlBtn_rdel);
	}
	@Override
	public void doWrk2Dtl_NC(MCEventInfo info) {
		super.doWrk2Dtl_NC(info);
		setDelBtnMode(Wrk2DtlTable, Wrk2DtlBtn_rdel);
	}
	@Override
	public void doWrk3Dtl_NC(MCEventInfo info) {
		super.doWrk3Dtl_NC(info);
		setDelBtnMode(Wrk3DtlTable, Wrk3DtlBtn_rdel);
	}
	protected void setDelBtnMode(MCTable table, MCButton btn) {
		MCRow r = table.getSelectedMCRow();
		if (getStatus().equals(getUPDStatus())) {
			if (r == null || !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
				btn.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(btn);
			}
		}
	}

	// セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Wrk11DtlTable.setCellConfig(createAppCellConfig());
		Wrk12DtlTable.setCellConfig(createAppCellConfig());
		Wrk2DtlTable.setCellConfig(createAppCellConfig());
		Wrk3DtlTable.setCellConfig(createAppCellConfig());
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

				if (table.getBaseTable() == Wrk11DtlTable) {
					Wrk11DtlR r = Wrk11DtlTable.getRow(index);
					if (column == columnWrk11Dtl_spl_qty) {
						if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk11Dtl_std_req_flg) {
						if (!MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk11Dtl_std_cnf_req_flg) {
						if (!r.std_req_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk12DtlTable) {
					Wrk12DtlR r = Wrk12DtlTable.getRow(index);
					if (column == columnWrk12Dtl_ql_std_val) {
						if (!MAC_INSP_QLQN_TYP.isQLTV(r.insp_qlqn_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_unit_cd
						  || column == columnWrk12Dtl_qn_int_digit
						  || column == columnWrk12Dtl_qn_int_frac) {
						if (!MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_qn_out_min) {
						if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
							if (isEqOrNe(r.sign_out_max_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_sign_out_min_typ) {
						if (isNull(r.qn_out_min())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_sign_out_max_typ) {
						if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
							if (isEqOrNe(r.sign_out_min_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_qn_out_max) {
						if (isNull(r.sign_out_max_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_qn_in_min) {
						if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
							if (isEqOrNe(r.sign_in_max_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_sign_in_min_typ) {
						if (isNull(r.qn_in_min())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_sign_in_max_typ) {
						if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
							if (isEqOrNe(r.sign_in_min_typ())) {
								return MCMode.READ_ONLY;
							}
						}
						else {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk12Dtl_qn_in_max) {
						if (isNull(r.sign_in_max_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk2DtlTable) {
					Wrk2DtlR r = Wrk2DtlTable.getRow(index);
					if (column == columnWrk2Dtl_mfg_loc_cd) {
						if (!isNullOrNullVal(r.sppl_cd()) || !isNullOrNullVal(r.from_site_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_sppl_cd) {
						if (!isNullOrNullVal(r.mfg_loc_cd()) || !isNullOrNullVal(r.from_site_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_from_site_cd) {
						if (!isNullOrNullVal(r.mfg_loc_cd()) || !isNullOrNullVal(r.sppl_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_maker_cd) {
						if (isNullOrNullVal(r.sppl_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_to_site_cd) {
						if (!isNullOrNullVal(r.mfg_loc_cd()) || !isNullOrNullVal(r.sppl_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_insp_ptn_cd 
						  || column == columnWrk2Dtl_pre_insp_valid_flg) {
						if (r.no_insp_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_lmt_dt_frm_typ) {
						if (getHdrR().lmt_ctl_flg()) {
							return MCMode.REQUIRED;
						}
					}
					else if (column == columnWrk2Dtl_vld_pd 
						  || column == columnWrk2Dtl_lmt_pd
						  || column == columnWrk2Dtl_lot_insp_vld_pd
						  || column == columnWrk2Dtl_calc_pd_typ
						  || column == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ) {
						if (!getHdrR().lmt_ctl_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk3DtlTable) {
					Wrk3DtlR r = Wrk3DtlTable.getRow(index);
					// 工場出荷承認対象ＦＬＧ,検査承認対象ＦＬＧ,製造承認対象ＦＬＧ
					if (column == columnWrk3Dtl_plnt_aprv_flg 
					 || column == columnWrk3Dtl_insp_aprv_flg
					 || column == columnWrk3Dtl_mfg_aprv_flg) {
						if (!MAC_LOT_MNG_TYP.isUNIQ(getHdrR().lot_mng_typ())
								&& !MAC_SUBLOT_MNG_TYP.isUNIQ(getHdrR().sublot_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					// 工場出荷承認役割ＣＤ
					else if (column == columnWrk3Dtl_plnt_aprv_role_cd) {
						if (!r.plnt_aprv_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					// 検査承認役割ＣＤ
					else if (column == columnWrk3Dtl_insp_aprv_role_cd) {
						if (!r.insp_aprv_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					// 製造承認役割ＣＤ
					else if (column == columnWrk3Dtl_mfg_aprv_role_cd) {
						if (!r.mfg_aprv_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					// 移送入荷時ロットＮＯ振替ＦＬＧ
					else if (column == columnWrk3Dtl_xfr_lot_flg) {
						if (MAC_LOT_MNG_TYP.isNOT_MNG(getHdrR().lot_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		@Override
		public int getPriorLength(int index, MCColumnConfig column, MCTable table) {
			if (table.getBaseTable() == Wrk12DtlTable) {
				Wrk12DtlR r = Wrk12DtlTable.getRow(index);
				if (isQnQtyColumns(column)) {
					MCNumber digit = r.qn_int_digit();
					MCNumber frac = r.qn_int_frac();
					if (!isNullOr(digit, frac)) {
						return frac.intValue() + digit.intValue();
					}
				}
			}
			return super.getPriorLength(index, column, table);
		}

		@Override
		public int getPriorScale(int index, MCColumnConfig column, MCTable table) {
			if (table.getBaseTable() == Wrk12DtlTable) {
				Wrk12DtlR r = Wrk12DtlTable.getRow(index);
				if (isQnQtyColumns(column)) {
					MCNumber frac = r.qn_int_frac();
					if (frac != null) {
						return frac.intValue();
					}
				}
			}
			return super.getPriorScale(index, column, table);
		}
	}

	/**フォーマット制御するカラムコンフィグ*/
	MCColumnConfig[] _qnQtyColumns = null;
	protected MCColumnConfig[] getQnQtyColumns() {
		if (_qnQtyColumns == null) {
			_qnQtyColumns = new MCColumnConfig[]{
					columnWrk12Dtl_qn_out_max,
					columnWrk12Dtl_qn_out_min,
					columnWrk12Dtl_qn_in_max,
					columnWrk12Dtl_qn_in_min};
		}
		return _qnQtyColumns;
	}

	protected boolean isQnQtyColumns(MCColumnConfig column) {
		return MCCollectionUtil.contains(column, getQnQtyColumns());
	}

	@Override
	public void doWrk11Dtl_insp_ptn_cd_LC(MCEventInfo info) {
		super.doWrk11Dtl_insp_ptn_cd_LC(info);

		Wrk11DtlR r = getWrk11DtlL().get(info.getEventIndex());
		setWrk12List(r);
		setWrk12TabMode(r);
	}
	@Override
	public void doWrk11Dtl_insp_mtd_typ_LC(MCEventInfo info) {
		super.doWrk11Dtl_insp_mtd_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk11DtlR r = getWrk11DtlL().get(idx);

		if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
			setValueEx(columnWrk11Dtl_spl_qty, idx, MCNumber.ZERO);
		}
		else {
			setValueEx(columnWrk11Dtl_spl_qty, idx, null);
		}
		if (!MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
			setValueEx(columnWrk11Dtl_std_req_flg, idx, false);
		}

		setWrk12List(r);
		setWrk12TabMode(r);
	}
	@Override
	public void doWrk11Dtl_std_req_flg_NC(MCEventInfo info) {
		super.doWrk11Dtl_std_req_flg_NC(info);	

		int idx = info.getEventIndex();
		Wrk11DtlR r = getWrk11DtlL().get(idx);

		if (!r.std_req_flg()) {
			setValueEx(columnWrk11Dtl_std_cnf_req_flg, idx, false);
		}
	}
	
	@Override
	public void doWrk12Dtl_insp_qlqn_typ_LC(MCEventInfo info) {
		super.doWrk12Dtl_insp_qlqn_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk12DtlR r = getWrk12DtlL().get(idx);

		if (!MAC_INSP_QLQN_TYP.isQLTV(r.insp_qlqn_typ())) {
			setValueEx(columnWrk12Dtl_ql_std_val, idx, null);
		}
		if (!MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
			setValueEx(columnWrk12Dtl_unit_cd, idx, null);
			setValueEx(columnWrk12Dtl_qn_int_digit, idx, null);
			setValueEx(columnWrk12Dtl_qn_int_frac, idx, null);
			setValueEx(columnWrk12Dtl_qn_out_min, idx, null);
			setValueEx(columnWrk12Dtl_sign_out_max_typ, idx, null);
			setValueEx(columnWrk12Dtl_qn_in_min, idx, null);
			setValueEx(columnWrk12Dtl_sign_in_max_typ, idx, null);
		}
	}
	public void doWrk12Dtl_qn_out_min_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		Wrk12DtlR r = getWrk12DtlL().get(idx);

		if (isNull(r.qn_out_min())) {
			setValueEx(columnWrk12Dtl_sign_out_min_typ, idx, null);
		}
	}
	@Override
	public void doWrk12Dtl_sign_out_min_typ_LC(MCEventInfo info) {
		super.doWrk12Dtl_sign_out_min_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk12DtlR r = getWrk12DtlL().get(idx);
		
		if (isEqOrNe(r.sign_out_min_typ())) {
			setValueEx(columnWrk12Dtl_sign_out_max_typ, idx, null);
		}
	}
	@Override
	public void doWrk12Dtl_sign_out_max_typ_LC(MCEventInfo info) {
		super.doWrk12Dtl_sign_out_max_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk12DtlR r = getWrk12DtlL().get(idx);
		
		if (isEqOrNe(r.sign_out_max_typ())) {
			setValueEx(columnWrk12Dtl_qn_out_min, idx, null);
		}
		if (isNull(r.sign_out_max_typ())) {
			setValueEx(columnWrk12Dtl_qn_out_max, idx, null);
		}
	}
	public void doWrk12Dtl_qn_in_min_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		Wrk12DtlR r = getWrk12DtlL().get(idx);

		if (isNull(r.qn_in_min())) {
			setValueEx(columnWrk12Dtl_sign_in_min_typ, idx, null);
		}
	}
	@Override
	public void doWrk12Dtl_sign_in_min_typ_LC(MCEventInfo info) {
		super.doWrk12Dtl_sign_in_min_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk12DtlR r = getWrk12DtlL().get(idx);

		if (isEqOrNe(r.sign_in_min_typ())) {
			setValueEx(columnWrk12Dtl_sign_in_max_typ, idx, null);
		}
	}
	@Override
	public void doWrk12Dtl_sign_in_max_typ_LC(MCEventInfo info) {
		super.doWrk12Dtl_sign_in_max_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk12DtlR r = getWrk12DtlL().get(idx);

		if (isEqOrNe(r.sign_in_max_typ())) {
			setValueEx(columnWrk12Dtl_qn_in_min, idx, null);
		}
		if (isNull(r.sign_in_max_typ())) {
			setValueEx(columnWrk12Dtl_qn_in_max, idx, null);
		}
	}

	@Override
	public boolean doWrk12Dtl_qn_int_digit_VC(MCEventInfo info) {
		MCNumber digit = (MCNumber)info.getNewValue();
		if (!checkDigit(digit)) {
			return false;	
		}
		return super.doWrk12Dtl_qn_int_frac_VC(info);
	}

	@Override
	public boolean doWrk12Dtl_qn_int_frac_VC(MCEventInfo info) {

		MCNumber frac = (MCNumber)info.getNewValue();
		if (!checkFrac(frac)) {
			return false;
		}
		return super.doWrk12Dtl_qn_int_frac_VC(info);
	}

	protected boolean isEqOrNe(String typ) {
		return (MAC_SIGN_TYP.isEQ(typ) || MAC_SIGN_TYP.isNE(typ));
	}

	protected boolean checkDigit(MCNumber digit) {
		if (isNull(digit)) {
			return true;
		}
		return MCNumber.ONE.lte(digit) && digit.lte(13);
	}

	protected boolean checkFrac(MCNumber frac) {
		if (isNull(frac)) {
			return true;
		}
		return MCNumber.ZERO.lte(frac) && frac.lte(8);
	}

	@Override
	public void doWrk2Dtl_mfg_loc_cd_LC(MCEventInfo info){
		super.doWrk2Dtl_mfg_loc_cd_LC(info);	

		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);

		if (!isNullOrNullVal(r.mfg_loc_cd())) {
			setValueEx(columnWrk2Dtl_to_site_cd, idx, null);
		}
	}
	@Override
	public void doWrk2Dtl_sppl_cd_LC(MCEventInfo info){
		super.doWrk2Dtl_sppl_cd_LC(info);	

		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);

		if (isNullOrNullVal(r.sppl_cd())) {
			setValueEx(columnWrk2Dtl_maker_cd, idx, null);
		}
		else {
			setValueEx(columnWrk2Dtl_to_site_cd, idx, null);
		}
	}
	@Override
	public void doWrk2Dtl_no_insp_flg_NC(MCEventInfo info){
		super.doWrk2Dtl_no_insp_flg_NC(info);

		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);

		if (r.no_insp_flg()) {
			setValueEx(columnWrk2Dtl_insp_ptn_cd, idx, null);
			setValueEx(columnWrk2Dtl_pre_insp_valid_flg, idx, false);
		}
		setValueEx(columnWrk2Dtl_lmt_dt_frm_typ, idx, null);
	}

	@Override
	public void doWrk3Dtl_site_cd_LC(MCEventInfo info) {
		super.doWrk3Dtl_site_cd_LC(info);

		int idx = info.getEventIndex();

		// デフォルト値設定
		if (isEditable(columnWrk3Dtl_insp_aprv_flg, idx)) {
			setValueEx(columnWrk3Dtl_insp_aprv_flg, idx, getHdrR().def_insp_aprv_flg()) ;
		}
		if (isEditable(columnWrk3Dtl_insp_aprv_role_cd, idx)) {
			setValueEx(columnWrk3Dtl_insp_aprv_role_cd, idx, getHdrR().def_insp_aprv_role_cd()) ;
		}
	}

	@Override
	public void doWrk3Dtl_insp_aprv_flg_NC(MCEventInfo info) {
		super.doWrk3Dtl_insp_aprv_flg_NC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (!r.insp_aprv_flg()) {
			setValueEx(columnWrk3Dtl_insp_aprv_role_cd, idx, null);
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
		getWrk11DtlL().clear();
		getWrk12DtlL().clear();
		getWrk2DtlL().clear();
		getWrk3DtlL().clear();
		getWrk11SetDtHdrR().clear();
		getWrk12SetDtHdrR().clear();
		getWrk2SetDtHdrR().clear();
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Wrk11Dtl_qty_p_PPanel.setRelateBeans(Hdr_unit_cd, Hdr_dec_place);

		Wrk12Dtl_qn_out_max_p_PPanel.setRelateBeans(columnWrk12Dtl_unit_cd, columnWrk12Dtl_qn_int_frac);
		Wrk12Dtl_qn_out_min_p_PPanel.setRelateBeans(columnWrk12Dtl_unit_cd, columnWrk12Dtl_qn_int_frac);
		Wrk12Dtl_qn_in_max_p_PPanel.setRelateBeans(columnWrk12Dtl_unit_cd, columnWrk12Dtl_qn_int_frac);
		Wrk12Dtl_qn_in_min_p_PPanel.setRelateBeans(columnWrk12Dtl_unit_cd, columnWrk12Dtl_qn_int_frac);
	}
	protected void setTabMode() {
		if (MAC_ASSET_MNG_TYP.isMNG(getHdrR().asset_mng_typ())) {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk3Panel), true);
		} else {
			DtlTabTab.setEnabledAt(DtlTabTab.indexOfComponent(Wrk3Panel), false);
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
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == Wrk11DtlTable) {
			// 行コピーで上一覧の選択行が変更される前に、下一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, Wrk12DtlTable, Wrk12DtlR.$insp_seq, Wrk12DtlR.$st_dt);
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}

		E r = super.copyRow(t);

		if (r != null) {
			int i = t.getList().indexOf(r);
			if (i >= 0) {
				t.selectRow(t.getList().indexOf(r));
			}
		}
		
		return r;
	}
	
	/**
	 * 行コピー時にカウントアップしたDtl行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		if (dest != null && getWrk12DtlL().contains(dest)) {
			Wrk12DtlR r = (Wrk12DtlR) dest;
			if(isNull(r.insp_ptn_cd()) || r.isStatusCreate()) {
				Wrk11DtlR r11 = Wrk11DtlTable.getSelectedMCRow();
				if (r11 != null) {
					r.itm_cd(r11.itm_cd());
					r.itm_sub1(r11.itm_sub1());
					r.itm_sub2(r11.itm_sub2());
					r.itm_sub3(r11.itm_sub3());
					r.insp_ptn_cd(r11.insp_ptn_cd());
					if (!getWrk12DtlAllL().contains(r)) {
						getWrk12DtlAllL().add(r);
					}
				}
			}
			Wrk12DtlBtn_rdel.setMode(this, getStatus());
		}
		return dest;
	}

}