package mcframe.clientMGBB.MGBBP0200;

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
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch01Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch02Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch03Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd01Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd02Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd03Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd04Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd05Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd06Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del01Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del02Caller;
import mcframe.clientMGBB.MGBBP0200.MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del03Caller;

/**
 * 画面"MGBBP_ExpnsCostReg"パネルクラスです。<p>
 *
 * 費目別原価を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBP_ExpnsCostReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBBP0200";

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
	// [RegTarget]ブロック関連のField定義
	public MCPanel RegTargetPanel = null;
	public MCTitledBorder RegTargetTitledBorder = null;
	// [RegTarget]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;AUTO,Auto-set,1;DEL,Delete,2;REF,View,3 UPD,登録・訂正する,0;AUTO,自動設定する,1;DEL,削除する,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_AUTO = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * INPT,Input,0;IO,GR/GI,1;SLS,Sales,2 INPT,投入,0;IO,入出庫,1;SLS,売上,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_tar_Group = null;
	public MCRadioButton Cnd_tar_INPT = null;
	public MCRadioButton Cnd_tar_IO = null;
	public MCRadioButton Cnd_tar_SLS = null;
	public MCLabel Cnd_act_id_Label = null;
	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_id = null;
	public MCLabel Cnd_act_id_sub_Label = null;
	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public MCTextField Cnd_act_id_sub = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_inpt = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_io = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_sls = null;
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	/**
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_expns_grp = null;
	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public MCCheckBox LPnl_disp_expns = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBB.MGBBP0200.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_id = null;
	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_id_sub = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Amount setting type 金額設定区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_set_typ = null;
	/**
	 * Amount setting type name 金額設定区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_set_typ_nm = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_grp_nm = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_nm = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rec_eval_typ = null;
	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rec_eval_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_p_PPanel;
	public MCColumnConfig columnRslt_qty;// [Rslt]の[qty_p.qty]を[columnRslt_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ttl = null;
	public MCColumnConfig columnRslt_col_000 = null;
	public MCColumnConfig columnRslt_col_001 = null;
	public MCColumnConfig columnRslt_col_002 = null;
	public MCColumnConfig columnRslt_col_003 = null;
	public MCColumnConfig columnRslt_col_004 = null;
	public MCColumnConfig columnRslt_col_005 = null;
	public MCColumnConfig columnRslt_col_006 = null;
	public MCColumnConfig columnRslt_col_007 = null;
	public MCColumnConfig columnRslt_col_008 = null;
	public MCColumnConfig columnRslt_col_009 = null;
	public MCColumnConfig columnRslt_col_010 = null;
	public MCColumnConfig columnRslt_col_011 = null;
	public MCColumnConfig columnRslt_col_012 = null;
	public MCColumnConfig columnRslt_col_013 = null;
	public MCColumnConfig columnRslt_col_014 = null;
	public MCColumnConfig columnRslt_col_015 = null;
	public MCColumnConfig columnRslt_col_016 = null;
	public MCColumnConfig columnRslt_col_017 = null;
	public MCColumnConfig columnRslt_col_018 = null;
	public MCColumnConfig columnRslt_col_019 = null;
	public MCColumnConfig columnRslt_col_020 = null;
	public MCColumnConfig columnRslt_col_021 = null;
	public MCColumnConfig columnRslt_col_022 = null;
	public MCColumnConfig columnRslt_col_023 = null;
	public MCColumnConfig columnRslt_col_024 = null;
	public MCColumnConfig columnRslt_col_025 = null;
	public MCColumnConfig columnRslt_col_026 = null;
	public MCColumnConfig columnRslt_col_027 = null;
	public MCColumnConfig columnRslt_col_028 = null;
	public MCColumnConfig columnRslt_col_029 = null;
	public MCColumnConfig columnRslt_col_030 = null;
	public MCColumnConfig columnRslt_col_031 = null;
	public MCColumnConfig columnRslt_col_032 = null;
	public MCColumnConfig columnRslt_col_033 = null;
	public MCColumnConfig columnRslt_col_034 = null;
	public MCColumnConfig columnRslt_col_035 = null;
	public MCColumnConfig columnRslt_col_036 = null;
	public MCColumnConfig columnRslt_col_037 = null;
	public MCColumnConfig columnRslt_col_038 = null;
	public MCColumnConfig columnRslt_col_039 = null;
	public MCColumnConfig columnRslt_col_040 = null;
	public MCColumnConfig columnRslt_col_041 = null;
	public MCColumnConfig columnRslt_col_042 = null;
	public MCColumnConfig columnRslt_col_043 = null;
	public MCColumnConfig columnRslt_col_044 = null;
	public MCColumnConfig columnRslt_col_045 = null;
	public MCColumnConfig columnRslt_col_046 = null;
	public MCColumnConfig columnRslt_col_047 = null;
	public MCColumnConfig columnRslt_col_048 = null;
	public MCColumnConfig columnRslt_col_049 = null;
	public MCColumnConfig columnRslt_col_050 = null;
	public MCColumnConfig columnRslt_col_051 = null;
	public MCColumnConfig columnRslt_col_052 = null;
	public MCColumnConfig columnRslt_col_053 = null;
	public MCColumnConfig columnRslt_col_054 = null;
	public MCColumnConfig columnRslt_col_055 = null;
	public MCColumnConfig columnRslt_col_056 = null;
	public MCColumnConfig columnRslt_col_057 = null;
	public MCColumnConfig columnRslt_col_058 = null;
	public MCColumnConfig columnRslt_col_059 = null;
	public MCColumnConfig columnRslt_col_060 = null;
	public MCColumnConfig columnRslt_col_061 = null;
	public MCColumnConfig columnRslt_col_062 = null;
	public MCColumnConfig columnRslt_col_063 = null;
	public MCColumnConfig columnRslt_col_064 = null;
	public MCColumnConfig columnRslt_col_065 = null;
	public MCColumnConfig columnRslt_col_066 = null;
	public MCColumnConfig columnRslt_col_067 = null;
	public MCColumnConfig columnRslt_col_068 = null;
	public MCColumnConfig columnRslt_col_069 = null;
	public MCColumnConfig columnRslt_col_070 = null;
	public MCColumnConfig columnRslt_col_071 = null;
	public MCColumnConfig columnRslt_col_072 = null;
	public MCColumnConfig columnRslt_col_073 = null;
	public MCColumnConfig columnRslt_col_074 = null;
	public MCColumnConfig columnRslt_col_075 = null;
	public MCColumnConfig columnRslt_col_076 = null;
	public MCColumnConfig columnRslt_col_077 = null;
	public MCColumnConfig columnRslt_col_078 = null;
	public MCColumnConfig columnRslt_col_079 = null;
	public MCColumnConfig columnRslt_col_080 = null;
	public MCColumnConfig columnRslt_col_081 = null;
	public MCColumnConfig columnRslt_col_082 = null;
	public MCColumnConfig columnRslt_col_083 = null;
	public MCColumnConfig columnRslt_col_084 = null;
	public MCColumnConfig columnRslt_col_085 = null;
	public MCColumnConfig columnRslt_col_086 = null;
	public MCColumnConfig columnRslt_col_087 = null;
	public MCColumnConfig columnRslt_col_088 = null;
	public MCColumnConfig columnRslt_col_089 = null;
	public MCColumnConfig columnRslt_col_090 = null;
	public MCColumnConfig columnRslt_col_091 = null;
	public MCColumnConfig columnRslt_col_092 = null;
	public MCColumnConfig columnRslt_col_093 = null;
	public MCColumnConfig columnRslt_col_094 = null;
	public MCColumnConfig columnRslt_col_095 = null;
	public MCColumnConfig columnRslt_col_096 = null;
	public MCColumnConfig columnRslt_col_097 = null;
	public MCColumnConfig columnRslt_col_098 = null;
	public MCColumnConfig columnRslt_col_099 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_inpt = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_io = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_sls = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_inpt_a = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_io_a = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_sls_a = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_inpt = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_io = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_sls = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_INPT]モードを表す定数 */
	public static final String SRCH_INPT = "SRCH_INPT";
	/** [UPD_INPT]モードを表す定数 */
	public static final String UPD_INPT = "UPD_INPT";
	/** [REF_INPT]モードを表す定数 */
	public static final String REF_INPT = "REF_INPT";
	/** [DEL_INPT]モードを表す定数 */
	public static final String DEL_INPT = "DEL_INPT";
	/** [SRCH_AUTO_INPT]モードを表す定数 */
	public static final String SRCH_AUTO_INPT = "SRCH_AUTO_INPT";
	/** [AUTO_INPT]モードを表す定数 */
	public static final String AUTO_INPT = "AUTO_INPT";
	/** [FIX_INPT]モードを表す定数 */
	public static final String FIX_INPT = "FIX_INPT";
	/** [FIX_AUTO_INPT]モードを表す定数 */
	public static final String FIX_AUTO_INPT = "FIX_AUTO_INPT";
	/** [SRCH_IO]モードを表す定数 */
	public static final String SRCH_IO = "SRCH_IO";
	/** [UPD_IO]モードを表す定数 */
	public static final String UPD_IO = "UPD_IO";
	/** [REF_IO]モードを表す定数 */
	public static final String REF_IO = "REF_IO";
	/** [DEL_IO]モードを表す定数 */
	public static final String DEL_IO = "DEL_IO";
	/** [SRCH_AUTO_IO]モードを表す定数 */
	public static final String SRCH_AUTO_IO = "SRCH_AUTO_IO";
	/** [AUTO_IO]モードを表す定数 */
	public static final String AUTO_IO = "AUTO_IO";
	/** [FIX_IO]モードを表す定数 */
	public static final String FIX_IO = "FIX_IO";
	/** [FIX_AUTO_IO]モードを表す定数 */
	public static final String FIX_AUTO_IO = "FIX_AUTO_IO";
	/** [SRCH_SLS]モードを表す定数 */
	public static final String SRCH_SLS = "SRCH_SLS";
	/** [UPD_SLS]モードを表す定数 */
	public static final String UPD_SLS = "UPD_SLS";
	/** [REF_SLS]モードを表す定数 */
	public static final String REF_SLS = "REF_SLS";
	/** [DEL_SLS]モードを表す定数 */
	public static final String DEL_SLS = "DEL_SLS";
	/** [SRCH_AUTO_SLS]モードを表す定数 */
	public static final String SRCH_AUTO_SLS = "SRCH_AUTO_SLS";
	/** [AUTO_SLS]モードを表す定数 */
	public static final String AUTO_SLS = "AUTO_SLS";
	/** [FIX_SLS]モードを表す定数 */
	public static final String FIX_SLS = "FIX_SLS";
	/** [FIX_AUTO_SLS]モードを表す定数 */
	public static final String FIX_AUTO_SLS = "FIX_AUTO_SLS";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_INPT, UPD_INPT, REF_INPT, DEL_INPT, SRCH_AUTO_INPT, AUTO_INPT, FIX_INPT, FIX_AUTO_INPT, SRCH_IO, UPD_IO, REF_IO, DEL_IO, SRCH_AUTO_IO, AUTO_IO, FIX_IO, FIX_AUTO_IO, SRCH_SLS, UPD_SLS, REF_SLS, DEL_SLS, SRCH_AUTO_SLS, AUTO_SLS, FIX_SLS, FIX_AUTO_SLS};
	
	/** [MG_MGBBL0200_Srch01]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch01Caller createMG_MGBBL0200_Srch01() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch01Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Srch01Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Srch01Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Srch01Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Srch01]の呼び出し */
	protected void callMG_MGBBL0200_Srch01() {
		MCCaller caller = createMG_MGBBL0200_Srch01();
		caller.exec();
	}
	/** [MG_MGBBL0200_Srch02]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch02Caller createMG_MGBBL0200_Srch02() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch02Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Srch02Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Srch02Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Srch02Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Srch02]の呼び出し */
	protected void callMG_MGBBL0200_Srch02() {
		MCCaller caller = createMG_MGBBL0200_Srch02();
		caller.exec();
	}
	/** [MG_MGBBL0200_Srch03]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch03Caller createMG_MGBBL0200_Srch03() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Srch03Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Srch03Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Srch03Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Srch03Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Srch03Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Srch03]の呼び出し */
	protected void callMG_MGBBL0200_Srch03() {
		MCCaller caller = createMG_MGBBL0200_Srch03();
		caller.exec();
	}
	/** [MG_MGBBL0200_Upd01]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd01Caller createMG_MGBBL0200_Upd01() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd01Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd01Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Upd01Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd01Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Upd01]の呼び出し */
	protected void callMG_MGBBL0200_Upd01() {
		MCCaller caller = createMG_MGBBL0200_Upd01();
		caller.exec();
	}
	/** [MG_MGBBL0200_Upd02]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd02Caller createMG_MGBBL0200_Upd02() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd02Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd02Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Upd02Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd02Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Upd02Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Upd02]の呼び出し */
	protected void callMG_MGBBL0200_Upd02() {
		MCCaller caller = createMG_MGBBL0200_Upd02();
		caller.exec();
	}
	/** [MG_MGBBL0200_Upd03]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd03Caller createMG_MGBBL0200_Upd03() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd03Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd03Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Upd03Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd03Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Upd03Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Upd03]の呼び出し */
	protected void callMG_MGBBL0200_Upd03() {
		MCCaller caller = createMG_MGBBL0200_Upd03();
		caller.exec();
	}
	/** [MG_MGBBL0200_Upd04]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd04Caller createMG_MGBBL0200_Upd04() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd04Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd04Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Upd04Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd04Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Upd04Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Upd04]の呼び出し */
	protected void callMG_MGBBL0200_Upd04() {
		MCCaller caller = createMG_MGBBL0200_Upd04();
		caller.exec();
	}
	/** [MG_MGBBL0200_Upd05]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd05Caller createMG_MGBBL0200_Upd05() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd05Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd05Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Upd05Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd05Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Upd05Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Upd05]の呼び出し */
	protected void callMG_MGBBL0200_Upd05() {
		MCCaller caller = createMG_MGBBL0200_Upd05();
		caller.exec();
	}
	/** [MG_MGBBL0200_Upd06]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd06Caller createMG_MGBBL0200_Upd06() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Upd06Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd06Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Upd06Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Upd06Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Upd06Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Upd06]の呼び出し */
	protected void callMG_MGBBL0200_Upd06() {
		MCCaller caller = createMG_MGBBL0200_Upd06();
		caller.exec();
	}
	/** [MG_MGBBL0200_Del01]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del01Caller createMG_MGBBL0200_Del01() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del01Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Del01Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Del01Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Del01Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Del01Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Del01]の呼び出し */
	protected void callMG_MGBBL0200_Del01() {
		MCCaller caller = createMG_MGBBL0200_Del01();
		caller.exec();
	}
	/** [MG_MGBBL0200_Del02]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del02Caller createMG_MGBBL0200_Del02() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del02Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Del02Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Del02Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Del02Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Del02Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Del02]の呼び出し */
	protected void callMG_MGBBL0200_Del02() {
		MCCaller caller = createMG_MGBBL0200_Del02();
		caller.exec();
	}
	/** [MG_MGBBL0200_Del03]のCallerの作成 */
	protected MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del03Caller createMG_MGBBL0200_Del03() {
		MGBBP_ExpnsCostReg_MC.MG_MGBBL0200_Del03Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Del03Bridge>
		caller = ((MGBBP_ExpnsCostReg_MC)this).new MG_MGBBL0200_Del03Caller<MGBBP_ExpnsCostReg, MG_MGBBL0200_Del03Bridge>(
					(MGBBP_ExpnsCostReg)this, new MG_MGBBL0200_Del03Bridge());
		return caller;
	}
	/** [MG_MGBBL0200_Del03]の呼び出し */
	protected void callMG_MGBBL0200_Del03() {
		MCCaller caller = createMG_MGBBL0200_Del03();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0200.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0200.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBB.MGBBP0200.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBB.MGBBP0200.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0200.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0200.CndR createCndR() {
		return mcframe.clientMGBB.MGBBP0200.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMGBB.MGBBP0200.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBB.MGBBP0200.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBB.MGBBP0200.LPnlR createLPnlR() {
		return mcframe.clientMGBB.MGBBP0200.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBB.MGBBP0200.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0200.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBB.MGBBP0200.RsltR createRsltR() {
		return mcframe.clientMGBB.MGBBP0200.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0200.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
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
		if(aCnt == getLPnlR()) return "LPnl";
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
		if(bId.equals("LPnl")) return getLPnlR();
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
		ret.add(ScreenOpePanel);
		ret.add(RegTargetPanel);
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ExpnsCostReg_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBBP_ExpnsCostReg_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBBP_ExpnsCostReg_MC.jbCreateScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbCreateRegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbCreateCnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbCreateLPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbCreateRslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbCreateBtn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbCreateEastBtn((MGBBP_ExpnsCostReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBBP_ExpnsCostReg p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MGBBP_ExpnsCostReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBBP_ExpnsCostReg p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBBP_ExpnsCostReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBBP_ExpnsCostReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBB.MGBBP0200.RsltR.$itm_p);
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
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBB.MGBBP0200.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_qty.addAliasName("Rslt.qty", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBB.MGBBP0200.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBBP_ExpnsCostReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBBP_ExpnsCostReg p) {
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

	
	/** [Rslt_amt_set_typ_ListPutter]の定義 */
	private MCListPutter Rslt_amt_set_typ_p = null;

	/**
	 * [Rslt_amt_set_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_amt_set_typ_ListPutter() {
		if (Rslt_amt_set_typ_p == null) {
			Rslt_amt_set_typ_p = createRslt_amt_set_typ_ListPutter(columnRslt_amt_set_typ, "amt_set_typ", "amt_set_typ_nm");

		}
		return Rslt_amt_set_typ_p;
	}
	
	
	/** [Rslt_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_calc_grp_cd_p = null;

	/**
	 * [Rslt_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_calc_grp_cd_ListPutter() {
		if (Rslt_calc_grp_cd_p == null) {
			Rslt_calc_grp_cd_p = createRslt_calc_grp_cd_ListPutter(columnRslt_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Rslt_calc_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_ExpnsCostReg create(){
		MGBBP_ExpnsCostReg p = new MGBBP_ExpnsCostReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_ExpnsCostReg create(String name){
		MGBBP_ExpnsCostReg p = new MGBBP_ExpnsCostReg(name);
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
		MGBBP_ExpnsCostReg_MC.jbfInitScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbfInitRegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbfInitCnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbfInitLPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbfInitRslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbfInitBtn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbfInitEastBtn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbInitScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbInitRegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbInitCnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbInitLPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbInitRslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbInitBtn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.jbInitEastBtn((MGBBP_ExpnsCostReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_AUTO = p.beansFactory.createRadioButton("Cnd.ope_AUTO");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_tar_Group = p.beansFactory.createButtonGroup("Cnd.tar");
		p.Cnd_tar_INPT = p.beansFactory.createRadioButton("Cnd.tar_INPT");
		p.Cnd_tar_IO = p.beansFactory.createRadioButton("Cnd.tar_IO");
		p.Cnd_tar_SLS = p.beansFactory.createRadioButton("Cnd.tar_SLS");
		p.Cnd_act_id_Label = p.beansFactory.createLabel("Cnd.act_id_Label");
		p.Cnd_act_id = p.beansFactory.createTextField("Cnd.act_id");
		p.Cnd_act_id.setLabel(p.Cnd_act_id_Label);
		p.Cnd_act_id_sub_Label = p.beansFactory.createLabel("Cnd.act_id_sub_Label");
		p.Cnd_act_id_sub = p.beansFactory.createTextField("Cnd.act_id_sub");
		p.Cnd_act_id_sub.setLabel(p.Cnd_act_id_sub_Label);
		p.Cnd_srch_inpt = p.beansFactory.createButton("Cnd.srch_inpt", "srch");
		p.Cnd_srch_io = p.beansFactory.createButton("Cnd.srch_io", "srch");
		p.Cnd_srch_sls = p.beansFactory.createButton("Cnd.srch_sls", "srch");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_disp_expns_grp = p.beansFactory.createCheckBox("LPnl.disp_expns_grp");
		p.LPnl_disp_expns = p.beansFactory.createCheckBox("LPnl.disp_expns");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_act_id = p.beansFactory.createTableColumn("Rslt.act_id", MCColumnType.TEXT);
		p.columnRslt_act_id_sub = p.beansFactory.createTableColumn("Rslt.act_id_sub", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_amt_set_typ = p.beansFactory.createTableColumn("Rslt.amt_set_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_amt_set_typ_nm = p.beansFactory.createTableColumn("Rslt.amt_set_typ_nm", MCColumnType.TEXT);
		p.columnRslt_calc_grp_cd = p.beansFactory.createTableColumn("Rslt.calc_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_calc_grp_nm = p.beansFactory.createTableColumn("Rslt.calc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_calc_ctg_cd = p.beansFactory.createTableColumn("Rslt.calc_ctg_cd", MCColumnType.TEXT);
		p.columnRslt_calc_ctg_nm = p.beansFactory.createTableColumn("Rslt.calc_ctg_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_rec_eval_typ = p.beansFactory.createTableColumn("Rslt.rec_eval_typ", MCColumnType.TEXT);
		p.columnRslt_rec_eval_typ_nm = p.beansFactory.createTableColumn("Rslt.rec_eval_typ_nm", MCColumnType.TEXT);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_upri = p.beansFactory.createTableColumn("Rslt.upri", MCColumnType.NUMBER);
		p.columnRslt_ttl = p.beansFactory.createTableColumn("Rslt.ttl", MCColumnType.NUMBER);
		p.columnRslt_col_000 = p.beansFactory.createTableColumn("Rslt.col_000", MCColumnType.NUMBER);
		p.columnRslt_col_001 = p.beansFactory.createTableColumn("Rslt.col_001", MCColumnType.NUMBER);
		p.columnRslt_col_002 = p.beansFactory.createTableColumn("Rslt.col_002", MCColumnType.NUMBER);
		p.columnRslt_col_003 = p.beansFactory.createTableColumn("Rslt.col_003", MCColumnType.NUMBER);
		p.columnRslt_col_004 = p.beansFactory.createTableColumn("Rslt.col_004", MCColumnType.NUMBER);
		p.columnRslt_col_005 = p.beansFactory.createTableColumn("Rslt.col_005", MCColumnType.NUMBER);
		p.columnRslt_col_006 = p.beansFactory.createTableColumn("Rslt.col_006", MCColumnType.NUMBER);
		p.columnRslt_col_007 = p.beansFactory.createTableColumn("Rslt.col_007", MCColumnType.NUMBER);
		p.columnRslt_col_008 = p.beansFactory.createTableColumn("Rslt.col_008", MCColumnType.NUMBER);
		p.columnRslt_col_009 = p.beansFactory.createTableColumn("Rslt.col_009", MCColumnType.NUMBER);
		p.columnRslt_col_010 = p.beansFactory.createTableColumn("Rslt.col_010", MCColumnType.NUMBER);
		p.columnRslt_col_011 = p.beansFactory.createTableColumn("Rslt.col_011", MCColumnType.NUMBER);
		p.columnRslt_col_012 = p.beansFactory.createTableColumn("Rslt.col_012", MCColumnType.NUMBER);
		p.columnRslt_col_013 = p.beansFactory.createTableColumn("Rslt.col_013", MCColumnType.NUMBER);
		p.columnRslt_col_014 = p.beansFactory.createTableColumn("Rslt.col_014", MCColumnType.NUMBER);
		p.columnRslt_col_015 = p.beansFactory.createTableColumn("Rslt.col_015", MCColumnType.NUMBER);
		p.columnRslt_col_016 = p.beansFactory.createTableColumn("Rslt.col_016", MCColumnType.NUMBER);
		p.columnRslt_col_017 = p.beansFactory.createTableColumn("Rslt.col_017", MCColumnType.NUMBER);
		p.columnRslt_col_018 = p.beansFactory.createTableColumn("Rslt.col_018", MCColumnType.NUMBER);
		p.columnRslt_col_019 = p.beansFactory.createTableColumn("Rslt.col_019", MCColumnType.NUMBER);
		p.columnRslt_col_020 = p.beansFactory.createTableColumn("Rslt.col_020", MCColumnType.NUMBER);
		p.columnRslt_col_021 = p.beansFactory.createTableColumn("Rslt.col_021", MCColumnType.NUMBER);
		p.columnRslt_col_022 = p.beansFactory.createTableColumn("Rslt.col_022", MCColumnType.NUMBER);
		p.columnRslt_col_023 = p.beansFactory.createTableColumn("Rslt.col_023", MCColumnType.NUMBER);
		p.columnRslt_col_024 = p.beansFactory.createTableColumn("Rslt.col_024", MCColumnType.NUMBER);
		p.columnRslt_col_025 = p.beansFactory.createTableColumn("Rslt.col_025", MCColumnType.NUMBER);
		p.columnRslt_col_026 = p.beansFactory.createTableColumn("Rslt.col_026", MCColumnType.NUMBER);
		p.columnRslt_col_027 = p.beansFactory.createTableColumn("Rslt.col_027", MCColumnType.NUMBER);
		p.columnRslt_col_028 = p.beansFactory.createTableColumn("Rslt.col_028", MCColumnType.NUMBER);
		p.columnRslt_col_029 = p.beansFactory.createTableColumn("Rslt.col_029", MCColumnType.NUMBER);
		p.columnRslt_col_030 = p.beansFactory.createTableColumn("Rslt.col_030", MCColumnType.NUMBER);
		p.columnRslt_col_031 = p.beansFactory.createTableColumn("Rslt.col_031", MCColumnType.NUMBER);
		p.columnRslt_col_032 = p.beansFactory.createTableColumn("Rslt.col_032", MCColumnType.NUMBER);
		p.columnRslt_col_033 = p.beansFactory.createTableColumn("Rslt.col_033", MCColumnType.NUMBER);
		p.columnRslt_col_034 = p.beansFactory.createTableColumn("Rslt.col_034", MCColumnType.NUMBER);
		p.columnRslt_col_035 = p.beansFactory.createTableColumn("Rslt.col_035", MCColumnType.NUMBER);
		p.columnRslt_col_036 = p.beansFactory.createTableColumn("Rslt.col_036", MCColumnType.NUMBER);
		p.columnRslt_col_037 = p.beansFactory.createTableColumn("Rslt.col_037", MCColumnType.NUMBER);
		p.columnRslt_col_038 = p.beansFactory.createTableColumn("Rslt.col_038", MCColumnType.NUMBER);
		p.columnRslt_col_039 = p.beansFactory.createTableColumn("Rslt.col_039", MCColumnType.NUMBER);
		p.columnRslt_col_040 = p.beansFactory.createTableColumn("Rslt.col_040", MCColumnType.NUMBER);
		p.columnRslt_col_041 = p.beansFactory.createTableColumn("Rslt.col_041", MCColumnType.NUMBER);
		p.columnRslt_col_042 = p.beansFactory.createTableColumn("Rslt.col_042", MCColumnType.NUMBER);
		p.columnRslt_col_043 = p.beansFactory.createTableColumn("Rslt.col_043", MCColumnType.NUMBER);
		p.columnRslt_col_044 = p.beansFactory.createTableColumn("Rslt.col_044", MCColumnType.NUMBER);
		p.columnRslt_col_045 = p.beansFactory.createTableColumn("Rslt.col_045", MCColumnType.NUMBER);
		p.columnRslt_col_046 = p.beansFactory.createTableColumn("Rslt.col_046", MCColumnType.NUMBER);
		p.columnRslt_col_047 = p.beansFactory.createTableColumn("Rslt.col_047", MCColumnType.NUMBER);
		p.columnRslt_col_048 = p.beansFactory.createTableColumn("Rslt.col_048", MCColumnType.NUMBER);
		p.columnRslt_col_049 = p.beansFactory.createTableColumn("Rslt.col_049", MCColumnType.NUMBER);
		p.columnRslt_col_050 = p.beansFactory.createTableColumn("Rslt.col_050", MCColumnType.NUMBER);
		p.columnRslt_col_051 = p.beansFactory.createTableColumn("Rslt.col_051", MCColumnType.NUMBER);
		p.columnRslt_col_052 = p.beansFactory.createTableColumn("Rslt.col_052", MCColumnType.NUMBER);
		p.columnRslt_col_053 = p.beansFactory.createTableColumn("Rslt.col_053", MCColumnType.NUMBER);
		p.columnRslt_col_054 = p.beansFactory.createTableColumn("Rslt.col_054", MCColumnType.NUMBER);
		p.columnRslt_col_055 = p.beansFactory.createTableColumn("Rslt.col_055", MCColumnType.NUMBER);
		p.columnRslt_col_056 = p.beansFactory.createTableColumn("Rslt.col_056", MCColumnType.NUMBER);
		p.columnRslt_col_057 = p.beansFactory.createTableColumn("Rslt.col_057", MCColumnType.NUMBER);
		p.columnRslt_col_058 = p.beansFactory.createTableColumn("Rslt.col_058", MCColumnType.NUMBER);
		p.columnRslt_col_059 = p.beansFactory.createTableColumn("Rslt.col_059", MCColumnType.NUMBER);
		p.columnRslt_col_060 = p.beansFactory.createTableColumn("Rslt.col_060", MCColumnType.NUMBER);
		p.columnRslt_col_061 = p.beansFactory.createTableColumn("Rslt.col_061", MCColumnType.NUMBER);
		p.columnRslt_col_062 = p.beansFactory.createTableColumn("Rslt.col_062", MCColumnType.NUMBER);
		p.columnRslt_col_063 = p.beansFactory.createTableColumn("Rslt.col_063", MCColumnType.NUMBER);
		p.columnRslt_col_064 = p.beansFactory.createTableColumn("Rslt.col_064", MCColumnType.NUMBER);
		p.columnRslt_col_065 = p.beansFactory.createTableColumn("Rslt.col_065", MCColumnType.NUMBER);
		p.columnRslt_col_066 = p.beansFactory.createTableColumn("Rslt.col_066", MCColumnType.NUMBER);
		p.columnRslt_col_067 = p.beansFactory.createTableColumn("Rslt.col_067", MCColumnType.NUMBER);
		p.columnRslt_col_068 = p.beansFactory.createTableColumn("Rslt.col_068", MCColumnType.NUMBER);
		p.columnRslt_col_069 = p.beansFactory.createTableColumn("Rslt.col_069", MCColumnType.NUMBER);
		p.columnRslt_col_070 = p.beansFactory.createTableColumn("Rslt.col_070", MCColumnType.NUMBER);
		p.columnRslt_col_071 = p.beansFactory.createTableColumn("Rslt.col_071", MCColumnType.NUMBER);
		p.columnRslt_col_072 = p.beansFactory.createTableColumn("Rslt.col_072", MCColumnType.NUMBER);
		p.columnRslt_col_073 = p.beansFactory.createTableColumn("Rslt.col_073", MCColumnType.NUMBER);
		p.columnRslt_col_074 = p.beansFactory.createTableColumn("Rslt.col_074", MCColumnType.NUMBER);
		p.columnRslt_col_075 = p.beansFactory.createTableColumn("Rslt.col_075", MCColumnType.NUMBER);
		p.columnRslt_col_076 = p.beansFactory.createTableColumn("Rslt.col_076", MCColumnType.NUMBER);
		p.columnRslt_col_077 = p.beansFactory.createTableColumn("Rslt.col_077", MCColumnType.NUMBER);
		p.columnRslt_col_078 = p.beansFactory.createTableColumn("Rslt.col_078", MCColumnType.NUMBER);
		p.columnRslt_col_079 = p.beansFactory.createTableColumn("Rslt.col_079", MCColumnType.NUMBER);
		p.columnRslt_col_080 = p.beansFactory.createTableColumn("Rslt.col_080", MCColumnType.NUMBER);
		p.columnRslt_col_081 = p.beansFactory.createTableColumn("Rslt.col_081", MCColumnType.NUMBER);
		p.columnRslt_col_082 = p.beansFactory.createTableColumn("Rslt.col_082", MCColumnType.NUMBER);
		p.columnRslt_col_083 = p.beansFactory.createTableColumn("Rslt.col_083", MCColumnType.NUMBER);
		p.columnRslt_col_084 = p.beansFactory.createTableColumn("Rslt.col_084", MCColumnType.NUMBER);
		p.columnRslt_col_085 = p.beansFactory.createTableColumn("Rslt.col_085", MCColumnType.NUMBER);
		p.columnRslt_col_086 = p.beansFactory.createTableColumn("Rslt.col_086", MCColumnType.NUMBER);
		p.columnRslt_col_087 = p.beansFactory.createTableColumn("Rslt.col_087", MCColumnType.NUMBER);
		p.columnRslt_col_088 = p.beansFactory.createTableColumn("Rslt.col_088", MCColumnType.NUMBER);
		p.columnRslt_col_089 = p.beansFactory.createTableColumn("Rslt.col_089", MCColumnType.NUMBER);
		p.columnRslt_col_090 = p.beansFactory.createTableColumn("Rslt.col_090", MCColumnType.NUMBER);
		p.columnRslt_col_091 = p.beansFactory.createTableColumn("Rslt.col_091", MCColumnType.NUMBER);
		p.columnRslt_col_092 = p.beansFactory.createTableColumn("Rslt.col_092", MCColumnType.NUMBER);
		p.columnRslt_col_093 = p.beansFactory.createTableColumn("Rslt.col_093", MCColumnType.NUMBER);
		p.columnRslt_col_094 = p.beansFactory.createTableColumn("Rslt.col_094", MCColumnType.NUMBER);
		p.columnRslt_col_095 = p.beansFactory.createTableColumn("Rslt.col_095", MCColumnType.NUMBER);
		p.columnRslt_col_096 = p.beansFactory.createTableColumn("Rslt.col_096", MCColumnType.NUMBER);
		p.columnRslt_col_097 = p.beansFactory.createTableColumn("Rslt.col_097", MCColumnType.NUMBER);
		p.columnRslt_col_098 = p.beansFactory.createTableColumn("Rslt.col_098", MCColumnType.NUMBER);
		p.columnRslt_col_099 = p.beansFactory.createTableColumn("Rslt.col_099", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd_inpt = p.beansFactory.createButton("Btn.upd_inpt", "upd");
		p.Btn_upd_io = p.beansFactory.createButton("Btn.upd_io", "upd");
		p.Btn_upd_sls = p.beansFactory.createButton("Btn.upd_sls", "upd");
		p.Btn_upd_inpt_a = p.beansFactory.createButton("Btn.upd_inpt_a", "upd");
		p.Btn_upd_io_a = p.beansFactory.createButton("Btn.upd_io_a", "upd");
		p.Btn_upd_sls_a = p.beansFactory.createButton("Btn.upd_sls_a", "upd");
		p.Btn_del_inpt = p.beansFactory.createButton("Btn.del_inpt", "del");
		p.Btn_del_io = p.beansFactory.createButton("Btn.del_io", "del");
		p.Btn_del_sls = p.beansFactory.createButton("Btn.del_sls", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RegTargetPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTarget(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel.setBorder(p.RegTargetTitledBorder);
		p.add(p.RegTargetPanel);
		p.RegTargetPanel.setNextBeans(p.CndPanel);
		p.RegTargetPanel.setValueCheck(false);
		p.RegTargetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RegTargetPanel.setLayoutPosition("NNWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.LPnlPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_AUTO);
		p.Cnd_ope_AUTO.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_AUTO);
		p.ScreenOpePanel.add(p.Cnd_ope_AUTO);
		p.Cnd_ope_AUTO.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0200.CndR.ope_META);
		p.RegTargetPanel.setLastBeans(p.Cnd_tar_Group);
		p.Cnd_tar_Group.setFirstBeans(p.Cnd_tar_INPT);
		p.Cnd_tar_INPT.setActionCommand("0");
		p.Cnd_tar_Group.add(p.Cnd_tar_INPT);
		p.RegTargetPanel.add(p.Cnd_tar_INPT);
		p.Cnd_tar_INPT.setNextBeans(p.Cnd_tar_IO);
		p.Cnd_tar_IO.setActionCommand("1");
		p.Cnd_tar_Group.add(p.Cnd_tar_IO);
		p.RegTargetPanel.add(p.Cnd_tar_IO);
		p.Cnd_tar_IO.setNextBeans(p.Cnd_tar_SLS);
		p.Cnd_tar_SLS.setActionCommand("2");
		p.Cnd_tar_Group.add(p.Cnd_tar_SLS);
		p.RegTargetPanel.add(p.Cnd_tar_SLS);
		p.Cnd_tar_Group.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0200.CndR.tar_META);
		p.CndPanel.add(p.Cnd_act_id_Label);
		p.CndPanel.add(p.Cnd_act_id);
		p.CndPanel.setLastBeans(p.Cnd_act_id);
		p.Cnd_act_id.setNextBeans(p.Cnd_act_id_sub);
		p.Cnd_act_id.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0200.CndR.act_id_META);
		p.CndPanel.add(p.Cnd_act_id_sub_Label);
		p.CndPanel.add(p.Cnd_act_id_sub);
		p.Cnd_act_id_sub.setNextBeans(p.Cnd_srch_inpt);
		p.Cnd_act_id_sub.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0200.CndR.act_id_sub_META);
		p.Cnd_srch_inpt.setIcon("SEARCH");
		p.Cnd_srch_inpt.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_inpt);
		p.Cnd_srch_inpt.setNextBeans(p.Cnd_srch_io);
		p.Cnd_srch_io.setIcon("SEARCH");
		p.Cnd_srch_io.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_io);
		p.Cnd_srch_io.setNextBeans(p.Cnd_srch_sls);
		p.Cnd_srch_sls.setIcon("SEARCH");
		p.Cnd_srch_sls.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_sls);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.add(p.LPnlPanel);
		p.LPnlPanel.setNextBeans(p.RsltPanel);
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("NSW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_disp_expns_grp);
		p.LPnlPanel.setLastBeans(p.LPnl_disp_expns_grp);
		p.LPnl_disp_expns_grp.setNextBeans(p.LPnl_disp_expns);
		p.LPnl_disp_expns_grp.setRow(p.getLPnlR(), mcframe.clientMGBB.MGBBP0200.LPnlR.disp_expns_grp_META);
		p.LPnlPanel.add(p.LPnl_disp_expns);
		p.LPnl_disp_expns.setRow(p.getLPnlR(), mcframe.clientMGBB.MGBBP0200.LPnlR.disp_expns_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd_inpt.setIcon("REGISTER");
		p.Btn_upd_inpt.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_inpt);
		p.BtnPanel.setLastBeans(p.Btn_upd_inpt);
		p.Btn_upd_inpt.setNextBeans(p.Btn_upd_io);
		p.Btn_upd_io.setIcon("REGISTER");
		p.Btn_upd_io.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_io);
		p.Btn_upd_io.setNextBeans(p.Btn_upd_sls);
		p.Btn_upd_sls.setIcon("REGISTER");
		p.Btn_upd_sls.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_sls);
		p.Btn_upd_sls.setNextBeans(p.Btn_upd_inpt_a);
		p.Btn_upd_inpt_a.setIcon("REGISTER");
		p.Btn_upd_inpt_a.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_inpt_a);
		p.Btn_upd_inpt_a.setNextBeans(p.Btn_upd_io_a);
		p.Btn_upd_io_a.setIcon("REGISTER");
		p.Btn_upd_io_a.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_io_a);
		p.Btn_upd_io_a.setNextBeans(p.Btn_upd_sls_a);
		p.Btn_upd_sls_a.setIcon("REGISTER");
		p.Btn_upd_sls_a.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_sls_a);
		p.Btn_del_inpt.setIcon("DELETE");
		p.Btn_del_inpt.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_inpt);
		p.EastBtnPanel.add(p.Btn_del_inpt);
		p.Btn_del_inpt.setNextBeans(p.Btn_del_io);
		p.Btn_del_io.setIcon("DELETE");
		p.Btn_del_io.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_io);
		p.Btn_del_io.setNextBeans(p.Btn_del_sls);
		p.Btn_del_sls.setIcon("DELETE");
		p.Btn_del_sls.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_sls);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBBP_ExpnsCostReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
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
		MGBBP_ExpnsCostReg_MC.mcInitScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.mcInitRegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.mcInitCnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.mcInitLPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.mcInitRslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.mcInitBtn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.mcInitEastBtn((MGBBP_ExpnsCostReg)this);

		// [SRCH_INPT]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__INPT_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__INPT_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__INPT_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__INPT_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__INPT_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__INPT_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__INPT_EastBtn((MGBBP_ExpnsCostReg)this);

		// [UPD_INPT]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitUPD__INPT_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__INPT_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__INPT_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__INPT_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__INPT_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__INPT_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__INPT_EastBtn((MGBBP_ExpnsCostReg)this);

		// [REF_INPT]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitREF__INPT_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__INPT_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__INPT_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__INPT_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__INPT_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__INPT_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__INPT_EastBtn((MGBBP_ExpnsCostReg)this);

		// [DEL_INPT]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitDEL__INPT_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__INPT_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__INPT_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__INPT_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__INPT_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__INPT_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__INPT_EastBtn((MGBBP_ExpnsCostReg)this);

		// [SRCH_AUTO_INPT]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__INPT_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__INPT_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__INPT_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__INPT_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__INPT_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__INPT_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__INPT_EastBtn((MGBBP_ExpnsCostReg)this);

		// [AUTO_INPT]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__INPT_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__INPT_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__INPT_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__INPT_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__INPT_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__INPT_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__INPT_EastBtn((MGBBP_ExpnsCostReg)this);

		// [FIX_INPT]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitFIX__INPT_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__INPT_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__INPT_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__INPT_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__INPT_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__INPT_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__INPT_EastBtn((MGBBP_ExpnsCostReg)this);

		// [FIX_AUTO_INPT]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__INPT_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__INPT_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__INPT_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__INPT_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__INPT_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__INPT_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__INPT_EastBtn((MGBBP_ExpnsCostReg)this);

		// [SRCH_IO]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__IO_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__IO_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__IO_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__IO_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__IO_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__IO_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__IO_EastBtn((MGBBP_ExpnsCostReg)this);

		// [UPD_IO]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitUPD__IO_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__IO_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__IO_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__IO_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__IO_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__IO_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__IO_EastBtn((MGBBP_ExpnsCostReg)this);

		// [REF_IO]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitREF__IO_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__IO_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__IO_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__IO_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__IO_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__IO_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__IO_EastBtn((MGBBP_ExpnsCostReg)this);

		// [DEL_IO]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitDEL__IO_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__IO_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__IO_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__IO_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__IO_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__IO_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__IO_EastBtn((MGBBP_ExpnsCostReg)this);

		// [SRCH_AUTO_IO]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__IO_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__IO_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__IO_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__IO_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__IO_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__IO_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__IO_EastBtn((MGBBP_ExpnsCostReg)this);

		// [AUTO_IO]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__IO_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__IO_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__IO_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__IO_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__IO_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__IO_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__IO_EastBtn((MGBBP_ExpnsCostReg)this);

		// [FIX_IO]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitFIX__IO_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__IO_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__IO_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__IO_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__IO_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__IO_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__IO_EastBtn((MGBBP_ExpnsCostReg)this);

		// [FIX_AUTO_IO]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__IO_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__IO_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__IO_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__IO_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__IO_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__IO_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__IO_EastBtn((MGBBP_ExpnsCostReg)this);

		// [SRCH_SLS]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__SLS_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__SLS_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__SLS_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__SLS_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__SLS_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__SLS_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__SLS_EastBtn((MGBBP_ExpnsCostReg)this);

		// [UPD_SLS]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitUPD__SLS_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__SLS_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__SLS_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__SLS_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__SLS_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__SLS_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitUPD__SLS_EastBtn((MGBBP_ExpnsCostReg)this);

		// [REF_SLS]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitREF__SLS_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__SLS_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__SLS_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__SLS_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__SLS_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__SLS_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitREF__SLS_EastBtn((MGBBP_ExpnsCostReg)this);

		// [DEL_SLS]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitDEL__SLS_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__SLS_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__SLS_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__SLS_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__SLS_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__SLS_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitDEL__SLS_EastBtn((MGBBP_ExpnsCostReg)this);

		// [SRCH_AUTO_SLS]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__SLS_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__SLS_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__SLS_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__SLS_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__SLS_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__SLS_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitSRCH__AUTO__SLS_EastBtn((MGBBP_ExpnsCostReg)this);

		// [AUTO_SLS]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__SLS_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__SLS_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__SLS_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__SLS_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__SLS_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__SLS_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitAUTO__SLS_EastBtn((MGBBP_ExpnsCostReg)this);

		// [FIX_SLS]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitFIX__SLS_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__SLS_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__SLS_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__SLS_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__SLS_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__SLS_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__SLS_EastBtn((MGBBP_ExpnsCostReg)this);

		// [FIX_AUTO_SLS]ステータスのモードの設定
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__SLS_ScreenOpe((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__SLS_RegTarget((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__SLS_Cnd((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__SLS_LPnl((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__SLS_Rslt((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__SLS_Btn((MGBBP_ExpnsCostReg)this);
		MGBBP_ExpnsCostReg_MC.statusInitFIX__AUTO__SLS_EastBtn((MGBBP_ExpnsCostReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBBP_ExpnsCostReg p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MGBBP_ExpnsCostReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBBP_ExpnsCostReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_AUTO.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_tar_Group.addAllListener(p);
		p.Cnd_tar_INPT.addAllListener(p);
		p.Cnd_tar_IO.addAllListener(p);
		p.Cnd_tar_SLS.addAllListener(p);
		p.Cnd_act_id.setListListener(p);
		p.Cnd_act_id.addAllListener(p);
		p.Cnd_act_id_sub.setListListener(p);
		p.Cnd_act_id_sub.addAllListener(p);
		p.Cnd_srch_inpt.addAllListener(p);
		p.Cnd_srch_inpt.setAPMethodName("doCnd_srch_inpt");
		p.Cnd_srch_io.addAllListener(p);
		p.Cnd_srch_io.setAPMethodName("doCnd_srch_io");
		p.Cnd_srch_sls.addAllListener(p);
		p.Cnd_srch_sls.setAPMethodName("doCnd_srch_sls");
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBBP_ExpnsCostReg p) {
		p.LPnl_disp_expns_grp.addAllListener(p);
		p.LPnl_disp_expns.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBBP_ExpnsCostReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_act_id.addAllListener(p);
		p.columnRslt_act_id.setListListener(p);
		p.columnRslt_act_id_sub.addAllListener(p);
		p.columnRslt_act_id_sub.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_amt_set_typ.addAllListener(p);
		p.columnRslt_amt_set_typ.setListListener(p);
		p.columnRslt_amt_set_typ_nm.addAllListener(p);
		p.columnRslt_amt_set_typ_nm.setListListener(p);
		p.columnRslt_calc_grp_cd.addAllListener(p);
		p.columnRslt_calc_grp_cd.setListListener(p);
		p.columnRslt_calc_grp_nm.addAllListener(p);
		p.columnRslt_calc_grp_nm.setListListener(p);
		p.columnRslt_calc_ctg_cd.addAllListener(p);
		p.columnRslt_calc_ctg_cd.setListListener(p);
		p.columnRslt_calc_ctg_nm.addAllListener(p);
		p.columnRslt_calc_ctg_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_rec_eval_typ.addAllListener(p);
		p.columnRslt_rec_eval_typ.setListListener(p);
		p.columnRslt_rec_eval_typ_nm.addAllListener(p);
		p.columnRslt_rec_eval_typ_nm.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_upri.addAllListener(p);
		p.columnRslt_upri.setListListener(p);
		p.columnRslt_ttl.addAllListener(p);
		p.columnRslt_ttl.setListListener(p);
		p.columnRslt_col_000.addAllListener(p);
		p.columnRslt_col_000.setListListener(p);
		p.columnRslt_col_001.addAllListener(p);
		p.columnRslt_col_001.setListListener(p);
		p.columnRslt_col_002.addAllListener(p);
		p.columnRslt_col_002.setListListener(p);
		p.columnRslt_col_003.addAllListener(p);
		p.columnRslt_col_003.setListListener(p);
		p.columnRslt_col_004.addAllListener(p);
		p.columnRslt_col_004.setListListener(p);
		p.columnRslt_col_005.addAllListener(p);
		p.columnRslt_col_005.setListListener(p);
		p.columnRslt_col_006.addAllListener(p);
		p.columnRslt_col_006.setListListener(p);
		p.columnRslt_col_007.addAllListener(p);
		p.columnRslt_col_007.setListListener(p);
		p.columnRslt_col_008.addAllListener(p);
		p.columnRslt_col_008.setListListener(p);
		p.columnRslt_col_009.addAllListener(p);
		p.columnRslt_col_009.setListListener(p);
		p.columnRslt_col_010.addAllListener(p);
		p.columnRslt_col_010.setListListener(p);
		p.columnRslt_col_011.addAllListener(p);
		p.columnRslt_col_011.setListListener(p);
		p.columnRslt_col_012.addAllListener(p);
		p.columnRslt_col_012.setListListener(p);
		p.columnRslt_col_013.addAllListener(p);
		p.columnRslt_col_013.setListListener(p);
		p.columnRslt_col_014.addAllListener(p);
		p.columnRslt_col_014.setListListener(p);
		p.columnRslt_col_015.addAllListener(p);
		p.columnRslt_col_015.setListListener(p);
		p.columnRslt_col_016.addAllListener(p);
		p.columnRslt_col_016.setListListener(p);
		p.columnRslt_col_017.addAllListener(p);
		p.columnRslt_col_017.setListListener(p);
		p.columnRslt_col_018.addAllListener(p);
		p.columnRslt_col_018.setListListener(p);
		p.columnRslt_col_019.addAllListener(p);
		p.columnRslt_col_019.setListListener(p);
		p.columnRslt_col_020.addAllListener(p);
		p.columnRslt_col_020.setListListener(p);
		p.columnRslt_col_021.addAllListener(p);
		p.columnRslt_col_021.setListListener(p);
		p.columnRslt_col_022.addAllListener(p);
		p.columnRslt_col_022.setListListener(p);
		p.columnRslt_col_023.addAllListener(p);
		p.columnRslt_col_023.setListListener(p);
		p.columnRslt_col_024.addAllListener(p);
		p.columnRslt_col_024.setListListener(p);
		p.columnRslt_col_025.addAllListener(p);
		p.columnRslt_col_025.setListListener(p);
		p.columnRslt_col_026.addAllListener(p);
		p.columnRslt_col_026.setListListener(p);
		p.columnRslt_col_027.addAllListener(p);
		p.columnRslt_col_027.setListListener(p);
		p.columnRslt_col_028.addAllListener(p);
		p.columnRslt_col_028.setListListener(p);
		p.columnRslt_col_029.addAllListener(p);
		p.columnRslt_col_029.setListListener(p);
		p.columnRslt_col_030.addAllListener(p);
		p.columnRslt_col_030.setListListener(p);
		p.columnRslt_col_031.addAllListener(p);
		p.columnRslt_col_031.setListListener(p);
		p.columnRslt_col_032.addAllListener(p);
		p.columnRslt_col_032.setListListener(p);
		p.columnRslt_col_033.addAllListener(p);
		p.columnRslt_col_033.setListListener(p);
		p.columnRslt_col_034.addAllListener(p);
		p.columnRslt_col_034.setListListener(p);
		p.columnRslt_col_035.addAllListener(p);
		p.columnRslt_col_035.setListListener(p);
		p.columnRslt_col_036.addAllListener(p);
		p.columnRslt_col_036.setListListener(p);
		p.columnRslt_col_037.addAllListener(p);
		p.columnRslt_col_037.setListListener(p);
		p.columnRslt_col_038.addAllListener(p);
		p.columnRslt_col_038.setListListener(p);
		p.columnRslt_col_039.addAllListener(p);
		p.columnRslt_col_039.setListListener(p);
		p.columnRslt_col_040.addAllListener(p);
		p.columnRslt_col_040.setListListener(p);
		p.columnRslt_col_041.addAllListener(p);
		p.columnRslt_col_041.setListListener(p);
		p.columnRslt_col_042.addAllListener(p);
		p.columnRslt_col_042.setListListener(p);
		p.columnRslt_col_043.addAllListener(p);
		p.columnRslt_col_043.setListListener(p);
		p.columnRslt_col_044.addAllListener(p);
		p.columnRslt_col_044.setListListener(p);
		p.columnRslt_col_045.addAllListener(p);
		p.columnRslt_col_045.setListListener(p);
		p.columnRslt_col_046.addAllListener(p);
		p.columnRslt_col_046.setListListener(p);
		p.columnRslt_col_047.addAllListener(p);
		p.columnRslt_col_047.setListListener(p);
		p.columnRslt_col_048.addAllListener(p);
		p.columnRslt_col_048.setListListener(p);
		p.columnRslt_col_049.addAllListener(p);
		p.columnRslt_col_049.setListListener(p);
		p.columnRslt_col_050.addAllListener(p);
		p.columnRslt_col_050.setListListener(p);
		p.columnRslt_col_051.addAllListener(p);
		p.columnRslt_col_051.setListListener(p);
		p.columnRslt_col_052.addAllListener(p);
		p.columnRslt_col_052.setListListener(p);
		p.columnRslt_col_053.addAllListener(p);
		p.columnRslt_col_053.setListListener(p);
		p.columnRslt_col_054.addAllListener(p);
		p.columnRslt_col_054.setListListener(p);
		p.columnRslt_col_055.addAllListener(p);
		p.columnRslt_col_055.setListListener(p);
		p.columnRslt_col_056.addAllListener(p);
		p.columnRslt_col_056.setListListener(p);
		p.columnRslt_col_057.addAllListener(p);
		p.columnRslt_col_057.setListListener(p);
		p.columnRslt_col_058.addAllListener(p);
		p.columnRslt_col_058.setListListener(p);
		p.columnRslt_col_059.addAllListener(p);
		p.columnRslt_col_059.setListListener(p);
		p.columnRslt_col_060.addAllListener(p);
		p.columnRslt_col_060.setListListener(p);
		p.columnRslt_col_061.addAllListener(p);
		p.columnRslt_col_061.setListListener(p);
		p.columnRslt_col_062.addAllListener(p);
		p.columnRslt_col_062.setListListener(p);
		p.columnRslt_col_063.addAllListener(p);
		p.columnRslt_col_063.setListListener(p);
		p.columnRslt_col_064.addAllListener(p);
		p.columnRslt_col_064.setListListener(p);
		p.columnRslt_col_065.addAllListener(p);
		p.columnRslt_col_065.setListListener(p);
		p.columnRslt_col_066.addAllListener(p);
		p.columnRslt_col_066.setListListener(p);
		p.columnRslt_col_067.addAllListener(p);
		p.columnRslt_col_067.setListListener(p);
		p.columnRslt_col_068.addAllListener(p);
		p.columnRslt_col_068.setListListener(p);
		p.columnRslt_col_069.addAllListener(p);
		p.columnRslt_col_069.setListListener(p);
		p.columnRslt_col_070.addAllListener(p);
		p.columnRslt_col_070.setListListener(p);
		p.columnRslt_col_071.addAllListener(p);
		p.columnRslt_col_071.setListListener(p);
		p.columnRslt_col_072.addAllListener(p);
		p.columnRslt_col_072.setListListener(p);
		p.columnRslt_col_073.addAllListener(p);
		p.columnRslt_col_073.setListListener(p);
		p.columnRslt_col_074.addAllListener(p);
		p.columnRslt_col_074.setListListener(p);
		p.columnRslt_col_075.addAllListener(p);
		p.columnRslt_col_075.setListListener(p);
		p.columnRslt_col_076.addAllListener(p);
		p.columnRslt_col_076.setListListener(p);
		p.columnRslt_col_077.addAllListener(p);
		p.columnRslt_col_077.setListListener(p);
		p.columnRslt_col_078.addAllListener(p);
		p.columnRslt_col_078.setListListener(p);
		p.columnRslt_col_079.addAllListener(p);
		p.columnRslt_col_079.setListListener(p);
		p.columnRslt_col_080.addAllListener(p);
		p.columnRslt_col_080.setListListener(p);
		p.columnRslt_col_081.addAllListener(p);
		p.columnRslt_col_081.setListListener(p);
		p.columnRslt_col_082.addAllListener(p);
		p.columnRslt_col_082.setListListener(p);
		p.columnRslt_col_083.addAllListener(p);
		p.columnRslt_col_083.setListListener(p);
		p.columnRslt_col_084.addAllListener(p);
		p.columnRslt_col_084.setListListener(p);
		p.columnRslt_col_085.addAllListener(p);
		p.columnRslt_col_085.setListListener(p);
		p.columnRslt_col_086.addAllListener(p);
		p.columnRslt_col_086.setListListener(p);
		p.columnRslt_col_087.addAllListener(p);
		p.columnRslt_col_087.setListListener(p);
		p.columnRslt_col_088.addAllListener(p);
		p.columnRslt_col_088.setListListener(p);
		p.columnRslt_col_089.addAllListener(p);
		p.columnRslt_col_089.setListListener(p);
		p.columnRslt_col_090.addAllListener(p);
		p.columnRslt_col_090.setListListener(p);
		p.columnRslt_col_091.addAllListener(p);
		p.columnRslt_col_091.setListListener(p);
		p.columnRslt_col_092.addAllListener(p);
		p.columnRslt_col_092.setListListener(p);
		p.columnRslt_col_093.addAllListener(p);
		p.columnRslt_col_093.setListListener(p);
		p.columnRslt_col_094.addAllListener(p);
		p.columnRslt_col_094.setListListener(p);
		p.columnRslt_col_095.addAllListener(p);
		p.columnRslt_col_095.setListListener(p);
		p.columnRslt_col_096.addAllListener(p);
		p.columnRslt_col_096.setListListener(p);
		p.columnRslt_col_097.addAllListener(p);
		p.columnRslt_col_097.setListListener(p);
		p.columnRslt_col_098.addAllListener(p);
		p.columnRslt_col_098.setListListener(p);
		p.columnRslt_col_099.addAllListener(p);
		p.columnRslt_col_099.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBBP_ExpnsCostReg p) {
		p.Btn_upd_inpt.addAllListener(p);
		p.Btn_upd_inpt.setAPMethodName("doBtn_upd_inpt");
		p.Btn_upd_io.addAllListener(p);
		p.Btn_upd_io.setAPMethodName("doBtn_upd_io");
		p.Btn_upd_sls.addAllListener(p);
		p.Btn_upd_sls.setAPMethodName("doBtn_upd_sls");
		p.Btn_upd_inpt_a.addAllListener(p);
		p.Btn_upd_inpt_a.setAPMethodName("doBtn_upd_inpt_a");
		p.Btn_upd_io_a.addAllListener(p);
		p.Btn_upd_io_a.setAPMethodName("doBtn_upd_io_a");
		p.Btn_upd_sls_a.addAllListener(p);
		p.Btn_upd_sls_a.setAPMethodName("doBtn_upd_sls_a");
		p.Btn_del_inpt.addAllListener(p);
		p.Btn_del_inpt.setAPMethodName("doBtn_del_inpt");
		p.Btn_del_io.addAllListener(p);
		p.Btn_del_io.setAPMethodName("doBtn_del_io");
		p.Btn_del_sls.addAllListener(p);
		p.Btn_del_sls.setAPMethodName("doBtn_del_sls");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBBP_ExpnsCostReg p) {
	}

	/**
	 * [SRCH_INPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INPT_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_INPT]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INPT_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INPT_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INPT, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, SRCH_INPT, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, SRCH_INPT, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, SRCH_INPT, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, SRCH_INPT, MCMode.ENABLE);
		p.Cnd_srch_io.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, SRCH_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INPT_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH_INPT, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH_INPT, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INPT_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH_INPT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_INPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INPT_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, SRCH_INPT, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, SRCH_INPT, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, SRCH_INPT, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, SRCH_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INPT_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_INPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INPT_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_INPT]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INPT_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INPT_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, UPD_INPT, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, UPD_INPT, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, UPD_INPT, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, UPD_INPT, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.Cnd_srch_io.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, UPD_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_INPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INPT_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, UPD_INPT, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, UPD_INPT, MCMode.REQUIRED);

	}

	/**
	 * [UPD_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INPT_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(UPD_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, UPD_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_001.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_002.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_003.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_004.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_005.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_006.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_007.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_008.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_009.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_010.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_011.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_012.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_013.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_014.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_015.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_016.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_017.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_018.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_019.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_020.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_021.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_022.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_023.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_024.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_025.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_026.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_027.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_028.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_029.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_030.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_031.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_032.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_033.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_034.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_035.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_036.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_037.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_038.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_039.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_040.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_041.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_042.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_043.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_044.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_045.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_046.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_047.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_048.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_049.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_050.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_051.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_052.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_053.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_054.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_055.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_056.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_057.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_058.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_059.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_060.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_061.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_062.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_063.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_064.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_065.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_066.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_067.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_068.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_069.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_070.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_071.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_072.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_073.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_074.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_075.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_076.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_077.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_078.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_079.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_080.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_081.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_082.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_083.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_084.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_085.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_086.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_087.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_088.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_089.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_090.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_091.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_092.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_093.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_094.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_095.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_096.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_097.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_098.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.columnRslt_col_099.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_INPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [UPD_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INPT_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, UPD_INPT, MCMode.ENABLE);
		p.Btn_upd_io.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, UPD_INPT, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, UPD_INPT, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, UPD_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_INPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__INPT_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_INPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__INPT_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_INPT]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF__INPT_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__INPT_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, REF_INPT, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, REF_INPT, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, REF_INPT, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, REF_INPT, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, REF_INPT, MCMode.ENABLE);
		p.Cnd_srch_io.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, REF_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [REF_INPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__INPT_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, REF_INPT, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, REF_INPT, MCMode.REQUIRED);

	}

	/**
	 * [REF_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__INPT_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(REF_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, REF_INPT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_INPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [REF_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__INPT_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, REF_INPT, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, REF_INPT, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, REF_INPT, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, REF_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [REF_INPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__INPT_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_INPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INPT_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_INPT]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INPT_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INPT_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, DEL_INPT, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, DEL_INPT, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, DEL_INPT, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, DEL_INPT, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, DEL_INPT, MCMode.ENABLE);
		p.Cnd_srch_io.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, DEL_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_INPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INPT_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, DEL_INPT, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, DEL_INPT, MCMode.REQUIRED);

	}

	/**
	 * [DEL_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INPT_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(DEL_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, DEL_INPT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_INPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INPT_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, DEL_INPT, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, DEL_INPT, MCMode.ENABLE);
		p.Btn_del_io.putMode(p, DEL_INPT, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, DEL_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_INPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INPT_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_INPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__INPT_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_INPT]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__INPT_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__INPT_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, SRCH_AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, SRCH_AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, SRCH_AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, SRCH_AUTO_INPT, MCMode.ENABLE);
		p.Cnd_srch_io.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_AUTO_INPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__INPT_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH_AUTO_INPT, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH_AUTO_INPT, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_AUTO_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__INPT_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_amt_set_typ_nm.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_AUTO_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_AUTO_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH_AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_AUTO_INPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_AUTO_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__INPT_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, SRCH_AUTO_INPT, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, SRCH_AUTO_INPT, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, SRCH_AUTO_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_AUTO_INPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__INPT_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_INPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__INPT_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_INPT]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__INPT_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__INPT_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, AUTO_INPT, MCMode.ENABLE);
		p.Cnd_srch_io.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, AUTO_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [AUTO_INPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__INPT_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, AUTO_INPT, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, AUTO_INPT, MCMode.REQUIRED);

	}

	/**
	 * [AUTO_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__INPT_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, AUTO_INPT, MCMode.REQUIRED);
		p.columnRslt_amt_set_typ_nm.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, AUTO_INPT, MCMode.REQUIRED);
		p.columnRslt_calc_grp_nm.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(AUTO_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(AUTO_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(AUTO_INPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [AUTO_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__INPT_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_io.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, AUTO_INPT, MCMode.ENABLE);
		p.Btn_upd_io_a.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, AUTO_INPT, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, AUTO_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [AUTO_INPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__INPT_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_INPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__INPT_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_INPT]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__INPT_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__INPT_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, FIX_INPT, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, FIX_INPT, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, FIX_INPT, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, FIX_INPT, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, FIX_INPT, MCMode.ENABLE);
		p.Cnd_srch_io.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, FIX_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_INPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__INPT_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, FIX_INPT, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, FIX_INPT, MCMode.REQUIRED);

	}

	/**
	 * [FIX_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__INPT_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, FIX_INPT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_INPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [FIX_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__INPT_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, FIX_INPT, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, FIX_INPT, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, FIX_INPT, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, FIX_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_INPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__INPT_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_INPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__INPT_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_INPT]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__INPT_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_INPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__INPT_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, FIX_AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, FIX_AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, FIX_AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, FIX_AUTO_INPT, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, FIX_AUTO_INPT, MCMode.ENABLE);
		p.Cnd_srch_io.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_AUTO_INPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__INPT_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, FIX_AUTO_INPT, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, FIX_AUTO_INPT, MCMode.REQUIRED);

	}

	/**
	 * [FIX_AUTO_INPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__INPT_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_amt_set_typ_nm.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_AUTO_INPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_AUTO_INPT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, FIX_AUTO_INPT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_AUTO_INPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [FIX_AUTO_INPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__INPT_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, FIX_AUTO_INPT, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, FIX_AUTO_INPT, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, FIX_AUTO_INPT, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_AUTO_INPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__INPT_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_IO, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, SRCH_IO, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, SRCH_IO, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, SRCH_IO, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, SRCH_IO, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_IO]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH_IO, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH_IO, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_IO]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, SRCH_IO, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, SRCH_IO, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, SRCH_IO, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__IO_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_IO]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD__IO_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__IO_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, UPD_IO, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, UPD_IO, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, UPD_IO, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, UPD_IO, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, UPD_IO, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, UPD_IO, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_IO]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__IO_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, UPD_IO, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, UPD_IO, MCMode.REQUIRED);

	}

	/**
	 * [UPD_IO]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__IO_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(UPD_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, UPD_IO, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_001.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_002.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_003.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_004.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_005.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_006.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_007.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_008.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_009.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_010.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_011.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_012.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_013.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_014.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_015.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_016.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_017.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_018.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_019.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_020.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_021.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_022.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_023.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_024.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_025.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_026.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_027.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_028.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_029.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_030.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_031.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_032.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_033.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_034.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_035.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_036.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_037.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_038.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_039.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_040.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_041.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_042.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_043.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_044.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_045.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_046.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_047.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_048.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_049.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_050.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_051.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_052.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_053.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_054.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_055.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_056.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_057.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_058.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_059.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_060.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_061.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_062.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_063.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_064.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_065.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_066.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_067.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_068.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_069.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_070.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_071.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_072.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_073.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_074.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_075.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_076.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_077.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_078.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_079.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_080.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_081.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_082.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_083.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_084.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_085.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_086.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_087.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_088.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_089.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_090.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_091.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_092.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_093.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_094.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_095.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_096.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_097.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_098.putMode(p, UPD_IO, MCMode.ENABLE);
		p.columnRslt_col_099.putMode(p, UPD_IO, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [UPD_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__IO_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.Btn_upd_io.putMode(p, UPD_IO, MCMode.ENABLE);
		p.Btn_upd_sls.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, UPD_IO, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, UPD_IO, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, UPD_IO, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__IO_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_IO]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, REF_IO, MCMode.INVISIBLE);

	}

	/**
	 * [REF_IO]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, REF_IO, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, REF_IO, MCMode.REQUIRED);

	}

	/**
	 * [REF_IO]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [REF_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, REF_IO, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, REF_IO, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, REF_IO, MCMode.INVISIBLE);

	}

	/**
	 * [REF_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__IO_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_IO]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL__IO_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__IO_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, DEL_IO, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, DEL_IO, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, DEL_IO, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, DEL_IO, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, DEL_IO, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, DEL_IO, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_IO]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__IO_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, DEL_IO, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, DEL_IO, MCMode.REQUIRED);

	}

	/**
	 * [DEL_IO]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__IO_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(DEL_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, DEL_IO, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__IO_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, DEL_IO, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, DEL_IO, MCMode.INVISIBLE);
		p.Btn_del_io.putMode(p, DEL_IO, MCMode.ENABLE);
		p.Btn_del_sls.putMode(p, DEL_IO, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__IO_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__IO_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_IO]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__IO_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__IO_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_AUTO_IO, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, SRCH_AUTO_IO, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, SRCH_AUTO_IO, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, SRCH_AUTO_IO, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, SRCH_AUTO_IO, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_AUTO_IO]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__IO_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH_AUTO_IO, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH_AUTO_IO, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_AUTO_IO]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__IO_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_amt_set_typ_nm.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_AUTO_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_AUTO_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH_AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_AUTO_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_AUTO_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__IO_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, SRCH_AUTO_IO, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, SRCH_AUTO_IO, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, SRCH_AUTO_IO, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_AUTO_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__IO_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__IO_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_IO]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__IO_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__IO_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, AUTO_IO, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, AUTO_IO, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, AUTO_IO, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, AUTO_IO, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, AUTO_IO, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, AUTO_IO, MCMode.INVISIBLE);

	}

	/**
	 * [AUTO_IO]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__IO_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, AUTO_IO, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, AUTO_IO, MCMode.REQUIRED);

	}

	/**
	 * [AUTO_IO]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__IO_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, AUTO_IO, MCMode.REQUIRED);
		p.columnRslt_amt_set_typ_nm.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, AUTO_IO, MCMode.REQUIRED);
		p.columnRslt_calc_grp_nm.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(AUTO_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(AUTO_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(AUTO_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [AUTO_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__IO_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_io.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, AUTO_IO, MCMode.ENABLE);
		p.Btn_upd_sls_a.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, AUTO_IO, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, AUTO_IO, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, AUTO_IO, MCMode.INVISIBLE);

	}

	/**
	 * [AUTO_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__IO_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IO_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_IO]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IO_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IO_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, FIX_IO, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, FIX_IO, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, FIX_IO, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, FIX_IO, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, FIX_IO, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, FIX_IO, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_IO]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IO_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, FIX_IO, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, FIX_IO, MCMode.REQUIRED);

	}

	/**
	 * [FIX_IO]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IO_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, FIX_IO, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [FIX_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IO_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, FIX_IO, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, FIX_IO, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, FIX_IO, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, FIX_IO, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__IO_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__IO_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_IO]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__IO_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__IO_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, FIX_AUTO_IO, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, FIX_AUTO_IO, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, FIX_AUTO_IO, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, FIX_AUTO_IO, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, FIX_AUTO_IO, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_AUTO_IO]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__IO_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, FIX_AUTO_IO, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, FIX_AUTO_IO, MCMode.REQUIRED);

	}

	/**
	 * [FIX_AUTO_IO]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__IO_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_amt_set_typ_nm.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_AUTO_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_AUTO_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, FIX_AUTO_IO, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_AUTO_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [FIX_AUTO_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__IO_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, FIX_AUTO_IO, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, FIX_AUTO_IO, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, FIX_AUTO_IO, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_AUTO_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__IO_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_SLS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SLS_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_SLS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SLS_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_SLS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SLS_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_SLS, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, SRCH_SLS, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, SRCH_SLS, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, SRCH_SLS, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, SRCH_SLS, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SLS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SLS_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH_SLS, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH_SLS, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_SLS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SLS_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SLS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_SLS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH_SLS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_SLS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_SLS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SLS_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, SRCH_SLS, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, SRCH_SLS, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, SRCH_SLS, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, SRCH_SLS, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SLS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SLS_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_SLS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SLS_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_SLS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SLS_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [UPD_SLS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SLS_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, UPD_SLS, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, UPD_SLS, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, UPD_SLS, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, UPD_SLS, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, UPD_SLS, MCMode.ENABLE);

	}

	/**
	 * [UPD_SLS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SLS_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, UPD_SLS, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, UPD_SLS, MCMode.REQUIRED);

	}

	/**
	 * [UPD_SLS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SLS_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_SLS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(UPD_SLS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, UPD_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_001.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_002.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_003.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_004.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_005.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_006.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_007.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_008.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_009.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_010.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_011.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_012.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_013.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_014.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_015.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_016.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_017.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_018.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_019.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_020.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_021.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_022.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_023.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_024.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_025.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_026.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_027.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_028.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_029.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_030.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_031.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_032.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_033.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_034.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_035.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_036.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_037.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_038.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_039.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_040.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_041.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_042.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_043.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_044.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_045.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_046.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_047.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_048.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_049.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_050.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_051.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_052.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_053.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_054.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_055.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_056.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_057.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_058.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_059.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_060.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_061.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_062.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_063.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_064.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_065.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_066.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_067.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_068.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_069.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_070.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_071.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_072.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_073.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_074.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_075.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_076.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_077.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_078.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_079.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_080.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_081.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_082.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_083.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_084.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_085.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_086.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_087.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_088.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_089.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_090.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_091.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_092.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_093.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_094.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_095.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_096.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_097.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_098.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.columnRslt_col_099.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_SLS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [UPD_SLS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SLS_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, UPD_SLS, MCMode.ENABLE);
		p.Btn_upd_inpt_a.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, UPD_SLS, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, UPD_SLS, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, UPD_SLS, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SLS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SLS_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_SLS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SLS_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_SLS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF__SLS_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [REF_SLS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SLS_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, REF_SLS, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, REF_SLS, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, REF_SLS, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, REF_SLS, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, REF_SLS, MCMode.ENABLE);

	}

	/**
	 * [REF_SLS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SLS_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, REF_SLS, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, REF_SLS, MCMode.REQUIRED);

	}

	/**
	 * [REF_SLS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SLS_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_SLS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(REF_SLS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, REF_SLS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_SLS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [REF_SLS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SLS_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, REF_SLS, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, REF_SLS, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, REF_SLS, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, REF_SLS, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SLS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SLS_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_SLS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SLS_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_SLS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SLS_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [DEL_SLS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SLS_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, DEL_SLS, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, DEL_SLS, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, DEL_SLS, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, DEL_SLS, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, DEL_SLS, MCMode.ENABLE);

	}

	/**
	 * [DEL_SLS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SLS_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, DEL_SLS, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, DEL_SLS, MCMode.REQUIRED);

	}

	/**
	 * [DEL_SLS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SLS_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_SLS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(DEL_SLS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, DEL_SLS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_SLS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL_SLS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SLS_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, DEL_SLS, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Btn_del_io.putMode(p, DEL_SLS, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, DEL_SLS, MCMode.ENABLE);

	}

	/**
	 * [DEL_SLS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SLS_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_SLS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__SLS_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_SLS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__SLS_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [SRCH_AUTO_SLS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__SLS_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, SRCH_AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, SRCH_AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, SRCH_AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, SRCH_AUTO_SLS, MCMode.ENABLE);

	}

	/**
	 * [SRCH_AUTO_SLS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__SLS_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, SRCH_AUTO_SLS, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, SRCH_AUTO_SLS, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_AUTO_SLS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__SLS_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_amt_set_typ_nm.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_AUTO_SLS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_AUTO_SLS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, SRCH_AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_AUTO_SLS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [SRCH_AUTO_SLS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__SLS_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, SRCH_AUTO_SLS, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, SRCH_AUTO_SLS, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, SRCH_AUTO_SLS, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_AUTO_SLS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__AUTO__SLS_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_SLS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__SLS_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_SLS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__SLS_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [AUTO_SLS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__SLS_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, AUTO_SLS, MCMode.ENABLE);

	}

	/**
	 * [AUTO_SLS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__SLS_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, AUTO_SLS, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, AUTO_SLS, MCMode.REQUIRED);

	}

	/**
	 * [AUTO_SLS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__SLS_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, AUTO_SLS, MCMode.REQUIRED);
		p.columnRslt_amt_set_typ_nm.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, AUTO_SLS, MCMode.REQUIRED);
		p.columnRslt_calc_grp_nm.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(AUTO_SLS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(AUTO_SLS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(AUTO_SLS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [AUTO_SLS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__SLS_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, AUTO_SLS, MCMode.ENABLE);
		p.Btn_del_inpt.putMode(p, AUTO_SLS, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, AUTO_SLS, MCMode.INVISIBLE);

	}

	/**
	 * [AUTO_SLS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitAUTO__SLS_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_SLS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SLS_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_SLS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SLS_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_SLS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SLS_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, FIX_SLS, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, FIX_SLS, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, FIX_SLS, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, FIX_SLS, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, FIX_SLS, MCMode.ENABLE);

	}

	/**
	 * [FIX_SLS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SLS_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, FIX_SLS, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, FIX_SLS, MCMode.REQUIRED);

	}

	/**
	 * [FIX_SLS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SLS_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ_nm.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_SLS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_SLS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, FIX_SLS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_SLS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [FIX_SLS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SLS_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, FIX_SLS, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, FIX_SLS, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, FIX_SLS, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, FIX_SLS, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_SLS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SLS_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_SLS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__SLS_ScreenOpe(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_SLS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__SLS_RegTarget(MGBBP_ExpnsCostReg p){

	}

	/**
	 * [FIX_AUTO_SLS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__SLS_Cnd(MGBBP_ExpnsCostReg p){
		p.Cnd_ope_Group.putMode(p, FIX_AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, FIX_AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_act_id.putMode(p, FIX_AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_act_id_sub.putMode(p, FIX_AUTO_SLS, MCMode.REQUIRED);
		p.Cnd_srch_inpt.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_io.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, FIX_AUTO_SLS, MCMode.ENABLE);

	}

	/**
	 * [FIX_AUTO_SLS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__SLS_LPnl(MGBBP_ExpnsCostReg p){
		p.LPnl_disp_expns_grp.putMode(p, FIX_AUTO_SLS, MCMode.REQUIRED);
		p.LPnl_disp_expns.putMode(p, FIX_AUTO_SLS, MCMode.REQUIRED);

	}

	/**
	 * [FIX_AUTO_SLS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__SLS_Rslt(MGBBP_ExpnsCostReg p){
		p.columnRslt_act_id.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_act_id_sub.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_amt_set_typ.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_amt_set_typ_nm.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_cd.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_grp_nm.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_AUTO_SLS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_AUTO_SLS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.columnRslt_upri.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_ttl.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_000.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_001.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_002.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_003.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_004.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_005.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_006.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_007.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_008.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_009.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_010.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_011.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_012.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_013.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_014.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_015.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_016.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_017.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_018.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_019.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_020.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_021.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_022.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_023.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_024.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_025.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_026.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_027.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_028.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_029.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_030.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_031.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_032.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_033.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_034.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_035.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_036.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_037.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_038.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_039.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_040.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_041.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_042.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_043.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_044.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_045.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_046.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_047.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_048.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_049.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_050.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_051.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_052.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_053.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_054.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_055.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_056.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_057.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_058.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_059.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_060.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_061.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_062.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_063.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_064.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_065.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_066.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_067.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_068.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_069.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_070.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_071.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_072.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_073.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_074.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_075.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_076.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_077.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_078.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_079.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_080.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_081.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_082.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_083.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_084.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_085.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_086.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_087.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_088.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_089.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_090.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_091.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_092.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_093.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_094.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_095.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_096.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_097.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_098.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.columnRslt_col_099.putMode(p, FIX_AUTO_SLS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_AUTO_SLS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [FIX_AUTO_SLS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__SLS_Btn(MGBBP_ExpnsCostReg p){
		p.Btn_upd_inpt.putMode(p, FIX_AUTO_SLS, MCMode.DISABLE);
		p.Btn_upd_io.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_inpt_a.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_io_a.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_upd_sls_a.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_del_inpt.putMode(p, FIX_AUTO_SLS, MCMode.DISABLE);
		p.Btn_del_io.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);
		p.Btn_del_sls.putMode(p, FIX_AUTO_SLS, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_AUTO_SLS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__AUTO__SLS_EastBtn(MGBBP_ExpnsCostReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_INPT;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBBP_ExpnsCostReg_MC.setTableConfigRslt((MGBBP_ExpnsCostReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBBP_ExpnsCostReg p) {
		p.columnRslt_act_id.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.act_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_id);
		p.columnRslt_act_id_sub.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.act_id_sub_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_id_sub);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_amt_set_typ.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.amt_set_typ_META);
		p.columnRslt_amt_set_typ.addLinkBeans(p.columnRslt_amt_set_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_set_typ);
		p.columnRslt_amt_set_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.amt_set_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_set_typ_nm);
		p.columnRslt_calc_grp_cd.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.calc_grp_cd_META);
		p.columnRslt_calc_grp_cd.addLinkBeans(p.columnRslt_calc_grp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_cd);
		p.columnRslt_calc_grp_nm.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.calc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_grp_nm);
		p.columnRslt_calc_ctg_cd.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.calc_ctg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_cd);
		p.columnRslt_calc_ctg_nm.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.calc_ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_rec_eval_typ.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.rec_eval_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rec_eval_typ);
		p.columnRslt_rec_eval_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.rec_eval_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rec_eval_typ_nm);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_upri.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.upri_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri);
		p.columnRslt_ttl.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.ttl_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ttl);
		p.columnRslt_col_000.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_000_META);
		p.columnRslt_col_000.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_000);
		p.columnRslt_col_001.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_001_META);
		p.columnRslt_col_001.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_001);
		p.columnRslt_col_002.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_002_META);
		p.columnRslt_col_002.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_002);
		p.columnRslt_col_003.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_003_META);
		p.columnRslt_col_003.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_003);
		p.columnRslt_col_004.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_004_META);
		p.columnRslt_col_004.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_004);
		p.columnRslt_col_005.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_005_META);
		p.columnRslt_col_005.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_005);
		p.columnRslt_col_006.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_006_META);
		p.columnRslt_col_006.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_006);
		p.columnRslt_col_007.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_007_META);
		p.columnRslt_col_007.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_007);
		p.columnRslt_col_008.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_008_META);
		p.columnRslt_col_008.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_008);
		p.columnRslt_col_009.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_009_META);
		p.columnRslt_col_009.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_009);
		p.columnRslt_col_010.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_010_META);
		p.columnRslt_col_010.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_010);
		p.columnRslt_col_011.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_011_META);
		p.columnRslt_col_011.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_011);
		p.columnRslt_col_012.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_012_META);
		p.columnRslt_col_012.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_012);
		p.columnRslt_col_013.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_013_META);
		p.columnRslt_col_013.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_013);
		p.columnRslt_col_014.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_014_META);
		p.columnRslt_col_014.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_014);
		p.columnRslt_col_015.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_015_META);
		p.columnRslt_col_015.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_015);
		p.columnRslt_col_016.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_016_META);
		p.columnRslt_col_016.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_016);
		p.columnRslt_col_017.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_017_META);
		p.columnRslt_col_017.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_017);
		p.columnRslt_col_018.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_018_META);
		p.columnRslt_col_018.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_018);
		p.columnRslt_col_019.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_019_META);
		p.columnRslt_col_019.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_019);
		p.columnRslt_col_020.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_020_META);
		p.columnRslt_col_020.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_020);
		p.columnRslt_col_021.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_021_META);
		p.columnRslt_col_021.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_021);
		p.columnRslt_col_022.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_022_META);
		p.columnRslt_col_022.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_022);
		p.columnRslt_col_023.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_023_META);
		p.columnRslt_col_023.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_023);
		p.columnRslt_col_024.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_024_META);
		p.columnRslt_col_024.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_024);
		p.columnRslt_col_025.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_025_META);
		p.columnRslt_col_025.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_025);
		p.columnRslt_col_026.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_026_META);
		p.columnRslt_col_026.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_026);
		p.columnRslt_col_027.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_027_META);
		p.columnRslt_col_027.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_027);
		p.columnRslt_col_028.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_028_META);
		p.columnRslt_col_028.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_028);
		p.columnRslt_col_029.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_029_META);
		p.columnRslt_col_029.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_029);
		p.columnRslt_col_030.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_030_META);
		p.columnRslt_col_030.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_030);
		p.columnRslt_col_031.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_031_META);
		p.columnRslt_col_031.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_031);
		p.columnRslt_col_032.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_032_META);
		p.columnRslt_col_032.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_032);
		p.columnRslt_col_033.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_033_META);
		p.columnRslt_col_033.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_033);
		p.columnRslt_col_034.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_034_META);
		p.columnRslt_col_034.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_034);
		p.columnRslt_col_035.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_035_META);
		p.columnRslt_col_035.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_035);
		p.columnRslt_col_036.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_036_META);
		p.columnRslt_col_036.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_036);
		p.columnRslt_col_037.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_037_META);
		p.columnRslt_col_037.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_037);
		p.columnRslt_col_038.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_038_META);
		p.columnRslt_col_038.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_038);
		p.columnRslt_col_039.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_039_META);
		p.columnRslt_col_039.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_039);
		p.columnRslt_col_040.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_040_META);
		p.columnRslt_col_040.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_040);
		p.columnRslt_col_041.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_041_META);
		p.columnRslt_col_041.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_041);
		p.columnRslt_col_042.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_042_META);
		p.columnRslt_col_042.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_042);
		p.columnRslt_col_043.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_043_META);
		p.columnRslt_col_043.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_043);
		p.columnRslt_col_044.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_044_META);
		p.columnRslt_col_044.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_044);
		p.columnRslt_col_045.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_045_META);
		p.columnRslt_col_045.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_045);
		p.columnRslt_col_046.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_046_META);
		p.columnRslt_col_046.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_046);
		p.columnRslt_col_047.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_047_META);
		p.columnRslt_col_047.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_047);
		p.columnRslt_col_048.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_048_META);
		p.columnRslt_col_048.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_048);
		p.columnRslt_col_049.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_049_META);
		p.columnRslt_col_049.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_049);
		p.columnRslt_col_050.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_050_META);
		p.columnRslt_col_050.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_050);
		p.columnRslt_col_051.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_051_META);
		p.columnRslt_col_051.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_051);
		p.columnRslt_col_052.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_052_META);
		p.columnRslt_col_052.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_052);
		p.columnRslt_col_053.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_053_META);
		p.columnRslt_col_053.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_053);
		p.columnRslt_col_054.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_054_META);
		p.columnRslt_col_054.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_054);
		p.columnRslt_col_055.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_055_META);
		p.columnRslt_col_055.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_055);
		p.columnRslt_col_056.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_056_META);
		p.columnRslt_col_056.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_056);
		p.columnRslt_col_057.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_057_META);
		p.columnRslt_col_057.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_057);
		p.columnRslt_col_058.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_058_META);
		p.columnRslt_col_058.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_058);
		p.columnRslt_col_059.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_059_META);
		p.columnRslt_col_059.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_059);
		p.columnRslt_col_060.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_060_META);
		p.columnRslt_col_060.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_060);
		p.columnRslt_col_061.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_061_META);
		p.columnRslt_col_061.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_061);
		p.columnRslt_col_062.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_062_META);
		p.columnRslt_col_062.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_062);
		p.columnRslt_col_063.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_063_META);
		p.columnRslt_col_063.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_063);
		p.columnRslt_col_064.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_064_META);
		p.columnRslt_col_064.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_064);
		p.columnRslt_col_065.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_065_META);
		p.columnRslt_col_065.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_065);
		p.columnRslt_col_066.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_066_META);
		p.columnRslt_col_066.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_066);
		p.columnRslt_col_067.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_067_META);
		p.columnRslt_col_067.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_067);
		p.columnRslt_col_068.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_068_META);
		p.columnRslt_col_068.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_068);
		p.columnRslt_col_069.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_069_META);
		p.columnRslt_col_069.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_069);
		p.columnRslt_col_070.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_070_META);
		p.columnRslt_col_070.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_070);
		p.columnRslt_col_071.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_071_META);
		p.columnRslt_col_071.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_071);
		p.columnRslt_col_072.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_072_META);
		p.columnRslt_col_072.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_072);
		p.columnRslt_col_073.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_073_META);
		p.columnRslt_col_073.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_073);
		p.columnRslt_col_074.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_074_META);
		p.columnRslt_col_074.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_074);
		p.columnRslt_col_075.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_075_META);
		p.columnRslt_col_075.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_075);
		p.columnRslt_col_076.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_076_META);
		p.columnRslt_col_076.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_076);
		p.columnRslt_col_077.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_077_META);
		p.columnRslt_col_077.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_077);
		p.columnRslt_col_078.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_078_META);
		p.columnRslt_col_078.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_078);
		p.columnRslt_col_079.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_079_META);
		p.columnRslt_col_079.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_079);
		p.columnRslt_col_080.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_080_META);
		p.columnRslt_col_080.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_080);
		p.columnRslt_col_081.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_081_META);
		p.columnRslt_col_081.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_081);
		p.columnRslt_col_082.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_082_META);
		p.columnRslt_col_082.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_082);
		p.columnRslt_col_083.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_083_META);
		p.columnRslt_col_083.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_083);
		p.columnRslt_col_084.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_084_META);
		p.columnRslt_col_084.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_084);
		p.columnRslt_col_085.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_085_META);
		p.columnRslt_col_085.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_085);
		p.columnRslt_col_086.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_086_META);
		p.columnRslt_col_086.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_086);
		p.columnRslt_col_087.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_087_META);
		p.columnRslt_col_087.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_087);
		p.columnRslt_col_088.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_088_META);
		p.columnRslt_col_088.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_088);
		p.columnRslt_col_089.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_089_META);
		p.columnRslt_col_089.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_089);
		p.columnRslt_col_090.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_090_META);
		p.columnRslt_col_090.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_090);
		p.columnRslt_col_091.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_091_META);
		p.columnRslt_col_091.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_091);
		p.columnRslt_col_092.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_092_META);
		p.columnRslt_col_092.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_092);
		p.columnRslt_col_093.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_093_META);
		p.columnRslt_col_093.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_093);
		p.columnRslt_col_094.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_094_META);
		p.columnRslt_col_094.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_094);
		p.columnRslt_col_095.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_095_META);
		p.columnRslt_col_095.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_095);
		p.columnRslt_col_096.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_096_META);
		p.columnRslt_col_096.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_096);
		p.columnRslt_col_097.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_097_META);
		p.columnRslt_col_097.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_097);
		p.columnRslt_col_098.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_098_META);
		p.columnRslt_col_098.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_098);
		p.columnRslt_col_099.setMeta(mcframe.clientMGBB.MGBBP0200.RsltR.col_099_META);
		p.columnRslt_col_099.setMinusEnable(true);
		p.RsltTable.addColumnConfig(p.columnRslt_col_099);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnRslt_amt_set_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_amt_set_typ.getListConfig().setPutter(getRslt_amt_set_typ_ListPutter());
		columnRslt_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_calc_grp_cd.getListConfig().setPutter(getRslt_calc_grp_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INPTStatus() {
		status = SRCH_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_INPTStatus() {
		status = UPD_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_INPTStatus() {
		status = REF_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_INPTStatus() {
		status = DEL_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_AUTO_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_AUTO_INPTStatus() {
		status = SRCH_AUTO_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[AUTO_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setAUTO_INPTStatus() {
		status = AUTO_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_INPTStatus() {
		status = FIX_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_AUTO_INPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_AUTO_INPTStatus() {
		status = FIX_AUTO_INPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_IOStatus() {
		status = SRCH_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_IOStatus() {
		status = UPD_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_IOStatus() {
		status = REF_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_IOStatus() {
		status = DEL_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_AUTO_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_AUTO_IOStatus() {
		status = SRCH_AUTO_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[AUTO_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setAUTO_IOStatus() {
		status = AUTO_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IOStatus() {
		status = FIX_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_AUTO_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_AUTO_IOStatus() {
		status = FIX_AUTO_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_SLS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SLSStatus() {
		status = SRCH_SLS;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_SLS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SLSStatus() {
		status = UPD_SLS;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SLS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SLSStatus() {
		status = REF_SLS;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_SLS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_SLSStatus() {
		status = DEL_SLS;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_AUTO_SLS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_AUTO_SLSStatus() {
		status = SRCH_AUTO_SLS;
		setAllStatus(status);
	}

	/**
	 * この画面を[AUTO_SLS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setAUTO_SLSStatus() {
		status = AUTO_SLS;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_SLS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_SLSStatus() {
		status = FIX_SLS;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_AUTO_SLS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_AUTO_SLSStatus() {
		status = FIX_AUTO_SLS;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_INPT.equals(status)) {
			setSRCH_INPTStatus();
		}
		else if (UPD_INPT.equals(status)) {
			setUPD_INPTStatus();
		}
		else if (REF_INPT.equals(status)) {
			setREF_INPTStatus();
		}
		else if (DEL_INPT.equals(status)) {
			setDEL_INPTStatus();
		}
		else if (SRCH_AUTO_INPT.equals(status)) {
			setSRCH_AUTO_INPTStatus();
		}
		else if (AUTO_INPT.equals(status)) {
			setAUTO_INPTStatus();
		}
		else if (FIX_INPT.equals(status)) {
			setFIX_INPTStatus();
		}
		else if (FIX_AUTO_INPT.equals(status)) {
			setFIX_AUTO_INPTStatus();
		}
		else if (SRCH_IO.equals(status)) {
			setSRCH_IOStatus();
		}
		else if (UPD_IO.equals(status)) {
			setUPD_IOStatus();
		}
		else if (REF_IO.equals(status)) {
			setREF_IOStatus();
		}
		else if (DEL_IO.equals(status)) {
			setDEL_IOStatus();
		}
		else if (SRCH_AUTO_IO.equals(status)) {
			setSRCH_AUTO_IOStatus();
		}
		else if (AUTO_IO.equals(status)) {
			setAUTO_IOStatus();
		}
		else if (FIX_IO.equals(status)) {
			setFIX_IOStatus();
		}
		else if (FIX_AUTO_IO.equals(status)) {
			setFIX_AUTO_IOStatus();
		}
		else if (SRCH_SLS.equals(status)) {
			setSRCH_SLSStatus();
		}
		else if (UPD_SLS.equals(status)) {
			setUPD_SLSStatus();
		}
		else if (REF_SLS.equals(status)) {
			setREF_SLSStatus();
		}
		else if (DEL_SLS.equals(status)) {
			setDEL_SLSStatus();
		}
		else if (SRCH_AUTO_SLS.equals(status)) {
			setSRCH_AUTO_SLSStatus();
		}
		else if (AUTO_SLS.equals(status)) {
			setAUTO_SLSStatus();
		}
		else if (FIX_SLS.equals(status)) {
			setFIX_SLSStatus();
		}
		else if (FIX_AUTO_SLS.equals(status)) {
			setFIX_AUTO_SLSStatus();
		}
	}

	/**
	 * [Rslt_amt_set_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_amt_set_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AmtSetTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnRslt_amt_set_typ) return getRslt_amt_set_typ(row, info);
		if(combo == columnRslt_calc_grp_cd) return getRslt_calc_grp_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_inpt) doCnd_srch_inpt(info);
		else if (ap == Cnd_srch_io) doCnd_srch_io(info);
		else if (ap == Cnd_srch_sls) doCnd_srch_sls(info);
		else if (ap == Btn_upd_inpt) doBtn_upd_inpt(info);
		else if (ap == Btn_upd_io) doBtn_upd_io(info);
		else if (ap == Btn_upd_sls) doBtn_upd_sls(info);
		else if (ap == Btn_upd_inpt_a) doBtn_upd_inpt_a(info);
		else if (ap == Btn_upd_io_a) doBtn_upd_io_a(info);
		else if (ap == Btn_upd_sls_a) doBtn_upd_sls_a(info);
		else if (ap == Btn_del_inpt) doBtn_del_inpt(info);
		else if (ap == Btn_del_io) doBtn_del_io(info);
		else if (ap == Btn_del_sls) doBtn_del_sls(info);
	}

	/**
	 * [Cnd]パネルの[srch_inpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_inpt(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_io]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_io(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_sls]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_sls(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_inpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_inpt(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_io]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_io(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_sls]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_sls(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_inpt_a]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_inpt_a(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_io_a]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_io_a(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_sls_a]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_sls_a(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_inpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_inpt(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_io]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_io(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_sls]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_sls(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_tar_Group) return doCnd_tar_VC(info);
		if (vc == Cnd_act_id) return doCnd_act_id_VC(info);
		if (vc == Cnd_act_id_sub) return doCnd_act_id_sub_VC(info);
		if (vc == LPnl_disp_expns_grp) return doLPnl_disp_expns_grp_VC(info);
		if (vc == LPnl_disp_expns) return doLPnl_disp_expns_VC(info);
		if (vc == columnRslt_act_id) return doRslt_act_id_VC(info);
		if (vc == columnRslt_act_id_sub) return doRslt_act_id_sub_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_amt_set_typ) return doRslt_amt_set_typ_VC(info);
		if (vc == columnRslt_amt_set_typ_nm) return doRslt_amt_set_typ_nm_VC(info);
		if (vc == columnRslt_calc_grp_cd) return doRslt_calc_grp_cd_VC(info);
		if (vc == columnRslt_calc_grp_nm) return doRslt_calc_grp_nm_VC(info);
		if (vc == columnRslt_calc_ctg_cd) return doRslt_calc_ctg_cd_VC(info);
		if (vc == columnRslt_calc_ctg_nm) return doRslt_calc_ctg_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_rec_eval_typ) return doRslt_rec_eval_typ_VC(info);
		if (vc == columnRslt_rec_eval_typ_nm) return doRslt_rec_eval_typ_nm_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_upri) return doRslt_upri_VC(info);
		if (vc == columnRslt_ttl) return doRslt_ttl_VC(info);
		if (vc == columnRslt_col_000) return doRslt_col_000_VC(info);
		if (vc == columnRslt_col_001) return doRslt_col_001_VC(info);
		if (vc == columnRslt_col_002) return doRslt_col_002_VC(info);
		if (vc == columnRslt_col_003) return doRslt_col_003_VC(info);
		if (vc == columnRslt_col_004) return doRslt_col_004_VC(info);
		if (vc == columnRslt_col_005) return doRslt_col_005_VC(info);
		if (vc == columnRslt_col_006) return doRslt_col_006_VC(info);
		if (vc == columnRslt_col_007) return doRslt_col_007_VC(info);
		if (vc == columnRslt_col_008) return doRslt_col_008_VC(info);
		if (vc == columnRslt_col_009) return doRslt_col_009_VC(info);
		if (vc == columnRslt_col_010) return doRslt_col_010_VC(info);
		if (vc == columnRslt_col_011) return doRslt_col_011_VC(info);
		if (vc == columnRslt_col_012) return doRslt_col_012_VC(info);
		if (vc == columnRslt_col_013) return doRslt_col_013_VC(info);
		if (vc == columnRslt_col_014) return doRslt_col_014_VC(info);
		if (vc == columnRslt_col_015) return doRslt_col_015_VC(info);
		if (vc == columnRslt_col_016) return doRslt_col_016_VC(info);
		if (vc == columnRslt_col_017) return doRslt_col_017_VC(info);
		if (vc == columnRslt_col_018) return doRslt_col_018_VC(info);
		if (vc == columnRslt_col_019) return doRslt_col_019_VC(info);
		if (vc == columnRslt_col_020) return doRslt_col_020_VC(info);
		if (vc == columnRslt_col_021) return doRslt_col_021_VC(info);
		if (vc == columnRslt_col_022) return doRslt_col_022_VC(info);
		if (vc == columnRslt_col_023) return doRslt_col_023_VC(info);
		if (vc == columnRslt_col_024) return doRslt_col_024_VC(info);
		if (vc == columnRslt_col_025) return doRslt_col_025_VC(info);
		if (vc == columnRslt_col_026) return doRslt_col_026_VC(info);
		if (vc == columnRslt_col_027) return doRslt_col_027_VC(info);
		if (vc == columnRslt_col_028) return doRslt_col_028_VC(info);
		if (vc == columnRslt_col_029) return doRslt_col_029_VC(info);
		if (vc == columnRslt_col_030) return doRslt_col_030_VC(info);
		if (vc == columnRslt_col_031) return doRslt_col_031_VC(info);
		if (vc == columnRslt_col_032) return doRslt_col_032_VC(info);
		if (vc == columnRslt_col_033) return doRslt_col_033_VC(info);
		if (vc == columnRslt_col_034) return doRslt_col_034_VC(info);
		if (vc == columnRslt_col_035) return doRslt_col_035_VC(info);
		if (vc == columnRslt_col_036) return doRslt_col_036_VC(info);
		if (vc == columnRslt_col_037) return doRslt_col_037_VC(info);
		if (vc == columnRslt_col_038) return doRslt_col_038_VC(info);
		if (vc == columnRslt_col_039) return doRslt_col_039_VC(info);
		if (vc == columnRslt_col_040) return doRslt_col_040_VC(info);
		if (vc == columnRslt_col_041) return doRslt_col_041_VC(info);
		if (vc == columnRslt_col_042) return doRslt_col_042_VC(info);
		if (vc == columnRslt_col_043) return doRslt_col_043_VC(info);
		if (vc == columnRslt_col_044) return doRslt_col_044_VC(info);
		if (vc == columnRslt_col_045) return doRslt_col_045_VC(info);
		if (vc == columnRslt_col_046) return doRslt_col_046_VC(info);
		if (vc == columnRslt_col_047) return doRslt_col_047_VC(info);
		if (vc == columnRslt_col_048) return doRslt_col_048_VC(info);
		if (vc == columnRslt_col_049) return doRslt_col_049_VC(info);
		if (vc == columnRslt_col_050) return doRslt_col_050_VC(info);
		if (vc == columnRslt_col_051) return doRslt_col_051_VC(info);
		if (vc == columnRslt_col_052) return doRslt_col_052_VC(info);
		if (vc == columnRslt_col_053) return doRslt_col_053_VC(info);
		if (vc == columnRslt_col_054) return doRslt_col_054_VC(info);
		if (vc == columnRslt_col_055) return doRslt_col_055_VC(info);
		if (vc == columnRslt_col_056) return doRslt_col_056_VC(info);
		if (vc == columnRslt_col_057) return doRslt_col_057_VC(info);
		if (vc == columnRslt_col_058) return doRslt_col_058_VC(info);
		if (vc == columnRslt_col_059) return doRslt_col_059_VC(info);
		if (vc == columnRslt_col_060) return doRslt_col_060_VC(info);
		if (vc == columnRslt_col_061) return doRslt_col_061_VC(info);
		if (vc == columnRslt_col_062) return doRslt_col_062_VC(info);
		if (vc == columnRslt_col_063) return doRslt_col_063_VC(info);
		if (vc == columnRslt_col_064) return doRslt_col_064_VC(info);
		if (vc == columnRslt_col_065) return doRslt_col_065_VC(info);
		if (vc == columnRslt_col_066) return doRslt_col_066_VC(info);
		if (vc == columnRslt_col_067) return doRslt_col_067_VC(info);
		if (vc == columnRslt_col_068) return doRslt_col_068_VC(info);
		if (vc == columnRslt_col_069) return doRslt_col_069_VC(info);
		if (vc == columnRslt_col_070) return doRslt_col_070_VC(info);
		if (vc == columnRslt_col_071) return doRslt_col_071_VC(info);
		if (vc == columnRslt_col_072) return doRslt_col_072_VC(info);
		if (vc == columnRslt_col_073) return doRslt_col_073_VC(info);
		if (vc == columnRslt_col_074) return doRslt_col_074_VC(info);
		if (vc == columnRslt_col_075) return doRslt_col_075_VC(info);
		if (vc == columnRslt_col_076) return doRslt_col_076_VC(info);
		if (vc == columnRslt_col_077) return doRslt_col_077_VC(info);
		if (vc == columnRslt_col_078) return doRslt_col_078_VC(info);
		if (vc == columnRslt_col_079) return doRslt_col_079_VC(info);
		if (vc == columnRslt_col_080) return doRslt_col_080_VC(info);
		if (vc == columnRslt_col_081) return doRslt_col_081_VC(info);
		if (vc == columnRslt_col_082) return doRslt_col_082_VC(info);
		if (vc == columnRslt_col_083) return doRslt_col_083_VC(info);
		if (vc == columnRslt_col_084) return doRslt_col_084_VC(info);
		if (vc == columnRslt_col_085) return doRslt_col_085_VC(info);
		if (vc == columnRslt_col_086) return doRslt_col_086_VC(info);
		if (vc == columnRslt_col_087) return doRslt_col_087_VC(info);
		if (vc == columnRslt_col_088) return doRslt_col_088_VC(info);
		if (vc == columnRslt_col_089) return doRslt_col_089_VC(info);
		if (vc == columnRslt_col_090) return doRslt_col_090_VC(info);
		if (vc == columnRslt_col_091) return doRslt_col_091_VC(info);
		if (vc == columnRslt_col_092) return doRslt_col_092_VC(info);
		if (vc == columnRslt_col_093) return doRslt_col_093_VC(info);
		if (vc == columnRslt_col_094) return doRslt_col_094_VC(info);
		if (vc == columnRslt_col_095) return doRslt_col_095_VC(info);
		if (vc == columnRslt_col_096) return doRslt_col_096_VC(info);
		if (vc == columnRslt_col_097) return doRslt_col_097_VC(info);
		if (vc == columnRslt_col_098) return doRslt_col_098_VC(info);
		if (vc == columnRslt_col_099) return doRslt_col_099_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tar]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tar_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_id_sub]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_id_sub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_expns_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_expns_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[disp_expns]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_disp_expns_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_id_sub]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_id_sub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rec_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rec_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rec_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ttl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_000]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_000_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_col_099_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_tar_Group) doCnd_tar_NC(info);
		else if (nc == Cnd_act_id) doCnd_act_id_NC(info);
		else if (nc == Cnd_act_id_sub) doCnd_act_id_sub_NC(info);
		else if (nc == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NC(info);
		else if (nc == LPnl_disp_expns) doLPnl_disp_expns_NC(info);
		else if (nc == columnRslt_act_id) doRslt_act_id_NC(info);
		else if (nc == columnRslt_act_id_sub) doRslt_act_id_sub_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_amt_set_typ) doRslt_amt_set_typ_NC(info);
		else if (nc == columnRslt_amt_set_typ_nm) doRslt_amt_set_typ_nm_NC(info);
		else if (nc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NC(info);
		else if (nc == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NC(info);
		else if (nc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NC(info);
		else if (nc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_rec_eval_typ) doRslt_rec_eval_typ_NC(info);
		else if (nc == columnRslt_rec_eval_typ_nm) doRslt_rec_eval_typ_nm_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_upri) doRslt_upri_NC(info);
		else if (nc == columnRslt_ttl) doRslt_ttl_NC(info);
		else if (nc == columnRslt_col_000) doRslt_col_000_NC(info);
		else if (nc == columnRslt_col_001) doRslt_col_001_NC(info);
		else if (nc == columnRslt_col_002) doRslt_col_002_NC(info);
		else if (nc == columnRslt_col_003) doRslt_col_003_NC(info);
		else if (nc == columnRslt_col_004) doRslt_col_004_NC(info);
		else if (nc == columnRslt_col_005) doRslt_col_005_NC(info);
		else if (nc == columnRslt_col_006) doRslt_col_006_NC(info);
		else if (nc == columnRslt_col_007) doRslt_col_007_NC(info);
		else if (nc == columnRslt_col_008) doRslt_col_008_NC(info);
		else if (nc == columnRslt_col_009) doRslt_col_009_NC(info);
		else if (nc == columnRslt_col_010) doRslt_col_010_NC(info);
		else if (nc == columnRslt_col_011) doRslt_col_011_NC(info);
		else if (nc == columnRslt_col_012) doRslt_col_012_NC(info);
		else if (nc == columnRslt_col_013) doRslt_col_013_NC(info);
		else if (nc == columnRslt_col_014) doRslt_col_014_NC(info);
		else if (nc == columnRslt_col_015) doRslt_col_015_NC(info);
		else if (nc == columnRslt_col_016) doRslt_col_016_NC(info);
		else if (nc == columnRslt_col_017) doRslt_col_017_NC(info);
		else if (nc == columnRslt_col_018) doRslt_col_018_NC(info);
		else if (nc == columnRslt_col_019) doRslt_col_019_NC(info);
		else if (nc == columnRslt_col_020) doRslt_col_020_NC(info);
		else if (nc == columnRslt_col_021) doRslt_col_021_NC(info);
		else if (nc == columnRslt_col_022) doRslt_col_022_NC(info);
		else if (nc == columnRslt_col_023) doRslt_col_023_NC(info);
		else if (nc == columnRslt_col_024) doRslt_col_024_NC(info);
		else if (nc == columnRslt_col_025) doRslt_col_025_NC(info);
		else if (nc == columnRslt_col_026) doRslt_col_026_NC(info);
		else if (nc == columnRslt_col_027) doRslt_col_027_NC(info);
		else if (nc == columnRslt_col_028) doRslt_col_028_NC(info);
		else if (nc == columnRslt_col_029) doRslt_col_029_NC(info);
		else if (nc == columnRslt_col_030) doRslt_col_030_NC(info);
		else if (nc == columnRslt_col_031) doRslt_col_031_NC(info);
		else if (nc == columnRslt_col_032) doRslt_col_032_NC(info);
		else if (nc == columnRslt_col_033) doRslt_col_033_NC(info);
		else if (nc == columnRslt_col_034) doRslt_col_034_NC(info);
		else if (nc == columnRslt_col_035) doRslt_col_035_NC(info);
		else if (nc == columnRslt_col_036) doRslt_col_036_NC(info);
		else if (nc == columnRslt_col_037) doRslt_col_037_NC(info);
		else if (nc == columnRslt_col_038) doRslt_col_038_NC(info);
		else if (nc == columnRslt_col_039) doRslt_col_039_NC(info);
		else if (nc == columnRslt_col_040) doRslt_col_040_NC(info);
		else if (nc == columnRslt_col_041) doRslt_col_041_NC(info);
		else if (nc == columnRslt_col_042) doRslt_col_042_NC(info);
		else if (nc == columnRslt_col_043) doRslt_col_043_NC(info);
		else if (nc == columnRslt_col_044) doRslt_col_044_NC(info);
		else if (nc == columnRslt_col_045) doRslt_col_045_NC(info);
		else if (nc == columnRslt_col_046) doRslt_col_046_NC(info);
		else if (nc == columnRslt_col_047) doRslt_col_047_NC(info);
		else if (nc == columnRslt_col_048) doRslt_col_048_NC(info);
		else if (nc == columnRslt_col_049) doRslt_col_049_NC(info);
		else if (nc == columnRslt_col_050) doRslt_col_050_NC(info);
		else if (nc == columnRslt_col_051) doRslt_col_051_NC(info);
		else if (nc == columnRslt_col_052) doRslt_col_052_NC(info);
		else if (nc == columnRslt_col_053) doRslt_col_053_NC(info);
		else if (nc == columnRslt_col_054) doRslt_col_054_NC(info);
		else if (nc == columnRslt_col_055) doRslt_col_055_NC(info);
		else if (nc == columnRslt_col_056) doRslt_col_056_NC(info);
		else if (nc == columnRslt_col_057) doRslt_col_057_NC(info);
		else if (nc == columnRslt_col_058) doRslt_col_058_NC(info);
		else if (nc == columnRslt_col_059) doRslt_col_059_NC(info);
		else if (nc == columnRslt_col_060) doRslt_col_060_NC(info);
		else if (nc == columnRslt_col_061) doRslt_col_061_NC(info);
		else if (nc == columnRslt_col_062) doRslt_col_062_NC(info);
		else if (nc == columnRslt_col_063) doRslt_col_063_NC(info);
		else if (nc == columnRslt_col_064) doRslt_col_064_NC(info);
		else if (nc == columnRslt_col_065) doRslt_col_065_NC(info);
		else if (nc == columnRslt_col_066) doRslt_col_066_NC(info);
		else if (nc == columnRslt_col_067) doRslt_col_067_NC(info);
		else if (nc == columnRslt_col_068) doRslt_col_068_NC(info);
		else if (nc == columnRslt_col_069) doRslt_col_069_NC(info);
		else if (nc == columnRslt_col_070) doRslt_col_070_NC(info);
		else if (nc == columnRslt_col_071) doRslt_col_071_NC(info);
		else if (nc == columnRslt_col_072) doRslt_col_072_NC(info);
		else if (nc == columnRslt_col_073) doRslt_col_073_NC(info);
		else if (nc == columnRslt_col_074) doRslt_col_074_NC(info);
		else if (nc == columnRslt_col_075) doRslt_col_075_NC(info);
		else if (nc == columnRslt_col_076) doRslt_col_076_NC(info);
		else if (nc == columnRslt_col_077) doRslt_col_077_NC(info);
		else if (nc == columnRslt_col_078) doRslt_col_078_NC(info);
		else if (nc == columnRslt_col_079) doRslt_col_079_NC(info);
		else if (nc == columnRslt_col_080) doRslt_col_080_NC(info);
		else if (nc == columnRslt_col_081) doRslt_col_081_NC(info);
		else if (nc == columnRslt_col_082) doRslt_col_082_NC(info);
		else if (nc == columnRslt_col_083) doRslt_col_083_NC(info);
		else if (nc == columnRslt_col_084) doRslt_col_084_NC(info);
		else if (nc == columnRslt_col_085) doRslt_col_085_NC(info);
		else if (nc == columnRslt_col_086) doRslt_col_086_NC(info);
		else if (nc == columnRslt_col_087) doRslt_col_087_NC(info);
		else if (nc == columnRslt_col_088) doRslt_col_088_NC(info);
		else if (nc == columnRslt_col_089) doRslt_col_089_NC(info);
		else if (nc == columnRslt_col_090) doRslt_col_090_NC(info);
		else if (nc == columnRslt_col_091) doRslt_col_091_NC(info);
		else if (nc == columnRslt_col_092) doRslt_col_092_NC(info);
		else if (nc == columnRslt_col_093) doRslt_col_093_NC(info);
		else if (nc == columnRslt_col_094) doRslt_col_094_NC(info);
		else if (nc == columnRslt_col_095) doRslt_col_095_NC(info);
		else if (nc == columnRslt_col_096) doRslt_col_096_NC(info);
		else if (nc == columnRslt_col_097) doRslt_col_097_NC(info);
		else if (nc == columnRslt_col_098) doRslt_col_098_NC(info);
		else if (nc == columnRslt_col_099) doRslt_col_099_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tar]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tar_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_id_sub]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_id_sub_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_id_sub]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_id_sub_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rec_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_tar_Group) doCnd_tar_NE(info);
		else if (ne == Cnd_act_id) doCnd_act_id_NE(info);
		else if (ne == Cnd_act_id_sub) doCnd_act_id_sub_NE(info);
		else if (ne == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NE(info);
		else if (ne == LPnl_disp_expns) doLPnl_disp_expns_NE(info);
		else if (ne == columnRslt_act_id) doRslt_act_id_NE(info);
		else if (ne == columnRslt_act_id_sub) doRslt_act_id_sub_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_amt_set_typ) doRslt_amt_set_typ_NE(info);
		else if (ne == columnRslt_amt_set_typ_nm) doRslt_amt_set_typ_nm_NE(info);
		else if (ne == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NE(info);
		else if (ne == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NE(info);
		else if (ne == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NE(info);
		else if (ne == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_rec_eval_typ) doRslt_rec_eval_typ_NE(info);
		else if (ne == columnRslt_rec_eval_typ_nm) doRslt_rec_eval_typ_nm_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_upri) doRslt_upri_NE(info);
		else if (ne == columnRslt_ttl) doRslt_ttl_NE(info);
		else if (ne == columnRslt_col_000) doRslt_col_000_NE(info);
		else if (ne == columnRslt_col_001) doRslt_col_001_NE(info);
		else if (ne == columnRslt_col_002) doRslt_col_002_NE(info);
		else if (ne == columnRslt_col_003) doRslt_col_003_NE(info);
		else if (ne == columnRslt_col_004) doRslt_col_004_NE(info);
		else if (ne == columnRslt_col_005) doRslt_col_005_NE(info);
		else if (ne == columnRslt_col_006) doRslt_col_006_NE(info);
		else if (ne == columnRslt_col_007) doRslt_col_007_NE(info);
		else if (ne == columnRslt_col_008) doRslt_col_008_NE(info);
		else if (ne == columnRslt_col_009) doRslt_col_009_NE(info);
		else if (ne == columnRslt_col_010) doRslt_col_010_NE(info);
		else if (ne == columnRslt_col_011) doRslt_col_011_NE(info);
		else if (ne == columnRslt_col_012) doRslt_col_012_NE(info);
		else if (ne == columnRslt_col_013) doRslt_col_013_NE(info);
		else if (ne == columnRslt_col_014) doRslt_col_014_NE(info);
		else if (ne == columnRslt_col_015) doRslt_col_015_NE(info);
		else if (ne == columnRslt_col_016) doRslt_col_016_NE(info);
		else if (ne == columnRslt_col_017) doRslt_col_017_NE(info);
		else if (ne == columnRslt_col_018) doRslt_col_018_NE(info);
		else if (ne == columnRslt_col_019) doRslt_col_019_NE(info);
		else if (ne == columnRslt_col_020) doRslt_col_020_NE(info);
		else if (ne == columnRslt_col_021) doRslt_col_021_NE(info);
		else if (ne == columnRslt_col_022) doRslt_col_022_NE(info);
		else if (ne == columnRslt_col_023) doRslt_col_023_NE(info);
		else if (ne == columnRslt_col_024) doRslt_col_024_NE(info);
		else if (ne == columnRslt_col_025) doRslt_col_025_NE(info);
		else if (ne == columnRslt_col_026) doRslt_col_026_NE(info);
		else if (ne == columnRslt_col_027) doRslt_col_027_NE(info);
		else if (ne == columnRslt_col_028) doRslt_col_028_NE(info);
		else if (ne == columnRslt_col_029) doRslt_col_029_NE(info);
		else if (ne == columnRslt_col_030) doRslt_col_030_NE(info);
		else if (ne == columnRslt_col_031) doRslt_col_031_NE(info);
		else if (ne == columnRslt_col_032) doRslt_col_032_NE(info);
		else if (ne == columnRslt_col_033) doRslt_col_033_NE(info);
		else if (ne == columnRslt_col_034) doRslt_col_034_NE(info);
		else if (ne == columnRslt_col_035) doRslt_col_035_NE(info);
		else if (ne == columnRslt_col_036) doRslt_col_036_NE(info);
		else if (ne == columnRslt_col_037) doRslt_col_037_NE(info);
		else if (ne == columnRslt_col_038) doRslt_col_038_NE(info);
		else if (ne == columnRslt_col_039) doRslt_col_039_NE(info);
		else if (ne == columnRslt_col_040) doRslt_col_040_NE(info);
		else if (ne == columnRslt_col_041) doRslt_col_041_NE(info);
		else if (ne == columnRslt_col_042) doRslt_col_042_NE(info);
		else if (ne == columnRslt_col_043) doRslt_col_043_NE(info);
		else if (ne == columnRslt_col_044) doRslt_col_044_NE(info);
		else if (ne == columnRslt_col_045) doRslt_col_045_NE(info);
		else if (ne == columnRslt_col_046) doRslt_col_046_NE(info);
		else if (ne == columnRslt_col_047) doRslt_col_047_NE(info);
		else if (ne == columnRslt_col_048) doRslt_col_048_NE(info);
		else if (ne == columnRslt_col_049) doRslt_col_049_NE(info);
		else if (ne == columnRslt_col_050) doRslt_col_050_NE(info);
		else if (ne == columnRslt_col_051) doRslt_col_051_NE(info);
		else if (ne == columnRslt_col_052) doRslt_col_052_NE(info);
		else if (ne == columnRslt_col_053) doRslt_col_053_NE(info);
		else if (ne == columnRslt_col_054) doRslt_col_054_NE(info);
		else if (ne == columnRslt_col_055) doRslt_col_055_NE(info);
		else if (ne == columnRslt_col_056) doRslt_col_056_NE(info);
		else if (ne == columnRslt_col_057) doRslt_col_057_NE(info);
		else if (ne == columnRslt_col_058) doRslt_col_058_NE(info);
		else if (ne == columnRslt_col_059) doRslt_col_059_NE(info);
		else if (ne == columnRslt_col_060) doRslt_col_060_NE(info);
		else if (ne == columnRslt_col_061) doRslt_col_061_NE(info);
		else if (ne == columnRslt_col_062) doRslt_col_062_NE(info);
		else if (ne == columnRslt_col_063) doRslt_col_063_NE(info);
		else if (ne == columnRslt_col_064) doRslt_col_064_NE(info);
		else if (ne == columnRslt_col_065) doRslt_col_065_NE(info);
		else if (ne == columnRslt_col_066) doRslt_col_066_NE(info);
		else if (ne == columnRslt_col_067) doRslt_col_067_NE(info);
		else if (ne == columnRslt_col_068) doRslt_col_068_NE(info);
		else if (ne == columnRslt_col_069) doRslt_col_069_NE(info);
		else if (ne == columnRslt_col_070) doRslt_col_070_NE(info);
		else if (ne == columnRslt_col_071) doRslt_col_071_NE(info);
		else if (ne == columnRslt_col_072) doRslt_col_072_NE(info);
		else if (ne == columnRslt_col_073) doRslt_col_073_NE(info);
		else if (ne == columnRslt_col_074) doRslt_col_074_NE(info);
		else if (ne == columnRslt_col_075) doRslt_col_075_NE(info);
		else if (ne == columnRslt_col_076) doRslt_col_076_NE(info);
		else if (ne == columnRslt_col_077) doRslt_col_077_NE(info);
		else if (ne == columnRslt_col_078) doRslt_col_078_NE(info);
		else if (ne == columnRslt_col_079) doRslt_col_079_NE(info);
		else if (ne == columnRslt_col_080) doRslt_col_080_NE(info);
		else if (ne == columnRslt_col_081) doRslt_col_081_NE(info);
		else if (ne == columnRslt_col_082) doRslt_col_082_NE(info);
		else if (ne == columnRslt_col_083) doRslt_col_083_NE(info);
		else if (ne == columnRslt_col_084) doRslt_col_084_NE(info);
		else if (ne == columnRslt_col_085) doRslt_col_085_NE(info);
		else if (ne == columnRslt_col_086) doRslt_col_086_NE(info);
		else if (ne == columnRslt_col_087) doRslt_col_087_NE(info);
		else if (ne == columnRslt_col_088) doRslt_col_088_NE(info);
		else if (ne == columnRslt_col_089) doRslt_col_089_NE(info);
		else if (ne == columnRslt_col_090) doRslt_col_090_NE(info);
		else if (ne == columnRslt_col_091) doRslt_col_091_NE(info);
		else if (ne == columnRslt_col_092) doRslt_col_092_NE(info);
		else if (ne == columnRslt_col_093) doRslt_col_093_NE(info);
		else if (ne == columnRslt_col_094) doRslt_col_094_NE(info);
		else if (ne == columnRslt_col_095) doRslt_col_095_NE(info);
		else if (ne == columnRslt_col_096) doRslt_col_096_NE(info);
		else if (ne == columnRslt_col_097) doRslt_col_097_NE(info);
		else if (ne == columnRslt_col_098) doRslt_col_098_NE(info);
		else if (ne == columnRslt_col_099) doRslt_col_099_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tar]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tar_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_id_sub]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_id_sub_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_id_sub]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_id_sub_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rec_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_tar_Group) doCnd_tar_NX(info);
		else if (nx == Cnd_act_id) doCnd_act_id_NX(info);
		else if (nx == Cnd_act_id_sub) doCnd_act_id_sub_NX(info);
		else if (nx == LPnl_disp_expns_grp) doLPnl_disp_expns_grp_NX(info);
		else if (nx == LPnl_disp_expns) doLPnl_disp_expns_NX(info);
		else if (nx == columnRslt_act_id) doRslt_act_id_NX(info);
		else if (nx == columnRslt_act_id_sub) doRslt_act_id_sub_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_amt_set_typ) doRslt_amt_set_typ_NX(info);
		else if (nx == columnRslt_amt_set_typ_nm) doRslt_amt_set_typ_nm_NX(info);
		else if (nx == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_NX(info);
		else if (nx == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_NX(info);
		else if (nx == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NX(info);
		else if (nx == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_rec_eval_typ) doRslt_rec_eval_typ_NX(info);
		else if (nx == columnRslt_rec_eval_typ_nm) doRslt_rec_eval_typ_nm_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_upri) doRslt_upri_NX(info);
		else if (nx == columnRslt_ttl) doRslt_ttl_NX(info);
		else if (nx == columnRslt_col_000) doRslt_col_000_NX(info);
		else if (nx == columnRslt_col_001) doRslt_col_001_NX(info);
		else if (nx == columnRslt_col_002) doRslt_col_002_NX(info);
		else if (nx == columnRslt_col_003) doRslt_col_003_NX(info);
		else if (nx == columnRslt_col_004) doRslt_col_004_NX(info);
		else if (nx == columnRslt_col_005) doRslt_col_005_NX(info);
		else if (nx == columnRslt_col_006) doRslt_col_006_NX(info);
		else if (nx == columnRslt_col_007) doRslt_col_007_NX(info);
		else if (nx == columnRslt_col_008) doRslt_col_008_NX(info);
		else if (nx == columnRslt_col_009) doRslt_col_009_NX(info);
		else if (nx == columnRslt_col_010) doRslt_col_010_NX(info);
		else if (nx == columnRslt_col_011) doRslt_col_011_NX(info);
		else if (nx == columnRslt_col_012) doRslt_col_012_NX(info);
		else if (nx == columnRslt_col_013) doRslt_col_013_NX(info);
		else if (nx == columnRslt_col_014) doRslt_col_014_NX(info);
		else if (nx == columnRslt_col_015) doRslt_col_015_NX(info);
		else if (nx == columnRslt_col_016) doRslt_col_016_NX(info);
		else if (nx == columnRslt_col_017) doRslt_col_017_NX(info);
		else if (nx == columnRslt_col_018) doRslt_col_018_NX(info);
		else if (nx == columnRslt_col_019) doRslt_col_019_NX(info);
		else if (nx == columnRslt_col_020) doRslt_col_020_NX(info);
		else if (nx == columnRslt_col_021) doRslt_col_021_NX(info);
		else if (nx == columnRslt_col_022) doRslt_col_022_NX(info);
		else if (nx == columnRslt_col_023) doRslt_col_023_NX(info);
		else if (nx == columnRslt_col_024) doRslt_col_024_NX(info);
		else if (nx == columnRslt_col_025) doRslt_col_025_NX(info);
		else if (nx == columnRslt_col_026) doRslt_col_026_NX(info);
		else if (nx == columnRslt_col_027) doRslt_col_027_NX(info);
		else if (nx == columnRslt_col_028) doRslt_col_028_NX(info);
		else if (nx == columnRslt_col_029) doRslt_col_029_NX(info);
		else if (nx == columnRslt_col_030) doRslt_col_030_NX(info);
		else if (nx == columnRslt_col_031) doRslt_col_031_NX(info);
		else if (nx == columnRslt_col_032) doRslt_col_032_NX(info);
		else if (nx == columnRslt_col_033) doRslt_col_033_NX(info);
		else if (nx == columnRslt_col_034) doRslt_col_034_NX(info);
		else if (nx == columnRslt_col_035) doRslt_col_035_NX(info);
		else if (nx == columnRslt_col_036) doRslt_col_036_NX(info);
		else if (nx == columnRslt_col_037) doRslt_col_037_NX(info);
		else if (nx == columnRslt_col_038) doRslt_col_038_NX(info);
		else if (nx == columnRslt_col_039) doRslt_col_039_NX(info);
		else if (nx == columnRslt_col_040) doRslt_col_040_NX(info);
		else if (nx == columnRslt_col_041) doRslt_col_041_NX(info);
		else if (nx == columnRslt_col_042) doRslt_col_042_NX(info);
		else if (nx == columnRslt_col_043) doRslt_col_043_NX(info);
		else if (nx == columnRslt_col_044) doRslt_col_044_NX(info);
		else if (nx == columnRslt_col_045) doRslt_col_045_NX(info);
		else if (nx == columnRslt_col_046) doRslt_col_046_NX(info);
		else if (nx == columnRslt_col_047) doRslt_col_047_NX(info);
		else if (nx == columnRslt_col_048) doRslt_col_048_NX(info);
		else if (nx == columnRslt_col_049) doRslt_col_049_NX(info);
		else if (nx == columnRslt_col_050) doRslt_col_050_NX(info);
		else if (nx == columnRslt_col_051) doRslt_col_051_NX(info);
		else if (nx == columnRslt_col_052) doRslt_col_052_NX(info);
		else if (nx == columnRslt_col_053) doRslt_col_053_NX(info);
		else if (nx == columnRslt_col_054) doRslt_col_054_NX(info);
		else if (nx == columnRslt_col_055) doRslt_col_055_NX(info);
		else if (nx == columnRslt_col_056) doRslt_col_056_NX(info);
		else if (nx == columnRslt_col_057) doRslt_col_057_NX(info);
		else if (nx == columnRslt_col_058) doRslt_col_058_NX(info);
		else if (nx == columnRslt_col_059) doRslt_col_059_NX(info);
		else if (nx == columnRslt_col_060) doRslt_col_060_NX(info);
		else if (nx == columnRslt_col_061) doRslt_col_061_NX(info);
		else if (nx == columnRslt_col_062) doRslt_col_062_NX(info);
		else if (nx == columnRslt_col_063) doRslt_col_063_NX(info);
		else if (nx == columnRslt_col_064) doRslt_col_064_NX(info);
		else if (nx == columnRslt_col_065) doRslt_col_065_NX(info);
		else if (nx == columnRslt_col_066) doRslt_col_066_NX(info);
		else if (nx == columnRslt_col_067) doRslt_col_067_NX(info);
		else if (nx == columnRslt_col_068) doRslt_col_068_NX(info);
		else if (nx == columnRslt_col_069) doRslt_col_069_NX(info);
		else if (nx == columnRslt_col_070) doRslt_col_070_NX(info);
		else if (nx == columnRslt_col_071) doRslt_col_071_NX(info);
		else if (nx == columnRslt_col_072) doRslt_col_072_NX(info);
		else if (nx == columnRslt_col_073) doRslt_col_073_NX(info);
		else if (nx == columnRslt_col_074) doRslt_col_074_NX(info);
		else if (nx == columnRslt_col_075) doRslt_col_075_NX(info);
		else if (nx == columnRslt_col_076) doRslt_col_076_NX(info);
		else if (nx == columnRslt_col_077) doRslt_col_077_NX(info);
		else if (nx == columnRslt_col_078) doRslt_col_078_NX(info);
		else if (nx == columnRslt_col_079) doRslt_col_079_NX(info);
		else if (nx == columnRslt_col_080) doRslt_col_080_NX(info);
		else if (nx == columnRslt_col_081) doRslt_col_081_NX(info);
		else if (nx == columnRslt_col_082) doRslt_col_082_NX(info);
		else if (nx == columnRslt_col_083) doRslt_col_083_NX(info);
		else if (nx == columnRslt_col_084) doRslt_col_084_NX(info);
		else if (nx == columnRslt_col_085) doRslt_col_085_NX(info);
		else if (nx == columnRslt_col_086) doRslt_col_086_NX(info);
		else if (nx == columnRslt_col_087) doRslt_col_087_NX(info);
		else if (nx == columnRslt_col_088) doRslt_col_088_NX(info);
		else if (nx == columnRslt_col_089) doRslt_col_089_NX(info);
		else if (nx == columnRslt_col_090) doRslt_col_090_NX(info);
		else if (nx == columnRslt_col_091) doRslt_col_091_NX(info);
		else if (nx == columnRslt_col_092) doRslt_col_092_NX(info);
		else if (nx == columnRslt_col_093) doRslt_col_093_NX(info);
		else if (nx == columnRslt_col_094) doRslt_col_094_NX(info);
		else if (nx == columnRslt_col_095) doRslt_col_095_NX(info);
		else if (nx == columnRslt_col_096) doRslt_col_096_NX(info);
		else if (nx == columnRslt_col_097) doRslt_col_097_NX(info);
		else if (nx == columnRslt_col_098) doRslt_col_098_NX(info);
		else if (nx == columnRslt_col_099) doRslt_col_099_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tar]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tar_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_id_sub]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_id_sub_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_grp_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[disp_expns]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_disp_expns_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_id_sub]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_id_sub_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rec_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_act_id) doCnd_act_id_LC(info);
		else if (lc == Cnd_act_id_sub) doCnd_act_id_sub_LC(info);
		else if (lc == columnRslt_act_id) doRslt_act_id_LC(info);
		else if (lc == columnRslt_act_id_sub) doRslt_act_id_sub_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_amt_set_typ) doRslt_amt_set_typ_LC(info);
		else if (lc == columnRslt_amt_set_typ_nm) doRslt_amt_set_typ_nm_LC(info);
		else if (lc == columnRslt_calc_grp_cd) doRslt_calc_grp_cd_LC(info);
		else if (lc == columnRslt_calc_grp_nm) doRslt_calc_grp_nm_LC(info);
		else if (lc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_LC(info);
		else if (lc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_rec_eval_typ) doRslt_rec_eval_typ_LC(info);
		else if (lc == columnRslt_rec_eval_typ_nm) doRslt_rec_eval_typ_nm_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_upri) doRslt_upri_LC(info);
		else if (lc == columnRslt_ttl) doRslt_ttl_LC(info);
		else if (lc == columnRslt_col_000) doRslt_col_000_LC(info);
		else if (lc == columnRslt_col_001) doRslt_col_001_LC(info);
		else if (lc == columnRslt_col_002) doRslt_col_002_LC(info);
		else if (lc == columnRslt_col_003) doRslt_col_003_LC(info);
		else if (lc == columnRslt_col_004) doRslt_col_004_LC(info);
		else if (lc == columnRslt_col_005) doRslt_col_005_LC(info);
		else if (lc == columnRslt_col_006) doRslt_col_006_LC(info);
		else if (lc == columnRslt_col_007) doRslt_col_007_LC(info);
		else if (lc == columnRslt_col_008) doRslt_col_008_LC(info);
		else if (lc == columnRslt_col_009) doRslt_col_009_LC(info);
		else if (lc == columnRslt_col_010) doRslt_col_010_LC(info);
		else if (lc == columnRslt_col_011) doRslt_col_011_LC(info);
		else if (lc == columnRslt_col_012) doRslt_col_012_LC(info);
		else if (lc == columnRslt_col_013) doRslt_col_013_LC(info);
		else if (lc == columnRslt_col_014) doRslt_col_014_LC(info);
		else if (lc == columnRslt_col_015) doRslt_col_015_LC(info);
		else if (lc == columnRslt_col_016) doRslt_col_016_LC(info);
		else if (lc == columnRslt_col_017) doRslt_col_017_LC(info);
		else if (lc == columnRslt_col_018) doRslt_col_018_LC(info);
		else if (lc == columnRslt_col_019) doRslt_col_019_LC(info);
		else if (lc == columnRslt_col_020) doRslt_col_020_LC(info);
		else if (lc == columnRslt_col_021) doRslt_col_021_LC(info);
		else if (lc == columnRslt_col_022) doRslt_col_022_LC(info);
		else if (lc == columnRslt_col_023) doRslt_col_023_LC(info);
		else if (lc == columnRslt_col_024) doRslt_col_024_LC(info);
		else if (lc == columnRslt_col_025) doRslt_col_025_LC(info);
		else if (lc == columnRslt_col_026) doRslt_col_026_LC(info);
		else if (lc == columnRslt_col_027) doRslt_col_027_LC(info);
		else if (lc == columnRslt_col_028) doRslt_col_028_LC(info);
		else if (lc == columnRslt_col_029) doRslt_col_029_LC(info);
		else if (lc == columnRslt_col_030) doRslt_col_030_LC(info);
		else if (lc == columnRslt_col_031) doRslt_col_031_LC(info);
		else if (lc == columnRslt_col_032) doRslt_col_032_LC(info);
		else if (lc == columnRslt_col_033) doRslt_col_033_LC(info);
		else if (lc == columnRslt_col_034) doRslt_col_034_LC(info);
		else if (lc == columnRslt_col_035) doRslt_col_035_LC(info);
		else if (lc == columnRslt_col_036) doRslt_col_036_LC(info);
		else if (lc == columnRslt_col_037) doRslt_col_037_LC(info);
		else if (lc == columnRslt_col_038) doRslt_col_038_LC(info);
		else if (lc == columnRslt_col_039) doRslt_col_039_LC(info);
		else if (lc == columnRslt_col_040) doRslt_col_040_LC(info);
		else if (lc == columnRslt_col_041) doRslt_col_041_LC(info);
		else if (lc == columnRslt_col_042) doRslt_col_042_LC(info);
		else if (lc == columnRslt_col_043) doRslt_col_043_LC(info);
		else if (lc == columnRslt_col_044) doRslt_col_044_LC(info);
		else if (lc == columnRslt_col_045) doRslt_col_045_LC(info);
		else if (lc == columnRslt_col_046) doRslt_col_046_LC(info);
		else if (lc == columnRslt_col_047) doRslt_col_047_LC(info);
		else if (lc == columnRslt_col_048) doRslt_col_048_LC(info);
		else if (lc == columnRslt_col_049) doRslt_col_049_LC(info);
		else if (lc == columnRslt_col_050) doRslt_col_050_LC(info);
		else if (lc == columnRslt_col_051) doRslt_col_051_LC(info);
		else if (lc == columnRslt_col_052) doRslt_col_052_LC(info);
		else if (lc == columnRslt_col_053) doRslt_col_053_LC(info);
		else if (lc == columnRslt_col_054) doRslt_col_054_LC(info);
		else if (lc == columnRslt_col_055) doRslt_col_055_LC(info);
		else if (lc == columnRslt_col_056) doRslt_col_056_LC(info);
		else if (lc == columnRslt_col_057) doRslt_col_057_LC(info);
		else if (lc == columnRslt_col_058) doRslt_col_058_LC(info);
		else if (lc == columnRslt_col_059) doRslt_col_059_LC(info);
		else if (lc == columnRslt_col_060) doRslt_col_060_LC(info);
		else if (lc == columnRslt_col_061) doRslt_col_061_LC(info);
		else if (lc == columnRslt_col_062) doRslt_col_062_LC(info);
		else if (lc == columnRslt_col_063) doRslt_col_063_LC(info);
		else if (lc == columnRslt_col_064) doRslt_col_064_LC(info);
		else if (lc == columnRslt_col_065) doRslt_col_065_LC(info);
		else if (lc == columnRslt_col_066) doRslt_col_066_LC(info);
		else if (lc == columnRslt_col_067) doRslt_col_067_LC(info);
		else if (lc == columnRslt_col_068) doRslt_col_068_LC(info);
		else if (lc == columnRslt_col_069) doRslt_col_069_LC(info);
		else if (lc == columnRslt_col_070) doRslt_col_070_LC(info);
		else if (lc == columnRslt_col_071) doRslt_col_071_LC(info);
		else if (lc == columnRslt_col_072) doRslt_col_072_LC(info);
		else if (lc == columnRslt_col_073) doRslt_col_073_LC(info);
		else if (lc == columnRslt_col_074) doRslt_col_074_LC(info);
		else if (lc == columnRslt_col_075) doRslt_col_075_LC(info);
		else if (lc == columnRslt_col_076) doRslt_col_076_LC(info);
		else if (lc == columnRslt_col_077) doRslt_col_077_LC(info);
		else if (lc == columnRslt_col_078) doRslt_col_078_LC(info);
		else if (lc == columnRslt_col_079) doRslt_col_079_LC(info);
		else if (lc == columnRslt_col_080) doRslt_col_080_LC(info);
		else if (lc == columnRslt_col_081) doRslt_col_081_LC(info);
		else if (lc == columnRslt_col_082) doRslt_col_082_LC(info);
		else if (lc == columnRslt_col_083) doRslt_col_083_LC(info);
		else if (lc == columnRslt_col_084) doRslt_col_084_LC(info);
		else if (lc == columnRslt_col_085) doRslt_col_085_LC(info);
		else if (lc == columnRslt_col_086) doRslt_col_086_LC(info);
		else if (lc == columnRslt_col_087) doRslt_col_087_LC(info);
		else if (lc == columnRslt_col_088) doRslt_col_088_LC(info);
		else if (lc == columnRslt_col_089) doRslt_col_089_LC(info);
		else if (lc == columnRslt_col_090) doRslt_col_090_LC(info);
		else if (lc == columnRslt_col_091) doRslt_col_091_LC(info);
		else if (lc == columnRslt_col_092) doRslt_col_092_LC(info);
		else if (lc == columnRslt_col_093) doRslt_col_093_LC(info);
		else if (lc == columnRslt_col_094) doRslt_col_094_LC(info);
		else if (lc == columnRslt_col_095) doRslt_col_095_LC(info);
		else if (lc == columnRslt_col_096) doRslt_col_096_LC(info);
		else if (lc == columnRslt_col_097) doRslt_col_097_LC(info);
		else if (lc == columnRslt_col_098) doRslt_col_098_LC(info);
		else if (lc == columnRslt_col_099) doRslt_col_099_LC(info);
	}

	/**
	 * [Cnd]パネルの[act_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_id_sub]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_id_sub_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_id_sub]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_id_sub_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rec_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ttl_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_000]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_000_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_001_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_002_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_003_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_004_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_005_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_006_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_007_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_008_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_009_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_010_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_011_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_012_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_013_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_014_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_015_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_016_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_017_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_018_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_019_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_020_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_021_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_022_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_023_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_024_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_025_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_026_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_027_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_028_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_029_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_030_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_031_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_032_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_033_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_034_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_035_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_036_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_037_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_038_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_039_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_040_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_041_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_042_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_043_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_044_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_045_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_046_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_047_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_048_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_049_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_050_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_051_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_052_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_053_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_054_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_055_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_056_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_057_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_058_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_059_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_060_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_061_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_062_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_063_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_064_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_065_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_066_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_067_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_068_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_069_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_070_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_071_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_072_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_073_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_074_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_075_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_076_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_077_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_078_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_079_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_080_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_081_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_082_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_083_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_084_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_085_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_086_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_087_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_088_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_089_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_090_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_091_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_092_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_093_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_094_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_095_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_096_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_097_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_098_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_col_099_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnRslt_amt_set_typ]の作成メソッド
	 */
	public MCList getRslt_amt_set_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAmtSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_calc_grp_cd]の作成メソッド
	 */
	public MCList getRslt_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBBL0200.Srch01")) {
			return new MG_MGBBL0200_Srch01Bridge();
		}
		if (id.equals("MG.MGBBL0200.Srch02")) {
			return new MG_MGBBL0200_Srch02Bridge();
		}
		if (id.equals("MG.MGBBL0200.Srch03")) {
			return new MG_MGBBL0200_Srch03Bridge();
		}
		if (id.equals("MG.MGBBL0200.Upd01")) {
			return new MG_MGBBL0200_Upd01Bridge();
		}
		if (id.equals("MG.MGBBL0200.Upd02")) {
			return new MG_MGBBL0200_Upd02Bridge();
		}
		if (id.equals("MG.MGBBL0200.Upd03")) {
			return new MG_MGBBL0200_Upd03Bridge();
		}
		if (id.equals("MG.MGBBL0200.Upd04")) {
			return new MG_MGBBL0200_Upd04Bridge();
		}
		if (id.equals("MG.MGBBL0200.Upd05")) {
			return new MG_MGBBL0200_Upd05Bridge();
		}
		if (id.equals("MG.MGBBL0200.Upd06")) {
			return new MG_MGBBL0200_Upd06Bridge();
		}
		if (id.equals("MG.MGBBL0200.Del01")) {
			return new MG_MGBBL0200_Del01Bridge();
		}
		if (id.equals("MG.MGBBL0200.Del02")) {
			return new MG_MGBBL0200_Del02Bridge();
		}
		if (id.equals("MG.MGBBL0200.Del03")) {
			return new MG_MGBBL0200_Del03Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBBL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Srch01;

		/** コンストラクタ */
		protected MG_MGBBL0200_Srch01Bridge() {
			p_MG_MGBBL0200_Srch01 = new MCParam(PDef.MG_MGBBL0200_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0200.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0200.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0200.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Srch01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Srch01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MG_MGBBL0200_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Srch02;

		/** コンストラクタ */
		protected MG_MGBBL0200_Srch02Bridge() {
			p_MG_MGBBL0200_Srch02 = new MCParam(PDef.MG_MGBBL0200_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0200.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0200.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0200.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Srch02.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Srch02.getContainerParam().getDownBlock(0));
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
	/**
	 * [MG_MGBBL0200_Srch03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Srch03;

		/** コンストラクタ */
		protected MG_MGBBL0200_Srch03Bridge() {
			p_MG_MGBBL0200_Srch03 = new MCParam(PDef.MG_MGBBL0200_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0200.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0200.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0200.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Srch03.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Srch03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Srch03.getContainerParam().getDownBlock(0));
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
	/**
	 * [MG_MGBBL0200_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Upd01;

		/** コンストラクタ */
		protected MG_MGBBL0200_Upd01Bridge() {
			p_MG_MGBBL0200_Upd01 = new MCParam(PDef.MG_MGBBL0200_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Upd01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0200_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Upd02;

		/** コンストラクタ */
		protected MG_MGBBL0200_Upd02Bridge() {
			p_MG_MGBBL0200_Upd02 = new MCParam(PDef.MG_MGBBL0200_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Upd02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Upd02.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Upd02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0200_Upd03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Upd03;

		/** コンストラクタ */
		protected MG_MGBBL0200_Upd03Bridge() {
			p_MG_MGBBL0200_Upd03 = new MCParam(PDef.MG_MGBBL0200_Upd03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Upd03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Upd03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Upd03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Upd03.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Upd03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Upd03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Upd03.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Upd03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Upd03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0200_Upd04]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Upd04;

		/** コンストラクタ */
		protected MG_MGBBL0200_Upd04Bridge() {
			p_MG_MGBBL0200_Upd04 = new MCParam(PDef.MG_MGBBL0200_Upd04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Upd04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Upd04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Upd04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Upd04.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Upd04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Upd04.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Upd04.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Upd04;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Upd04.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0200_Upd05]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd05Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Upd05;

		/** コンストラクタ */
		protected MG_MGBBL0200_Upd05Bridge() {
			p_MG_MGBBL0200_Upd05 = new MCParam(PDef.MG_MGBBL0200_Upd05_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Upd05_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Upd05 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Upd05.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Upd05.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Upd05.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Upd05.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Upd05.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Upd05;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Upd05.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0200_Upd06]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Upd06Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Upd06;

		/** コンストラクタ */
		protected MG_MGBBL0200_Upd06Bridge() {
			p_MG_MGBBL0200_Upd06 = new MCParam(PDef.MG_MGBBL0200_Upd06_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Upd06_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Upd06 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Upd06.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Upd06.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Upd06.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Upd06.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Upd06.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Upd06;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Upd06.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0200_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Del01;

		/** コンストラクタ */
		protected MG_MGBBL0200_Del01Bridge() {
			p_MG_MGBBL0200_Del01 = new MCParam(PDef.MG_MGBBL0200_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Del01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0200_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Del02;

		/** コンストラクタ */
		protected MG_MGBBL0200_Del02Bridge() {
			p_MG_MGBBL0200_Del02 = new MCParam(PDef.MG_MGBBL0200_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Del02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Del02.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Del02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Del02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0200_Del03]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0200_Del03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0200_Del03;

		/** コンストラクタ */
		protected MG_MGBBL0200_Del03Bridge() {
			p_MG_MGBBL0200_Del03 = new MCParam(PDef.MG_MGBBL0200_Del03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0200_Del03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));

			p_MG_MGBBL0200_Del03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0200_Del03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0200_Del03.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0200_Del03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0200_Del03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0200.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0200_Del03.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0200.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0200_Del03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0200.RsltR>)p_MG_MGBBL0200_Del03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}