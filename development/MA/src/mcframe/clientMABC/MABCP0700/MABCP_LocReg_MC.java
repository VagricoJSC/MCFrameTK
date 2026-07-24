package mcframe.clientMABC.MABCP0700;

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
import mcframe.clientMAUB.MAUBP5010.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import java.util.Arrays;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_LocReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_LocReg_MC extends MABCP_LocReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**行ＮＯ（DtlStrLn行とLclStrLn行の関連付け）*/
	protected static final String _STR_LN_DTL_ROW_NO_COL_NM = "str_ln_dtl_row_no";

	/**行ＮＯ（DtlStrLn行とLclStrLn行の関連付け）*/
	protected MCNumber _StrLnDtlRowNo;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_LocReg_MC() {
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
	public MABCP_LocReg_MC(String name) {
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
		callMA_MABCL0700_Upd01();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0700_Srch01();
	}
	/**
	 * [MA_MABCL0700_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0700_Srch01Caller<P extends MABCP_LocReg, B extends MA_MABCL0700_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0700_Srch01Caller(P p, B b) {
			super(p, b);
		}
		

		protected void adjustList() {
			super.adjustList();
			DtlStrLnTable.adjustWidth();
			DtlLocSubTable.adjustWidth();
			LclStrLnTable.adjustWidth();
		}

		@Override
		protected void clear() {
			super.clear();
			getDtlStrLnL().clear();
			getDtlLocSubL().clear();
			getLclStrLnL().clear();
		}

		@Override
		protected void show() {
			for (DtlR r : bridge.down0()) {
				r.old_str_ln_tgt_flg(r.str_ln_tgt_flg());

				// 検索結果を保持しておく
				// 「check_**_dpt_cd」項目：更新前に画面の値と比較して変更されていたら変更値、それ以外はnullを設定
				r.check_asst_dpt_cd(r.asst_dpt_cd());
				r.check_sls_dpt_cd(r.sls_dpt_cd());
			}

			super.show();
			setDtlStrLnRowNoAll();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0700_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0700_Upd01Caller<P extends MABCP_LocReg, B extends MA_MABCL0700_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0700_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			super.checkDuplicate(msgList);
			checkDuplicateMain(msgList, DtlStrLnTable);
			checkDuplicateMain(msgList, DtlLocSubTable);
			checkDuplicateMain(msgList, LclStrLnTable);
		}
		@Override
		protected void setPickedListMap() {
			refreshDtlStrLnAllL();
			refreshDtlLocSubAllL();
			refreshLclStrLnAllL();
			super.setPickedListMap();
		}
		@Override
		protected void statusClear() {
			super.statusClear();
			DtlStrLnTable.getList().setStatus(MCRow.NONE);
			DtlLocSubTable.getList().setStatus(MCRow.NONE);
			LclStrLnTable.getList().setStatus(MCRow.NONE);
		}

		MCList<DtlR> _upBk = MCList.create(DtlR.class);
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			_upBk=bridge.up0().clone();
			for (DtlR r : bridge.up0()) {
				// 部門が変更されたときのみ、「check_**_dpt_cd」に設定して、サーバ側で存在チェック
				setCheckDpt(r, DtlR.$asst_dpt_cd, DtlR.$check_asst_dpt_cd);
				setCheckDpt(r, DtlR.$sls_dpt_cd, DtlR.$check_sls_dpt_cd);
			}
		}

		@Override
		protected void handleMCEx(MCException ex) {
			MCIndexKey index = bridge.up0().createIndex(DtlR.$loc_cd);
			for (DtlR r : _upBk) {
				DtlR first = bridge.up0().getFirst(index, r.loc_cd());
				first.check_asst_dpt_cd(r.check_asst_dpt_cd());
				first.check_sls_dpt_cd(r.check_sls_dpt_cd());
			}
			super.handleMCEx(ex);
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
	}

	/**
	 * [MA_MABCL0700_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0700_Del01Caller<P extends MABCP_LocReg, B extends MA_MABCL0700_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0700_Del01Caller(P p, B b) {
			super(p, b);
		}
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
		DtlR r = copyRow(DtlTable);
		if (isNull(r)) return;
		
		r.check_asst_dpt_cd(null);
		r.check_sls_dpt_cd(null);
	}
	/**
	 * Panel[DtlBtnStrLn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnStrLn_select_all(MCEventInfo info) {
		doSelectAll(DtlStrLnTable);
	}
	/**
	 * Panel[DtlBtnStrLn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnStrLn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlStrLnTable);
	}
	/**
	 * Panel[DtlBtnStrLn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtnStrLn_radd(MCEventInfo info) {
		insertRow(DtlStrLnTable);
	}
	/**
	 * Panel[DtlBtnStrLn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtnStrLn_rdel(MCEventInfo info) {
		deleteRow(DtlStrLnTable);
	}
	/**
	 * Panel[DtlBtnStrLn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtnStrLn_rcopy(MCEventInfo info) {
		copyRow(DtlStrLnTable);
	}
	/**
	 * Panel[DtlBtnLocSub]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnLocSub_select_all(MCEventInfo info) {
		doSelectAll(DtlLocSubTable);
	}
	/**
	 * Panel[DtlBtnLocSub]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtnLocSub_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlLocSubTable);
	}
	/**
	 * Panel[DtlBtnLocSub]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtnLocSub_radd(MCEventInfo info) {
		insertRow(DtlLocSubTable);
	}
	/**
	 * Panel[DtlBtnLocSub]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtnLocSub_rdel(MCEventInfo info) {
		deleteRow(DtlLocSubTable);
	}
	/**
	 * Panel[DtlBtnLocSub]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtnLocSub_rcopy(MCEventInfo info) {
		copyRow(DtlLocSubTable);
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
	 * Panel[LclBtnStrLn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtnStrLn_select_all(MCEventInfo info) {
		doSelectAll(LclStrLnTable);
	}
	/**
	 * Panel[LclBtnStrLn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtnStrLn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclStrLnTable);
	}
	/**
	 * Panel[LclBtnStrLn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtnStrLn_radd(MCEventInfo info) {
		insertRow(LclStrLnTable);
	}
	/**
	 * Panel[LclBtnStrLn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtnStrLn_rdel(MCEventInfo info) {
		deleteRow(LclStrLnTable);
	}
	/**
	 * Panel[LclBtnStrLn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtnStrLn_rcopy(MCEventInfo info) {
		copyRow(LclStrLnTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0700_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0700_Del01();
	}
	@Override
	public MCList<? extends MCConstRow> getLclAllL() {
		// 場所マスタ(ロケール別情報)の一覧を返す
		return getLocLclAllL();
	}


	// 場所を変更した際のイベント処理（ここから） ///////////////////////////////////////////////
	/**
	 * Dtl のRowListennerに変更があったときの処理
	 */
	@Override
	protected void dtlRowValueChanged(MCRowEvent event) {
		super.dtlRowValueChanged(event);

		if (!isCheckColumn(event)) {
			// DtlStrLn
			setKeyChangeToDtlStrLn(event);
			setDtlStrLnDelFlgOn(event);
			// DtlLocSub
			setKeyChangeToDtlLocSub(event);
			//　DtlStrLn及び、LclStrLnボタンのモード制御
			setModeBtnStrLn();
		}
		else {
			// DtlStrLn
			setAllDtlStrLnCheckOff(event);
			// DtlLocSub
			setAllDtlLocSubCheckOff(event);
		}
	}
	
	/* 場所 ⇒ 棚・ラインの対応  */
	/**
	 * Dtl のイベント行のキー項目に変更があった場合、DtlStrLnの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToDtlStrLn(MCRowEvent event) {
		String eventCol = event.getColumn();
		
		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow strLnR : getStrLnListForDtlR(dtlR)) {
				strLnR.setValueNE(col, dtlR.getValueNE(col));
				if (strLnR.isStatusNone() && !isNull(strLnR.getValueNE(getUpdCntrColumn()))) {
					strLnR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	/**
	 * Dtl のイベント行の設定値に応じ、DtlStrLnの論理削除をＯＮにする
	 */
	protected void setDtlStrLnDelFlgOn(MCRowEvent event) {
		if(!isSame(event.getColumn(), DtlR.$del_flg) && !isSame(event.getColumn(), DtlR.$str_ln_tgt_flg)){
			return;
		}

		DtlR dtlR = (DtlR)event.getSourceRow();

		for (DtlStrLnR r : getDtlStrLnL()) {
			if (!dtlR.str_ln_tgt_flg() && !r.del_flg() && (!isNull(r.upd_cntr()) || !r.isStatusNone())) {
				r.del_flg(true);
				r.setStatus(MCRow.MODIFY);
			}
		}
	}
	/**
	 * Dtl のイベント行の「選択」項目がオフのとき、対応する全ての DtlStrLn の「選択」項目をオフにする
	 */
	protected void setAllDtlStrLnCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == getDtlTable().getSelectedMCRow()) {
			getDtlStrLnL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getStrLnListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	/**
	 * Dtl行に関連付けられたLocSubcreateIndex行のリストを返す。
	 */
	protected MCList<DtlStrLnR> getStrLnListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getStrLnAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<DtlStrLnR> strLnL = getStrLnAllL().subList(idxkey, no);
		return strLnL;
	}
	

	/* 場所 ⇒ 場所補助の対応  */
	/**
	 * Dtl のイベント行のキー項目に変更があった場合、DtlLocSubの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToDtlLocSub(MCRowEvent event) {
		String eventCol = event.getColumn();

		if (Arrays.asList(getDtlRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow locsubR : getLocSubListForDtlR(dtlR)) {
				locsubR.setValueNE(col, dtlR.getValueNE(col));
				if (locsubR.isStatusNone() && !isNull(locsubR.getValueNE(getUpdCntrColumn()))) {
					locsubR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	/**
	 * DtlLoc のイベント行の「選択」項目がオフのとき、対応する全ての LoCsub の「選択」項目をオフにする
	 */
	protected void setAllDtlLocSubCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == DtlLocSubTable.getSelectedMCRow()) {
			getLocSubAllL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getLocSubListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	/**
	 * Dtl行に関連付けられたLocSubcreateIndex行のリストを返す。
	 */
	protected MCList<DtlLocSubR> getLocSubListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlRowNo(dtlR);
		MCIndexKey idxkey = getLocSubAllL().createIndex(DTL_ROW_NO_COL_NM);
		MCList<DtlLocSubR> locSubL = getLocSubAllL().subList(idxkey, no);
		return locSubL;
	}
	// 場所を変更した際のイベント処理（ここまで） ///////////////////////////////////////////////
	// 棚・ラインを変更した際のイベント処理（ここから） ///////////////////////////////////////////////
	protected MCRowListener createStrLnRowListener() {
		return new StRLnRowListener();
	}
	
	protected class StRLnRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			if (isDtlRowNoColumn(event)) {
				return ;
			}
			if (isStrLnDtlRowNoColumn(event)) {
				return ;
			}
			StrLnRowValueChanged(event);
		}
	}

	/**
	 * Lcl のRowListennerに変更があったときの処理
	 */
	protected void StrLnRowValueChanged(MCRowEvent event) {

		if (!isCheckColumn(event)) {
			setCheckValue(event, true);
			// 棚・ライン（ロケール）
			setKeyChangeToLclStrLn(event);
		}
		else {
			// 棚・ライン（ロケール）
			setAllLclStrLnCheckOff(event);
		}

		addCheckedDtlStrLnRowToAll(event);
		setKeyChangeToLclStrLn(event);
	}

	
	/* 棚・ライン ⇒ 棚・ライン(All)の対応 */

	/**
	 * LclStrLnイベント行の選択がオンのとき、LclStrLnAllL に存在しないものを追加する
	 * その際、dtlStrLnR のキー項目をコピーする
	 */
	protected void addCheckedDtlStrLnRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof DtlStrLnR)){
			return;
		}
		DtlStrLnR strLnR = (DtlStrLnR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);

		if (strLnR.getBooleanNE(getCheckColumn())) {
			if (!getStrLnAllL().contains(strLnR)) {
				getStrLnAllL().add(strLnR);
				strLnR.loc_cd(dtlR.loc_cd());
				strLnR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	/* 棚・ライン ⇒棚・ライン(ロケール)対応 */



	/**
	 * Dtl のイベント行のキー項目に変更があった場合、LclStrLnの「選択」がオンのレコードに反映する
	 */
	protected void setKeyChangeToLclStrLn(MCRowEvent event) {
		String eventCol = event.getColumn();

		if (Arrays.asList(getStrLnRKeyColumns()).contains(eventCol)) {
			MCConstRow dtlR = event.getSourceRow();

			String col = getAliasCol(eventCol, dtlR);

			for (MCConstRow lclR : getLclStrLnListForDtlR(dtlR)) {
				lclR.setValueNE(col, dtlR.getValueNE(col));
				if (lclR.isStatusNone() && !isNull(lclR.getValueNE(getUpdCntrColumn()))) {
					lclR.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	/**
	 * DtlStrLn のイベント行の「選択」項目がオフのとき、対応する全ての LclStrLn の「選択」項目をオフにする
	 */
	protected void setAllLclStrLnCheckOff(MCRowEvent event) {
		MCConstRow r = event.getSourceRow();

		if (r == null || r.getBooleanNE(getCheckColumn())
				|| !isNull(r.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			return;
		}

		if (r == LclStrLnTable.getSelectedMCRow()) {
			getLclStrLnAllL().setBoolean(getCheckColumn(), false);
		}
		else {
			MCList<? extends MCConstRow> l = getLclStrLnListForDtlR(r);
			l.setBoolean(getCheckColumn(), false);
		}
	}
	/**
	 * Dtl行に関連付けられたLclStrLncreateIndex行のリストを返す。
	 */
	protected MCList<LclStrLnR> getLclStrLnListForDtlR(MCConstRow dtlR) {
		MCNumber no = getDtlStrLnRowNo(dtlR);
		if (isNull(no)) {
			return MCList.create(LclStrLnR.class);
		}
		MCIndexKey idxkey = getLclStrLnAllL().createIndex(_STR_LN_DTL_ROW_NO_COL_NM);
		MCList<LclStrLnR> LclStrLnL = getLclStrLnAllL().subList(idxkey, no);
		return LclStrLnL;
	}
	// 棚・ラインを変更した際のイベント処理（ここまで） ///////////////////////////////////4////////////
	// 場所補助 ⇒ 場所の対応（ここから） ///////////////////////////////////////////////
	protected MCRowListener createLocSubRowListener() {
		return new LocSubRowListener();
	}
	
	protected class LocSubRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			// 変更があった場合に「選択」項目をオンにする
			if (!isCheckColumn(event)) {
				setCheckValue(event, true);
			}
			
			addCheckedDtlLocSubRowToAll(event);
			setCheckValueDtl(event);
		}
	}
	/**
	 * LocSubイベント行の選択がオンのとき、LocSubAllL に存在しないものを追加する
	 * その際、dtlR のキー項目をコピーする
	 */
	protected void addCheckedDtlLocSubRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof DtlLocSubR)){
			return;
		}
		DtlLocSubR locSubR = (DtlLocSubR) sourceR;

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlRowNo(dtlR);
		MCList<DtlLocSubR> locSubAllL = getLocSubAllL();

		if (locSubR.getBooleanNE(getCheckColumn())) {
			if (!getLocSubAllL().contains(locSubR)) {
				locSubAllL.add(locSubR);
				locSubR.loc_cd(dtlR.loc_cd());
				locSubR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	// 場所補助 ⇒ 場所の対応（ここまで） ///////////////////////////////////////////////
	// 棚・ライン(ロケール) ⇒ 棚・ライン対応（ここから） ///////////////////////////////////////////////
	protected MCRowListener createLclStrLnRowListener() {
		return new LclStrLnRLRowListener();
	}
		protected class LclStrLnRLRowListener implements MCRowListener {
		public void valueChanged(MCRowEvent event) {

			// 変更があった場合に「選択」項目をオンにする
			if (!isCheckColumn(event)) {
				setCheckValue(event, true);
			}
			
			addCheckedLclStrLnRowToAll(event);
			setCheckValueDtlStrLn(event);
		}
	}
	
	/**
	 * LclStrLnイベント行の選択がオンのとき、LclStrLnAllL に存在しないものを追加する
	 * その際、dtlStrLnR のキー項目をコピーする
	 */
	protected void addCheckedLclStrLnRowToAll(MCRowEvent event) {
		MCConstRow sourceR = event.getSourceRow();
		if(!(sourceR instanceof LclStrLnR)){
			return;
		}
		LclStrLnR lclR = (LclStrLnR) sourceR;

		DtlStrLnR dtlR = DtlStrLnTable.getSelectedMCRow();
		
		if (dtlR == null) {
			return ;
		}
		MCNumber no = getDtlStrLnRowNo(dtlR);
		MCList<LclStrLnR> lclStrLnAllL = getLclStrLnAllL();

		if (lclR.getBooleanNE(getCheckColumn())) {
			if (!getLclStrLnAllL().contains(lclR)) {
				lclStrLnAllL.add(lclR);
				lclR.loc_cd(dtlR.loc_cd());
				lclR.str_ln_cd(dtlR.str_ln_cd());
				lclR.setNumberNE(_STR_LN_DTL_ROW_NO_COL_NM, no);
			}
		}
	}

	/**
	 * イベント行(LclStrLn)がオンになったとき、対応する行(DtlStrLn)が未登録なら「選択」項目をオンにする
	 */
	protected void setCheckValueDtlStrLn(MCRowEvent event) {
		MCConstRow lclR = event.getSourceRow();
		if (lclR.getBoolean(getCheckColumn())) {

			MCConstRow r = DtlStrLnTable.getSelectedMCRow();
			if (r != null && r.getValueNE(getRLUtil().getUpdCntrColumn()) == null
					&& (r.isStatusNone() || r.isStatusCreate())) {
				r.setBoolean(getCheckColumn(), true);
			}
		}
	}
	// 棚・ライン(ロケール) ⇒ 棚・ライン対応（ここまで） ///////////////////////////////////////////////
	
	// -- ボタン処理 -------------------------------------------
	/**
	 * DtlStrLnの行削除のとき、LclStrLnAllから関連する行を全て削除する
	 * LclStrLnの行削除のとき、LclStrLnAllから該当行を削除する
	 */
	@Override
	public <E extends MCConstRow> E deleteRow(MCTable<E> table) {
		if (table == getDtlTable()) {
			DtlLocSubTable.clear();
			LclTable.clear();
			LclStrLnTable.clear();
			DtlStrLnTable.clear();
		}
		if (table == DtlStrLnTable) {
			LclStrLnTable.clear();
		}

		E delR = super.deleteRow(table);

		if (table == getDtlTable() && delR != null) {
			MCList<DtlStrLnR> l = getStrLnListForDtlR(delR);
			for (DtlStrLnR r : l) {
				getLclStrLnAllL().removeAll(getLclStrLnListForDtlR(r));
			}
			getStrLnAllL().removeAll(getStrLnListForDtlR(delR));
			getLocSubAllL().removeAll(getLocSubListForDtlR(delR));
		}
		if (table == DtlLocSubTable && delR != null) {
			getLocSubAllL().remove(delR);
		}
		if (table == DtlStrLnTable && delR != null) {
			getStrLnAllL().remove(delR);
			getLclStrLnAllL().removeAll(getLclStrLnListForDtlR(delR));
		}
		if (table == LclStrLnTable && delR != null) {
			getLclStrLnAllL().remove(delR);
		}
		return delR;
	}

	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == DtlTable) {
			// 行コピーで場所一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclTable, getLclRKeyColumns());
			checkDuplicate(msgList, DtlStrLnTable, getStrLnRKeyColumns());
			checkDuplicate(msgList, LclStrLnTable, getLclStrLnRKeyColumns());
			checkDuplicate(msgList, DtlLocSubTable, getLocSubRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}
		if (t == DtlStrLnTable) {
			// 行コピーで棚・ライン一覧の選択行が変更される前に、関連一覧に重複行が無いかチェック
			MCMessageList msgList = new MCMessageList();
			checkDuplicate(msgList, LclStrLnTable, getLclStrLnRKeyColumns());
			if (msgList.size() > 0) {
				message(msgList);
				return null;
			}
		}
		return super.copyRow(t);
	}
	
	/**
	 * 行コピー時にカウントアップしたDtlStrLn行ＮＯをセットする。
	 */
	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E dest = super.copyRowSub(row);
		if (dest != null && getDtlStrLnL().contains(dest)) {
			MCNumber no = getCntDtlStrLnRowNo();
			row.setNumberNE(_STR_LN_DTL_ROW_NO_COL_NM, no);
			DtlBtnStrLn_rdel.setMode(this, getStatus());
			LclStrLnTable.clear();
			LclStrLnTable.fillSpace();
			LclStrLnTable.adjustWidth();
			LclStrLnTable.selectLeftmostColumn(0);
		}
		if (dest != null && getLclStrLnL().contains(dest)) {
			LclBtnStrLn_rdel.setMode(this, getStatus());
		}
		if (dest != null && getDtlLocSubL().contains(dest)) {
			DtlBtnLocSub_rdel.setMode(this, getStatus());
		}
		if (dest != null && getDtlL().contains(dest)) {
			DtlBtnStrLn_rdel.setMode(this, getStatus());
			DtlBtnLocSub_rdel.setMode(this, getStatus());
			LclBtnStrLn_rdel.setMode(this, getStatus());
		}
		return dest;
	}

	// -- イベント処理 -------------------------------------------
	/*
	 * @see mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase_FW#listenerInit()
	 */
	@Override
	protected void listenerInit() {
		super.listenerInit();

		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(DtlStrLnTable, createStrLnRowListener());
		setListListener(LclStrLnTable, createLclStrLnRowListener());
		setListListener(DtlLocSubTable, createLocSubRowListener());

		// NCイベント
		DtlLocSub_dt_PPanel.columnDt_st_dt.addNCListener(this);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		getStrLnAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		getLocSubAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
		getLclStrLnAllL().setNumberNE(DTL_ROW_NO_COL_NM, null);
	}
	/**
	 * 各テーブル間の紐付け用に行ＮＯをセット。
	 * <P>検索直後に一度呼ばれる。</P>
	 */
	@Override
	protected void setDtlRowNoAll() {
		String[] keyCols = null;
		if (getDtlL().size() > 0) {
			keyCols = getAliasCols(getDtlRKeyColumns(), getDtlL().get(0));
		}
		MCIndexKey idxkey = getLclAllL().createIndex(keyCols);
		MCIndexKey strLnIdxkey = getStrLnAllL().createIndex(keyCols);
		MCIndexKey subIdxkey = getLocSubAllL().createIndex(keyCols);

		for (MCConstRow dtlR : getDtlL()) {
			MCNumber no = getCntDtlRowNo();
			dtlR.setNumberNE(DTL_ROW_NO_COL_NM, no);

			// 場所（ロケール）
			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclAllL().subList(idxkey, binds);
			for (MCConstRow lclR : l) {
				lclR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			// 棚・ライン
			l = getStrLnAllL().subList(strLnIdxkey, binds);
			for (MCConstRow strLnR : l) {
				strLnR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
			
			// 場所補助
			l = getLocSubAllL().subList(subIdxkey, binds);
			for (MCConstRow lclR : l) {
				lclR.setNumberNE(DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	/**
	 * 棚・ラインとそのLCLの紐付け用に行ＮＯをセット。
	 * <P>検索直後に一度呼ばれる。</P>
	 */
	protected void setDtlStrLnRowNoAll() {
		
		// DtlLocSubテーブル
		String[] keyCols = null;
		if (getStrLnAllL().size() > 0) {
			keyCols = getAliasCols(getStrLnRKeyColumns(), getStrLnAllL().get(0));
		}
		MCIndexKey idxkey = getLclStrLnAllL().createIndex(keyCols);

		for (MCConstRow dtlR : getStrLnAllL()) {
			MCNumber no = getCntDtlStrLnRowNo();
			dtlR.setNumberNE(_STR_LN_DTL_ROW_NO_COL_NM, no);

			Comparable<?>[] binds = new Comparable<?>[keyCols.length];
			for (int i = 0; i < keyCols.length; i++) {
				binds[i] = dtlR.getValue(keyCols[i]);
			}
			MCList<? extends MCConstRow> l = getLclStrLnAllL().subList(idxkey, binds);
			for (MCConstRow lclR : l) {
				lclR.setNumberNE(_STR_LN_DTL_ROW_NO_COL_NM, no);
			}
		}
	}
	
	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		setValueEx(columnDtl_loc_grp_cd, info.getEventIndex(), null);
	}
	
	@Override
	public void doDtl_sppl_cd_LC(MCEventInfo info) {
		super.doDtl_sppl_cd_LC(info);
		
		int idx = info.getEventIndex();
		if (idx < 0) return ;
		DtlR r = getDtlL().get(idx);

		if (isNull(r.sppl_cd())){
			setValueEx(columnDtl_maker_cd, idx, null);
			setValueEx(columnDtl_pre_outsrc_act_flg, idx, false);
			setValueEx(columnDtl_ddlv_prov_insp_flg, idx, false);
		}
		else {
			setValueEx(columnDtl_loc_mng_typ, idx, MAC_LOC_MNG_TYP.PRD.value());
			setValueEx(columnDtl_lg_def_flg, idx, false);
		}
	}

	@Override
	public void doDtl_addr_flg_NC(MCEventInfo info) {
		super.doDtl_addr_flg_NC(info);

		int idx = info.getEventIndex();
		if (idx < 0) return ;
		DtlR r = getDtlL().get(idx);

		if (!r.addr_flg())  {
			setValueEx(columnDtl_zip_cd, idx, null);
			setValueEx(columnDtl_addr1, idx, null);
			setValueEx(columnDtl_addr2, idx, null);
			setValueEx(columnDtl_addr3, idx, null);
			setValueEx(columnDtl_addr4, idx, null);
		}
	}

	@Override
	public void doDtl_stktk_tgt_flg_NC(MCEventInfo info) {
		super.doDtl_stktk_tgt_flg_NC(info);
		
		int idx = info.getEventIndex();
		if (idx < 0) return ;
		DtlR r = getDtlL().get(idx);
		
		if (!r.stktk_tgt_flg()){
			setValueEx(columnDtl_stktk_tor_disp_flg, idx, false);
			setValueEx(columnDtl_stktk_tor_ex_zero_flg, idx, false);
			setValueEx(columnDtl_stktk_act_ex_zero_flg, idx, false);
			setValueEx(columnDtl_stktk_amt_flg, idx, false);
		}
	}
	@Override
	public void doDtl_asst_dpt_cd_LC(MCEventInfo info) {
		super.doDtl_asst_dpt_cd_LC(info);

		int idx = info.getEventIndex();
		if (idx < 0) return ;
		DtlR r = getDtlL().get(idx);

		if (isNull(r.upd_cntr()) && !isNull(r.wg_cd_dpt())) {
			if (r.lg_flg() || r.mfg_flg()) {
				setValueEx(columnDtl_wg_cd, idx, r.wg_cd_dpt());
			}
		}
	}

	@Override
	public void doDtlStrLn_NC(MCEventInfo info) {
		super.doDtlStrLn_NC(info);
		
		doDtlStrLnTableNC(info);
		
		int idx = info.getEventIndex();
		if (idx < 0) return ;

		MCConstRow row = getDtlStrLnL().get(idx);
		DtlR dtlR = DtlTable.getSelectedMCRow();

		if (row == null
				|| !(getStatus().equals(getUPDStatus()) || getStatus().equals(
						getUPD_ADMINStatus()))) {
			DtlBtnStrLn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))
				|| (dtlR != null && !dtlR.str_ln_tgt_flg())) {
			DtlBtnStrLn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			DtlBtnStrLn_rdel.setMode(this, getStatus());
		}
	}

	@Override
	public void doLclStrLn_NC(MCEventInfo info) {
		super.doLclStrLn_NC(info);

		int idx = info.getEventIndex();
		if (idx < 0) return ;

		MCConstRow row = getLclStrLnL().get(idx);
		DtlR dtlR = DtlTable.getSelectedMCRow();

		if (row == null
				|| !(getStatus().equals(getUPDStatus()) || getStatus().equals(
						getUPD_ADMINStatus()))) {
			LclBtnStrLn_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))
				|| (dtlR != null && !dtlR.str_ln_tgt_flg())) {
			LclBtnStrLn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			LclBtnStrLn_rdel.setMode(this, getStatus());
		}
	}

	@Override
	public void doDtlLocSub_NC(MCEventInfo info) {
		super.doDtlLocSub_NC(info);

		int idx = info.getEventIndex();
		if (idx < 0) return ;

		MCConstRow row = getDtlLocSubL().get(idx);

		if (row == null
				|| !(getStatus().equals(getUPDStatus()) || getStatus().equals(
						getUPD_ADMINStatus()))) {
			DtlBtnLocSub_rdel.setMode(this, getStatus());
		}
		else if (!isNull(row.getValueNE(getRLUtil().getUpdCntrColumn()))) {
			DtlBtnLocSub_rdel.setMode(MCMode.DISABLE);
		}
		else {
			DtlBtnLocSub_rdel.setMode(this, getStatus());
		}
	}
	
	/**
	 * Dtlテーブル変更時の処理
	 */
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);

		if (info.getEventIndex() < 0) return ;
		refreshDtlLocSubAllL();
		refreshDtlStrLnAllL();
		
		DtlR r = DtlTable.getSelectedMCRow();

		// Dtl の選択行のキー項目と一致するレコードを DtlStrLnAllL から取得して DtlStrLnTableに表示
		MCList<DtlStrLnR> l1 = getStrLnListForDtlR(r);
		getDtlStrLnL().setAll(l1);
		sort(DtlStrLnTable);
		DtlStrLnTable.fillSpace();
		DtlStrLnTable.adjustWidth();
		DtlStrLnTable.selectRowNoFocus(0);


		// Dtl の選択行のキー項目と一致するレコードを DtlLocSubAllL から取得して LclTableに表示
		MCList<DtlLocSubR> l2 = getLocSubListForDtlR(r);
		getDtlLocSubL().setAll(l2);
		sort(DtlLocSubTable);
		DtlLocSubTable.fillSpace();
		DtlLocSubTable.adjustWidth();
		DtlLocSubTable.selectRowNoFocus(0);
		
		//　DtlStrLn及び、LclStrLnボタンのモード制御
		setModeBtnStrLn();
	}
	
	/**
	 * DtlStrLn一覧ボタン及び、LclStrLn一覧ボタンのモード制御をする
	 */
	protected void setModeBtnStrLn(){
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && r.str_ln_tgt_flg() && !isDelOpe() && !isRefOpe()) {
			DtlBtnStrLn_deselect_all.setMode(MCMode.ENABLE);
			DtlBtnStrLn_select_all.setMode(MCMode.ENABLE);
			DtlBtnStrLn_radd.setMode(MCMode.ENABLE);
			
			if (!getDtlStrLnL().isEmpty() && 
					!isNull(getDtlStrLnL().getValueNE(0, getRLUtil().getUpdCntrColumn()))) {
				DtlBtnStrLn_rdel.setMode(MCMode.DISABLE);
			}
			else{
				DtlBtnStrLn_rdel.setMode(this, getStatus());
			}
			DtlBtnStrLn_rcopy.setMode(MCMode.ENABLE);

			LclBtnStrLn_deselect_all.setMode(MCMode.ENABLE);
			LclBtnStrLn_select_all.setMode(MCMode.ENABLE);
			LclBtnStrLn_radd.setMode(MCMode.ENABLE);
			if (!getLclStrLnL().isEmpty() &&
					!isNull(getLclStrLnL().getValueNE(0, getRLUtil().getUpdCntrColumn()))) {
				LclBtnStrLn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				LclBtnStrLn_rdel.setMode(this, getStatus());
			}
			LclBtnStrLn_rcopy.setMode(MCMode.ENABLE);			
		}
		else{
			DtlBtnStrLn_deselect_all.setMode(MCMode.DISABLE);
			DtlBtnStrLn_select_all.setMode(MCMode.DISABLE);
			DtlBtnStrLn_radd.setMode(MCMode.DISABLE);
			DtlBtnStrLn_rdel.setMode(MCMode.DISABLE);
			DtlBtnStrLn_rcopy.setMode(MCMode.DISABLE);

			LclBtnStrLn_deselect_all.setMode(MCMode.DISABLE);
			LclBtnStrLn_select_all.setMode(MCMode.DISABLE);
			LclBtnStrLn_radd.setMode(MCMode.DISABLE);
			LclBtnStrLn_rdel.setMode(MCMode.DISABLE);
			LclBtnStrLn_rcopy.setMode(MCMode.DISABLE);
		}

	}
	
	/**
	 * DtlStrLnテーブル変更時の処理
	 */
	protected void doDtlStrLnTableNC(MCEventInfo info) {

		if (info.getEventIndex() < 0) return ;
		refreshLclStrLnAllL();
		
		MCConstRow r = DtlStrLnTable.getSelectedMCRow();

		// Dtl の選択行のキー項目と一致するレコードを LclAllL から取得して LclTableに表示
		MCList<LclStrLnR> l3 = getLclStrLnListForDtlR(r);
		getLclStrLnL().setAll(l3);
		sort(LclStrLnTable);
		LclStrLnTable.fillSpace();
		LclStrLnTable.adjustWidth();
		LclStrLnTable.selectRowNoFocus(0);
	}
	
	/**
	 * DtlStrLnテーブルの現状をStrLnAllに反映する
	 */
	protected void refreshDtlStrLnAllL() {
		if (getDtlStrLnL().size() == 0) {
			return ;
		}
		MCList<DtlStrLnR> l = MCList.create(DtlStrLnR.class);
		for (DtlStrLnR r : getDtlStrLnL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<DtlStrLnR> removeL = getStrLnAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getStrLnAllL().removeAll(removeL);
			getStrLnAllL().addAll(l);
		}
	}
	
	/**
	 * DtlLocSubテーブルの現状をlocSubAllに反映する
	 */
	protected void refreshDtlLocSubAllL() {
		if (getDtlLocSubL().size() == 0) {
			return ;
		}
		MCList<DtlLocSubR> l = MCList.create(DtlLocSubR.class);
		for (DtlLocSubR r : getDtlLocSubL()) {
			if (!isNull(r.getNumberNE(DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<DtlLocSubR> removeL = getLocSubAllL().subList(DTL_ROW_NO_COL_NM, l.get(0).getNumber(DTL_ROW_NO_COL_NM));
			getLocSubAllL().removeAll(removeL);
			getLocSubAllL().addAll(l);
		}
	}
	/**
	 * LclStrLnテーブルの現状をLclStrLnAllに反映する
	 */
	protected void refreshLclStrLnAllL() {
		if (getLclStrLnL().size() == 0) {
			return ;
		}
		MCList<LclStrLnR> l = MCList.create(LclStrLnR.class);
		for (LclStrLnR r : getLclStrLnL()) {
			if (!isNull(r.getNumberNE(_STR_LN_DTL_ROW_NO_COL_NM))) {
				l.add(r);
			}
		}
		if (l.size() > 0) {
			MCList<LclStrLnR> removeL = getLclStrLnAllL().subList(_STR_LN_DTL_ROW_NO_COL_NM, l.get(0).getNumber(_STR_LN_DTL_ROW_NO_COL_NM));
			getLclStrLnAllL().removeAll(removeL);
			getLclStrLnAllL().addAll(l);
		}
	}

	@Override
	protected boolean doDtlTableVC(MCEventInfo info) {

		MCMessageList msgList = new MCMessageList();
		
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l1 = getLclL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l2 = getDtlStrLnL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l3 = getLclStrLnL().subList(getCheckColumn(), true);
		MCList<? extends MCConstRow> l4 = getDtlLocSubL().subList(getCheckColumn(), true);

		if (!l1.isEmpty() || !l2.isEmpty() || !l3.isEmpty() || !l4.isEmpty()) {
			msgList.addAll(checkReq(getDtlTable().getSelectedMCRow()));
		}

		// lclL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclTable, l1));
		// lclL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclTable, getLclRKeyColumns());

		// DtlStrLnL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(DtlStrLnTable, l2));
		// DtlStrLnL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, DtlStrLnTable, getStrLnRKeyColumns());

		// lclStrLnL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclStrLnTable, l3));
		// lclStrLnL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclStrLnTable, getLclStrLnRKeyColumns());

		// DtlLocSubL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(DtlLocSubTable, l4));
		// DtlLocSubL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, DtlLocSubTable, getLocSubRKeyColumns());

		
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		return true;
	}
	
	@Override
	public boolean doDtlStrLn_VC(MCEventInfo info) {
		// DtlStrLnL の選択行を切り替える前に必須チェックを行う
		MCMessageList msgList = new MCMessageList();
		
		// DtlL の選択行を切り替える前に必須チェックを行う
		MCList<? extends MCConstRow> l = getLclStrLnL().subList(getCheckColumn(), true);

		if (!l.isEmpty()) {
			msgList.addAll(checkReq(DtlStrLnTable.getSelectedMCRow()));
		}

		// lclStrLnL が切り替わる前に必須チェックを行う
		msgList.addAll(checkReq(LclStrLnTable, l));
		// lclStrLnL が切り替わる前に重複チェックを行う
		checkDuplicate(msgList, LclStrLnTable, getLclStrLnRKeyColumns());

		
		if (msgList.size() > 0) {
			message(msgList);
			return false;
		}

		return true;
	}

	@Override
	public void fillSpace() {
		super.fillSpace();
		DtlStrLnTable.fillSpace();
		DtlLocSubTable.fillSpace();
		LclStrLnTable.fillSpace();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	@Override
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (isUpdOpe() || isUpdAdminOpe()) {
			DtlStrLnTable.setStatusColumnVisible(true);
			LclStrLnTable.setStatusColumnVisible(true);
			DtlLocSubTable.setStatusColumnVisible(true);
		}
		else if (isDelOpe() || isRefOpe()) {
			DtlStrLnTable.setStatusColumnVisible(false);
			LclStrLnTable.setStatusColumnVisible(false);
			DtlLocSubTable.setStatusColumnVisible(false);
		}
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (!isStrLnEnabled(this)) {
			setComponentInvisibleAllStatus(LclWrkStrLnPanel);
		}
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		if (!isStrLnEnabled(this)) {
			getSplitPane(StrLnPanel).setDividerLocation(0);
		}
	}

	/**
	 * テーブルのリストを全てクリア
	 */
	@Override
	protected void clearAll() {
		super.clearAll();
		getDtlStrLnL().clear();
		getStrLnAllL().clear();
		getLclStrLnL().clear();
		getLclStrLnAllL().clear();
		getDtlLocSubL().clear();
		getLocSubAllL().clear();
	}
	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		super.setSortColumn();

		for (MCColumnConfig c : getColumnConfigs(DtlStrLnTable, getStrLnRKeyColumns())) {
			DtlStrLnTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(LclStrLnTable, getLclStrLnRKeyColumns())) {
			LclStrLnTable.addSortColumn(c, MCList.SortType.ASC);
		}
		for (MCColumnConfig c : getColumnConfigs(DtlLocSubTable, getLocSubRKeyColumns())) {
			DtlLocSubTable.addSortColumn(c, MCList.SortType.ASC);
		}
	}
	
	/**
	 * テーブルに変更があった場合にクリアしてよいか確認する
	 */
	@Override
	protected boolean checkAllTableClear() {
		if (DtlTable == null) {
			return false;
		}
		if (LclTable == null) {
			return false;
		}
		if (DtlStrLnTable == null) {
			return false;
		}
		if (LclStrLnTable == null) {
			return false;
		}
		if (DtlLocSubTable == null) {
			return false;
		}
		
		return ((getDtlL().isStatusNone() && getLclL().isStatusNone() && getDtlStrLnL().isStatusNone() 
				&& getLclStrLnL().isStatusNone() && getDtlLocSubL().isStatusNone()) || confirmTableClear());
	}	
	//　行ＮＯ（DtlStrLn行とLclStrLn行の関連付け）関連（ここから） ///////////////////////////////////////////////
	/**
	 * イベント発生項目が「Dtl行番号」項目のときtrueを返す
	 */
	protected boolean isStrLnDtlRowNoColumn(MCRowEvent event) {
		return event.getColumn().equals(_STR_LN_DTL_ROW_NO_COL_NM);
	}
	/**
	 * DtlStrLn行ＮＯをカウントアップして返す。
	 */
	protected MCNumber getCntDtlStrLnRowNo() {
		if (_StrLnDtlRowNo == null) {
			_StrLnDtlRowNo = MCNumber.ZERO;
		}
		else {
			_StrLnDtlRowNo = _StrLnDtlRowNo.add(1);
		}
		return _StrLnDtlRowNo;
	}
	/**
	 * DtlStrLn行のDtl行ＮＯを返す。
	 * DtlStrLn行ＮＯカラムが無い場合は追加して、その値を返す。
	 * ただし、行ＮＯ以外の値が全て空の場合は、行ＮＯを追加せずnullを返す。
	 */
	protected MCNumber getDtlStrLnRowNo(MCConstRow dtlR) {
		if (dtlR.isEmpty(getDtlStrLnColumnsExceptRowNo())) {
			return null;
		}
		MCNumber no = dtlR.getNumberNE(_STR_LN_DTL_ROW_NO_COL_NM);
		if (no == null) {
			no = getCntDtlStrLnRowNo();
			dtlR.setNumberNE(_STR_LN_DTL_ROW_NO_COL_NM, no);
		}
		return no;
	}

	/**
	 * ブロック"DtlStrLn"に定義されているカラム名から「行ＮＯ」を除いたカラム名リストを返す。
	 */
	protected String[] getDtlStrLnColumnsExceptRowNo() {
		String[] allColnames = DtlStrLnR.colnames();
		String[] subColnames = new String[allColnames.length - 1];
		for (int i = 0, j = 0; i < allColnames.length; i++) {
			if (isSame(allColnames[i], _STR_LN_DTL_ROW_NO_COL_NM)) {
				continue;
			}
			subColnames[j++] = allColnames[i];
		}
		return subColnames;
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
		DtlStrLnTable.setCellConfig(createDtlStrLnCellConfig());
		LclStrLnTable.setCellConfig(createLclStrLnCellConfig());
		DtlLocSubTable.setCellConfig(createDtlLocSubCellConfig());
	}
	/**
	 * Dtlテーブル制御用セルコンフィグを返す
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
			if (getStatus() == UPD || getStatus() == UPD_ADMIN) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_zip_cd
						|| column == columnDtl_addr1
						|| column == columnDtl_addr2
						|| column == columnDtl_addr3
						|| column == columnDtl_addr4) {
					if (!r.addr_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				// 外注実績先行ＦＬＧ、直送支給検査ＦＬＧ
				else if (column == columnDtl_pre_outsrc_act_flg
						|| column == columnDtl_ddlv_prov_insp_flg) {
					if (isNull(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 棚卸対象
				else if (column == columnDtl_stktk_tor_disp_flg
						|| column == columnDtl_stktk_tor_ex_zero_flg
						|| column == columnDtl_stktk_act_ex_zero_flg
						|| column == columnDtl_stktk_amt_flg) {
					if (!r.stktk_tgt_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				// 管轄区分
				else if (column == columnDtl_loc_mng_typ) {
					if (!isNull(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				// メーカ
				else if (column == columnDtl_maker_cd){
					if (isNull(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_lg_def_flg){
					if (!isNull(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sls_dpt_cd){
					if (!isNull(r.sppl_cd()) && isNull(r.sls_dpt_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sppl_cd){
					if (!isNull(r.sls_dpt_cd()) && isNull(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
					else if (checkSlsDptCd(r) && isNull(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				// 登録済みの場合、管理者以外変更不可
				if (column == columnDtl_loc_mng_typ
						|| column == columnDtl_sppl_cd
						|| column == columnDtl_maker_cd
						|| (column == columnDtl_str_ln_tgt_flg && r.old_str_ln_tgt_flg())
						|| column == columnDtl_lg_grp_cd
						|| column == columnDtl_wg_cd
						|| column == columnDtl_site_cd) {
					if (getStatus() == UPD && !isNull(r.upd_cntr())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * DtlStrLnテーブル制御用セルコンフィグを返す
	 */
	protected DtlStrLnCellConfig createDtlStrLnCellConfig() {
		return new DtlStrLnCellConfig(this);
	}
	protected class DtlStrLnCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public DtlStrLnCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (isUpdOpe() || isUpdAdminOpe()) {
				
				if(isNull(r) || !r.str_ln_tgt_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(getDtlStrLnL().get(index).ins_ts())) {
					// Key項目入力不可
					if (column == columnDtlStrLn_str_ln_cd) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	
	/**
	 * LclStrLnテーブル制御用セルコンフィグを返す
	 */
	protected LclStrLnCellConfig createLclStrLnCellConfig() {
		return new LclStrLnCellConfig(this);
	}	
	protected class LclStrLnCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public LclStrLnCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getSelectedMCRow();
			if (getStatus() == UPD || getStatus() == UPD_ADMIN) {
				if(isNull(r) || !r.str_ln_tgt_flg()) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(getLclStrLnL().get(index).ins_ts())) {
					// Key項目入力不可
					if (column == columnLclStrLn_lcl_cd) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	
	protected DtlLocSubCellConfig createDtlLocSubCellConfig() {
		return new DtlLocSubCellConfig(this);
	}

	protected class DtlLocSubCellConfig extends MAUDP_RLBaseCellConfig {
		public DtlLocSubCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD || getStatus() == UPD_ADMIN) {
				DtlLocSubR locSubRow = (DtlLocSubR)table.getBaseTable().getRow(index);
				if (column == columnDtlLocSub_asst_dpt_cd) {
					if (isNull(locSubRow.st_dt())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtlLocSub_sls_dpt_cd) {
					if (isNull(locSubRow.st_dt())) {
						return MCMode.READ_ONLY;
					}
					else {
						DtlR r = DtlTable.getSelectedMCRow();
						if (!isNull(r.sppl_cd()) && isNull(locSubRow.sls_dpt_cd())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	protected boolean checkSlsDptCd(MCConstRow dtlR) {
		for (DtlLocSubR locsubR : getLocSubListForDtlR(dtlR)) {
			if (!isNull(locsubR.sls_dpt_cd())) {
				return true;
			}
		}
		return false;
	}
	
	//　行ＮＯ（DtlStrLn行とLclStrLn行の関連付け）関連（ここまで） ///////////////////////////////////////////////
	//　キー項目関連（ここから） ///////////////////////////////////////////////
	/** StrLnTableのキー項目を返します。 */
	protected String[] _StrLn_keys;

	public String[] getStrLnRKeyColumns() {
		if (_StrLn_keys == null) {
			DtlStrLnR r = getDtlStrLnL().createRow();
			_StrLn_keys = r.getKeys().toArray(new String[0]);
		}
		return _StrLn_keys;
	}
	/** LclStrLnTableのキー項目を返します。 */
	protected String[] _LclStrLn_keys;

	public String[] getLclStrLnRKeyColumns() {
		if (_LclStrLn_keys == null) {
			LclStrLnR r = getLclStrLnL().createRow();
			_LclStrLn_keys = r.getKeys().toArray(new String[0]);
		}
		return _LclStrLn_keys;
	}
	/** LocSubTableのキー項目を返します。 */
	protected String[] _LocSub_keys;

	public String[] getLocSubRKeyColumns() {
		if (_LocSub_keys == null) {
			DtlLocSubR r = getDtlLocSubL().createRow();
			_LocSub_keys = r.getKeys().toArray(new String[0]);
		}
		return _LocSub_keys;
	}
	//　キー項目関連（ここまで） ///////////////////////////////////////////////
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().loc_mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_LOC));
		getMstR().sub_mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_LOC_SUB));
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		columnDtl_site_cd.addIgnoreListBeans(columnDtl_lg_grp_cd, columnDtl_loc_grp_cd, columnDtl_alloc_grp_cd, columnDtl_cal_cd);
	}

}