package mcframe.clientMABC.MABCP1120;

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
import mcframe.clientMAUB.MAUBP5020.*;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import java.util.LinkedHashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_JnlAcReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_JnlAcReg_MC extends MABCP_JnlAcReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_JnlAcReg_MC() {
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
	public MABCP_JnlAcReg_MC(String name) {
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
		callMA_MABCL1120_Srch01();
	}
	/**
	 * [MA_MABCL1120_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1120_Srch01Caller<P extends MABCP_JnlAcReg, B extends MA_MABCL1120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1120_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL1120_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1120_Upd01Caller<P extends MABCP_JnlAcReg, B extends MA_MABCL1120_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1120_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1120_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1120_Del01Caller<P extends MABCP_JnlAcReg, B extends MA_MABCL1120_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1120_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
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
		callMA_MABCL1120_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL1120_Del01();
	}
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createBpTableCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 取引先明細用のセルコンフィグ
	 */
	protected BpTableCellConfig createBpTableCellConfig() {

		return new BpTableCellConfig(this);
	}

	/**
	 * 取引先明細用のセルコンフィグクラス
	 */
	protected class BpTableCellConfig extends MAUDP_RLBaseCellConfig {

		public BpTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				if (column == columnDtl_bp_typ) {
					if (!r.bp_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_bp_cd) {
					if (isNull(r.bp_typ()) || MAC_BP_SET_TYP.isNON(r.bp_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (MAC_BP_SET_TYP.isFIX_CST(r.bp_typ()) || MAC_BP_SET_TYP.isFIX_SPL(r.bp_typ())) {
						return MCMode.REQUIRED;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	@Override
	public void doDtl_bp_typ_LC(MCEventInfo info) {
		super.doDtl_bp_typ_LC(info);
		
		int idx = info.getEventIndex();
	
		setValueEx(columnDtl_bp_cd, idx, null);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		Dtl_ac_subac_p_PPanel.columnAc_SubAc_ac_cd.addLCListener(this);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Dtl_ac_subac_p_PPanel.columnAc_SubAc_ac_cd) doDtl_ac_cd_LC(info);
	}
	
	public void doDtl_ac_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (!isNull(r.ac_cd()) && !r.bp_flg()) {
			setValueEx(columnDtl_bp_typ, idx, MAC_BP_SET_TYP.NON.value());
		}
		else {
			setValueEx(columnDtl_bp_typ, idx, null);
		}
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getDtl_bp_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getBpSetTyp(info));
		return super.getDtl_bp_typ(row, info);
	}
	/**
	 * 表示する取引先出力区分を取得する
	 */
	protected MAC_BP_SET_TYP[] getBpSetTyp(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (r.bp_flg()) {
			return new MAC_BP_SET_TYP[] { MAC_BP_SET_TYP.AR, MAC_BP_SET_TYP.CST, MAC_BP_SET_TYP.SPL, MAC_BP_SET_TYP.AP,
					MAC_BP_SET_TYP.CRE, MAC_BP_SET_TYP.FIX_CST, MAC_BP_SET_TYP.FIX_SPL, MAC_BP_SET_TYP.SO_CST,
					MAC_BP_SET_TYP.SO_SPL };
		}
		return MAC_BP_SET_TYP.array();
	}

	//--------------------リストロジック表示制御End-----------------------

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_JNL_AC));
	}

}