package mcframe.clientMGBB.MGBBP0240;

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
 * 画面"MGBBP_StInfoCopyReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBBP_StInfoCopyReg_MC extends MGBBP_StInfoCopyReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_StInfoCopyReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBBL0240_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0240_Ins01Caller<P extends MGBBP_StInfoCopyReg, B extends MG_MGBBL0240_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBBL0240_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkSame(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_stk_flg, Cnd_wip_flg));
		}

		/**
		 * コピー元の値とコピー先の値が同一の場合にはエラーメッセージを返す。
		 * @param msgList
		 */
		protected void checkSame(MCMessageList msgList) {
			String calcGrpFr = getCndR().calc_grp_cd_fr();
			String calcGrpTo = getCndR().calc_grp_cd_to();
			MCDate ymFr = getCndR().ym_fr();
			MCDate ymTo = getCndR().ym_to();
			if (isSame(calcGrpFr, calcGrpTo) && isSame(ymFr, ymTo)
					&& !isNullAnd(calcGrpFr, calcGrpTo, ymFr, ymTo)) {
				msgList.add(new MCMessage(MGBBP0004));
			}
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			CndPanel.focusFirstComponent();
		}
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBBL0240_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBBP0210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0210(MCEventInfo info) {
		showMGBBP0210(getCndR());
	}

	protected void showMGBBP0210(CndR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0210");
		setupMGBBP0210AsoParam(aso, r);
		aso.show();
	}

	protected void setupMGBBP0210AsoParam(MAUCP_AppScreenOpener aso, CndR r) {
		aso.putCnd(crtOpenMGBBP0210CndR(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
	}

	protected mcframe.clientMGBB.MGBBP0210.CndR crtOpenMGBBP0210CndR(MAUCP_AppScreenOpener aso, CndR r) {
		mcframe.clientMGBB.MGBBP0210.MGBBP_StStkReg p = (mcframe.clientMGBB.MGBBP0210.MGBBP_StStkReg)aso.getPanel();
		mcframe.clientMGBB.MGBBP0210.CndR to = mcframe.clientMGBB.MGBBP0210.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_grp_cd(r.calc_grp_cd_to());
		to.ym_fr(r.ym_to());
		to.ym_to(r.ym_to());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MGBBP0220]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBBP0220(MCEventInfo info) {
		showMGBBP0220(getCndR());
	}

	protected void showMGBBP0220(CndR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBBP0220");
		setupMGBBP0220AsoParam(aso, r);
		aso.show();
	}

	protected void setupMGBBP0220AsoParam(MAUCP_AppScreenOpener aso, CndR r) {
		aso.putCnd(crtOpenMGBBP0220CndR(aso, r));
		aso.runValueInit();
		aso.putSearchAction();
	}

	protected mcframe.clientMGBB.MGBBP0220.CndR crtOpenMGBBP0220CndR(MAUCP_AppScreenOpener aso, CndR r) {	
	mcframe.clientMGBB.MGBBP0220.MGBBP_StWipReg p = (mcframe.clientMGBB.MGBBP0220.MGBBP_StWipReg)aso.getPanel();
		mcframe.clientMGBB.MGBBP0220.CndR to = mcframe.clientMGBB.MGBBP0220.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_grp_cd(r.calc_grp_cd_to());
		to.ym_fr(r.ym_to());
		to.ym_to(r.ym_to());

		return to;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		Cnd_stk_flg.setValue(true);
		Cnd_wip_flg.setValue(true);
		Cnd_lot_no_flg.setValue(true);
		Cnd_sublot_no_flg.setValue(true);
		Cnd_sno1_flg.setValue(true);
		Cnd_sno2_flg.setValue(true);
		Cnd_sno3_flg.setValue(true);
		Cnd_sno4_flg.setValue(true);
		Cnd_bp_flg.setValue(true);
		Cnd_asst_flg.setValue(true);
		Cnd_del_flg.setValue(true);
	}

}