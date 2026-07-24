package mcframe.clientMABC.MABCP0570;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.commonCore.util.MCCollectionUtil;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_SpplReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_SpplReg_MC extends MABCP_SpplReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SpplReg_MC() {
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
	public MABCP_SpplReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0570_Upd01();
	}
	/**
	 * Panel[Wrk4SetDtHdr]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doWrk4SetDtHdr_set_dt(MCEventInfo info) {
		chkSetDtVal(Wrk4SetDtHdr_st_dt, Wrk4SetDtHdr_end_dt, Wrk4DtlTable, columnWrk4Dtl_st_dt, columnWrk4Dtl_end_dt);
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
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0570_Srch01();
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
	 * Panel[Btn]のボタン[open_MABCP0510]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0510(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0510");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0510CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABCP0510]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP0510.CndR crtOpenMABCP0510CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0510.CndR to = mcframe.clientMABC.MABCP0510.CndR.create();
		mcframe.clientMABC.MABCP0510.MABCP_BpReg p = (mcframe.clientMABC.MABCP0510.MABCP_BpReg) aso.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.bp_cd(getHdrR().bp_cd());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0570_Upd01();
	}
	/**
	 * [MA_MABCL0570_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0570_Srch01Caller<P extends MABCP_SpplReg, B extends MA_MABCL0570_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0570_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getHdrR(), getWrk1HdrR(), getWrk1HdrAllL());
		}

		@Override
		protected void show() {
			super.show();

			copy(getWrk1HdrR(), getWrk1HdrAllL().get(0), createMap_Wrk1HdrR_Wrk1HdrAllR());
			setValueEx(Hdr_bp_cd, getWrk1HdrR().bp_cd());
			setValueEx(Hdr_asppl_flg, getWrk1HdrR().asppl_flg());

			// 検索結果を保持しておく
			// 「check_**_dpt_cd」項目：更新前に画面の値と比較して変更されていたら変更値、それ以外はnullを設定
			getWrk1HdrR().check_vmi_purc_dpt_cd(getWrk1HdrR().vmi_purc_dpt_cd());
			getWrk1HdrR().check_ap_dpt_cd(getWrk1HdrR().ap_dpt_cd());
		}

		@Override
		protected void moveFocus() {
			Wrk2DtlTable.selectRowNoFocus(0);
			Wrk3DtlTable.selectRowNoFocus(0);
			Wrk4DtlTable.selectRowNoFocus(0);
			Wrk5DtlTable.selectRowNoFocus(0);
			Wrk6DtlTable.selectRowNoFocus(0);
			Wrk7DtlTable.selectRowNoFocus(0);

			DtlTabTab.focusActiveFirstComponent();
		}
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()) {
				chkSrchBtnMode();
			}

			setSubconFlgMode(getWrk1HdrR());
			setOutsrcUpriTypMode(getWrk1HdrR());
			setRcptIvDupFlgMode(getWrk1HdrR());
			setPurcBasisTypMode(getWrk1HdrR());
			setProvBasisTypMode(getWrk1HdrR());
			setProvMode(getWrk1HdrR());
			setWrkApFlgMode(getWrk1HdrR());
			setAspplMode(getWrk1HdrR());
			setDlvSlipMode(getWrk1HdrR());

			Ctrl_ctrl_PPanel.expand(false);
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}
		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
	}

	/**
	 * [MA_MABCL0570_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0570_Upd01Caller<P extends MABCP_SpplReg, B extends MA_MABCL0570_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0570_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			// エラーメッセージから「行番号」を消すため
			if (!bridge.up0().isEmpty()) {
				bridge.up0().get(0).setGUIIndex(-1);
			}
		}

		@Override
		protected boolean execConfirm() {
			//共通処理
			if(super.execConfirm()){
				setDtlBlock();
				return true;
			}
			return false;	
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getWrk1HdrR()));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
		}
		
		/**更新状況に応じたWrk1HdrからWrk1HdrAll へのデータコピーを行います。*/
		protected void setDtlBlock(){
			Wrk1HdrR br = getWrk1HdrR().clone();
			if (isStatusNone(br)) {
				return;
			}

			// 部門が変更されたときのみ、「check_**_dpt_cd」に設定して、サーバ側で存在チェック
			setCheckDpt(br, Wrk1HdrAllR.$vmi_purc_dpt_cd, Wrk1HdrAllR.$check_vmi_purc_dpt_cd);
			setCheckDpt(br, Wrk1HdrAllR.$ap_dpt_cd, Wrk1HdrAllR.$check_ap_dpt_cd);

			MCList<Wrk1HdrAllR> d = getWrk1HdrAllL();
			Wrk1HdrAllR dr = d.createRow();
			MCRow.copyall(dr, d.get(0));
			copy(dr, br, createMap_Wrk1HdrAllR_Wrk1HdrR());
			d.clear();
			d.add(dr);
			if (!isNull(dr.bp_cd())) {
				dr.setStatus(Status.MODIFY);
			} else {
				dr.bp_cd(getHdrR().bp_cd());
				dr.setStatus(Status.CREATE);
			}
		}

		/**
		 * 検索時の値と比較して変更されていた場合のみ「check_**_dpt_cd」に値を設定します。
		 */
		protected void setCheckDpt(MCRow r, String dptCd, String checkDptCd) {
			if(isSame(r.getString(dptCd), r.getString(checkDptCd))) {
				r.setString(checkDptCd, null);
			}
			else {
				r.setString(checkDptCd, r.getString(dptCd));
			}
		}

		@Override
		public MCMessage msgNoDataChange() {
			return new MCMessage(FXBAP0011);
		}
	}


	@Override
	protected void setupParts() {
		super.setupParts();

		Wrk2Dtl_purc_lt_add_qty_p_PPanel.setRelateBeans(columnWrk2Dtl_unit_cd, columnWrk2Dtl_dec_place);
		Wrk2Dtl_min_lot_qty_p_PPanel.setRelateBeans(columnWrk2Dtl_unit_cd, columnWrk2Dtl_dec_place);
		Wrk2Dtl_batch_lot_qty_p_PPanel.setRelateBeans(columnWrk2Dtl_unit_cd, columnWrk2Dtl_dec_place);
		Wrk2Dtl_max_lot_qty_p_PPanel.setRelateBeans(columnWrk2Dtl_unit_cd, columnWrk2Dtl_dec_place);
		Wrk2Dtl_sno_p_PPanel.setRelateBeans(columnWrk2Dtl_itm_cd, columnWrk2Dtl_itm_sub1, columnWrk2Dtl_itm_sub2,
				columnWrk2Dtl_itm_sub3, columnWrk2Dtl_sno1_mng_typ, columnWrk2Dtl_sno2_mng_typ,
				columnWrk2Dtl_sno3_mng_typ, columnWrk2Dtl_sno4_mng_typ);

		Wrk4Dtl_qty_p_PPanel.setRelateBeans(columnWrk4Dtl_unit_cd, columnWrk4Dtl_dec_place);
	}

	@Override
	public MCList<? extends MCConstRow> getDtlL() {
		// メインとなるテーブルが存在しないので、ダミー設定
		return getWrk2DtlL();
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		for (MCTable<?> tbl : getDtlTables()) {
			setListListener(tbl, createRLRowListener());
			// 部品を想定
			for (MCColumnConfig c : tbl.getColumnConfigs()) {
				for (String str : getDtlRKeyColumns(tbl.getList())) {
					if (c.getRowColumnName().equals(str)) {
						c.addVCListener(this);
					}
				}
			}
		}
		Wrk3Dtl_itm_p_PPanel.addItmLCListner(this);
	}

	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Wrk3Dtl_itm_p_PPanel.isItm(lc)) {
			doWrk3Dtl_itm_cd_LC(info);
		}
	}

	@Override
	public void fillSpace() {
		Wrk2DtlTable.fillSpace();
		Wrk3DtlTable.fillSpace();
		Wrk4DtlTable.fillSpace();
		Wrk5DtlTable.fillSpace();
		Wrk6DtlTable.fillSpace();
		Wrk7DtlTable.fillSpace();
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
	
	//------------------ テーブル関連 Start ------------------//
	
	protected MCRowListener createRLRowListener() {
		return new RLRowListener();
	}
	
	protected class RLRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {
			dtlRowValueChanged(event);
		}
	}

	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	protected void dtlRowValueChanged(MCRowEvent event) {
		// 「選択」項目以外に変更があった場合に「選択」項目をオンにする
		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
		}
		
		MCConstRow r = event.getSourceRow();
		if (r != null) {
			// 新規登録の場合、key項目発注先ＣＤ、取引先が登録枠に設定された値から設定する
			if (r.contains("sppl_cd")) {
				if (isNull(r.getStringNE("sppl_cd"))) {
					r.setStringNE("sppl_cd", getHdrR().bp_cd());
				}
			}
			if (r.contains("bp_cd")) {
				if (isNull(r.getStringNE("bp_cd"))) {
					r.setStringNE("bp_cd", getHdrR().bp_cd());
				}
			}
		}
	}

	/**
	 * イベント発生項目が「選択」項目のときtrueを返す
	 */
	protected boolean isCheckColumn(MCRowEvent event) {
		return event.getColumn().equals(getCheckColumn());
	}

	/**
	 * イベント行の「選択」項目に値（boo）をセットする
	 */
	protected void setCheckValue(MCRowEvent event, boolean boo) {
		MCConstRow r = event.getSourceRow();
		if (r != null) {
			r.setBoolean(getCheckColumn(), boo);
		}
	}
	
	//------------------ テーブル関連 End ------------------//
	//------------------ 汎用メソッド Start ------------------//
	/**
	 * 画面内のテーブルを返す
	 * @return
	 */
	protected MCTable<?>[] getDtlTables() {
		return new MCTable<?>[] {Wrk2DtlTable, Wrk3DtlTable, Wrk4DtlTable, Wrk5DtlTable, Wrk6DtlTable, Wrk7DtlTable};
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
	//------------------ 適応日反映関連イベント Start ------------------//
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
		if (!isNull(getWrk4SetDtHdrR().st_dt())
				|| !isNull(getWrk4SetDtHdrR().end_dt())) {
			Wrk4SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk4SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk5SetDtHdrR().st_dt())
				|| !isNull(getWrk5SetDtHdrR().end_dt())) {
			Wrk5SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk5SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk6SetDtHdrR().st_dt())
				|| !isNull(getWrk6SetDtHdrR().end_dt())) {
			Wrk6SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk6SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
		if (!isNull(getWrk7SetDtHdrR().st_dt())
				|| !isNull(getWrk7SetDtHdrR().end_dt())) {
			Wrk7SetDtHdr_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			Wrk7SetDtHdr_set_dt.setMode(MCMode.DISABLE);
		}
	}
	//------------------ 適応日反映関連イベント End ------------------//
	//------------------ セルコンフィグ Start ------------------//
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Wrk2DtlTable.setCellConfig(createAppCellConfig());
		Wrk3DtlTable.setCellConfig(createAppCellConfig());
		Wrk4DtlTable.setCellConfig(createAppCellConfig());
		Wrk5DtlTable.setCellConfig(createAppCellConfig());
		Wrk6DtlTable.setCellConfig(createAppCellConfig());
		Wrk7DtlTable.setCellConfig(createAppCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return アプリ用のセルコンフィグ
	 */
	protected AppCellConfig createAppCellConfig() {
		return new AppCellConfig(this);
	}

	/**
	 * アプリ用のセルコンフィグクラス
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

				if (table.getBaseTable() == Wrk2DtlTable) {
					Wrk2DtlR r = Wrk2DtlTable.getRow(index);

					if (column == columnWrk2Dtl_purc_id_typ) {
						if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())){
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_accpt_insp_lt) {
						if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
								|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
							return MCMode.READ_ONLY;
						}
						else if(MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk2Dtl_sz_day_week_typ) {
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
					//手配ＮＯ管理区分が「２：管理する（必須）」の場合のみ部品と動きを変える（必須ー＞入力可）
					else if (column == columnWrk2Dtl_sno1){
						if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk2Dtl_sno2){
						if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk2Dtl_sno3){
						if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())){
							return MCMode.ENABLE;
						}
					}
					else if (column == columnWrk2Dtl_sno4){
						if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())){
							return MCMode.ENABLE;
						}
					}
				}
				else if (table.getBaseTable() == Wrk3DtlTable) {
					Wrk3DtlR r = Wrk3DtlTable.getRow(index);
					if (column == columnWrk3Dtl_insp_ptn_cd
							|| column == columnWrk3Dtl_pre_insp_valid_flg) {
						if (r.no_insp_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnWrk3Dtl_lmt_dt_frm_typ) {
						if (r.lmt_ctl_flg()) {
							return MCMode.REQUIRED;
						}
					}
					else if (column == columnWrk3Dtl_vld_pd
							|| column == columnWrk3Dtl_lmt_pd
							|| column == columnWrk3Dtl_lot_insp_vld_pd
							|| column == columnWrk3Dtl_calc_pd_typ
							|| column == columnWrk3Dtl_lot_insp_lmt_dt_frm_typ) {
						if (!r.lmt_ctl_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk5DtlTable) {
					Wrk5DtlR r = Wrk5DtlTable.getRow(index);
					if (column == columnWrk5Dtl_ext_sys_cd) {
						if (!MAC_IF_PROC_TYP.is_send(r.if_proc_typ())) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk5Dtl_not_onr_prov_flg) {
						if (!MAC_IF_PROC_TYP.isBILL_SEND(r.if_proc_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk6DtlTable) {
					Wrk6DtlR r = Wrk6DtlTable.getRow(index);

					if (column == columnWrk6Dtl_pf_grp_cd) {
						if (!getHdrR().sppl_flg() || isNull(r.itm_cd()) || r.sundry_itm_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnWrk6Dtl_pf_fix_flg || column == columnWrk6Dtl_purc_commit_flg) {
						if (isNull(r.pf_grp_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (table.getBaseTable() == Wrk7DtlTable) {
					Wrk7DtlR r = (Wrk7DtlR) table.getBaseTable().getRow(index);
					
					// 購買部門が入力された場合、購買担当者ＣＤは入力不可
					if (column == columnWrk7Dtl_purc_usr_cd) {
						if (!isNull(r.purc_dpt_cd()) && isNull(r.purc_usr_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					// 購買担当者ＣＤが入力された場合、購買部門ＣＤは入力不可
					else if (column == columnWrk7Dtl_purc_dpt_cd) {
						if (!isNull(r.purc_usr_cd()) && isNull(r.purc_dpt_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					// 外注部門が入力された場合、外注担当者ＣＤは入力不可
					else if (column == columnWrk7Dtl_outsrc_usr_cd) {
						if (!isNull(r.outsrc_dpt_cd()) && isNull(r.outsrc_usr_cd())) {
							return MCMode.READ_ONLY;
						}
					}
					// 外注担当者ＣＤが入力された場合、外注部門ＣＤは入力不可
					else if (column == columnWrk7Dtl_outsrc_dpt_cd) {
						if (!isNull(r.outsrc_usr_cd()) && isNull(r.outsrc_dpt_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public void doWrk2Dtl_stk_mng_typ_LC(MCEventInfo info) {
		super.doWrk2Dtl_stk_mng_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);

		if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())){
			setValueEx(columnWrk2Dtl_purc_id_typ, idx, MAC_PURC_ID_TYP.PURC.value());
		}
		if (isNull(r.order_ratio())){
			setValueEx(columnWrk2Dtl_order_ratio, idx, MCNumber.ONE);
		}
	}
	@Override
	public void doWrk2Dtl_purc_id_typ_LC(MCEventInfo info) {
		super.doWrk2Dtl_purc_id_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);

		if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
				|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
			setValueEx(columnWrk2Dtl_accpt_insp_lt, idx, null);
		}
	}
	@Override
	public void doWrk2Dtl_purc_basis_typ_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doWrk2Dtl_purc_basis_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);
		
		if(MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
			setValueEx(columnWrk2Dtl_accpt_insp_lt, idx, null);
		}
	}
	@Override
	public void doWrk2Dtl_lot_sz_pd_LC(MCEventInfo info) {
		super.doWrk2Dtl_lot_sz_pd_LC(info);

		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);

		if (!isNull(r.lot_sz_pd())) {
			setValueEx(columnWrk2Dtl_sz_day_week_typ, r.getGUIIndex(), null);
		}
	}
	@Override
	public void doWrk2Dtl_sz_day_week_typ_LC(MCEventInfo info) {
		super.doWrk2Dtl_sz_day_week_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk2DtlR r = getWrk2DtlL().get(idx);

		if (!isNull(r.sz_day_week_typ())) {
			setValueEx(columnWrk2Dtl_lot_sz_pd, idx, null);
		}
		else {
			setValueEx(columnWrk2Dtl_sz_week, idx, null);
		}
	}

	@Override
	public void doWrk6Dtl_sundry_itm_flg_NC(MCEventInfo info) {
		super.doWrk6Dtl_sundry_itm_flg_NC(info);

		int idx = info.getEventIndex();
		
		setValueEx(columnWrk6Dtl_pf_grp_cd, idx, null);
	}

	@Override
	public void doWrk6Dtl_pf_grp_cd_LC(MCEventInfo info) {
		super.doWrk6Dtl_pf_grp_cd_LC(info);
		
		int idx = info.getEventIndex();
		
		setValueEx(columnWrk6Dtl_pf_fix_flg, idx, false);
		setValueEx(columnWrk6Dtl_purc_commit_flg, idx, false);
	}
	//------------------ セルコンフィグ End ------------------//

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getWrk1Hdr_prov_basis_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getProvBasisTyp(info));
		return super.getWrk1Hdr_prov_basis_typ(row, info);
	}
	/**
	 * 表示する支給計上区分を取得する
	 */
	protected MAC_PROV_BASIS_TYP[] getProvBasisTyp(MCEventInfo info) {
		if (MAC_PROV_RCV_TYP.isNOT_ARR(getWrk1HdrR().prov_rcv_typ())) {
			return new MAC_PROV_BASIS_TYP[] { MAC_PROV_BASIS_TYP.GI, MAC_PROV_BASIS_TYP.INPT };
		} else {
			return new MAC_PROV_BASIS_TYP[] { MAC_PROV_BASIS_TYP.GR, MAC_PROV_BASIS_TYP.INPT };
		}
	}

	@Override	
	public MCList<?> getWrk3Dtl_lmt_dt_frm_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getLmtDtFrmTyp(info));
		return super.getWrk3Dtl_lmt_dt_frm_typ(row, info);
	}
	/**
	 * 表示する期限起算日区分を取得する
	 */
	protected MAC_LMT_DT_FRM_TYP[] getLmtDtFrmTyp(MCEventInfo info) {
		Wrk3DtlR r = getWrk3DtlL().get(info.getEventIndex());
		MAC_LMT_DT_FRM_TYP[] arrayLmtDtFrmTyp;
		// 期限管理対象フラグ＝オフ：製造着手日、製造完了日、入荷実績日、子品目起算日引継ぎのみ表示
		if (!r.lmt_ctl_flg()) {
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
	public MCList<?> getWrk3Dtl_lot_insp_lmt_dt_frm_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getLotInspLmtDtFrmTyp(info));
		return super.getWrk3Dtl_lmt_dt_frm_typ(row, info);
	}
	/**
	 * 表示する期限起算日区分（延長時）を取得する
	 */
	protected MAC_LMT_DT_FRM_TYP[] getLotInspLmtDtFrmTyp(MCEventInfo info) {
		return new MAC_LMT_DT_FRM_TYP[] {MAC_LMT_DT_FRM_TYP.INSP_JUDG, MAC_LMT_DT_FRM_TYP.VALID_DT};
	}

	@Override	
	public MCList<?> getWrk5Dtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getWrk5Dtl_if_proc_typ(row, info);
	}
	/**
	 * 表示するＩＦ処理区分を取得する
	 */
	protected MAC_IF_PROC_TYP[] getIfProcTyp(MCEventInfo info) {
		List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();
		for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
			if (ifProcTyp.is_edi()) {
				l.add(ifProcTyp);
			}
		}
		return (MAC_IF_PROC_TYP[])l.toArray(new MAC_IF_PROC_TYP[0]);
	}

	//--------------------リストロジック表示制御End-----------------------

	/**
	 * 下請対象のモード制御
	 * @param hdr
	 */
	protected void setSubconFlgMode(Wrk1HdrR hdr) {
		if (isSame(hdr.cntry_cd(), getCo().cntry_cd())) {
			setDefaultMode(Wrk1Hdr_subcon_flg);
		}
		else {
			Wrk1Hdr_subcon_flg.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 外注単価区分のモード制御
	 * @param hdr
	 */
	protected void setOutsrcUpriTypMode(Wrk1HdrR hdr) {
		if (hdr.onr_prsppl_flg()) {
			if (getStatus() == UPD && (Wrk1Hdr_onr_prsppl_flg.getMode() == MCMode.READ_ONLY)) {
				Wrk1Hdr_outsrc_upri_typ.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Wrk1Hdr_outsrc_upri_typ);
			}
		}
		else {
			Wrk1Hdr_outsrc_upri_typ.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 受領インボイス重複許可のモード制御
	 * @param hdr
	 */
	protected void setRcptIvDupFlgMode(Wrk1HdrR hdr) {
		if (!hdr.sppl_iv_flg()) {
			Wrk1Hdr_rcpt_iv_dup_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Wrk1Hdr_rcpt_iv_dup_flg);
		}
	}

	/**
	 * 仕入計上区分のモード制御
	 * @param hdr
	 */
	protected void setPurcBasisTypMode(Wrk1HdrR hdr) {
		if (hdr.subcon_flg()) {
			Wrk1Hdr_purc_basis_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Wrk1Hdr_purc_basis_typ);
		}
	}

	/**
	 * 支給計上区分のモード制御
	 * @param hdr
	 */
	protected void setProvBasisTypMode(Wrk1HdrR hdr) {
		if (hdr.onr_prsppl_flg()) {
			if (hdr.subcon_flg() && MAC_PROV_RCV_TYP.isNOT_ARR(hdr.prov_rcv_typ()) && MAC_PROV_BASIS_TYP.isINPT(hdr.prov_basis_typ())) {
				Wrk1Hdr_prov_basis_typ.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Wrk1Hdr_prov_basis_typ);
			}
		}
		else {
			Wrk1Hdr_prov_basis_typ.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setProvBasisTyp(Wrk1HdrR hdr) {
		if (hdr.onr_prsppl_flg() && hdr.subcon_flg()) {
			if (MAC_PROV_RCV_TYP.isNOT_ARR(hdr.prov_rcv_typ())) {
				setValueEx(Wrk1Hdr_prov_basis_typ, MAC_PROV_BASIS_TYP.INPT.value());
			}
			else {
				setValueEx(Wrk1Hdr_prov_basis_typ, null);
			}
		}
		else {
			setValueEx(Wrk1Hdr_prov_basis_typ, null);
		}	
	}
	
	/**
	 * 支給関連項目のモード制御
	 * @param hdr
	 */
	protected void setProvMode(Wrk1HdrR hdr) {
		if (hdr.onr_prsppl_flg()) {
			if(getStatus() == UPD) {
				Wrk1Hdr_repurc_obli_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Wrk1Hdr_repurc_obli_flg);
			}
			if(hdr.repurc_obli_flg()) {
				Wrk1Hdr_prov_tax_cd.setMode(MCMode.REQUIRED);
				Wrk1Hdr_prov_tax_cd_prio_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Wrk1Hdr_prov_tax_cd);
				setDefaultMode(Wrk1Hdr_prov_tax_cd_prio_flg);
			}
			setDefaultMode(Wrk1Hdr_prov_upri_cng_flg);
			setDefaultMode(Wrk1Hdr_prov_amt_rnd_typ);
			setDefaultMode(Wrk1Hdr_prov_tax_calc_typ);
			setDefaultMode(Wrk1Hdr_prov_tax_rnd_typ);
		}
		else {
			Wrk1Hdr_repurc_obli_flg.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_prov_upri_cng_flg.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_prov_tax_cd.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_prov_tax_cd_prio_flg.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_prov_amt_rnd_typ.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_prov_tax_calc_typ.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_prov_tax_rnd_typ.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 案件別債務管理のモード制御
	 * @param hdr
	 */
	protected void setWrkApFlgMode(Wrk1HdrR hdr) {
		if (hdr.wrk_po_flg()) {
			setDefaultMode(Wrk1Hdr_wrk_ap_flg);
		}
		else {
			Wrk1Hdr_wrk_ap_flg.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 買掛先関連項目のモード制御
	 * @param hdr
	 */
	protected void setAspplMode(Wrk1HdrR hdr) {
		if (hdr.asppl_flg()) {
			if (getCo().ap_no_use_flg()) {
				Wrk1Hdr_bsppl_cd.setMode(MCMode.ENABLE);
			}
			else {
				setDefaultMode(Wrk1Hdr_bsppl_cd);
			}
			setDefaultMode(Wrk1Hdr_ap_dpt_cd);
		}
		else {
			Wrk1Hdr_bsppl_cd.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_ap_dpt_cd.setMode(MCMode.READ_ONLY);
		}
	}
	/**
	 * 納品書関連項目のモード制御
	 * @param hdr
	 */
	protected void setDlvSlipMode(Wrk1HdrR hdr) {
		if (isNull(hdr.sppl_ship_form_cd())) {
			Wrk1Hdr_po_dlv_slip_flg.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_dlv_inst_dlv_slip_flg.setMode(MCMode.READ_ONLY);
			Wrk1Hdr_prms_rcpt_dlv_slip_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Wrk1Hdr_po_dlv_slip_flg);
			setDefaultMode(Wrk1Hdr_dlv_inst_dlv_slip_flg);
			setDefaultMode(Wrk1Hdr_prms_rcpt_dlv_slip_flg);
		}
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		if (isUpdSts() && !isStatusNone(getWrk1HdrR(), getWrk2DtlL(), getWrk3DtlL(), getWrk4DtlL(), getWrk5DtlL(),
				getWrk6DtlL(), getWrk7DtlL())) {
			return confirmRegDataClear();
		}
		return true;
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		getHdrR().clear();
		getWrk1HdrR().clear();
		getWrk2DtlL().clear();
		getWrk3DtlL().clear();
		getWrk4DtlL().clear();
		getWrk5DtlL().clear();
		getWrk6DtlL().clear();
		getWrk7DtlL().clear();
		
		getWrk2SetDtHdrR().clear();
		getWrk3SetDtHdrR().clear();
		getWrk4SetDtHdrR().clear();
		getWrk5SetDtHdrR().clear();
		getWrk6SetDtHdrR().clear();
		getWrk7SetDtHdrR().clear();
		
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();

		setOnrPrspplFlgMode();
	}

	/**
	 * 有償支給先ＦＬＧのモード制御<p>
	 * 管理者以外は有償支給先をオンからオフに変更不可
	 */
	protected void setOnrPrspplFlgMode() {
		if (getWrk1HdrR().onr_prsppl_flg()) {
			Wrk1Hdr_onr_prsppl_flg.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		// 行削除ボタンの制御
		if (dest != null && getWrk2DtlL().contains(dest)) {
			Wrk2DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk3DtlL().contains(dest)) {
			Wrk3DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk4DtlL().contains(dest)) {
			Wrk4DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk5DtlL().contains(dest)) {
			Wrk5DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk6DtlL().contains(dest)) {
			Wrk6DtlBtn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getWrk7DtlL().contains(dest)) {
			Wrk7DtlBtn_rdel.setMode(this, getStatus());
		}
		return dest;
	}

	//------------------ イベント処理 Start ------------------//

	@Override
	public void doWrk1Hdr_onr_prsppl_flg_NC(MCEventInfo info) {
		super.doWrk1Hdr_onr_prsppl_flg_NC(info);
		Wrk1HdrR r = getWrk1HdrR();

		if (!r.onr_prsppl_flg()) {
			setValueEx(Wrk1Hdr_repurc_obli_flg, false);
			setValueEx(Wrk1Hdr_outsrc_upri_typ, null);
			setValueEx(Wrk1Hdr_prov_upri_cng_flg, false);
			setValueEx(Wrk1Hdr_prov_amt_rnd_typ, null);
			setValueEx(Wrk1Hdr_prov_tax_rnd_typ, null);
			setValueEx(Wrk1Hdr_prov_tax_calc_typ, null);
			setValueEx(Wrk1Hdr_prov_tax_cd, null);
			setValueEx(Wrk1Hdr_prov_tax_cd_prio_flg, false);
		}
		else if (r.subcon_flg()) {
			setValueEx(Wrk1Hdr_purc_basis_typ, null);
		}
		setProvBasisTyp(r);
		setOutsrcUpriTypMode(r);
		setPurcBasisTypMode(r);
		setProvBasisTypMode(r);
		setProvMode(r);
	}
	@Override
	public void doWrk1Hdr_repurc_obli_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doWrk1Hdr_repurc_obli_flg_NC(info);
		Wrk1HdrR r = getWrk1HdrR();
		
		setValueEx(Wrk1Hdr_prov_tax_cd, null);
		if(r.repurc_obli_flg()) {
			setValueEx(Wrk1Hdr_prov_tax_cd_prio_flg, true);
		}
		else {
			setValueEx(Wrk1Hdr_prov_tax_cd_prio_flg, false);
		}
		setProvMode(r);
	}
	@Override
	public void doWrk1Hdr_sppl_iv_flg_NC(MCEventInfo info) {
		super.doWrk1Hdr_sppl_iv_flg_NC(info);
		Wrk1HdrR r = getWrk1HdrR();
		if (!r.sppl_iv_flg()) {
			setValueEx(Wrk1Hdr_rcpt_iv_dup_flg, false);
		}
		setRcptIvDupFlgMode(r);
	}
	@Override
	public void doWrk1Hdr_subcon_flg_NC(MCEventInfo info) {
		super.doWrk1Hdr_subcon_flg_NC(info);

		Wrk1HdrR r = getWrk1HdrR();
		setProvBasisTyp(r);
		setProvBasisTypMode(r);
		setPurcBasisTypMode(r);
	}
	@Override
	public void doWrk1Hdr_sppl_ship_form_cd_NC(
			mcframe.clientCore.event.MCEventInfo info) {
		super.doWrk1Hdr_sppl_ship_form_cd_NC(info);

		Wrk1HdrR r = getWrk1HdrR();

		if (isNull(r.sppl_ship_form_cd())) {
			setValueEx(Wrk1Hdr_po_dlv_slip_flg, false);
			setValueEx(Wrk1Hdr_dlv_inst_dlv_slip_flg, false);
			setValueEx(Wrk1Hdr_prms_rcpt_dlv_slip_flg, false);
		}
		setDlvSlipMode(r);
	}
	@Override
	public void doWrk1Hdr_prov_rcv_typ_LC(MCEventInfo info) {
		super.doWrk1Hdr_prov_rcv_typ_LC(info);
		
		Wrk1HdrR r = getWrk1HdrR();
		setProvBasisTyp(r);
		setProvBasisTypMode(r);
	}
	@Override
	public void doWrk1Hdr_wrk_po_flg_NC(MCEventInfo info) {
		super.doWrk1Hdr_wrk_po_flg_NC(info);

		Wrk1HdrR r = getWrk1HdrR();

		if (!r.wrk_po_flg()) {
			setValueEx(Wrk1Hdr_wrk_ap_flg, false);
		}

		setWrkApFlgMode(r);
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
	public void doWrk3Dtl_no_insp_flg_NC(MCEventInfo info) {
		super.doWrk3Dtl_no_insp_flg_NC(info);

		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		if (r.no_insp_flg()) {
			setValueEx(columnWrk3Dtl_insp_ptn_cd, idx, null);
			setValueEx(columnWrk3Dtl_pre_insp_valid_flg, idx, false);
		}
		setValueEx(columnWrk3Dtl_lmt_dt_frm_typ, idx, null);
	}
	public void doWrk3Dtl_itm_cd_LC(MCEventInfo info){
		int idx = info.getEventIndex();
		Wrk3DtlR r = getWrk3DtlL().get(idx);

		setValueEx(columnWrk3Dtl_insp_ptn_cd, idx, null);

		if (!r.lmt_ctl_flg()) {
			setValueEx(columnWrk3Dtl_lmt_dt_frm_typ, idx, null);
			setValueEx(columnWrk3Dtl_vld_pd, idx, MCNumber.ZERO);
			setValueEx(columnWrk3Dtl_lmt_pd, idx, MCNumber.ZERO);
			setValueEx(columnWrk3Dtl_lot_insp_vld_pd, idx, null);
			setValueEx(columnWrk3Dtl_calc_pd_typ, idx, null);
			setValueEx(columnWrk3Dtl_lot_insp_lmt_dt_frm_typ, idx, null);
		}
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
	public void doWrk5Dtl_if_proc_typ_LC(MCEventInfo info) {
		super.doWrk5Dtl_if_proc_typ_LC(info);

		int idx = info.getEventIndex();
		Wrk5DtlR r = getWrk5DtlL().get(idx);

		if (!MAC_IF_PROC_TYP.is_send(r.if_proc_typ())) {
			setValueEx(columnWrk5Dtl_ext_sys_cd, idx, null);
		}
		if (!MAC_IF_PROC_TYP.isBILL_SEND(r.if_proc_typ())) {
			setValueEx(columnWrk5Dtl_not_onr_prov_flg, r.getGUIIndex(), false);
		}
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
	
	private void setDelBtnMode(MCConstRow row, MCButton btn) {
		if (row == null
				|| !(getStatus().equals(getUPDStatus())
				|| getStatus().equals(getUPD_ADMINStatus()))) {
			btn.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			btn.setMode(MCMode.DISABLE);
		}
		else {
			btn.setMode(this, getStatus());
		}
	}
	//------------------ NC,LCイベント処理 End ------------------//
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BP));
	}
	
	protected Map_Wrk1HdrR_Wrk1HdrAllR<Wrk1HdrR,Wrk1HdrAllR> createMap_Wrk1HdrR_Wrk1HdrAllR() {
		return new Map_Wrk1HdrR_Wrk1HdrAllR<Wrk1HdrR, Wrk1HdrAllR>();
	}

	public class Map_Wrk1HdrR_Wrk1HdrAllR<D extends Wrk1HdrR, S extends Wrk1HdrAllR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Wrk1HdrR.$bp_cd, Wrk1HdrAllR.$bp_cd);
			addColumnPathMap(Wrk1HdrR.$cntry_cd, Wrk1HdrAllR.$cntry_cd);
			addColumnPathMap(Wrk1HdrR.$asppl_cd, Wrk1HdrAllR.$asppl_cd);
			addColumnPathMap(Wrk1HdrR.$asppl_nm, Wrk1HdrAllR.$asppl_nm);
			addColumnPathMap(Wrk1HdrR.$vmi_purc_dpt_cd, Wrk1HdrAllR.$vmi_purc_dpt_cd);
			addColumnPathMap(Wrk1HdrR.$vmi_purc_dpt_nm, Wrk1HdrAllR.$vmi_purc_dpt_nm);
			addColumnPathMap(Wrk1HdrR.$sppl_cntct_dpt, Wrk1HdrAllR.$sppl_cntct_dpt);
			addColumnPathMap(Wrk1HdrR.$sppl_cntct_psn, Wrk1HdrAllR.$sppl_cntct_psn);
			addColumnPathMap(Wrk1HdrR.$sppl_cntct_psn_title, Wrk1HdrAllR.$sppl_cntct_psn_title);
			addColumnPathMap(Wrk1HdrR.$subcon_flg, Wrk1HdrAllR.$subcon_flg);
			addColumnPathMap(Wrk1HdrR.$purc_upri_req_typ, Wrk1HdrAllR.$purc_upri_req_typ);
			addColumnPathMap(Wrk1HdrR.$purc_upri_req_typ_nm, Wrk1HdrAllR.$purc_upri_req_typ_nm);
			addColumnPathMap(Wrk1HdrR.$purc_upri_cng_flg, Wrk1HdrAllR.$purc_upri_cng_flg);
			addColumnPathMap(Wrk1HdrR.$purc_amt_rnd_typ, Wrk1HdrAllR.$purc_amt_rnd_typ);
			addColumnPathMap(Wrk1HdrR.$purc_amt_rnd_typ_nm, Wrk1HdrAllR.$purc_amt_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrR.$purc_tax_calc_typ, Wrk1HdrAllR.$purc_tax_calc_typ);
			addColumnPathMap(Wrk1HdrR.$purc_tax_calc_typ_nm, Wrk1HdrAllR.$purc_tax_calc_typ_nm);
			addColumnPathMap(Wrk1HdrR.$purc_tax_rnd_typ, Wrk1HdrAllR.$purc_tax_rnd_typ);
			addColumnPathMap(Wrk1HdrR.$purc_tax_rnd_typ_nm, Wrk1HdrAllR.$purc_tax_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrR.$pay_crryovr_times, Wrk1HdrAllR.$pay_crryovr_times);
			addColumnPathMap(Wrk1HdrR.$sppl_cal_cd, Wrk1HdrAllR.$sppl_cal_cd);
			addColumnPathMap(Wrk1HdrR.$sppl_cal_nm, Wrk1HdrAllR.$sppl_cal_nm);
			addColumnPathMap(Wrk1HdrR.$po_print_cd, Wrk1HdrAllR.$po_print_cd);
			addColumnPathMap(Wrk1HdrR.$po_print_nm, Wrk1HdrAllR.$po_print_nm);
			addColumnPathMap(Wrk1HdrR.$sppl_ship_form_cd, Wrk1HdrAllR.$sppl_ship_form_cd);
			addColumnPathMap(Wrk1HdrR.$sppl_ship_form_nm, Wrk1HdrAllR.$sppl_ship_form_nm);
			addColumnPathMap(Wrk1HdrR.$po_dlv_slip_flg, Wrk1HdrAllR.$po_dlv_slip_flg);
			addColumnPathMap(Wrk1HdrR.$dlv_inst_dlv_slip_flg, Wrk1HdrAllR.$dlv_inst_dlv_slip_flg);
			addColumnPathMap(Wrk1HdrR.$prms_rcpt_dlv_slip_flg, Wrk1HdrAllR.$prms_rcpt_dlv_slip_flg);
			addColumnPathMap(Wrk1HdrR.$prms_recv_flg, Wrk1HdrAllR.$prms_recv_flg);
			addColumnPathMap(Wrk1HdrR.$purc_tax_cd, Wrk1HdrAllR.$purc_tax_cd);
			addColumnPathMap(Wrk1HdrR.$purc_tax_nm, Wrk1HdrAllR.$purc_tax_nm);
			addColumnPathMap(Wrk1HdrR.$purc_tax_cd_prio_flg, Wrk1HdrAllR.$purc_tax_cd_prio_flg);
			addColumnPathMap(Wrk1HdrR.$sppl_iv_flg, Wrk1HdrAllR.$sppl_iv_flg);
			addColumnPathMap(Wrk1HdrR.$rcpt_iv_dup_flg, Wrk1HdrAllR.$rcpt_iv_dup_flg);
			addColumnPathMap(Wrk1HdrR.$sppl_tterm_cd1, Wrk1HdrAllR.$sppl_tterm_cd1);
			addColumnPathMap(Wrk1HdrR.$sppl_tterm_nm1, Wrk1HdrAllR.$sppl_tterm_nm1);
			addColumnPathMap(Wrk1HdrR.$sppl_tterm_cd2, Wrk1HdrAllR.$sppl_tterm_cd2);
			addColumnPathMap(Wrk1HdrR.$sppl_tterm_nm2, Wrk1HdrAllR.$sppl_tterm_nm2);
			addColumnPathMap(Wrk1HdrR.$sppl_tterm_cd3, Wrk1HdrAllR.$sppl_tterm_cd3);
			addColumnPathMap(Wrk1HdrR.$sppl_tterm_nm3, Wrk1HdrAllR.$sppl_tterm_nm3);
			addColumnPathMap(Wrk1HdrR.$wrk_po_flg, Wrk1HdrAllR.$wrk_po_flg);
			addColumnPathMap(Wrk1HdrR.$wrk_ap_flg, Wrk1HdrAllR.$wrk_ap_flg);
			addColumnPathMap(Wrk1HdrR.$purc_slip_each_lot_typ, Wrk1HdrAllR.$purc_slip_each_lot_typ);
			addColumnPathMap(Wrk1HdrR.$purc_slip_each_lot_typ_nm, Wrk1HdrAllR.$purc_slip_each_lot_typ_nm);
			addColumnPathMap(Wrk1HdrR.$prov_rcv_typ, Wrk1HdrAllR.$prov_rcv_typ);
			addColumnPathMap(Wrk1HdrR.$prov_rcv_typ_nm, Wrk1HdrAllR.$prov_rcv_typ_nm);
			addColumnPathMap(Wrk1HdrR.$onr_prsppl_flg, Wrk1HdrAllR.$onr_prsppl_flg);
			addColumnPathMap(Wrk1HdrR.$repurc_obli_flg, Wrk1HdrAllR.$repurc_obli_flg);
			addColumnPathMap(Wrk1HdrR.$outsrc_upri_typ, Wrk1HdrAllR.$outsrc_upri_typ);
			addColumnPathMap(Wrk1HdrR.$outsrc_upri_typ_nm, Wrk1HdrAllR.$outsrc_upri_typ_nm);
			addColumnPathMap(Wrk1HdrR.$purc_basis_typ, Wrk1HdrAllR.$purc_basis_typ);
			addColumnPathMap(Wrk1HdrR.$purc_basis_typ_nm, Wrk1HdrAllR.$purc_basis_typ_nm);
			addColumnPathMap(Wrk1HdrR.$prov_basis_typ, Wrk1HdrAllR.$prov_basis_typ);
			addColumnPathMap(Wrk1HdrR.$prov_basis_typ_nm, Wrk1HdrAllR.$prov_basis_typ_nm);
			addColumnPathMap(Wrk1HdrR.$prov_upri_cng_flg, Wrk1HdrAllR.$prov_upri_cng_flg);
			addColumnPathMap(Wrk1HdrR.$prov_tax_cd, Wrk1HdrAllR.$prov_tax_cd);
			addColumnPathMap(Wrk1HdrR.$prov_tax_nm, Wrk1HdrAllR.$prov_tax_nm);
			addColumnPathMap(Wrk1HdrR.$prov_tax_cd_prio_flg, Wrk1HdrAllR.$prov_tax_cd_prio_flg);
			addColumnPathMap(Wrk1HdrR.$prov_amt_rnd_typ, Wrk1HdrAllR.$prov_amt_rnd_typ);
			addColumnPathMap(Wrk1HdrR.$prov_amt_rnd_typ_nm, Wrk1HdrAllR.$prov_amt_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrR.$prov_tax_calc_typ, Wrk1HdrAllR.$prov_tax_calc_typ);
			addColumnPathMap(Wrk1HdrR.$prov_tax_calc_typ_nm, Wrk1HdrAllR.$prov_tax_calc_typ_nm);
			addColumnPathMap(Wrk1HdrR.$prov_tax_rnd_typ, Wrk1HdrAllR.$prov_tax_rnd_typ);
			addColumnPathMap(Wrk1HdrR.$prov_tax_rnd_typ_nm, Wrk1HdrAllR.$prov_tax_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrR.$asppl_flg, Wrk1HdrAllR.$asppl_flg);
			addColumnPathMap(Wrk1HdrR.$bsppl_cd, Wrk1HdrAllR.$bsppl_cd);
			addColumnPathMap(Wrk1HdrR.$bsppl_nm, Wrk1HdrAllR.$bsppl_nm);
			addColumnPathMap(Wrk1HdrR.$ap_dpt_cd, Wrk1HdrAllR.$ap_dpt_cd);
			addColumnPathMap(Wrk1HdrR.$ap_dpt_nm, Wrk1HdrAllR.$ap_dpt_nm);
			addColumnPathMap(Wrk1HdrR.$ins_usr_id, Wrk1HdrAllR.$ins_usr_id);
			addColumnPathMap(Wrk1HdrR.$ins_usr_nm, Wrk1HdrAllR.$ins_usr_nm);
			addColumnPathMap(Wrk1HdrR.$ins_ts, Wrk1HdrAllR.$ins_ts);
			addColumnPathMap(Wrk1HdrR.$ins_func_id, Wrk1HdrAllR.$ins_func_id);
			addColumnPathMap(Wrk1HdrR.$ins_func_nm, Wrk1HdrAllR.$ins_func_nm);
			addColumnPathMap(Wrk1HdrR.$upd_cntr, Wrk1HdrAllR.$upd_cntr);
			addColumnPathMap(Wrk1HdrR.$upd_usr_id, Wrk1HdrAllR.$upd_usr_id);
			addColumnPathMap(Wrk1HdrR.$upd_usr_nm, Wrk1HdrAllR.$upd_usr_nm);
			addColumnPathMap(Wrk1HdrR.$upd_ts, Wrk1HdrAllR.$upd_ts);
			addColumnPathMap(Wrk1HdrR.$upd_func_id, Wrk1HdrAllR.$upd_func_id);
			addColumnPathMap(Wrk1HdrR.$upd_func_nm, Wrk1HdrAllR.$upd_func_nm);
			addColumnPathMap(Wrk1HdrR.$upd_srv_req_no, Wrk1HdrAllR.$upd_srv_req_no);
			addColumnPathMap(Wrk1HdrR.$del_usr_id, Wrk1HdrAllR.$del_usr_id);
			addColumnPathMap(Wrk1HdrR.$del_usr_nm, Wrk1HdrAllR.$del_usr_nm);
			addColumnPathMap(Wrk1HdrR.$del_ts, Wrk1HdrAllR.$del_ts);
			addColumnPathMap(Wrk1HdrR.$sppl_prnt_typ, Wrk1HdrAllR.$sppl_prnt_typ);
			addColumnPathMap(Wrk1HdrR.$sppl_prnt_typ_nm, Wrk1HdrAllR.$sppl_prnt_typ_nm);
		}
	}

	protected Map_Wrk1HdrAllR_Wrk1HdrR<Wrk1HdrAllR,Wrk1HdrR> createMap_Wrk1HdrAllR_Wrk1HdrR() {
		return new Map_Wrk1HdrAllR_Wrk1HdrR<Wrk1HdrAllR, Wrk1HdrR>();
	}

	public class Map_Wrk1HdrAllR_Wrk1HdrR<D extends Wrk1HdrAllR, S extends Wrk1HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Wrk1HdrAllR.$bp_cd, Wrk1HdrR.$bp_cd);
			addColumnPathMap(Wrk1HdrAllR.$cntry_cd, Wrk1HdrR.$cntry_cd);
			addColumnPathMap(Wrk1HdrAllR.$asppl_cd, Wrk1HdrR.$asppl_cd);
			addColumnPathMap(Wrk1HdrAllR.$asppl_nm, Wrk1HdrR.$asppl_nm);
			addColumnPathMap(Wrk1HdrAllR.$vmi_purc_dpt_cd, Wrk1HdrR.$vmi_purc_dpt_cd);
			addColumnPathMap(Wrk1HdrAllR.$vmi_purc_dpt_nm, Wrk1HdrR.$vmi_purc_dpt_nm);
			addColumnPathMap(Wrk1HdrAllR.$check_vmi_purc_dpt_cd, Wrk1HdrR.$check_vmi_purc_dpt_cd);
			addColumnPathMap(Wrk1HdrAllR.$sppl_cntct_dpt, Wrk1HdrR.$sppl_cntct_dpt);
			addColumnPathMap(Wrk1HdrAllR.$sppl_cntct_psn, Wrk1HdrR.$sppl_cntct_psn);
			addColumnPathMap(Wrk1HdrAllR.$sppl_cntct_psn_title, Wrk1HdrR.$sppl_cntct_psn_title);
			addColumnPathMap(Wrk1HdrAllR.$subcon_flg, Wrk1HdrR.$subcon_flg);
			addColumnPathMap(Wrk1HdrAllR.$purc_upri_req_typ, Wrk1HdrR.$purc_upri_req_typ);
			addColumnPathMap(Wrk1HdrAllR.$purc_upri_req_typ_nm, Wrk1HdrR.$purc_upri_req_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$purc_upri_cng_flg, Wrk1HdrR.$purc_upri_cng_flg);
			addColumnPathMap(Wrk1HdrAllR.$purc_amt_rnd_typ, Wrk1HdrR.$purc_amt_rnd_typ);
			addColumnPathMap(Wrk1HdrAllR.$purc_amt_rnd_typ_nm, Wrk1HdrR.$purc_amt_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$purc_tax_calc_typ, Wrk1HdrR.$purc_tax_calc_typ);
			addColumnPathMap(Wrk1HdrAllR.$purc_tax_calc_typ_nm, Wrk1HdrR.$purc_tax_calc_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$purc_tax_rnd_typ, Wrk1HdrR.$purc_tax_rnd_typ);
			addColumnPathMap(Wrk1HdrAllR.$purc_tax_rnd_typ_nm, Wrk1HdrR.$purc_tax_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$pay_crryovr_times, Wrk1HdrR.$pay_crryovr_times);
			addColumnPathMap(Wrk1HdrAllR.$sppl_cal_cd, Wrk1HdrR.$sppl_cal_cd);
			addColumnPathMap(Wrk1HdrAllR.$sppl_cal_nm, Wrk1HdrR.$sppl_cal_nm);
			addColumnPathMap(Wrk1HdrAllR.$po_print_cd, Wrk1HdrR.$po_print_cd);
			addColumnPathMap(Wrk1HdrAllR.$po_print_nm, Wrk1HdrR.$po_print_nm);
			addColumnPathMap(Wrk1HdrAllR.$sppl_ship_form_cd, Wrk1HdrR.$sppl_ship_form_cd);
			addColumnPathMap(Wrk1HdrAllR.$sppl_ship_form_nm, Wrk1HdrR.$sppl_ship_form_nm);
			addColumnPathMap(Wrk1HdrAllR.$po_dlv_slip_flg, Wrk1HdrR.$po_dlv_slip_flg);
			addColumnPathMap(Wrk1HdrAllR.$dlv_inst_dlv_slip_flg, Wrk1HdrR.$dlv_inst_dlv_slip_flg);
			addColumnPathMap(Wrk1HdrAllR.$prms_rcpt_dlv_slip_flg, Wrk1HdrR.$prms_rcpt_dlv_slip_flg);
			addColumnPathMap(Wrk1HdrAllR.$prms_recv_flg, Wrk1HdrR.$prms_recv_flg);
			addColumnPathMap(Wrk1HdrAllR.$purc_tax_cd, Wrk1HdrR.$purc_tax_cd);
			addColumnPathMap(Wrk1HdrAllR.$purc_tax_nm, Wrk1HdrR.$purc_tax_nm);
			addColumnPathMap(Wrk1HdrAllR.$purc_tax_cd_prio_flg, Wrk1HdrR.$purc_tax_cd_prio_flg);
			addColumnPathMap(Wrk1HdrAllR.$sppl_iv_flg, Wrk1HdrR.$sppl_iv_flg);
			addColumnPathMap(Wrk1HdrAllR.$rcpt_iv_dup_flg, Wrk1HdrR.$rcpt_iv_dup_flg);
			addColumnPathMap(Wrk1HdrAllR.$sppl_tterm_cd1, Wrk1HdrR.$sppl_tterm_cd1);
			addColumnPathMap(Wrk1HdrAllR.$sppl_tterm_nm1, Wrk1HdrR.$sppl_tterm_nm1);
			addColumnPathMap(Wrk1HdrAllR.$sppl_tterm_cd2, Wrk1HdrR.$sppl_tterm_cd2);
			addColumnPathMap(Wrk1HdrAllR.$sppl_tterm_nm2, Wrk1HdrR.$sppl_tterm_nm2);
			addColumnPathMap(Wrk1HdrAllR.$sppl_tterm_cd3, Wrk1HdrR.$sppl_tterm_cd3);
			addColumnPathMap(Wrk1HdrAllR.$sppl_tterm_nm3, Wrk1HdrR.$sppl_tterm_nm3);
			addColumnPathMap(Wrk1HdrAllR.$wrk_po_flg, Wrk1HdrR.$wrk_po_flg);
			addColumnPathMap(Wrk1HdrAllR.$wrk_ap_flg, Wrk1HdrR.$wrk_ap_flg);
			addColumnPathMap(Wrk1HdrAllR.$purc_slip_each_lot_typ, Wrk1HdrR.$purc_slip_each_lot_typ);
			addColumnPathMap(Wrk1HdrAllR.$purc_slip_each_lot_typ_nm, Wrk1HdrR.$purc_slip_each_lot_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$prov_rcv_typ, Wrk1HdrR.$prov_rcv_typ);
			addColumnPathMap(Wrk1HdrAllR.$prov_rcv_typ_nm, Wrk1HdrR.$prov_rcv_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$onr_prsppl_flg, Wrk1HdrR.$onr_prsppl_flg);
			addColumnPathMap(Wrk1HdrAllR.$repurc_obli_flg, Wrk1HdrR.$repurc_obli_flg);
			addColumnPathMap(Wrk1HdrAllR.$outsrc_upri_typ, Wrk1HdrR.$outsrc_upri_typ);
			addColumnPathMap(Wrk1HdrAllR.$outsrc_upri_typ_nm, Wrk1HdrR.$outsrc_upri_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$purc_basis_typ, Wrk1HdrR.$purc_basis_typ);
			addColumnPathMap(Wrk1HdrAllR.$purc_basis_typ_nm, Wrk1HdrR.$purc_basis_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$prov_basis_typ, Wrk1HdrR.$prov_basis_typ);
			addColumnPathMap(Wrk1HdrAllR.$prov_basis_typ_nm, Wrk1HdrR.$prov_basis_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$prov_upri_cng_flg, Wrk1HdrR.$prov_upri_cng_flg);
			addColumnPathMap(Wrk1HdrAllR.$prov_tax_cd, Wrk1HdrR.$prov_tax_cd);
			addColumnPathMap(Wrk1HdrAllR.$prov_tax_nm, Wrk1HdrR.$prov_tax_nm);
			addColumnPathMap(Wrk1HdrAllR.$prov_tax_cd_prio_flg, Wrk1HdrR.$prov_tax_cd_prio_flg);
			addColumnPathMap(Wrk1HdrAllR.$prov_amt_rnd_typ, Wrk1HdrR.$prov_amt_rnd_typ);
			addColumnPathMap(Wrk1HdrAllR.$prov_amt_rnd_typ_nm, Wrk1HdrR.$prov_amt_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$prov_tax_calc_typ, Wrk1HdrR.$prov_tax_calc_typ);
			addColumnPathMap(Wrk1HdrAllR.$prov_tax_calc_typ_nm, Wrk1HdrR.$prov_tax_calc_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$prov_tax_rnd_typ, Wrk1HdrR.$prov_tax_rnd_typ);
			addColumnPathMap(Wrk1HdrAllR.$prov_tax_rnd_typ_nm, Wrk1HdrR.$prov_tax_rnd_typ_nm);
			addColumnPathMap(Wrk1HdrAllR.$asppl_flg, Wrk1HdrR.$asppl_flg);
			addColumnPathMap(Wrk1HdrAllR.$bsppl_cd, Wrk1HdrR.$bsppl_cd);
			addColumnPathMap(Wrk1HdrAllR.$bsppl_nm, Wrk1HdrR.$bsppl_nm);
			addColumnPathMap(Wrk1HdrAllR.$ap_dpt_cd, Wrk1HdrR.$ap_dpt_cd);
			addColumnPathMap(Wrk1HdrAllR.$ap_dpt_nm, Wrk1HdrR.$ap_dpt_nm);
			addColumnPathMap(Wrk1HdrAllR.$check_ap_dpt_cd, Wrk1HdrR.$check_ap_dpt_cd);
			addColumnPathMap(Wrk1HdrAllR.$ins_usr_id, Wrk1HdrR.$ins_usr_id);
			addColumnPathMap(Wrk1HdrAllR.$ins_usr_nm, Wrk1HdrR.$ins_usr_nm);
			addColumnPathMap(Wrk1HdrAllR.$ins_ts, Wrk1HdrR.$ins_ts);
			addColumnPathMap(Wrk1HdrAllR.$ins_func_id, Wrk1HdrR.$ins_func_id);
			addColumnPathMap(Wrk1HdrAllR.$ins_func_nm, Wrk1HdrR.$ins_func_nm);
			addColumnPathMap(Wrk1HdrAllR.$upd_cntr, Wrk1HdrR.$upd_cntr);
			addColumnPathMap(Wrk1HdrAllR.$upd_usr_id, Wrk1HdrR.$upd_usr_id);
			addColumnPathMap(Wrk1HdrAllR.$upd_usr_nm, Wrk1HdrR.$upd_usr_nm);
			addColumnPathMap(Wrk1HdrAllR.$upd_ts, Wrk1HdrR.$upd_ts);
			addColumnPathMap(Wrk1HdrAllR.$upd_func_id, Wrk1HdrR.$upd_func_id);
			addColumnPathMap(Wrk1HdrAllR.$upd_func_nm, Wrk1HdrR.$upd_func_nm);
			addColumnPathMap(Wrk1HdrAllR.$upd_srv_req_no, Wrk1HdrR.$upd_srv_req_no);
			addColumnPathMap(Wrk1HdrAllR.$del_usr_id, Wrk1HdrR.$del_usr_id);
			addColumnPathMap(Wrk1HdrAllR.$del_usr_nm, Wrk1HdrR.$del_usr_nm);
			addColumnPathMap(Wrk1HdrAllR.$del_ts, Wrk1HdrR.$del_ts);
			addColumnPathMap(Wrk1HdrAllR.$sppl_prnt_typ, Wrk1HdrR.$sppl_prnt_typ);
			addColumnPathMap(Wrk1HdrAllR.$sppl_prnt_typ_nm, Wrk1HdrR.$sppl_prnt_typ_nm);
		}
		@Override
		public void valueCopy(D dest, S src){
			super.valueCopy(dest, src);
			
			if (!isStatusNone(getWrk1HdrR())) {
				dest.check(true);
			}
		}
	}

}