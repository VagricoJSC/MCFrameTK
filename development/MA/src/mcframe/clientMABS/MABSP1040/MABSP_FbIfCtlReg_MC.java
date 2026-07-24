package mcframe.clientMABS.MABSP1040;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_FbIfCtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_FbIfCtlReg_MC extends MABSP_FbIfCtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_FbIfCtlReg_MC() {
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
	public MABSP_FbIfCtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL1040_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1040_Srch01Caller<P extends MABSP_FbIfCtlReg, B extends MA_MABSL1040_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL1040_Srch01Caller(P p, B b) {
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
	 * [MA_MABSL1040_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1040_Sprt01Caller<P extends MABSP_FbIfCtlReg, B extends MA_MABSL1040_Sprt01Bridge>
			extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLStEndDupChecker<P, B> {

		protected MA_MABSL1040_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL1040_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1040_Upd01Caller<P extends MABSP_FbIfCtlReg, B extends MA_MABSL1040_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL1040_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL1040_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1040_Del01Caller<P extends MABSP_FbIfCtlReg, B extends MA_MABSL1040_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL1040_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL1040_Srch01();
	}

	/**
	 * Panel[BulkSet]のボタン[set_dt]の押下時の処理
	 */
	@Override
	public void doBulkSet_set_dt(MCEventInfo info) {
		chkSetDtVal(BulkSet_st_dt, null, DtlTable, columnDtl_st_dt, null);
		chkSetDtVal(BulkSet_end_dt, null, DtlTable, columnDtl_end_dt, null);
	}

	/**
	 * Panel[Btn]のボタン[correct_dup_dt]の押下時の処理
	 */
	@Override
	public void doBtn_correct_dup_dt(MCEventInfo info) {
		callMA_MABSL1040_Sprt01();
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
		callMA_MABSL1040_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABSL1040_Del01();
	}

	// セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	protected MCCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig(this);
	}

	public class DtlTableCellConfig extends MAUDP_RLBaseCellConfig {

		public DtlTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			CndR r = getCndR();
			DtlR dtl = (DtlR) table.getBaseTable().getRow(index);

			if (getStatus() == UPD) {

				if (column == Cnd_bp_cd_null_flg) {
					if (!isNull(r.bp_cd()) || !isNull(r.bp_nm())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_bp_cd_null_flg) {
					if (!isNull(dtl.bp_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_bank_cd) {
					if (!MAC_AR_STTL_TYP.isBANK(dtl.ar_sttl_typ())) {
						return MCMode.READ_ONLY;
					}

					if (!isNull(dtl.bank_ac_cd())) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_bank_ac_cd) {
					if (!MAC_AR_STTL_TYP.isBANK(dtl.ar_sttl_typ())) {
						return MCMode.READ_ONLY;
					}

					if (!isNull(dtl.bank_cd())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

	}

	@Override
	public void doDtl_bp_cd_NC(MCEventInfo info) {
		super.doDtl_bp_cd_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());

		if (!isNull(r.bp_cd())) {
			setValueEx(columnDtl_bp_cd_null_flg, r.getGUIIndex(), false);
		}
	}

	@Override
	public void doDtl_bp_cd_null_flg_NC(MCEventInfo info) {
		super.doDtl_bp_cd_null_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());

		if (r.bp_cd_null_flg()) {
			setValueEx(columnDtl_bp_cd, r.getGUIIndex(), null);
		}
	}

	@Override
	public void doDtl_ar_sttl_typ_NC(MCEventInfo info) {
		super.doDtl_ar_sttl_typ_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());

		setValueEx(columnDtl_bank_cd, r.getGUIIndex(), null);
		setValueEx(columnDtl_bank_ac_cd, r.getGUIIndex(), null);
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
		if (!isNull(getBulkSetR().st_dt()) || !isNull(getBulkSetR().end_dt())) {
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

	//--------------------リストロジック表示制御Start-----------------------
	@Override
	public MCList getCnd_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getCnd_if_proc_typ(row, info);
	}

	@Override
	public MCList getDtl_if_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getIfProcTyp(info));
		return super.getDtl_if_proc_typ(row, info);
	}

	/**
	 * 表示するＩＦ処理区分を取得する
	 */
	protected MAC_IF_PROC_TYP[] getIfProcTyp(MCEventInfo info) {
		List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();
		for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
			if (ifProcTyp.is_fb()) {
				l.add(ifProcTyp);
			}
		}
		return (MAC_IF_PROC_TYP[]) l.toArray(new MAC_IF_PROC_TYP[0]);
	}

	@Override
	public MCList getCnd_ar_sttl_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getArSttlTyp(info));
		return super.getCnd_ar_sttl_typ(row, info);
	}

	@Override
	public MCList getDtl_ar_sttl_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getArSttlTyp(info));
		return super.getDtl_ar_sttl_typ(row, info);
	}

	/**
	 * 表示する債権決済区分を取得する
	 */
	protected MAC_AR_STTL_TYP[] getArSttlTyp(MCEventInfo info) {
		List<MAC_AR_STTL_TYP> l = new ArrayList<MAC_AR_STTL_TYP>();
		for (MAC_AR_STTL_TYP arSttlTyp : MAC_AR_STTL_TYP.array()) {
			if (MAC_AR_STTL_TYP.isBANK(arSttlTyp) || MAC_AR_STTL_TYP.isCASH(arSttlTyp)
					|| MAC_AR_STTL_TYP.isNOTE(arSttlTyp)) {
				l.add(arSttlTyp);
			}
		}
		return (MAC_AR_STTL_TYP[]) l.toArray(new MAC_AR_STTL_TYP[0]);
	}

	//--------------------リストロジック表示制御End-----------------------

}