package mcframe.clientMABG.MABGP0630;

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
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5010.*;
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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_XpnsPurcAlcReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_XpnsPurcAlcReg_MC extends MABGP_XpnsPurcAlcReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_XpnsPurcAlcReg_MC() {
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
	public MABGP_XpnsPurcAlcReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0630_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0630_Srch01Caller<P extends MABGP_XpnsPurcAlcReg, B extends MA_MABGL0630_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0630_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			chkSrchBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			chkSrchBtnMode();
		}
	}
	
	/**
	 * [MA_MABGL0630_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0630_Sprt01Caller<P extends MABGP_XpnsPurcAlcReg, B extends MA_MABGL0630_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABGL0630_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0630_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0630_Upd01Caller<P extends MABGP_XpnsPurcAlcReg, B extends MA_MABGL0630_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0630_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0630_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0630_Del01Caller<P extends MABGP_XpnsPurcAlcReg, B extends MA_MABGL0630_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0630_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0630_Srch01();
	}
	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, BulkSet_end_dt, DtlTable, columnDtl_st_dt, columnDtl_end_dt);
	}
	/**
	 * Panel[Btn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABGL0630_Sprt01();
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
		callMA_MABGL0630_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0630_Del01();
	}

	@Override
	public void doBulkSet_st_dt_NC(MCEventInfo info) {
		super.doBulkSet_st_dt_NC(info);
		chkSrchBtnMode();
	}
	@Override
	public void doBulkSet_end_dt_NC(MCEventInfo info) {
		super.doBulkSet_end_dt_NC(info);
		chkSrchBtnMode();
	}
	
	public void chkSrchBtnMode() {
		if (!isNull(getBulkSetR().st_dt())
				|| !isNull(getBulkSetR().end_dt())) {
			BulkSet_set_dt.setMode(MCMode.ENABLE);
		}
		else {
			BulkSet_set_dt.setMode(MCMode.DISABLE);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getBulkSetR().clear();
	}

	// -- イベント処理関連（START）
	@Override
	public void doDtl_dpt_flg_NC(MCEventInfo info) {
		super.doDtl_dpt_flg_NC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.dpt_flg()) {
			r.dpt_cd(null);
			r.dpt_nm(null);
		}
	}

	@Override
	public void doDtl_bp_flg_NC(MCEventInfo info) {
		super.doDtl_bp_flg_NC(info);

		DtlR r = getDtlL().get(info.getEventIndex());

		if (r.bp_flg()) {
			r.bp_cd(null);
			r.bp_nm(null);
		}
	}
	@Override
	public void doDtl_lot_no_flg_NC(MCEventInfo info) {
		super.doDtl_lot_no_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.lot_no_flg()) {
			r.lot_no(null);
		}
	}
	@Override
	public void doDtl_sublot_no_flg_NC(MCEventInfo info) {
		super.doDtl_sublot_no_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.sublot_no_flg()) {
			r.sublot_no(null);
		}
	}
	@Override
	public void doDtl_sno1_flg_NC(MCEventInfo info) {
		super.doDtl_sno1_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.sno1_flg()) {
			r.sno1(null);
		}
	}
	@Override
	public void doDtl_sno2_flg_NC(MCEventInfo info) {
		super.doDtl_sno2_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.sno2_flg()) {
			r.sno2(null);
		}
	}
	@Override
	public void doDtl_sno3_flg_NC(MCEventInfo info) {
		super.doDtl_sno3_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.sno3_flg()) {
			r.sno3(null);
		}
	}
	@Override
	public void doDtl_sno4_flg_NC(MCEventInfo info) {
		super.doDtl_sno4_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		
		if (r.sno4_flg()) {
			r.sno4(null);
		}
	}
	
	// -- イベント処理関連（END）
	
	// //////////////////////////////////////////////
	// セルコンフィグ////////////////////////////////
	// //////////////////////////////////////////////
	/**
	 * セルコンフィグの設定
	 */
	@Override
	protected void setCellConfig() {
		DtlTable.setCellConfig(createTableCellConfig());
	}

	/**
	 * セルコンフィグの取得
	 * 
	 * @return 明細用のセルコンフィグ
	 */
	protected TableCellConfig createTableCellConfig() {
		return new TableCellConfig(this);
	}

	/**
	 * セルコンフィグクラス
	 */
	protected class TableCellConfig extends MAUDP_RLBaseCellConfig {
		public TableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = (DtlR) DtlTable.getBaseTable().getRow(index);

			if (column == columnDtl_dpt_cd) {
				if (r.dpt_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_bp_cd) {
				if (r.bp_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_lot_no) {
				if (r.lot_no_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_sublot_no) {
				if (r.sublot_no_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_sno1) {
				if (r.sno1_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_sno2) {
				if (r.sno2_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_sno3) {
				if (r.sno3_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			else if (column == columnDtl_sno4) {
				if (r.sno4_flg()) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}
	}

}