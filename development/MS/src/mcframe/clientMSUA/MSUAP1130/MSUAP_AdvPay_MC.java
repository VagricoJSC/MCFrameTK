package mcframe.clientMSUA.MSUAP1130;

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
import mcframe.clientMAUB.MAUBP5390.*;

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
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMSUA.MSUAC0090.MSUAC_List.AdvPayCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUAP_AdvPay"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_AdvPay_MC extends MSUAP_AdvPay_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_AdvPay_MC() {
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
	public MSUAP_AdvPay_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), true);
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), false);
		}
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		doAccept();
	}
	
	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				AdvPayCols.$i_bsppl_cd,AdvPayCols.$i_bsppl_nm,
				AdvPayCols.$i_bsppl_dpt_cd,AdvPayCols.$i_bsppl_dpt_nm,
				AdvPayCols.$i_bsppl_wg_cd,AdvPayCols.$i_bsppl_wg_nm,
				AdvPayCols.$i_bd_dpt_cd,AdvPayCols.$i_bd_dpt_nm,
				AdvPayCols.$i_trd_cur_cd,AdvPayCols.$i_trd_cur_nm
				};
	}
	
	@Override
	protected void checkForCallStack(MCMessageList msgList) {
		super.checkForCallStack(msgList);
		msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_pay_act_dt_fr, Cnd_pay_act_dt_to));
	}
	
	@Override
	public void setCondition(MCRow row , String mode){
		super.setCondition(row ,mode);
		if (row != null) {
			getCndR().adv_pay_act_no(row.getStringNE($INPUT_VAL));
		}
	}
	
	@Override
	public void screenClearBody() {
		String bspplCd = getCndR().bsppl_cd();
		String bspplDptCd = getCndR().bsppl_dpt_cd();
		String bspplWgCd = getCndR().bsppl_wg_cd();
		String bdDptCd = getCndR().bd_dpt_cd();
		String curCd = getCndR().trd_cur_cd();
		super.screenClearBody();
		getCndR().bsppl_cd(bspplCd);
		getCndR().bsppl_dpt_cd(bspplDptCd);
		getCndR().bsppl_wg_cd(bspplWgCd);
		getCndR().bd_dpt_cd(bdDptCd);
		getCndR().trd_cur_cd(curCd);
	}
		
	@Override
	public MCList getCnd_ap_sttl_cd(MCRow row, MCEventInfo info) {
		// 債務決済区分が預金・現金・手形の債務決済方法を選択できる		
		MCList<MCRow> lst = super.getCnd_ap_sttl_cd(row, info), retL = lst.createInstance();
		
		for (MCRow r : lst) {
			String typ = r.getString("ap_sttl_typ");
			if (MAC_AP_STTL_TYP.isCASH(typ) || MAC_AP_STTL_TYP.isNOTE(typ) || MAC_AP_STTL_TYP.isACNT(typ)) {
				retL.add(r);
			}
		}
		return retL;
	}

}