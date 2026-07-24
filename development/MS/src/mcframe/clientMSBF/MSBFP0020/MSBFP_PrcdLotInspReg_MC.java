package mcframe.clientMSBF.MSBFP0020;

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

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0110.*;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_PrcdLotInspReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_PrcdLotInspReg_MC extends MSBFP_PrcdLotInspReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_PrcdLotInspReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0020_Srch01Caller<P extends MSBFP_PrcdLotInspReg, B extends MS_MSBFL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBFL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setScreenAsync(false);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 新規登録時、Ins01で必須チェックを行うため、Srch01では実行しません
		}

		@Override
		protected void show() {
			showMerge();
			getCndR().setStatus(MCRow.CREATE);
		}
	}


	/**
	 * [MS_MSBFL0020_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0020_Ins01Caller<P extends MSBFP_PrcdLotInspReg, B extends MS_MSBFL0020_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0020_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			
			setFIXStatus();
		}
		@Override
		protected MCMessage msgExecConfirm() {
			return super.msgExecConfirm();
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			confirmItmInsp(msgList);
		}
		
		protected void confirmItmInsp(MCMessageList msgList) {
			if (!getCndR().pre_insp_valid_flg()) {
				msgList.add(new MCMessage(MSBFP0001));
			}
			if (getCndR().no_spec_flg()) {
				msgList.add(new MCMessage(MSBFP0005));
			}
		}
	}

	/**
	 * [MS_MSBFL0020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0020_Del01Caller<P extends MSBFP_PrcdLotInspReg, B extends MS_MSBFL0020_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0020_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			
			setFIXStatus();
		}
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBFL0020_Srch01();
		callMS_MSBFL0020_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBFL0020_Del01();
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		getCnd_sppl_cd_ListPutter().putBind(BpCols.$i_sppl_flg , true);
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_maker_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_cst_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_acst_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_bcst_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_rcst_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_dlv_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_dest_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_cred_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_sppl_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_asppl_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_bsppl_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_psppl_flg , MCMode.READ_ONLY.getName());	

		getCnd_maker_cd_ListPutter().putBind(BpCols.$i_maker_flg , true);
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_maker_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_sppl_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_cst_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_acst_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_bcst_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_rcst_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_dlv_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_dest_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_cred_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_sppl_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_asppl_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_bsppl_flg , MCMode.READ_ONLY.getName());
		getCnd_maker_cd_ListPutter().putBind(BpCols.$m_psppl_flg , MCMode.READ_ONLY.getName());	
		
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().getListPutter().putBind(ItmCols.$i_stk_mng_typ, MAC_STK_MNG_TYP.MNG.value());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().getListPutter().putBind(ItmCols.$m_stk_mng_typ, MCMode.READ_ONLY.getName());
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getCndR().master_dt(getToday());
		CndPanel.focusFirstComponent();
	}
	
	@Override
	public void doCnd_ins_typ_NC(MCEventInfo info) {
		super.doCnd_ins_typ_NC(info);

		if (isSame(info.getNewValue(), Cnd_ins_typ_INS.getActionCommand())) {
			getCndR().clear(CndR.$insp_schd_no);
			setINSStatus();
			getCndR().master_dt(getToday());
		}
		else if (isSame(info.getNewValue(), Cnd_ins_typ_DEL.getActionCommand())) {
			getCndR().clear(
					CndR.$master_dt,
					CndR.$loc_cd,
					CndR.$loc_nm,
					CndR.$sppl_cd,
					CndR.$sppl_nm,
					CndR.$maker_cd,
					CndR.$maker_nm,
					CndR.$itm_cd,
					CndR.$itm_sub1,
					CndR.$itm_sub2,
					CndR.$itm_sub3,
					CndR.$itm_nm,
					CndR.$bp_lot_no,
					CndR.$st_dt,
					CndR.$st_tm,
					CndR.$end_dt,
					CndR.$end_tm,
					CndR.$insp_cnt_rmrks,
					CndR.$sub_char1,
					CndR.$sub_char2,
					CndR.$sub_char3
					);
			setDELStatus();
		}
		
		CndPanel.focusFirstComponent();
	}

}