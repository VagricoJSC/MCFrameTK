package mcframe.clientMABC.MABCP1600;

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

import mcframe.clientMAUB.MAUBP5310.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_SendIfExecSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_SendIfExecSrch_MC extends MABCP_SendIfExecSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SendIfExecSrch_MC() {
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
	public MABCP_SendIfExecSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1600_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1600_Srch01Caller<P extends MABCP_SendIfExecSrch, B extends MA_MABCL1600_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		
		protected MA_MABCL1600_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}
	
	/**
	 * [MA_MABCL1600_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1600_Upd01Caller<P extends MABCP_SendIfExecSrch, B extends MA_MABCL1600_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		
		protected MA_MABCL1600_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setStatus();
		}
	}
	
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABCL1600_Srch01();
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL1600_Upd01();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		DtlTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		
		if(isChanged()){
			return confirmRegDataClear();
		}
		
		return true;
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		doCnd_ope_NCSub();
	}
	
	/**
	 * NCイベント処理
	 */
	protected void doCnd_ope_NCSub() {
		DtlTable.clear();
		setSRCHStatus();
	}
	
	protected void setStatus() {
		String ope = getCndR().ope();
		
		if (Cnd_ope_REF.getActionCommand().equals(ope)) {
			setREFStatus();
		}
		else if (Cnd_ope_UPD.getActionCommand().equals(ope)) {
			setUPDStatus();
		}
	}
	
	@Override
	protected void setCellConfig(){
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}
	
	/**
	 * 明細情報用のCellConfigクラスを作成する
	 */
	protected DtlCellConfig createDtlCellConfig(){
		return new DtlCellConfig();
	}
	
	/**
	 * 明細情報用のCellConfigクラス
	 */
	protected class DtlCellConfig extends MAUDP_CellConfig{
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			return getPriorModeSub(index, column, table);
		}
		
		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 */
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			DtlR dtl = (DtlR)table.getBaseTable().getRow(index);
			
			// 実行会社ＣＤが自社でない場合入力不可
			if (!isSame(dtl.exec_co_cd(), getCo().co_cd())) {
				return MCMode.READ_ONLY;
			}
			
			// バッチ実行中ＦＬＧがオフの場合入力不可
			if (!dtl.bat_exec_flg()) {
				return MCMode.READ_ONLY;
			}
			
			// オペレーション実行後
			if (MAC_RTN_STS_TYP.isOK(dtl.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			return super.getPriorMode(index, column, table);
		 }
	}
	
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		
	}
	
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}
	
	//--------------------リストロジック表示制御Start-----------------------
	@Override	
	public MCList getCnd_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getCnd_if_proc_typ(row, info);
	}
	
	/**
	 * 表示するＩＦ処理区分を取得する
	 */
	protected MAC_IF_PROC_TYP[] getIfProcTyp(MCEventInfo info) {
		List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();
		
		for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
			if (ifProcTyp.is_bi()) {
				l.add(ifProcTyp);
			}
		}
		
		return (MAC_IF_PROC_TYP[])l.toArray(new MAC_IF_PROC_TYP[0]);
	}
	//--------------------リストロジック表示制御End-----------------------

}