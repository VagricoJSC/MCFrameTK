package mcframe.clientMABG.MABGP0360;

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
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientMAUD.MAUDP0010.*;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_CostIoConfigReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_CostIoConfigReg_MC extends MABGP_CostIoConfigReg_MC_A implements IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	// 可変カラムの数
	protected int _MAX_ROW_NUM = 30;
	protected String _sampleStr;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_CostIoConfigReg_MC() {
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
	public MABGP_CostIoConfigReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0360_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0360_Srch01Caller<P extends MABGP_CostIoConfigReg, B extends MA_MABGL0360_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABGL0360_Srch01Caller(P p, B b) {
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
			getHdrR().cost_io_id(getCndR().cost_io_id());
			getHdrR().cost_io_nm(getCndR().cost_io_nm());
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
	 * [MA_MABGL0360_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0360_Upd01Caller<P extends MABGP_CostIoConfigReg, B extends MA_MABGL0360_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABGL0360_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setIoSeq(getDtlL());
			setCostIoId(getDtlL());
		}

		/**
		 * 表示順を連番となるように設定する。
		 * @param list
		 */
		protected void setIoSeq(MCList<DtlR> list) {
			int seq = 1;
			for (DtlR dtl : list) {
				if (!isNull(dtl.io_col_cd())) {
					dtl.io_seq(seq++);
				}
			}
		}

		protected void setCostIoId(MCList<DtlR> list) {
			MCNumber hdr = getHdrR().cost_io_id();
			for (DtlR row :getDtlL()) {
				if (row.check()) {
					row.cost_io_id(hdr);
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
			getCndR().cost_io_id(getHdrR().cost_io_id());
			getCndR().cost_io_nm(getHdrR().cost_io_nm());
		}
	}

	/**
	 * [MA_MABGL0360_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0360_Del01Caller<P extends MABGP_CostIoConfigReg, B extends MA_MABGL0360_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABGL0360_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_DStatus();
		}

	}

	// -- 画面起動時の設定（START）
	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_io_seq, SortType.ASC);
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
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(
			MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlTable) {
	 		conf.ignoreSortOrder(true);
	 		conf.ignoreTableSort(true);
	 	}
	 	return conf;
	}
	// -- 画面起動時の設定（END）

	// -- イベント処理（START）
	@Override
	public void doHdr_cost_io_id_LC(MCEventInfo info) {
		super.doHdr_cost_io_id_LC(info);

		MCNumber hdr = getHdrR().cost_io_id();
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

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_io_tgt_typ) {
			doDtl_io_tgt_typ_LC(info);
		}
		for (MCColumnConfig c : getFGColorColumnConfigs()) {
			if (lc == c) {
				doColor_LC(lc, info);
			}
		}
		for (MCColumnConfig c : getBGColorColumnConfigs()) {
			if (lc == c) {
				doColor_LC(lc, info);
			}
		}
	}

	@Override
	public void doDtl_io_tgt_typ_LC(MCEventInfo info) {
		super.doDtl_io_tgt_typ_LC(info);
		int index = info.getEventIndex();
		DtlR row = getDtlL().get(index);
		String ioSmlTyp = null;
		if (!isNull(row.io_tgt_typ()) && !MAC_IO_TGT_TYP.is_slip(row.io_tgt_typ())) {

			ioSmlTyp = MAC_IO_SML_TYP.IO_TGT.value();
		}
		setValueEx(columnDtl_io_sml_typ, index, ioSmlTyp);
		// 総平均単価選択時は差額計算区分は１（対象外）固定
		if(MAC_IO_TGT_TYP.isAVE(row.io_tgt_typ())){
			setValueEx(columnDtl_bal_calc_typ, index, MAC_BAL_CALC_TYP.NON.value());
		}
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setOpenButtonMode();
	}

	@Override
	public void doDtl_io_col_cd_LC(MCEventInfo info) {
		super.doDtl_io_col_cd_LC(info);
		setOpenButtonMode();
	}

	protected void doColor_LC(MCLCBeans lc, MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setSampleStr(r);
	}

	protected void setSampleStr(DtlR r) {
		if (isNullAnd(r.bg_r(), r.bg_g(), r.bg_b(), r.fg_r(), r.fg_g(), r
				.fg_b())) {
			r.sample(null);
		}
		r.sample(getSampleStr());
	}

	protected String getSampleStr() {
		if (_sampleStr == null) {
			_sampleStr = "sample";
		}
		return _sampleStr;
	}

	protected MCColumnConfig[] getFGColorColumnConfigs() {
		return new MCColumnConfig[]{columnDtl_fg_r, columnDtl_fg_g, columnDtl_fg_b, columnDtl_fg_color};
	}

	protected MCColumnConfig[] getBGColorColumnConfigs() {
		return new MCColumnConfig[]{columnDtl_bg_r, columnDtl_bg_g, columnDtl_bg_b, columnDtl_bg_color};
	}

	// -- ボタン押下時の処理（START）

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABGL0360_Srch01();
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
		// 追加行は３０行まで
		if(getDtlL().size() == _MAX_ROW_NUM) return;

		insertRow(DtlTable);
		setRAddButtonMode();
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
		setRAddButtonMode();
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		// 追加行は３０行まで
		if(getDtlL().size() == _MAX_ROW_NUM) return;
		DtlR r = copyRow(DtlTable);
		setRAddButtonMode();

		// 追加行は無条件で新規作成ステータス
		if(!isNull(r))r.setStatus(Status.CREATE);
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
		callMA_MABGL0360_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0360_Del01();
	}
	/**
	 * Panel[Btn]のボタン[open_MABGP0370]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABGP0370(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0370");
		aso.runValueInit();
		aso.putCnd(crtOpenMABGP0370CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABCP1030]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABG.MABGP0370.CndR crtOpenMABGP0370CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABG.MABGP0370.CndR to =
			mcframe.clientMABG.MABGP0370.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.cost_io_id(fr.cost_io_id());
			to.io_col_cd(fr.io_col_cd());
		}
		return to;
	}

	// -- ステータス（START）
	protected void setRAddButtonMode() {
		if (getDtlL().size() >= _MAX_ROW_NUM) {
			DtlBtn_radd.setMode(MCMode.DISABLE);
			DtlBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(DtlBtn_radd);
			setDefaultMode(DtlBtn_rcopy);
		}
	}

	protected void setOpenButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null
				|| isNull(r.io_col_cd())
				|| isNull(getHdrR().cost_io_id())) {
			Btn_open_MABGP0370.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MABGP0370);
		}
	}
	// -- ステータス（END）

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

	/**
	 * 操作種別変更時の処理
	 */
	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		String bfSt = this.getStatus();
		String bfOpe = (String)info.getOldValue();
		String afOpe = (String)info.getNewValue();

		setValueEx(Hdr_cost_io_id, null);

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

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}

	protected class DtlCellConfig extends MAUDP_LCLRLBaseCellConfig {

		public DtlCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {


			// 非表示のカラムはモードを変更しない
			if (MCMode.INVISIBLE_STATUS == column.getModeInfo().getStatus()) {
				return super.getPriorMode(index, column, table);
			}
			return getPriorModeSub(index, column, table);
		}

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

		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 * @param index
		 * @param column
		 * @param table
		 * @return 
		 */
		@SuppressWarnings("unchecked")
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			if (isUpdSts()) {
				DtlR dtl = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_io_sml_typ) {
					if(!MAC_IO_TGT_TYP.is_slip(dtl.io_tgt_typ())){
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_bal_calc_typ) {
					if(MAC_IO_TGT_TYP.isAVE(dtl.io_tgt_typ())){
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
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

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_COST_IO_CONF));
	}

}