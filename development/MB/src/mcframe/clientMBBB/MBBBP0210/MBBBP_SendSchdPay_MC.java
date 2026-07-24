package mcframe.clientMBBB.MBBBP0210;

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
 * 画面"MBBBP_SendSchdPay"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBBP_SendSchdPay_MC extends MBBBP_SendSchdPay_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_SendSchdPay_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBBL0210_Ins01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0210_Ins01Caller<P extends MBBBP_SendSchdPay, B extends MB_MBBBL0210_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_BatchCaller<P, B> {

		protected MB_MBBBL0210_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MB_MBBBL0210_Del01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0210_Del01Caller<P extends MBBBP_SendSchdPay, B extends MB_MBBBL0210_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_BatchCaller<P, B> {

		protected MB_MBBBL0210_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Btn]のボタン[upd_sd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sd(MCEventInfo info) {
		callMB_MBBBL0210_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del_can]の押下時の処理
	 */
	@Override
	public void doBtn_del_can(MCEventInfo info) {
		callMB_MBBBL0210_Del01();
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		getCndR().ym(getAcYm(getToday(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
	}

	// -----------------------------------------------
	// status
	protected void setUpdStatus(){
		if (Cnd_ope_SD.isSelected()) {
			setUPD_SDStatus();
		}
		else if (Cnd_ope_CAN.isSelected()) {
			setUPD_CANStatus();
		}
	}

	@Override
	public void setUPD_SDStatus() {
		super.setUPD_SDStatus();
		setStatusCom();
	}
	@Override
	public void setUPD_CANStatus() {
		super.setUPD_CANStatus();
		setStatusCom();
	}
	protected void setStatusCom() {
		setFocus();
	}
	protected void setFocus() {
		CndPanel.focusFirstComponent();
	}

	// -----------------------------------------------
	// event
	@Override
	public void doCnd_ope_NC(MCEventInfo info){
		super.doCnd_ope_NC(info);
		setUpdStatus();
		setValueEx(Cnd_ext_sys_cd, null);
	}

}