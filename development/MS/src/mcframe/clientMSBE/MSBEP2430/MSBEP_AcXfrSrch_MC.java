package mcframe.clientMSBE.MSBEP2430;

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
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5040.*;

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
import java.util.Set;
import java.util.HashSet;

import mcframe.clientFSBE.FSBEP0330.MCPersonalizeLocation2;
import mcframe.clientCore.beans.layout.MCAutoLayout;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_AcXfrSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_AcXfrSrch_MC extends MSBEP_AcXfrSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// リリース対象外機能（予定、廃棄申請書）
	// 操作種別からは削除にするが、実装は残しておくためダミーフィールドを定義（受払予定一覧照会から参照しているのでpublicで定義）
	public MCRadioButton Cnd_ope_REF1 = beansFactory.createRadioButton("Cnd.ope_REF1");
	public MCRadioButton Cnd_ope_PRNT_DSPSL = beansFactory.createRadioButton("Cnd.ope_PRNT_DSPSL");
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AcXfrSrch_MC() {
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
	public MSBEP_AcXfrSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2430_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2430_Srch01Caller<P extends MSBEP_AcXfrSrch, B extends MS_MSBEL2430_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2430_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			// 業務データダウンロード（必須）
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			// 検索処理のチェック
			checkChkBoxStatus(msgList);
			checkForCallStackForSrch(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();

			initBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
			if (Cnd_ope_PRNT_DSPSL.isSelected()) {
				setCheckBtnMode(true);
			}
			RsltTable.selectLeftmostColumn(0);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			initBtnMode();
			Ctrl_ctrl_PPanel.expand(true);
		}

		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_rqst_dt_fr, Cnd_rqst_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_acxfr_schd_dt_fr, Cnd_acxfr_schd_dt_to));
		}
	}

	/**
	 * [MS_MSBEL2430_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2430_Srch02Caller<P extends MSBEP_AcXfrSrch, B extends MS_MSBEL2430_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2430_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			// 業務データダウンロード（必須）
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			// 検索処理のチェック
			checkChkBoxStatus(msgList);
			checkForCallStackForSrch(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();

			initBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
			RsltTable.selectLeftmostColumn(0);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			initBtnMode();
			Ctrl_ctrl_PPanel.expand(true);
		}

		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_acxfr_inst_dt_fr, Cnd_acxfr_inst_dt_to));
		}
	}

	/**
	 * [MS_MSBEL2430_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2430_Srch03Caller<P extends MSBEP_AcXfrSrch, B extends MS_MSBEL2430_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2430_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			// 業務データダウンロード（必須）
			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			// 検索処理のチェック
			checkChkBoxStatus(msgList);
			checkForCallStackForSrch(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();

			initBtnMode();
			Ctrl_ctrl_PPanel.expand(false);
			if (Cnd_ope_PRNT_ACXFR.isSelected()) {
				setCheckBtnMode(true);
			}
			RsltTable.selectLeftmostColumn(0);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			initBtnMode();
			Ctrl_ctrl_PPanel.expand(true);
		}

		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
			msgList.addAll(checkAtLeastOne(WmsTrgtPanel));
		}
	}

	protected void checkChkBoxStatus(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(StsPanel));
	}

	/**
	 * [MS_MSBEL2430_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2430_Prnt02Caller<P extends MSBEP_AcXfrSrch, B extends MS_MSBEL2430_Prnt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL2430_Prnt02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			bridge.up0().setAll(getSnglCheckedDtlL());
		}

		/**
		 * 一覧から、チェックオン、かつ、他勘定振替実績ＮＯが重複なしの
		 * データを洗い出して、サーバーへ渡す。
		 * @return サーバーへ渡すデータ
		 */
		protected MCList<RsltR> getSnglCheckedDtlL() {
			MCList<RsltR> dtlL = MCList.create(RsltR.class);

			Set<String> actNoSet = new HashSet<String>();
			for (RsltR r : getRsltL()) {
				if (!r.check() || isNull(r.acxfr_act_no()) || actNoSet.contains(r.acxfr_act_no())) {
					continue;
				}

				actNoSet.add(r.acxfr_act_no());
				dtlL.add(r);
			}

			return dtlL;
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_REF1.isSelected() || Cnd_ope_PRNT_DSPSL.isSelected()) {
			// 「予定」の検索
			callMS_MSBEL2430_Srch01();
		} else if (Cnd_ope_REF2.isSelected()) {
			// 「指図」の検索
			callMS_MSBEL2430_Srch02();
		} else if (Cnd_ope_REF3.isSelected() || Cnd_ope_PRNT_ACXFR.isSelected()) {
			// 「実績」の検索
			callMS_MSBEL2430_Srch03();
		}
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_REF1.isSelected() || Cnd_ope_PRNT_DSPSL.isSelected()) {
			// 「予定」のダウンロード
			createMS_MSBEL2430_Srch01().execDL();
		} else if (Cnd_ope_REF2.isSelected()) {
			// 「指図」のダウンロード
			createMS_MSBEL2430_Srch02().execDL();
		} else if (Cnd_ope_REF3.isSelected() || Cnd_ope_PRNT_ACXFR.isSelected()) {
			// 「実績」のダウンロード
			createMS_MSBEL2430_Srch03().execDL();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP2410]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2410(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP2410(r);
	}

	protected void doBtn_open_MSBEP2410(RsltR r) {
		if (!isNull(r.acxfr_inst_no())) {
			// 遷移先画面の取得
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2410");
			mcframe.clientMSBE.MSBEP2410.MSBEP_AcXfrInstReg MSBEP2410 = (mcframe.clientMSBE.MSBEP2410.MSBEP_AcXfrInstReg) aso.getPanel();
			mcframe.clientMSBE.MSBEP2410.CndR bind = mcframe.clientMSBE.MSBEP2410.CndR.create();

			// 検索条件の設定
			bind.ope(MSBEP2410.Cnd_ope_REF.getActionCommand());
			bind.acxfr_inst_no(r.acxfr_inst_no());
			aso.putCnd(bind);
			aso.putSearchAction();

			// 遷移先画面の表示
			aso.show();
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP2420]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2420(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP2420(r);
	}

	protected void doBtn_open_MSBEP2420(RsltR r) {
		// 遷移先画面の取得
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2420");
		mcframe.clientMSBE.MSBEP2420.MSBEP_AcXfrActReg MSBEP2420 = (mcframe.clientMSBE.MSBEP2420.MSBEP_AcXfrActReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP2420.CndR bind = mcframe.clientMSBE.MSBEP2420.CndR.create();

		if (!isNull(r.acxfr_act_no())) {
			// 検索条件の設定
			bind.ope(MSBEP2420.Cnd_ope_REF.getActionCommand());
			bind.srch_tgt_typ(MSC_STK_SRCH_TGT_TYP.ACXFR_ACT_NO.value());
			bind.srch_tgt_no(r.acxfr_act_no());
			aso.putCnd(bind);
			aso.putSearchAction();

			// 遷移先画面の表示
			aso.show();
		}
		else if (!isNull(r.acxfr_inst_no())) {
			// 検索条件の設定
			aso.runValueInit();
			bind.ope(MSBEP2420.Cnd_ope_INS.getActionCommand());
//			bind.srch_tgt_typ(MSC_STK_SRCH_TGT_TYP.ACXFR_INST_NO.value());
			bind.srch_tgt_no(r.acxfr_inst_no());
			aso.putCnd(bind);
			aso.putSearchAction();

			// 遷移先画面の表示
			aso.show();
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt_acxfr]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_acxfr(MCEventInfo info) {
		callMS_MSBEL2430_Prnt02();
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


	@Override
	protected void setupParts() {
		super.setupParts();
		// 版ＮＯ
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		//	予定数
		Rslt_trd_schd_unit_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		//	指図数
		Rslt_trd_inst_unit_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		//	実績数
		Rslt_trd_act_unit_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		
		// 基準単位数量
		Rslt_base_unit_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		// 荷姿単位数量
		Rslt_pack_unit_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		
		//在庫金額
		Rslt_stk_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_dec_place);
		
		// 品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
		mcInitStatus();
	}

	protected void valueInitSub() {
		// 操作種別の初期値、「指図」にする。
		setValueEx(Cnd_ope_Group, Cnd_ope_REF2.getActionCommand());

		// 操作種別が「指図」の場合、進捗状況区分の設定
		setInstPrSts();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);

		// ステータス再設定後、ヘッダレイアウトを調整する
//		relayout();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);


		// 前回検索状態のクリアやボタンモードの回復
		clearSrchConds();
		clearContainers(getRsltL());
		initBtnMode();
		setPanelStatus();
		setTrdValue();
		setCndWmsTrgt();
		setCndExtAcXfrActNo();
		Ctrl_ctrl_PPanel.expand(true);
		FoldTab.focusActiveFirstComponent();
	}
	/**
	 * 操作種別によるWMS対象の初期値を設定する
	 */
	protected void setCndWmsTrgt() {
		if (Cnd_ope_REF1.isSelected() || Cnd_ope_PRNT_DSPSL.isSelected()) {
			setValueEx(Cnd_wms_flg, false);
			setValueEx(Cnd_not_wms_flg, false);
		} else if (Cnd_ope_REF2.isSelected()) {
			setValueEx(Cnd_wms_flg, false);
			setValueEx(Cnd_not_wms_flg, false);
		} else if (Cnd_ope_REF3.isSelected() || Cnd_ope_PRNT_ACXFR.isSelected()) {
			setValueEx(Cnd_wms_flg, true);
			setValueEx(Cnd_not_wms_flg, true);
		}
	}
	
	/**
	 * 操作種別によるWMS対象の初期値を設定する
	 */
	protected void setCndExtAcXfrActNo() {
		if (Cnd_ope_REF1.isSelected() 
				|| Cnd_ope_REF2.isSelected() 
				|| Cnd_ope_PRNT_DSPSL.isSelected()) {
			
			setValueEx(Cnd_ext_acxfr_act_no, null);
		}
	}

	protected void clearSrchConds() {
		if (Cnd_ope_REF1.isSelected() || Cnd_ope_PRNT_DSPSL.isSelected()) {
			// 「予定」に関係ない項目のクリア
			setSchdPrSts();
			setSchdKeyNo();
			setSchdDate();
			setSchdRmrks();
		} else if (Cnd_ope_REF2.isSelected()) {
			// 「指図」に関係ない項目のクリア
			setInstPrSts();
			setInstKeyNo();
			setInstDate();
			setInstRmrks();
			setInstUsrAndDpt();
		} else if (Cnd_ope_REF3.isSelected()) {
			// 「実績」に関係ない項目のクリア
			setActPrSts();
			setActKeyNo();
			setActDate();
			setActRmrks();
			setActUsrAndDpt();
		} else if (Cnd_ope_PRNT_ACXFR.isSelected()) {
			setPrntPrSts();
			setActKeyNo();
			setActDate();
			setActRmrks();
			setActUsrAndDpt();
		}
	}

	protected void setPanelStatus() {
		if (Cnd_ope_REF1.isSelected()) {
			setStatus(SRCH_SCHD);
		} else if (Cnd_ope_REF2.isSelected()) {
			setStatus(SRCH_INST);
		} else if (Cnd_ope_REF3.isSelected()) {
			setStatus(SRCH_ACT);
		} else if (Cnd_ope_PRNT_DSPSL.isSelected()) {
			setStatus(PRNT_DSPSL);
		} else if (Cnd_ope_PRNT_ACXFR.isSelected()) {
			setStatus(PRNT_ACXFR);
		}
	}

	/**
	 * 操作種別が「予定」の場合、進捗状況区分と未承認状況の設定
	 */
	protected void setSchdPrSts() {
		// 進捗状況区分, 未指図のみ＝＞オン
		setValueEx(Cnd_not_inst_flg, true);
		setValueEx(Cnd_inst_flg, false);
		setValueEx(Cnd_part_comp_flg, false);
		setValueEx(Cnd_comp_flg, false);

		// 予定未承認含む＝＞オフ
		setValueEx(Cnd_schd_no_aprv_flg, false);
	}

	/**
	 * 操作種別が「指図」の場合、進捗状況区分と未承認状況の設定
	 */
	protected void setInstPrSts() {
		// 進捗状況区分, 指図済、一部完了＝＞オン
		setValueEx(Cnd_not_inst_flg, false);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_part_comp_flg, true);
		setValueEx(Cnd_comp_flg, false);

		// 予定未承認含む＝＞オフ
		setValueEx(Cnd_schd_no_aprv_flg, false);
		
		// 打切含む＝＞オフ
		setValueEx(Cnd_abort_flg, false);
	}

	/**
	 * 操作種別が「実績」の場合、進捗状況区分と未承認状況の設定
	 */
	protected void setActPrSts() {
		// 進捗状況区分, 完了と一部完了のみ＝＞オン
		setValueEx(Cnd_not_inst_flg, false);
		setValueEx(Cnd_inst_flg, false);
		setValueEx(Cnd_part_comp_flg, true);
		setValueEx(Cnd_comp_flg, true);

		// 予定未承認含む＝＞オフ
		setValueEx(Cnd_schd_no_aprv_flg, false);
		
		// 打切含む＝＞オン
		setValueEx(Cnd_abort_flg, true);
	}
	/**
	 * 操作種別が「帳票伝票発行」の場合、進捗状況区分と未承認状況の設定
	 */
	protected void setPrntPrSts() {
		setActPrSts();
		setValueEx(Cnd_abort_flg, false);
	}

	protected void setSchdKeyNo() {
		setValueEx(Cnd_acxfr_inst_no, null);
		setValueEx(Cnd_acxfr_inst_d_no, null);
		setValueEx(Cnd_acxfr_act_no, null);
		setValueEx(Cnd_acxfr_act_d_no, null);
	}

	protected void setInstKeyNo() {
		setValueEx(Cnd_acxfr_schd_no, null);
		setValueEx(Cnd_acxfr_act_no, null);
		setValueEx(Cnd_acxfr_act_d_no, null);
		setValueEx(Cnd_dspsl_no, null);
	}

	protected void setActKeyNo() {
		setValueEx(Cnd_acxfr_schd_no, null);
		setValueEx(Cnd_dspsl_no, null);
	}

	protected void setInstUsrAndDpt() {
		setValueEx(Cnd_act_usr_cd, null);
		setValueEx(Cnd_act_usr_nm, null);
		setValueEx(Cnd_act_dpt_cd, null);
		setValueEx(Cnd_act_dpt_nm, null);
	}

	protected void setActUsrAndDpt() {
		setValueEx(Cnd_inst_usr_cd, null);
		setValueEx(Cnd_inst_usr_nm, null);
		setValueEx(Cnd_inst_dpt_cd, null);
		setValueEx(Cnd_inst_dpt_nm, null);
	}

	protected void setSchdDate() {
		setValueEx(Cnd_acxfr_inst_dt_fr, null);
		setValueEx(Cnd_acxfr_inst_dt_to, null);
		setValueEx(Cnd_acxfr_act_dt_fr, null);
		setValueEx(Cnd_acxfr_act_hm_fr, null);
		setValueEx(Cnd_acxfr_act_dt_to, null);
		setValueEx(Cnd_acxfr_act_hm_to, null);
		setValueEx(Cnd_ac_dt_fr, null);
		setValueEx(Cnd_ac_dt_to, null);
	}

	protected void setInstDate() {
		setValueEx(Cnd_rqst_dt_fr, null);
		setValueEx(Cnd_rqst_dt_to, null);
		setValueEx(Cnd_acxfr_schd_dt_fr, null);
		setValueEx(Cnd_acxfr_schd_dt_to, null);
		setValueEx(Cnd_acxfr_act_dt_fr, null);
		setValueEx(Cnd_acxfr_act_hm_fr, null);
		setValueEx(Cnd_acxfr_act_dt_to, null);
		setValueEx(Cnd_acxfr_act_hm_to, null);
		setValueEx(Cnd_ac_dt_fr, null);
		setValueEx(Cnd_ac_dt_to, null);
	}

	protected void setActDate() {
		setValueEx(Cnd_rqst_dt_fr, null);
		setValueEx(Cnd_rqst_dt_to, null);
		setValueEx(Cnd_acxfr_schd_dt_fr, null);
		setValueEx(Cnd_acxfr_schd_dt_to, null);
		setValueEx(Cnd_acxfr_inst_dt_fr, null);
		setValueEx(Cnd_acxfr_inst_dt_to, null);
	}

	protected void setSchdRmrks() {
		setValueEx(Cnd_inst_intr_rmrks, null);
		setValueEx(Cnd_inst_trd_rmrks, null);
		setValueEx(Cnd_inst_rmrks, null);
		setValueEx(Cnd_inst_sub_char1, null);
		setValueEx(Cnd_inst_sub_char2, null);
		setValueEx(Cnd_inst_sub_char3, null);
		setValueEx(Cnd_inst_intr_d_rmrks, null);
		setValueEx(Cnd_inst_trd_d_rmrks, null);
		setValueEx(Cnd_inst_d_rmrks, null);
		setValueEx(Cnd_inst_d_sub_char1, null);
		setValueEx(Cnd_inst_d_sub_char2, null);
		setValueEx(Cnd_inst_d_sub_char3, null);
		setValueEx(Cnd_act_intr_rmrks, null);
		setValueEx(Cnd_act_trd_rmrks, null);
		setValueEx(Cnd_act_sub_char1, null);
		setValueEx(Cnd_act_sub_char2, null);
		setValueEx(Cnd_act_sub_char3, null);
		setValueEx(Cnd_act_intr_d_rmrks, null);
		setValueEx(Cnd_act_trd_d_rmrks, null);
		setValueEx(Cnd_act_d_sub_char1, null);
		setValueEx(Cnd_act_d_sub_char2, null);
		setValueEx(Cnd_act_d_sub_char3, null);
	}

	protected void setInstRmrks() {
		setValueEx(Cnd_schd_trd_d_rmrks, null);
		setValueEx(Cnd_schd_dspsl_rmrks, null);
		setValueEx(Cnd_schd_sub_char1, null);
		setValueEx(Cnd_schd_sub_char2, null);
		setValueEx(Cnd_schd_sub_char3, null);
		setValueEx(Cnd_act_intr_rmrks, null);
		setValueEx(Cnd_act_trd_rmrks, null);
		setValueEx(Cnd_act_sub_char1, null);
		setValueEx(Cnd_act_sub_char2, null);
		setValueEx(Cnd_act_sub_char3, null);
		setValueEx(Cnd_act_intr_d_rmrks, null);
		setValueEx(Cnd_act_trd_d_rmrks, null);
		setValueEx(Cnd_act_d_sub_char1, null);
		setValueEx(Cnd_act_d_sub_char2, null);
		setValueEx(Cnd_act_d_sub_char3, null);
	}

	protected void setActRmrks() {
		setValueEx(Cnd_schd_trd_d_rmrks, null);
		setValueEx(Cnd_schd_dspsl_rmrks, null);
		setValueEx(Cnd_schd_sub_char1, null);
		setValueEx(Cnd_schd_sub_char2, null);
		setValueEx(Cnd_schd_sub_char3, null);
		setValueEx(Cnd_inst_intr_rmrks, null);
		setValueEx(Cnd_inst_trd_rmrks, null);
		setValueEx(Cnd_inst_rmrks, null);
		setValueEx(Cnd_inst_sub_char1, null);
		setValueEx(Cnd_inst_sub_char2, null);
		setValueEx(Cnd_inst_sub_char3, null);
		setValueEx(Cnd_inst_intr_d_rmrks, null);
		setValueEx(Cnd_inst_trd_d_rmrks, null);
		setValueEx(Cnd_inst_d_rmrks, null);
		setValueEx(Cnd_inst_d_sub_char1, null);
		setValueEx(Cnd_inst_d_sub_char2, null);
		setValueEx(Cnd_inst_d_sub_char3, null);
	}

	protected void setTrdValue() {
		if (Cnd_ope_PRNT_DSPSL.isSelected()) {
			setValueEx(Cnd_trd_cd, getDefaultTrdCd(MAC_TRD_PTN_TYP.SCRP.value()));
			Cnd_trd_cd.setMode(MCMode.READ_ONLY);
			Cnd_trd_nm.setMode(MCMode.READ_ONLY);
		} else {
			Cnd_trd_cd.setMode(MCMode.ENABLE);
			Cnd_trd_nm.setMode(MCMode.ENABLE);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		// 明細行クリック時、画面遷移ボタンの使用可能かを制御する。
		setOpenBtnMode(RsltTable.getSelectedMCRow());
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);

		setPrntBtnModeByCheck();
	}

	/**
	 * チェックオンとなる明細データに従い、印刷ボタンの使用可能かを制御する。
	 */
	protected void setPrntBtnModeByCheck() {
		// ボタンモード初期化
		setPrntBtnMode(false);

		// チェックオンリストの取得
		MCList<RsltR> chkL = getRsltL().subList(RsltR.$check, true);
		if (isNull(chkL)) {
			return;
		}

		// チェックオン明細中に、他勘定振替実績ＮＯがある場合、振替伝票印刷可能とする。
		for(RsltR r : chkL) {
			if (!isNull(r.acxfr_act_no())) {
				Btn_prnt_acxfr.setMode(MCMode.ENABLE);
				break;
			}
		}
	}

	protected void setOpenBtnMode(RsltR selR) {

		if (selR == null || isNull(selR.acxfr_inst_no())) {
			Btn_open_MSBEP2410.setMode(MCMode.DISABLE);
		} else {
			Btn_open_MSBEP2410.setMode(MCMode.ENABLE);
		}

		if (selR == null || isNullAnd(selR.acxfr_act_no(), selR.acxfr_inst_no())) {
			Btn_open_MSBEP2420.setMode(MCMode.DISABLE);
		} else {
			Btn_open_MSBEP2420.setMode(MCMode.ENABLE);
		}
	}

	protected void setCheckBtnMode(boolean enable) {
		if (enable) {
			Btn_select_all.setMode(MCMode.ENABLE);
			Btn_deselect_all.setMode(MCMode.ENABLE);
		} else {
			Btn_select_all.setMode(MCMode.DISABLE);
			Btn_deselect_all.setMode(MCMode.DISABLE);
		}
	}

	protected void setPrntBtnMode(boolean enable) {
		if (enable) {
			Btn_prnt_acxfr.setMode(MCMode.ENABLE);
		} else {
			Btn_prnt_acxfr.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * ボタンのモードを初期化する。
	 */
	protected void initBtnMode() {
		setPrntBtnMode(false);
		setCheckBtnMode(false);
		setOpenBtnMode(null);
	}

	@Override
	public boolean isChanged(MCTable<?> tbl) {
		// return super.isChanged(tbl);
		return false;
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r == null) {
				return;
			}
			if (Cnd_ope_REF2.isSelected()) {
				if (Btn_open_MSBEP2410.isEnabled()) {
					doBtn_open_MSBEP2410(r);
				}
			}
			else if (Cnd_ope_REF3.isSelected() || Cnd_ope_PRNT_ACXFR.isSelected()) {
				if (Btn_open_MSBEP2420.isEnabled()) {
					doBtn_open_MSBEP2420(r);
				}
			}
		}
	}

}