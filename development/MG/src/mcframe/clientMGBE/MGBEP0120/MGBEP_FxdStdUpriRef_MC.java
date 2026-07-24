package mcframe.clientMGBE.MGBEP0120;

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

import mcframe.clientMAUB.MAUBP0230.*;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_FxdStdUpriRef"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_FxdStdUpriRef_MC extends MGBEP_FxdStdUpriRef_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_FxdStdUpriRef_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0120_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0120_Ins01Caller<P extends MGBEP_FxdStdUpriRef, B extends MG_MGBEL0120_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBEL0120_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 画面の値を変更することなしに連続で実行できるようにするため
			return false;
		}
	}


	/**
	 * Panel[Btn]のボタン[open_MGBEP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0200(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0200");
		mcframe.clientMGBE.MGBEP0200.CndR to = mcframe.clientMGBE.MGBEP0200.CndR.create();
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MABCP0860]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP0860(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0860");
		mcframe.clientMABC.MABCP0860.CndR to = mcframe.clientMABC.MABCP0860.CndR.create();
		mcframe.clientMABC.MABCP0860.MABCP_StdcostReg p = (mcframe.clientMABC.MABCP0860.MABCP_StdcostReg) aso
				.getPanel();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.wg_flg(true);
		to.wg_cd(getCndR().wg_cd());
		to.term_fr(getCndR().term());
		to.term_to(getCndR().term());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMABC.MABCP0860.CndR.$cmn_flg);
		aso.putCnd(to, list);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBEL0120_Ins01();
	}


	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		initCalcCtg();
	}

	protected void initCalcCtg() {
		setDefCalcCtg(Cnd_calc_ctg_cd);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Cnd_term.addLCListener(this);
	}

	// -----------------------------------------------
	// status
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setBtnMode();
	}

	protected void setBtnMode() {
		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBEP0200, isEnableBtn_open_MGBEP0200());
		setBtnModeByFlg(Btn_open_MABCP0860, isEnableBtn_open_MABCP0860());
	}

	/**
	 * 確定標準単価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0200() {
		String wgCd = getSysParm("DEF_WG_CD");
		if (isNullOrNullVal(wgCd)) {
			wgCd =  getCndR().wg_cd();
		}
		return !isNullOr(getCndR().term(), getCndR().calc_ctg_cd(), wgCd);
	}

	/**
	 * 標準単価マスタ登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABCP0860() {
		String wgCd = getSysParm("DEF_WG_CD");
		if (isNullOrNullVal(wgCd)) {
			wgCd =  getCndR().wg_cd();
		}
		return !isNullOr(getCndR().term(), wgCd);
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_term) {
			doCnd_term_LC(info);
		}
	}

	protected void doCnd_term_LC(MCEventInfo info){
		setBtnMode();
	}

	@Override
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info) {
		super.doCnd_calc_ctg_cd_LC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_wg_cd_LC(MCEventInfo info) {
		super.doCnd_wg_cd_LC(info);
		setBtnMode();
	}

}