package mcframe.clientMSBB.MSBBP4020;

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


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SloRsnReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SloRsnReg_MC extends MSBBP_SloRsnReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SloRsnReg_MC() {
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
	public MSBBP_SloRsnReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL4020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL4020_Srch01Caller<P extends MSBBP_SloRsnReg, B extends MS_MSBBL4020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0030.MAUDP_RLSearcher<P, B> {

		protected MS_MSBBL4020_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(getCndQtnTermFlgs()));
			msgList.addAll(checkAtLeastOne(getCndQtnRsltFlgs()));
			msgList.addAll(checkAtLeastOne(getCndSloCanFlgs()));
		}

		/**
		 * 見積条件ＦＬＧの検索条件項目のチェックボックスを返す
		 * 
		 * @return 見積条件ＦＬＧの検索条件項目
		 */
		protected MCCheckBox[] getCndQtnTermFlgs() {
			return new MCCheckBox[]{
					Cnd_off_qtn_term_flg,
					Cnd_on_qtn_term_flg};
		}
		
		/**
		 * 見積結果ＦＬＧの検索条件項目のチェックボックスを返す
		 * 
		 * @return 見積結果ＦＬＧの検索条件項目
		 */
		protected MCCheckBox[] getCndQtnRsltFlgs() {
			return new MCCheckBox[]{
					Cnd_off_qtn_rslt_flg,
					Cnd_on_qtn_rslt_flg};
		}
		
		/**
		 * 受注取消ＦＬＧの検索条件項目のチェックボックスを返す
		 * 
		 * @return 受注取消ＦＬＧの検索条件項目
		 */
		protected MCCheckBox[] getCndSloCanFlgs() {
			return new MCCheckBox[]{
					Cnd_off_slo_can_flg,
					Cnd_on_slo_can_flg};
		}
	}

	/**
	 * [MS_MSBBL4020_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL4020_Upd01Caller<P extends MSBBP_SloRsnReg, B extends MS_MSBBL4020_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0030.MAUDP_RLUpdater<P, B> {

		protected MS_MSBBL4020_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
	}

	/**
	 * [MS_MSBBL4020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL4020_Del01Caller<P extends MSBBP_SloRsnReg, B extends MS_MSBBL4020_Del01Bridge> extends mcframe.clientMAUD.MAUDP0030.MAUDP_RLDeleter<P, B> {

		protected MS_MSBBL4020_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[SrchBtn2]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doSrchBtn2_srch(MCEventInfo info) {
		callMS_MSBBL4020_Srch01();
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
		callMS_MSBBL4020_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL4020_Del01();
	}
	@Override
	protected void valueInit() {
		super.valueInit();
		// 見積条件フラグの初期値提案
		setValueEx(Cnd_off_qtn_rslt_flg, true);
		setValueEx(Cnd_on_qtn_rslt_flg, true);
		// 見積結果フラグの初期値提案
		setValueEx(Cnd_off_qtn_term_flg, true);
		setValueEx(Cnd_on_qtn_term_flg, true);
		// 受注取消フラグの初期値提案
		setValueEx(Cnd_off_slo_can_flg, true);
		setValueEx(Cnd_on_slo_can_flg, true);
	}	
	
	@Override
	public void doDtl_qtn_term_flg_NC(MCEventInfo info) {
		super.doDtl_qtn_term_flg_NC(info);
		int index = info.getEventIndex();
		DtlR dtlR = getDtlL().get(index);
		if (!dtlR.qtn_term_flg()) {
			setValueEx(columnDtl_qtn_term_sort_seq, index, null);
		}
	}

	@Override
	public void doDtl_qtn_rslt_flg_NC(MCEventInfo info) {
		super.doDtl_qtn_rslt_flg_NC(info);
		int index = info.getEventIndex();
		DtlR dtlR = getDtlL().get(index);
		if (!dtlR.qtn_rslt_flg()) {
			setValueEx(columnDtl_qtn_rslt_sort_seq, index, null);
		}
	}

	@Override
	public void doDtl_slo_can_flg_NC(MCEventInfo info) {
		super.doDtl_slo_can_flg_NC(info);
		int index = info.getEventIndex();
		DtlR dtlR = getDtlL().get(index);
		if (!dtlR.slo_can_flg()) {
			setValueEx(columnDtl_slo_can_sort_seq, index, null);
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(crtDtlCellConfig());
	}

	protected DtlCellConfig crtDtlCellConfig() {
		return new DtlCellConfig();
	}
	
	protected class DtlCellConfig extends MAUDP_CellConfig {						
		@Override								
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {								
			
			if (columnDtl_qtn_term_sort_seq == column) {							
				if (isEditableMode(column) && !getDtlL().get(index).qtn_term_flg()) {						
					return MCMode.READ_ONLY;
				}						
			}							
			if (columnDtl_qtn_rslt_sort_seq == column) {							
				if (isEditableMode(column) && !getDtlL().get(index).qtn_rslt_flg()) {						
					return MCMode.READ_ONLY;					
				}						
			}							
			if (columnDtl_slo_can_sort_seq == column) {							
				if (isEditableMode(column) && !getDtlL().get(index).slo_can_flg()) {						
					return MCMode.READ_ONLY;					
				}						
			}							

			return super.getPriorMode(index, column, table);							
		}								
	}		

}