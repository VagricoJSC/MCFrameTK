package mcframe.clientMABC.MABCP0280;

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
import mcframe.clientMABC.MABCP0280.MABCP_DptReg_MC.MA_MABCL0280_Srch01Caller;
import mcframe.clientMABC.MABCP0280.MABCP_DptReg_MC.MA_MABCL0280_Upd01Caller;
import mcframe.clientMABC.MABCP0280.MABCP_DptReg_MC.MA_MABCL0280_Del01Caller;

/**
 * 画面"MABCP_DptReg"パネルクラスです。<p>
 *
 * 組織変更履歴マスタ、部門マスタ、部門変更対応マスタの検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_DptReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP0280";

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
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
	// [CndPnl]ブロック関連のField定義
	public MCPanel CndPnlPanel = null;
	public MCTitledBorder CndPnlTitledBorder = null;
	// [CndPnl]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create,0;MOD,Modify,4;UPD_ADMIN,Modify (Administrator),2;CNG,Change organization,5;DEL,Delete (Administrator),1;REF,View,3 UPD,登録する,0;MOD,訂正する,4;UPD_ADMIN,訂正する（管理者）,2;CNG,組織変更する,5;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_MOD = null;
	public MCRadioButton Cnd_ope_UPD_ADMIN = null;
	public MCRadioButton Cnd_ope_CNG = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateComboBox Cnd_st_dt = null;
	public MCLabel Cnd_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Cnd_end_dt = null;
	/**
	 * Organizational changes remarks 組織変更備考.<p>
	 *
	 */
	public MCTextField Cnd_dpt_his_rmrks = null;
	/**
	 * Including logical delete 論理削除を含む.<p>
	 *
	 */
	public MCCheckBox Cnd_del_flg = null;
	// [SrchBtn]ブロック関連のField定義
	public MCPanel SrchBtnPanel = null;
	// [SrchBtn]ブロックの項目のField定義
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton SrchBtn_srch = null;
	// [Dpt1]ブロック関連のField定義
	public MCPanel Dpt1Panel = null;
	public MCTitledBorder Dpt1TitledBorder = null;
	// [Dpt1]ブロックの項目のField定義
	// [Hdr1]ブロック関連のField定義
	public MCPanel Hdr1Panel = null;
	// [Hdr1]ブロックの項目のField定義
	public MCLabel Hdr1_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Hdr1_st_dt = null;
	public MCLabel Hdr1_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Hdr1_end_dt = null;
	public MCLabel Hdr1_dpt_his_rmrks_Label = null;
	/**
	 * Organizational changes remarks 組織変更備考.<p>
	 *
	 */
	public MCTextField Hdr1_dpt_his_rmrks = null;
	// [TreePnl1]ブロック関連のField定義
	public MCPanel TreePnl1Panel = null;
	// [TreePnl1]ブロックの項目のField定義
	// [Tree1]ブロック関連のField定義
	public MCPanel Tree1Panel = null;
	public MCScrollPane Tree1ScrollPane = null;
	public MCTree<mcframe.clientMABC.MABCP0280.Tree1R> Tree1Tree = null;
	// [Tree1]ブロックの項目のField定義
	// [TreeBtn1]ブロック関連のField定義
	public MCPanel TreeBtn1Panel = null;
	// [TreeBtn1]ブロックの項目のField定義
	/**
	 * Display again 再表示.<p>
	 *
	 */
	public MCButton TreeBtn1_view = null;
	/**
	 * Explosion 展開.<p>
	 *
	 */
	public MCButton TreeBtn1_expand = null;
	/**
	 * Collapse 折りたたみ.<p>
	 *
	 */
	public MCButton TreeBtn1_collapse = null;
	// [DtlPnl1]ブロック関連のField定義
	public MCPanel DtlPnl1Panel = null;
	// [DtlPnl1]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0280.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_cd = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_end_dt = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_nm_lcl = null;
	/**
	 * Standard dept. name 標準部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_nm = null;
	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_new_dpt_cd = null;
	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_up_lv_dpt_cd = null;
	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_up_lv_dpt_nm = null;
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_lvl_cd = null;
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_lvl_nm = null;
	/**
	 * Company address Setting 会社住所設定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_addr = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fax = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	/**
	 * Sales flg. 販売ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_flg = null;
	/**
	 * Distribution flg. 物流ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_flg = null;
	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_flg = null;
	/**
	 * Purchasing flg. 購買ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_flg = null;
	/**
	 * AR flg. 債権ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_flg = null;
	/**
	 * AP flg. 債務ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_flg = null;
	/**
	 * Demand and supply flg. 需給ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sd_flg = null;
	/**
	 * Payment received bank account cd. 入金口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_bank_ac_cd = null;
	/**
	 * Payment received account name 入金口座名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_bank_ac_nm = null;
	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_bank_ac_cd = null;
	/**
	 * Payment account name 支払口座名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_bank_ac_nm = null;
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cal_cd = null;
	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cal_nm = null;
	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_dpt_flg = null;
	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_flg = null;
	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_flg = null;
	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_dpt_flg = null;
	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dpt_flg = null;
	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_dpt_flg = null;
	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_dpt_flg = null;
	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_dpt_flg = null;
	/**
	 * Demand and supply dept. flg. 需給部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sd_dpt_flg = null;
	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_dpt_flg = null;
	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_flg = null;
	/**
	 * Cost dept. cd. 原価部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_dpt_cd = null;
	/**
	 * Cost dept. name 原価部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_dpt_nm = null;
	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_dpt_cd = null;
	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_dpt_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	// [Btn1]ブロック関連のField定義
	public MCPanel Btn1Panel = null;
	// [Btn1]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn1_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn1_deselect_all = null;
	/**
	 * Add to top 最上位追加.<p>
	 *
	 */
	public MCButton Btn1_add_top = null;
	/**
	 * Lower add 下位追加.<p>
	 *
	 */
	public MCButton Btn1_add_sub = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn1_rcopy = null;
	/**
	 * Delete dept. 部門削除.<p>
	 *
	 */
	public MCButton Btn1_del_dpt = null;
	/**
	 * Cancel logical delete 論理削除取消.<p>
	 *
	 */
	public MCButton Btn1_can_del = null;
	// [Dpt2]ブロック関連のField定義
	public MCPanel Dpt2Panel = null;
	public MCTitledBorder Dpt2TitledBorder = null;
	// [Dpt2]ブロックの項目のField定義
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	public MCLabel Hdr2_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Hdr2_st_dt = null;
	public MCLabel Hdr2_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Hdr2_end_dt = null;
	public MCLabel Hdr2_dpt_his_rmrks_Label = null;
	/**
	 * Organizational changes remarks 組織変更備考.<p>
	 *
	 */
	public MCTextField Hdr2_dpt_his_rmrks = null;
	// [TreePnl2]ブロック関連のField定義
	public MCPanel TreePnl2Panel = null;
	// [TreePnl2]ブロックの項目のField定義
	// [Tree2]ブロック関連のField定義
	public MCPanel Tree2Panel = null;
	public MCScrollPane Tree2ScrollPane = null;
	public MCTree<mcframe.clientMABC.MABCP0280.Tree1R> Tree2Tree = null;
	// [Tree2]ブロックの項目のField定義
	// [TreeBtn2]ブロック関連のField定義
	public MCPanel TreeBtn2Panel = null;
	// [TreeBtn2]ブロックの項目のField定義
	/**
	 * Display again 再表示.<p>
	 *
	 */
	public MCButton TreeBtn2_view = null;
	/**
	 * Explosion 展開.<p>
	 *
	 */
	public MCButton TreeBtn2_expand = null;
	/**
	 * Collapse 折りたたみ.<p>
	 *
	 */
	public MCButton TreeBtn2_collapse = null;
	// [DtlPnl2]ブロック関連のField定義
	public MCPanel DtlPnl2Panel = null;
	// [DtlPnl2]ブロックの項目のField定義
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0280.DtlR> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_del_flg = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dpt_cd = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_end_dt = null;
	/**
	 * Standard dept. name 標準部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dpt_nm = null;
	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_new_dpt_cd = null;
	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_up_lv_dpt_cd = null;
	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_up_lv_dpt_nm = null;
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dpt_lvl_cd = null;
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dpt_lvl_nm = null;
	/**
	 * Company address Setting 会社住所設定.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_set_addr = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_fax = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_wg_nm = null;
	/**
	 * Sales flg. 販売ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sls_flg = null;
	/**
	 * Distribution flg. 物流ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_lg_flg = null;
	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_mfg_flg = null;
	/**
	 * Purchasing flg. 購買ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_flg = null;
	/**
	 * AR flg. 債権ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ar_flg = null;
	/**
	 * AP flg. 債務ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_flg = null;
	/**
	 * Demand and supply flg. 需給ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sd_flg = null;
	/**
	 * Payment received bank account cd. 入金口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcv_bank_ac_cd = null;
	/**
	 * Payment received account name 入金口座名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcv_bank_ac_nm = null;
	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_pay_bank_ac_cd = null;
	/**
	 * Payment account name 支払口座名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_pay_bank_ac_nm = null;
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_cal_cd = null;
	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_cal_nm = null;
	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_asst_dpt_flg = null;
	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ar_dpt_flg = null;
	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_dpt_flg = null;
	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sls_dpt_flg = null;
	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_dpt_flg = null;
	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ship_dpt_flg = null;
	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_arr_dpt_flg = null;
	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_mfg_dpt_flg = null;
	/**
	 * Demand and supply dept. flg. 需給部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sd_dpt_flg = null;
	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_insp_dpt_flg = null;
	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_dpt_flg = null;
	/**
	 * Cost dept. cd. 原価部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_cost_dpt_cd = null;
	/**
	 * Cost dept. name 原価部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_cost_dpt_nm = null;
	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ac_dpt_cd = null;
	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ac_dpt_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_del_ts = null;
	// [Btn2]ブロック関連のField定義
	public MCPanel Btn2Panel = null;
	// [Btn2]ブロックの項目のField定義
	/**
	 * Add to top 最上位追加.<p>
	 *
	 */
	public MCButton Btn2_add_top = null;
	/**
	 * Lower add 下位追加.<p>
	 *
	 */
	public MCButton Btn2_add_sub = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn2_rcopy = null;
	/**
	 * Delete dept. 部門削除.<p>
	 *
	 */
	public MCButton Btn2_del_dpt = null;
	/**
	 * Cancel logical delete 論理削除取消.<p>
	 *
	 */
	public MCButton Btn2_can_del = null;
	/**
	 * Synchronize scrolling スクロール同期する.<p>
	 *
	 */
	public MCCheckBox Btn2_sync_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_admin = null;
	/**
	 * Info. インフォメーション.<p>
	 *
	 */
	public MCLabel Btn_inf_lbl = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [MOD]モードを表す定数 */
	public static final String MOD = "MOD";
	/** [UPD_ADMIN]モードを表す定数 */
	public static final String UPD_ADMIN = "UPD_ADMIN";
	/** [CNG]モードを表す定数 */
	public static final String CNG = "CNG";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{FIX, UPD, MOD, UPD_ADMIN, CNG, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0280_Srch01]のCallerの作成 */
	protected MABCP_DptReg_MC.MA_MABCL0280_Srch01Caller createMA_MABCL0280_Srch01() {
		MABCP_DptReg_MC.MA_MABCL0280_Srch01Caller<MABCP_DptReg, MA_MABCL0280_Srch01Bridge>
		caller = ((MABCP_DptReg_MC)this).new MA_MABCL0280_Srch01Caller<MABCP_DptReg, MA_MABCL0280_Srch01Bridge>(
					(MABCP_DptReg)this, new MA_MABCL0280_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0280_Srch01]の呼び出し */
	protected void callMA_MABCL0280_Srch01() {
		MCCaller caller = createMA_MABCL0280_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0280_Upd01]のCallerの作成 */
	protected MABCP_DptReg_MC.MA_MABCL0280_Upd01Caller createMA_MABCL0280_Upd01() {
		MABCP_DptReg_MC.MA_MABCL0280_Upd01Caller<MABCP_DptReg, MA_MABCL0280_Upd01Bridge>
		caller = ((MABCP_DptReg_MC)this).new MA_MABCL0280_Upd01Caller<MABCP_DptReg, MA_MABCL0280_Upd01Bridge>(
					(MABCP_DptReg)this, new MA_MABCL0280_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0280_Upd01]の呼び出し */
	protected void callMA_MABCL0280_Upd01() {
		MCCaller caller = createMA_MABCL0280_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0280_Del01]のCallerの作成 */
	protected MABCP_DptReg_MC.MA_MABCL0280_Del01Caller createMA_MABCL0280_Del01() {
		MABCP_DptReg_MC.MA_MABCL0280_Del01Caller<MABCP_DptReg, MA_MABCL0280_Del01Bridge>
		caller = ((MABCP_DptReg_MC)this).new MA_MABCL0280_Del01Caller<MABCP_DptReg, MA_MABCL0280_Del01Bridge>(
					(MABCP_DptReg)this, new MA_MABCL0280_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0280_Del01]の呼び出し */
	protected void callMA_MABCL0280_Del01() {
		MCCaller caller = createMA_MABCL0280_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0280.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0280.CndR aCndR;
	/** [Hdr1]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0280.Hdr1R aHdr1R;
	/** [Tree1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0280.Tree1R> aTree1L;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0280.DtlR> aDtlL;
	/** [Hdr2]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0280.Hdr1R aHdr2R;
	/** [Tree2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0280.Tree1R> aTree2L;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0280.DtlR> aDtl2L;
	/** [Btn2]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0280.Btn2R aBtn2R;
	/** [DptHis]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0280.DptHisR> aDptHisL;
	/** [DptMap]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0280.DptMapR> aDptMapL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0280.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0280.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0280.MstR createMstR() {
		return mcframe.clientMABC.MABCP0280.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0280.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0280.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0280.CndR createCndR() {
		return mcframe.clientMABC.MABCP0280.CndR.create();
	}

	/**
	 * 項目コピーによってaHdr1Rを設定します。
	 *
	 * aHdr1Rのインスタンスは変更されません。
	 *
	 * @param row Hdr1R
	 */
	public void setHdr1R(mcframe.clientMABC.MABCP0280.Hdr1R row) {
		if (row != null) {
			MCRow.copyall(getHdr1R(), row);
		}
	}

	/**
	 * [Hdr1]ブロックのコンテナaHdr1Rを返します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMABC.MABCP0280.Hdr1R getHdr1R() {
		return aHdr1R;
	}

	/**
	 * aHdr1Rを作成します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMABC.MABCP0280.Hdr1R createHdr1R() {
		return mcframe.clientMABC.MABCP0280.Hdr1R.create();
	}

	/**
	 * コピーによってaTree1Lを設定します。
	 *
	 * aTree1Lのインスタンスは変更されません。
	 *
	 * @param dataset Tree1L
	 */
	public void setTree1L(MCList<mcframe.clientMABC.MABCP0280.Tree1R> aList) {
		if (getTree1L() != aList) {
			getTree1L().setAll(aList);
		}
	}

	/**
	 * [Tree1]ブロックのコンテナaTree1Lを返します。
	 *
	 * @return Tree1L
	 */
	public MCList<mcframe.clientMABC.MABCP0280.Tree1R> getTree1L() {
		return aTree1L;
	}

	/**
	 * aTree1Rを作成します。
	 *
	 * @return Tree1R
	 */
	public mcframe.clientMABC.MABCP0280.Tree1R createTree1R() {
		return mcframe.clientMABC.MABCP0280.Tree1R.create();
	}

	/**
	 * aTree1Lを作成します。
	 *
	 * @return Tree1L
	 */
	public MCList<mcframe.clientMABC.MABCP0280.Tree1R> createTree1L() {
		return MCList.create(mcframe.clientMABC.MABCP0280.Tree1R.class);
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0280.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0280.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0280.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0280.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0280.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0280.DtlR.class);
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
	 * 項目コピーによってaHdr2Rを設定します。
	 *
	 * aHdr2Rのインスタンスは変更されません。
	 *
	 * @param row Hdr2R
	 */
	public void setHdr2R(mcframe.clientMABC.MABCP0280.Hdr1R row) {
		if (row != null) {
			MCRow.copyall(getHdr2R(), row);
		}
	}

	/**
	 * [Hdr2]ブロックのコンテナaHdr2Rを返します。
	 *
	 * @return Hdr2R
	 */
	public mcframe.clientMABC.MABCP0280.Hdr1R getHdr2R() {
		return aHdr2R;
	}

	/**
	 * aHdr2Rを作成します。
	 *
	 * @return Hdr2R
	 */
	public mcframe.clientMABC.MABCP0280.Hdr1R createHdr2R() {
		return mcframe.clientMABC.MABCP0280.Hdr1R.create();
	}

	/**
	 * コピーによってaTree2Lを設定します。
	 *
	 * aTree2Lのインスタンスは変更されません。
	 *
	 * @param dataset Tree2L
	 */
	public void setTree2L(MCList<mcframe.clientMABC.MABCP0280.Tree1R> aList) {
		if (getTree2L() != aList) {
			getTree2L().setAll(aList);
		}
	}

	/**
	 * [Tree2]ブロックのコンテナaTree2Lを返します。
	 *
	 * @return Tree2L
	 */
	public MCList<mcframe.clientMABC.MABCP0280.Tree1R> getTree2L() {
		return aTree2L;
	}

	/**
	 * aTree2Rを作成します。
	 *
	 * @return Tree2R
	 */
	public mcframe.clientMABC.MABCP0280.Tree1R createTree2R() {
		return mcframe.clientMABC.MABCP0280.Tree1R.create();
	}

	/**
	 * aTree2Lを作成します。
	 *
	 * @return Tree2L
	 */
	public MCList<mcframe.clientMABC.MABCP0280.Tree1R> createTree2L() {
		return MCList.create(mcframe.clientMABC.MABCP0280.Tree1R.class);
	}

	/**
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMABC.MABCP0280.DtlR> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMABC.MABCP0280.DtlR> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMABC.MABCP0280.DtlR createDtl2R() {
		return mcframe.clientMABC.MABCP0280.DtlR.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMABC.MABCP0280.DtlR> createDtl2L() {
		return MCList.create(mcframe.clientMABC.MABCP0280.DtlR.class);
	}

	/**
	 * Dtl2Tableを初期化します。
	 */
	protected void createDtl2Table(){
		if(Dtl2Table == null){
			Dtl2Table = beansFactory.createTable2("Dtl2.table");
		}
	}

	/**
	 * 項目コピーによってaBtn2Rを設定します。
	 *
	 * aBtn2Rのインスタンスは変更されません。
	 *
	 * @param row Btn2R
	 */
	public void setBtn2R(mcframe.clientMABC.MABCP0280.Btn2R row) {
		if (row != null) {
			MCRow.copyall(getBtn2R(), row);
		}
	}

	/**
	 * [Btn2]ブロックのコンテナaBtn2Rを返します。
	 *
	 * @return Btn2R
	 */
	public mcframe.clientMABC.MABCP0280.Btn2R getBtn2R() {
		return aBtn2R;
	}

	/**
	 * aBtn2Rを作成します。
	 *
	 * @return Btn2R
	 */
	public mcframe.clientMABC.MABCP0280.Btn2R createBtn2R() {
		return mcframe.clientMABC.MABCP0280.Btn2R.create();
	}

	/**
	 * コピーによってaDptHisLを設定します。
	 *
	 * aDptHisLのインスタンスは変更されません。
	 *
	 * @param dataset DptHisL
	 */
	public void setDptHisL(MCList<mcframe.clientMABC.MABCP0280.DptHisR> aList) {
		if (getDptHisL() != aList) {
			getDptHisL().setAll(aList);
		}
	}

	/**
	 * [DptHis]ブロックのコンテナaDptHisLを返します。
	 *
	 * @return DptHisL
	 */
	public MCList<mcframe.clientMABC.MABCP0280.DptHisR> getDptHisL() {
		return aDptHisL;
	}

	/**
	 * aDptHisRを作成します。
	 *
	 * @return DptHisR
	 */
	public mcframe.clientMABC.MABCP0280.DptHisR createDptHisR() {
		return mcframe.clientMABC.MABCP0280.DptHisR.create();
	}

	/**
	 * aDptHisLを作成します。
	 *
	 * @return DptHisL
	 */
	public MCList<mcframe.clientMABC.MABCP0280.DptHisR> createDptHisL() {
		return MCList.create(mcframe.clientMABC.MABCP0280.DptHisR.class);
	}

	/**
	 * コピーによってaDptMapLを設定します。
	 *
	 * aDptMapLのインスタンスは変更されません。
	 *
	 * @param dataset DptMapL
	 */
	public void setDptMapL(MCList<mcframe.clientMABC.MABCP0280.DptMapR> aList) {
		if (getDptMapL() != aList) {
			getDptMapL().setAll(aList);
		}
	}

	/**
	 * [DptMap]ブロックのコンテナaDptMapLを返します。
	 *
	 * @return DptMapL
	 */
	public MCList<mcframe.clientMABC.MABCP0280.DptMapR> getDptMapL() {
		return aDptMapL;
	}

	/**
	 * aDptMapRを作成します。
	 *
	 * @return DptMapR
	 */
	public mcframe.clientMABC.MABCP0280.DptMapR createDptMapR() {
		return mcframe.clientMABC.MABCP0280.DptMapR.create();
	}

	/**
	 * aDptMapLを作成します。
	 *
	 * @return DptMapL
	 */
	public MCList<mcframe.clientMABC.MABCP0280.DptMapR> createDptMapL() {
		return MCList.create(mcframe.clientMABC.MABCP0280.DptMapR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdr1R())) ret.add(getHdr1R());
		if(!MCCollectionUtil.contains(ret, getTree1L())) ret.add(getTree1L());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getHdr2R())) ret.add(getHdr2R());
		if(!MCCollectionUtil.contains(ret, getTree2L())) ret.add(getTree2L());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
		if(!MCCollectionUtil.contains(ret, getBtn2R())) ret.add(getBtn2R());
		if(!MCCollectionUtil.contains(ret, getDptHisL())) ret.add(getDptHisL());
		if(!MCCollectionUtil.contains(ret, getDptMapL())) ret.add(getDptMapL());
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
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdr1R()) return "Hdr1";
		if(aCnt == getTree1L()) return "Tree1";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getHdr2R()) return "Hdr2";
		if(aCnt == getTree2L()) return "Tree2";
		if(aCnt == getDtl2L()) return "Dtl2";
		if(aCnt == getBtn2R()) return "Btn2";
		if(aCnt == getDptHisL()) return "DptHis";
		if(aCnt == getDptMapL()) return "DptMap";
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
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr1")) return getHdr1R();
		if(bId.equals("Tree1")) return getTree1L();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Hdr2")) return getHdr2R();
		if(bId.equals("Tree2")) return getTree2L();
		if(bId.equals("Dtl2")) return getDtl2L();
		if(bId.equals("Btn2")) return getBtn2R();
		if(bId.equals("DptHis")) return getDptHisL();
		if(bId.equals("DptMap")) return getDptMapL();
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
		ret.add(MstPanel);
		ret.add(CndPnlPanel);
		ret.add(CndPanel);
		ret.add(SrchBtnPanel);
		ret.add(Dpt1Panel);
		ret.add(Hdr1Panel);
		ret.add(TreePnl1Panel);
		ret.add(Tree1Panel);
		ret.add(TreeBtn1Panel);
		ret.add(DtlPnl1Panel);
		ret.add(DtlPanel);
		ret.add(Btn1Panel);
		ret.add(Dpt2Panel);
		ret.add(Hdr2Panel);
		ret.add(TreePnl2Panel);
		ret.add(Tree2Panel);
		ret.add(TreeBtn2Panel);
		ret.add(DtlPnl2Panel);
		ret.add(Dtl2Panel);
		ret.add(Btn2Panel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_DptReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aTree1L = createTree1L();
		aDtlL = createDtlL();
		aHdr2R = createHdr2R();
		aTree2L = createTree2L();
		aDtl2L = createDtl2L();
		aBtn2R = createBtn2R();
		aDptHisL = createDptHisL();
		aDptMapL = createDptMapL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_DptReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aTree1L = createTree1L();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aHdr2R = createHdr2R();
		aTree2L = createTree2L();
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
		aBtn2R = createBtn2R();
		aDptHisL = createDptHisL();
		aDptMapL = createDptMapL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_DptReg_MC.jbCreateScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateMst((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateCndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateCnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateSrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateDpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateHdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateTreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateTree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateTreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateDtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateDtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateDpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateHdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateTreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateTree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateTreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateDtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateDtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbCreateEastBtn((MABCP_DptReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_DptReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_DptReg p) {
	}

	/**
	 * [CndPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndPnl(MABCP_DptReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_DptReg p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MABCP_DptReg p) {
	}

	/**
	 * [Dpt1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDpt1(MABCP_DptReg p) {
	}

	/**
	 * [Hdr1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr1(MABCP_DptReg p) {
	}

	/**
	 * [TreePnl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTreePnl1(MABCP_DptReg p) {
	}

	/**
	 * [Tree1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTree1(MABCP_DptReg p) {
	}

	/**
	 * [TreeBtn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTreeBtn1(MABCP_DptReg p) {
	}

	/**
	 * [DtlPnl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlPnl1(MABCP_DptReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_DptReg p) {
	}

	/**
	 * [Btn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn1(MABCP_DptReg p) {
	}

	/**
	 * [Dpt2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDpt2(MABCP_DptReg p) {
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MABCP_DptReg p) {
	}

	/**
	 * [TreePnl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTreePnl2(MABCP_DptReg p) {
	}

	/**
	 * [Tree2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTree2(MABCP_DptReg p) {
	}

	/**
	 * [TreeBtn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTreeBtn2(MABCP_DptReg p) {
	}

	/**
	 * [DtlPnl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlPnl2(MABCP_DptReg p) {
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MABCP_DptReg p) {
	}

	/**
	 * [Btn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn2(MABCP_DptReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_DptReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_DptReg p) {
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

	
	/** [Cnd_st_dt_ListPutter]の定義 */
	private MCListPutter Cnd_st_dt_p = null;

	/**
	 * [Cnd_st_dt_ListPutter]の取得
	 */
	protected MCListPutter getCnd_st_dt_ListPutter() {
		if (Cnd_st_dt_p == null) {
			Cnd_st_dt_p = createCnd_st_dt_ListPutter(Cnd_st_dt, "st_dt", "end_dt","dpt_his_rmrks");

		}
		return Cnd_st_dt_p;
	}
	
	
	/** [Dtl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_cd_p = null;

	/**
	 * [Dtl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_cd_ListPutter() {
		if (Dtl_dpt_cd_p == null) {
			Dtl_dpt_cd_p = createDtl_dpt_cd_ListPutter(columnDtl_dpt_cd, "dpt_cd", "dpt_nm_lcl","dpt_nm");

		}
		return Dtl_dpt_cd_p;
	}
	
	
	/** [Dtl_new_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_new_dpt_cd_p = null;

	/**
	 * [Dtl_new_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_new_dpt_cd_ListPutter() {
		if (Dtl_new_dpt_cd_p == null) {
			Dtl_new_dpt_cd_p = createDtl_new_dpt_cd_ListPutter(columnDtl_new_dpt_cd, "new_dpt_cd");

		}
		return Dtl_new_dpt_cd_p;
	}
	
	
	/** [Dtl_up_lv_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_up_lv_dpt_cd_p = null;

	/**
	 * [Dtl_up_lv_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_up_lv_dpt_cd_ListPutter() {
		if (Dtl_up_lv_dpt_cd_p == null) {
			Dtl_up_lv_dpt_cd_p = createDtl_up_lv_dpt_cd_ListPutter(columnDtl_up_lv_dpt_cd, "up_lv_dpt_cd", "up_lv_dpt_nm");

		}
		return Dtl_up_lv_dpt_cd_p;
	}
	
	
	/** [Dtl_dpt_lvl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_lvl_cd_p = null;

	/**
	 * [Dtl_dpt_lvl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_lvl_cd_ListPutter() {
		if (Dtl_dpt_lvl_cd_p == null) {
			Dtl_dpt_lvl_cd_p = createDtl_dpt_lvl_cd_ListPutter(columnDtl_dpt_lvl_cd, "dpt_lvl_cd", "dpt_lvl_nm");

		}
		return Dtl_dpt_lvl_cd_p;
	}
	
	
	/** [Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_p = null;

	/**
	 * [Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_ListPutter() {
		if (Dtl_wg_cd_p == null) {
			Dtl_wg_cd_p = createDtl_wg_cd_ListPutter(columnDtl_wg_cd, "wg_cd", "wg_nm","sls_flg","lg_flg","mfg_flg","purc_flg","ar_flg","ap_flg","sd_flg");

		}
		return Dtl_wg_cd_p;
	}
	
	
	/** [Dtl_rcv_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rcv_bank_ac_cd_p = null;

	/**
	 * [Dtl_rcv_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rcv_bank_ac_cd_ListPutter() {
		if (Dtl_rcv_bank_ac_cd_p == null) {
			Dtl_rcv_bank_ac_cd_p = createDtl_rcv_bank_ac_cd_ListPutter(columnDtl_rcv_bank_ac_cd, "rcv_bank_ac_cd", "rcv_bank_ac_nm");

		}
		return Dtl_rcv_bank_ac_cd_p;
	}
	
	
	/** [Dtl_pay_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Dtl_pay_bank_ac_cd_p = null;

	/**
	 * [Dtl_pay_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pay_bank_ac_cd_ListPutter() {
		if (Dtl_pay_bank_ac_cd_p == null) {
			Dtl_pay_bank_ac_cd_p = createDtl_pay_bank_ac_cd_ListPutter(columnDtl_pay_bank_ac_cd, "pay_bank_ac_cd", "pay_bank_ac_nm");

		}
		return Dtl_pay_bank_ac_cd_p;
	}
	
	
	/** [Dtl_cal_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cal_cd_p = null;

	/**
	 * [Dtl_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cal_cd_ListPutter() {
		if (Dtl_cal_cd_p == null) {
			Dtl_cal_cd_p = createDtl_cal_cd_ListPutter(columnDtl_cal_cd, "cal_cd", "cal_nm");

		}
		return Dtl_cal_cd_p;
	}
	
	
	/** [Dtl_cost_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cost_dpt_cd_p = null;

	/**
	 * [Dtl_cost_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cost_dpt_cd_ListPutter() {
		if (Dtl_cost_dpt_cd_p == null) {
			Dtl_cost_dpt_cd_p = createDtl_cost_dpt_cd_ListPutter(columnDtl_cost_dpt_cd, "cost_dpt_cd", "cost_dpt_nm");

		}
		return Dtl_cost_dpt_cd_p;
	}
	
	
	/** [Dtl_ac_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ac_dpt_cd_p = null;

	/**
	 * [Dtl_ac_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ac_dpt_cd_ListPutter() {
		if (Dtl_ac_dpt_cd_p == null) {
			Dtl_ac_dpt_cd_p = createDtl_ac_dpt_cd_ListPutter(columnDtl_ac_dpt_cd, "ac_dpt_cd", "ac_dpt_nm");

		}
		return Dtl_ac_dpt_cd_p;
	}
	
	
	/** [Dtl2_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_dpt_cd_p = null;

	/**
	 * [Dtl2_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_dpt_cd_ListPutter() {
		if (Dtl2_dpt_cd_p == null) {
			Dtl2_dpt_cd_p = createDtl2_dpt_cd_ListPutter(columnDtl2_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Dtl2_dpt_cd_p;
	}
	
	
	/** [Dtl2_new_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_new_dpt_cd_p = null;

	/**
	 * [Dtl2_new_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_new_dpt_cd_ListPutter() {
		if (Dtl2_new_dpt_cd_p == null) {
			Dtl2_new_dpt_cd_p = createDtl2_new_dpt_cd_ListPutter(columnDtl2_new_dpt_cd, "new_dpt_cd");

		}
		return Dtl2_new_dpt_cd_p;
	}
	
	
	/** [Dtl2_up_lv_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_up_lv_dpt_cd_p = null;

	/**
	 * [Dtl2_up_lv_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_up_lv_dpt_cd_ListPutter() {
		if (Dtl2_up_lv_dpt_cd_p == null) {
			Dtl2_up_lv_dpt_cd_p = createDtl2_up_lv_dpt_cd_ListPutter(columnDtl2_up_lv_dpt_cd, "up_lv_dpt_cd", "up_lv_dpt_nm");

		}
		return Dtl2_up_lv_dpt_cd_p;
	}
	
	
	/** [Dtl2_dpt_lvl_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_dpt_lvl_cd_p = null;

	/**
	 * [Dtl2_dpt_lvl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_dpt_lvl_cd_ListPutter() {
		if (Dtl2_dpt_lvl_cd_p == null) {
			Dtl2_dpt_lvl_cd_p = createDtl2_dpt_lvl_cd_ListPutter(columnDtl2_dpt_lvl_cd, "dpt_lvl_cd", "dpt_lvl_nm");

		}
		return Dtl2_dpt_lvl_cd_p;
	}
	
	
	/** [Dtl2_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_wg_cd_p = null;

	/**
	 * [Dtl2_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_wg_cd_ListPutter() {
		if (Dtl2_wg_cd_p == null) {
			Dtl2_wg_cd_p = createDtl2_wg_cd_ListPutter(columnDtl2_wg_cd, "wg_cd", "wg_nm","sls_flg","lg_flg","mfg_flg","purc_flg","ar_flg","ap_flg","sd_flg");

		}
		return Dtl2_wg_cd_p;
	}
	
	
	/** [Dtl2_rcv_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_rcv_bank_ac_cd_p = null;

	/**
	 * [Dtl2_rcv_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_rcv_bank_ac_cd_ListPutter() {
		if (Dtl2_rcv_bank_ac_cd_p == null) {
			Dtl2_rcv_bank_ac_cd_p = createDtl2_rcv_bank_ac_cd_ListPutter(columnDtl2_rcv_bank_ac_cd, "rcv_bank_ac_cd", "rcv_bank_ac_nm");

		}
		return Dtl2_rcv_bank_ac_cd_p;
	}
	
	
	/** [Dtl2_pay_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_pay_bank_ac_cd_p = null;

	/**
	 * [Dtl2_pay_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_pay_bank_ac_cd_ListPutter() {
		if (Dtl2_pay_bank_ac_cd_p == null) {
			Dtl2_pay_bank_ac_cd_p = createDtl2_pay_bank_ac_cd_ListPutter(columnDtl2_pay_bank_ac_cd, "pay_bank_ac_cd", "pay_bank_ac_nm");

		}
		return Dtl2_pay_bank_ac_cd_p;
	}
	
	
	/** [Dtl2_cal_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_cal_cd_p = null;

	/**
	 * [Dtl2_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_cal_cd_ListPutter() {
		if (Dtl2_cal_cd_p == null) {
			Dtl2_cal_cd_p = createDtl2_cal_cd_ListPutter(columnDtl2_cal_cd, "cal_cd", "cal_nm");

		}
		return Dtl2_cal_cd_p;
	}
	
	
	/** [Dtl2_cost_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_cost_dpt_cd_p = null;

	/**
	 * [Dtl2_cost_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_cost_dpt_cd_ListPutter() {
		if (Dtl2_cost_dpt_cd_p == null) {
			Dtl2_cost_dpt_cd_p = createDtl2_cost_dpt_cd_ListPutter(columnDtl2_cost_dpt_cd, "cost_dpt_cd", "cost_dpt_nm");

		}
		return Dtl2_cost_dpt_cd_p;
	}
	
	
	/** [Dtl2_ac_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_ac_dpt_cd_p = null;

	/**
	 * [Dtl2_ac_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_ac_dpt_cd_ListPutter() {
		if (Dtl2_ac_dpt_cd_p == null) {
			Dtl2_ac_dpt_cd_p = createDtl2_ac_dpt_cd_ListPutter(columnDtl2_ac_dpt_cd, "ac_dpt_cd", "ac_dpt_nm");

		}
		return Dtl2_ac_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_DptReg create(){
		MABCP_DptReg p = new MABCP_DptReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_DptReg create(String name){
		MABCP_DptReg p = new MABCP_DptReg(name);
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
		MABCP_DptReg_MC.jbfInitScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitMst((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitCndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitCnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitSrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitDpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitHdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitTreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitTree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitTreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitDtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitDtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitDpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitHdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitTreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitTree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitTreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitDtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitDtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbfInitEastBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitMst((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitCndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitCnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitSrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitDpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitHdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitTreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitTree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitTreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitDtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitDtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitDpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitHdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitTreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitTree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitTreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitDtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitDtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.jbInitEastBtn((MABCP_DptReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [CndPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndPnl(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.CndPnlPanel = p.beansFactory.createPanel("CndPnl");
		p.CndPnlTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_UPD_ADMIN = p.beansFactory.createRadioButton("Cnd.ope_UPD_ADMIN");
		p.Cnd_ope_CNG = p.beansFactory.createRadioButton("Cnd.ope_CNG");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_st_dt_Label = p.beansFactory.createLabel("Cnd.st_dt_Label");
		p.Cnd_st_dt = p.beansFactory.createDateComboBox("Cnd.st_dt");
		p.Cnd_st_dt.setLabel(p.Cnd_st_dt_Label);
		p.Cnd_end_dt_Label = p.beansFactory.createLabel("Cnd.end_dt_Label");
		p.Cnd_end_dt = p.beansFactory.createDateField("Cnd.end_dt");
		p.Cnd_end_dt.setLabel(p.Cnd_end_dt_Label);
		p.Cnd_dpt_his_rmrks = p.beansFactory.createTextField("Cnd.dpt_his_rmrks");
		p.Cnd_del_flg = p.beansFactory.createCheckBox("Cnd.del_flg");
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
		p.SrchBtn_srch = p.beansFactory.createButton("SrchBtn.srch", "srch");
	}

	/**
	 * [Dpt1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDpt1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Dpt1Panel = p.beansFactory.createPanel("Dpt1");
		p.Dpt1TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel = p.beansFactory.createPanel("Hdr1");
		// ブロックの項目の初期化
		p.Hdr1_st_dt_Label = p.beansFactory.createLabel("Hdr1.st_dt_Label");
		p.Hdr1_st_dt = p.beansFactory.createDateField("Hdr1.st_dt");
		p.Hdr1_st_dt.setLabel(p.Hdr1_st_dt_Label);
		p.Hdr1_end_dt_Label = p.beansFactory.createLabel("Hdr1.end_dt_Label");
		p.Hdr1_end_dt = p.beansFactory.createDateField("Hdr1.end_dt");
		p.Hdr1_end_dt.setLabel(p.Hdr1_end_dt_Label);
		p.Hdr1_dpt_his_rmrks_Label = p.beansFactory.createLabel("Hdr1.dpt_his_rmrks_Label");
		p.Hdr1_dpt_his_rmrks = p.beansFactory.createTextField("Hdr1.dpt_his_rmrks");
		p.Hdr1_dpt_his_rmrks.setLabel(p.Hdr1_dpt_his_rmrks_Label);
	}

	/**
	 * [TreePnl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTreePnl1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.TreePnl1Panel = p.beansFactory.createPanel("TreePnl1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tree1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTree1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Tree1Panel = p.beansFactory.createPanel("Tree1");
		p.Tree1ScrollPane = p.beansFactory.createScrollPane("Tree1.scroll");
		p.Tree1Tree = p.beansFactory.createDandDTree("Tree1.tree");
		((MCTree64)p.Tree1Tree).delegate64 = getTree1Delegate();
		// ブロックの項目の初期化
	}

	protected static MCTree64Delegate getTree1Delegate() {
		return new mcframe.clientCore.beans.tree.MCTree64DefaultDelegate();
	}

	/**
	 * [TreeBtn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTreeBtn1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.TreeBtn1Panel = p.beansFactory.createPanel("TreeBtn1");
		// ブロックの項目の初期化
		p.TreeBtn1_view = p.beansFactory.createButton("TreeBtn1.view");
		p.TreeBtn1_expand = p.beansFactory.createButton("TreeBtn1.expand");
		p.TreeBtn1_collapse = p.beansFactory.createButton("TreeBtn1.collapse");
	}

	/**
	 * [DtlPnl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlPnl1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.DtlPnl1Panel = p.beansFactory.createPanel("DtlPnl1");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_dpt_cd = p.beansFactory.createTableColumn("Dtl.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_st_dt = p.beansFactory.createTableColumn("Dtl.st_dt", MCColumnType.DATE);
		p.columnDtl_end_dt = p.beansFactory.createTableColumn("Dtl.end_dt", MCColumnType.DATE);
		p.columnDtl_dpt_nm_lcl = p.beansFactory.createTableColumn("Dtl.dpt_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_dpt_nm = p.beansFactory.createTableColumn("Dtl.dpt_nm", MCColumnType.TEXT);
		p.columnDtl_new_dpt_cd = p.beansFactory.createTableColumn("Dtl.new_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_up_lv_dpt_cd = p.beansFactory.createTableColumn("Dtl.up_lv_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_up_lv_dpt_nm = p.beansFactory.createTableColumn("Dtl.up_lv_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_dpt_lvl_cd = p.beansFactory.createTableColumn("Dtl.dpt_lvl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_lvl_nm = p.beansFactory.createTableColumn("Dtl.dpt_lvl_nm", MCColumnType.TEXT);
		p.columnDtl_set_addr = p.beansFactory.createTableColumn("Dtl.set_addr", MCColumnType.BUTTON);
		p.columnDtl_zip_cd = p.beansFactory.createTableColumn("Dtl.zip_cd", MCColumnType.TEXT);
		p.columnDtl_addr1 = p.beansFactory.createTableColumn("Dtl.addr1", MCColumnType.TEXT);
		p.columnDtl_addr2 = p.beansFactory.createTableColumn("Dtl.addr2", MCColumnType.TEXT);
		p.columnDtl_addr3 = p.beansFactory.createTableColumn("Dtl.addr3", MCColumnType.TEXT);
		p.columnDtl_addr4 = p.beansFactory.createTableColumn("Dtl.addr4", MCColumnType.TEXT);
		p.columnDtl_tel = p.beansFactory.createTableColumn("Dtl.tel", MCColumnType.TEXT);
		p.columnDtl_fax = p.beansFactory.createTableColumn("Dtl.fax", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_sls_flg = p.beansFactory.createTableColumn("Dtl.sls_flg", MCColumnType.CHECK);
		p.columnDtl_lg_flg = p.beansFactory.createTableColumn("Dtl.lg_flg", MCColumnType.CHECK);
		p.columnDtl_mfg_flg = p.beansFactory.createTableColumn("Dtl.mfg_flg", MCColumnType.CHECK);
		p.columnDtl_purc_flg = p.beansFactory.createTableColumn("Dtl.purc_flg", MCColumnType.CHECK);
		p.columnDtl_ar_flg = p.beansFactory.createTableColumn("Dtl.ar_flg", MCColumnType.CHECK);
		p.columnDtl_ap_flg = p.beansFactory.createTableColumn("Dtl.ap_flg", MCColumnType.CHECK);
		p.columnDtl_sd_flg = p.beansFactory.createTableColumn("Dtl.sd_flg", MCColumnType.CHECK);
		p.columnDtl_rcv_bank_ac_cd = p.beansFactory.createTableColumn("Dtl.rcv_bank_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rcv_bank_ac_nm = p.beansFactory.createTableColumn("Dtl.rcv_bank_ac_nm", MCColumnType.TEXT);
		p.columnDtl_pay_bank_ac_cd = p.beansFactory.createTableColumn("Dtl.pay_bank_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_pay_bank_ac_nm = p.beansFactory.createTableColumn("Dtl.pay_bank_ac_nm", MCColumnType.TEXT);
		p.columnDtl_cal_cd = p.beansFactory.createTableColumn("Dtl.cal_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cal_nm = p.beansFactory.createTableColumn("Dtl.cal_nm", MCColumnType.TEXT);
		p.columnDtl_asst_dpt_flg = p.beansFactory.createTableColumn("Dtl.asst_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_ar_dpt_flg = p.beansFactory.createTableColumn("Dtl.ar_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_ap_dpt_flg = p.beansFactory.createTableColumn("Dtl.ap_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_sls_dpt_flg = p.beansFactory.createTableColumn("Dtl.sls_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_purc_dpt_flg = p.beansFactory.createTableColumn("Dtl.purc_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_ship_dpt_flg = p.beansFactory.createTableColumn("Dtl.ship_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_arr_dpt_flg = p.beansFactory.createTableColumn("Dtl.arr_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_mfg_dpt_flg = p.beansFactory.createTableColumn("Dtl.mfg_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_sd_dpt_flg = p.beansFactory.createTableColumn("Dtl.sd_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_insp_dpt_flg = p.beansFactory.createTableColumn("Dtl.insp_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_bd_dpt_flg = p.beansFactory.createTableColumn("Dtl.bd_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_cost_dpt_cd = p.beansFactory.createTableColumn("Dtl.cost_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cost_dpt_nm = p.beansFactory.createTableColumn("Dtl.cost_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_ac_dpt_cd = p.beansFactory.createTableColumn("Dtl.ac_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_dpt_nm = p.beansFactory.createTableColumn("Dtl.ac_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Btn1Panel = p.beansFactory.createPanel("Btn1");
		// ブロックの項目の初期化
		p.Btn1_select_all = p.beansFactory.createButton("Btn1.select_all", "no_border");
		p.Btn1_deselect_all = p.beansFactory.createButton("Btn1.deselect_all", "no_border");
		p.Btn1_add_top = p.beansFactory.createButton("Btn1.add_top");
		p.Btn1_add_sub = p.beansFactory.createButton("Btn1.add_sub");
		p.Btn1_rcopy = p.beansFactory.createButton("Btn1.rcopy");
		p.Btn1_del_dpt = p.beansFactory.createButton("Btn1.del_dpt");
		p.Btn1_can_del = p.beansFactory.createButton("Btn1.can_del");
	}

	/**
	 * [Dpt2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDpt2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Dpt2Panel = p.beansFactory.createPanel("Dpt2");
		p.Dpt2TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
		p.Hdr2_st_dt_Label = p.beansFactory.createLabel("Hdr2.st_dt_Label");
		p.Hdr2_st_dt = p.beansFactory.createDateField("Hdr2.st_dt");
		p.Hdr2_st_dt.setLabel(p.Hdr2_st_dt_Label);
		p.Hdr2_end_dt_Label = p.beansFactory.createLabel("Hdr2.end_dt_Label");
		p.Hdr2_end_dt = p.beansFactory.createDateField("Hdr2.end_dt");
		p.Hdr2_end_dt.setLabel(p.Hdr2_end_dt_Label);
		p.Hdr2_dpt_his_rmrks_Label = p.beansFactory.createLabel("Hdr2.dpt_his_rmrks_Label");
		p.Hdr2_dpt_his_rmrks = p.beansFactory.createTextField("Hdr2.dpt_his_rmrks");
		p.Hdr2_dpt_his_rmrks.setLabel(p.Hdr2_dpt_his_rmrks_Label);
	}

	/**
	 * [TreePnl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTreePnl2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.TreePnl2Panel = p.beansFactory.createPanel("TreePnl2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tree2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTree2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Tree2Panel = p.beansFactory.createPanel("Tree2");
		p.Tree2ScrollPane = p.beansFactory.createScrollPane("Tree2.scroll");
		p.Tree2Tree = p.beansFactory.createDandDTree("Tree2.tree");
		((MCTree64)p.Tree2Tree).delegate64 = getTree2Delegate();
		// ブロックの項目の初期化
	}

	protected static MCTree64Delegate getTree2Delegate() {
		return new mcframe.clientCore.beans.tree.MCTree64DefaultDelegate();
	}

	/**
	 * [TreeBtn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTreeBtn2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.TreeBtn2Panel = p.beansFactory.createPanel("TreeBtn2");
		// ブロックの項目の初期化
		p.TreeBtn2_view = p.beansFactory.createButton("TreeBtn2.view");
		p.TreeBtn2_expand = p.beansFactory.createButton("TreeBtn2.expand");
		p.TreeBtn2_collapse = p.beansFactory.createButton("TreeBtn2.collapse");
	}

	/**
	 * [DtlPnl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlPnl2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.DtlPnl2Panel = p.beansFactory.createPanel("DtlPnl2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_del_flg = p.beansFactory.createTableColumn("Dtl2.del_flg", MCColumnType.CHECK);
		p.columnDtl2_dpt_cd = p.beansFactory.createTableColumn("Dtl2.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_st_dt = p.beansFactory.createTableColumn("Dtl2.st_dt", MCColumnType.DATE);
		p.columnDtl2_end_dt = p.beansFactory.createTableColumn("Dtl2.end_dt", MCColumnType.DATE);
		p.columnDtl2_dpt_nm = p.beansFactory.createTableColumn("Dtl2.dpt_nm", MCColumnType.TEXT);
		p.columnDtl2_new_dpt_cd = p.beansFactory.createTableColumn("Dtl2.new_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_up_lv_dpt_cd = p.beansFactory.createTableColumn("Dtl2.up_lv_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_up_lv_dpt_nm = p.beansFactory.createTableColumn("Dtl2.up_lv_dpt_nm", MCColumnType.TEXT);
		p.columnDtl2_dpt_lvl_cd = p.beansFactory.createTableColumn("Dtl2.dpt_lvl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_dpt_lvl_nm = p.beansFactory.createTableColumn("Dtl2.dpt_lvl_nm", MCColumnType.TEXT);
		p.columnDtl2_set_addr = p.beansFactory.createTableColumn("Dtl2.set_addr", MCColumnType.BUTTON);
		p.columnDtl2_zip_cd = p.beansFactory.createTableColumn("Dtl2.zip_cd", MCColumnType.TEXT);
		p.columnDtl2_addr1 = p.beansFactory.createTableColumn("Dtl2.addr1", MCColumnType.TEXT);
		p.columnDtl2_addr2 = p.beansFactory.createTableColumn("Dtl2.addr2", MCColumnType.TEXT);
		p.columnDtl2_addr3 = p.beansFactory.createTableColumn("Dtl2.addr3", MCColumnType.TEXT);
		p.columnDtl2_addr4 = p.beansFactory.createTableColumn("Dtl2.addr4", MCColumnType.TEXT);
		p.columnDtl2_tel = p.beansFactory.createTableColumn("Dtl2.tel", MCColumnType.TEXT);
		p.columnDtl2_fax = p.beansFactory.createTableColumn("Dtl2.fax", MCColumnType.TEXT);
		p.columnDtl2_wg_cd = p.beansFactory.createTableColumn("Dtl2.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_wg_nm = p.beansFactory.createTableColumn("Dtl2.wg_nm", MCColumnType.TEXT);
		p.columnDtl2_sls_flg = p.beansFactory.createTableColumn("Dtl2.sls_flg", MCColumnType.CHECK);
		p.columnDtl2_lg_flg = p.beansFactory.createTableColumn("Dtl2.lg_flg", MCColumnType.CHECK);
		p.columnDtl2_mfg_flg = p.beansFactory.createTableColumn("Dtl2.mfg_flg", MCColumnType.CHECK);
		p.columnDtl2_purc_flg = p.beansFactory.createTableColumn("Dtl2.purc_flg", MCColumnType.CHECK);
		p.columnDtl2_ar_flg = p.beansFactory.createTableColumn("Dtl2.ar_flg", MCColumnType.CHECK);
		p.columnDtl2_ap_flg = p.beansFactory.createTableColumn("Dtl2.ap_flg", MCColumnType.CHECK);
		p.columnDtl2_sd_flg = p.beansFactory.createTableColumn("Dtl2.sd_flg", MCColumnType.CHECK);
		p.columnDtl2_rcv_bank_ac_cd = p.beansFactory.createTableColumn("Dtl2.rcv_bank_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_rcv_bank_ac_nm = p.beansFactory.createTableColumn("Dtl2.rcv_bank_ac_nm", MCColumnType.TEXT);
		p.columnDtl2_pay_bank_ac_cd = p.beansFactory.createTableColumn("Dtl2.pay_bank_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_pay_bank_ac_nm = p.beansFactory.createTableColumn("Dtl2.pay_bank_ac_nm", MCColumnType.TEXT);
		p.columnDtl2_cal_cd = p.beansFactory.createTableColumn("Dtl2.cal_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_cal_nm = p.beansFactory.createTableColumn("Dtl2.cal_nm", MCColumnType.TEXT);
		p.columnDtl2_asst_dpt_flg = p.beansFactory.createTableColumn("Dtl2.asst_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_ar_dpt_flg = p.beansFactory.createTableColumn("Dtl2.ar_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_ap_dpt_flg = p.beansFactory.createTableColumn("Dtl2.ap_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_sls_dpt_flg = p.beansFactory.createTableColumn("Dtl2.sls_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_purc_dpt_flg = p.beansFactory.createTableColumn("Dtl2.purc_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_ship_dpt_flg = p.beansFactory.createTableColumn("Dtl2.ship_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_arr_dpt_flg = p.beansFactory.createTableColumn("Dtl2.arr_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_mfg_dpt_flg = p.beansFactory.createTableColumn("Dtl2.mfg_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_sd_dpt_flg = p.beansFactory.createTableColumn("Dtl2.sd_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_insp_dpt_flg = p.beansFactory.createTableColumn("Dtl2.insp_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_bd_dpt_flg = p.beansFactory.createTableColumn("Dtl2.bd_dpt_flg", MCColumnType.CHECK);
		p.columnDtl2_cost_dpt_cd = p.beansFactory.createTableColumn("Dtl2.cost_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_cost_dpt_nm = p.beansFactory.createTableColumn("Dtl2.cost_dpt_nm", MCColumnType.TEXT);
		p.columnDtl2_ac_dpt_cd = p.beansFactory.createTableColumn("Dtl2.ac_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_ac_dpt_nm = p.beansFactory.createTableColumn("Dtl2.ac_dpt_nm", MCColumnType.TEXT);
		p.columnDtl2_memo1 = p.beansFactory.createTableColumn("Dtl2.memo1", MCColumnType.TEXT);
		p.columnDtl2_memo2 = p.beansFactory.createTableColumn("Dtl2.memo2", MCColumnType.TEXT);
		p.columnDtl2_memo3 = p.beansFactory.createTableColumn("Dtl2.memo3", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_id = p.beansFactory.createTableColumn("Dtl2.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_nm = p.beansFactory.createTableColumn("Dtl2.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_ts = p.beansFactory.createTableColumn("Dtl2.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_ins_func_id = p.beansFactory.createTableColumn("Dtl2.ins_func_id", MCColumnType.TEXT);
		p.columnDtl2_ins_func_nm = p.beansFactory.createTableColumn("Dtl2.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_usr_id = p.beansFactory.createTableColumn("Dtl2.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl2_upd_usr_nm = p.beansFactory.createTableColumn("Dtl2.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_ts = p.beansFactory.createTableColumn("Dtl2.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_func_id = p.beansFactory.createTableColumn("Dtl2.upd_func_id", MCColumnType.TEXT);
		p.columnDtl2_upd_func_nm = p.beansFactory.createTableColumn("Dtl2.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl2.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl2_del_usr_id = p.beansFactory.createTableColumn("Dtl2.del_usr_id", MCColumnType.TEXT);
		p.columnDtl2_del_usr_nm = p.beansFactory.createTableColumn("Dtl2.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_del_ts = p.beansFactory.createTableColumn("Dtl2.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Btn2Panel = p.beansFactory.createPanel("Btn2");
		// ブロックの項目の初期化
		p.Btn2_add_top = p.beansFactory.createButton("Btn2.add_top");
		p.Btn2_add_sub = p.beansFactory.createButton("Btn2.add_sub");
		p.Btn2_rcopy = p.beansFactory.createButton("Btn2.rcopy");
		p.Btn2_del_dpt = p.beansFactory.createButton("Btn2.del_dpt");
		p.Btn2_can_del = p.beansFactory.createButton("Btn2.can_del");
		p.Btn2_sync_flg = p.beansFactory.createCheckBox("Btn2.sync_flg");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_admin = p.beansFactory.createButton("Btn.upd_admin", "upd");
		p.Btn_inf_lbl = p.beansFactory.createLabel("Btn.inf_lbl");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.CndPnlPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0280.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [CndPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndPnl(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.CndPnlPanel.setBorder(p.CndPnlTitledBorder);
		p.add(p.CndPnlPanel);
		p.CndPnlPanel.setNextBeans(p.Dpt1Panel);
		p.CndPnlPanel.setLayoutPosition("NS+");
		// ブロックの項目の初期化
		p.CndPnlPanel.add(p.CndPanel, null);
		p.CndPnlPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.SrchBtnPanel);
		p.CndPnlPanel.add(p.SrchBtnPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("W");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_MOD);
		p.ScreenOpePanel.add(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setNextBeans(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD_ADMIN);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setNextBeans(p.Cnd_ope_CNG);
		p.Cnd_ope_CNG.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_CNG);
		p.ScreenOpePanel.add(p.Cnd_ope_CNG);
		p.Cnd_ope_CNG.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0280.CndR.ope_META);
		p.Cnd_st_dt.setListType(MCListType.STRICT);
		p.Cnd_st_dt.setLinkBeans(p.Cnd_end_dt,p.Cnd_dpt_his_rmrks);
		p.CndPanel.add(p.Cnd_st_dt_Label);
		p.CndPanel.add(p.Cnd_st_dt);
		p.CndPanel.setLastBeans(p.Cnd_st_dt);
		p.Cnd_st_dt.setNextBeans(p.Cnd_end_dt);
		p.Cnd_st_dt.setRow(p.getCndR(), mcframe.clientMABC.MABCP0280.CndR.st_dt_META);
		p.Cnd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_end_dt_Label);
		p.CndPanel.add(p.Cnd_end_dt);
		p.Cnd_end_dt.setNextBeans(p.Cnd_dpt_his_rmrks);
		p.Cnd_end_dt.setRow(p.getCndR(), mcframe.clientMABC.MABCP0280.CndR.end_dt_META);
		p.Cnd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dpt_his_rmrks);
		p.Cnd_dpt_his_rmrks.setNextBeans(p.Cnd_del_flg);
		p.Cnd_dpt_his_rmrks.setRow(p.getCndR(), mcframe.clientMABC.MABCP0280.CndR.dpt_his_rmrks_META);
		p.CndPanel.add(p.Cnd_del_flg);
		p.Cnd_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0280.CndR.del_flg_META);
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("E");
		// ブロックの項目の初期化
		p.SrchBtn_srch.setIcon("SEARCH");
		p.SrchBtn_srch.setFunctionKey(MCFunctionKey.F1);
		p.SrchBtnPanel.add(p.SrchBtn_srch);
		p.SrchBtnPanel.setLastBeans(p.SrchBtn_srch);
	}

	/**
	 * [Dpt1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDpt1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Dpt1Panel.setBorder(p.Dpt1TitledBorder);
		p.add(p.Dpt1Panel);
		p.Dpt1Panel.setNextBeans(p.Dpt2Panel);
		p.Dpt1Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Dpt1Panel.add(p.Hdr1Panel, null);
		p.Dpt1Panel.setLastBeans(p.Hdr1Panel);
		p.Hdr1Panel.setNextBeans(p.TreePnl1Panel);
		p.Dpt1Panel.add(p.TreePnl1Panel, null);
		p.TreePnl1Panel.setNextBeans(p.DtlPnl1Panel);
		p.Dpt1Panel.add(p.DtlPnl1Panel, null);
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Hdr1Panel.add(p.Hdr1_st_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_st_dt);
		p.Hdr1Panel.setLastBeans(p.Hdr1_st_dt);
		p.Hdr1_st_dt.setNextBeans(p.Hdr1_end_dt);
		p.Hdr1_st_dt.setRow(p.getHdr1R(), mcframe.clientMABC.MABCP0280.Hdr1R.st_dt_META);
		p.Hdr1_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_end_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_end_dt);
		p.Hdr1_end_dt.setNextBeans(p.Hdr1_dpt_his_rmrks);
		p.Hdr1_end_dt.setRow(p.getHdr1R(), mcframe.clientMABC.MABCP0280.Hdr1R.end_dt_META);
		p.Hdr1_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_dpt_his_rmrks_Label);
		p.Hdr1Panel.add(p.Hdr1_dpt_his_rmrks);
		p.Hdr1_dpt_his_rmrks.setRow(p.getHdr1R(), mcframe.clientMABC.MABCP0280.Hdr1R.dpt_his_rmrks_META);
	}

	/**
	 * [TreePnl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTreePnl1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.TreePnl1Panel.setLayoutPosition("CLC+");
		// ブロックの項目の初期化
		p.TreePnl1Panel.add(p.Tree1Panel, null);
		p.TreePnl1Panel.setLastBeans(p.Tree1Panel);
		p.Tree1Panel.setNextBeans(p.TreeBtn1Panel);
		p.TreePnl1Panel.add(p.TreeBtn1Panel, null);
	}

	/**
	 * [Tree1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTree1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Tree1Panel.add(p.Tree1ScrollPane);
		p.Tree1Panel.setLastBeans(p.Tree1Tree);
		p.Tree1ScrollPane.setViewportView(p.Tree1Tree);
		p.Tree1Tree.setList(p.getTree1L());
		p.Tree1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [TreeBtn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTreeBtn1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.TreeBtn1Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.TreeBtn1Panel.add(p.TreeBtn1_view);
		p.TreeBtn1Panel.setLastBeans(p.TreeBtn1_view);
		p.TreeBtn1_view.setNextBeans(p.TreeBtn1_expand);
		p.TreeBtn1Panel.add(p.TreeBtn1_expand);
		p.TreeBtn1_expand.setNextBeans(p.TreeBtn1_collapse);
		p.TreeBtn1Panel.add(p.TreeBtn1_collapse);
	}

	/**
	 * [DtlPnl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlPnl1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.DtlPnl1Panel.setLayoutPosition("CRC+");
		// ブロックの項目の初期化
		p.DtlPnl1Panel.add(p.DtlPanel, null);
		p.DtlPnl1Panel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.Btn1Panel);
		p.DtlPnl1Panel.add(p.Btn1Panel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn1(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Btn1Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn1_select_all.setIcon("SELECT_ALL");
		p.Btn1_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Btn1Panel.add(p.Btn1_select_all);
		p.Btn1Panel.setLastBeans(p.Btn1_select_all);
		p.Btn1_select_all.setNextBeans(p.Btn1_deselect_all);
		p.Btn1_deselect_all.setIcon("DESELECT_ALL");
		p.Btn1_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Btn1Panel.add(p.Btn1_deselect_all);
		p.Btn1_deselect_all.setNextBeans(p.Btn1_add_top);
		p.Btn1_add_top.setFunctionKey(MCFunctionKey.F3);
		p.Btn1Panel.add(p.Btn1_add_top);
		p.Btn1_add_top.setNextBeans(p.Btn1_add_sub);
		p.Btn1_add_sub.setFunctionKey(MCFunctionKey.F4);
		p.Btn1Panel.add(p.Btn1_add_sub);
		p.Btn1_add_sub.setNextBeans(p.Btn1_rcopy);
		p.Btn1_rcopy.setFunctionKey(MCFunctionKey.F5);
		p.Btn1Panel.add(p.Btn1_rcopy);
		p.Btn1_rcopy.setNextBeans(p.Btn1_del_dpt);
		p.Btn1_del_dpt.setFunctionKey(MCFunctionKey.F6);
		p.Btn1Panel.add(p.Btn1_del_dpt);
		p.Btn1_del_dpt.setNextBeans(p.Btn1_can_del);
		p.Btn1_can_del.setFunctionKey(MCFunctionKey.F7);
		p.Btn1Panel.add(p.Btn1_can_del);
	}

	/**
	 * [Dpt2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDpt2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Dpt2Panel.setBorder(p.Dpt2TitledBorder);
		p.add(p.Dpt2Panel);
		p.Dpt2Panel.setNextBeans(p.BtnPanel);
		p.Dpt2Panel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.Dpt2Panel.add(p.Hdr2Panel, null);
		p.Dpt2Panel.setLastBeans(p.Hdr2Panel);
		p.Hdr2Panel.setNextBeans(p.TreePnl2Panel);
		p.Dpt2Panel.add(p.TreePnl2Panel, null);
		p.TreePnl2Panel.setNextBeans(p.DtlPnl2Panel);
		p.Dpt2Panel.add(p.DtlPnl2Panel, null);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Hdr2Panel.add(p.Hdr2_st_dt_Label);
		p.Hdr2Panel.add(p.Hdr2_st_dt);
		p.Hdr2Panel.setLastBeans(p.Hdr2_st_dt);
		p.Hdr2_st_dt.setNextBeans(p.Hdr2_end_dt);
		p.Hdr2_st_dt.setRow(p.getHdr2R(), mcframe.clientMABC.MABCP0280.Hdr1R.st_dt_META);
		p.Hdr2_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr2Panel.add(p.Hdr2_end_dt_Label);
		p.Hdr2Panel.add(p.Hdr2_end_dt);
		p.Hdr2_end_dt.setNextBeans(p.Hdr2_dpt_his_rmrks);
		p.Hdr2_end_dt.setRow(p.getHdr2R(), mcframe.clientMABC.MABCP0280.Hdr1R.end_dt_META);
		p.Hdr2_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr2Panel.add(p.Hdr2_dpt_his_rmrks_Label);
		p.Hdr2Panel.add(p.Hdr2_dpt_his_rmrks);
		p.Hdr2_dpt_his_rmrks.setRow(p.getHdr2R(), mcframe.clientMABC.MABCP0280.Hdr1R.dpt_his_rmrks_META);
	}

	/**
	 * [TreePnl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTreePnl2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.TreePnl2Panel.setLayoutPosition("CLC+");
		// ブロックの項目の初期化
		p.TreePnl2Panel.add(p.Tree2Panel, null);
		p.TreePnl2Panel.setLastBeans(p.Tree2Panel);
		p.Tree2Panel.setNextBeans(p.TreeBtn2Panel);
		p.TreePnl2Panel.add(p.TreeBtn2Panel, null);
	}

	/**
	 * [Tree2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTree2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Tree2Panel.add(p.Tree2ScrollPane);
		p.Tree2Panel.setLastBeans(p.Tree2Tree);
		p.Tree2ScrollPane.setViewportView(p.Tree2Tree);
		p.Tree2Tree.setList(p.getTree2L());
		p.Tree2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [TreeBtn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTreeBtn2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.TreeBtn2Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.TreeBtn2Panel.add(p.TreeBtn2_view);
		p.TreeBtn2Panel.setLastBeans(p.TreeBtn2_view);
		p.TreeBtn2_view.setNextBeans(p.TreeBtn2_expand);
		p.TreeBtn2Panel.add(p.TreeBtn2_expand);
		p.TreeBtn2_expand.setNextBeans(p.TreeBtn2_collapse);
		p.TreeBtn2Panel.add(p.TreeBtn2_collapse);
	}

	/**
	 * [DtlPnl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlPnl2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.DtlPnl2Panel.setLayoutPosition("CRC+");
		// ブロックの項目の初期化
		p.DtlPnl2Panel.add(p.Dtl2Panel, null);
		p.DtlPnl2Panel.setLastBeans(p.Dtl2Panel);
		p.Dtl2Panel.setNextBeans(p.Btn2Panel);
		p.DtlPnl2Panel.add(p.Btn2Panel, null);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn2(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.Btn2Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn2_add_top.setFunctionKey(MCFunctionKey.F15);
		p.Btn2Panel.add(p.Btn2_add_top);
		p.Btn2Panel.setLastBeans(p.Btn2_add_top);
		p.Btn2_add_top.setNextBeans(p.Btn2_add_sub);
		p.Btn2_add_sub.setFunctionKey(MCFunctionKey.F16);
		p.Btn2Panel.add(p.Btn2_add_sub);
		p.Btn2_add_sub.setNextBeans(p.Btn2_rcopy);
		p.Btn2_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Btn2Panel.add(p.Btn2_rcopy);
		p.Btn2_rcopy.setNextBeans(p.Btn2_del_dpt);
		p.Btn2_del_dpt.setFunctionKey(MCFunctionKey.F18);
		p.Btn2Panel.add(p.Btn2_del_dpt);
		p.Btn2_del_dpt.setNextBeans(p.Btn2_can_del);
		p.Btn2_can_del.setFunctionKey(MCFunctionKey.F19);
		p.Btn2Panel.add(p.Btn2_can_del);
		p.Btn2_can_del.setNextBeans(p.Btn2_sync_flg);
		p.Btn2Panel.add(p.Btn2_sync_flg);
		p.Btn2_sync_flg.setRow(p.getBtn2R(), mcframe.clientMABC.MABCP0280.Btn2R.sync_flg_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_DptReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd_admin);
		p.Btn_upd_admin.setIcon("REGISTER");
		p.Btn_upd_admin.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_admin);
		p.BtnPanel.add(p.Btn_inf_lbl);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_DptReg p) {
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
		MABCP_DptReg_MC.mcInitScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitMst((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitCndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitCnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitSrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitDpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitHdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitTreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitTree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitTreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitDtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitDtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitDpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitHdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitTreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitTree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitTreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitDtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitDtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.mcInitEastBtn((MABCP_DptReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_DptReg_MC.statusInitFIX_ScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Mst((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_CndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Cnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_SrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Dpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Hdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_TreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Tree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_TreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_DtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Dtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Btn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Dpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Hdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_TreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Tree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_TreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_DtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Dtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Btn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_Btn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_EastBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_DptHis((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitFIX_DptMap((MABCP_DptReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_DptReg_MC.statusInitUPD_ScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Mst((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_CndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Cnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_SrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Dpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Hdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_TreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Tree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_TreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_DtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Dtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Btn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Dpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Hdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_TreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Tree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_TreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_DtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Dtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Btn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_Btn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_EastBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_DptHis((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD_DptMap((MABCP_DptReg)this);

		// [MOD]ステータスのモードの設定
		MABCP_DptReg_MC.statusInitMOD_ScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Mst((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_CndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Cnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_SrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Dpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Hdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_TreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Tree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_TreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_DtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Dtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Btn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Dpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Hdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_TreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Tree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_TreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_DtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Dtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Btn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_Btn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_EastBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_DptHis((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitMOD_DptMap((MABCP_DptReg)this);

		// [UPD_ADMIN]ステータスのモードの設定
		MABCP_DptReg_MC.statusInitUPD__ADMIN_ScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Mst((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_CndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Cnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_SrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Dpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Hdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_TreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Tree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_TreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_DtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Dtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Btn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Dpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Hdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_TreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Tree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_TreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_DtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Dtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Btn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_Btn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_EastBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_DptHis((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitUPD__ADMIN_DptMap((MABCP_DptReg)this);

		// [CNG]ステータスのモードの設定
		MABCP_DptReg_MC.statusInitCNG_ScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Mst((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_CndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Cnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_SrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Dpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Hdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_TreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Tree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_TreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_DtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Dtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Btn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Dpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Hdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_TreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Tree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_TreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_DtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Dtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Btn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_Btn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_EastBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_DptHis((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitCNG_DptMap((MABCP_DptReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_DptReg_MC.statusInitDEL_ScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Mst((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_CndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Cnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_SrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Dpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Hdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_TreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Tree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_TreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_DtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Dtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Btn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Dpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Hdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_TreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Tree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_TreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_DtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Dtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Btn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_Btn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_EastBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_DptHis((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitDEL_DptMap((MABCP_DptReg)this);

		// [REF]ステータスのモードの設定
		MABCP_DptReg_MC.statusInitREF_ScreenOpe((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Mst((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_CndPnl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Cnd((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_SrchBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Dpt1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Hdr1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_TreePnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Tree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_TreeBtn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_DtlPnl1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Dtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Btn1((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Dpt2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Hdr2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_TreePnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Tree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_TreeBtn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_DtlPnl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Dtl2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Btn2((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_Btn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_EastBtn((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_DptHis((MABCP_DptReg)this);
		MABCP_DptReg_MC.statusInitREF_DptMap((MABCP_DptReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_DptReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_DptReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [CndPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndPnl(MABCP_DptReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_DptReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_UPD_ADMIN.addAllListener(p);
		p.Cnd_ope_CNG.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_st_dt.setListListener(p);
		p.Cnd_st_dt.addAllListener(p);
		p.Cnd_end_dt.setListListener(p);
		p.Cnd_end_dt.addAllListener(p);
		p.Cnd_dpt_his_rmrks.setListListener(p);
		p.Cnd_dpt_his_rmrks.addAllListener(p);
		p.Cnd_del_flg.addAllListener(p);
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MABCP_DptReg p) {
		p.SrchBtn_srch.addAllListener(p);
		p.SrchBtn_srch.setAPMethodName("doSrchBtn_srch");
	}

	/**
	 *  [Dpt1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDpt1(MABCP_DptReg p) {
	}

	/**
	 *  [Hdr1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr1(MABCP_DptReg p) {
		p.Hdr1_st_dt.setListListener(p);
		p.Hdr1_st_dt.addAllListener(p);
		p.Hdr1_end_dt.setListListener(p);
		p.Hdr1_end_dt.addAllListener(p);
		p.Hdr1_dpt_his_rmrks.setListListener(p);
		p.Hdr1_dpt_his_rmrks.addAllListener(p);
	}

	/**
	 *  [TreePnl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTreePnl1(MABCP_DptReg p) {
	}

	/**
	 *  [Tree1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTree1(MABCP_DptReg p) {
		p.Tree1Tree.addAllListener(p);
	}

	/**
	 *  [TreeBtn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTreeBtn1(MABCP_DptReg p) {
		p.TreeBtn1_view.addAllListener(p);
		p.TreeBtn1_view.setAPMethodName("doTreeBtn1_view");
		p.TreeBtn1_expand.addAllListener(p);
		p.TreeBtn1_expand.setAPMethodName("doTreeBtn1_expand");
		p.TreeBtn1_collapse.addAllListener(p);
		p.TreeBtn1_collapse.setAPMethodName("doTreeBtn1_collapse");
	}

	/**
	 *  [DtlPnl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlPnl1(MABCP_DptReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_DptReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_dpt_cd.addAllListener(p);
		p.columnDtl_dpt_cd.setListListener(p);
		p.columnDtl_st_dt.addAllListener(p);
		p.columnDtl_st_dt.setListListener(p);
		p.columnDtl_end_dt.addAllListener(p);
		p.columnDtl_end_dt.setListListener(p);
		p.columnDtl_dpt_nm_lcl.addAllListener(p);
		p.columnDtl_dpt_nm_lcl.setListListener(p);
		p.columnDtl_dpt_nm.addAllListener(p);
		p.columnDtl_dpt_nm.setListListener(p);
		p.columnDtl_new_dpt_cd.addAllListener(p);
		p.columnDtl_new_dpt_cd.setListListener(p);
		p.columnDtl_up_lv_dpt_cd.addAllListener(p);
		p.columnDtl_up_lv_dpt_cd.setListListener(p);
		p.columnDtl_up_lv_dpt_nm.addAllListener(p);
		p.columnDtl_up_lv_dpt_nm.setListListener(p);
		p.columnDtl_dpt_lvl_cd.addAllListener(p);
		p.columnDtl_dpt_lvl_cd.setListListener(p);
		p.columnDtl_dpt_lvl_nm.addAllListener(p);
		p.columnDtl_dpt_lvl_nm.setListListener(p);
		p.columnDtl_set_addr.addAllListener(p);
		p.columnDtl_set_addr.setAPMethodName("doDtl_set_addr");
		p.columnDtl_zip_cd.addAllListener(p);
		p.columnDtl_zip_cd.setListListener(p);
		p.columnDtl_addr1.addAllListener(p);
		p.columnDtl_addr1.setListListener(p);
		p.columnDtl_addr2.addAllListener(p);
		p.columnDtl_addr2.setListListener(p);
		p.columnDtl_addr3.addAllListener(p);
		p.columnDtl_addr3.setListListener(p);
		p.columnDtl_addr4.addAllListener(p);
		p.columnDtl_addr4.setListListener(p);
		p.columnDtl_tel.addAllListener(p);
		p.columnDtl_tel.setListListener(p);
		p.columnDtl_fax.addAllListener(p);
		p.columnDtl_fax.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_sls_flg.addAllListener(p);
		p.columnDtl_lg_flg.addAllListener(p);
		p.columnDtl_mfg_flg.addAllListener(p);
		p.columnDtl_purc_flg.addAllListener(p);
		p.columnDtl_ar_flg.addAllListener(p);
		p.columnDtl_ap_flg.addAllListener(p);
		p.columnDtl_sd_flg.addAllListener(p);
		p.columnDtl_rcv_bank_ac_cd.addAllListener(p);
		p.columnDtl_rcv_bank_ac_cd.setListListener(p);
		p.columnDtl_rcv_bank_ac_nm.addAllListener(p);
		p.columnDtl_rcv_bank_ac_nm.setListListener(p);
		p.columnDtl_pay_bank_ac_cd.addAllListener(p);
		p.columnDtl_pay_bank_ac_cd.setListListener(p);
		p.columnDtl_pay_bank_ac_nm.addAllListener(p);
		p.columnDtl_pay_bank_ac_nm.setListListener(p);
		p.columnDtl_cal_cd.addAllListener(p);
		p.columnDtl_cal_cd.setListListener(p);
		p.columnDtl_cal_nm.addAllListener(p);
		p.columnDtl_cal_nm.setListListener(p);
		p.columnDtl_asst_dpt_flg.addAllListener(p);
		p.columnDtl_ar_dpt_flg.addAllListener(p);
		p.columnDtl_ap_dpt_flg.addAllListener(p);
		p.columnDtl_sls_dpt_flg.addAllListener(p);
		p.columnDtl_purc_dpt_flg.addAllListener(p);
		p.columnDtl_ship_dpt_flg.addAllListener(p);
		p.columnDtl_arr_dpt_flg.addAllListener(p);
		p.columnDtl_mfg_dpt_flg.addAllListener(p);
		p.columnDtl_sd_dpt_flg.addAllListener(p);
		p.columnDtl_insp_dpt_flg.addAllListener(p);
		p.columnDtl_bd_dpt_flg.addAllListener(p);
		p.columnDtl_cost_dpt_cd.addAllListener(p);
		p.columnDtl_cost_dpt_cd.setListListener(p);
		p.columnDtl_cost_dpt_nm.addAllListener(p);
		p.columnDtl_cost_dpt_nm.setListListener(p);
		p.columnDtl_ac_dpt_cd.addAllListener(p);
		p.columnDtl_ac_dpt_cd.setListListener(p);
		p.columnDtl_ac_dpt_nm.addAllListener(p);
		p.columnDtl_ac_dpt_nm.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn1(MABCP_DptReg p) {
		p.Btn1_select_all.addAllListener(p);
		p.Btn1_select_all.setAPMethodName("doBtn1_select_all");
		p.Btn1_deselect_all.addAllListener(p);
		p.Btn1_deselect_all.setAPMethodName("doBtn1_deselect_all");
		p.Btn1_add_top.addAllListener(p);
		p.Btn1_add_top.setAPMethodName("doBtn1_add_top");
		p.Btn1_add_sub.addAllListener(p);
		p.Btn1_add_sub.setAPMethodName("doBtn1_add_sub");
		p.Btn1_rcopy.addAllListener(p);
		p.Btn1_rcopy.setAPMethodName("doBtn1_rcopy");
		p.Btn1_del_dpt.addAllListener(p);
		p.Btn1_del_dpt.setAPMethodName("doBtn1_del_dpt");
		p.Btn1_can_del.addAllListener(p);
		p.Btn1_can_del.setAPMethodName("doBtn1_can_del");
	}

	/**
	 *  [Dpt2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDpt2(MABCP_DptReg p) {
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MABCP_DptReg p) {
		p.Hdr2_st_dt.setListListener(p);
		p.Hdr2_st_dt.addAllListener(p);
		p.Hdr2_end_dt.setListListener(p);
		p.Hdr2_end_dt.addAllListener(p);
		p.Hdr2_dpt_his_rmrks.setListListener(p);
		p.Hdr2_dpt_his_rmrks.addAllListener(p);
	}

	/**
	 *  [TreePnl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTreePnl2(MABCP_DptReg p) {
	}

	/**
	 *  [Tree2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTree2(MABCP_DptReg p) {
		p.Tree2Tree.addAllListener(p);
	}

	/**
	 *  [TreeBtn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTreeBtn2(MABCP_DptReg p) {
		p.TreeBtn2_view.addAllListener(p);
		p.TreeBtn2_view.setAPMethodName("doTreeBtn2_view");
		p.TreeBtn2_expand.addAllListener(p);
		p.TreeBtn2_expand.setAPMethodName("doTreeBtn2_expand");
		p.TreeBtn2_collapse.addAllListener(p);
		p.TreeBtn2_collapse.setAPMethodName("doTreeBtn2_collapse");
	}

	/**
	 *  [DtlPnl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlPnl2(MABCP_DptReg p) {
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MABCP_DptReg p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_del_flg.addAllListener(p);
		p.columnDtl2_dpt_cd.addAllListener(p);
		p.columnDtl2_dpt_cd.setListListener(p);
		p.columnDtl2_st_dt.addAllListener(p);
		p.columnDtl2_st_dt.setListListener(p);
		p.columnDtl2_end_dt.addAllListener(p);
		p.columnDtl2_end_dt.setListListener(p);
		p.columnDtl2_dpt_nm.addAllListener(p);
		p.columnDtl2_dpt_nm.setListListener(p);
		p.columnDtl2_new_dpt_cd.addAllListener(p);
		p.columnDtl2_new_dpt_cd.setListListener(p);
		p.columnDtl2_up_lv_dpt_cd.addAllListener(p);
		p.columnDtl2_up_lv_dpt_cd.setListListener(p);
		p.columnDtl2_up_lv_dpt_nm.addAllListener(p);
		p.columnDtl2_up_lv_dpt_nm.setListListener(p);
		p.columnDtl2_dpt_lvl_cd.addAllListener(p);
		p.columnDtl2_dpt_lvl_cd.setListListener(p);
		p.columnDtl2_dpt_lvl_nm.addAllListener(p);
		p.columnDtl2_dpt_lvl_nm.setListListener(p);
		p.columnDtl2_set_addr.addAllListener(p);
		p.columnDtl2_set_addr.setAPMethodName("doDtl2_set_addr");
		p.columnDtl2_zip_cd.addAllListener(p);
		p.columnDtl2_zip_cd.setListListener(p);
		p.columnDtl2_addr1.addAllListener(p);
		p.columnDtl2_addr1.setListListener(p);
		p.columnDtl2_addr2.addAllListener(p);
		p.columnDtl2_addr2.setListListener(p);
		p.columnDtl2_addr3.addAllListener(p);
		p.columnDtl2_addr3.setListListener(p);
		p.columnDtl2_addr4.addAllListener(p);
		p.columnDtl2_addr4.setListListener(p);
		p.columnDtl2_tel.addAllListener(p);
		p.columnDtl2_tel.setListListener(p);
		p.columnDtl2_fax.addAllListener(p);
		p.columnDtl2_fax.setListListener(p);
		p.columnDtl2_wg_cd.addAllListener(p);
		p.columnDtl2_wg_cd.setListListener(p);
		p.columnDtl2_wg_nm.addAllListener(p);
		p.columnDtl2_wg_nm.setListListener(p);
		p.columnDtl2_sls_flg.addAllListener(p);
		p.columnDtl2_lg_flg.addAllListener(p);
		p.columnDtl2_mfg_flg.addAllListener(p);
		p.columnDtl2_purc_flg.addAllListener(p);
		p.columnDtl2_ar_flg.addAllListener(p);
		p.columnDtl2_ap_flg.addAllListener(p);
		p.columnDtl2_sd_flg.addAllListener(p);
		p.columnDtl2_rcv_bank_ac_cd.addAllListener(p);
		p.columnDtl2_rcv_bank_ac_cd.setListListener(p);
		p.columnDtl2_rcv_bank_ac_nm.addAllListener(p);
		p.columnDtl2_rcv_bank_ac_nm.setListListener(p);
		p.columnDtl2_pay_bank_ac_cd.addAllListener(p);
		p.columnDtl2_pay_bank_ac_cd.setListListener(p);
		p.columnDtl2_pay_bank_ac_nm.addAllListener(p);
		p.columnDtl2_pay_bank_ac_nm.setListListener(p);
		p.columnDtl2_cal_cd.addAllListener(p);
		p.columnDtl2_cal_cd.setListListener(p);
		p.columnDtl2_cal_nm.addAllListener(p);
		p.columnDtl2_cal_nm.setListListener(p);
		p.columnDtl2_asst_dpt_flg.addAllListener(p);
		p.columnDtl2_ar_dpt_flg.addAllListener(p);
		p.columnDtl2_ap_dpt_flg.addAllListener(p);
		p.columnDtl2_sls_dpt_flg.addAllListener(p);
		p.columnDtl2_purc_dpt_flg.addAllListener(p);
		p.columnDtl2_ship_dpt_flg.addAllListener(p);
		p.columnDtl2_arr_dpt_flg.addAllListener(p);
		p.columnDtl2_mfg_dpt_flg.addAllListener(p);
		p.columnDtl2_sd_dpt_flg.addAllListener(p);
		p.columnDtl2_insp_dpt_flg.addAllListener(p);
		p.columnDtl2_bd_dpt_flg.addAllListener(p);
		p.columnDtl2_cost_dpt_cd.addAllListener(p);
		p.columnDtl2_cost_dpt_cd.setListListener(p);
		p.columnDtl2_cost_dpt_nm.addAllListener(p);
		p.columnDtl2_cost_dpt_nm.setListListener(p);
		p.columnDtl2_ac_dpt_cd.addAllListener(p);
		p.columnDtl2_ac_dpt_cd.setListListener(p);
		p.columnDtl2_ac_dpt_nm.addAllListener(p);
		p.columnDtl2_ac_dpt_nm.setListListener(p);
		p.columnDtl2_memo1.addAllListener(p);
		p.columnDtl2_memo1.setListListener(p);
		p.columnDtl2_memo2.addAllListener(p);
		p.columnDtl2_memo2.setListListener(p);
		p.columnDtl2_memo3.addAllListener(p);
		p.columnDtl2_memo3.setListListener(p);
		p.columnDtl2_ins_usr_id.addAllListener(p);
		p.columnDtl2_ins_usr_id.setListListener(p);
		p.columnDtl2_ins_usr_nm.addAllListener(p);
		p.columnDtl2_ins_usr_nm.setListListener(p);
		p.columnDtl2_ins_ts.addAllListener(p);
		p.columnDtl2_ins_ts.setListListener(p);
		p.columnDtl2_ins_func_id.addAllListener(p);
		p.columnDtl2_ins_func_id.setListListener(p);
		p.columnDtl2_ins_func_nm.addAllListener(p);
		p.columnDtl2_ins_func_nm.setListListener(p);
		p.columnDtl2_upd_usr_id.addAllListener(p);
		p.columnDtl2_upd_usr_id.setListListener(p);
		p.columnDtl2_upd_usr_nm.addAllListener(p);
		p.columnDtl2_upd_usr_nm.setListListener(p);
		p.columnDtl2_upd_ts.addAllListener(p);
		p.columnDtl2_upd_ts.setListListener(p);
		p.columnDtl2_upd_func_id.addAllListener(p);
		p.columnDtl2_upd_func_id.setListListener(p);
		p.columnDtl2_upd_func_nm.addAllListener(p);
		p.columnDtl2_upd_func_nm.setListListener(p);
		p.columnDtl2_upd_srv_req_no.addAllListener(p);
		p.columnDtl2_upd_srv_req_no.setListListener(p);
		p.columnDtl2_del_usr_id.addAllListener(p);
		p.columnDtl2_del_usr_id.setListListener(p);
		p.columnDtl2_del_usr_nm.addAllListener(p);
		p.columnDtl2_del_usr_nm.setListListener(p);
		p.columnDtl2_del_ts.addAllListener(p);
		p.columnDtl2_del_ts.setListListener(p);
	}

	/**
	 *  [Btn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn2(MABCP_DptReg p) {
		p.Btn2_add_top.addAllListener(p);
		p.Btn2_add_top.setAPMethodName("doBtn2_add_top");
		p.Btn2_add_sub.addAllListener(p);
		p.Btn2_add_sub.setAPMethodName("doBtn2_add_sub");
		p.Btn2_rcopy.addAllListener(p);
		p.Btn2_rcopy.setAPMethodName("doBtn2_rcopy");
		p.Btn2_del_dpt.addAllListener(p);
		p.Btn2_del_dpt.setAPMethodName("doBtn2_del_dpt");
		p.Btn2_can_del.addAllListener(p);
		p.Btn2_can_del.setAPMethodName("doBtn2_can_del");
		p.Btn2_sync_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_DptReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_admin.addAllListener(p);
		p.Btn_upd_admin.setAPMethodName("doBtn_upd_admin");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_DptReg p) {
	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_DptReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndPnl(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_DptReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_st_dt.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_dpt_his_rmrks.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, FIX, MCMode.REQUIRED);

	}

	/**
	 * [FIX]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SrchBtn(MABCP_DptReg p){
		p.SrchBtn_srch.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Dpt1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dpt1(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr1(MABCP_DptReg p){
		p.Hdr1_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_dpt_his_rmrks.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[TreePnl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TreePnl1(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[Tree1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tree1(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[TreeBtn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TreeBtn1(MABCP_DptReg p){
		p.TreeBtn1_view.putMode(p, FIX, MCMode.DISABLE);
		p.TreeBtn1_expand.putMode(p, FIX, MCMode.DISABLE);
		p.TreeBtn1_collapse.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[DtlPnl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlPnl1(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_DptReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_st_dt.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_end_dt.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_new_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_set_addr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ar_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ap_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sd_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcv_bank_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rcv_bank_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_arr_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sd_dpt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_insp_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cost_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cost_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn1(MABCP_DptReg p){
		p.Btn1_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_add_sub.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_del_dpt.putMode(p, FIX, MCMode.DISABLE);
		p.Btn1_can_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dpt2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dpt2(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr2(MABCP_DptReg p){
		p.Hdr2_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr2_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr2_dpt_his_rmrks.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[TreePnl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TreePnl2(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[Tree2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tree2(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[TreeBtn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TreeBtn2(MABCP_DptReg p){
		p.TreeBtn2_view.putMode(p, FIX, MCMode.DISABLE);
		p.TreeBtn2_expand.putMode(p, FIX, MCMode.DISABLE);
		p.TreeBtn2_collapse.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[DtlPnl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlPnl2(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl2(MABCP_DptReg p){
		p.columnDtl2_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_st_dt.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_end_dt.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_new_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_set_addr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_fax.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_sls_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_lg_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_mfg_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_purc_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_ar_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_ap_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_sd_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_rcv_bank_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_rcv_bank_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_asst_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ar_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ap_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_sls_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ship_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_arr_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_mfg_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_sd_dpt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl2_insp_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_bd_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl2_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn2(MABCP_DptReg p){
		p.Btn2_add_top.putMode(p, FIX, MCMode.DISABLE);
		p.Btn2_add_sub.putMode(p, FIX, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn2_del_dpt.putMode(p, FIX, MCMode.DISABLE);
		p.Btn2_can_del.putMode(p, FIX, MCMode.DISABLE);
		p.Btn2_sync_flg.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_DptReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, FIX, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, FIX, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[DptHis]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DptHis(MABCP_DptReg p){

	}

	/**
	 * [FIX]ステータスの[DptMap]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DptMap(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_DptReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndPnl(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_DptReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_st_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_end_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dpt_his_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SrchBtn(MABCP_DptReg p){
		p.SrchBtn_srch.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dpt1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dpt1(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr1(MABCP_DptReg p){
		p.Hdr1_st_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_end_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_dpt_his_rmrks.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[TreePnl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TreePnl1(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[Tree1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tree1(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[TreeBtn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TreeBtn1(MABCP_DptReg p){
		p.TreeBtn1_view.putMode(p, UPD, MCMode.ENABLE);
		p.TreeBtn1_expand.putMode(p, UPD, MCMode.ENABLE);
		p.TreeBtn1_collapse.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[DtlPnl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlPnl1(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_DptReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_st_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_end_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_new_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_up_lv_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dpt_lvl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_set_addr.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tel.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_fax.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ar_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ap_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcv_bank_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rcv_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_pay_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ar_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_arr_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_mfg_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sd_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_insp_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cost_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cost_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ac_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn1(MABCP_DptReg p){
		p.Btn1_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_add_sub.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_del_dpt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn1_can_del.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dpt2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dpt2(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MABCP_DptReg p){
		p.Hdr2_st_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr2_end_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr2_dpt_his_rmrks.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[TreePnl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TreePnl2(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[Tree2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tree2(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[TreeBtn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TreeBtn2(MABCP_DptReg p){
		p.TreeBtn2_view.putMode(p, UPD, MCMode.DISABLE);
		p.TreeBtn2_expand.putMode(p, UPD, MCMode.DISABLE);
		p.TreeBtn2_collapse.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[DtlPnl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlPnl2(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MABCP_DptReg p){
		p.columnDtl2_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_st_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_end_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_new_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_set_addr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_zip_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_addr1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_addr2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_addr3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_addr4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_tel.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_fax.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_sls_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_lg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_mfg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_ar_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_ap_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_rcv_bank_ac_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_rcv_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_cal_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_asst_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ar_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ap_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_sls_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ship_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_arr_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_mfg_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_sd_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_insp_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_bd_dpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_memo3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn2(MABCP_DptReg p){
		p.Btn2_add_top.putMode(p, UPD, MCMode.DISABLE);
		p.Btn2_add_sub.putMode(p, UPD, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, UPD, MCMode.DISABLE);
		p.Btn2_del_dpt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn2_can_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn2_sync_flg.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_DptReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_admin.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, UPD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[DptHis]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DptHis(MABCP_DptReg p){

	}

	/**
	 * [UPD]ステータスの[DptMap]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DptMap(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ScreenOpe(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Mst(MABCP_DptReg p){
		p.Mst_mst_set_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_CndPnl(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Cnd(MABCP_DptReg p){
		p.Cnd_ope_Group.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_st_dt.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_end_dt.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_dpt_his_rmrks.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, MOD, MCMode.REQUIRED);

	}

	/**
	 * [MOD]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_SrchBtn(MABCP_DptReg p){
		p.SrchBtn_srch.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Dpt1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dpt1(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr1(MABCP_DptReg p){
		p.Hdr1_st_dt.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr1_end_dt.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr1_dpt_his_rmrks.putMode(p, MOD, MCMode.REQUIRED);

	}

	/**
	 * [MOD]ステータスの[TreePnl1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_TreePnl1(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[Tree1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Tree1(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[TreeBtn1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_TreeBtn1(MABCP_DptReg p){
		p.TreeBtn1_view.putMode(p, MOD, MCMode.ENABLE);
		p.TreeBtn1_expand.putMode(p, MOD, MCMode.ENABLE);
		p.TreeBtn1_collapse.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[DtlPnl1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_DtlPnl1(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl(MABCP_DptReg p){
		p.columnDtl_check.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_st_dt.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_end_dt.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm_lcl.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_new_dpt_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_up_lv_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_dpt_lvl_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_set_addr.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_zip_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_addr1.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_addr2.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_addr3.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_addr4.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_tel.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_fax.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_wg_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_wg_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_ar_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_ap_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_sd_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_rcv_bank_ac_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_rcv_bank_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_pay_bank_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_cal_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_ar_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_sls_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_purc_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_ship_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_arr_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_mfg_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_sd_dpt_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_insp_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_cost_dpt_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_cost_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_ac_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);

	}

	/**
	 * [MOD]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn1(MABCP_DptReg p){
		p.Btn1_select_all.putMode(p, MOD, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, MOD, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, MOD, MCMode.ENABLE);
		p.Btn1_add_sub.putMode(p, MOD, MCMode.ENABLE);
		p.Btn1_rcopy.putMode(p, MOD, MCMode.ENABLE);
		p.Btn1_del_dpt.putMode(p, MOD, MCMode.ENABLE);
		p.Btn1_can_del.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Dpt2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dpt2(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr2(MABCP_DptReg p){
		p.Hdr2_st_dt.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr2_end_dt.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr2_dpt_his_rmrks.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[TreePnl2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_TreePnl2(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[Tree2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Tree2(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[TreeBtn2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_TreeBtn2(MABCP_DptReg p){
		p.TreeBtn2_view.putMode(p, MOD, MCMode.DISABLE);
		p.TreeBtn2_expand.putMode(p, MOD, MCMode.DISABLE);
		p.TreeBtn2_collapse.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[DtlPnl2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_DtlPnl2(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl2(MABCP_DptReg p){
		p.columnDtl2_del_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_dpt_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_st_dt.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_end_dt.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_new_dpt_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_set_addr.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_zip_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_addr1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_addr2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_addr3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_addr4.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_tel.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_fax.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_wg_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_wg_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_sls_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_lg_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_mfg_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_purc_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_ar_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_ap_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_sd_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_rcv_bank_ac_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_rcv_bank_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_cal_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_cal_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_asst_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ar_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ap_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_sls_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ship_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_arr_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_mfg_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_sd_dpt_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl2_insp_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_bd_dpt_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_memo1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_memo2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_memo3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl2_del_ts.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn2(MABCP_DptReg p){
		p.Btn2_add_top.putMode(p, MOD, MCMode.DISABLE);
		p.Btn2_add_sub.putMode(p, MOD, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, MOD, MCMode.DISABLE);
		p.Btn2_del_dpt.putMode(p, MOD, MCMode.DISABLE);
		p.Btn2_can_del.putMode(p, MOD, MCMode.DISABLE);
		p.Btn2_sync_flg.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn(MABCP_DptReg p){
		p.Btn_upd.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_upd_admin.putMode(p, MOD, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, MOD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_EastBtn(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[DptHis]ブロックのモードの設定
	 */
	protected static void statusInitMOD_DptHis(MABCP_DptReg p){

	}

	/**
	 * [MOD]ステータスの[DptMap]ブロックのモードの設定
	 */
	protected static void statusInitMOD_DptMap(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_ScreenOpe(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Mst(MABCP_DptReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_CndPnl(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Cnd(MABCP_DptReg p){
		p.Cnd_ope_Group.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Cnd_st_dt.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Cnd_end_dt.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Cnd_dpt_his_rmrks.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);

	}

	/**
	 * [UPD_ADMIN]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_SrchBtn(MABCP_DptReg p){
		p.SrchBtn_srch.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Dpt1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Dpt1(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Hdr1(MABCP_DptReg p){
		p.Hdr1_st_dt.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Hdr1_end_dt.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Hdr1_dpt_his_rmrks.putMode(p, UPD_ADMIN, MCMode.REQUIRED);

	}

	/**
	 * [UPD_ADMIN]ステータスの[TreePnl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_TreePnl1(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Tree1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Tree1(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[TreeBtn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_TreeBtn1(MABCP_DptReg p){
		p.TreeBtn1_view.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.TreeBtn1_expand.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.TreeBtn1_collapse.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlPnl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlPnl1(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Dtl(MABCP_DptReg p){
		p.columnDtl_check.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_st_dt.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_end_dt.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm_lcl.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_new_dpt_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_up_lv_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_dpt_lvl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_set_addr.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_zip_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_addr1.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_addr2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_addr3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_addr4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_tel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_fax.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_wg_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_wg_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ar_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ap_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sd_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcv_bank_ac_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_rcv_bank_ac_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_pay_bank_ac_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ar_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sls_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_purc_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ship_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_arr_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_mfg_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sd_dpt_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_insp_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_cost_dpt_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_cost_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ac_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Btn1(MABCP_DptReg p){
		p.Btn1_select_all.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Btn1_add_sub.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Btn1_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Btn1_del_dpt.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Btn1_can_del.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Dpt2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Dpt2(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Hdr2(MABCP_DptReg p){
		p.Hdr2_st_dt.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Hdr2_end_dt.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Hdr2_dpt_his_rmrks.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[TreePnl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_TreePnl2(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Tree2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Tree2(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[TreeBtn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_TreeBtn2(MABCP_DptReg p){
		p.TreeBtn2_view.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.TreeBtn2_expand.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.TreeBtn2_collapse.putMode(p, UPD_ADMIN, MCMode.DISABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlPnl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlPnl2(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Dtl2(MABCP_DptReg p){
		p.columnDtl2_del_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_dpt_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_st_dt.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_end_dt.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_new_dpt_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_set_addr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_zip_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_addr1.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_addr2.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_addr3.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_addr4.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_tel.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_fax.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_wg_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_wg_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sls_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_lg_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_mfg_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_purc_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_ar_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_ap_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_sd_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_rcv_bank_ac_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_rcv_bank_ac_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_cal_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_asst_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ar_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ap_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sls_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ship_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_arr_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_mfg_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sd_dpt_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_insp_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_bd_dpt_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_memo1.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_memo2.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_memo3.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_del_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Btn2(MABCP_DptReg p){
		p.Btn2_add_top.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.Btn2_add_sub.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.Btn2_del_dpt.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.Btn2_can_del.putMode(p, UPD_ADMIN, MCMode.DISABLE);
		p.Btn2_sync_flg.putMode(p, UPD_ADMIN, MCMode.DISABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Btn(MABCP_DptReg p){
		p.Btn_upd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.Btn_upd_admin.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Btn_inf_lbl.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, UPD_ADMIN, MCMode.DISABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_EastBtn(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[DptHis]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DptHis(MABCP_DptReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[DptMap]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DptMap(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitCNG_ScreenOpe(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Mst(MABCP_DptReg p){
		p.Mst_mst_set_typ_nm.putMode(p, CNG, MCMode.READ_ONLY);

	}

	/**
	 * [CNG]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitCNG_CndPnl(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Cnd(MABCP_DptReg p){
		p.Cnd_ope_Group.putMode(p, CNG, MCMode.REQUIRED);
		p.Cnd_st_dt.putMode(p, CNG, MCMode.READ_ONLY);
		p.Cnd_end_dt.putMode(p, CNG, MCMode.READ_ONLY);
		p.Cnd_dpt_his_rmrks.putMode(p, CNG, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, CNG, MCMode.READ_ONLY);

	}

	/**
	 * [CNG]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitCNG_SrchBtn(MABCP_DptReg p){
		p.SrchBtn_srch.putMode(p, CNG, MCMode.ENABLE);

	}

	/**
	 * [CNG]ステータスの[Dpt1]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Dpt1(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Hdr1(MABCP_DptReg p){
		p.Hdr1_st_dt.putMode(p, CNG, MCMode.READ_ONLY);
		p.Hdr1_end_dt.putMode(p, CNG, MCMode.REQUIRED);
		p.Hdr1_dpt_his_rmrks.putMode(p, CNG, MCMode.READ_ONLY);

	}

	/**
	 * [CNG]ステータスの[TreePnl1]ブロックのモードの設定
	 */
	protected static void statusInitCNG_TreePnl1(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[Tree1]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Tree1(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[TreeBtn1]ブロックのモードの設定
	 */
	protected static void statusInitCNG_TreeBtn1(MABCP_DptReg p){
		p.TreeBtn1_view.putMode(p, CNG, MCMode.ENABLE);
		p.TreeBtn1_expand.putMode(p, CNG, MCMode.ENABLE);
		p.TreeBtn1_collapse.putMode(p, CNG, MCMode.ENABLE);

	}

	/**
	 * [CNG]ステータスの[DtlPnl1]ブロックのモードの設定
	 */
	protected static void statusInitCNG_DtlPnl1(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Dtl(MABCP_DptReg p){
		p.columnDtl_check.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_st_dt.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_end_dt.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm_lcl.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_new_dpt_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl_up_lv_dpt_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_set_addr.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_ar_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_ap_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_sd_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_rcv_bank_ac_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_rcv_bank_ac_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_cal_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_sls_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ship_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_arr_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_mfg_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_sd_dpt_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl_insp_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_cost_dpt_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_cost_dpt_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_cd.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, CNG, MCMode.INVISIBLE);

	}

	/**
	 * [CNG]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Btn1(MABCP_DptReg p){
		p.Btn1_select_all.putMode(p, CNG, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, CNG, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, CNG, MCMode.DISABLE);
		p.Btn1_add_sub.putMode(p, CNG, MCMode.DISABLE);
		p.Btn1_rcopy.putMode(p, CNG, MCMode.DISABLE);
		p.Btn1_del_dpt.putMode(p, CNG, MCMode.DISABLE);
		p.Btn1_can_del.putMode(p, CNG, MCMode.DISABLE);

	}

	/**
	 * [CNG]ステータスの[Dpt2]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Dpt2(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Hdr2(MABCP_DptReg p){
		p.Hdr2_st_dt.putMode(p, CNG, MCMode.READ_ONLY);
		p.Hdr2_end_dt.putMode(p, CNG, MCMode.REQUIRED);
		p.Hdr2_dpt_his_rmrks.putMode(p, CNG, MCMode.REQUIRED);

	}

	/**
	 * [CNG]ステータスの[TreePnl2]ブロックのモードの設定
	 */
	protected static void statusInitCNG_TreePnl2(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[Tree2]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Tree2(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[TreeBtn2]ブロックのモードの設定
	 */
	protected static void statusInitCNG_TreeBtn2(MABCP_DptReg p){
		p.TreeBtn2_view.putMode(p, CNG, MCMode.ENABLE);
		p.TreeBtn2_expand.putMode(p, CNG, MCMode.ENABLE);
		p.TreeBtn2_collapse.putMode(p, CNG, MCMode.ENABLE);

	}

	/**
	 * [CNG]ステータスの[DtlPnl2]ブロックのモードの設定
	 */
	protected static void statusInitCNG_DtlPnl2(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Dtl2(MABCP_DptReg p){
		p.columnDtl2_del_flg.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_dpt_cd.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_st_dt.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_end_dt.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_dpt_nm.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_new_dpt_cd.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_up_lv_dpt_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_up_lv_dpt_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_cd.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_dpt_lvl_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_set_addr.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_zip_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_addr1.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_addr2.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_addr3.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_addr4.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_tel.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_fax.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_wg_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_wg_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_sls_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_lg_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_mfg_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_purc_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_ar_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_ap_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_sd_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_rcv_bank_ac_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_rcv_bank_ac_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_pay_bank_ac_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_cal_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_cal_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_asst_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_ar_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_ap_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_sls_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_purc_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_ship_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_arr_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_mfg_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_sd_dpt_flg.putMode(p, CNG, MCMode.INVISIBLE);
		p.columnDtl2_insp_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_bd_dpt_flg.putMode(p, CNG, MCMode.REQUIRED);
		p.columnDtl2_cost_dpt_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_cost_dpt_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_cd.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_ac_dpt_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_memo1.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_memo2.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_memo3.putMode(p, CNG, MCMode.ENABLE);
		p.columnDtl2_ins_usr_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_id.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_nm.putMode(p, CNG, MCMode.READ_ONLY);
		p.columnDtl2_del_ts.putMode(p, CNG, MCMode.READ_ONLY);

	}

	/**
	 * [CNG]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Btn2(MABCP_DptReg p){
		p.Btn2_add_top.putMode(p, CNG, MCMode.ENABLE);
		p.Btn2_add_sub.putMode(p, CNG, MCMode.ENABLE);
		p.Btn2_rcopy.putMode(p, CNG, MCMode.ENABLE);
		p.Btn2_del_dpt.putMode(p, CNG, MCMode.ENABLE);
		p.Btn2_can_del.putMode(p, CNG, MCMode.ENABLE);
		p.Btn2_sync_flg.putMode(p, CNG, MCMode.ENABLE);

	}

	/**
	 * [CNG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitCNG_Btn(MABCP_DptReg p){
		p.Btn_upd.putMode(p, CNG, MCMode.ENABLE);
		p.Btn_upd_admin.putMode(p, CNG, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, CNG, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, CNG, MCMode.DISABLE);

	}

	/**
	 * [CNG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitCNG_EastBtn(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[DptHis]ブロックのモードの設定
	 */
	protected static void statusInitCNG_DptHis(MABCP_DptReg p){

	}

	/**
	 * [CNG]ステータスの[DptMap]ブロックのモードの設定
	 */
	protected static void statusInitCNG_DptMap(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_DptReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndPnl(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_DptReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dpt_his_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SrchBtn(MABCP_DptReg p){
		p.SrchBtn_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Dpt1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dpt1(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr1(MABCP_DptReg p){
		p.Hdr1_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_dpt_his_rmrks.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[TreePnl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TreePnl1(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[Tree1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tree1(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[TreeBtn1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TreeBtn1(MABCP_DptReg p){
		p.TreeBtn1_view.putMode(p, DEL, MCMode.ENABLE);
		p.TreeBtn1_expand.putMode(p, DEL, MCMode.ENABLE);
		p.TreeBtn1_collapse.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[DtlPnl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlPnl1(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_DptReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_st_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_end_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_new_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_set_addr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ar_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ap_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_rcv_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rcv_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cal_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_arr_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sd_dpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_insp_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cost_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cost_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn1(MABCP_DptReg p){
		p.Btn1_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn1_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn1_add_top.putMode(p, DEL, MCMode.DISABLE);
		p.Btn1_add_sub.putMode(p, DEL, MCMode.DISABLE);
		p.Btn1_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn1_del_dpt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn1_can_del.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dpt2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dpt2(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MABCP_DptReg p){
		p.Hdr2_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr2_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr2_dpt_his_rmrks.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[TreePnl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TreePnl2(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[Tree2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tree2(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[TreeBtn2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TreeBtn2(MABCP_DptReg p){
		p.TreeBtn2_view.putMode(p, DEL, MCMode.DISABLE);
		p.TreeBtn2_expand.putMode(p, DEL, MCMode.DISABLE);
		p.TreeBtn2_collapse.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[DtlPnl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlPnl2(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MABCP_DptReg p){
		p.columnDtl2_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_st_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_end_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_new_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_set_addr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sls_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_lg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_mfg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_ar_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_ap_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_rcv_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_rcv_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_cal_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_cal_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_asst_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ar_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ap_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sls_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ship_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_arr_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_mfg_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sd_dpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_insp_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_bd_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn2(MABCP_DptReg p){
		p.Btn2_add_top.putMode(p, DEL, MCMode.DISABLE);
		p.Btn2_add_sub.putMode(p, DEL, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn2_del_dpt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn2_can_del.putMode(p, DEL, MCMode.DISABLE);
		p.Btn2_sync_flg.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_DptReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[DptHis]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DptHis(MABCP_DptReg p){

	}

	/**
	 * [DEL]ステータスの[DptMap]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DptMap(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_DptReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[CndPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndPnl(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_DptReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_st_dt.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dpt_his_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_del_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_SrchBtn(MABCP_DptReg p){
		p.SrchBtn_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Dpt1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dpt1(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr1(MABCP_DptReg p){
		p.Hdr1_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_dpt_his_rmrks.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[TreePnl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_TreePnl1(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[Tree1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tree1(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[TreeBtn1]ブロックのモードの設定
	 */
	protected static void statusInitREF_TreeBtn1(MABCP_DptReg p){
		p.TreeBtn1_view.putMode(p, REF, MCMode.ENABLE);
		p.TreeBtn1_expand.putMode(p, REF, MCMode.ENABLE);
		p.TreeBtn1_collapse.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[DtlPnl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlPnl1(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_DptReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_st_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_end_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_new_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_up_lv_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_lvl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_set_addr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ar_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ap_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcv_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rcv_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_arr_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sd_dpt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_insp_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cost_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cost_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn1(MABCP_DptReg p){
		p.Btn1_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_add_top.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_add_sub.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_del_dpt.putMode(p, REF, MCMode.DISABLE);
		p.Btn1_can_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dpt2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dpt2(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MABCP_DptReg p){
		p.Hdr2_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr2_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr2_dpt_his_rmrks.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[TreePnl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_TreePnl2(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[Tree2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tree2(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[TreeBtn2]ブロックのモードの設定
	 */
	protected static void statusInitREF_TreeBtn2(MABCP_DptReg p){
		p.TreeBtn2_view.putMode(p, REF, MCMode.DISABLE);
		p.TreeBtn2_expand.putMode(p, REF, MCMode.DISABLE);
		p.TreeBtn2_collapse.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[DtlPnl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlPnl2(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MABCP_DptReg p){
		p.columnDtl2_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_st_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_end_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_new_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_up_lv_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_dpt_lvl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_set_addr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sls_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_lg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_mfg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_ar_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_ap_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_rcv_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rcv_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_pay_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_asst_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ar_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ap_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sls_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ship_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_arr_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_mfg_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sd_dpt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_insp_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_bd_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_cost_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ac_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn2(MABCP_DptReg p){
		p.Btn2_add_top.putMode(p, REF, MCMode.DISABLE);
		p.Btn2_add_sub.putMode(p, REF, MCMode.DISABLE);
		p.Btn2_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn2_del_dpt.putMode(p, REF, MCMode.DISABLE);
		p.Btn2_can_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn2_sync_flg.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_DptReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[DptHis]ブロックのモードの設定
	 */
	protected static void statusInitREF_DptHis(MABCP_DptReg p){

	}

	/**
	 * [REF]ステータスの[DptMap]ブロックのモードの設定
	 */
	protected static void statusInitREF_DptMap(MABCP_DptReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return FIX;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABCP_DptReg_MC.setTableConfigTree1((MABCP_DptReg)this);
		MABCP_DptReg_MC.setTableConfigDtl((MABCP_DptReg)this);
		MABCP_DptReg_MC.setTableConfigTree2((MABCP_DptReg)this);
		MABCP_DptReg_MC.setTableConfigDtl2((MABCP_DptReg)this);
	}

	/**
	 * [Tree1]ブロックのTreeの設定
	 */
	protected static void setTableConfigTree1(MABCP_DptReg p) {
		p.Tree1Tree.setKeyColumnName("tree_up_lv_dpt_cd", "tree_dpt_cd", "tree_row_label");
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_DptReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0280.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_cd_META);
		p.columnDtl_dpt_cd.addLinkBeans(p.columnDtl_dpt_nm_lcl,p.columnDtl_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_cd);
		p.columnDtl_st_dt.setMeta(mcframe.clientMABC.MABCP0280.DtlR.st_dt_META);
		p.columnDtl_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_st_dt);
		p.columnDtl_end_dt.setMeta(mcframe.clientMABC.MABCP0280.DtlR.end_dt_META);
		p.columnDtl_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_end_dt);
		p.columnDtl_dpt_nm_lcl.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_nm_lcl);
		p.columnDtl_dpt_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_nm);
		p.columnDtl_new_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.new_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_new_dpt_cd);
		p.columnDtl_up_lv_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.up_lv_dpt_cd_META);
		p.columnDtl_up_lv_dpt_cd.addLinkBeans(p.columnDtl_up_lv_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_up_lv_dpt_cd);
		p.columnDtl_up_lv_dpt_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.up_lv_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_up_lv_dpt_nm);
		p.columnDtl_dpt_lvl_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_lvl_cd_META);
		p.columnDtl_dpt_lvl_cd.addLinkBeans(p.columnDtl_dpt_lvl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_lvl_cd);
		p.columnDtl_dpt_lvl_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_lvl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_lvl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_set_addr);
		p.columnDtl_zip_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.zip_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_zip_cd);
		p.columnDtl_addr1.setMeta(mcframe.clientMABC.MABCP0280.DtlR.addr1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr1);
		p.columnDtl_addr2.setMeta(mcframe.clientMABC.MABCP0280.DtlR.addr2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr2);
		p.columnDtl_addr3.setMeta(mcframe.clientMABC.MABCP0280.DtlR.addr3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr3);
		p.columnDtl_addr4.setMeta(mcframe.clientMABC.MABCP0280.DtlR.addr4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr4);
		p.columnDtl_tel.setMeta(mcframe.clientMABC.MABCP0280.DtlR.tel_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tel);
		p.columnDtl_fax.setMeta(mcframe.clientMABC.MABCP0280.DtlR.fax_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fax);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm,p.columnDtl_sls_flg,p.columnDtl_lg_flg,p.columnDtl_mfg_flg,p.columnDtl_purc_flg,p.columnDtl_ar_flg,p.columnDtl_ap_flg,p.columnDtl_sd_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_sls_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.sls_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_flg);
		p.columnDtl_lg_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.lg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_flg);
		p.columnDtl_mfg_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.mfg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_flg);
		p.columnDtl_purc_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_flg);
		p.columnDtl_ar_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ar_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_flg);
		p.columnDtl_ap_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ap_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_flg);
		p.columnDtl_sd_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.sd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sd_flg);
		p.columnDtl_rcv_bank_ac_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.rcv_bank_ac_cd_META);
		p.columnDtl_rcv_bank_ac_cd.addLinkBeans(p.columnDtl_rcv_bank_ac_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_bank_ac_cd);
		p.columnDtl_rcv_bank_ac_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.rcv_bank_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_bank_ac_nm);
		p.columnDtl_pay_bank_ac_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.pay_bank_ac_cd_META);
		p.columnDtl_pay_bank_ac_cd.addLinkBeans(p.columnDtl_pay_bank_ac_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_bank_ac_cd);
		p.columnDtl_pay_bank_ac_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.pay_bank_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_bank_ac_nm);
		p.columnDtl_cal_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.cal_cd_META);
		p.columnDtl_cal_cd.addLinkBeans(p.columnDtl_cal_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cal_cd);
		p.columnDtl_cal_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cal_nm);
		p.columnDtl_asst_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.asst_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_dpt_flg);
		p.columnDtl_ar_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ar_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_flg);
		p.columnDtl_ap_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ap_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_flg);
		p.columnDtl_sls_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.sls_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_dpt_flg);
		p.columnDtl_purc_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.purc_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dpt_flg);
		p.columnDtl_ship_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ship_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_dpt_flg);
		p.columnDtl_arr_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.arr_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_dpt_flg);
		p.columnDtl_mfg_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.mfg_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_dpt_flg);
		p.columnDtl_sd_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.sd_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sd_dpt_flg);
		p.columnDtl_insp_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.insp_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_dpt_flg);
		p.columnDtl_bd_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.bd_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_flg);
		p.columnDtl_cost_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.cost_dpt_cd_META);
		p.columnDtl_cost_dpt_cd.addLinkBeans(p.columnDtl_cost_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_dpt_cd);
		p.columnDtl_cost_dpt_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.cost_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_dpt_nm);
		p.columnDtl_ac_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ac_dpt_cd_META);
		p.columnDtl_ac_dpt_cd.addLinkBeans(p.columnDtl_ac_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_dpt_cd);
		p.columnDtl_ac_dpt_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ac_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_dpt_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0280.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0280.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0280.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0280.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Tree2]ブロックのTreeの設定
	 */
	protected static void setTableConfigTree2(MABCP_DptReg p) {
		p.Tree2Tree.setKeyColumnName("tree_up_lv_dpt_cd", "tree_dpt_cd", "tree_row_label");
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MABCP_DptReg p) {
		p.columnDtl2_del_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.del_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_del_flg);
		p.columnDtl2_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_cd_META);
		p.columnDtl2_dpt_cd.addLinkBeans(p.columnDtl2_dpt_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dpt_cd);
		p.columnDtl2_st_dt.setMeta(mcframe.clientMABC.MABCP0280.DtlR.st_dt_META);
		p.columnDtl2_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_st_dt);
		p.columnDtl2_end_dt.setMeta(mcframe.clientMABC.MABCP0280.DtlR.end_dt_META);
		p.columnDtl2_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_end_dt);
		p.columnDtl2_dpt_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dpt_nm);
		p.columnDtl2_new_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.new_dpt_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_new_dpt_cd);
		p.columnDtl2_up_lv_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.up_lv_dpt_cd_META);
		p.columnDtl2_up_lv_dpt_cd.addLinkBeans(p.columnDtl2_up_lv_dpt_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_up_lv_dpt_cd);
		p.columnDtl2_up_lv_dpt_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.up_lv_dpt_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_up_lv_dpt_nm);
		p.columnDtl2_dpt_lvl_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_lvl_cd_META);
		p.columnDtl2_dpt_lvl_cd.addLinkBeans(p.columnDtl2_dpt_lvl_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dpt_lvl_cd);
		p.columnDtl2_dpt_lvl_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.dpt_lvl_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dpt_lvl_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_set_addr);
		p.columnDtl2_zip_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.zip_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_zip_cd);
		p.columnDtl2_addr1.setMeta(mcframe.clientMABC.MABCP0280.DtlR.addr1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_addr1);
		p.columnDtl2_addr2.setMeta(mcframe.clientMABC.MABCP0280.DtlR.addr2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_addr2);
		p.columnDtl2_addr3.setMeta(mcframe.clientMABC.MABCP0280.DtlR.addr3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_addr3);
		p.columnDtl2_addr4.setMeta(mcframe.clientMABC.MABCP0280.DtlR.addr4_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_addr4);
		p.columnDtl2_tel.setMeta(mcframe.clientMABC.MABCP0280.DtlR.tel_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_tel);
		p.columnDtl2_fax.setMeta(mcframe.clientMABC.MABCP0280.DtlR.fax_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_fax);
		p.columnDtl2_wg_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.wg_cd_META);
		p.columnDtl2_wg_cd.addLinkBeans(p.columnDtl2_wg_nm,p.columnDtl2_sls_flg,p.columnDtl2_lg_flg,p.columnDtl2_mfg_flg,p.columnDtl2_purc_flg,p.columnDtl2_ar_flg,p.columnDtl2_ap_flg,p.columnDtl2_sd_flg);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_wg_cd);
		p.columnDtl2_wg_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.wg_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_wg_nm);
		p.columnDtl2_sls_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.sls_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sls_flg);
		p.columnDtl2_lg_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.lg_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_lg_flg);
		p.columnDtl2_mfg_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.mfg_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_mfg_flg);
		p.columnDtl2_purc_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.purc_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_flg);
		p.columnDtl2_ar_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ar_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ar_flg);
		p.columnDtl2_ap_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ap_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_flg);
		p.columnDtl2_sd_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.sd_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sd_flg);
		p.columnDtl2_rcv_bank_ac_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.rcv_bank_ac_cd_META);
		p.columnDtl2_rcv_bank_ac_cd.addLinkBeans(p.columnDtl2_rcv_bank_ac_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcv_bank_ac_cd);
		p.columnDtl2_rcv_bank_ac_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.rcv_bank_ac_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcv_bank_ac_nm);
		p.columnDtl2_pay_bank_ac_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.pay_bank_ac_cd_META);
		p.columnDtl2_pay_bank_ac_cd.addLinkBeans(p.columnDtl2_pay_bank_ac_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_pay_bank_ac_cd);
		p.columnDtl2_pay_bank_ac_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.pay_bank_ac_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_pay_bank_ac_nm);
		p.columnDtl2_cal_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.cal_cd_META);
		p.columnDtl2_cal_cd.addLinkBeans(p.columnDtl2_cal_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cal_cd);
		p.columnDtl2_cal_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.cal_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cal_nm);
		p.columnDtl2_asst_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.asst_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_asst_dpt_flg);
		p.columnDtl2_ar_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ar_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ar_dpt_flg);
		p.columnDtl2_ap_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ap_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_dpt_flg);
		p.columnDtl2_sls_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.sls_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sls_dpt_flg);
		p.columnDtl2_purc_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.purc_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_dpt_flg);
		p.columnDtl2_ship_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ship_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ship_dpt_flg);
		p.columnDtl2_arr_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.arr_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_arr_dpt_flg);
		p.columnDtl2_mfg_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.mfg_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_mfg_dpt_flg);
		p.columnDtl2_sd_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.sd_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sd_dpt_flg);
		p.columnDtl2_insp_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.insp_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_insp_dpt_flg);
		p.columnDtl2_bd_dpt_flg.setMeta(mcframe.clientMABC.MABCP0280.DtlR.bd_dpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_dpt_flg);
		p.columnDtl2_cost_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.cost_dpt_cd_META);
		p.columnDtl2_cost_dpt_cd.addLinkBeans(p.columnDtl2_cost_dpt_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cost_dpt_cd);
		p.columnDtl2_cost_dpt_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.cost_dpt_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cost_dpt_nm);
		p.columnDtl2_ac_dpt_cd.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ac_dpt_cd_META);
		p.columnDtl2_ac_dpt_cd.addLinkBeans(p.columnDtl2_ac_dpt_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ac_dpt_cd);
		p.columnDtl2_ac_dpt_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ac_dpt_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ac_dpt_nm);
		p.columnDtl2_memo1.setMeta(mcframe.clientMABC.MABCP0280.DtlR.memo1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_memo1);
		p.columnDtl2_memo2.setMeta(mcframe.clientMABC.MABCP0280.DtlR.memo2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_memo2);
		p.columnDtl2_memo3.setMeta(mcframe.clientMABC.MABCP0280.DtlR.memo3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_memo3);
		p.columnDtl2_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_id);
		p.columnDtl2_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_nm);
		p.columnDtl2_ins_ts.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_ts_META);
		p.columnDtl2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_ts);
		p.columnDtl2_ins_func_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_id);
		p.columnDtl2_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.ins_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_nm);
		p.columnDtl2_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_id);
		p.columnDtl2_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_nm);
		p.columnDtl2_upd_ts.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_ts_META);
		p.columnDtl2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_ts);
		p.columnDtl2_upd_func_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_id);
		p.columnDtl2_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_nm);
		p.columnDtl2_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0280.DtlR.upd_srv_req_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_srv_req_no);
		p.columnDtl2_del_usr_id.setMeta(mcframe.clientMABC.MABCP0280.DtlR.del_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_del_usr_id);
		p.columnDtl2_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0280.DtlR.del_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_del_usr_nm);
		p.columnDtl2_del_ts.setMeta(mcframe.clientMABC.MABCP0280.DtlR.del_ts_META);
		p.columnDtl2_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_del_ts);
		// スクロール固定カラムの指定
		p.Dtl2Table.setUnscrollColumn(p.columnDtl2_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_st_dt.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_st_dt.getListConfig().setPutter(getCnd_st_dt_ListPutter());
		columnDtl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_cd.getListConfig().setPutter(getDtl_dpt_cd_ListPutter());
		columnDtl_new_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_new_dpt_cd.getListConfig().setPutter(getDtl_new_dpt_cd_ListPutter());
		columnDtl_up_lv_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_up_lv_dpt_cd.getListConfig().setPutter(getDtl_up_lv_dpt_cd_ListPutter());
		columnDtl_dpt_lvl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_lvl_cd.getListConfig().setPutter(getDtl_dpt_lvl_cd_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		columnDtl_rcv_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rcv_bank_ac_cd.getListConfig().setPutter(getDtl_rcv_bank_ac_cd_ListPutter());
		columnDtl_pay_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pay_bank_ac_cd.getListConfig().setPutter(getDtl_pay_bank_ac_cd_ListPutter());
		columnDtl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cal_cd.getListConfig().setPutter(getDtl_cal_cd_ListPutter());
		columnDtl_cost_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cost_dpt_cd.getListConfig().setPutter(getDtl_cost_dpt_cd_ListPutter());
		columnDtl_ac_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_dpt_cd.getListConfig().setPutter(getDtl_ac_dpt_cd_ListPutter());
		columnDtl2_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_dpt_cd.getListConfig().setPutter(getDtl2_dpt_cd_ListPutter());
		columnDtl2_new_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_new_dpt_cd.getListConfig().setPutter(getDtl2_new_dpt_cd_ListPutter());
		columnDtl2_up_lv_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_up_lv_dpt_cd.getListConfig().setPutter(getDtl2_up_lv_dpt_cd_ListPutter());
		columnDtl2_dpt_lvl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_dpt_lvl_cd.getListConfig().setPutter(getDtl2_dpt_lvl_cd_ListPutter());
		columnDtl2_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_wg_cd.getListConfig().setPutter(getDtl2_wg_cd_ListPutter());
		columnDtl2_rcv_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_rcv_bank_ac_cd.getListConfig().setPutter(getDtl2_rcv_bank_ac_cd_ListPutter());
		columnDtl2_pay_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_pay_bank_ac_cd.getListConfig().setPutter(getDtl2_pay_bank_ac_cd_ListPutter());
		columnDtl2_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_cal_cd.getListConfig().setPutter(getDtl2_cal_cd_ListPutter());
		columnDtl2_cost_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_cost_dpt_cd.getListConfig().setPutter(getDtl2_cost_dpt_cd_ListPutter());
		columnDtl2_ac_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_ac_dpt_cd.getListConfig().setPutter(getDtl2_ac_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
	 * この画面を[MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMODStatus() {
		status = MOD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_ADMIN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_ADMINStatus() {
		status = UPD_ADMIN;
		setAllStatus(status);
	}

	/**
	 * この画面を[CNG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setCNGStatus() {
		status = CNG;
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
		if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (MOD.equals(status)) {
			setMODStatus();
		}
		else if (UPD_ADMIN.equals(status)) {
			setUPD_ADMINStatus();
		}
		else if (CNG.equals(status)) {
			setCNGStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_st_dt_ListPutter]の作成
	 */
	protected MCListPutter createCnd_st_dt_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptHis");
		return lp;
	}
	 
	/**
	 * [Dtl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptBase");
		return lp;
	}
	 
	/**
	 * [Dtl_new_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_new_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptBase");
		return lp;
	}
	 
	/**
	 * [Dtl_up_lv_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_up_lv_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_dpt_lvl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_lvl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptLvl");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Dtl_rcv_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rcv_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IntBankAc");
		return lp;
	}
	 
	/**
	 * [Dtl_pay_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pay_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IntBankAc");
		return lp;
	}
	 
	/**
	 * [Dtl_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Dtl_cost_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cost_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Dtl_ac_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Dtl2_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptBase");
		return lp;
	}
	 
	/**
	 * [Dtl2_new_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_new_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptBase");
		return lp;
	}
	 
	/**
	 * [Dtl2_up_lv_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_up_lv_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl2_dpt_lvl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_dpt_lvl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptLvl");
		return lp;
	}
	 
	/**
	 * [Dtl2_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Dtl2_rcv_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_rcv_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IntBankAc");
		return lp;
	}
	 
	/**
	 * [Dtl2_pay_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_pay_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IntBankAc");
		return lp;
	}
	 
	/**
	 * [Dtl2_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Dtl2_cost_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_cost_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Dtl2_ac_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_ac_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_st_dt) return getCnd_st_dt(row, info);
		if(combo == columnDtl_dpt_cd) return getDtl_dpt_cd(row, info);
		if(combo == columnDtl_new_dpt_cd) return getDtl_new_dpt_cd(row, info);
		if(combo == columnDtl_up_lv_dpt_cd) return getDtl_up_lv_dpt_cd(row, info);
		if(combo == columnDtl_dpt_lvl_cd) return getDtl_dpt_lvl_cd(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == columnDtl_rcv_bank_ac_cd) return getDtl_rcv_bank_ac_cd(row, info);
		if(combo == columnDtl_pay_bank_ac_cd) return getDtl_pay_bank_ac_cd(row, info);
		if(combo == columnDtl_cal_cd) return getDtl_cal_cd(row, info);
		if(combo == columnDtl_cost_dpt_cd) return getDtl_cost_dpt_cd(row, info);
		if(combo == columnDtl_ac_dpt_cd) return getDtl_ac_dpt_cd(row, info);
		if(combo == columnDtl2_dpt_cd) return getDtl2_dpt_cd(row, info);
		if(combo == columnDtl2_new_dpt_cd) return getDtl2_new_dpt_cd(row, info);
		if(combo == columnDtl2_up_lv_dpt_cd) return getDtl2_up_lv_dpt_cd(row, info);
		if(combo == columnDtl2_dpt_lvl_cd) return getDtl2_dpt_lvl_cd(row, info);
		if(combo == columnDtl2_wg_cd) return getDtl2_wg_cd(row, info);
		if(combo == columnDtl2_rcv_bank_ac_cd) return getDtl2_rcv_bank_ac_cd(row, info);
		if(combo == columnDtl2_pay_bank_ac_cd) return getDtl2_pay_bank_ac_cd(row, info);
		if(combo == columnDtl2_cal_cd) return getDtl2_cal_cd(row, info);
		if(combo == columnDtl2_cost_dpt_cd) return getDtl2_cost_dpt_cd(row, info);
		if(combo == columnDtl2_ac_dpt_cd) return getDtl2_ac_dpt_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == SrchBtn_srch) doSrchBtn_srch(info);
		else if (ap == TreeBtn1_view) doTreeBtn1_view(info);
		else if (ap == TreeBtn1_expand) doTreeBtn1_expand(info);
		else if (ap == TreeBtn1_collapse) doTreeBtn1_collapse(info);
		else if (ap == columnDtl_set_addr) doDtl_set_addr(info);
		else if (ap == Btn1_select_all) doBtn1_select_all(info);
		else if (ap == Btn1_deselect_all) doBtn1_deselect_all(info);
		else if (ap == Btn1_add_top) doBtn1_add_top(info);
		else if (ap == Btn1_add_sub) doBtn1_add_sub(info);
		else if (ap == Btn1_rcopy) doBtn1_rcopy(info);
		else if (ap == Btn1_del_dpt) doBtn1_del_dpt(info);
		else if (ap == Btn1_can_del) doBtn1_can_del(info);
		else if (ap == TreeBtn2_view) doTreeBtn2_view(info);
		else if (ap == TreeBtn2_expand) doTreeBtn2_expand(info);
		else if (ap == TreeBtn2_collapse) doTreeBtn2_collapse(info);
		else if (ap == columnDtl2_set_addr) doDtl2_set_addr(info);
		else if (ap == Btn2_add_top) doBtn2_add_top(info);
		else if (ap == Btn2_add_sub) doBtn2_add_sub(info);
		else if (ap == Btn2_rcopy) doBtn2_rcopy(info);
		else if (ap == Btn2_del_dpt) doBtn2_del_dpt(info);
		else if (ap == Btn2_can_del) doBtn2_can_del(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_admin) doBtn_upd_admin(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [SrchBtn]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSrchBtn_srch(MCEventInfo info);

	/**
	 * [TreeBtn1]パネルの[view]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn1_view(MCEventInfo info);

	/**
	 * [TreeBtn1]パネルの[expand]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn1_expand(MCEventInfo info);

	/**
	 * [TreeBtn1]パネルの[collapse]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn1_collapse(MCEventInfo info);

	/**
	 * [Dtl]パネルの[set_addr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl_set_addr(MCEventInfo info);

	/**
	 * [Btn1]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_select_all(MCEventInfo info);

	/**
	 * [Btn1]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_deselect_all(MCEventInfo info);

	/**
	 * [Btn1]パネルの[add_top]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_add_top(MCEventInfo info);

	/**
	 * [Btn1]パネルの[add_sub]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_add_sub(MCEventInfo info);

	/**
	 * [Btn1]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_rcopy(MCEventInfo info);

	/**
	 * [Btn1]パネルの[del_dpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_del_dpt(MCEventInfo info);

	/**
	 * [Btn1]パネルの[can_del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn1_can_del(MCEventInfo info);

	/**
	 * [TreeBtn2]パネルの[view]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn2_view(MCEventInfo info);

	/**
	 * [TreeBtn2]パネルの[expand]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn2_expand(MCEventInfo info);

	/**
	 * [TreeBtn2]パネルの[collapse]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTreeBtn2_collapse(MCEventInfo info);

	/**
	 * [Dtl2]パネルの[set_addr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl2_set_addr(MCEventInfo info);

	/**
	 * [Btn2]パネルの[add_top]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn2_add_top(MCEventInfo info);

	/**
	 * [Btn2]パネルの[add_sub]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn2_add_sub(MCEventInfo info);

	/**
	 * [Btn2]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn2_rcopy(MCEventInfo info);

	/**
	 * [Btn2]パネルの[del_dpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn2_del_dpt(MCEventInfo info);

	/**
	 * [Btn2]パネルの[can_del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn2_can_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_admin]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_admin(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Tree1Tree) return doTree1_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Tree2Tree) return doTree2_VC(info);
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_st_dt) return doCnd_st_dt_VC(info);
		if (vc == Cnd_end_dt) return doCnd_end_dt_VC(info);
		if (vc == Cnd_dpt_his_rmrks) return doCnd_dpt_his_rmrks_VC(info);
		if (vc == Cnd_del_flg) return doCnd_del_flg_VC(info);
		if (vc == Hdr1_st_dt) return doHdr1_st_dt_VC(info);
		if (vc == Hdr1_end_dt) return doHdr1_end_dt_VC(info);
		if (vc == Hdr1_dpt_his_rmrks) return doHdr1_dpt_his_rmrks_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_dpt_cd) return doDtl_dpt_cd_VC(info);
		if (vc == columnDtl_st_dt) return doDtl_st_dt_VC(info);
		if (vc == columnDtl_end_dt) return doDtl_end_dt_VC(info);
		if (vc == columnDtl_dpt_nm_lcl) return doDtl_dpt_nm_lcl_VC(info);
		if (vc == columnDtl_dpt_nm) return doDtl_dpt_nm_VC(info);
		if (vc == columnDtl_new_dpt_cd) return doDtl_new_dpt_cd_VC(info);
		if (vc == columnDtl_up_lv_dpt_cd) return doDtl_up_lv_dpt_cd_VC(info);
		if (vc == columnDtl_up_lv_dpt_nm) return doDtl_up_lv_dpt_nm_VC(info);
		if (vc == columnDtl_dpt_lvl_cd) return doDtl_dpt_lvl_cd_VC(info);
		if (vc == columnDtl_dpt_lvl_nm) return doDtl_dpt_lvl_nm_VC(info);
		if (vc == columnDtl_zip_cd) return doDtl_zip_cd_VC(info);
		if (vc == columnDtl_addr1) return doDtl_addr1_VC(info);
		if (vc == columnDtl_addr2) return doDtl_addr2_VC(info);
		if (vc == columnDtl_addr3) return doDtl_addr3_VC(info);
		if (vc == columnDtl_addr4) return doDtl_addr4_VC(info);
		if (vc == columnDtl_tel) return doDtl_tel_VC(info);
		if (vc == columnDtl_fax) return doDtl_fax_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_sls_flg) return doDtl_sls_flg_VC(info);
		if (vc == columnDtl_lg_flg) return doDtl_lg_flg_VC(info);
		if (vc == columnDtl_mfg_flg) return doDtl_mfg_flg_VC(info);
		if (vc == columnDtl_purc_flg) return doDtl_purc_flg_VC(info);
		if (vc == columnDtl_ar_flg) return doDtl_ar_flg_VC(info);
		if (vc == columnDtl_ap_flg) return doDtl_ap_flg_VC(info);
		if (vc == columnDtl_sd_flg) return doDtl_sd_flg_VC(info);
		if (vc == columnDtl_rcv_bank_ac_cd) return doDtl_rcv_bank_ac_cd_VC(info);
		if (vc == columnDtl_rcv_bank_ac_nm) return doDtl_rcv_bank_ac_nm_VC(info);
		if (vc == columnDtl_pay_bank_ac_cd) return doDtl_pay_bank_ac_cd_VC(info);
		if (vc == columnDtl_pay_bank_ac_nm) return doDtl_pay_bank_ac_nm_VC(info);
		if (vc == columnDtl_cal_cd) return doDtl_cal_cd_VC(info);
		if (vc == columnDtl_cal_nm) return doDtl_cal_nm_VC(info);
		if (vc == columnDtl_asst_dpt_flg) return doDtl_asst_dpt_flg_VC(info);
		if (vc == columnDtl_ar_dpt_flg) return doDtl_ar_dpt_flg_VC(info);
		if (vc == columnDtl_ap_dpt_flg) return doDtl_ap_dpt_flg_VC(info);
		if (vc == columnDtl_sls_dpt_flg) return doDtl_sls_dpt_flg_VC(info);
		if (vc == columnDtl_purc_dpt_flg) return doDtl_purc_dpt_flg_VC(info);
		if (vc == columnDtl_ship_dpt_flg) return doDtl_ship_dpt_flg_VC(info);
		if (vc == columnDtl_arr_dpt_flg) return doDtl_arr_dpt_flg_VC(info);
		if (vc == columnDtl_mfg_dpt_flg) return doDtl_mfg_dpt_flg_VC(info);
		if (vc == columnDtl_sd_dpt_flg) return doDtl_sd_dpt_flg_VC(info);
		if (vc == columnDtl_insp_dpt_flg) return doDtl_insp_dpt_flg_VC(info);
		if (vc == columnDtl_bd_dpt_flg) return doDtl_bd_dpt_flg_VC(info);
		if (vc == columnDtl_cost_dpt_cd) return doDtl_cost_dpt_cd_VC(info);
		if (vc == columnDtl_cost_dpt_nm) return doDtl_cost_dpt_nm_VC(info);
		if (vc == columnDtl_ac_dpt_cd) return doDtl_ac_dpt_cd_VC(info);
		if (vc == columnDtl_ac_dpt_nm) return doDtl_ac_dpt_nm_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == Hdr2_st_dt) return doHdr2_st_dt_VC(info);
		if (vc == Hdr2_end_dt) return doHdr2_end_dt_VC(info);
		if (vc == Hdr2_dpt_his_rmrks) return doHdr2_dpt_his_rmrks_VC(info);
		if (vc == columnDtl2_del_flg) return doDtl2_del_flg_VC(info);
		if (vc == columnDtl2_dpt_cd) return doDtl2_dpt_cd_VC(info);
		if (vc == columnDtl2_st_dt) return doDtl2_st_dt_VC(info);
		if (vc == columnDtl2_end_dt) return doDtl2_end_dt_VC(info);
		if (vc == columnDtl2_dpt_nm) return doDtl2_dpt_nm_VC(info);
		if (vc == columnDtl2_new_dpt_cd) return doDtl2_new_dpt_cd_VC(info);
		if (vc == columnDtl2_up_lv_dpt_cd) return doDtl2_up_lv_dpt_cd_VC(info);
		if (vc == columnDtl2_up_lv_dpt_nm) return doDtl2_up_lv_dpt_nm_VC(info);
		if (vc == columnDtl2_dpt_lvl_cd) return doDtl2_dpt_lvl_cd_VC(info);
		if (vc == columnDtl2_dpt_lvl_nm) return doDtl2_dpt_lvl_nm_VC(info);
		if (vc == columnDtl2_zip_cd) return doDtl2_zip_cd_VC(info);
		if (vc == columnDtl2_addr1) return doDtl2_addr1_VC(info);
		if (vc == columnDtl2_addr2) return doDtl2_addr2_VC(info);
		if (vc == columnDtl2_addr3) return doDtl2_addr3_VC(info);
		if (vc == columnDtl2_addr4) return doDtl2_addr4_VC(info);
		if (vc == columnDtl2_tel) return doDtl2_tel_VC(info);
		if (vc == columnDtl2_fax) return doDtl2_fax_VC(info);
		if (vc == columnDtl2_wg_cd) return doDtl2_wg_cd_VC(info);
		if (vc == columnDtl2_wg_nm) return doDtl2_wg_nm_VC(info);
		if (vc == columnDtl2_sls_flg) return doDtl2_sls_flg_VC(info);
		if (vc == columnDtl2_lg_flg) return doDtl2_lg_flg_VC(info);
		if (vc == columnDtl2_mfg_flg) return doDtl2_mfg_flg_VC(info);
		if (vc == columnDtl2_purc_flg) return doDtl2_purc_flg_VC(info);
		if (vc == columnDtl2_ar_flg) return doDtl2_ar_flg_VC(info);
		if (vc == columnDtl2_ap_flg) return doDtl2_ap_flg_VC(info);
		if (vc == columnDtl2_sd_flg) return doDtl2_sd_flg_VC(info);
		if (vc == columnDtl2_rcv_bank_ac_cd) return doDtl2_rcv_bank_ac_cd_VC(info);
		if (vc == columnDtl2_rcv_bank_ac_nm) return doDtl2_rcv_bank_ac_nm_VC(info);
		if (vc == columnDtl2_pay_bank_ac_cd) return doDtl2_pay_bank_ac_cd_VC(info);
		if (vc == columnDtl2_pay_bank_ac_nm) return doDtl2_pay_bank_ac_nm_VC(info);
		if (vc == columnDtl2_cal_cd) return doDtl2_cal_cd_VC(info);
		if (vc == columnDtl2_cal_nm) return doDtl2_cal_nm_VC(info);
		if (vc == columnDtl2_asst_dpt_flg) return doDtl2_asst_dpt_flg_VC(info);
		if (vc == columnDtl2_ar_dpt_flg) return doDtl2_ar_dpt_flg_VC(info);
		if (vc == columnDtl2_ap_dpt_flg) return doDtl2_ap_dpt_flg_VC(info);
		if (vc == columnDtl2_sls_dpt_flg) return doDtl2_sls_dpt_flg_VC(info);
		if (vc == columnDtl2_purc_dpt_flg) return doDtl2_purc_dpt_flg_VC(info);
		if (vc == columnDtl2_ship_dpt_flg) return doDtl2_ship_dpt_flg_VC(info);
		if (vc == columnDtl2_arr_dpt_flg) return doDtl2_arr_dpt_flg_VC(info);
		if (vc == columnDtl2_mfg_dpt_flg) return doDtl2_mfg_dpt_flg_VC(info);
		if (vc == columnDtl2_sd_dpt_flg) return doDtl2_sd_dpt_flg_VC(info);
		if (vc == columnDtl2_insp_dpt_flg) return doDtl2_insp_dpt_flg_VC(info);
		if (vc == columnDtl2_bd_dpt_flg) return doDtl2_bd_dpt_flg_VC(info);
		if (vc == columnDtl2_cost_dpt_cd) return doDtl2_cost_dpt_cd_VC(info);
		if (vc == columnDtl2_cost_dpt_nm) return doDtl2_cost_dpt_nm_VC(info);
		if (vc == columnDtl2_ac_dpt_cd) return doDtl2_ac_dpt_cd_VC(info);
		if (vc == columnDtl2_ac_dpt_nm) return doDtl2_ac_dpt_nm_VC(info);
		if (vc == columnDtl2_memo1) return doDtl2_memo1_VC(info);
		if (vc == columnDtl2_memo2) return doDtl2_memo2_VC(info);
		if (vc == columnDtl2_memo3) return doDtl2_memo3_VC(info);
		if (vc == columnDtl2_ins_usr_id) return doDtl2_ins_usr_id_VC(info);
		if (vc == columnDtl2_ins_usr_nm) return doDtl2_ins_usr_nm_VC(info);
		if (vc == columnDtl2_ins_ts) return doDtl2_ins_ts_VC(info);
		if (vc == columnDtl2_ins_func_id) return doDtl2_ins_func_id_VC(info);
		if (vc == columnDtl2_ins_func_nm) return doDtl2_ins_func_nm_VC(info);
		if (vc == columnDtl2_upd_usr_id) return doDtl2_upd_usr_id_VC(info);
		if (vc == columnDtl2_upd_usr_nm) return doDtl2_upd_usr_nm_VC(info);
		if (vc == columnDtl2_upd_ts) return doDtl2_upd_ts_VC(info);
		if (vc == columnDtl2_upd_func_id) return doDtl2_upd_func_id_VC(info);
		if (vc == columnDtl2_upd_func_nm) return doDtl2_upd_func_nm_VC(info);
		if (vc == columnDtl2_upd_srv_req_no) return doDtl2_upd_srv_req_no_VC(info);
		if (vc == columnDtl2_del_usr_id) return doDtl2_del_usr_id_VC(info);
		if (vc == columnDtl2_del_usr_nm) return doDtl2_del_usr_nm_VC(info);
		if (vc == columnDtl2_del_ts) return doDtl2_del_ts_VC(info);
		if (vc == Btn2_sync_flg) return doBtn2_sync_flg_VC(info);
		return true;
	}

	/**
	 * [Tree1]Treeの選択ノードが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTree1_VC(MCEventInfo info){
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
	 * [Tree2]Treeの選択ノードが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTree2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_his_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_his_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[dpt_his_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_dpt_his_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[new_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_new_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_up_lv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_up_lv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_lvl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_lvl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sd_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr2]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr2_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr2]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr2_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr2]パネルの[dpt_his_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr2_dpt_his_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[new_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_new_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_up_lv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_up_lv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_dpt_lvl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_dpt_lvl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[lg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_lg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[mfg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_mfg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ar_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ar_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcv_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcv_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[asst_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_asst_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ar_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ar_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sls_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sls_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ship_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ship_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[arr_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_arr_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[mfg_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_mfg_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sd_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[insp_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_insp_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_cost_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_cost_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ac_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ac_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn2]パネルの[sync_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn2_sync_flg_VC(MCEventInfo info){
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
		if (nc == Tree1Tree) doTree1_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Tree2Tree) doTree2_NC(info);
		else if (nc == Dtl2Table) doDtl2_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_st_dt) doCnd_st_dt_NC(info);
		else if (nc == Cnd_end_dt) doCnd_end_dt_NC(info);
		else if (nc == Cnd_dpt_his_rmrks) doCnd_dpt_his_rmrks_NC(info);
		else if (nc == Cnd_del_flg) doCnd_del_flg_NC(info);
		else if (nc == Hdr1_st_dt) doHdr1_st_dt_NC(info);
		else if (nc == Hdr1_end_dt) doHdr1_end_dt_NC(info);
		else if (nc == Hdr1_dpt_his_rmrks) doHdr1_dpt_his_rmrks_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_dpt_cd) doDtl_dpt_cd_NC(info);
		else if (nc == columnDtl_st_dt) doDtl_st_dt_NC(info);
		else if (nc == columnDtl_end_dt) doDtl_end_dt_NC(info);
		else if (nc == columnDtl_dpt_nm_lcl) doDtl_dpt_nm_lcl_NC(info);
		else if (nc == columnDtl_dpt_nm) doDtl_dpt_nm_NC(info);
		else if (nc == columnDtl_new_dpt_cd) doDtl_new_dpt_cd_NC(info);
		else if (nc == columnDtl_up_lv_dpt_cd) doDtl_up_lv_dpt_cd_NC(info);
		else if (nc == columnDtl_up_lv_dpt_nm) doDtl_up_lv_dpt_nm_NC(info);
		else if (nc == columnDtl_dpt_lvl_cd) doDtl_dpt_lvl_cd_NC(info);
		else if (nc == columnDtl_dpt_lvl_nm) doDtl_dpt_lvl_nm_NC(info);
		else if (nc == columnDtl_zip_cd) doDtl_zip_cd_NC(info);
		else if (nc == columnDtl_addr1) doDtl_addr1_NC(info);
		else if (nc == columnDtl_addr2) doDtl_addr2_NC(info);
		else if (nc == columnDtl_addr3) doDtl_addr3_NC(info);
		else if (nc == columnDtl_addr4) doDtl_addr4_NC(info);
		else if (nc == columnDtl_tel) doDtl_tel_NC(info);
		else if (nc == columnDtl_fax) doDtl_fax_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_sls_flg) doDtl_sls_flg_NC(info);
		else if (nc == columnDtl_lg_flg) doDtl_lg_flg_NC(info);
		else if (nc == columnDtl_mfg_flg) doDtl_mfg_flg_NC(info);
		else if (nc == columnDtl_purc_flg) doDtl_purc_flg_NC(info);
		else if (nc == columnDtl_ar_flg) doDtl_ar_flg_NC(info);
		else if (nc == columnDtl_ap_flg) doDtl_ap_flg_NC(info);
		else if (nc == columnDtl_sd_flg) doDtl_sd_flg_NC(info);
		else if (nc == columnDtl_rcv_bank_ac_cd) doDtl_rcv_bank_ac_cd_NC(info);
		else if (nc == columnDtl_rcv_bank_ac_nm) doDtl_rcv_bank_ac_nm_NC(info);
		else if (nc == columnDtl_pay_bank_ac_cd) doDtl_pay_bank_ac_cd_NC(info);
		else if (nc == columnDtl_pay_bank_ac_nm) doDtl_pay_bank_ac_nm_NC(info);
		else if (nc == columnDtl_cal_cd) doDtl_cal_cd_NC(info);
		else if (nc == columnDtl_cal_nm) doDtl_cal_nm_NC(info);
		else if (nc == columnDtl_asst_dpt_flg) doDtl_asst_dpt_flg_NC(info);
		else if (nc == columnDtl_ar_dpt_flg) doDtl_ar_dpt_flg_NC(info);
		else if (nc == columnDtl_ap_dpt_flg) doDtl_ap_dpt_flg_NC(info);
		else if (nc == columnDtl_sls_dpt_flg) doDtl_sls_dpt_flg_NC(info);
		else if (nc == columnDtl_purc_dpt_flg) doDtl_purc_dpt_flg_NC(info);
		else if (nc == columnDtl_ship_dpt_flg) doDtl_ship_dpt_flg_NC(info);
		else if (nc == columnDtl_arr_dpt_flg) doDtl_arr_dpt_flg_NC(info);
		else if (nc == columnDtl_mfg_dpt_flg) doDtl_mfg_dpt_flg_NC(info);
		else if (nc == columnDtl_sd_dpt_flg) doDtl_sd_dpt_flg_NC(info);
		else if (nc == columnDtl_insp_dpt_flg) doDtl_insp_dpt_flg_NC(info);
		else if (nc == columnDtl_bd_dpt_flg) doDtl_bd_dpt_flg_NC(info);
		else if (nc == columnDtl_cost_dpt_cd) doDtl_cost_dpt_cd_NC(info);
		else if (nc == columnDtl_cost_dpt_nm) doDtl_cost_dpt_nm_NC(info);
		else if (nc == columnDtl_ac_dpt_cd) doDtl_ac_dpt_cd_NC(info);
		else if (nc == columnDtl_ac_dpt_nm) doDtl_ac_dpt_nm_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == Hdr2_st_dt) doHdr2_st_dt_NC(info);
		else if (nc == Hdr2_end_dt) doHdr2_end_dt_NC(info);
		else if (nc == Hdr2_dpt_his_rmrks) doHdr2_dpt_his_rmrks_NC(info);
		else if (nc == columnDtl2_del_flg) doDtl2_del_flg_NC(info);
		else if (nc == columnDtl2_dpt_cd) doDtl2_dpt_cd_NC(info);
		else if (nc == columnDtl2_st_dt) doDtl2_st_dt_NC(info);
		else if (nc == columnDtl2_end_dt) doDtl2_end_dt_NC(info);
		else if (nc == columnDtl2_dpt_nm) doDtl2_dpt_nm_NC(info);
		else if (nc == columnDtl2_new_dpt_cd) doDtl2_new_dpt_cd_NC(info);
		else if (nc == columnDtl2_up_lv_dpt_cd) doDtl2_up_lv_dpt_cd_NC(info);
		else if (nc == columnDtl2_up_lv_dpt_nm) doDtl2_up_lv_dpt_nm_NC(info);
		else if (nc == columnDtl2_dpt_lvl_cd) doDtl2_dpt_lvl_cd_NC(info);
		else if (nc == columnDtl2_dpt_lvl_nm) doDtl2_dpt_lvl_nm_NC(info);
		else if (nc == columnDtl2_zip_cd) doDtl2_zip_cd_NC(info);
		else if (nc == columnDtl2_addr1) doDtl2_addr1_NC(info);
		else if (nc == columnDtl2_addr2) doDtl2_addr2_NC(info);
		else if (nc == columnDtl2_addr3) doDtl2_addr3_NC(info);
		else if (nc == columnDtl2_addr4) doDtl2_addr4_NC(info);
		else if (nc == columnDtl2_tel) doDtl2_tel_NC(info);
		else if (nc == columnDtl2_fax) doDtl2_fax_NC(info);
		else if (nc == columnDtl2_wg_cd) doDtl2_wg_cd_NC(info);
		else if (nc == columnDtl2_wg_nm) doDtl2_wg_nm_NC(info);
		else if (nc == columnDtl2_sls_flg) doDtl2_sls_flg_NC(info);
		else if (nc == columnDtl2_lg_flg) doDtl2_lg_flg_NC(info);
		else if (nc == columnDtl2_mfg_flg) doDtl2_mfg_flg_NC(info);
		else if (nc == columnDtl2_purc_flg) doDtl2_purc_flg_NC(info);
		else if (nc == columnDtl2_ar_flg) doDtl2_ar_flg_NC(info);
		else if (nc == columnDtl2_ap_flg) doDtl2_ap_flg_NC(info);
		else if (nc == columnDtl2_sd_flg) doDtl2_sd_flg_NC(info);
		else if (nc == columnDtl2_rcv_bank_ac_cd) doDtl2_rcv_bank_ac_cd_NC(info);
		else if (nc == columnDtl2_rcv_bank_ac_nm) doDtl2_rcv_bank_ac_nm_NC(info);
		else if (nc == columnDtl2_pay_bank_ac_cd) doDtl2_pay_bank_ac_cd_NC(info);
		else if (nc == columnDtl2_pay_bank_ac_nm) doDtl2_pay_bank_ac_nm_NC(info);
		else if (nc == columnDtl2_cal_cd) doDtl2_cal_cd_NC(info);
		else if (nc == columnDtl2_cal_nm) doDtl2_cal_nm_NC(info);
		else if (nc == columnDtl2_asst_dpt_flg) doDtl2_asst_dpt_flg_NC(info);
		else if (nc == columnDtl2_ar_dpt_flg) doDtl2_ar_dpt_flg_NC(info);
		else if (nc == columnDtl2_ap_dpt_flg) doDtl2_ap_dpt_flg_NC(info);
		else if (nc == columnDtl2_sls_dpt_flg) doDtl2_sls_dpt_flg_NC(info);
		else if (nc == columnDtl2_purc_dpt_flg) doDtl2_purc_dpt_flg_NC(info);
		else if (nc == columnDtl2_ship_dpt_flg) doDtl2_ship_dpt_flg_NC(info);
		else if (nc == columnDtl2_arr_dpt_flg) doDtl2_arr_dpt_flg_NC(info);
		else if (nc == columnDtl2_mfg_dpt_flg) doDtl2_mfg_dpt_flg_NC(info);
		else if (nc == columnDtl2_sd_dpt_flg) doDtl2_sd_dpt_flg_NC(info);
		else if (nc == columnDtl2_insp_dpt_flg) doDtl2_insp_dpt_flg_NC(info);
		else if (nc == columnDtl2_bd_dpt_flg) doDtl2_bd_dpt_flg_NC(info);
		else if (nc == columnDtl2_cost_dpt_cd) doDtl2_cost_dpt_cd_NC(info);
		else if (nc == columnDtl2_cost_dpt_nm) doDtl2_cost_dpt_nm_NC(info);
		else if (nc == columnDtl2_ac_dpt_cd) doDtl2_ac_dpt_cd_NC(info);
		else if (nc == columnDtl2_ac_dpt_nm) doDtl2_ac_dpt_nm_NC(info);
		else if (nc == columnDtl2_memo1) doDtl2_memo1_NC(info);
		else if (nc == columnDtl2_memo2) doDtl2_memo2_NC(info);
		else if (nc == columnDtl2_memo3) doDtl2_memo3_NC(info);
		else if (nc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NC(info);
		else if (nc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NC(info);
		else if (nc == columnDtl2_ins_ts) doDtl2_ins_ts_NC(info);
		else if (nc == columnDtl2_ins_func_id) doDtl2_ins_func_id_NC(info);
		else if (nc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NC(info);
		else if (nc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NC(info);
		else if (nc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NC(info);
		else if (nc == columnDtl2_upd_ts) doDtl2_upd_ts_NC(info);
		else if (nc == columnDtl2_upd_func_id) doDtl2_upd_func_id_NC(info);
		else if (nc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NC(info);
		else if (nc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NC(info);
		else if (nc == columnDtl2_del_usr_id) doDtl2_del_usr_id_NC(info);
		else if (nc == columnDtl2_del_usr_nm) doDtl2_del_usr_nm_NC(info);
		else if (nc == columnDtl2_del_ts) doDtl2_del_ts_NC(info);
		else if (nc == Btn2_sync_flg) doBtn2_sync_flg_NC(info);
	}

	/**
	 * [Tree1]Treeの選択ノードが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Tree2]Treeの選択ノードが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_his_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_his_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[dpt_his_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_dpt_his_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[new_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_new_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_lv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_lv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_lvl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_lvl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sd_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[dpt_his_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_dpt_his_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[new_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_new_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_up_lv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_up_lv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_lvl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_lvl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_fax_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asst_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asst_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sls_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sls_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ship_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ship_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[arr_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_arr_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sd_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[insp_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_insp_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cost_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cost_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Btn2]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn2_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Tree1Tree) doTree1_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Tree2Tree) doTree2_NE(info);
		else if (ne == Dtl2Table) doDtl2_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_st_dt) doCnd_st_dt_NE(info);
		else if (ne == Cnd_end_dt) doCnd_end_dt_NE(info);
		else if (ne == Cnd_dpt_his_rmrks) doCnd_dpt_his_rmrks_NE(info);
		else if (ne == Cnd_del_flg) doCnd_del_flg_NE(info);
		else if (ne == Hdr1_st_dt) doHdr1_st_dt_NE(info);
		else if (ne == Hdr1_end_dt) doHdr1_end_dt_NE(info);
		else if (ne == Hdr1_dpt_his_rmrks) doHdr1_dpt_his_rmrks_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_dpt_cd) doDtl_dpt_cd_NE(info);
		else if (ne == columnDtl_st_dt) doDtl_st_dt_NE(info);
		else if (ne == columnDtl_end_dt) doDtl_end_dt_NE(info);
		else if (ne == columnDtl_dpt_nm_lcl) doDtl_dpt_nm_lcl_NE(info);
		else if (ne == columnDtl_dpt_nm) doDtl_dpt_nm_NE(info);
		else if (ne == columnDtl_new_dpt_cd) doDtl_new_dpt_cd_NE(info);
		else if (ne == columnDtl_up_lv_dpt_cd) doDtl_up_lv_dpt_cd_NE(info);
		else if (ne == columnDtl_up_lv_dpt_nm) doDtl_up_lv_dpt_nm_NE(info);
		else if (ne == columnDtl_dpt_lvl_cd) doDtl_dpt_lvl_cd_NE(info);
		else if (ne == columnDtl_dpt_lvl_nm) doDtl_dpt_lvl_nm_NE(info);
		else if (ne == columnDtl_zip_cd) doDtl_zip_cd_NE(info);
		else if (ne == columnDtl_addr1) doDtl_addr1_NE(info);
		else if (ne == columnDtl_addr2) doDtl_addr2_NE(info);
		else if (ne == columnDtl_addr3) doDtl_addr3_NE(info);
		else if (ne == columnDtl_addr4) doDtl_addr4_NE(info);
		else if (ne == columnDtl_tel) doDtl_tel_NE(info);
		else if (ne == columnDtl_fax) doDtl_fax_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_sls_flg) doDtl_sls_flg_NE(info);
		else if (ne == columnDtl_lg_flg) doDtl_lg_flg_NE(info);
		else if (ne == columnDtl_mfg_flg) doDtl_mfg_flg_NE(info);
		else if (ne == columnDtl_purc_flg) doDtl_purc_flg_NE(info);
		else if (ne == columnDtl_ar_flg) doDtl_ar_flg_NE(info);
		else if (ne == columnDtl_ap_flg) doDtl_ap_flg_NE(info);
		else if (ne == columnDtl_sd_flg) doDtl_sd_flg_NE(info);
		else if (ne == columnDtl_rcv_bank_ac_cd) doDtl_rcv_bank_ac_cd_NE(info);
		else if (ne == columnDtl_rcv_bank_ac_nm) doDtl_rcv_bank_ac_nm_NE(info);
		else if (ne == columnDtl_pay_bank_ac_cd) doDtl_pay_bank_ac_cd_NE(info);
		else if (ne == columnDtl_pay_bank_ac_nm) doDtl_pay_bank_ac_nm_NE(info);
		else if (ne == columnDtl_cal_cd) doDtl_cal_cd_NE(info);
		else if (ne == columnDtl_cal_nm) doDtl_cal_nm_NE(info);
		else if (ne == columnDtl_asst_dpt_flg) doDtl_asst_dpt_flg_NE(info);
		else if (ne == columnDtl_ar_dpt_flg) doDtl_ar_dpt_flg_NE(info);
		else if (ne == columnDtl_ap_dpt_flg) doDtl_ap_dpt_flg_NE(info);
		else if (ne == columnDtl_sls_dpt_flg) doDtl_sls_dpt_flg_NE(info);
		else if (ne == columnDtl_purc_dpt_flg) doDtl_purc_dpt_flg_NE(info);
		else if (ne == columnDtl_ship_dpt_flg) doDtl_ship_dpt_flg_NE(info);
		else if (ne == columnDtl_arr_dpt_flg) doDtl_arr_dpt_flg_NE(info);
		else if (ne == columnDtl_mfg_dpt_flg) doDtl_mfg_dpt_flg_NE(info);
		else if (ne == columnDtl_sd_dpt_flg) doDtl_sd_dpt_flg_NE(info);
		else if (ne == columnDtl_insp_dpt_flg) doDtl_insp_dpt_flg_NE(info);
		else if (ne == columnDtl_bd_dpt_flg) doDtl_bd_dpt_flg_NE(info);
		else if (ne == columnDtl_cost_dpt_cd) doDtl_cost_dpt_cd_NE(info);
		else if (ne == columnDtl_cost_dpt_nm) doDtl_cost_dpt_nm_NE(info);
		else if (ne == columnDtl_ac_dpt_cd) doDtl_ac_dpt_cd_NE(info);
		else if (ne == columnDtl_ac_dpt_nm) doDtl_ac_dpt_nm_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == Hdr2_st_dt) doHdr2_st_dt_NE(info);
		else if (ne == Hdr2_end_dt) doHdr2_end_dt_NE(info);
		else if (ne == Hdr2_dpt_his_rmrks) doHdr2_dpt_his_rmrks_NE(info);
		else if (ne == columnDtl2_del_flg) doDtl2_del_flg_NE(info);
		else if (ne == columnDtl2_dpt_cd) doDtl2_dpt_cd_NE(info);
		else if (ne == columnDtl2_st_dt) doDtl2_st_dt_NE(info);
		else if (ne == columnDtl2_end_dt) doDtl2_end_dt_NE(info);
		else if (ne == columnDtl2_dpt_nm) doDtl2_dpt_nm_NE(info);
		else if (ne == columnDtl2_new_dpt_cd) doDtl2_new_dpt_cd_NE(info);
		else if (ne == columnDtl2_up_lv_dpt_cd) doDtl2_up_lv_dpt_cd_NE(info);
		else if (ne == columnDtl2_up_lv_dpt_nm) doDtl2_up_lv_dpt_nm_NE(info);
		else if (ne == columnDtl2_dpt_lvl_cd) doDtl2_dpt_lvl_cd_NE(info);
		else if (ne == columnDtl2_dpt_lvl_nm) doDtl2_dpt_lvl_nm_NE(info);
		else if (ne == columnDtl2_zip_cd) doDtl2_zip_cd_NE(info);
		else if (ne == columnDtl2_addr1) doDtl2_addr1_NE(info);
		else if (ne == columnDtl2_addr2) doDtl2_addr2_NE(info);
		else if (ne == columnDtl2_addr3) doDtl2_addr3_NE(info);
		else if (ne == columnDtl2_addr4) doDtl2_addr4_NE(info);
		else if (ne == columnDtl2_tel) doDtl2_tel_NE(info);
		else if (ne == columnDtl2_fax) doDtl2_fax_NE(info);
		else if (ne == columnDtl2_wg_cd) doDtl2_wg_cd_NE(info);
		else if (ne == columnDtl2_wg_nm) doDtl2_wg_nm_NE(info);
		else if (ne == columnDtl2_sls_flg) doDtl2_sls_flg_NE(info);
		else if (ne == columnDtl2_lg_flg) doDtl2_lg_flg_NE(info);
		else if (ne == columnDtl2_mfg_flg) doDtl2_mfg_flg_NE(info);
		else if (ne == columnDtl2_purc_flg) doDtl2_purc_flg_NE(info);
		else if (ne == columnDtl2_ar_flg) doDtl2_ar_flg_NE(info);
		else if (ne == columnDtl2_ap_flg) doDtl2_ap_flg_NE(info);
		else if (ne == columnDtl2_sd_flg) doDtl2_sd_flg_NE(info);
		else if (ne == columnDtl2_rcv_bank_ac_cd) doDtl2_rcv_bank_ac_cd_NE(info);
		else if (ne == columnDtl2_rcv_bank_ac_nm) doDtl2_rcv_bank_ac_nm_NE(info);
		else if (ne == columnDtl2_pay_bank_ac_cd) doDtl2_pay_bank_ac_cd_NE(info);
		else if (ne == columnDtl2_pay_bank_ac_nm) doDtl2_pay_bank_ac_nm_NE(info);
		else if (ne == columnDtl2_cal_cd) doDtl2_cal_cd_NE(info);
		else if (ne == columnDtl2_cal_nm) doDtl2_cal_nm_NE(info);
		else if (ne == columnDtl2_asst_dpt_flg) doDtl2_asst_dpt_flg_NE(info);
		else if (ne == columnDtl2_ar_dpt_flg) doDtl2_ar_dpt_flg_NE(info);
		else if (ne == columnDtl2_ap_dpt_flg) doDtl2_ap_dpt_flg_NE(info);
		else if (ne == columnDtl2_sls_dpt_flg) doDtl2_sls_dpt_flg_NE(info);
		else if (ne == columnDtl2_purc_dpt_flg) doDtl2_purc_dpt_flg_NE(info);
		else if (ne == columnDtl2_ship_dpt_flg) doDtl2_ship_dpt_flg_NE(info);
		else if (ne == columnDtl2_arr_dpt_flg) doDtl2_arr_dpt_flg_NE(info);
		else if (ne == columnDtl2_mfg_dpt_flg) doDtl2_mfg_dpt_flg_NE(info);
		else if (ne == columnDtl2_sd_dpt_flg) doDtl2_sd_dpt_flg_NE(info);
		else if (ne == columnDtl2_insp_dpt_flg) doDtl2_insp_dpt_flg_NE(info);
		else if (ne == columnDtl2_bd_dpt_flg) doDtl2_bd_dpt_flg_NE(info);
		else if (ne == columnDtl2_cost_dpt_cd) doDtl2_cost_dpt_cd_NE(info);
		else if (ne == columnDtl2_cost_dpt_nm) doDtl2_cost_dpt_nm_NE(info);
		else if (ne == columnDtl2_ac_dpt_cd) doDtl2_ac_dpt_cd_NE(info);
		else if (ne == columnDtl2_ac_dpt_nm) doDtl2_ac_dpt_nm_NE(info);
		else if (ne == columnDtl2_memo1) doDtl2_memo1_NE(info);
		else if (ne == columnDtl2_memo2) doDtl2_memo2_NE(info);
		else if (ne == columnDtl2_memo3) doDtl2_memo3_NE(info);
		else if (ne == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NE(info);
		else if (ne == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NE(info);
		else if (ne == columnDtl2_ins_ts) doDtl2_ins_ts_NE(info);
		else if (ne == columnDtl2_ins_func_id) doDtl2_ins_func_id_NE(info);
		else if (ne == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NE(info);
		else if (ne == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NE(info);
		else if (ne == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NE(info);
		else if (ne == columnDtl2_upd_ts) doDtl2_upd_ts_NE(info);
		else if (ne == columnDtl2_upd_func_id) doDtl2_upd_func_id_NE(info);
		else if (ne == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NE(info);
		else if (ne == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NE(info);
		else if (ne == columnDtl2_del_usr_id) doDtl2_del_usr_id_NE(info);
		else if (ne == columnDtl2_del_usr_nm) doDtl2_del_usr_nm_NE(info);
		else if (ne == columnDtl2_del_ts) doDtl2_del_ts_NE(info);
		else if (ne == Btn2_sync_flg) doBtn2_sync_flg_NE(info);
	}

	/**
	 * [Tree1]TreeのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Tree2]TreeのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_his_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_his_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[dpt_his_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_dpt_his_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[new_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_new_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_lv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_lv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_lvl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_lvl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sd_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[dpt_his_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_dpt_his_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[new_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_new_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_up_lv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_up_lv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_lvl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_lvl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_fax_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asst_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asst_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sls_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sls_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ship_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ship_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[arr_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_arr_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sd_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[insp_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_insp_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cost_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cost_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Btn2]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn2_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Tree1Tree) doTree1_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Tree2Tree) doTree2_NX(info);
		else if (nx == Dtl2Table) doDtl2_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_st_dt) doCnd_st_dt_NX(info);
		else if (nx == Cnd_end_dt) doCnd_end_dt_NX(info);
		else if (nx == Cnd_dpt_his_rmrks) doCnd_dpt_his_rmrks_NX(info);
		else if (nx == Cnd_del_flg) doCnd_del_flg_NX(info);
		else if (nx == Hdr1_st_dt) doHdr1_st_dt_NX(info);
		else if (nx == Hdr1_end_dt) doHdr1_end_dt_NX(info);
		else if (nx == Hdr1_dpt_his_rmrks) doHdr1_dpt_his_rmrks_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_dpt_cd) doDtl_dpt_cd_NX(info);
		else if (nx == columnDtl_st_dt) doDtl_st_dt_NX(info);
		else if (nx == columnDtl_end_dt) doDtl_end_dt_NX(info);
		else if (nx == columnDtl_dpt_nm_lcl) doDtl_dpt_nm_lcl_NX(info);
		else if (nx == columnDtl_dpt_nm) doDtl_dpt_nm_NX(info);
		else if (nx == columnDtl_new_dpt_cd) doDtl_new_dpt_cd_NX(info);
		else if (nx == columnDtl_up_lv_dpt_cd) doDtl_up_lv_dpt_cd_NX(info);
		else if (nx == columnDtl_up_lv_dpt_nm) doDtl_up_lv_dpt_nm_NX(info);
		else if (nx == columnDtl_dpt_lvl_cd) doDtl_dpt_lvl_cd_NX(info);
		else if (nx == columnDtl_dpt_lvl_nm) doDtl_dpt_lvl_nm_NX(info);
		else if (nx == columnDtl_zip_cd) doDtl_zip_cd_NX(info);
		else if (nx == columnDtl_addr1) doDtl_addr1_NX(info);
		else if (nx == columnDtl_addr2) doDtl_addr2_NX(info);
		else if (nx == columnDtl_addr3) doDtl_addr3_NX(info);
		else if (nx == columnDtl_addr4) doDtl_addr4_NX(info);
		else if (nx == columnDtl_tel) doDtl_tel_NX(info);
		else if (nx == columnDtl_fax) doDtl_fax_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_sls_flg) doDtl_sls_flg_NX(info);
		else if (nx == columnDtl_lg_flg) doDtl_lg_flg_NX(info);
		else if (nx == columnDtl_mfg_flg) doDtl_mfg_flg_NX(info);
		else if (nx == columnDtl_purc_flg) doDtl_purc_flg_NX(info);
		else if (nx == columnDtl_ar_flg) doDtl_ar_flg_NX(info);
		else if (nx == columnDtl_ap_flg) doDtl_ap_flg_NX(info);
		else if (nx == columnDtl_sd_flg) doDtl_sd_flg_NX(info);
		else if (nx == columnDtl_rcv_bank_ac_cd) doDtl_rcv_bank_ac_cd_NX(info);
		else if (nx == columnDtl_rcv_bank_ac_nm) doDtl_rcv_bank_ac_nm_NX(info);
		else if (nx == columnDtl_pay_bank_ac_cd) doDtl_pay_bank_ac_cd_NX(info);
		else if (nx == columnDtl_pay_bank_ac_nm) doDtl_pay_bank_ac_nm_NX(info);
		else if (nx == columnDtl_cal_cd) doDtl_cal_cd_NX(info);
		else if (nx == columnDtl_cal_nm) doDtl_cal_nm_NX(info);
		else if (nx == columnDtl_asst_dpt_flg) doDtl_asst_dpt_flg_NX(info);
		else if (nx == columnDtl_ar_dpt_flg) doDtl_ar_dpt_flg_NX(info);
		else if (nx == columnDtl_ap_dpt_flg) doDtl_ap_dpt_flg_NX(info);
		else if (nx == columnDtl_sls_dpt_flg) doDtl_sls_dpt_flg_NX(info);
		else if (nx == columnDtl_purc_dpt_flg) doDtl_purc_dpt_flg_NX(info);
		else if (nx == columnDtl_ship_dpt_flg) doDtl_ship_dpt_flg_NX(info);
		else if (nx == columnDtl_arr_dpt_flg) doDtl_arr_dpt_flg_NX(info);
		else if (nx == columnDtl_mfg_dpt_flg) doDtl_mfg_dpt_flg_NX(info);
		else if (nx == columnDtl_sd_dpt_flg) doDtl_sd_dpt_flg_NX(info);
		else if (nx == columnDtl_insp_dpt_flg) doDtl_insp_dpt_flg_NX(info);
		else if (nx == columnDtl_bd_dpt_flg) doDtl_bd_dpt_flg_NX(info);
		else if (nx == columnDtl_cost_dpt_cd) doDtl_cost_dpt_cd_NX(info);
		else if (nx == columnDtl_cost_dpt_nm) doDtl_cost_dpt_nm_NX(info);
		else if (nx == columnDtl_ac_dpt_cd) doDtl_ac_dpt_cd_NX(info);
		else if (nx == columnDtl_ac_dpt_nm) doDtl_ac_dpt_nm_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == Hdr2_st_dt) doHdr2_st_dt_NX(info);
		else if (nx == Hdr2_end_dt) doHdr2_end_dt_NX(info);
		else if (nx == Hdr2_dpt_his_rmrks) doHdr2_dpt_his_rmrks_NX(info);
		else if (nx == columnDtl2_del_flg) doDtl2_del_flg_NX(info);
		else if (nx == columnDtl2_dpt_cd) doDtl2_dpt_cd_NX(info);
		else if (nx == columnDtl2_st_dt) doDtl2_st_dt_NX(info);
		else if (nx == columnDtl2_end_dt) doDtl2_end_dt_NX(info);
		else if (nx == columnDtl2_dpt_nm) doDtl2_dpt_nm_NX(info);
		else if (nx == columnDtl2_new_dpt_cd) doDtl2_new_dpt_cd_NX(info);
		else if (nx == columnDtl2_up_lv_dpt_cd) doDtl2_up_lv_dpt_cd_NX(info);
		else if (nx == columnDtl2_up_lv_dpt_nm) doDtl2_up_lv_dpt_nm_NX(info);
		else if (nx == columnDtl2_dpt_lvl_cd) doDtl2_dpt_lvl_cd_NX(info);
		else if (nx == columnDtl2_dpt_lvl_nm) doDtl2_dpt_lvl_nm_NX(info);
		else if (nx == columnDtl2_zip_cd) doDtl2_zip_cd_NX(info);
		else if (nx == columnDtl2_addr1) doDtl2_addr1_NX(info);
		else if (nx == columnDtl2_addr2) doDtl2_addr2_NX(info);
		else if (nx == columnDtl2_addr3) doDtl2_addr3_NX(info);
		else if (nx == columnDtl2_addr4) doDtl2_addr4_NX(info);
		else if (nx == columnDtl2_tel) doDtl2_tel_NX(info);
		else if (nx == columnDtl2_fax) doDtl2_fax_NX(info);
		else if (nx == columnDtl2_wg_cd) doDtl2_wg_cd_NX(info);
		else if (nx == columnDtl2_wg_nm) doDtl2_wg_nm_NX(info);
		else if (nx == columnDtl2_sls_flg) doDtl2_sls_flg_NX(info);
		else if (nx == columnDtl2_lg_flg) doDtl2_lg_flg_NX(info);
		else if (nx == columnDtl2_mfg_flg) doDtl2_mfg_flg_NX(info);
		else if (nx == columnDtl2_purc_flg) doDtl2_purc_flg_NX(info);
		else if (nx == columnDtl2_ar_flg) doDtl2_ar_flg_NX(info);
		else if (nx == columnDtl2_ap_flg) doDtl2_ap_flg_NX(info);
		else if (nx == columnDtl2_sd_flg) doDtl2_sd_flg_NX(info);
		else if (nx == columnDtl2_rcv_bank_ac_cd) doDtl2_rcv_bank_ac_cd_NX(info);
		else if (nx == columnDtl2_rcv_bank_ac_nm) doDtl2_rcv_bank_ac_nm_NX(info);
		else if (nx == columnDtl2_pay_bank_ac_cd) doDtl2_pay_bank_ac_cd_NX(info);
		else if (nx == columnDtl2_pay_bank_ac_nm) doDtl2_pay_bank_ac_nm_NX(info);
		else if (nx == columnDtl2_cal_cd) doDtl2_cal_cd_NX(info);
		else if (nx == columnDtl2_cal_nm) doDtl2_cal_nm_NX(info);
		else if (nx == columnDtl2_asst_dpt_flg) doDtl2_asst_dpt_flg_NX(info);
		else if (nx == columnDtl2_ar_dpt_flg) doDtl2_ar_dpt_flg_NX(info);
		else if (nx == columnDtl2_ap_dpt_flg) doDtl2_ap_dpt_flg_NX(info);
		else if (nx == columnDtl2_sls_dpt_flg) doDtl2_sls_dpt_flg_NX(info);
		else if (nx == columnDtl2_purc_dpt_flg) doDtl2_purc_dpt_flg_NX(info);
		else if (nx == columnDtl2_ship_dpt_flg) doDtl2_ship_dpt_flg_NX(info);
		else if (nx == columnDtl2_arr_dpt_flg) doDtl2_arr_dpt_flg_NX(info);
		else if (nx == columnDtl2_mfg_dpt_flg) doDtl2_mfg_dpt_flg_NX(info);
		else if (nx == columnDtl2_sd_dpt_flg) doDtl2_sd_dpt_flg_NX(info);
		else if (nx == columnDtl2_insp_dpt_flg) doDtl2_insp_dpt_flg_NX(info);
		else if (nx == columnDtl2_bd_dpt_flg) doDtl2_bd_dpt_flg_NX(info);
		else if (nx == columnDtl2_cost_dpt_cd) doDtl2_cost_dpt_cd_NX(info);
		else if (nx == columnDtl2_cost_dpt_nm) doDtl2_cost_dpt_nm_NX(info);
		else if (nx == columnDtl2_ac_dpt_cd) doDtl2_ac_dpt_cd_NX(info);
		else if (nx == columnDtl2_ac_dpt_nm) doDtl2_ac_dpt_nm_NX(info);
		else if (nx == columnDtl2_memo1) doDtl2_memo1_NX(info);
		else if (nx == columnDtl2_memo2) doDtl2_memo2_NX(info);
		else if (nx == columnDtl2_memo3) doDtl2_memo3_NX(info);
		else if (nx == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NX(info);
		else if (nx == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NX(info);
		else if (nx == columnDtl2_ins_ts) doDtl2_ins_ts_NX(info);
		else if (nx == columnDtl2_ins_func_id) doDtl2_ins_func_id_NX(info);
		else if (nx == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NX(info);
		else if (nx == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NX(info);
		else if (nx == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NX(info);
		else if (nx == columnDtl2_upd_ts) doDtl2_upd_ts_NX(info);
		else if (nx == columnDtl2_upd_func_id) doDtl2_upd_func_id_NX(info);
		else if (nx == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NX(info);
		else if (nx == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NX(info);
		else if (nx == columnDtl2_del_usr_id) doDtl2_del_usr_id_NX(info);
		else if (nx == columnDtl2_del_usr_nm) doDtl2_del_usr_nm_NX(info);
		else if (nx == columnDtl2_del_ts) doDtl2_del_ts_NX(info);
		else if (nx == Btn2_sync_flg) doBtn2_sync_flg_NX(info);
	}

	/**
	 * [Tree1]TreeのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Tree2]TreeのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTree2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_his_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_his_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[dpt_his_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_dpt_his_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[new_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_new_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_lv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_lv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_lvl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_lvl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sd_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[dpt_his_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_dpt_his_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[new_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_new_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_up_lv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_up_lv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_lvl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_lvl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_fax_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asst_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asst_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sls_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sls_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ship_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ship_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[arr_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_arr_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sd_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[insp_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_insp_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cost_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cost_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Btn2]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn2_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_st_dt) doCnd_st_dt_LC(info);
		else if (lc == Cnd_end_dt) doCnd_end_dt_LC(info);
		else if (lc == Cnd_dpt_his_rmrks) doCnd_dpt_his_rmrks_LC(info);
		else if (lc == Hdr1_st_dt) doHdr1_st_dt_LC(info);
		else if (lc == Hdr1_end_dt) doHdr1_end_dt_LC(info);
		else if (lc == Hdr1_dpt_his_rmrks) doHdr1_dpt_his_rmrks_LC(info);
		else if (lc == columnDtl_dpt_cd) doDtl_dpt_cd_LC(info);
		else if (lc == columnDtl_st_dt) doDtl_st_dt_LC(info);
		else if (lc == columnDtl_end_dt) doDtl_end_dt_LC(info);
		else if (lc == columnDtl_dpt_nm_lcl) doDtl_dpt_nm_lcl_LC(info);
		else if (lc == columnDtl_dpt_nm) doDtl_dpt_nm_LC(info);
		else if (lc == columnDtl_new_dpt_cd) doDtl_new_dpt_cd_LC(info);
		else if (lc == columnDtl_up_lv_dpt_cd) doDtl_up_lv_dpt_cd_LC(info);
		else if (lc == columnDtl_up_lv_dpt_nm) doDtl_up_lv_dpt_nm_LC(info);
		else if (lc == columnDtl_dpt_lvl_cd) doDtl_dpt_lvl_cd_LC(info);
		else if (lc == columnDtl_dpt_lvl_nm) doDtl_dpt_lvl_nm_LC(info);
		else if (lc == columnDtl_zip_cd) doDtl_zip_cd_LC(info);
		else if (lc == columnDtl_addr1) doDtl_addr1_LC(info);
		else if (lc == columnDtl_addr2) doDtl_addr2_LC(info);
		else if (lc == columnDtl_addr3) doDtl_addr3_LC(info);
		else if (lc == columnDtl_addr4) doDtl_addr4_LC(info);
		else if (lc == columnDtl_tel) doDtl_tel_LC(info);
		else if (lc == columnDtl_fax) doDtl_fax_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_rcv_bank_ac_cd) doDtl_rcv_bank_ac_cd_LC(info);
		else if (lc == columnDtl_rcv_bank_ac_nm) doDtl_rcv_bank_ac_nm_LC(info);
		else if (lc == columnDtl_pay_bank_ac_cd) doDtl_pay_bank_ac_cd_LC(info);
		else if (lc == columnDtl_pay_bank_ac_nm) doDtl_pay_bank_ac_nm_LC(info);
		else if (lc == columnDtl_cal_cd) doDtl_cal_cd_LC(info);
		else if (lc == columnDtl_cal_nm) doDtl_cal_nm_LC(info);
		else if (lc == columnDtl_cost_dpt_cd) doDtl_cost_dpt_cd_LC(info);
		else if (lc == columnDtl_cost_dpt_nm) doDtl_cost_dpt_nm_LC(info);
		else if (lc == columnDtl_ac_dpt_cd) doDtl_ac_dpt_cd_LC(info);
		else if (lc == columnDtl_ac_dpt_nm) doDtl_ac_dpt_nm_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == Hdr2_st_dt) doHdr2_st_dt_LC(info);
		else if (lc == Hdr2_end_dt) doHdr2_end_dt_LC(info);
		else if (lc == Hdr2_dpt_his_rmrks) doHdr2_dpt_his_rmrks_LC(info);
		else if (lc == columnDtl2_dpt_cd) doDtl2_dpt_cd_LC(info);
		else if (lc == columnDtl2_st_dt) doDtl2_st_dt_LC(info);
		else if (lc == columnDtl2_end_dt) doDtl2_end_dt_LC(info);
		else if (lc == columnDtl2_dpt_nm) doDtl2_dpt_nm_LC(info);
		else if (lc == columnDtl2_new_dpt_cd) doDtl2_new_dpt_cd_LC(info);
		else if (lc == columnDtl2_up_lv_dpt_cd) doDtl2_up_lv_dpt_cd_LC(info);
		else if (lc == columnDtl2_up_lv_dpt_nm) doDtl2_up_lv_dpt_nm_LC(info);
		else if (lc == columnDtl2_dpt_lvl_cd) doDtl2_dpt_lvl_cd_LC(info);
		else if (lc == columnDtl2_dpt_lvl_nm) doDtl2_dpt_lvl_nm_LC(info);
		else if (lc == columnDtl2_zip_cd) doDtl2_zip_cd_LC(info);
		else if (lc == columnDtl2_addr1) doDtl2_addr1_LC(info);
		else if (lc == columnDtl2_addr2) doDtl2_addr2_LC(info);
		else if (lc == columnDtl2_addr3) doDtl2_addr3_LC(info);
		else if (lc == columnDtl2_addr4) doDtl2_addr4_LC(info);
		else if (lc == columnDtl2_tel) doDtl2_tel_LC(info);
		else if (lc == columnDtl2_fax) doDtl2_fax_LC(info);
		else if (lc == columnDtl2_wg_cd) doDtl2_wg_cd_LC(info);
		else if (lc == columnDtl2_wg_nm) doDtl2_wg_nm_LC(info);
		else if (lc == columnDtl2_rcv_bank_ac_cd) doDtl2_rcv_bank_ac_cd_LC(info);
		else if (lc == columnDtl2_rcv_bank_ac_nm) doDtl2_rcv_bank_ac_nm_LC(info);
		else if (lc == columnDtl2_pay_bank_ac_cd) doDtl2_pay_bank_ac_cd_LC(info);
		else if (lc == columnDtl2_pay_bank_ac_nm) doDtl2_pay_bank_ac_nm_LC(info);
		else if (lc == columnDtl2_cal_cd) doDtl2_cal_cd_LC(info);
		else if (lc == columnDtl2_cal_nm) doDtl2_cal_nm_LC(info);
		else if (lc == columnDtl2_cost_dpt_cd) doDtl2_cost_dpt_cd_LC(info);
		else if (lc == columnDtl2_cost_dpt_nm) doDtl2_cost_dpt_nm_LC(info);
		else if (lc == columnDtl2_ac_dpt_cd) doDtl2_ac_dpt_cd_LC(info);
		else if (lc == columnDtl2_ac_dpt_nm) doDtl2_ac_dpt_nm_LC(info);
		else if (lc == columnDtl2_memo1) doDtl2_memo1_LC(info);
		else if (lc == columnDtl2_memo2) doDtl2_memo2_LC(info);
		else if (lc == columnDtl2_memo3) doDtl2_memo3_LC(info);
		else if (lc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_LC(info);
		else if (lc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_LC(info);
		else if (lc == columnDtl2_ins_ts) doDtl2_ins_ts_LC(info);
		else if (lc == columnDtl2_ins_func_id) doDtl2_ins_func_id_LC(info);
		else if (lc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_LC(info);
		else if (lc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_LC(info);
		else if (lc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_LC(info);
		else if (lc == columnDtl2_upd_ts) doDtl2_upd_ts_LC(info);
		else if (lc == columnDtl2_upd_func_id) doDtl2_upd_func_id_LC(info);
		else if (lc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_LC(info);
		else if (lc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_LC(info);
		else if (lc == columnDtl2_del_usr_id) doDtl2_del_usr_id_LC(info);
		else if (lc == columnDtl2_del_usr_nm) doDtl2_del_usr_nm_LC(info);
		else if (lc == columnDtl2_del_ts) doDtl2_del_ts_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_his_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_his_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[dpt_his_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_dpt_his_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[new_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_new_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_lv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[up_lv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_up_lv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_lvl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_lvl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_lvl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr2]パネルの[dpt_his_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr2_dpt_his_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[new_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_new_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_up_lv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[up_lv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_up_lv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_lvl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dpt_lvl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dpt_lvl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_fax_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_pay_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cost_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cost_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cost_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_st_dt]の作成メソッド
	 */
	public MCList getCnd_st_dt(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptHis(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_new_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_new_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_up_lv_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_up_lv_dpt_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_lvl_cd]の作成メソッド
	 */
	public MCList getDtl_dpt_lvl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptLvl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rcv_bank_ac_cd]の作成メソッド
	 */
	public MCList getDtl_rcv_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pay_bank_ac_cd]の作成メソッド
	 */
	public MCList getDtl_pay_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cal_cd]の作成メソッド
	 */
	public MCList getDtl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cost_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_cost_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ac_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_dpt_cd]の作成メソッド
	 */
	public MCList getDtl2_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_new_dpt_cd]の作成メソッド
	 */
	public MCList getDtl2_new_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_up_lv_dpt_cd]の作成メソッド
	 */
	public MCList getDtl2_up_lv_dpt_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_dpt_lvl_cd]の作成メソッド
	 */
	public MCList getDtl2_dpt_lvl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptLvl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_wg_cd]の作成メソッド
	 */
	public MCList getDtl2_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_rcv_bank_ac_cd]の作成メソッド
	 */
	public MCList getDtl2_rcv_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_pay_bank_ac_cd]の作成メソッド
	 */
	public MCList getDtl2_pay_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_cal_cd]の作成メソッド
	 */
	public MCList getDtl2_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_cost_dpt_cd]の作成メソッド
	 */
	public MCList getDtl2_cost_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_ac_dpt_cd]の作成メソッド
	 */
	public MCList getDtl2_ac_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0280.Srch01")) {
			return new MA_MABCL0280_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0280.Upd01")) {
			return new MA_MABCL0280_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0280.Del01")) {
			return new MA_MABCL0280_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0280_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0280_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0280_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0280_Srch01Bridge() {
			p_MA_MABCL0280_Srch01 = new MCParam(PDef.MA_MABCL0280_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0280_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0280.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0280.DptHisR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0280.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0280.DptMapR.class));

			p_MA_MABCL0280_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0280_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0280_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0280_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0280_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0280.CndR up0() {
			return (mcframe.clientMABC.MABCP0280.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0280.DptHisR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0280.DptHisR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0280.DtlR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0280.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0280.DptMapR> down2() {
			return (MCList<mcframe.clientMABC.MABCP0280.DptMapR>)down(2);
		}

		protected void setupDownParam() {
			p_MA_MABCL0280_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0280.DptHisR.class));
			p_MA_MABCL0280_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0280.DtlR.class));
			p_MA_MABCL0280_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0280.DptMapR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0280_Srch01;
		}

		protected void show() {
			setDptHisL((MCList<mcframe.clientMABC.MABCP0280.DptHisR>)p_MA_MABCL0280_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMABC.MABCP0280.DtlR>)p_MA_MABCL0280_Srch01.getContainerParam().getDownBlock(1));
			setDptMapL((MCList<mcframe.clientMABC.MABCP0280.DptMapR>)p_MA_MABCL0280_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getDptHisL().clear();
			getDtlL().clear();
			getDptMapL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDptHisL());
			result.add(getDtlL());
			result.add(getDptMapL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0280_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0280_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0280_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0280_Upd01Bridge() {
			p_MA_MABCL0280_Upd01 = new MCParam(PDef.MA_MABCL0280_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0280_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0280.DptHisR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0280.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0280.DptMapR.class));
			// Down

			p_MA_MABCL0280_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0280_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0280_Upd01.addUpBlock(getDptHisL().shallowClone());
			p_MA_MABCL0280_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0280_Upd01.addUpBlock(getDptMapL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0280_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0280_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0280.DptHisR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0280.DptHisR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0280.DtlR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0280.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0280.DptMapR> up2() {
			return (MCList<mcframe.clientMABC.MABCP0280.DptMapR>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0280_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDptHisL());
			result.add(getDtlL());
			result.add(getDptMapL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL0280_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0280_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0280_Del01;

		/** コンストラクタ */
		protected MA_MABCL0280_Del01Bridge() {
			p_MA_MABCL0280_Del01 = new MCParam(PDef.MA_MABCL0280_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0280_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0280.DtlR.class));
			// Down

			p_MA_MABCL0280_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0280_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0280_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0280_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0280_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0280.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0280.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0280_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}