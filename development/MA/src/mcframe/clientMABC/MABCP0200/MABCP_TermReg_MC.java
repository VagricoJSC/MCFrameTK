package mcframe.clientMABC.MABCP0200;

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

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.clientMAUC.MAUCP1040.MAUCP_YearUtil;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_TermReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_TermReg_MC extends MABCP_TermReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_TermReg_MC() {
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
	public MABCP_TermReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0200_Srch01();
	}
	/**
	 * [MA_MABCL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0200_Srch01Caller<P extends MABCP_TermReg, B extends MA_MABCL0200_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0200_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			
			for (DtlR r : bridge.down0()) {
				MCDate st = r.term();
				MCDate end = r.term_end_ym();
				if(!isNullOr(st, end)){
					long diff = end.diffMonth(st);
					r.term_mon(diff);			
				}
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0200_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0200_Upd01Caller<P extends MABCP_TermReg, B extends MA_MABCL0200_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0200_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCustom(msgList);

		}
		
		protected void checkForCallStackCustom(MCMessageList msgList) {

			MCList<DtlR> l = getDtlLForUpdCheck();
			
			for (DtlR r : l) {
				checkRow(msgList, r);
			}
		}

		/**
		 * 行をチェックします。
		 * @param msgList エラーメッセージを格納するリスト
		 * @param r チェック対象のRow
		 */
		protected void checkRow(MCMessageList msgList, DtlR r) {
			
			/*上限下限チェック*/
			checkMinMax(msgList, r);
			/*0不可チェック*/
			msgList.addAll(checkPositive(r, columnDtl_term));
		}
		
		protected void checkMinMax(MCMessageList m, MCRow r){
			MCDate st = r.getDate(columnDtl_term.getBaseRowColumnName());
			FXBAP_PanelBase p = (FXBAP_PanelBase)getBaseRootPanel();
			MCRow causeRow = r.getRootRow(); 
			
			m.addAll(MAUCP_YearUtil.checkMinMax(st, p, causeRow, columnDtl_term.getBaseRowColumnName()));
		}
	}

	/**
	 * [MA_MABCL0200_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0200_Del01Caller<P extends MABCP_TermReg, B extends MA_MABCL0200_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0200_Del01Caller(P p, B b) {
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
		callMA_MABCL0200_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0200_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0200_Del01();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_TERM));
	}
	
	/** 期間の最大値 */
	protected MCNumber TWELVE = new MCNumber(12);

	/** 1～12のみ入力可能にしています。*/
	@Override
	public boolean doDtl_term_mon_VC(MCEventInfo info) {
		int i = info.getEventIndex();
		if (i >= 0) {
			MCNumber t = (MCNumber)info.getNewValue();
			if (!isNull(t) && !(t.gt(MCNumber.ZERO) && t.lte(TWELVE))){
				return false;
			}
		}
		return super.doDtl_term_VC(info);
	}

	/**期が入力された場合、終了年月に値を設定します。*/
	@Override
	public void doDtl_term_NC(MCEventInfo info) {
		super.doDtl_term_NC(info);
		int i = info.getEventIndex();
		if (i == -1) {
			return;
		}

		setEndYm(getDtlL().get(i));
	}

	/**期間が入力された場合、終了年月に値を設定します。*/
	@Override
	public void doDtl_term_mon_NC(MCEventInfo info) {
		super.doDtl_term_mon_NC(info);
		int i = info.getEventIndex();
		if (i == -1) {
			return;
		}

		setEndYm(getDtlL().get(i));
	}

	/**コピー行の期間を更新します。*/
	@SuppressWarnings("unchecked")//E へのキャスト
	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		if (t == getDtlTable()) {
			DtlR r = (DtlR)super.copyRow(t);
			if (!isNull(r)) {
				setNextTerm(r);
			}
			return (E)r;
		}

		return super.copyRow(t);
	}
	
	/**行の値を次の期の値に変更します。*/
	protected void setNextTerm(DtlR r){
		MCDate st = r.term();
		MCNumber t = r.term_mon();
		if(!isNullOr(st, t)){
			
			FXBAP_PanelBase rp = (FXBAP_PanelBase)getBaseRootPanel();
			MCRow causeRow = r.getRootRow();
			MCMessageList m = MAUCP_YearUtil.checkMinMax(st, rp, causeRow, columnDtl_term.getBaseRowColumnName());
			if(m.isEmpty()){
				r.term(st.addMonth(t));
				r.term_mon(t);
				setEndYm(r);
			}
		}
	}

	/**期と期間(月)、終了年月を設定します。*/
	protected void setEndYm(DtlR r){
		if(r != null){
			MCDate st = r.term();
			MCNumber t = r.term_mon();
			if(!isNullOr(st, t)){
				MCDate et = st.addMonth(t).startOfMonth();
				r.term_end_ym(et);
			}
		}	
	}
	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	public class DtlConf extends MAUDP_LCLRLBaseCellConfig {

		public DtlConf(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (!isNull(r.ins_ts())) {
				if (isUpdOpe() && column == columnDtl_term_mon ) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

}