package mcframe.clientMABC.MABCP0400;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0230.*;
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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ItmRlsReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ItmRlsReg_MC extends MABCP_ItmRlsReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmRlsReg_MC() {
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
	public MABCP_ItmRlsReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1120]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1120(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1120");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1120CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1120.CndR crtOpenMABSP1120CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1120.CndR to = mcframe.clientMABS.MABSP1120.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1100]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1100(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1100");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1100CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1100.CndR crtOpenMABSP1100CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1100.CndR to = mcframe.clientMABS.MABSP1100.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1110]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1110(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1110");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1110CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1110.CndR crtOpenMABSP1110CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1110.CndR to = mcframe.clientMABS.MABSP1110.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1130]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1130(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1130");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1130CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1130.CndR crtOpenMABSP1130CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1130.CndR to = mcframe.clientMABS.MABSP1130.CndR.create();
		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0310]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0310(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0310");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0310CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0310.CndR crtOpenMABCP0310CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0310.MABCP_ItmReg p = (mcframe.clientMABC.MABCP0310.MABCP_ItmReg) aso.getPanel();
		mcframe.clientMABC.MABCP0310.CndR to = mcframe.clientMABC.MABCP0310.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
		}
		return to;
	}
	/**
	 * [MA_MABCL0400_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0400_Srch01Caller<P extends MABCP_ItmRlsReg, B extends MA_MABCL0400_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0400_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABCL0400_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0400_Upd01Caller<P extends MABCP_ItmRlsReg, B extends MA_MABCL0400_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0400_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0400_Upd02]の定型処理のInnerClass
	 */
	protected class MA_MABCL0400_Upd02Caller<P extends MABCP_ItmRlsReg, B extends MA_MABCL0400_Upd02Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0400_Upd02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0400_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0400_Del01Caller<P extends MABCP_ItmRlsReg, B extends MA_MABCL0400_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0400_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0400_Srch01();
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
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL0400_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd2]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd2(MCEventInfo info) {
		callMA_MABCL0400_Upd02();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL0400_Del01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		setFlgInit();
		setFlgOpe();
	}
	
	/** 初期値設定(検索フラグ) */
	protected void setFlgInit() {
		// リリース
		setValueEx(Cnd_release_flg_off, true);
		setValueEx(Cnd_release_flg_on, true);
		//販売
		setValueEx(Cnd_sls_tar_out_flg, true);
		setValueEx(Cnd_sls_tar_flg, true);
		setValueEx(Cnd_sls_no_input_flg, true);
		setValueEx(Cnd_sls_input_flg, true);
		// 製造
		setValueEx(Cnd_mfg_tar_out_flg, true);
		setValueEx(Cnd_mfg_tar_flg, true);
		setValueEx(Cnd_mfg_no_input_flg, true);
		setValueEx(Cnd_mfg_input_flg, true);
		// 購買
		setValueEx(Cnd_purc_tar_out_flg, true);
		setValueEx(Cnd_purc_tar_flg, true);
		setValueEx(Cnd_purc_no_input_flg, true);
		setValueEx(Cnd_purc_input_flg, true);
		// 検査
		setValueEx(Cnd_insp_tar_out_flg, true);
		setValueEx(Cnd_insp_tar_flg, true);
		setValueEx(Cnd_insp_no_input_flg, true);
		setValueEx(Cnd_insp_input_flg, true);
	}
	
	/** 操作種別ごとのフフラグ制御 */
	protected void setFlgOpe() {
		setValueEx(Cnd_release_flg_off, true);
		setValueEx(Cnd_release_flg_on, true);
		Cnd_release_flg_off.setMode(MCMode.ENABLE);
		Cnd_release_flg_on.setMode(MCMode.ENABLE);
		if (Cnd_ope_UPD.isSelected()) {
			setValueEx(Cnd_release_flg_off, true);
			setValueEx(Cnd_release_flg_on, false);
			Cnd_release_flg_off.setMode(MCMode.READ_ONLY);
			Cnd_release_flg_on.setMode(MCMode.READ_ONLY);
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setValueEx(Cnd_release_flg_off, false);
			setValueEx(Cnd_release_flg_on, true);
			Cnd_release_flg_off.setMode(MCMode.READ_ONLY);
			Cnd_release_flg_on.setMode(MCMode.READ_ONLY);
		}
	}

	@Override
	protected void setStatusByOpe() {
		if (Cnd_ope_COST.isSelected()) {
			DtlTable.setStatusColumnVisible(false);
			setCOSTStatus();
		}
		else {
			super.setStatusByOpe();
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		setFlgOpe();
		setBtnMode();
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) doDtl_DC(info);
	}

	/**
	 * ダブルクリック：品目マスタ登録へ画面遷移
	 */
	public void doDtl_DC(MCEventInfo info) {
		doDtlBtn_open_MABCP0310(info);
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setBtnMode();
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (isNull(r)){
			for (MCButton b : getOpenBtn()) {
					b.setMode(MCMode.DISABLE);
			}
		}
		else {
			setDefaultMode(DtlBtn_open_MABCP0310);
			setBtnModeByFlg(DtlBtn_open_MABSP1120, isEnableBtn_open_MABSP1120(r));
			setBtnModeByFlg(DtlBtn_open_MABSP1100, isEnableBtn_open_MABSP1100(r));
			setBtnModeByFlg(DtlBtn_open_MABSP1110, isEnableBtn_open_MABSP1110(r));
			setBtnModeByFlg(DtlBtn_open_MABSP1130, isEnableBtn_open_MABSP1130(r));
			
		}
	}

	protected MCButton[] getOpenBtn() {
		return new MCButton[] {
				DtlBtn_open_MABCP0310,
				DtlBtn_open_MABSP1120,
				DtlBtn_open_MABSP1100,
				DtlBtn_open_MABSP1110,
				DtlBtn_open_MABSP1130
		};
	}
	
	/**
	 * ボタンのモードを変更する。
	 * @param btn 処理対象のボタン
	 * @param isEnabled trueの場合、画面ステータスのデフォルトのモード。falseの場合、DISABLEモード。
	 */
	protected void setBtnModeByFlg(MCButton btn, boolean isEnabled) {
		if (isEnabled) {
			setDefaultMode(btn);
		}
		else {
			btn.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 販売品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1120(DtlR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.asset_mng_typ()) && !MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ());
	}

	/**
	 * 製造品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1100(DtlR r) {
		if (r == null) {
			return false;
		}
		return MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ());
	}

	/**
	 * 購買品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1110(DtlR r) {
		if (r == null) {
			return false;
		}
		return !isNullOr(r.asset_mng_typ()) && !MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ());
	}

	/**
	 * 検査品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1130(DtlR r) {
		if (r == null) {
			return false;
		}
		return MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ());
	}

	@Override
	public void fillSpace() {
		// 何もしない
	}

}