package mcframe.clientMABC.MABCP0700;

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
import mcframe.clientMABC.MABCP0700.MABCP_LocReg_MC.MA_MABCL0700_Srch01Caller;
import mcframe.clientMABC.MABCP0700.MABCP_LocReg_MC.MA_MABCL0700_Upd01Caller;
import mcframe.clientMABC.MABCP0700.MABCP_LocReg_MC.MA_MABCL0700_Del01Caller;

/**
 * 画面"MABCP_LocReg"パネルクラスです。<p>
 *
 * 場所マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_LocReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABCP0700";

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
	public MCTitledBorder MstTitledBorder = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_loc_mst_set_typ_nm_Label = null;
	/**
	 * Location 場所.<p>
	 *
	 */
	public MCTextField Mst_loc_mst_set_typ_nm = null;
	public MCLabel Mst_sub_mst_set_typ_nm_Label = null;
	/**
	 * Location auxiliary 場所補助.<p>
	 *
	 */
	public MCTextField Mst_sub_mst_set_typ_nm = null;
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;UPD_ADMIN,Create/Modify (Administrator),2;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;UPD_ADMIN,登録・訂正する（管理者）,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_UPD_ADMIN = null;
	public MCRadioButton Cnd_ope_REF = null;
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
	public MCLabel Cnd_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_site_nm = null;
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
	public MCLabel Cnd_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_lg_grp_nm = null;
	public MCLabel Cnd_alloc_grp_cd_Label = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_alloc_grp_nm = null;
	public MCLabel Cnd_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_loc_grp_nm = null;
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
	public MCLabel Cnd_maker_cd_Label = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Cnd_maker_nm = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [TopDtl]ブロック関連のField定義
	public MCPanel TopDtlPanel = null;
	// [TopDtl]ブロックの項目のField定義
	// [Loc]ブロック関連のField定義
	public MCPanel LocPanel = null;
	// [Loc]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0700.DtlR> DtlTable = null;
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm_lcl = null;
	/**
	 * Standard Location name 標準場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_dpt_cd = null;
	/**
	 * Asset management dept. name 資産管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_dpt_nm = null;
	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check_asst_dpt_cd = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_dpt_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check_sls_dpt_cd = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	public MCColumnConfig columnDtl_wg_cd_dpt = null;
	public MCColumnConfig columnDtl_lg_flg = null;
	public MCColumnConfig columnDtl_mfg_flg = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_nm = null;
	/**
	 * Distribution standard location 物流標準場所.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_def_flg = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_grp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_grp_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_nm = null;
	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_outsrc_act_flg = null;
	/**
	 * Direct-delivery supply inspection 直送支給検査.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ddlv_prov_insp_flg = null;
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
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_mng_typ = null;
	/**
	 * Controlling site type name 管轄区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_mng_typ_nm = null;
	/**
	 * Numbering ID 発番ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num_id = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_nm = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prnt_lcl_cd = null;
	/**
	 * Report output locale name 帳票出力ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prnt_lcl_nm = null;
	/**
	 * For inventory count 棚卸対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stktk_tgt_flg = null;
	/**
	 * Logical inventory initial display 理論在庫初期表示.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stktk_tor_disp_flg = null;
	/**
	 * Exclude logical inventory qty. 0 理論在庫数０除外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stktk_tor_ex_zero_flg = null;
	/**
	 * Counted variance qty. 0 excluded 実棚差異数０除外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stktk_act_ex_zero_flg = null;
	/**
	 * Output inventory count amount 棚卸金額出力.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stktk_amt_flg = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_tgt_flg = null;
	/**
	 * Allocation limited 引当限定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_lmt_flg = null;
	/**
	 * SKU transfer at GI 出庫時荷姿振替.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_pack_xfer_flg = null;
	/**
	 * VMI recording at GI 出庫時ＶＭＩ計上.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_vmi_flg = null;
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_cd1 = null;
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_nm1 = null;
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_cd2 = null;
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_nm2 = null;
	/**
	 * External system location type 外部システム場所区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_loc_typ = null;
	/**
	 * External system location type name 外部システム場所区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_loc_typ_nm = null;
	/**
	 * Location allocation group 場所配賦グループ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_alc_grp = null;
	/**
	 * Address setting 住所設定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr_flg = null;
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
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
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	// [BtmDtl]ブロック関連のField定義
	public MCPanel BtmDtlPanel = null;
	// [BtmDtl]ブロックの項目のField定義
	// [Ltab]ブロック関連のField定義
	public MCPanel LtabPanel = null;
	// [Ltab]ブロックの項目のField定義
	// [BLTab]ブロック関連のField定義
	public MCPanel BLTabPanel = null;
	public MCTabbedPane BLTabTab = null;
	// [BLTab]ブロックの項目のField定義
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0700.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_loc_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_nm = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_loc_nm = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnLcl_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_fax = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_srv_req_no = null;
	// [LclBtn]ブロック関連のField定義
	public MCPanel LclBtnPanel = null;
	// [LclBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtn_rcopy = null;
	// [LocSub]ブロック関連のField定義
	public MCPanel LocSubPanel = null;
	// [LocSub]ブロックの項目のField定義
	// [DtlLocSub]ブロック関連のField定義
	public MCPanel DtlLocSubPanel = null;
	public MCScrollPane DtlLocSubScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0700.DtlLocSubR> DtlLocSubTable = null;
	// [DtlLocSub]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_del_flg = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_loc_cd = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D DtlLocSub_dt_PPanel;
	public MCColumnConfig columnDtlLocSub_st_dt;// [DtlLocSub]の[dt.st_dt]を[columnDtlLocSub_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtlLocSub_end_dt;// [DtlLocSub]の[dt.end_dt]を[columnDtlLocSub_end_dt]としてエイリアス定義。
	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_asst_dpt_cd = null;
	/**
	 * Asset management dept. name 資産管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_asst_dpt_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_sls_dpt_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlLocSub_del_ts = null;
	// [DtlBtnLocSub]ブロック関連のField定義
	public MCPanel DtlBtnLocSubPanel = null;
	// [DtlBtnLocSub]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtnLocSub_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtnLocSub_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtnLocSub_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtnLocSub_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtnLocSub_rcopy = null;
	// [StrLn]ブロック関連のField定義
	public MCPanel StrLnPanel = null;
	// [StrLn]ブロックの項目のField定義
	// [DtlStrLn]ブロック関連のField定義
	public MCPanel DtlStrLnPanel = null;
	public MCTitledBorder DtlStrLnTitledBorder = null;
	public MCScrollPane DtlStrLnScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0700.DtlStrLnR> DtlStrLnTable = null;
	// [DtlStrLn]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_del_flg = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_loc_cd = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_str_ln_nm_lcl = null;
	/**
	 * Standard rack/line name 標準棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_str_ln_nm = null;
	/**
	 * Line ライン.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_ln_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlStrLn_del_ts = null;
	// [DtlBtnStrLn]ブロック関連のField定義
	public MCPanel DtlBtnStrLnPanel = null;
	// [DtlBtnStrLn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtnStrLn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtnStrLn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtnStrLn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtnStrLn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtnStrLn_rcopy = null;
	// [LclWrkStrLn]ブロック関連のField定義
	public MCPanel LclWrkStrLnPanel = null;
	// [LclWrkStrLn]ブロックの項目のField定義
	// [LclStrLn]ブロック関連のField定義
	public MCPanel LclStrLnPanel = null;
	public MCScrollPane LclStrLnScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0700.LclStrLnR> LclStrLnTable = null;
	// [LclStrLn]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_check = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_loc_cd = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_str_ln_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_lcl_nm = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_str_ln_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLclStrLn_upd_srv_req_no = null;
	// [LclBtnStrLn]ブロック関連のField定義
	public MCPanel LclBtnStrLnPanel = null;
	// [LclBtnStrLn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtnStrLn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtnStrLn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtnStrLn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtnStrLn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtnStrLn_rcopy = null;
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
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [UPD_ADMIN]モードを表す定数 */
	public static final String UPD_ADMIN = "UPD_ADMIN";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, UPD_ADMIN, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0700_Srch01]のCallerの作成 */
	protected MABCP_LocReg_MC.MA_MABCL0700_Srch01Caller createMA_MABCL0700_Srch01() {
		MABCP_LocReg_MC.MA_MABCL0700_Srch01Caller<MABCP_LocReg, MA_MABCL0700_Srch01Bridge>
		caller = ((MABCP_LocReg_MC)this).new MA_MABCL0700_Srch01Caller<MABCP_LocReg, MA_MABCL0700_Srch01Bridge>(
					(MABCP_LocReg)this, new MA_MABCL0700_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0700_Srch01]の呼び出し */
	protected void callMA_MABCL0700_Srch01() {
		MCCaller caller = createMA_MABCL0700_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0700_Upd01]のCallerの作成 */
	protected MABCP_LocReg_MC.MA_MABCL0700_Upd01Caller createMA_MABCL0700_Upd01() {
		MABCP_LocReg_MC.MA_MABCL0700_Upd01Caller<MABCP_LocReg, MA_MABCL0700_Upd01Bridge>
		caller = ((MABCP_LocReg_MC)this).new MA_MABCL0700_Upd01Caller<MABCP_LocReg, MA_MABCL0700_Upd01Bridge>(
					(MABCP_LocReg)this, new MA_MABCL0700_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0700_Upd01]の呼び出し */
	protected void callMA_MABCL0700_Upd01() {
		MCCaller caller = createMA_MABCL0700_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0700_Del01]のCallerの作成 */
	protected MABCP_LocReg_MC.MA_MABCL0700_Del01Caller createMA_MABCL0700_Del01() {
		MABCP_LocReg_MC.MA_MABCL0700_Del01Caller<MABCP_LocReg, MA_MABCL0700_Del01Bridge>
		caller = ((MABCP_LocReg_MC)this).new MA_MABCL0700_Del01Caller<MABCP_LocReg, MA_MABCL0700_Del01Bridge>(
					(MABCP_LocReg)this, new MA_MABCL0700_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0700_Del01]の呼び出し */
	protected void callMA_MABCL0700_Del01() {
		MCCaller caller = createMA_MABCL0700_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0700.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0700.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.LclR> aLclL;
	/** [DtlLocSub]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> aDtlLocSubL;
	/** [DtlStrLn]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> aDtlStrLnL;
	/** [LclStrLn]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> aLclStrLnL;
	/** [StrLnAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> aStrLnAllL;
	/** [LocLclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.LclR> aLocLclAllL;
	/** [LocSubAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> aLocSubAllL;
	/** [LclStrLnAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> aLclStrLnAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0700.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0700.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0700.MstR createMstR() {
		return mcframe.clientMABC.MABCP0700.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0700.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0700.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0700.CndR createCndR() {
		return mcframe.clientMABC.MABCP0700.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0700.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0700.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0700.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.DtlR.class);
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
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABC.MABCP0700.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0700.LclR createLclR() {
		return mcframe.clientMABC.MABCP0700.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.LclR.class);
	}

	/**
	 * LclTableを初期化します。
	 */
	protected void createLclTable(){
		if(LclTable == null){
			LclTable = beansFactory.createTable2("Lcl.table");
		}
	}

	/**
	 * コピーによってaDtlLocSubLを設定します。
	 *
	 * aDtlLocSubLのインスタンスは変更されません。
	 *
	 * @param dataset DtlLocSubL
	 */
	public void setDtlLocSubL(MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> aList) {
		if (getDtlLocSubL() != aList) {
			getDtlLocSubL().setAll(aList);
		}
	}

	/**
	 * [DtlLocSub]ブロックのコンテナaDtlLocSubLを返します。
	 *
	 * @return DtlLocSubL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> getDtlLocSubL() {
		return aDtlLocSubL;
	}

	/**
	 * aDtlLocSubRを作成します。
	 *
	 * @return DtlLocSubR
	 */
	public mcframe.clientMABC.MABCP0700.DtlLocSubR createDtlLocSubR() {
		return mcframe.clientMABC.MABCP0700.DtlLocSubR.create();
	}

	/**
	 * aDtlLocSubLを作成します。
	 *
	 * @return DtlLocSubL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> createDtlLocSubL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.DtlLocSubR.class);
	}

	/**
	 * DtlLocSubTableを初期化します。
	 */
	protected void createDtlLocSubTable(){
		if(DtlLocSubTable == null){
			DtlLocSubTable = beansFactory.createTable2("DtlLocSub.table");
		}
	}

	/**
	 * コピーによってaDtlStrLnLを設定します。
	 *
	 * aDtlStrLnLのインスタンスは変更されません。
	 *
	 * @param dataset DtlStrLnL
	 */
	public void setDtlStrLnL(MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> aList) {
		if (getDtlStrLnL() != aList) {
			getDtlStrLnL().setAll(aList);
		}
	}

	/**
	 * [DtlStrLn]ブロックのコンテナaDtlStrLnLを返します。
	 *
	 * @return DtlStrLnL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> getDtlStrLnL() {
		return aDtlStrLnL;
	}

	/**
	 * aDtlStrLnRを作成します。
	 *
	 * @return DtlStrLnR
	 */
	public mcframe.clientMABC.MABCP0700.DtlStrLnR createDtlStrLnR() {
		return mcframe.clientMABC.MABCP0700.DtlStrLnR.create();
	}

	/**
	 * aDtlStrLnLを作成します。
	 *
	 * @return DtlStrLnL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> createDtlStrLnL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.DtlStrLnR.class);
	}

	/**
	 * DtlStrLnTableを初期化します。
	 */
	protected void createDtlStrLnTable(){
		if(DtlStrLnTable == null){
			DtlStrLnTable = beansFactory.createTable2("DtlStrLn.table");
		}
	}

	/**
	 * コピーによってaLclStrLnLを設定します。
	 *
	 * aLclStrLnLのインスタンスは変更されません。
	 *
	 * @param dataset LclStrLnL
	 */
	public void setLclStrLnL(MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> aList) {
		if (getLclStrLnL() != aList) {
			getLclStrLnL().setAll(aList);
		}
	}

	/**
	 * [LclStrLn]ブロックのコンテナaLclStrLnLを返します。
	 *
	 * @return LclStrLnL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> getLclStrLnL() {
		return aLclStrLnL;
	}

	/**
	 * aLclStrLnRを作成します。
	 *
	 * @return LclStrLnR
	 */
	public mcframe.clientMABC.MABCP0700.LclStrLnR createLclStrLnR() {
		return mcframe.clientMABC.MABCP0700.LclStrLnR.create();
	}

	/**
	 * aLclStrLnLを作成します。
	 *
	 * @return LclStrLnL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> createLclStrLnL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.LclStrLnR.class);
	}

	/**
	 * LclStrLnTableを初期化します。
	 */
	protected void createLclStrLnTable(){
		if(LclStrLnTable == null){
			LclStrLnTable = beansFactory.createTable2("LclStrLn.table");
		}
	}

	/**
	 * コピーによってaStrLnAllLを設定します。
	 *
	 * aStrLnAllLのインスタンスは変更されません。
	 *
	 * @param dataset StrLnAllL
	 */
	public void setStrLnAllL(MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> aList) {
		if (getStrLnAllL() != aList) {
			getStrLnAllL().setAll(aList);
		}
	}

	/**
	 * [StrLnAll]ブロックのコンテナaStrLnAllLを返します。
	 *
	 * @return StrLnAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> getStrLnAllL() {
		return aStrLnAllL;
	}

	/**
	 * aStrLnAllRを作成します。
	 *
	 * @return StrLnAllR
	 */
	public mcframe.clientMABC.MABCP0700.DtlStrLnR createStrLnAllR() {
		return mcframe.clientMABC.MABCP0700.DtlStrLnR.create();
	}

	/**
	 * aStrLnAllLを作成します。
	 *
	 * @return StrLnAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> createStrLnAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.DtlStrLnR.class);
	}

	/**
	 * コピーによってaLocLclAllLを設定します。
	 *
	 * aLocLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LocLclAllL
	 */
	public void setLocLclAllL(MCList<mcframe.clientMABC.MABCP0700.LclR> aList) {
		if (getLocLclAllL() != aList) {
			getLocLclAllL().setAll(aList);
		}
	}

	/**
	 * [LocLclAll]ブロックのコンテナaLocLclAllLを返します。
	 *
	 * @return LocLclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.LclR> getLocLclAllL() {
		return aLocLclAllL;
	}

	/**
	 * aLocLclAllRを作成します。
	 *
	 * @return LocLclAllR
	 */
	public mcframe.clientMABC.MABCP0700.LclR createLocLclAllR() {
		return mcframe.clientMABC.MABCP0700.LclR.create();
	}

	/**
	 * aLocLclAllLを作成します。
	 *
	 * @return LocLclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.LclR> createLocLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.LclR.class);
	}

	/**
	 * コピーによってaLocSubAllLを設定します。
	 *
	 * aLocSubAllLのインスタンスは変更されません。
	 *
	 * @param dataset LocSubAllL
	 */
	public void setLocSubAllL(MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> aList) {
		if (getLocSubAllL() != aList) {
			getLocSubAllL().setAll(aList);
		}
	}

	/**
	 * [LocSubAll]ブロックのコンテナaLocSubAllLを返します。
	 *
	 * @return LocSubAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> getLocSubAllL() {
		return aLocSubAllL;
	}

	/**
	 * aLocSubAllRを作成します。
	 *
	 * @return LocSubAllR
	 */
	public mcframe.clientMABC.MABCP0700.DtlLocSubR createLocSubAllR() {
		return mcframe.clientMABC.MABCP0700.DtlLocSubR.create();
	}

	/**
	 * aLocSubAllLを作成します。
	 *
	 * @return LocSubAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> createLocSubAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.DtlLocSubR.class);
	}

	/**
	 * コピーによってaLclStrLnAllLを設定します。
	 *
	 * aLclStrLnAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclStrLnAllL
	 */
	public void setLclStrLnAllL(MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> aList) {
		if (getLclStrLnAllL() != aList) {
			getLclStrLnAllL().setAll(aList);
		}
	}

	/**
	 * [LclStrLnAll]ブロックのコンテナaLclStrLnAllLを返します。
	 *
	 * @return LclStrLnAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> getLclStrLnAllL() {
		return aLclStrLnAllL;
	}

	/**
	 * aLclStrLnAllRを作成します。
	 *
	 * @return LclStrLnAllR
	 */
	public mcframe.clientMABC.MABCP0700.LclStrLnR createLclStrLnAllR() {
		return mcframe.clientMABC.MABCP0700.LclStrLnR.create();
	}

	/**
	 * aLclStrLnAllLを作成します。
	 *
	 * @return LclStrLnAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> createLclStrLnAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0700.LclStrLnR.class);
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
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getDtlLocSubL())) ret.add(getDtlLocSubL());
		if(!MCCollectionUtil.contains(ret, getDtlStrLnL())) ret.add(getDtlStrLnL());
		if(!MCCollectionUtil.contains(ret, getLclStrLnL())) ret.add(getLclStrLnL());
		if(!MCCollectionUtil.contains(ret, getStrLnAllL())) ret.add(getStrLnAllL());
		if(!MCCollectionUtil.contains(ret, getLocLclAllL())) ret.add(getLocLclAllL());
		if(!MCCollectionUtil.contains(ret, getLocSubAllL())) ret.add(getLocSubAllL());
		if(!MCCollectionUtil.contains(ret, getLclStrLnAllL())) ret.add(getLclStrLnAllL());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getDtlLocSubL()) return "DtlLocSub";
		if(aCnt == getDtlStrLnL()) return "DtlStrLn";
		if(aCnt == getLclStrLnL()) return "LclStrLn";
		if(aCnt == getStrLnAllL()) return "StrLnAll";
		if(aCnt == getLocLclAllL()) return "LocLclAll";
		if(aCnt == getLocSubAllL()) return "LocSubAll";
		if(aCnt == getLclStrLnAllL()) return "LclStrLnAll";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("DtlLocSub")) return getDtlLocSubL();
		if(bId.equals("DtlStrLn")) return getDtlStrLnL();
		if(bId.equals("LclStrLn")) return getLclStrLnL();
		if(bId.equals("StrLnAll")) return getStrLnAllL();
		if(bId.equals("LocLclAll")) return getLocLclAllL();
		if(bId.equals("LocSubAll")) return getLocSubAllL();
		if(bId.equals("LclStrLnAll")) return getLclStrLnAllL();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(TopDtlPanel);
		ret.add(LocPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(BtmDtlPanel);
		ret.add(LtabPanel);
		ret.add(BLTabPanel);
		ret.add(LclWrkPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(LocSubPanel);
		ret.add(DtlLocSubPanel);
		ret.add(DtlBtnLocSubPanel);
		ret.add(StrLnPanel);
		ret.add(DtlStrLnPanel);
		ret.add(DtlBtnStrLnPanel);
		ret.add(LclWrkStrLnPanel);
		ret.add(LclStrLnPanel);
		ret.add(LclBtnStrLnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_LocReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aDtlLocSubL = createDtlLocSubL();
		aDtlStrLnL = createDtlStrLnL();
		aLclStrLnL = createLclStrLnL();
		aStrLnAllL = createStrLnAllL();
		aLocLclAllL = createLocLclAllL();
		aLocSubAllL = createLocSubAllL();
		aLclStrLnAllL = createLclStrLnAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_LocReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aDtlLocSubL = createDtlLocSubL();
		createDtlLocSubTable();
		DtlLocSubTable.setRowName(name);
		aDtlStrLnL = createDtlStrLnL();
		createDtlStrLnTable();
		DtlStrLnTable.setRowName(name);
		aLclStrLnL = createLclStrLnL();
		createLclStrLnTable();
		LclStrLnTable.setRowName(name);
		aStrLnAllL = createStrLnAllL();
		aLocLclAllL = createLocLclAllL();
		aLocSubAllL = createLocSubAllL();
		aLclStrLnAllL = createLclStrLnAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_LocReg_MC.jbCreateScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateMst((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateTop((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateFold((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateCnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateCtrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateTopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLoc((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateDtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateBtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLtab((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateBLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateDtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateDtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateDtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateDtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateLclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbCreateEastBtn((MABCP_LocReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_LocReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_LocReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_LocReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_LocReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_LocReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_LocReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [TopDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTopDtl(MABCP_LocReg p) {
	}

	/**
	 * [Loc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLoc(MABCP_LocReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_LocReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_LocReg p) {
	}

	/**
	 * [BtmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtmDtl(MABCP_LocReg p) {
	}

	/**
	 * [Ltab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLtab(MABCP_LocReg p) {
	}

	/**
	 * [BLTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBLTab(MABCP_LocReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_LocReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_LocReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_LocReg p) {
	}

	/**
	 * [LocSub]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLocSub(MABCP_LocReg p) {
	}

	/**
	 * [DtlLocSub]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlLocSub(MABCP_LocReg p) {
		p.DtlLocSub_dt_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP0700.DtlLocSubR.$dt);
		p.DtlLocSub_dt_PPanel.setName("DtlLocSub.dt");
		p.columnDtlLocSub_st_dt = p.DtlLocSub_dt_PPanel.columnDt_st_dt;
		p.columnDtlLocSub_st_dt.addAliasName("DtlLocSub.st_dt", p);
		p.columnDtlLocSub_end_dt = p.DtlLocSub_dt_PPanel.columnDt_end_dt;
		p.columnDtlLocSub_end_dt.addAliasName("DtlLocSub.end_dt", p);
	}

	/**
	 * [DtlBtnLocSub]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtnLocSub(MABCP_LocReg p) {
	}

	/**
	 * [StrLn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStrLn(MABCP_LocReg p) {
	}

	/**
	 * [DtlStrLn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlStrLn(MABCP_LocReg p) {
	}

	/**
	 * [DtlBtnStrLn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtnStrLn(MABCP_LocReg p) {
	}

	/**
	 * [LclWrkStrLn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrkStrLn(MABCP_LocReg p) {
	}

	/**
	 * [LclStrLn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclStrLn(MABCP_LocReg p) {
	}

	/**
	 * [LclBtnStrLn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtnStrLn(MABCP_LocReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_LocReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_LocReg p) {
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
	
	
	/** [Cnd_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_site_cd_p = null;

	/**
	 * [Cnd_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_site_cd_ListPutter() {
		if (Cnd_site_cd_p == null) {
			Cnd_site_cd_p = createCnd_site_cd_ListPutter(Cnd_site_cd, "site_cd", "site_nm");

		}
		return Cnd_site_cd_p;
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
	
	
	/** [Cnd_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_lg_grp_cd_p = null;

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lg_grp_cd_ListPutter() {
		if (Cnd_lg_grp_cd_p == null) {
			Cnd_lg_grp_cd_p = createCnd_lg_grp_cd_ListPutter(Cnd_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Cnd_lg_grp_cd_p;
	}
	
	
	/** [Cnd_alloc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alloc_grp_cd_p = null;

	/**
	 * [Cnd_alloc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alloc_grp_cd_ListPutter() {
		if (Cnd_alloc_grp_cd_p == null) {
			Cnd_alloc_grp_cd_p = createCnd_alloc_grp_cd_ListPutter(Cnd_alloc_grp_cd, "alloc_grp_cd", "alloc_grp_nm");

		}
		return Cnd_alloc_grp_cd_p;
	}
	
	
	/** [Cnd_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_grp_cd_p = null;

	/**
	 * [Cnd_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_grp_cd_ListPutter() {
		if (Cnd_loc_grp_cd_p == null) {
			Cnd_loc_grp_cd_p = createCnd_loc_grp_cd_ListPutter(Cnd_loc_grp_cd, "loc_grp_cd", "loc_grp_nm");

		}
		return Cnd_loc_grp_cd_p;
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
	
	
	/** [Cnd_maker_cd_ListPutter]の定義 */
	private MCListPutter Cnd_maker_cd_p = null;

	/**
	 * [Cnd_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_cd_ListPutter() {
		if (Cnd_maker_cd_p == null) {
			Cnd_maker_cd_p = createCnd_maker_cd_ListPutter(Cnd_maker_cd, "maker_cd", "maker_nm");

		}
		return Cnd_maker_cd_p;
	}
	
	
	/** [Dtl_asst_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_asst_dpt_cd_p = null;

	/**
	 * [Dtl_asst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_asst_dpt_cd_ListPutter() {
		if (Dtl_asst_dpt_cd_p == null) {
			Dtl_asst_dpt_cd_p = createDtl_asst_dpt_cd_ListPutter(columnDtl_asst_dpt_cd, "asst_dpt_cd", "asst_dpt_nm","wg_cd_dpt");

		}
		return Dtl_asst_dpt_cd_p;
	}
	
	
	/** [Dtl_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_dpt_cd_p = null;

	/**
	 * [Dtl_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_dpt_cd_ListPutter() {
		if (Dtl_sls_dpt_cd_p == null) {
			Dtl_sls_dpt_cd_p = createDtl_sls_dpt_cd_ListPutter(columnDtl_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return Dtl_sls_dpt_cd_p;
	}
	
	
	/** [Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_p = null;

	/**
	 * [Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_ListPutter() {
		if (Dtl_wg_cd_p == null) {
			Dtl_wg_cd_p = createDtl_wg_cd_ListPutter(columnDtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Dtl_wg_cd_p;
	}
	
	
	/** [Dtl_wg_cd_dpt_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_dpt_p = null;

	/**
	 * [Dtl_wg_cd_dpt_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_dpt_ListPutter() {
		if (Dtl_wg_cd_dpt_p == null) {
			Dtl_wg_cd_dpt_p = createDtl_wg_cd_dpt_ListPutter(columnDtl_wg_cd_dpt, "wg_cd_dpt", "lg_flg","mfg_flg");

		}
		return Dtl_wg_cd_dpt_p;
	}
	
	
	/** [Dtl_site_cd_ListPutter]の定義 */
	private MCListPutter Dtl_site_cd_p = null;

	/**
	 * [Dtl_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_site_cd_ListPutter() {
		if (Dtl_site_cd_p == null) {
			Dtl_site_cd_p = createDtl_site_cd_ListPutter(columnDtl_site_cd, "site_cd", "site_nm","loc_grp_cd","loc_grp_nm","alloc_grp_cd","alloc_grp_nm","lg_grp_cd","lg_grp_nm","cal_cd","cal_nm");

		}
		return Dtl_site_cd_p;
	}
	
	
	/** [Dtl_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_lg_grp_cd_p = null;

	/**
	 * [Dtl_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lg_grp_cd_ListPutter() {
		if (Dtl_lg_grp_cd_p == null) {
			Dtl_lg_grp_cd_p = createDtl_lg_grp_cd_ListPutter(columnDtl_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Dtl_lg_grp_cd_p;
	}
	
	
	/** [Dtl_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_loc_grp_cd_p = null;

	/**
	 * [Dtl_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_loc_grp_cd_ListPutter() {
		if (Dtl_loc_grp_cd_p == null) {
			Dtl_loc_grp_cd_p = createDtl_loc_grp_cd_ListPutter(columnDtl_loc_grp_cd, "loc_grp_cd", "loc_grp_nm");

		}
		return Dtl_loc_grp_cd_p;
	}
	
	
	/** [Dtl_alloc_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_alloc_grp_cd_p = null;

	/**
	 * [Dtl_alloc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alloc_grp_cd_ListPutter() {
		if (Dtl_alloc_grp_cd_p == null) {
			Dtl_alloc_grp_cd_p = createDtl_alloc_grp_cd_ListPutter(columnDtl_alloc_grp_cd, "alloc_grp_cd", "alloc_grp_nm");

		}
		return Dtl_alloc_grp_cd_p;
	}
	
	
	/** [Dtl_sppl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sppl_cd_p = null;

	/**
	 * [Dtl_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sppl_cd_ListPutter() {
		if (Dtl_sppl_cd_p == null) {
			Dtl_sppl_cd_p = createDtl_sppl_cd_ListPutter(columnDtl_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Dtl_sppl_cd_p;
	}
	
	
	/** [Dtl_maker_cd_ListPutter]の定義 */
	private MCListPutter Dtl_maker_cd_p = null;

	/**
	 * [Dtl_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_maker_cd_ListPutter() {
		if (Dtl_maker_cd_p == null) {
			Dtl_maker_cd_p = createDtl_maker_cd_ListPutter(columnDtl_maker_cd, "maker_cd", "maker_nm");

		}
		return Dtl_maker_cd_p;
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
	
	
	/** [Dtl_loc_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_loc_mng_typ_p = null;

	/**
	 * [Dtl_loc_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_loc_mng_typ_ListPutter() {
		if (Dtl_loc_mng_typ_p == null) {
			Dtl_loc_mng_typ_p = createDtl_loc_mng_typ_ListPutter(columnDtl_loc_mng_typ, "loc_mng_typ", "loc_mng_typ_nm");

		}
		return Dtl_loc_mng_typ_p;
	}
	
	
	/** [Dtl_cntry_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cntry_cd_p = null;

	/**
	 * [Dtl_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cntry_cd_ListPutter() {
		if (Dtl_cntry_cd_p == null) {
			Dtl_cntry_cd_p = createDtl_cntry_cd_ListPutter(columnDtl_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Dtl_cntry_cd_p;
	}
	
	
	/** [Dtl_prnt_lcl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_prnt_lcl_cd_p = null;

	/**
	 * [Dtl_prnt_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_prnt_lcl_cd_ListPutter() {
		if (Dtl_prnt_lcl_cd_p == null) {
			Dtl_prnt_lcl_cd_p = createDtl_prnt_lcl_cd_ListPutter(columnDtl_prnt_lcl_cd, "prnt_lcl_cd", "prnt_lcl_nm");

		}
		return Dtl_prnt_lcl_cd_p;
	}
	
	
	/** [Dtl_rsrc_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_rsrc_cd1_p = null;

	/**
	 * [Dtl_rsrc_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rsrc_cd1_ListPutter() {
		if (Dtl_rsrc_cd1_p == null) {
			Dtl_rsrc_cd1_p = createDtl_rsrc_cd1_ListPutter(columnDtl_rsrc_cd1, "rsrc_cd1", "rsrc_nm1");

		}
		return Dtl_rsrc_cd1_p;
	}
	
	
	/** [Dtl_rsrc_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_rsrc_cd2_p = null;

	/**
	 * [Dtl_rsrc_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rsrc_cd2_ListPutter() {
		if (Dtl_rsrc_cd2_p == null) {
			Dtl_rsrc_cd2_p = createDtl_rsrc_cd2_ListPutter(columnDtl_rsrc_cd2, "rsrc_cd2", "rsrc_nm2");

		}
		return Dtl_rsrc_cd2_p;
	}
	
	
	/** [Dtl_ext_sys_loc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ext_sys_loc_typ_p = null;

	/**
	 * [Dtl_ext_sys_loc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ext_sys_loc_typ_ListPutter() {
		if (Dtl_ext_sys_loc_typ_p == null) {
			Dtl_ext_sys_loc_typ_p = createDtl_ext_sys_loc_typ_ListPutter(columnDtl_ext_sys_loc_typ, "ext_sys_loc_typ", "ext_sys_loc_typ_nm");

		}
		return Dtl_ext_sys_loc_typ_p;
	}
	
	
	/** [Lcl_lcl_cd_ListPutter]の定義 */
	private MCListPutter Lcl_lcl_cd_p = null;

	/**
	 * [Lcl_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_lcl_cd_ListPutter() {
		if (Lcl_lcl_cd_p == null) {
			Lcl_lcl_cd_p = createLcl_lcl_cd_ListPutter(columnLcl_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return Lcl_lcl_cd_p;
	}
	
	
	/** [DtlLocSub_asst_dpt_cd_ListPutter]の定義 */
	private MCListPutter DtlLocSub_asst_dpt_cd_p = null;

	/**
	 * [DtlLocSub_asst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlLocSub_asst_dpt_cd_ListPutter() {
		if (DtlLocSub_asst_dpt_cd_p == null) {
			DtlLocSub_asst_dpt_cd_p = createDtlLocSub_asst_dpt_cd_ListPutter(columnDtlLocSub_asst_dpt_cd, "asst_dpt_cd", "asst_dpt_nm");

		}
		return DtlLocSub_asst_dpt_cd_p;
	}
	
	
	/** [DtlLocSub_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter DtlLocSub_sls_dpt_cd_p = null;

	/**
	 * [DtlLocSub_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlLocSub_sls_dpt_cd_ListPutter() {
		if (DtlLocSub_sls_dpt_cd_p == null) {
			DtlLocSub_sls_dpt_cd_p = createDtlLocSub_sls_dpt_cd_ListPutter(columnDtlLocSub_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return DtlLocSub_sls_dpt_cd_p;
	}
	
	
	/** [LclStrLn_lcl_cd_ListPutter]の定義 */
	private MCListPutter LclStrLn_lcl_cd_p = null;

	/**
	 * [LclStrLn_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLclStrLn_lcl_cd_ListPutter() {
		if (LclStrLn_lcl_cd_p == null) {
			LclStrLn_lcl_cd_p = createLclStrLn_lcl_cd_ListPutter(columnLclStrLn_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return LclStrLn_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_LocReg create(){
		MABCP_LocReg p = new MABCP_LocReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_LocReg create(String name){
		MABCP_LocReg p = new MABCP_LocReg(name);
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
		MABCP_LocReg_MC.jbfInitScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitMst((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitTop((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitFold((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitCnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitCtrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitTopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLoc((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitDtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitBtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLtab((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitBLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitDtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitDtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitDtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitDtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitLclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbfInitEastBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitMst((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitTop((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitFold((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitCnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitCtrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitTopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLoc((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitDtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitBtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLtab((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitBLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitDtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitDtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitDtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitDtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitLclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.jbInitEastBtn((MABCP_LocReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		p.MstTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Mst_loc_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.loc_mst_set_typ_nm_Label");
		p.Mst_loc_mst_set_typ_nm = p.beansFactory.createTextField("Mst.loc_mst_set_typ_nm");
		p.Mst_loc_mst_set_typ_nm.setLabel(p.Mst_loc_mst_set_typ_nm_Label);
		p.Mst_sub_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.sub_mst_set_typ_nm_Label");
		p.Mst_sub_mst_set_typ_nm = p.beansFactory.createTextField("Mst.sub_mst_set_typ_nm");
		p.Mst_sub_mst_set_typ_nm.setLabel(p.Mst_sub_mst_set_typ_nm_Label);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_UPD_ADMIN = p.beansFactory.createRadioButton("Cnd.ope_UPD_ADMIN");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_alloc_grp_cd_Label = p.beansFactory.createLabel("Cnd.alloc_grp_cd_Label");
		p.Cnd_alloc_grp_cd = p.beansFactory.createTextComboBox("Cnd.alloc_grp_cd");
		p.Cnd_alloc_grp_cd.setLabel(p.Cnd_alloc_grp_cd_Label);
		p.Cnd_alloc_grp_nm = p.beansFactory.createTextField("Cnd.alloc_grp_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_no_sppl_flg = p.beansFactory.createCheckBox("Cnd.no_sppl_flg");
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTopDtl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.TopDtlPanel = p.beansFactory.createPanel("TopDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Loc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLoc(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LocPanel = p.beansFactory.createPanel("Loc");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm_lcl = p.beansFactory.createTableColumn("Dtl.loc_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_asst_dpt_cd = p.beansFactory.createTableColumn("Dtl.asst_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_asst_dpt_nm = p.beansFactory.createTableColumn("Dtl.asst_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_check_asst_dpt_cd = p.beansFactory.createTableColumn("Dtl.check_asst_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_sls_dpt_cd = p.beansFactory.createTableColumn("Dtl.sls_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_dpt_nm = p.beansFactory.createTableColumn("Dtl.sls_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_check_sls_dpt_cd = p.beansFactory.createTableColumn("Dtl.check_sls_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_cd_dpt = p.beansFactory.createTableColumn("Dtl.wg_cd_dpt", MCColumnType.TEXT_COMBO);
		p.columnDtl_lg_flg = p.beansFactory.createTableColumn("Dtl.lg_flg", MCColumnType.CHECK);
		p.columnDtl_mfg_flg = p.beansFactory.createTableColumn("Dtl.mfg_flg", MCColumnType.CHECK);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_site_cd = p.beansFactory.createTableColumn("Dtl.site_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_site_nm = p.beansFactory.createTableColumn("Dtl.site_nm", MCColumnType.TEXT);
		p.columnDtl_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.lg_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_lg_grp_nm = p.beansFactory.createTableColumn("Dtl.lg_grp_nm", MCColumnType.TEXT);
		p.columnDtl_lg_def_flg = p.beansFactory.createTableColumn("Dtl.lg_def_flg", MCColumnType.CHECK);
		p.columnDtl_loc_grp_cd = p.beansFactory.createTableColumn("Dtl.loc_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_loc_grp_nm = p.beansFactory.createTableColumn("Dtl.loc_grp_nm", MCColumnType.TEXT);
		p.columnDtl_alloc_grp_cd = p.beansFactory.createTableColumn("Dtl.alloc_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_alloc_grp_nm = p.beansFactory.createTableColumn("Dtl.alloc_grp_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_pre_outsrc_act_flg = p.beansFactory.createTableColumn("Dtl.pre_outsrc_act_flg", MCColumnType.CHECK);
		p.columnDtl_ddlv_prov_insp_flg = p.beansFactory.createTableColumn("Dtl.ddlv_prov_insp_flg", MCColumnType.CHECK);
		p.columnDtl_cal_cd = p.beansFactory.createTableColumn("Dtl.cal_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cal_nm = p.beansFactory.createTableColumn("Dtl.cal_nm", MCColumnType.TEXT);
		p.columnDtl_loc_mng_typ = p.beansFactory.createTableColumn("Dtl.loc_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_loc_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.loc_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_num_id = p.beansFactory.createTableColumn("Dtl.num_id", MCColumnType.TEXT);
		p.columnDtl_cntry_cd = p.beansFactory.createTableColumn("Dtl.cntry_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cntry_nm = p.beansFactory.createTableColumn("Dtl.cntry_nm", MCColumnType.TEXT);
		p.columnDtl_prnt_lcl_cd = p.beansFactory.createTableColumn("Dtl.prnt_lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_prnt_lcl_nm = p.beansFactory.createTableColumn("Dtl.prnt_lcl_nm", MCColumnType.TEXT);
		p.columnDtl_stktk_tgt_flg = p.beansFactory.createTableColumn("Dtl.stktk_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_stktk_tor_disp_flg = p.beansFactory.createTableColumn("Dtl.stktk_tor_disp_flg", MCColumnType.CHECK);
		p.columnDtl_stktk_tor_ex_zero_flg = p.beansFactory.createTableColumn("Dtl.stktk_tor_ex_zero_flg", MCColumnType.CHECK);
		p.columnDtl_stktk_act_ex_zero_flg = p.beansFactory.createTableColumn("Dtl.stktk_act_ex_zero_flg", MCColumnType.CHECK);
		p.columnDtl_stktk_amt_flg = p.beansFactory.createTableColumn("Dtl.stktk_amt_flg", MCColumnType.CHECK);
		p.columnDtl_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_alloc_lmt_flg = p.beansFactory.createTableColumn("Dtl.alloc_lmt_flg", MCColumnType.CHECK);
		p.columnDtl_gi_pack_xfer_flg = p.beansFactory.createTableColumn("Dtl.gi_pack_xfer_flg", MCColumnType.CHECK);
		p.columnDtl_gi_vmi_flg = p.beansFactory.createTableColumn("Dtl.gi_vmi_flg", MCColumnType.CHECK);
		p.columnDtl_rsrc_cd1 = p.beansFactory.createTableColumn("Dtl.rsrc_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_rsrc_nm1 = p.beansFactory.createTableColumn("Dtl.rsrc_nm1", MCColumnType.TEXT);
		p.columnDtl_rsrc_cd2 = p.beansFactory.createTableColumn("Dtl.rsrc_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_rsrc_nm2 = p.beansFactory.createTableColumn("Dtl.rsrc_nm2", MCColumnType.TEXT);
		p.columnDtl_ext_sys_loc_typ = p.beansFactory.createTableColumn("Dtl.ext_sys_loc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ext_sys_loc_typ_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_loc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_loc_alc_grp = p.beansFactory.createTableColumn("Dtl.loc_alc_grp", MCColumnType.TEXT);
		p.columnDtl_addr_flg = p.beansFactory.createTableColumn("Dtl.addr_flg", MCColumnType.CHECK);
		p.columnDtl_zip_cd = p.beansFactory.createTableColumn("Dtl.zip_cd", MCColumnType.TEXT);
		p.columnDtl_addr1 = p.beansFactory.createTableColumn("Dtl.addr1", MCColumnType.TEXT);
		p.columnDtl_addr2 = p.beansFactory.createTableColumn("Dtl.addr2", MCColumnType.TEXT);
		p.columnDtl_addr3 = p.beansFactory.createTableColumn("Dtl.addr3", MCColumnType.TEXT);
		p.columnDtl_addr4 = p.beansFactory.createTableColumn("Dtl.addr4", MCColumnType.TEXT);
		p.columnDtl_tel = p.beansFactory.createTableColumn("Dtl.tel", MCColumnType.TEXT);
		p.columnDtl_fax = p.beansFactory.createTableColumn("Dtl.fax", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [BtmDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtmDtl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.BtmDtlPanel = p.beansFactory.createPanel("BtmDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ltab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLtab(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LtabPanel = p.beansFactory.createPanel("Ltab");
		// ブロックの項目の初期化
	}

	/**
	 * [BLTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBLTab(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.BLTabPanel = p.beansFactory.createPanel("BLTab");
		p.BLTabTab = p.beansFactory.createTabbedPane("BLTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_loc_cd = p.beansFactory.createTableColumn("Lcl.loc_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_loc_nm = p.beansFactory.createTableColumn("Lcl.loc_nm", MCColumnType.TEXT);
		p.columnLcl_zip_cd = p.beansFactory.createTableColumn("Lcl.zip_cd", MCColumnType.TEXT);
		p.columnLcl_addr1 = p.beansFactory.createTableColumn("Lcl.addr1", MCColumnType.TEXT);
		p.columnLcl_addr2 = p.beansFactory.createTableColumn("Lcl.addr2", MCColumnType.TEXT);
		p.columnLcl_addr3 = p.beansFactory.createTableColumn("Lcl.addr3", MCColumnType.TEXT);
		p.columnLcl_addr4 = p.beansFactory.createTableColumn("Lcl.addr4", MCColumnType.TEXT);
		p.columnLcl_tel = p.beansFactory.createTableColumn("Lcl.tel", MCColumnType.TEXT);
		p.columnLcl_fax = p.beansFactory.createTableColumn("Lcl.fax", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel = p.beansFactory.createPanel("LclBtn");
		// ブロックの項目の初期化
		p.LclBtn_select_all = p.beansFactory.createButton("LclBtn.select_all", "no_border");
		p.LclBtn_deselect_all = p.beansFactory.createButton("LclBtn.deselect_all", "no_border");
		p.LclBtn_radd = p.beansFactory.createButton("LclBtn.radd", "no_border");
		p.LclBtn_rdel = p.beansFactory.createButton("LclBtn.rdel", "no_border");
		p.LclBtn_rcopy = p.beansFactory.createButton("LclBtn.rcopy", "no_border");
	}

	/**
	 * [LocSub]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLocSub(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LocSubPanel = p.beansFactory.createPanel("LocSub");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlLocSub]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlLocSub(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlLocSubPanel = p.beansFactory.createPanel("DtlLocSub");
		p.DtlLocSubScrollPane = p.beansFactory.createScrollPane("DtlLocSub.scroll");
		p.createDtlLocSubTable();
		// ブロックの項目の初期化
		p.columnDtlLocSub_check = p.beansFactory.createTableColumn("DtlLocSub.check", MCColumnType.CHECK);
		p.columnDtlLocSub_del_flg = p.beansFactory.createTableColumn("DtlLocSub.del_flg", MCColumnType.CHECK);
		p.columnDtlLocSub_loc_cd = p.beansFactory.createTableColumn("DtlLocSub.loc_cd", MCColumnType.TEXT);
		p.columnDtlLocSub_asst_dpt_cd = p.beansFactory.createTableColumn("DtlLocSub.asst_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlLocSub_asst_dpt_nm = p.beansFactory.createTableColumn("DtlLocSub.asst_dpt_nm", MCColumnType.TEXT);
		p.columnDtlLocSub_sls_dpt_cd = p.beansFactory.createTableColumn("DtlLocSub.sls_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlLocSub_sls_dpt_nm = p.beansFactory.createTableColumn("DtlLocSub.sls_dpt_nm", MCColumnType.TEXT);
		p.columnDtlLocSub_memo1 = p.beansFactory.createTableColumn("DtlLocSub.memo1", MCColumnType.TEXT);
		p.columnDtlLocSub_memo2 = p.beansFactory.createTableColumn("DtlLocSub.memo2", MCColumnType.TEXT);
		p.columnDtlLocSub_memo3 = p.beansFactory.createTableColumn("DtlLocSub.memo3", MCColumnType.TEXT);
		p.columnDtlLocSub_ins_usr_id = p.beansFactory.createTableColumn("DtlLocSub.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlLocSub_ins_usr_nm = p.beansFactory.createTableColumn("DtlLocSub.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlLocSub_ins_ts = p.beansFactory.createTableColumn("DtlLocSub.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlLocSub_ins_func_id = p.beansFactory.createTableColumn("DtlLocSub.ins_func_id", MCColumnType.TEXT);
		p.columnDtlLocSub_ins_func_nm = p.beansFactory.createTableColumn("DtlLocSub.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlLocSub_upd_cntr = p.beansFactory.createTableColumn("DtlLocSub.upd_cntr", MCColumnType.NUMBER);
		p.columnDtlLocSub_upd_usr_id = p.beansFactory.createTableColumn("DtlLocSub.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlLocSub_upd_usr_nm = p.beansFactory.createTableColumn("DtlLocSub.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlLocSub_upd_ts = p.beansFactory.createTableColumn("DtlLocSub.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlLocSub_upd_func_id = p.beansFactory.createTableColumn("DtlLocSub.upd_func_id", MCColumnType.TEXT);
		p.columnDtlLocSub_upd_func_nm = p.beansFactory.createTableColumn("DtlLocSub.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlLocSub_upd_srv_req_no = p.beansFactory.createTableColumn("DtlLocSub.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtlLocSub_del_usr_id = p.beansFactory.createTableColumn("DtlLocSub.del_usr_id", MCColumnType.TEXT);
		p.columnDtlLocSub_del_usr_nm = p.beansFactory.createTableColumn("DtlLocSub.del_usr_nm", MCColumnType.TEXT);
		p.columnDtlLocSub_del_ts = p.beansFactory.createTableColumn("DtlLocSub.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtnLocSub]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtnLocSub(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlBtnLocSubPanel = p.beansFactory.createPanel("DtlBtnLocSub");
		// ブロックの項目の初期化
		p.DtlBtnLocSub_select_all = p.beansFactory.createButton("DtlBtnLocSub.select_all", "no_border");
		p.DtlBtnLocSub_deselect_all = p.beansFactory.createButton("DtlBtnLocSub.deselect_all", "no_border");
		p.DtlBtnLocSub_radd = p.beansFactory.createButton("DtlBtnLocSub.radd", "no_border");
		p.DtlBtnLocSub_rdel = p.beansFactory.createButton("DtlBtnLocSub.rdel", "no_border");
		p.DtlBtnLocSub_rcopy = p.beansFactory.createButton("DtlBtnLocSub.rcopy", "no_border");
	}

	/**
	 * [StrLn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.StrLnPanel = p.beansFactory.createPanel("StrLn");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlStrLn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlStrLnPanel = p.beansFactory.createPanel("DtlStrLn");
		p.DtlStrLnTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlStrLnScrollPane = p.beansFactory.createScrollPane("DtlStrLn.scroll");
		p.createDtlStrLnTable();
		// ブロックの項目の初期化
		p.columnDtlStrLn_check = p.beansFactory.createTableColumn("DtlStrLn.check", MCColumnType.CHECK);
		p.columnDtlStrLn_del_flg = p.beansFactory.createTableColumn("DtlStrLn.del_flg", MCColumnType.CHECK);
		p.columnDtlStrLn_loc_cd = p.beansFactory.createTableColumn("DtlStrLn.loc_cd", MCColumnType.TEXT);
		p.columnDtlStrLn_str_ln_cd = p.beansFactory.createTableColumn("DtlStrLn.str_ln_cd", MCColumnType.TEXT);
		p.columnDtlStrLn_str_ln_nm_lcl = p.beansFactory.createTableColumn("DtlStrLn.str_ln_nm_lcl", MCColumnType.TEXT);
		p.columnDtlStrLn_str_ln_nm = p.beansFactory.createTableColumn("DtlStrLn.str_ln_nm", MCColumnType.TEXT);
		p.columnDtlStrLn_ln_flg = p.beansFactory.createTableColumn("DtlStrLn.ln_flg", MCColumnType.CHECK);
		p.columnDtlStrLn_memo1 = p.beansFactory.createTableColumn("DtlStrLn.memo1", MCColumnType.TEXT);
		p.columnDtlStrLn_memo2 = p.beansFactory.createTableColumn("DtlStrLn.memo2", MCColumnType.TEXT);
		p.columnDtlStrLn_memo3 = p.beansFactory.createTableColumn("DtlStrLn.memo3", MCColumnType.TEXT);
		p.columnDtlStrLn_ins_usr_id = p.beansFactory.createTableColumn("DtlStrLn.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlStrLn_ins_usr_nm = p.beansFactory.createTableColumn("DtlStrLn.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlStrLn_ins_ts = p.beansFactory.createTableColumn("DtlStrLn.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlStrLn_ins_func_id = p.beansFactory.createTableColumn("DtlStrLn.ins_func_id", MCColumnType.TEXT);
		p.columnDtlStrLn_ins_func_nm = p.beansFactory.createTableColumn("DtlStrLn.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlStrLn_upd_cntr = p.beansFactory.createTableColumn("DtlStrLn.upd_cntr", MCColumnType.NUMBER);
		p.columnDtlStrLn_upd_usr_id = p.beansFactory.createTableColumn("DtlStrLn.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlStrLn_upd_usr_nm = p.beansFactory.createTableColumn("DtlStrLn.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlStrLn_upd_ts = p.beansFactory.createTableColumn("DtlStrLn.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlStrLn_upd_func_id = p.beansFactory.createTableColumn("DtlStrLn.upd_func_id", MCColumnType.TEXT);
		p.columnDtlStrLn_upd_func_nm = p.beansFactory.createTableColumn("DtlStrLn.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlStrLn_upd_srv_req_no = p.beansFactory.createTableColumn("DtlStrLn.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtlStrLn_del_usr_id = p.beansFactory.createTableColumn("DtlStrLn.del_usr_id", MCColumnType.TEXT);
		p.columnDtlStrLn_del_usr_nm = p.beansFactory.createTableColumn("DtlStrLn.del_usr_nm", MCColumnType.TEXT);
		p.columnDtlStrLn_del_ts = p.beansFactory.createTableColumn("DtlStrLn.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtnStrLn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtnStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlBtnStrLnPanel = p.beansFactory.createPanel("DtlBtnStrLn");
		// ブロックの項目の初期化
		p.DtlBtnStrLn_select_all = p.beansFactory.createButton("DtlBtnStrLn.select_all", "no_border");
		p.DtlBtnStrLn_deselect_all = p.beansFactory.createButton("DtlBtnStrLn.deselect_all", "no_border");
		p.DtlBtnStrLn_radd = p.beansFactory.createButton("DtlBtnStrLn.radd", "no_border");
		p.DtlBtnStrLn_rdel = p.beansFactory.createButton("DtlBtnStrLn.rdel", "no_border");
		p.DtlBtnStrLn_rcopy = p.beansFactory.createButton("DtlBtnStrLn.rcopy", "no_border");
	}

	/**
	 * [LclWrkStrLn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrkStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclWrkStrLnPanel = p.beansFactory.createPanel("LclWrkStrLn");
		// ブロックの項目の初期化
	}

	/**
	 * [LclStrLn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclStrLnPanel = p.beansFactory.createPanel("LclStrLn");
		p.LclStrLnScrollPane = p.beansFactory.createScrollPane("LclStrLn.scroll");
		p.createLclStrLnTable();
		// ブロックの項目の初期化
		p.columnLclStrLn_check = p.beansFactory.createTableColumn("LclStrLn.check", MCColumnType.CHECK);
		p.columnLclStrLn_loc_cd = p.beansFactory.createTableColumn("LclStrLn.loc_cd", MCColumnType.TEXT);
		p.columnLclStrLn_str_ln_cd = p.beansFactory.createTableColumn("LclStrLn.str_ln_cd", MCColumnType.TEXT);
		p.columnLclStrLn_lcl_cd = p.beansFactory.createTableColumn("LclStrLn.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLclStrLn_lcl_nm = p.beansFactory.createTableColumn("LclStrLn.lcl_nm", MCColumnType.TEXT);
		p.columnLclStrLn_str_ln_nm = p.beansFactory.createTableColumn("LclStrLn.str_ln_nm", MCColumnType.TEXT);
		p.columnLclStrLn_memo1 = p.beansFactory.createTableColumn("LclStrLn.memo1", MCColumnType.TEXT);
		p.columnLclStrLn_memo2 = p.beansFactory.createTableColumn("LclStrLn.memo2", MCColumnType.TEXT);
		p.columnLclStrLn_memo3 = p.beansFactory.createTableColumn("LclStrLn.memo3", MCColumnType.TEXT);
		p.columnLclStrLn_ins_usr_id = p.beansFactory.createTableColumn("LclStrLn.ins_usr_id", MCColumnType.TEXT);
		p.columnLclStrLn_ins_usr_nm = p.beansFactory.createTableColumn("LclStrLn.ins_usr_nm", MCColumnType.TEXT);
		p.columnLclStrLn_ins_ts = p.beansFactory.createTableColumn("LclStrLn.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLclStrLn_ins_func_id = p.beansFactory.createTableColumn("LclStrLn.ins_func_id", MCColumnType.TEXT);
		p.columnLclStrLn_ins_func_nm = p.beansFactory.createTableColumn("LclStrLn.ins_func_nm", MCColumnType.TEXT);
		p.columnLclStrLn_upd_cntr = p.beansFactory.createTableColumn("LclStrLn.upd_cntr", MCColumnType.NUMBER);
		p.columnLclStrLn_upd_usr_id = p.beansFactory.createTableColumn("LclStrLn.upd_usr_id", MCColumnType.TEXT);
		p.columnLclStrLn_upd_usr_nm = p.beansFactory.createTableColumn("LclStrLn.upd_usr_nm", MCColumnType.TEXT);
		p.columnLclStrLn_upd_ts = p.beansFactory.createTableColumn("LclStrLn.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLclStrLn_upd_func_id = p.beansFactory.createTableColumn("LclStrLn.upd_func_id", MCColumnType.TEXT);
		p.columnLclStrLn_upd_func_nm = p.beansFactory.createTableColumn("LclStrLn.upd_func_nm", MCColumnType.TEXT);
		p.columnLclStrLn_upd_srv_req_no = p.beansFactory.createTableColumn("LclStrLn.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtnStrLn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtnStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclBtnStrLnPanel = p.beansFactory.createPanel("LclBtnStrLn");
		// ブロックの項目の初期化
		p.LclBtnStrLn_select_all = p.beansFactory.createButton("LclBtnStrLn.select_all", "no_border");
		p.LclBtnStrLn_deselect_all = p.beansFactory.createButton("LclBtnStrLn.deselect_all", "no_border");
		p.LclBtnStrLn_radd = p.beansFactory.createButton("LclBtnStrLn.radd", "no_border");
		p.LclBtnStrLn_rdel = p.beansFactory.createButton("LclBtnStrLn.rdel", "no_border");
		p.LclBtnStrLn_rcopy = p.beansFactory.createButton("LclBtnStrLn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_LocReg p) {
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
	protected static void jbfInitEastBtn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_LocReg p) {
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
	protected static void jbInitMst(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.MstPanel.setBorder(p.MstTitledBorder);
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_loc_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_loc_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_loc_mst_set_typ_nm);
		p.Mst_loc_mst_set_typ_nm.setNextBeans(p.Mst_sub_mst_set_typ_nm);
		p.Mst_loc_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0700.MstR.loc_mst_set_typ_nm_META);
		p.MstPanel.add(p.Mst_sub_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_sub_mst_set_typ_nm);
		p.Mst_sub_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0700.MstR.sub_mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TopDtlPanel);
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
	protected static void jbInitFold(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD_ADMIN);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.ope_META);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.CndPanel.setLastBeans(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_no_sppl_flg);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_no_sppl_flg);
		p.Cnd_no_sppl_flg.setNextBeans(p.Cnd_maker_cd);
		p.Cnd_no_sppl_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.no_sppl_flg_META);
		p.CndPanel.add(p.Cnd_maker_cd_Label);
		p.CndPanel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_cd, true);
		p.CndPanel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.maker_nm_META);
		p.setPluralValueEnable(p.Cnd_maker_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0700.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTopDtl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.add(p.TopDtlPanel);
		p.TopDtlPanel.setNextBeans(p.BtmDtlPanel);
		p.TopDtlPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.TopDtlPanel.add(p.LocPanel, null);
		p.TopDtlPanel.setLastBeans(p.LocPanel);
	}

	/**
	 * [Loc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLoc(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LocPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.LocPanel.add(p.DtlPanel, null);
		p.LocPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.LocPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
	}

	/**
	 * [BtmDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtmDtl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.add(p.BtmDtlPanel);
		p.BtmDtlPanel.setNextBeans(p.BtnPanel);
		p.BtmDtlPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.BtmDtlPanel.add(p.StrLnPanel, null);
		p.BtmDtlPanel.setLastBeans(p.StrLnPanel);
		p.StrLnPanel.setNextBeans(p.LtabPanel);
		p.BtmDtlPanel.add(p.LtabPanel, null);
	}

	/**
	 * [Ltab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLtab(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LtabPanel.setLayoutPosition("CR+");
		// ブロックの項目の初期化
		p.LtabPanel.add(p.BLTabPanel, null);
		p.LtabPanel.setLastBeans(p.BLTabPanel);
	}

	/**
	 * [BLTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBLTab(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.BLTabPanel.add(p.BLTabTab);
		p.BLTabPanel.setLastBeans(p.BLTabTab);
		p.BLTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.BLTabTab.add(p.LocSubPanel, "BLTab.LOCSUB");
		p.BLTabTab.setLastBeans(p.LocSubPanel);
		p.LocSubPanel.setNextBeans(p.LclWrkPanel);
		p.BLTabTab.add(p.LclWrkPanel, "BLTab.LCLWRK");
		p.LclWrkPanel.setNextBeans(p.LclWrkStrLnPanel);
		p.BLTabTab.add(p.LclWrkStrLnPanel, "BLTab.LCLWRKSTRLN");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel.setNextBeans(p.LclWrkStrLnPanel);
		p.LclWrkPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclPanel.add(p.LclScrollPane);
		p.LclPanel.setLastBeans(p.LclTable);
		p.LclScrollPane.setViewportView(p.LclTable);
		p.LclTable.setList(p.getLclL());
		p.LclPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [LocSub]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLocSub(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LocSubPanel.setNextBeans(p.LclWrkPanel);
		p.LocSubPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.LocSubPanel.add(p.DtlLocSubPanel, null);
		p.LocSubPanel.setLastBeans(p.DtlLocSubPanel);
		p.DtlLocSubPanel.setNextBeans(p.DtlBtnLocSubPanel);
		p.LocSubPanel.add(p.DtlBtnLocSubPanel, null);
	}

	/**
	 * [DtlLocSub]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlLocSub(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlLocSubPanel.add(p.DtlLocSubScrollPane);
		p.DtlLocSubPanel.setLastBeans(p.DtlLocSubTable);
		p.DtlLocSubScrollPane.setViewportView(p.DtlLocSubTable);
		p.DtlLocSubTable.setList(p.getDtlLocSubL());
		p.DtlLocSubPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtnLocSub]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtnLocSub(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlBtnLocSubPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtnLocSub_select_all.setIcon("SELECT_ALL");
		p.DtlBtnLocSubPanel.add(p.DtlBtnLocSub_select_all);
		p.DtlBtnLocSubPanel.setLastBeans(p.DtlBtnLocSub_select_all);
		p.DtlBtnLocSub_select_all.setNextBeans(p.DtlBtnLocSub_deselect_all);
		p.DtlBtnLocSub_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtnLocSubPanel.add(p.DtlBtnLocSub_deselect_all);
		p.DtlBtnLocSub_deselect_all.setNextBeans(p.DtlBtnLocSub_radd);
		p.DtlBtnLocSub_radd.setIcon("INSERT_RECORD");
		p.DtlBtnLocSubPanel.add(p.DtlBtnLocSub_radd);
		p.DtlBtnLocSub_radd.setNextBeans(p.DtlBtnLocSub_rdel);
		p.DtlBtnLocSub_rdel.setIcon("DELETE_RECORD");
		p.DtlBtnLocSubPanel.add(p.DtlBtnLocSub_rdel);
		p.DtlBtnLocSub_rdel.setNextBeans(p.DtlBtnLocSub_rcopy);
		p.DtlBtnLocSub_rcopy.setIcon("COPY_RECORD");
		p.DtlBtnLocSubPanel.add(p.DtlBtnLocSub_rcopy);
	}

	/**
	 * [StrLn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.StrLnPanel.setLayoutPosition("CL+");
		// ブロックの項目の初期化
		p.StrLnPanel.add(p.DtlStrLnPanel, null);
		p.StrLnPanel.setLastBeans(p.DtlStrLnPanel);
		p.DtlStrLnPanel.setNextBeans(p.DtlBtnStrLnPanel);
		p.StrLnPanel.add(p.DtlBtnStrLnPanel, null);
	}

	/**
	 * [DtlStrLn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlStrLnPanel.setBorder(p.DtlStrLnTitledBorder);
		p.DtlStrLnPanel.add(p.DtlStrLnScrollPane);
		p.DtlStrLnPanel.setLastBeans(p.DtlStrLnTable);
		p.DtlStrLnScrollPane.setViewportView(p.DtlStrLnTable);
		p.DtlStrLnTable.setList(p.getDtlStrLnL());
		p.DtlStrLnPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtnStrLn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtnStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.DtlBtnStrLnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtnStrLn_select_all.setIcon("SELECT_ALL");
		p.DtlBtnStrLn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.DtlBtnStrLnPanel.add(p.DtlBtnStrLn_select_all);
		p.DtlBtnStrLnPanel.setLastBeans(p.DtlBtnStrLn_select_all);
		p.DtlBtnStrLn_select_all.setNextBeans(p.DtlBtnStrLn_deselect_all);
		p.DtlBtnStrLn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtnStrLn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.DtlBtnStrLnPanel.add(p.DtlBtnStrLn_deselect_all);
		p.DtlBtnStrLn_deselect_all.setNextBeans(p.DtlBtnStrLn_radd);
		p.DtlBtnStrLn_radd.setIcon("INSERT_RECORD");
		p.DtlBtnStrLn_radd.setFunctionKey(MCFunctionKey.F7);
		p.DtlBtnStrLnPanel.add(p.DtlBtnStrLn_radd);
		p.DtlBtnStrLn_radd.setNextBeans(p.DtlBtnStrLn_rdel);
		p.DtlBtnStrLn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtnStrLn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.DtlBtnStrLnPanel.add(p.DtlBtnStrLn_rdel);
		p.DtlBtnStrLn_rdel.setNextBeans(p.DtlBtnStrLn_rcopy);
		p.DtlBtnStrLn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtnStrLn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.DtlBtnStrLnPanel.add(p.DtlBtnStrLn_rcopy);
	}

	/**
	 * [LclWrkStrLn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrkStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclWrkStrLnPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.LclWrkStrLnPanel.add(p.LclStrLnPanel, null);
		p.LclWrkStrLnPanel.setLastBeans(p.LclStrLnPanel);
		p.LclStrLnPanel.setNextBeans(p.LclBtnStrLnPanel);
		p.LclWrkStrLnPanel.add(p.LclBtnStrLnPanel, null);
	}

	/**
	 * [LclStrLn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclStrLnPanel.add(p.LclStrLnScrollPane);
		p.LclStrLnPanel.setLastBeans(p.LclStrLnTable);
		p.LclStrLnScrollPane.setViewportView(p.LclStrLnTable);
		p.LclStrLnTable.setList(p.getLclStrLnL());
		p.LclStrLnPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtnStrLn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtnStrLn(MABCP_LocReg p) {
		// ブロック関連の初期化
		p.LclBtnStrLnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtnStrLn_select_all.setIcon("SELECT_ALL");
		p.LclBtnStrLnPanel.add(p.LclBtnStrLn_select_all);
		p.LclBtnStrLnPanel.setLastBeans(p.LclBtnStrLn_select_all);
		p.LclBtnStrLn_select_all.setNextBeans(p.LclBtnStrLn_deselect_all);
		p.LclBtnStrLn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtnStrLnPanel.add(p.LclBtnStrLn_deselect_all);
		p.LclBtnStrLn_deselect_all.setNextBeans(p.LclBtnStrLn_radd);
		p.LclBtnStrLn_radd.setIcon("INSERT_RECORD");
		p.LclBtnStrLnPanel.add(p.LclBtnStrLn_radd);
		p.LclBtnStrLn_radd.setNextBeans(p.LclBtnStrLn_rdel);
		p.LclBtnStrLn_rdel.setIcon("DELETE_RECORD");
		p.LclBtnStrLnPanel.add(p.LclBtnStrLn_rdel);
		p.LclBtnStrLn_rdel.setNextBeans(p.LclBtnStrLn_rcopy);
		p.LclBtnStrLn_rcopy.setIcon("COPY_RECORD");
		p.LclBtnStrLnPanel.add(p.LclBtnStrLn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_LocReg p) {
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
	protected static void jbInitEastBtn(MABCP_LocReg p) {
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
		MABCP_LocReg_MC.mcInitScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitMst((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitTop((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitFold((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitCnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitCtrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitTopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLoc((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitDtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitBtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLtab((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitBLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitDtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitDtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitDtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitDtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitLclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.mcInitEastBtn((MABCP_LocReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_LocReg_MC.statusInitUPD_ScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Mst((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Top((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Fold((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Cnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Ctrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_TopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Loc((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Dtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_DtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_BtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Ltab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_BLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Lcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_DtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_DtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_StrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_DtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_DtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_Btn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_EastBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_StrLnAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LocLclAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LocSubAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD_LclStrLnAll((MABCP_LocReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_LocReg_MC.statusInitFIX_ScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Mst((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Top((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Fold((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Cnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Ctrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_TopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Loc((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Dtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_DtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_BtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Ltab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_BLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Lcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_DtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_DtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_StrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_DtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_DtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_Btn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_EastBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_StrLnAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LocLclAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LocSubAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitFIX_LclStrLnAll((MABCP_LocReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_LocReg_MC.statusInitDEL_ScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Mst((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Top((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Fold((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Cnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Ctrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_TopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Loc((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Dtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_DtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_BtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Ltab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_BLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Lcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_DtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_DtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_StrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_DtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_DtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_Btn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_EastBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_StrLnAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LocLclAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LocSubAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitDEL_LclStrLnAll((MABCP_LocReg)this);

		// [UPD_ADMIN]ステータスのモードの設定
		MABCP_LocReg_MC.statusInitUPD__ADMIN_ScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Mst((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Top((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Fold((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Cnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Ctrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_TopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Loc((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Dtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_DtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_BtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Ltab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_BLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Lcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_DtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_DtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_StrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_DtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_DtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_Btn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_EastBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_StrLnAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LocLclAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LocSubAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitUPD__ADMIN_LclStrLnAll((MABCP_LocReg)this);

		// [REF]ステータスのモードの設定
		MABCP_LocReg_MC.statusInitREF_ScreenOpe((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Mst((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Top((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Fold((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Cnd((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Ctrl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_TopDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Loc((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Dtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_DtlBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_BtmDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Ltab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_BLTab((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LclWrk((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Lcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LclBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_DtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_DtlBtnLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_StrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_DtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_DtlBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LclWrkStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LclStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LclBtnStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_Btn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_EastBtn((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_StrLnAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LocLclAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LocSubAll((MABCP_LocReg)this);
		MABCP_LocReg_MC.statusInitREF_LclStrLnAll((MABCP_LocReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_LocReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_LocReg p) {
		p.Mst_loc_mst_set_typ_nm.setListListener(p);
		p.Mst_loc_mst_set_typ_nm.addAllListener(p);
		p.Mst_sub_mst_set_typ_nm.setListListener(p);
		p.Mst_sub_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_LocReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_LocReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_LocReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_UPD_ADMIN.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_alloc_grp_cd.setListListener(p);
		p.Cnd_alloc_grp_cd.addAllListener(p);
		p.Cnd_alloc_grp_nm.setListListener(p);
		p.Cnd_alloc_grp_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_no_sppl_flg.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_LocReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [TopDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTopDtl(MABCP_LocReg p) {
	}

	/**
	 *  [Loc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLoc(MABCP_LocReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_LocReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm_lcl.addAllListener(p);
		p.columnDtl_loc_nm_lcl.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_asst_dpt_cd.addAllListener(p);
		p.columnDtl_asst_dpt_cd.setListListener(p);
		p.columnDtl_asst_dpt_nm.addAllListener(p);
		p.columnDtl_asst_dpt_nm.setListListener(p);
		p.columnDtl_check_asst_dpt_cd.addAllListener(p);
		p.columnDtl_check_asst_dpt_cd.setListListener(p);
		p.columnDtl_sls_dpt_cd.addAllListener(p);
		p.columnDtl_sls_dpt_cd.setListListener(p);
		p.columnDtl_sls_dpt_nm.addAllListener(p);
		p.columnDtl_sls_dpt_nm.setListListener(p);
		p.columnDtl_check_sls_dpt_cd.addAllListener(p);
		p.columnDtl_check_sls_dpt_cd.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_cd_dpt.addAllListener(p);
		p.columnDtl_wg_cd_dpt.setListListener(p);
		p.columnDtl_lg_flg.addAllListener(p);
		p.columnDtl_mfg_flg.addAllListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_site_cd.addAllListener(p);
		p.columnDtl_site_cd.setListListener(p);
		p.columnDtl_site_nm.addAllListener(p);
		p.columnDtl_site_nm.setListListener(p);
		p.columnDtl_lg_grp_cd.addAllListener(p);
		p.columnDtl_lg_grp_cd.setListListener(p);
		p.columnDtl_lg_grp_nm.addAllListener(p);
		p.columnDtl_lg_grp_nm.setListListener(p);
		p.columnDtl_lg_def_flg.addAllListener(p);
		p.columnDtl_loc_grp_cd.addAllListener(p);
		p.columnDtl_loc_grp_cd.setListListener(p);
		p.columnDtl_loc_grp_nm.addAllListener(p);
		p.columnDtl_loc_grp_nm.setListListener(p);
		p.columnDtl_alloc_grp_cd.addAllListener(p);
		p.columnDtl_alloc_grp_cd.setListListener(p);
		p.columnDtl_alloc_grp_nm.addAllListener(p);
		p.columnDtl_alloc_grp_nm.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
		p.columnDtl_pre_outsrc_act_flg.addAllListener(p);
		p.columnDtl_ddlv_prov_insp_flg.addAllListener(p);
		p.columnDtl_cal_cd.addAllListener(p);
		p.columnDtl_cal_cd.setListListener(p);
		p.columnDtl_cal_nm.addAllListener(p);
		p.columnDtl_cal_nm.setListListener(p);
		p.columnDtl_loc_mng_typ.addAllListener(p);
		p.columnDtl_loc_mng_typ.setListListener(p);
		p.columnDtl_loc_mng_typ_nm.addAllListener(p);
		p.columnDtl_loc_mng_typ_nm.setListListener(p);
		p.columnDtl_num_id.addAllListener(p);
		p.columnDtl_num_id.setListListener(p);
		p.columnDtl_cntry_cd.addAllListener(p);
		p.columnDtl_cntry_cd.setListListener(p);
		p.columnDtl_cntry_nm.addAllListener(p);
		p.columnDtl_cntry_nm.setListListener(p);
		p.columnDtl_prnt_lcl_cd.addAllListener(p);
		p.columnDtl_prnt_lcl_cd.setListListener(p);
		p.columnDtl_prnt_lcl_nm.addAllListener(p);
		p.columnDtl_prnt_lcl_nm.setListListener(p);
		p.columnDtl_stktk_tgt_flg.addAllListener(p);
		p.columnDtl_stktk_tor_disp_flg.addAllListener(p);
		p.columnDtl_stktk_tor_ex_zero_flg.addAllListener(p);
		p.columnDtl_stktk_act_ex_zero_flg.addAllListener(p);
		p.columnDtl_stktk_amt_flg.addAllListener(p);
		p.columnDtl_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_alloc_lmt_flg.addAllListener(p);
		p.columnDtl_gi_pack_xfer_flg.addAllListener(p);
		p.columnDtl_gi_vmi_flg.addAllListener(p);
		p.columnDtl_rsrc_cd1.addAllListener(p);
		p.columnDtl_rsrc_cd1.setListListener(p);
		p.columnDtl_rsrc_nm1.addAllListener(p);
		p.columnDtl_rsrc_nm1.setListListener(p);
		p.columnDtl_rsrc_cd2.addAllListener(p);
		p.columnDtl_rsrc_cd2.setListListener(p);
		p.columnDtl_rsrc_nm2.addAllListener(p);
		p.columnDtl_rsrc_nm2.setListListener(p);
		p.columnDtl_ext_sys_loc_typ.addAllListener(p);
		p.columnDtl_ext_sys_loc_typ.setListListener(p);
		p.columnDtl_ext_sys_loc_typ_nm.addAllListener(p);
		p.columnDtl_ext_sys_loc_typ_nm.setListListener(p);
		p.columnDtl_loc_alc_grp.addAllListener(p);
		p.columnDtl_loc_alc_grp.setListListener(p);
		p.columnDtl_addr_flg.addAllListener(p);
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
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
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
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_LocReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
	}

	/**
	 *  [BtmDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtmDtl(MABCP_LocReg p) {
	}

	/**
	 *  [Ltab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLtab(MABCP_LocReg p) {
	}

	/**
	 *  [BLTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBLTab(MABCP_LocReg p) {
		p.BLTabTab.addAllListener(p);
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_LocReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_LocReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_loc_cd.addAllListener(p);
		p.columnLcl_loc_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_loc_nm.addAllListener(p);
		p.columnLcl_loc_nm.setListListener(p);
		p.columnLcl_zip_cd.addAllListener(p);
		p.columnLcl_zip_cd.setListListener(p);
		p.columnLcl_addr1.addAllListener(p);
		p.columnLcl_addr1.setListListener(p);
		p.columnLcl_addr2.addAllListener(p);
		p.columnLcl_addr2.setListListener(p);
		p.columnLcl_addr3.addAllListener(p);
		p.columnLcl_addr3.setListListener(p);
		p.columnLcl_addr4.addAllListener(p);
		p.columnLcl_addr4.setListListener(p);
		p.columnLcl_tel.addAllListener(p);
		p.columnLcl_tel.setListListener(p);
		p.columnLcl_fax.addAllListener(p);
		p.columnLcl_fax.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
		p.columnLcl_ins_usr_id.addAllListener(p);
		p.columnLcl_ins_usr_id.setListListener(p);
		p.columnLcl_ins_usr_nm.addAllListener(p);
		p.columnLcl_ins_usr_nm.setListListener(p);
		p.columnLcl_ins_ts.addAllListener(p);
		p.columnLcl_ins_ts.setListListener(p);
		p.columnLcl_ins_func_id.addAllListener(p);
		p.columnLcl_ins_func_id.setListListener(p);
		p.columnLcl_ins_func_nm.addAllListener(p);
		p.columnLcl_ins_func_nm.setListListener(p);
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
		p.columnLcl_upd_usr_id.addAllListener(p);
		p.columnLcl_upd_usr_id.setListListener(p);
		p.columnLcl_upd_usr_nm.addAllListener(p);
		p.columnLcl_upd_usr_nm.setListListener(p);
		p.columnLcl_upd_ts.addAllListener(p);
		p.columnLcl_upd_ts.setListListener(p);
		p.columnLcl_upd_func_id.addAllListener(p);
		p.columnLcl_upd_func_id.setListListener(p);
		p.columnLcl_upd_func_nm.addAllListener(p);
		p.columnLcl_upd_func_nm.setListListener(p);
		p.columnLcl_upd_srv_req_no.addAllListener(p);
		p.columnLcl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABCP_LocReg p) {
		p.LclBtn_select_all.addAllListener(p);
		p.LclBtn_select_all.setAPMethodName("doLclBtn_select_all");
		p.LclBtn_deselect_all.addAllListener(p);
		p.LclBtn_deselect_all.setAPMethodName("doLclBtn_deselect_all");
		p.LclBtn_radd.addAllListener(p);
		p.LclBtn_radd.setAPMethodName("doLclBtn_radd");
		p.LclBtn_rdel.addAllListener(p);
		p.LclBtn_rdel.setAPMethodName("doLclBtn_rdel");
		p.LclBtn_rcopy.addAllListener(p);
		p.LclBtn_rcopy.setAPMethodName("doLclBtn_rcopy");
	}

	/**
	 *  [LocSub]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLocSub(MABCP_LocReg p) {
	}

	/**
	 *  [DtlLocSub]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlLocSub(MABCP_LocReg p) {
		p.DtlLocSubTable.addAllListener(p);
		p.columnDtlLocSub_check.addAllListener(p);
		p.columnDtlLocSub_del_flg.addAllListener(p);
		p.columnDtlLocSub_loc_cd.addAllListener(p);
		p.columnDtlLocSub_loc_cd.setListListener(p);
		p.columnDtlLocSub_asst_dpt_cd.addAllListener(p);
		p.columnDtlLocSub_asst_dpt_cd.setListListener(p);
		p.columnDtlLocSub_asst_dpt_nm.addAllListener(p);
		p.columnDtlLocSub_asst_dpt_nm.setListListener(p);
		p.columnDtlLocSub_sls_dpt_cd.addAllListener(p);
		p.columnDtlLocSub_sls_dpt_cd.setListListener(p);
		p.columnDtlLocSub_sls_dpt_nm.addAllListener(p);
		p.columnDtlLocSub_sls_dpt_nm.setListListener(p);
		p.columnDtlLocSub_memo1.addAllListener(p);
		p.columnDtlLocSub_memo1.setListListener(p);
		p.columnDtlLocSub_memo2.addAllListener(p);
		p.columnDtlLocSub_memo2.setListListener(p);
		p.columnDtlLocSub_memo3.addAllListener(p);
		p.columnDtlLocSub_memo3.setListListener(p);
		p.columnDtlLocSub_ins_usr_id.addAllListener(p);
		p.columnDtlLocSub_ins_usr_id.setListListener(p);
		p.columnDtlLocSub_ins_usr_nm.addAllListener(p);
		p.columnDtlLocSub_ins_usr_nm.setListListener(p);
		p.columnDtlLocSub_ins_ts.addAllListener(p);
		p.columnDtlLocSub_ins_ts.setListListener(p);
		p.columnDtlLocSub_ins_func_id.addAllListener(p);
		p.columnDtlLocSub_ins_func_id.setListListener(p);
		p.columnDtlLocSub_ins_func_nm.addAllListener(p);
		p.columnDtlLocSub_ins_func_nm.setListListener(p);
		p.columnDtlLocSub_upd_cntr.addAllListener(p);
		p.columnDtlLocSub_upd_cntr.setListListener(p);
		p.columnDtlLocSub_upd_usr_id.addAllListener(p);
		p.columnDtlLocSub_upd_usr_id.setListListener(p);
		p.columnDtlLocSub_upd_usr_nm.addAllListener(p);
		p.columnDtlLocSub_upd_usr_nm.setListListener(p);
		p.columnDtlLocSub_upd_ts.addAllListener(p);
		p.columnDtlLocSub_upd_ts.setListListener(p);
		p.columnDtlLocSub_upd_func_id.addAllListener(p);
		p.columnDtlLocSub_upd_func_id.setListListener(p);
		p.columnDtlLocSub_upd_func_nm.addAllListener(p);
		p.columnDtlLocSub_upd_func_nm.setListListener(p);
		p.columnDtlLocSub_upd_srv_req_no.addAllListener(p);
		p.columnDtlLocSub_upd_srv_req_no.setListListener(p);
		p.columnDtlLocSub_del_usr_id.addAllListener(p);
		p.columnDtlLocSub_del_usr_id.setListListener(p);
		p.columnDtlLocSub_del_usr_nm.addAllListener(p);
		p.columnDtlLocSub_del_usr_nm.setListListener(p);
		p.columnDtlLocSub_del_ts.addAllListener(p);
		p.columnDtlLocSub_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtnLocSub]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtnLocSub(MABCP_LocReg p) {
		p.DtlBtnLocSub_select_all.addAllListener(p);
		p.DtlBtnLocSub_select_all.setAPMethodName("doDtlBtnLocSub_select_all");
		p.DtlBtnLocSub_deselect_all.addAllListener(p);
		p.DtlBtnLocSub_deselect_all.setAPMethodName("doDtlBtnLocSub_deselect_all");
		p.DtlBtnLocSub_radd.addAllListener(p);
		p.DtlBtnLocSub_radd.setAPMethodName("doDtlBtnLocSub_radd");
		p.DtlBtnLocSub_rdel.addAllListener(p);
		p.DtlBtnLocSub_rdel.setAPMethodName("doDtlBtnLocSub_rdel");
		p.DtlBtnLocSub_rcopy.addAllListener(p);
		p.DtlBtnLocSub_rcopy.setAPMethodName("doDtlBtnLocSub_rcopy");
	}

	/**
	 *  [StrLn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStrLn(MABCP_LocReg p) {
	}

	/**
	 *  [DtlStrLn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlStrLn(MABCP_LocReg p) {
		p.DtlStrLnTable.addAllListener(p);
		p.columnDtlStrLn_check.addAllListener(p);
		p.columnDtlStrLn_del_flg.addAllListener(p);
		p.columnDtlStrLn_loc_cd.addAllListener(p);
		p.columnDtlStrLn_loc_cd.setListListener(p);
		p.columnDtlStrLn_str_ln_cd.addAllListener(p);
		p.columnDtlStrLn_str_ln_cd.setListListener(p);
		p.columnDtlStrLn_str_ln_nm_lcl.addAllListener(p);
		p.columnDtlStrLn_str_ln_nm_lcl.setListListener(p);
		p.columnDtlStrLn_str_ln_nm.addAllListener(p);
		p.columnDtlStrLn_str_ln_nm.setListListener(p);
		p.columnDtlStrLn_ln_flg.addAllListener(p);
		p.columnDtlStrLn_memo1.addAllListener(p);
		p.columnDtlStrLn_memo1.setListListener(p);
		p.columnDtlStrLn_memo2.addAllListener(p);
		p.columnDtlStrLn_memo2.setListListener(p);
		p.columnDtlStrLn_memo3.addAllListener(p);
		p.columnDtlStrLn_memo3.setListListener(p);
		p.columnDtlStrLn_ins_usr_id.addAllListener(p);
		p.columnDtlStrLn_ins_usr_id.setListListener(p);
		p.columnDtlStrLn_ins_usr_nm.addAllListener(p);
		p.columnDtlStrLn_ins_usr_nm.setListListener(p);
		p.columnDtlStrLn_ins_ts.addAllListener(p);
		p.columnDtlStrLn_ins_ts.setListListener(p);
		p.columnDtlStrLn_ins_func_id.addAllListener(p);
		p.columnDtlStrLn_ins_func_id.setListListener(p);
		p.columnDtlStrLn_ins_func_nm.addAllListener(p);
		p.columnDtlStrLn_ins_func_nm.setListListener(p);
		p.columnDtlStrLn_upd_cntr.addAllListener(p);
		p.columnDtlStrLn_upd_cntr.setListListener(p);
		p.columnDtlStrLn_upd_usr_id.addAllListener(p);
		p.columnDtlStrLn_upd_usr_id.setListListener(p);
		p.columnDtlStrLn_upd_usr_nm.addAllListener(p);
		p.columnDtlStrLn_upd_usr_nm.setListListener(p);
		p.columnDtlStrLn_upd_ts.addAllListener(p);
		p.columnDtlStrLn_upd_ts.setListListener(p);
		p.columnDtlStrLn_upd_func_id.addAllListener(p);
		p.columnDtlStrLn_upd_func_id.setListListener(p);
		p.columnDtlStrLn_upd_func_nm.addAllListener(p);
		p.columnDtlStrLn_upd_func_nm.setListListener(p);
		p.columnDtlStrLn_upd_srv_req_no.addAllListener(p);
		p.columnDtlStrLn_upd_srv_req_no.setListListener(p);
		p.columnDtlStrLn_del_usr_id.addAllListener(p);
		p.columnDtlStrLn_del_usr_id.setListListener(p);
		p.columnDtlStrLn_del_usr_nm.addAllListener(p);
		p.columnDtlStrLn_del_usr_nm.setListListener(p);
		p.columnDtlStrLn_del_ts.addAllListener(p);
		p.columnDtlStrLn_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtnStrLn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtnStrLn(MABCP_LocReg p) {
		p.DtlBtnStrLn_select_all.addAllListener(p);
		p.DtlBtnStrLn_select_all.setAPMethodName("doDtlBtnStrLn_select_all");
		p.DtlBtnStrLn_deselect_all.addAllListener(p);
		p.DtlBtnStrLn_deselect_all.setAPMethodName("doDtlBtnStrLn_deselect_all");
		p.DtlBtnStrLn_radd.addAllListener(p);
		p.DtlBtnStrLn_radd.setAPMethodName("doDtlBtnStrLn_radd");
		p.DtlBtnStrLn_rdel.addAllListener(p);
		p.DtlBtnStrLn_rdel.setAPMethodName("doDtlBtnStrLn_rdel");
		p.DtlBtnStrLn_rcopy.addAllListener(p);
		p.DtlBtnStrLn_rcopy.setAPMethodName("doDtlBtnStrLn_rcopy");
	}

	/**
	 *  [LclWrkStrLn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrkStrLn(MABCP_LocReg p) {
	}

	/**
	 *  [LclStrLn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclStrLn(MABCP_LocReg p) {
		p.LclStrLnTable.addAllListener(p);
		p.columnLclStrLn_check.addAllListener(p);
		p.columnLclStrLn_loc_cd.addAllListener(p);
		p.columnLclStrLn_loc_cd.setListListener(p);
		p.columnLclStrLn_str_ln_cd.addAllListener(p);
		p.columnLclStrLn_str_ln_cd.setListListener(p);
		p.columnLclStrLn_lcl_cd.addAllListener(p);
		p.columnLclStrLn_lcl_cd.setListListener(p);
		p.columnLclStrLn_lcl_nm.addAllListener(p);
		p.columnLclStrLn_lcl_nm.setListListener(p);
		p.columnLclStrLn_str_ln_nm.addAllListener(p);
		p.columnLclStrLn_str_ln_nm.setListListener(p);
		p.columnLclStrLn_memo1.addAllListener(p);
		p.columnLclStrLn_memo1.setListListener(p);
		p.columnLclStrLn_memo2.addAllListener(p);
		p.columnLclStrLn_memo2.setListListener(p);
		p.columnLclStrLn_memo3.addAllListener(p);
		p.columnLclStrLn_memo3.setListListener(p);
		p.columnLclStrLn_ins_usr_id.addAllListener(p);
		p.columnLclStrLn_ins_usr_id.setListListener(p);
		p.columnLclStrLn_ins_usr_nm.addAllListener(p);
		p.columnLclStrLn_ins_usr_nm.setListListener(p);
		p.columnLclStrLn_ins_ts.addAllListener(p);
		p.columnLclStrLn_ins_ts.setListListener(p);
		p.columnLclStrLn_ins_func_id.addAllListener(p);
		p.columnLclStrLn_ins_func_id.setListListener(p);
		p.columnLclStrLn_ins_func_nm.addAllListener(p);
		p.columnLclStrLn_ins_func_nm.setListListener(p);
		p.columnLclStrLn_upd_cntr.addAllListener(p);
		p.columnLclStrLn_upd_cntr.setListListener(p);
		p.columnLclStrLn_upd_usr_id.addAllListener(p);
		p.columnLclStrLn_upd_usr_id.setListListener(p);
		p.columnLclStrLn_upd_usr_nm.addAllListener(p);
		p.columnLclStrLn_upd_usr_nm.setListListener(p);
		p.columnLclStrLn_upd_ts.addAllListener(p);
		p.columnLclStrLn_upd_ts.setListListener(p);
		p.columnLclStrLn_upd_func_id.addAllListener(p);
		p.columnLclStrLn_upd_func_id.setListListener(p);
		p.columnLclStrLn_upd_func_nm.addAllListener(p);
		p.columnLclStrLn_upd_func_nm.setListListener(p);
		p.columnLclStrLn_upd_srv_req_no.addAllListener(p);
		p.columnLclStrLn_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtnStrLn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtnStrLn(MABCP_LocReg p) {
		p.LclBtnStrLn_select_all.addAllListener(p);
		p.LclBtnStrLn_select_all.setAPMethodName("doLclBtnStrLn_select_all");
		p.LclBtnStrLn_deselect_all.addAllListener(p);
		p.LclBtnStrLn_deselect_all.setAPMethodName("doLclBtnStrLn_deselect_all");
		p.LclBtnStrLn_radd.addAllListener(p);
		p.LclBtnStrLn_radd.setAPMethodName("doLclBtnStrLn_radd");
		p.LclBtnStrLn_rdel.addAllListener(p);
		p.LclBtnStrLn_rdel.setAPMethodName("doLclBtnStrLn_rdel");
		p.LclBtnStrLn_rcopy.addAllListener(p);
		p.LclBtnStrLn_rcopy.setAPMethodName("doLclBtnStrLn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_LocReg p) {
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
	protected static void mcInitEastBtn(MABCP_LocReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_LocReg p){
		p.Mst_loc_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Mst_sub_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_LocReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TopDtl(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[Loc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Loc(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_LocReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_loc_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_asst_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_asst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_check_asst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_check_sls_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_cd_dpt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lg_def_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_loc_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alloc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pre_outsrc_act_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ddlv_prov_insp_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cal_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_loc_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_num_id.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cntry_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cntry_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_prnt_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stktk_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_stktk_tor_disp_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_stktk_tor_ex_zero_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_stktk_act_ex_zero_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_stktk_amt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alloc_lmt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_gi_pack_xfer_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_gi_vmi_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rsrc_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rsrc_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rsrc_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_loc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ext_sys_loc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_grp.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tel.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_fax.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_LocReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtmDtl(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ltab(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BLTab(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_LocReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_loc_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_addr1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_tel.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_fax.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_LocReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LocSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LocSub(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[DtlLocSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlLocSub(MABCP_LocReg p){
		p.columnDtlLocSub_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlLocSub_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlLocSub_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlLocSub_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtlLocSub_asst_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlLocSub_asst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_sls_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlLocSub_sls_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlLocSub_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlLocSub_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlLocSub_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlLocSub_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtnLocSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtnLocSub(MABCP_LocReg p){
		p.DtlBtnLocSub_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnLocSub_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnLocSub_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnLocSub_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnLocSub_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_StrLn(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[DtlStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlStrLn(MABCP_LocReg p){
		p.columnDtlStrLn_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStrLn_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStrLn_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlStrLn_str_ln_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStrLn_str_ln_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_str_ln_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStrLn_ln_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStrLn_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStrLn_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStrLn_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStrLn_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlStrLn_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtnStrLn(MABCP_LocReg p){
		p.DtlBtnStrLn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnStrLn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnStrLn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnStrLn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnStrLn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrkStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrkStrLn(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[LclStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclStrLn(MABCP_LocReg p){
		p.columnLclStrLn_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLclStrLn_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLclStrLn_str_ln_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLclStrLn_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLclStrLn_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_str_ln_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLclStrLn_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLclStrLn_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLclStrLn_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLclStrLn_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLclStrLn_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtnStrLn(MABCP_LocReg p){
		p.LclBtnStrLn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtnStrLn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtnStrLn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtnStrLn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtnStrLn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_LocReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_admin.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, UPD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[StrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_StrLnAll(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[LocLclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LocLclAll(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[LocSubAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LocSubAll(MABCP_LocReg p){

	}

	/**
	 * [UPD]ステータスの[LclStrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclStrLnAll(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_LocReg p){
		p.Mst_loc_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Mst_sub_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_LocReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_maker_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TopDtl(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[Loc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Loc(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_LocReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_check_asst_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_check_sls_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_cd_dpt.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lg_def_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pre_outsrc_act_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ddlv_prov_insp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cntry_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cntry_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_stktk_tgt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_stktk_tor_disp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_stktk_tor_ex_zero_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_stktk_act_ex_zero_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_stktk_amt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_lmt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_gi_pack_xfer_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_gi_vmi_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_loc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_loc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_grp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_LocReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BtmDtl(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ltab(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BLTab(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_LocReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_loc_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_fax.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_LocReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LocSub]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LocSub(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[DtlLocSub]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlLocSub(MABCP_LocReg p){
		p.columnDtlLocSub_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_loc_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlLocSub_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtlLocSub_asst_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_asst_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_sls_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_sls_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlLocSub_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtnLocSub]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtnLocSub(MABCP_LocReg p){
		p.DtlBtnLocSub_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnLocSub_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnLocSub_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnLocSub_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnLocSub_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_StrLn(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[DtlStrLn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlStrLn(MABCP_LocReg p){
		p.columnDtlStrLn_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_loc_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlStrLn_str_ln_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_str_ln_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_str_ln_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_ln_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlStrLn_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtnStrLn(MABCP_LocReg p){
		p.DtlBtnStrLn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnStrLn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnStrLn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnStrLn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnStrLn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrkStrLn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrkStrLn(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[LclStrLn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclStrLn(MABCP_LocReg p){
		p.columnLclStrLn_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_loc_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLclStrLn_str_ln_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLclStrLn_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_str_ln_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLclStrLn_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtnStrLn(MABCP_LocReg p){
		p.LclBtnStrLn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtnStrLn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtnStrLn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtnStrLn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtnStrLn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_LocReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, FIX, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, FIX, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[StrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_StrLnAll(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[LocLclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LocLclAll(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[LocSubAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LocSubAll(MABCP_LocReg p){

	}

	/**
	 * [FIX]ステータスの[LclStrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclStrLnAll(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_LocReg p){
		p.Mst_loc_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Mst_sub_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_LocReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_maker_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TopDtl(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[Loc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Loc(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_LocReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_check_asst_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_check_sls_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd_dpt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lg_def_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pre_outsrc_act_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ddlv_prov_insp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cal_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stktk_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stktk_tor_disp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stktk_tor_ex_zero_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stktk_act_ex_zero_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stktk_amt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_lmt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gi_pack_xfer_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gi_vmi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_loc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_loc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_grp.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_LocReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtmDtl(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ltab(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BLTab(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_LocReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_LocReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LocSub]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LocSub(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[DtlLocSub]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlLocSub(MABCP_LocReg p){
		p.columnDtlLocSub_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlLocSub_dt_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtlLocSub_asst_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_asst_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_sls_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_sls_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlLocSub_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtnLocSub]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtnLocSub(MABCP_LocReg p){
		p.DtlBtnLocSub_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnLocSub_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnLocSub_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnLocSub_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnLocSub_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_StrLn(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[DtlStrLn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlStrLn(MABCP_LocReg p){
		p.columnDtlStrLn_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlStrLn_str_ln_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_str_ln_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_str_ln_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_ln_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlStrLn_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtnStrLn(MABCP_LocReg p){
		p.DtlBtnStrLn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnStrLn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnStrLn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnStrLn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnStrLn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrkStrLn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrkStrLn(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[LclStrLn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclStrLn(MABCP_LocReg p){
		p.columnLclStrLn_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLclStrLn_str_ln_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLclStrLn_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_str_ln_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLclStrLn_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtnStrLn(MABCP_LocReg p){
		p.LclBtnStrLn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtnStrLn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtnStrLn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtnStrLn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtnStrLn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_LocReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[StrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_StrLnAll(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[LocLclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LocLclAll(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[LocSubAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LocSubAll(MABCP_LocReg p){

	}

	/**
	 * [DEL]ステータスの[LclStrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclStrLnAll(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_ScreenOpe(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Mst(MABCP_LocReg p){
		p.Mst_loc_mst_set_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Mst_sub_mst_set_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Top(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Fold(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Cnd(MABCP_LocReg p){
		p.Cnd_ope_Group.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Cnd_maker_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Ctrl(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_TopDtl(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Loc]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Loc(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Dtl(MABCP_LocReg p){
		p.columnDtl_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_loc_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_loc_nm_lcl.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_asst_dpt_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_asst_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_check_asst_dpt_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_dpt_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sls_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_check_sls_dpt_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_wg_cd_dpt.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_site_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_lg_grp_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_lg_def_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_loc_grp_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_loc_grp_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_alloc_grp_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sppl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_pre_outsrc_act_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ddlv_prov_insp_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_cal_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_loc_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_num_id.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_cntry_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_cntry_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_prnt_lcl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_stktk_tgt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_stktk_tor_disp_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_stktk_tor_ex_zero_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_stktk_act_ex_zero_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_stktk_amt_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_alloc_lmt_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_gi_pack_xfer_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_gi_vmi_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_rsrc_cd1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_rsrc_nm1.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_rsrc_nm2.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_loc_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ext_sys_loc_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_grp.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_addr_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_zip_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_addr1.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_addr2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_addr3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_addr4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_tel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_fax.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlBtn(MABCP_LocReg p){
		p.DtlBtn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_BtmDtl(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Ltab(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_BLTab(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclWrk(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Lcl(MABCP_LocReg p){
		p.columnLcl_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLcl_loc_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_loc_nm.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLcl_zip_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_addr1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_addr2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_addr3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_addr4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_tel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_fax.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclBtn(MABCP_LocReg p){
		p.LclBtn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[LocSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LocSub(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlLocSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlLocSub(MABCP_LocReg p){
		p.columnDtlLocSub_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlLocSub_del_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlLocSub_loc_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.DtlLocSub_dt_PPanel.putStatus(UPD_ADMIN, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtlLocSub_asst_dpt_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlLocSub_asst_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_sls_dpt_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlLocSub_sls_dpt_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlLocSub_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlLocSub_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlLocSub_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtlLocSub_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlBtnLocSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlBtnLocSub(MABCP_LocReg p){
		p.DtlBtnLocSub_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtnLocSub_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtnLocSub_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtnLocSub_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtnLocSub_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_StrLn(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlStrLn(MABCP_LocReg p){
		p.columnDtlStrLn_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlStrLn_del_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlStrLn_loc_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtlStrLn_str_ln_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlStrLn_str_ln_nm_lcl.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_str_ln_nm.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlStrLn_ln_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlStrLn_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlStrLn_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlStrLn_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlStrLn_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtlStrLn_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlBtnStrLn(MABCP_LocReg p){
		p.DtlBtnStrLn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtnStrLn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtnStrLn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtnStrLn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtnStrLn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclWrkStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclWrkStrLn(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclStrLn(MABCP_LocReg p){
		p.columnLclStrLn_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLclStrLn_loc_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLclStrLn_str_ln_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLclStrLn_lcl_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLclStrLn_lcl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_str_ln_nm.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLclStrLn_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLclStrLn_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLclStrLn_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLclStrLn_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLclStrLn_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclBtnStrLn(MABCP_LocReg p){
		p.LclBtnStrLn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtnStrLn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtnStrLn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtnStrLn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtnStrLn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Btn(MABCP_LocReg p){
		p.Btn_upd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.Btn_upd_admin.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Btn_inf_lbl.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, UPD_ADMIN, MCMode.DISABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_EastBtn(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[StrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_StrLnAll(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[LocLclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LocLclAll(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[LocSubAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LocSubAll(MABCP_LocReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclStrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclStrLnAll(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_LocReg p){
		p.Mst_loc_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Mst_sub_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_LocReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_maker_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_TopDtl(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[Loc]ブロックのモードの設定
	 */
	protected static void statusInitREF_Loc(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_LocReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_check_asst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_check_sls_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd_dpt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mfg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lg_def_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pre_outsrc_act_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ddlv_prov_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_num_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stktk_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stktk_tor_disp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stktk_tor_ex_zero_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stktk_act_ex_zero_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stktk_amt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_lmt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gi_pack_xfer_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gi_vmi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_loc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_loc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_grp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_LocReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtmDtl(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ltab(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_BLTab(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_LocReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_LocReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LocSub]ブロックのモードの設定
	 */
	protected static void statusInitREF_LocSub(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[DtlLocSub]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlLocSub(MABCP_LocReg p){
		p.columnDtlLocSub_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlLocSub_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlLocSub_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtlLocSub_asst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_asst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlLocSub_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlLocSub_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtnLocSub]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtnLocSub(MABCP_LocReg p){
		p.DtlBtnLocSub_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnLocSub_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnLocSub_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnLocSub_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnLocSub_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[StrLn]ブロックのモードの設定
	 */
	protected static void statusInitREF_StrLn(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[DtlStrLn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlStrLn(MABCP_LocReg p){
		p.columnDtlStrLn_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlStrLn_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlStrLn_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_str_ln_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_ln_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlStrLn_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStrLn_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtnStrLn(MABCP_LocReg p){
		p.DtlBtnStrLn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnStrLn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnStrLn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnStrLn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnStrLn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrkStrLn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrkStrLn(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[LclStrLn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclStrLn(MABCP_LocReg p){
		p.columnLclStrLn_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLclStrLn_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLclStrLn_str_ln_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLclStrLn_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLclStrLn_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclStrLn_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclBtnStrLn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtnStrLn(MABCP_LocReg p){
		p.LclBtnStrLn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtnStrLn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtnStrLn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtnStrLn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtnStrLn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_LocReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_inf_lbl.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[StrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_StrLnAll(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[LocLclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LocLclAll(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[LocSubAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LocSubAll(MABCP_LocReg p){

	}

	/**
	 * [REF]ステータスの[LclStrLnAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclStrLnAll(MABCP_LocReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABCP_LocReg_MC.setTableConfigDtl((MABCP_LocReg)this);
		MABCP_LocReg_MC.setTableConfigLcl((MABCP_LocReg)this);
		MABCP_LocReg_MC.setTableConfigDtlLocSub((MABCP_LocReg)this);
		MABCP_LocReg_MC.setTableConfigDtlStrLn((MABCP_LocReg)this);
		MABCP_LocReg_MC.setTableConfigLclStrLn((MABCP_LocReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_LocReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0700.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm_lcl.setMeta(mcframe.clientMABC.MABCP0700.DtlR.loc_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm_lcl);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_asst_dpt_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.asst_dpt_cd_META);
		p.columnDtl_asst_dpt_cd.addLinkBeans(p.columnDtl_asst_dpt_nm,p.columnDtl_wg_cd_dpt);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_dpt_cd);
		p.columnDtl_asst_dpt_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.asst_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_dpt_nm);
		p.columnDtl_check_asst_dpt_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.check_asst_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check_asst_dpt_cd);
		p.columnDtl_sls_dpt_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.sls_dpt_cd_META);
		p.columnDtl_sls_dpt_cd.addLinkBeans(p.columnDtl_sls_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_dpt_cd);
		p.columnDtl_sls_dpt_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.sls_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_dpt_nm);
		p.columnDtl_check_sls_dpt_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.check_sls_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check_sls_dpt_cd);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_cd_dpt.setMeta(mcframe.clientMABC.MABCP0700.DtlR.wg_cd_dpt_META);
		p.columnDtl_wg_cd_dpt.addLinkBeans(p.columnDtl_lg_flg,p.columnDtl_mfg_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd_dpt);
		p.columnDtl_lg_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.lg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_flg);
		p.columnDtl_mfg_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.mfg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_flg);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_site_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.site_cd_META);
		p.columnDtl_site_cd.addLinkBeans(p.columnDtl_site_nm,p.columnDtl_loc_grp_cd,p.columnDtl_loc_grp_nm,p.columnDtl_alloc_grp_cd,p.columnDtl_alloc_grp_nm,p.columnDtl_lg_grp_cd,p.columnDtl_lg_grp_nm,p.columnDtl_cal_cd,p.columnDtl_cal_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_site_cd);
		p.columnDtl_site_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.site_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_nm);
		p.columnDtl_lg_grp_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.lg_grp_cd_META);
		p.columnDtl_lg_grp_cd.addLinkBeans(p.columnDtl_lg_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_cd);
		p.columnDtl_lg_grp_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.lg_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_nm);
		p.columnDtl_lg_def_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.lg_def_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_def_flg);
		p.columnDtl_loc_grp_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.loc_grp_cd_META);
		p.columnDtl_loc_grp_cd.addLinkBeans(p.columnDtl_loc_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_grp_cd);
		p.columnDtl_loc_grp_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.loc_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_grp_nm);
		p.columnDtl_alloc_grp_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.alloc_grp_cd_META);
		p.columnDtl_alloc_grp_cd.addLinkBeans(p.columnDtl_alloc_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_grp_cd);
		p.columnDtl_alloc_grp_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.alloc_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_grp_nm);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.sppl_cd_META);
		p.columnDtl_sppl_cd.setListType(MCListType.STRICT);
		p.columnDtl_sppl_cd.addLinkBeans(p.columnDtl_sppl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.maker_cd_META);
		p.columnDtl_maker_cd.setListType(MCListType.STRICT);
		p.columnDtl_maker_cd.addLinkBeans(p.columnDtl_maker_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_pre_outsrc_act_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.pre_outsrc_act_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_outsrc_act_flg);
		p.columnDtl_ddlv_prov_insp_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.ddlv_prov_insp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ddlv_prov_insp_flg);
		p.columnDtl_cal_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.cal_cd_META);
		p.columnDtl_cal_cd.addLinkBeans(p.columnDtl_cal_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cal_cd);
		p.columnDtl_cal_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cal_nm);
		p.columnDtl_loc_mng_typ.setMeta(mcframe.clientMABC.MABCP0700.DtlR.loc_mng_typ_META);
		p.columnDtl_loc_mng_typ.addLinkBeans(p.columnDtl_loc_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_mng_typ);
		p.columnDtl_loc_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.loc_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_mng_typ_nm);
		p.columnDtl_num_id.setMeta(mcframe.clientMABC.MABCP0700.DtlR.num_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_num_id);
		p.columnDtl_cntry_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.cntry_cd_META);
		p.columnDtl_cntry_cd.addLinkBeans(p.columnDtl_cntry_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_cd);
		p.columnDtl_cntry_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.cntry_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_nm);
		p.columnDtl_prnt_lcl_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.prnt_lcl_cd_META);
		p.columnDtl_prnt_lcl_cd.addLinkBeans(p.columnDtl_prnt_lcl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_prnt_lcl_cd);
		p.columnDtl_prnt_lcl_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.prnt_lcl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prnt_lcl_nm);
		p.columnDtl_stktk_tgt_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.stktk_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stktk_tgt_flg);
		p.columnDtl_stktk_tor_disp_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.stktk_tor_disp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stktk_tor_disp_flg);
		p.columnDtl_stktk_tor_ex_zero_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.stktk_tor_ex_zero_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stktk_tor_ex_zero_flg);
		p.columnDtl_stktk_act_ex_zero_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.stktk_act_ex_zero_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stktk_act_ex_zero_flg);
		p.columnDtl_stktk_amt_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.stktk_amt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stktk_amt_flg);
		p.columnDtl_str_ln_tgt_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_tgt_flg);
		p.columnDtl_alloc_lmt_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.alloc_lmt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_lmt_flg);
		p.columnDtl_gi_pack_xfer_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.gi_pack_xfer_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_pack_xfer_flg);
		p.columnDtl_gi_vmi_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.gi_vmi_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_vmi_flg);
		p.columnDtl_rsrc_cd1.setMeta(mcframe.clientMABC.MABCP0700.DtlR.rsrc_cd1_META);
		p.columnDtl_rsrc_cd1.addLinkBeans(p.columnDtl_rsrc_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_cd1);
		p.columnDtl_rsrc_nm1.setMeta(mcframe.clientMABC.MABCP0700.DtlR.rsrc_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_nm1);
		p.columnDtl_rsrc_cd2.setMeta(mcframe.clientMABC.MABCP0700.DtlR.rsrc_cd2_META);
		p.columnDtl_rsrc_cd2.addLinkBeans(p.columnDtl_rsrc_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_cd2);
		p.columnDtl_rsrc_nm2.setMeta(mcframe.clientMABC.MABCP0700.DtlR.rsrc_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_nm2);
		p.columnDtl_ext_sys_loc_typ.setMeta(mcframe.clientMABC.MABCP0700.DtlR.ext_sys_loc_typ_META);
		p.columnDtl_ext_sys_loc_typ.addLinkBeans(p.columnDtl_ext_sys_loc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_loc_typ);
		p.columnDtl_ext_sys_loc_typ_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.ext_sys_loc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_loc_typ_nm);
		p.columnDtl_loc_alc_grp.setMeta(mcframe.clientMABC.MABCP0700.DtlR.loc_alc_grp_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_alc_grp);
		p.columnDtl_addr_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlR.addr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr_flg);
		p.columnDtl_zip_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlR.zip_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_zip_cd);
		p.columnDtl_addr1.setMeta(mcframe.clientMABC.MABCP0700.DtlR.addr1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr1);
		p.columnDtl_addr2.setMeta(mcframe.clientMABC.MABCP0700.DtlR.addr2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr2);
		p.columnDtl_addr3.setMeta(mcframe.clientMABC.MABCP0700.DtlR.addr3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr3);
		p.columnDtl_addr4.setMeta(mcframe.clientMABC.MABCP0700.DtlR.addr4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr4);
		p.columnDtl_tel.setMeta(mcframe.clientMABC.MABCP0700.DtlR.tel_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tel);
		p.columnDtl_fax.setMeta(mcframe.clientMABC.MABCP0700.DtlR.fax_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fax);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0700.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0700.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0700.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0700.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0700.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0700.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0700.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_LocReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0700.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_loc_cd.setMeta(mcframe.clientMABC.MABCP0700.LclR.loc_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_loc_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0700.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0700.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_loc_nm.setMeta(mcframe.clientMABC.MABCP0700.LclR.loc_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_loc_nm);
		p.columnLcl_zip_cd.setMeta(mcframe.clientMABC.MABCP0700.LclR.zip_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_zip_cd);
		p.columnLcl_addr1.setMeta(mcframe.clientMABC.MABCP0700.LclR.addr1_META);
		p.LclTable.addColumnConfig(p.columnLcl_addr1);
		p.columnLcl_addr2.setMeta(mcframe.clientMABC.MABCP0700.LclR.addr2_META);
		p.LclTable.addColumnConfig(p.columnLcl_addr2);
		p.columnLcl_addr3.setMeta(mcframe.clientMABC.MABCP0700.LclR.addr3_META);
		p.LclTable.addColumnConfig(p.columnLcl_addr3);
		p.columnLcl_addr4.setMeta(mcframe.clientMABC.MABCP0700.LclR.addr4_META);
		p.LclTable.addColumnConfig(p.columnLcl_addr4);
		p.columnLcl_tel.setMeta(mcframe.clientMABC.MABCP0700.LclR.tel_META);
		p.LclTable.addColumnConfig(p.columnLcl_tel);
		p.columnLcl_fax.setMeta(mcframe.clientMABC.MABCP0700.LclR.fax_META);
		p.LclTable.addColumnConfig(p.columnLcl_fax);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0700.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0700.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0700.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0700.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0700.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0700.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0700.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0700.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0700.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0700.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0700.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0700.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0700.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * [DtlLocSub]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlLocSub(MABCP_LocReg p) {
		p.columnDtlLocSub_check.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.check_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_check);
		p.columnDtlLocSub_del_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.del_flg_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_del_flg);
		p.columnDtlLocSub_loc_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.loc_cd_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_loc_cd);
		p.DtlLocSubTable.addTable(p.DtlLocSub_dt_PPanel.DtTable);
		p.columnDtlLocSub_asst_dpt_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.asst_dpt_cd_META);
		p.columnDtlLocSub_asst_dpt_cd.addLinkBeans(p.columnDtlLocSub_asst_dpt_nm);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_asst_dpt_cd);
		p.columnDtlLocSub_asst_dpt_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.asst_dpt_nm_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_asst_dpt_nm);
		p.columnDtlLocSub_sls_dpt_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.sls_dpt_cd_META);
		p.columnDtlLocSub_sls_dpt_cd.addLinkBeans(p.columnDtlLocSub_sls_dpt_nm);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_sls_dpt_cd);
		p.columnDtlLocSub_sls_dpt_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.sls_dpt_nm_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_sls_dpt_nm);
		p.columnDtlLocSub_memo1.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.memo1_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_memo1);
		p.columnDtlLocSub_memo2.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.memo2_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_memo2);
		p.columnDtlLocSub_memo3.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.memo3_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_memo3);
		p.columnDtlLocSub_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.ins_usr_id_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_ins_usr_id);
		p.columnDtlLocSub_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.ins_usr_nm_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_ins_usr_nm);
		p.columnDtlLocSub_ins_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.ins_ts_META);
		p.columnDtlLocSub_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_ins_ts);
		p.columnDtlLocSub_ins_func_id.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.ins_func_id_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_ins_func_id);
		p.columnDtlLocSub_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.ins_func_nm_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_ins_func_nm);
		p.columnDtlLocSub_upd_cntr.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.upd_cntr_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_upd_cntr);
		p.columnDtlLocSub_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.upd_usr_id_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_upd_usr_id);
		p.columnDtlLocSub_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.upd_usr_nm_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_upd_usr_nm);
		p.columnDtlLocSub_upd_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.upd_ts_META);
		p.columnDtlLocSub_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_upd_ts);
		p.columnDtlLocSub_upd_func_id.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.upd_func_id_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_upd_func_id);
		p.columnDtlLocSub_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.upd_func_nm_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_upd_func_nm);
		p.columnDtlLocSub_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.upd_srv_req_no_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_upd_srv_req_no);
		p.columnDtlLocSub_del_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.del_usr_id_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_del_usr_id);
		p.columnDtlLocSub_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.del_usr_nm_META);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_del_usr_nm);
		p.columnDtlLocSub_del_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlLocSubR.del_ts_META);
		p.columnDtlLocSub_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlLocSubTable.addColumnConfig(p.columnDtlLocSub_del_ts);
		// スクロール固定カラムの指定
		p.DtlLocSubTable.setUnscrollColumn(p.columnDtlLocSub_del_flg);
	}

	/**
	 * [DtlStrLn]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlStrLn(MABCP_LocReg p) {
		p.columnDtlStrLn_check.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.check_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_check);
		p.columnDtlStrLn_del_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.del_flg_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_del_flg);
		p.columnDtlStrLn_loc_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.loc_cd_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_loc_cd);
		p.columnDtlStrLn_str_ln_cd.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.str_ln_cd_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_str_ln_cd);
		p.columnDtlStrLn_str_ln_nm_lcl.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.str_ln_nm_lcl_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_str_ln_nm_lcl);
		p.columnDtlStrLn_str_ln_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.str_ln_nm_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_str_ln_nm);
		p.columnDtlStrLn_ln_flg.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.ln_flg_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_ln_flg);
		p.columnDtlStrLn_memo1.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.memo1_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_memo1);
		p.columnDtlStrLn_memo2.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.memo2_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_memo2);
		p.columnDtlStrLn_memo3.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.memo3_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_memo3);
		p.columnDtlStrLn_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.ins_usr_id_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_ins_usr_id);
		p.columnDtlStrLn_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.ins_usr_nm_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_ins_usr_nm);
		p.columnDtlStrLn_ins_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.ins_ts_META);
		p.columnDtlStrLn_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_ins_ts);
		p.columnDtlStrLn_ins_func_id.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.ins_func_id_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_ins_func_id);
		p.columnDtlStrLn_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.ins_func_nm_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_ins_func_nm);
		p.columnDtlStrLn_upd_cntr.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.upd_cntr_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_upd_cntr);
		p.columnDtlStrLn_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.upd_usr_id_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_upd_usr_id);
		p.columnDtlStrLn_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.upd_usr_nm_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_upd_usr_nm);
		p.columnDtlStrLn_upd_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.upd_ts_META);
		p.columnDtlStrLn_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_upd_ts);
		p.columnDtlStrLn_upd_func_id.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.upd_func_id_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_upd_func_id);
		p.columnDtlStrLn_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.upd_func_nm_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_upd_func_nm);
		p.columnDtlStrLn_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.upd_srv_req_no_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_upd_srv_req_no);
		p.columnDtlStrLn_del_usr_id.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.del_usr_id_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_del_usr_id);
		p.columnDtlStrLn_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.del_usr_nm_META);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_del_usr_nm);
		p.columnDtlStrLn_del_ts.setMeta(mcframe.clientMABC.MABCP0700.DtlStrLnR.del_ts_META);
		p.columnDtlStrLn_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlStrLnTable.addColumnConfig(p.columnDtlStrLn_del_ts);
		// スクロール固定カラムの指定
		p.DtlStrLnTable.setUnscrollColumn(p.columnDtlStrLn_del_flg);
	}

	/**
	 * [LclStrLn]ブロックのTableの設定
	 */
	protected static void setTableConfigLclStrLn(MABCP_LocReg p) {
		p.columnLclStrLn_check.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.check_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_check);
		p.columnLclStrLn_loc_cd.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.loc_cd_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_loc_cd);
		p.columnLclStrLn_str_ln_cd.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.str_ln_cd_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_str_ln_cd);
		p.columnLclStrLn_lcl_cd.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.lcl_cd_META);
		p.columnLclStrLn_lcl_cd.addLinkBeans(p.columnLclStrLn_lcl_nm);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_lcl_cd);
		p.columnLclStrLn_lcl_nm.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.lcl_nm_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_lcl_nm);
		p.columnLclStrLn_str_ln_nm.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.str_ln_nm_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_str_ln_nm);
		p.columnLclStrLn_memo1.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.memo1_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_memo1);
		p.columnLclStrLn_memo2.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.memo2_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_memo2);
		p.columnLclStrLn_memo3.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.memo3_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_memo3);
		p.columnLclStrLn_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.ins_usr_id_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_ins_usr_id);
		p.columnLclStrLn_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.ins_usr_nm_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_ins_usr_nm);
		p.columnLclStrLn_ins_ts.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.ins_ts_META);
		p.columnLclStrLn_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_ins_ts);
		p.columnLclStrLn_ins_func_id.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.ins_func_id_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_ins_func_id);
		p.columnLclStrLn_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.ins_func_nm_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_ins_func_nm);
		p.columnLclStrLn_upd_cntr.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.upd_cntr_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_upd_cntr);
		p.columnLclStrLn_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.upd_usr_id_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_upd_usr_id);
		p.columnLclStrLn_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.upd_usr_nm_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_upd_usr_nm);
		p.columnLclStrLn_upd_ts.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.upd_ts_META);
		p.columnLclStrLn_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_upd_ts);
		p.columnLclStrLn_upd_func_id.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.upd_func_id_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_upd_func_id);
		p.columnLclStrLn_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.upd_func_nm_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_upd_func_nm);
		p.columnLclStrLn_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0700.LclStrLnR.upd_srv_req_no_META);
		p.LclStrLnTable.addColumnConfig(p.columnLclStrLn_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclStrLnTable.setUnscrollColumn(p.columnLclStrLn_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_grp_cd.getListConfig().setPutter(getCnd_alloc_grp_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		columnDtl_asst_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_asst_dpt_cd.getListConfig().setPutter(getDtl_asst_dpt_cd_ListPutter());
		columnDtl_sls_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_dpt_cd.getListConfig().setPutter(getDtl_sls_dpt_cd_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		columnDtl_wg_cd_dpt.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd_dpt.getListConfig().setPutter(getDtl_wg_cd_dpt_ListPutter());
		columnDtl_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_site_cd.getListConfig().setPutter(getDtl_site_cd_ListPutter());
		columnDtl_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lg_grp_cd.getListConfig().setPutter(getDtl_lg_grp_cd_ListPutter());
		columnDtl_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_loc_grp_cd.getListConfig().setPutter(getDtl_loc_grp_cd_ListPutter());
		columnDtl_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alloc_grp_cd.getListConfig().setPutter(getDtl_alloc_grp_cd_ListPutter());
		columnDtl_sppl_cd.getListConfig().setPutter(getDtl_sppl_cd_ListPutter());
		columnDtl_maker_cd.getListConfig().setPutter(getDtl_maker_cd_ListPutter());
		columnDtl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cal_cd.getListConfig().setPutter(getDtl_cal_cd_ListPutter());
		columnDtl_loc_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_loc_mng_typ.getListConfig().setPutter(getDtl_loc_mng_typ_ListPutter());
		columnDtl_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cntry_cd.getListConfig().setPutter(getDtl_cntry_cd_ListPutter());
		columnDtl_prnt_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_prnt_lcl_cd.getListConfig().setPutter(getDtl_prnt_lcl_cd_ListPutter());
		columnDtl_rsrc_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rsrc_cd1.getListConfig().setPutter(getDtl_rsrc_cd1_ListPutter());
		columnDtl_rsrc_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rsrc_cd2.getListConfig().setPutter(getDtl_rsrc_cd2_ListPutter());
		columnDtl_ext_sys_loc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ext_sys_loc_typ.getListConfig().setPutter(getDtl_ext_sys_loc_typ_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
		columnDtlLocSub_asst_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlLocSub_asst_dpt_cd.getListConfig().setPutter(getDtlLocSub_asst_dpt_cd_ListPutter());
		columnDtlLocSub_sls_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlLocSub_sls_dpt_cd.getListConfig().setPutter(getDtlLocSub_sls_dpt_cd_ListPutter());
		columnLclStrLn_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLclStrLn_lcl_cd.getListConfig().setPutter(getLclStrLn_lcl_cd_ListPutter());
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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
	 * この画面を[UPD_ADMIN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_ADMINStatus() {
		status = UPD_ADMIN;
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
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (UPD_ADMIN.equals(status)) {
			setUPD_ADMINStatus();
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
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Cnd_alloc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alloc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
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
	 * [Cnd_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_asst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_asst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_cd_dpt_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_dpt_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Dtl_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Dtl_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Dtl_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_alloc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alloc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Dtl_loc_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_loc_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Dtl_prnt_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_prnt_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 
	/**
	 * [Dtl_rsrc_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rsrc_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Rsrc");
		return lp;
	}
	 
	/**
	 * [Dtl_rsrc_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rsrc_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Rsrc");
		return lp;
	}
	 
	/**
	 * [Dtl_ext_sys_loc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ext_sys_loc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSysLocTyp");
		return lp;
	}
	 
	/**
	 * [Lcl_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 
	/**
	 * [DtlLocSub_asst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlLocSub_asst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [DtlLocSub_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlLocSub_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [LclStrLn_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLclStrLn_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_alloc_grp_cd) return getCnd_alloc_grp_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == columnDtl_asst_dpt_cd) return getDtl_asst_dpt_cd(row, info);
		if(combo == columnDtl_sls_dpt_cd) return getDtl_sls_dpt_cd(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == columnDtl_wg_cd_dpt) return getDtl_wg_cd_dpt(row, info);
		if(combo == columnDtl_site_cd) return getDtl_site_cd(row, info);
		if(combo == columnDtl_lg_grp_cd) return getDtl_lg_grp_cd(row, info);
		if(combo == columnDtl_loc_grp_cd) return getDtl_loc_grp_cd(row, info);
		if(combo == columnDtl_alloc_grp_cd) return getDtl_alloc_grp_cd(row, info);
		if(combo == columnDtl_sppl_cd) return getDtl_sppl_cd(row, info);
		if(combo == columnDtl_maker_cd) return getDtl_maker_cd(row, info);
		if(combo == columnDtl_cal_cd) return getDtl_cal_cd(row, info);
		if(combo == columnDtl_loc_mng_typ) return getDtl_loc_mng_typ(row, info);
		if(combo == columnDtl_cntry_cd) return getDtl_cntry_cd(row, info);
		if(combo == columnDtl_prnt_lcl_cd) return getDtl_prnt_lcl_cd(row, info);
		if(combo == columnDtl_rsrc_cd1) return getDtl_rsrc_cd1(row, info);
		if(combo == columnDtl_rsrc_cd2) return getDtl_rsrc_cd2(row, info);
		if(combo == columnDtl_ext_sys_loc_typ) return getDtl_ext_sys_loc_typ(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
		if(combo == columnDtlLocSub_asst_dpt_cd) return getDtlLocSub_asst_dpt_cd(row, info);
		if(combo == columnDtlLocSub_sls_dpt_cd) return getDtlLocSub_sls_dpt_cd(row, info);
		if(combo == columnLclStrLn_lcl_cd) return getLclStrLn_lcl_cd(row, info);
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
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
		else if (ap == DtlBtnLocSub_select_all) doDtlBtnLocSub_select_all(info);
		else if (ap == DtlBtnLocSub_deselect_all) doDtlBtnLocSub_deselect_all(info);
		else if (ap == DtlBtnLocSub_radd) doDtlBtnLocSub_radd(info);
		else if (ap == DtlBtnLocSub_rdel) doDtlBtnLocSub_rdel(info);
		else if (ap == DtlBtnLocSub_rcopy) doDtlBtnLocSub_rcopy(info);
		else if (ap == DtlBtnStrLn_select_all) doDtlBtnStrLn_select_all(info);
		else if (ap == DtlBtnStrLn_deselect_all) doDtlBtnStrLn_deselect_all(info);
		else if (ap == DtlBtnStrLn_radd) doDtlBtnStrLn_radd(info);
		else if (ap == DtlBtnStrLn_rdel) doDtlBtnStrLn_rdel(info);
		else if (ap == DtlBtnStrLn_rcopy) doDtlBtnStrLn_rcopy(info);
		else if (ap == LclBtnStrLn_select_all) doLclBtnStrLn_select_all(info);
		else if (ap == LclBtnStrLn_deselect_all) doLclBtnStrLn_deselect_all(info);
		else if (ap == LclBtnStrLn_radd) doLclBtnStrLn_radd(info);
		else if (ap == LclBtnStrLn_rdel) doLclBtnStrLn_rdel(info);
		else if (ap == LclBtnStrLn_rcopy) doLclBtnStrLn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_admin) doBtn_upd_admin(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_select_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_radd(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rdel(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rcopy(MCEventInfo info);

	/**
	 * [DtlBtnLocSub]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnLocSub_select_all(MCEventInfo info);

	/**
	 * [DtlBtnLocSub]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnLocSub_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtnLocSub]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnLocSub_radd(MCEventInfo info);

	/**
	 * [DtlBtnLocSub]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnLocSub_rdel(MCEventInfo info);

	/**
	 * [DtlBtnLocSub]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnLocSub_rcopy(MCEventInfo info);

	/**
	 * [DtlBtnStrLn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnStrLn_select_all(MCEventInfo info);

	/**
	 * [DtlBtnStrLn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnStrLn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtnStrLn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnStrLn_radd(MCEventInfo info);

	/**
	 * [DtlBtnStrLn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnStrLn_rdel(MCEventInfo info);

	/**
	 * [DtlBtnStrLn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnStrLn_rcopy(MCEventInfo info);

	/**
	 * [LclBtnStrLn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnStrLn_select_all(MCEventInfo info);

	/**
	 * [LclBtnStrLn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnStrLn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtnStrLn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnStrLn_radd(MCEventInfo info);

	/**
	 * [LclBtnStrLn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnStrLn_rdel(MCEventInfo info);

	/**
	 * [LclBtnStrLn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnStrLn_rcopy(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == BLTabTab) return doBLTab_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == DtlLocSubTable) return doDtlLocSub_VC(info);
		if (vc == DtlStrLnTable) return doDtlStrLn_VC(info);
		if (vc == LclStrLnTable) return doLclStrLn_VC(info);
		if (vc == Mst_loc_mst_set_typ_nm) return doMst_loc_mst_set_typ_nm_VC(info);
		if (vc == Mst_sub_mst_set_typ_nm) return doMst_sub_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_alloc_grp_cd) return doCnd_alloc_grp_cd_VC(info);
		if (vc == Cnd_alloc_grp_nm) return doCnd_alloc_grp_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_no_sppl_flg) return doCnd_no_sppl_flg_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm_lcl) return doDtl_loc_nm_lcl_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_asst_dpt_cd) return doDtl_asst_dpt_cd_VC(info);
		if (vc == columnDtl_asst_dpt_nm) return doDtl_asst_dpt_nm_VC(info);
		if (vc == columnDtl_check_asst_dpt_cd) return doDtl_check_asst_dpt_cd_VC(info);
		if (vc == columnDtl_sls_dpt_cd) return doDtl_sls_dpt_cd_VC(info);
		if (vc == columnDtl_sls_dpt_nm) return doDtl_sls_dpt_nm_VC(info);
		if (vc == columnDtl_check_sls_dpt_cd) return doDtl_check_sls_dpt_cd_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_cd_dpt) return doDtl_wg_cd_dpt_VC(info);
		if (vc == columnDtl_lg_flg) return doDtl_lg_flg_VC(info);
		if (vc == columnDtl_mfg_flg) return doDtl_mfg_flg_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_site_cd) return doDtl_site_cd_VC(info);
		if (vc == columnDtl_site_nm) return doDtl_site_nm_VC(info);
		if (vc == columnDtl_lg_grp_cd) return doDtl_lg_grp_cd_VC(info);
		if (vc == columnDtl_lg_grp_nm) return doDtl_lg_grp_nm_VC(info);
		if (vc == columnDtl_lg_def_flg) return doDtl_lg_def_flg_VC(info);
		if (vc == columnDtl_loc_grp_cd) return doDtl_loc_grp_cd_VC(info);
		if (vc == columnDtl_loc_grp_nm) return doDtl_loc_grp_nm_VC(info);
		if (vc == columnDtl_alloc_grp_cd) return doDtl_alloc_grp_cd_VC(info);
		if (vc == columnDtl_alloc_grp_nm) return doDtl_alloc_grp_nm_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_pre_outsrc_act_flg) return doDtl_pre_outsrc_act_flg_VC(info);
		if (vc == columnDtl_ddlv_prov_insp_flg) return doDtl_ddlv_prov_insp_flg_VC(info);
		if (vc == columnDtl_cal_cd) return doDtl_cal_cd_VC(info);
		if (vc == columnDtl_cal_nm) return doDtl_cal_nm_VC(info);
		if (vc == columnDtl_loc_mng_typ) return doDtl_loc_mng_typ_VC(info);
		if (vc == columnDtl_loc_mng_typ_nm) return doDtl_loc_mng_typ_nm_VC(info);
		if (vc == columnDtl_num_id) return doDtl_num_id_VC(info);
		if (vc == columnDtl_cntry_cd) return doDtl_cntry_cd_VC(info);
		if (vc == columnDtl_cntry_nm) return doDtl_cntry_nm_VC(info);
		if (vc == columnDtl_prnt_lcl_cd) return doDtl_prnt_lcl_cd_VC(info);
		if (vc == columnDtl_prnt_lcl_nm) return doDtl_prnt_lcl_nm_VC(info);
		if (vc == columnDtl_stktk_tgt_flg) return doDtl_stktk_tgt_flg_VC(info);
		if (vc == columnDtl_stktk_tor_disp_flg) return doDtl_stktk_tor_disp_flg_VC(info);
		if (vc == columnDtl_stktk_tor_ex_zero_flg) return doDtl_stktk_tor_ex_zero_flg_VC(info);
		if (vc == columnDtl_stktk_act_ex_zero_flg) return doDtl_stktk_act_ex_zero_flg_VC(info);
		if (vc == columnDtl_stktk_amt_flg) return doDtl_stktk_amt_flg_VC(info);
		if (vc == columnDtl_str_ln_tgt_flg) return doDtl_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_alloc_lmt_flg) return doDtl_alloc_lmt_flg_VC(info);
		if (vc == columnDtl_gi_pack_xfer_flg) return doDtl_gi_pack_xfer_flg_VC(info);
		if (vc == columnDtl_gi_vmi_flg) return doDtl_gi_vmi_flg_VC(info);
		if (vc == columnDtl_rsrc_cd1) return doDtl_rsrc_cd1_VC(info);
		if (vc == columnDtl_rsrc_nm1) return doDtl_rsrc_nm1_VC(info);
		if (vc == columnDtl_rsrc_cd2) return doDtl_rsrc_cd2_VC(info);
		if (vc == columnDtl_rsrc_nm2) return doDtl_rsrc_nm2_VC(info);
		if (vc == columnDtl_ext_sys_loc_typ) return doDtl_ext_sys_loc_typ_VC(info);
		if (vc == columnDtl_ext_sys_loc_typ_nm) return doDtl_ext_sys_loc_typ_nm_VC(info);
		if (vc == columnDtl_loc_alc_grp) return doDtl_loc_alc_grp_VC(info);
		if (vc == columnDtl_addr_flg) return doDtl_addr_flg_VC(info);
		if (vc == columnDtl_zip_cd) return doDtl_zip_cd_VC(info);
		if (vc == columnDtl_addr1) return doDtl_addr1_VC(info);
		if (vc == columnDtl_addr2) return doDtl_addr2_VC(info);
		if (vc == columnDtl_addr3) return doDtl_addr3_VC(info);
		if (vc == columnDtl_addr4) return doDtl_addr4_VC(info);
		if (vc == columnDtl_tel) return doDtl_tel_VC(info);
		if (vc == columnDtl_fax) return doDtl_fax_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_loc_cd) return doLcl_loc_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_loc_nm) return doLcl_loc_nm_VC(info);
		if (vc == columnLcl_zip_cd) return doLcl_zip_cd_VC(info);
		if (vc == columnLcl_addr1) return doLcl_addr1_VC(info);
		if (vc == columnLcl_addr2) return doLcl_addr2_VC(info);
		if (vc == columnLcl_addr3) return doLcl_addr3_VC(info);
		if (vc == columnLcl_addr4) return doLcl_addr4_VC(info);
		if (vc == columnLcl_tel) return doLcl_tel_VC(info);
		if (vc == columnLcl_fax) return doLcl_fax_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
		if (vc == columnDtlLocSub_check) return doDtlLocSub_check_VC(info);
		if (vc == columnDtlLocSub_del_flg) return doDtlLocSub_del_flg_VC(info);
		if (vc == columnDtlLocSub_loc_cd) return doDtlLocSub_loc_cd_VC(info);
		if (vc == columnDtlLocSub_asst_dpt_cd) return doDtlLocSub_asst_dpt_cd_VC(info);
		if (vc == columnDtlLocSub_asst_dpt_nm) return doDtlLocSub_asst_dpt_nm_VC(info);
		if (vc == columnDtlLocSub_sls_dpt_cd) return doDtlLocSub_sls_dpt_cd_VC(info);
		if (vc == columnDtlLocSub_sls_dpt_nm) return doDtlLocSub_sls_dpt_nm_VC(info);
		if (vc == columnDtlLocSub_memo1) return doDtlLocSub_memo1_VC(info);
		if (vc == columnDtlLocSub_memo2) return doDtlLocSub_memo2_VC(info);
		if (vc == columnDtlLocSub_memo3) return doDtlLocSub_memo3_VC(info);
		if (vc == columnDtlLocSub_ins_usr_id) return doDtlLocSub_ins_usr_id_VC(info);
		if (vc == columnDtlLocSub_ins_usr_nm) return doDtlLocSub_ins_usr_nm_VC(info);
		if (vc == columnDtlLocSub_ins_ts) return doDtlLocSub_ins_ts_VC(info);
		if (vc == columnDtlLocSub_ins_func_id) return doDtlLocSub_ins_func_id_VC(info);
		if (vc == columnDtlLocSub_ins_func_nm) return doDtlLocSub_ins_func_nm_VC(info);
		if (vc == columnDtlLocSub_upd_cntr) return doDtlLocSub_upd_cntr_VC(info);
		if (vc == columnDtlLocSub_upd_usr_id) return doDtlLocSub_upd_usr_id_VC(info);
		if (vc == columnDtlLocSub_upd_usr_nm) return doDtlLocSub_upd_usr_nm_VC(info);
		if (vc == columnDtlLocSub_upd_ts) return doDtlLocSub_upd_ts_VC(info);
		if (vc == columnDtlLocSub_upd_func_id) return doDtlLocSub_upd_func_id_VC(info);
		if (vc == columnDtlLocSub_upd_func_nm) return doDtlLocSub_upd_func_nm_VC(info);
		if (vc == columnDtlLocSub_upd_srv_req_no) return doDtlLocSub_upd_srv_req_no_VC(info);
		if (vc == columnDtlLocSub_del_usr_id) return doDtlLocSub_del_usr_id_VC(info);
		if (vc == columnDtlLocSub_del_usr_nm) return doDtlLocSub_del_usr_nm_VC(info);
		if (vc == columnDtlLocSub_del_ts) return doDtlLocSub_del_ts_VC(info);
		if (vc == columnDtlStrLn_check) return doDtlStrLn_check_VC(info);
		if (vc == columnDtlStrLn_del_flg) return doDtlStrLn_del_flg_VC(info);
		if (vc == columnDtlStrLn_loc_cd) return doDtlStrLn_loc_cd_VC(info);
		if (vc == columnDtlStrLn_str_ln_cd) return doDtlStrLn_str_ln_cd_VC(info);
		if (vc == columnDtlStrLn_str_ln_nm_lcl) return doDtlStrLn_str_ln_nm_lcl_VC(info);
		if (vc == columnDtlStrLn_str_ln_nm) return doDtlStrLn_str_ln_nm_VC(info);
		if (vc == columnDtlStrLn_ln_flg) return doDtlStrLn_ln_flg_VC(info);
		if (vc == columnDtlStrLn_memo1) return doDtlStrLn_memo1_VC(info);
		if (vc == columnDtlStrLn_memo2) return doDtlStrLn_memo2_VC(info);
		if (vc == columnDtlStrLn_memo3) return doDtlStrLn_memo3_VC(info);
		if (vc == columnDtlStrLn_ins_usr_id) return doDtlStrLn_ins_usr_id_VC(info);
		if (vc == columnDtlStrLn_ins_usr_nm) return doDtlStrLn_ins_usr_nm_VC(info);
		if (vc == columnDtlStrLn_ins_ts) return doDtlStrLn_ins_ts_VC(info);
		if (vc == columnDtlStrLn_ins_func_id) return doDtlStrLn_ins_func_id_VC(info);
		if (vc == columnDtlStrLn_ins_func_nm) return doDtlStrLn_ins_func_nm_VC(info);
		if (vc == columnDtlStrLn_upd_cntr) return doDtlStrLn_upd_cntr_VC(info);
		if (vc == columnDtlStrLn_upd_usr_id) return doDtlStrLn_upd_usr_id_VC(info);
		if (vc == columnDtlStrLn_upd_usr_nm) return doDtlStrLn_upd_usr_nm_VC(info);
		if (vc == columnDtlStrLn_upd_ts) return doDtlStrLn_upd_ts_VC(info);
		if (vc == columnDtlStrLn_upd_func_id) return doDtlStrLn_upd_func_id_VC(info);
		if (vc == columnDtlStrLn_upd_func_nm) return doDtlStrLn_upd_func_nm_VC(info);
		if (vc == columnDtlStrLn_upd_srv_req_no) return doDtlStrLn_upd_srv_req_no_VC(info);
		if (vc == columnDtlStrLn_del_usr_id) return doDtlStrLn_del_usr_id_VC(info);
		if (vc == columnDtlStrLn_del_usr_nm) return doDtlStrLn_del_usr_nm_VC(info);
		if (vc == columnDtlStrLn_del_ts) return doDtlStrLn_del_ts_VC(info);
		if (vc == columnLclStrLn_check) return doLclStrLn_check_VC(info);
		if (vc == columnLclStrLn_loc_cd) return doLclStrLn_loc_cd_VC(info);
		if (vc == columnLclStrLn_str_ln_cd) return doLclStrLn_str_ln_cd_VC(info);
		if (vc == columnLclStrLn_lcl_cd) return doLclStrLn_lcl_cd_VC(info);
		if (vc == columnLclStrLn_lcl_nm) return doLclStrLn_lcl_nm_VC(info);
		if (vc == columnLclStrLn_str_ln_nm) return doLclStrLn_str_ln_nm_VC(info);
		if (vc == columnLclStrLn_memo1) return doLclStrLn_memo1_VC(info);
		if (vc == columnLclStrLn_memo2) return doLclStrLn_memo2_VC(info);
		if (vc == columnLclStrLn_memo3) return doLclStrLn_memo3_VC(info);
		if (vc == columnLclStrLn_ins_usr_id) return doLclStrLn_ins_usr_id_VC(info);
		if (vc == columnLclStrLn_ins_usr_nm) return doLclStrLn_ins_usr_nm_VC(info);
		if (vc == columnLclStrLn_ins_ts) return doLclStrLn_ins_ts_VC(info);
		if (vc == columnLclStrLn_ins_func_id) return doLclStrLn_ins_func_id_VC(info);
		if (vc == columnLclStrLn_ins_func_nm) return doLclStrLn_ins_func_nm_VC(info);
		if (vc == columnLclStrLn_upd_cntr) return doLclStrLn_upd_cntr_VC(info);
		if (vc == columnLclStrLn_upd_usr_id) return doLclStrLn_upd_usr_id_VC(info);
		if (vc == columnLclStrLn_upd_usr_nm) return doLclStrLn_upd_usr_nm_VC(info);
		if (vc == columnLclStrLn_upd_ts) return doLclStrLn_upd_ts_VC(info);
		if (vc == columnLclStrLn_upd_func_id) return doLclStrLn_upd_func_id_VC(info);
		if (vc == columnLclStrLn_upd_func_nm) return doLclStrLn_upd_func_nm_VC(info);
		if (vc == columnLclStrLn_upd_srv_req_no) return doLclStrLn_upd_srv_req_no_VC(info);
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
	 * [BLTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBLTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[loc_mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_loc_mst_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[sub_mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_sub_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check_asst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_asst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check_sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_sls_dpt_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_dpt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lg_def_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_def_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_outsrc_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_outsrc_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ddlv_prov_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ddlv_prov_insp_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prnt_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prnt_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stktk_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stktk_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stktk_tor_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stktk_tor_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stktk_tor_ex_zero_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stktk_tor_ex_zero_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stktk_act_ex_zero_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stktk_act_ex_zero_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stktk_amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stktk_amt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_lmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_lmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_pack_xfer_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_pack_xfer_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_vmi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_vmi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_loc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_loc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_alc_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_alc_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_asst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_asst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlLocSub]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlLocSub_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_str_ln_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[ln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_ln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStrLn]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStrLn_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclStrLn]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclStrLn_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == BLTabTab) doBLTab_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == DtlLocSubTable) doDtlLocSub_NC(info);
		else if (nc == DtlStrLnTable) doDtlStrLn_NC(info);
		else if (nc == LclStrLnTable) doLclStrLn_NC(info);
		else if (nc == Mst_loc_mst_set_typ_nm) doMst_loc_mst_set_typ_nm_NC(info);
		else if (nc == Mst_sub_mst_set_typ_nm) doMst_sub_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NC(info);
		else if (nc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm_lcl) doDtl_loc_nm_lcl_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_asst_dpt_cd) doDtl_asst_dpt_cd_NC(info);
		else if (nc == columnDtl_asst_dpt_nm) doDtl_asst_dpt_nm_NC(info);
		else if (nc == columnDtl_check_asst_dpt_cd) doDtl_check_asst_dpt_cd_NC(info);
		else if (nc == columnDtl_sls_dpt_cd) doDtl_sls_dpt_cd_NC(info);
		else if (nc == columnDtl_sls_dpt_nm) doDtl_sls_dpt_nm_NC(info);
		else if (nc == columnDtl_check_sls_dpt_cd) doDtl_check_sls_dpt_cd_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_cd_dpt) doDtl_wg_cd_dpt_NC(info);
		else if (nc == columnDtl_lg_flg) doDtl_lg_flg_NC(info);
		else if (nc == columnDtl_mfg_flg) doDtl_mfg_flg_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_site_cd) doDtl_site_cd_NC(info);
		else if (nc == columnDtl_site_nm) doDtl_site_nm_NC(info);
		else if (nc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NC(info);
		else if (nc == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NC(info);
		else if (nc == columnDtl_lg_def_flg) doDtl_lg_def_flg_NC(info);
		else if (nc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NC(info);
		else if (nc == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NC(info);
		else if (nc == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NC(info);
		else if (nc == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_pre_outsrc_act_flg) doDtl_pre_outsrc_act_flg_NC(info);
		else if (nc == columnDtl_ddlv_prov_insp_flg) doDtl_ddlv_prov_insp_flg_NC(info);
		else if (nc == columnDtl_cal_cd) doDtl_cal_cd_NC(info);
		else if (nc == columnDtl_cal_nm) doDtl_cal_nm_NC(info);
		else if (nc == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NC(info);
		else if (nc == columnDtl_loc_mng_typ_nm) doDtl_loc_mng_typ_nm_NC(info);
		else if (nc == columnDtl_num_id) doDtl_num_id_NC(info);
		else if (nc == columnDtl_cntry_cd) doDtl_cntry_cd_NC(info);
		else if (nc == columnDtl_cntry_nm) doDtl_cntry_nm_NC(info);
		else if (nc == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NC(info);
		else if (nc == columnDtl_prnt_lcl_nm) doDtl_prnt_lcl_nm_NC(info);
		else if (nc == columnDtl_stktk_tgt_flg) doDtl_stktk_tgt_flg_NC(info);
		else if (nc == columnDtl_stktk_tor_disp_flg) doDtl_stktk_tor_disp_flg_NC(info);
		else if (nc == columnDtl_stktk_tor_ex_zero_flg) doDtl_stktk_tor_ex_zero_flg_NC(info);
		else if (nc == columnDtl_stktk_act_ex_zero_flg) doDtl_stktk_act_ex_zero_flg_NC(info);
		else if (nc == columnDtl_stktk_amt_flg) doDtl_stktk_amt_flg_NC(info);
		else if (nc == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_alloc_lmt_flg) doDtl_alloc_lmt_flg_NC(info);
		else if (nc == columnDtl_gi_pack_xfer_flg) doDtl_gi_pack_xfer_flg_NC(info);
		else if (nc == columnDtl_gi_vmi_flg) doDtl_gi_vmi_flg_NC(info);
		else if (nc == columnDtl_rsrc_cd1) doDtl_rsrc_cd1_NC(info);
		else if (nc == columnDtl_rsrc_nm1) doDtl_rsrc_nm1_NC(info);
		else if (nc == columnDtl_rsrc_cd2) doDtl_rsrc_cd2_NC(info);
		else if (nc == columnDtl_rsrc_nm2) doDtl_rsrc_nm2_NC(info);
		else if (nc == columnDtl_ext_sys_loc_typ) doDtl_ext_sys_loc_typ_NC(info);
		else if (nc == columnDtl_ext_sys_loc_typ_nm) doDtl_ext_sys_loc_typ_nm_NC(info);
		else if (nc == columnDtl_loc_alc_grp) doDtl_loc_alc_grp_NC(info);
		else if (nc == columnDtl_addr_flg) doDtl_addr_flg_NC(info);
		else if (nc == columnDtl_zip_cd) doDtl_zip_cd_NC(info);
		else if (nc == columnDtl_addr1) doDtl_addr1_NC(info);
		else if (nc == columnDtl_addr2) doDtl_addr2_NC(info);
		else if (nc == columnDtl_addr3) doDtl_addr3_NC(info);
		else if (nc == columnDtl_addr4) doDtl_addr4_NC(info);
		else if (nc == columnDtl_tel) doDtl_tel_NC(info);
		else if (nc == columnDtl_fax) doDtl_fax_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_loc_cd) doLcl_loc_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_loc_nm) doLcl_loc_nm_NC(info);
		else if (nc == columnLcl_zip_cd) doLcl_zip_cd_NC(info);
		else if (nc == columnLcl_addr1) doLcl_addr1_NC(info);
		else if (nc == columnLcl_addr2) doLcl_addr2_NC(info);
		else if (nc == columnLcl_addr3) doLcl_addr3_NC(info);
		else if (nc == columnLcl_addr4) doLcl_addr4_NC(info);
		else if (nc == columnLcl_tel) doLcl_tel_NC(info);
		else if (nc == columnLcl_fax) doLcl_fax_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
		else if (nc == columnDtlLocSub_check) doDtlLocSub_check_NC(info);
		else if (nc == columnDtlLocSub_del_flg) doDtlLocSub_del_flg_NC(info);
		else if (nc == columnDtlLocSub_loc_cd) doDtlLocSub_loc_cd_NC(info);
		else if (nc == columnDtlLocSub_asst_dpt_cd) doDtlLocSub_asst_dpt_cd_NC(info);
		else if (nc == columnDtlLocSub_asst_dpt_nm) doDtlLocSub_asst_dpt_nm_NC(info);
		else if (nc == columnDtlLocSub_sls_dpt_cd) doDtlLocSub_sls_dpt_cd_NC(info);
		else if (nc == columnDtlLocSub_sls_dpt_nm) doDtlLocSub_sls_dpt_nm_NC(info);
		else if (nc == columnDtlLocSub_memo1) doDtlLocSub_memo1_NC(info);
		else if (nc == columnDtlLocSub_memo2) doDtlLocSub_memo2_NC(info);
		else if (nc == columnDtlLocSub_memo3) doDtlLocSub_memo3_NC(info);
		else if (nc == columnDtlLocSub_ins_usr_id) doDtlLocSub_ins_usr_id_NC(info);
		else if (nc == columnDtlLocSub_ins_usr_nm) doDtlLocSub_ins_usr_nm_NC(info);
		else if (nc == columnDtlLocSub_ins_ts) doDtlLocSub_ins_ts_NC(info);
		else if (nc == columnDtlLocSub_ins_func_id) doDtlLocSub_ins_func_id_NC(info);
		else if (nc == columnDtlLocSub_ins_func_nm) doDtlLocSub_ins_func_nm_NC(info);
		else if (nc == columnDtlLocSub_upd_cntr) doDtlLocSub_upd_cntr_NC(info);
		else if (nc == columnDtlLocSub_upd_usr_id) doDtlLocSub_upd_usr_id_NC(info);
		else if (nc == columnDtlLocSub_upd_usr_nm) doDtlLocSub_upd_usr_nm_NC(info);
		else if (nc == columnDtlLocSub_upd_ts) doDtlLocSub_upd_ts_NC(info);
		else if (nc == columnDtlLocSub_upd_func_id) doDtlLocSub_upd_func_id_NC(info);
		else if (nc == columnDtlLocSub_upd_func_nm) doDtlLocSub_upd_func_nm_NC(info);
		else if (nc == columnDtlLocSub_upd_srv_req_no) doDtlLocSub_upd_srv_req_no_NC(info);
		else if (nc == columnDtlLocSub_del_usr_id) doDtlLocSub_del_usr_id_NC(info);
		else if (nc == columnDtlLocSub_del_usr_nm) doDtlLocSub_del_usr_nm_NC(info);
		else if (nc == columnDtlLocSub_del_ts) doDtlLocSub_del_ts_NC(info);
		else if (nc == columnDtlStrLn_check) doDtlStrLn_check_NC(info);
		else if (nc == columnDtlStrLn_del_flg) doDtlStrLn_del_flg_NC(info);
		else if (nc == columnDtlStrLn_loc_cd) doDtlStrLn_loc_cd_NC(info);
		else if (nc == columnDtlStrLn_str_ln_cd) doDtlStrLn_str_ln_cd_NC(info);
		else if (nc == columnDtlStrLn_str_ln_nm_lcl) doDtlStrLn_str_ln_nm_lcl_NC(info);
		else if (nc == columnDtlStrLn_str_ln_nm) doDtlStrLn_str_ln_nm_NC(info);
		else if (nc == columnDtlStrLn_ln_flg) doDtlStrLn_ln_flg_NC(info);
		else if (nc == columnDtlStrLn_memo1) doDtlStrLn_memo1_NC(info);
		else if (nc == columnDtlStrLn_memo2) doDtlStrLn_memo2_NC(info);
		else if (nc == columnDtlStrLn_memo3) doDtlStrLn_memo3_NC(info);
		else if (nc == columnDtlStrLn_ins_usr_id) doDtlStrLn_ins_usr_id_NC(info);
		else if (nc == columnDtlStrLn_ins_usr_nm) doDtlStrLn_ins_usr_nm_NC(info);
		else if (nc == columnDtlStrLn_ins_ts) doDtlStrLn_ins_ts_NC(info);
		else if (nc == columnDtlStrLn_ins_func_id) doDtlStrLn_ins_func_id_NC(info);
		else if (nc == columnDtlStrLn_ins_func_nm) doDtlStrLn_ins_func_nm_NC(info);
		else if (nc == columnDtlStrLn_upd_cntr) doDtlStrLn_upd_cntr_NC(info);
		else if (nc == columnDtlStrLn_upd_usr_id) doDtlStrLn_upd_usr_id_NC(info);
		else if (nc == columnDtlStrLn_upd_usr_nm) doDtlStrLn_upd_usr_nm_NC(info);
		else if (nc == columnDtlStrLn_upd_ts) doDtlStrLn_upd_ts_NC(info);
		else if (nc == columnDtlStrLn_upd_func_id) doDtlStrLn_upd_func_id_NC(info);
		else if (nc == columnDtlStrLn_upd_func_nm) doDtlStrLn_upd_func_nm_NC(info);
		else if (nc == columnDtlStrLn_upd_srv_req_no) doDtlStrLn_upd_srv_req_no_NC(info);
		else if (nc == columnDtlStrLn_del_usr_id) doDtlStrLn_del_usr_id_NC(info);
		else if (nc == columnDtlStrLn_del_usr_nm) doDtlStrLn_del_usr_nm_NC(info);
		else if (nc == columnDtlStrLn_del_ts) doDtlStrLn_del_ts_NC(info);
		else if (nc == columnLclStrLn_check) doLclStrLn_check_NC(info);
		else if (nc == columnLclStrLn_loc_cd) doLclStrLn_loc_cd_NC(info);
		else if (nc == columnLclStrLn_str_ln_cd) doLclStrLn_str_ln_cd_NC(info);
		else if (nc == columnLclStrLn_lcl_cd) doLclStrLn_lcl_cd_NC(info);
		else if (nc == columnLclStrLn_lcl_nm) doLclStrLn_lcl_nm_NC(info);
		else if (nc == columnLclStrLn_str_ln_nm) doLclStrLn_str_ln_nm_NC(info);
		else if (nc == columnLclStrLn_memo1) doLclStrLn_memo1_NC(info);
		else if (nc == columnLclStrLn_memo2) doLclStrLn_memo2_NC(info);
		else if (nc == columnLclStrLn_memo3) doLclStrLn_memo3_NC(info);
		else if (nc == columnLclStrLn_ins_usr_id) doLclStrLn_ins_usr_id_NC(info);
		else if (nc == columnLclStrLn_ins_usr_nm) doLclStrLn_ins_usr_nm_NC(info);
		else if (nc == columnLclStrLn_ins_ts) doLclStrLn_ins_ts_NC(info);
		else if (nc == columnLclStrLn_ins_func_id) doLclStrLn_ins_func_id_NC(info);
		else if (nc == columnLclStrLn_ins_func_nm) doLclStrLn_ins_func_nm_NC(info);
		else if (nc == columnLclStrLn_upd_cntr) doLclStrLn_upd_cntr_NC(info);
		else if (nc == columnLclStrLn_upd_usr_id) doLclStrLn_upd_usr_id_NC(info);
		else if (nc == columnLclStrLn_upd_usr_nm) doLclStrLn_upd_usr_nm_NC(info);
		else if (nc == columnLclStrLn_upd_ts) doLclStrLn_upd_ts_NC(info);
		else if (nc == columnLclStrLn_upd_func_id) doLclStrLn_upd_func_id_NC(info);
		else if (nc == columnLclStrLn_upd_func_nm) doLclStrLn_upd_func_nm_NC(info);
		else if (nc == columnLclStrLn_upd_srv_req_no) doLclStrLn_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [BLTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBLTab_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[loc_mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_loc_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[sub_mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_sub_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check_asst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_asst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check_sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_dpt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_def_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_def_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_outsrc_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_outsrc_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ddlv_prov_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ddlv_prov_insp_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tor_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tor_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tor_ex_zero_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tor_ex_zero_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_act_ex_zero_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_act_ex_zero_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_amt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_lmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_lmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_pack_xfer_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_pack_xfer_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_vmi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_vmi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_loc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_loc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_grp_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_tel_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fax_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_asst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_asst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo1_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo2_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo3_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ln_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo1_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo2_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo3_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_check_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo1_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo2_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo3_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == BLTabTab) doBLTab_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == DtlLocSubTable) doDtlLocSub_NE(info);
		else if (ne == DtlStrLnTable) doDtlStrLn_NE(info);
		else if (ne == LclStrLnTable) doLclStrLn_NE(info);
		else if (ne == Mst_loc_mst_set_typ_nm) doMst_loc_mst_set_typ_nm_NE(info);
		else if (ne == Mst_sub_mst_set_typ_nm) doMst_sub_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NE(info);
		else if (ne == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm_lcl) doDtl_loc_nm_lcl_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_asst_dpt_cd) doDtl_asst_dpt_cd_NE(info);
		else if (ne == columnDtl_asst_dpt_nm) doDtl_asst_dpt_nm_NE(info);
		else if (ne == columnDtl_check_asst_dpt_cd) doDtl_check_asst_dpt_cd_NE(info);
		else if (ne == columnDtl_sls_dpt_cd) doDtl_sls_dpt_cd_NE(info);
		else if (ne == columnDtl_sls_dpt_nm) doDtl_sls_dpt_nm_NE(info);
		else if (ne == columnDtl_check_sls_dpt_cd) doDtl_check_sls_dpt_cd_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_cd_dpt) doDtl_wg_cd_dpt_NE(info);
		else if (ne == columnDtl_lg_flg) doDtl_lg_flg_NE(info);
		else if (ne == columnDtl_mfg_flg) doDtl_mfg_flg_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_site_cd) doDtl_site_cd_NE(info);
		else if (ne == columnDtl_site_nm) doDtl_site_nm_NE(info);
		else if (ne == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NE(info);
		else if (ne == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NE(info);
		else if (ne == columnDtl_lg_def_flg) doDtl_lg_def_flg_NE(info);
		else if (ne == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NE(info);
		else if (ne == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NE(info);
		else if (ne == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NE(info);
		else if (ne == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_pre_outsrc_act_flg) doDtl_pre_outsrc_act_flg_NE(info);
		else if (ne == columnDtl_ddlv_prov_insp_flg) doDtl_ddlv_prov_insp_flg_NE(info);
		else if (ne == columnDtl_cal_cd) doDtl_cal_cd_NE(info);
		else if (ne == columnDtl_cal_nm) doDtl_cal_nm_NE(info);
		else if (ne == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NE(info);
		else if (ne == columnDtl_loc_mng_typ_nm) doDtl_loc_mng_typ_nm_NE(info);
		else if (ne == columnDtl_num_id) doDtl_num_id_NE(info);
		else if (ne == columnDtl_cntry_cd) doDtl_cntry_cd_NE(info);
		else if (ne == columnDtl_cntry_nm) doDtl_cntry_nm_NE(info);
		else if (ne == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NE(info);
		else if (ne == columnDtl_prnt_lcl_nm) doDtl_prnt_lcl_nm_NE(info);
		else if (ne == columnDtl_stktk_tgt_flg) doDtl_stktk_tgt_flg_NE(info);
		else if (ne == columnDtl_stktk_tor_disp_flg) doDtl_stktk_tor_disp_flg_NE(info);
		else if (ne == columnDtl_stktk_tor_ex_zero_flg) doDtl_stktk_tor_ex_zero_flg_NE(info);
		else if (ne == columnDtl_stktk_act_ex_zero_flg) doDtl_stktk_act_ex_zero_flg_NE(info);
		else if (ne == columnDtl_stktk_amt_flg) doDtl_stktk_amt_flg_NE(info);
		else if (ne == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_alloc_lmt_flg) doDtl_alloc_lmt_flg_NE(info);
		else if (ne == columnDtl_gi_pack_xfer_flg) doDtl_gi_pack_xfer_flg_NE(info);
		else if (ne == columnDtl_gi_vmi_flg) doDtl_gi_vmi_flg_NE(info);
		else if (ne == columnDtl_rsrc_cd1) doDtl_rsrc_cd1_NE(info);
		else if (ne == columnDtl_rsrc_nm1) doDtl_rsrc_nm1_NE(info);
		else if (ne == columnDtl_rsrc_cd2) doDtl_rsrc_cd2_NE(info);
		else if (ne == columnDtl_rsrc_nm2) doDtl_rsrc_nm2_NE(info);
		else if (ne == columnDtl_ext_sys_loc_typ) doDtl_ext_sys_loc_typ_NE(info);
		else if (ne == columnDtl_ext_sys_loc_typ_nm) doDtl_ext_sys_loc_typ_nm_NE(info);
		else if (ne == columnDtl_loc_alc_grp) doDtl_loc_alc_grp_NE(info);
		else if (ne == columnDtl_addr_flg) doDtl_addr_flg_NE(info);
		else if (ne == columnDtl_zip_cd) doDtl_zip_cd_NE(info);
		else if (ne == columnDtl_addr1) doDtl_addr1_NE(info);
		else if (ne == columnDtl_addr2) doDtl_addr2_NE(info);
		else if (ne == columnDtl_addr3) doDtl_addr3_NE(info);
		else if (ne == columnDtl_addr4) doDtl_addr4_NE(info);
		else if (ne == columnDtl_tel) doDtl_tel_NE(info);
		else if (ne == columnDtl_fax) doDtl_fax_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_loc_cd) doLcl_loc_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_loc_nm) doLcl_loc_nm_NE(info);
		else if (ne == columnLcl_zip_cd) doLcl_zip_cd_NE(info);
		else if (ne == columnLcl_addr1) doLcl_addr1_NE(info);
		else if (ne == columnLcl_addr2) doLcl_addr2_NE(info);
		else if (ne == columnLcl_addr3) doLcl_addr3_NE(info);
		else if (ne == columnLcl_addr4) doLcl_addr4_NE(info);
		else if (ne == columnLcl_tel) doLcl_tel_NE(info);
		else if (ne == columnLcl_fax) doLcl_fax_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
		else if (ne == columnDtlLocSub_check) doDtlLocSub_check_NE(info);
		else if (ne == columnDtlLocSub_del_flg) doDtlLocSub_del_flg_NE(info);
		else if (ne == columnDtlLocSub_loc_cd) doDtlLocSub_loc_cd_NE(info);
		else if (ne == columnDtlLocSub_asst_dpt_cd) doDtlLocSub_asst_dpt_cd_NE(info);
		else if (ne == columnDtlLocSub_asst_dpt_nm) doDtlLocSub_asst_dpt_nm_NE(info);
		else if (ne == columnDtlLocSub_sls_dpt_cd) doDtlLocSub_sls_dpt_cd_NE(info);
		else if (ne == columnDtlLocSub_sls_dpt_nm) doDtlLocSub_sls_dpt_nm_NE(info);
		else if (ne == columnDtlLocSub_memo1) doDtlLocSub_memo1_NE(info);
		else if (ne == columnDtlLocSub_memo2) doDtlLocSub_memo2_NE(info);
		else if (ne == columnDtlLocSub_memo3) doDtlLocSub_memo3_NE(info);
		else if (ne == columnDtlLocSub_ins_usr_id) doDtlLocSub_ins_usr_id_NE(info);
		else if (ne == columnDtlLocSub_ins_usr_nm) doDtlLocSub_ins_usr_nm_NE(info);
		else if (ne == columnDtlLocSub_ins_ts) doDtlLocSub_ins_ts_NE(info);
		else if (ne == columnDtlLocSub_ins_func_id) doDtlLocSub_ins_func_id_NE(info);
		else if (ne == columnDtlLocSub_ins_func_nm) doDtlLocSub_ins_func_nm_NE(info);
		else if (ne == columnDtlLocSub_upd_cntr) doDtlLocSub_upd_cntr_NE(info);
		else if (ne == columnDtlLocSub_upd_usr_id) doDtlLocSub_upd_usr_id_NE(info);
		else if (ne == columnDtlLocSub_upd_usr_nm) doDtlLocSub_upd_usr_nm_NE(info);
		else if (ne == columnDtlLocSub_upd_ts) doDtlLocSub_upd_ts_NE(info);
		else if (ne == columnDtlLocSub_upd_func_id) doDtlLocSub_upd_func_id_NE(info);
		else if (ne == columnDtlLocSub_upd_func_nm) doDtlLocSub_upd_func_nm_NE(info);
		else if (ne == columnDtlLocSub_upd_srv_req_no) doDtlLocSub_upd_srv_req_no_NE(info);
		else if (ne == columnDtlLocSub_del_usr_id) doDtlLocSub_del_usr_id_NE(info);
		else if (ne == columnDtlLocSub_del_usr_nm) doDtlLocSub_del_usr_nm_NE(info);
		else if (ne == columnDtlLocSub_del_ts) doDtlLocSub_del_ts_NE(info);
		else if (ne == columnDtlStrLn_check) doDtlStrLn_check_NE(info);
		else if (ne == columnDtlStrLn_del_flg) doDtlStrLn_del_flg_NE(info);
		else if (ne == columnDtlStrLn_loc_cd) doDtlStrLn_loc_cd_NE(info);
		else if (ne == columnDtlStrLn_str_ln_cd) doDtlStrLn_str_ln_cd_NE(info);
		else if (ne == columnDtlStrLn_str_ln_nm_lcl) doDtlStrLn_str_ln_nm_lcl_NE(info);
		else if (ne == columnDtlStrLn_str_ln_nm) doDtlStrLn_str_ln_nm_NE(info);
		else if (ne == columnDtlStrLn_ln_flg) doDtlStrLn_ln_flg_NE(info);
		else if (ne == columnDtlStrLn_memo1) doDtlStrLn_memo1_NE(info);
		else if (ne == columnDtlStrLn_memo2) doDtlStrLn_memo2_NE(info);
		else if (ne == columnDtlStrLn_memo3) doDtlStrLn_memo3_NE(info);
		else if (ne == columnDtlStrLn_ins_usr_id) doDtlStrLn_ins_usr_id_NE(info);
		else if (ne == columnDtlStrLn_ins_usr_nm) doDtlStrLn_ins_usr_nm_NE(info);
		else if (ne == columnDtlStrLn_ins_ts) doDtlStrLn_ins_ts_NE(info);
		else if (ne == columnDtlStrLn_ins_func_id) doDtlStrLn_ins_func_id_NE(info);
		else if (ne == columnDtlStrLn_ins_func_nm) doDtlStrLn_ins_func_nm_NE(info);
		else if (ne == columnDtlStrLn_upd_cntr) doDtlStrLn_upd_cntr_NE(info);
		else if (ne == columnDtlStrLn_upd_usr_id) doDtlStrLn_upd_usr_id_NE(info);
		else if (ne == columnDtlStrLn_upd_usr_nm) doDtlStrLn_upd_usr_nm_NE(info);
		else if (ne == columnDtlStrLn_upd_ts) doDtlStrLn_upd_ts_NE(info);
		else if (ne == columnDtlStrLn_upd_func_id) doDtlStrLn_upd_func_id_NE(info);
		else if (ne == columnDtlStrLn_upd_func_nm) doDtlStrLn_upd_func_nm_NE(info);
		else if (ne == columnDtlStrLn_upd_srv_req_no) doDtlStrLn_upd_srv_req_no_NE(info);
		else if (ne == columnDtlStrLn_del_usr_id) doDtlStrLn_del_usr_id_NE(info);
		else if (ne == columnDtlStrLn_del_usr_nm) doDtlStrLn_del_usr_nm_NE(info);
		else if (ne == columnDtlStrLn_del_ts) doDtlStrLn_del_ts_NE(info);
		else if (ne == columnLclStrLn_check) doLclStrLn_check_NE(info);
		else if (ne == columnLclStrLn_loc_cd) doLclStrLn_loc_cd_NE(info);
		else if (ne == columnLclStrLn_str_ln_cd) doLclStrLn_str_ln_cd_NE(info);
		else if (ne == columnLclStrLn_lcl_cd) doLclStrLn_lcl_cd_NE(info);
		else if (ne == columnLclStrLn_lcl_nm) doLclStrLn_lcl_nm_NE(info);
		else if (ne == columnLclStrLn_str_ln_nm) doLclStrLn_str_ln_nm_NE(info);
		else if (ne == columnLclStrLn_memo1) doLclStrLn_memo1_NE(info);
		else if (ne == columnLclStrLn_memo2) doLclStrLn_memo2_NE(info);
		else if (ne == columnLclStrLn_memo3) doLclStrLn_memo3_NE(info);
		else if (ne == columnLclStrLn_ins_usr_id) doLclStrLn_ins_usr_id_NE(info);
		else if (ne == columnLclStrLn_ins_usr_nm) doLclStrLn_ins_usr_nm_NE(info);
		else if (ne == columnLclStrLn_ins_ts) doLclStrLn_ins_ts_NE(info);
		else if (ne == columnLclStrLn_ins_func_id) doLclStrLn_ins_func_id_NE(info);
		else if (ne == columnLclStrLn_ins_func_nm) doLclStrLn_ins_func_nm_NE(info);
		else if (ne == columnLclStrLn_upd_cntr) doLclStrLn_upd_cntr_NE(info);
		else if (ne == columnLclStrLn_upd_usr_id) doLclStrLn_upd_usr_id_NE(info);
		else if (ne == columnLclStrLn_upd_usr_nm) doLclStrLn_upd_usr_nm_NE(info);
		else if (ne == columnLclStrLn_upd_ts) doLclStrLn_upd_ts_NE(info);
		else if (ne == columnLclStrLn_upd_func_id) doLclStrLn_upd_func_id_NE(info);
		else if (ne == columnLclStrLn_upd_func_nm) doLclStrLn_upd_func_nm_NE(info);
		else if (ne == columnLclStrLn_upd_srv_req_no) doLclStrLn_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [BLTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBLTab_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[loc_mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_loc_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[sub_mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_sub_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check_asst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_asst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check_sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_dpt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_def_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_def_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_outsrc_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_outsrc_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ddlv_prov_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ddlv_prov_insp_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tor_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tor_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tor_ex_zero_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tor_ex_zero_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_act_ex_zero_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_act_ex_zero_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_amt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_lmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_lmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_pack_xfer_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_pack_xfer_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_vmi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_vmi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_loc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_loc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_grp_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_tel_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fax_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_asst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_asst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo1_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo2_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo3_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ln_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo1_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo2_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo3_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_check_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo1_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo2_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo3_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == BLTabTab) doBLTab_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == DtlLocSubTable) doDtlLocSub_NX(info);
		else if (nx == DtlStrLnTable) doDtlStrLn_NX(info);
		else if (nx == LclStrLnTable) doLclStrLn_NX(info);
		else if (nx == Mst_loc_mst_set_typ_nm) doMst_loc_mst_set_typ_nm_NX(info);
		else if (nx == Mst_sub_mst_set_typ_nm) doMst_sub_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NX(info);
		else if (nx == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm_lcl) doDtl_loc_nm_lcl_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_asst_dpt_cd) doDtl_asst_dpt_cd_NX(info);
		else if (nx == columnDtl_asst_dpt_nm) doDtl_asst_dpt_nm_NX(info);
		else if (nx == columnDtl_check_asst_dpt_cd) doDtl_check_asst_dpt_cd_NX(info);
		else if (nx == columnDtl_sls_dpt_cd) doDtl_sls_dpt_cd_NX(info);
		else if (nx == columnDtl_sls_dpt_nm) doDtl_sls_dpt_nm_NX(info);
		else if (nx == columnDtl_check_sls_dpt_cd) doDtl_check_sls_dpt_cd_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_cd_dpt) doDtl_wg_cd_dpt_NX(info);
		else if (nx == columnDtl_lg_flg) doDtl_lg_flg_NX(info);
		else if (nx == columnDtl_mfg_flg) doDtl_mfg_flg_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_site_cd) doDtl_site_cd_NX(info);
		else if (nx == columnDtl_site_nm) doDtl_site_nm_NX(info);
		else if (nx == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NX(info);
		else if (nx == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NX(info);
		else if (nx == columnDtl_lg_def_flg) doDtl_lg_def_flg_NX(info);
		else if (nx == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NX(info);
		else if (nx == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NX(info);
		else if (nx == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NX(info);
		else if (nx == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_pre_outsrc_act_flg) doDtl_pre_outsrc_act_flg_NX(info);
		else if (nx == columnDtl_ddlv_prov_insp_flg) doDtl_ddlv_prov_insp_flg_NX(info);
		else if (nx == columnDtl_cal_cd) doDtl_cal_cd_NX(info);
		else if (nx == columnDtl_cal_nm) doDtl_cal_nm_NX(info);
		else if (nx == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NX(info);
		else if (nx == columnDtl_loc_mng_typ_nm) doDtl_loc_mng_typ_nm_NX(info);
		else if (nx == columnDtl_num_id) doDtl_num_id_NX(info);
		else if (nx == columnDtl_cntry_cd) doDtl_cntry_cd_NX(info);
		else if (nx == columnDtl_cntry_nm) doDtl_cntry_nm_NX(info);
		else if (nx == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NX(info);
		else if (nx == columnDtl_prnt_lcl_nm) doDtl_prnt_lcl_nm_NX(info);
		else if (nx == columnDtl_stktk_tgt_flg) doDtl_stktk_tgt_flg_NX(info);
		else if (nx == columnDtl_stktk_tor_disp_flg) doDtl_stktk_tor_disp_flg_NX(info);
		else if (nx == columnDtl_stktk_tor_ex_zero_flg) doDtl_stktk_tor_ex_zero_flg_NX(info);
		else if (nx == columnDtl_stktk_act_ex_zero_flg) doDtl_stktk_act_ex_zero_flg_NX(info);
		else if (nx == columnDtl_stktk_amt_flg) doDtl_stktk_amt_flg_NX(info);
		else if (nx == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_alloc_lmt_flg) doDtl_alloc_lmt_flg_NX(info);
		else if (nx == columnDtl_gi_pack_xfer_flg) doDtl_gi_pack_xfer_flg_NX(info);
		else if (nx == columnDtl_gi_vmi_flg) doDtl_gi_vmi_flg_NX(info);
		else if (nx == columnDtl_rsrc_cd1) doDtl_rsrc_cd1_NX(info);
		else if (nx == columnDtl_rsrc_nm1) doDtl_rsrc_nm1_NX(info);
		else if (nx == columnDtl_rsrc_cd2) doDtl_rsrc_cd2_NX(info);
		else if (nx == columnDtl_rsrc_nm2) doDtl_rsrc_nm2_NX(info);
		else if (nx == columnDtl_ext_sys_loc_typ) doDtl_ext_sys_loc_typ_NX(info);
		else if (nx == columnDtl_ext_sys_loc_typ_nm) doDtl_ext_sys_loc_typ_nm_NX(info);
		else if (nx == columnDtl_loc_alc_grp) doDtl_loc_alc_grp_NX(info);
		else if (nx == columnDtl_addr_flg) doDtl_addr_flg_NX(info);
		else if (nx == columnDtl_zip_cd) doDtl_zip_cd_NX(info);
		else if (nx == columnDtl_addr1) doDtl_addr1_NX(info);
		else if (nx == columnDtl_addr2) doDtl_addr2_NX(info);
		else if (nx == columnDtl_addr3) doDtl_addr3_NX(info);
		else if (nx == columnDtl_addr4) doDtl_addr4_NX(info);
		else if (nx == columnDtl_tel) doDtl_tel_NX(info);
		else if (nx == columnDtl_fax) doDtl_fax_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_loc_cd) doLcl_loc_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_loc_nm) doLcl_loc_nm_NX(info);
		else if (nx == columnLcl_zip_cd) doLcl_zip_cd_NX(info);
		else if (nx == columnLcl_addr1) doLcl_addr1_NX(info);
		else if (nx == columnLcl_addr2) doLcl_addr2_NX(info);
		else if (nx == columnLcl_addr3) doLcl_addr3_NX(info);
		else if (nx == columnLcl_addr4) doLcl_addr4_NX(info);
		else if (nx == columnLcl_tel) doLcl_tel_NX(info);
		else if (nx == columnLcl_fax) doLcl_fax_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
		else if (nx == columnDtlLocSub_check) doDtlLocSub_check_NX(info);
		else if (nx == columnDtlLocSub_del_flg) doDtlLocSub_del_flg_NX(info);
		else if (nx == columnDtlLocSub_loc_cd) doDtlLocSub_loc_cd_NX(info);
		else if (nx == columnDtlLocSub_asst_dpt_cd) doDtlLocSub_asst_dpt_cd_NX(info);
		else if (nx == columnDtlLocSub_asst_dpt_nm) doDtlLocSub_asst_dpt_nm_NX(info);
		else if (nx == columnDtlLocSub_sls_dpt_cd) doDtlLocSub_sls_dpt_cd_NX(info);
		else if (nx == columnDtlLocSub_sls_dpt_nm) doDtlLocSub_sls_dpt_nm_NX(info);
		else if (nx == columnDtlLocSub_memo1) doDtlLocSub_memo1_NX(info);
		else if (nx == columnDtlLocSub_memo2) doDtlLocSub_memo2_NX(info);
		else if (nx == columnDtlLocSub_memo3) doDtlLocSub_memo3_NX(info);
		else if (nx == columnDtlLocSub_ins_usr_id) doDtlLocSub_ins_usr_id_NX(info);
		else if (nx == columnDtlLocSub_ins_usr_nm) doDtlLocSub_ins_usr_nm_NX(info);
		else if (nx == columnDtlLocSub_ins_ts) doDtlLocSub_ins_ts_NX(info);
		else if (nx == columnDtlLocSub_ins_func_id) doDtlLocSub_ins_func_id_NX(info);
		else if (nx == columnDtlLocSub_ins_func_nm) doDtlLocSub_ins_func_nm_NX(info);
		else if (nx == columnDtlLocSub_upd_cntr) doDtlLocSub_upd_cntr_NX(info);
		else if (nx == columnDtlLocSub_upd_usr_id) doDtlLocSub_upd_usr_id_NX(info);
		else if (nx == columnDtlLocSub_upd_usr_nm) doDtlLocSub_upd_usr_nm_NX(info);
		else if (nx == columnDtlLocSub_upd_ts) doDtlLocSub_upd_ts_NX(info);
		else if (nx == columnDtlLocSub_upd_func_id) doDtlLocSub_upd_func_id_NX(info);
		else if (nx == columnDtlLocSub_upd_func_nm) doDtlLocSub_upd_func_nm_NX(info);
		else if (nx == columnDtlLocSub_upd_srv_req_no) doDtlLocSub_upd_srv_req_no_NX(info);
		else if (nx == columnDtlLocSub_del_usr_id) doDtlLocSub_del_usr_id_NX(info);
		else if (nx == columnDtlLocSub_del_usr_nm) doDtlLocSub_del_usr_nm_NX(info);
		else if (nx == columnDtlLocSub_del_ts) doDtlLocSub_del_ts_NX(info);
		else if (nx == columnDtlStrLn_check) doDtlStrLn_check_NX(info);
		else if (nx == columnDtlStrLn_del_flg) doDtlStrLn_del_flg_NX(info);
		else if (nx == columnDtlStrLn_loc_cd) doDtlStrLn_loc_cd_NX(info);
		else if (nx == columnDtlStrLn_str_ln_cd) doDtlStrLn_str_ln_cd_NX(info);
		else if (nx == columnDtlStrLn_str_ln_nm_lcl) doDtlStrLn_str_ln_nm_lcl_NX(info);
		else if (nx == columnDtlStrLn_str_ln_nm) doDtlStrLn_str_ln_nm_NX(info);
		else if (nx == columnDtlStrLn_ln_flg) doDtlStrLn_ln_flg_NX(info);
		else if (nx == columnDtlStrLn_memo1) doDtlStrLn_memo1_NX(info);
		else if (nx == columnDtlStrLn_memo2) doDtlStrLn_memo2_NX(info);
		else if (nx == columnDtlStrLn_memo3) doDtlStrLn_memo3_NX(info);
		else if (nx == columnDtlStrLn_ins_usr_id) doDtlStrLn_ins_usr_id_NX(info);
		else if (nx == columnDtlStrLn_ins_usr_nm) doDtlStrLn_ins_usr_nm_NX(info);
		else if (nx == columnDtlStrLn_ins_ts) doDtlStrLn_ins_ts_NX(info);
		else if (nx == columnDtlStrLn_ins_func_id) doDtlStrLn_ins_func_id_NX(info);
		else if (nx == columnDtlStrLn_ins_func_nm) doDtlStrLn_ins_func_nm_NX(info);
		else if (nx == columnDtlStrLn_upd_cntr) doDtlStrLn_upd_cntr_NX(info);
		else if (nx == columnDtlStrLn_upd_usr_id) doDtlStrLn_upd_usr_id_NX(info);
		else if (nx == columnDtlStrLn_upd_usr_nm) doDtlStrLn_upd_usr_nm_NX(info);
		else if (nx == columnDtlStrLn_upd_ts) doDtlStrLn_upd_ts_NX(info);
		else if (nx == columnDtlStrLn_upd_func_id) doDtlStrLn_upd_func_id_NX(info);
		else if (nx == columnDtlStrLn_upd_func_nm) doDtlStrLn_upd_func_nm_NX(info);
		else if (nx == columnDtlStrLn_upd_srv_req_no) doDtlStrLn_upd_srv_req_no_NX(info);
		else if (nx == columnDtlStrLn_del_usr_id) doDtlStrLn_del_usr_id_NX(info);
		else if (nx == columnDtlStrLn_del_usr_nm) doDtlStrLn_del_usr_nm_NX(info);
		else if (nx == columnDtlStrLn_del_ts) doDtlStrLn_del_ts_NX(info);
		else if (nx == columnLclStrLn_check) doLclStrLn_check_NX(info);
		else if (nx == columnLclStrLn_loc_cd) doLclStrLn_loc_cd_NX(info);
		else if (nx == columnLclStrLn_str_ln_cd) doLclStrLn_str_ln_cd_NX(info);
		else if (nx == columnLclStrLn_lcl_cd) doLclStrLn_lcl_cd_NX(info);
		else if (nx == columnLclStrLn_lcl_nm) doLclStrLn_lcl_nm_NX(info);
		else if (nx == columnLclStrLn_str_ln_nm) doLclStrLn_str_ln_nm_NX(info);
		else if (nx == columnLclStrLn_memo1) doLclStrLn_memo1_NX(info);
		else if (nx == columnLclStrLn_memo2) doLclStrLn_memo2_NX(info);
		else if (nx == columnLclStrLn_memo3) doLclStrLn_memo3_NX(info);
		else if (nx == columnLclStrLn_ins_usr_id) doLclStrLn_ins_usr_id_NX(info);
		else if (nx == columnLclStrLn_ins_usr_nm) doLclStrLn_ins_usr_nm_NX(info);
		else if (nx == columnLclStrLn_ins_ts) doLclStrLn_ins_ts_NX(info);
		else if (nx == columnLclStrLn_ins_func_id) doLclStrLn_ins_func_id_NX(info);
		else if (nx == columnLclStrLn_ins_func_nm) doLclStrLn_ins_func_nm_NX(info);
		else if (nx == columnLclStrLn_upd_cntr) doLclStrLn_upd_cntr_NX(info);
		else if (nx == columnLclStrLn_upd_usr_id) doLclStrLn_upd_usr_id_NX(info);
		else if (nx == columnLclStrLn_upd_usr_nm) doLclStrLn_upd_usr_nm_NX(info);
		else if (nx == columnLclStrLn_upd_ts) doLclStrLn_upd_ts_NX(info);
		else if (nx == columnLclStrLn_upd_func_id) doLclStrLn_upd_func_id_NX(info);
		else if (nx == columnLclStrLn_upd_func_nm) doLclStrLn_upd_func_nm_NX(info);
		else if (nx == columnLclStrLn_upd_srv_req_no) doLclStrLn_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [BLTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBLTab_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[loc_mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_loc_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[sub_mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_sub_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check_asst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_asst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check_sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_dpt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_def_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_def_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_outsrc_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_outsrc_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ddlv_prov_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ddlv_prov_insp_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tor_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tor_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_tor_ex_zero_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_tor_ex_zero_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_act_ex_zero_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_act_ex_zero_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_amt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_lmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_lmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_pack_xfer_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_pack_xfer_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_vmi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_vmi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_loc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_loc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_grp_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_tel_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fax_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_asst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_asst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo1_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo2_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo3_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ln_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo1_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo2_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo3_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_check_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo1_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo2_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo3_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_loc_mst_set_typ_nm) doMst_loc_mst_set_typ_nm_LC(info);
		else if (lc == Mst_sub_mst_set_typ_nm) doMst_sub_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_LC(info);
		else if (lc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm_lcl) doDtl_loc_nm_lcl_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_asst_dpt_cd) doDtl_asst_dpt_cd_LC(info);
		else if (lc == columnDtl_asst_dpt_nm) doDtl_asst_dpt_nm_LC(info);
		else if (lc == columnDtl_check_asst_dpt_cd) doDtl_check_asst_dpt_cd_LC(info);
		else if (lc == columnDtl_sls_dpt_cd) doDtl_sls_dpt_cd_LC(info);
		else if (lc == columnDtl_sls_dpt_nm) doDtl_sls_dpt_nm_LC(info);
		else if (lc == columnDtl_check_sls_dpt_cd) doDtl_check_sls_dpt_cd_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_cd_dpt) doDtl_wg_cd_dpt_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_site_cd) doDtl_site_cd_LC(info);
		else if (lc == columnDtl_site_nm) doDtl_site_nm_LC(info);
		else if (lc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_LC(info);
		else if (lc == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_LC(info);
		else if (lc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_LC(info);
		else if (lc == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_LC(info);
		else if (lc == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_LC(info);
		else if (lc == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_cal_cd) doDtl_cal_cd_LC(info);
		else if (lc == columnDtl_cal_nm) doDtl_cal_nm_LC(info);
		else if (lc == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_LC(info);
		else if (lc == columnDtl_loc_mng_typ_nm) doDtl_loc_mng_typ_nm_LC(info);
		else if (lc == columnDtl_num_id) doDtl_num_id_LC(info);
		else if (lc == columnDtl_cntry_cd) doDtl_cntry_cd_LC(info);
		else if (lc == columnDtl_cntry_nm) doDtl_cntry_nm_LC(info);
		else if (lc == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_LC(info);
		else if (lc == columnDtl_prnt_lcl_nm) doDtl_prnt_lcl_nm_LC(info);
		else if (lc == columnDtl_rsrc_cd1) doDtl_rsrc_cd1_LC(info);
		else if (lc == columnDtl_rsrc_nm1) doDtl_rsrc_nm1_LC(info);
		else if (lc == columnDtl_rsrc_cd2) doDtl_rsrc_cd2_LC(info);
		else if (lc == columnDtl_rsrc_nm2) doDtl_rsrc_nm2_LC(info);
		else if (lc == columnDtl_ext_sys_loc_typ) doDtl_ext_sys_loc_typ_LC(info);
		else if (lc == columnDtl_ext_sys_loc_typ_nm) doDtl_ext_sys_loc_typ_nm_LC(info);
		else if (lc == columnDtl_loc_alc_grp) doDtl_loc_alc_grp_LC(info);
		else if (lc == columnDtl_zip_cd) doDtl_zip_cd_LC(info);
		else if (lc == columnDtl_addr1) doDtl_addr1_LC(info);
		else if (lc == columnDtl_addr2) doDtl_addr2_LC(info);
		else if (lc == columnDtl_addr3) doDtl_addr3_LC(info);
		else if (lc == columnDtl_addr4) doDtl_addr4_LC(info);
		else if (lc == columnDtl_tel) doDtl_tel_LC(info);
		else if (lc == columnDtl_fax) doDtl_fax_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
		else if (lc == columnLcl_loc_cd) doLcl_loc_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_loc_nm) doLcl_loc_nm_LC(info);
		else if (lc == columnLcl_zip_cd) doLcl_zip_cd_LC(info);
		else if (lc == columnLcl_addr1) doLcl_addr1_LC(info);
		else if (lc == columnLcl_addr2) doLcl_addr2_LC(info);
		else if (lc == columnLcl_addr3) doLcl_addr3_LC(info);
		else if (lc == columnLcl_addr4) doLcl_addr4_LC(info);
		else if (lc == columnLcl_tel) doLcl_tel_LC(info);
		else if (lc == columnLcl_fax) doLcl_fax_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
		else if (lc == columnDtlLocSub_loc_cd) doDtlLocSub_loc_cd_LC(info);
		else if (lc == columnDtlLocSub_asst_dpt_cd) doDtlLocSub_asst_dpt_cd_LC(info);
		else if (lc == columnDtlLocSub_asst_dpt_nm) doDtlLocSub_asst_dpt_nm_LC(info);
		else if (lc == columnDtlLocSub_sls_dpt_cd) doDtlLocSub_sls_dpt_cd_LC(info);
		else if (lc == columnDtlLocSub_sls_dpt_nm) doDtlLocSub_sls_dpt_nm_LC(info);
		else if (lc == columnDtlLocSub_memo1) doDtlLocSub_memo1_LC(info);
		else if (lc == columnDtlLocSub_memo2) doDtlLocSub_memo2_LC(info);
		else if (lc == columnDtlLocSub_memo3) doDtlLocSub_memo3_LC(info);
		else if (lc == columnDtlLocSub_ins_usr_id) doDtlLocSub_ins_usr_id_LC(info);
		else if (lc == columnDtlLocSub_ins_usr_nm) doDtlLocSub_ins_usr_nm_LC(info);
		else if (lc == columnDtlLocSub_ins_ts) doDtlLocSub_ins_ts_LC(info);
		else if (lc == columnDtlLocSub_ins_func_id) doDtlLocSub_ins_func_id_LC(info);
		else if (lc == columnDtlLocSub_ins_func_nm) doDtlLocSub_ins_func_nm_LC(info);
		else if (lc == columnDtlLocSub_upd_cntr) doDtlLocSub_upd_cntr_LC(info);
		else if (lc == columnDtlLocSub_upd_usr_id) doDtlLocSub_upd_usr_id_LC(info);
		else if (lc == columnDtlLocSub_upd_usr_nm) doDtlLocSub_upd_usr_nm_LC(info);
		else if (lc == columnDtlLocSub_upd_ts) doDtlLocSub_upd_ts_LC(info);
		else if (lc == columnDtlLocSub_upd_func_id) doDtlLocSub_upd_func_id_LC(info);
		else if (lc == columnDtlLocSub_upd_func_nm) doDtlLocSub_upd_func_nm_LC(info);
		else if (lc == columnDtlLocSub_upd_srv_req_no) doDtlLocSub_upd_srv_req_no_LC(info);
		else if (lc == columnDtlLocSub_del_usr_id) doDtlLocSub_del_usr_id_LC(info);
		else if (lc == columnDtlLocSub_del_usr_nm) doDtlLocSub_del_usr_nm_LC(info);
		else if (lc == columnDtlLocSub_del_ts) doDtlLocSub_del_ts_LC(info);
		else if (lc == columnDtlStrLn_loc_cd) doDtlStrLn_loc_cd_LC(info);
		else if (lc == columnDtlStrLn_str_ln_cd) doDtlStrLn_str_ln_cd_LC(info);
		else if (lc == columnDtlStrLn_str_ln_nm_lcl) doDtlStrLn_str_ln_nm_lcl_LC(info);
		else if (lc == columnDtlStrLn_str_ln_nm) doDtlStrLn_str_ln_nm_LC(info);
		else if (lc == columnDtlStrLn_memo1) doDtlStrLn_memo1_LC(info);
		else if (lc == columnDtlStrLn_memo2) doDtlStrLn_memo2_LC(info);
		else if (lc == columnDtlStrLn_memo3) doDtlStrLn_memo3_LC(info);
		else if (lc == columnDtlStrLn_ins_usr_id) doDtlStrLn_ins_usr_id_LC(info);
		else if (lc == columnDtlStrLn_ins_usr_nm) doDtlStrLn_ins_usr_nm_LC(info);
		else if (lc == columnDtlStrLn_ins_ts) doDtlStrLn_ins_ts_LC(info);
		else if (lc == columnDtlStrLn_ins_func_id) doDtlStrLn_ins_func_id_LC(info);
		else if (lc == columnDtlStrLn_ins_func_nm) doDtlStrLn_ins_func_nm_LC(info);
		else if (lc == columnDtlStrLn_upd_cntr) doDtlStrLn_upd_cntr_LC(info);
		else if (lc == columnDtlStrLn_upd_usr_id) doDtlStrLn_upd_usr_id_LC(info);
		else if (lc == columnDtlStrLn_upd_usr_nm) doDtlStrLn_upd_usr_nm_LC(info);
		else if (lc == columnDtlStrLn_upd_ts) doDtlStrLn_upd_ts_LC(info);
		else if (lc == columnDtlStrLn_upd_func_id) doDtlStrLn_upd_func_id_LC(info);
		else if (lc == columnDtlStrLn_upd_func_nm) doDtlStrLn_upd_func_nm_LC(info);
		else if (lc == columnDtlStrLn_upd_srv_req_no) doDtlStrLn_upd_srv_req_no_LC(info);
		else if (lc == columnDtlStrLn_del_usr_id) doDtlStrLn_del_usr_id_LC(info);
		else if (lc == columnDtlStrLn_del_usr_nm) doDtlStrLn_del_usr_nm_LC(info);
		else if (lc == columnDtlStrLn_del_ts) doDtlStrLn_del_ts_LC(info);
		else if (lc == columnLclStrLn_loc_cd) doLclStrLn_loc_cd_LC(info);
		else if (lc == columnLclStrLn_str_ln_cd) doLclStrLn_str_ln_cd_LC(info);
		else if (lc == columnLclStrLn_lcl_cd) doLclStrLn_lcl_cd_LC(info);
		else if (lc == columnLclStrLn_lcl_nm) doLclStrLn_lcl_nm_LC(info);
		else if (lc == columnLclStrLn_str_ln_nm) doLclStrLn_str_ln_nm_LC(info);
		else if (lc == columnLclStrLn_memo1) doLclStrLn_memo1_LC(info);
		else if (lc == columnLclStrLn_memo2) doLclStrLn_memo2_LC(info);
		else if (lc == columnLclStrLn_memo3) doLclStrLn_memo3_LC(info);
		else if (lc == columnLclStrLn_ins_usr_id) doLclStrLn_ins_usr_id_LC(info);
		else if (lc == columnLclStrLn_ins_usr_nm) doLclStrLn_ins_usr_nm_LC(info);
		else if (lc == columnLclStrLn_ins_ts) doLclStrLn_ins_ts_LC(info);
		else if (lc == columnLclStrLn_ins_func_id) doLclStrLn_ins_func_id_LC(info);
		else if (lc == columnLclStrLn_ins_func_nm) doLclStrLn_ins_func_nm_LC(info);
		else if (lc == columnLclStrLn_upd_cntr) doLclStrLn_upd_cntr_LC(info);
		else if (lc == columnLclStrLn_upd_usr_id) doLclStrLn_upd_usr_id_LC(info);
		else if (lc == columnLclStrLn_upd_usr_nm) doLclStrLn_upd_usr_nm_LC(info);
		else if (lc == columnLclStrLn_upd_ts) doLclStrLn_upd_ts_LC(info);
		else if (lc == columnLclStrLn_upd_func_id) doLclStrLn_upd_func_id_LC(info);
		else if (lc == columnLclStrLn_upd_func_nm) doLclStrLn_upd_func_nm_LC(info);
		else if (lc == columnLclStrLn_upd_srv_req_no) doLclStrLn_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[loc_mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_loc_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[sub_mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_sub_mst_set_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check_asst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_asst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check_sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_loc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_loc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_loc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_grp_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_tel_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fax_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_asst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[asst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_asst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo1_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo2_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_memo3_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlLocSub]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlLocSub_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo1_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo2_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_memo3_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStrLn]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStrLn_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo1_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo2_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_memo3_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclStrLn]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclStrLn_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alloc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_asst_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_asst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd_dpt]の作成メソッド
	 */
	public MCList getDtl_wg_cd_dpt(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_site_cd]の作成メソッド
	 */
	public MCList getDtl_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lg_grp_cd]の作成メソッド
	 */
	public MCList getDtl_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_grp_cd]の作成メソッド
	 */
	public MCList getDtl_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alloc_grp_cd]の作成メソッド
	 */
	public MCList getDtl_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sppl_cd]の作成メソッド
	 */
	public MCList getDtl_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_maker_cd]の作成メソッド
	 */
	public MCList getDtl_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cal_cd]の作成メソッド
	 */
	public MCList getDtl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_mng_typ]の作成メソッド
	 */
	public MCList getDtl_loc_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cntry_cd]の作成メソッド
	 */
	public MCList getDtl_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_prnt_lcl_cd]の作成メソッド
	 */
	public MCList getDtl_prnt_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rsrc_cd1]の作成メソッド
	 */
	public MCList getDtl_rsrc_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRsrc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rsrc_cd2]の作成メソッド
	 */
	public MCList getDtl_rsrc_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRsrc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ext_sys_loc_typ]の作成メソッド
	 */
	public MCList getDtl_ext_sys_loc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSysLocTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlLocSub_asst_dpt_cd]の作成メソッド
	 */
	public MCList getDtlLocSub_asst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlLocSub_sls_dpt_cd]の作成メソッド
	 */
	public MCList getDtlLocSub_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLclStrLn_lcl_cd]の作成メソッド
	 */
	public MCList getLclStrLn_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0700.Srch01")) {
			return new MA_MABCL0700_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0700.Upd01")) {
			return new MA_MABCL0700_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0700.Del01")) {
			return new MA_MABCL0700_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0700_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0700_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0700_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0700_Srch01Bridge() {
			p_MA_MABCL0700_Srch01 = new MCParam(PDef.MA_MABCL0700_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0700_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0700.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlLocSubR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlStrLnR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.LclR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.LclStrLnR.class));

			p_MA_MABCL0700_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0700_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0700_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0700_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0700_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0700.CndR up0() {
			return (mcframe.clientMABC.MABCP0700.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0700.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0700.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR>)down(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> down2() {
			return (MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR>)down(2);
		}
		protected MCList<mcframe.clientMABC.MABCP0700.LclR> down3() {
			return (MCList<mcframe.clientMABC.MABCP0700.LclR>)down(3);
		}
		protected MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> down4() {
			return (MCList<mcframe.clientMABC.MABCP0700.LclStrLnR>)down(4);
		}

		protected void setupDownParam() {
			p_MA_MABCL0700_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlR.class));
			p_MA_MABCL0700_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlLocSubR.class));
			p_MA_MABCL0700_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlStrLnR.class));
			p_MA_MABCL0700_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.LclR.class));
			p_MA_MABCL0700_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0700.LclStrLnR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0700_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0700.DtlR>)p_MA_MABCL0700_Srch01.getContainerParam().getDownBlock(0));
			setLocSubAllL((MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR>)p_MA_MABCL0700_Srch01.getContainerParam().getDownBlock(1));
			setStrLnAllL((MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR>)p_MA_MABCL0700_Srch01.getContainerParam().getDownBlock(2));
			setLocLclAllL((MCList<mcframe.clientMABC.MABCP0700.LclR>)p_MA_MABCL0700_Srch01.getContainerParam().getDownBlock(3));
			setLclStrLnAllL((MCList<mcframe.clientMABC.MABCP0700.LclStrLnR>)p_MA_MABCL0700_Srch01.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getDtlL().clear();
			getLocSubAllL().clear();
			getStrLnAllL().clear();
			getLocLclAllL().clear();
			getLclStrLnAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLocSubAllL());
			result.add(getStrLnAllL());
			result.add(getLocLclAllL());
			result.add(getLclStrLnAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0700_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0700_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0700_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0700_Upd01Bridge() {
			p_MA_MABCL0700_Upd01 = new MCParam(PDef.MA_MABCL0700_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0700_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlStrLnR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0700.LclR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlLocSubR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0700.LclStrLnR.class));
			// Down

			p_MA_MABCL0700_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0700_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0700_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0700_Upd01.addUpBlock(getStrLnAllL().shallowClone());
			p_MA_MABCL0700_Upd01.addUpBlock(getLocLclAllL().shallowClone());
			p_MA_MABCL0700_Upd01.addUpBlock(getLocSubAllL().shallowClone());
			p_MA_MABCL0700_Upd01.addUpBlock(getLclStrLnAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0700_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0700_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0700.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0700.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0700.DtlStrLnR>)up(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0700.LclR> up2() {
			return (MCList<mcframe.clientMABC.MABCP0700.LclR>)up(2);
		}
		protected MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR> up3() {
			return (MCList<mcframe.clientMABC.MABCP0700.DtlLocSubR>)up(3);
		}
		protected MCList<mcframe.clientMABC.MABCP0700.LclStrLnR> up4() {
			return (MCList<mcframe.clientMABC.MABCP0700.LclStrLnR>)up(4);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0700_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getStrLnAllL());
			result.add(getLocLclAllL());
			result.add(getLocSubAllL());
			result.add(getLclStrLnAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL0700_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0700_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0700_Del01;

		/** コンストラクタ */
		protected MA_MABCL0700_Del01Bridge() {
			p_MA_MABCL0700_Del01 = new MCParam(PDef.MA_MABCL0700_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0700_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0700.DtlR.class));
			// Down

			p_MA_MABCL0700_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0700_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0700_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0700_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0700_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0700.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0700.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0700_Del01;
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