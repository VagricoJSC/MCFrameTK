package mcframe.clientMABG.MABGP0400;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_RptKeyConfReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_RptKeyConfReg_MC extends MABGP_RptKeyConfReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_RptKeyConfReg_MC() {
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
	public MABGP_RptKeyConfReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0400_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0400_Srch01Caller<P extends MABGP_RptKeyConfReg, B extends MA_MABGL0400_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0400_Srch01Caller(P p, B b) {
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
			getHdrR().rpt_key_cd(getCndR().rpt_key_cd());
			getHdrR().rpt_key_nm(getCndR().rpt_key_nm());
			getHdrR().rpt_key_typ(getCndR().rpt_key_typ());
			getHdrR().rpt_key_typ_nm(getCndR().rpt_key_typ_nm());
			setHdrItmGrpTyp();
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
	 * [MA_MABGL0400_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0400_Upd01Caller<P extends MABGP_RptKeyConfReg, B extends MA_MABGL0400_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0400_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setRptPtnCd(getDtlL());
		}
		
		protected void setRptPtnCd(MCList<DtlR> list) {
			String hdr = getHdrR().rpt_key_cd();
			for (DtlR row :getDtlL()) {
				if (row.check()) {
					row.rpt_key_cd(hdr);
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
			getCndR().rpt_key_cd(getHdrR().rpt_key_cd());
			getCndR().rpt_key_nm(getHdrR().rpt_key_nm());
			getCndR().rpt_key_typ(getHdrR().rpt_key_typ());
			getCndR().rpt_key_typ_nm(getHdrR().rpt_key_typ_nm());
			setHdrItmGrpTyp();
		}

	}

	/**
	 * [MA_MABGL0400_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0400_Del01Caller<P extends MABGP_RptKeyConfReg, B extends MA_MABGL0400_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0400_Del01Caller(P p, B b) {
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
		callMA_MABGL0400_Srch01();
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
		DtlR r = DtlTable.getSelectedMCRow();
		setItmGrpTyp(r);
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
		DtlR r = copyRow(DtlTable);
		if (r != null) {
			setItmGrpTyp(r);
		}
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABGL0400_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0400_Del01();
	}
	
	/**
	 * 登録枠の品目分類区分を設定する
	 */
	protected void setHdrItmGrpTyp() {
		String itmGrpTyp = null;
		String rptKeyTyp = getHdrR().rpt_key_typ();
		MAC_RPT_KEY_TYP typ = MAC_RPT_KEY_TYP.getNE(rptKeyTyp);
		if (typ != null) {
			MAC_ITM_GRP_TYP itmGrp = MAC_ITM_GRP_TYP.getNE(typ.itm_grp());
			if (itmGrp != null) {
				itmGrpTyp = itmGrp.value();
			}
		}
		getHdrR().itm_grp_typ(itmGrpTyp);
	}
	
	/**
	 * 一覧の品目分類区分を設定する
	 */
	protected void setItmGrpTyp(DtlR r) {
		r.itm_grp_typ(getHdrR().itm_grp_typ());
	}
	
	
	//------------------ 初期設定 Start ------------------//
	@Override
	protected void valueInit(){
		super.valueInit();
		getCndR().this_term(getTerm(this));
	}

	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_rpt_key_seq, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_dpt_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_wg_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_itm_cd, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_itm_sub1, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_itm_sub2, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_itm_sub3, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_itm_jnl_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_itm_grp_cd, MCList.SortType.ASC);
	}
	@Override
	public void setOpenFocus() {
		// フォーカスはステータスで移動する
	}

	//------------------ 初期設定 End ------------------//

	//------------------ イベント Start ------------------//

	@Override
	public void doHdr_rpt_key_typ_LC(MCEventInfo info) {
		getDtlL().setStatus(Status.NONE);	// doHdr_rpt_key_cd_VCで既に一覧をクリアしてよいか確認されている
		clear(getDtlL());
		setDtlMode();
	}

	@Override
	public void doHdr_rpt_key_cd_LC(MCEventInfo info) {
		super.doHdr_rpt_key_cd_LC(info);
		String rptKeyCd = getHdrR().rpt_key_cd();
		String status = getStatus();
		if ((status == UPD) && !isNull(rptKeyCd)) {
			setUPD_FIX_HStatus();
		}
		else if ((status == UPD_FIX_H) && isNull(rptKeyCd)) {
			setUPDStatus();
		}
		setHdrItmGrpTyp();
	}

	@Override
	public boolean doHdr_rpt_key_cd_VC(MCEventInfo info) {
		MCRow mew = info.getNewListRow();
		String mewRptKeyTyp = null;
		if (mew != null) {
			mewRptKeyTyp = mew.getStringNE(RptKeyWithTypNotInRptKeyConfCols.$o_rpt_key_typ);
		}
		if (!isSame(mewRptKeyTyp, getHdrR().rpt_key_typ())) {
			if (!getDtlL().isStatusNone() && !confirmRegDataClear()) {
				return false;
			}
		}
		return super.doHdr_rpt_key_cd_VC(info);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		getDtlL().addListListener(new DtlListListener());
	}
	
	/**
	 * DtlTable用ListListenerクラスです。
	 */
	public class DtlListListener implements MCListListener {

		@Override
		public void rowAdded(MCListEvent event) {
			MCList <DtlR> tgtL = DtlTable.getList().subList(r -> isNull(r.itm_grp_typ()));
			for (DtlR dtlR : tgtL) {
				setItmGrpTyp(dtlR);
			}
		}

		@Override
		public void rowRemoved(MCListEvent event) {
		}

		@Override
		public void rowRemoved(MCListEvent[] events) {
		}

		@Override
		public void rowSet(MCListEvent event) {
		}

		@Override
		public void listSorted(MCListEvent event) {
		}

		@Override
		public void listCleared(MCListEvent event) {
		}
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		if (isUpdOpe()) {
			getDtlTable().setStatusColumnVisible(true);
			// 参照登録時、登録ユーザIDや更新カウンタ等を削除
			if (getStatus() == REF) {
				getHdrR().rpt_key_cd(null);
				getHdrR().rpt_key_nm(null);
				setRowStatusForIns(getDtlL());
				clearNotInheritInfo(getDtlL());
				setUPDStatus();
				fillSpace();
				setUPD_FIX_HStatus();
				
			}
			else {
				clearAll();
				getHdrR().clear();
				setUPDStatus();
				fillSpace();
			}
		}
		else {
			clearAll();
			setStatusByOpe();
			setMODStatus();
			moveFocusCndPanel();
		}
	}
	//------------------ イベント End ------------------//

	//------------------ ステータス Start ------------------//

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setDtlMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setUPD_FIX_HStatus() {
		super.setUPD_FIX_HStatus();
		setDtlMode();
		HdrPanel.focusFirstComponent();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setDtlMode();
		ScreenOpePanel.focusFirstComponent();
	}
	@Override
	public void setMODStatus() {
		super.setMODStatus();
		setDtlMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setMOD_FIX_HStatus() {
		super.setMOD_FIX_HStatus();
		setDtlMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setFIX_MStatus() {
		super.setFIX_MStatus();
		setDtlMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setDtlMode();
		DtlTable.selectLeftmostColumn(0);
	}
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setDtlMode();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setDtlMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setFIXStatus() {
		//ダミー
	}
	

	/**
	 * 明細テーブルのモードを設定する。
	 */
	protected void setDtlMode() {
		setDtlDefaultMode();
		String rptKeyTyp = getHdrR().rpt_key_typ();
		if (!MAC_RPT_KEY_TYP.isMNG_DPT(rptKeyTyp)) {
			columnDtl_dpt_cd.setMode(MCMode.INVISIBLE);
			columnDtl_dpt_nm.setMode(MCMode.INVISIBLE);
		}
		if (!MAC_RPT_KEY_TYP.isWG(rptKeyTyp)) {
			columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
			columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
		}
		if (!MAC_RPT_KEY_TYP.isITM(rptKeyTyp)) {
			Dtl_itm_p_PPanel.setINVISIBLEStatus();
		}
		if (!MAC_RPT_KEY_TYP.isITM_JNL(rptKeyTyp)) {
			columnDtl_itm_jnl_cd.setMode(MCMode.INVISIBLE);
			columnDtl_itm_jnl_nm.setMode(MCMode.INVISIBLE);
		}
		if (!isAnly(rptKeyTyp)) {
			columnDtl_itm_grp_cd.setMode(MCMode.INVISIBLE);
			columnDtl_itm_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * レポートキー区分が、品目分類１～１０かどうか
	 */
	protected boolean isAnly(String rptKeyTyp) {
		return MAC_RPT_KEY_TYP.isGRP1(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP2(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP3(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP4(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP5(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP6(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP7(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP8(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP9(rptKeyTyp)
				|| MAC_RPT_KEY_TYP.isGRP10(rptKeyTyp);
	}

	/**
	 * 明細テーブルのデフォルトモードを設定する。
	 */
	protected void setDtlDefaultMode() {
		MCColumnConfig[] cols = new MCColumnConfig[]{
				columnDtl_dpt_cd, columnDtl_dpt_nm,
				columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2,
				columnDtl_itm_sub3, columnDtl_itm_nm,
				columnDtl_itm_jnl_cd, columnDtl_itm_jnl_nm,
				columnDtl_itm_grp_cd, columnDtl_itm_grp_nm
		};
		for (MCColumnConfig col : cols) {
			setDefaultMode(col);
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

}