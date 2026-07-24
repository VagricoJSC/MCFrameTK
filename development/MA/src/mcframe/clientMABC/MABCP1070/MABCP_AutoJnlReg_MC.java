package mcframe.clientMABC.MABCP1070;

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
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_AutoJnlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_AutoJnlReg_MC extends MABCP_AutoJnlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_AutoJnlReg_MC() {
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
	public MABCP_AutoJnlReg_MC(String name) {
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
		callMA_MABCL1070_Srch01();
	}
	/**
	 * [MA_MABCL1070_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1070_Srch01Caller<P extends MABCP_AutoJnlReg, B extends MA_MABCL1070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1070_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL1070_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1070_Upd01Caller<P extends MABCP_AutoJnlReg, B extends MA_MABCL1070_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1070_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkStEndDtValid(MCMessageList list) {
			//適用開始日はKeyではないため上書き 
		}
	}

	/**
	 * [MA_MABCL1070_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1070_Del01Caller<P extends MABCP_AutoJnlReg, B extends MA_MABCL1070_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1070_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MABCP1090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP1090(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1090");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP1090CndR(aso));
		aso.show();
	}
	/**
	 * 遷移先[MABCP1090]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP1090.CndR crtOpenMABCP1090CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP1090.CndR to = mcframe.clientMABC.MABCP1090.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.jnl_ptn_cd(r.jnl_ptn_cd());
			if (!isNull(to.jnl_ptn_cd())) {
				aso.putSearchAction();
			}
		}
		return to;
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
		callMA_MABCL1070_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL1070_Del01();
	}

	@Override
	public void doCnd_no_auto_jnl_key_flg_NC(MCEventInfo info) {
		super.doCnd_no_auto_jnl_key_flg_NC(info);
		if (getCndR().no_auto_jnl_key_flg()) {
			setValueEx(Cnd_auto_jnl_key_cd, null);
		}
	}

	@Override
	public void doCnd_auto_jnl_key_cd_NC(MCEventInfo info) {
		super.doCnd_auto_jnl_key_cd_NC(info);
		if (!isNull(getCndR().auto_jnl_key_cd())) {
			getCndR().no_auto_jnl_key_flg(false);
		}
	}

	@Override
	public void doDtl_NC(MCEventInfo info){
		super.doDtl_NC(info);
		setOpenButtonMode();
	}

	@Override
	public void doDtl_jnl_ptn_cd_LC(MCEventInfo info){
		super.doDtl_jnl_ptn_cd_LC(info);
		setOpenButtonMode();
	}

	protected void setOpenButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (r == null || isNull(r.jnl_ptn_cd())) {
			Btn_open_MABCP1090.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MABCP1090);
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setOpenButtonMode();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setOpenButtonMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setOpenButtonMode();
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

	protected class DtlCellConfig extends MAUDP_RLBaseCellConfig {
		public DtlCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			if (getStatus() == UPD) {
				if (column == columnDtl_slip_cnt_id) {
					if (isReqSlipCntId(index)) {
						return MCMode.REQUIRED;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		/**
		 * 伝票グループＩＤの入力が必須か
		 * 
		 * @param index
		 * @return 必須の場合true
		 */
		protected boolean isReqSlipCntId(int index) {
			String idTyp = (String)columnDtl_id_typ.getValue(index);
			return MAC_ID_TYP.isMST(idTyp);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_AUTO_JNL));
	}

}