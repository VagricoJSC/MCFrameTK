package mcframe.clientMABC.MABCP0870;

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
import mcframe.clientMAUB.MAUBP0020.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ItmCopyReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ItmCopyReg_MC extends MABCP_ItmCopyReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 遷移ボタンの横にあるチェックボックス
	 */
	protected MCCheckBox[] _rowFlgBeans = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmCopyReg_MC() {
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
	public MABCP_ItmCopyReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0370]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0370(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABSP0370(row);
	}
	protected void doBtn_open_MABSP0370(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0370");
		mcframe.clientMABS.MABSP0370.MABSP_ItmStrLnReg p = (mcframe.clientMABS.MABSP0370.MABSP_ItmStrLnReg) aso.getPanel();
		mcframe.clientMABS.MABSP0370.CndR to = mcframe.clientMABS.MABSP0370.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		aso.runValueInit();
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0360]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0360(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABSP0360(row);
	}
	protected void doBtn_open_MABSP0360(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0360");
		mcframe.clientMABS.MABSP0360.MABSP_ItmLgGrpReg p = (mcframe.clientMABS.MABSP0360.MABSP_ItmLgGrpReg) aso.getPanel();
		mcframe.clientMABS.MABSP0360.CndR to = mcframe.clientMABS.MABSP0360.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		aso.runValueInit();
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * [MA_MABCL0870_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0870_Upd01Caller<P extends MABCP_ItmCopyReg, B extends MA_MABCL0870_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0870_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0870_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0870_Del01Caller<P extends MABCP_ItmCopyReg, B extends MA_MABCL0870_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0870_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkDuplicate(MCMessageList msgList) {
			// 何もしない
		}
	}

	/**
	 * [MA_MABCL0870_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0870_Srch01Caller<P extends MABCP_ItmCopyReg, B extends MA_MABCL0870_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0870_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			Ctrl_ctrl_PPanel.expand(false);
		}
	}
	
	/**
	 * [MA_MABCL0870_Srch02]の定型処理のInnerClass
	 */
	protected class MA_MABCL0870_Srch02Caller<P extends MABCP_ItmCopyReg, B extends MA_MABCL0870_Srch02Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0870_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(Cnd_release_flg_on, Cnd_release_flg_off));
	}
	//////////////////// 初期化　START ////////////////////
	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_release_flg_off, true);
		setValueEx(Cnd_release_flg_on, true);
	}
	//////////////////// 初期化　END ////////////////////
	
	//////////////////// 画面遷移　START ////////////////////
	/**
	 * 汎用画面遷移処理（品目引継->検索のみ、操作種別の変更なし）
	 */
	protected void openScrSimple(String scrId) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MCRow to = MCRow.create();
		to.addStringColumn("ope", Cnd_ope_REF.getActionCommand());
		to.addStringColumn("itm_cd", row.src_itm_cd());
		to.addStringColumn("itm_sub1", row.src_itm_sub1());
		to.addStringColumn("itm_sub2", row.src_itm_sub2());
		to.addStringColumn("itm_sub3", row.src_itm_sub3());

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener(scrId.substring(0, 2), scrId);
		setBooleanColumn(scrId, aso, to);
		aso.runValueInit();
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
		protected void setBooleanColumn(String scrId, MAUCP_AppScreenOpener aso, MCRow to) {
		if (isSame(scrId, "MABCP0860")) {
			mcframe.clientMABC.MABCP0860.MABCP_StdcostReg p = (mcframe.clientMABC.MABCP0860.MABCP_StdcostReg) aso.getPanel();
			if (p.RPnl_srch_cmn.authorize()) {
				to.addBooleanColumn("cmn_flg", true);
			}
			if (p.RPnl_srch_wg.authorize()) {
				to.addBooleanColumn("wg_flg", true);
			}
		}
		else if (isSame(scrId, "MABSP0120")) {
			mcframe.clientMABS.MABSP0120.MABSP_PurcUpriReg p = (mcframe.clientMABS.MABSP0120.MABSP_PurcUpriReg) aso.getPanel();
			if (p.RPnl_srch_cmn.authorize()) {
				to.addBooleanColumn("cmn_flg", true);
			}
			if (p.RPnl_srch_wg.authorize()) {
				to.addBooleanColumn("wg_flg", true);
			}
		}
		else if (isSame(scrId, "MABSP0130")) {
			mcframe.clientMABS.MABSP0130.MABSP_ProvUpriReg p = (mcframe.clientMABS.MABSP0130.MABSP_ProvUpriReg) aso.getPanel();
			if (p.RPnl_srch_cmn.authorize()) {
				to.addBooleanColumn("cmn_flg", true);
			}
			if (p.RPnl_srch_wg.authorize()) {
				to.addBooleanColumn("wg_flg", true);
			}
		}
		else if (isSame(scrId, "MABSP0140")) {
			mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg p = (mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg) aso.getPanel();
			if (p.RPnl_srch_cmn.authorize()) {
				to.addBooleanColumn("cmn_flg", true);
			}
			if (p.RPnl_srch_wg.authorize()) {
				to.addBooleanColumn("wg_flg", true);
			}
		}
		else if (isSame(scrId, "MABSP0220")) {
			mcframe.clientMABS.MABSP0220.MABSP_CstSlsUpriReg p = (mcframe.clientMABS.MABSP0220.MABSP_CstSlsUpriReg) aso.getPanel();
			if (p.RPnl_srch_cmn.authorize()) {
				to.addBooleanColumn("cmn_flg", true);
			}
			if (p.RPnl_srch_wg.authorize()) {
				to.addBooleanColumn("wg_flg", true);
			}
		}
		else if (isSame(scrId, "MABSP0240")) {
			mcframe.clientMABS.MABSP0240.MABSP_ItmSlsUpriReg p = (mcframe.clientMABS.MABSP0240.MABSP_ItmSlsUpriReg) aso.getPanel();
			if (p.RPnl_srch_cmn.authorize()) {
				to.addBooleanColumn("cmn_flg", true);
			}
			if (p.RPnl_srch_wg.authorize()) {
				to.addBooleanColumn("wg_flg", true);
			}
		}
		else if (isSame(scrId, "MABSP0250")) {
			mcframe.clientMABS.MABSP0250.MABSP_StdSlsUpriReg p = (mcframe.clientMABS.MABSP0250.MABSP_StdSlsUpriReg) aso.getPanel();
			if (p.RPnl_srch_cmn.authorize()) {
				to.addBooleanColumn("cmn_flg", true);
			}
			if (p.RPnl_srch_wg.authorize()) {
				to.addBooleanColumn("wg_flg", true);
			}
		}
		else if (isSame(scrId, "MABSP0850")) {
			mcframe.clientMABS.MABSP0850.MABSP_MpsItmReg p = (mcframe.clientMABS.MABSP0850.MABSP_MpsItmReg) aso.getPanel();
			if (p.RPnl_srch_cmn.authorize()) {
				to.addBooleanColumn("cmn_flg", true);
			}
			if (p.RPnl_srch_wg.authorize()) {
				to.addBooleanColumn("wg_flg", true);
			}
		}
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP0310]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP0310(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0310");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0310CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0310.CndR crtOpenMABCP0310CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP0310.MABCP_ItmReg p = (mcframe.clientMABC.MABCP0310.MABCP_ItmReg) aso.getPanel();
		mcframe.clientMABC.MABCP0310.CndR to = mcframe.clientMABC.MABCP0310.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP0320]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP0320(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0320");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0320CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品目補助マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABC.MABCP0320.CndR crtOpenMABCP0320CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP0320.MABCP_ItmSubReg p = (mcframe.clientMABC.MABCP0320.MABCP_ItmSubReg) aso.getPanel();
		mcframe.clientMABC.MABCP0320.CndR to = mcframe.clientMABC.MABCP0320.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP0330]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP0330(MCEventInfo info) {
		// 品目単位マスタ登録
		openScrSimple("MABCP0330");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP0840]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP0840(MCEventInfo info) {
		// 品目付加情報マスタ登録
		openScrSimple("MABCP0840");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP0360]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP0360(MCEventInfo info) {
		// 品目禁止マスタ登録
		openScrSimple("MABCP0360");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0320]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0320(MCEventInfo info) {
		// 品目手配不許可マスタ登録
		openScrSimple("MABSP0320");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP0860]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP0860(MCEventInfo info) {
		// 標準単価マスタ登録
		openScrSimple("MABCP0860");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP0880]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP0880(MCEventInfo info) {
		// 諸口品マスタ登録
		openScrSimple("MABCP0880");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0150]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0150(MCEventInfo info) {
		// 品目格納先マスタ登録
		openScrSimple("MABSP0150");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0780]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0780(MCEventInfo info) {
		// 製造引当制御マスタ登録
		openScrSimple("MABSP0780");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0800]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0800(MCEventInfo info) {
		// 在庫補充マスタ登録
		openScrSimple("MABSP0800");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0080]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0080(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0080");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0080CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 代替品目マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0080.CndR crtOpenMABSP0080CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0080.MABSP_AltItmReg p = (mcframe.clientMABS.MABSP0080.MABSP_AltItmReg) aso.getPanel();
		mcframe.clientMABS.MABSP0080.CndR to = mcframe.clientMABS.MABSP0080.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.chd_itm_cd(r.src_itm_cd());
		to.chd_itm_sub1(r.src_itm_sub1());
		to.chd_itm_sub2(r.src_itm_sub2());
		to.chd_itm_sub3(r.src_itm_sub3());
		if (p.RPnl_srch_cmn.authorize()) {
			to.cmn_flg(true);
		}
		if (p.RPnl_srch_wg.authorize()) {
			to.wg_flg(true);
		}
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0340]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0340(MCEventInfo info) {
		// 品目マスタ（ＷＧ）登録
		openScrSimple("MABSP0340");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0010]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0010(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0010");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0010CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品目詳細マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0010.CndR crtOpenMABSP0010CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0010.MABSP_ItmDtlReg p = (mcframe.clientMABS.MABSP0010.MABSP_ItmDtlReg) aso.getPanel();
		mcframe.clientMABS.MABSP0010.CndR to = mcframe.clientMABS.MABSP0010.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		if (p.RPnl_srch_cmn.authorize()) {
			to.cmn_flg(true);
		}
		if (p.RPnl_srch_wg.authorize()) {
			to.wg_flg(true);
		}
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0090]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0090(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0090");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0090CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品目工程マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0090.CndR crtOpenMABSP0090CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0090.MABSP_ItmOperReg p = (mcframe.clientMABS.MABSP0090.MABSP_ItmOperReg) aso.getPanel();
		mcframe.clientMABS.MABSP0090.CndR to = mcframe.clientMABS.MABSP0090.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		if (p.RPnl_srch_cmn.authorize()) {
			to.cmn_flg(true);
		}
		if (p.RPnl_srch_wg.authorize()) {
			to.wg_flg(true);
		}
		return to;
	}

	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0030_par]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0030_par(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0030");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0030CndR_P(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * ＢＯＭマスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0030.CndR crtOpenMABSP0030CndR_P(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0030.MABSP_BomLst p = (mcframe.clientMABS.MABSP0030.MABSP_BomLst) aso.getPanel();
		mcframe.clientMABS.MABSP0030.CndR to = mcframe.clientMABS.MABSP0030.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.par_itm_cd(r.src_itm_cd());
		to.par_itm_sub1(r.src_itm_sub1());
		to.par_itm_sub2(r.src_itm_sub2());
		to.par_itm_sub3(r.src_itm_sub3());
		if (p.RPnl_srch_cmn.authorize()) {
			to.cmn_flg(true);
		}
		if (p.RPnl_srch_wg.authorize()) {
			to.wg_flg(true);
		}
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0030]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0030(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0030");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0030CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * ＢＯＭ一覧登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0030.CndR crtOpenMABSP0030CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0030.MABSP_BomLst p = (mcframe.clientMABS.MABSP0030.MABSP_BomLst) aso.getPanel();
		mcframe.clientMABS.MABSP0030.CndR to = mcframe.clientMABS.MABSP0030.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.chd_itm_cd(r.src_itm_cd());
		to.chd_itm_sub1(r.src_itm_sub1());
		to.chd_itm_sub2(r.src_itm_sub2());
		to.chd_itm_sub3(r.src_itm_sub3());
		if (p.RPnl_srch_cmn.authorize()) {
			to.cmn_flg(true);
		}
		if (p.RPnl_srch_wg.authorize()) {
			to.wg_flg(true);
		}
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0110]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0110(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0110");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0110CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 工程工数マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0110.CndR crtOpenMABSP0110CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0110.MABSP_OperWkCostReg p = (mcframe.clientMABS.MABSP0110.MABSP_OperWkCostReg) aso.getPanel();
		mcframe.clientMABS.MABSP0110.CndR to = mcframe.clientMABS.MABSP0110.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		if (p.RPnl_srch_cmn.authorize()) {
			to.cmn_flg(true);
		}
		if (p.RPnl_srch_wg.authorize()) {
			to.wg_flg(true);
		}
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0170]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0170(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0170");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0170CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品目検査パタンマスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0170.CndR crtOpenMABSP0170CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0170.MABSP_ItmInspPtnReg p = (mcframe.clientMABS.MABSP0170.MABSP_ItmInspPtnReg) aso.getPanel();
		mcframe.clientMABS.MABSP0170.CndR to = mcframe.clientMABS.MABSP0170.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0190]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0190(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0190");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0190CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品目品管マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0190.CndR crtOpenMABSP0190CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0190.MABSP_ItmInspReg p = (mcframe.clientMABS.MABSP0190.MABSP_ItmInspReg) aso.getPanel();
		mcframe.clientMABS.MABSP0190.CndR to = mcframe.clientMABS.MABSP0190.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0180]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0180(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0180");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0180CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品目検査規格マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0180.CndR crtOpenMABSP0180CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0180.MABSP_InspSpecReg p = (mcframe.clientMABS.MABSP0180.MABSP_InspSpecReg) aso.getPanel();
		mcframe.clientMABS.MABSP0180.CndR to = mcframe.clientMABS.MABSP0180.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0350]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0350(MCEventInfo info) {
		// 品目マスタ（工場・物流倉庫）登録
		openScrSimple("MABSP0350");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0770]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0770(MCEventInfo info) {
		// 版マスタ登録
		openScrSimple("MABSP0770");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0210_dest]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0210_dest(MCEventInfo info) {
		// ロット継承マスタ登録（ロット継承先に設定）
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0200");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0200CndR(aso, row, true));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0210_src]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0210_src(MCEventInfo info) {
		// ロット継承マスタ登録（ロット継承元に設定）
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0200");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0200CndR(aso, row, false));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMABS.MABSP0200.CndR crtOpenMABSP0200CndR(MAUCP_AppScreenOpener aso, DtlR r, boolean parFlg) {
		mcframe.clientMABS.MABSP0200.CndR to = mcframe.clientMABS.MABSP0200.CndR.create();
		mcframe.clientMABS.MABSP0200.MABSP_LotInhLst p = (mcframe.clientMABS.MABSP0200.MABSP_LotInhLst) aso.getPanel();
		if (p.Cnd_srch_cmn.authorize()) {
			to.cmn_flg(true);
		}
		if (p.Cnd_srch_wg.authorize()) {
			to.wg_flg(true);
		}
		if (parFlg) {
			to.par_itm_cd(r.src_itm_cd());
			to.par_itm_sub1(r.src_itm_sub1());
			to.par_itm_sub2(r.src_itm_sub2());
			to.par_itm_sub3(r.src_itm_sub3());
		}
		else {
			to.chd_itm_cd(r.src_itm_cd());
			to.chd_itm_sub1(r.src_itm_sub1());
			to.chd_itm_sub2(r.src_itm_sub2());
			to.chd_itm_sub3(r.src_itm_sub3());
		}
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0280]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0280(MCEventInfo info) {
		// 品目仕様マスタ登録
		openScrSimple("MABSP0280");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0310]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0310(MCEventInfo info) {
		// 品目仕様項目マスタ登録
		openScrSimple("MABSP0310");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0290_core]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0290_core(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0290");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0290CndR(aso, row, true));
		aso.putSearchAction();
		aso.show();
	}	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0290_comp]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0290_comp(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0290");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0290CndR(aso, row, false));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品目構成マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @param flg 主品目の場合はtrueを設定、構成品目の場合はfalseを設定する。
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0290.CndR crtOpenMABSP0290CndR(MAUCP_AppScreenOpener aso, DtlR r, boolean flg) {
		mcframe.clientMABS.MABSP0290.MABSP_ItmCompReg p = (mcframe.clientMABS.MABSP0290.MABSP_ItmCompReg) aso.getPanel();
		mcframe.clientMABS.MABSP0290.CndR to = mcframe.clientMABS.MABSP0290.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		if (flg) {
			to.core_itm_cd(r.src_itm_cd());
			to.core_itm_sub1(r.src_itm_sub1());
			to.core_itm_sub2(r.src_itm_sub2());
			to.core_itm_sub3(r.src_itm_sub3());
		}
		else {
			to.comp_itm_cd(r.src_itm_cd());
			to.comp_itm_sub1(r.src_itm_sub1());
			to.comp_itm_sub2(r.src_itm_sub2());
			to.comp_itm_sub3(r.src_itm_sub3());
		}
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0850]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0850(MCEventInfo info) {
		// ＭＰＳ品目マスタ登録
		openScrSimple("MABSP0850");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0830]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0830(MCEventInfo info) {
		// 販売計画品目構成マスタ登録
		openScrSimple("MABSP0830");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0530]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0530(MCEventInfo info) {
		// 仕入直送ＬＴマスタ登録
		openScrSimple("MABSP0530");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0640]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0640(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP0640");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP0640CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 取引先品目マスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP0640.CndR crtOpenMABSP0640CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP0640.MABSP_BpItmReg p = (mcframe.clientMABS.MABSP0640.MABSP_BpItmReg) aso.getPanel();
		mcframe.clientMABS.MABSP0640.CndR to = mcframe.clientMABS.MABSP0640.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0140]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0140(MCEventInfo info) {
		// 加工単価マスタ登録
		openScrSimple("MABSP0140");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0130]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0130(MCEventInfo info) {
		// 支給単価マスタ登録
		openScrSimple("MABSP0130");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0120]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0120(MCEventInfo info) {
		// 購買単価マスタ登録
		openScrSimple("MABSP0120");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0250]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0250(MCEventInfo info) {
		// 標準販売単価マスタ登録
		openScrSimple("MABSP0250");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0240]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0240(MCEventInfo info) {
		// 品目販売単価マスタ登録
		openScrSimple("MABSP0240");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP0220]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP0220(MCEventInfo info) {
		// 得意先販売単価マスタ登録
		openScrSimple("MABSP0220");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP1060_main]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP1060_main(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1060");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1060CndR_M(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品揃マスタ登録（代表品目）の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP1060.CndR crtOpenMABSP1060CndR_M(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP1060.MABSP_SetItmReg p = (mcframe.clientMABS.MABSP1060.MABSP_SetItmReg) aso.getPanel();
		mcframe.clientMABS.MABSP1060.CndR to = mcframe.clientMABS.MABSP1060.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.main_itm_cd(r.src_itm_cd());
		to.main_itm_sub1(r.src_itm_sub1());
		to.main_itm_sub2(r.src_itm_sub2());
		to.main_itm_sub3(r.src_itm_sub3());
		return to;
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MABSP1060_set]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABSP1060_set(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1060");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1060CndR_S(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 品揃マスタ登録（品揃品目）の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABS.MABSP1060.CndR crtOpenMABSP1060CndR_S(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABS.MABSP1060.MABSP_SetItmReg p = (mcframe.clientMABS.MABSP1060.MABSP_SetItmReg) aso.getPanel();
		mcframe.clientMABS.MABSP1060.CndR to = mcframe.clientMABS.MABSP1060.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.set_itm_cd(r.src_itm_cd());
		to.set_itm_sub1(r.src_itm_sub1());
		to.set_itm_sub2(r.src_itm_sub2());
		to.set_itm_sub3(r.src_itm_sub3());
		return to;
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP1520]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP1520(MCEventInfo info) {
		// ＩＦコード変換マスタ登録
		openScrSimple("MABCP1520");
	}
	
	/**
	 * Panel[CopyTgt]のボタン[open_MABCP2080]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP2080(MCEventInfo info) {
		// 原価品群構成マスタ登録
		openScrSimple("MABCP2080");
	}

	/**
	 * Panel[CopyTgt]のボタン[open_MABCP1090]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABCP1090(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1090");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP1090CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 自動仕分パタンマスタ一覧照会の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABC.MABCP1090.CndR crtOpenMABCP1090CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP1090.CndR to = mcframe.clientMABC.MABCP1090.CndR.create();
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		return to;
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MABGP0250]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABGP0250(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABGP0250(row);
	}
	protected void doBtn_open_MABGP0250(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0250");
		mcframe.clientMABG.MABGP0250.MABGP_CoefConfigReg p = (mcframe.clientMABG.MABGP0250.MABGP_CoefConfigReg) aso.getPanel();
		mcframe.clientMABG.MABGP0250.CndR to = mcframe.clientMABG.MABGP0250.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMABG.MABGP0250.CndR.$term_fr);
		list.add(mcframe.clientMABG.MABGP0250.CndR.$term_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MABGP0300]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABGP0300(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABGP0300(row);
	}
	protected void doBtn_open_MABGP0300(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0300");
		mcframe.clientMABG.MABGP0300.MABGP_AlcExpnsReg p = (mcframe.clientMABG.MABGP0300.MABGP_AlcExpnsReg) aso.getPanel();
		mcframe.clientMABG.MABGP0300.CndR to = mcframe.clientMABG.MABGP0300.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMABG.MABGP0310.CndR.$term_fr);
		list.add(mcframe.clientMABG.MABGP0310.CndR.$term_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MABGP0310]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABGP0310(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABGP0310(row);
	}
	protected void doBtn_open_MABGP0310(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0310");
		mcframe.clientMABG.MABGP0310.MABGP_AlcInptReg p = (mcframe.clientMABG.MABGP0310.MABGP_AlcInptReg) aso.getPanel();
		mcframe.clientMABG.MABGP0310.CndR to = mcframe.clientMABG.MABGP0310.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		List<String> list = new ArrayList<String>();
		list.add(mcframe.clientMABG.MABGP0310.CndR.$term_fr);
		list.add(mcframe.clientMABG.MABGP0310.CndR.$term_to);
		aso.runValueInit();
		aso.putCnd(to, list);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MABGP0610]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABGP0610(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABGP0610(row);
	}
	protected void doBtn_open_MABGP0610(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0610");
		mcframe.clientMABG.MABGP0610.MABGP_CostItmOutReg p = (mcframe.clientMABG.MABGP0610.MABGP_CostItmOutReg) aso.getPanel();
		mcframe.clientMABG.MABGP0610.CndR to = mcframe.clientMABG.MABGP0610.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.src_itm_cd());
		to.itm_sub1(r.src_itm_sub1());
		to.itm_sub2(r.src_itm_sub2());
		to.itm_sub3(r.src_itm_sub3());
		aso.runValueInit();
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[CopyTgt]のボタン[open_MABGP0630]の押下時の処理
	 */
	@Override
	public void doCopyTgt_open_MABGP0630(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MABGP0630(row);
	}
	protected void doBtn_open_MABGP0630(DtlR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABGP0630");
		mcframe.clientMABG.MABGP0630.MABGP_XpnsPurcAlcReg p = (mcframe.clientMABG.MABGP0630.MABGP_XpnsPurcAlcReg) aso.getPanel();
		mcframe.clientMABG.MABGP0630.CndR to = mcframe.clientMABG.MABGP0630.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.xpns_itm_cd(r.src_itm_cd());
		to.xpns_itm_sub1(r.src_itm_sub1());
		to.xpns_itm_sub2(r.src_itm_sub2());
		to.xpns_itm_sub3(r.src_itm_sub3());
		aso.runValueInit();
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0870_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0870_Del01();
	}
	//////////////////// 画面遷移　END ////////////////////
	
	//////////////////// イベント　START /////////////////////
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		
		if (isSrch01()) {
			callMA_MABCL0870_Srch01();
		}
		else if (isSrch02()) {
			callMA_MABCL0870_Srch02();
		}
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[CopyTgt]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCopyTgt_select_all(MCEventInfo info) {
		for(MCCheckBox c : getCopyTgtFlgBeans()) {
			if (c.getModeInfo().getStatus() == MCMode.ENABLE_STATUS) {
				c.setValue(true);
			}
		}
	}
	/**
	 * Panel[CopyTgt]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCopyTgt_deselect_all(MCEventInfo info) {
		for(MCCheckBox c : getCopyTgtFlgBeans()) {
			if (c.getModeInfo().getStatus() == MCMode.ENABLE_STATUS) {
				c.setValue(false);
			}
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		if(Cnd_ope_UPD.isSelected()) {
			valueInitSub();
			setValueEx(Cnd_chng_no, null);
			setValueEx(Cnd_ref_itm_cd, null);
			setValueEx(Cnd_ref_itm_sub1, null);
			setValueEx(Cnd_ref_itm_sub2, null);
			setValueEx(Cnd_ref_itm_sub3, null);
			setUPDStatus();
		}
		else if (isSrch02()) {
			valueInitSub();
			setREF_UPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			valueInitSub();
		}
	}
	
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		
		int strIdx = nc.getName().indexOf(".");
		String blockId = nc.getName().substring(0, strIdx);

		// コピー対象変更時、一覧の選択行にフラグの値をコピーする
		if (isSame(blockId,getBlockId(getCopyTgtR()))) {
			CopyTgtR copyTgtR = getCopyTgtR();
			DtlR dtlR = DtlTable.getSelectedMCRow();
			if (dtlR != null) {
				copy(dtlR, copyTgtR, createMap_DtlR_CopyTgtR());
			}
		}
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		
		doDtl_NCSub();
	}

	/**
	 * その他のNotificationChangeイベントを実行する。
	 */
	protected void doDtl_NCSub() {
		
		setFlgValueAndMode();
		ctlBtnMode();
	}
	//////////////////// イベント　END ////////////////////

	//////////////////// 表示・入力制御 START ////////////////////	
	@Override
	protected void setStatusByOpe() {
		if (isUpdOpe()) {
			getDtlTable().setStatusColumnVisible(true);
			setUPDStatus();
			// 操作種別「登録する」でも空行設定（fillSpace()）しない。
		}
		else if (isRefUpdOpe()) {
			getDtlTable().setStatusColumnVisible(true);
			setREF_UPDStatus();
		}
		else if (isDelOpe()) {
			getDtlTable().setStatusColumnVisible(false);
			setDELStatus();
		}
		else if (isRefOpe()) {
			getDtlTable().setStatusColumnVisible(false);
			setREFStatus();
		}
	}
	@Override
	public void fillSpace() {
		// 何もしない
	}

	/**
	 * 操作種別が「登録する（参照登録）」かどうか
	 */
	protected boolean isRefUpdOpe() {
		return getCndR().getString(getOpeColumn()).equals(getRefUpdOpeValue());
	}
	
	/**
	 * 操作種別：「登録する（参照登録）」の値（デフォルトは"9"）
	 */
	protected String getRefUpdOpeValue() {
		return "9";
	}
	
	/**
	 * ボタン一覧のチェックボックスとモードを設定する。
	 */
	protected void setFlgValueAndMode() {
		
		DtlR r = DtlTable.getSelectedMCRow();
		
		if (isNull(r) || r.getStatus() == Status.DELETE) {
			getCopyTgtR().clear();
		}
		else {
			copy(getCopyTgtR(), r, createMap_CopyTgtR_DtlR());
		}
		
		setFlgMode(r);
	}

	/**
	 * チェックボックスのモードを設定する。
	 * 
	 * @param r
	 */
	protected void setFlgMode(DtlR r) {
		if (Cnd_ope_DEL.isSelected() || Cnd_ope_REF.isSelected()) {
			return;
		}

		for (MCCheckBox cb : getCopyTgtFlgBeans()) {
			String cbRowColNm = cb.getRowColumnName();
			int strIdx = cbRowColNm.indexOf("_flg");
			String cntColNm = cbRowColNm.substring(0, strIdx).concat("_cnt");

			if (CopyTgt_itm_flg == cb || CopyTgt_attach_info_flg == cb
					|| CopyTgt_sundry_itm_flg == cb || CopyTgt_alt_itm_flg == cb || CopyTgt_bom_chd_flg == cb
					|| CopyTgt_itm_comp_comp_flg == cb || CopyTgt_itm_not_fix_flg == cb
					|| CopyTgt_itm_sls_upri_flg == cb || CopyTgt_lot_inh_src_flg == cb || CopyTgt_proc_upri_flg == cb
					|| CopyTgt_prov_upri_flg == cb || CopyTgt_purc_upri_flg == cb || CopyTgt_set_itm_set_flg == cb
					|| CopyTgt_std_sls_upri_flg == cb || CopyTgt_cst_sls_upri_flg == cb || CopyTgt_jnl_ptn_flg == cb
					|| CopyTgt_if_x_flg == cb) {

				// 品目マスタのチェックボックスは常にREAD_ONLY
				cb.setMode(MCMode.READ_ONLY);
			}
			else if (isNull(r) || isNull(cntColNm)) {
				cb.setMode(MCMode.READ_ONLY);
			}
			else if (r.getStatus() != Status.DELETE && getCopyTgtR().getBooleanNE(cntColNm)
					|| !isNull(r.getNumberNE(cntColNm))) {
				cb.setMode(MCMode.REQUIRED);
			}
			else {
				cb.setMode(MCMode.READ_ONLY);
			}
		}
	}
	
	/**
	 * ボタンのモードを制御する。
	 */
	protected void ctlBtnMode() {
		ctlSelectAllBtnMode();
	}
	
	/**
	 * 全選択、全解除ボタンのモードを制御する。
	 */
	protected void ctlSelectAllBtnMode() {

		boolean hasFlgEnable = false;
		MCMode e = MCMode.ENABLE;
		
		for (MCCheckBox c : getCopyTgtFlgBeans()) {
			
			int s = c.getModeInfo().getStatus();
			
			if (s == MCMode.ENABLE_STATUS) {
				hasFlgEnable = true;
				CopyTgt_select_all.setMode(e);
				CopyTgt_deselect_all.setMode(e);
			}
		}
		
		if (hasFlgEnable) {
			DtlBtn_select_all.setMode(e);
			DtlBtn_deselect_all.setMode(e);
		}
		else {
			for (MCCheckBox c : getCopyTgtFlgBeans()) {
				
				int s = c.getModeInfo().getStatus();
				
				if (s == MCMode.ENABLE_STATUS) {
					DtlBtn_select_all.setMode(e);
					DtlBtn_deselect_all.setMode(e);
				}
			}
		}
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setFlgValueAndMode();
	}
	
	@Override
	public void setREF_UPDStatus() {
		super.setREF_UPDStatus();

		columnDtl_dest_itm_cd.setMode(MCMode.READ_ONLY);
		if (columnDtl_dest_itm_sub1.isVisible()) {
			columnDtl_dest_itm_sub1.setMode(MCMode.READ_ONLY);
		}
		if (columnDtl_dest_itm_sub2.isVisible()) {
			columnDtl_dest_itm_sub2.setMode(MCMode.READ_ONLY);
		}
		if (columnDtl_dest_itm_sub3.isVisible()) {
			columnDtl_dest_itm_sub3.setMode(MCMode.READ_ONLY);
		}
		columnDtl_dest_itm_nm.setMode(MCMode.READ_ONLY);
		columnDtl_memo1.setMode(MCMode.READ_ONLY);
		columnDtl_memo2.setMode(MCMode.READ_ONLY);
		columnDtl_memo3.setMode(MCMode.READ_ONLY);

		setFlgValueAndMode();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();

		setValueEx(Cnd_release_flg_on, false);
		setValueEx(Cnd_release_flg_off, true);
		setFlgValueAndMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setFlgValueAndMode();
	}
	//////////////////// 表示・入力制御 END ////////////////////
	
	/**
	 * 遷移ボタンの横のチェックボックスを返す。
	 * 
	 * @return 遷移ボタンの横のチェックボックス
	 */
	protected MCCheckBox[] getCopyTgtFlgBeans() {
		
		if (_rowFlgBeans == null) {
			_rowFlgBeans = MCBeansUtil.getAllComponents(MCCheckBox.class, CopyTgtPanel);
		}
		
		return _rowFlgBeans;
	}
	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (isSame(getSysParm("VER_ENABLE_FLG"), "0")) {
			setComponentInvisibleAllStatus(CopyTgt_itm_ver_flg, CopyTgt_open_MABSP0770);
		}
		if (hasWgDefCd(this)) {
			setComponentInvisibleAllStatus(CopyTgt_itm_wg_flg, CopyTgt_open_MABSP0340);
		}
		if (hasLgGrpDefCd(this)) {
			setComponentInvisibleAllStatus(CopyTgt_itm_lg_grp_flg, CopyTgt_open_MABSP0360);
		}
		if (!isStrLnEnabled(this)) {
			setComponentInvisibleAllStatus(CopyTgt_itm_str_ln_flg, CopyTgt_open_MABSP0370);
		}
	}
	/**
	 * 操作種別が登録する（新規）または削除する（管理者）または参照するかどうか。
	 * @return 登録する（新規）または削除する（管理者）または参照するの場合はtrue
	 */
	protected boolean isSrch01() {
		
		if (Cnd_ope_UPD.isSelected()
				|| Cnd_ope_DEL.isSelected()
				|| Cnd_ope_REF.isSelected()) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * 操作種別が登録する（参照登録）かどうか。
	 * @return 登録する（参照登録）の場合はtrue
	 */
	protected boolean isSrch02() {
		
		if (Cnd_ope_REF_UPD.isSelected()) {
			return true;
		}
		
		return false;
	}

	/**
	 * 明細 -> コピー対象
	 */
	protected Map_CopyTgtR_DtlR<CopyTgtR,DtlR> createMap_CopyTgtR_DtlR() {
		return new Map_CopyTgtR_DtlR<CopyTgtR, DtlR>();
	}

	public class Map_CopyTgtR_DtlR<D extends CopyTgtR, S extends DtlR> extends MCRowMapper<D,S>{

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(CopyTgtR.$itm_flg, DtlR.$itm_flg);
			addColumnPathMap(CopyTgtR.$itm_sub_flg, DtlR.$itm_sub_flg);
			addColumnPathMap(CopyTgtR.$itm_unit_flg, DtlR.$itm_unit_flg);
			addColumnPathMap(CopyTgtR.$attach_info_flg, DtlR.$attach_info_flg);
			addColumnPathMap(CopyTgtR.$itm_stop_flg, DtlR.$itm_stop_flg);
			addColumnPathMap(CopyTgtR.$itm_not_fix_flg, DtlR.$itm_not_fix_flg);
			addColumnPathMap(CopyTgtR.$stdcost_flg, DtlR.$stdcost_flg);
			addColumnPathMap(CopyTgtR.$sundry_itm_flg, DtlR.$sundry_itm_flg);
			addColumnPathMap(CopyTgtR.$itm_strg_flg, DtlR.$itm_strg_flg);
			addColumnPathMap(CopyTgtR.$alloc_ctl_flg, DtlR.$alloc_ctl_flg);
			addColumnPathMap(CopyTgtR.$stk_rpl_flg, DtlR.$stk_rpl_flg);
			addColumnPathMap(CopyTgtR.$alt_itm_flg, DtlR.$alt_itm_flg);
			addColumnPathMap(CopyTgtR.$itm_wg_flg, DtlR.$itm_wg_flg);
			addColumnPathMap(CopyTgtR.$itm_dtl_flg, DtlR.$itm_dtl_flg);
			addColumnPathMap(CopyTgtR.$itm_oper_flg, DtlR.$itm_oper_flg);
			addColumnPathMap(CopyTgtR.$bom_par_flg, DtlR.$bom_par_flg);
			addColumnPathMap(CopyTgtR.$bom_chd_flg, DtlR.$bom_chd_flg);
			addColumnPathMap(CopyTgtR.$oper_wk_cost_flg, DtlR.$oper_wk_cost_flg);
			addColumnPathMap(CopyTgtR.$itm_insp_ptn_flg, DtlR.$itm_insp_ptn_flg);
			addColumnPathMap(CopyTgtR.$itm_insp_flg, DtlR.$itm_insp_flg);
			addColumnPathMap(CopyTgtR.$insp_spec_flg, DtlR.$insp_spec_flg);
			addColumnPathMap(CopyTgtR.$itm_site_flg, DtlR.$itm_site_flg);
			addColumnPathMap(CopyTgtR.$itm_ver_flg, DtlR.$itm_ver_flg);
			addColumnPathMap(CopyTgtR.$lot_inh_dest_flg, DtlR.$lot_inh_dest_flg);
			addColumnPathMap(CopyTgtR.$lot_inh_src_flg, DtlR.$lot_inh_src_flg);
			addColumnPathMap(CopyTgtR.$itm_spec_flg, DtlR.$itm_spec_flg);
			addColumnPathMap(CopyTgtR.$itm_spec_desc_flg, DtlR.$itm_spec_desc_flg);
			addColumnPathMap(CopyTgtR.$itm_comp_core_flg, DtlR.$itm_comp_core_flg);
			addColumnPathMap(CopyTgtR.$itm_comp_comp_flg, DtlR.$itm_comp_comp_flg);
			addColumnPathMap(CopyTgtR.$mps_itm_flg, DtlR.$mps_itm_flg);
			addColumnPathMap(CopyTgtR.$spln_itm_conf_flg, DtlR.$spln_itm_conf_flg);
			addColumnPathMap(CopyTgtR.$purc_ddlv_lt_flg, DtlR.$purc_ddlv_lt_flg);
			addColumnPathMap(CopyTgtR.$bp_itm_flg, DtlR.$bp_itm_flg);
			addColumnPathMap(CopyTgtR.$proc_upri_flg, DtlR.$proc_upri_flg);
			addColumnPathMap(CopyTgtR.$prov_upri_flg, DtlR.$prov_upri_flg);
			addColumnPathMap(CopyTgtR.$purc_upri_flg, DtlR.$purc_upri_flg);
			addColumnPathMap(CopyTgtR.$std_sls_upri_flg, DtlR.$std_sls_upri_flg);
			addColumnPathMap(CopyTgtR.$itm_sls_upri_flg, DtlR.$itm_sls_upri_flg);
			addColumnPathMap(CopyTgtR.$cst_sls_upri_flg, DtlR.$cst_sls_upri_flg);
			addColumnPathMap(CopyTgtR.$set_itm_main_flg, DtlR.$set_itm_main_flg);
			addColumnPathMap(CopyTgtR.$set_itm_set_flg, DtlR.$set_itm_set_flg);
			addColumnPathMap(CopyTgtR.$if_x_flg, DtlR.$if_x_flg);
			addColumnPathMap(CopyTgtR.$ctg_config_flg, DtlR.$ctg_config_flg);
			addColumnPathMap(CopyTgtR.$jnl_ptn_flg, DtlR.$jnl_ptn_flg);
			addColumnPathMap(CopyTgtR.$coef_config_flg, DtlR.$coef_config_flg);
			addColumnPathMap(CopyTgtR.$alc_expns_flg, DtlR.$alc_expns_flg);
			addColumnPathMap(CopyTgtR.$alc_inpt_flg, DtlR.$alc_inpt_flg);
			addColumnPathMap(CopyTgtR.$cost_itm_out_flg, DtlR.$cost_itm_out_flg);
			addColumnPathMap(CopyTgtR.$xpns_purc_alc_flg, DtlR.$xpns_purc_alc_flg);
			addColumnPathMap(CopyTgtR.$itm_lg_grp_flg, DtlR.$itm_lg_grp_flg);
			addColumnPathMap(CopyTgtR.$itm_str_ln_flg, DtlR.$itm_str_ln_flg);
		}
	}
	
	/**
	 * コピー対象 -> 明細
	 */
	protected Map_DtlR_CopyTgtR<DtlR,CopyTgtR> createMap_DtlR_CopyTgtR() {
		return new Map_DtlR_CopyTgtR<DtlR, CopyTgtR>();
	}

	public class Map_DtlR_CopyTgtR<D extends DtlR, S extends CopyTgtR> extends MCRowMapper<D,S>{

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$itm_flg, CopyTgtR.$itm_flg);
			addColumnPathMap(DtlR.$itm_sub_flg, CopyTgtR.$itm_sub_flg);
			addColumnPathMap(DtlR.$itm_unit_flg, CopyTgtR.$itm_unit_flg);
			addColumnPathMap(DtlR.$attach_info_flg, CopyTgtR.$attach_info_flg);
			addColumnPathMap(DtlR.$itm_stop_flg, CopyTgtR.$itm_stop_flg);
			addColumnPathMap(DtlR.$itm_not_fix_flg, CopyTgtR.$itm_not_fix_flg);
			addColumnPathMap(DtlR.$stdcost_flg, CopyTgtR.$stdcost_flg);
			addColumnPathMap(DtlR.$sundry_itm_flg, CopyTgtR.$sundry_itm_flg);
			addColumnPathMap(DtlR.$itm_strg_flg, CopyTgtR.$itm_strg_flg);
			addColumnPathMap(DtlR.$alloc_ctl_flg, CopyTgtR.$alloc_ctl_flg);
			addColumnPathMap(DtlR.$stk_rpl_flg, CopyTgtR.$stk_rpl_flg);
			addColumnPathMap(DtlR.$alt_itm_flg, CopyTgtR.$alt_itm_flg);
			addColumnPathMap(DtlR.$itm_wg_flg, CopyTgtR.$itm_wg_flg);
			addColumnPathMap(DtlR.$itm_dtl_flg, CopyTgtR.$itm_dtl_flg);
			addColumnPathMap(DtlR.$itm_oper_flg, CopyTgtR.$itm_oper_flg);
			addColumnPathMap(DtlR.$bom_par_flg, CopyTgtR.$bom_par_flg);
			addColumnPathMap(DtlR.$bom_chd_flg, CopyTgtR.$bom_chd_flg);
			addColumnPathMap(DtlR.$oper_wk_cost_flg, CopyTgtR.$oper_wk_cost_flg);
			addColumnPathMap(DtlR.$itm_insp_ptn_flg, CopyTgtR.$itm_insp_ptn_flg);
			addColumnPathMap(DtlR.$itm_insp_flg, CopyTgtR.$itm_insp_flg);
			addColumnPathMap(DtlR.$insp_spec_flg, CopyTgtR.$insp_spec_flg);
			addColumnPathMap(DtlR.$itm_site_flg, CopyTgtR.$itm_site_flg);
			addColumnPathMap(DtlR.$itm_ver_flg, CopyTgtR.$itm_ver_flg);
			addColumnPathMap(DtlR.$lot_inh_dest_flg, CopyTgtR.$lot_inh_dest_flg);
			addColumnPathMap(DtlR.$lot_inh_src_flg, CopyTgtR.$lot_inh_src_flg);
			addColumnPathMap(DtlR.$itm_spec_flg, CopyTgtR.$itm_spec_flg);
			addColumnPathMap(DtlR.$itm_spec_desc_flg, CopyTgtR.$itm_spec_desc_flg);
			addColumnPathMap(DtlR.$itm_comp_core_flg, CopyTgtR.$itm_comp_core_flg);
			addColumnPathMap(DtlR.$itm_comp_comp_flg, CopyTgtR.$itm_comp_comp_flg);
			addColumnPathMap(DtlR.$mps_itm_flg, CopyTgtR.$mps_itm_flg);
			addColumnPathMap(DtlR.$spln_itm_conf_flg, CopyTgtR.$spln_itm_conf_flg);
			addColumnPathMap(DtlR.$purc_ddlv_lt_flg, CopyTgtR.$purc_ddlv_lt_flg);
			addColumnPathMap(DtlR.$bp_itm_flg, CopyTgtR.$bp_itm_flg);
			addColumnPathMap(DtlR.$proc_upri_flg, CopyTgtR.$proc_upri_flg);
			addColumnPathMap(DtlR.$prov_upri_flg, CopyTgtR.$prov_upri_flg);
			addColumnPathMap(DtlR.$purc_upri_flg, CopyTgtR.$purc_upri_flg);
			addColumnPathMap(DtlR.$std_sls_upri_flg, CopyTgtR.$std_sls_upri_flg);
			addColumnPathMap(DtlR.$itm_sls_upri_flg, CopyTgtR.$itm_sls_upri_flg);
			addColumnPathMap(DtlR.$cst_sls_upri_flg, CopyTgtR.$cst_sls_upri_flg);
			addColumnPathMap(DtlR.$set_itm_main_flg, CopyTgtR.$set_itm_main_flg);
			addColumnPathMap(DtlR.$set_itm_set_flg, CopyTgtR.$set_itm_set_flg);
			addColumnPathMap(DtlR.$if_x_flg, CopyTgtR.$if_x_flg);
			addColumnPathMap(DtlR.$ctg_config_flg, CopyTgtR.$ctg_config_flg);
			addColumnPathMap(DtlR.$jnl_ptn_flg, CopyTgtR.$jnl_ptn_flg);
			addColumnPathMap(DtlR.$coef_config_flg, CopyTgtR.$coef_config_flg);
			addColumnPathMap(DtlR.$alc_expns_flg, CopyTgtR.$alc_expns_flg);
			addColumnPathMap(DtlR.$alc_inpt_flg, CopyTgtR.$alc_inpt_flg);
			addColumnPathMap(DtlR.$cost_itm_out_flg, CopyTgtR.$cost_itm_out_flg);
			addColumnPathMap(DtlR.$xpns_purc_alc_flg, CopyTgtR.$xpns_purc_alc_flg);
			addColumnPathMap(DtlR.$itm_lg_grp_flg, CopyTgtR.$itm_lg_grp_flg);
			addColumnPathMap(DtlR.$itm_str_ln_flg, CopyTgtR.$itm_str_ln_flg);
		}
	}
	
	@Override
	public void doDtl_dest_itm_cd_LC(MCEventInfo info) {
		super.doDtl_dest_itm_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNullOrNullVal(r.dest_itm_cd())) {
			setValueEx(columnDtl_dest_itm_sub1, idx, null);
		}
	}
	
	@Override
	public void doDtl_dest_itm_sub1_LC(MCEventInfo info) {
		super.doDtl_dest_itm_sub1_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNullOrNullVal(r.dest_itm_sub1())) {
			setValueEx(columnDtl_dest_itm_sub2, idx, null);
		}
	}
	
	@Override
	public void doDtl_dest_itm_sub2_LC(MCEventInfo info) {
		super.doDtl_dest_itm_sub2_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNullOrNullVal(r.dest_itm_sub2())) {
			setValueEx(columnDtl_dest_itm_sub3, idx, null);
		}
	}
	
	//-------------------- セルコンフィグここから --------------------//
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createItmCopyTableCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return　品目系マスタ確認＆コピー用のセルコンフィグ
	 */
	protected ItmCopyTableCellConfig createItmCopyTableCellConfig() {
		return new ItmCopyTableCellConfig(this);
	}
	
	/**
	 * 品目系マスタ確認＆コピー用のセルコンフィグクラス
	 */
	protected class ItmCopyTableCellConfig extends MAUDP_RLBaseCellConfig {
		
		public ItmCopyTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				
				if (column == columnDtl_dest_itm_sub1) {
					if (isNullOrNullVal(r.dest_itm_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_dest_itm_sub2) {
					if (isNullOrNullVal(r.dest_itm_sub1())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_dest_itm_sub3) {
					if (isNullOrNullVal(r.dest_itm_sub2())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	//-------------------- セルコンフィグここまで --------------------//

}