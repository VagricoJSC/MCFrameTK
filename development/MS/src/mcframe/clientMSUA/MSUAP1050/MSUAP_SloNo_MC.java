package mcframe.clientMSUA.MSUAP1050;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.SloNoCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUAP_SloNo"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_SloNo_MC extends MSUAP_SloNo_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_SloNo_MC() {
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
	public MSUAP_SloNo_MC(String name) {
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
		callListSrch();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
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
				SloNoCols.$i_slo_d_no_srh_flg, SloNoCols.$i_ref_auth_flg, SloNoCols.$i_slo_no, SloNoCols.$i_in_slo_d_no,
				SloNoCols.$i_slo_dt_fr, SloNoCols.$i_slo_dt_to, SloNoCols.$i_cst_cd, SloNoCols.$i_cst_nm, SloNoCols.$i_vmi_flg,
				SloNoCols.$i_sls_usr_cd, SloNoCols.$i_sls_usr_nm, SloNoCols.$i_sls_dpt_cd, SloNoCols.$i_sls_dpt_nm,
				SloNoCols.$i_wrk_no, SloNoCols.$i_wrk_nm, SloNoCols.$i_itm_cd, SloNoCols.$i_itm_sub1,
				SloNoCols.$i_itm_sub2, SloNoCols.$i_itm_sub3, SloNoCols.$i_itm_nm, SloNoCols.$i_cst_itm_cd,
				SloNoCols.$i_cst_itm_nm, SloNoCols.$i_adv_rcv_flg
		};
	}

	@Override
	protected String[] getInitModeCols() {
		return new String[] {
				SloNoCols.$m_slo_d_no_srh_flg
		};
	}

	@Override
	public void setCondition(MCRow row, String mode) {
		super.setCondition(row, mode);

		if (row != null) {
			if(GET_LIST == mode){
				getCndR().slo_no_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().slo_no(row.getStringNE($INPUT_VAL));
			}
		}
		setPanelMode();
	}

	@Override
	protected void checkForCallStack(MCMessageList msgList) {
		super.checkForCallStack(msgList);
		checkForCallStackSub(msgList);
	}

	protected void checkForCallStackSub(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_slo_dt_fr, Cnd_slo_dt_to));
	}

	@Override
	public void doCnd_slo_d_no_srh_flg_NC(MCEventInfo info){
		setPanelValue();
		setPanelMode();
	}

	protected void setPanelValue(){
		if (!getCndR().slo_d_no_srh_flg()) {
			Cnd_in_slo_d_no.clear();
			Cnd_itm_cd.clear();
			Cnd_itm_sub1.clear();
			Cnd_itm_sub2.clear();
			Cnd_itm_sub3.clear();
			Cnd_itm_nm.clear();
			Cnd_cst_itm_cd.clear();
			Cnd_cst_itm_nm.clear();
		}
	}

	protected void setPanelMode(){
		if (!getCndR().slo_d_no_srh_flg()) {
			Cnd_in_slo_d_no.setMode(MCMode.READ_ONLY);
			Cnd_itm_cd.setMode(MCMode.READ_ONLY);
			Cnd_itm_sub1.setMode(MCMode.READ_ONLY);
			Cnd_itm_sub2.setMode(MCMode.READ_ONLY);
			Cnd_itm_sub3.setMode(MCMode.READ_ONLY);
			Cnd_itm_nm.setMode(MCMode.READ_ONLY);
			Cnd_cst_itm_cd.setMode(MCMode.READ_ONLY);
			Cnd_cst_itm_nm.setMode(MCMode.READ_ONLY);
			columnRslt_slo_d_no.setMode(MCMode.INVISIBLE);
			columnRslt_itm_cd.setMode(MCMode.INVISIBLE);
			columnRslt_itm_sub1.setMode(MCMode.INVISIBLE);
			columnRslt_itm_sub2.setMode(MCMode.INVISIBLE);
			columnRslt_itm_sub3.setMode(MCMode.INVISIBLE);
			columnRslt_itm_nm.setMode(MCMode.INVISIBLE);
			columnRslt_cst_itm_cd.setMode(MCMode.INVISIBLE);
			columnRslt_cst_itm_nm.setMode(MCMode.INVISIBLE);
		}
		else {
			setDefaultMode(Cnd_in_slo_d_no);
			setDefaultMode(Cnd_itm_cd);
			setDefaultMode(Cnd_itm_sub1);
			setDefaultMode(Cnd_itm_sub2);
			setDefaultMode(Cnd_itm_sub3);
			setDefaultMode(Cnd_itm_nm);
			setDefaultMode(Cnd_cst_itm_cd);
			setDefaultMode(Cnd_cst_itm_nm);
			setDefaultMode(columnRslt_slo_d_no);
			setDefaultMode(columnRslt_itm_cd);
			setDefaultMode(columnRslt_itm_sub1);
			setDefaultMode(columnRslt_itm_sub2);
			setDefaultMode(columnRslt_itm_sub3);
			setDefaultMode(columnRslt_itm_nm);
			setDefaultMode(columnRslt_cst_itm_cd);
			setDefaultMode(columnRslt_cst_itm_nm);
		}
	}

}