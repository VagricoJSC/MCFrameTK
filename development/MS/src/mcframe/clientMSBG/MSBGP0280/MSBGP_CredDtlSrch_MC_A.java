package mcframe.clientMSBG.MSBGP0280;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
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
import mcframe.clientMSBG.MSBGP0280.MSBGP_CredDtlSrch_MC.MS_MSBGL0280_Srch01Caller;

/**
 * 画面"MSBGP_CredDtlSrch"パネルクラスです。<p>
 *
 * 特定の与信管理先の与信状況の詳細を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_CredDtlSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0280";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_cred_cd_Label = null;
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cred_cd = null;
	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public MCTextField Cnd_cred_nm = null;
	public MCLabel Cnd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_cur_nm = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_cred_cd_Label = null;
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cred_cd = null;
	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public MCTextField Hdr_cred_nm = null;
	public MCLabel Hdr_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Hdr_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_cred_limit_p_PPanel;
	public MCNumberField Hdr_cred_limit;	// [Hdr]の[cred_limit_p.amt]を[Hdr_cred_limit]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_cred_amt_p_PPanel;
	public MCNumberField Hdr_ttl_cred_amt;	// [Hdr]の[ttl_cred_amt_p.amt]を[Hdr_ttl_cred_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_cred_bal_p_PPanel;
	public MCNumberField Hdr_cred_bal;	// [Hdr]の[cred_bal_p.amt]を[Hdr_cred_bal]としてエイリアス定義。
	/**
	 * Exclude order backlog 除受注残.<p>
	 *
	 */
	public MCCheckBox Hdr_exc_backord_flg = null;
	/**
	 * Include remaining quotation 含見積残.<p>
	 *
	 */
	public MCCheckBox Hdr_inc_qtn_flg = null;
	/**
	 * Exclude remaining PO 除発注残.<p>
	 *
	 */
	public MCCheckBox Hdr_exc_po_backord_flg = null;
	public MCLabel Hdr_ttl_ym_Label = null;
	/**
	 * Current month 当月.<p>
	 *
	 */
	public MCDateField Hdr_ttl_ym = null;
	public MCLabel Hdr_ttl_ym_ap_Label = null;
	/**
	 * Current month (AP) 当月（買掛）.<p>
	 *
	 */
	public MCDateField Hdr_ttl_ym_ap = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_end_bal_p_PPanel;
	public MCNumberField Hdr_ttl_end_bal;	// [Hdr]の[ttl_end_bal_p.amt]を[Hdr_ttl_end_bal]としてエイリアス定義。
	public MCLabel Hdr_lbl2 = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_init_bal_p_PPanel;
	public MCNumberField Hdr_ttl_init_bal;	// [Hdr]の[ttl_init_bal_p.amt]を[Hdr_ttl_init_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_sls_p_PPanel;
	public MCNumberField Hdr_ttl_sls;	// [Hdr]の[ttl_sls_p.amt]を[Hdr_ttl_sls]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_rcv_p_PPanel;
	public MCNumberField Hdr_ttl_rcv;	// [Hdr]の[ttl_rcv_p.amt]を[Hdr_ttl_rcv]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_adv_p_PPanel;
	public MCNumberField Hdr_ttl_adv;	// [Hdr]の[ttl_adv_p.amt]を[Hdr_ttl_adv]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_init_bal_ap_p_PPanel;
	public MCNumberField Hdr_ttl_init_bal_ap;	// [Hdr]の[ttl_init_bal_ap_p.amt]を[Hdr_ttl_init_bal_ap]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_purc_p_PPanel;
	public MCNumberField Hdr_ttl_purc;	// [Hdr]の[ttl_purc_p.amt]を[Hdr_ttl_purc]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_pay_p_PPanel;
	public MCNumberField Hdr_ttl_pay;	// [Hdr]の[ttl_pay_p.amt]を[Hdr_ttl_pay]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_adv_pay_p_PPanel;
	public MCNumberField Hdr_ttl_adv_pay;	// [Hdr]の[ttl_adv_pay_p.amt]を[Hdr_ttl_adv_pay]としてエイリアス定義。
	public MCLabel Hdr_lbl3 = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_not_appl_note_p_PPanel;
	public MCNumberField Hdr_not_appl_note;	// [Hdr]の[not_appl_note_p.amt]を[Hdr_not_appl_note]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_not_appl_adv_note_p_PPanel;
	public MCNumberField Hdr_not_appl_adv_note;	// [Hdr]の[not_appl_adv_note_p.amt]を[Hdr_not_appl_adv_note]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_backord_p_PPanel;
	public MCNumberField Hdr_ttl_backord;	// [Hdr]の[ttl_backord_p.amt]を[Hdr_ttl_backord]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_qtn_p_PPanel;
	public MCNumberField Hdr_ttl_qtn;	// [Hdr]の[ttl_qtn_p.amt]を[Hdr_ttl_qtn]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_po_backord_p_PPanel;
	public MCNumberField Hdr_ttl_po_backord;	// [Hdr]の[ttl_po_backord_p.amt]を[Hdr_ttl_po_backord]としてエイリアス定義。
	// [Hdr_Cred_Dtl]ブロック関連のField定義
	public MCPanel Hdr_Cred_DtlPanel = null;
	public MCTitledBorder Hdr_Cred_DtlTitledBorder = null;
	// [Hdr_Cred_Dtl]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCTitledBorder DtlTitledBorder = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0280.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_nm = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_init_bal_p_PPanel;
	public MCColumnConfig columnDtl_init_bal;// [Dtl]の[init_bal_p.amt]を[columnDtl_init_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_sls_amt_p_PPanel;
	public MCColumnConfig columnDtl_sls_amt;// [Dtl]の[sls_amt_p.amt]を[columnDtl_sls_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_cash_amt_p_PPanel;
	public MCColumnConfig columnDtl_cash_amt;// [Dtl]の[cash_amt_p.amt]を[columnDtl_cash_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_note_amt_p_PPanel;
	public MCColumnConfig columnDtl_note_amt;// [Dtl]の[note_amt_p.amt]を[columnDtl_note_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_xfr_amt_p_PPanel;
	public MCColumnConfig columnDtl_xfr_amt;// [Dtl]の[xfr_amt_p.amt]を[columnDtl_xfr_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_setoff_amt_p_PPanel;
	public MCColumnConfig columnDtl_setoff_amt;// [Dtl]の[setoff_amt_p.amt]を[columnDtl_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_sw_amt_p_PPanel;
	public MCColumnConfig columnDtl_sw_amt;// [Dtl]の[sw_amt_p.amt]を[columnDtl_sw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_end_bal_p_PPanel;
	public MCColumnConfig columnDtl_end_bal;// [Dtl]の[end_bal_p.amt]を[columnDtl_end_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_not_appl_no_p_PPanel;
	public MCColumnConfig columnDtl_not_appl_note;// [Dtl]の[not_appl_no_p.amt]を[columnDtl_not_appl_note]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_backord_amt_p_PPanel;
	public MCColumnConfig columnDtl_backord_amt;// [Dtl]の[backord_amt_p.amt]を[columnDtl_backord_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_cred_amt_p_PPanel;
	public MCColumnConfig columnDtl_cred_amt;// [Dtl]の[cred_amt_p.amt]を[columnDtl_cred_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_qtn_amt_p_PPanel;
	public MCColumnConfig columnDtl_qtn_amt;// [Dtl]の[qtn_amt_p.amt]を[columnDtl_qtn_amt]としてエイリアス定義。
	// [DtlAp]ブロック関連のField定義
	public MCPanel DtlApPanel = null;
	public MCTitledBorder DtlApTitledBorder = null;
	public MCScrollPane DtlApScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0280.DtlApR> DtlApTable = null;
	// [DtlAp]ブロックの項目のField定義
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAp_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAp_ap_dpt_nm = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAp_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAp_asppl_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_init_bal_p_PPanel;
	public MCColumnConfig columnDtlAp_init_bal;// [DtlAp]の[init_bal_p.amt]を[columnDtlAp_init_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_purc_amt_p_PPanel;
	public MCColumnConfig columnDtlAp_purc_amt;// [DtlAp]の[purc_amt_p.amt]を[columnDtlAp_purc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_cash_amt_p_PPanel;
	public MCColumnConfig columnDtlAp_cash_amt;// [DtlAp]の[cash_amt_p.amt]を[columnDtlAp_cash_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_note_amt_p_PPanel;
	public MCColumnConfig columnDtlAp_note_amt;// [DtlAp]の[note_amt_p.amt]を[columnDtlAp_note_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_xfr_amt_p_PPanel;
	public MCColumnConfig columnDtlAp_xfr_amt;// [DtlAp]の[xfr_amt_p.amt]を[columnDtlAp_xfr_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_setoff_amt_p_PPanel;
	public MCColumnConfig columnDtlAp_setoff_amt;// [DtlAp]の[setoff_amt_p.amt]を[columnDtlAp_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_sw_amt_p_PPanel;
	public MCColumnConfig columnDtlAp_sw_amt;// [DtlAp]の[sw_amt_p.amt]を[columnDtlAp_sw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_end_bal_p_PPanel;
	public MCColumnConfig columnDtlAp_end_bal;// [DtlAp]の[end_bal_p.amt]を[columnDtlAp_end_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_backord_amt_p_PPanel;
	public MCColumnConfig columnDtlAp_backord_amt;// [DtlAp]の[backord_amt_p.amt]を[columnDtlAp_backord_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAp_cred_amt_p_PPanel;
	public MCColumnConfig columnDtlAp_cred_amt;// [DtlAp]の[cred_amt_p.amt]を[columnDtlAp_cred_amt]としてエイリアス定義。
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MS_MSBGL0280_Srch01]のCallerの作成 */
	protected MSBGP_CredDtlSrch_MC.MS_MSBGL0280_Srch01Caller createMS_MSBGL0280_Srch01() {
		MSBGP_CredDtlSrch_MC.MS_MSBGL0280_Srch01Caller<MSBGP_CredDtlSrch, MS_MSBGL0280_Srch01Bridge>
		caller = ((MSBGP_CredDtlSrch_MC)this).new MS_MSBGL0280_Srch01Caller<MSBGP_CredDtlSrch, MS_MSBGL0280_Srch01Bridge>(
					(MSBGP_CredDtlSrch)this, new MS_MSBGL0280_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0280_Srch01]の呼び出し */
	protected void callMS_MSBGL0280_Srch01() {
		MCCaller caller = createMS_MSBGL0280_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0280.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0280.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0280.DtlR> aDtlL;
	/** [DtlAp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0280.DtlApR> aDtlApL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0280.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0280.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0280.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0280.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBG.MSBGP0280.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0280.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0280.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0280.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBG.MSBGP0280.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0280.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBG.MSBGP0280.DtlR createDtlR() {
		return mcframe.clientMSBG.MSBGP0280.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0280.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0280.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * コピーによってaDtlApLを設定します。
	 *
	 * aDtlApLのインスタンスは変更されません。
	 *
	 * @param dataset DtlApL
	 */
	public void setDtlApL(MCList<mcframe.clientMSBG.MSBGP0280.DtlApR> aList) {
		if (getDtlApL() != aList) {
			getDtlApL().setAll(aList);
		}
	}

	/**
	 * [DtlAp]ブロックのコンテナaDtlApLを返します。
	 *
	 * @return DtlApL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0280.DtlApR> getDtlApL() {
		return aDtlApL;
	}

	/**
	 * aDtlApRを作成します。
	 *
	 * @return DtlApR
	 */
	public mcframe.clientMSBG.MSBGP0280.DtlApR createDtlApR() {
		return mcframe.clientMSBG.MSBGP0280.DtlApR.create();
	}

	/**
	 * aDtlApLを作成します。
	 *
	 * @return DtlApL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0280.DtlApR> createDtlApL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0280.DtlApR.class);
	}

	/**
	 * DtlApTableを初期化します。
	 */
	protected void createDtlApTable(){
		if(DtlApTable == null){
			DtlApTable = beansFactory.createTable2("DtlAp.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtlApL())) ret.add(getDtlApL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtlApL()) return "DtlAp";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("DtlAp")) return getDtlApL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(CndPanel);
		ret.add(HdrPanel);
		ret.add(Hdr_Cred_DtlPanel);
		ret.add(DtlPanel);
		ret.add(DtlApPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_CredDtlSrch_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aDtlApL = createDtlApL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_CredDtlSrch_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtlApL = createDtlApL();
		createDtlApTable();
		DtlApTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_CredDtlSrch_MC.jbCreateCnd((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbCreateHdr((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbCreateHdr_Cred_Dtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbCreateDtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbCreateDtlAp((MSBGP_CredDtlSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_CredDtlSrch p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_CredDtlSrch p) {
		p.Hdr_cred_limit_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().cred_limit_p());
		p.Hdr_cred_limit_p_PPanel.setName("Hdr.cred_limit_p");
		p.Hdr_cred_limit = p.Hdr_cred_limit_p_PPanel.Amt_amt;
		p.Hdr_cred_limit.addAliasName("Hdr.cred_limit", p);
		p.Hdr_ttl_cred_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_cred_amt_p());
		p.Hdr_ttl_cred_amt_p_PPanel.setName("Hdr.ttl_cred_amt_p");
		p.Hdr_ttl_cred_amt = p.Hdr_ttl_cred_amt_p_PPanel.Amt_amt;
		p.Hdr_ttl_cred_amt.addAliasName("Hdr.ttl_cred_amt", p);
		p.Hdr_cred_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().cred_bal_p());
		p.Hdr_cred_bal_p_PPanel.setName("Hdr.cred_bal_p");
		p.Hdr_cred_bal = p.Hdr_cred_bal_p_PPanel.Amt_amt;
		p.Hdr_cred_bal.addAliasName("Hdr.cred_bal", p);
		p.Hdr_ttl_end_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_end_bal_p());
		p.Hdr_ttl_end_bal_p_PPanel.setName("Hdr.ttl_end_bal_p");
		p.Hdr_ttl_end_bal = p.Hdr_ttl_end_bal_p_PPanel.Amt_amt;
		p.Hdr_ttl_end_bal.addAliasName("Hdr.ttl_end_bal", p);
		p.Hdr_ttl_init_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_init_bal_p());
		p.Hdr_ttl_init_bal_p_PPanel.setName("Hdr.ttl_init_bal_p");
		p.Hdr_ttl_init_bal = p.Hdr_ttl_init_bal_p_PPanel.Amt_amt;
		p.Hdr_ttl_init_bal.addAliasName("Hdr.ttl_init_bal", p);
		p.Hdr_ttl_sls_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_sls_p());
		p.Hdr_ttl_sls_p_PPanel.setName("Hdr.ttl_sls_p");
		p.Hdr_ttl_sls = p.Hdr_ttl_sls_p_PPanel.Amt_amt;
		p.Hdr_ttl_sls.addAliasName("Hdr.ttl_sls", p);
		p.Hdr_ttl_rcv_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_rcv_p());
		p.Hdr_ttl_rcv_p_PPanel.setName("Hdr.ttl_rcv_p");
		p.Hdr_ttl_rcv = p.Hdr_ttl_rcv_p_PPanel.Amt_amt;
		p.Hdr_ttl_rcv.addAliasName("Hdr.ttl_rcv", p);
		p.Hdr_ttl_adv_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_adv_p());
		p.Hdr_ttl_adv_p_PPanel.setName("Hdr.ttl_adv_p");
		p.Hdr_ttl_adv = p.Hdr_ttl_adv_p_PPanel.Amt_amt;
		p.Hdr_ttl_adv.addAliasName("Hdr.ttl_adv", p);
		p.Hdr_ttl_init_bal_ap_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_init_bal_ap_p());
		p.Hdr_ttl_init_bal_ap_p_PPanel.setName("Hdr.ttl_init_bal_ap_p");
		p.Hdr_ttl_init_bal_ap = p.Hdr_ttl_init_bal_ap_p_PPanel.Amt_amt;
		p.Hdr_ttl_init_bal_ap.addAliasName("Hdr.ttl_init_bal_ap", p);
		p.Hdr_ttl_purc_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_purc_p());
		p.Hdr_ttl_purc_p_PPanel.setName("Hdr.ttl_purc_p");
		p.Hdr_ttl_purc = p.Hdr_ttl_purc_p_PPanel.Amt_amt;
		p.Hdr_ttl_purc.addAliasName("Hdr.ttl_purc", p);
		p.Hdr_ttl_pay_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_pay_p());
		p.Hdr_ttl_pay_p_PPanel.setName("Hdr.ttl_pay_p");
		p.Hdr_ttl_pay = p.Hdr_ttl_pay_p_PPanel.Amt_amt;
		p.Hdr_ttl_pay.addAliasName("Hdr.ttl_pay", p);
		p.Hdr_ttl_adv_pay_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_adv_pay_p());
		p.Hdr_ttl_adv_pay_p_PPanel.setName("Hdr.ttl_adv_pay_p");
		p.Hdr_ttl_adv_pay = p.Hdr_ttl_adv_pay_p_PPanel.Amt_amt;
		p.Hdr_ttl_adv_pay.addAliasName("Hdr.ttl_adv_pay", p);
		p.Hdr_not_appl_note_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().not_appl_note_p());
		p.Hdr_not_appl_note_p_PPanel.setName("Hdr.not_appl_note_p");
		p.Hdr_not_appl_note = p.Hdr_not_appl_note_p_PPanel.Amt_amt;
		p.Hdr_not_appl_note.addAliasName("Hdr.not_appl_note", p);
		p.Hdr_not_appl_adv_note_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().not_appl_adv_note_p());
		p.Hdr_not_appl_adv_note_p_PPanel.setName("Hdr.not_appl_adv_note_p");
		p.Hdr_not_appl_adv_note = p.Hdr_not_appl_adv_note_p_PPanel.Amt_amt;
		p.Hdr_not_appl_adv_note.addAliasName("Hdr.not_appl_adv_note", p);
		p.Hdr_ttl_backord_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_backord_p());
		p.Hdr_ttl_backord_p_PPanel.setName("Hdr.ttl_backord_p");
		p.Hdr_ttl_backord = p.Hdr_ttl_backord_p_PPanel.Amt_amt;
		p.Hdr_ttl_backord.addAliasName("Hdr.ttl_backord", p);
		p.Hdr_ttl_qtn_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_qtn_p());
		p.Hdr_ttl_qtn_p_PPanel.setName("Hdr.ttl_qtn_p");
		p.Hdr_ttl_qtn = p.Hdr_ttl_qtn_p_PPanel.Amt_amt;
		p.Hdr_ttl_qtn.addAliasName("Hdr.ttl_qtn", p);
		p.Hdr_ttl_po_backord_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_po_backord_p());
		p.Hdr_ttl_po_backord_p_PPanel.setName("Hdr.ttl_po_backord_p");
		p.Hdr_ttl_po_backord = p.Hdr_ttl_po_backord_p_PPanel.Amt_amt;
		p.Hdr_ttl_po_backord.addAliasName("Hdr.ttl_po_backord", p);
	}

	/**
	 * [Hdr_Cred_Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr_Cred_Dtl(MSBGP_CredDtlSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBGP_CredDtlSrch p) {
		p.Dtl_init_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$init_bal_p);
		p.Dtl_init_bal_p_PPanel.setName("Dtl.init_bal_p");
		p.columnDtl_init_bal = p.Dtl_init_bal_p_PPanel.columnAmt_amt;
		p.columnDtl_init_bal.addAliasName("Dtl.init_bal", p);
		p.Dtl_sls_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$sls_amt_p);
		p.Dtl_sls_amt_p_PPanel.setName("Dtl.sls_amt_p");
		p.columnDtl_sls_amt = p.Dtl_sls_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_sls_amt.addAliasName("Dtl.sls_amt", p);
		p.Dtl_cash_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$cash_amt_p);
		p.Dtl_cash_amt_p_PPanel.setName("Dtl.cash_amt_p");
		p.columnDtl_cash_amt = p.Dtl_cash_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_cash_amt.addAliasName("Dtl.cash_amt", p);
		p.Dtl_note_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$note_amt_p);
		p.Dtl_note_amt_p_PPanel.setName("Dtl.note_amt_p");
		p.columnDtl_note_amt = p.Dtl_note_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_note_amt.addAliasName("Dtl.note_amt", p);
		p.Dtl_xfr_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$xfr_amt_p);
		p.Dtl_xfr_amt_p_PPanel.setName("Dtl.xfr_amt_p");
		p.columnDtl_xfr_amt = p.Dtl_xfr_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_xfr_amt.addAliasName("Dtl.xfr_amt", p);
		p.Dtl_setoff_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$setoff_amt_p);
		p.Dtl_setoff_amt_p_PPanel.setName("Dtl.setoff_amt_p");
		p.columnDtl_setoff_amt = p.Dtl_setoff_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_setoff_amt.addAliasName("Dtl.setoff_amt", p);
		p.Dtl_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$sw_amt_p);
		p.Dtl_sw_amt_p_PPanel.setName("Dtl.sw_amt_p");
		p.columnDtl_sw_amt = p.Dtl_sw_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_sw_amt.addAliasName("Dtl.sw_amt", p);
		p.Dtl_end_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$end_bal_p);
		p.Dtl_end_bal_p_PPanel.setName("Dtl.end_bal_p");
		p.columnDtl_end_bal = p.Dtl_end_bal_p_PPanel.columnAmt_amt;
		p.columnDtl_end_bal.addAliasName("Dtl.end_bal", p);
		p.Dtl_not_appl_no_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$not_appl_no_p);
		p.Dtl_not_appl_no_p_PPanel.setName("Dtl.not_appl_no_p");
		p.columnDtl_not_appl_note = p.Dtl_not_appl_no_p_PPanel.columnAmt_amt;
		p.columnDtl_not_appl_note.addAliasName("Dtl.not_appl_note", p);
		p.Dtl_backord_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$backord_amt_p);
		p.Dtl_backord_amt_p_PPanel.setName("Dtl.backord_amt_p");
		p.columnDtl_backord_amt = p.Dtl_backord_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_backord_amt.addAliasName("Dtl.backord_amt", p);
		p.Dtl_cred_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$cred_amt_p);
		p.Dtl_cred_amt_p_PPanel.setName("Dtl.cred_amt_p");
		p.columnDtl_cred_amt = p.Dtl_cred_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_cred_amt.addAliasName("Dtl.cred_amt", p);
		p.Dtl_qtn_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlR.$qtn_amt_p);
		p.Dtl_qtn_amt_p_PPanel.setName("Dtl.qtn_amt_p");
		p.columnDtl_qtn_amt = p.Dtl_qtn_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_qtn_amt.addAliasName("Dtl.qtn_amt", p);
	}

	/**
	 * [DtlAp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlAp(MSBGP_CredDtlSrch p) {
		p.DtlAp_init_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$init_bal_p);
		p.DtlAp_init_bal_p_PPanel.setName("DtlAp.init_bal_p");
		p.columnDtlAp_init_bal = p.DtlAp_init_bal_p_PPanel.columnAmt_amt;
		p.columnDtlAp_init_bal.addAliasName("DtlAp.init_bal", p);
		p.DtlAp_purc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$purc_amt_p);
		p.DtlAp_purc_amt_p_PPanel.setName("DtlAp.purc_amt_p");
		p.columnDtlAp_purc_amt = p.DtlAp_purc_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAp_purc_amt.addAliasName("DtlAp.purc_amt", p);
		p.DtlAp_cash_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$cash_amt_p);
		p.DtlAp_cash_amt_p_PPanel.setName("DtlAp.cash_amt_p");
		p.columnDtlAp_cash_amt = p.DtlAp_cash_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAp_cash_amt.addAliasName("DtlAp.cash_amt", p);
		p.DtlAp_note_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$note_amt_p);
		p.DtlAp_note_amt_p_PPanel.setName("DtlAp.note_amt_p");
		p.columnDtlAp_note_amt = p.DtlAp_note_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAp_note_amt.addAliasName("DtlAp.note_amt", p);
		p.DtlAp_xfr_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$xfr_amt_p);
		p.DtlAp_xfr_amt_p_PPanel.setName("DtlAp.xfr_amt_p");
		p.columnDtlAp_xfr_amt = p.DtlAp_xfr_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAp_xfr_amt.addAliasName("DtlAp.xfr_amt", p);
		p.DtlAp_setoff_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$setoff_amt_p);
		p.DtlAp_setoff_amt_p_PPanel.setName("DtlAp.setoff_amt_p");
		p.columnDtlAp_setoff_amt = p.DtlAp_setoff_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAp_setoff_amt.addAliasName("DtlAp.setoff_amt", p);
		p.DtlAp_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$sw_amt_p);
		p.DtlAp_sw_amt_p_PPanel.setName("DtlAp.sw_amt_p");
		p.columnDtlAp_sw_amt = p.DtlAp_sw_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAp_sw_amt.addAliasName("DtlAp.sw_amt", p);
		p.DtlAp_end_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$end_bal_p);
		p.DtlAp_end_bal_p_PPanel.setName("DtlAp.end_bal_p");
		p.columnDtlAp_end_bal = p.DtlAp_end_bal_p_PPanel.columnAmt_amt;
		p.columnDtlAp_end_bal.addAliasName("DtlAp.end_bal", p);
		p.DtlAp_backord_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$backord_amt_p);
		p.DtlAp_backord_amt_p_PPanel.setName("DtlAp.backord_amt_p");
		p.columnDtlAp_backord_amt = p.DtlAp_backord_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAp_backord_amt.addAliasName("DtlAp.backord_amt", p);
		p.DtlAp_cred_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0280.DtlApR.$cred_amt_p);
		p.DtlAp_cred_amt_p_PPanel.setName("DtlAp.cred_amt_p");
		p.columnDtlAp_cred_amt = p.DtlAp_cred_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAp_cred_amt.addAliasName("DtlAp.cred_amt", p);
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

	
	/** [Cnd_cred_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cred_cd_p = null;

	/**
	 * [Cnd_cred_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cred_cd_ListPutter() {
		if (Cnd_cred_cd_p == null) {
			Cnd_cred_cd_p = createCnd_cred_cd_ListPutter(Cnd_cred_cd, "cred_cd", "cred_nm");

		}
		return Cnd_cred_cd_p;
	}
	
	
	/** [Cnd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cur_cd_p = null;

	/**
	 * [Cnd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cur_cd_ListPutter() {
		if (Cnd_cur_cd_p == null) {
			Cnd_cur_cd_p = createCnd_cur_cd_ListPutter(Cnd_cur_cd, "cur_cd", "cur_nm");

		}
		return Cnd_cur_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_CredDtlSrch create(){
		MSBGP_CredDtlSrch p = new MSBGP_CredDtlSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_CredDtlSrch create(String name){
		MSBGP_CredDtlSrch p = new MSBGP_CredDtlSrch(name);
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
		MSBGP_CredDtlSrch_MC.jbfInitCnd((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbfInitHdr((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbfInitHdr_Cred_Dtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbfInitDtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbfInitDtlAp((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbInitCnd((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbInitHdr((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbInitHdr_Cred_Dtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbInitDtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.jbInitDtlAp((MSBGP_CredDtlSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_cred_cd_Label = p.beansFactory.createLabel("Cnd.cred_cd_Label");
		p.Cnd_cred_cd = p.beansFactory.createTextField("Cnd.cred_cd");
		p.Cnd_cred_cd.setLabel(p.Cnd_cred_cd_Label);
		p.Cnd_cred_nm = p.beansFactory.createTextField("Cnd.cred_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_cred_cd_Label = p.beansFactory.createLabel("Hdr.cred_cd_Label");
		p.Hdr_cred_cd = p.beansFactory.createTextField("Hdr.cred_cd");
		p.Hdr_cred_cd.setLabel(p.Hdr_cred_cd_Label);
		p.Hdr_cred_nm = p.beansFactory.createTextField("Hdr.cred_nm");
		p.Hdr_cur_cd_Label = p.beansFactory.createLabel("Hdr.cur_cd_Label");
		p.Hdr_cur_cd = p.beansFactory.createTextField("Hdr.cur_cd");
		p.Hdr_cur_cd.setLabel(p.Hdr_cur_cd_Label);
		p.Hdr_cur_nm = p.beansFactory.createTextField("Hdr.cur_nm");
		p.Hdr_amt_dec_place = p.beansFactory.createNumberField("Hdr.amt_dec_place");
		p.Hdr_exc_backord_flg = p.beansFactory.createCheckBox("Hdr.exc_backord_flg");
		p.Hdr_inc_qtn_flg = p.beansFactory.createCheckBox("Hdr.inc_qtn_flg");
		p.Hdr_exc_po_backord_flg = p.beansFactory.createCheckBox("Hdr.exc_po_backord_flg");
		p.Hdr_ttl_ym_Label = p.beansFactory.createLabel("Hdr.ttl_ym_Label");
		p.Hdr_ttl_ym = p.beansFactory.createDateField("Hdr.ttl_ym");
		p.Hdr_ttl_ym.setLabel(p.Hdr_ttl_ym_Label);
		p.Hdr_ttl_ym_ap_Label = p.beansFactory.createLabel("Hdr.ttl_ym_ap_Label");
		p.Hdr_ttl_ym_ap = p.beansFactory.createDateField("Hdr.ttl_ym_ap");
		p.Hdr_ttl_ym_ap.setLabel(p.Hdr_ttl_ym_ap_Label);
		p.Hdr_lbl2 = p.beansFactory.createLabel("Hdr.lbl2");
		p.Hdr_lbl3 = p.beansFactory.createLabel("Hdr.lbl3");
	}

	/**
	 * [Hdr_Cred_Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr_Cred_Dtl(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.Hdr_Cred_DtlPanel = p.beansFactory.createPanel("Hdr_Cred_Dtl");
		p.Hdr_Cred_DtlTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_ar_dpt_cd = p.beansFactory.createTableColumn("Dtl.ar_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ar_dpt_nm = p.beansFactory.createTableColumn("Dtl.ar_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_acst_cd = p.beansFactory.createTableColumn("Dtl.acst_cd", MCColumnType.TEXT);
		p.columnDtl_acst_nm = p.beansFactory.createTableColumn("Dtl.acst_nm", MCColumnType.TEXT);
	}

	/**
	 * [DtlAp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlAp(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.DtlApPanel = p.beansFactory.createPanel("DtlAp");
		p.DtlApTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlApScrollPane = p.beansFactory.createScrollPane("DtlAp.scroll");
		p.createDtlApTable();
		// ブロックの項目の初期化
		p.columnDtlAp_ap_dpt_cd = p.beansFactory.createTableColumn("DtlAp.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtlAp_ap_dpt_nm = p.beansFactory.createTableColumn("DtlAp.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtlAp_asppl_cd = p.beansFactory.createTableColumn("DtlAp.asppl_cd", MCColumnType.TEXT);
		p.columnDtlAp_asppl_nm = p.beansFactory.createTableColumn("DtlAp.asppl_nm", MCColumnType.TEXT);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_cred_cd_Label);
		p.CndPanel.add(p.Cnd_cred_cd);
		p.CndPanel.setLastBeans(p.Cnd_cred_cd);
		p.Cnd_cred_cd.setNextBeans(p.Cnd_cred_nm);
		p.Cnd_cred_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0280.CndR.cred_cd_META);
		p.Cnd_cred_cd.addLinkBeans(p.Cnd_cred_nm);
		p.Cnd_cred_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_cred_nm);
		p.Cnd_cred_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_cred_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0280.CndR.cred_nm_META);
		p.Cnd_cur_cd.setListType(MCListType.STRICT);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0280.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0280.CndR.cur_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr_Cred_DtlPanel);
		p.HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_cred_cd_Label);
		p.HdrPanel.add(p.Hdr_cred_cd);
		p.HdrPanel.setLastBeans(p.Hdr_cred_cd);
		p.Hdr_cred_cd.setNextBeans(p.Hdr_cred_nm);
		p.Hdr_cred_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.cred_cd_META);
		p.HdrPanel.add(p.Hdr_cred_nm);
		p.Hdr_cred_nm.setNextBeans(p.Hdr_cur_cd);
		p.Hdr_cred_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.cred_nm_META);
		p.HdrPanel.add(p.Hdr_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_cur_cd);
		p.Hdr_cur_cd.setNextBeans(p.Hdr_cur_nm);
		p.Hdr_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.cur_cd_META);
		p.HdrPanel.add(p.Hdr_cur_nm);
		p.Hdr_cur_nm.setNextBeans(p.Hdr_amt_dec_place);
		p.Hdr_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.cur_nm_META);
		p.HdrPanel.add(p.Hdr_amt_dec_place);
		p.Hdr_amt_dec_place.setNextBeans(p.Hdr_cred_limit_p_PPanel);
		p.Hdr_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_cred_limit_p_PPanel);
		p.Hdr_cred_limit_p_PPanel.setNextBeans(p.Hdr_ttl_cred_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_ttl_cred_amt_p_PPanel);
		p.Hdr_ttl_cred_amt_p_PPanel.setNextBeans(p.Hdr_cred_bal_p_PPanel);
		p.HdrPanel.add(p.Hdr_cred_bal_p_PPanel);
		p.Hdr_cred_bal_p_PPanel.setNextBeans(p.Hdr_exc_backord_flg);
		p.HdrPanel.add(p.Hdr_exc_backord_flg);
		p.Hdr_exc_backord_flg.setNextBeans(p.Hdr_inc_qtn_flg);
		p.Hdr_exc_backord_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.exc_backord_flg_META);
		p.HdrPanel.add(p.Hdr_inc_qtn_flg);
		p.Hdr_inc_qtn_flg.setNextBeans(p.Hdr_exc_po_backord_flg);
		p.Hdr_inc_qtn_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.inc_qtn_flg_META);
		p.HdrPanel.add(p.Hdr_exc_po_backord_flg);
		p.Hdr_exc_po_backord_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.exc_po_backord_flg_META);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_ym_Label);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_ym);
		p.Hdr_Cred_DtlPanel.setLastBeans(p.Hdr_ttl_ym);
		p.Hdr_ttl_ym.setNextBeans(p.Hdr_ttl_ym_ap);
		p.Hdr_ttl_ym.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.ttl_ym_META);
		p.Hdr_ttl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_ym_ap_Label);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_ym_ap);
		p.Hdr_ttl_ym_ap.setNextBeans(p.Hdr_ttl_end_bal_p_PPanel);
		p.Hdr_ttl_ym_ap.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0280.HdrR.ttl_ym_ap_META);
		p.Hdr_ttl_ym_ap.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_end_bal_p_PPanel);
		p.Hdr_ttl_end_bal_p_PPanel.setNextBeans(p.Hdr_ttl_init_bal_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_lbl2);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_init_bal_p_PPanel);
		p.Hdr_ttl_init_bal_p_PPanel.setNextBeans(p.Hdr_ttl_sls_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_sls_p_PPanel);
		p.Hdr_ttl_sls_p_PPanel.setNextBeans(p.Hdr_ttl_rcv_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_rcv_p_PPanel);
		p.Hdr_ttl_rcv_p_PPanel.setNextBeans(p.Hdr_ttl_adv_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_adv_p_PPanel);
		p.Hdr_ttl_adv_p_PPanel.setNextBeans(p.Hdr_ttl_init_bal_ap_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_init_bal_ap_p_PPanel);
		p.Hdr_ttl_init_bal_ap_p_PPanel.setNextBeans(p.Hdr_ttl_purc_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_purc_p_PPanel);
		p.Hdr_ttl_purc_p_PPanel.setNextBeans(p.Hdr_ttl_pay_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_pay_p_PPanel);
		p.Hdr_ttl_pay_p_PPanel.setNextBeans(p.Hdr_ttl_adv_pay_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_adv_pay_p_PPanel);
		p.Hdr_ttl_adv_pay_p_PPanel.setNextBeans(p.Hdr_not_appl_note_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_lbl3);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_not_appl_note_p_PPanel);
		p.Hdr_not_appl_note_p_PPanel.setNextBeans(p.Hdr_not_appl_adv_note_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_not_appl_adv_note_p_PPanel);
		p.Hdr_not_appl_adv_note_p_PPanel.setNextBeans(p.Hdr_ttl_backord_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_backord_p_PPanel);
		p.Hdr_ttl_backord_p_PPanel.setNextBeans(p.Hdr_ttl_qtn_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_qtn_p_PPanel);
		p.Hdr_ttl_qtn_p_PPanel.setNextBeans(p.Hdr_ttl_po_backord_p_PPanel);
		p.Hdr_Cred_DtlPanel.add(p.Hdr_ttl_po_backord_p_PPanel);
	}

	/**
	 * [Hdr_Cred_Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr_Cred_Dtl(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.Hdr_Cred_DtlPanel.setBorder(p.Hdr_Cred_DtlTitledBorder);
		p.add(p.Hdr_Cred_DtlPanel);
		p.Hdr_Cred_DtlPanel.setNextBeans(p.DtlPanel);
		p.Hdr_Cred_DtlPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.DtlPanel.setBorder(p.DtlTitledBorder);
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlApPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlAp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlAp(MSBGP_CredDtlSrch p) {
		// ブロック関連の初期化
		p.DtlApPanel.setBorder(p.DtlApTitledBorder);
		p.add(p.DtlApPanel);
		p.DtlApPanel.add(p.DtlApScrollPane);
		p.DtlApPanel.setLastBeans(p.DtlApTable);
		p.DtlApScrollPane.setViewportView(p.DtlApTable);
		p.DtlApTable.setList(p.getDtlApL());
		p.DtlApPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBGP_CredDtlSrch_MC.mcInitCnd((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.mcInitHdr((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.mcInitHdr_Cred_Dtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.mcInitDtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.mcInitDtlAp((MSBGP_CredDtlSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_CredDtlSrch_MC.statusInitSRCH_Cnd((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.statusInitSRCH_Hdr((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.statusInitSRCH_Hdr__Cred__Dtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.statusInitSRCH_Dtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.statusInitSRCH_DtlAp((MSBGP_CredDtlSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_CredDtlSrch_MC.statusInitREF_Cnd((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.statusInitREF_Hdr((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.statusInitREF_Hdr__Cred__Dtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.statusInitREF_Dtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.statusInitREF_DtlAp((MSBGP_CredDtlSrch)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_CredDtlSrch p) {
		p.Cnd_cred_cd.setListListener(p);
		p.Cnd_cred_cd.addAllListener(p);
		p.Cnd_cred_nm.setListListener(p);
		p.Cnd_cred_nm.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_CredDtlSrch p) {
		p.Hdr_cred_cd.setListListener(p);
		p.Hdr_cred_cd.addAllListener(p);
		p.Hdr_cred_nm.setListListener(p);
		p.Hdr_cred_nm.addAllListener(p);
		p.Hdr_cur_cd.setListListener(p);
		p.Hdr_cur_cd.addAllListener(p);
		p.Hdr_cur_nm.setListListener(p);
		p.Hdr_cur_nm.addAllListener(p);
		p.Hdr_amt_dec_place.setListListener(p);
		p.Hdr_amt_dec_place.addAllListener(p);
		p.Hdr_exc_backord_flg.addAllListener(p);
		p.Hdr_inc_qtn_flg.addAllListener(p);
		p.Hdr_exc_po_backord_flg.addAllListener(p);
		p.Hdr_ttl_ym.setListListener(p);
		p.Hdr_ttl_ym.addAllListener(p);
		p.Hdr_ttl_ym_ap.setListListener(p);
		p.Hdr_ttl_ym_ap.addAllListener(p);
	}

	/**
	 *  [Hdr_Cred_Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr_Cred_Dtl(MSBGP_CredDtlSrch p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBGP_CredDtlSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_ar_dpt_cd.addAllListener(p);
		p.columnDtl_ar_dpt_cd.setListListener(p);
		p.columnDtl_ar_dpt_nm.addAllListener(p);
		p.columnDtl_ar_dpt_nm.setListListener(p);
		p.columnDtl_acst_cd.addAllListener(p);
		p.columnDtl_acst_cd.setListListener(p);
		p.columnDtl_acst_nm.addAllListener(p);
		p.columnDtl_acst_nm.setListListener(p);
	}

	/**
	 *  [DtlAp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlAp(MSBGP_CredDtlSrch p) {
		p.DtlApTable.addAllListener(p);
		p.columnDtlAp_ap_dpt_cd.addAllListener(p);
		p.columnDtlAp_ap_dpt_cd.setListListener(p);
		p.columnDtlAp_ap_dpt_nm.addAllListener(p);
		p.columnDtlAp_ap_dpt_nm.setListListener(p);
		p.columnDtlAp_asppl_cd.addAllListener(p);
		p.columnDtlAp_asppl_cd.setListListener(p);
		p.columnDtlAp_asppl_nm.addAllListener(p);
		p.columnDtlAp_asppl_nm.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_CredDtlSrch p){
		p.Cnd_cred_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cred_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_cur_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBGP_CredDtlSrch p){
		p.Hdr_cred_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cred_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cred_limit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_cred_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_exc_backord_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inc_qtn_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_exc_po_backord_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ttl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ttl_ym_ap.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ttl_end_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_init_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_sls_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_rcv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_adv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_init_bal_ap_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_purc_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_pay_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_adv_pay_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_appl_note_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_appl_adv_note_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_backord_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_qtn_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_po_backord_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Hdr_Cred_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr__Cred__Dtl(MSBGP_CredDtlSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBGP_CredDtlSrch p){
		p.columnDtl_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_init_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sls_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cash_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_note_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_xfr_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_setoff_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_end_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_not_appl_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_backord_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cred_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_qtn_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlAp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlAp(MSBGP_CredDtlSrch p){
		p.columnDtlAp_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAp_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAp_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAp_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlAp_init_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_purc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_cash_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_note_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_xfr_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_setoff_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_end_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_backord_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_cred_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_CredDtlSrch p){
		p.Cnd_cred_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cred_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBGP_CredDtlSrch p){
		p.Hdr_cred_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cred_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cred_limit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_cred_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_exc_backord_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Hdr_inc_qtn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Hdr_exc_po_backord_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Hdr_ttl_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ttl_ym_ap.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ttl_end_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_init_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_sls_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_rcv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_adv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_init_bal_ap_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_purc_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_pay_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_adv_pay_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_appl_note_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_not_appl_adv_note_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_backord_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_qtn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_po_backord_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Hdr_Cred_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr__Cred__Dtl(MSBGP_CredDtlSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBGP_CredDtlSrch p){
		p.columnDtl_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_acst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_init_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sls_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cash_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_note_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_xfr_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_setoff_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sw_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_end_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_not_appl_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_backord_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cred_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_qtn_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlAp]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlAp(MSBGP_CredDtlSrch p){
		p.columnDtlAp_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlAp_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlAp_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlAp_asppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlAp_init_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_purc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_cash_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_note_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_xfr_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_setoff_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_sw_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_end_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_backord_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAp_cred_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBGP_CredDtlSrch_MC.setTableConfigDtl((MSBGP_CredDtlSrch)this);
		MSBGP_CredDtlSrch_MC.setTableConfigDtlAp((MSBGP_CredDtlSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBGP_CredDtlSrch p) {
		p.columnDtl_ar_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0280.DtlR.ar_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_cd);
		p.columnDtl_ar_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0280.DtlR.ar_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_nm);
		p.columnDtl_acst_cd.setMeta(mcframe.clientMSBG.MSBGP0280.DtlR.acst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_cd);
		p.columnDtl_acst_nm.setMeta(mcframe.clientMSBG.MSBGP0280.DtlR.acst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_nm);
		p.DtlTable.addTable(p.Dtl_init_bal_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_sls_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_cash_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_note_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_xfr_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_setoff_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_sw_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_end_bal_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_not_appl_no_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_backord_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_cred_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_qtn_amt_p_PPanel.AmtTable);
	}

	/**
	 * [DtlAp]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlAp(MSBGP_CredDtlSrch p) {
		p.columnDtlAp_ap_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0280.DtlApR.ap_dpt_cd_META);
		p.DtlApTable.addColumnConfig(p.columnDtlAp_ap_dpt_cd);
		p.columnDtlAp_ap_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0280.DtlApR.ap_dpt_nm_META);
		p.DtlApTable.addColumnConfig(p.columnDtlAp_ap_dpt_nm);
		p.columnDtlAp_asppl_cd.setMeta(mcframe.clientMSBG.MSBGP0280.DtlApR.asppl_cd_META);
		p.DtlApTable.addColumnConfig(p.columnDtlAp_asppl_cd);
		p.columnDtlAp_asppl_nm.setMeta(mcframe.clientMSBG.MSBGP0280.DtlApR.asppl_nm_META);
		p.DtlApTable.addColumnConfig(p.columnDtlAp_asppl_nm);
		p.DtlApTable.addTable(p.DtlAp_init_bal_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_purc_amt_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_cash_amt_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_note_amt_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_xfr_amt_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_setoff_amt_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_sw_amt_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_end_bal_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_backord_amt_p_PPanel.AmtTable);
		p.DtlApTable.addTable(p.DtlAp_cred_amt_p_PPanel.AmtTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_cred_cd.getListConfig().setPutter(getCnd_cred_cd_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_cred_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cred_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_cred_cd) return getCnd_cred_cd(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == DtlApTable) return doDtlAp_VC(info);
		if (vc == Cnd_cred_cd) return doCnd_cred_cd_VC(info);
		if (vc == Cnd_cred_nm) return doCnd_cred_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Hdr_cred_cd) return doHdr_cred_cd_VC(info);
		if (vc == Hdr_cred_nm) return doHdr_cred_nm_VC(info);
		if (vc == Hdr_cur_cd) return doHdr_cur_cd_VC(info);
		if (vc == Hdr_cur_nm) return doHdr_cur_nm_VC(info);
		if (vc == Hdr_amt_dec_place) return doHdr_amt_dec_place_VC(info);
		if (vc == Hdr_exc_backord_flg) return doHdr_exc_backord_flg_VC(info);
		if (vc == Hdr_inc_qtn_flg) return doHdr_inc_qtn_flg_VC(info);
		if (vc == Hdr_exc_po_backord_flg) return doHdr_exc_po_backord_flg_VC(info);
		if (vc == Hdr_ttl_ym) return doHdr_ttl_ym_VC(info);
		if (vc == Hdr_ttl_ym_ap) return doHdr_ttl_ym_ap_VC(info);
		if (vc == columnDtl_ar_dpt_cd) return doDtl_ar_dpt_cd_VC(info);
		if (vc == columnDtl_ar_dpt_nm) return doDtl_ar_dpt_nm_VC(info);
		if (vc == columnDtl_acst_cd) return doDtl_acst_cd_VC(info);
		if (vc == columnDtl_acst_nm) return doDtl_acst_nm_VC(info);
		if (vc == columnDtlAp_ap_dpt_cd) return doDtlAp_ap_dpt_cd_VC(info);
		if (vc == columnDtlAp_ap_dpt_nm) return doDtlAp_ap_dpt_nm_VC(info);
		if (vc == columnDtlAp_asppl_cd) return doDtlAp_asppl_cd_VC(info);
		if (vc == columnDtlAp_asppl_nm) return doDtlAp_asppl_nm_VC(info);
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAp]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cred_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cred_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[exc_backord_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_exc_backord_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[inc_qtn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_inc_qtn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[exc_po_backord_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_exc_po_backord_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ttl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ttl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ttl_ym_ap]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ttl_ym_ap_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAp_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAp_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAp]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAp_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAp]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAp_asppl_nm_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == DtlApTable) doDtlAp_NC(info);
		else if (nc == Cnd_cred_cd) doCnd_cred_cd_NC(info);
		else if (nc == Cnd_cred_nm) doCnd_cred_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Hdr_cred_cd) doHdr_cred_cd_NC(info);
		else if (nc == Hdr_cred_nm) doHdr_cred_nm_NC(info);
		else if (nc == Hdr_cur_cd) doHdr_cur_cd_NC(info);
		else if (nc == Hdr_cur_nm) doHdr_cur_nm_NC(info);
		else if (nc == Hdr_amt_dec_place) doHdr_amt_dec_place_NC(info);
		else if (nc == Hdr_exc_backord_flg) doHdr_exc_backord_flg_NC(info);
		else if (nc == Hdr_inc_qtn_flg) doHdr_inc_qtn_flg_NC(info);
		else if (nc == Hdr_exc_po_backord_flg) doHdr_exc_po_backord_flg_NC(info);
		else if (nc == Hdr_ttl_ym) doHdr_ttl_ym_NC(info);
		else if (nc == Hdr_ttl_ym_ap) doHdr_ttl_ym_ap_NC(info);
		else if (nc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NC(info);
		else if (nc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NC(info);
		else if (nc == columnDtl_acst_cd) doDtl_acst_cd_NC(info);
		else if (nc == columnDtl_acst_nm) doDtl_acst_nm_NC(info);
		else if (nc == columnDtlAp_ap_dpt_cd) doDtlAp_ap_dpt_cd_NC(info);
		else if (nc == columnDtlAp_ap_dpt_nm) doDtlAp_ap_dpt_nm_NC(info);
		else if (nc == columnDtlAp_asppl_cd) doDtlAp_asppl_cd_NC(info);
		else if (nc == columnDtlAp_asppl_nm) doDtlAp_asppl_nm_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [DtlAp]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cred_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cred_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[exc_backord_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_exc_backord_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inc_qtn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inc_qtn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[exc_po_backord_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_exc_po_backord_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_ym_ap]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_ym_ap_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == DtlApTable) doDtlAp_NE(info);
		else if (ne == Cnd_cred_cd) doCnd_cred_cd_NE(info);
		else if (ne == Cnd_cred_nm) doCnd_cred_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Hdr_cred_cd) doHdr_cred_cd_NE(info);
		else if (ne == Hdr_cred_nm) doHdr_cred_nm_NE(info);
		else if (ne == Hdr_cur_cd) doHdr_cur_cd_NE(info);
		else if (ne == Hdr_cur_nm) doHdr_cur_nm_NE(info);
		else if (ne == Hdr_amt_dec_place) doHdr_amt_dec_place_NE(info);
		else if (ne == Hdr_exc_backord_flg) doHdr_exc_backord_flg_NE(info);
		else if (ne == Hdr_inc_qtn_flg) doHdr_inc_qtn_flg_NE(info);
		else if (ne == Hdr_exc_po_backord_flg) doHdr_exc_po_backord_flg_NE(info);
		else if (ne == Hdr_ttl_ym) doHdr_ttl_ym_NE(info);
		else if (ne == Hdr_ttl_ym_ap) doHdr_ttl_ym_ap_NE(info);
		else if (ne == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NE(info);
		else if (ne == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NE(info);
		else if (ne == columnDtl_acst_cd) doDtl_acst_cd_NE(info);
		else if (ne == columnDtl_acst_nm) doDtl_acst_nm_NE(info);
		else if (ne == columnDtlAp_ap_dpt_cd) doDtlAp_ap_dpt_cd_NE(info);
		else if (ne == columnDtlAp_ap_dpt_nm) doDtlAp_ap_dpt_nm_NE(info);
		else if (ne == columnDtlAp_asppl_cd) doDtlAp_asppl_cd_NE(info);
		else if (ne == columnDtlAp_asppl_nm) doDtlAp_asppl_nm_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [DtlAp]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cred_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cred_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[exc_backord_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_exc_backord_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inc_qtn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inc_qtn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[exc_po_backord_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_exc_po_backord_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_ym_ap]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_ym_ap_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == DtlApTable) doDtlAp_NX(info);
		else if (nx == Cnd_cred_cd) doCnd_cred_cd_NX(info);
		else if (nx == Cnd_cred_nm) doCnd_cred_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Hdr_cred_cd) doHdr_cred_cd_NX(info);
		else if (nx == Hdr_cred_nm) doHdr_cred_nm_NX(info);
		else if (nx == Hdr_cur_cd) doHdr_cur_cd_NX(info);
		else if (nx == Hdr_cur_nm) doHdr_cur_nm_NX(info);
		else if (nx == Hdr_amt_dec_place) doHdr_amt_dec_place_NX(info);
		else if (nx == Hdr_exc_backord_flg) doHdr_exc_backord_flg_NX(info);
		else if (nx == Hdr_inc_qtn_flg) doHdr_inc_qtn_flg_NX(info);
		else if (nx == Hdr_exc_po_backord_flg) doHdr_exc_po_backord_flg_NX(info);
		else if (nx == Hdr_ttl_ym) doHdr_ttl_ym_NX(info);
		else if (nx == Hdr_ttl_ym_ap) doHdr_ttl_ym_ap_NX(info);
		else if (nx == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NX(info);
		else if (nx == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NX(info);
		else if (nx == columnDtl_acst_cd) doDtl_acst_cd_NX(info);
		else if (nx == columnDtl_acst_nm) doDtl_acst_nm_NX(info);
		else if (nx == columnDtlAp_ap_dpt_cd) doDtlAp_ap_dpt_cd_NX(info);
		else if (nx == columnDtlAp_ap_dpt_nm) doDtlAp_ap_dpt_nm_NX(info);
		else if (nx == columnDtlAp_asppl_cd) doDtlAp_asppl_cd_NX(info);
		else if (nx == columnDtlAp_asppl_nm) doDtlAp_asppl_nm_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [DtlAp]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cred_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cred_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[exc_backord_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_exc_backord_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inc_qtn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inc_qtn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[exc_po_backord_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_exc_po_backord_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_ym_ap]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_ym_ap_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_cred_cd) doCnd_cred_cd_LC(info);
		else if (lc == Cnd_cred_nm) doCnd_cred_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Hdr_cred_cd) doHdr_cred_cd_LC(info);
		else if (lc == Hdr_cred_nm) doHdr_cred_nm_LC(info);
		else if (lc == Hdr_cur_cd) doHdr_cur_cd_LC(info);
		else if (lc == Hdr_cur_nm) doHdr_cur_nm_LC(info);
		else if (lc == Hdr_amt_dec_place) doHdr_amt_dec_place_LC(info);
		else if (lc == Hdr_ttl_ym) doHdr_ttl_ym_LC(info);
		else if (lc == Hdr_ttl_ym_ap) doHdr_ttl_ym_ap_LC(info);
		else if (lc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_LC(info);
		else if (lc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_LC(info);
		else if (lc == columnDtl_acst_cd) doDtl_acst_cd_LC(info);
		else if (lc == columnDtl_acst_nm) doDtl_acst_nm_LC(info);
		else if (lc == columnDtlAp_ap_dpt_cd) doDtlAp_ap_dpt_cd_LC(info);
		else if (lc == columnDtlAp_ap_dpt_nm) doDtlAp_ap_dpt_nm_LC(info);
		else if (lc == columnDtlAp_asppl_cd) doDtlAp_asppl_cd_LC(info);
		else if (lc == columnDtlAp_asppl_nm) doDtlAp_asppl_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[cred_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cred_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cred_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_ym_ap]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_ym_ap_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAp]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAp_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_cred_cd]の作成メソッド
	 */
	public MCList getCnd_cred_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0280.Srch01")) {
			return new MS_MSBGL0280_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0280_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0280_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0280_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0280_Srch01Bridge() {
			p_MS_MSBGL0280_Srch01 = new MCParam(PDef.MS_MSBGL0280_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0280_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0280.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0280.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0280.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0280.DtlApR.class));

			p_MS_MSBGL0280_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0280_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0280_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0280_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0280_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0280.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0280.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0280.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0280.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0280.DtlR> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0280.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0280.DtlApR> down2() {
			return (MCList<mcframe.clientMSBG.MSBGP0280.DtlApR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0280_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0280.HdrR.create());
			p_MS_MSBGL0280_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0280.DtlR.class));
			p_MS_MSBGL0280_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0280.DtlApR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0280_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0280.HdrR)p_MS_MSBGL0280_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBG.MSBGP0280.DtlR>)p_MS_MSBGL0280_Srch01.getContainerParam().getDownBlock(1));
			setDtlApL((MCList<mcframe.clientMSBG.MSBGP0280.DtlApR>)p_MS_MSBGL0280_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getDtlApL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtlApL());
			return result;
		}
	}
}