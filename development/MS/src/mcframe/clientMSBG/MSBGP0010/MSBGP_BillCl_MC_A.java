package mcframe.clientMSBG.MSBGP0010;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMSBG.MSBGP0010.MSBGP_BillCl_MC.MS_MSBGL0010_Srch01Caller;
import mcframe.clientMSBG.MSBGP0010.MSBGP_BillCl_MC.MS_MSBGL0010_Srch02Caller;
import mcframe.clientMSBG.MSBGP0010.MSBGP_BillCl_MC.MS_MSBGL0010_Upd01Caller;
import mcframe.clientMSBG.MSBGP0010.MSBGP_BillCl_MC.MS_MSBGL0010_Del01Caller;

/**
 * 画面"MSBGP_BillCl"パネルクラスです。<p>
 *
 * マニュアルで請求締、請求締解除する。また、請求書を発行します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_BillCl_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBGP0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Closing,0;DEL,Release closing,1 UPD,締処理,0;DEL,締解除,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public MCCheckBox Cnd_on_edi_flg = null;
	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_off_edi_flg = null;
	public MCLabel Cnd_bill_ym_Label = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDateField Cnd_bill_ym = null;
	public MCLabel Cnd_bill_cl_day_Label = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumberField Cnd_bill_cl_day = null;
	public MCLabel Cnd_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Cnd_bcst_nm = null;
	public MCLabel Cnd_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField Cnd_bill_dpt_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_base_cur_cd = null;
	/**
	 * Billing exchange rate cd. 請求為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bill_xrate_cd = null;
	public MCLabel Cnd_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_no = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrkno_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrkno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrkno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	/**
	 * Manual closing day マニュアル締日.<p>
	 *
	 */
	public MCCheckBox Cnd_manual_flg = null;
	/**
	 * Select manual マニュアル選択.<p>
	 *
	 */
	public MCCheckBox Cnd_sel_flg = null;
	/**
	 * Each time sales 売上都度.<p>
	 *
	 */
	public MCCheckBox Cnd_each_sls_flg = null;
	/**
	 * Batch closing day バッチ締日.<p>
	 *
	 */
	public MCCheckBox Cnd_batch_flg = null;
	/**
	 * Display latest only 最新のみ表示.<p>
	 *
	 */
	public MCCheckBox Cnd_new_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCScrollPane HdrScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0010.HdrR> HdrTable = null;
	// [Hdr]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnHdr_check = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_no = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_dpt_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_wg_nm = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bcst_nm = null;
	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public MCColumnConfig columnHdr_edi_flg = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_ym = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_cl_day = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnHdr_rcv_schd_dt = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_trd_cur_nm = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Hdr_billXrate_p_PPanel;
	public MCColumnConfig columnHdr_bill_xrate;// [Hdr]の[billXrate_p.xrate]を[columnHdr_bill_xrate]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Hdr_wrkno_p_PPanel;
	public MCColumnConfig columnHdr_wrk_no;// [Hdr]の[wrkno_p.wrk_no]を[columnHdr_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnHdr_wrk_nm;// [Hdr]の[wrkno_p.wrk_nm]を[columnHdr_wrk_nm]としてエイリアス定義。
	/**
	 * Details selected 明細選択済.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_d_sel_flg = null;
	/**
	 * Last billing month 前回請求年月.<p>
	 *
	 */
	public MCColumnConfig columnHdr_last_bill_ym = null;
	/**
	 * Last billing closing day 前回請求締日.<p>
	 *
	 */
	public MCColumnConfig columnHdr_last_bill_cl_day = null;
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_cl_typ = null;
	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_cl_typ_nm = null;
	/**
	 * Invoice unit tax 請求書単位税.<p>
	 *
	 */
	public MCColumnConfig columnHdr_tax_on_bill_flg = null;
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCColumnConfig columnHdr_base_dt = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Hdr_rtnMsg_p_PPanel;
	public MCColumnConfig columnHdr_rtn_sts_typ;// [Hdr]の[rtnMsg_p.rtn_sts_typ]を[columnHdr_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnHdr_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnHdr_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnHdr_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_upd_srv_req_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_iv_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_upd_cntr = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnHdr_bill_mng_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select billing details 請求明細選択.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0020 = null;
	/**
	 * Billing list 請求一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0030 = null;
	/**
	 * Payment receipt schedule adjustment 入金予定調整.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0080 = null;
	/**
	 * Correction of sales details 売上明細訂正.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1370 = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd1 = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd2 = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
	// [TabSrch]ブロック関連のField定義
	public MCPanel TabSrchPanel = null;
	// [TabSrch]ブロックの項目のField定義
	// [Edi]ブロック関連のField定義
	public MCPanel EdiPanel = null;
	public MCTitledBorder EdiTitledBorder = null;
	// [Edi]ブロックの項目のField定義
	/** [SRCH_U]モードを表す定数 */
	public static final String SRCH_U = "SRCH_U";
	/** [SRCH_D]モードを表す定数 */
	public static final String SRCH_D = "SRCH_D";
	/** [UPD_U]モードを表す定数 */
	public static final String UPD_U = "UPD_U";
	/** [UPD_D]モードを表す定数 */
	public static final String UPD_D = "UPD_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_U, SRCH_D, UPD_U, UPD_D};
	
	/** [MS_MSBGL0010_Srch01]のCallerの作成 */
	protected MSBGP_BillCl_MC.MS_MSBGL0010_Srch01Caller createMS_MSBGL0010_Srch01() {
		MSBGP_BillCl_MC.MS_MSBGL0010_Srch01Caller<MSBGP_BillCl, MS_MSBGL0010_Srch01Bridge>
		caller = ((MSBGP_BillCl_MC)this).new MS_MSBGL0010_Srch01Caller<MSBGP_BillCl, MS_MSBGL0010_Srch01Bridge>(
					(MSBGP_BillCl)this, new MS_MSBGL0010_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0010_Srch01]の呼び出し */
	protected void callMS_MSBGL0010_Srch01() {
		MCCaller caller = createMS_MSBGL0010_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0010_Srch02]のCallerの作成 */
	protected MSBGP_BillCl_MC.MS_MSBGL0010_Srch02Caller createMS_MSBGL0010_Srch02() {
		MSBGP_BillCl_MC.MS_MSBGL0010_Srch02Caller<MSBGP_BillCl, MS_MSBGL0010_Srch02Bridge>
		caller = ((MSBGP_BillCl_MC)this).new MS_MSBGL0010_Srch02Caller<MSBGP_BillCl, MS_MSBGL0010_Srch02Bridge>(
					(MSBGP_BillCl)this, new MS_MSBGL0010_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBGL0010_Srch02]の呼び出し */
	protected void callMS_MSBGL0010_Srch02() {
		MCCaller caller = createMS_MSBGL0010_Srch02();
		caller.exec();
	}
	/** [MS_MSBGL0010_Upd01]のCallerの作成 */
	protected MSBGP_BillCl_MC.MS_MSBGL0010_Upd01Caller createMS_MSBGL0010_Upd01() {
		MSBGP_BillCl_MC.MS_MSBGL0010_Upd01Caller<MSBGP_BillCl, MS_MSBGL0010_Upd01Bridge>
		caller = ((MSBGP_BillCl_MC)this).new MS_MSBGL0010_Upd01Caller<MSBGP_BillCl, MS_MSBGL0010_Upd01Bridge>(
					(MSBGP_BillCl)this, new MS_MSBGL0010_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0010_Upd01]の呼び出し */
	protected void callMS_MSBGL0010_Upd01() {
		MCCaller caller = createMS_MSBGL0010_Upd01();
		caller.exec();
	}
	/** [MS_MSBGL0010_Del01]のCallerの作成 */
	protected MSBGP_BillCl_MC.MS_MSBGL0010_Del01Caller createMS_MSBGL0010_Del01() {
		MSBGP_BillCl_MC.MS_MSBGL0010_Del01Caller<MSBGP_BillCl, MS_MSBGL0010_Del01Bridge>
		caller = ((MSBGP_BillCl_MC)this).new MS_MSBGL0010_Del01Caller<MSBGP_BillCl, MS_MSBGL0010_Del01Bridge>(
					(MSBGP_BillCl)this, new MS_MSBGL0010_Del01Bridge());
		return caller;
	}
	/** [MS_MSBGL0010_Del01]の呼び出し */
	protected void callMS_MSBGL0010_Del01() {
		MCCaller caller = createMS_MSBGL0010_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0010.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0010.HdrR> aHdrL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0010.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0010.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0010.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0010.CndR.create();
	}

	/**
	 * コピーによってaHdrLを設定します。
	 *
	 * aHdrLのインスタンスは変更されません。
	 *
	 * @param dataset HdrL
	 */
	public void setHdrL(MCList<mcframe.clientMSBG.MSBGP0010.HdrR> aList) {
		if (getHdrL() != aList) {
			getHdrL().setAll(aList);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrLを返します。
	 *
	 * @return HdrL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0010.HdrR> getHdrL() {
		return aHdrL;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0010.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0010.HdrR.create();
	}

	/**
	 * aHdrLを作成します。
	 *
	 * @return HdrL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0010.HdrR> createHdrL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class);
	}

	/**
	 * HdrTableを初期化します。
	 */
	protected void createHdrTable(){
		if(HdrTable == null){
			HdrTable = beansFactory.createTable2("Hdr.table");
		}
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBG.MSBGP0010.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0010.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBG.MSBGP0010.DtlR createDtlR() {
		return mcframe.clientMSBG.MSBGP0010.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0010.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0010.DtlR.class);
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBG.MSBGP0010.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0010.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0010.BtnR createBtnR() {
		return mcframe.clientMSBG.MSBGP0010.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrL())) ret.add(getHdrL());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrL()) return "Hdr";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getBtnR()) return "Btn";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrL();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Btn")) return getBtnR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(HdrPanel);
		ret.add(BtnPanel);
		ret.add(TabSrchPanel);
		ret.add(EdiPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillCl_MC_A() {
		aCndR = createCndR();
		aHdrL = createHdrL();
		aDtlL = createDtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_BillCl_MC_A(String name) {
		aCndR = createCndR();
		aHdrL = createHdrL();
		createHdrTable();
		HdrTable.setRowName(name);
		aDtlL = createDtlL();
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_BillCl_MC.jbCreateScreenOpe((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbCreateTop((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbCreateFold((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbCreateCnd((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbCreateCtrl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbCreateHdr((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbCreateBtn((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbCreateTabSrch((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbCreateEdi((MSBGP_BillCl)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_BillCl p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_BillCl p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_BillCl p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_BillCl p) {
		p.Cnd_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrkno_p());
		p.Cnd_wrkno_p_PPanel.setName("Cnd.wrkno_p");
		p.Cnd_wrk_no = p.Cnd_wrkno_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrkno_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBGP_BillCl p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_BillCl p) {
		p.Hdr_billXrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBG.MSBGP0010.HdrR.$billXrate_p);
		p.Hdr_billXrate_p_PPanel.setName("Hdr.billXrate_p");
		p.columnHdr_bill_xrate = p.Hdr_billXrate_p_PPanel.columnXrate_xrate;
		p.columnHdr_bill_xrate.addAliasName("Hdr.bill_xrate", p);
		p.Hdr_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBG.MSBGP0010.HdrR.$wrkno_p);
		p.Hdr_wrkno_p_PPanel.setName("Hdr.wrkno_p");
		p.columnHdr_wrk_no = p.Hdr_wrkno_p_PPanel.columnWrkNo_wrk_no;
		p.columnHdr_wrk_no.addAliasName("Hdr.wrk_no", p);
		p.columnHdr_wrk_nm = p.Hdr_wrkno_p_PPanel.columnWrkNo_wrk_nm;
		p.columnHdr_wrk_nm.addAliasName("Hdr.wrk_nm", p);
		p.Hdr_rtnMsg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBG.MSBGP0010.HdrR.$rtnMsg_p);
		p.Hdr_rtnMsg_p_PPanel.setName("Hdr.rtnMsg_p");
		p.columnHdr_rtn_sts_typ = p.Hdr_rtnMsg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnHdr_rtn_sts_typ.addAliasName("Hdr.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_BillCl p) {
	}

	/**
	 * [TabSrch]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTabSrch(MSBGP_BillCl p) {
	}

	/**
	 * [Edi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEdi(MSBGP_BillCl p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Cnd_bcst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bcst_cd_p = null;

	/**
	 * [Cnd_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bcst_cd_ListPutter() {
		if (Cnd_bcst_cd_p == null) {
			Cnd_bcst_cd_p = createCnd_bcst_cd_ListPutter(Cnd_bcst_cd, "bcst_cd", "bcst_nm");

		}
		return Cnd_bcst_cd_p;
	}
	
	
	/** [Cnd_bill_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bill_dpt_cd_p = null;

	/**
	 * [Cnd_bill_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bill_dpt_cd_ListPutter() {
		if (Cnd_bill_dpt_cd_p == null) {
			Cnd_bill_dpt_cd_p = createCnd_bill_dpt_cd_ListPutter(Cnd_bill_dpt_cd, "bill_dpt_cd", "bill_dpt_nm");

		}
		return Cnd_bill_dpt_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	
	
	/** [Cnd_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cur_cd_p = null;

	/**
	 * [Cnd_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cur_cd_ListPutter() {
		if (Cnd_trd_cur_cd_p == null) {
			Cnd_trd_cur_cd_p = createCnd_trd_cur_cd_ListPutter(Cnd_trd_cur_cd, "trd_cur_cd", "trd_cur_nm");

		}
		return Cnd_trd_cur_cd_p;
	}
	
	
	/** [Hdr_bill_cl_day_ListPutter]の定義 */
	private MCListPutter Hdr_bill_cl_day_p = null;

	/**
	 * [Hdr_bill_cl_day_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_cl_day_ListPutter() {
		if (Hdr_bill_cl_day_p == null) {
			Hdr_bill_cl_day_p = createHdr_bill_cl_day_ListPutter(columnHdr_bill_cl_day, "bill_cl_day");

		}
		return Hdr_bill_cl_day_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillCl create(){
		MSBGP_BillCl p = new MSBGP_BillCl();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillCl create(String name){
		MSBGP_BillCl p = new MSBGP_BillCl(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MSBGP_BillCl_MC.jbfInitScreenOpe((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbfInitTop((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbfInitFold((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbfInitCnd((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbfInitCtrl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbfInitHdr((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbfInitBtn((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbfInitTabSrch((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbfInitEdi((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitScreenOpe((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitTop((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitFold((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitCnd((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitCtrl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitHdr((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitBtn((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitTabSrch((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.jbInitEdi((MSBGP_BillCl)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_on_edi_flg = p.beansFactory.createCheckBox("Cnd.on_edi_flg");
		p.Cnd_off_edi_flg = p.beansFactory.createCheckBox("Cnd.off_edi_flg");
		p.Cnd_bill_ym_Label = p.beansFactory.createLabel("Cnd.bill_ym_Label");
		p.Cnd_bill_ym = p.beansFactory.createDateField("Cnd.bill_ym");
		p.Cnd_bill_ym.setLabel(p.Cnd_bill_ym_Label);
		p.Cnd_bill_cl_day_Label = p.beansFactory.createLabel("Cnd.bill_cl_day_Label");
		p.Cnd_bill_cl_day = p.beansFactory.createNumberField("Cnd.bill_cl_day");
		p.Cnd_bill_cl_day.setLabel(p.Cnd_bill_cl_day_Label);
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_base_cur_cd = p.beansFactory.createTextField("Cnd.base_cur_cd");
		p.Cnd_bill_xrate_cd = p.beansFactory.createTextField("Cnd.bill_xrate_cd");
		p.Cnd_bill_no_Label = p.beansFactory.createLabel("Cnd.bill_no_Label");
		p.Cnd_bill_no = p.beansFactory.createTextField("Cnd.bill_no");
		p.Cnd_bill_no.setLabel(p.Cnd_bill_no_Label);
		p.Cnd_manual_flg = p.beansFactory.createCheckBox("Cnd.manual_flg");
		p.Cnd_sel_flg = p.beansFactory.createCheckBox("Cnd.sel_flg");
		p.Cnd_each_sls_flg = p.beansFactory.createCheckBox("Cnd.each_sls_flg");
		p.Cnd_batch_flg = p.beansFactory.createCheckBox("Cnd.batch_flg");
		p.Cnd_new_flg = p.beansFactory.createCheckBox("Cnd.new_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrScrollPane = p.beansFactory.createScrollPane("Hdr.scroll");
		p.createHdrTable();
		// ブロックの項目の初期化
		p.columnHdr_check = p.beansFactory.createTableColumn("Hdr.check", MCColumnType.CHECK);
		p.columnHdr_bill_no = p.beansFactory.createTableColumn("Hdr.bill_no", MCColumnType.TEXT);
		p.columnHdr_bill_dpt_cd = p.beansFactory.createTableColumn("Hdr.bill_dpt_cd", MCColumnType.TEXT);
		p.columnHdr_bill_dpt_nm = p.beansFactory.createTableColumn("Hdr.bill_dpt_nm", MCColumnType.TEXT);
		p.columnHdr_wg_cd = p.beansFactory.createTableColumn("Hdr.wg_cd", MCColumnType.TEXT);
		p.columnHdr_wg_nm = p.beansFactory.createTableColumn("Hdr.wg_nm", MCColumnType.TEXT);
		p.columnHdr_bcst_cd = p.beansFactory.createTableColumn("Hdr.bcst_cd", MCColumnType.TEXT);
		p.columnHdr_bcst_nm = p.beansFactory.createTableColumn("Hdr.bcst_nm", MCColumnType.TEXT);
		p.columnHdr_edi_flg = p.beansFactory.createTableColumn("Hdr.edi_flg", MCColumnType.CHECK);
		p.columnHdr_bill_ym = p.beansFactory.createTableColumn("Hdr.bill_ym", MCColumnType.DATE);
		p.columnHdr_bill_cl_day = p.beansFactory.createTableColumn("Hdr.bill_cl_day", MCColumnType.NUMBER_COMBO);
		p.columnHdr_rcv_schd_dt = p.beansFactory.createTableColumn("Hdr.rcv_schd_dt", MCColumnType.DATE);
		p.columnHdr_trd_cur_cd = p.beansFactory.createTableColumn("Hdr.trd_cur_cd", MCColumnType.TEXT);
		p.columnHdr_trd_cur_nm = p.beansFactory.createTableColumn("Hdr.trd_cur_nm", MCColumnType.TEXT);
		p.columnHdr_bill_d_sel_flg = p.beansFactory.createTableColumn("Hdr.bill_d_sel_flg", MCColumnType.CHECK);
		p.columnHdr_last_bill_ym = p.beansFactory.createTableColumn("Hdr.last_bill_ym", MCColumnType.DATE);
		p.columnHdr_last_bill_cl_day = p.beansFactory.createTableColumn("Hdr.last_bill_cl_day", MCColumnType.NUMBER);
		p.columnHdr_bill_cl_typ = p.beansFactory.createTableColumn("Hdr.bill_cl_typ", MCColumnType.TEXT);
		p.columnHdr_bill_cl_typ_nm = p.beansFactory.createTableColumn("Hdr.bill_cl_typ_nm", MCColumnType.TEXT);
		p.columnHdr_tax_on_bill_flg = p.beansFactory.createTableColumn("Hdr.tax_on_bill_flg", MCColumnType.CHECK);
		p.columnHdr_base_dt = p.beansFactory.createTableColumn("Hdr.base_dt", MCColumnType.DATE);
		p.columnHdr_ins_usr_id = p.beansFactory.createTableColumn("Hdr.ins_usr_id", MCColumnType.TEXT);
		p.columnHdr_ins_usr_nm = p.beansFactory.createTableColumn("Hdr.ins_usr_nm", MCColumnType.TEXT);
		p.columnHdr_ins_func_id = p.beansFactory.createTableColumn("Hdr.ins_func_id", MCColumnType.TEXT);
		p.columnHdr_ins_func_nm = p.beansFactory.createTableColumn("Hdr.ins_func_nm", MCColumnType.TEXT);
		p.columnHdr_ins_ts = p.beansFactory.createTableColumn("Hdr.ins_ts", MCColumnType.TIMESTAMP);
		p.columnHdr_upd_usr_id = p.beansFactory.createTableColumn("Hdr.upd_usr_id", MCColumnType.TEXT);
		p.columnHdr_upd_usr_nm = p.beansFactory.createTableColumn("Hdr.upd_usr_nm", MCColumnType.TEXT);
		p.columnHdr_upd_func_id = p.beansFactory.createTableColumn("Hdr.upd_func_id", MCColumnType.TEXT);
		p.columnHdr_upd_func_nm = p.beansFactory.createTableColumn("Hdr.upd_func_nm", MCColumnType.TEXT);
		p.columnHdr_upd_ts = p.beansFactory.createTableColumn("Hdr.upd_ts", MCColumnType.TIMESTAMP);
		p.columnHdr_upd_srv_req_no = p.beansFactory.createTableColumn("Hdr.upd_srv_req_no", MCColumnType.TEXT);
		p.columnHdr_iv_no = p.beansFactory.createTableColumn("Hdr.iv_no", MCColumnType.TEXT);
		p.columnHdr_upd_cntr = p.beansFactory.createTableColumn("Hdr.upd_cntr", MCColumnType.NUMBER);
		p.columnHdr_bill_mng_no = p.beansFactory.createTableColumn("Hdr.bill_mng_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0020 = p.beansFactory.createButton("Btn.open_MSBGP0020", "open");
		p.Btn_open_MSBGP0030 = p.beansFactory.createButton("Btn.open_MSBGP0030", "open");
		p.Btn_open_MSBGP0080 = p.beansFactory.createButton("Btn.open_MSBGP0080", "open");
		p.Btn_open_MSBBP1370 = p.beansFactory.createButton("Btn.open_MSBBP1370", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd1 = p.beansFactory.createButton("Btn.upd1", "upd");
		p.Btn_upd2 = p.beansFactory.createButton("Btn.upd2", "upd");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [TabSrch]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTabSrch(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.TabSrchPanel = p.beansFactory.createPanel("TabSrch");
		// ブロックの項目の初期化
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEdi(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.EdiPanel = p.beansFactory.createPanel("Edi");
		p.EdiTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.HdrPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.TabSrchPanel, "Fold.tabSrch");
		p.FoldTab.setLastBeans(p.TabSrchPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.ope_META);
		p.EdiPanel.add(p.Cnd_on_edi_flg);
		p.EdiPanel.setLastBeans(p.Cnd_on_edi_flg);
		p.Cnd_on_edi_flg.setNextBeans(p.Cnd_off_edi_flg);
		p.Cnd_on_edi_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.on_edi_flg_META);
		p.EdiPanel.add(p.Cnd_off_edi_flg);
		p.Cnd_off_edi_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.off_edi_flg_META);
		p.CndPanel.add(p.Cnd_bill_ym_Label);
		p.CndPanel.add(p.Cnd_bill_ym);
		p.CndPanel.setLastBeans(p.Cnd_bill_ym);
		p.Cnd_bill_ym.setNextBeans(p.Cnd_bill_cl_day);
		p.Cnd_bill_ym.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.bill_ym_META);
		p.Cnd_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_bill_cl_day_Label);
		p.CndPanel.add(p.Cnd_bill_cl_day);
		p.Cnd_bill_cl_day.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_bill_cl_day.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.bill_cl_day_META);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_cd, true);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_nm, true);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.bill_dpt_cd_META);
		p.Cnd_bill_dpt_cd.addLinkBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.bill_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_base_cur_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_base_cur_cd);
		p.Cnd_base_cur_cd.setNextBeans(p.Cnd_bill_xrate_cd);
		p.Cnd_base_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.base_cur_cd_META);
		p.CndPanel.add(p.Cnd_bill_xrate_cd);
		p.Cnd_bill_xrate_cd.setNextBeans(p.Cnd_bill_no);
		p.Cnd_bill_xrate_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.bill_xrate_cd_META);
		p.CndPanel.add(p.Cnd_bill_no_Label);
		p.CndPanel.add(p.Cnd_bill_no);
		p.Cnd_bill_no.setNextBeans(p.Cnd_wrkno_p_PPanel);
		p.Cnd_bill_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.bill_no_META);
		p.setPluralValueEnable(p.Cnd_bill_no, true);
		p.CndPanel.add(p.Cnd_wrkno_p_PPanel);
		p.Cnd_wrkno_p_PPanel.setNextBeans(p.Cnd_manual_flg);
		p.CndPanel.add(p.Cnd_manual_flg);
		p.Cnd_manual_flg.setNextBeans(p.Cnd_sel_flg);
		p.Cnd_manual_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.manual_flg_META);
		p.CndPanel.add(p.Cnd_sel_flg);
		p.Cnd_sel_flg.setNextBeans(p.Cnd_each_sls_flg);
		p.Cnd_sel_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.sel_flg_META);
		p.CndPanel.add(p.Cnd_each_sls_flg);
		p.Cnd_each_sls_flg.setNextBeans(p.Cnd_batch_flg);
		p.Cnd_each_sls_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.each_sls_flg_META);
		p.CndPanel.add(p.Cnd_batch_flg);
		p.Cnd_batch_flg.setNextBeans(p.Cnd_new_flg);
		p.Cnd_batch_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.batch_flg_META);
		p.CndPanel.add(p.Cnd_new_flg);
		p.Cnd_new_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0010.CndR.new_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.BtnPanel);
		p.HdrPanel.add(p.HdrScrollPane);
		p.HdrPanel.setLastBeans(p.HdrTable);
		p.HdrScrollPane.setViewportView(p.HdrTable);
		p.HdrTable.setList(p.getHdrL());
		p.HdrTable.setStatusColumnVisible(false);
		p.HdrPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0020.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0020);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0020);
		p.Btn_open_MSBGP0020.setNextBeans(p.Btn_open_MSBGP0030);
		p.Btn_open_MSBGP0030.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBGP0030);
		p.Btn_open_MSBGP0030.setNextBeans(p.Btn_open_MSBGP0080);
		p.Btn_open_MSBGP0080.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBGP0080);
		p.Btn_open_MSBGP0080.setNextBeans(p.Btn_open_MSBBP1370);
		p.Btn_open_MSBBP1370.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBBP1370);
		p.Btn_open_MSBBP1370.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd1);
		p.Btn_upd1.setIcon("REGISTER");
		p.Btn_upd1.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd1);
		p.Btn_upd1.setNextBeans(p.Btn_upd2);
		p.Btn_upd2.setIcon("REGISTER");
		p.Btn_upd2.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd2);
		p.Btn_upd2.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBG.MSBGP0010.BtnR.indiv_prnt_flg_META);
	}

	/**
	 * [TabSrch]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTabSrch(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.TabSrchPanel.setValueCheck(false);
		p.TabSrchPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TabSrchPanel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.TabSrchPanel.add(p.EdiPanel, null);
		p.TabSrchPanel.setLastBeans(p.EdiPanel);
		p.EdiPanel.setNextBeans(p.CndPanel);
		p.TabSrchPanel.add(p.CndPanel, null);
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEdi(MSBGP_BillCl p) {
		// ブロック関連の初期化
		p.EdiPanel.setBorder(p.EdiTitledBorder);
		p.EdiPanel.setValueCheck(false);
		p.EdiPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.EdiPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBGP_BillCl_MC.mcInitScreenOpe((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.mcInitTop((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.mcInitFold((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.mcInitCnd((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.mcInitCtrl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.mcInitHdr((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.mcInitBtn((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.mcInitTabSrch((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.mcInitEdi((MSBGP_BillCl)this);

		// [SRCH_U]ステータスのモードの設定
		MSBGP_BillCl_MC.statusInitSRCH__U_ScreenOpe((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_Top((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_Fold((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_Cnd((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_Ctrl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_Hdr((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_Dtl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_Btn((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_TabSrch((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__U_Edi((MSBGP_BillCl)this);

		// [SRCH_D]ステータスのモードの設定
		MSBGP_BillCl_MC.statusInitSRCH__D_ScreenOpe((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_Top((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_Fold((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_Cnd((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_Ctrl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_Hdr((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_Dtl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_Btn((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_TabSrch((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitSRCH__D_Edi((MSBGP_BillCl)this);

		// [UPD_U]ステータスのモードの設定
		MSBGP_BillCl_MC.statusInitUPD__U_ScreenOpe((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_Top((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_Fold((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_Cnd((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_Ctrl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_Hdr((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_Dtl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_Btn((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_TabSrch((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__U_Edi((MSBGP_BillCl)this);

		// [UPD_D]ステータスのモードの設定
		MSBGP_BillCl_MC.statusInitUPD__D_ScreenOpe((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_Top((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_Fold((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_Cnd((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_Ctrl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_Hdr((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_Dtl((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_Btn((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_TabSrch((MSBGP_BillCl)this);
		MSBGP_BillCl_MC.statusInitUPD__D_Edi((MSBGP_BillCl)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_BillCl p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_BillCl p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_BillCl p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_BillCl p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_on_edi_flg.addAllListener(p);
		p.Cnd_off_edi_flg.addAllListener(p);
		p.Cnd_bill_ym.setListListener(p);
		p.Cnd_bill_ym.addAllListener(p);
		p.Cnd_bill_cl_day.setListListener(p);
		p.Cnd_bill_cl_day.addAllListener(p);
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_base_cur_cd.setListListener(p);
		p.Cnd_base_cur_cd.addAllListener(p);
		p.Cnd_bill_xrate_cd.setListListener(p);
		p.Cnd_bill_xrate_cd.addAllListener(p);
		p.Cnd_bill_no.setListListener(p);
		p.Cnd_bill_no.addAllListener(p);
		p.Cnd_manual_flg.addAllListener(p);
		p.Cnd_sel_flg.addAllListener(p);
		p.Cnd_each_sls_flg.addAllListener(p);
		p.Cnd_batch_flg.addAllListener(p);
		p.Cnd_new_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_BillCl p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_BillCl p) {
		p.HdrTable.addAllListener(p);
		p.columnHdr_check.addAllListener(p);
		p.columnHdr_bill_no.addAllListener(p);
		p.columnHdr_bill_no.setListListener(p);
		p.columnHdr_bill_dpt_cd.addAllListener(p);
		p.columnHdr_bill_dpt_cd.setListListener(p);
		p.columnHdr_bill_dpt_nm.addAllListener(p);
		p.columnHdr_bill_dpt_nm.setListListener(p);
		p.columnHdr_wg_cd.addAllListener(p);
		p.columnHdr_wg_cd.setListListener(p);
		p.columnHdr_wg_nm.addAllListener(p);
		p.columnHdr_wg_nm.setListListener(p);
		p.columnHdr_bcst_cd.addAllListener(p);
		p.columnHdr_bcst_cd.setListListener(p);
		p.columnHdr_bcst_nm.addAllListener(p);
		p.columnHdr_bcst_nm.setListListener(p);
		p.columnHdr_edi_flg.addAllListener(p);
		p.columnHdr_bill_ym.addAllListener(p);
		p.columnHdr_bill_ym.setListListener(p);
		p.columnHdr_bill_cl_day.addAllListener(p);
		p.columnHdr_bill_cl_day.setListListener(p);
		p.columnHdr_rcv_schd_dt.addAllListener(p);
		p.columnHdr_rcv_schd_dt.setListListener(p);
		p.columnHdr_trd_cur_cd.addAllListener(p);
		p.columnHdr_trd_cur_cd.setListListener(p);
		p.columnHdr_trd_cur_nm.addAllListener(p);
		p.columnHdr_trd_cur_nm.setListListener(p);
		p.columnHdr_bill_d_sel_flg.addAllListener(p);
		p.columnHdr_last_bill_ym.addAllListener(p);
		p.columnHdr_last_bill_ym.setListListener(p);
		p.columnHdr_last_bill_cl_day.addAllListener(p);
		p.columnHdr_last_bill_cl_day.setListListener(p);
		p.columnHdr_bill_cl_typ.addAllListener(p);
		p.columnHdr_bill_cl_typ.setListListener(p);
		p.columnHdr_bill_cl_typ_nm.addAllListener(p);
		p.columnHdr_bill_cl_typ_nm.setListListener(p);
		p.columnHdr_tax_on_bill_flg.addAllListener(p);
		p.columnHdr_base_dt.addAllListener(p);
		p.columnHdr_base_dt.setListListener(p);
		p.columnHdr_ins_usr_id.addAllListener(p);
		p.columnHdr_ins_usr_id.setListListener(p);
		p.columnHdr_ins_usr_nm.addAllListener(p);
		p.columnHdr_ins_usr_nm.setListListener(p);
		p.columnHdr_ins_func_id.addAllListener(p);
		p.columnHdr_ins_func_id.setListListener(p);
		p.columnHdr_ins_func_nm.addAllListener(p);
		p.columnHdr_ins_func_nm.setListListener(p);
		p.columnHdr_ins_ts.addAllListener(p);
		p.columnHdr_ins_ts.setListListener(p);
		p.columnHdr_upd_usr_id.addAllListener(p);
		p.columnHdr_upd_usr_id.setListListener(p);
		p.columnHdr_upd_usr_nm.addAllListener(p);
		p.columnHdr_upd_usr_nm.setListListener(p);
		p.columnHdr_upd_func_id.addAllListener(p);
		p.columnHdr_upd_func_id.setListListener(p);
		p.columnHdr_upd_func_nm.addAllListener(p);
		p.columnHdr_upd_func_nm.setListListener(p);
		p.columnHdr_upd_ts.addAllListener(p);
		p.columnHdr_upd_ts.setListListener(p);
		p.columnHdr_upd_srv_req_no.addAllListener(p);
		p.columnHdr_upd_srv_req_no.setListListener(p);
		p.columnHdr_iv_no.addAllListener(p);
		p.columnHdr_iv_no.setListListener(p);
		p.columnHdr_upd_cntr.addAllListener(p);
		p.columnHdr_upd_cntr.setListListener(p);
		p.columnHdr_bill_mng_no.addAllListener(p);
		p.columnHdr_bill_mng_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_BillCl p) {
		p.Btn_open_MSBGP0020.addAllListener(p);
		p.Btn_open_MSBGP0020.setAPMethodName("doBtn_open_MSBGP0020");
		p.Btn_open_MSBGP0030.addAllListener(p);
		p.Btn_open_MSBGP0030.setAPMethodName("doBtn_open_MSBGP0030");
		p.Btn_open_MSBGP0080.addAllListener(p);
		p.Btn_open_MSBGP0080.setAPMethodName("doBtn_open_MSBGP0080");
		p.Btn_open_MSBBP1370.addAllListener(p);
		p.Btn_open_MSBBP1370.setAPMethodName("doBtn_open_MSBBP1370");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd1.addAllListener(p);
		p.Btn_upd1.setAPMethodName("doBtn_upd1");
		p.Btn_upd2.addAllListener(p);
		p.Btn_upd2.setAPMethodName("doBtn_upd2");
		p.Btn_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 *  [TabSrch]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTabSrch(MSBGP_BillCl p) {
	}

	/**
	 *  [Edi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEdi(MSBGP_BillCl p) {
	}

	/**
	 * [SRCH_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_ScreenOpe(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_Top(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_Fold(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_Cnd(MSBGP_BillCl p){
		p.Cnd_ope_Group.putMode(p, SRCH_U, MCMode.REQUIRED);
		p.Cnd_on_edi_flg.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_bill_ym.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_bill_cl_day.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_U, MCMode.ENABLE);
		p.Cnd_base_cur_cd.putMode(p, SRCH_U, MCMode.INVISIBLE);
		p.Cnd_bill_xrate_cd.putMode(p, SRCH_U, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Cnd_wrkno_p_PPanel.putStatus(SRCH_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_manual_flg.putMode(p, SRCH_U, MCMode.REQUIRED);
		p.Cnd_sel_flg.putMode(p, SRCH_U, MCMode.REQUIRED);
		p.Cnd_each_sls_flg.putMode(p, SRCH_U, MCMode.REQUIRED);
		p.Cnd_batch_flg.putMode(p, SRCH_U, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, SRCH_U, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_Ctrl(MSBGP_BillCl p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_Hdr(MSBGP_BillCl p){
		p.columnHdr_check.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_bill_no.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_bill_dpt_cd.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_bill_dpt_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_wg_cd.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_wg_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_bcst_cd.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_bcst_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_edi_flg.putMode(p, SRCH_U, MCMode.REQUIRED);
		p.columnHdr_bill_ym.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_day.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_rcv_schd_dt.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_trd_cur_cd.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_trd_cur_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Hdr_billXrate_p_PPanel.putStatus(SRCH_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(SRCH_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnHdr_bill_d_sel_flg.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_last_bill_ym.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_last_bill_cl_day.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_typ.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_typ_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_tax_on_bill_flg.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_base_dt.putMode(p, SRCH_U, MCMode.INVISIBLE);
		p.Hdr_rtnMsg_p_PPanel.putStatus(SRCH_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnHdr_ins_usr_id.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_ins_usr_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_ins_func_id.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_ins_func_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_ins_ts.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_upd_usr_id.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_upd_usr_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_upd_func_id.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_upd_func_nm.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_upd_ts.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_upd_srv_req_no.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.columnHdr_iv_no.putMode(p, SRCH_U, MCMode.INVISIBLE);
		p.columnHdr_upd_cntr.putMode(p, SRCH_U, MCMode.INVISIBLE);
		p.columnHdr_bill_mng_no.putMode(p, SRCH_U, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_Dtl(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_Btn(MSBGP_BillCl p){
		p.Btn_open_MSBGP0020.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Btn_open_MSBGP0030.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Btn_open_MSBGP0080.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Btn_open_MSBBP1370.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Btn_deselect_all.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Btn_upd1.putMode(p, SRCH_U, MCMode.READ_ONLY);
		p.Btn_upd2.putMode(p, SRCH_U, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_U, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_U]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_TabSrch(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_U]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__U_Edi(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_ScreenOpe(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_Top(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_D]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_Fold(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_Cnd(MSBGP_BillCl p){
		p.Cnd_ope_Group.putMode(p, SRCH_D, MCMode.REQUIRED);
		p.Cnd_on_edi_flg.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_bill_ym.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_bill_cl_day.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_base_cur_cd.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.Cnd_bill_xrate_cd.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, SRCH_D, MCMode.ENABLE);
		p.Cnd_wrkno_p_PPanel.putStatus(SRCH_D, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_manual_flg.putMode(p, SRCH_D, MCMode.REQUIRED);
		p.Cnd_sel_flg.putMode(p, SRCH_D, MCMode.REQUIRED);
		p.Cnd_each_sls_flg.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Cnd_batch_flg.putMode(p, SRCH_D, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, SRCH_D, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_D]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_Ctrl(MSBGP_BillCl p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_D, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_Hdr(MSBGP_BillCl p){
		p.columnHdr_check.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_bill_no.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_bill_dpt_cd.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_bill_dpt_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_wg_cd.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_wg_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_bcst_cd.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_bcst_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_edi_flg.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_bill_ym.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_day.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_rcv_schd_dt.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_trd_cur_cd.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_trd_cur_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Hdr_billXrate_p_PPanel.putStatus(SRCH_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(SRCH_D, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnHdr_bill_d_sel_flg.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.columnHdr_last_bill_ym.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.columnHdr_last_bill_cl_day.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.columnHdr_bill_cl_typ.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_typ_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_tax_on_bill_flg.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_base_dt.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.Hdr_rtnMsg_p_PPanel.putStatus(SRCH_D, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnHdr_ins_usr_id.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_ins_usr_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_ins_func_id.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_ins_func_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_ins_ts.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_upd_usr_id.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_upd_usr_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_upd_func_id.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_upd_func_nm.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_upd_ts.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_upd_srv_req_no.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.columnHdr_iv_no.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.columnHdr_upd_cntr.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.columnHdr_bill_mng_no.putMode(p, SRCH_D, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_Dtl(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_Btn(MSBGP_BillCl p){
		p.Btn_open_MSBGP0020.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Btn_open_MSBGP0030.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Btn_open_MSBGP0080.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Btn_open_MSBBP1370.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Btn_deselect_all.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Btn_upd1.putMode(p, SRCH_D, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, SRCH_D, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_D, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_D]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_TabSrch(MSBGP_BillCl p){

	}

	/**
	 * [SRCH_D]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__D_Edi(MSBGP_BillCl p){

	}

	/**
	 * [UPD_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_ScreenOpe(MSBGP_BillCl p){

	}

	/**
	 * [UPD_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_Top(MSBGP_BillCl p){

	}

	/**
	 * [UPD_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_Fold(MSBGP_BillCl p){

	}

	/**
	 * [UPD_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_Cnd(MSBGP_BillCl p){
		p.Cnd_ope_Group.putMode(p, UPD_U, MCMode.REQUIRED);
		p.Cnd_on_edi_flg.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_bill_ym.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_bill_cl_day.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, UPD_U, MCMode.ENABLE);
		p.Cnd_base_cur_cd.putMode(p, UPD_U, MCMode.INVISIBLE);
		p.Cnd_bill_xrate_cd.putMode(p, UPD_U, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.Cnd_wrkno_p_PPanel.putStatus(UPD_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_manual_flg.putMode(p, UPD_U, MCMode.REQUIRED);
		p.Cnd_sel_flg.putMode(p, UPD_U, MCMode.REQUIRED);
		p.Cnd_each_sls_flg.putMode(p, UPD_U, MCMode.REQUIRED);
		p.Cnd_batch_flg.putMode(p, UPD_U, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, UPD_U, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_Ctrl(MSBGP_BillCl p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_Hdr(MSBGP_BillCl p){
		p.columnHdr_check.putMode(p, UPD_U, MCMode.ENABLE);
		p.columnHdr_bill_no.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_bill_dpt_cd.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_bill_dpt_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_wg_cd.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_wg_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_bcst_cd.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_bcst_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_edi_flg.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_bill_ym.putMode(p, UPD_U, MCMode.REQUIRED);
		p.columnHdr_bill_cl_day.putMode(p, UPD_U, MCMode.REQUIRED);
		p.columnHdr_rcv_schd_dt.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_trd_cur_cd.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_trd_cur_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.Hdr_billXrate_p_PPanel.putStatus(UPD_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.Hdr_wrkno_p_PPanel.putStatus(UPD_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnHdr_bill_d_sel_flg.putMode(p, UPD_U, MCMode.REQUIRED);
		p.columnHdr_last_bill_ym.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_last_bill_cl_day.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_typ.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_typ_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_tax_on_bill_flg.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_base_dt.putMode(p, UPD_U, MCMode.INVISIBLE);
		p.Hdr_rtnMsg_p_PPanel.putStatus(UPD_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnHdr_ins_usr_id.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_ins_usr_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_ins_func_id.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_ins_func_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_ins_ts.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_upd_usr_id.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_upd_usr_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_upd_func_id.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_upd_func_nm.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_upd_ts.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_upd_srv_req_no.putMode(p, UPD_U, MCMode.READ_ONLY);
		p.columnHdr_iv_no.putMode(p, UPD_U, MCMode.INVISIBLE);
		p.columnHdr_upd_cntr.putMode(p, UPD_U, MCMode.INVISIBLE);
		p.columnHdr_bill_mng_no.putMode(p, UPD_U, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_Dtl(MSBGP_BillCl p){

	}

	/**
	 * [UPD_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_Btn(MSBGP_BillCl p){
		p.Btn_open_MSBGP0020.putMode(p, UPD_U, MCMode.ENABLE);
		p.Btn_open_MSBGP0030.putMode(p, UPD_U, MCMode.ENABLE);
		p.Btn_open_MSBGP0080.putMode(p, UPD_U, MCMode.ENABLE);
		p.Btn_open_MSBBP1370.putMode(p, UPD_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_U, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_U, MCMode.ENABLE);
		p.Btn_upd1.putMode(p, UPD_U, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD_U, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD_U, MCMode.ENABLE);

	}

	/**
	 * [UPD_U]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_TabSrch(MSBGP_BillCl p){

	}

	/**
	 * [UPD_U]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitUPD__U_Edi(MSBGP_BillCl p){

	}

	/**
	 * [UPD_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_ScreenOpe(MSBGP_BillCl p){

	}

	/**
	 * [UPD_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_Top(MSBGP_BillCl p){

	}

	/**
	 * [UPD_D]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_Fold(MSBGP_BillCl p){

	}

	/**
	 * [UPD_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_Cnd(MSBGP_BillCl p){
		p.Cnd_ope_Group.putMode(p, UPD_D, MCMode.REQUIRED);
		p.Cnd_on_edi_flg.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_bill_ym.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_bill_cl_day.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_base_cur_cd.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.Cnd_bill_xrate_cd.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, UPD_D, MCMode.ENABLE);
		p.Cnd_wrkno_p_PPanel.putStatus(UPD_D, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_manual_flg.putMode(p, UPD_D, MCMode.REQUIRED);
		p.Cnd_sel_flg.putMode(p, UPD_D, MCMode.REQUIRED);
		p.Cnd_each_sls_flg.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.Cnd_batch_flg.putMode(p, UPD_D, MCMode.REQUIRED);
		p.Cnd_new_flg.putMode(p, UPD_D, MCMode.REQUIRED);

	}

	/**
	 * [UPD_D]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_Ctrl(MSBGP_BillCl p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_D, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_Hdr(MSBGP_BillCl p){
		p.columnHdr_check.putMode(p, UPD_D, MCMode.ENABLE);
		p.columnHdr_bill_no.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_bill_dpt_cd.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_bill_dpt_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_wg_cd.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_wg_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_bcst_cd.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_bcst_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_edi_flg.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_bill_ym.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_day.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_rcv_schd_dt.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_trd_cur_cd.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_trd_cur_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.Hdr_billXrate_p_PPanel.putStatus(UPD_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(UPD_D, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnHdr_bill_d_sel_flg.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.columnHdr_last_bill_ym.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.columnHdr_last_bill_cl_day.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.columnHdr_bill_cl_typ.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_bill_cl_typ_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_tax_on_bill_flg.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_base_dt.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.Hdr_rtnMsg_p_PPanel.putStatus(UPD_D, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnHdr_ins_usr_id.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_ins_usr_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_ins_func_id.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_ins_func_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_ins_ts.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_upd_usr_id.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_upd_usr_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_upd_func_id.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_upd_func_nm.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_upd_ts.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_upd_srv_req_no.putMode(p, UPD_D, MCMode.READ_ONLY);
		p.columnHdr_iv_no.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.columnHdr_upd_cntr.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.columnHdr_bill_mng_no.putMode(p, UPD_D, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_Dtl(MSBGP_BillCl p){

	}

	/**
	 * [UPD_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_Btn(MSBGP_BillCl p){
		p.Btn_open_MSBGP0020.putMode(p, UPD_D, MCMode.ENABLE);
		p.Btn_open_MSBGP0030.putMode(p, UPD_D, MCMode.ENABLE);
		p.Btn_open_MSBGP0080.putMode(p, UPD_D, MCMode.ENABLE);
		p.Btn_open_MSBBP1370.putMode(p, UPD_D, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_D, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_D, MCMode.ENABLE);
		p.Btn_upd1.putMode(p, UPD_D, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, UPD_D, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD_D, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_D]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_TabSrch(MSBGP_BillCl p){

	}

	/**
	 * [UPD_D]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitUPD__D_Edi(MSBGP_BillCl p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_U;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBGP_BillCl_MC.setTableConfigHdr((MSBGP_BillCl)this);
	}

	/**
	 * [Hdr]ブロックのTableの設定
	 */
	protected static void setTableConfigHdr(MSBGP_BillCl p) {
		p.columnHdr_check.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.check_META);
		p.HdrTable.addColumnConfig(p.columnHdr_check);
		p.columnHdr_bill_no.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_no_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_no);
		p.columnHdr_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_dpt_cd_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_dpt_cd);
		p.columnHdr_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_dpt_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_dpt_nm);
		p.columnHdr_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.wg_cd_META);
		p.HdrTable.addColumnConfig(p.columnHdr_wg_cd);
		p.columnHdr_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.wg_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_wg_nm);
		p.columnHdr_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bcst_cd_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bcst_cd);
		p.columnHdr_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bcst_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bcst_nm);
		p.columnHdr_edi_flg.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.edi_flg_META);
		p.HdrTable.addColumnConfig(p.columnHdr_edi_flg);
		p.columnHdr_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_ym_META);
		p.columnHdr_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_ym);
		p.columnHdr_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_cl_day_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_cl_day);
		p.columnHdr_rcv_schd_dt.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.rcv_schd_dt_META);
		p.columnHdr_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrTable.addColumnConfig(p.columnHdr_rcv_schd_dt);
		p.columnHdr_trd_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.trd_cur_cd_META);
		p.HdrTable.addColumnConfig(p.columnHdr_trd_cur_cd);
		p.columnHdr_trd_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.trd_cur_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_trd_cur_nm);
		p.HdrTable.addTable(p.Hdr_billXrate_p_PPanel.XrateTable);
		p.HdrTable.addTable(p.Hdr_wrkno_p_PPanel.WrkNoTable);
		p.columnHdr_bill_d_sel_flg.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_d_sel_flg_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_d_sel_flg);
		p.columnHdr_last_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.last_bill_ym_META);
		p.columnHdr_last_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrTable.addColumnConfig(p.columnHdr_last_bill_ym);
		p.columnHdr_last_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.last_bill_cl_day_META);
		p.HdrTable.addColumnConfig(p.columnHdr_last_bill_cl_day);
		p.columnHdr_bill_cl_typ.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_cl_typ_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_cl_typ);
		p.columnHdr_bill_cl_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_cl_typ_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_cl_typ_nm);
		p.columnHdr_tax_on_bill_flg.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.tax_on_bill_flg_META);
		p.HdrTable.addColumnConfig(p.columnHdr_tax_on_bill_flg);
		p.columnHdr_base_dt.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.base_dt_META);
		p.columnHdr_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrTable.addColumnConfig(p.columnHdr_base_dt);
		p.HdrTable.addTable(p.Hdr_rtnMsg_p_PPanel.RtnMsgTable);
		p.columnHdr_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.ins_usr_id_META);
		p.HdrTable.addColumnConfig(p.columnHdr_ins_usr_id);
		p.columnHdr_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.ins_usr_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_ins_usr_nm);
		p.columnHdr_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.ins_func_id_META);
		p.HdrTable.addColumnConfig(p.columnHdr_ins_func_id);
		p.columnHdr_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.ins_func_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_ins_func_nm);
		p.columnHdr_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.ins_ts_META);
		p.columnHdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HdrTable.addColumnConfig(p.columnHdr_ins_ts);
		p.columnHdr_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.upd_usr_id_META);
		p.HdrTable.addColumnConfig(p.columnHdr_upd_usr_id);
		p.columnHdr_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.upd_usr_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_upd_usr_nm);
		p.columnHdr_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.upd_func_id_META);
		p.HdrTable.addColumnConfig(p.columnHdr_upd_func_id);
		p.columnHdr_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.upd_func_nm_META);
		p.HdrTable.addColumnConfig(p.columnHdr_upd_func_nm);
		p.columnHdr_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.upd_ts_META);
		p.columnHdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HdrTable.addColumnConfig(p.columnHdr_upd_ts);
		p.columnHdr_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.upd_srv_req_no_META);
		p.HdrTable.addColumnConfig(p.columnHdr_upd_srv_req_no);
		p.columnHdr_iv_no.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.iv_no_META);
		p.HdrTable.addColumnConfig(p.columnHdr_iv_no);
		p.columnHdr_upd_cntr.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.upd_cntr_META);
		p.HdrTable.addColumnConfig(p.columnHdr_upd_cntr);
		p.columnHdr_bill_mng_no.setMeta(mcframe.clientMSBG.MSBGP0010.HdrR.bill_mng_no_META);
		p.HdrTable.addColumnConfig(p.columnHdr_bill_mng_no);
		// スクロール固定カラムの指定
		p.HdrTable.setUnscrollColumn(p.columnHdr_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bcst_cd.getListConfig().setPutter(getCnd_bcst_cd_ListPutter());
		Cnd_bill_dpt_cd.getListConfig().setPutter(getCnd_bill_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		columnHdr_bill_cl_day.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnHdr_bill_cl_day.getListConfig().setPutter(getHdr_bill_cl_day_ListPutter());
	}

	/**
	 * この画面を[SRCH_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UStatus() {
		status = SRCH_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DStatus() {
		status = SRCH_D;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_UStatus() {
		status = UPD_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_DStatus() {
		status = UPD_D;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_U.equals(status)) {
			setSRCH_UStatus();
		}
		else if (SRCH_D.equals(status)) {
			setSRCH_DStatus();
		}
		else if (UPD_U.equals(status)) {
			setUPD_UStatus();
		}
		else if (UPD_D.equals(status)) {
			setUPD_DStatus();
		}
	}

	/**
	 * [Cnd_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_bill_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bill_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArWg");
		return lp;
	}
	 
	/**
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_cl_day_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_cl_day_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0080.Bcst_BillClDay");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bcst_cd) return getCnd_bcst_cd(row, info);
		if(combo == Cnd_bill_dpt_cd) return getCnd_bill_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == columnHdr_bill_cl_day) return getHdr_bill_cl_day(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_open_MSBGP0020) doBtn_open_MSBGP0020(info);
		else if (ap == Btn_open_MSBGP0030) doBtn_open_MSBGP0030(info);
		else if (ap == Btn_open_MSBGP0080) doBtn_open_MSBGP0080(info);
		else if (ap == Btn_open_MSBBP1370) doBtn_open_MSBBP1370(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd1) doBtn_upd1(info);
		else if (ap == Btn_upd2) doBtn_upd2(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0020]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0020(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1370]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1370(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd1]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd1(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd2(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == HdrTable) return doHdr_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_on_edi_flg) return doCnd_on_edi_flg_VC(info);
		if (vc == Cnd_off_edi_flg) return doCnd_off_edi_flg_VC(info);
		if (vc == Cnd_bill_ym) return doCnd_bill_ym_VC(info);
		if (vc == Cnd_bill_cl_day) return doCnd_bill_cl_day_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_base_cur_cd) return doCnd_base_cur_cd_VC(info);
		if (vc == Cnd_bill_xrate_cd) return doCnd_bill_xrate_cd_VC(info);
		if (vc == Cnd_bill_no) return doCnd_bill_no_VC(info);
		if (vc == Cnd_manual_flg) return doCnd_manual_flg_VC(info);
		if (vc == Cnd_sel_flg) return doCnd_sel_flg_VC(info);
		if (vc == Cnd_each_sls_flg) return doCnd_each_sls_flg_VC(info);
		if (vc == Cnd_batch_flg) return doCnd_batch_flg_VC(info);
		if (vc == Cnd_new_flg) return doCnd_new_flg_VC(info);
		if (vc == columnHdr_check) return doHdr_check_VC(info);
		if (vc == columnHdr_bill_no) return doHdr_bill_no_VC(info);
		if (vc == columnHdr_bill_dpt_cd) return doHdr_bill_dpt_cd_VC(info);
		if (vc == columnHdr_bill_dpt_nm) return doHdr_bill_dpt_nm_VC(info);
		if (vc == columnHdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == columnHdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == columnHdr_bcst_cd) return doHdr_bcst_cd_VC(info);
		if (vc == columnHdr_bcst_nm) return doHdr_bcst_nm_VC(info);
		if (vc == columnHdr_edi_flg) return doHdr_edi_flg_VC(info);
		if (vc == columnHdr_bill_ym) return doHdr_bill_ym_VC(info);
		if (vc == columnHdr_bill_cl_day) return doHdr_bill_cl_day_VC(info);
		if (vc == columnHdr_rcv_schd_dt) return doHdr_rcv_schd_dt_VC(info);
		if (vc == columnHdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == columnHdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == columnHdr_bill_d_sel_flg) return doHdr_bill_d_sel_flg_VC(info);
		if (vc == columnHdr_last_bill_ym) return doHdr_last_bill_ym_VC(info);
		if (vc == columnHdr_last_bill_cl_day) return doHdr_last_bill_cl_day_VC(info);
		if (vc == columnHdr_bill_cl_typ) return doHdr_bill_cl_typ_VC(info);
		if (vc == columnHdr_bill_cl_typ_nm) return doHdr_bill_cl_typ_nm_VC(info);
		if (vc == columnHdr_tax_on_bill_flg) return doHdr_tax_on_bill_flg_VC(info);
		if (vc == columnHdr_base_dt) return doHdr_base_dt_VC(info);
		if (vc == columnHdr_ins_usr_id) return doHdr_ins_usr_id_VC(info);
		if (vc == columnHdr_ins_usr_nm) return doHdr_ins_usr_nm_VC(info);
		if (vc == columnHdr_ins_func_id) return doHdr_ins_func_id_VC(info);
		if (vc == columnHdr_ins_func_nm) return doHdr_ins_func_nm_VC(info);
		if (vc == columnHdr_ins_ts) return doHdr_ins_ts_VC(info);
		if (vc == columnHdr_upd_usr_id) return doHdr_upd_usr_id_VC(info);
		if (vc == columnHdr_upd_usr_nm) return doHdr_upd_usr_nm_VC(info);
		if (vc == columnHdr_upd_func_id) return doHdr_upd_func_id_VC(info);
		if (vc == columnHdr_upd_func_nm) return doHdr_upd_func_nm_VC(info);
		if (vc == columnHdr_upd_ts) return doHdr_upd_ts_VC(info);
		if (vc == columnHdr_upd_srv_req_no) return doHdr_upd_srv_req_no_VC(info);
		if (vc == columnHdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == columnHdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == columnHdr_bill_mng_no) return doHdr_bill_mng_no_VC(info);
		if (vc == Btn_indiv_prnt_flg) return doBtn_indiv_prnt_flg_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[manual_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_manual_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sel_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sel_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[each_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_each_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[batch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_batch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_d_sel_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_d_sel_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[last_bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_last_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[last_bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_last_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tax_on_bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tax_on_bill_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_indiv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == HdrTable) doHdr_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_on_edi_flg) doCnd_on_edi_flg_NC(info);
		else if (nc == Cnd_off_edi_flg) doCnd_off_edi_flg_NC(info);
		else if (nc == Cnd_bill_ym) doCnd_bill_ym_NC(info);
		else if (nc == Cnd_bill_cl_day) doCnd_bill_cl_day_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_base_cur_cd) doCnd_base_cur_cd_NC(info);
		else if (nc == Cnd_bill_xrate_cd) doCnd_bill_xrate_cd_NC(info);
		else if (nc == Cnd_bill_no) doCnd_bill_no_NC(info);
		else if (nc == Cnd_manual_flg) doCnd_manual_flg_NC(info);
		else if (nc == Cnd_sel_flg) doCnd_sel_flg_NC(info);
		else if (nc == Cnd_each_sls_flg) doCnd_each_sls_flg_NC(info);
		else if (nc == Cnd_batch_flg) doCnd_batch_flg_NC(info);
		else if (nc == Cnd_new_flg) doCnd_new_flg_NC(info);
		else if (nc == columnHdr_check) doHdr_check_NC(info);
		else if (nc == columnHdr_bill_no) doHdr_bill_no_NC(info);
		else if (nc == columnHdr_bill_dpt_cd) doHdr_bill_dpt_cd_NC(info);
		else if (nc == columnHdr_bill_dpt_nm) doHdr_bill_dpt_nm_NC(info);
		else if (nc == columnHdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == columnHdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == columnHdr_bcst_cd) doHdr_bcst_cd_NC(info);
		else if (nc == columnHdr_bcst_nm) doHdr_bcst_nm_NC(info);
		else if (nc == columnHdr_edi_flg) doHdr_edi_flg_NC(info);
		else if (nc == columnHdr_bill_ym) doHdr_bill_ym_NC(info);
		else if (nc == columnHdr_bill_cl_day) doHdr_bill_cl_day_NC(info);
		else if (nc == columnHdr_rcv_schd_dt) doHdr_rcv_schd_dt_NC(info);
		else if (nc == columnHdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == columnHdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == columnHdr_bill_d_sel_flg) doHdr_bill_d_sel_flg_NC(info);
		else if (nc == columnHdr_last_bill_ym) doHdr_last_bill_ym_NC(info);
		else if (nc == columnHdr_last_bill_cl_day) doHdr_last_bill_cl_day_NC(info);
		else if (nc == columnHdr_bill_cl_typ) doHdr_bill_cl_typ_NC(info);
		else if (nc == columnHdr_bill_cl_typ_nm) doHdr_bill_cl_typ_nm_NC(info);
		else if (nc == columnHdr_tax_on_bill_flg) doHdr_tax_on_bill_flg_NC(info);
		else if (nc == columnHdr_base_dt) doHdr_base_dt_NC(info);
		else if (nc == columnHdr_ins_usr_id) doHdr_ins_usr_id_NC(info);
		else if (nc == columnHdr_ins_usr_nm) doHdr_ins_usr_nm_NC(info);
		else if (nc == columnHdr_ins_func_id) doHdr_ins_func_id_NC(info);
		else if (nc == columnHdr_ins_func_nm) doHdr_ins_func_nm_NC(info);
		else if (nc == columnHdr_ins_ts) doHdr_ins_ts_NC(info);
		else if (nc == columnHdr_upd_usr_id) doHdr_upd_usr_id_NC(info);
		else if (nc == columnHdr_upd_usr_nm) doHdr_upd_usr_nm_NC(info);
		else if (nc == columnHdr_upd_func_id) doHdr_upd_func_id_NC(info);
		else if (nc == columnHdr_upd_func_nm) doHdr_upd_func_nm_NC(info);
		else if (nc == columnHdr_upd_ts) doHdr_upd_ts_NC(info);
		else if (nc == columnHdr_upd_srv_req_no) doHdr_upd_srv_req_no_NC(info);
		else if (nc == columnHdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == columnHdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == columnHdr_bill_mng_no) doHdr_bill_mng_no_NC(info);
		else if (nc == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[manual_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_manual_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sel_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sel_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[each_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_each_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_d_sel_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_d_sel_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_bill_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == HdrTable) doHdr_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_on_edi_flg) doCnd_on_edi_flg_NE(info);
		else if (ne == Cnd_off_edi_flg) doCnd_off_edi_flg_NE(info);
		else if (ne == Cnd_bill_ym) doCnd_bill_ym_NE(info);
		else if (ne == Cnd_bill_cl_day) doCnd_bill_cl_day_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_base_cur_cd) doCnd_base_cur_cd_NE(info);
		else if (ne == Cnd_bill_xrate_cd) doCnd_bill_xrate_cd_NE(info);
		else if (ne == Cnd_bill_no) doCnd_bill_no_NE(info);
		else if (ne == Cnd_manual_flg) doCnd_manual_flg_NE(info);
		else if (ne == Cnd_sel_flg) doCnd_sel_flg_NE(info);
		else if (ne == Cnd_each_sls_flg) doCnd_each_sls_flg_NE(info);
		else if (ne == Cnd_batch_flg) doCnd_batch_flg_NE(info);
		else if (ne == Cnd_new_flg) doCnd_new_flg_NE(info);
		else if (ne == columnHdr_check) doHdr_check_NE(info);
		else if (ne == columnHdr_bill_no) doHdr_bill_no_NE(info);
		else if (ne == columnHdr_bill_dpt_cd) doHdr_bill_dpt_cd_NE(info);
		else if (ne == columnHdr_bill_dpt_nm) doHdr_bill_dpt_nm_NE(info);
		else if (ne == columnHdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == columnHdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == columnHdr_bcst_cd) doHdr_bcst_cd_NE(info);
		else if (ne == columnHdr_bcst_nm) doHdr_bcst_nm_NE(info);
		else if (ne == columnHdr_edi_flg) doHdr_edi_flg_NE(info);
		else if (ne == columnHdr_bill_ym) doHdr_bill_ym_NE(info);
		else if (ne == columnHdr_bill_cl_day) doHdr_bill_cl_day_NE(info);
		else if (ne == columnHdr_rcv_schd_dt) doHdr_rcv_schd_dt_NE(info);
		else if (ne == columnHdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == columnHdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == columnHdr_bill_d_sel_flg) doHdr_bill_d_sel_flg_NE(info);
		else if (ne == columnHdr_last_bill_ym) doHdr_last_bill_ym_NE(info);
		else if (ne == columnHdr_last_bill_cl_day) doHdr_last_bill_cl_day_NE(info);
		else if (ne == columnHdr_bill_cl_typ) doHdr_bill_cl_typ_NE(info);
		else if (ne == columnHdr_bill_cl_typ_nm) doHdr_bill_cl_typ_nm_NE(info);
		else if (ne == columnHdr_tax_on_bill_flg) doHdr_tax_on_bill_flg_NE(info);
		else if (ne == columnHdr_base_dt) doHdr_base_dt_NE(info);
		else if (ne == columnHdr_ins_usr_id) doHdr_ins_usr_id_NE(info);
		else if (ne == columnHdr_ins_usr_nm) doHdr_ins_usr_nm_NE(info);
		else if (ne == columnHdr_ins_func_id) doHdr_ins_func_id_NE(info);
		else if (ne == columnHdr_ins_func_nm) doHdr_ins_func_nm_NE(info);
		else if (ne == columnHdr_ins_ts) doHdr_ins_ts_NE(info);
		else if (ne == columnHdr_upd_usr_id) doHdr_upd_usr_id_NE(info);
		else if (ne == columnHdr_upd_usr_nm) doHdr_upd_usr_nm_NE(info);
		else if (ne == columnHdr_upd_func_id) doHdr_upd_func_id_NE(info);
		else if (ne == columnHdr_upd_func_nm) doHdr_upd_func_nm_NE(info);
		else if (ne == columnHdr_upd_ts) doHdr_upd_ts_NE(info);
		else if (ne == columnHdr_upd_srv_req_no) doHdr_upd_srv_req_no_NE(info);
		else if (ne == columnHdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == columnHdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == columnHdr_bill_mng_no) doHdr_bill_mng_no_NE(info);
		else if (ne == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[manual_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_manual_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sel_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sel_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[each_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_each_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_d_sel_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_d_sel_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_bill_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == HdrTable) doHdr_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_on_edi_flg) doCnd_on_edi_flg_NX(info);
		else if (nx == Cnd_off_edi_flg) doCnd_off_edi_flg_NX(info);
		else if (nx == Cnd_bill_ym) doCnd_bill_ym_NX(info);
		else if (nx == Cnd_bill_cl_day) doCnd_bill_cl_day_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_base_cur_cd) doCnd_base_cur_cd_NX(info);
		else if (nx == Cnd_bill_xrate_cd) doCnd_bill_xrate_cd_NX(info);
		else if (nx == Cnd_bill_no) doCnd_bill_no_NX(info);
		else if (nx == Cnd_manual_flg) doCnd_manual_flg_NX(info);
		else if (nx == Cnd_sel_flg) doCnd_sel_flg_NX(info);
		else if (nx == Cnd_each_sls_flg) doCnd_each_sls_flg_NX(info);
		else if (nx == Cnd_batch_flg) doCnd_batch_flg_NX(info);
		else if (nx == Cnd_new_flg) doCnd_new_flg_NX(info);
		else if (nx == columnHdr_check) doHdr_check_NX(info);
		else if (nx == columnHdr_bill_no) doHdr_bill_no_NX(info);
		else if (nx == columnHdr_bill_dpt_cd) doHdr_bill_dpt_cd_NX(info);
		else if (nx == columnHdr_bill_dpt_nm) doHdr_bill_dpt_nm_NX(info);
		else if (nx == columnHdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == columnHdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == columnHdr_bcst_cd) doHdr_bcst_cd_NX(info);
		else if (nx == columnHdr_bcst_nm) doHdr_bcst_nm_NX(info);
		else if (nx == columnHdr_edi_flg) doHdr_edi_flg_NX(info);
		else if (nx == columnHdr_bill_ym) doHdr_bill_ym_NX(info);
		else if (nx == columnHdr_bill_cl_day) doHdr_bill_cl_day_NX(info);
		else if (nx == columnHdr_rcv_schd_dt) doHdr_rcv_schd_dt_NX(info);
		else if (nx == columnHdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == columnHdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == columnHdr_bill_d_sel_flg) doHdr_bill_d_sel_flg_NX(info);
		else if (nx == columnHdr_last_bill_ym) doHdr_last_bill_ym_NX(info);
		else if (nx == columnHdr_last_bill_cl_day) doHdr_last_bill_cl_day_NX(info);
		else if (nx == columnHdr_bill_cl_typ) doHdr_bill_cl_typ_NX(info);
		else if (nx == columnHdr_bill_cl_typ_nm) doHdr_bill_cl_typ_nm_NX(info);
		else if (nx == columnHdr_tax_on_bill_flg) doHdr_tax_on_bill_flg_NX(info);
		else if (nx == columnHdr_base_dt) doHdr_base_dt_NX(info);
		else if (nx == columnHdr_ins_usr_id) doHdr_ins_usr_id_NX(info);
		else if (nx == columnHdr_ins_usr_nm) doHdr_ins_usr_nm_NX(info);
		else if (nx == columnHdr_ins_func_id) doHdr_ins_func_id_NX(info);
		else if (nx == columnHdr_ins_func_nm) doHdr_ins_func_nm_NX(info);
		else if (nx == columnHdr_ins_ts) doHdr_ins_ts_NX(info);
		else if (nx == columnHdr_upd_usr_id) doHdr_upd_usr_id_NX(info);
		else if (nx == columnHdr_upd_usr_nm) doHdr_upd_usr_nm_NX(info);
		else if (nx == columnHdr_upd_func_id) doHdr_upd_func_id_NX(info);
		else if (nx == columnHdr_upd_func_nm) doHdr_upd_func_nm_NX(info);
		else if (nx == columnHdr_upd_ts) doHdr_upd_ts_NX(info);
		else if (nx == columnHdr_upd_srv_req_no) doHdr_upd_srv_req_no_NX(info);
		else if (nx == columnHdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == columnHdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == columnHdr_bill_mng_no) doHdr_bill_mng_no_NX(info);
		else if (nx == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[manual_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_manual_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sel_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sel_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[each_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_each_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_d_sel_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_d_sel_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_bill_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bill_ym) doCnd_bill_ym_LC(info);
		else if (lc == Cnd_bill_cl_day) doCnd_bill_cl_day_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_base_cur_cd) doCnd_base_cur_cd_LC(info);
		else if (lc == Cnd_bill_xrate_cd) doCnd_bill_xrate_cd_LC(info);
		else if (lc == Cnd_bill_no) doCnd_bill_no_LC(info);
		else if (lc == columnHdr_bill_no) doHdr_bill_no_LC(info);
		else if (lc == columnHdr_bill_dpt_cd) doHdr_bill_dpt_cd_LC(info);
		else if (lc == columnHdr_bill_dpt_nm) doHdr_bill_dpt_nm_LC(info);
		else if (lc == columnHdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == columnHdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == columnHdr_bcst_cd) doHdr_bcst_cd_LC(info);
		else if (lc == columnHdr_bcst_nm) doHdr_bcst_nm_LC(info);
		else if (lc == columnHdr_bill_ym) doHdr_bill_ym_LC(info);
		else if (lc == columnHdr_bill_cl_day) doHdr_bill_cl_day_LC(info);
		else if (lc == columnHdr_rcv_schd_dt) doHdr_rcv_schd_dt_LC(info);
		else if (lc == columnHdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == columnHdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == columnHdr_last_bill_ym) doHdr_last_bill_ym_LC(info);
		else if (lc == columnHdr_last_bill_cl_day) doHdr_last_bill_cl_day_LC(info);
		else if (lc == columnHdr_bill_cl_typ) doHdr_bill_cl_typ_LC(info);
		else if (lc == columnHdr_bill_cl_typ_nm) doHdr_bill_cl_typ_nm_LC(info);
		else if (lc == columnHdr_base_dt) doHdr_base_dt_LC(info);
		else if (lc == columnHdr_ins_usr_id) doHdr_ins_usr_id_LC(info);
		else if (lc == columnHdr_ins_usr_nm) doHdr_ins_usr_nm_LC(info);
		else if (lc == columnHdr_ins_func_id) doHdr_ins_func_id_LC(info);
		else if (lc == columnHdr_ins_func_nm) doHdr_ins_func_nm_LC(info);
		else if (lc == columnHdr_ins_ts) doHdr_ins_ts_LC(info);
		else if (lc == columnHdr_upd_usr_id) doHdr_upd_usr_id_LC(info);
		else if (lc == columnHdr_upd_usr_nm) doHdr_upd_usr_nm_LC(info);
		else if (lc == columnHdr_upd_func_id) doHdr_upd_func_id_LC(info);
		else if (lc == columnHdr_upd_func_nm) doHdr_upd_func_nm_LC(info);
		else if (lc == columnHdr_upd_ts) doHdr_upd_ts_LC(info);
		else if (lc == columnHdr_upd_srv_req_no) doHdr_upd_srv_req_no_LC(info);
		else if (lc == columnHdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == columnHdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == columnHdr_bill_mng_no) doHdr_bill_mng_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_bcst_cd]の作成メソッド
	 */
	public MCList getCnd_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bill_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnHdr_bill_cl_day]の作成メソッド
	 */
	public MCList getHdr_bill_cl_day(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0080.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0080.MSUAP_List", this)).getBcst_BillClDay(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0010.Srch01")) {
			return new MS_MSBGL0010_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0010.Srch02")) {
			return new MS_MSBGL0010_Srch02Bridge();
		}
		if (id.equals("MS.MSBGL0010.Upd01")) {
			return new MS_MSBGL0010_Upd01Bridge();
		}
		if (id.equals("MS.MSBGL0010.Del01")) {
			return new MS_MSBGL0010_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0010_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0010_Srch01Bridge() {
			p_MS_MSBGL0010_Srch01 = new MCParam(PDef.MS_MSBGL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));

			p_MS_MSBGL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0010.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0010.HdrR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0010_Srch01;
		}

		protected void show() {
			setHdrL((MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)p_MS_MSBGL0010_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0010_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0010_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0010_Srch02;

		/** コンストラクタ */
		protected MS_MSBGL0010_Srch02Bridge() {
			p_MS_MSBGL0010_Srch02 = new MCParam(PDef.MS_MSBGL0010_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0010_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));

			p_MS_MSBGL0010_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0010_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0010_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0010_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0010_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0010.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0010.HdrR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0010_Srch02.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0010_Srch02;
		}

		protected void show() {
			setHdrL((MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)p_MS_MSBGL0010_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0010_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0010_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0010_Upd01Bridge() {
			p_MS_MSBGL0010_Upd01 = new MCParam(PDef.MS_MSBGL0010_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0010_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.DtlR.class));
			param.addUpBlock(mcframe.clientMSBG.MSBGP0010.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));

			p_MS_MSBGL0010_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0010_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0010_Upd01.addUpBlock(getHdrL().shallowClone());
			p_MS_MSBGL0010_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBGL0010_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0010_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0010_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0010.HdrR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)up(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0010.DtlR> up1() {
			return (MCList<mcframe.clientMSBG.MSBGP0010.DtlR>)up(1);
		}
		protected mcframe.clientMSBG.MSBGP0010.BtnR up2() {
			return (mcframe.clientMSBG.MSBGP0010.BtnR)up(2);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0010.HdrR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0010_Upd01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0010_Upd01;
		}

		protected void show() {
			setHdrL((MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)p_MS_MSBGL0010_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrL());
			result.add(getDtlL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0010_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0010_Del01;

		/** コンストラクタ */
		protected MS_MSBGL0010_Del01Bridge() {
			p_MS_MSBGL0010_Del01 = new MCParam(PDef.MS_MSBGL0010_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0010_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));

			p_MS_MSBGL0010_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0010_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0010_Del01.addUpBlock(getHdrL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0010_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0010_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0010.HdrR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0010.HdrR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0010_Del01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0010.HdrR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0010_Del01;
		}

		protected void show() {
			setHdrL((MCList<mcframe.clientMSBG.MSBGP0010.HdrR>)p_MS_MSBGL0010_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrL());
			return result;
		}
	}
}