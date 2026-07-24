package mcframe.clientMABC.MABCP1220;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_JnlKeyMapReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_JnlKeyMapReg_MC extends MABCP_JnlKeyMapReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_JnlKeyMapReg_MC() {
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
	public MABCP_JnlKeyMapReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1220_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1220_Srch01Caller<P extends MABCP_JnlKeyMapReg, B extends MA_MABCL1220_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1220_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_off_cost_flg, Cnd_on_cost_flg));
		}
	}

	/**
	 * [MA_MABCL1220_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1220_Upd01Caller<P extends MABCP_JnlKeyMapReg, B extends MA_MABCL1220_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1220_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL1220_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1220_Del01Caller<P extends MABCP_JnlKeyMapReg, B extends MA_MABCL1220_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1220_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL1220_Srch01();
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
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL1220_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL1220_Del01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_JNL_KEY_MAP));

		setValueEx(Cnd_off_cost_flg, true);
		setValueEx(Cnd_on_cost_flg, true);
	}

	@Override
	public MCList getCnd_ac_slip_typ(MCRow row, MCEventInfo info) {
		return getAcSlipTypL(super.getCnd_ac_slip_typ(row, info));
	}

	@Override
	public MCList getDtl_ac_slip_typ(MCRow row, MCEventInfo info) {
		return getAcSlipTypL(super.getDtl_ac_slip_typ(row, info));
	}

	MCList<MCRow> _acSlipTypL;
	protected MCList<MCRow> getAcSlipTypL(MCList<MCRow> l) {
		if (_acSlipTypL == null) {
			_acSlipTypL = MCList.create(MCRow.class);
			for (MCRow r : l) {
				String typ = r.getString(AcSlipTypCols.$o_ac_slip_typ);
				if (MAC_AC_SLIP_TYP.is_tran_typ(typ) || MAC_AC_SLIP_TYP.is_stk_typ(typ)
						|| MAC_AC_SLIP_TYP.is_pay_typ(typ)
						|| MAC_AC_SLIP_TYP.is_credit_typ(typ)
						|| MAC_AC_SLIP_TYP.is_cost_typ(typ)) {
					_acSlipTypL.add(r);
				}
			}
		}
		return _acSlipTypL;
	}

	@Override
	public MCList getDtl_jnl_key_set_col_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getDtl_jnl_key_set_col_typ(row, info);
		MCList<MCRow> newL = MCList.create(MCRow.class);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		for (MCRow r : l) {
			if (chkAddJnlKeySetColTyp(r, dtlR)) {
				newL.add(r);
			}
		}
		return newL;
	}

	@Override
	public MCList getDtl_bp_jnl_key_set_col_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getDtl_jnl_key_set_col_typ(row, info);
		MCList<MCRow> newL = MCList.create(MCRow.class);
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		for (MCRow r : l) {
			String typ = r.getString(JnlKeySetColTypCols.$o_jnl_key_set_col_typ);
			if (MAC_JNL_KEY_SET_COL_TYP.is_bp(typ)) {
				if (chkAddJnlKeySetColTyp(r, dtlR)) {
					newL.add(r);
				}
			}
		}
		return newL;
	}

	/**
	 * 会計伝票区分、原価ＦＬＧの値に対応した仕訳キー設定項目区分かチェック
	 */
	protected boolean chkAddJnlKeySetColTyp(MCRow typR, DtlR dtlR) {
		String typ = typR.getString(JnlKeySetColTypCols.$o_jnl_key_set_col_typ);
		if (dtlR.cost_flg()) {
			if (MAC_JNL_KEY_SET_COL_TYP.is_cost(typ)) {
				return true ;
			}
		}
		else {
			if (MAC_AC_SLIP_TYP.is_tran_typ(dtlR.ac_slip_typ())) {
				if (MAC_JNL_KEY_SET_COL_TYP.is_io(typ)) {
					return true ;
				}
			}
			else if (MAC_AC_SLIP_TYP.is_stk_typ(dtlR.ac_slip_typ())) {
				if (MAC_JNL_KEY_SET_COL_TYP.is_stk(typ)) {
					return true ;
				}
			}
			else if (MAC_AC_SLIP_TYP.is_credit_typ(dtlR.ac_slip_typ())) {
				if (MAC_JNL_KEY_SET_COL_TYP.is_rcv(typ)) {
					return true ;
				}
			}
			else if (MAC_AC_SLIP_TYP.is_pay_typ(dtlR.ac_slip_typ())) {
				if (MAC_JNL_KEY_SET_COL_TYP.is_pay(typ)) {
					return true ;
				}
			}
		}
		return false;
	}


	@Override
	public void doDtl_ac_slip_typ_LC(MCEventInfo info) {
		super.doDtl_ac_slip_typ_LC(info);
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		String typ = r.ac_slip_typ();
		if (MAC_AC_SLIP_TYP.is_cost_typ(typ)
				&& !MAC_AC_SLIP_TYP.is_pay_typ(typ)
				&& !MAC_AC_SLIP_TYP.is_tran_typ(typ)
				&& !MAC_AC_SLIP_TYP.is_stk_typ(typ)
				&& !MAC_AC_SLIP_TYP.is_credit_typ(typ)) {
			setValueEx(columnDtl_cost_flg, idx, true);
		}
		else if (!MAC_AC_SLIP_TYP.is_cost_typ(typ)) {
			setValueEx(columnDtl_cost_flg, idx, false);
		}
		setValueEx(columnDtl_jnl_key_set_col_typ, idx, null);
	}

	@Override
	public void doDtl_cost_flg_NC(MCEventInfo info) {
		super.doDtl_cost_flg_NC(info);
		setValueEx(columnDtl_jnl_key_set_col_typ, info.getEventIndex(), null);
	}

	@Override
	public void doDtl_jnl_key_set_col_typ_LC(MCEventInfo info) {
		super.doDtl_jnl_key_set_col_typ_LC(info);
		setValueEx(columnDtl_bp_jnl_key_set_col_typ, info.getEventIndex(), null);
	}

	// //////////////////////////////////////////////
	// セルコンフィグ
	// //////////////////////////////////////////////

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}

	protected DtlCellConfig createDtlCellConfig() {
		return new DtlCellConfig(this);
	}

	protected class DtlCellConfig extends MAUDP_RLBaseCellConfig {

		public DtlCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = DtlTable.getRow(index);
			if (column == columnDtl_cost_flg) {
				if (MAC_AC_SLIP_TYP.is_cost_typ(r.ac_slip_typ())
						&& !MAC_AC_SLIP_TYP.is_pay_typ(r.ac_slip_typ())
						&& !MAC_AC_SLIP_TYP.is_tran_typ(r.ac_slip_typ())
						&& !MAC_AC_SLIP_TYP.is_stk_typ(r.ac_slip_typ())
						&& !MAC_AC_SLIP_TYP.is_credit_typ(r.ac_slip_typ())
						|| !MAC_AC_SLIP_TYP.is_cost_typ(r.ac_slip_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_bp_jnl_key_set_col_typ) {
				if (!MAC_JNL_KEY_SET_COL_TYP.is_bp_grp(r.jnl_key_set_col_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}

	}

}