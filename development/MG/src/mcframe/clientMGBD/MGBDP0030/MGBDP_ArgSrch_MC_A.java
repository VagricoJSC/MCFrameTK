package mcframe.clientMGBD.MGBDP0030;

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
import mcframe.clientMGBD.MGBDP0030.MGBDP_ArgSrch_MC.MG_MGBDL0030_Srch01Caller;
import mcframe.clientMGBD.MGBDP0030.MGBDP_ArgSrch_MC.MG_MGBDL0030_Upd01Caller;
import mcframe.clientMGBD.MGBDP0030.MGBDP_ArgSrch_MC.MG_MGBDL0030_Del01Caller;
import mcframe.clientMGBD.MGBDP0030.MGBDP_ArgSrch_MC.MG_MGBDL0030_Srch02Caller;

/**
 * 画面"MGBDP_ArgSrch"パネルクラスです。<p>
 *
 * 原価計算結果を確認する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_ArgSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBDP0030";

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
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	public MCTitledBorder TgtTitledBorder = null;
	// [Tgt]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * REF,View,REF;UPD,Modify,UPD;DEL,Delete,DEL;DEL_ADMIN,Delete (Administrator),DEL_ADMIN REF,参照する,REF;UPD,訂正する,UPD;DEL,削除する,DEL;DEL_ADMIN,削除する（管理者）,DEL_ADMIN.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_DEL_ADMIN = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public MCDateField Cnd_term_end_ym;	// [Cnd]の[term_p.term_end_ym]を[Cnd_term_end_ym]としてエイリアス定義。
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
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H Cnd_calc_no_p_PPanel;
	public MCTextComboBox Cnd_calc_no;	// [Cnd]の[calc_no_p.calc_no]を[Cnd_calc_no]としてエイリアス定義。
	public MCTextField Cnd_invisible_rmrks;	// [Cnd]の[calc_no_p.rmrks]を[Cnd_invisible_rmrks]としてエイリアス定義。
	public MCLabel Cnd_calc_usr_cd_Label = null;
	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_calc_usr_cd = null;
	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public MCTextField Cnd_calc_usr_nm = null;
	public MCLabel Cnd_st_ym_Label = null;
	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public MCDateComboBox Cnd_st_ym = null;
	public MCLabel Cnd_end_ym_Label = null;
	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public MCDateComboBox Cnd_end_ym = null;
	public MCLabel Cnd_rmrks_Label = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCTextField Cnd_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_true_flg = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_false_flg = null;
	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public MCCheckBox Cnd_non_del_true_flg = null;
	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public MCCheckBox Cnd_non_del_false_flg = null;
	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public MCCheckBox Cnd_calc_err_true_flg = null;
	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public MCCheckBox Cnd_calc_err_false_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	public MCLabel Cnd_menu_cd_Label = null;
	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_menu_cd = null;
	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public MCTextField Cnd_menu_nm = null;
	// [Menu]ブロック関連のField定義
	public MCPanel MenuPanel = null;
	public MCTitledBorder MenuTitledBorder = null;
	// [Menu]ブロックの項目のField定義
	// [MenuCd]ブロック関連のField定義
	public MCPanel MenuCdPanel = null;
	// [MenuCd]ブロックの項目のField定義
	// [MenuBtn]ブロック関連のField定義
	public MCPanel MenuBtnPanel = null;
	// [MenuBtn]ブロックの項目のField定義
	/**
	 * Screen transition 01 画面遷移０１.<p>
	 *
	 */
	public MCButton MenuBtn_open_01 = null;
	/**
	 * Screen transition 02 画面遷移０２.<p>
	 *
	 */
	public MCButton MenuBtn_open_02 = null;
	/**
	 * Screen transition 03 画面遷移０３.<p>
	 *
	 */
	public MCButton MenuBtn_open_03 = null;
	/**
	 * Screen transition 04 画面遷移０４.<p>
	 *
	 */
	public MCButton MenuBtn_open_04 = null;
	/**
	 * Screen transition 05 画面遷移０５.<p>
	 *
	 */
	public MCButton MenuBtn_open_05 = null;
	/**
	 * Screen transition 06 画面遷移０６.<p>
	 *
	 */
	public MCButton MenuBtn_open_06 = null;
	/**
	 * Screen transition 07 画面遷移０７.<p>
	 *
	 */
	public MCButton MenuBtn_open_07 = null;
	/**
	 * Screen transition 08 画面遷移０８.<p>
	 *
	 */
	public MCButton MenuBtn_open_08 = null;
	/**
	 * Screen transition 09 画面遷移０９.<p>
	 *
	 */
	public MCButton MenuBtn_open_09 = null;
	/**
	 * Screen transition 10 画面遷移１０.<p>
	 *
	 */
	public MCButton MenuBtn_open_10 = null;
	/**
	 * Screen transition 11 画面遷移１１.<p>
	 *
	 */
	public MCButton MenuBtn_open_11 = null;
	/**
	 * Screen transition 12 画面遷移１２.<p>
	 *
	 */
	public MCButton MenuBtn_open_12 = null;
	/**
	 * Screen transition 13 画面遷移１３.<p>
	 *
	 */
	public MCButton MenuBtn_open_13 = null;
	/**
	 * Screen transition 14 画面遷移１４.<p>
	 *
	 */
	public MCButton MenuBtn_open_14 = null;
	/**
	 * Screen transition 15 画面遷移１５.<p>
	 *
	 */
	public MCButton MenuBtn_open_15 = null;
	/**
	 * Screen transition 16 画面遷移１６.<p>
	 *
	 */
	public MCButton MenuBtn_open_16 = null;
	/**
	 * Screen transition 17 画面遷移１７.<p>
	 *
	 */
	public MCButton MenuBtn_open_17 = null;
	/**
	 * Screen transition 18 画面遷移１８.<p>
	 *
	 */
	public MCButton MenuBtn_open_18 = null;
	/**
	 * Screen transition 19 画面遷移１９.<p>
	 *
	 */
	public MCButton MenuBtn_open_19 = null;
	/**
	 * Screen transition 20 画面遷移２０.<p>
	 *
	 */
	public MCButton MenuBtn_open_20 = null;
	/**
	 * Screen transition 21 画面遷移２１.<p>
	 *
	 */
	public MCButton MenuBtn_open_21 = null;
	/**
	 * Screen transition 22 画面遷移２２.<p>
	 *
	 */
	public MCButton MenuBtn_open_22 = null;
	/**
	 * Screen transition 23 画面遷移２３.<p>
	 *
	 */
	public MCButton MenuBtn_open_23 = null;
	/**
	 * Screen transition 24 画面遷移２４.<p>
	 *
	 */
	public MCButton MenuBtn_open_24 = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0030.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_no = null;
	/**
	 * Error エラー.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_err_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_flg = null;
	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_non_del_flg = null;
	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_st_ym = null;
	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_end_ym = null;
	/**
	 * Unallocated 未配賦.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_err_flg = null;
	/**
	 * Transfer difference 振替差額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_amt_flg = null;
	/**
	 * GR/GI difference 受払差額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_adj_amt_flg = null;
	/**
	 * Negative inventory マイナス在庫.<p>
	 *
	 */
	public MCColumnConfig columnDtl_minus_stk_flg = null;
	/**
	 * Optional check 任意チェック.<p>
	 *
	 */
	public MCColumnConfig columnDtl_other_chk_flg = null;
	/**
	 * Specify item 品目指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_limit_flg = null;
	/**
	 * Check data データ確認.<p>
	 *
	 */
	public MCColumnConfig columnDtl_data_check_flg = null;
	/**
	 * Firm allocation rate 配賦率確定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rate_fix_flg = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_cd = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_nm = null;
	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_usr_cd = null;
	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_usr_nm = null;
	/**
	 * Calculation start time 計算開始時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_st = null;
	/**
	 * Calculation end time 計算終了時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_fin = null;
	/**
	 * Calculation time (Hour:minute:second) 計算時間（時：分：秒）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_time = null;
	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_srv_req_no = null;
	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_batch_log_no = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_grp_cd = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_rtn_sts_typ_nm;// [Dtl]の[rts_msg_p.rtn_sts_typ_nm]を[columnDtl_rtn_sts_typ_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg_id;// [Dtl]の[rts_msg_p.msg_id]を[columnDtl_msg_id]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg;// [Dtl]の[rts_msg_p.msg]を[columnDtl_msg]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Cost calculation logs 原価計算ログ照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0050 = null;
	/**
	 * Batch log check バッチログ確認.<p>
	 *
	 */
	public MCButton Btn_open_FSBGP0160 = null;
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
	 * Modify 訂正する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	/**
	 * Delete (Administrator) 削除する（管理者）.<p>
	 *
	 */
	public MCButton Btn_del_admin = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF, UPD, DEL, FIX_D};
	
	/** [MG_MGBDL0030_Srch01]のCallerの作成 */
	protected MGBDP_ArgSrch_MC.MG_MGBDL0030_Srch01Caller createMG_MGBDL0030_Srch01() {
		MGBDP_ArgSrch_MC.MG_MGBDL0030_Srch01Caller<MGBDP_ArgSrch, MG_MGBDL0030_Srch01Bridge>
		caller = ((MGBDP_ArgSrch_MC)this).new MG_MGBDL0030_Srch01Caller<MGBDP_ArgSrch, MG_MGBDL0030_Srch01Bridge>(
					(MGBDP_ArgSrch)this, new MG_MGBDL0030_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0030_Srch01]の呼び出し */
	protected void callMG_MGBDL0030_Srch01() {
		MCCaller caller = createMG_MGBDL0030_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0030_Upd01]のCallerの作成 */
	protected MGBDP_ArgSrch_MC.MG_MGBDL0030_Upd01Caller createMG_MGBDL0030_Upd01() {
		MGBDP_ArgSrch_MC.MG_MGBDL0030_Upd01Caller<MGBDP_ArgSrch, MG_MGBDL0030_Upd01Bridge>
		caller = ((MGBDP_ArgSrch_MC)this).new MG_MGBDL0030_Upd01Caller<MGBDP_ArgSrch, MG_MGBDL0030_Upd01Bridge>(
					(MGBDP_ArgSrch)this, new MG_MGBDL0030_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBDL0030_Upd01]の呼び出し */
	protected void callMG_MGBDL0030_Upd01() {
		MCCaller caller = createMG_MGBDL0030_Upd01();
		caller.exec();
	}
	/** [MG_MGBDL0030_Del01]のCallerの作成 */
	protected MGBDP_ArgSrch_MC.MG_MGBDL0030_Del01Caller createMG_MGBDL0030_Del01() {
		MGBDP_ArgSrch_MC.MG_MGBDL0030_Del01Caller<MGBDP_ArgSrch, MG_MGBDL0030_Del01Bridge>
		caller = ((MGBDP_ArgSrch_MC)this).new MG_MGBDL0030_Del01Caller<MGBDP_ArgSrch, MG_MGBDL0030_Del01Bridge>(
					(MGBDP_ArgSrch)this, new MG_MGBDL0030_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0030_Del01]の呼び出し */
	protected void callMG_MGBDL0030_Del01() {
		MCCaller caller = createMG_MGBDL0030_Del01();
		caller.exec();
	}
	/** [MG_MGBDL0030_Srch02]のCallerの作成 */
	protected MGBDP_ArgSrch_MC.MG_MGBDL0030_Srch02Caller createMG_MGBDL0030_Srch02() {
		MGBDP_ArgSrch_MC.MG_MGBDL0030_Srch02Caller<MGBDP_ArgSrch, MG_MGBDL0030_Srch02Bridge>
		caller = ((MGBDP_ArgSrch_MC)this).new MG_MGBDL0030_Srch02Caller<MGBDP_ArgSrch, MG_MGBDL0030_Srch02Bridge>(
					(MGBDP_ArgSrch)this, new MG_MGBDL0030_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBDL0030_Srch02]の呼び出し */
	protected void callMG_MGBDL0030_Srch02() {
		MCCaller caller = createMG_MGBDL0030_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0030.CndR aCndR;
	/** [MenuList]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0030.MenuListR> aMenuListL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0030.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0030.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0030.CndR.create();
	}

	/**
	 * コピーによってaMenuListLを設定します。
	 *
	 * aMenuListLのインスタンスは変更されません。
	 *
	 * @param dataset MenuListL
	 */
	public void setMenuListL(MCList<mcframe.clientMGBD.MGBDP0030.MenuListR> aList) {
		if (getMenuListL() != aList) {
			getMenuListL().setAll(aList);
		}
	}

	/**
	 * [MenuList]ブロックのコンテナaMenuListLを返します。
	 *
	 * @return MenuListL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0030.MenuListR> getMenuListL() {
		return aMenuListL;
	}

	/**
	 * aMenuListRを作成します。
	 *
	 * @return MenuListR
	 */
	public mcframe.clientMGBD.MGBDP0030.MenuListR createMenuListR() {
		return mcframe.clientMGBD.MGBDP0030.MenuListR.create();
	}

	/**
	 * aMenuListLを作成します。
	 *
	 * @return MenuListL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0030.MenuListR> createMenuListL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0030.MenuListR.class);
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMGBD.MGBDP0030.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0030.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMGBD.MGBDP0030.DtlR createDtlR() {
		return mcframe.clientMGBD.MGBDP0030.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0030.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0030.DtlR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getMenuListL())) ret.add(getMenuListL());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getMenuListL()) return "MenuList";
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("MenuList")) return getMenuListL();
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(TgtPanel);
		ret.add(CndPanel);
		ret.add(MenuPanel);
		ret.add(MenuCdPanel);
		ret.add(MenuBtnPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ArgSrch_MC_A() {
		aCndR = createCndR();
		aMenuListL = createMenuListL();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_ArgSrch_MC_A(String name) {
		aCndR = createCndR();
		aMenuListL = createMenuListL();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_ArgSrch_MC.jbCreateScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbCreateTgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbCreateCnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbCreateMenu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbCreateMenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbCreateMenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbCreateDtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbCreateBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbCreateEastBtn((MGBDP_ArgSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_ArgSrch p) {
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MGBDP_ArgSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_ArgSrch p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_term_end_ym = p.Cnd_term_p_PPanel.Term_term_end_ym;
		p.Cnd_term_end_ym.addAliasName("Cnd.term_end_ym", p);
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_invisible_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_invisible_rmrks.addAliasName("Cnd.invisible_rmrks", p);
	}

	/**
	 * [Menu]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMenu(MGBDP_ArgSrch p) {
	}

	/**
	 * [MenuCd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMenuCd(MGBDP_ArgSrch p) {
	}

	/**
	 * [MenuBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMenuBtn(MGBDP_ArgSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MGBDP_ArgSrch p) {
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBD.MGBDP0030.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
		p.columnDtl_rtn_sts_typ_nm = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ_nm;
		p.columnDtl_rtn_sts_typ_nm.addAliasName("Dtl.rtn_sts_typ_nm", p);
		p.columnDtl_msg_id = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_msg_id;
		p.columnDtl_msg_id.addAliasName("Dtl.msg_id", p);
		p.columnDtl_msg = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_msg;
		p.columnDtl_msg.addAliasName("Dtl.msg", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_ArgSrch p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_ArgSrch p) {
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
	
	
	/** [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (Cnd_calc_no_p_PPanel_CalcNo_calc_no_p == null) {
			Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks");
		}
		return Cnd_calc_no_p_PPanel_CalcNo_calc_no_p;
	}
	
	
	/** [Cnd_calc_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_usr_cd_p = null;

	/**
	 * [Cnd_calc_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_usr_cd_ListPutter() {
		if (Cnd_calc_usr_cd_p == null) {
			Cnd_calc_usr_cd_p = createCnd_calc_usr_cd_ListPutter(Cnd_calc_usr_cd, "calc_usr_cd", "calc_usr_nm");

		}
		return Cnd_calc_usr_cd_p;
	}
	
	
	/** [Cnd_st_ym_ListPutter]の定義 */
	private MCListPutter Cnd_st_ym_p = null;

	/**
	 * [Cnd_st_ym_ListPutter]の取得
	 */
	protected MCListPutter getCnd_st_ym_ListPutter() {
		if (Cnd_st_ym_p == null) {
			Cnd_st_ym_p = createCnd_st_ym_ListPutter(Cnd_st_ym, "st_ym");

		}
		return Cnd_st_ym_p;
	}
	
	
	/** [Cnd_end_ym_ListPutter]の定義 */
	private MCListPutter Cnd_end_ym_p = null;

	/**
	 * [Cnd_end_ym_ListPutter]の取得
	 */
	protected MCListPutter getCnd_end_ym_ListPutter() {
		if (Cnd_end_ym_p == null) {
			Cnd_end_ym_p = createCnd_end_ym_ListPutter(Cnd_end_ym, "end_ym");

		}
		return Cnd_end_ym_p;
	}
	
	
	/** [Cnd_menu_cd_ListPutter]の定義 */
	private MCListPutter Cnd_menu_cd_p = null;

	/**
	 * [Cnd_menu_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_menu_cd_ListPutter() {
		if (Cnd_menu_cd_p == null) {
			Cnd_menu_cd_p = createCnd_menu_cd_ListPutter(Cnd_menu_cd, "menu_cd", "menu_nm");

		}
		return Cnd_menu_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ArgSrch create(){
		MGBDP_ArgSrch p = new MGBDP_ArgSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ArgSrch create(String name){
		MGBDP_ArgSrch p = new MGBDP_ArgSrch(name);
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
		MGBDP_ArgSrch_MC.jbfInitScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbfInitTgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbfInitCnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbfInitMenu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbfInitMenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbfInitMenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbfInitDtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbfInitBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbfInitEastBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitTgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitCnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitMenu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitMenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitMenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitDtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.jbInitEastBtn((MGBDP_ArgSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		p.TgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_DEL_ADMIN = p.beansFactory.createRadioButton("Cnd.ope_DEL_ADMIN");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_calc_usr_cd_Label = p.beansFactory.createLabel("Cnd.calc_usr_cd_Label");
		p.Cnd_calc_usr_cd = p.beansFactory.createTextField("Cnd.calc_usr_cd");
		p.Cnd_calc_usr_cd.setLabel(p.Cnd_calc_usr_cd_Label);
		p.Cnd_calc_usr_nm = p.beansFactory.createTextField("Cnd.calc_usr_nm");
		p.Cnd_st_ym_Label = p.beansFactory.createLabel("Cnd.st_ym_Label");
		p.Cnd_st_ym = p.beansFactory.createDateComboBox("Cnd.st_ym");
		p.Cnd_st_ym.setLabel(p.Cnd_st_ym_Label);
		p.Cnd_end_ym_Label = p.beansFactory.createLabel("Cnd.end_ym_Label");
		p.Cnd_end_ym = p.beansFactory.createDateComboBox("Cnd.end_ym");
		p.Cnd_end_ym.setLabel(p.Cnd_end_ym_Label);
		p.Cnd_rmrks_Label = p.beansFactory.createLabel("Cnd.rmrks_Label");
		p.Cnd_rmrks = p.beansFactory.createTextField("Cnd.rmrks");
		p.Cnd_rmrks.setLabel(p.Cnd_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_fix_true_flg = p.beansFactory.createCheckBox("Cnd.fix_true_flg");
		p.Cnd_fix_false_flg = p.beansFactory.createCheckBox("Cnd.fix_false_flg");
		p.Cnd_non_del_true_flg = p.beansFactory.createCheckBox("Cnd.non_del_true_flg");
		p.Cnd_non_del_false_flg = p.beansFactory.createCheckBox("Cnd.non_del_false_flg");
		p.Cnd_calc_err_true_flg = p.beansFactory.createCheckBox("Cnd.calc_err_true_flg");
		p.Cnd_calc_err_false_flg = p.beansFactory.createCheckBox("Cnd.calc_err_false_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
		p.Cnd_menu_cd_Label = p.beansFactory.createLabel("Cnd.menu_cd_Label");
		p.Cnd_menu_cd = p.beansFactory.createTextComboBox("Cnd.menu_cd");
		p.Cnd_menu_cd.setLabel(p.Cnd_menu_cd_Label);
		p.Cnd_menu_nm = p.beansFactory.createTextField("Cnd.menu_nm");
	}

	/**
	 * [Menu]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMenu(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.MenuPanel = p.beansFactory.createPanel("Menu");
		p.MenuTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [MenuCd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMenuCd(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.MenuCdPanel = p.beansFactory.createPanel("MenuCd");
		// ブロックの項目の初期化
	}

	/**
	 * [MenuBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMenuBtn(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.MenuBtnPanel = p.beansFactory.createPanel("MenuBtn");
		// ブロックの項目の初期化
		p.MenuBtn_open_01 = p.beansFactory.createButton("MenuBtn.open_01", "open");
		p.MenuBtn_open_02 = p.beansFactory.createButton("MenuBtn.open_02", "open");
		p.MenuBtn_open_03 = p.beansFactory.createButton("MenuBtn.open_03", "open");
		p.MenuBtn_open_04 = p.beansFactory.createButton("MenuBtn.open_04", "open");
		p.MenuBtn_open_05 = p.beansFactory.createButton("MenuBtn.open_05", "open");
		p.MenuBtn_open_06 = p.beansFactory.createButton("MenuBtn.open_06", "open");
		p.MenuBtn_open_07 = p.beansFactory.createButton("MenuBtn.open_07", "open");
		p.MenuBtn_open_08 = p.beansFactory.createButton("MenuBtn.open_08", "open");
		p.MenuBtn_open_09 = p.beansFactory.createButton("MenuBtn.open_09", "open");
		p.MenuBtn_open_10 = p.beansFactory.createButton("MenuBtn.open_10", "open");
		p.MenuBtn_open_11 = p.beansFactory.createButton("MenuBtn.open_11", "open");
		p.MenuBtn_open_12 = p.beansFactory.createButton("MenuBtn.open_12", "open");
		p.MenuBtn_open_13 = p.beansFactory.createButton("MenuBtn.open_13", "open");
		p.MenuBtn_open_14 = p.beansFactory.createButton("MenuBtn.open_14", "open");
		p.MenuBtn_open_15 = p.beansFactory.createButton("MenuBtn.open_15", "open");
		p.MenuBtn_open_16 = p.beansFactory.createButton("MenuBtn.open_16", "open");
		p.MenuBtn_open_17 = p.beansFactory.createButton("MenuBtn.open_17", "open");
		p.MenuBtn_open_18 = p.beansFactory.createButton("MenuBtn.open_18", "open");
		p.MenuBtn_open_19 = p.beansFactory.createButton("MenuBtn.open_19", "open");
		p.MenuBtn_open_20 = p.beansFactory.createButton("MenuBtn.open_20", "open");
		p.MenuBtn_open_21 = p.beansFactory.createButton("MenuBtn.open_21", "open");
		p.MenuBtn_open_22 = p.beansFactory.createButton("MenuBtn.open_22", "open");
		p.MenuBtn_open_23 = p.beansFactory.createButton("MenuBtn.open_23", "open");
		p.MenuBtn_open_24 = p.beansFactory.createButton("MenuBtn.open_24", "open");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_calc_no = p.beansFactory.createTableColumn("Dtl.calc_no", MCColumnType.TEXT);
		p.columnDtl_calc_err_flg = p.beansFactory.createTableColumn("Dtl.calc_err_flg", MCColumnType.CHECK);
		p.columnDtl_fix_flg = p.beansFactory.createTableColumn("Dtl.fix_flg", MCColumnType.CHECK);
		p.columnDtl_non_del_flg = p.beansFactory.createTableColumn("Dtl.non_del_flg", MCColumnType.CHECK);
		p.columnDtl_st_ym = p.beansFactory.createTableColumn("Dtl.st_ym", MCColumnType.DATE);
		p.columnDtl_end_ym = p.beansFactory.createTableColumn("Dtl.end_ym", MCColumnType.DATE);
		p.columnDtl_alc_err_flg = p.beansFactory.createTableColumn("Dtl.alc_err_flg", MCColumnType.CHECK);
		p.columnDtl_trd_amt_flg = p.beansFactory.createTableColumn("Dtl.trd_amt_flg", MCColumnType.CHECK);
		p.columnDtl_adj_amt_flg = p.beansFactory.createTableColumn("Dtl.adj_amt_flg", MCColumnType.CHECK);
		p.columnDtl_minus_stk_flg = p.beansFactory.createTableColumn("Dtl.minus_stk_flg", MCColumnType.CHECK);
		p.columnDtl_other_chk_flg = p.beansFactory.createTableColumn("Dtl.other_chk_flg", MCColumnType.CHECK);
		p.columnDtl_itm_limit_flg = p.beansFactory.createTableColumn("Dtl.itm_limit_flg", MCColumnType.CHECK);
		p.columnDtl_data_check_flg = p.beansFactory.createTableColumn("Dtl.data_check_flg", MCColumnType.CHECK);
		p.columnDtl_rate_fix_flg = p.beansFactory.createTableColumn("Dtl.rate_fix_flg", MCColumnType.CHECK);
		p.columnDtl_xrate_cd = p.beansFactory.createTableColumn("Dtl.xrate_cd", MCColumnType.TEXT);
		p.columnDtl_xrate_nm = p.beansFactory.createTableColumn("Dtl.xrate_nm", MCColumnType.TEXT);
		p.columnDtl_calc_usr_cd = p.beansFactory.createTableColumn("Dtl.calc_usr_cd", MCColumnType.TEXT);
		p.columnDtl_calc_usr_nm = p.beansFactory.createTableColumn("Dtl.calc_usr_nm", MCColumnType.TEXT);
		p.columnDtl_calc_st = p.beansFactory.createTableColumn("Dtl.calc_st", MCColumnType.DATE);
		p.columnDtl_calc_fin = p.beansFactory.createTableColumn("Dtl.calc_fin", MCColumnType.DATE);
		p.columnDtl_calc_time = p.beansFactory.createTableColumn("Dtl.calc_time", MCColumnType.TEXT);
		p.columnDtl_ins_srv_req_no = p.beansFactory.createTableColumn("Dtl.ins_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_batch_log_no = p.beansFactory.createTableColumn("Dtl.batch_log_no", MCColumnType.TEXT);
		p.columnDtl_rmrks = p.beansFactory.createTableColumn("Dtl.rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_calc_grp_cd = p.beansFactory.createTableColumn("Dtl.calc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0050 = p.beansFactory.createButton("Btn.open_MGBDP0050", "open");
		p.Btn_open_FSBGP0160 = p.beansFactory.createButton("Btn.open_FSBGP0160", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
		p.Btn_del_admin = p.beansFactory.createButton("Btn.del_admin", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TgtPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.TgtPanel.setBorder(p.TgtTitledBorder);
		p.add(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.CndPanel);
		p.TgtPanel.setValueCheck(false);
		p.TgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TgtPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.MenuPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("REF");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("UPD");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("DEL");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_DEL_ADMIN);
		p.Cnd_ope_DEL_ADMIN.setActionCommand("DEL_ADMIN");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_ADMIN);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_ADMIN);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.ope_META);
		p.TgtPanel.add(p.Cnd_term_p_PPanel);
		p.TgtPanel.setLastBeans(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.TgtPanel.add(p.Cnd_calc_grp_cd_Label);
		p.TgtPanel.add(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.calc_grp_cd_META);
		p.TgtPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_calc_usr_cd);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_no_p_PPanel.CalcNo_calc_no, true);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks);
		p.CndPanel.add(p.Cnd_calc_usr_cd_Label);
		p.CndPanel.add(p.Cnd_calc_usr_cd);
		p.Cnd_calc_usr_cd.setNextBeans(p.Cnd_calc_usr_nm);
		p.Cnd_calc_usr_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.calc_usr_cd_META);
		p.Cnd_calc_usr_cd.addLinkBeans(p.Cnd_calc_usr_nm);
		p.Cnd_calc_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_usr_cd, true);
		p.CndPanel.add(p.Cnd_calc_usr_nm);
		p.Cnd_calc_usr_nm.setNextBeans(p.Cnd_st_ym);
		p.Cnd_calc_usr_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.calc_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_usr_nm, true);
		p.Cnd_st_ym.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_st_ym_Label);
		p.CndPanel.add(p.Cnd_st_ym);
		p.Cnd_st_ym.setNextBeans(p.Cnd_end_ym);
		p.Cnd_st_ym.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.st_ym_META);
		p.Cnd_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_end_ym.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_end_ym_Label);
		p.CndPanel.add(p.Cnd_end_ym);
		p.Cnd_end_ym.setNextBeans(p.Cnd_rmrks);
		p.Cnd_end_ym.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.end_ym_META);
		p.Cnd_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_fix_true_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_fix_true_flg);
		p.Cnd_fix_true_flg.setNextBeans(p.Cnd_fix_false_flg);
		p.Cnd_fix_true_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.fix_true_flg_META);
		p.CndPanel.add(p.Cnd_fix_false_flg);
		p.Cnd_fix_false_flg.setNextBeans(p.Cnd_non_del_true_flg);
		p.Cnd_fix_false_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.fix_false_flg_META);
		p.CndPanel.add(p.Cnd_non_del_true_flg);
		p.Cnd_non_del_true_flg.setNextBeans(p.Cnd_non_del_false_flg);
		p.Cnd_non_del_true_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.non_del_true_flg_META);
		p.CndPanel.add(p.Cnd_non_del_false_flg);
		p.Cnd_non_del_false_flg.setNextBeans(p.Cnd_calc_err_true_flg);
		p.Cnd_non_del_false_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.non_del_false_flg_META);
		p.CndPanel.add(p.Cnd_calc_err_true_flg);
		p.Cnd_calc_err_true_flg.setNextBeans(p.Cnd_calc_err_false_flg);
		p.Cnd_calc_err_true_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.calc_err_true_flg_META);
		p.CndPanel.add(p.Cnd_calc_err_false_flg);
		p.Cnd_calc_err_false_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_calc_err_false_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.calc_err_false_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
		p.Cnd_menu_cd.setListType(MCListType.STRICT);
		p.Cnd_menu_cd.setLinkBeans(p.Cnd_menu_nm);
		p.MenuCdPanel.add(p.Cnd_menu_cd_Label);
		p.MenuCdPanel.add(p.Cnd_menu_cd);
		p.MenuCdPanel.setLastBeans(p.Cnd_menu_cd);
		p.Cnd_menu_cd.setNextBeans(p.Cnd_menu_nm);
		p.Cnd_menu_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.menu_cd_META);
		p.MenuCdPanel.add(p.Cnd_menu_nm);
		p.Cnd_menu_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0030.CndR.menu_nm_META);
	}

	/**
	 * [Menu]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMenu(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.MenuPanel.setBorder(p.MenuTitledBorder);
		p.add(p.MenuPanel);
		p.MenuPanel.setNextBeans(p.DtlPanel);
		p.MenuPanel.setValueCheck(false);
		p.MenuPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.MenuPanel.setLayoutPosition("NC+");
		// ブロックの項目の初期化
		p.MenuPanel.add(p.MenuCdPanel, null);
		p.MenuPanel.setLastBeans(p.MenuCdPanel);
		p.MenuCdPanel.setNextBeans(p.MenuBtnPanel);
		p.MenuPanel.add(p.MenuBtnPanel, null);
	}

	/**
	 * [MenuCd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMenuCd(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.MenuCdPanel.setValueCheck(false);
		p.MenuCdPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.MenuCdPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [MenuBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMenuBtn(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.MenuBtnPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.MenuBtnPanel.add(p.MenuBtn_open_01);
		p.MenuBtnPanel.setLastBeans(p.MenuBtn_open_01);
		p.MenuBtn_open_01.setNextBeans(p.MenuBtn_open_02);
		p.MenuBtnPanel.add(p.MenuBtn_open_02);
		p.MenuBtn_open_02.setNextBeans(p.MenuBtn_open_03);
		p.MenuBtnPanel.add(p.MenuBtn_open_03);
		p.MenuBtn_open_03.setNextBeans(p.MenuBtn_open_04);
		p.MenuBtnPanel.add(p.MenuBtn_open_04);
		p.MenuBtn_open_04.setNextBeans(p.MenuBtn_open_05);
		p.MenuBtnPanel.add(p.MenuBtn_open_05);
		p.MenuBtn_open_05.setNextBeans(p.MenuBtn_open_06);
		p.MenuBtnPanel.add(p.MenuBtn_open_06);
		p.MenuBtn_open_06.setNextBeans(p.MenuBtn_open_07);
		p.MenuBtnPanel.add(p.MenuBtn_open_07);
		p.MenuBtn_open_07.setNextBeans(p.MenuBtn_open_08);
		p.MenuBtnPanel.add(p.MenuBtn_open_08);
		p.MenuBtn_open_08.setNextBeans(p.MenuBtn_open_09);
		p.MenuBtnPanel.add(p.MenuBtn_open_09);
		p.MenuBtn_open_09.setNextBeans(p.MenuBtn_open_10);
		p.MenuBtnPanel.add(p.MenuBtn_open_10);
		p.MenuBtn_open_10.setNextBeans(p.MenuBtn_open_11);
		p.MenuBtnPanel.add(p.MenuBtn_open_11);
		p.MenuBtn_open_11.setNextBeans(p.MenuBtn_open_12);
		p.MenuBtnPanel.add(p.MenuBtn_open_12);
		p.MenuBtn_open_12.setNextBeans(p.MenuBtn_open_13);
		p.MenuBtnPanel.add(p.MenuBtn_open_13);
		p.MenuBtn_open_13.setNextBeans(p.MenuBtn_open_14);
		p.MenuBtnPanel.add(p.MenuBtn_open_14);
		p.MenuBtn_open_14.setNextBeans(p.MenuBtn_open_15);
		p.MenuBtnPanel.add(p.MenuBtn_open_15);
		p.MenuBtn_open_15.setNextBeans(p.MenuBtn_open_16);
		p.MenuBtnPanel.add(p.MenuBtn_open_16);
		p.MenuBtn_open_16.setNextBeans(p.MenuBtn_open_17);
		p.MenuBtnPanel.add(p.MenuBtn_open_17);
		p.MenuBtn_open_17.setNextBeans(p.MenuBtn_open_18);
		p.MenuBtnPanel.add(p.MenuBtn_open_18);
		p.MenuBtn_open_18.setNextBeans(p.MenuBtn_open_19);
		p.MenuBtnPanel.add(p.MenuBtn_open_19);
		p.MenuBtn_open_19.setNextBeans(p.MenuBtn_open_20);
		p.MenuBtnPanel.add(p.MenuBtn_open_20);
		p.MenuBtn_open_20.setNextBeans(p.MenuBtn_open_21);
		p.MenuBtnPanel.add(p.MenuBtn_open_21);
		p.MenuBtn_open_21.setNextBeans(p.MenuBtn_open_22);
		p.MenuBtnPanel.add(p.MenuBtn_open_22);
		p.MenuBtn_open_22.setNextBeans(p.MenuBtn_open_23);
		p.MenuBtnPanel.add(p.MenuBtn_open_23);
		p.MenuBtn_open_23.setNextBeans(p.MenuBtn_open_24);
		p.MenuBtnPanel.add(p.MenuBtn_open_24);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_ArgSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0050.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBDP0050);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBDP0050);
		p.Btn_open_MGBDP0050.setNextBeans(p.Btn_open_FSBGP0160);
		p.Btn_open_FSBGP0160.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_FSBGP0160);
		p.Btn_open_FSBGP0160.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.Btn_del.setNextBeans(p.Btn_del_admin);
		p.Btn_del_admin.setIcon("DELETE");
		p.Btn_del_admin.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_admin);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBDP_ArgSrch p) {
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
		MGBDP_ArgSrch_MC.mcInitScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.mcInitTgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.mcInitCnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.mcInitMenu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.mcInitMenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.mcInitMenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.mcInitDtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.mcInitBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.mcInitEastBtn((MGBDP_ArgSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_ArgSrch_MC.statusInitSRCH_ScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_Tgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_Cnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_Menu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_MenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_MenuList((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_MenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_Dtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_Btn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitSRCH_EastBtn((MGBDP_ArgSrch)this);

		// [REF]ステータスのモードの設定
		MGBDP_ArgSrch_MC.statusInitREF_ScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_Tgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_Cnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_Menu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_MenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_MenuList((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_MenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_Dtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_Btn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitREF_EastBtn((MGBDP_ArgSrch)this);

		// [UPD]ステータスのモードの設定
		MGBDP_ArgSrch_MC.statusInitUPD_ScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_Tgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_Cnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_Menu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_MenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_MenuList((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_MenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_Dtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_Btn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitUPD_EastBtn((MGBDP_ArgSrch)this);

		// [DEL]ステータスのモードの設定
		MGBDP_ArgSrch_MC.statusInitDEL_ScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_Tgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_Cnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_Menu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_MenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_MenuList((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_MenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_Dtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_Btn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitDEL_EastBtn((MGBDP_ArgSrch)this);

		// [FIX_D]ステータスのモードの設定
		MGBDP_ArgSrch_MC.statusInitFIX__D_ScreenOpe((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_Tgt((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_Cnd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_Menu((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_MenuCd((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_MenuList((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_MenuBtn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_Dtl((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_Btn((MGBDP_ArgSrch)this);
		MGBDP_ArgSrch_MC.statusInitFIX__D_EastBtn((MGBDP_ArgSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_ArgSrch p) {
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MGBDP_ArgSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_ArgSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_DEL_ADMIN.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_calc_usr_cd.setListListener(p);
		p.Cnd_calc_usr_cd.addAllListener(p);
		p.Cnd_calc_usr_nm.setListListener(p);
		p.Cnd_calc_usr_nm.addAllListener(p);
		p.Cnd_st_ym.setListListener(p);
		p.Cnd_st_ym.addAllListener(p);
		p.Cnd_end_ym.setListListener(p);
		p.Cnd_end_ym.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_fix_true_flg.addAllListener(p);
		p.Cnd_fix_false_flg.addAllListener(p);
		p.Cnd_non_del_true_flg.addAllListener(p);
		p.Cnd_non_del_false_flg.addAllListener(p);
		p.Cnd_calc_err_true_flg.addAllListener(p);
		p.Cnd_calc_err_false_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
		p.Cnd_menu_cd.setListListener(p);
		p.Cnd_menu_cd.addAllListener(p);
		p.Cnd_menu_nm.setListListener(p);
		p.Cnd_menu_nm.addAllListener(p);
	}

	/**
	 *  [Menu]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMenu(MGBDP_ArgSrch p) {
	}

	/**
	 *  [MenuCd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMenuCd(MGBDP_ArgSrch p) {
	}

	/**
	 *  [MenuBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMenuBtn(MGBDP_ArgSrch p) {
		p.MenuBtn_open_01.addAllListener(p);
		p.MenuBtn_open_01.setAPMethodName("doMenuBtn_open_01");
		p.MenuBtn_open_02.addAllListener(p);
		p.MenuBtn_open_02.setAPMethodName("doMenuBtn_open_02");
		p.MenuBtn_open_03.addAllListener(p);
		p.MenuBtn_open_03.setAPMethodName("doMenuBtn_open_03");
		p.MenuBtn_open_04.addAllListener(p);
		p.MenuBtn_open_04.setAPMethodName("doMenuBtn_open_04");
		p.MenuBtn_open_05.addAllListener(p);
		p.MenuBtn_open_05.setAPMethodName("doMenuBtn_open_05");
		p.MenuBtn_open_06.addAllListener(p);
		p.MenuBtn_open_06.setAPMethodName("doMenuBtn_open_06");
		p.MenuBtn_open_07.addAllListener(p);
		p.MenuBtn_open_07.setAPMethodName("doMenuBtn_open_07");
		p.MenuBtn_open_08.addAllListener(p);
		p.MenuBtn_open_08.setAPMethodName("doMenuBtn_open_08");
		p.MenuBtn_open_09.addAllListener(p);
		p.MenuBtn_open_09.setAPMethodName("doMenuBtn_open_09");
		p.MenuBtn_open_10.addAllListener(p);
		p.MenuBtn_open_10.setAPMethodName("doMenuBtn_open_10");
		p.MenuBtn_open_11.addAllListener(p);
		p.MenuBtn_open_11.setAPMethodName("doMenuBtn_open_11");
		p.MenuBtn_open_12.addAllListener(p);
		p.MenuBtn_open_12.setAPMethodName("doMenuBtn_open_12");
		p.MenuBtn_open_13.addAllListener(p);
		p.MenuBtn_open_13.setAPMethodName("doMenuBtn_open_13");
		p.MenuBtn_open_14.addAllListener(p);
		p.MenuBtn_open_14.setAPMethodName("doMenuBtn_open_14");
		p.MenuBtn_open_15.addAllListener(p);
		p.MenuBtn_open_15.setAPMethodName("doMenuBtn_open_15");
		p.MenuBtn_open_16.addAllListener(p);
		p.MenuBtn_open_16.setAPMethodName("doMenuBtn_open_16");
		p.MenuBtn_open_17.addAllListener(p);
		p.MenuBtn_open_17.setAPMethodName("doMenuBtn_open_17");
		p.MenuBtn_open_18.addAllListener(p);
		p.MenuBtn_open_18.setAPMethodName("doMenuBtn_open_18");
		p.MenuBtn_open_19.addAllListener(p);
		p.MenuBtn_open_19.setAPMethodName("doMenuBtn_open_19");
		p.MenuBtn_open_20.addAllListener(p);
		p.MenuBtn_open_20.setAPMethodName("doMenuBtn_open_20");
		p.MenuBtn_open_21.addAllListener(p);
		p.MenuBtn_open_21.setAPMethodName("doMenuBtn_open_21");
		p.MenuBtn_open_22.addAllListener(p);
		p.MenuBtn_open_22.setAPMethodName("doMenuBtn_open_22");
		p.MenuBtn_open_23.addAllListener(p);
		p.MenuBtn_open_23.setAPMethodName("doMenuBtn_open_23");
		p.MenuBtn_open_24.addAllListener(p);
		p.MenuBtn_open_24.setAPMethodName("doMenuBtn_open_24");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MGBDP_ArgSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_calc_no.addAllListener(p);
		p.columnDtl_calc_no.setListListener(p);
		p.columnDtl_calc_err_flg.addAllListener(p);
		p.columnDtl_fix_flg.addAllListener(p);
		p.columnDtl_non_del_flg.addAllListener(p);
		p.columnDtl_st_ym.addAllListener(p);
		p.columnDtl_st_ym.setListListener(p);
		p.columnDtl_end_ym.addAllListener(p);
		p.columnDtl_end_ym.setListListener(p);
		p.columnDtl_alc_err_flg.addAllListener(p);
		p.columnDtl_trd_amt_flg.addAllListener(p);
		p.columnDtl_adj_amt_flg.addAllListener(p);
		p.columnDtl_minus_stk_flg.addAllListener(p);
		p.columnDtl_other_chk_flg.addAllListener(p);
		p.columnDtl_itm_limit_flg.addAllListener(p);
		p.columnDtl_data_check_flg.addAllListener(p);
		p.columnDtl_rate_fix_flg.addAllListener(p);
		p.columnDtl_xrate_cd.addAllListener(p);
		p.columnDtl_xrate_cd.setListListener(p);
		p.columnDtl_xrate_nm.addAllListener(p);
		p.columnDtl_xrate_nm.setListListener(p);
		p.columnDtl_calc_usr_cd.addAllListener(p);
		p.columnDtl_calc_usr_cd.setListListener(p);
		p.columnDtl_calc_usr_nm.addAllListener(p);
		p.columnDtl_calc_usr_nm.setListListener(p);
		p.columnDtl_calc_st.addAllListener(p);
		p.columnDtl_calc_st.setListListener(p);
		p.columnDtl_calc_fin.addAllListener(p);
		p.columnDtl_calc_fin.setListListener(p);
		p.columnDtl_calc_time.addAllListener(p);
		p.columnDtl_calc_time.setListListener(p);
		p.columnDtl_ins_srv_req_no.addAllListener(p);
		p.columnDtl_ins_srv_req_no.setListListener(p);
		p.columnDtl_batch_log_no.addAllListener(p);
		p.columnDtl_batch_log_no.setListListener(p);
		p.columnDtl_rmrks.addAllListener(p);
		p.columnDtl_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_calc_grp_cd.addAllListener(p);
		p.columnDtl_calc_grp_cd.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_ArgSrch p) {
		p.Btn_open_MGBDP0050.addAllListener(p);
		p.Btn_open_MGBDP0050.setAPMethodName("doBtn_open_MGBDP0050");
		p.Btn_open_FSBGP0160.addAllListener(p);
		p.Btn_open_FSBGP0160.setAPMethodName("doBtn_open_FSBGP0160");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
		p.Btn_del_admin.addAllListener(p);
		p.Btn_del_admin.setAPMethodName("doBtn_del_admin");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_ArgSrch p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBDP_ArgSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tgt(MGBDP_ArgSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_ArgSrch p){
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.ENABLE);
		p.Cnd_calc_no_p_PPanel.CalcNo_rmrks.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_calc_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_st_ym.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_end_ym.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_menu_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_menu_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Menu(MGBDP_ArgSrch p){

	}

	/**
	 * [SRCH]ステータスの[MenuCd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_MenuCd(MGBDP_ArgSrch p){

	}

	/**
	 * [SRCH]ステータスの[MenuList]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_MenuList(MGBDP_ArgSrch p){

	}

	/**
	 * [SRCH]ステータスの[MenuBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_MenuBtn(MGBDP_ArgSrch p){
		p.MenuBtn_open_01.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_02.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_03.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_04.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_05.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_06.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_07.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_08.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_09.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_10.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_11.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_12.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_13.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_14.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_15.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_16.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_17.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_18.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_19.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_20.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_21.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_22.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_23.putMode(p, SRCH, MCMode.ENABLE);
		p.MenuBtn_open_24.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MGBDP_ArgSrch p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_st_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alc_err_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_amt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_adj_amt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_other_chk_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_limit_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_data_check_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rate_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xrate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBDP_ArgSrch p){
		p.Btn_open_MGBDP0050.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_FSBGP0160.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_admin.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MGBDP_ArgSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_ArgSrch p){

	}

	/**
	 * [REF]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tgt(MGBDP_ArgSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_ArgSrch p){
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.ENABLE);
		p.Cnd_calc_no_p_PPanel.CalcNo_rmrks.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_calc_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_st_ym.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_end_ym.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_menu_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_menu_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitREF_Menu(MGBDP_ArgSrch p){

	}

	/**
	 * [REF]ステータスの[MenuCd]ブロックのモードの設定
	 */
	protected static void statusInitREF_MenuCd(MGBDP_ArgSrch p){

	}

	/**
	 * [REF]ステータスの[MenuList]ブロックのモードの設定
	 */
	protected static void statusInitREF_MenuList(MGBDP_ArgSrch p){

	}

	/**
	 * [REF]ステータスの[MenuBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_MenuBtn(MGBDP_ArgSrch p){
		p.MenuBtn_open_01.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_02.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_03.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_04.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_05.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_06.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_07.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_08.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_09.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_10.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_11.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_12.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_13.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_14.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_15.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_16.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_17.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_18.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_19.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_20.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_21.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_22.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_23.putMode(p, REF, MCMode.ENABLE);
		p.MenuBtn_open_24.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MGBDP_ArgSrch p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_st_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_err_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_amt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_adj_amt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_other_chk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_limit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_data_check_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rate_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBDP_ArgSrch p){
		p.Btn_open_MGBDP0050.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_FSBGP0160.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_admin.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBDP_ArgSrch p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBDP_ArgSrch p){

	}

	/**
	 * [UPD]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tgt(MGBDP_ArgSrch p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBDP_ArgSrch p){
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(UPD, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.ENABLE);
		p.Cnd_calc_no_p_PPanel.CalcNo_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_calc_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_st_ym.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_end_ym.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_menu_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_menu_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Menu(MGBDP_ArgSrch p){

	}

	/**
	 * [UPD]ステータスの[MenuCd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MenuCd(MGBDP_ArgSrch p){

	}

	/**
	 * [UPD]ステータスの[MenuList]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MenuList(MGBDP_ArgSrch p){

	}

	/**
	 * [UPD]ステータスの[MenuBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MenuBtn(MGBDP_ArgSrch p){
		p.MenuBtn_open_01.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_02.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_03.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_04.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_05.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_06.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_07.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_08.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_09.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_10.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_11.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_12.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_13.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_14.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_15.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_16.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_17.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_18.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_19.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_20.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_21.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_22.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_23.putMode(p, UPD, MCMode.ENABLE);
		p.MenuBtn_open_24.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MGBDP_ArgSrch p){
		p.columnDtl_check.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_calc_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_st_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_err_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_amt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_adj_amt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_other_chk_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_limit_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_data_check_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rate_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xrate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_calc_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBDP_ArgSrch p){
		p.Btn_open_MGBDP0050.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_FSBGP0160.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_admin.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBDP_ArgSrch p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBDP_ArgSrch p){

	}

	/**
	 * [DEL]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tgt(MGBDP_ArgSrch p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBDP_ArgSrch p){
		p.Cnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(DEL, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.ENABLE);
		p.Cnd_calc_no_p_PPanel.CalcNo_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_calc_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_st_ym.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_end_ym.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_menu_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_menu_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Menu(MGBDP_ArgSrch p){

	}

	/**
	 * [DEL]ステータスの[MenuCd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_MenuCd(MGBDP_ArgSrch p){

	}

	/**
	 * [DEL]ステータスの[MenuList]ブロックのモードの設定
	 */
	protected static void statusInitDEL_MenuList(MGBDP_ArgSrch p){

	}

	/**
	 * [DEL]ステータスの[MenuBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_MenuBtn(MGBDP_ArgSrch p){
		p.MenuBtn_open_01.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_02.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_03.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_04.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_05.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_06.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_07.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_08.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_09.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_10.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_11.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_12.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_13.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_14.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_15.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_16.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_17.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_18.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_19.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_20.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_21.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_22.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_23.putMode(p, DEL, MCMode.ENABLE);
		p.MenuBtn_open_24.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MGBDP_ArgSrch p){
		p.columnDtl_check.putMode(p, DEL, MCMode.ENABLE);
		p.columnDtl_calc_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_st_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_err_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_amt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_adj_amt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_other_chk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_limit_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_data_check_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rate_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xrate_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBDP_ArgSrch p){
		p.Btn_open_MGBDP0050.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_FSBGP0160.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_admin.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBDP_ArgSrch p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MGBDP_ArgSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tgt(MGBDP_ArgSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MGBDP_ArgSrch p){
		p.Cnd_term_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(FIX_D, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.ENABLE);
		p.Cnd_calc_no_p_PPanel.CalcNo_rmrks.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_calc_usr_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_calc_usr_nm.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_st_ym.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_end_ym.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_fix_true_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_fix_false_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_non_del_true_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_non_del_false_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_calc_err_true_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_calc_err_false_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_menu_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_menu_nm.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Menu]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Menu(MGBDP_ArgSrch p){

	}

	/**
	 * [FIX_D]ステータスの[MenuCd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_MenuCd(MGBDP_ArgSrch p){

	}

	/**
	 * [FIX_D]ステータスの[MenuList]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_MenuList(MGBDP_ArgSrch p){

	}

	/**
	 * [FIX_D]ステータスの[MenuBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_MenuBtn(MGBDP_ArgSrch p){
		p.MenuBtn_open_01.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_02.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_03.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_04.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_05.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_06.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_07.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_08.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_09.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_10.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_11.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_12.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_13.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_14.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_15.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_16.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_17.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_18.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_19.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_20.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_21.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_22.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_23.putMode(p, FIX_D, MCMode.ENABLE);
		p.MenuBtn_open_24.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MGBDP_ArgSrch p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_err_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_fix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_non_del_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_st_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_end_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_err_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_amt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_adj_amt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_other_chk_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_limit_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_data_check_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rate_fix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xrate_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xrate_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_st.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_fin.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_time.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_calc_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MGBDP_ArgSrch p){
		p.Btn_open_MGBDP0050.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_open_FSBGP0160.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_del_admin.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MGBDP_ArgSrch p){

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
		MGBDP_ArgSrch_MC.setTableConfigDtl((MGBDP_ArgSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MGBDP_ArgSrch p) {
		p.columnDtl_check.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_calc_no.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.calc_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_no);
		p.columnDtl_calc_err_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.calc_err_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_err_flg);
		p.columnDtl_fix_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_flg);
		p.columnDtl_non_del_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.non_del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_non_del_flg);
		p.columnDtl_st_ym.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.st_ym_META);
		p.columnDtl_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_st_ym);
		p.columnDtl_end_ym.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.end_ym_META);
		p.columnDtl_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_end_ym);
		p.columnDtl_alc_err_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.alc_err_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_err_flg);
		p.columnDtl_trd_amt_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.trd_amt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_amt_flg);
		p.columnDtl_adj_amt_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.adj_amt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_adj_amt_flg);
		p.columnDtl_minus_stk_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.minus_stk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_minus_stk_flg);
		p.columnDtl_other_chk_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.other_chk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_other_chk_flg);
		p.columnDtl_itm_limit_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.itm_limit_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_limit_flg);
		p.columnDtl_data_check_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.data_check_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_data_check_flg);
		p.columnDtl_rate_fix_flg.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.rate_fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rate_fix_flg);
		p.columnDtl_xrate_cd.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_cd);
		p.columnDtl_xrate_nm.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.xrate_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_nm);
		p.columnDtl_calc_usr_cd.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.calc_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_usr_cd);
		p.columnDtl_calc_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.calc_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_usr_nm);
		p.columnDtl_calc_st.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.calc_st_META);
		p.columnDtl_calc_st.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_st);
		p.columnDtl_calc_fin.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.calc_fin_META);
		p.columnDtl_calc_fin.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_fin);
		p.columnDtl_calc_time.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.calc_time_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_time);
		p.columnDtl_ins_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.ins_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_srv_req_no);
		p.columnDtl_batch_log_no.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.batch_log_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_batch_log_no);
		p.columnDtl_rmrks.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_calc_grp_cd.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.calc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_grp_cd);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0030.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter());
		Cnd_calc_usr_cd.getListConfig().setPutter(getCnd_calc_usr_cd_ListPutter());
		Cnd_st_ym.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_st_ym.getListConfig().setPutter(getCnd_st_ym_ListPutter());
		Cnd_end_ym.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_end_ym.getListConfig().setPutter(getCnd_end_ym_ListPutter());
		Cnd_menu_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_menu_cd.getListConfig().setPutter(getCnd_menu_cd_ListPutter());
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
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
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
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
		return lp;
	}

	/**
	 * [Cnd_calc_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_st_ym_ListPutter]の作成
	 */
	protected MCListPutter createCnd_st_ym_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_end_ym_ListPutter]の作成
	 */
	protected MCListPutter createCnd_end_ym_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Cnd_menu_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_menu_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcMenu");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Cnd_calc_usr_cd) return getCnd_calc_usr_cd(row, info);
		if(combo == Cnd_st_ym) return getCnd_st_ym(row, info);
		if(combo == Cnd_end_ym) return getCnd_end_ym(row, info);
		if(combo == Cnd_menu_cd) return getCnd_menu_cd(row, info);
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
		else if (ap == MenuBtn_open_01) doMenuBtn_open_01(info);
		else if (ap == MenuBtn_open_02) doMenuBtn_open_02(info);
		else if (ap == MenuBtn_open_03) doMenuBtn_open_03(info);
		else if (ap == MenuBtn_open_04) doMenuBtn_open_04(info);
		else if (ap == MenuBtn_open_05) doMenuBtn_open_05(info);
		else if (ap == MenuBtn_open_06) doMenuBtn_open_06(info);
		else if (ap == MenuBtn_open_07) doMenuBtn_open_07(info);
		else if (ap == MenuBtn_open_08) doMenuBtn_open_08(info);
		else if (ap == MenuBtn_open_09) doMenuBtn_open_09(info);
		else if (ap == MenuBtn_open_10) doMenuBtn_open_10(info);
		else if (ap == MenuBtn_open_11) doMenuBtn_open_11(info);
		else if (ap == MenuBtn_open_12) doMenuBtn_open_12(info);
		else if (ap == MenuBtn_open_13) doMenuBtn_open_13(info);
		else if (ap == MenuBtn_open_14) doMenuBtn_open_14(info);
		else if (ap == MenuBtn_open_15) doMenuBtn_open_15(info);
		else if (ap == MenuBtn_open_16) doMenuBtn_open_16(info);
		else if (ap == MenuBtn_open_17) doMenuBtn_open_17(info);
		else if (ap == MenuBtn_open_18) doMenuBtn_open_18(info);
		else if (ap == MenuBtn_open_19) doMenuBtn_open_19(info);
		else if (ap == MenuBtn_open_20) doMenuBtn_open_20(info);
		else if (ap == MenuBtn_open_21) doMenuBtn_open_21(info);
		else if (ap == MenuBtn_open_22) doMenuBtn_open_22(info);
		else if (ap == MenuBtn_open_23) doMenuBtn_open_23(info);
		else if (ap == MenuBtn_open_24) doMenuBtn_open_24(info);
		else if (ap == Btn_open_MGBDP0050) doBtn_open_MGBDP0050(info);
		else if (ap == Btn_open_FSBGP0160) doBtn_open_FSBGP0160(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
		else if (ap == Btn_del_admin) doBtn_del_admin(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_01(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_02]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_02(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_03]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_03(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_04]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_04(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_05]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_05(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_06]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_06(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_07]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_07(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_08]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_08(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_09]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_09(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_10]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_10(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_11]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_11(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_12]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_12(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_13]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_13(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_14]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_14(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_15]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_15(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_16]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_16(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_17]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_17(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_18]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_18(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_19]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_19(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_20]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_20(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_21]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_21(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_22]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_22(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_23]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_23(MCEventInfo info);

	/**
	 * [MenuBtn]パネルの[open_24]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doMenuBtn_open_24(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_FSBGP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_FSBGP0160(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_admin]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_admin(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_calc_usr_cd) return doCnd_calc_usr_cd_VC(info);
		if (vc == Cnd_calc_usr_nm) return doCnd_calc_usr_nm_VC(info);
		if (vc == Cnd_st_ym) return doCnd_st_ym_VC(info);
		if (vc == Cnd_end_ym) return doCnd_end_ym_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_fix_true_flg) return doCnd_fix_true_flg_VC(info);
		if (vc == Cnd_fix_false_flg) return doCnd_fix_false_flg_VC(info);
		if (vc == Cnd_non_del_true_flg) return doCnd_non_del_true_flg_VC(info);
		if (vc == Cnd_non_del_false_flg) return doCnd_non_del_false_flg_VC(info);
		if (vc == Cnd_calc_err_true_flg) return doCnd_calc_err_true_flg_VC(info);
		if (vc == Cnd_calc_err_false_flg) return doCnd_calc_err_false_flg_VC(info);
		if (vc == Cnd_menu_cd) return doCnd_menu_cd_VC(info);
		if (vc == Cnd_menu_nm) return doCnd_menu_nm_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_calc_no) return doDtl_calc_no_VC(info);
		if (vc == columnDtl_calc_err_flg) return doDtl_calc_err_flg_VC(info);
		if (vc == columnDtl_fix_flg) return doDtl_fix_flg_VC(info);
		if (vc == columnDtl_non_del_flg) return doDtl_non_del_flg_VC(info);
		if (vc == columnDtl_st_ym) return doDtl_st_ym_VC(info);
		if (vc == columnDtl_end_ym) return doDtl_end_ym_VC(info);
		if (vc == columnDtl_alc_err_flg) return doDtl_alc_err_flg_VC(info);
		if (vc == columnDtl_trd_amt_flg) return doDtl_trd_amt_flg_VC(info);
		if (vc == columnDtl_adj_amt_flg) return doDtl_adj_amt_flg_VC(info);
		if (vc == columnDtl_minus_stk_flg) return doDtl_minus_stk_flg_VC(info);
		if (vc == columnDtl_other_chk_flg) return doDtl_other_chk_flg_VC(info);
		if (vc == columnDtl_itm_limit_flg) return doDtl_itm_limit_flg_VC(info);
		if (vc == columnDtl_data_check_flg) return doDtl_data_check_flg_VC(info);
		if (vc == columnDtl_rate_fix_flg) return doDtl_rate_fix_flg_VC(info);
		if (vc == columnDtl_xrate_cd) return doDtl_xrate_cd_VC(info);
		if (vc == columnDtl_xrate_nm) return doDtl_xrate_nm_VC(info);
		if (vc == columnDtl_calc_usr_cd) return doDtl_calc_usr_cd_VC(info);
		if (vc == columnDtl_calc_usr_nm) return doDtl_calc_usr_nm_VC(info);
		if (vc == columnDtl_calc_st) return doDtl_calc_st_VC(info);
		if (vc == columnDtl_calc_fin) return doDtl_calc_fin_VC(info);
		if (vc == columnDtl_calc_time) return doDtl_calc_time_VC(info);
		if (vc == columnDtl_ins_srv_req_no) return doDtl_ins_srv_req_no_VC(info);
		if (vc == columnDtl_batch_log_no) return doDtl_batch_log_no_VC(info);
		if (vc == columnDtl_rmrks) return doDtl_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_calc_grp_cd) return doDtl_calc_grp_cd_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_true_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_true_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_false_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_false_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_del_true_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_del_true_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[non_del_false_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_del_false_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_err_true_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_err_true_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_err_false_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_err_false_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[menu_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_menu_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[menu_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_menu_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_err_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[non_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_non_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_err_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_amt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[adj_amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_adj_amt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[minus_stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_minus_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[other_chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_other_chk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_limit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_limit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[data_check_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_data_check_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rate_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rate_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_st]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_st_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_fin]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_fin_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_batch_log_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_calc_usr_cd) doCnd_calc_usr_cd_NC(info);
		else if (nc == Cnd_calc_usr_nm) doCnd_calc_usr_nm_NC(info);
		else if (nc == Cnd_st_ym) doCnd_st_ym_NC(info);
		else if (nc == Cnd_end_ym) doCnd_end_ym_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_fix_true_flg) doCnd_fix_true_flg_NC(info);
		else if (nc == Cnd_fix_false_flg) doCnd_fix_false_flg_NC(info);
		else if (nc == Cnd_non_del_true_flg) doCnd_non_del_true_flg_NC(info);
		else if (nc == Cnd_non_del_false_flg) doCnd_non_del_false_flg_NC(info);
		else if (nc == Cnd_calc_err_true_flg) doCnd_calc_err_true_flg_NC(info);
		else if (nc == Cnd_calc_err_false_flg) doCnd_calc_err_false_flg_NC(info);
		else if (nc == Cnd_menu_cd) doCnd_menu_cd_NC(info);
		else if (nc == Cnd_menu_nm) doCnd_menu_nm_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_calc_no) doDtl_calc_no_NC(info);
		else if (nc == columnDtl_calc_err_flg) doDtl_calc_err_flg_NC(info);
		else if (nc == columnDtl_fix_flg) doDtl_fix_flg_NC(info);
		else if (nc == columnDtl_non_del_flg) doDtl_non_del_flg_NC(info);
		else if (nc == columnDtl_st_ym) doDtl_st_ym_NC(info);
		else if (nc == columnDtl_end_ym) doDtl_end_ym_NC(info);
		else if (nc == columnDtl_alc_err_flg) doDtl_alc_err_flg_NC(info);
		else if (nc == columnDtl_trd_amt_flg) doDtl_trd_amt_flg_NC(info);
		else if (nc == columnDtl_adj_amt_flg) doDtl_adj_amt_flg_NC(info);
		else if (nc == columnDtl_minus_stk_flg) doDtl_minus_stk_flg_NC(info);
		else if (nc == columnDtl_other_chk_flg) doDtl_other_chk_flg_NC(info);
		else if (nc == columnDtl_itm_limit_flg) doDtl_itm_limit_flg_NC(info);
		else if (nc == columnDtl_data_check_flg) doDtl_data_check_flg_NC(info);
		else if (nc == columnDtl_rate_fix_flg) doDtl_rate_fix_flg_NC(info);
		else if (nc == columnDtl_xrate_cd) doDtl_xrate_cd_NC(info);
		else if (nc == columnDtl_xrate_nm) doDtl_xrate_nm_NC(info);
		else if (nc == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NC(info);
		else if (nc == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NC(info);
		else if (nc == columnDtl_calc_st) doDtl_calc_st_NC(info);
		else if (nc == columnDtl_calc_fin) doDtl_calc_fin_NC(info);
		else if (nc == columnDtl_calc_time) doDtl_calc_time_NC(info);
		else if (nc == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NC(info);
		else if (nc == columnDtl_batch_log_no) doDtl_batch_log_no_NC(info);
		else if (nc == columnDtl_rmrks) doDtl_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_true_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_true_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_false_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_false_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_true_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_true_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_false_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_false_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_true_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_true_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_false_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_false_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_amt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_amt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[other_chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_other_chk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_limit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_limit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[data_check_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_data_check_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rate_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rate_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_calc_usr_cd) doCnd_calc_usr_cd_NE(info);
		else if (ne == Cnd_calc_usr_nm) doCnd_calc_usr_nm_NE(info);
		else if (ne == Cnd_st_ym) doCnd_st_ym_NE(info);
		else if (ne == Cnd_end_ym) doCnd_end_ym_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_fix_true_flg) doCnd_fix_true_flg_NE(info);
		else if (ne == Cnd_fix_false_flg) doCnd_fix_false_flg_NE(info);
		else if (ne == Cnd_non_del_true_flg) doCnd_non_del_true_flg_NE(info);
		else if (ne == Cnd_non_del_false_flg) doCnd_non_del_false_flg_NE(info);
		else if (ne == Cnd_calc_err_true_flg) doCnd_calc_err_true_flg_NE(info);
		else if (ne == Cnd_calc_err_false_flg) doCnd_calc_err_false_flg_NE(info);
		else if (ne == Cnd_menu_cd) doCnd_menu_cd_NE(info);
		else if (ne == Cnd_menu_nm) doCnd_menu_nm_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_calc_no) doDtl_calc_no_NE(info);
		else if (ne == columnDtl_calc_err_flg) doDtl_calc_err_flg_NE(info);
		else if (ne == columnDtl_fix_flg) doDtl_fix_flg_NE(info);
		else if (ne == columnDtl_non_del_flg) doDtl_non_del_flg_NE(info);
		else if (ne == columnDtl_st_ym) doDtl_st_ym_NE(info);
		else if (ne == columnDtl_end_ym) doDtl_end_ym_NE(info);
		else if (ne == columnDtl_alc_err_flg) doDtl_alc_err_flg_NE(info);
		else if (ne == columnDtl_trd_amt_flg) doDtl_trd_amt_flg_NE(info);
		else if (ne == columnDtl_adj_amt_flg) doDtl_adj_amt_flg_NE(info);
		else if (ne == columnDtl_minus_stk_flg) doDtl_minus_stk_flg_NE(info);
		else if (ne == columnDtl_other_chk_flg) doDtl_other_chk_flg_NE(info);
		else if (ne == columnDtl_itm_limit_flg) doDtl_itm_limit_flg_NE(info);
		else if (ne == columnDtl_data_check_flg) doDtl_data_check_flg_NE(info);
		else if (ne == columnDtl_rate_fix_flg) doDtl_rate_fix_flg_NE(info);
		else if (ne == columnDtl_xrate_cd) doDtl_xrate_cd_NE(info);
		else if (ne == columnDtl_xrate_nm) doDtl_xrate_nm_NE(info);
		else if (ne == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NE(info);
		else if (ne == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NE(info);
		else if (ne == columnDtl_calc_st) doDtl_calc_st_NE(info);
		else if (ne == columnDtl_calc_fin) doDtl_calc_fin_NE(info);
		else if (ne == columnDtl_calc_time) doDtl_calc_time_NE(info);
		else if (ne == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NE(info);
		else if (ne == columnDtl_batch_log_no) doDtl_batch_log_no_NE(info);
		else if (ne == columnDtl_rmrks) doDtl_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_true_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_true_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_false_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_false_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_true_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_true_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_false_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_false_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_true_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_true_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_false_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_false_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_amt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_amt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[other_chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_other_chk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_limit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_limit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[data_check_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_data_check_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rate_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rate_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_calc_usr_cd) doCnd_calc_usr_cd_NX(info);
		else if (nx == Cnd_calc_usr_nm) doCnd_calc_usr_nm_NX(info);
		else if (nx == Cnd_st_ym) doCnd_st_ym_NX(info);
		else if (nx == Cnd_end_ym) doCnd_end_ym_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_fix_true_flg) doCnd_fix_true_flg_NX(info);
		else if (nx == Cnd_fix_false_flg) doCnd_fix_false_flg_NX(info);
		else if (nx == Cnd_non_del_true_flg) doCnd_non_del_true_flg_NX(info);
		else if (nx == Cnd_non_del_false_flg) doCnd_non_del_false_flg_NX(info);
		else if (nx == Cnd_calc_err_true_flg) doCnd_calc_err_true_flg_NX(info);
		else if (nx == Cnd_calc_err_false_flg) doCnd_calc_err_false_flg_NX(info);
		else if (nx == Cnd_menu_cd) doCnd_menu_cd_NX(info);
		else if (nx == Cnd_menu_nm) doCnd_menu_nm_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_calc_no) doDtl_calc_no_NX(info);
		else if (nx == columnDtl_calc_err_flg) doDtl_calc_err_flg_NX(info);
		else if (nx == columnDtl_fix_flg) doDtl_fix_flg_NX(info);
		else if (nx == columnDtl_non_del_flg) doDtl_non_del_flg_NX(info);
		else if (nx == columnDtl_st_ym) doDtl_st_ym_NX(info);
		else if (nx == columnDtl_end_ym) doDtl_end_ym_NX(info);
		else if (nx == columnDtl_alc_err_flg) doDtl_alc_err_flg_NX(info);
		else if (nx == columnDtl_trd_amt_flg) doDtl_trd_amt_flg_NX(info);
		else if (nx == columnDtl_adj_amt_flg) doDtl_adj_amt_flg_NX(info);
		else if (nx == columnDtl_minus_stk_flg) doDtl_minus_stk_flg_NX(info);
		else if (nx == columnDtl_other_chk_flg) doDtl_other_chk_flg_NX(info);
		else if (nx == columnDtl_itm_limit_flg) doDtl_itm_limit_flg_NX(info);
		else if (nx == columnDtl_data_check_flg) doDtl_data_check_flg_NX(info);
		else if (nx == columnDtl_rate_fix_flg) doDtl_rate_fix_flg_NX(info);
		else if (nx == columnDtl_xrate_cd) doDtl_xrate_cd_NX(info);
		else if (nx == columnDtl_xrate_nm) doDtl_xrate_nm_NX(info);
		else if (nx == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_NX(info);
		else if (nx == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_NX(info);
		else if (nx == columnDtl_calc_st) doDtl_calc_st_NX(info);
		else if (nx == columnDtl_calc_fin) doDtl_calc_fin_NX(info);
		else if (nx == columnDtl_calc_time) doDtl_calc_time_NX(info);
		else if (nx == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_NX(info);
		else if (nx == columnDtl_batch_log_no) doDtl_batch_log_no_NX(info);
		else if (nx == columnDtl_rmrks) doDtl_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_true_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_true_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_false_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_false_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_true_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_true_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[non_del_false_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_del_false_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_true_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_true_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_err_false_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_err_false_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_amt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_amt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[other_chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_other_chk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_limit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_limit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[data_check_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_data_check_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rate_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rate_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
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
		else if (lc == Cnd_calc_usr_cd) doCnd_calc_usr_cd_LC(info);
		else if (lc == Cnd_calc_usr_nm) doCnd_calc_usr_nm_LC(info);
		else if (lc == Cnd_st_ym) doCnd_st_ym_LC(info);
		else if (lc == Cnd_end_ym) doCnd_end_ym_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_menu_cd) doCnd_menu_cd_LC(info);
		else if (lc == Cnd_menu_nm) doCnd_menu_nm_LC(info);
		else if (lc == columnDtl_calc_no) doDtl_calc_no_LC(info);
		else if (lc == columnDtl_st_ym) doDtl_st_ym_LC(info);
		else if (lc == columnDtl_end_ym) doDtl_end_ym_LC(info);
		else if (lc == columnDtl_xrate_cd) doDtl_xrate_cd_LC(info);
		else if (lc == columnDtl_xrate_nm) doDtl_xrate_nm_LC(info);
		else if (lc == columnDtl_calc_usr_cd) doDtl_calc_usr_cd_LC(info);
		else if (lc == columnDtl_calc_usr_nm) doDtl_calc_usr_nm_LC(info);
		else if (lc == columnDtl_calc_st) doDtl_calc_st_LC(info);
		else if (lc == columnDtl_calc_fin) doDtl_calc_fin_LC(info);
		else if (lc == columnDtl_calc_time) doDtl_calc_time_LC(info);
		else if (lc == columnDtl_ins_srv_req_no) doDtl_ins_srv_req_no_LC(info);
		else if (lc == columnDtl_batch_log_no) doDtl_batch_log_no_LC(info);
		else if (lc == columnDtl_rmrks) doDtl_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_calc_grp_cd) doDtl_calc_grp_cd_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
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
	 * [Cnd]パネルの[calc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[menu_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_menu_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_st]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_st_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_fin]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_fin_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_time_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_usr_cd]の作成メソッド
	 */
	public MCList getCnd_calc_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_st_ym]の作成メソッド
	 */
	public MCList getCnd_st_ym(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_end_ym]の作成メソッド
	 */
	public MCList getCnd_end_ym(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_menu_cd]の作成メソッド
	 */
	public MCList getCnd_menu_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcMenu(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0030.Srch01")) {
			return new MG_MGBDL0030_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0030.Upd01")) {
			return new MG_MGBDL0030_Upd01Bridge();
		}
		if (id.equals("MG.MGBDL0030.Del01")) {
			return new MG_MGBDL0030_Del01Bridge();
		}
		if (id.equals("MG.MGBDL0030.Srch02")) {
			return new MG_MGBDL0030_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0030_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0030_Srch01Bridge() {
			p_MG_MGBDL0030_Srch01 = new MCParam(PDef.MG_MGBDL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0030.DtlR.class));

			p_MG_MGBDL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0030.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0030_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0030.DtlR>)p_MG_MGBDL0030_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0030_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0030_Upd01;

		/** コンストラクタ */
		protected MG_MGBDL0030_Upd01Bridge() {
			p_MG_MGBDL0030_Upd01 = new MCParam(PDef.MG_MGBDL0030_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0030_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0030.DtlR.class));

			p_MG_MGBDL0030_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0030_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0030_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0030_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0030_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0030_Upd01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0030_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0030.DtlR>)p_MG_MGBDL0030_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0030_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0030_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0030_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0030_Del01Bridge() {
			p_MG_MGBDL0030_Del01 = new MCParam(PDef.MG_MGBDL0030_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0030_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0030.DtlR.class));
			param.addUpBlock(mcframe.clientMGBD.MGBDP0030.CndR.create());
			// Down

			p_MG_MGBDL0030_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0030_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0030_Del01.addUpBlock(getDtlL().shallowClone());
			p_MG_MGBDL0030_Del01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0030_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0030_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0030.DtlR>)up(0);
		}
		protected mcframe.clientMGBD.MGBDP0030.CndR up1() {
			return (mcframe.clientMGBD.MGBDP0030.CndR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0030_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBDL0030_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0030_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0030_Srch02;

		/** コンストラクタ */
		protected MG_MGBDL0030_Srch02Bridge() {
			p_MG_MGBDL0030_Srch02 = new MCParam(PDef.MG_MGBDL0030_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0030_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0030.MenuListR.class));

			p_MG_MGBDL0030_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0030_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0030_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0030_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0030_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0030.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0030.MenuListR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0030.MenuListR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0030_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0030.MenuListR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0030_Srch02;
		}

		protected void show() {
			setMenuListL((MCList<mcframe.clientMGBD.MGBDP0030.MenuListR>)p_MG_MGBDL0030_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getMenuListL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getMenuListL());
			return result;
		}
	}
}