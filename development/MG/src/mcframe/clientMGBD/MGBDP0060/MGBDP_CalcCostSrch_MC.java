package mcframe.clientMGBD.MGBDP0060;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_CalcCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CalcCostSrch_MC extends MGBDP_CalcCostSrch_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CalcCostSrch_MC() {
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
	public MGBDP_CalcCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0060_Srch01Caller<P extends MGBDP_CalcCostSrch, B extends MG_MGBDL0060_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0060_Srch01Caller(P p, B b) {
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
	 * [MG_MGBDL0060_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0060_Del01Caller<P extends MGBDP_CalcCostSrch, B extends MG_MGBDL0060_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MG_MGBDL0060_Del01Caller(P p, B b) {
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
		callMG_MGBDL0060_Srch01();
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
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMG_MGBDL0060_Del01();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
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
		clearContainers(getDtlL());
		setSRCHStatus();
	}

	protected void setStatus() {
		String ope = getCndR().ope();
		if (Cnd_ope_REF.getActionCommand().equals(ope)) {
			setREFStatus();
		}
		else if (Cnd_ope_DEL.getActionCommand().equals(ope)) {
			setDELStatus();
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
	protected class DtlCellConfig extends MGUDP_CellConfig{

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			return getPriorModeSub(index, column, table);
		}
		
		/**
		 * セルのモードを制御するためにgetPriorModeから実行されるメソッド
		 */
		protected MCMode getPriorModeSub(int index, MCColumnConfig column, MCTable table) {
			DtlR dtl = (DtlR)table.getBaseTable().getRow(index);
			// オペレーション実行後
			if (MAC_RTN_STS_TYP.isOK(dtl.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
			}
			
			return super.getPriorMode(index, column, table);
		 }
	}
	
	@Override
	public MCTable getListRegTable() {
		return DtlTable;
	}

}