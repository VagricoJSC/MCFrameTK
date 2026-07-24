package mcframe.clientMSBI.MSBIP0010;

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
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBIP_CloseReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBIP_CloseReg_MC extends MSBIP_CloseReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBIP_CloseReg_MC() {
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
	public MSBIP_CloseReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	//本ソース内の「1次リリース対象外」のコメントは、1次リリース対象外機能の為の実装。 
	
	/**
	 * [MS_MSBIL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Srch01Caller<P extends MSBIP_CloseReg, B extends MS_MSBIL0010_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBIL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();

			// 締ＦＬＧ 検索時の処理種別を保持する
			keepSrchValue();

			// 本締の値設定
			setInitCl();

			// 売掛先指定の設定
			setAllAcstFlg();

			// 買掛先指定の設定
			setAllAspplFlg();

			// 仮締の値設定
			setInitPreCl();

			// 値設定により変更されたステータスをもとに戻す
			getHdr1R().setStatus(Status.NONE);
		}

		
		
		@Override
		protected void setMode() {
			super.setMode();
			setUpdStatus();
		}

		/**
		 * 検索条件の締処理種別によりステータスを設定する
		 */
		protected void setUpdStatus() {
			// 本締・本締解除の場合
			if (Cnd_ope_0.isSelected() || Cnd_ope_1.isSelected()) {
				setUPDStatus();
			}
			// 仮締の場合
			else if (Cnd_ope_2.isSelected()) {
				setUPD_PREStatus();
				setPreClStatus();
			}
			// 仮締解除の場合
			else if (Cnd_ope_3.isSelected()) {
				setUPD_PREStatus();
				setRelPreClStatus();
			}
		}

		/**
		 * 下り電文の値から売掛先指定を設定する<br>
		 * 全売掛先仮締ＦＬＧから売掛先指定のラジオボタンを設定
		 */
		protected void setAllAcstFlg() {
			if (getHdr1R().all_acst_pre_cl_flg()) {
				setValueEx(Hdr1_ar_ope_Group, Hdr1_ar_ope_0.getActionCommand());
			}
			else {
				setValueEx(Hdr1_ar_ope_Group, Hdr1_ar_ope_1.getActionCommand());
			}
		}

		/**
		 * 下り電文の値から買掛先指定を設定する<br>
		 * 全買掛先仮締ＦＬＧから買掛先指定のラジオボタンを設定
		 */
		protected void setAllAspplFlg() {
			if (getHdr1R().all_asppl_pre_cl_flg()) {
				setValueEx(Hdr1_ap_ope_Group, Hdr1_ap_ope_0.getActionCommand());
			}
			else {
				setValueEx(Hdr1_ap_ope_Group, Hdr1_ap_ope_1.getActionCommand());
			}
		}

		/**
		 * 種別：本締・本締解除の場合の本締の初期値設定
		 */
		protected void setInitCl() {
			// 本締の場合
			if (Cnd_ope_0.isSelected()) {
				setClValue();
			}
			// 本締解除の場合
			else if (Cnd_ope_1.isSelected()) {
				setRelClValue();
			}
		}

		/**
		 * 種別：仮締・仮締解除の場合の仮締の初期値設定
		 */
		protected void setInitPreCl() {
			// 仮締の場合
			if (Cnd_ope_2.isSelected()) {
				setPreClValue();
			}
			// 仮締解除の場合
			else if (Cnd_ope_3.isSelected()) {
				setRelPreClValue();
			}
		}

		/**
		 * 種別：本締で検索後の本締の初期値設定
		 */
		protected void setClValue() {
			// すべて締可能
			if (isAllClosable()) {
				// 処理対象：全部
				setValueEx(Hdr1_cl_ope_Group, Hdr1_cl_ope_0.getActionCommand());
				// 締ＦＬＧ すべてオン
				setAllClFlgOn();
			}
			// 締不可の対象がある場合
			else {
				setValueEx(Hdr1_cl_ope_Group, Hdr1_cl_ope_1.getActionCommand());
			}
		}

		/**
		 * 種別：本締解除で検索後の本締の初期値設定
		 */
		protected void setRelClValue() {
			// 処理対象：任意を選択
			setValueEx(Hdr1_cl_ope_Group, Hdr1_cl_ope_1.getActionCommand());
			// 締処理ＦＬＧをすべてオフ
			setValueEx(Hdr1_sls_cl_flg, false);
			setValueEx(Hdr1_rcv_cl_flg, false);
			setValueEx(Hdr1_purc_cl_flg, false);
			setValueEx(Hdr1_pay_cl_flg, false);
			setValueEx(Hdr1_stk_cl_flg, false);
		}

		/**
		 * 種別：仮締で検索後の仮締の初期値設定
		 */
		protected void setPreClValue() {
			// 売掛先
			// 全売掛先 仮締済の場合
			if (Hdr1_ar_ope_0.isSelected()) {
				// 仮締処理対象：任意が選択される
				setValueEx(Hdr1_pre_cl_ope_Group, Hdr1_pre_cl_ope_1.getActionCommand());
			}
			// 任意売掛先 仮締の場合
			else if (Hdr1_ar_ope_1.isSelected()) {
				setValueEx(Hdr1_ar_pre_cl_flg, true);
			}

			// 買掛先
			// 全買掛先 仮締済の場合
			if (Hdr1_ap_ope_0.isSelected()) {
				// 仮締処理対象：任意が選択される
				setValueEx(Hdr1_pre_cl_ope_Group, Hdr1_pre_cl_ope_1.getActionCommand());
				// 買掛仮締済のため買掛仮締不可
				setValueEx(Hdr1_ap_pre_cl_flg, false);
			}
			// 任意買掛先 仮締の場合
			else if (Hdr1_ap_ope_1.isSelected()) {
				setValueEx(Hdr1_ap_pre_cl_flg, true);
			}

			// 売掛仮締と買掛仮締がオンの場合
			if (getHdr1R().ar_pre_cl_flg() && getHdr1R().ap_pre_cl_flg()) {
				// 仮締処理対象：全部が選択される
				setValueEx(Hdr1_pre_cl_ope_Group, Hdr1_pre_cl_ope_0.getActionCommand());
			}
		}

		/**
		 * 種別：仮締解除で検索後の仮締の初期値設定 
		 */
		protected void setRelPreClValue() {
			// 仮締処理対象：任意を選択
			setValueEx(Hdr1_pre_cl_ope_Group, Hdr1_pre_cl_ope_1.getActionCommand());
			// 仮締ＦＬＧはオフ
			setValueEx(Hdr1_ar_pre_cl_flg, false);
			setValueEx(Hdr1_ap_pre_cl_flg, false);
		}

		/**
		 * 検索時の値を保持<br>
		 * 締、仮締の場合true、締解除、仮締解除の場合false
		 */
		protected void keepSrchValue() {
			if (Cnd_ope_0.isSelected() || Cnd_ope_2.isSelected()) {
				getHdr1R().srch_cl_flg(true);
			}
			else {
				getHdr1R().srch_cl_flg(false);
			}
		}

	}

	/**
	 * [MS_MSBIL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Upd01Caller<P extends MSBIP_CloseReg, B extends MS_MSBIL0010_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MCList<ArDtlR> _ArDtlL;

		protected MCList<ApDtlR> _ApDtlL;

		protected MS_MSBIL0010_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			_ArDtlL = getArDtlL().statusChangedList();
			_ApDtlL = getApDtlL().statusChangedList();
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_ArDtlL);
			bridge.up2().setAll(_ApDtlL);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			if (getHdr1R().ar_pre_cl_flg() && Hdr1_ar_ope_0.isSelected()) {
				getHdr1R().for_sv_all_acst_pre_cl_flg(true);
			}
			else {
				getHdr1R().for_sv_all_acst_pre_cl_flg(false);
			}
			if (getHdr1R().ap_pre_cl_flg() && Hdr1_ap_ope_0.isSelected()) {
				getHdr1R().for_sv_all_asppl_pre_cl_flg(true);
			}
			else {
				getHdr1R().for_sv_all_asppl_pre_cl_flg(false);
			}
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}

		@Override
		protected boolean checkUpListParamEmpty() {
			boolean arNoChkFlg = false;
			boolean apNoChkFlg = false;
			if (!getHdr1R().ar_pre_cl_flg() || (getHdr1R().ar_pre_cl_flg() && Hdr1_ar_ope_0.isSelected())) {
				arNoChkFlg = true;
			}
			else {
				if (getHdr1R().ar_pre_cl_flg() && Hdr1_ar_ope_1.isSelected()) {
					if (!isNull(exceptViewEmpty(ArDtlTable))) {
						arNoChkFlg = true;
					}
				}
			}
			
			if (!getHdr1R().ap_pre_cl_flg() || getHdr1R().ap_pre_cl_flg() && Hdr1_ap_ope_0.isSelected()) {
				apNoChkFlg = true;
			}
			else {
				if (getHdr1R().ap_pre_cl_flg() && Hdr1_ap_ope_1.isSelected()) {
					if (!isNull(exceptViewEmpty(ApDtlTable))) {
						apNoChkFlg = true;
					}
				}
			}
			
			if (!(arNoChkFlg && apNoChkFlg)) {
				showNoUpListDataMsg();
				return false;
			}

			// 明細が0件でも処理を実行
			return true;
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (getHdr1R().ar_pre_cl_flg()) {
				checkDuplicate(msgList, ArDtlTable, ArDtlR.$acst_cd);
			}
			if (getHdr1R().ap_pre_cl_flg()) {
				checkDuplicate(msgList, ApDtlTable, ApDtlR.$asppl_cd);
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
			CndPanel.focusFirstComponent();
		}

	}

	/**
	 * [MS_MSBIL0010_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Upd02Caller<P extends MSBIP_CloseReg, B extends MS_MSBIL0010_Upd02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {
		protected MCList<ApDtlR> _apDForCall;
		protected MCList<ArDtlR> _arDForCall;

		@Override
		protected void initCaller() {
			super.initCaller();

			_apDForCall = getApDtlL().statusChangedList();
			_arDForCall = getArDtlL().statusChangedList();
		}

		protected MS_MSBIL0010_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			if (getHdr1R().ar_pre_cl_flg() && Hdr1_ar_ope_0.isSelected()) {
				getHdr1R().for_sv_all_acst_pre_cl_flg(true);
			}
			else {
				getHdr1R().for_sv_all_acst_pre_cl_flg(false);
			}
			if (getHdr1R().ap_pre_cl_flg() && Hdr1_ap_ope_0.isSelected()) {
				getHdr1R().for_sv_all_asppl_pre_cl_flg(true);
			}
			else {
				getHdr1R().for_sv_all_asppl_pre_cl_flg(false);
			}
		}

		
		@Override
		protected boolean checkUpListParamEmpty() {
			if (getHdr1R().ar_pre_cl_flg() && Hdr1_ar_ope_1.isSelected() && _arDForCall.isEmpty()) {
				panel.dialog(new MCMessage(MSBIP0001));
				return false;
			}

			if (getHdr1R().ap_pre_cl_flg() && Hdr1_ap_ope_1.isSelected() && _apDForCall.isEmpty()) {
				panel.dialog(new MCMessage(MSBIP0002));
				return false;
			}

			// 明細が0件でも処理を実行
			return true;
		}


		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
			CndPanel.focusFirstComponent();
		}

		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_arDForCall);
			bridge.up2().setAll(_apDForCall);
		}
	}

	/**
	 * [MS_MSBIL0010_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Upd03Caller<P extends MSBIP_CloseReg, B extends MS_MSBIL0010_Upd03Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBIL0010_Upd03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
			CndPanel.focusFirstComponent();
		}

	}

	/**
	 * [MS_MSBIL0010_Upd04]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Upd04Caller<P extends MSBIP_CloseReg, B extends MS_MSBIL0010_Upd04Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBIL0010_Upd04Caller(P p, B b) {
			super(p, b);
		}


		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
			CndPanel.focusFirstComponent();
		}

	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBIL0010_Srch01();
	}

	/**
	 * Panel[ArDtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doArDtlBtn_radd(MCEventInfo info) {
		insertRow(ArDtlTable);
	}

	/**
	 * Panel[ArDtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doArDtlBtn_rdel(MCEventInfo info) {
		deleteRow(ArDtlTable);
	}

	/**
	 * Panel[ArDtlBtn]のボタン[rdel_all]の押下時の処理
	 */
	@Override
	public void doArDtlBtn_rdel_all(MCEventInfo info) {
		if (Cnd_ope_2.isSelected()) {
			deleteRows(ArDtlTable, getArDtlL().subList(Status.CREATE, Status.GUICREATE));
		}
		else {
			deleteRows(ArDtlTable, getArDtlL());
		}
	}

	/**
	 * Panel[ApDtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doApDtlBtn_radd(MCEventInfo info) {
		insertRow(ApDtlTable);
	}

	/**
	 * Panel[ApDtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doApDtlBtn_rdel(MCEventInfo info) {
		deleteRow(ApDtlTable);
	}

	/**
	 * Panel[ApDtlBtn]のボタン[rdel_all]の押下時の処理
	 */
	@Override
	public void doApDtlBtn_rdel_all(MCEventInfo info) {
		if (Cnd_ope_2.isSelected()) {
			deleteRows(ApDtlTable, getApDtlL().subList(Status.CREATE, Status.GUICREATE));
		}
		else {
			deleteRows(ApDtlTable, getApDtlL());
		}
	}

	/**
	 * Panel[Btn]のボタン[upd1]の押下時の処理
	 */
	@Override
	public void doBtn_upd1(MCEventInfo info) {
		callMS_MSBIL0010_Upd03();
	}

	/**
	 * Panel[Btn]のボタン[upd2]の押下時の処理
	 */
	@Override
	public void doBtn_upd2(MCEventInfo info) {
		callMS_MSBIL0010_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del1]の押下時の処理
	 */
	@Override
	public void doBtn_del1(MCEventInfo info) {
		callMS_MSBIL0010_Upd04();
	}

	/**
	 * Panel[Btn]のボタン[del2]の押下時の処理
	 */
	@Override
	public void doBtn_del2(MCEventInfo info) {
		callMS_MSBIL0010_Upd02();
	}
	
	@Override
	public void doApDtl_NC(MCEventInfo info) {
		super.doApDtl_NC(info);
		if(info.getEventIndex() < 0){
			return;
		}
		ApDtlR r = getApDtlL().get(info.getEventIndex());
		setApDtlRdelMode(r);

	}

	protected void setApDtlRdelMode(ApDtlR r) {
		if (Cnd_ope_2.isSelected() && (!r.isStatusCreate() && !r.isStatusGUICreate()) || !isApPreClAvl() || !getHdr1R().ap_pre_cl_flg()) {
			ApDtlBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(ApDtlBtn_rdel);
		}
	}

	@Override
	public void doArDtl_NC(MCEventInfo info) {
		super.doArDtl_NC(info);
		if (info.getEventIndex() < 0) {
			return;
		}
		ArDtlR r = getArDtlL().get(info.getEventIndex());
		setArDtlRdelMode(r);
	}

	protected void setArDtlRdelMode(ArDtlR r) {
		if (Cnd_ope_2.isSelected() && (!r.isStatusCreate() && !r.isStatusGUICreate()) || !isArPreClAvl() || !getHdr1R().ar_pre_cl_flg()) {
			ArDtlBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(ArDtlBtn_rdel);
		}
	}


	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		// 本締
		getHdr1R().cl_ope(Hdr1_cl_ope_0.getActionCommand());
		if (getCo().sls_cl_flg()) {
			getHdr1R().sls_cl_flg(true);
		}
		if (getCo().rcv_cl_flg()) {
			getHdr1R().rcv_cl_flg(true);
		}
		if (getCo().purc_cl_flg()) {
			getHdr1R().purc_cl_flg(true);
		}
		if (getCo().pay_cl_flg()) {
			getHdr1R().pay_cl_flg(true);
		}
		getHdr1R().stk_cl_flg(true);

		// 仮締
		getHdr1R().pre_cl_ope(Hdr1_pre_cl_ope_0.getActionCommand());
		getHdr1R().ar_pre_cl_flg(true);
		getHdr1R().ap_pre_cl_flg(true);

		getHdr1R().ar_ope(Hdr1_ar_ope_0.getActionCommand());
		getHdr1R().ap_ope(Hdr1_ap_ope_0.getActionCommand());
	}

	// -----------------------------------------------
	// status
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		boolean enableReg = false;

		// 締・締解除不可が存在する場合、締処理対象：全部は選択不可
		if (!isAllClosable()) {
			Hdr1_cl_ope_0.setMode(MCMode.READ_ONLY);
		}

		// 処理対象に「全部」を選択すると、各締ＦＬＧはオンで選択不可
		// 処理対象を選択してから実行されることを前提とする
		else if (Hdr1_cl_ope_0.isSelected()) {
			// 売上締FLG
			Hdr1_sls_cl_flg.setMode(MCMode.READ_ONLY);
			// 入金締FLG
			Hdr1_rcv_cl_flg.setMode(MCMode.READ_ONLY);
			// 仕入締FLG
			Hdr1_purc_cl_flg.setMode(MCMode.READ_ONLY);
			// 支払締FLG
			Hdr1_pay_cl_flg.setMode(MCMode.READ_ONLY);
			// 在庫締FLG
			Hdr1_stk_cl_flg.setMode(MCMode.READ_ONLY);
		}

		if (!isClSls()) {
			Hdr1_sls_cl_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			enableReg = true;
		}
		if (!isClRcv()) {
			Hdr1_rcv_cl_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			enableReg = true;
		}
		if (!isClPurc()) {
			Hdr1_purc_cl_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			enableReg = true;
		}
		if (!isClStk()) {
			Hdr1_stk_cl_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			enableReg = true;
		}
		if (getCo().ap_no_use_flg() || !isClPay()) {
			Hdr1_pay_cl_flg.setMode(MCMode.READ_ONLY);
		}else{
			enableReg = true;
		}

		// 締処理
		// ボタンの制御
		if (!enableReg) {
			Hdr1_cl_ope_1.setMode(MCMode.READ_ONLY);
			Btn_del1.setMode(MCMode.DISABLE);
			Btn_upd1.setMode(MCMode.DISABLE);
		}
		if (getHdr1R().srch_cl_flg()) {
			Btn_del1.setMode(MCMode.DISABLE);
		}
		else {
			Btn_upd1.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void setUPD_PREStatus() {
		super.setUPD_PREStatus();

		// 処理対象：全部の場合は仮締ＦＬＧは入力不可
		if (Hdr1_pre_cl_ope_0.isSelected()) {
			Hdr1_ar_pre_cl_flg.setMode(MCMode.READ_ONLY);
			Hdr1_ap_pre_cl_flg.setMode(MCMode.READ_ONLY);
		}

		if(getHdr1R().srch_cl_flg() && getHdr1R().all_acst_pre_cl_flg()){
			// 売掛仮締済のため売掛仮締不可
			Hdr1_ar_ope_0.setMode(MCMode.READ_ONLY);
			Hdr1_ar_ope_1.setMode(MCMode.READ_ONLY);
		}
		
		// 売上締あるいは入金締が行われている場合、売掛締は不可
		if (!isArPreClAvl()) {
			setFix(ArPanel);
			getHdr1R().ar_pre_cl_flg(false);
			Hdr1_ar_pre_cl_flg.setMode(MCMode.READ_ONLY);
		}
		//	仕入締あるいは支払締が行われている場合、買掛締は不可
		if (!isApPreClAvl()) {
			setFix(ApPanel);
			getHdr1R().ap_pre_cl_flg(false);
			Hdr1_ap_pre_cl_flg.setMode(MCMode.READ_ONLY);
		}

		// 売掛締と買掛締の両方ができない場合、仮締の更新ボタンは押下不可
		if (!isArPreClAvl() && !isApPreClAvl()) {
			Btn_upd2.setMode(MCMode.DISABLE);
		}
				
		// 売掛仮締をしない場合、売掛先指定不可
		if (!getHdr1R().ar_pre_cl_flg()) {
			setFix(ArPanel);
		}

		// 買掛仮締をしない場合、買掛先指定不可
		if (!getHdr1R().ap_pre_cl_flg()) {
			setFix(ApPanel);
		}

		// 売掛先指定：全売掛先の場合、売掛先明細と対応するボタンは入力不可
		if (Hdr1_ar_ope_0.isSelected()) {
			setFix(ArDtlPanel);
			setFix(ArDtlBtnPanel);
		}

		// 共通
		// 買掛先指定：全買掛先の場合、買掛先明細と対応するボタンは入力不可
		if (Hdr1_ap_ope_0.isSelected()) {
			setFix(ApDtlPanel);
			setFix(ApDtlBtnPanel);
		}

		// 仮締のモード設定
		if (getHdr1R().srch_cl_flg()) {
			setPreClStatus();
		}
		// 仮締解除のモード設定
		else {
			setRelPreClStatus();
		}
	}

	protected boolean isArPreClAvl() {
		return isClSlsYet() && isClRcvYet() && (isArUseSlsClRcvCl() || isArNoUseSlsCl());
	}
	
	protected boolean isApPreClAvl() {
		// 支払締未対応
		//		return !(!isNull(getHdr1R().pay_cl_ym()) && isSame(getHdr1R().pay_cl_ym(), getHdr1R().ym()) || 
		//				!isNull(getHdr1R().purc_cl_ym()) && isSame(getHdr1R().purc_cl_ym(), getHdr1R().ym()));
		return isClPurcYet() && isClPayYet() && (isApUsePurcClPayCl() || isApNoUsePurcCl());
	}
	
	/**
	 * 種別：仮締で検索した場合のモード設定
	 */
	protected void setPreClStatus() {

		if (getHdr1R().all_acst_pre_cl_flg() || !isArPreClAvl()) {
			// 売掛 仮締不可
			Hdr1_ar_pre_cl_flg.setMode(MCMode.READ_ONLY);
			// 仮締 処理対象：全部が選択不可
			Hdr1_pre_cl_ope_0.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr1_pre_cl_ope_Group, Hdr1_pre_cl_ope_1.getActionCommand());
		}

		if (getHdr1R().all_asppl_pre_cl_flg() || !isApPreClAvl()) {
			// 買掛 仮締不可
			Hdr1_ap_pre_cl_flg.setMode(MCMode.READ_ONLY);
			// 仮締 処理対象：全部が選択不可
			Hdr1_pre_cl_ope_0.setMode(MCMode.READ_ONLY);
			setValueEx(Hdr1_pre_cl_ope_Group, Hdr1_pre_cl_ope_1.getActionCommand());
		}
		
		// 仮締 処理対象：任意が選択不可
		if ((getHdr1R().all_acst_pre_cl_flg() || !isArPreClAvl()) && (getHdr1R().all_asppl_pre_cl_flg() || !isApPreClAvl())) {
			Hdr1_pre_cl_ope_1.setMode(MCMode.READ_ONLY);
			Btn_upd2.setMode(MCMode.DISABLE);
		}

		Btn_del1.setMode(MCMode.DISABLE);
		Btn_del2.setMode(MCMode.DISABLE);
		ArDtlR arR = ArDtlTable.getSelectedMCRow();
		if (!isNull(arR) && (!arR.isStatusCreate() && !arR.isStatusGUICreate())) {
			ArDtlBtn_rdel.setMode(MCMode.DISABLE);
		}
		ApDtlR apR = ApDtlTable.getSelectedMCRow();
		if (!isNull(apR) && (!apR.isStatusCreate() && !apR.isStatusGUICreate())) {
			ApDtlBtn_rdel.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 種別：仮締解除で検索した場合のモード設定
	 */
	protected void setRelPreClStatus() {

		// 売掛仮締済でない場合
		if (!getHdr1R().db_ar_pre_cl_flg() || !isArPreClAvl()) {
			// 売掛仮締 解除不可
			Hdr1_ar_pre_cl_flg.setMode(MCMode.READ_ONLY);
			// 仮締 処理対象：全部が選択不可
			Hdr1_pre_cl_ope_0.setMode(MCMode.READ_ONLY);
		}

		// 全売掛先 仮締済の場合
		if (getHdr1R().all_acst_pre_cl_flg()) {
			// 仮締 処理対象：任意が選択不可
			Hdr1_ar_ope_1.setMode(MCMode.READ_ONLY);
		}
				
		// 買掛仮締済でない場合
		if (!getHdr1R().db_ap_pre_cl_flg() || !isApPreClAvl()) {
			// 買掛仮締 解除不可
			Hdr1_ap_pre_cl_flg.setMode(MCMode.READ_ONLY);
			// 仮締 処理対象：全部が選択不可
			Hdr1_pre_cl_ope_0.setMode(MCMode.READ_ONLY);
		}
		
		// 売掛仮締、買掛仮締のどちらも解除不可の場合、処理対象「任意」が選択不可
		if (Hdr1_pre_cl_ope_1.isSelected() && Hdr1_ar_pre_cl_flg.getMode() == MCMode.READ_ONLY && Hdr1_ap_pre_cl_flg.getMode() == MCMode.READ_ONLY) {
			Hdr1_pre_cl_ope_1.setMode(MCMode.READ_ONLY);
		}

		// 全買掛先 仮締済の場合
		if (getHdr1R().all_asppl_pre_cl_flg()) {
			// 仮締 処理対象：任意が選択不可
			Hdr1_ap_ope_1.setMode(MCMode.READ_ONLY);
		}

		// 売掛仮締が行われていない場合、売掛仮締解除は不可
		if (!getHdr1R().db_ar_pre_cl_flg() && !getHdr1R().all_acst_pre_cl_flg()) {
			setFix(ArPanel);
			getHdr1R().ar_pre_cl_flg(false);
			Hdr1_ar_pre_cl_flg.setMode(MCMode.READ_ONLY);
		}
		//買掛仮締が行われていない場合、買掛仮締解除は不可
		if (!getHdr1R().db_ap_pre_cl_flg() && !getHdr1R().all_asppl_pre_cl_flg()) {
			setFix(ApPanel);
			getHdr1R().ap_pre_cl_flg(false);
			Hdr1_ap_pre_cl_flg.setMode(MCMode.READ_ONLY);
		}
		// 売掛仮締も買掛仮締も行われていない場合、仮締解除ボタンは押下不可
		if (!getHdr1R().db_ar_pre_cl_flg() && !getHdr1R().all_acst_pre_cl_flg() && !getHdr1R().db_ap_pre_cl_flg()
				&& !getHdr1R().all_asppl_pre_cl_flg()) {
			Btn_del2.setMode(MCMode.DISABLE);
			Hdr1_pre_cl_ope_1.setMode(MCMode.READ_ONLY);
		}
		
		if (Hdr1_pre_cl_ope_0.getMode() == MCMode.READ_ONLY && Hdr1_pre_cl_ope_1.getMode() == MCMode.READ_ONLY) {
			Btn_del2.setMode(MCMode.DISABLE);
		}
		// ボタンの制御
		ArDtlBtn_radd.setMode(MCMode.DISABLE);
		ApDtlBtn_radd.setMode(MCMode.DISABLE);
		Btn_upd1.setMode(MCMode.DISABLE);
		Btn_upd2.setMode(MCMode.DISABLE);
		
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD) || isSame(getStatus(), UPD_PRE);
	}

	// -----------------------------------------------
	// Event

	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {

		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isUpdStatus() || isStatusNone(getHdr1R(), getArDtlL(), getApDtlL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		// 登録枠のクリア
		clearContainers(getHdr1R(), getArDtlL(), getApDtlL());
		// ステータスをもとに戻す
		setSRCHStatus();
	}

	@Override
	public void doCnd_cl_ym_NC(MCEventInfo info) {
		super.doCnd_cl_ym_NC(info);
		if (!isNull(info.getNewValue())) {
			getCndR().cl_dt(getYmEndDt(getCndR().cl_ym(), getCo().ac_cl_day(), getCo().ac_cl_mon_base()));
		}
	}

	@Override
	public void doHdr1_cl_ope_NC(MCEventInfo info) {
		super.doHdr1_cl_ope_NC(info);
		// 本締初期値の設定
		setAllClFlgOn();
		// ステータスの再設定
		setUPDStatus();
	}

	@Override
	public void doHdr1_pre_cl_ope_NC(MCEventInfo info) {
		super.doHdr1_pre_cl_ope_NC(info);
		// 仮締初期値の設定
		setAllPreClFlgOn();
		// ステータスの再設定
		setUPD_PREStatus();

	}

	@Override
	public void doHdr1_ar_pre_cl_flg_NC(MCEventInfo info) {
		super.doHdr1_ar_pre_cl_flg_NC(info);
		setUPD_PREStatus();
	}

	@Override
	public void doHdr1_ap_pre_cl_flg_NC(MCEventInfo info) {
		super.doHdr1_ap_pre_cl_flg_NC(info);
		setUPD_PREStatus();
	}

	@Override
	public boolean doHdr1_ar_ope_VC(MCEventInfo info) {
		if (!super.doHdr1_ar_ope_VC(info)) {
			return false;
		}
		else {
			if (isSame(info.getNewValue(), Hdr1_ar_ope_0.getActionCommand())) {
				if (exceptViewEmpty(ArDtlTable).size() > 0) {
					return confirmTableClear();
				}
			}
			return true;
		}
	}

	@Override
	public void doHdr1_ar_ope_NC(MCEventInfo info) {
		super.doHdr1_ar_ope_NC(info);
		if (Hdr1_ar_ope_0.isSelected()) {
			// 売掛先一覧をクリアする
			deleteRows(ArDtlTable, getArDtlL());
		}
		else if (Hdr1_ar_ope_1.isSelected()) {
			if (Cnd_ope_2.isSelected()) {
				ArDtlTable.fillSpace();
			}
		}
		setUPD_PREStatus();
	}

	@Override
	public boolean doHdr1_ap_ope_VC(MCEventInfo info) {
		if (!super.doHdr1_ap_ope_VC(info)) {
			return false;
		}
		else {
			if (isSame(info.getNewValue(), Hdr1_ap_ope_0.getActionCommand())) {
				if (exceptViewEmpty(ApDtlTable).size() > 0) {
					return confirmTableClear();
				}
			}
			return true;
		}
	}

	@Override
	public void doHdr1_ap_ope_NC(MCEventInfo info) {
		super.doHdr1_ap_ope_NC(info);
		if (Hdr1_ap_ope_0.isSelected()) {
			// 買掛先一覧をクリアする
			deleteRows(ApDtlTable, getApDtlL());
		}
		else if (Hdr1_ap_ope_1.isSelected()) {
			if (Cnd_ope_2.isSelected()) {
				ApDtlTable.fillSpace();
			}
		}
		setUPD_PREStatus();
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		ArDtlTable.setCellConfig(crtArDtlCellConfig());
		ApDtlTable.setCellConfig(crtApDtlCellConfig());
	}

	protected ArDtlCellConfig crtArDtlCellConfig() {
		return new ArDtlCellConfig();
	}

	protected class ArDtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdStatus()) {
				ArDtlR r = (ArDtlR) table.getBaseTable().getRow(index);
				// 売掛仮締済のデータは変更不可
				if (!isNull(r.pre_cl_tm())) {
					if (column == columnArDtl_acst_cd) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected ApDtlCellConfig crtApDtlCellConfig() {
		return new ApDtlCellConfig();
	}

	protected class ApDtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdStatus()) {
				ApDtlR r = (ApDtlR) table.getBaseTable().getRow(index);
				// 買掛仮締済のデータは変更不可
				if (!isNull(r.pre_cl_tm())) {
					if (column == columnApDtl_asppl_cd) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * 売上、入金、仕入、支払、在庫が全て締可能の場合、trueを返す
	 * @return
	 */
	protected boolean isAllClosable() {

		boolean ans = true;
		if (!isClSls()) {
			ans = false;
		}
		if (!isClRcv()) {
			ans = false;
		}
		if (!isClPurc()) {
			ans = false;
		}
		if (!isClPay()) {
			ans = false;
		}
		if (!isClStk()) {
			ans = false;
		}
		return ans;
	}

	/**
	 * 売上、入金、仕入、支払、在庫の締FLGをすべてオンにする
	 */
	protected void setAllClFlgOn() {
		if (Hdr1_cl_ope_0.isSelected()) {
			setValueEx(Hdr1_sls_cl_flg, true);
			setValueEx(Hdr1_rcv_cl_flg, true);
			setValueEx(Hdr1_purc_cl_flg, true);
			if (!getCo().ap_no_use_flg()) {
				setValueEx(Hdr1_pay_cl_flg, true);
			}
			setValueEx(Hdr1_stk_cl_flg, true);
		}
	}

	/**
	 * 売掛仮締、買掛仮締のFLGをすべてオンにする
	 */
	protected void setAllPreClFlgOn() {
		if (Hdr1_pre_cl_ope_0.isSelected()) {
			setValueEx(Hdr1_ar_pre_cl_flg, true);
			setValueEx(Hdr1_ap_pre_cl_flg, true);
		}
	}

	protected boolean isClSls() {
		if (getHdr1R().srch_cl_flg()) {
			return (isNull(getHdr1R().sls_cl_ym()) || isSame(getHdr1R().sls_cl_ym().addMonth(1), getHdr1R().ym())) && getCo().sls_cl_flg();
		}
		else {
			return isSame(getHdr1R().sls_cl_ym(), getHdr1R().ym()) && getCo().sls_cl_flg();
		}
	}

	protected boolean isClRcv() {
		if (getHdr1R().srch_cl_flg()) {
			return (isNull(getHdr1R().rcv_cl_ym()) || isSame(getHdr1R().rcv_cl_ym().addMonth(1), getHdr1R().ym())) && getCo().rcv_cl_flg();
		}
		else {
			return isSame(getHdr1R().rcv_cl_ym(), getHdr1R().ym()) && getCo().rcv_cl_flg();
		}
	}

	protected boolean isClPurc() {
		if (getHdr1R().srch_cl_flg()) {
			return (isNull(getHdr1R().purc_cl_ym()) || isSame(getHdr1R().purc_cl_ym().addMonth(1), getHdr1R().ym())) && getCo().purc_cl_flg();
		}
		else {
			return isSame(getHdr1R().purc_cl_ym(), getHdr1R().ym()) && getCo().purc_cl_flg();
		}
	}

	protected boolean isClStk() {
		if (getHdr1R().srch_cl_flg()) {
			return (isNull(getHdr1R().stk_cl_ym()) || isSame(getHdr1R().stk_cl_ym().addMonth(1), getHdr1R().ym()));
		}
		else {
			return isSame(getHdr1R().stk_cl_ym(), getHdr1R().ym());
		}
	}

	protected boolean isClPay() {
		if (getHdr1R().srch_cl_flg()) {
			return (isNull(getHdr1R().pay_cl_ym()) || isSame(getHdr1R().pay_cl_ym().addMonth(1), getHdr1R().ym())) && getCo().pay_cl_flg();
		}
		else {
			return isSame(getHdr1R().pay_cl_ym(), getHdr1R().ym()) && getCo().pay_cl_flg();
		}
	}
	protected boolean isClSlsYet() {
		return isNull(getHdr1R().sls_cl_ym()) || getHdr1R().sls_cl_ym().lt(getHdr1R().ym());
	}

	protected boolean isClRcvYet() {
		return isNull(getHdr1R().rcv_cl_ym()) || getHdr1R().rcv_cl_ym().lt(getHdr1R().ym());
	}

	protected boolean isClPurcYet() {
		return isNull(getHdr1R().purc_cl_ym()) || getHdr1R().purc_cl_ym().lt(getHdr1R().ym());
	}

	protected boolean isArUseSlsClRcvCl() {
		return !getCo().ar_no_use_flg() && getCo().sls_cl_flg() && getCo().rcv_cl_flg();
	}

	protected boolean isArNoUseSlsCl() {
		return getCo().ar_no_use_flg() && getCo().sls_cl_flg();
	}
	protected boolean isClPayYet() {
		return isNull(getHdr1R().pay_cl_ym()) || getHdr1R().pay_cl_ym().lt(getHdr1R().ym());
	}

	protected boolean isApUsePurcClPayCl() {
		return !getCo().ap_no_use_flg() && getCo().purc_cl_flg() && getCo().pay_cl_flg();
	}

	protected boolean isApNoUsePurcCl() {
		return getCo().ap_no_use_flg() && getCo().purc_cl_flg();
	}

}