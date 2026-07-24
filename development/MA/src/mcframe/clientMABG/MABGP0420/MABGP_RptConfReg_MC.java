package mcframe.clientMABG.MABGP0420;

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

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientFSUB.FSUBP0120.*;

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
import mcframe.commonCore.util.MCCollectionUtil;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
//import mcframe.clientFXUC.FXUCP0120.SORB3EventInfo;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_RptConfReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_RptConfReg_MC extends MABGP_RptConfReg_MC_A implements IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_RptConfReg_MC() {
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
	public MABGP_RptConfReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0420_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0420_Srch01Caller<P extends MABGP_RptConfReg, B extends MA_MABGL0420_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABGL0420_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			copyCndToHdr();
		}

		/**
		 * 登録用データを検索用データからコピーする。
		 */
		protected void copyCndToHdr() {
			getHdrR().rpt_ptn_cd(getCndR().rpt_ptn_cd());
			getHdrR().rpt_ptn_nm(getCndR().rpt_ptn_nm());
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (isRefOpe()) {
				setREFStatus();
			}
			else if (isModOpe())  {
				setMOD_FIX_HStatus();
			}
			else {
				setDELStatus();
			}
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setMODStatus();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DtlTable.selectLeftmostColumn(0);
		}
	}

	/**
	 * [MA_MABGL0420_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0420_Upd01Caller<P extends MABGP_RptConfReg, B extends MA_MABGL0420_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABGL0420_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setRptSeq(getDtlL());
			setRptPtnCd(getDtlL());
		}

		/**
		 * 表示順を連番となるように設定する。
		 * @param list
		 */
		protected void setRptSeq(MCList<DtlR> list) {
			int seq = 1;
			for (DtlR dtl : list) {
				if (!isNull(dtl.rpt_row_cd())) {
					dtl.rpt_seq(seq++);
				}
			}
		}

		protected void setRptPtnCd(MCList<DtlR> list) {
			String hdr = getHdrR().rpt_ptn_cd();
			for (DtlR row :getDtlL()) {
				if (row.check()) {
					row.rpt_ptn_cd(hdr);
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (isUpdOpe()) {
				setFIX_UStatus();
			}
			else {
				setFIX_MStatus();
			}
		}

		@Override
		protected void show() {
			super.show();
			if (isUpdOpe()) {
				copyHdrToCnd();
			}
		}

		/**
		 * 検索用データを登録用データからコピーする
		 */
		protected void copyHdrToCnd() {
			getCndR().rpt_ptn_cd(getHdrR().rpt_ptn_cd());
			getCndR().rpt_ptn_nm(getHdrR().rpt_ptn_nm());
		}
	}

	/**
	 * [MA_MABGL0420_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0420_Del01Caller<P extends MABGP_RptConfReg, B extends MA_MABGL0420_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABGL0420_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_DStatus();
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABGL0420_Srch01();
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
		callMA_MABGL0420_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0420_Del01();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0430]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0430(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0430");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0430CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABGP0430]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0430.CndR crtOpenMABGP0430CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0430.CndR to =
			mcframe.clientMABG.MABGP0430.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.rpt_ptn_cd(fr.rpt_ptn_cd());
			to.sml_rpt_row_cd(fr.rpt_row_cd());
		}
		return to;
	}

	// -- 画面起動時の設定（START）
	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_rpt_seq, SortType.ASC);
	}

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		columnDtl_rpt_pre_word.setTrimPattern(MCBeansConsts.TRIM_NONE);
	}

	@Override
	public void setOpenFocus() {
		// フォーカスはステータスで移動する
	}

	@Override
	public void fillSpace() {
		// fillSpaceは無効
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.setSortable(false); // ソート不可
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtl_rpt_tgt_typ.addLCListener(this);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		// ソート設定のポップアップを無効にする
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlTable) {
			conf.ignoreSortOrder(true);
			conf.ignoreTableSort(true);
		}
		return conf;
	}

	// -- 画面起動時の設定（END）

	// -- イベント処理（START）
	/**
	 * レポートパタンＣＤを入力したタイミングで明細枠に転記
	 */
	@Override
	public void doHdr_rpt_ptn_cd_LC(MCEventInfo info) {
		super.doHdr_rpt_ptn_cd_LC(info);

		String hdr = getHdrR().rpt_ptn_cd();
		String status = getStatus();

		if ((status == UPD) && !isNull(hdr)) {
			super.fillSpace();
			setUPD_FIX_HStatus();
		}
		else if ((status == UPD_FIX_H) && isNull(hdr)) {
			setUPDStatus();
		}
		else {
			setOpenButtonMode();
		}
	}

	/**
	 * レポート行ＣＤを入力したタイミングで登録枠のレポートパタンＣＤを転記
	 */
	@Override
	public void doDtl_rpt_row_cd_LC(MCEventInfo info) {
		super.doDtl_rpt_row_cd_LC(info);
		setOpenButtonMode();
	}

	/**
	 * 集計行ＦＬＧをＯＮにしたタイミングで値のクリア
	 */
	@Override
	public void doDtl_sml_flg_NC(MCEventInfo info) {
		super.doDtl_sml_flg_NC(info);
		DtlR r = DtlTable.getSelectedMCRow();
		if (r.sml_flg()) {
			int x = info.getEventIndex();
			setValueEx(columnDtl_cost_io_typ, x, null);
			setValueEx(columnDtl_asst_typ, x, null);
			setValueEx(columnDtl_std_flg, x, false);
			setValueEx(columnDtl_qty_unit_typ, x, null);
			setValueEx(columnDtl_alc_ac_grp_cd1, x, null);
			setValueEx(columnDtl_alc_ac_grp_cd2, x, null);
			setValueEx(columnDtl_alc_ac_grp_cd3, x, null);
			setValueEx(columnDtl_alc_ac_cd, x, null);
			setValueEx(columnDtl_ac_slip_typ, x, null);
			setValueEx(columnDtl_ac_rsn_cd, x, null);
			setValueEx(columnDtl_itm_jnl_cd, x, null);
			setValueEx(columnDtl_itm_grp_cd1, x, null);
			setValueEx(columnDtl_itm_grp_cd2, x, null);
			setValueEx(columnDtl_itm_grp_cd3, x, null);
			setValueEx(columnDtl_itm_grp_cd4, x, null);
			setValueEx(columnDtl_itm_grp_cd5, x, null);
			setValueEx(columnDtl_itm_grp_cd6, x, null);
			setValueEx(columnDtl_itm_grp_cd7, x, null);
			setValueEx(columnDtl_itm_grp_cd8, x, null);
			setValueEx(columnDtl_itm_grp_cd9, x, null);
			setValueEx(columnDtl_itm_grp_cd10, x, null);
			setValueEx(columnDtl_expns_typ, x, null);
			setValueEx(columnDtl_direct_typ, x, null);
			setValueEx(columnDtl_var_typ, x, null);
			setValueEx(columnDtl_expns_grp_cd, x, null);
			setValueEx(columnDtl_expns_cd, x, null);
		}
		setOpenButtonMode();
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_rpt_tgt_typ) doDtl_rpt_tgt_typ_LC(info);
	}

	@Override
	public void doDtl_rpt_tgt_typ_LC(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		String rptTgtTyp = r.rpt_tgt_typ();
		int idx = r.getGUIIndex();

		if (!MAC_RPT_TGT_TYP.is_qty(rptTgtTyp)) {
			setValueEx(columnDtl_qty_unit_typ, idx, null);
		}
		if (!MAC_RPT_TGT_TYP.isALC(rptTgtTyp)) {
			setValueEx(columnDtl_alc_ac_grp_cd1, idx, null);
			setValueEx(columnDtl_alc_ac_grp_cd2, idx, null);
			setValueEx(columnDtl_alc_ac_grp_cd3, idx, null);
			setValueEx(columnDtl_alc_ac_cd, idx, null);
		}
		if (isCostIoTypClear(rptTgtTyp)) {
			setValueEx(columnDtl_cost_io_typ, idx, null);
		}
	}

	/**
	 * 原価入出庫区分がクリアまたは入力不可になるかどうか
	 * @param rptTgtTyp レポート対象区分
	 */
	protected boolean isCostIoTypClear(String rptTgtTyp) {
		if (MAC_RPT_TGT_TYP.isIO(rptTgtTyp) || MAC_RPT_TGT_TYP.isIO_AMT(rptTgtTyp)) {
			return false;
		}
		return true;
	}

	protected void setOpenButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null
				|| isNull(getHdrR().rpt_ptn_cd())
				|| isNull(r.rpt_row_cd())
				|| !r.sml_flg()) {
			Btn_open_MABGP0430.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MABGP0430);
		}
	}

	@Override
	public void doDtl_NC(MCEventInfo info){
		super.doDtl_NC(info);
		setOpenButtonMode();
	}
	// -- イベント処理（END）

	//--------------------リストロジック表示制御Start-----------------------
	// 配賦科目グループ１コンボリストの作成
	@Override
	public MCList getDtl_alc_ac_grp_cd1(MCRow row, MCEventInfo info) {
		row.setStringNE(AlcAcGrpCols.$i_alc_ac_grp_typ, MAC_ALC_AC_GRP_TYP.GRP1.value());
		return super.getDtl_alc_ac_grp_cd1(row, info);
	}

	// 配賦科目グループ２コンボリストの作成
	@Override
	public MCList getDtl_alc_ac_grp_cd2(MCRow row, MCEventInfo info) {
		row.setStringNE(AlcAcGrpCols.$i_alc_ac_grp_typ, MAC_ALC_AC_GRP_TYP.GRP2.value());
		return super.getDtl_alc_ac_grp_cd2(row, info);
	}

	// 配賦科目グループ３コンボリストの作成
	@Override
	public MCList getDtl_alc_ac_grp_cd3(MCRow row, MCEventInfo info) {
		row.setStringNE(AlcAcGrpCols.$i_alc_ac_grp_typ, MAC_ALC_AC_GRP_TYP.GRP3.value());
		return super.getDtl_alc_ac_grp_cd3(row, info);
	}
	//--------------------リストロジック表示制御End-----------------------

	// -- インターフェースの実装(START)
	// ---- IfRowMoveBase(START)
	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return true;
	}
	// ---- IfRowMoveBase(END)
	// -- インターフェースの実装(END)

	//参照→登録　
	/**
	 * 操作種別変更時の処理
	 */
	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		String bfSt = this.getStatus();
		String bfOpe = (String)info.getOldValue();
		String afOpe = (String)info.getNewValue();

		setValueEx(Hdr_rpt_ptn_cd, null);

		if (isSame(afOpe, getUpdOpeValue())) {
			if (isSame(bfOpe, getRefOpeValue())) {
				if (isSame(bfSt, REF)) {
					// 検索後（参照登録）
					setRefToUpdInit();
				}
				else {
					// 検索前
					valueInit();
				}
			}
			else {
				clearAll();
			}
			setStatusByOpe();
		}
		else {
			clearAll();
			setStatusByOpe();
			setMODStatus();
			moveFocusCndPanel();
		}
	}

	/**
	 * 参照→登録遷移時のクリア、モード設定
	 */
	protected void setRefToUpdInit() {
		clear(getLclAllL());
		clear(getLclL());
		clearNotInheritInfo(getDtlL());
		setRowStatusForIns(getDtlL());
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setOpenButtonMode();
		HdrPanel.focusFirstComponent();
	}
	@Override
	public void setUPD_FIX_HStatus() {
		super.setUPD_FIX_HStatus();
		setOpenButtonMode();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setOpenButtonMode();
		ScreenOpePanel.focusFirstComponent();
	}
	@Override
	public void setMODStatus() {
		super.setMODStatus();
		setOpenButtonMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setMOD_FIX_HStatus() {
		super.setMOD_FIX_HStatus();
		CndPanel.focusFirstComponent();
		setOpenButtonMode();
	}
	@Override
	public void setFIX_MStatus() {
		super.setFIX_MStatus();
		setOpenButtonMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setOpenButtonMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setOpenButtonMode();
		DtlTable.selectLeftmostColumn(0);
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setOpenButtonMode();
		DtlTable.selectLeftmostColumn(0);
	}
	@Override
	public void setFIXStatus() {
		//ダミー
	}

	// //////////////////////////////////////////////
	// セルコンフィグ////////////////////////////////
	// //////////////////////////////////////////////
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 明細用のセルコンフィグ
	 */
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
			if (isUpdSts()) {
				DtlR r = DtlTable.getRow(index);
				// 集計行ＦＬＧ＝ＯＮのとき入力不可
				if (r.sml_flg()) {
					if (isNoSmlCols(column)) {
						return MCMode.READ_ONLY ;
					}
					if (column == columnDtl_rpt_tgt_typ) {
						return MCMode.ENABLE ;
					}
				}
				else {
					if (column == columnDtl_cost_io_typ) {
						if (isCostIoTypClear(r.rpt_tgt_typ())) {
							return MCMode.READ_ONLY ;
						}
					}
					else if (column == columnDtl_qty_unit_typ) {
						if (!MAC_RPT_TGT_TYP.is_qty(r.rpt_tgt_typ())) {
							return MCMode.READ_ONLY ;
						}
					}
					else if (!MAC_RPT_TGT_TYP.isALC(r.rpt_tgt_typ())) {
						if (isAlcAcCols(column)) {
							return MCMode.READ_ONLY ;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
		protected boolean isNoSmlCols(MCColumnConfig column){
			return MCCollectionUtil.contains(column, getNoSmlCols());
		}
		protected boolean isAlcAcCols(MCColumnConfig column){
			return MCCollectionUtil.contains(column, getAlcAcCols());
		}

		//サンプルの表示
		@Override
		public java.awt.Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (column == columnDtl_sample) {
				DtlR r = getDtlL().get(index);
				if (isNullOr(r.bg_r(), r.bg_g(), r.bg_b())) {
					return defaultSampleBG(index, column, table, mode);
				}
				int color_r = r.bg_r().intValueExact();
				int color_g = r.bg_g().intValueExact();
				int color_b = r.bg_b().intValueExact();
				if (color_r > 255 || color_g > 255 || color_b > 255 || color_r < 0
						|| color_g < 0 || color_b < 0) {
					return defaultSampleBG(index, column, table, mode);
				}
				return new Color(color_r, color_g, color_b);
			}
			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		public java.awt.Color getPriorFG(int index, MCColumnConfig column, MCTable table, 
				boolean selected, MCMode mode) {
			if (column == columnDtl_sample) {
				DtlR r = getDtlL().get(index);
				if (isNullOr(r.fg_r(), r.fg_g(), r.fg_b())) {
					return defaultSampleFG(index, column, table, selected, mode);
				}
				int color_r = r.fg_r().intValueExact();
				int color_g = r.fg_g().intValueExact();
				int color_b = r.fg_b().intValueExact();
				if (color_r > 255 || color_g > 255 || color_b > 255
						|| color_r < 0 || color_g < 0 || color_b < 0) {
					return defaultSampleFG(index, column, table, selected, mode);
				}
				return new Color(color_r, color_g, color_b);
			}
			return super.getPriorFG(index, column, table, selected, mode);
		}

		/**
		 * 色設定が無効の場合のサンプル列の背景色
		 * @param index テーブルの行
		 * @param column テーブルのカラムコンフィグ
		 * @param table テーブル
		 * @param mode モード
		 * @return
		 */
		protected Color defaultSampleBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			return Color.white;
		}

		/**
		 * 色の設定値が無効の場合のサンプル列の文字色
		 * @param index
		 * @param column
		 * @param table
		 * @param selected
		 * @param mode
		 * @return
		 */
		protected Color defaultSampleFG(int index, MCColumnConfig column,
				MCTable table, boolean selected, MCMode mode) {
			return Color.black;
		}

		@Override
		protected boolean isUpdMode() {
			return isSame(getStatus(), MOD_FIX_H);
		}
	}

	@Override
	protected boolean isUpdSts() {
		return isSame(getStatus(), UPD_FIX_H) || isSame(getStatus(), MOD_FIX_H);
	}
	
	@Override
	public String getUPDStatus() {
		return MOD_FIX_H;
	}

	/**集計行では入力不可関連のカラムコンフィグの配列*/
	protected MCColumnConfig[] _noSmlCols;
	protected MCColumnConfig[] getNoSmlCols(){
		if(_noSmlCols == null){
			_noSmlCols = new MCColumnConfig[]{
					columnDtl_cost_io_typ,
					columnDtl_asst_typ,
					columnDtl_std_flg,
					columnDtl_qty_unit_typ,
					columnDtl_alc_ac_grp_cd1,
					columnDtl_alc_ac_grp_cd2,
					columnDtl_alc_ac_grp_cd3,
					columnDtl_alc_ac_cd,
					columnDtl_ac_slip_typ,
					columnDtl_ac_rsn_cd,
					columnDtl_itm_jnl_cd,
					columnDtl_itm_grp_cd1,
					columnDtl_itm_grp_cd2,
					columnDtl_itm_grp_cd3,
					columnDtl_itm_grp_cd4,
					columnDtl_itm_grp_cd5,
					columnDtl_itm_grp_cd6,
					columnDtl_itm_grp_cd7,
					columnDtl_itm_grp_cd8,
					columnDtl_itm_grp_cd9,
					columnDtl_itm_grp_cd10,
					columnDtl_expns_typ,
					columnDtl_direct_typ,
					columnDtl_var_typ,
					columnDtl_expns_grp_cd,
					columnDtl_expns_cd
			};
		}
		return _noSmlCols;
	}
	/**配賦関連のカラムコンフィグの配列*/
	protected MCColumnConfig[] _alcAcCols;
	protected MCColumnConfig[] getAlcAcCols(){
		if(_alcAcCols == null){
			_alcAcCols = new MCColumnConfig[]{
					columnDtl_alc_ac_grp_cd1,
					columnDtl_alc_ac_grp_cd2,
					columnDtl_alc_ac_grp_cd3,
					columnDtl_alc_ac_cd
			};
		}
		return _alcAcCols;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_RPT_CONF));
	}

}