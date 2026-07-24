package mcframe.clientMBBB.MBBBP0400;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBBP_CopyMaster"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBBP_CopyMaster_MC extends MBBBP_CopyMaster_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_CopyMaster_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBBL0400_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0400_Upd01Caller<P extends MBBBP_CopyMaster, B extends MB_MBBBL0400_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_BatchCaller<P, B> {

		protected MB_MBBBL0400_Upd01Caller(P p, B b) {
			super(p, b);
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
		protected void setupParam() {
			super.setupParam();
			editCnd();
		}

		protected void editCnd() {
			if (Cnd_ope_ADD_ONLY.isSelected()) {
				getCndR().master_imp_typ(MAC_MASTER_IMP_TYP.ADD_ONLY.value());
			}
			else if (Cnd_ope_ADD_UPD.isSelected()) {
				getCndR().master_imp_typ(MAC_MASTER_IMP_TYP.ADD_UPD.value());
			}
			else if (Cnd_ope_REMAKE.isSelected()) {
				getCndR().master_imp_typ(MAC_MASTER_IMP_TYP.REMAKE.value());
			}
		}
	}

	/**
	 * Panel[Cnd]のボタン[open_MABCP1020]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP1020(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1020");
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Cnd]のボタン[open_MABCP1030]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP1030(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1030");
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Cnd]のボタン[open_MABCP1000]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP1000(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1000");
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Cnd]のボタン[open_MABCP1130]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP1130(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1130");
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Cnd]のボタン[open_MABCP0030_bank]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP0030_bank(MCEventInfo info) {
		doBtn_open_MABCP0030(MAC_MST_NM.MAM_BANK.value());
	}
	/**
	 * Panel[Cnd]のボタン[open_MABCP0030_bank_branch]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP0030_bank_branch(MCEventInfo info) {
		doBtn_open_MABCP0030(MAC_MST_NM.MAM_BANK_BRANCH.value());
	}
	/**
	 * Panel[Cnd]のボタン[open_MABCP0030_bank_ac]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP0030_bank_ac(MCEventInfo info) {
		doBtn_open_MABCP0030(MAC_MST_NM.MAM_BANK_AC.value());
	}
	/**
	 * Panel[Cnd]のボタン[open_MABCP0050]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP0050(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0050");
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Cnd]のボタン[open_MABCP1180]の押下時の処理
	 */
	@Override
	public void doCnd_open_MABCP1180(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1180");
		aso.runValueInit();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		setBoolean(CndPanel, true);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		setBoolean(CndPanel, false);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMB_MBBBL0400_Upd01();
	}

	// -----------------------------------------------
	// status
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		CndPanel.focusFirstComponent();
	}

	protected void doBtn_open_MABCP0030(String str) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0030");
		mcframe.clientMABC.MABCP0030.CndR to = mcframe.clientMABC.MABCP0030.CndR.create();
		to.mst_nm(str);
		aso.putCnd(to);
		aso.runValueInit();
		aso.show();
	}

}