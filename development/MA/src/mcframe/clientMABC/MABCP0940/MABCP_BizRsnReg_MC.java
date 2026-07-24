package mcframe.clientMABC.MABCP0940;

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
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_BizRsnReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_BizRsnReg_MC extends MABCP_BizRsnReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BizRsnReg_MC() {
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
	public MABCP_BizRsnReg_MC(String name) {
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
		callMA_MABCL0940_Upd01();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0940_Srch01();
	}
	/**
	 * [MA_MABCL0940_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0940_Srch01Caller<P extends MABCP_BizRsnReg, B extends MA_MABCL0940_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0940_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索結果のフラグを変更前フラグにコピーする
			bridge.down0().setColumnValue(DtlR.$old_purc_flg, bridge.down0(), DtlR.$purc_flg);
			bridge.down0().setColumnValue(DtlR.$old_purc_rtn_flg, bridge.down0(), DtlR.$purc_rtn_flg);
			bridge.down0().setColumnValue(DtlR.$old_xpns_purc_flg, bridge.down0(), DtlR.$xpns_purc_flg);
			bridge.down0().setColumnValue(DtlR.$old_purc_dscnt_flg, bridge.down0(), DtlR.$purc_dscnt_flg);
			bridge.down0().setColumnValue(DtlR.$old_sls_flg, bridge.down0(), DtlR.$sls_flg);
			bridge.down0().setColumnValue(DtlR.$old_sls_rtn_flg, bridge.down0(), DtlR.$sls_rtn_flg);
			bridge.down0().setColumnValue(DtlR.$old_sls_acxfr_flg, bridge.down0(), DtlR.$sls_acxfr_flg);
			bridge.down0().setColumnValue(DtlR.$old_sls_dscnt_flg, bridge.down0(), DtlR.$sls_dscnt_flg);
			bridge.down0().setColumnValue(DtlR.$old_acxfr_gr_flg, bridge.down0(), DtlR.$acxfr_gr_flg);
			bridge.down0().setColumnValue(DtlR.$old_acxfr_gi_flg, bridge.down0(), DtlR.$acxfr_gi_flg);
			bridge.down0().setColumnValue(DtlR.$old_disp_flg, bridge.down0(), DtlR.$disp_flg);
			bridge.down0().setColumnValue(DtlR.$old_stk_xfr_flg, bridge.down0(), DtlR.$stk_xfr_flg);
			bridge.down0().setColumnValue(DtlR.$old_xfr_flg, bridge.down0(), DtlR.$xfr_flg);
			bridge.down0().setColumnValue(DtlR.$old_yield_flg, bridge.down0(), DtlR.$yield_flg);
			bridge.down0().setColumnValue(DtlR.$old_loss_flg, bridge.down0(), DtlR.$loss_flg);
			bridge.down0().setColumnValue(DtlR.$old_fxd_loss_flg, bridge.down0(), DtlR.$fxd_loss_flg);
			bridge.down0().setColumnValue(DtlR.$old_inpt_flg, bridge.down0(), DtlR.$inpt_flg);
			bridge.down0().setColumnValue(DtlR.$old_dfct_flg, bridge.down0(), DtlR.$dfct_flg);

		}

		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0940_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0940_Upd01Caller<P extends MABCP_BizRsnReg, B extends MA_MABCL0940_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0940_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0940_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0940_Del01Caller<P extends MABCP_BizRsnReg, B extends MA_MABCL0940_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0940_Del01Caller(P p, B b) {
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
		callMA_MABCL0940_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0940_Del01();
	}


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

	protected class DtlCellConfig extends MAUDP_LCLRLBaseCellConfig {
		public DtlCellConfig(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (getStatus() == UPD || getStatus() == UPD_ADMIN) {
				if (column == columnDtl_purc_sort_seq) {
					if (r.purc_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_purc_rtn_sort_seq) {
					if (r.purc_rtn_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_slo_xpns_purc_flg) {
					if (r.xpns_purc_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_purc_dscnt_loc_mng_typ) {
					if (r.purc_dscnt_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_purc_dscnt_sort_seq) {
					if (r.purc_dscnt_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_sls_sort_seq) {
					if (r.sls_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_sls_rtn_sort_seq) {
					if (r.sls_rtn_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_sls_dscnt_sort_seq) {
					if (r.sls_dscnt_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_acxfr_gr_flg) {
					if (r.acxfr_gi_flg()) {
						return MCMode.DISABLE;
					}
				}
				if (column == columnDtl_acxfr_gr_sort_seq) {
					if (r.acxfr_gr_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_acxfr_gi_flg) {
					if (r.acxfr_gr_flg()) {
						return MCMode.DISABLE;
					}
				}
				if (column == columnDtl_acxfr_gi_sort_seq) {
					if (r.acxfr_gi_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_inpt_acxfr_sort_seq) {
					if (r.acxfr_gr_flg() || r.acxfr_gi_flg()) {
						return MCMode.ENABLE;
					}
				}
				if (column == columnDtl_disp_sort_seq) {
					if (r.disp_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_stk_xfr_sort_seq) {
					if (r.stk_xfr_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_xfr_sort_seq) {
					if (r.xfr_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_yield_typ) {
					if (r.yield_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_yield_sort_seq) {
					if (r.yield_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_not_stk_flg) {
					if (MAC_YIELD_TYP.isDFCT(r.yield_typ())) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_not_lot_trace_flg) {
					if (r.loss_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_inpt_sort_seq) {
					if (r.inpt_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnDtl_dfct_sort_seq) {
					if (r.dfct_flg()) {
						return MCMode.REQUIRED;
					}
				}
				if (getStatus() == UPD && !isNull(r.upd_cntr())) {
					// 仕入ＦＬＧ
					if (column == columnDtl_purc_flg) {
						if (r.old_purc_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 仕入返品ＦＬＧ
					if (column == columnDtl_purc_rtn_flg) {
						if (r.old_purc_rtn_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 経費購買ＦＬＧ
					if (column == columnDtl_xpns_purc_flg) {
						if (r.old_xpns_purc_flg()){
							return MCMode.READ_ONLY;
						}
						else {
							if (r.purc_flg() || r.purc_rtn_flg()) {
								return MCMode.REQUIRED;
							}
						}
					}
					// 仕入調整ＦＬＧ
					if (column == columnDtl_purc_dscnt_flg) {
						if (r.old_purc_dscnt_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 売上ＦＬＧ
					if (column == columnDtl_sls_flg) {
						if (r.old_sls_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 売上返品ＦＬＧ
					if (column == columnDtl_sls_rtn_flg) {
						if (r.old_sls_rtn_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 販売他勘定ＦＬＧ
					if (column == columnDtl_sls_acxfr_flg) {
						if (r.old_sls_acxfr_flg()){
							return MCMode.READ_ONLY;
						}
						else {
							if (r.sls_flg() || r.sls_rtn_flg()) {
								return MCMode.REQUIRED;
							}
						}
					}
					// 売上調整ＦＬＧ
					if (column == columnDtl_sls_dscnt_flg) {
						if (r.old_sls_dscnt_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 他勘定入庫ＦＬＧ
					if (column == columnDtl_acxfr_gr_flg) {
						if (r.old_acxfr_gr_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 他勘定出庫ＦＬＧ
					if (column == columnDtl_acxfr_gi_flg) {
						if (r.old_acxfr_gi_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 廃棄ＦＬＧ
					if (column == columnDtl_disp_flg) {
						if (r.old_disp_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 在庫振替ＦＬＧ
					if (column == columnDtl_stk_xfr_flg) {
						if (r.old_stk_xfr_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 移送ＦＬＧ
					if (column == columnDtl_xfr_flg) {
						if (r.old_xfr_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 出来高ＦＬＧ
					if (column == columnDtl_yield_flg) {
						if (r.old_yield_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// ロスＦＬＧ
					if (column == columnDtl_loss_flg) {
						if (r.old_loss_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 固定ロスＦＬＧ
					if (column == columnDtl_fxd_loss_flg) {
						if (r.old_fxd_loss_flg()){
							return MCMode.READ_ONLY;
						}
						else {
							if (r.loss_flg()) {
								return MCMode.REQUIRED;
							}
						}
					}
					// 投入ＦＬＧ
					if (column == columnDtl_inpt_flg) {
						if (r.old_inpt_flg()){
							return MCMode.READ_ONLY;
						}
					}
					// 検査不良ＦＬＧ
					if (column == columnDtl_dfct_flg) {
						if (r.old_dfct_flg()){
							return MCMode.READ_ONLY;
						}
					}
				}
				else {
					if (column == columnDtl_xpns_purc_flg) {
						if (r.purc_flg() || r.purc_rtn_flg()) {
							return MCMode.REQUIRED;
						}
					}
					if (column == columnDtl_sls_acxfr_flg) {
						if (r.sls_flg() || r.sls_rtn_flg()) {
							return MCMode.REQUIRED;
						}
					}
					if (column == columnDtl_fxd_loss_flg) {
						if (r.loss_flg()) {
							return MCMode.REQUIRED;
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	@Override
	public void doDtl_purc_flg_NC(MCEventInfo info) {
		super.doDtl_purc_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_purc_sort_seq, r.getGUIIndex(), null);
		if (!r.purc_rtn_flg()) {
			setValueEx(columnDtl_xpns_purc_flg, r.getGUIIndex(), false);
		}
	}

	@Override
	public void doDtl_purc_rtn_flg_NC(MCEventInfo info) {
		super.doDtl_purc_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_purc_rtn_sort_seq, r.getGUIIndex(), null);
		if (!r.purc_flg()) {
			setValueEx(columnDtl_xpns_purc_flg, r.getGUIIndex(), false);
		}
	}

	@Override
	public void doDtl_xpns_purc_flg_NC(MCEventInfo info) {
		super.doDtl_xpns_purc_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_slo_xpns_purc_flg, r.getGUIIndex(), false);
	}

	@Override
	public void doDtl_purc_dscnt_flg_NC(MCEventInfo info) {
		super.doDtl_purc_dscnt_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_purc_dscnt_loc_mng_typ, r.getGUIIndex(), null);
		setValueEx(columnDtl_purc_dscnt_sort_seq, r.getGUIIndex(), null);
	}

	@Override
	public void doDtl_sls_flg_NC(MCEventInfo info) {
		super.doDtl_sls_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_sls_sort_seq, r.getGUIIndex(), null);
		if (!r.sls_rtn_flg()) {
			setValueEx(columnDtl_sls_acxfr_flg, r.getGUIIndex(), false);
		}
	}

	@Override
	public void doDtl_sls_rtn_flg_NC(MCEventInfo info) {
		super.doDtl_sls_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_sls_rtn_sort_seq, r.getGUIIndex(), null);
		if (!r.sls_flg()) {
			setValueEx(columnDtl_sls_acxfr_flg, r.getGUIIndex(), false);
		}
	}

	@Override
	public void doDtl_sls_dscnt_flg_NC(MCEventInfo info) {
		super.doDtl_sls_dscnt_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_sls_dscnt_sort_seq, r.getGUIIndex(), null);
	}

	@Override
	public void doDtl_acxfr_gr_flg_NC(MCEventInfo info) {
		super.doDtl_acxfr_gr_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_acxfr_gr_sort_seq, r.getGUIIndex(), null);
		setValueEx(columnDtl_acxfr_gi_flg, r.getGUIIndex(), false);
	}

	@Override
	public void doDtl_acxfr_gi_flg_NC(MCEventInfo info) {
		super.doDtl_acxfr_gi_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_acxfr_gi_sort_seq, r.getGUIIndex(), null);
		setValueEx(columnDtl_acxfr_gr_flg, r.getGUIIndex(), false);
	}

	@Override
	public void doDtl_disp_flg_NC(MCEventInfo info) {
		super.doDtl_disp_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_disp_sort_seq, r.getGUIIndex(), null);
	}

	@Override
	public void doDtl_stk_xfr_flg_NC(MCEventInfo info) {
		super.doDtl_stk_xfr_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_stk_xfr_sort_seq, r.getGUIIndex(), null);
	}

	@Override
	public void doDtl_xfr_flg_NC(MCEventInfo info) {
		super.doDtl_xfr_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_xfr_sort_seq, r.getGUIIndex(), null);
	}

	@Override
	public void doDtl_yield_flg_NC(MCEventInfo info) {
		super.doDtl_yield_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_yield_typ, r.getGUIIndex(), null);
		setValueEx(columnDtl_yield_sort_seq, r.getGUIIndex(), null);
	}

	@Override
	public void doDtl_yield_typ_LC(MCEventInfo info) {
		super.doDtl_yield_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_not_stk_flg, r.getGUIIndex(), false);
	}

	@Override
	public void doDtl_loss_flg_NC(MCEventInfo info) {
		super.doDtl_loss_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_fxd_loss_flg, r.getGUIIndex(), false);
		setValueEx(columnDtl_not_lot_trace_flg, r.getGUIIndex(), false);
	}

	@Override
	public void doDtl_inpt_flg_NC(MCEventInfo info) {
		super.doDtl_inpt_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_inpt_sort_seq, r.getGUIIndex(), null);
	}

	@Override
	public void doDtl_dfct_flg_NC(MCEventInfo info) {
		super.doDtl_dfct_flg_NC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		setValueEx(columnDtl_dfct_sort_seq, r.getGUIIndex(), null);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_BIZ_RSN));
	}

}