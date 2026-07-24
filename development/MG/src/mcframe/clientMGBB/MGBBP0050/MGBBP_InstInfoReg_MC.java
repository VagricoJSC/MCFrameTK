package mcframe.clientMGBB.MGBBP0050;

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
 * 画面"MGBBP_InstInfoReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_InstInfoReg_MC extends MGBBP_InstInfoReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_InstInfoReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0050_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0050_Upd01Caller<P extends MGBBP_InstInfoReg, B extends MG_MGBBL0050_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0050_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setAsync(true);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkAtLeastOne(Cnd_itm_mfg_inst_flg, Cnd_inst_oper_flg));
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndPanel.focusFirstComponent();
		}
	}


	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMG_MGBBL0050_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0030(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0030");
		mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg p = (mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0030.CndR to = mcframe.clientMGBB.MGBBP0030.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBBP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0040(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0040");
		mcframe.clientMGBB.MGBBP0040.MGBBP_InstOperReg p = (mcframe.clientMGBB.MGBBP0040.MGBBP_InstOperReg) aso.getPanel();
		mcframe.clientMGBB.MGBBP0040.CndR to = mcframe.clientMGBB.MGBBP0040.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(getCndR().calc_ctg_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setDefCalcCtg(Cnd_calc_ctg_cd);

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}

		setValueEx(Cnd_itm_mfg_inst_flg, true);
		setValueEx(Cnd_inst_oper_flg, true);
	}

}