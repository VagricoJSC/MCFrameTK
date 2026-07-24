package mcframe.clientMABG.MABGP0640;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import java.util.LinkedHashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_ActIoReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_ActIoReg_MC extends MABGP_ActIoReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_ActIoReg_MC() {
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
	public MABGP_ActIoReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0640_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0640_Srch01Caller<P extends MABGP_ActIoReg, B extends MA_MABGL0640_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0640_Srch01Caller(P p, B b) {
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
	 * [MA_MABGL0640_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0640_Sprt01Caller<P extends MABGP_ActIoReg, B extends MA_MABGL0640_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABGL0640_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABGL0640_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0640_Upd01Caller<P extends MABGP_ActIoReg, B extends MA_MABGL0640_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0640_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
		}
	}

	/**
	 * [MA_MABGL0640_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0640_Del01Caller<P extends MABGP_ActIoReg, B extends MA_MABGL0640_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0640_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0640_Srch01();
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
		callMA_MABGL0640_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABGL0640_Del01();
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
		callMA_MABGL0640_Sprt01();
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

	@Override
	protected void listenerInit() {
		super.listenerInit();
		columnDtl_ac_rsn_cd.addLCListener(this);
		columnDtl_tgt_loc_cd.addLCListener(this);
		columnDtl_io_trans_typ.addLCListener(this);
		columnDtl_inpt_loc_typ1.addLCListener(this);
		columnDtl_inpt_loc_typ2.addLCListener(this);
	}

	// -- イベント処理関連（START）
	
	
	
	// **無ＦＬＧがＯＮになったとき対象のＣＤをクリアする
	@Override
	public void doCnd_no_itm_jnl_flg_NC(MCEventInfo info){
		super.doCnd_no_itm_jnl_flg_NC(info);
		if(Cnd_no_itm_jnl_flg.getValue()) {
			setValueEx(Cnd_itm_jnl_cd, null);
			setValueEx(Cnd_itm_jnl_nm, null);
		}
	}
	
	@Override
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info){
		super.doCnd_no_ac_rsn_flg_NC(info);
		if(Cnd_no_ac_rsn_flg.getValue()) {
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);
		}
	}
	
	@Override
	public void doCnd_no_tgt_dpt_flg_NC(MCEventInfo info){
		super.doCnd_no_tgt_dpt_flg_NC(info);
		if(Cnd_no_tgt_dpt_flg.getValue()) {
			setValueEx(Cnd_tgt_dpt_cd, null);
			setValueEx(Cnd_tgt_dpt_nm, null);
		}
	}

	@Override
	public void doCnd_no_tgt_loc_flg_NC(MCEventInfo info){
		super.doCnd_no_tgt_loc_flg_NC(info);
		if(Cnd_no_tgt_loc_flg.getValue()) {
			setValueEx(Cnd_tgt_loc_cd, null);
			setValueEx(Cnd_tgt_loc_nm, null);
		}
	}

	// ＣＤ，名称が入力されたとき**無ＦＬＧをＯＦＦにする。
	@Override
	public void doCnd_itm_jnl_cd_NC(MCEventInfo info) {
		super.doCnd_itm_jnl_cd_NC(info);
		if (!isNull(Cnd_itm_jnl_cd.getValue())) {
			setValueEx(Cnd_no_itm_jnl_flg, false);
		}
	}
		
	@Override
	public void doCnd_ac_rsn_cd_NC(MCEventInfo info) {
		super.doCnd_ac_rsn_cd_NC(info);
		if (!isNull(Cnd_ac_rsn_cd.getValue())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}
	
	@Override
	public void doCnd_tgt_dpt_cd_NC(MCEventInfo info) {
		super.doCnd_tgt_dpt_cd_NC(info);
		if (!isNull(Cnd_tgt_dpt_cd.getValue())) {
			setValueEx(Cnd_no_tgt_dpt_flg, false);
		}
	}
	
	@Override
	public void doCnd_tgt_loc_cd_NC(MCEventInfo info) {
		super.doCnd_tgt_loc_cd_NC(info);
		if (!isNull(Cnd_tgt_loc_cd.getValue())) {
			setValueEx(Cnd_no_tgt_loc_flg, false);
		}
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_ac_rsn_cd) {
			doDtl_ac_rsn_cd_LC(info);
		}
		else if (lc == columnDtl_tgt_loc_cd) {
			doDtl_tgt_loc_cd_LC(info);
		}
		else if (lc == columnDtl_io_trans_typ) {
			doDtl_io_trans_typ_LC(info);
		}
		else if (lc == columnDtl_inpt_loc_typ1) {
			doDtl_inpt_loc_typ1_LC(info);
		}
		else if (lc == columnDtl_inpt_loc_typ2) {
			doDtl_inpt_loc_typ2_LC(info);
		}
	}

	@Override
	public void doDtl_ac_rsn_cd_LC(MCEventInfo info) {
		if (!isNull(info.getNewValue())) {
			columnDtl_ac_rsn_null_flg.setValue(info.getEventIndex(), false);
		}
	}

	@Override
	public void doDtl_ac_rsn_null_flg_NC(MCEventInfo info) {
		super.doDtl_ac_rsn_null_flg_NC(info);
		if ((Boolean) info.getNewValue()) {
			columnDtl_ac_rsn_cd.setValue(info.getEventIndex(), null);
		}
	}

	@Override
	public void doDtl_tgt_loc_cd_LC(MCEventInfo info) {
		if (!isNull(info.getNewValue())) {
			columnDtl_loc_null_flg.setValue(info.getEventIndex(), false);
		}
	}

	@Override
	public void doDtl_loc_null_flg_NC(MCEventInfo info) {
		super.doDtl_loc_null_flg_NC(info);
		if ((Boolean) info.getNewValue()) {
			columnDtl_tgt_loc_cd.setValue(info.getEventIndex(), null);
		}
	}

	/**
	 * [Dtl]パネルの[io_trans_typ]のListChangedイベントが実行されたときに呼び出されます。
	 * 
	 * @param info
	 *            イベント情報
	 */
	// 入出庫振替区分を変更したときは、配賦科目ＣＤ・投入場所区分をクリアする
	@Override
	public void doDtl_io_trans_typ_LC(MCEventInfo info) {
		int index = info.getEventIndex();

		setValueEx(columnDtl_alc_ac_cd, index, null);
		setValueEx(columnDtl_inpt_loc_typ1, index, null);
		setValueEx(columnDtl_inpt_loc_typ2, index, null);
		setValueEx(columnDtl_inpt_loc_typ3, index, null);
	}

	// 配賦科目をクリアしたときは、配賦先関連の項目をクリアする
	@Override
	public void doDtl_alc_ac_nm_LC(MCEventInfo info) {
		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (isNull(dtlR.alc_ac_nm())) {
			setValueEx(columnDtl_alc_amt_flg, index, false);
			setValueEx(columnDtl_alc_wg_cd, index, null);
			setValueEx(columnDtl_dpt_flg, index, false);
			setValueEx(columnDtl_dpt_cd, index, null);
			setValueEx(columnDtl_loc_flg, index, false);
			setValueEx(columnDtl_loc_cd, index, null);
			setValueEx(columnDtl_oper_flg, index, false);
			setValueEx(columnDtl_oper_cd, index, null);
			setValueEx(columnDtl_bp_flg, index, false);
			setValueEx(columnDtl_bp_cd, index, null);
			setValueEx(columnDtl_ctg_flg, index, false);
			setValueEx(columnDtl_ctg_cd, index, null);
			setValueEx(columnDtl_itm_flg, index, false);
			setValueEx(columnDtl_itm_cd, index, null);
			setValueEx(columnDtl_lot_no_flg, index, false);
			setValueEx(columnDtl_lot_no, index, null);
			setValueEx(columnDtl_sublot_no_flg, index, false);
			setValueEx(columnDtl_sublot_no, index, null);
			setValueEx(columnDtl_sno1_flg, index, false);
			setValueEx(columnDtl_sno1, index, null);
			setValueEx(columnDtl_sno2_flg, index, false);
			setValueEx(columnDtl_sno2, index, null);
			setValueEx(columnDtl_sno3_flg, index, false);
			setValueEx(columnDtl_sno3, index, null);
			setValueEx(columnDtl_sno4_flg, index, false);
			setValueEx(columnDtl_sno4, index, null);
			setValueEx(columnDtl_itm_mfg_inst_no_flg, index, false);
		}
	}

	// 部門引継ＦＬＧがオンのときは、配賦先部門ＣＤをクリアする
	@Override
	public void doDtl_dpt_flg_NC(MCEventInfo info) {
		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.dpt_flg()) {
			setValueEx(columnDtl_dpt_cd, index, null);
		}
	}

	// 場所引継ＦＬＧがオンのときは、配賦先場所ＣＤをクリアする
	@Override
	public void doDtl_loc_flg_NC(MCEventInfo info) {
		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.loc_flg()) {
			setValueEx(columnDtl_loc_cd, index, null);
		}
	}

	// 工程引継ＦＬＧがオンのときは、配賦先工程ＣＤをクリアする
	@Override
	public void doDtl_oper_flg_NC(MCEventInfo info) {

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.oper_flg()) {
			setValueEx(columnDtl_oper_cd, index, null);
		}
	}

	// 取引先引継ＦＬＧがオンのときは、配賦先取引先ＣＤをクリアする
	@Override
	public void doDtl_bp_flg_NC(MCEventInfo info) {
		super.doDtl_bp_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.bp_flg()) {
			setValueEx(columnDtl_bp_cd, index, null);
		}
	}
	
	// 品群引継ＦＬＧがオンのときは、配賦先品群ＣＤをクリアする
	@Override
	public void doDtl_ctg_flg_NC(MCEventInfo info) {
		super.doDtl_ctg_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.ctg_flg()) {
			setValueEx(columnDtl_ctg_cd, index, null);
		}
	}

	// 品目引継ＦＬＧがオンのときは、配賦先品目ＣＤをクリアする
	@Override
	public void doDtl_itm_flg_NC(MCEventInfo info) {
		super.doDtl_itm_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.itm_flg()) {
			setValueEx(columnDtl_itm_cd, index, null);
		}
	}

	// 投入場所区分１をクリアした場合は、投入場所区分２と３をクリアする
	@Override
	public void doDtl_inpt_loc_typ1_LC(MCEventInfo info) {
		int index = info.getEventIndex();

		if (isNull(info.getNewValue())) {
			setValueEx(columnDtl_inpt_loc_typ2, index, null);
			setValueEx(columnDtl_inpt_loc_typ3, index, null);
		}
	}

	// 投入場所区分２をクリアした場合は、投入場所区分３をクリアする
	@Override
	public void doDtl_inpt_loc_typ2_LC(MCEventInfo info) {
		int index = info.getEventIndex();

		if (isNull(info.getNewValue())) {
			setValueEx(columnDtl_inpt_loc_typ3, index, null);
		}
	}

	@Override
	public void doDtl_lot_no_flg_NC(MCEventInfo info) {
		super.doDtl_lot_no_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.lot_no_flg()) {
			setValueEx(columnDtl_lot_no, index, null);
		}
	}

	@Override
	public void doDtl_sublot_no_flg_NC(MCEventInfo info) {
		super.doDtl_sublot_no_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.sublot_no_flg()) {
			setValueEx(columnDtl_sublot_no, index, null);
		}
	}

	@Override
	public void doDtl_sno1_flg_NC(MCEventInfo info) {
		super.doDtl_sno1_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.sno1_flg()) {
			setValueEx(columnDtl_sno1, index, null);
		}
	}

	@Override
	public void doDtl_sno2_flg_NC(MCEventInfo info) {
		super.doDtl_sno2_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.sno2_flg()) {
			setValueEx(columnDtl_sno2, index, null);
		}
	}

	@Override
	public void doDtl_sno3_flg_NC(MCEventInfo info) {
		super.doDtl_sno3_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.sno3_flg()) {
			setValueEx(columnDtl_sno3, index, null);
		}
	}

	@Override
	public void doDtl_sno4_flg_NC(MCEventInfo info) {
		super.doDtl_sno4_flg_NC(info);

		int index = info.getEventIndex();

		DtlR dtlR = DtlTable.getRow(index);
		if (dtlR.sno4_flg()) {
			setValueEx(columnDtl_sno4, index, null);
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
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	/**
	 * 明細に優先して利用させるCellConfigを作成するメソッド
	 * 
	 * @return
	 */
	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}

	protected class DtlCellConfig extends MAUDP_RLBaseCellConfig {
		public DtlCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) DtlTable.getBaseTable().getRow(index);
			if (isSame(getStatus(), UPD)) {
				if (column == columnDtl_alc_ac_cd) {
					if (MAC_IO_TRANS_TYP.isALC(r.io_trans_typ())) {
						return MCMode.REQUIRED;
					}
					else if (MAC_IO_TRANS_TYP.isINPT(r.io_trans_typ())) {
						return MCMode.ENABLE;
					}
					else {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_alc_amt_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_alc_wg_cd) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_dpt_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_dpt_cd) {
					if (r.dpt_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_loc_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_loc_cd) {
					if (r.loc_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_oper_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_oper_cd) {
					if (r.oper_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_bp_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_bp_cd) {
					if (r.bp_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ctg_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ctg_cd) {
					if (r.ctg_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_cd) {
					if (r.itm_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_sub1) {
					if (r.itm_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_sub2) {
					if (r.itm_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_sub3) {
					if (r.itm_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_lot_no_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_lot_no) {
					if (r.lot_no_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sublot_no_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sublot_no) {
					if (r.sublot_no_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno1_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno1) {
					if (r.sno1_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno2_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno2) {
					if (r.sno2_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno3_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno3) {
					if (r.sno3_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno4_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno4) {
					if (r.sno4_flg() || isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_mfg_inst_no_flg) {
					if (isNull(r.alc_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_inpt_loc_typ1) {
					if (!MAC_IO_TRANS_TYP.isINPT(r.io_trans_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_inpt_loc_typ2) {
					if (!MAC_IO_TRANS_TYP.isINPT(r.io_trans_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						if (isNull(r.inpt_loc_typ1())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (column == columnDtl_inpt_loc_typ3) {
					if (!MAC_IO_TRANS_TYP.isINPT(r.io_trans_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						if (isNull(r.inpt_loc_typ1()) || isNull(r.inpt_loc_typ2())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	/**
	 * 優先順位のチェック
	 */
	@Override
	public boolean doDtl_prio_VC(MCEventInfo info) {
		MCNumber n = (MCNumber)info.getNewValue();
		if(!isPrio(n)){
			return false;
		}
		return super.doDtl_prio_VC(info);
	}
	// 優先順位のチェック
	protected boolean isPrio(MCNumber n){
		return MCNumber.ONE.lte(n) && new MCNumber(9999).gte(n);
	}

}