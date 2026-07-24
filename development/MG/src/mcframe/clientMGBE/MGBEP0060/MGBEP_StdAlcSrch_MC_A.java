package mcframe.clientMGBE.MGBEP0060;

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
import mcframe.clientMGBE.MGBEP0060.MGBEP_StdAlcSrch_MC.MG_MGBEL0060_Srch01Caller;

/**
 * 画面"MGBEP_StdAlcSrch"パネルクラスです。<p>
 *
 * 各品目に配賦された費用情報を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBEP_StdAlcSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBEP0060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H Cnd_calc_p_PPanel;
	public MCTextComboBox Cnd_calc_no;	// [Cnd]の[calc_p.calc_no]を[Cnd_calc_no]としてエイリアス定義。
	public MCTextField Cnd_rmrks;	// [Cnd]の[calc_p.rmrks]を[Cnd_rmrks]としてエイリアス定義。
	/**
	 * Term 期.<p>
	 *
	 */
	public MCDateField Cnd_term = null;
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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_loc_flg = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	/**
	 * Without supplier 発注先無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_sppl_flg = null;
	public MCLabel Cnd_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_cst_nm = null;
	/**
	 * No customer 得意先無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_cst_flg = null;
	public MCLabel Cnd_dlv_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_nm = null;
	/**
	 * No delivery destination 納品先無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_dlv_flg = null;
	public MCLabel Cnd_dest_cd1_Label = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm1 = null;
	/**
	 * Without distribution channel 1 仕向先１無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_dest1_flg = null;
	public MCLabel Cnd_dest_cd2_Label = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm2 = null;
	/**
	 * Without distribution channel 2 仕向先２無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_dest2_flg = null;
	public MCLabel Cnd_dest_cd3_Label = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm3 = null;
	/**
	 * Without distribution channel 3 仕向先３無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_dest3_flg = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	/**
	 * Without dept. 部門無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_dpt_flg = null;
	public MCLabel Cnd_expns_grp_cd_Label = null;
	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_expns_grp_cd = null;
	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public MCTextField Cnd_expns_grp_nm = null;
	public MCLabel Cnd_expns_cd_Label = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCTextField Cnd_expns_nm = null;
	public MCLabel Cnd_expns_typ_Label = null;
	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_expns_typ = null;
	/**
	 * Cost element type name 費目区分名.<p>
	 *
	 */
	public MCTextField Cnd_expns_typ_nm = null;
	/**
	 * Include allocation amount = 0 配賦金額＝０含む.<p>
	 *
	 */
	public MCCheckBox Cnd_amt_zero_flg = null;
	public MCLabel Cnd_alc_ac_cd_Label = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_nm = null;
	public MCLabel Cnd_alc_ac_grp_cd1_Label = null;
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd1 = null;
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm1 = null;
	public MCLabel Cnd_alc_ac_grp_cd2_Label = null;
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd2 = null;
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm2 = null;
	public MCLabel Cnd_alc_ac_grp_cd3_Label = null;
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd3 = null;
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm3 = null;
	public MCLabel Cnd_dpt_cd2_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd2 = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm2 = null;
	/**
	 * Without dept. 部門無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_dpt2_flg = null;
	public MCLabel Cnd_loc_cd2_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd2 = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm2 = null;
	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_loc2_flg = null;
	public MCLabel Cnd_oper_cd_Label = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCTextField Cnd_oper_nm = null;
	/**
	 * Without operation 工程無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_oper_flg = null;
	public MCLabel Cnd_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Cnd_bp_nm = null;
	/**
	 * Without BP 取引先無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_bp_flg = null;
	public MCLabel Cnd_ctg_cd_Label = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCTextField Cnd_ctg_nm = null;
	/**
	 * Without item category 品群無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_ctg_flg = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm2_p_PPanel;
	public MCTextField Cnd_itm_cd2;	// [Cnd]の[itm2_p.itm_cd]を[Cnd_itm_cd2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1_2;	// [Cnd]の[itm2_p.itm_sub1]を[Cnd_itm_sub1_2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2_2;	// [Cnd]の[itm2_p.itm_sub2]を[Cnd_itm_sub2_2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3_2;	// [Cnd]の[itm2_p.itm_sub3]を[Cnd_itm_sub3_2]としてエイリアス定義。
	public MCTextField Cnd_itm_nm2;	// [Cnd]の[itm2_p.itm_nm]を[Cnd_itm_nm2]としてエイリアス定義。
	/**
	 * Without item 品目無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_itm2_flg = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBE.MGBEP0060.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_nm = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_nm = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_nm = null;
	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_grp_cd = null;
	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_grp_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expnsg_seq = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_seq = null;
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ptn_cd = null;
	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ptn_nm = null;
	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_amt = null;
	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_tgt_val = null;
	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_rate = null;
	/**
	 * Allocation coefficient value 配賦係数値.<p>
	 *
	 */
	public MCColumnConfig columnRslt_coef_val = null;
	/**
	 * Allocation target (Without coefficient) 配賦対象（係数無）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_org_tgt_val = null;
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
	
	/** [MG_MGBEL0060_Srch01]のCallerの作成 */
	protected MGBEP_StdAlcSrch_MC.MG_MGBEL0060_Srch01Caller createMG_MGBEL0060_Srch01() {
		MGBEP_StdAlcSrch_MC.MG_MGBEL0060_Srch01Caller<MGBEP_StdAlcSrch, MG_MGBEL0060_Srch01Bridge>
		caller = ((MGBEP_StdAlcSrch_MC)this).new MG_MGBEL0060_Srch01Caller<MGBEP_StdAlcSrch, MG_MGBEL0060_Srch01Bridge>(
					(MGBEP_StdAlcSrch)this, new MG_MGBEL0060_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBEL0060_Srch01]の呼び出し */
	protected void callMG_MGBEL0060_Srch01() {
		MCCaller caller = createMG_MGBEL0060_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBE.MGBEP0060.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBE.MGBEP0060.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBE.MGBEP0060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBE.MGBEP0060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBE.MGBEP0060.CndR createCndR() {
		return mcframe.clientMGBE.MGBEP0060.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBE.MGBEP0060.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0060.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBE.MGBEP0060.RsltR createRsltR() {
		return mcframe.clientMGBE.MGBEP0060.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0060.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBE.MGBEP0060.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
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
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("Rslt")) return getRsltL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdAlcSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBEP_StdAlcSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBEP_StdAlcSrch_MC.jbCreateTop((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbCreateFold((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbCreateTab1((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbCreateTab2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbCreateCnd((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbCreateCnd2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbCreateCtrl((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbCreateRslt((MGBEP_StdAlcSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBEP_StdAlcSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBEP_StdAlcSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBEP_StdAlcSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBEP_StdAlcSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBEP_StdAlcSrch p) {
		p.Cnd_calc_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_p());
		p.Cnd_calc_p_PPanel.setName("Cnd.calc_p");
		p.Cnd_calc_no = p.Cnd_calc_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
		p.Cnd_itm2_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm2_p());
		p.Cnd_itm2_p_PPanel.setName("Cnd.itm2_p");
		p.Cnd_itm_cd2 = p.Cnd_itm2_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd2.addAliasName("Cnd.itm_cd2", p);
		p.Cnd_itm_sub1_2 = p.Cnd_itm2_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1_2.addAliasName("Cnd.itm_sub1_2", p);
		p.Cnd_itm_sub2_2 = p.Cnd_itm2_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2_2.addAliasName("Cnd.itm_sub2_2", p);
		p.Cnd_itm_sub3_2 = p.Cnd_itm2_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3_2.addAliasName("Cnd.itm_sub3_2", p);
		p.Cnd_itm_nm2 = p.Cnd_itm2_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm2.addAliasName("Cnd.itm_nm2", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MGBEP_StdAlcSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBEP_StdAlcSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBEP_StdAlcSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBE.MGBEP0060.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Cnd_calc_grp_cd_p;
	}
	
	
	/** [Cnd_calc_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter Cnd_calc_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [Cnd_calc_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (Cnd_calc_p_PPanel_CalcNo_calc_no_p == null) {
			Cnd_calc_p_PPanel_CalcNo_calc_no_p = createCnd_calc_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks","term");
		}
		return Cnd_calc_p_PPanel_CalcNo_calc_no_p;
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
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd_p = null;

	/**
	 * [Cnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd_ListPutter() {
		if (Cnd_loc_cd_p == null) {
			Cnd_loc_cd_p = createCnd_loc_cd_ListPutter(Cnd_loc_cd, "loc_cd", "loc_nm");

		}
		return Cnd_loc_cd_p;
	}
	
	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
	}
	
	
	/** [Cnd_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_cd_p = null;

	/**
	 * [Cnd_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_cd_ListPutter() {
		if (Cnd_cst_cd_p == null) {
			Cnd_cst_cd_p = createCnd_cst_cd_ListPutter(Cnd_cst_cd, "cst_cd", "cst_nm");

		}
		return Cnd_cst_cd_p;
	}
	
	
	/** [Cnd_dlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_cd_p = null;

	/**
	 * [Cnd_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_cd_ListPutter() {
		if (Cnd_dlv_cd_p == null) {
			Cnd_dlv_cd_p = createCnd_dlv_cd_ListPutter(Cnd_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Cnd_dlv_cd_p;
	}
	
	
	/** [Cnd_dest_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd1_p = null;

	/**
	 * [Cnd_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd1_ListPutter() {
		if (Cnd_dest_cd1_p == null) {
			Cnd_dest_cd1_p = createCnd_dest_cd1_ListPutter(Cnd_dest_cd1, "dest_cd1", "dest_nm1");

		}
		return Cnd_dest_cd1_p;
	}
	
	
	/** [Cnd_dest_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd2_p = null;

	/**
	 * [Cnd_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd2_ListPutter() {
		if (Cnd_dest_cd2_p == null) {
			Cnd_dest_cd2_p = createCnd_dest_cd2_ListPutter(Cnd_dest_cd2, "dest_cd2", "dest_nm2");

		}
		return Cnd_dest_cd2_p;
	}
	
	
	/** [Cnd_dest_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd3_p = null;

	/**
	 * [Cnd_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd3_ListPutter() {
		if (Cnd_dest_cd3_p == null) {
			Cnd_dest_cd3_p = createCnd_dest_cd3_ListPutter(Cnd_dest_cd3, "dest_cd3", "dest_nm3");

		}
		return Cnd_dest_cd3_p;
	}
	
	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
	}
	
	
	/** [Cnd_expns_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_expns_grp_cd_p = null;

	/**
	 * [Cnd_expns_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_expns_grp_cd_ListPutter() {
		if (Cnd_expns_grp_cd_p == null) {
			Cnd_expns_grp_cd_p = createCnd_expns_grp_cd_ListPutter(Cnd_expns_grp_cd, "expns_grp_cd", "expns_grp_nm");

		}
		return Cnd_expns_grp_cd_p;
	}
	
	
	/** [Cnd_expns_cd_ListPutter]の定義 */
	private MCListPutter Cnd_expns_cd_p = null;

	/**
	 * [Cnd_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_expns_cd_ListPutter() {
		if (Cnd_expns_cd_p == null) {
			Cnd_expns_cd_p = createCnd_expns_cd_ListPutter(Cnd_expns_cd, "expns_cd", "expns_nm");

		}
		return Cnd_expns_cd_p;
	}
	
	
	/** [Cnd_expns_typ_ListPutter]の定義 */
	private MCListPutter Cnd_expns_typ_p = null;

	/**
	 * [Cnd_expns_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_expns_typ_ListPutter() {
		if (Cnd_expns_typ_p == null) {
			Cnd_expns_typ_p = createCnd_expns_typ_ListPutter(Cnd_expns_typ, "expns_typ", "expns_typ_nm");

		}
		return Cnd_expns_typ_p;
	}
	
	
	/** [Cnd_alc_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_cd_p = null;

	/**
	 * [Cnd_alc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_cd_ListPutter() {
		if (Cnd_alc_ac_cd_p == null) {
			Cnd_alc_ac_cd_p = createCnd_alc_ac_cd_ListPutter(Cnd_alc_ac_cd, "alc_ac_cd", "alc_ac_nm");

		}
		return Cnd_alc_ac_cd_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd1_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd1_ListPutter() {
		if (Cnd_alc_ac_grp_cd1_p == null) {
			Cnd_alc_ac_grp_cd1_p = createCnd_alc_ac_grp_cd1_ListPutter(Cnd_alc_ac_grp_cd1, "alc_ac_grp_cd1", "alc_ac_grp_nm1");

		}
		return Cnd_alc_ac_grp_cd1_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd2_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd2_ListPutter() {
		if (Cnd_alc_ac_grp_cd2_p == null) {
			Cnd_alc_ac_grp_cd2_p = createCnd_alc_ac_grp_cd2_ListPutter(Cnd_alc_ac_grp_cd2, "alc_ac_grp_cd2", "alc_ac_grp_nm2");

		}
		return Cnd_alc_ac_grp_cd2_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd3_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd3_ListPutter() {
		if (Cnd_alc_ac_grp_cd3_p == null) {
			Cnd_alc_ac_grp_cd3_p = createCnd_alc_ac_grp_cd3_ListPutter(Cnd_alc_ac_grp_cd3, "alc_ac_grp_cd3", "alc_ac_grp_nm3");

		}
		return Cnd_alc_ac_grp_cd3_p;
	}
	
	
	/** [Cnd_dpt_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd2_p = null;

	/**
	 * [Cnd_dpt_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd2_ListPutter() {
		if (Cnd_dpt_cd2_p == null) {
			Cnd_dpt_cd2_p = createCnd_dpt_cd2_ListPutter(Cnd_dpt_cd2, "dpt_cd2", "dpt_nm2");

		}
		return Cnd_dpt_cd2_p;
	}
	
	
	/** [Cnd_loc_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd2_p = null;

	/**
	 * [Cnd_loc_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd2_ListPutter() {
		if (Cnd_loc_cd2_p == null) {
			Cnd_loc_cd2_p = createCnd_loc_cd2_ListPutter(Cnd_loc_cd2, "loc_cd2", "loc_nm2");

		}
		return Cnd_loc_cd2_p;
	}
	
	
	/** [Cnd_oper_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_cd_p = null;

	/**
	 * [Cnd_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_cd_ListPutter() {
		if (Cnd_oper_cd_p == null) {
			Cnd_oper_cd_p = createCnd_oper_cd_ListPutter(Cnd_oper_cd, "oper_cd", "oper_nm");

		}
		return Cnd_oper_cd_p;
	}
	
	
	/** [Cnd_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bp_cd_p = null;

	/**
	 * [Cnd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_cd_ListPutter() {
		if (Cnd_bp_cd_p == null) {
			Cnd_bp_cd_p = createCnd_bp_cd_ListPutter(Cnd_bp_cd, "bp_cd", "bp_nm");

		}
		return Cnd_bp_cd_p;
	}
	
	
	/** [Cnd_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ctg_cd_p = null;

	/**
	 * [Cnd_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ctg_cd_ListPutter() {
		if (Cnd_ctg_cd_p == null) {
			Cnd_ctg_cd_p = createCnd_ctg_cd_ListPutter(Cnd_ctg_cd, "ctg_cd", "ctg_nm");

		}
		return Cnd_ctg_cd_p;
	}
	
	
	/** [Cnd_itm2_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm2_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm2_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm2_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm2_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm2_p_PPanel_Itm_itm_cd_p = createCnd_itm2_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm2_p_PPanel.Itm_itm_cd, "itm_cd2", "itm_nm2","itm_sub1_2","itm_sub2_2","itm_sub3_2");
		}
		return Cnd_itm2_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm2_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm2_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm2_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm2_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm2_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm2_p_PPanel_Itm_itm_sub1_p = createCnd_itm2_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm2_p_PPanel.Itm_itm_sub1, "itm_sub1_2", "itm_nm2","itm_sub2_2","itm_sub3_2");
		}
		return Cnd_itm2_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm2_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm2_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm2_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm2_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm2_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm2_p_PPanel_Itm_itm_sub2_p = createCnd_itm2_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm2_p_PPanel.Itm_itm_sub2, "itm_sub2_2", "itm_nm2","itm_sub3_2");
		}
		return Cnd_itm2_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm2_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm2_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm2_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm2_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm2_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm2_p_PPanel_Itm_itm_sub3_p = createCnd_itm2_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm2_p_PPanel.Itm_itm_sub3, "itm_sub3_2", "itm_nm2");
		}
		return Cnd_itm2_p_PPanel_Itm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBEP_StdAlcSrch create(){
		MGBEP_StdAlcSrch p = new MGBEP_StdAlcSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBEP_StdAlcSrch create(String name){
		MGBEP_StdAlcSrch p = new MGBEP_StdAlcSrch(name);
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
		MGBEP_StdAlcSrch_MC.jbfInitTop((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbfInitFold((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbfInitTab1((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbfInitTab2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbfInitCnd((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbfInitCnd2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbfInitCtrl((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbfInitRslt((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbInitTop((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbInitFold((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbInitTab1((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbInitTab2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbInitCnd((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbInitCnd2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbInitCtrl((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.jbInitRslt((MGBEP_StdAlcSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_term = p.beansFactory.createDateField("Cnd.term");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_no_loc_flg = p.beansFactory.createCheckBox("Cnd.no_loc_flg");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_no_sppl_flg = p.beansFactory.createCheckBox("Cnd.no_sppl_flg");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_no_cst_flg = p.beansFactory.createCheckBox("Cnd.no_cst_flg");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_no_dlv_flg = p.beansFactory.createCheckBox("Cnd.no_dlv_flg");
		p.Cnd_dest_cd1_Label = p.beansFactory.createLabel("Cnd.dest_cd1_Label");
		p.Cnd_dest_cd1 = p.beansFactory.createTextField("Cnd.dest_cd1");
		p.Cnd_dest_cd1.setLabel(p.Cnd_dest_cd1_Label);
		p.Cnd_dest_nm1 = p.beansFactory.createTextField("Cnd.dest_nm1");
		p.Cnd_no_dest1_flg = p.beansFactory.createCheckBox("Cnd.no_dest1_flg");
		p.Cnd_dest_cd2_Label = p.beansFactory.createLabel("Cnd.dest_cd2_Label");
		p.Cnd_dest_cd2 = p.beansFactory.createTextField("Cnd.dest_cd2");
		p.Cnd_dest_cd2.setLabel(p.Cnd_dest_cd2_Label);
		p.Cnd_dest_nm2 = p.beansFactory.createTextField("Cnd.dest_nm2");
		p.Cnd_no_dest2_flg = p.beansFactory.createCheckBox("Cnd.no_dest2_flg");
		p.Cnd_dest_cd3_Label = p.beansFactory.createLabel("Cnd.dest_cd3_Label");
		p.Cnd_dest_cd3 = p.beansFactory.createTextField("Cnd.dest_cd3");
		p.Cnd_dest_cd3.setLabel(p.Cnd_dest_cd3_Label);
		p.Cnd_dest_nm3 = p.beansFactory.createTextField("Cnd.dest_nm3");
		p.Cnd_no_dest3_flg = p.beansFactory.createCheckBox("Cnd.no_dest3_flg");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_no_dpt_flg = p.beansFactory.createCheckBox("Cnd.no_dpt_flg");
		p.Cnd_expns_grp_cd_Label = p.beansFactory.createLabel("Cnd.expns_grp_cd_Label");
		p.Cnd_expns_grp_cd = p.beansFactory.createTextComboBox("Cnd.expns_grp_cd");
		p.Cnd_expns_grp_cd.setLabel(p.Cnd_expns_grp_cd_Label);
		p.Cnd_expns_grp_nm = p.beansFactory.createTextField("Cnd.expns_grp_nm");
		p.Cnd_expns_cd_Label = p.beansFactory.createLabel("Cnd.expns_cd_Label");
		p.Cnd_expns_cd = p.beansFactory.createTextComboBox("Cnd.expns_cd");
		p.Cnd_expns_cd.setLabel(p.Cnd_expns_cd_Label);
		p.Cnd_expns_nm = p.beansFactory.createTextField("Cnd.expns_nm");
		p.Cnd_expns_typ_Label = p.beansFactory.createLabel("Cnd.expns_typ_Label");
		p.Cnd_expns_typ = p.beansFactory.createTextComboBox("Cnd.expns_typ");
		p.Cnd_expns_typ.setLabel(p.Cnd_expns_typ_Label);
		p.Cnd_expns_typ_nm = p.beansFactory.createTextField("Cnd.expns_typ_nm");
		p.Cnd_amt_zero_flg = p.beansFactory.createCheckBox("Cnd.amt_zero_flg");
		p.Cnd_alc_ac_cd_Label = p.beansFactory.createLabel("Cnd.alc_ac_cd_Label");
		p.Cnd_alc_ac_cd = p.beansFactory.createTextComboBox("Cnd.alc_ac_cd");
		p.Cnd_alc_ac_cd.setLabel(p.Cnd_alc_ac_cd_Label);
		p.Cnd_alc_ac_nm = p.beansFactory.createTextField("Cnd.alc_ac_nm");
		p.Cnd_alc_ac_grp_cd1_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd1_Label");
		p.Cnd_alc_ac_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd1");
		p.Cnd_alc_ac_grp_cd1.setLabel(p.Cnd_alc_ac_grp_cd1_Label);
		p.Cnd_alc_ac_grp_nm1 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm1");
		p.Cnd_alc_ac_grp_cd2_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd2_Label");
		p.Cnd_alc_ac_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd2");
		p.Cnd_alc_ac_grp_cd2.setLabel(p.Cnd_alc_ac_grp_cd2_Label);
		p.Cnd_alc_ac_grp_nm2 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm2");
		p.Cnd_alc_ac_grp_cd3_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd3_Label");
		p.Cnd_alc_ac_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd3");
		p.Cnd_alc_ac_grp_cd3.setLabel(p.Cnd_alc_ac_grp_cd3_Label);
		p.Cnd_alc_ac_grp_nm3 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm3");
		p.Cnd_dpt_cd2_Label = p.beansFactory.createLabel("Cnd.dpt_cd2_Label");
		p.Cnd_dpt_cd2 = p.beansFactory.createTextComboBox("Cnd.dpt_cd2");
		p.Cnd_dpt_cd2.setLabel(p.Cnd_dpt_cd2_Label);
		p.Cnd_dpt_nm2 = p.beansFactory.createTextField("Cnd.dpt_nm2");
		p.Cnd_no_dpt2_flg = p.beansFactory.createCheckBox("Cnd.no_dpt2_flg");
		p.Cnd_loc_cd2_Label = p.beansFactory.createLabel("Cnd.loc_cd2_Label");
		p.Cnd_loc_cd2 = p.beansFactory.createTextField("Cnd.loc_cd2");
		p.Cnd_loc_cd2.setLabel(p.Cnd_loc_cd2_Label);
		p.Cnd_loc_nm2 = p.beansFactory.createTextField("Cnd.loc_nm2");
		p.Cnd_no_loc2_flg = p.beansFactory.createCheckBox("Cnd.no_loc2_flg");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_no_oper_flg = p.beansFactory.createCheckBox("Cnd.no_oper_flg");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_no_bp_flg = p.beansFactory.createCheckBox("Cnd.no_bp_flg");
		p.Cnd_ctg_cd_Label = p.beansFactory.createLabel("Cnd.ctg_cd_Label");
		p.Cnd_ctg_cd = p.beansFactory.createTextComboBox("Cnd.ctg_cd");
		p.Cnd_ctg_cd.setLabel(p.Cnd_ctg_cd_Label);
		p.Cnd_ctg_nm = p.beansFactory.createTextField("Cnd.ctg_nm");
		p.Cnd_no_ctg_flg = p.beansFactory.createCheckBox("Cnd.no_ctg_flg");
		p.Cnd_no_itm2_flg = p.beansFactory.createCheckBox("Cnd.no_itm2_flg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_alc_ac_cd = p.beansFactory.createTableColumn("Rslt.alc_ac_cd", MCColumnType.TEXT);
		p.columnRslt_alc_ac_nm = p.beansFactory.createTableColumn("Rslt.alc_ac_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_ctg_cd = p.beansFactory.createTableColumn("Rslt.ctg_cd", MCColumnType.TEXT);
		p.columnRslt_ctg_nm = p.beansFactory.createTableColumn("Rslt.ctg_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_expns_grp_cd = p.beansFactory.createTableColumn("Rslt.expns_grp_cd", MCColumnType.TEXT);
		p.columnRslt_expns_grp_nm = p.beansFactory.createTableColumn("Rslt.expns_grp_nm", MCColumnType.TEXT);
		p.columnRslt_expnsg_seq = p.beansFactory.createTableColumn("Rslt.expnsg_seq", MCColumnType.NUMBER);
		p.columnRslt_expns_cd = p.beansFactory.createTableColumn("Rslt.expns_cd", MCColumnType.TEXT);
		p.columnRslt_expns_nm = p.beansFactory.createTableColumn("Rslt.expns_nm", MCColumnType.TEXT);
		p.columnRslt_expns_seq = p.beansFactory.createTableColumn("Rslt.expns_seq", MCColumnType.NUMBER);
		p.columnRslt_alc_ptn_cd = p.beansFactory.createTableColumn("Rslt.alc_ptn_cd", MCColumnType.TEXT);
		p.columnRslt_alc_ptn_nm = p.beansFactory.createTableColumn("Rslt.alc_ptn_nm", MCColumnType.TEXT);
		p.columnRslt_alc_amt = p.beansFactory.createTableColumn("Rslt.alc_amt", MCColumnType.NUMBER);
		p.columnRslt_alc_tgt_val = p.beansFactory.createTableColumn("Rslt.alc_tgt_val", MCColumnType.NUMBER);
		p.columnRslt_alc_rate = p.beansFactory.createTableColumn("Rslt.alc_rate", MCColumnType.NUMBER);
		p.columnRslt_coef_val = p.beansFactory.createTableColumn("Rslt.coef_val", MCColumnType.NUMBER);
		p.columnRslt_alc_org_tgt_val = p.beansFactory.createTableColumn("Rslt.alc_org_tgt_val", MCColumnType.NUMBER);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
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
	protected static void jbInitFold(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_p_PPanel);
		p.Cnd_calc_p_PPanel.setNextBeans(p.Cnd_term);
		p.Cnd_calc_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks,p.Cnd_term);
		p.CndPanel.add(p.Cnd_term);
		p.Cnd_term.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_term.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.term_META);
		p.Cnd_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, false);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_no_loc_flg);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.CndPanel.add(p.Cnd_no_loc_flg);
		p.Cnd_no_loc_flg.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_no_loc_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_loc_flg_META);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_no_sppl_flg);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_no_sppl_flg);
		p.Cnd_no_sppl_flg.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_no_sppl_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_sppl_flg_META);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_no_cst_flg);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_no_cst_flg);
		p.Cnd_no_cst_flg.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_no_cst_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_cst_flg_META);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_no_dlv_flg);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_no_dlv_flg);
		p.Cnd_no_dlv_flg.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_no_dlv_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_dlv_flg_META);
		p.CndPanel.add(p.Cnd_dest_cd1_Label);
		p.CndPanel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.CndPanel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_no_dest1_flg);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dest_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.CndPanel.add(p.Cnd_no_dest1_flg);
		p.Cnd_no_dest1_flg.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_no_dest1_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_dest1_flg_META);
		p.CndPanel.add(p.Cnd_dest_cd2_Label);
		p.CndPanel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.CndPanel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_no_dest2_flg);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dest_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.CndPanel.add(p.Cnd_no_dest2_flg);
		p.Cnd_no_dest2_flg.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_no_dest2_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_dest2_flg_META);
		p.CndPanel.add(p.Cnd_dest_cd3_Label);
		p.CndPanel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.CndPanel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_no_dest3_flg);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dest_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.CndPanel.add(p.Cnd_no_dest3_flg);
		p.Cnd_no_dest3_flg.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_no_dest3_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_dest3_flg_META);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_no_dpt_flg);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_no_dpt_flg);
		p.Cnd_no_dpt_flg.setNextBeans(p.Cnd_expns_grp_cd);
		p.Cnd_no_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_dpt_flg_META);
		p.Cnd_expns_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_expns_grp_cd, true);
		p.Cnd_expns_grp_cd.setLinkBeans(p.Cnd_expns_grp_nm);
		p.CndPanel.add(p.Cnd_expns_grp_cd_Label);
		p.CndPanel.add(p.Cnd_expns_grp_cd);
		p.Cnd_expns_grp_cd.setNextBeans(p.Cnd_expns_grp_nm);
		p.Cnd_expns_grp_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.expns_grp_cd_META);
		p.CndPanel.add(p.Cnd_expns_grp_nm);
		p.Cnd_expns_grp_nm.setNextBeans(p.Cnd_expns_cd);
		p.Cnd_expns_grp_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.expns_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_expns_grp_nm, true);
		p.Cnd_expns_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_expns_cd, true);
		p.Cnd_expns_cd.setLinkBeans(p.Cnd_expns_nm);
		p.CndPanel.add(p.Cnd_expns_cd_Label);
		p.CndPanel.add(p.Cnd_expns_cd);
		p.Cnd_expns_cd.setNextBeans(p.Cnd_expns_nm);
		p.Cnd_expns_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.expns_cd_META);
		p.CndPanel.add(p.Cnd_expns_nm);
		p.Cnd_expns_nm.setNextBeans(p.Cnd_expns_typ);
		p.Cnd_expns_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.expns_nm_META);
		p.setPluralValueEnable(p.Cnd_expns_nm, true);
		p.Cnd_expns_typ.setListType(MCListType.FREE);
		p.Cnd_expns_typ.setLinkBeans(p.Cnd_expns_typ_nm);
		p.CndPanel.add(p.Cnd_expns_typ_Label);
		p.CndPanel.add(p.Cnd_expns_typ);
		p.Cnd_expns_typ.setNextBeans(p.Cnd_expns_typ_nm);
		p.Cnd_expns_typ.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.expns_typ_META);
		p.CndPanel.add(p.Cnd_expns_typ_nm);
		p.Cnd_expns_typ_nm.setNextBeans(p.Cnd_amt_zero_flg);
		p.Cnd_expns_typ_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.expns_typ_nm_META);
		p.CndPanel.add(p.Cnd_amt_zero_flg);
		p.Cnd_amt_zero_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.amt_zero_flg_META);
		p.Cnd_alc_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_cd, true);
		p.Cnd_alc_ac_cd.setLinkBeans(p.Cnd_alc_ac_nm);
		p.Cnd2Panel.add(p.Cnd_alc_ac_cd_Label);
		p.Cnd2Panel.add(p.Cnd_alc_ac_cd);
		p.Cnd2Panel.setLastBeans(p.Cnd_alc_ac_cd);
		p.Cnd_alc_ac_cd.setNextBeans(p.Cnd_alc_ac_nm);
		p.Cnd_alc_ac_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.alc_ac_cd_META);
		p.Cnd2Panel.add(p.Cnd_alc_ac_nm);
		p.Cnd_alc_ac_nm.setNextBeans(p.Cnd_alc_ac_grp_cd1);
		p.Cnd_alc_ac_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.alc_ac_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_nm, true);
		p.Cnd_alc_ac_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd1, true);
		p.Cnd_alc_ac_grp_cd1.setLinkBeans(p.Cnd_alc_ac_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_cd1);
		p.Cnd_alc_ac_grp_cd1.setNextBeans(p.Cnd_alc_ac_grp_nm1);
		p.Cnd_alc_ac_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.alc_ac_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_nm1);
		p.Cnd_alc_ac_grp_nm1.setNextBeans(p.Cnd_alc_ac_grp_cd2);
		p.Cnd_alc_ac_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.alc_ac_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm1, true);
		p.Cnd_alc_ac_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd2, true);
		p.Cnd_alc_ac_grp_cd2.setLinkBeans(p.Cnd_alc_ac_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_cd2);
		p.Cnd_alc_ac_grp_cd2.setNextBeans(p.Cnd_alc_ac_grp_nm2);
		p.Cnd_alc_ac_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.alc_ac_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_nm2);
		p.Cnd_alc_ac_grp_nm2.setNextBeans(p.Cnd_alc_ac_grp_cd3);
		p.Cnd_alc_ac_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.alc_ac_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm2, true);
		p.Cnd_alc_ac_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd3, true);
		p.Cnd_alc_ac_grp_cd3.setLinkBeans(p.Cnd_alc_ac_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_cd3);
		p.Cnd_alc_ac_grp_cd3.setNextBeans(p.Cnd_alc_ac_grp_nm3);
		p.Cnd_alc_ac_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.alc_ac_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_alc_ac_grp_nm3);
		p.Cnd_alc_ac_grp_nm3.setNextBeans(p.Cnd_dpt_cd2);
		p.Cnd_alc_ac_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.alc_ac_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm3, true);
		p.Cnd_dpt_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd2, true);
		p.Cnd_dpt_cd2.setLinkBeans(p.Cnd_dpt_nm2);
		p.Cnd2Panel.add(p.Cnd_dpt_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_dpt_cd2);
		p.Cnd_dpt_cd2.setNextBeans(p.Cnd_dpt_nm2);
		p.Cnd_dpt_cd2.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dpt_cd2_META);
		p.Cnd2Panel.add(p.Cnd_dpt_nm2);
		p.Cnd_dpt_nm2.setNextBeans(p.Cnd_no_dpt2_flg);
		p.Cnd_dpt_nm2.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.dpt_nm2_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm2, true);
		p.Cnd2Panel.add(p.Cnd_no_dpt2_flg);
		p.Cnd_no_dpt2_flg.setNextBeans(p.Cnd_loc_cd2);
		p.Cnd_no_dpt2_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_dpt2_flg_META);
		p.Cnd2Panel.add(p.Cnd_loc_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_loc_cd2);
		p.Cnd_loc_cd2.setNextBeans(p.Cnd_loc_nm2);
		p.Cnd_loc_cd2.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.loc_cd2_META);
		p.Cnd_loc_cd2.addLinkBeans(p.Cnd_loc_nm2);
		p.Cnd_loc_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd2, true);
		p.Cnd2Panel.add(p.Cnd_loc_nm2);
		p.Cnd_loc_nm2.setNextBeans(p.Cnd_no_loc2_flg);
		p.Cnd_loc_nm2.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.loc_nm2_META);
		p.setPluralValueEnable(p.Cnd_loc_nm2, true);
		p.Cnd2Panel.add(p.Cnd_no_loc2_flg);
		p.Cnd_no_loc2_flg.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_no_loc2_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_loc2_flg_META);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.Cnd2Panel.add(p.Cnd_oper_cd_Label);
		p.Cnd2Panel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.oper_cd_META);
		p.Cnd2Panel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_no_oper_flg);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.Cnd2Panel.add(p.Cnd_no_oper_flg);
		p.Cnd_no_oper_flg.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_no_oper_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_oper_flg_META);
		p.Cnd2Panel.add(p.Cnd_bp_cd_Label);
		p.Cnd2Panel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.Cnd2Panel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_no_bp_flg);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Cnd2Panel.add(p.Cnd_no_bp_flg);
		p.Cnd_no_bp_flg.setNextBeans(p.Cnd_ctg_cd);
		p.Cnd_no_bp_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_bp_flg_META);
		p.Cnd_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ctg_cd, true);
		p.Cnd_ctg_cd.setLinkBeans(p.Cnd_ctg_nm);
		p.Cnd2Panel.add(p.Cnd_ctg_cd_Label);
		p.Cnd2Panel.add(p.Cnd_ctg_cd);
		p.Cnd_ctg_cd.setNextBeans(p.Cnd_ctg_nm);
		p.Cnd_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.ctg_cd_META);
		p.Cnd2Panel.add(p.Cnd_ctg_nm);
		p.Cnd_ctg_nm.setNextBeans(p.Cnd_no_ctg_flg);
		p.Cnd_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_ctg_nm, true);
		p.Cnd2Panel.add(p.Cnd_no_ctg_flg);
		p.Cnd_no_ctg_flg.setNextBeans(p.Cnd_itm2_p_PPanel);
		p.Cnd_no_ctg_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_ctg_flg_META);
		p.Cnd2Panel.add(p.Cnd_itm2_p_PPanel);
		p.Cnd_itm2_p_PPanel.setNextBeans(p.Cnd_no_itm2_flg);
		p.Cnd_itm2_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm2_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm2_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm2,p.Cnd_itm_sub1_2,p.Cnd_itm_sub2_2,p.Cnd_itm_sub3_2);
		p.Cnd_itm2_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm2_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm2_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm2,p.Cnd_itm_sub2_2,p.Cnd_itm_sub3_2);
		p.Cnd_itm2_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm2_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm2_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm2,p.Cnd_itm_sub3_2);
		p.Cnd_itm2_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm2_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_itm2_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm2);
		p.setPluralValueEnable(p.Cnd_itm2_p_PPanel.Itm_itm_nm, true);
		p.Cnd2Panel.add(p.Cnd_no_itm2_flg);
		p.Cnd_no_itm2_flg.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0060.CndR.no_itm2_flg_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBEP_StdAlcSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
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
		MGBEP_StdAlcSrch_MC.mcInitTop((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.mcInitFold((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.mcInitTab1((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.mcInitTab2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.mcInitCnd((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.mcInitCnd2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.mcInitCtrl((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.mcInitRslt((MGBEP_StdAlcSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBEP_StdAlcSrch_MC.statusInitSRCH_Top((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitSRCH_Fold((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitSRCH_Tab1((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitSRCH_Tab2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitSRCH_Cnd((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitSRCH_Cnd2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitSRCH_Ctrl((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitSRCH_Rslt((MGBEP_StdAlcSrch)this);

		// [REF]ステータスのモードの設定
		MGBEP_StdAlcSrch_MC.statusInitREF_Top((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitREF_Fold((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitREF_Tab1((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitREF_Tab2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitREF_Cnd((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitREF_Cnd2((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitREF_Ctrl((MGBEP_StdAlcSrch)this);
		MGBEP_StdAlcSrch_MC.statusInitREF_Rslt((MGBEP_StdAlcSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBEP_StdAlcSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBEP_StdAlcSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBEP_StdAlcSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBEP_StdAlcSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBEP_StdAlcSrch p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_term.setListListener(p);
		p.Cnd_term.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_no_loc_flg.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_no_sppl_flg.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_no_cst_flg.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_no_dlv_flg.addAllListener(p);
		p.Cnd_dest_cd1.setListListener(p);
		p.Cnd_dest_cd1.addAllListener(p);
		p.Cnd_dest_nm1.setListListener(p);
		p.Cnd_dest_nm1.addAllListener(p);
		p.Cnd_no_dest1_flg.addAllListener(p);
		p.Cnd_dest_cd2.setListListener(p);
		p.Cnd_dest_cd2.addAllListener(p);
		p.Cnd_dest_nm2.setListListener(p);
		p.Cnd_dest_nm2.addAllListener(p);
		p.Cnd_no_dest2_flg.addAllListener(p);
		p.Cnd_dest_cd3.setListListener(p);
		p.Cnd_dest_cd3.addAllListener(p);
		p.Cnd_dest_nm3.setListListener(p);
		p.Cnd_dest_nm3.addAllListener(p);
		p.Cnd_no_dest3_flg.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_no_dpt_flg.addAllListener(p);
		p.Cnd_expns_grp_cd.setListListener(p);
		p.Cnd_expns_grp_cd.addAllListener(p);
		p.Cnd_expns_grp_nm.setListListener(p);
		p.Cnd_expns_grp_nm.addAllListener(p);
		p.Cnd_expns_cd.setListListener(p);
		p.Cnd_expns_cd.addAllListener(p);
		p.Cnd_expns_nm.setListListener(p);
		p.Cnd_expns_nm.addAllListener(p);
		p.Cnd_expns_typ.setListListener(p);
		p.Cnd_expns_typ.addAllListener(p);
		p.Cnd_expns_typ_nm.setListListener(p);
		p.Cnd_expns_typ_nm.addAllListener(p);
		p.Cnd_amt_zero_flg.addAllListener(p);
		p.Cnd_alc_ac_cd.setListListener(p);
		p.Cnd_alc_ac_cd.addAllListener(p);
		p.Cnd_alc_ac_nm.setListListener(p);
		p.Cnd_alc_ac_nm.addAllListener(p);
		p.Cnd_alc_ac_grp_cd1.setListListener(p);
		p.Cnd_alc_ac_grp_cd1.addAllListener(p);
		p.Cnd_alc_ac_grp_nm1.setListListener(p);
		p.Cnd_alc_ac_grp_nm1.addAllListener(p);
		p.Cnd_alc_ac_grp_cd2.setListListener(p);
		p.Cnd_alc_ac_grp_cd2.addAllListener(p);
		p.Cnd_alc_ac_grp_nm2.setListListener(p);
		p.Cnd_alc_ac_grp_nm2.addAllListener(p);
		p.Cnd_alc_ac_grp_cd3.setListListener(p);
		p.Cnd_alc_ac_grp_cd3.addAllListener(p);
		p.Cnd_alc_ac_grp_nm3.setListListener(p);
		p.Cnd_alc_ac_grp_nm3.addAllListener(p);
		p.Cnd_dpt_cd2.setListListener(p);
		p.Cnd_dpt_cd2.addAllListener(p);
		p.Cnd_dpt_nm2.setListListener(p);
		p.Cnd_dpt_nm2.addAllListener(p);
		p.Cnd_no_dpt2_flg.addAllListener(p);
		p.Cnd_loc_cd2.setListListener(p);
		p.Cnd_loc_cd2.addAllListener(p);
		p.Cnd_loc_nm2.setListListener(p);
		p.Cnd_loc_nm2.addAllListener(p);
		p.Cnd_no_loc2_flg.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_no_oper_flg.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_no_bp_flg.addAllListener(p);
		p.Cnd_ctg_cd.setListListener(p);
		p.Cnd_ctg_cd.addAllListener(p);
		p.Cnd_ctg_nm.setListListener(p);
		p.Cnd_ctg_nm.addAllListener(p);
		p.Cnd_no_ctg_flg.addAllListener(p);
		p.Cnd_itm2_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm2_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm2_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm2_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_no_itm2_flg.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBEP_StdAlcSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBEP_StdAlcSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBEP_StdAlcSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_alc_ac_cd.addAllListener(p);
		p.columnRslt_alc_ac_cd.setListListener(p);
		p.columnRslt_alc_ac_nm.addAllListener(p);
		p.columnRslt_alc_ac_nm.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_ctg_cd.addAllListener(p);
		p.columnRslt_ctg_cd.setListListener(p);
		p.columnRslt_ctg_nm.addAllListener(p);
		p.columnRslt_ctg_nm.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_expns_grp_cd.addAllListener(p);
		p.columnRslt_expns_grp_cd.setListListener(p);
		p.columnRslt_expns_grp_nm.addAllListener(p);
		p.columnRslt_expns_grp_nm.setListListener(p);
		p.columnRslt_expnsg_seq.addAllListener(p);
		p.columnRslt_expnsg_seq.setListListener(p);
		p.columnRslt_expns_cd.addAllListener(p);
		p.columnRslt_expns_cd.setListListener(p);
		p.columnRslt_expns_nm.addAllListener(p);
		p.columnRslt_expns_nm.setListListener(p);
		p.columnRslt_expns_seq.addAllListener(p);
		p.columnRslt_expns_seq.setListListener(p);
		p.columnRslt_alc_ptn_cd.addAllListener(p);
		p.columnRslt_alc_ptn_cd.setListListener(p);
		p.columnRslt_alc_ptn_nm.addAllListener(p);
		p.columnRslt_alc_ptn_nm.setListListener(p);
		p.columnRslt_alc_amt.addAllListener(p);
		p.columnRslt_alc_amt.setListListener(p);
		p.columnRslt_alc_tgt_val.addAllListener(p);
		p.columnRslt_alc_tgt_val.setListListener(p);
		p.columnRslt_alc_rate.addAllListener(p);
		p.columnRslt_alc_rate.setListListener(p);
		p.columnRslt_coef_val.addAllListener(p);
		p.columnRslt_coef_val.setListListener(p);
		p.columnRslt_alc_org_tgt_val.addAllListener(p);
		p.columnRslt_alc_org_tgt_val.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBEP_StdAlcSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBEP_StdAlcSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBEP_StdAlcSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBEP_StdAlcSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBEP_StdAlcSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_loc_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_cst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_dlv_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_dest1_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_dest2_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_dest3_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_dpt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_expns_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_expns_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_expns_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_expns_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_expns_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_expns_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_amt_zero_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_dpt2_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_loc2_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_oper_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_bp_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_ctg_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_no_itm2_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBEP_StdAlcSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBEP_StdAlcSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBEP_StdAlcSrch p){
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_expns_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_expns_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_expnsg_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_expns_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_expns_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_alc_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_tgt_val.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_coef_val.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_org_tgt_val.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBEP_StdAlcSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBEP_StdAlcSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBEP_StdAlcSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBEP_StdAlcSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBEP_StdAlcSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_loc_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_cst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_dlv_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_dest1_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_dest2_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_dest3_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_dpt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_expns_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_expns_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_expns_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_expns_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_expns_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_expns_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_amt_zero_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_dpt2_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_loc2_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_oper_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_bp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_ctg_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_no_itm2_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBEP_StdAlcSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBEP_StdAlcSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBEP_StdAlcSrch p){
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expns_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expns_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expnsg_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expns_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_alc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_tgt_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_coef_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_org_tgt_val.putMode(p, REF, MCMode.READ_ONLY);

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
		MGBEP_StdAlcSrch_MC.setTableConfigRslt((MGBEP_StdAlcSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBEP_StdAlcSrch p) {
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_alc_ac_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.alc_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_cd);
		p.columnRslt_alc_ac_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.alc_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_nm);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.oper_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_ctg_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.ctg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_cd);
		p.columnRslt_ctg_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_expns_grp_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.expns_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_grp_cd);
		p.columnRslt_expns_grp_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.expns_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_grp_nm);
		p.columnRslt_expnsg_seq.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.expnsg_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expnsg_seq);
		p.columnRslt_expns_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.expns_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_cd);
		p.columnRslt_expns_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.expns_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_nm);
		p.columnRslt_expns_seq.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.expns_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_seq);
		p.columnRslt_alc_ptn_cd.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.alc_ptn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ptn_cd);
		p.columnRslt_alc_ptn_nm.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.alc_ptn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ptn_nm);
		p.columnRslt_alc_amt.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.alc_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_amt);
		p.columnRslt_alc_tgt_val.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.alc_tgt_val_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_tgt_val);
		p.columnRslt_alc_rate.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.alc_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_rate);
		p.columnRslt_coef_val.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.coef_val_META);
		p.RsltTable.addColumnConfig(p.columnRslt_coef_val);
		p.columnRslt_alc_org_tgt_val.setMeta(mcframe.clientMGBE.MGBEP0060.RsltR.alc_org_tgt_val_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_org_tgt_val);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_calc_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getCnd_calc_p_PPanel_CalcNo_calc_no_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_dest_cd1.getListConfig().setPutter(getCnd_dest_cd1_ListPutter());
		Cnd_dest_cd2.getListConfig().setPutter(getCnd_dest_cd2_ListPutter());
		Cnd_dest_cd3.getListConfig().setPutter(getCnd_dest_cd3_ListPutter());
		Cnd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_expns_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_expns_grp_cd.getListConfig().setPutter(getCnd_expns_grp_cd_ListPutter());
		Cnd_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_expns_cd.getListConfig().setPutter(getCnd_expns_cd_ListPutter());
		Cnd_expns_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_expns_typ.getListConfig().setPutter(getCnd_expns_typ_ListPutter());
		Cnd_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_cd.getListConfig().setPutter(getCnd_alc_ac_cd_ListPutter());
		Cnd_alc_ac_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd1.getListConfig().setPutter(getCnd_alc_ac_grp_cd1_ListPutter());
		Cnd_alc_ac_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd2.getListConfig().setPutter(getCnd_alc_ac_grp_cd2_ListPutter());
		Cnd_alc_ac_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd3.getListConfig().setPutter(getCnd_alc_ac_grp_cd3_ListPutter());
		Cnd_dpt_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd2.getListConfig().setPutter(getCnd_dpt_cd2_ListPutter());
		Cnd_loc_cd2.getListConfig().setPutter(getCnd_loc_cd2_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ctg_cd.getListConfig().setPutter(getCnd_ctg_cd_ListPutter());
		Cnd_itm2_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm2_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm2_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm2_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm2_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm2_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm2_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm2_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm2_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm2_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm2_p_PPanel_Itm_itm_sub3_ListPutter());
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
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}

	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_expns_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_expns_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpnsGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Cnd_expns_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_expns_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpnsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAc");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_itm2_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm2_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm2_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm2_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm2_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm2_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm2_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm2_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_dest_cd1) return getCnd_dest_cd1(row, info);
		if(combo == Cnd_dest_cd2) return getCnd_dest_cd2(row, info);
		if(combo == Cnd_dest_cd3) return getCnd_dest_cd3(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_expns_grp_cd) return getCnd_expns_grp_cd(row, info);
		if(combo == Cnd_expns_cd) return getCnd_expns_cd(row, info);
		if(combo == Cnd_expns_typ) return getCnd_expns_typ(row, info);
		if(combo == Cnd_alc_ac_cd) return getCnd_alc_ac_cd(row, info);
		if(combo == Cnd_alc_ac_grp_cd1) return getCnd_alc_ac_grp_cd1(row, info);
		if(combo == Cnd_alc_ac_grp_cd2) return getCnd_alc_ac_grp_cd2(row, info);
		if(combo == Cnd_alc_ac_grp_cd3) return getCnd_alc_ac_grp_cd3(row, info);
		if(combo == Cnd_dpt_cd2) return getCnd_dpt_cd2(row, info);
		if(combo == Cnd_loc_cd2) return getCnd_loc_cd2(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_ctg_cd) return getCnd_ctg_cd(row, info);
		if(combo == Cnd_itm2_p_PPanel.Itm_itm_cd) return getCnd_itm2_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm2_p_PPanel.Itm_itm_sub1) return getCnd_itm2_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm2_p_PPanel.Itm_itm_sub2) return getCnd_itm2_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm2_p_PPanel.Itm_itm_sub3) return getCnd_itm2_p_PPanel_Itm_itm_sub3(row, info);
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
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_term) return doCnd_term_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_no_loc_flg) return doCnd_no_loc_flg_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_no_sppl_flg) return doCnd_no_sppl_flg_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_no_cst_flg) return doCnd_no_cst_flg_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_no_dlv_flg) return doCnd_no_dlv_flg_VC(info);
		if (vc == Cnd_dest_cd1) return doCnd_dest_cd1_VC(info);
		if (vc == Cnd_dest_nm1) return doCnd_dest_nm1_VC(info);
		if (vc == Cnd_no_dest1_flg) return doCnd_no_dest1_flg_VC(info);
		if (vc == Cnd_dest_cd2) return doCnd_dest_cd2_VC(info);
		if (vc == Cnd_dest_nm2) return doCnd_dest_nm2_VC(info);
		if (vc == Cnd_no_dest2_flg) return doCnd_no_dest2_flg_VC(info);
		if (vc == Cnd_dest_cd3) return doCnd_dest_cd3_VC(info);
		if (vc == Cnd_dest_nm3) return doCnd_dest_nm3_VC(info);
		if (vc == Cnd_no_dest3_flg) return doCnd_no_dest3_flg_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_no_dpt_flg) return doCnd_no_dpt_flg_VC(info);
		if (vc == Cnd_expns_grp_cd) return doCnd_expns_grp_cd_VC(info);
		if (vc == Cnd_expns_grp_nm) return doCnd_expns_grp_nm_VC(info);
		if (vc == Cnd_expns_cd) return doCnd_expns_cd_VC(info);
		if (vc == Cnd_expns_nm) return doCnd_expns_nm_VC(info);
		if (vc == Cnd_expns_typ) return doCnd_expns_typ_VC(info);
		if (vc == Cnd_expns_typ_nm) return doCnd_expns_typ_nm_VC(info);
		if (vc == Cnd_amt_zero_flg) return doCnd_amt_zero_flg_VC(info);
		if (vc == Cnd_alc_ac_cd) return doCnd_alc_ac_cd_VC(info);
		if (vc == Cnd_alc_ac_nm) return doCnd_alc_ac_nm_VC(info);
		if (vc == Cnd_alc_ac_grp_cd1) return doCnd_alc_ac_grp_cd1_VC(info);
		if (vc == Cnd_alc_ac_grp_nm1) return doCnd_alc_ac_grp_nm1_VC(info);
		if (vc == Cnd_alc_ac_grp_cd2) return doCnd_alc_ac_grp_cd2_VC(info);
		if (vc == Cnd_alc_ac_grp_nm2) return doCnd_alc_ac_grp_nm2_VC(info);
		if (vc == Cnd_alc_ac_grp_cd3) return doCnd_alc_ac_grp_cd3_VC(info);
		if (vc == Cnd_alc_ac_grp_nm3) return doCnd_alc_ac_grp_nm3_VC(info);
		if (vc == Cnd_dpt_cd2) return doCnd_dpt_cd2_VC(info);
		if (vc == Cnd_dpt_nm2) return doCnd_dpt_nm2_VC(info);
		if (vc == Cnd_no_dpt2_flg) return doCnd_no_dpt2_flg_VC(info);
		if (vc == Cnd_loc_cd2) return doCnd_loc_cd2_VC(info);
		if (vc == Cnd_loc_nm2) return doCnd_loc_nm2_VC(info);
		if (vc == Cnd_no_loc2_flg) return doCnd_no_loc2_flg_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_no_oper_flg) return doCnd_no_oper_flg_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_no_bp_flg) return doCnd_no_bp_flg_VC(info);
		if (vc == Cnd_ctg_cd) return doCnd_ctg_cd_VC(info);
		if (vc == Cnd_ctg_nm) return doCnd_ctg_nm_VC(info);
		if (vc == Cnd_no_ctg_flg) return doCnd_no_ctg_flg_VC(info);
		if (vc == Cnd_no_itm2_flg) return doCnd_no_itm2_flg_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_alc_ac_cd) return doRslt_alc_ac_cd_VC(info);
		if (vc == columnRslt_alc_ac_nm) return doRslt_alc_ac_nm_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_ctg_cd) return doRslt_ctg_cd_VC(info);
		if (vc == columnRslt_ctg_nm) return doRslt_ctg_nm_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_expns_grp_cd) return doRslt_expns_grp_cd_VC(info);
		if (vc == columnRslt_expns_grp_nm) return doRslt_expns_grp_nm_VC(info);
		if (vc == columnRslt_expnsg_seq) return doRslt_expnsg_seq_VC(info);
		if (vc == columnRslt_expns_cd) return doRslt_expns_cd_VC(info);
		if (vc == columnRslt_expns_nm) return doRslt_expns_nm_VC(info);
		if (vc == columnRslt_expns_seq) return doRslt_expns_seq_VC(info);
		if (vc == columnRslt_alc_ptn_cd) return doRslt_alc_ptn_cd_VC(info);
		if (vc == columnRslt_alc_ptn_nm) return doRslt_alc_ptn_nm_VC(info);
		if (vc == columnRslt_alc_amt) return doRslt_alc_amt_VC(info);
		if (vc == columnRslt_alc_tgt_val) return doRslt_alc_tgt_val_VC(info);
		if (vc == columnRslt_alc_rate) return doRslt_alc_rate_VC(info);
		if (vc == columnRslt_coef_val) return doRslt_coef_val_VC(info);
		if (vc == columnRslt_alc_org_tgt_val) return doRslt_alc_org_tgt_val_VC(info);
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
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[term]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_term_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_loc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_loc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_dest1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_dest1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_dest2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_dest2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_dest3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_dest3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[amt_zero_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_amt_zero_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_dpt2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_dpt2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_loc2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_loc2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_ctg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_ctg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_itm2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_itm2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expnsg_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expnsg_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_tgt_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_tgt_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[coef_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_coef_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_org_tgt_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_org_tgt_val_VC(MCEventInfo info){
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
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_term) doCnd_term_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_no_loc_flg) doCnd_no_loc_flg_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_no_cst_flg) doCnd_no_cst_flg_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_no_dlv_flg) doCnd_no_dlv_flg_NC(info);
		else if (nc == Cnd_dest_cd1) doCnd_dest_cd1_NC(info);
		else if (nc == Cnd_dest_nm1) doCnd_dest_nm1_NC(info);
		else if (nc == Cnd_no_dest1_flg) doCnd_no_dest1_flg_NC(info);
		else if (nc == Cnd_dest_cd2) doCnd_dest_cd2_NC(info);
		else if (nc == Cnd_dest_nm2) doCnd_dest_nm2_NC(info);
		else if (nc == Cnd_no_dest2_flg) doCnd_no_dest2_flg_NC(info);
		else if (nc == Cnd_dest_cd3) doCnd_dest_cd3_NC(info);
		else if (nc == Cnd_dest_nm3) doCnd_dest_nm3_NC(info);
		else if (nc == Cnd_no_dest3_flg) doCnd_no_dest3_flg_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_no_dpt_flg) doCnd_no_dpt_flg_NC(info);
		else if (nc == Cnd_expns_grp_cd) doCnd_expns_grp_cd_NC(info);
		else if (nc == Cnd_expns_grp_nm) doCnd_expns_grp_nm_NC(info);
		else if (nc == Cnd_expns_cd) doCnd_expns_cd_NC(info);
		else if (nc == Cnd_expns_nm) doCnd_expns_nm_NC(info);
		else if (nc == Cnd_expns_typ) doCnd_expns_typ_NC(info);
		else if (nc == Cnd_expns_typ_nm) doCnd_expns_typ_nm_NC(info);
		else if (nc == Cnd_amt_zero_flg) doCnd_amt_zero_flg_NC(info);
		else if (nc == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NC(info);
		else if (nc == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NC(info);
		else if (nc == Cnd_dpt_cd2) doCnd_dpt_cd2_NC(info);
		else if (nc == Cnd_dpt_nm2) doCnd_dpt_nm2_NC(info);
		else if (nc == Cnd_no_dpt2_flg) doCnd_no_dpt2_flg_NC(info);
		else if (nc == Cnd_loc_cd2) doCnd_loc_cd2_NC(info);
		else if (nc == Cnd_loc_nm2) doCnd_loc_nm2_NC(info);
		else if (nc == Cnd_no_loc2_flg) doCnd_no_loc2_flg_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_no_oper_flg) doCnd_no_oper_flg_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_no_bp_flg) doCnd_no_bp_flg_NC(info);
		else if (nc == Cnd_ctg_cd) doCnd_ctg_cd_NC(info);
		else if (nc == Cnd_ctg_nm) doCnd_ctg_nm_NC(info);
		else if (nc == Cnd_no_ctg_flg) doCnd_no_ctg_flg_NC(info);
		else if (nc == Cnd_no_itm2_flg) doCnd_no_itm2_flg_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NC(info);
		else if (nc == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_ctg_cd) doRslt_ctg_cd_NC(info);
		else if (nc == columnRslt_ctg_nm) doRslt_ctg_nm_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_expns_grp_cd) doRslt_expns_grp_cd_NC(info);
		else if (nc == columnRslt_expns_grp_nm) doRslt_expns_grp_nm_NC(info);
		else if (nc == columnRslt_expnsg_seq) doRslt_expnsg_seq_NC(info);
		else if (nc == columnRslt_expns_cd) doRslt_expns_cd_NC(info);
		else if (nc == columnRslt_expns_nm) doRslt_expns_nm_NC(info);
		else if (nc == columnRslt_expns_seq) doRslt_expns_seq_NC(info);
		else if (nc == columnRslt_alc_ptn_cd) doRslt_alc_ptn_cd_NC(info);
		else if (nc == columnRslt_alc_ptn_nm) doRslt_alc_ptn_nm_NC(info);
		else if (nc == columnRslt_alc_amt) doRslt_alc_amt_NC(info);
		else if (nc == columnRslt_alc_tgt_val) doRslt_alc_tgt_val_NC(info);
		else if (nc == columnRslt_alc_rate) doRslt_alc_rate_NC(info);
		else if (nc == columnRslt_coef_val) doRslt_coef_val_NC(info);
		else if (nc == columnRslt_alc_org_tgt_val) doRslt_alc_org_tgt_val_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_zero_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_zero_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dpt2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dpt2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_loc2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_loc2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ctg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ctg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_itm2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_itm2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expnsg_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expnsg_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_tgt_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_tgt_val_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[coef_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_coef_val_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_org_tgt_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_org_tgt_val_NC(MCEventInfo info){
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
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_term) doCnd_term_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_no_loc_flg) doCnd_no_loc_flg_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_no_cst_flg) doCnd_no_cst_flg_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_no_dlv_flg) doCnd_no_dlv_flg_NE(info);
		else if (ne == Cnd_dest_cd1) doCnd_dest_cd1_NE(info);
		else if (ne == Cnd_dest_nm1) doCnd_dest_nm1_NE(info);
		else if (ne == Cnd_no_dest1_flg) doCnd_no_dest1_flg_NE(info);
		else if (ne == Cnd_dest_cd2) doCnd_dest_cd2_NE(info);
		else if (ne == Cnd_dest_nm2) doCnd_dest_nm2_NE(info);
		else if (ne == Cnd_no_dest2_flg) doCnd_no_dest2_flg_NE(info);
		else if (ne == Cnd_dest_cd3) doCnd_dest_cd3_NE(info);
		else if (ne == Cnd_dest_nm3) doCnd_dest_nm3_NE(info);
		else if (ne == Cnd_no_dest3_flg) doCnd_no_dest3_flg_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_no_dpt_flg) doCnd_no_dpt_flg_NE(info);
		else if (ne == Cnd_expns_grp_cd) doCnd_expns_grp_cd_NE(info);
		else if (ne == Cnd_expns_grp_nm) doCnd_expns_grp_nm_NE(info);
		else if (ne == Cnd_expns_cd) doCnd_expns_cd_NE(info);
		else if (ne == Cnd_expns_nm) doCnd_expns_nm_NE(info);
		else if (ne == Cnd_expns_typ) doCnd_expns_typ_NE(info);
		else if (ne == Cnd_expns_typ_nm) doCnd_expns_typ_nm_NE(info);
		else if (ne == Cnd_amt_zero_flg) doCnd_amt_zero_flg_NE(info);
		else if (ne == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NE(info);
		else if (ne == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NE(info);
		else if (ne == Cnd_dpt_cd2) doCnd_dpt_cd2_NE(info);
		else if (ne == Cnd_dpt_nm2) doCnd_dpt_nm2_NE(info);
		else if (ne == Cnd_no_dpt2_flg) doCnd_no_dpt2_flg_NE(info);
		else if (ne == Cnd_loc_cd2) doCnd_loc_cd2_NE(info);
		else if (ne == Cnd_loc_nm2) doCnd_loc_nm2_NE(info);
		else if (ne == Cnd_no_loc2_flg) doCnd_no_loc2_flg_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_no_oper_flg) doCnd_no_oper_flg_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_no_bp_flg) doCnd_no_bp_flg_NE(info);
		else if (ne == Cnd_ctg_cd) doCnd_ctg_cd_NE(info);
		else if (ne == Cnd_ctg_nm) doCnd_ctg_nm_NE(info);
		else if (ne == Cnd_no_ctg_flg) doCnd_no_ctg_flg_NE(info);
		else if (ne == Cnd_no_itm2_flg) doCnd_no_itm2_flg_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NE(info);
		else if (ne == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_ctg_cd) doRslt_ctg_cd_NE(info);
		else if (ne == columnRslt_ctg_nm) doRslt_ctg_nm_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_expns_grp_cd) doRslt_expns_grp_cd_NE(info);
		else if (ne == columnRslt_expns_grp_nm) doRslt_expns_grp_nm_NE(info);
		else if (ne == columnRslt_expnsg_seq) doRslt_expnsg_seq_NE(info);
		else if (ne == columnRslt_expns_cd) doRslt_expns_cd_NE(info);
		else if (ne == columnRslt_expns_nm) doRslt_expns_nm_NE(info);
		else if (ne == columnRslt_expns_seq) doRslt_expns_seq_NE(info);
		else if (ne == columnRslt_alc_ptn_cd) doRslt_alc_ptn_cd_NE(info);
		else if (ne == columnRslt_alc_ptn_nm) doRslt_alc_ptn_nm_NE(info);
		else if (ne == columnRslt_alc_amt) doRslt_alc_amt_NE(info);
		else if (ne == columnRslt_alc_tgt_val) doRslt_alc_tgt_val_NE(info);
		else if (ne == columnRslt_alc_rate) doRslt_alc_rate_NE(info);
		else if (ne == columnRslt_coef_val) doRslt_coef_val_NE(info);
		else if (ne == columnRslt_alc_org_tgt_val) doRslt_alc_org_tgt_val_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_zero_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_zero_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dpt2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dpt2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_loc2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_loc2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ctg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ctg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_itm2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_itm2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expnsg_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expnsg_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_tgt_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_tgt_val_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[coef_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_coef_val_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_org_tgt_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_org_tgt_val_NE(MCEventInfo info){
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
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_term) doCnd_term_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_no_loc_flg) doCnd_no_loc_flg_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_no_cst_flg) doCnd_no_cst_flg_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_no_dlv_flg) doCnd_no_dlv_flg_NX(info);
		else if (nx == Cnd_dest_cd1) doCnd_dest_cd1_NX(info);
		else if (nx == Cnd_dest_nm1) doCnd_dest_nm1_NX(info);
		else if (nx == Cnd_no_dest1_flg) doCnd_no_dest1_flg_NX(info);
		else if (nx == Cnd_dest_cd2) doCnd_dest_cd2_NX(info);
		else if (nx == Cnd_dest_nm2) doCnd_dest_nm2_NX(info);
		else if (nx == Cnd_no_dest2_flg) doCnd_no_dest2_flg_NX(info);
		else if (nx == Cnd_dest_cd3) doCnd_dest_cd3_NX(info);
		else if (nx == Cnd_dest_nm3) doCnd_dest_nm3_NX(info);
		else if (nx == Cnd_no_dest3_flg) doCnd_no_dest3_flg_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_no_dpt_flg) doCnd_no_dpt_flg_NX(info);
		else if (nx == Cnd_expns_grp_cd) doCnd_expns_grp_cd_NX(info);
		else if (nx == Cnd_expns_grp_nm) doCnd_expns_grp_nm_NX(info);
		else if (nx == Cnd_expns_cd) doCnd_expns_cd_NX(info);
		else if (nx == Cnd_expns_nm) doCnd_expns_nm_NX(info);
		else if (nx == Cnd_expns_typ) doCnd_expns_typ_NX(info);
		else if (nx == Cnd_expns_typ_nm) doCnd_expns_typ_nm_NX(info);
		else if (nx == Cnd_amt_zero_flg) doCnd_amt_zero_flg_NX(info);
		else if (nx == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NX(info);
		else if (nx == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NX(info);
		else if (nx == Cnd_dpt_cd2) doCnd_dpt_cd2_NX(info);
		else if (nx == Cnd_dpt_nm2) doCnd_dpt_nm2_NX(info);
		else if (nx == Cnd_no_dpt2_flg) doCnd_no_dpt2_flg_NX(info);
		else if (nx == Cnd_loc_cd2) doCnd_loc_cd2_NX(info);
		else if (nx == Cnd_loc_nm2) doCnd_loc_nm2_NX(info);
		else if (nx == Cnd_no_loc2_flg) doCnd_no_loc2_flg_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_no_oper_flg) doCnd_no_oper_flg_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_no_bp_flg) doCnd_no_bp_flg_NX(info);
		else if (nx == Cnd_ctg_cd) doCnd_ctg_cd_NX(info);
		else if (nx == Cnd_ctg_nm) doCnd_ctg_nm_NX(info);
		else if (nx == Cnd_no_ctg_flg) doCnd_no_ctg_flg_NX(info);
		else if (nx == Cnd_no_itm2_flg) doCnd_no_itm2_flg_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NX(info);
		else if (nx == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_ctg_cd) doRslt_ctg_cd_NX(info);
		else if (nx == columnRslt_ctg_nm) doRslt_ctg_nm_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_expns_grp_cd) doRslt_expns_grp_cd_NX(info);
		else if (nx == columnRslt_expns_grp_nm) doRslt_expns_grp_nm_NX(info);
		else if (nx == columnRslt_expnsg_seq) doRslt_expnsg_seq_NX(info);
		else if (nx == columnRslt_expns_cd) doRslt_expns_cd_NX(info);
		else if (nx == columnRslt_expns_nm) doRslt_expns_nm_NX(info);
		else if (nx == columnRslt_expns_seq) doRslt_expns_seq_NX(info);
		else if (nx == columnRslt_alc_ptn_cd) doRslt_alc_ptn_cd_NX(info);
		else if (nx == columnRslt_alc_ptn_nm) doRslt_alc_ptn_nm_NX(info);
		else if (nx == columnRslt_alc_amt) doRslt_alc_amt_NX(info);
		else if (nx == columnRslt_alc_tgt_val) doRslt_alc_tgt_val_NX(info);
		else if (nx == columnRslt_alc_rate) doRslt_alc_rate_NX(info);
		else if (nx == columnRslt_coef_val) doRslt_coef_val_NX(info);
		else if (nx == columnRslt_alc_org_tgt_val) doRslt_alc_org_tgt_val_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dest3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dest3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_zero_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_zero_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_dpt2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_dpt2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_loc2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_loc2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ctg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ctg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_itm2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_itm2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expnsg_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expnsg_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_tgt_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_tgt_val_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[coef_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_coef_val_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_org_tgt_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_org_tgt_val_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Cnd_term) doCnd_term_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_dest_cd1) doCnd_dest_cd1_LC(info);
		else if (lc == Cnd_dest_nm1) doCnd_dest_nm1_LC(info);
		else if (lc == Cnd_dest_cd2) doCnd_dest_cd2_LC(info);
		else if (lc == Cnd_dest_nm2) doCnd_dest_nm2_LC(info);
		else if (lc == Cnd_dest_cd3) doCnd_dest_cd3_LC(info);
		else if (lc == Cnd_dest_nm3) doCnd_dest_nm3_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_expns_grp_cd) doCnd_expns_grp_cd_LC(info);
		else if (lc == Cnd_expns_grp_nm) doCnd_expns_grp_nm_LC(info);
		else if (lc == Cnd_expns_cd) doCnd_expns_cd_LC(info);
		else if (lc == Cnd_expns_nm) doCnd_expns_nm_LC(info);
		else if (lc == Cnd_expns_typ) doCnd_expns_typ_LC(info);
		else if (lc == Cnd_expns_typ_nm) doCnd_expns_typ_nm_LC(info);
		else if (lc == Cnd_alc_ac_cd) doCnd_alc_ac_cd_LC(info);
		else if (lc == Cnd_alc_ac_nm) doCnd_alc_ac_nm_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_LC(info);
		else if (lc == Cnd_dpt_cd2) doCnd_dpt_cd2_LC(info);
		else if (lc == Cnd_dpt_nm2) doCnd_dpt_nm2_LC(info);
		else if (lc == Cnd_loc_cd2) doCnd_loc_cd2_LC(info);
		else if (lc == Cnd_loc_nm2) doCnd_loc_nm2_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_ctg_cd) doCnd_ctg_cd_LC(info);
		else if (lc == Cnd_ctg_nm) doCnd_ctg_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_LC(info);
		else if (lc == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_ctg_cd) doRslt_ctg_cd_LC(info);
		else if (lc == columnRslt_ctg_nm) doRslt_ctg_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_expns_grp_cd) doRslt_expns_grp_cd_LC(info);
		else if (lc == columnRslt_expns_grp_nm) doRslt_expns_grp_nm_LC(info);
		else if (lc == columnRslt_expnsg_seq) doRslt_expnsg_seq_LC(info);
		else if (lc == columnRslt_expns_cd) doRslt_expns_cd_LC(info);
		else if (lc == columnRslt_expns_nm) doRslt_expns_nm_LC(info);
		else if (lc == columnRslt_expns_seq) doRslt_expns_seq_LC(info);
		else if (lc == columnRslt_alc_ptn_cd) doRslt_alc_ptn_cd_LC(info);
		else if (lc == columnRslt_alc_ptn_nm) doRslt_alc_ptn_nm_LC(info);
		else if (lc == columnRslt_alc_amt) doRslt_alc_amt_LC(info);
		else if (lc == columnRslt_alc_tgt_val) doRslt_alc_tgt_val_LC(info);
		else if (lc == columnRslt_alc_rate) doRslt_alc_rate_LC(info);
		else if (lc == columnRslt_coef_val) doRslt_coef_val_LC(info);
		else if (lc == columnRslt_alc_org_tgt_val) doRslt_alc_org_tgt_val_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expnsg_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expnsg_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_tgt_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_tgt_val_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[coef_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_coef_val_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_org_tgt_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_org_tgt_val_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd1]の作成メソッド
	 */
	public MCList getCnd_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd2]の作成メソッド
	 */
	public MCList getCnd_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd3]の作成メソッド
	 */
	public MCList getCnd_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_expns_grp_cd]の作成メソッド
	 */
	public MCList getCnd_expns_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpnsGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_expns_cd]の作成メソッド
	 */
	public MCList getCnd_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_expns_typ]の作成メソッド
	 */
	public MCList getCnd_expns_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpnsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_cd]の作成メソッド
	 */
	public MCList getCnd_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd2]の作成メソッド
	 */
	public MCList getCnd_dpt_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd2]の作成メソッド
	 */
	public MCList getCnd_loc_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm2_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm2_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm2_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm2_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm2_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm2_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm2_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm2_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBEL0060.Srch01")) {
			return new MG_MGBEL0060_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBEL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0060_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBEL0060_Srch01;

		/** コンストラクタ */
		protected MG_MGBEL0060_Srch01Bridge() {
			p_MG_MGBEL0060_Srch01 = new MCParam(PDef.MG_MGBEL0060_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBEL0060_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBE.MGBEP0060.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0060.RsltR.class));

			p_MG_MGBEL0060_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBEL0060_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBEL0060_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBEL0060_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBEL0060_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBE.MGBEP0060.CndR up0() {
			return (mcframe.clientMGBE.MGBEP0060.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBE.MGBEP0060.RsltR> down0() {
			return (MCList<mcframe.clientMGBE.MGBEP0060.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBEL0060_Srch01.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0060.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBEL0060_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBE.MGBEP0060.RsltR>)p_MG_MGBEL0060_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}