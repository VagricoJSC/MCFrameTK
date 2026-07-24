package mcframe.clientMSBE.MSBEP2530;

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
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5050.*;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_StkXfrSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_StkXfrSrch_MC extends MSBEP_StkXfrSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkXfrSrch_MC() {
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
	public MSBEP_StkXfrSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2530_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2530_Srch01Caller<P extends MSBEP_StkXfrSrch, B extends MS_MSBEL2530_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2530_Srch01Caller(P p, B b) {
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
			checkForCallStackForSrch(msgList);
		}

		@Override
		protected void setMode() {
			super.setMode();

			// 検索後のステータス
			setStatus(REF);
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			// 初期ステータスに戻る
			setStatus(INI);
			Ctrl_ctrl_PPanel.expand(true);
		}

		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		}
	}

	/**
	 * [MS_MSBEL2530_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2530_Prnt01Caller<P extends MSBEP_StkXfrSrch, B extends MS_MSBEL2530_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL2530_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			bridge.up0().setAll(getSnglCheckedDtlL());
		}

		/**
		 * 一覧から、チェックオン、かつ、在庫振替実績ＮＯが重複なしの
		 * データを洗い出して、サーバーへ渡す。
		 * @return サーバーへ渡すデータ
		 */
		protected MCList<RsltR> getSnglCheckedDtlL() {
			MCList<RsltR> dtlL = MCList.create(RsltR.class);

			Set<String> actNoSet = new HashSet<String>();
			for (RsltR r : getRsltL()) {
				if (!r.check() || actNoSet.contains(r.stk_xfr_act_no())) {
					continue;
				}

				actNoSet.add(r.stk_xfr_act_no());
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
		callMS_MSBEL2530_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL2530_Srch01().execDL();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP2520]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2520(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP2520(r);
	}

	protected void doBtn_open_MSBEP2520(RsltR r) {
		if (!isNull(r.stk_xfr_act_no())) {
			// 遷移先画面の取得
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2520");
			mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg msbep2520 = (mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg) aso.getPanel();
			mcframe.clientMSBE.MSBEP2520.CndR bind = mcframe.clientMSBE.MSBEP2520.CndR.create();

			// 検索条件の設定
			bind.ope(msbep2520.Cnd_ope_SRCH.getActionCommand());
			bind.stk_xfr_act_no(r.stk_xfr_act_no());
			aso.putCnd(bind);
			aso.putSearchAction();

			// 遷移先画面の表示
			aso.show();
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBEL2530_Prnt01();
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
		//取引単位数量
		Rslt_trd_unit_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		// 基準単位数量
		Rslt_base_unit_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		// 基準単位数量
		Rslt_pack_unit_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		
		// 品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);

		// 一括設定枠の項目の値を設定する
		RsltR cR = getRsltL().get(info.getEventIndex());
		if (cR == null) {
			return;
		}

		setRelationCheck(cR);
		setPrntBtnMode();
	}

	/**
	 * 引数行と同じ在庫振替実績ＮＯの行に対して、<br>
	 * 引数行と同様なチェック状態にする。
	 * @param cR
	 */
	protected void setRelationCheck(RsltR cR) {
		boolean chkVal  = cR.check();
		String xfrActNo = cR.stk_xfr_act_no();

		for (RsltR r : getRsltL()) {
			if (isSame(xfrActNo, r.stk_xfr_act_no())) {
				r.check(chkVal);
			}
		}
	}

	/**
	 * 振替伝票印刷ボタンの使用可否を制御する。<br>
	 * 一覧中に、チェックオンとなっているデータがある場合のみ、振替伝票印刷ボタンは使用可能とする。
	 * @param r
	 */
	protected void setPrntBtnMode() {
		RsltR onR = getRsltL().getFirst(RsltR.$check, true);
		if (onR == null) {
			Btn_prnt.setMode(MCMode.DISABLE);
		} else {
			Btn_prnt.setMode(MCMode.ENABLE);
		}
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
			if (!Btn_open_MSBEP2520.isEnabled()) {
				return;
			}

			if (!isNull(r.stk_xfr_act_no())) {
				// 遷移先画面の取得
				MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP2520");
				mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg msbep2520 = (mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg) aso.getPanel();
				mcframe.clientMSBE.MSBEP2520.CndR bind = mcframe.clientMSBE.MSBEP2520.CndR.create();

				// 検索条件の設定
				bind.ope(msbep2520.Cnd_ope_SRCH.getActionCommand());
				bind.stk_xfr_act_no(r.stk_xfr_act_no());
				aso.putCnd(bind);
				aso.putSearchAction();

				// 遷移先画面の表示
				aso.show();
			}
		}
	}

}