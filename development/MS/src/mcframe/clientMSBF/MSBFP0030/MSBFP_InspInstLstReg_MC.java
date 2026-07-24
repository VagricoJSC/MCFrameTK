package mcframe.clientMSBF.MSBFP0030;

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
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5370.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import mcframe.clientCore.beans.layout.MCAutoLayout;
import mcframe.clientFSBE.FSBEP0330.MCPersonalizeLocation2;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_InspInstLstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_InspInstLstReg_MC extends MSBFP_InspInstLstReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_InspInstLstReg_MC() {
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
	public MSBFP_InspInstLstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Srch01Caller<P extends MSBFP_InspInstLstReg, B extends MS_MSBFL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			 setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			
			msgList.addAll(checkAtLeastOne(InspStsTypPanel));
			
			if (isSelectedRef() || isSelectedPrntLst() || isSelectedPrntRslt()) {
				msgList.addAll(checkAtLeastOne(InspLstPrntFlgPanel));
				msgList.addAll(checkAtLeastOne(InspRsltPrntFlgPanel));
			}
			msgList.addAll(checkBeforeAfter(Cnd_inst_dt_fr, Cnd_inst_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_aprv_dt_fr, Cnd_aprv_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_upd_ts_fr, Cnd_upd_ts_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_lst_prnt_tm_fr, Cnd_insp_lst_prnt_tm_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_rslt_prnt_tm_fr, Cnd_insp_rslt_prnt_tm_to));
			msgList.addAll(checkAtLeastOne(LimsPanel));
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			if (isSelectedUpd()) {
				for (RsltR r : bridge.down0()) {
					if (!canEditPlntAprv(r)) {
						r.plnt_aprv_flg(false);
					}
					else {
						r.plnt_aprv_flg(r.master_plnt_aprv_flg());
					}
				}
			}
			else if (isSelectedRef()) {
				for (RsltR r : bridge.down0()) {
					if(MSC_INSP_STS_TYP.isSCHD(r.insp_sts_typ()) || MSC_INSP_STS_TYP.isYET(r.insp_sts_typ())) {
						r.plnt_aprv_flg(r.master_plnt_aprv_flg());
					}
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			valueInitUpd();
			for (RsltR r : getRsltL()) {
				r.lims_flg(r.for_lims_flg());
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
		
		/**
		 * 一括設定用項目の初期値設定
		 */
		protected void valueInitUpd() {
			// 指図の場合
			if (isSelectedUpd()) {
				InspBulkSet_inst_dt.setValue(getToday());
				getInspBulkSetR().setStatus(Status.NONE);
			}
		}
	}

	/**
	 * [MS_MSBFL0030_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Srch02Caller<P extends MSBFP_InspInstLstReg, B extends MS_MSBFL0030_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0030_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
			setScreenAsync(false);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			//何もしない
		}
		@Override
		protected boolean isDownParamEmpty() {
			// 下り電文の値が空の場合でもそのまま上書きする
			return false;
		}
		@Override
		protected void show() {
			super.show();

			RsltR r = RsltTable.getSelectedMCRow();
			r.insp_mtd_typ(getMasterInfoR().insp_mtd_typ());
			r.insp_mtd_typ_nm(getMasterInfoR().insp_mtd_typ_nm());
			r.insp_std_no(getMasterInfoR().insp_std_no());
			r.insp_bind_typ(getMasterInfoR().insp_bind_typ());
			r.std_req_flg(getMasterInfoR().std_req_flg());
			r.std_cnf_req_flg(getMasterInfoR().std_cnf_req_flg());
			if (canEditPlntAprv(r)) {
				r.plnt_aprv_flg(getMasterInfoR().plnt_aprv_flg());
			}
			else {
				r.plnt_aprv_flg(false);
			}
			r.insp_aprv_flg(getMasterInfoR().insp_aprv_flg());
		}
	}

	/**
	 * [MS_MSBFL0030_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Ins01Caller<P extends MSBFP_InspInstLstReg, B extends MS_MSBFL0030_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0030_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			for (RsltR r : bridge.up0()) {
				r.prnt_flg(getBtnR().prnt_flg());
				r.inst_dt(getInspBulkSetR().inst_dt());
				r.inst_usr_cd(getInspBulkSetR().inst_usr_cd());
				r.inst_usr_nm(getInspBulkSetR().inst_usr_nm());
				r.inst_dpt_cd(getInspBulkSetR().inst_dpt_cd());
				r.inst_dpt_nm(getInspBulkSetR().inst_dpt_nm());
			}
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);

			checkReqSub(msgList);
		}

		/**
		 * 共通項目の必須チェックを行っています。
		 * @param msgList
		 */
		protected void checkReqSub(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getInspBulkSetR()));
		}
	}

	/**
	 * [MS_MSBFL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Upd01Caller<P extends MSBFP_InspInstLstReg, B extends MS_MSBFL0030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0030_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Del01Caller<P extends MSBFP_InspInstLstReg, B extends MS_MSBFL0030_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0030_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			MCList<RsltSchdR> up1L = MCList.create(RsltSchdR.class);
			MCIndexKey idxkey = getRsltSchdL().createIndex(RsltSchdR.$insp_no);
			for (RsltR r : bridge.up0()) {
				up1L.addAll(getRsltSchdL().subList(idxkey, r.insp_no()));
			}
			bridge.up1().setAll(up1L);
		}
	}

	/**
	 * [MS_MSBFL0030_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Del02Caller<P extends MSBFP_InspInstLstReg, B extends MS_MSBFL0030_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0030_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);

			checkReqSub(msgList);
		}

		/**
		 * 共通項目の必須チェックを行っています。
		 * @param msgList
		 */
		protected void checkReqSub(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(getAprvBulkSetR()));
		}
	}

	/**
	 * [MS_MSBFL0030_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Prnt01Caller<P extends MSBFP_InspInstLstReg, B extends MS_MSBFL0030_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBFL0030_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0030_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0030_Prnt02Caller<P extends MSBFP_InspInstLstReg, B extends MS_MSBFL0030_Prnt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBFL0030_Prnt02Caller(P p, B b) {
			super(p, b);
		}
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBFL0030_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBFL0030_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0040(MCEventInfo info) {
		if (isEnableStsMultiSchd()) {
			openMSBFP0040WithCheckedRow();
		}
		else {
			openMSBFP0040WithSelectedRow();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBFP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0050(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0050(r);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0070(r);
	} 
	/**
	 * Panel[Btn]のボタン[open_MSBFP0020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0020(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBFP0020(r);
	}

	protected void doBtn_open_MSBFP0020(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0020");
		aso.putCnd(crtOpenMSBFP0020CndR(aso, r));
		aso.putSearchAction();
		aso.show();

	}

	protected mcframe.clientMSBF.MSBFP0020.CndR crtOpenMSBFP0020CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0020.MSBFP_PrcdLotInspReg p = (mcframe.clientMSBF.MSBFP0020.MSBFP_PrcdLotInspReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0020.CndR to = mcframe.clientMSBF.MSBFP0020.CndR.create();
		to.ins_typ(p.Cnd_ins_typ_DEL.getActionCommand());
		to.insp_schd_no(r.insp_schd_no());
		return to;
	}

	/**
	 * selectedRowを元に検査指図画面を起動する場合の処理
	 */
	protected void openMSBFP0040WithSelectedRow() {
		if (isSelectedRsltRow()) {
			RsltR r = RsltTable.getSelectedMCRow();
			if (MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())
					|| MSC_INSP_STS_TYP.isSTR(r.insp_sts_typ())
					|| MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ())) {
				MCRow bind = MCRow.create();
				setMSBFP0040bindT2(bind, r);
				openPanel("MS", "MSBFP0040", T2, bind);
			}
			else {
				MCRow bind = MCRow.create();
				setMSBFP0040bindT1(bind, r);
				openPanel("MS", "MSBFP0040", T1, bind);
			}
		}
		else {
			dialog(msgNoSelectedRow());
		}
	}

	protected void setMSBFP0040bindT1(MCRow bind, RsltR r) {
		bind.addStringColumn("insp_schd_no", r.insp_schd_no());
	}
	protected void setMSBFP0040bindT2(MCRow bind, RsltR r) {
		bind.addStringColumn("insp_no", r.insp_no());
	}
	
	/**
	 * 選択チェックされている行を元に検査指図画面を起動する場合の処理
	 */
	protected void openMSBFP0040WithCheckedRow() {
		MCList<RsltR> list = getRsltL().subList(RsltR.$check, true);
		check_open_MSBFP0040_T3(list);
		
		if (!list.isEmpty()) {
			int size = list.size();
			if (size > 1) {
				String[] args = new String[size];
				for (int i = 0; i < args.length; i++) {
					args[i] = list.get(i).insp_schd_no();
				}
				openPanel("MS", "MSBFP0040", T3, null, (Object)args);
			}
			else {
				RsltR r = list.get(0);
				if (MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())) {
					MCRow bind = MCRow.create();
					setMSBFP0040bindT2(bind, r);
					openPanel("MS", "MSBFP0040", T2, bind);
				}
				else {
					MCRow bind = MCRow.create();
					setMSBFP0040bindT1(bind, list.get(0));
					openPanel("MS", "MSBFP0040", T1, bind);
				}
			}
		}
	}
	/**
	 * 検査指図登録画面遷移前のチェック処理(種別が指図の場合)
	 * @param list 選択チェックされた行を抽出した一覧のリスト
	 */
	protected void check_open_MSBFP0040_T3(MCList<RsltR> list) {
		//検査指図画面の(サーバロジックの)登録前チェックと
		//同様の内容を実装している。
		if (list.isEmpty()) {
			RsltR r = RsltTable.getSelectedMCRow();
			if (!isNull(r) && MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())) {
				list.add(r);
			}
			else {
				dialog(msgNoSelectedRow());
			}
			return;
		}
		
		if (list.size() == 1) {
			return;
		}
		
		RsltR base = list.get(0);
		for (RsltR r : list) {
			if (!canCollectInspTyp(r)) {
				throw new MCAppException(r, null, MSBFP0002);
			}
			if (!canCollectInspBindTyp(r)) {
				throw new MCAppException(r, null, MSBFP0003);
			}
			if (!isColSame(base, r, hdrCols(MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())))) {
				throw new MCAppException(r, null, MSBFP0004);
			}
		}
	}
	/**
	 * 一覧の行を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedRsltRow() {
		if (RsltTable.getSelectedMCRow() == null) {
			return false;
		}
		return true;
	}
	/**
	 * 複数の検査予定を引き連れて検査指図登録画面に遷移可能なステータスかどうか
	 */
	protected boolean isEnableStsMultiSchd() {
		return isSame(getStatus(), UPD_INST);
	}

	protected void doBtn_open_MSBFP0050(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0050");
		aso.putCnd(crtOpenMSBFP0050CndR(aso, r));
		aso.putSearchAction();
		aso.show();

	}

	protected mcframe.clientMSBF.MSBFP0050.CndR crtOpenMSBFP0050CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg p = (mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0050.CndR to = mcframe.clientMSBF.MSBFP0050.CndR.create();
		if (MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ())) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_INS.getActionCommand());
		}
		to.insp_no(r.insp_no());
		return to;
	}

	protected void doBtn_open_MSBFP0070(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0070");
		aso.putCnd(crtOpenMSBFP0070CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBF.MSBFP0070.CndR crtOpenMSBFP0070CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg p = (mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0070.CndR to = mcframe.clientMSBF.MSBFP0070.CndR.create();
		if (MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())) {
			to.ope(p.Cnd_ope_INS.getActionCommand());
		}
		else if (MSC_INSP_STS_TYP.isSTR(r.insp_sts_typ())) {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		to.insp_no(r.insp_no());
		return to;
	}

	/**
	 * Panel[Btn]のボタン[prnt_insp_lst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_insp_lst(MCEventInfo info) {
		callMS_MSBFL0030_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_insp_rslt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_insp_rslt(MCEventInfo info) {
		callMS_MSBFL0030_Prnt02();
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
	 * Panel[Btn]のボタン[upd_inst]の押下時の処理
	 */
	@Override
	public void doBtn_upd_inst(MCEventInfo info) {
		callMS_MSBFL0030_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_upd_aprv(MCEventInfo info) {
		callMS_MSBFL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_inst]の押下時の処理
	 */
	@Override
	public void doBtn_del_inst(MCEventInfo info) {
		callMS_MSBFL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv(MCEventInfo info) {
		callMS_MSBFL0030_Del02();
	}


	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, Cnd_site_cd, Cnd_ver_flg);
		// 登録項目の担当者・部門部品は、必ず日付を連携する
		InspBulkSet_inst_usr_dpt_p_PPanel.setRelateBeans(InspBulkSet_inst_dt);
		AprvBulkSet_aprv_usr_dpt_p_PPanel.setRelateBeans(AprvBulkSet_aprv_dt);

		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
				columnRslt_sno1_mng_typ, columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ, columnRslt_sno4_mng_typ);
		Rslt_aprv_usr_dpt_p_PPanel.setRelateBeans(columnRslt_aprv_dt);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_not_yield_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	/**
	 * 画面初期値を設定する。
	 */
	protected void valueInitSub() {
		// 検査状況
		Cnd_insp_sts_typ_schd.setValue(false);
		Cnd_insp_sts_typ_yet.setValue(true);
		Cnd_insp_sts_typ_ord.setValue(false);
		Cnd_insp_sts_typ_str.setValue(false);
		Cnd_insp_sts_typ_jdg.setValue(false);
		// 検査指図リスト
		Cnd_insp_lst_not_prnt_flg.setValue(false);
		Cnd_insp_lst_prnt_flg.setValue(false);
		// 検査成績書
		Cnd_insp_rslt_not_prnt_flg.setValue(false);
		Cnd_insp_rslt_prnt_flg.setValue(false);
		// 承認状況区分
		Cnd_insp_aprv_sts_typ.setValue(null);
		// 検査方法「４：抜取規格検査」
		Cnd_insp_mtd_typ.setValue(null);
		// 入力不可の項目
		getCndR().inst_dt_fr(null);
		getCndR().inst_dt_to(null);
		getCndR().aprv_dt_fr(null);
		getCndR().aprv_dt_to(null);
		getCndR().st_dt_fr(null);
		getCndR().st_dt_to(null);
		getCndR().end_dt_fr(null);
		getCndR().end_dt_to(null);
		getCndR().insp_lst_prnt_tm_fr(null);
		getCndR().insp_lst_prnt_tm_to(null);
		getCndR().insp_rslt_prnt_tm_fr(null);
		getCndR().insp_rslt_prnt_tm_to(null);
		Cnd_insp_ptn_cd.setValue(null);
		Cnd_insp_ptn_nm.setValue(null);
		Cnd_insp_aprv_sts_typ.setValue(null);
		Cnd_inst_usr_cd.setValue(null);
		Cnd_inst_usr_nm.setValue(null);
		Cnd_inst_dpt_cd.setValue(null);
		Cnd_inst_dpt_nm.setValue(null);
		getCndR().insp_no(null);
		getCndR().insp_lst_no(null);
		getCndR().intr_rmrks(null);
		getCndR().sub_char1(null);
		getCndR().sub_char2(null);
		getCndR().sub_char3(null);
		Cnd_lims_tgt_flg.setValue(true);
		Cnd_not_lims_tgt_flg.setValue(true);
	}
	
	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
			setComponentInvisibleAllStatus(getInvisibleBeans());
		}
	}

	/**
	 * 非表示承認情報を設定する。
	 * @return
	 */
	protected MCBeans[] getInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Cnd_ope_APRV, Cnd_ope_DEL_APRV, AprvBulkSetPanel}
				, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, AprvBulkSetPanel));
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setSRCH_UPD_INSTStatus() {
		super.setSRCH_UPD_INSTStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setUPD_INSTStatus() {
		super.setUPD_INSTStatus();
		
		InspBulkSetPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_UPD_APRVStatus() {
		super.setSRCH_UPD_APRVStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setUPD_APRVStatus() {
		super.setUPD_APRVStatus();
		
		setAprvDptUsrDftVal();
		setAprvDptUsrMode();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_INSTStatus() {
		super.setSRCH_DEL_INSTStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDEL_INSTStatus() {
		super.setDEL_INSTStatus();
		
		InspBulkSetPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_DEL_APRVStatus() {
		super.setSRCH_DEL_APRVStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setDEL_APRVStatus() {
		super.setDEL_APRVStatus();
		
		AprvBulkSetPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_REFStatus() {
		super.setSRCH_REFStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		setBtnMode();
	}

	@Override
	public void setSRCH_INSPLIST_PRNTStatus() {
		super.setSRCH_INSPLIST_PRNTStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setINSPLIST_PRNTStatus() {
		super.setINSPLIST_PRNTStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setSRCH_INSPRSLT_PRNTStatus() {
		super.setSRCH_INSPRSLT_PRNTStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setINSPRSLT_PRNTStatus() {
		super.setINSPRSLT_PRNTStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	/**
	 * 一括設定の検査承認者、検査承認部門の初期値を設定する。
	 */
	protected void setAprvDptUsrDftVal() {
		AprvBulkSet_aprv_dt.setValue(getToday());
		if (isNull(getAprvBulkSetR().aprv_usr_cd())) {
			AprvBulkSet_aprv_usr_cd.setValue(mcframe.clientCore.sys.MCSys.user.ID());
		}
		AprvBulkSetPanel.focusFirstComponent();
	}

	/**
	 * 一括設定の検査承認者、検査承認部門を制御する。
	 */
	protected void setAprvDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			AprvBulkSet_aprv_dt.setMode(MCMode.READ_ONLY);
			AprvBulkSet_aprv_usr_cd.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * ボタン制御を設定する。
	 */
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		// 先行検査予定
		if (isEnableBtn_open_MSBFP0020(r)) {
			setDefaultMode(Btn_open_MSBFP0020);
		}
		else {
			Btn_open_MSBFP0020.setMode(MCMode.DISABLE);
		}
		// 検査指図登録
		if (isEnableBtn_open_MSBFP0040(r)) {
			setDefaultMode(Btn_open_MSBFP0040);
		}
		else {
			Btn_open_MSBFP0040.setMode(MCMode.DISABLE);
		}
		// 規格検査実績登録
		if (isEnableBtn_open_MSBFP0050(r)) {
			setDefaultMode(Btn_open_MSBFP0050);
		}
		else {
			Btn_open_MSBFP0050.setMode(MCMode.DISABLE);
		}
		// 検査実績登録
		if (isEnableBtn_open_MSBFP0070(r)) {
			setDefaultMode(Btn_open_MSBFP0070);
		}
		else {
			Btn_open_MSBFP0070.setMode(MCMode.DISABLE);
		}
	}

	// ダブルクリック時の画面遷移と処理を共通化したいので、画面遷移可能かどうかの判定はメソッドとして切り出す
	/**
	 * 先行検査予定登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0020(RsltR r) {
		if (r == null) {
			return false;
		}
		if (!MSC_INSP_STS_TYP.isYET(r.insp_sts_typ()) || !MSC_INSP_TYP.isPRCD(r.insp_typ())) {
			return false;
		}

		return !isNull(r.insp_schd_no());
	}

	/**
	 * 検査指図登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		return !isNullAnd(r.insp_schd_no(), r.insp_no());
	}

	/**
	 * 規格検査実績登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0050(RsltR r) {
		if (r == null) {
			return false;
		}
		if (MSC_INSP_STS_TYP.isSCHD(r.insp_sts_typ()) 
				|| MSC_INSP_STS_TYP.isYET(r.insp_sts_typ()) 
				|| !MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
			return false;
		}
		return !isNull(r.insp_no());
	}

	/**
	 * 検査実績登録画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBFP0070(RsltR r) {
		if (r == null) {
			return false;
		}
		if (MSC_INSP_STS_TYP.isSCHD(r.insp_sts_typ()) || MSC_INSP_STS_TYP.isYET(r.insp_sts_typ())) {
			return false;
		}
		return !isNull(r.insp_no());
	}
	/**
	 * 指図
	 * @return
	 */
	protected boolean isInstStatus() {
		return isSame(getStatus(), UPD_INST);
	}

	/**
	 * 承認
	 * @return
	 */
	protected boolean isAprvStatus() {
		return isSame(getStatus(), UPD_APRV);
	}

	/**
	 * 指図取消
	 * @return
	 */
	protected boolean isInstDelStatus() {
		return isSame(getStatus(), DEL_INST);
	}

	/**
	 * 承認取消
	 * @return
	 */
	protected boolean isAprvDelStatus() {
		return isSame(getStatus(), DEL_APRV);
	}

	/**
	 * 検索前ステータスを設定する。
	 */
	protected void setSrchStatus() {
		// 検索前ステータス
		if (isSelectedUpd()) {
			setSRCH_UPD_INSTStatus();
		}
		if (isSelectedAprv()) {
			setSRCH_UPD_APRVStatus();
		}
		else if (isSelectedDel()) {
			setSRCH_DEL_INSTStatus();
		}
		else if (isSelectedDelAprv()) {
			setSRCH_DEL_APRVStatus();
		}
		else if (isSelectedRef()) {
			setSRCH_REFStatus();
		}
		else if (isSelectedPrntLst()) {
			setSRCH_INSPLIST_PRNTStatus();
		}
		else if (isSelectedPrntRslt()) {
			setSRCH_INSPRSLT_PRNTStatus();
		}

		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	/**
	 * 検索後ステータスを設定する。
	 */
	protected void setRefStatus() {
		// 検索後ステータス
		if (isSelectedUpd()) {
			setUPD_INSTStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		if (isSelectedAprv()) {
			setUPD_APRVStatus();
			RsltTable.selectLeftmostColumn(0);
		}
		else if (isSelectedDel()) {
			setDEL_INSTStatus();
		}
		else if (isSelectedDelAprv()) {
			setDEL_APRVStatus();
		}
		else if (isSelectedRef()) {
			setREFStatus();
		}
		else if (isSelectedPrntLst()) {
			setINSPLIST_PRNTStatus();
		}
		else if (isSelectedPrntRslt()) {
			setINSPRSLT_PRNTStatus();
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}

	// -----------------------------------------------
	// event/listener
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		setBtnMode();
	}


	/**
	 * 指定された行とまとめて指図が可能な行を選択する。<br>
	 * それ以外の行の選択を解除する。
	 * 
	 * @param r 選択チェックのイベントを起こした行
	 * @see #hdrCols()
	 */
	protected void selectSameHeader(RsltR r) {
		for (RsltR data : RsltTable.getViewRows()) {
			//イベントを起こした行は評価しない
			if (r.getGUIIndex() != data.getGUIIndex()) {
				if (canCollectInspTyp(r) && canCollectInspBindTyp(r) && isColSame(r, data, hdrCols(MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())))) {
					data.check(r.check());
				}
			}
		}
	}

	/**
	 * まとめ可能な検査種類かどうかを返す。
	 * @param r 行
	 * @return
	 */
	protected boolean canCollectInspTyp(RsltR r) {
		return (MSC_INSP_TYP.isACCPT((r.insp_typ()))
				|| MSC_INSP_TYP.isPRDCT(r.insp_typ()) 
				|| MSC_INSP_TYP.isLOT(r.insp_typ()));
	}

	/**
	 * まとめ可能な検査実施単位かどうかを返す。
	 * @param r 行
	 * @return
	 */
	protected boolean canCollectInspBindTyp(RsltR r) {
		return !(isNull(r.insp_bind_typ()) || MAC_INSP_BIND_TYP.isACT(r.insp_bind_typ()));
	}

	/**
	 * 工場出荷承認対象を変更可能かどうかを返す。
	 * 
	 * @param r 行
	 * @return
	 */
	protected boolean canEditPlntAprv(RsltR r) {
		if (MSC_INSP_TYP.isPRCD(r.insp_typ())) {
			return false;
		}
		if (MSC_INSP_TYP.isLOT(r.insp_typ()) && r.lmt_up_flg()) {
			return false;
		}
		return true;
	}

	/**
	 * 品目品管マスタが工場出荷承認対象となっているかを返す
	 * 
	 * @param r 行
	 * @return
	 */
	protected boolean isMasterPlntAprv(RsltR r) {
		return r.master_plnt_aprv_flg();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getInspBulkSetR(), getAprvBulkSetR(), getRsltL());
		clearCnd();
		setSrchStatus();
	}

	/**
	 * 操作種別により、画面表示項目の初期値を設定する。
	 */
	protected void clearCnd() {
		// 指図の場合
		if (isSelectedUpd()) {
			valueInitSub();
		}
		// 承認の場合
		else if (isSelectedAprv()) {
			// 検査状況
			Cnd_insp_sts_typ_schd.setValue(false);
			Cnd_insp_sts_typ_yet.setValue(false);
			Cnd_insp_sts_typ_ord.setValue(true);
			Cnd_insp_sts_typ_str.setValue(false);
			Cnd_insp_sts_typ_jdg.setValue(false);
			// 検査指図リスト
			Cnd_insp_lst_not_prnt_flg.setValue(true);
			Cnd_insp_lst_prnt_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 承認状況区分
			Cnd_insp_aprv_sts_typ.setValue(MSC_INSP_APRV_STS_TYP.INST_OPN.value());
			// 検査方法「４：抜取規格検査」
			Cnd_insp_mtd_typ.setValue(null);
			// 検査成績書即時発行
			Btn_prnt_flg.setValue(false);
			// 入力不可の項目
			getCndR().schd_st_dt_fr(null);
			getCndR().schd_st_dt_to(null);
			getCndR().schd_end_dt_fr(null);
			getCndR().schd_end_dt_to(null);
			getCndR().aprv_dt_fr(null);
			getCndR().aprv_dt_to(null);
			Cnd_loc_cd.setValue(null);
			Cnd_loc_nm.setValue(null);
			Cnd_str_ln_cd.setValue(null);
			Cnd_str_ln_nm.setValue(null);
			Cnd_sno1.setValue(null);
			Cnd_sno2.setValue(null);
			Cnd_sno3.setValue(null);
			Cnd_sno4.setValue(null);
			Cnd_wrk_no.setValue(null);
			Cnd_wrk_nm.setValue(null);
			getCndR().insp_cnt_rmrks(null);
			Cnd_lims_tgt_flg.setValue(true);
			Cnd_not_lims_tgt_flg.setValue(true);
		}
		// 指図取消の場合
		else if (isSelectedDel()) {
			// 検査状況
			Cnd_insp_sts_typ_schd.setValue(false);
			Cnd_insp_sts_typ_yet.setValue(false);
			Cnd_insp_sts_typ_ord.setValue(true);
			Cnd_insp_sts_typ_str.setValue(false);
			Cnd_insp_sts_typ_jdg.setValue(false);
			// 検査指図リスト
			Cnd_insp_lst_not_prnt_flg.setValue(true);
			Cnd_insp_lst_prnt_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 承認状況区分
			Cnd_insp_aprv_sts_typ.setValue(null);
			// 検査方法「４：抜取規格検査」
			Cnd_insp_mtd_typ.setValue(null);
			// 検査成績書即時発行
			Btn_prnt_flg.setValue(false);
			// 入力不可の項目
			getCndR().schd_st_dt_fr(null);
			getCndR().schd_st_dt_to(null);
			getCndR().schd_end_dt_fr(null);
			getCndR().schd_end_dt_to(null);
			getCndR().aprv_dt_fr(null);
			getCndR().aprv_dt_to(null);
			Cnd_loc_cd.setValue(null);
			Cnd_loc_nm.setValue(null);
			Cnd_str_ln_cd.setValue(null);
			Cnd_str_ln_nm.setValue(null);
			Cnd_sno1.setValue(null);
			Cnd_sno2.setValue(null);
			Cnd_sno3.setValue(null);
			Cnd_sno4.setValue(null);
			Cnd_wrk_no.setValue(null);
			Cnd_wrk_nm.setValue(null);
			getCndR().insp_cnt_rmrks(null);
			Cnd_lims_tgt_flg.setValue(true);
			Cnd_not_lims_tgt_flg.setValue(true);
		}
		// 承認取消の場合
		else if (isSelectedDelAprv()) {
			// 検査状況
			Cnd_insp_sts_typ_schd.setValue(false);
			Cnd_insp_sts_typ_yet.setValue(false);
			Cnd_insp_sts_typ_ord.setValue(true);
			Cnd_insp_sts_typ_str.setValue(false);
			Cnd_insp_sts_typ_jdg.setValue(false);
			// 検査指図リスト
			Cnd_insp_lst_not_prnt_flg.setValue(true);
			Cnd_insp_lst_prnt_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 承認状況区分
			Cnd_insp_aprv_sts_typ.setValue(MSC_INSP_APRV_STS_TYP.INST_ACPT.value());
			// 検査方法「４：抜取規格検査」
			Cnd_insp_mtd_typ.setValue(null);
			// 検査成績書即時発行
			Btn_prnt_flg.setValue(false);
			// 入力不可の項目
			getCndR().schd_st_dt_fr(null);
			getCndR().schd_st_dt_to(null);
			getCndR().schd_end_dt_fr(null);
			getCndR().schd_end_dt_to(null);
			Cnd_loc_cd.setValue(null);
			Cnd_loc_nm.setValue(null);
			Cnd_str_ln_cd.setValue(null);
			Cnd_str_ln_nm.setValue(null);
			Cnd_sno1.setValue(null);
			Cnd_sno2.setValue(null);
			Cnd_sno3.setValue(null);
			Cnd_sno4.setValue(null);
			Cnd_wrk_no.setValue(null);
			Cnd_wrk_nm.setValue(null);
			getCndR().insp_cnt_rmrks(null);
			Cnd_lims_tgt_flg.setValue(true);
			Cnd_not_lims_tgt_flg.setValue(true);
		}
		// 参照の場合
		else if (isSelectedRef()) {
			// 検査状況
			Cnd_insp_sts_typ_schd.setValue(true);
			Cnd_insp_sts_typ_yet.setValue(true);
			Cnd_insp_sts_typ_ord.setValue(true);
			Cnd_insp_sts_typ_str.setValue(true);
			Cnd_insp_sts_typ_jdg.setValue(true);
			// 検査指図リスト
			Cnd_insp_lst_not_prnt_flg.setValue(true);
			Cnd_insp_lst_prnt_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 承認状況区分
			Cnd_insp_aprv_sts_typ.setValue(null);
			// 検査方法「４：抜取規格検査」
			Cnd_insp_mtd_typ.setValue(null);
			// 検査成績書即時発行
			Btn_prnt_flg.setValue(false);
			Cnd_lims_tgt_flg.setValue(true);
			Cnd_not_lims_tgt_flg.setValue(true);
		}
		// 指図リスト発行の場合
		else if (isSelectedPrntLst()) {
			// 検査状況
			Cnd_insp_sts_typ_schd.setValue(false);
			Cnd_insp_sts_typ_yet.setValue(false);
			Cnd_insp_sts_typ_ord.setValue(true);
			Cnd_insp_sts_typ_str.setValue(false);
			Cnd_insp_sts_typ_jdg.setValue(false);
			// 検査指図リスト
			Cnd_insp_lst_not_prnt_flg.setValue(true);
			Cnd_insp_lst_prnt_flg.setValue(false);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(true);
			// 承認状況区分
			Cnd_insp_aprv_sts_typ.setValue(null);
			// 検査方法「４：抜取規格検査」
			Cnd_insp_mtd_typ.setValue(null);
			// 検査成績書即時発行
			Btn_prnt_flg.setValue(false);
			// 入力不可の項目
			getCndR().schd_st_dt_fr(null);
			getCndR().schd_st_dt_to(null);
			getCndR().schd_end_dt_fr(null);
			getCndR().schd_end_dt_to(null);
			Cnd_loc_cd.setValue(null);
			Cnd_loc_nm.setValue(null);
			Cnd_str_ln_cd.setValue(null);
			Cnd_str_ln_nm.setValue(null);
			Cnd_sno1.setValue(null);
			Cnd_sno2.setValue(null);
			Cnd_sno3.setValue(null);
			Cnd_sno4.setValue(null);
			Cnd_wrk_no.setValue(null);
			Cnd_wrk_nm.setValue(null);
			getCndR().insp_cnt_rmrks(null);
			Cnd_lims_tgt_flg.setValue(true);
			Cnd_not_lims_tgt_flg.setValue(true);
		}
		// 検査成績書発行の場合
		else if (isSelectedPrntRslt()) {
			// 検査状況
			Cnd_insp_sts_typ_schd.setValue(false);
			Cnd_insp_sts_typ_yet.setValue(false);
			Cnd_insp_sts_typ_ord.setValue(true);
			Cnd_insp_sts_typ_str.setValue(true);
			Cnd_insp_sts_typ_jdg.setValue(true);
			// 検査指図リスト
			Cnd_insp_lst_not_prnt_flg.setValue(true);
			Cnd_insp_lst_prnt_flg.setValue(true);
			// 検査成績書
			Cnd_insp_rslt_not_prnt_flg.setValue(true);
			Cnd_insp_rslt_prnt_flg.setValue(false);
			// 承認状況区分
			Cnd_insp_aprv_sts_typ.setValue(null);
			// 検査方法「４：抜取規格検査」
			Cnd_insp_mtd_typ.setValue(MAC_INSP_MTD_TYP.SPEC.value());
			// 検査成績書即時発行
			Btn_prnt_flg.setValue(false);
			// 入力不可の項目
			getCndR().schd_st_dt_fr(null);
			getCndR().schd_st_dt_to(null);
			getCndR().schd_end_dt_fr(null);
			getCndR().schd_end_dt_to(null);
			Cnd_loc_cd.setValue(null);
			Cnd_loc_nm.setValue(null);
			Cnd_str_ln_cd.setValue(null);
			Cnd_str_ln_nm.setValue(null);
			Cnd_sno1.setValue(null);
			Cnd_sno2.setValue(null);
			Cnd_sno3.setValue(null);
			Cnd_sno4.setValue(null);
			Cnd_wrk_no.setValue(null);
			Cnd_wrk_nm.setValue(null);
			getCndR().insp_cnt_rmrks(null);
			Cnd_lims_tgt_flg.setValue(true);
			Cnd_not_lims_tgt_flg.setValue(true);
		}
	}

	/**
	 * 操作種別の指図を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedUpd(){
		return Cnd_ope_UPD.isSelected();
	}
	/**
	 * 操作種別の承認を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedAprv(){
		return Cnd_ope_APRV.isSelected();
	}
	/**操作種別が指図取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDel() {
		return Cnd_ope_DEL.isSelected();
	}
	/**操作種別が承認取消を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedDelAprv() {
		return Cnd_ope_DEL_APRV.isSelected();
	}
	/**
	 * 操作種別の参照を選択しているかどうか
	 * @return 
	 */	
	protected boolean isSelectedRef(){
		return Cnd_ope_REF.isSelected();
	}
	/**操作種別が指図リスト発行を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedPrntLst() {
		return Cnd_ope_PRNT_LST.isSelected();
	}
	/**操作種別が成績書発行を選択しているかどうか
	 * @return
	 */
	protected boolean isSelectedPrntRslt() {
		return Cnd_ope_PRNT_RSLT.isSelected();
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		InspBulkSet_inst_usr_cd.addLCListener(this);
		InspBulkSet_inst_dpt_cd.addLCListener(this);
		AprvBulkSet_aprv_usr_cd.addLCListener(this);
		AprvBulkSet_aprv_dpt_cd.addLCListener(this);
		AprvBulkSet_aprv_rsn.addLCListener(this);
	}

	// 一括設定処理 
	// 選択チェックオン時の一括項目設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		super.setDefaultValueWhenChecked(srcRow);
		if (!(srcRow instanceof RsltR)) {
			return;
		}

		RsltR r = (RsltR)srcRow;

		if (isNull(r.aprv_dt())) {
			bulkSet(AprvBulkSet_aprv_dt, r);
		}
		if (isNull(r.aprv_usr_cd())) {
			bulkSet(AprvBulkSet_aprv_usr_cd, r);
		}
		if (isNull(r.aprv_dpt_cd())) {
			bulkSet(AprvBulkSet_aprv_dpt_cd, r);
		}
		if (isNull(r.aprv_rsn())) {
			bulkSet(AprvBulkSet_aprv_rsn, r);
		}
	}

	// 選択チェックオン時の設定
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		// 指図の場合
		if (isSelectedUpd()) {
			selectSameHeader(r);
		}
		// 承認 または 承認取消の場合
		else if (isSelectedAprv() || isSelectedDelAprv()) {
			if (r.check()) {
				bulkSet(AprvBulkSet_aprv_dt, r);
				bulkSet(AprvBulkSet_aprv_usr_cd, r);
				bulkSet(AprvBulkSet_aprv_dpt_cd, r);
				bulkSet(AprvBulkSet_aprv_rsn, r);
			}
		}
	}

	@Override
	public void doRslt_insp_ptn_cd_NC(MCEventInfo info) {
		super.doRslt_insp_ptn_cd_NC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		RsltR r = getRsltL().get(idx);
		getMasterInfo(r);
	}

	/**
	 * 期限を取得する
	 * 
	 * @param r
	 */
	protected void getMasterInfo(RsltR r) {
		if (!isNull(r.insp_ptn_cd())) {
			getMasterInfoR().itm_cd(r.itm_cd());
			getMasterInfoR().itm_sub1(r.itm_sub1());
			getMasterInfoR().itm_sub2(r.itm_sub2());
			getMasterInfoR().itm_sub3(r.itm_sub3());
			getMasterInfoR().master_dt(r.master_dt());
			getMasterInfoR().insp_typ(r.insp_typ());
			getMasterInfoR().loc_cd(r.loc_cd());
			getMasterInfoR().mfg_loc_cd(r.mfg_loc_cd());
			getMasterInfoR().sppl_cd(r.sppl_cd());
			getMasterInfoR().maker_cd(r.maker_cd());
			getMasterInfoR().insp_ptn_cd(r.insp_ptn_cd());
			callMS_MSBFL0030_Srch02();
		}
		else {
			r.insp_mtd_typ(null);
			r.insp_mtd_typ_nm(null);
			r.insp_std_no(null);
			r.insp_bind_typ(null);
			r.std_req_flg(false);
			r.std_cnf_req_flg(false);
			r.plnt_aprv_flg(false);
			r.insp_aprv_flg(false);
		}
	}

	@Override
	public void doAprvBulkSet_aprv_dt_NC(MCEventInfo info) {
		super.doAprvBulkSet_aprv_dt_NC(info);

		bulkSet(AprvBulkSet_aprv_dt);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == AprvBulkSet_aprv_usr_cd) {
			bulkSet(AprvBulkSet_aprv_usr_cd);
		}
		else if (lc == AprvBulkSet_aprv_dpt_cd) {
			bulkSet(AprvBulkSet_aprv_dpt_cd);
		}
		else if (lc == AprvBulkSet_aprv_rsn) {
			bulkSet(AprvBulkSet_aprv_rsn);
		}
	}

	/**
	 * 一括項目設定
	 * @param b
	 */
	protected void bulkSet(MCBeans b) {

		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				bulkSet(b, r);
			}
		}
	}

	/**
	 * 指定した行の項目設定
	 * @param b
	 * @param r
	 */
	protected void bulkSet(MCBeans b, RsltR r) {
		if (isAprvStatus()) {
			if (b == AprvBulkSet_aprv_dt) {
				r.aprv_dt(getAprvBulkSetR().aprv_dt());
			}
			else if (b == AprvBulkSet_aprv_usr_cd) {
				r.aprv_usr_cd(getAprvBulkSetR().aprv_usr_cd());
				r.aprv_usr_nm(getAprvBulkSetR().aprv_usr_nm());
			}
			else if (b == AprvBulkSet_aprv_dpt_cd) {
				r.aprv_dpt_cd(getAprvBulkSetR().aprv_dpt_cd());
				r.aprv_dpt_nm(getAprvBulkSetR().aprv_dpt_nm());
			}
			else if (b == AprvBulkSet_aprv_rsn) {
				r.aprv_rsn(getAprvBulkSetR().aprv_rsn());
			}
		}
		else if (isAprvDelStatus()) {
			if (b == AprvBulkSet_aprv_rsn) {
				r.aprv_rsn(getAprvBulkSetR().aprv_rsn());
			}
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			if (isSelectedRsltRow()) {
				RsltR r = RsltTable.getSelectedMCRow();
				if (MSC_INSP_STS_TYP.isSTR(r.insp_sts_typ()) || MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ())) {
					MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0070");
					aso.putCnd(crtOpenMSBFP0070CndR(aso, r));
					aso.putSearchAction();
					aso.show();
				}
				else if (MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())) {
					MCRow bind = MCRow.create();
					setMSBFP0040bindT2(bind, r);
					openPanel("MS", "MSBFP0040", T2, bind);
				}
				else {
					MCRow bind = MCRow.create();
					setMSBFP0040bindT1(bind, r);
					openPanel("MS", "MSBFP0040", T1, bind);
				}
			}
			else {
				dialog(msgNoSelectedRow());
			}
		}
	}

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

			if (isInstStatus()) {

				// 検査パタンＣＤ
				if (column == columnRslt_insp_ptn_cd) {
					if (isEditableMode(column)) {
						if (r.is_invalid_insp_ptn_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				// 検査方法区分
				if (column == columnRslt_insp_mtd_typ) {
					if (isEditableMode(column)) {
						if (!r.is_invalid_insp_ptn_flg() || MSC_INSP_TYP.isPRCD(r.insp_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				// 工場出荷承認対象
				if (column == columnRslt_plnt_aprv_flg) {
					if (!canEditPlntAprv(r) || isMasterPlntAprv(r)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			else if (isInstDelStatus()) {
				if (!isNull(r.insp_aprv_sts_typ()) && !MSC_INSP_APRV_STS_TYP.isINST_OPN(r.insp_aprv_sts_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_lims_flg) {
				if (!canUseLimsFlg(r)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * まとめ可能な項目名リストを返す。
	 * 
	 * @param isDelSublotFlg サブロットＮＯが含まないＦＬＧ
	 * @return
	 */
	protected String[] hdrCols(boolean isDelSublotFlg) {
		// ・サブロット単位区分が「４：在庫のみサブロット管理する」の場合、サブロットＮＯをまとめキーから除外してください。
		// ・まとめ単位に以下を追加してください。（品目品管マスタのキー項目です。）
		//  製造場所ＣＤ、発注先ＣＤ、メーカＣＤ、工場・物流倉庫ＣＤ、出荷元工場・物流倉庫ＣＤ
		if (isDelSublotFlg) {
			return new String[]{
					RsltR.$insp_freq,
					RsltR.$src_no1,
					RsltR.$src_no2,
					RsltR.$insp_typ,
					RsltR.$insp_mtd_typ,
					RsltR.$itm_cd,
					RsltR.$itm_sub1,
					RsltR.$itm_sub2,
					RsltR.$itm_sub3,
					RsltR.$lot_no,
					RsltR.$own_insp_no,
					RsltR.$insp_bind_typ,
					RsltR.$lmt_up_flg,
					RsltR.$mfg_loc_cd,
					RsltR.$sppl_cd,
					RsltR.$maker_cd,
					RsltR.$from_site_cd,
					RsltR.$to_site_cd
			};
		}
		return new String[]{
				RsltR.$insp_freq,
				RsltR.$src_no1,
				RsltR.$src_no2,
				RsltR.$insp_typ,
				RsltR.$insp_mtd_typ,
				RsltR.$itm_cd,
				RsltR.$itm_sub1,
				RsltR.$itm_sub2,
				RsltR.$itm_sub3,
				RsltR.$lot_no,
				RsltR.$sublot_no,
				RsltR.$own_insp_no,
				RsltR.$insp_bind_typ,
				RsltR.$lmt_up_flg,
				RsltR.$mfg_loc_cd,
				RsltR.$sppl_cd,
				RsltR.$maker_cd,
				RsltR.$from_site_cd,
				RsltR.$to_site_cd
		};
	}

	@Override
	public MCList getRslt_insp_mtd_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispInspMtdTyp(info));
		return super.getRslt_insp_mtd_typ(row, info);
	}

	public MAC_INSP_MTD_TYP[] getDispInspMtdTyp(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (MSC_INSP_TYP.isLOT(r.insp_typ()) && r.lmt_up_flg()) {
			return new MAC_INSP_MTD_TYP[] {
					MAC_INSP_MTD_TYP.SMPL, MAC_INSP_MTD_TYP.SPEC
			};
		}
		return new MAC_INSP_MTD_TYP[] {
				MAC_INSP_MTD_TYP.SMPL, MAC_INSP_MTD_TYP.SPEC,
				MAC_INSP_MTD_TYP.TTL
		};
	}
	protected boolean canUseLimsFlg(RsltR r) {
		if (isSelectedAprv() || isSelectedDelAprv()) {
			return r.for_lims_flg();
		}
		if (isSelectedUpd() || isSelectedDel()) {
				return r.for_lims_flg()&& !r.insp_aprv_flg();
		}
		return true;
	}

}