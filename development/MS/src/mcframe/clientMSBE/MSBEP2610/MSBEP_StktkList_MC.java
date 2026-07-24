package mcframe.clientMSBE.MSBEP2610;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_StktkList"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_StktkList_MC extends MSBEP_StktkList_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _invlist = false;
	protected boolean _difflist = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StktkList_MC() {
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
	public MSBEP_StktkList_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2610_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch01Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUPD_UILStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_UILStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch02Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
			checkForCallStack_ItmLoc(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setUPD_UIIStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_UIIStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch03Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch03Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_tgt_TOR_M.isSelected()) {
				setUPD_UTMStatus();
			}
			else if (Cnd_tgt_TOR_L.isSelected()) {
				setUPD_UTLStatus();
			}
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_tgt_TOR_M.isSelected()) {
				setSRCH_UTMStatus();
			}
			else if (Cnd_tgt_TOR_L.isSelected()) {
				setSRCH_UTLStatus();
			}
		}
	}

	/**
	 * [MS_MSBEL2610_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch04Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch04Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
			checkForCallStack_ItmLoc(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setUPD_UTIStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_UTIStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch05]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch05Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch05Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch05Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setUPD_UFStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_UFStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch06]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch06Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch06Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch06Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setDEL_DILStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_DILStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch07]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch07Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch07Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch07Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setDEL_DIIStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_DIIStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch08]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch08Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch08Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch08Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setDEL_DTMLStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_DTMStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch09]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch09Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch09Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch09Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setDEL_DTMLStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_DTLStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch10]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch10Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch10Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch10Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setDEL_DTIStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_DTIStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch11]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch11Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch11Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch11Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setDEL_DFStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCH_DFStatus();
		}
	}

	/**
	 * [MS_MSBEL2610_Srch12]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Srch12Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Srch12Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2610_Srch12Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_ctrl_tgt_dt_fr, Cnd_ctrl_tgt_dt_to));
			checkForCallStackCmn(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_PRNT.isSelected()) {
				setPRNTStatus();
			}
			else {
				setREFStatus();
			}
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_ope_PRNT.isSelected()) {
				setSRCH_PRNTStatus();
			}
			else if (Cnd_ope_REF.isSelected()) {
				setSRCH_REFStatus();
			}
		}
	}
	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackCmn(MCMessageList msgList) {
		MCDate cur_end = getAcYm(getToday(), getCo().ac_cl_day(), getCo().ac_cl_mon_base());
		if (cur_end.lt(getAcYm(Cnd_ctrl_tgt_dt.getValue(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()))) {
			msgList.add(new MCMessage(MSBEP0005));
		}
		if (!isNull(Cnd_stktk_ym.getValue())) {
			MCDate tgt_dt = Cnd_stktk_ym.getValue();
			if (cur_end.lt(tgt_dt)) {
				msgList.add(new MCMessage(MSBEP0005));
			}
		}
		msgList.addAll(checkAtLeastOne(Cnd_stktk_sts_wtg, Cnd_stktk_sts_st, Cnd_stktk_sts_rfl));
	}
	/**
	 * 検索条件のチェック（品目、場所）
	 * @param msgList
	 */
	protected void checkForCallStack_ItmLoc(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOneInput(Cnd_loc_cd, Cnd_loc_nm, Cnd_site_cd, Cnd_site_nm, 
				Cnd_wg_cd, Cnd_wg_nm, Cnd_lg_grp_cd, Cnd_lg_grp_nm, 
				Cnd_loc_grp_cd, Cnd_loc_grp_nm, Cnd_alloc_grp_cd, Cnd_alloc_grp_nm));
		msgList.addAll(checkAtLeastOneInput(Cnd_itm_typ, Cnd_itm_typ_d_cd,Cnd_itm_typ_d_nm, Cnd_itm_cd, Cnd_itm_nm,
				Cnd_itm_grp_cd1, Cnd_itm_grp_nm1, Cnd_itm_grp_cd2, Cnd_itm_grp_nm2, Cnd_itm_grp_cd3, Cnd_itm_grp_nm3, Cnd_itm_grp_cd4, Cnd_itm_grp_nm4,
				Cnd_itm_grp_cd5, Cnd_itm_grp_nm5, Cnd_itm_grp_cd6, Cnd_itm_grp_nm6, Cnd_itm_grp_cd7, Cnd_itm_grp_nm7, Cnd_itm_grp_cd8, Cnd_itm_grp_nm8,
				Cnd_itm_grp_cd9, Cnd_itm_grp_nm9, Cnd_itm_grp_cd10, Cnd_itm_grp_nm10));
	}

	/**
	 * [MS_MSBEL2610_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Upd01Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2610_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL2610_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Upd02Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2610_Upd02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			if (Cnd_tgt_TOR_M.isSelected()) {
				bridge.up0().setStringNE(RsltR.$stktk_typ, MSC_STKTK_TYP.MONTHLY.value());
			}
			else {
				bridge.up0().setStringNE(RsltR.$stktk_typ, MSC_STKTK_TYP.CYCLECNT.value());
			}
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getBtnR().prnt_flg());
		}

		@Override
		protected void show() {
			super.show();

			MSC_STKTK_TYP.putNameNE(getRsltL(), RsltR.$stktk_typ, RsltR.$stktk_typ_nm);
		}
	}

	/**
	 * [MS_MSBEL2610_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Upd03Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Upd03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2610_Upd03Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL2610_Upd04]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Upd04Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Upd04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2610_Upd04Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL2610_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Del01Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL2610_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL2610_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Del02Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL2610_Del02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL2610_Del03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Del03Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Del03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL2610_Del03Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL2610_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2610_Prnt01Caller<P extends MSBEP_StktkList, B extends MS_MSBEL2610_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL2610_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setupParam() {
			super.setupParam();
			
			bridge.up1().setBooleanNE(BtnR.$invlist_flg, _invlist);
			bridge.up1().setBooleanNE(BtnR.$difflist_flg, _difflist);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		switch (getSrchPtn()) {
		case 1:
			callMS_MSBEL2610_Srch01();
			break;
		case 2:
			callMS_MSBEL2610_Srch02();
			break;
		case 3:
			callMS_MSBEL2610_Srch03();
			break;
		case 4:
			callMS_MSBEL2610_Srch03();
			break;
		case 5:
			callMS_MSBEL2610_Srch04();
			break;
		case 6:
			callMS_MSBEL2610_Srch05();
			break;
		case 7:
			callMS_MSBEL2610_Srch06();
			break;
		case 8:
			callMS_MSBEL2610_Srch07();
			break;
		case 9:
			callMS_MSBEL2610_Srch08();
			break;
		case 10:
			callMS_MSBEL2610_Srch09();
			break;
		case 11:
			callMS_MSBEL2610_Srch10();
			break;
		case 12:
			callMS_MSBEL2610_Srch11();
			break;
		case 13:
			callMS_MSBEL2610_Srch12();
			break;
		case 14:
			callMS_MSBEL2610_Srch12();
			break;
		}
	}
	
	protected int getSrchPtn() {
		if (Cnd_ope_UPD.isSelected()) {
			if (Cnd_tgt_IO_L.isSelected()) {
				return 1;
			}
			else if (Cnd_tgt_IO_I.isSelected()) {
				return 2;
			}
			else if (Cnd_tgt_TOR_M.isSelected()) {
				return 3;
			}
			else if (Cnd_tgt_TOR_L.isSelected()) {
				return 4;
			}
			else if (Cnd_tgt_TOR_I.isSelected()) {
				return 5;
			}
			else if (Cnd_tgt_FIX.isSelected()) {
				return 6;
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			if (Cnd_tgt_IO_L.isSelected()) {
				return 7;
			}
			else if (Cnd_tgt_IO_I.isSelected()) {
				return 8;
			}
			else if (Cnd_tgt_TOR_M.isSelected()) {
				return 9;
			}
			else if (Cnd_tgt_TOR_L.isSelected()) {
				return 10;
			}
			else if (Cnd_tgt_TOR_I.isSelected()) {
				return 11;
			}
			else if (Cnd_tgt_FIX.isSelected()) {
				return 12;
			}
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			return 13;
		}
		else if (Cnd_ope_REF.isSelected()) {
			return 14;
		}
		return 0;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP2620]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2620(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2620");
		aso.putCnd(crtOpenMSBEP2620CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP2620.CndR crtOpenMSBEP2620CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP2620.CndR to = mcframe.clientMSBE.MSBEP2620.CndR.create();
		to.stktk_base_dt(r.ctrl_tgt_dt());
		to.loc_cd(r.loc_cd());
		to.only_enable_flg(true);
		to.inc_entrd_flg(true);
		to.only_stktk_flg(false);
		if (!isSame(r.itm_cd(), MAC_STR.NULL_VAL.value())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
		}
		return to;	
	}		
	/**
	 * Panel[Btn]のボタン[prnt_invlist]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_invlist(MCEventInfo info) {
		_invlist = true;
		_difflist = false;
		callMS_MSBEL2610_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_difflist]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_difflist(MCEventInfo info) {
		_invlist = false;
		_difflist = true;
		callMS_MSBEL2610_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[upd01]の押下時の処理
	 */
	@Override
	public void doBtn_upd01(MCEventInfo info) {
		callMS_MSBEL2610_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd02]の押下時の処理
	 */
	@Override
	public void doBtn_upd02(MCEventInfo info) {
		callMS_MSBEL2610_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[upd03]の押下時の処理
	 */
	@Override
	public void doBtn_upd03(MCEventInfo info) {
		callMS_MSBEL2610_Upd03();
	}
	/**
	 * Panel[Btn]のボタン[upd04]の押下時の処理
	 */
	@Override
	public void doBtn_upd04(MCEventInfo info) {
		callMS_MSBEL2610_Upd04();
	}
	/**
	 * Panel[Btn]のボタン[del01]の押下時の処理
	 */
	@Override
	public void doBtn_del01(MCEventInfo info) {
		callMS_MSBEL2610_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del02]の押下時の処理
	 */
	@Override
	public void doBtn_del02(MCEventInfo info) {
		callMS_MSBEL2610_Del02();
	}
	/**
	 * Panel[Btn]のボタン[del03]の押下時の処理
	 */
	@Override
	public void doBtn_del03(MCEventInfo info) {
		callMS_MSBEL2610_Del03();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		BulkSet_usr_dpt_p_PPanel.setRelateBeans(BulkSet_ctrl_tgt_dt);
		Rslt_usr_dpt_p_PPanel.setRelateBeans(columnRslt_ctrl_tgt_dt);
	}

	// -----------------------------------------------
	// init-screen
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		setValueEx(Cnd_tgt_Group, Cnd_tgt_IO_L.getActionCommand());
		
		setCnd_stktk_sts(true, true, false);
		
		setValueEx(Cnd_not_invlist_flg, true);
		setValueEx(Cnd_invlist_flg, true);
		setValueEx(Cnd_not_difflist_flg, true);
		setValueEx(Cnd_difflist_flg, true);
		
		setValueEx(Btn_add_io_ctrl_flg, true);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// status
	
	@Override
	public void setSRCH_UILStatus() {
		super.setSRCH_UILStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_UIIStatus() {
		super.setSRCH_UIIStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_UTMStatus() {
		super.setSRCH_UTMStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_UTLStatus() {
		super.setSRCH_UTLStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_UTIStatus() {
		super.setSRCH_UTIStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_UFStatus() {
		super.setSRCH_UFStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_DILStatus() {
		super.setSRCH_DILStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_DIIStatus() {
		super.setSRCH_DIIStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_DTMStatus() {
		super.setSRCH_DTMStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_DTLStatus() {
		super.setSRCH_DTLStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_DTIStatus() {
		super.setSRCH_DTIStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_DFStatus() {
		super.setSRCH_DFStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_PRNTStatus() {
		super.setSRCH_PRNTStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		FoldTab.focusActiveFirstComponent();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setUPD_UILStatus() {
		super.setUPD_UILStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setUPD_UIIStatus() {
		super.setUPD_UIIStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setUPD_UTMStatus() {
		super.setUPD_UTMStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setUPD_UTLStatus() {
		super.setUPD_UTLStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setUPD_UTIStatus() {
		super.setUPD_UTIStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setUPD_UFStatus() {
		super.setUPD_UFStatus();
		setValueEx(BulkSet_ctrl_tgt_dt, getToday());
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setDEL_DILStatus() {
		super.setDEL_DILStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setDEL_DIIStatus() {
		super.setDEL_DIIStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setDEL_DTMLStatus() {
		super.setDEL_DTMLStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setDEL_DTIStatus() {
		super.setDEL_DTIStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setDEL_DFStatus() {
		super.setDEL_DFStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP2620(r)) {
			setDefaultMode(Btn_open_MSBEP2620);
		}
		else {
			Btn_open_MSBEP2620.setMode(MCMode.DISABLE);
		}
	}
	protected boolean isEnableBtn_open_MSBEP2620(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// Event
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		// 一括設定枠の項目の値を設定する
		if (r.check()) {
			bulkSet(BulkSet_act_dpt_cd, r);
			bulkSet(BulkSet_act_usr_cd, r);
		}
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		BulkSet_act_usr_cd.addLCListener(this);
		BulkSet_act_dpt_cd.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == BulkSet_act_usr_cd) {
			bulkSet(BulkSet_act_usr_cd);
		}
		else if (lc == BulkSet_act_dpt_cd) {
			bulkSet(BulkSet_act_dpt_cd);
		}
	}
	@Override
	public void doCnd_ctrl_tgt_dt_LC(MCEventInfo info) {
		super.doCnd_ctrl_tgt_dt_LC(info);
		setValueEx(BulkSet_ctrl_tgt_dt, Cnd_ctrl_tgt_dt.getValue());
	}
	@Override
	public void doCnd_stktk_ym_LC(MCEventInfo info) {
		super.doCnd_stktk_ym_LC(info);
		setValueEx(BulkSet_ctrl_tgt_dt, getYmEndDt(Cnd_stktk_ym.getValue(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
	}

	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}
	
	protected void bulkSet(MCBeans b, RsltR r) {
		if (b == BulkSet_act_usr_cd
				&& !isNull(getBulkSetR().act_usr_cd())
				&& isEditable(columnRslt_act_usr_cd, r.getGUIIndex())) {
			r.act_usr_cd(getBulkSetR().act_usr_cd());
			r.act_usr_nm(getBulkSetR().act_usr_nm());
		}
		else if (b == BulkSet_act_dpt_cd
				&& !isNull(getBulkSetR().act_dpt_cd())
				&& isEditable(columnRslt_act_dpt_cd, r.getGUIIndex())) {
			r.act_dpt_cd(getBulkSetR().act_dpt_cd());
			r.act_dpt_nm(getBulkSetR().act_dpt_nm());
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL());
		// 種別に応じて入力不可となる項目をクリアする
		clearCnd();
		setCnd();
		// 一覧をクリアしているため検索前ステータスに戻す
		setSrchStatus();
		setDefBtnFlgByOpe();
	}

	@Override
	public void doCnd_tgt_NC(MCEventInfo info) {
		super.doCnd_tgt_NC(info);
		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL());
		// 種別に応じて入力不可となる項目をクリアする
		clearCnd();
		setCnd();
		// 一覧をクリアしているため検索前ステータスに戻す
		setSrchStatus();
		setDefBtnFlgByOpe();
	}

	protected void setSrchStatus() {
		switch (getSrchPtn()) {
		case 1:
			setSRCH_UILStatus();
			break;
		case 2:
			setSRCH_UIIStatus();
			break;
		case 3:
			setSRCH_UTMStatus();
			break;
		case 4:
			setSRCH_UTLStatus();
			break;
		case 5:
			setSRCH_UTIStatus();
			break;
		case 6:
			setSRCH_UFStatus();
			break;
		case 7:
			setSRCH_DILStatus();
			break;
		case 8:
			setSRCH_DIIStatus();
			break;
		case 9:
			setSRCH_DTMStatus();
			break;
		case 10:
			setSRCH_DTLStatus();
			break;
		case 11:
			setSRCH_DTIStatus();
			break;
		case 12:
			setSRCH_DFStatus();
			break;
		case 13:
			setSRCH_PRNTStatus();
			break;
		case 14:
			setSRCH_REFStatus();
			break;
		}

	}

	protected void clearCnd() {
		switch (getSrchPtn()) {
		case 1:
		case 4:
			clearCnd_Itm();
		case 2:
		case 5:
			setValueEx(Cnd_stktk_ym, null);
			setValueEx(Cnd_ctrl_tgt_dt_fr, null);
			setValueEx(Cnd_ctrl_tgt_dt_to, null);
			break;
		case 3:
			setValueEx(Cnd_ctrl_tgt_dt, null);
			setValueEx(Cnd_ctrl_tgt_dt_fr, null);
			setValueEx(Cnd_ctrl_tgt_dt_to, null);
			clearCnd_Itm();
			break;
		case 7:
		case 9:
		case 10:
			clearCnd_Itm();
		case 6:
		case 8:
		case 11:
		case 12:
			setValueEx(Cnd_ctrl_tgt_dt, null);
			setValueEx(Cnd_stktk_ym, null);
			setValueEx(Cnd_ctrl_tgt_dt_fr, null);
			setValueEx(Cnd_ctrl_tgt_dt_to, null);
			break;
		case 13:
		case 14:
			setValueEx(Cnd_ctrl_tgt_dt, null);
			setValueEx(Cnd_stktk_ym, null);
			break;
		}
	}

	protected void setCnd() {
		switch (getSrchPtn()) {
		case 1:
		case 2:
			setCnd_stktk_sts(true, true, false);
			break;
		case 3:
		case 4:
		case 5:
			setCnd_stktk_sts(true, false, false);
			break;
		case 6:
			setCnd_stktk_sts(false, true, false);
			break;
		case 7:
		case 8:
			setCnd_stktk_sts(true, true, false);
			break;
		case 9:
		case 10:
		case 11:
			setCnd_stktk_sts(false, true, false);
			break;
		case 12:
			setCnd_stktk_sts(false, false, true);
			break;
		case 13:
			setCnd_stktk_sts(false, true, true);
			break;
		case 14:
			setCnd_stktk_sts(true, true, true);
			break;
		}
	}
	protected void setCnd_stktk_sts(boolean wtg, boolean st, boolean rfl) {
		setValueEx(Cnd_stktk_sts_wtg, wtg);
		setValueEx(Cnd_stktk_sts_st, st);
		setValueEx(Cnd_stktk_sts_rfl, rfl);
	}

	protected void clearCnd_Itm() {
		setValueEx(Cnd_itm_typ, null);
		setValueEx(Cnd_itm_typ_d_cd, null);
		setValueEx(Cnd_itm_typ_d_nm, null);
		setValueEx(Cnd_itm_cd, null);
		setValueEx(Cnd_itm_sub1, null);
		setValueEx(Cnd_itm_sub2, null);
		setValueEx(Cnd_itm_sub3, null);
		setValueEx(Cnd_itm_nm, null);
		setValueEx(Cnd_itm_grp_flg1, false);
		setValueEx(Cnd_itm_grp_flg2, false);
		setValueEx(Cnd_itm_grp_flg3, false);
		setValueEx(Cnd_itm_grp_flg4, false);
		setValueEx(Cnd_itm_grp_flg5, false);
		setValueEx(Cnd_itm_grp_flg6, false);
		setValueEx(Cnd_itm_grp_flg7, false);
		setValueEx(Cnd_itm_grp_flg8, false);
		setValueEx(Cnd_itm_grp_flg9, false);
		setValueEx(Cnd_itm_grp_flg10, false);

	}
	
	protected void setDefBtnFlgByOpe() {
		if (Cnd_ope_UPD.isSelected() && 
				((Cnd_tgt_IO_L.isSelected() || Cnd_tgt_IO_I.isSelected() || Cnd_tgt_TOR_M.isSelected()
				|| Cnd_tgt_TOR_L.isSelected() || Cnd_tgt_TOR_I.isSelected()))) {
			setValueEx(Btn_add_io_ctrl_flg, true);
		}
		else {
			setValueEx(Btn_add_io_ctrl_flg, false);
		}
		setValueEx(Btn_prnt_flg, false);
		if (Cnd_ope_DEL.isSelected() && 
				((Cnd_tgt_TOR_M.isSelected() || Cnd_tgt_TOR_L.isSelected() || Cnd_tgt_TOR_I.isSelected()))) {
			setValueEx(Btn_act_qty_keep_flg, true);
		}
		else {
			setValueEx(Btn_act_qty_keep_flg, false);
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r == null) {
				return;
			}
			if (!Btn_open_MSBEP2620.isEnabled()) {
				return;
			}
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2620");
			aso.putCnd(crtOpenMSBEP2620CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}
	
	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			return super.getPriorMode(index, column, table);
		}
	}

}