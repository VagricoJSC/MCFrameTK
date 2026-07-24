package mcframe.clientMABC.MABCP0490;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_PoPrintReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_PoPrintReg_MC extends MABCP_PoPrintReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_PoPrintReg_MC() {
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
	public MABCP_PoPrintReg_MC(String name) {
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
		callMA_MABCL0490_Srch01();
	}
	/**
	 * [MA_MABCL0490_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0490_Srch01Caller<P extends MABCP_PoPrintReg, B extends MA_MABCL0490_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0490_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0490_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0490_Upd01Caller<P extends MABCP_PoPrintReg, B extends MA_MABCL0490_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0490_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getPrnt1R()));
			msgList.addAll(panel.checkReq(getPrnt2R()));
			msgList.addAll(panel.checkReq(getPrnt3R()));
		}
	}

	/**
	 * [MA_MABCL0490_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0490_Del01Caller<P extends MABCP_PoPrintReg, B extends MA_MABCL0490_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0490_Del01Caller(P p, B b) {
			super(p, b);
		}
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
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0490_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0490_Del01();
	}
		
	//------------------ イベント処理 Start -----------------//
	
	@Override
	protected void doDtlTableNC(MCEventInfo info) {
		super.doDtlTableNC(info);
		int index = info.getEventIndex();
		if (index < 0) return ;
		getPrnt1R().txt_new_off(getDtlL().get(index).txt_new_off());
		getPrnt1R().txt_new_on(getDtlL().get(index).txt_new_on());
		getPrnt2R().txt_mod_off(getDtlL().get(index).txt_mod_off());
		getPrnt2R().txt_mod_on(getDtlL().get(index).txt_mod_on());
		getPrnt3R().txt_del_off(getDtlL().get(index).txt_del_off());
		getPrnt3R().txt_del_on(getDtlL().get(index).txt_del_on());
	}
	
	@Override
	public void doPrnt1_txt_new_off_NC(MCEventInfo info) {
		super.doPrnt1_txt_new_off_NC(info);
		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			setValueEx(columnDtl_txt_new_off, index, getPrnt1R().txt_new_off());
		}
	}
	
	@Override
	public void doPrnt1_txt_new_on_NC(MCEventInfo info) {
		super.doPrnt1_txt_new_on_NC(info);
		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			setValueEx(columnDtl_txt_new_on, index, getPrnt1R().txt_new_on());
		}
	}
	
	@Override
	public void doPrnt2_txt_mod_off_NC(MCEventInfo info) {
		super.doPrnt2_txt_mod_off_NC(info);
		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			setValueEx(columnDtl_txt_mod_off, index, getPrnt2R().txt_mod_off());
		}
	}
	
	@Override
	public void doPrnt2_txt_mod_on_NC(MCEventInfo info) {
		super.doPrnt2_txt_mod_on_NC(info);
		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			setValueEx(columnDtl_txt_mod_on, index, getPrnt2R().txt_mod_on());
		}
	}
	
	@Override
	public void doPrnt3_txt_del_off_NC(MCEventInfo info) {
		super.doPrnt3_txt_del_off_NC(info);
		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			setValueEx(columnDtl_txt_del_off, index, getPrnt3R().txt_del_off());
		}
	}
	
	@Override
	public void doPrnt3_txt_del_on_NC(MCEventInfo info) {
		super.doPrnt3_txt_del_on_NC(info);
		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			setValueEx(columnDtl_txt_del_on, index, getPrnt3R().txt_del_on());
		}
	}
	
	//------------------ イベント処理 End ------------------//
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_PO_PRINT));
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		// テキストエリアの内容をトリムせずそのまま一覧にセットするための設定
		columnDtl_txt_new_off.setTrimPattern("NONE");
		columnDtl_txt_new_on.setTrimPattern("NONE");
		columnDtl_txt_mod_off.setTrimPattern("NONE");
		columnDtl_txt_mod_on.setTrimPattern("NONE");
		columnDtl_txt_del_off.setTrimPattern("NONE");
		columnDtl_txt_del_on.setTrimPattern("NONE");
	}

}