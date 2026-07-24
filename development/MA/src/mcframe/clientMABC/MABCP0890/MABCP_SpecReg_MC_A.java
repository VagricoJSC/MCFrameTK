package mcframe.clientMABC.MABCP0890;

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
import mcframe.clientMABC.MABCP0890.MABCP_SpecReg_MC.MA_MABCL0890_Srch01Caller;
import mcframe.clientMABC.MABCP0890.MABCP_SpecReg_MC.MA_MABCL0890_Upd01Caller;
import mcframe.clientMABC.MABCP0890.MABCP_SpecReg_MC.MA_MABCL0890_Del01Caller;

/**
 * 画面"MABCP_SpecReg"パネルクラスです。<p>
 *
 * 仕様マスタ、仕様項目マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_SpecReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABCP0890";

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_spec_cd_Label = null;
	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_spec_cd = null;
	/**
	 * Specification name 仕様名.<p>
	 *
	 */
	public MCTextField Cnd_spec_nm = null;
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
	// [Spec]ブロック関連のField定義
	public MCPanel SpecPanel = null;
	// [Spec]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0890.DtlR> DtlTable = null;
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
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spec_cd = null;
	/**
	 * Specification name 仕様名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spec_nm_lcl = null;
	/**
	 * Standard specification name 標準仕様名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spec_nm = null;
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
	public MCTable2<mcframe.clientMABC.MABCP0890.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_spec_cd = null;
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
	 * Specification name 仕様名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_spec_nm = null;
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
	// [Desc]ブロック関連のField定義
	public MCPanel DescPanel = null;
	// [Desc]ブロックの項目のField定義
	// [DtlDesc]ブロック関連のField定義
	public MCPanel DtlDescPanel = null;
	public MCTitledBorder DtlDescTitledBorder = null;
	public MCScrollPane DtlDescScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0890.DtlDescR> DtlDescTable = null;
	// [DtlDesc]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_del_flg = null;
	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_spec_cd = null;
	/**
	 * Specification detail cd. 仕様項目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_spec_desc_cd = null;
	/**
	 * Specification detail name 仕様項目名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_spec_desc_nm_lcl = null;
	/**
	 * Standard specification detail name 標準仕様項目名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_spec_desc_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlDesc_del_ts = null;
	// [DtlBtnDesc]ブロック関連のField定義
	public MCPanel DtlBtnDescPanel = null;
	// [DtlBtnDesc]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtnDesc_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtnDesc_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtnDesc_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtnDesc_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtnDesc_rcopy = null;
	// [LclWrkDesc]ブロック関連のField定義
	public MCPanel LclWrkDescPanel = null;
	// [LclWrkDesc]ブロックの項目のField定義
	// [LclDesc]ブロック関連のField定義
	public MCPanel LclDescPanel = null;
	public MCScrollPane LclDescScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0890.LclDescR> LclDescTable = null;
	// [LclDesc]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_check = null;
	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_spec_cd = null;
	/**
	 * Specification detail cd. 仕様項目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_spec_desc_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_lcl_nm = null;
	/**
	 * Specification detail name 仕様項目名.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_spec_desc_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLclDesc_upd_srv_req_no = null;
	// [LclBtnDesc]ブロック関連のField定義
	public MCPanel LclBtnDescPanel = null;
	// [LclBtnDesc]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtnDesc_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtnDesc_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtnDesc_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtnDesc_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtnDesc_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
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
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0890_Srch01]のCallerの作成 */
	protected MABCP_SpecReg_MC.MA_MABCL0890_Srch01Caller createMA_MABCL0890_Srch01() {
		MABCP_SpecReg_MC.MA_MABCL0890_Srch01Caller<MABCP_SpecReg, MA_MABCL0890_Srch01Bridge>
		caller = ((MABCP_SpecReg_MC)this).new MA_MABCL0890_Srch01Caller<MABCP_SpecReg, MA_MABCL0890_Srch01Bridge>(
					(MABCP_SpecReg)this, new MA_MABCL0890_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0890_Srch01]の呼び出し */
	protected void callMA_MABCL0890_Srch01() {
		MCCaller caller = createMA_MABCL0890_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0890_Upd01]のCallerの作成 */
	protected MABCP_SpecReg_MC.MA_MABCL0890_Upd01Caller createMA_MABCL0890_Upd01() {
		MABCP_SpecReg_MC.MA_MABCL0890_Upd01Caller<MABCP_SpecReg, MA_MABCL0890_Upd01Bridge>
		caller = ((MABCP_SpecReg_MC)this).new MA_MABCL0890_Upd01Caller<MABCP_SpecReg, MA_MABCL0890_Upd01Bridge>(
					(MABCP_SpecReg)this, new MA_MABCL0890_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0890_Upd01]の呼び出し */
	protected void callMA_MABCL0890_Upd01() {
		MCCaller caller = createMA_MABCL0890_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0890_Del01]のCallerの作成 */
	protected MABCP_SpecReg_MC.MA_MABCL0890_Del01Caller createMA_MABCL0890_Del01() {
		MABCP_SpecReg_MC.MA_MABCL0890_Del01Caller<MABCP_SpecReg, MA_MABCL0890_Del01Bridge>
		caller = ((MABCP_SpecReg_MC)this).new MA_MABCL0890_Del01Caller<MABCP_SpecReg, MA_MABCL0890_Del01Bridge>(
					(MABCP_SpecReg)this, new MA_MABCL0890_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0890_Del01]の呼び出し */
	protected void callMA_MABCL0890_Del01() {
		MCCaller caller = createMA_MABCL0890_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0890.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0890.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0890.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0890.LclR> aLclL;
	/** [DtlDesc]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0890.DtlDescR> aDtlDescL;
	/** [LclDesc]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0890.LclDescR> aLclDescL;
	/** [DescAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0890.DtlDescR> aDescAllL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0890.LclR> aLclAllL;
	/** [LclDescAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0890.LclDescR> aLclDescAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0890.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0890.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0890.MstR createMstR() {
		return mcframe.clientMABC.MABCP0890.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0890.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0890.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0890.CndR createCndR() {
		return mcframe.clientMABC.MABCP0890.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0890.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0890.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0890.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0890.DtlR.class);
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
	public void setLclL(MCList<mcframe.clientMABC.MABCP0890.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0890.LclR createLclR() {
		return mcframe.clientMABC.MABCP0890.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0890.LclR.class);
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
	 * コピーによってaDtlDescLを設定します。
	 *
	 * aDtlDescLのインスタンスは変更されません。
	 *
	 * @param dataset DtlDescL
	 */
	public void setDtlDescL(MCList<mcframe.clientMABC.MABCP0890.DtlDescR> aList) {
		if (getDtlDescL() != aList) {
			getDtlDescL().setAll(aList);
		}
	}

	/**
	 * [DtlDesc]ブロックのコンテナaDtlDescLを返します。
	 *
	 * @return DtlDescL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.DtlDescR> getDtlDescL() {
		return aDtlDescL;
	}

	/**
	 * aDtlDescRを作成します。
	 *
	 * @return DtlDescR
	 */
	public mcframe.clientMABC.MABCP0890.DtlDescR createDtlDescR() {
		return mcframe.clientMABC.MABCP0890.DtlDescR.create();
	}

	/**
	 * aDtlDescLを作成します。
	 *
	 * @return DtlDescL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.DtlDescR> createDtlDescL() {
		return MCList.create(mcframe.clientMABC.MABCP0890.DtlDescR.class);
	}

	/**
	 * DtlDescTableを初期化します。
	 */
	protected void createDtlDescTable(){
		if(DtlDescTable == null){
			DtlDescTable = beansFactory.createTable2("DtlDesc.table");
		}
	}

	/**
	 * コピーによってaLclDescLを設定します。
	 *
	 * aLclDescLのインスタンスは変更されません。
	 *
	 * @param dataset LclDescL
	 */
	public void setLclDescL(MCList<mcframe.clientMABC.MABCP0890.LclDescR> aList) {
		if (getLclDescL() != aList) {
			getLclDescL().setAll(aList);
		}
	}

	/**
	 * [LclDesc]ブロックのコンテナaLclDescLを返します。
	 *
	 * @return LclDescL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.LclDescR> getLclDescL() {
		return aLclDescL;
	}

	/**
	 * aLclDescRを作成します。
	 *
	 * @return LclDescR
	 */
	public mcframe.clientMABC.MABCP0890.LclDescR createLclDescR() {
		return mcframe.clientMABC.MABCP0890.LclDescR.create();
	}

	/**
	 * aLclDescLを作成します。
	 *
	 * @return LclDescL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.LclDescR> createLclDescL() {
		return MCList.create(mcframe.clientMABC.MABCP0890.LclDescR.class);
	}

	/**
	 * LclDescTableを初期化します。
	 */
	protected void createLclDescTable(){
		if(LclDescTable == null){
			LclDescTable = beansFactory.createTable2("LclDesc.table");
		}
	}

	/**
	 * コピーによってaDescAllLを設定します。
	 *
	 * aDescAllLのインスタンスは変更されません。
	 *
	 * @param dataset DescAllL
	 */
	public void setDescAllL(MCList<mcframe.clientMABC.MABCP0890.DtlDescR> aList) {
		if (getDescAllL() != aList) {
			getDescAllL().setAll(aList);
		}
	}

	/**
	 * [DescAll]ブロックのコンテナaDescAllLを返します。
	 *
	 * @return DescAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.DtlDescR> getDescAllL() {
		return aDescAllL;
	}

	/**
	 * aDescAllRを作成します。
	 *
	 * @return DescAllR
	 */
	public mcframe.clientMABC.MABCP0890.DtlDescR createDescAllR() {
		return mcframe.clientMABC.MABCP0890.DtlDescR.create();
	}

	/**
	 * aDescAllLを作成します。
	 *
	 * @return DescAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.DtlDescR> createDescAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0890.DtlDescR.class);
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0890.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0890.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0890.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0890.LclR.class);
	}

	/**
	 * コピーによってaLclDescAllLを設定します。
	 *
	 * aLclDescAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclDescAllL
	 */
	public void setLclDescAllL(MCList<mcframe.clientMABC.MABCP0890.LclDescR> aList) {
		if (getLclDescAllL() != aList) {
			getLclDescAllL().setAll(aList);
		}
	}

	/**
	 * [LclDescAll]ブロックのコンテナaLclDescAllLを返します。
	 *
	 * @return LclDescAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.LclDescR> getLclDescAllL() {
		return aLclDescAllL;
	}

	/**
	 * aLclDescAllRを作成します。
	 *
	 * @return LclDescAllR
	 */
	public mcframe.clientMABC.MABCP0890.LclDescR createLclDescAllR() {
		return mcframe.clientMABC.MABCP0890.LclDescR.create();
	}

	/**
	 * aLclDescAllLを作成します。
	 *
	 * @return LclDescAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0890.LclDescR> createLclDescAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0890.LclDescR.class);
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
		if(!MCCollectionUtil.contains(ret, getDtlDescL())) ret.add(getDtlDescL());
		if(!MCCollectionUtil.contains(ret, getLclDescL())) ret.add(getLclDescL());
		if(!MCCollectionUtil.contains(ret, getDescAllL())) ret.add(getDescAllL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
		if(!MCCollectionUtil.contains(ret, getLclDescAllL())) ret.add(getLclDescAllL());
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
		if(aCnt == getDtlDescL()) return "DtlDesc";
		if(aCnt == getLclDescL()) return "LclDesc";
		if(aCnt == getDescAllL()) return "DescAll";
		if(aCnt == getLclAllL()) return "LclAll";
		if(aCnt == getLclDescAllL()) return "LclDescAll";
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
		if(bId.equals("DtlDesc")) return getDtlDescL();
		if(bId.equals("LclDesc")) return getLclDescL();
		if(bId.equals("DescAll")) return getDescAllL();
		if(bId.equals("LclAll")) return getLclAllL();
		if(bId.equals("LclDescAll")) return getLclDescAllL();
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
		ret.add(SpecPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(BtmDtlPanel);
		ret.add(LtabPanel);
		ret.add(BLTabPanel);
		ret.add(LclWrkPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(DescPanel);
		ret.add(DtlDescPanel);
		ret.add(DtlBtnDescPanel);
		ret.add(LclWrkDescPanel);
		ret.add(LclDescPanel);
		ret.add(LclBtnDescPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SpecReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aDtlDescL = createDtlDescL();
		aLclDescL = createLclDescL();
		aDescAllL = createDescAllL();
		aLclAllL = createLclAllL();
		aLclDescAllL = createLclDescAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_SpecReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aDtlDescL = createDtlDescL();
		createDtlDescTable();
		DtlDescTable.setRowName(name);
		aLclDescL = createLclDescL();
		createLclDescTable();
		LclDescTable.setRowName(name);
		aDescAllL = createDescAllL();
		aLclAllL = createLclAllL();
		aLclDescAllL = createLclDescAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_SpecReg_MC.jbCreateScreenOpe((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateMst((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateTop((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateFold((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateCnd((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateCtrl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateTopDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateSpec((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateDtlBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateBtmDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateLtab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateBLTab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateLclWrk((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateLcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateLclBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateDtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateDtlBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateLclWrkDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateLclDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateLclBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbCreateEastBtn((MABCP_SpecReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_SpecReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_SpecReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_SpecReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_SpecReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_SpecReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_SpecReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [TopDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTopDtl(MABCP_SpecReg p) {
	}

	/**
	 * [Spec]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpec(MABCP_SpecReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_SpecReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_SpecReg p) {
	}

	/**
	 * [BtmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtmDtl(MABCP_SpecReg p) {
	}

	/**
	 * [Ltab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLtab(MABCP_SpecReg p) {
	}

	/**
	 * [BLTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBLTab(MABCP_SpecReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_SpecReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_SpecReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_SpecReg p) {
	}

	/**
	 * [Desc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDesc(MABCP_SpecReg p) {
	}

	/**
	 * [DtlDesc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlDesc(MABCP_SpecReg p) {
	}

	/**
	 * [DtlBtnDesc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtnDesc(MABCP_SpecReg p) {
	}

	/**
	 * [LclWrkDesc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrkDesc(MABCP_SpecReg p) {
	}

	/**
	 * [LclDesc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclDesc(MABCP_SpecReg p) {
	}

	/**
	 * [LclBtnDesc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtnDesc(MABCP_SpecReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_SpecReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_SpecReg p) {
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

	
	/** [Cnd_spec_cd_ListPutter]の定義 */
	private MCListPutter Cnd_spec_cd_p = null;

	/**
	 * [Cnd_spec_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_spec_cd_ListPutter() {
		if (Cnd_spec_cd_p == null) {
			Cnd_spec_cd_p = createCnd_spec_cd_ListPutter(Cnd_spec_cd, "spec_cd", "spec_nm");

		}
		return Cnd_spec_cd_p;
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
	
	
	/** [LclDesc_lcl_cd_ListPutter]の定義 */
	private MCListPutter LclDesc_lcl_cd_p = null;

	/**
	 * [LclDesc_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLclDesc_lcl_cd_ListPutter() {
		if (LclDesc_lcl_cd_p == null) {
			LclDesc_lcl_cd_p = createLclDesc_lcl_cd_ListPutter(columnLclDesc_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return LclDesc_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SpecReg create(){
		MABCP_SpecReg p = new MABCP_SpecReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SpecReg create(String name){
		MABCP_SpecReg p = new MABCP_SpecReg(name);
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
		MABCP_SpecReg_MC.jbfInitScreenOpe((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitMst((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitTop((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitFold((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitCnd((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitCtrl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitTopDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitSpec((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitDtlBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitBtmDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitLtab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitBLTab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitLclWrk((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitLcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitLclBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitDtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitDtlBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitLclWrkDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitLclDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitLclBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbfInitEastBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitScreenOpe((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitMst((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitTop((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitFold((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitCnd((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitCtrl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitTopDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitSpec((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitDtlBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitBtmDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitLtab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitBLTab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitLclWrk((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitLcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitLclBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitDtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitDtlBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitLclWrkDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitLclDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitLclBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.jbInitEastBtn((MABCP_SpecReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_spec_cd_Label = p.beansFactory.createLabel("Cnd.spec_cd_Label");
		p.Cnd_spec_cd = p.beansFactory.createTextComboBox("Cnd.spec_cd");
		p.Cnd_spec_cd.setLabel(p.Cnd_spec_cd_Label);
		p.Cnd_spec_nm = p.beansFactory.createTextField("Cnd.spec_nm");
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
	protected static void jbfInitCtrl(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTopDtl(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.TopDtlPanel = p.beansFactory.createPanel("TopDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Spec]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpec(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.SpecPanel = p.beansFactory.createPanel("Spec");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_spec_cd = p.beansFactory.createTableColumn("Dtl.spec_cd", MCColumnType.TEXT);
		p.columnDtl_spec_nm_lcl = p.beansFactory.createTableColumn("Dtl.spec_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_spec_nm = p.beansFactory.createTableColumn("Dtl.spec_nm", MCColumnType.TEXT);
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
	protected static void jbfInitDtlBtn(MABCP_SpecReg p) {
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
	protected static void jbfInitBtmDtl(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.BtmDtlPanel = p.beansFactory.createPanel("BtmDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ltab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLtab(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LtabPanel = p.beansFactory.createPanel("Ltab");
		// ブロックの項目の初期化
	}

	/**
	 * [BLTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBLTab(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.BLTabPanel = p.beansFactory.createPanel("BLTab");
		p.BLTabTab = p.beansFactory.createTabbedPane("BLTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_spec_cd = p.beansFactory.createTableColumn("Lcl.spec_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_spec_nm = p.beansFactory.createTableColumn("Lcl.spec_nm", MCColumnType.TEXT);
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
	protected static void jbfInitLclBtn(MABCP_SpecReg p) {
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
	 * [Desc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.DescPanel = p.beansFactory.createPanel("Desc");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlDesc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.DtlDescPanel = p.beansFactory.createPanel("DtlDesc");
		p.DtlDescTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlDescScrollPane = p.beansFactory.createScrollPane("DtlDesc.scroll");
		p.createDtlDescTable();
		// ブロックの項目の初期化
		p.columnDtlDesc_check = p.beansFactory.createTableColumn("DtlDesc.check", MCColumnType.CHECK);
		p.columnDtlDesc_del_flg = p.beansFactory.createTableColumn("DtlDesc.del_flg", MCColumnType.CHECK);
		p.columnDtlDesc_spec_cd = p.beansFactory.createTableColumn("DtlDesc.spec_cd", MCColumnType.TEXT);
		p.columnDtlDesc_spec_desc_cd = p.beansFactory.createTableColumn("DtlDesc.spec_desc_cd", MCColumnType.TEXT);
		p.columnDtlDesc_spec_desc_nm_lcl = p.beansFactory.createTableColumn("DtlDesc.spec_desc_nm_lcl", MCColumnType.TEXT);
		p.columnDtlDesc_spec_desc_nm = p.beansFactory.createTableColumn("DtlDesc.spec_desc_nm", MCColumnType.TEXT);
		p.columnDtlDesc_memo1 = p.beansFactory.createTableColumn("DtlDesc.memo1", MCColumnType.TEXT);
		p.columnDtlDesc_memo2 = p.beansFactory.createTableColumn("DtlDesc.memo2", MCColumnType.TEXT);
		p.columnDtlDesc_memo3 = p.beansFactory.createTableColumn("DtlDesc.memo3", MCColumnType.TEXT);
		p.columnDtlDesc_ins_usr_id = p.beansFactory.createTableColumn("DtlDesc.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlDesc_ins_usr_nm = p.beansFactory.createTableColumn("DtlDesc.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlDesc_ins_ts = p.beansFactory.createTableColumn("DtlDesc.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlDesc_ins_func_id = p.beansFactory.createTableColumn("DtlDesc.ins_func_id", MCColumnType.TEXT);
		p.columnDtlDesc_ins_func_nm = p.beansFactory.createTableColumn("DtlDesc.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlDesc_upd_cntr = p.beansFactory.createTableColumn("DtlDesc.upd_cntr", MCColumnType.NUMBER);
		p.columnDtlDesc_upd_usr_id = p.beansFactory.createTableColumn("DtlDesc.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlDesc_upd_usr_nm = p.beansFactory.createTableColumn("DtlDesc.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlDesc_upd_ts = p.beansFactory.createTableColumn("DtlDesc.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlDesc_upd_func_id = p.beansFactory.createTableColumn("DtlDesc.upd_func_id", MCColumnType.TEXT);
		p.columnDtlDesc_upd_func_nm = p.beansFactory.createTableColumn("DtlDesc.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlDesc_upd_srv_req_no = p.beansFactory.createTableColumn("DtlDesc.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtlDesc_del_usr_id = p.beansFactory.createTableColumn("DtlDesc.del_usr_id", MCColumnType.TEXT);
		p.columnDtlDesc_del_usr_nm = p.beansFactory.createTableColumn("DtlDesc.del_usr_nm", MCColumnType.TEXT);
		p.columnDtlDesc_del_ts = p.beansFactory.createTableColumn("DtlDesc.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtnDesc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtnDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.DtlBtnDescPanel = p.beansFactory.createPanel("DtlBtnDesc");
		// ブロックの項目の初期化
		p.DtlBtnDesc_select_all = p.beansFactory.createButton("DtlBtnDesc.select_all", "no_border");
		p.DtlBtnDesc_deselect_all = p.beansFactory.createButton("DtlBtnDesc.deselect_all", "no_border");
		p.DtlBtnDesc_radd = p.beansFactory.createButton("DtlBtnDesc.radd", "no_border");
		p.DtlBtnDesc_rdel = p.beansFactory.createButton("DtlBtnDesc.rdel", "no_border");
		p.DtlBtnDesc_rcopy = p.beansFactory.createButton("DtlBtnDesc.rcopy", "no_border");
	}

	/**
	 * [LclWrkDesc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrkDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclWrkDescPanel = p.beansFactory.createPanel("LclWrkDesc");
		// ブロックの項目の初期化
	}

	/**
	 * [LclDesc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclDescPanel = p.beansFactory.createPanel("LclDesc");
		p.LclDescScrollPane = p.beansFactory.createScrollPane("LclDesc.scroll");
		p.createLclDescTable();
		// ブロックの項目の初期化
		p.columnLclDesc_check = p.beansFactory.createTableColumn("LclDesc.check", MCColumnType.CHECK);
		p.columnLclDesc_spec_cd = p.beansFactory.createTableColumn("LclDesc.spec_cd", MCColumnType.TEXT);
		p.columnLclDesc_spec_desc_cd = p.beansFactory.createTableColumn("LclDesc.spec_desc_cd", MCColumnType.TEXT);
		p.columnLclDesc_lcl_cd = p.beansFactory.createTableColumn("LclDesc.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLclDesc_lcl_nm = p.beansFactory.createTableColumn("LclDesc.lcl_nm", MCColumnType.TEXT);
		p.columnLclDesc_spec_desc_nm = p.beansFactory.createTableColumn("LclDesc.spec_desc_nm", MCColumnType.TEXT);
		p.columnLclDesc_memo1 = p.beansFactory.createTableColumn("LclDesc.memo1", MCColumnType.TEXT);
		p.columnLclDesc_memo2 = p.beansFactory.createTableColumn("LclDesc.memo2", MCColumnType.TEXT);
		p.columnLclDesc_memo3 = p.beansFactory.createTableColumn("LclDesc.memo3", MCColumnType.TEXT);
		p.columnLclDesc_ins_usr_id = p.beansFactory.createTableColumn("LclDesc.ins_usr_id", MCColumnType.TEXT);
		p.columnLclDesc_ins_usr_nm = p.beansFactory.createTableColumn("LclDesc.ins_usr_nm", MCColumnType.TEXT);
		p.columnLclDesc_ins_ts = p.beansFactory.createTableColumn("LclDesc.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLclDesc_ins_func_id = p.beansFactory.createTableColumn("LclDesc.ins_func_id", MCColumnType.TEXT);
		p.columnLclDesc_ins_func_nm = p.beansFactory.createTableColumn("LclDesc.ins_func_nm", MCColumnType.TEXT);
		p.columnLclDesc_upd_cntr = p.beansFactory.createTableColumn("LclDesc.upd_cntr", MCColumnType.NUMBER);
		p.columnLclDesc_upd_usr_id = p.beansFactory.createTableColumn("LclDesc.upd_usr_id", MCColumnType.TEXT);
		p.columnLclDesc_upd_usr_nm = p.beansFactory.createTableColumn("LclDesc.upd_usr_nm", MCColumnType.TEXT);
		p.columnLclDesc_upd_ts = p.beansFactory.createTableColumn("LclDesc.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLclDesc_upd_func_id = p.beansFactory.createTableColumn("LclDesc.upd_func_id", MCColumnType.TEXT);
		p.columnLclDesc_upd_func_nm = p.beansFactory.createTableColumn("LclDesc.upd_func_nm", MCColumnType.TEXT);
		p.columnLclDesc_upd_srv_req_no = p.beansFactory.createTableColumn("LclDesc.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtnDesc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtnDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclBtnDescPanel = p.beansFactory.createPanel("LclBtnDesc");
		// ブロックの項目の初期化
		p.LclBtnDesc_select_all = p.beansFactory.createButton("LclBtnDesc.select_all", "no_border");
		p.LclBtnDesc_deselect_all = p.beansFactory.createButton("LclBtnDesc.deselect_all", "no_border");
		p.LclBtnDesc_radd = p.beansFactory.createButton("LclBtnDesc.radd", "no_border");
		p.LclBtnDesc_rdel = p.beansFactory.createButton("LclBtnDesc.rdel", "no_border");
		p.LclBtnDesc_rcopy = p.beansFactory.createButton("LclBtnDesc.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_SpecReg p) {
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
	protected static void jbInitMst(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0890.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_SpecReg p) {
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
	protected static void jbInitFold(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_SpecReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0890.CndR.ope_META);
		p.Cnd_spec_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_spec_cd, true);
		p.Cnd_spec_cd.setLinkBeans(p.Cnd_spec_nm);
		p.CndPanel.add(p.Cnd_spec_cd_Label);
		p.CndPanel.add(p.Cnd_spec_cd);
		p.CndPanel.setLastBeans(p.Cnd_spec_cd);
		p.Cnd_spec_cd.setNextBeans(p.Cnd_spec_nm);
		p.Cnd_spec_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0890.CndR.spec_cd_META);
		p.CndPanel.add(p.Cnd_spec_nm);
		p.Cnd_spec_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_spec_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0890.CndR.spec_nm_META);
		p.setPluralValueEnable(p.Cnd_spec_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0890.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0890.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0890.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0890.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0890.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_SpecReg p) {
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
	protected static void jbInitTopDtl(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.add(p.TopDtlPanel);
		p.TopDtlPanel.setNextBeans(p.BtmDtlPanel);
		p.TopDtlPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.TopDtlPanel.add(p.SpecPanel, null);
		p.TopDtlPanel.setLastBeans(p.SpecPanel);
	}

	/**
	 * [Spec]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpec(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.SpecPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.SpecPanel.add(p.DtlPanel, null);
		p.SpecPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.SpecPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_SpecReg p) {
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
	protected static void jbInitDtlBtn(MABCP_SpecReg p) {
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
	protected static void jbInitBtmDtl(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.add(p.BtmDtlPanel);
		p.BtmDtlPanel.setNextBeans(p.BtnPanel);
		p.BtmDtlPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.BtmDtlPanel.add(p.DescPanel, null);
		p.BtmDtlPanel.setLastBeans(p.DescPanel);
		p.DescPanel.setNextBeans(p.LtabPanel);
		p.BtmDtlPanel.add(p.LtabPanel, null);
	}

	/**
	 * [Ltab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLtab(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LtabPanel.setLayoutPosition("CR+");
		// ブロックの項目の初期化
		p.LtabPanel.add(p.BLTabPanel, null);
		p.LtabPanel.setLastBeans(p.BLTabPanel);
	}

	/**
	 * [BLTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBLTab(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.BLTabPanel.add(p.BLTabTab);
		p.BLTabPanel.setLastBeans(p.BLTabTab);
		p.BLTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.BLTabTab.add(p.LclWrkPanel, "BLTab.LCLWRK");
		p.BLTabTab.setLastBeans(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.LclWrkDescPanel);
		p.BLTabTab.add(p.LclWrkDescPanel, "BLTab.LCLWRKDESC");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel.setNextBeans(p.LclWrkDescPanel);
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
	protected static void jbInitLcl(MABCP_SpecReg p) {
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
	protected static void jbInitLclBtn(MABCP_SpecReg p) {
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
	 * [Desc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.DescPanel.setLayoutPosition("CL+");
		// ブロックの項目の初期化
		p.DescPanel.add(p.DtlDescPanel, null);
		p.DescPanel.setLastBeans(p.DtlDescPanel);
		p.DtlDescPanel.setNextBeans(p.DtlBtnDescPanel);
		p.DescPanel.add(p.DtlBtnDescPanel, null);
	}

	/**
	 * [DtlDesc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.DtlDescPanel.setBorder(p.DtlDescTitledBorder);
		p.DtlDescPanel.add(p.DtlDescScrollPane);
		p.DtlDescPanel.setLastBeans(p.DtlDescTable);
		p.DtlDescScrollPane.setViewportView(p.DtlDescTable);
		p.DtlDescTable.setList(p.getDtlDescL());
		p.DtlDescPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtnDesc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtnDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.DtlBtnDescPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtnDesc_select_all.setIcon("SELECT_ALL");
		p.DtlBtnDesc_select_all.setFunctionKey(MCFunctionKey.F18);
		p.DtlBtnDescPanel.add(p.DtlBtnDesc_select_all);
		p.DtlBtnDescPanel.setLastBeans(p.DtlBtnDesc_select_all);
		p.DtlBtnDesc_select_all.setNextBeans(p.DtlBtnDesc_deselect_all);
		p.DtlBtnDesc_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtnDesc_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.DtlBtnDescPanel.add(p.DtlBtnDesc_deselect_all);
		p.DtlBtnDesc_deselect_all.setNextBeans(p.DtlBtnDesc_radd);
		p.DtlBtnDesc_radd.setIcon("INSERT_RECORD");
		p.DtlBtnDesc_radd.setFunctionKey(MCFunctionKey.F7);
		p.DtlBtnDescPanel.add(p.DtlBtnDesc_radd);
		p.DtlBtnDesc_radd.setNextBeans(p.DtlBtnDesc_rdel);
		p.DtlBtnDesc_rdel.setIcon("DELETE_RECORD");
		p.DtlBtnDesc_rdel.setFunctionKey(MCFunctionKey.F8);
		p.DtlBtnDescPanel.add(p.DtlBtnDesc_rdel);
		p.DtlBtnDesc_rdel.setNextBeans(p.DtlBtnDesc_rcopy);
		p.DtlBtnDesc_rcopy.setIcon("COPY_RECORD");
		p.DtlBtnDesc_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.DtlBtnDescPanel.add(p.DtlBtnDesc_rcopy);
	}

	/**
	 * [LclWrkDesc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrkDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclWrkDescPanel.setLayoutPosition("CL+");
		// ブロックの項目の初期化
		p.LclWrkDescPanel.add(p.LclDescPanel, null);
		p.LclWrkDescPanel.setLastBeans(p.LclDescPanel);
		p.LclDescPanel.setNextBeans(p.LclBtnDescPanel);
		p.LclWrkDescPanel.add(p.LclBtnDescPanel, null);
	}

	/**
	 * [LclDesc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclDescPanel.add(p.LclDescScrollPane);
		p.LclDescPanel.setLastBeans(p.LclDescTable);
		p.LclDescScrollPane.setViewportView(p.LclDescTable);
		p.LclDescTable.setList(p.getLclDescL());
		p.LclDescPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtnDesc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtnDesc(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.LclBtnDescPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtnDesc_select_all.setIcon("SELECT_ALL");
		p.LclBtnDescPanel.add(p.LclBtnDesc_select_all);
		p.LclBtnDescPanel.setLastBeans(p.LclBtnDesc_select_all);
		p.LclBtnDesc_select_all.setNextBeans(p.LclBtnDesc_deselect_all);
		p.LclBtnDesc_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtnDescPanel.add(p.LclBtnDesc_deselect_all);
		p.LclBtnDesc_deselect_all.setNextBeans(p.LclBtnDesc_radd);
		p.LclBtnDesc_radd.setIcon("INSERT_RECORD");
		p.LclBtnDescPanel.add(p.LclBtnDesc_radd);
		p.LclBtnDesc_radd.setNextBeans(p.LclBtnDesc_rdel);
		p.LclBtnDesc_rdel.setIcon("DELETE_RECORD");
		p.LclBtnDescPanel.add(p.LclBtnDesc_rdel);
		p.LclBtnDesc_rdel.setNextBeans(p.LclBtnDesc_rcopy);
		p.LclBtnDesc_rcopy.setIcon("COPY_RECORD");
		p.LclBtnDescPanel.add(p.LclBtnDesc_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_SpecReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_SpecReg p) {
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
		MABCP_SpecReg_MC.mcInitScreenOpe((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitMst((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitTop((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitFold((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitCnd((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitCtrl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitTopDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitSpec((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitDtlBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitBtmDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitLtab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitBLTab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitLclWrk((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitLcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitLclBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitDtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitDtlBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitLclWrkDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitLclDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitLclBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.mcInitEastBtn((MABCP_SpecReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_SpecReg_MC.statusInitUPD_ScreenOpe((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Mst((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Top((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Fold((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Cnd((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Ctrl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_TopDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Spec((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Dtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_DtlBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_BtmDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Ltab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_BLTab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_LclWrk((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Lcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_LclBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Desc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_DtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_DtlBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_LclWrkDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_LclDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_LclBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_Btn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_EastBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_DescAll((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_LclAll((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitUPD_LclDescAll((MABCP_SpecReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_SpecReg_MC.statusInitFIX_ScreenOpe((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Mst((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Top((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Fold((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Cnd((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Ctrl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_TopDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Spec((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Dtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_DtlBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_BtmDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Ltab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_BLTab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_LclWrk((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Lcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_LclBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Desc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_DtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_DtlBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_LclWrkDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_LclDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_LclBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_Btn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_EastBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_DescAll((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_LclAll((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitFIX_LclDescAll((MABCP_SpecReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_SpecReg_MC.statusInitDEL_ScreenOpe((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Mst((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Top((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Fold((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Cnd((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Ctrl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_TopDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Spec((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Dtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_DtlBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_BtmDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Ltab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_BLTab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_LclWrk((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Lcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_LclBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Desc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_DtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_DtlBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_LclWrkDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_LclDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_LclBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_Btn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_EastBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_DescAll((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_LclAll((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitDEL_LclDescAll((MABCP_SpecReg)this);

		// [REF]ステータスのモードの設定
		MABCP_SpecReg_MC.statusInitREF_ScreenOpe((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Mst((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Top((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Fold((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Cnd((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Ctrl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_TopDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Spec((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Dtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_DtlBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_BtmDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Ltab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_BLTab((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_LclWrk((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Lcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_LclBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Desc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_DtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_DtlBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_LclWrkDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_LclDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_LclBtnDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_Btn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_EastBtn((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_DescAll((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_LclAll((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.statusInitREF_LclDescAll((MABCP_SpecReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_SpecReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_SpecReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_SpecReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_SpecReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_SpecReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_spec_cd.setListListener(p);
		p.Cnd_spec_cd.addAllListener(p);
		p.Cnd_spec_nm.setListListener(p);
		p.Cnd_spec_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MABCP_SpecReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [TopDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTopDtl(MABCP_SpecReg p) {
	}

	/**
	 *  [Spec]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpec(MABCP_SpecReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_SpecReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_spec_cd.addAllListener(p);
		p.columnDtl_spec_cd.setListListener(p);
		p.columnDtl_spec_nm_lcl.addAllListener(p);
		p.columnDtl_spec_nm_lcl.setListListener(p);
		p.columnDtl_spec_nm.addAllListener(p);
		p.columnDtl_spec_nm.setListListener(p);
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
	protected static void mcInitDtlBtn(MABCP_SpecReg p) {
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
	protected static void mcInitBtmDtl(MABCP_SpecReg p) {
	}

	/**
	 *  [Ltab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLtab(MABCP_SpecReg p) {
	}

	/**
	 *  [BLTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBLTab(MABCP_SpecReg p) {
		p.BLTabTab.addAllListener(p);
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_SpecReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_SpecReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_spec_cd.addAllListener(p);
		p.columnLcl_spec_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_spec_nm.addAllListener(p);
		p.columnLcl_spec_nm.setListListener(p);
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
	protected static void mcInitLclBtn(MABCP_SpecReg p) {
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
	 *  [Desc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDesc(MABCP_SpecReg p) {
	}

	/**
	 *  [DtlDesc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlDesc(MABCP_SpecReg p) {
		p.DtlDescTable.addAllListener(p);
		p.columnDtlDesc_check.addAllListener(p);
		p.columnDtlDesc_del_flg.addAllListener(p);
		p.columnDtlDesc_spec_cd.addAllListener(p);
		p.columnDtlDesc_spec_cd.setListListener(p);
		p.columnDtlDesc_spec_desc_cd.addAllListener(p);
		p.columnDtlDesc_spec_desc_cd.setListListener(p);
		p.columnDtlDesc_spec_desc_nm_lcl.addAllListener(p);
		p.columnDtlDesc_spec_desc_nm_lcl.setListListener(p);
		p.columnDtlDesc_spec_desc_nm.addAllListener(p);
		p.columnDtlDesc_spec_desc_nm.setListListener(p);
		p.columnDtlDesc_memo1.addAllListener(p);
		p.columnDtlDesc_memo1.setListListener(p);
		p.columnDtlDesc_memo2.addAllListener(p);
		p.columnDtlDesc_memo2.setListListener(p);
		p.columnDtlDesc_memo3.addAllListener(p);
		p.columnDtlDesc_memo3.setListListener(p);
		p.columnDtlDesc_ins_usr_id.addAllListener(p);
		p.columnDtlDesc_ins_usr_id.setListListener(p);
		p.columnDtlDesc_ins_usr_nm.addAllListener(p);
		p.columnDtlDesc_ins_usr_nm.setListListener(p);
		p.columnDtlDesc_ins_ts.addAllListener(p);
		p.columnDtlDesc_ins_ts.setListListener(p);
		p.columnDtlDesc_ins_func_id.addAllListener(p);
		p.columnDtlDesc_ins_func_id.setListListener(p);
		p.columnDtlDesc_ins_func_nm.addAllListener(p);
		p.columnDtlDesc_ins_func_nm.setListListener(p);
		p.columnDtlDesc_upd_cntr.addAllListener(p);
		p.columnDtlDesc_upd_cntr.setListListener(p);
		p.columnDtlDesc_upd_usr_id.addAllListener(p);
		p.columnDtlDesc_upd_usr_id.setListListener(p);
		p.columnDtlDesc_upd_usr_nm.addAllListener(p);
		p.columnDtlDesc_upd_usr_nm.setListListener(p);
		p.columnDtlDesc_upd_ts.addAllListener(p);
		p.columnDtlDesc_upd_ts.setListListener(p);
		p.columnDtlDesc_upd_func_id.addAllListener(p);
		p.columnDtlDesc_upd_func_id.setListListener(p);
		p.columnDtlDesc_upd_func_nm.addAllListener(p);
		p.columnDtlDesc_upd_func_nm.setListListener(p);
		p.columnDtlDesc_upd_srv_req_no.addAllListener(p);
		p.columnDtlDesc_upd_srv_req_no.setListListener(p);
		p.columnDtlDesc_del_usr_id.addAllListener(p);
		p.columnDtlDesc_del_usr_id.setListListener(p);
		p.columnDtlDesc_del_usr_nm.addAllListener(p);
		p.columnDtlDesc_del_usr_nm.setListListener(p);
		p.columnDtlDesc_del_ts.addAllListener(p);
		p.columnDtlDesc_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtnDesc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtnDesc(MABCP_SpecReg p) {
		p.DtlBtnDesc_select_all.addAllListener(p);
		p.DtlBtnDesc_select_all.setAPMethodName("doDtlBtnDesc_select_all");
		p.DtlBtnDesc_deselect_all.addAllListener(p);
		p.DtlBtnDesc_deselect_all.setAPMethodName("doDtlBtnDesc_deselect_all");
		p.DtlBtnDesc_radd.addAllListener(p);
		p.DtlBtnDesc_radd.setAPMethodName("doDtlBtnDesc_radd");
		p.DtlBtnDesc_rdel.addAllListener(p);
		p.DtlBtnDesc_rdel.setAPMethodName("doDtlBtnDesc_rdel");
		p.DtlBtnDesc_rcopy.addAllListener(p);
		p.DtlBtnDesc_rcopy.setAPMethodName("doDtlBtnDesc_rcopy");
	}

	/**
	 *  [LclWrkDesc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrkDesc(MABCP_SpecReg p) {
	}

	/**
	 *  [LclDesc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclDesc(MABCP_SpecReg p) {
		p.LclDescTable.addAllListener(p);
		p.columnLclDesc_check.addAllListener(p);
		p.columnLclDesc_spec_cd.addAllListener(p);
		p.columnLclDesc_spec_cd.setListListener(p);
		p.columnLclDesc_spec_desc_cd.addAllListener(p);
		p.columnLclDesc_spec_desc_cd.setListListener(p);
		p.columnLclDesc_lcl_cd.addAllListener(p);
		p.columnLclDesc_lcl_cd.setListListener(p);
		p.columnLclDesc_lcl_nm.addAllListener(p);
		p.columnLclDesc_lcl_nm.setListListener(p);
		p.columnLclDesc_spec_desc_nm.addAllListener(p);
		p.columnLclDesc_spec_desc_nm.setListListener(p);
		p.columnLclDesc_memo1.addAllListener(p);
		p.columnLclDesc_memo1.setListListener(p);
		p.columnLclDesc_memo2.addAllListener(p);
		p.columnLclDesc_memo2.setListListener(p);
		p.columnLclDesc_memo3.addAllListener(p);
		p.columnLclDesc_memo3.setListListener(p);
		p.columnLclDesc_ins_usr_id.addAllListener(p);
		p.columnLclDesc_ins_usr_id.setListListener(p);
		p.columnLclDesc_ins_usr_nm.addAllListener(p);
		p.columnLclDesc_ins_usr_nm.setListListener(p);
		p.columnLclDesc_ins_ts.addAllListener(p);
		p.columnLclDesc_ins_ts.setListListener(p);
		p.columnLclDesc_ins_func_id.addAllListener(p);
		p.columnLclDesc_ins_func_id.setListListener(p);
		p.columnLclDesc_ins_func_nm.addAllListener(p);
		p.columnLclDesc_ins_func_nm.setListListener(p);
		p.columnLclDesc_upd_cntr.addAllListener(p);
		p.columnLclDesc_upd_cntr.setListListener(p);
		p.columnLclDesc_upd_usr_id.addAllListener(p);
		p.columnLclDesc_upd_usr_id.setListListener(p);
		p.columnLclDesc_upd_usr_nm.addAllListener(p);
		p.columnLclDesc_upd_usr_nm.setListListener(p);
		p.columnLclDesc_upd_ts.addAllListener(p);
		p.columnLclDesc_upd_ts.setListListener(p);
		p.columnLclDesc_upd_func_id.addAllListener(p);
		p.columnLclDesc_upd_func_id.setListListener(p);
		p.columnLclDesc_upd_func_nm.addAllListener(p);
		p.columnLclDesc_upd_func_nm.setListListener(p);
		p.columnLclDesc_upd_srv_req_no.addAllListener(p);
		p.columnLclDesc_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtnDesc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtnDesc(MABCP_SpecReg p) {
		p.LclBtnDesc_select_all.addAllListener(p);
		p.LclBtnDesc_select_all.setAPMethodName("doLclBtnDesc_select_all");
		p.LclBtnDesc_deselect_all.addAllListener(p);
		p.LclBtnDesc_deselect_all.setAPMethodName("doLclBtnDesc_deselect_all");
		p.LclBtnDesc_radd.addAllListener(p);
		p.LclBtnDesc_radd.setAPMethodName("doLclBtnDesc_radd");
		p.LclBtnDesc_rdel.addAllListener(p);
		p.LclBtnDesc_rdel.setAPMethodName("doLclBtnDesc_rdel");
		p.LclBtnDesc_rcopy.addAllListener(p);
		p.LclBtnDesc_rcopy.setAPMethodName("doLclBtnDesc_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_SpecReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_SpecReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_SpecReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_SpecReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_spec_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_spec_nm.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_Ctrl(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TopDtl(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[Spec]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Spec(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_SpecReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_spec_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_spec_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_spec_nm.putMode(p, UPD, MCMode.REQUIRED);
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
	protected static void statusInitUPD_DtlBtn(MABCP_SpecReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtmDtl(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ltab(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BLTab(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_SpecReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_spec_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_spec_nm.putMode(p, UPD, MCMode.REQUIRED);
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
	protected static void statusInitUPD_LclBtn(MABCP_SpecReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Desc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Desc(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[DtlDesc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlDesc(MABCP_SpecReg p){
		p.columnDtlDesc_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlDesc_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlDesc_spec_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDesc_spec_desc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlDesc_spec_desc_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_desc_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlDesc_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlDesc_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlDesc_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlDesc_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlDesc_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlDesc_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtnDesc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtnDesc(MABCP_SpecReg p){
		p.DtlBtnDesc_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnDesc_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnDesc_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnDesc_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnDesc_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrkDesc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrkDesc(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[LclDesc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclDesc(MABCP_SpecReg p){
		p.columnLclDesc_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLclDesc_spec_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLclDesc_spec_desc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLclDesc_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLclDesc_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_spec_desc_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLclDesc_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLclDesc_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLclDesc_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLclDesc_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLclDesc_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLclDesc_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclBtnDesc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtnDesc(MABCP_SpecReg p){
		p.LclBtnDesc_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtnDesc_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtnDesc_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtnDesc_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtnDesc_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_SpecReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[DescAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DescAll(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABCP_SpecReg p){

	}

	/**
	 * [UPD]ステータスの[LclDescAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclDescAll(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_SpecReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_SpecReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_spec_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_spec_nm.putMode(p, FIX, MCMode.ENABLE);
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
	protected static void statusInitFIX_Ctrl(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TopDtl(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[Spec]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Spec(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_SpecReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_spec_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_spec_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_spec_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABCP_SpecReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BtmDtl(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ltab(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BLTab(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_SpecReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_spec_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_spec_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_LclBtn(MABCP_SpecReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Desc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Desc(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[DtlDesc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlDesc(MABCP_SpecReg p){
		p.columnDtlDesc_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlDesc_spec_desc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_desc_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_desc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlDesc_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlDesc_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtnDesc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtnDesc(MABCP_SpecReg p){
		p.DtlBtnDesc_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnDesc_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnDesc_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnDesc_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnDesc_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrkDesc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrkDesc(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[LclDesc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclDesc(MABCP_SpecReg p){
		p.columnLclDesc_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_spec_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLclDesc_spec_desc_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLclDesc_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_spec_desc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLclDesc_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLclDesc_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclBtnDesc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtnDesc(MABCP_SpecReg p){
		p.LclBtnDesc_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtnDesc_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtnDesc_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtnDesc_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtnDesc_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_SpecReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[DescAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DescAll(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_SpecReg p){

	}

	/**
	 * [FIX]ステータスの[LclDescAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclDescAll(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_SpecReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_SpecReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_spec_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_spec_nm.putMode(p, DEL, MCMode.ENABLE);
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
	protected static void statusInitDEL_Ctrl(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TopDtl(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[Spec]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Spec(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_SpecReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_spec_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_spec_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_spec_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABCP_SpecReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtmDtl(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ltab(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BLTab(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_SpecReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_spec_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_spec_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_LclBtn(MABCP_SpecReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Desc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Desc(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[DtlDesc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlDesc(MABCP_SpecReg p){
		p.columnDtlDesc_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlDesc_spec_desc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_desc_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_desc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlDesc_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlDesc_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtnDesc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtnDesc(MABCP_SpecReg p){
		p.DtlBtnDesc_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnDesc_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnDesc_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnDesc_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnDesc_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrkDesc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrkDesc(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[LclDesc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclDesc(MABCP_SpecReg p){
		p.columnLclDesc_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_spec_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLclDesc_spec_desc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLclDesc_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_spec_desc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLclDesc_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLclDesc_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclBtnDesc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtnDesc(MABCP_SpecReg p){
		p.LclBtnDesc_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtnDesc_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtnDesc_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtnDesc_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtnDesc_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_SpecReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[DescAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DescAll(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABCP_SpecReg p){

	}

	/**
	 * [DEL]ステータスの[LclDescAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclDescAll(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_SpecReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_SpecReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_spec_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_spec_nm.putMode(p, REF, MCMode.ENABLE);
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
	protected static void statusInitREF_Ctrl(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_TopDtl(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[Spec]ブロックのモードの設定
	 */
	protected static void statusInitREF_Spec(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_SpecReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_spec_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_spec_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_spec_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABCP_SpecReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtmDtl(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[Ltab]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ltab(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_BLTab(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_SpecReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_spec_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_spec_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_LclBtn(MABCP_SpecReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Desc]ブロックのモードの設定
	 */
	protected static void statusInitREF_Desc(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[DtlDesc]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlDesc(MABCP_SpecReg p){
		p.columnDtlDesc_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDesc_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDesc_spec_desc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_desc_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_spec_desc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlDesc_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlDesc_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtnDesc]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtnDesc(MABCP_SpecReg p){
		p.DtlBtnDesc_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnDesc_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnDesc_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnDesc_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnDesc_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrkDesc]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrkDesc(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[LclDesc]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclDesc(MABCP_SpecReg p){
		p.columnLclDesc_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLclDesc_spec_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLclDesc_spec_desc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLclDesc_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_spec_desc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLclDesc_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLclDesc_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclBtnDesc]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtnDesc(MABCP_SpecReg p){
		p.LclBtnDesc_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtnDesc_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtnDesc_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtnDesc_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtnDesc_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_SpecReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[DescAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_DescAll(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABCP_SpecReg p){

	}

	/**
	 * [REF]ステータスの[LclDescAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclDescAll(MABCP_SpecReg p){

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
		MABCP_SpecReg_MC.setTableConfigDtl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.setTableConfigLcl((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.setTableConfigDtlDesc((MABCP_SpecReg)this);
		MABCP_SpecReg_MC.setTableConfigLclDesc((MABCP_SpecReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_SpecReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0890.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0890.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_spec_cd.setMeta(mcframe.clientMABC.MABCP0890.DtlR.spec_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spec_cd);
		p.columnDtl_spec_nm_lcl.setMeta(mcframe.clientMABC.MABCP0890.DtlR.spec_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spec_nm_lcl);
		p.columnDtl_spec_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlR.spec_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spec_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0890.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0890.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0890.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0890.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0890.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0890.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0890.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0890.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0890.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0890.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0890.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0890.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0890.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_SpecReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0890.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_spec_cd.setMeta(mcframe.clientMABC.MABCP0890.LclR.spec_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_spec_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0890.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0890.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_spec_nm.setMeta(mcframe.clientMABC.MABCP0890.LclR.spec_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_spec_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0890.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0890.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0890.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0890.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0890.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0890.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0890.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0890.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0890.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0890.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0890.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0890.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0890.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * [DtlDesc]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlDesc(MABCP_SpecReg p) {
		p.columnDtlDesc_check.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.check_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_check);
		p.columnDtlDesc_del_flg.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.del_flg_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_del_flg);
		p.columnDtlDesc_spec_cd.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.spec_cd_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_spec_cd);
		p.columnDtlDesc_spec_desc_cd.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.spec_desc_cd_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_spec_desc_cd);
		p.columnDtlDesc_spec_desc_nm_lcl.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.spec_desc_nm_lcl_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_spec_desc_nm_lcl);
		p.columnDtlDesc_spec_desc_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.spec_desc_nm_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_spec_desc_nm);
		p.columnDtlDesc_memo1.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.memo1_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_memo1);
		p.columnDtlDesc_memo2.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.memo2_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_memo2);
		p.columnDtlDesc_memo3.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.memo3_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_memo3);
		p.columnDtlDesc_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.ins_usr_id_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_ins_usr_id);
		p.columnDtlDesc_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.ins_usr_nm_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_ins_usr_nm);
		p.columnDtlDesc_ins_ts.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.ins_ts_META);
		p.columnDtlDesc_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_ins_ts);
		p.columnDtlDesc_ins_func_id.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.ins_func_id_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_ins_func_id);
		p.columnDtlDesc_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.ins_func_nm_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_ins_func_nm);
		p.columnDtlDesc_upd_cntr.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.upd_cntr_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_upd_cntr);
		p.columnDtlDesc_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.upd_usr_id_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_upd_usr_id);
		p.columnDtlDesc_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.upd_usr_nm_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_upd_usr_nm);
		p.columnDtlDesc_upd_ts.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.upd_ts_META);
		p.columnDtlDesc_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_upd_ts);
		p.columnDtlDesc_upd_func_id.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.upd_func_id_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_upd_func_id);
		p.columnDtlDesc_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.upd_func_nm_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_upd_func_nm);
		p.columnDtlDesc_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.upd_srv_req_no_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_upd_srv_req_no);
		p.columnDtlDesc_del_usr_id.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.del_usr_id_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_del_usr_id);
		p.columnDtlDesc_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.del_usr_nm_META);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_del_usr_nm);
		p.columnDtlDesc_del_ts.setMeta(mcframe.clientMABC.MABCP0890.DtlDescR.del_ts_META);
		p.columnDtlDesc_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlDescTable.addColumnConfig(p.columnDtlDesc_del_ts);
		// スクロール固定カラムの指定
		p.DtlDescTable.setUnscrollColumn(p.columnDtlDesc_del_flg);
	}

	/**
	 * [LclDesc]ブロックのTableの設定
	 */
	protected static void setTableConfigLclDesc(MABCP_SpecReg p) {
		p.columnLclDesc_check.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.check_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_check);
		p.columnLclDesc_spec_cd.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.spec_cd_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_spec_cd);
		p.columnLclDesc_spec_desc_cd.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.spec_desc_cd_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_spec_desc_cd);
		p.columnLclDesc_lcl_cd.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.lcl_cd_META);
		p.columnLclDesc_lcl_cd.addLinkBeans(p.columnLclDesc_lcl_nm);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_lcl_cd);
		p.columnLclDesc_lcl_nm.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.lcl_nm_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_lcl_nm);
		p.columnLclDesc_spec_desc_nm.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.spec_desc_nm_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_spec_desc_nm);
		p.columnLclDesc_memo1.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.memo1_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_memo1);
		p.columnLclDesc_memo2.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.memo2_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_memo2);
		p.columnLclDesc_memo3.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.memo3_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_memo3);
		p.columnLclDesc_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.ins_usr_id_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_ins_usr_id);
		p.columnLclDesc_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.ins_usr_nm_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_ins_usr_nm);
		p.columnLclDesc_ins_ts.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.ins_ts_META);
		p.columnLclDesc_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_ins_ts);
		p.columnLclDesc_ins_func_id.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.ins_func_id_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_ins_func_id);
		p.columnLclDesc_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.ins_func_nm_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_ins_func_nm);
		p.columnLclDesc_upd_cntr.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.upd_cntr_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_upd_cntr);
		p.columnLclDesc_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.upd_usr_id_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_upd_usr_id);
		p.columnLclDesc_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.upd_usr_nm_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_upd_usr_nm);
		p.columnLclDesc_upd_ts.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.upd_ts_META);
		p.columnLclDesc_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_upd_ts);
		p.columnLclDesc_upd_func_id.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.upd_func_id_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_upd_func_id);
		p.columnLclDesc_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.upd_func_nm_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_upd_func_nm);
		p.columnLclDesc_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0890.LclDescR.upd_srv_req_no_META);
		p.LclDescTable.addColumnConfig(p.columnLclDesc_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclDescTable.setUnscrollColumn(p.columnLclDesc_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_spec_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_spec_cd.getListConfig().setPutter(getCnd_spec_cd_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
		columnLclDesc_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLclDesc_lcl_cd.getListConfig().setPutter(getLclDesc_lcl_cd_ListPutter());
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
	 * [Cnd_spec_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_spec_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Spec");
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
	 * [LclDesc_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLclDesc_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_spec_cd) return getCnd_spec_cd(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
		if(combo == columnLclDesc_lcl_cd) return getLclDesc_lcl_cd(row, info);
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
		else if (ap == DtlBtnDesc_select_all) doDtlBtnDesc_select_all(info);
		else if (ap == DtlBtnDesc_deselect_all) doDtlBtnDesc_deselect_all(info);
		else if (ap == DtlBtnDesc_radd) doDtlBtnDesc_radd(info);
		else if (ap == DtlBtnDesc_rdel) doDtlBtnDesc_rdel(info);
		else if (ap == DtlBtnDesc_rcopy) doDtlBtnDesc_rcopy(info);
		else if (ap == LclBtnDesc_select_all) doLclBtnDesc_select_all(info);
		else if (ap == LclBtnDesc_deselect_all) doLclBtnDesc_deselect_all(info);
		else if (ap == LclBtnDesc_radd) doLclBtnDesc_radd(info);
		else if (ap == LclBtnDesc_rdel) doLclBtnDesc_rdel(info);
		else if (ap == LclBtnDesc_rcopy) doLclBtnDesc_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
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
	 * [DtlBtnDesc]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnDesc_select_all(MCEventInfo info);

	/**
	 * [DtlBtnDesc]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnDesc_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtnDesc]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnDesc_radd(MCEventInfo info);

	/**
	 * [DtlBtnDesc]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnDesc_rdel(MCEventInfo info);

	/**
	 * [DtlBtnDesc]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnDesc_rcopy(MCEventInfo info);

	/**
	 * [LclBtnDesc]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnDesc_select_all(MCEventInfo info);

	/**
	 * [LclBtnDesc]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnDesc_deselect_all(MCEventInfo info);

	/**
	 * [LclBtnDesc]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnDesc_radd(MCEventInfo info);

	/**
	 * [LclBtnDesc]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnDesc_rdel(MCEventInfo info);

	/**
	 * [LclBtnDesc]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtnDesc_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == DtlDescTable) return doDtlDesc_VC(info);
		if (vc == LclDescTable) return doLclDesc_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_spec_cd) return doCnd_spec_cd_VC(info);
		if (vc == Cnd_spec_nm) return doCnd_spec_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_spec_cd) return doDtl_spec_cd_VC(info);
		if (vc == columnDtl_spec_nm_lcl) return doDtl_spec_nm_lcl_VC(info);
		if (vc == columnDtl_spec_nm) return doDtl_spec_nm_VC(info);
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
		if (vc == columnLcl_spec_cd) return doLcl_spec_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_spec_nm) return doLcl_spec_nm_VC(info);
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
		if (vc == columnDtlDesc_check) return doDtlDesc_check_VC(info);
		if (vc == columnDtlDesc_del_flg) return doDtlDesc_del_flg_VC(info);
		if (vc == columnDtlDesc_spec_cd) return doDtlDesc_spec_cd_VC(info);
		if (vc == columnDtlDesc_spec_desc_cd) return doDtlDesc_spec_desc_cd_VC(info);
		if (vc == columnDtlDesc_spec_desc_nm_lcl) return doDtlDesc_spec_desc_nm_lcl_VC(info);
		if (vc == columnDtlDesc_spec_desc_nm) return doDtlDesc_spec_desc_nm_VC(info);
		if (vc == columnDtlDesc_memo1) return doDtlDesc_memo1_VC(info);
		if (vc == columnDtlDesc_memo2) return doDtlDesc_memo2_VC(info);
		if (vc == columnDtlDesc_memo3) return doDtlDesc_memo3_VC(info);
		if (vc == columnDtlDesc_ins_usr_id) return doDtlDesc_ins_usr_id_VC(info);
		if (vc == columnDtlDesc_ins_usr_nm) return doDtlDesc_ins_usr_nm_VC(info);
		if (vc == columnDtlDesc_ins_ts) return doDtlDesc_ins_ts_VC(info);
		if (vc == columnDtlDesc_ins_func_id) return doDtlDesc_ins_func_id_VC(info);
		if (vc == columnDtlDesc_ins_func_nm) return doDtlDesc_ins_func_nm_VC(info);
		if (vc == columnDtlDesc_upd_cntr) return doDtlDesc_upd_cntr_VC(info);
		if (vc == columnDtlDesc_upd_usr_id) return doDtlDesc_upd_usr_id_VC(info);
		if (vc == columnDtlDesc_upd_usr_nm) return doDtlDesc_upd_usr_nm_VC(info);
		if (vc == columnDtlDesc_upd_ts) return doDtlDesc_upd_ts_VC(info);
		if (vc == columnDtlDesc_upd_func_id) return doDtlDesc_upd_func_id_VC(info);
		if (vc == columnDtlDesc_upd_func_nm) return doDtlDesc_upd_func_nm_VC(info);
		if (vc == columnDtlDesc_upd_srv_req_no) return doDtlDesc_upd_srv_req_no_VC(info);
		if (vc == columnDtlDesc_del_usr_id) return doDtlDesc_del_usr_id_VC(info);
		if (vc == columnDtlDesc_del_usr_nm) return doDtlDesc_del_usr_nm_VC(info);
		if (vc == columnDtlDesc_del_ts) return doDtlDesc_del_ts_VC(info);
		if (vc == columnLclDesc_check) return doLclDesc_check_VC(info);
		if (vc == columnLclDesc_spec_cd) return doLclDesc_spec_cd_VC(info);
		if (vc == columnLclDesc_spec_desc_cd) return doLclDesc_spec_desc_cd_VC(info);
		if (vc == columnLclDesc_lcl_cd) return doLclDesc_lcl_cd_VC(info);
		if (vc == columnLclDesc_lcl_nm) return doLclDesc_lcl_nm_VC(info);
		if (vc == columnLclDesc_spec_desc_nm) return doLclDesc_spec_desc_nm_VC(info);
		if (vc == columnLclDesc_memo1) return doLclDesc_memo1_VC(info);
		if (vc == columnLclDesc_memo2) return doLclDesc_memo2_VC(info);
		if (vc == columnLclDesc_memo3) return doLclDesc_memo3_VC(info);
		if (vc == columnLclDesc_ins_usr_id) return doLclDesc_ins_usr_id_VC(info);
		if (vc == columnLclDesc_ins_usr_nm) return doLclDesc_ins_usr_nm_VC(info);
		if (vc == columnLclDesc_ins_ts) return doLclDesc_ins_ts_VC(info);
		if (vc == columnLclDesc_ins_func_id) return doLclDesc_ins_func_id_VC(info);
		if (vc == columnLclDesc_ins_func_nm) return doLclDesc_ins_func_nm_VC(info);
		if (vc == columnLclDesc_upd_cntr) return doLclDesc_upd_cntr_VC(info);
		if (vc == columnLclDesc_upd_usr_id) return doLclDesc_upd_usr_id_VC(info);
		if (vc == columnLclDesc_upd_usr_nm) return doLclDesc_upd_usr_nm_VC(info);
		if (vc == columnLclDesc_upd_ts) return doLclDesc_upd_ts_VC(info);
		if (vc == columnLclDesc_upd_func_id) return doLclDesc_upd_func_id_VC(info);
		if (vc == columnLclDesc_upd_func_nm) return doLclDesc_upd_func_nm_VC(info);
		if (vc == columnLclDesc_upd_srv_req_no) return doLclDesc_upd_srv_req_no_VC(info);
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
	 * [DtlDesc]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[spec_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spec_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[spec_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_spec_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[spec_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spec_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spec_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spec_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spec_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spec_nm_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_spec_cd_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_spec_nm_VC(MCEventInfo info){
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
	 * [DtlDesc]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[spec_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_spec_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_spec_desc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_spec_desc_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_spec_desc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlDesc]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlDesc_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[spec_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_spec_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[spec_desc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_spec_desc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[spec_desc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_spec_desc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LclDesc]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLclDesc_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == DtlDescTable) doDtlDesc_NC(info);
		else if (nc == LclDescTable) doLclDesc_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_spec_cd) doCnd_spec_cd_NC(info);
		else if (nc == Cnd_spec_nm) doCnd_spec_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_spec_cd) doDtl_spec_cd_NC(info);
		else if (nc == columnDtl_spec_nm_lcl) doDtl_spec_nm_lcl_NC(info);
		else if (nc == columnDtl_spec_nm) doDtl_spec_nm_NC(info);
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
		else if (nc == columnLcl_spec_cd) doLcl_spec_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_spec_nm) doLcl_spec_nm_NC(info);
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
		else if (nc == columnDtlDesc_check) doDtlDesc_check_NC(info);
		else if (nc == columnDtlDesc_del_flg) doDtlDesc_del_flg_NC(info);
		else if (nc == columnDtlDesc_spec_cd) doDtlDesc_spec_cd_NC(info);
		else if (nc == columnDtlDesc_spec_desc_cd) doDtlDesc_spec_desc_cd_NC(info);
		else if (nc == columnDtlDesc_spec_desc_nm_lcl) doDtlDesc_spec_desc_nm_lcl_NC(info);
		else if (nc == columnDtlDesc_spec_desc_nm) doDtlDesc_spec_desc_nm_NC(info);
		else if (nc == columnDtlDesc_memo1) doDtlDesc_memo1_NC(info);
		else if (nc == columnDtlDesc_memo2) doDtlDesc_memo2_NC(info);
		else if (nc == columnDtlDesc_memo3) doDtlDesc_memo3_NC(info);
		else if (nc == columnDtlDesc_ins_usr_id) doDtlDesc_ins_usr_id_NC(info);
		else if (nc == columnDtlDesc_ins_usr_nm) doDtlDesc_ins_usr_nm_NC(info);
		else if (nc == columnDtlDesc_ins_ts) doDtlDesc_ins_ts_NC(info);
		else if (nc == columnDtlDesc_ins_func_id) doDtlDesc_ins_func_id_NC(info);
		else if (nc == columnDtlDesc_ins_func_nm) doDtlDesc_ins_func_nm_NC(info);
		else if (nc == columnDtlDesc_upd_cntr) doDtlDesc_upd_cntr_NC(info);
		else if (nc == columnDtlDesc_upd_usr_id) doDtlDesc_upd_usr_id_NC(info);
		else if (nc == columnDtlDesc_upd_usr_nm) doDtlDesc_upd_usr_nm_NC(info);
		else if (nc == columnDtlDesc_upd_ts) doDtlDesc_upd_ts_NC(info);
		else if (nc == columnDtlDesc_upd_func_id) doDtlDesc_upd_func_id_NC(info);
		else if (nc == columnDtlDesc_upd_func_nm) doDtlDesc_upd_func_nm_NC(info);
		else if (nc == columnDtlDesc_upd_srv_req_no) doDtlDesc_upd_srv_req_no_NC(info);
		else if (nc == columnDtlDesc_del_usr_id) doDtlDesc_del_usr_id_NC(info);
		else if (nc == columnDtlDesc_del_usr_nm) doDtlDesc_del_usr_nm_NC(info);
		else if (nc == columnDtlDesc_del_ts) doDtlDesc_del_ts_NC(info);
		else if (nc == columnLclDesc_check) doLclDesc_check_NC(info);
		else if (nc == columnLclDesc_spec_cd) doLclDesc_spec_cd_NC(info);
		else if (nc == columnLclDesc_spec_desc_cd) doLclDesc_spec_desc_cd_NC(info);
		else if (nc == columnLclDesc_lcl_cd) doLclDesc_lcl_cd_NC(info);
		else if (nc == columnLclDesc_lcl_nm) doLclDesc_lcl_nm_NC(info);
		else if (nc == columnLclDesc_spec_desc_nm) doLclDesc_spec_desc_nm_NC(info);
		else if (nc == columnLclDesc_memo1) doLclDesc_memo1_NC(info);
		else if (nc == columnLclDesc_memo2) doLclDesc_memo2_NC(info);
		else if (nc == columnLclDesc_memo3) doLclDesc_memo3_NC(info);
		else if (nc == columnLclDesc_ins_usr_id) doLclDesc_ins_usr_id_NC(info);
		else if (nc == columnLclDesc_ins_usr_nm) doLclDesc_ins_usr_nm_NC(info);
		else if (nc == columnLclDesc_ins_ts) doLclDesc_ins_ts_NC(info);
		else if (nc == columnLclDesc_ins_func_id) doLclDesc_ins_func_id_NC(info);
		else if (nc == columnLclDesc_ins_func_nm) doLclDesc_ins_func_nm_NC(info);
		else if (nc == columnLclDesc_upd_cntr) doLclDesc_upd_cntr_NC(info);
		else if (nc == columnLclDesc_upd_usr_id) doLclDesc_upd_usr_id_NC(info);
		else if (nc == columnLclDesc_upd_usr_nm) doLclDesc_upd_usr_nm_NC(info);
		else if (nc == columnLclDesc_upd_ts) doLclDesc_upd_ts_NC(info);
		else if (nc == columnLclDesc_upd_func_id) doLclDesc_upd_func_id_NC(info);
		else if (nc == columnLclDesc_upd_func_nm) doLclDesc_upd_func_nm_NC(info);
		else if (nc == columnLclDesc_upd_srv_req_no) doLclDesc_upd_srv_req_no_NC(info);
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
	 * [DtlDesc]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[spec_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spec_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spec_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spec_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[spec_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_nm_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_spec_cd_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_spec_nm_NC(MCEventInfo info){
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
	 * [DtlDesc]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo1_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo2_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo3_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_check_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_cd_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_desc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_desc_cd_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_desc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_desc_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo1_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo2_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo3_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == DtlDescTable) doDtlDesc_NE(info);
		else if (ne == LclDescTable) doLclDesc_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_spec_cd) doCnd_spec_cd_NE(info);
		else if (ne == Cnd_spec_nm) doCnd_spec_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_spec_cd) doDtl_spec_cd_NE(info);
		else if (ne == columnDtl_spec_nm_lcl) doDtl_spec_nm_lcl_NE(info);
		else if (ne == columnDtl_spec_nm) doDtl_spec_nm_NE(info);
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
		else if (ne == columnLcl_spec_cd) doLcl_spec_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_spec_nm) doLcl_spec_nm_NE(info);
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
		else if (ne == columnDtlDesc_check) doDtlDesc_check_NE(info);
		else if (ne == columnDtlDesc_del_flg) doDtlDesc_del_flg_NE(info);
		else if (ne == columnDtlDesc_spec_cd) doDtlDesc_spec_cd_NE(info);
		else if (ne == columnDtlDesc_spec_desc_cd) doDtlDesc_spec_desc_cd_NE(info);
		else if (ne == columnDtlDesc_spec_desc_nm_lcl) doDtlDesc_spec_desc_nm_lcl_NE(info);
		else if (ne == columnDtlDesc_spec_desc_nm) doDtlDesc_spec_desc_nm_NE(info);
		else if (ne == columnDtlDesc_memo1) doDtlDesc_memo1_NE(info);
		else if (ne == columnDtlDesc_memo2) doDtlDesc_memo2_NE(info);
		else if (ne == columnDtlDesc_memo3) doDtlDesc_memo3_NE(info);
		else if (ne == columnDtlDesc_ins_usr_id) doDtlDesc_ins_usr_id_NE(info);
		else if (ne == columnDtlDesc_ins_usr_nm) doDtlDesc_ins_usr_nm_NE(info);
		else if (ne == columnDtlDesc_ins_ts) doDtlDesc_ins_ts_NE(info);
		else if (ne == columnDtlDesc_ins_func_id) doDtlDesc_ins_func_id_NE(info);
		else if (ne == columnDtlDesc_ins_func_nm) doDtlDesc_ins_func_nm_NE(info);
		else if (ne == columnDtlDesc_upd_cntr) doDtlDesc_upd_cntr_NE(info);
		else if (ne == columnDtlDesc_upd_usr_id) doDtlDesc_upd_usr_id_NE(info);
		else if (ne == columnDtlDesc_upd_usr_nm) doDtlDesc_upd_usr_nm_NE(info);
		else if (ne == columnDtlDesc_upd_ts) doDtlDesc_upd_ts_NE(info);
		else if (ne == columnDtlDesc_upd_func_id) doDtlDesc_upd_func_id_NE(info);
		else if (ne == columnDtlDesc_upd_func_nm) doDtlDesc_upd_func_nm_NE(info);
		else if (ne == columnDtlDesc_upd_srv_req_no) doDtlDesc_upd_srv_req_no_NE(info);
		else if (ne == columnDtlDesc_del_usr_id) doDtlDesc_del_usr_id_NE(info);
		else if (ne == columnDtlDesc_del_usr_nm) doDtlDesc_del_usr_nm_NE(info);
		else if (ne == columnDtlDesc_del_ts) doDtlDesc_del_ts_NE(info);
		else if (ne == columnLclDesc_check) doLclDesc_check_NE(info);
		else if (ne == columnLclDesc_spec_cd) doLclDesc_spec_cd_NE(info);
		else if (ne == columnLclDesc_spec_desc_cd) doLclDesc_spec_desc_cd_NE(info);
		else if (ne == columnLclDesc_lcl_cd) doLclDesc_lcl_cd_NE(info);
		else if (ne == columnLclDesc_lcl_nm) doLclDesc_lcl_nm_NE(info);
		else if (ne == columnLclDesc_spec_desc_nm) doLclDesc_spec_desc_nm_NE(info);
		else if (ne == columnLclDesc_memo1) doLclDesc_memo1_NE(info);
		else if (ne == columnLclDesc_memo2) doLclDesc_memo2_NE(info);
		else if (ne == columnLclDesc_memo3) doLclDesc_memo3_NE(info);
		else if (ne == columnLclDesc_ins_usr_id) doLclDesc_ins_usr_id_NE(info);
		else if (ne == columnLclDesc_ins_usr_nm) doLclDesc_ins_usr_nm_NE(info);
		else if (ne == columnLclDesc_ins_ts) doLclDesc_ins_ts_NE(info);
		else if (ne == columnLclDesc_ins_func_id) doLclDesc_ins_func_id_NE(info);
		else if (ne == columnLclDesc_ins_func_nm) doLclDesc_ins_func_nm_NE(info);
		else if (ne == columnLclDesc_upd_cntr) doLclDesc_upd_cntr_NE(info);
		else if (ne == columnLclDesc_upd_usr_id) doLclDesc_upd_usr_id_NE(info);
		else if (ne == columnLclDesc_upd_usr_nm) doLclDesc_upd_usr_nm_NE(info);
		else if (ne == columnLclDesc_upd_ts) doLclDesc_upd_ts_NE(info);
		else if (ne == columnLclDesc_upd_func_id) doLclDesc_upd_func_id_NE(info);
		else if (ne == columnLclDesc_upd_func_nm) doLclDesc_upd_func_nm_NE(info);
		else if (ne == columnLclDesc_upd_srv_req_no) doLclDesc_upd_srv_req_no_NE(info);
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
	 * [DtlDesc]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[spec_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spec_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spec_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spec_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[spec_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_nm_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_spec_cd_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_spec_nm_NE(MCEventInfo info){
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
	 * [DtlDesc]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo1_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo2_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo3_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_check_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_cd_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_desc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_desc_cd_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_desc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_desc_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo1_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo2_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo3_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == DtlDescTable) doDtlDesc_NX(info);
		else if (nx == LclDescTable) doLclDesc_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_spec_cd) doCnd_spec_cd_NX(info);
		else if (nx == Cnd_spec_nm) doCnd_spec_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_spec_cd) doDtl_spec_cd_NX(info);
		else if (nx == columnDtl_spec_nm_lcl) doDtl_spec_nm_lcl_NX(info);
		else if (nx == columnDtl_spec_nm) doDtl_spec_nm_NX(info);
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
		else if (nx == columnLcl_spec_cd) doLcl_spec_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_spec_nm) doLcl_spec_nm_NX(info);
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
		else if (nx == columnDtlDesc_check) doDtlDesc_check_NX(info);
		else if (nx == columnDtlDesc_del_flg) doDtlDesc_del_flg_NX(info);
		else if (nx == columnDtlDesc_spec_cd) doDtlDesc_spec_cd_NX(info);
		else if (nx == columnDtlDesc_spec_desc_cd) doDtlDesc_spec_desc_cd_NX(info);
		else if (nx == columnDtlDesc_spec_desc_nm_lcl) doDtlDesc_spec_desc_nm_lcl_NX(info);
		else if (nx == columnDtlDesc_spec_desc_nm) doDtlDesc_spec_desc_nm_NX(info);
		else if (nx == columnDtlDesc_memo1) doDtlDesc_memo1_NX(info);
		else if (nx == columnDtlDesc_memo2) doDtlDesc_memo2_NX(info);
		else if (nx == columnDtlDesc_memo3) doDtlDesc_memo3_NX(info);
		else if (nx == columnDtlDesc_ins_usr_id) doDtlDesc_ins_usr_id_NX(info);
		else if (nx == columnDtlDesc_ins_usr_nm) doDtlDesc_ins_usr_nm_NX(info);
		else if (nx == columnDtlDesc_ins_ts) doDtlDesc_ins_ts_NX(info);
		else if (nx == columnDtlDesc_ins_func_id) doDtlDesc_ins_func_id_NX(info);
		else if (nx == columnDtlDesc_ins_func_nm) doDtlDesc_ins_func_nm_NX(info);
		else if (nx == columnDtlDesc_upd_cntr) doDtlDesc_upd_cntr_NX(info);
		else if (nx == columnDtlDesc_upd_usr_id) doDtlDesc_upd_usr_id_NX(info);
		else if (nx == columnDtlDesc_upd_usr_nm) doDtlDesc_upd_usr_nm_NX(info);
		else if (nx == columnDtlDesc_upd_ts) doDtlDesc_upd_ts_NX(info);
		else if (nx == columnDtlDesc_upd_func_id) doDtlDesc_upd_func_id_NX(info);
		else if (nx == columnDtlDesc_upd_func_nm) doDtlDesc_upd_func_nm_NX(info);
		else if (nx == columnDtlDesc_upd_srv_req_no) doDtlDesc_upd_srv_req_no_NX(info);
		else if (nx == columnDtlDesc_del_usr_id) doDtlDesc_del_usr_id_NX(info);
		else if (nx == columnDtlDesc_del_usr_nm) doDtlDesc_del_usr_nm_NX(info);
		else if (nx == columnDtlDesc_del_ts) doDtlDesc_del_ts_NX(info);
		else if (nx == columnLclDesc_check) doLclDesc_check_NX(info);
		else if (nx == columnLclDesc_spec_cd) doLclDesc_spec_cd_NX(info);
		else if (nx == columnLclDesc_spec_desc_cd) doLclDesc_spec_desc_cd_NX(info);
		else if (nx == columnLclDesc_lcl_cd) doLclDesc_lcl_cd_NX(info);
		else if (nx == columnLclDesc_lcl_nm) doLclDesc_lcl_nm_NX(info);
		else if (nx == columnLclDesc_spec_desc_nm) doLclDesc_spec_desc_nm_NX(info);
		else if (nx == columnLclDesc_memo1) doLclDesc_memo1_NX(info);
		else if (nx == columnLclDesc_memo2) doLclDesc_memo2_NX(info);
		else if (nx == columnLclDesc_memo3) doLclDesc_memo3_NX(info);
		else if (nx == columnLclDesc_ins_usr_id) doLclDesc_ins_usr_id_NX(info);
		else if (nx == columnLclDesc_ins_usr_nm) doLclDesc_ins_usr_nm_NX(info);
		else if (nx == columnLclDesc_ins_ts) doLclDesc_ins_ts_NX(info);
		else if (nx == columnLclDesc_ins_func_id) doLclDesc_ins_func_id_NX(info);
		else if (nx == columnLclDesc_ins_func_nm) doLclDesc_ins_func_nm_NX(info);
		else if (nx == columnLclDesc_upd_cntr) doLclDesc_upd_cntr_NX(info);
		else if (nx == columnLclDesc_upd_usr_id) doLclDesc_upd_usr_id_NX(info);
		else if (nx == columnLclDesc_upd_usr_nm) doLclDesc_upd_usr_nm_NX(info);
		else if (nx == columnLclDesc_upd_ts) doLclDesc_upd_ts_NX(info);
		else if (nx == columnLclDesc_upd_func_id) doLclDesc_upd_func_id_NX(info);
		else if (nx == columnLclDesc_upd_func_nm) doLclDesc_upd_func_nm_NX(info);
		else if (nx == columnLclDesc_upd_srv_req_no) doLclDesc_upd_srv_req_no_NX(info);
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
	 * [DtlDesc]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[spec_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spec_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spec_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spec_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[spec_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_nm_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_spec_cd_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_spec_nm_NX(MCEventInfo info){
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
	 * [DtlDesc]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo1_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo2_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo3_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_check_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_cd_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_desc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_desc_cd_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_desc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_desc_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo1_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo2_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo3_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_srv_req_no_NX(MCEventInfo info){
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
		else if (lc == Cnd_spec_cd) doCnd_spec_cd_LC(info);
		else if (lc == Cnd_spec_nm) doCnd_spec_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_spec_cd) doDtl_spec_cd_LC(info);
		else if (lc == columnDtl_spec_nm_lcl) doDtl_spec_nm_lcl_LC(info);
		else if (lc == columnDtl_spec_nm) doDtl_spec_nm_LC(info);
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
		else if (lc == columnLcl_spec_cd) doLcl_spec_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_spec_nm) doLcl_spec_nm_LC(info);
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
		else if (lc == columnDtlDesc_spec_cd) doDtlDesc_spec_cd_LC(info);
		else if (lc == columnDtlDesc_spec_desc_cd) doDtlDesc_spec_desc_cd_LC(info);
		else if (lc == columnDtlDesc_spec_desc_nm_lcl) doDtlDesc_spec_desc_nm_lcl_LC(info);
		else if (lc == columnDtlDesc_spec_desc_nm) doDtlDesc_spec_desc_nm_LC(info);
		else if (lc == columnDtlDesc_memo1) doDtlDesc_memo1_LC(info);
		else if (lc == columnDtlDesc_memo2) doDtlDesc_memo2_LC(info);
		else if (lc == columnDtlDesc_memo3) doDtlDesc_memo3_LC(info);
		else if (lc == columnDtlDesc_ins_usr_id) doDtlDesc_ins_usr_id_LC(info);
		else if (lc == columnDtlDesc_ins_usr_nm) doDtlDesc_ins_usr_nm_LC(info);
		else if (lc == columnDtlDesc_ins_ts) doDtlDesc_ins_ts_LC(info);
		else if (lc == columnDtlDesc_ins_func_id) doDtlDesc_ins_func_id_LC(info);
		else if (lc == columnDtlDesc_ins_func_nm) doDtlDesc_ins_func_nm_LC(info);
		else if (lc == columnDtlDesc_upd_cntr) doDtlDesc_upd_cntr_LC(info);
		else if (lc == columnDtlDesc_upd_usr_id) doDtlDesc_upd_usr_id_LC(info);
		else if (lc == columnDtlDesc_upd_usr_nm) doDtlDesc_upd_usr_nm_LC(info);
		else if (lc == columnDtlDesc_upd_ts) doDtlDesc_upd_ts_LC(info);
		else if (lc == columnDtlDesc_upd_func_id) doDtlDesc_upd_func_id_LC(info);
		else if (lc == columnDtlDesc_upd_func_nm) doDtlDesc_upd_func_nm_LC(info);
		else if (lc == columnDtlDesc_upd_srv_req_no) doDtlDesc_upd_srv_req_no_LC(info);
		else if (lc == columnDtlDesc_del_usr_id) doDtlDesc_del_usr_id_LC(info);
		else if (lc == columnDtlDesc_del_usr_nm) doDtlDesc_del_usr_nm_LC(info);
		else if (lc == columnDtlDesc_del_ts) doDtlDesc_del_ts_LC(info);
		else if (lc == columnLclDesc_spec_cd) doLclDesc_spec_cd_LC(info);
		else if (lc == columnLclDesc_spec_desc_cd) doLclDesc_spec_desc_cd_LC(info);
		else if (lc == columnLclDesc_lcl_cd) doLclDesc_lcl_cd_LC(info);
		else if (lc == columnLclDesc_lcl_nm) doLclDesc_lcl_nm_LC(info);
		else if (lc == columnLclDesc_spec_desc_nm) doLclDesc_spec_desc_nm_LC(info);
		else if (lc == columnLclDesc_memo1) doLclDesc_memo1_LC(info);
		else if (lc == columnLclDesc_memo2) doLclDesc_memo2_LC(info);
		else if (lc == columnLclDesc_memo3) doLclDesc_memo3_LC(info);
		else if (lc == columnLclDesc_ins_usr_id) doLclDesc_ins_usr_id_LC(info);
		else if (lc == columnLclDesc_ins_usr_nm) doLclDesc_ins_usr_nm_LC(info);
		else if (lc == columnLclDesc_ins_ts) doLclDesc_ins_ts_LC(info);
		else if (lc == columnLclDesc_ins_func_id) doLclDesc_ins_func_id_LC(info);
		else if (lc == columnLclDesc_ins_func_nm) doLclDesc_ins_func_nm_LC(info);
		else if (lc == columnLclDesc_upd_cntr) doLclDesc_upd_cntr_LC(info);
		else if (lc == columnLclDesc_upd_usr_id) doLclDesc_upd_usr_id_LC(info);
		else if (lc == columnLclDesc_upd_usr_nm) doLclDesc_upd_usr_nm_LC(info);
		else if (lc == columnLclDesc_upd_ts) doLclDesc_upd_ts_LC(info);
		else if (lc == columnLclDesc_upd_func_id) doLclDesc_upd_func_id_LC(info);
		else if (lc == columnLclDesc_upd_func_nm) doLclDesc_upd_func_nm_LC(info);
		else if (lc == columnLclDesc_upd_srv_req_no) doLclDesc_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spec_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spec_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[spec_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_spec_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[spec_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_nm_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_spec_cd_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[spec_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_spec_nm_LC(MCEventInfo info){
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
	 * [DtlDesc]パネルの[spec_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[spec_desc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_spec_desc_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo1_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo2_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_memo3_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlDesc]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlDesc_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_cd_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_desc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_desc_cd_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[spec_desc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_spec_desc_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo1_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo2_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_memo3_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [LclDesc]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLclDesc_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_spec_cd]の作成メソッド
	 */
	public MCList getCnd_spec_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSpec(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLclDesc_lcl_cd]の作成メソッド
	 */
	public MCList getLclDesc_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0890.Srch01")) {
			return new MA_MABCL0890_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0890.Upd01")) {
			return new MA_MABCL0890_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0890.Del01")) {
			return new MA_MABCL0890_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0890_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0890_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0890_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0890_Srch01Bridge() {
			p_MA_MABCL0890_Srch01 = new MCParam(PDef.MA_MABCL0890_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0890_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0890.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0890.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0890.DtlDescR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0890.LclR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0890.LclDescR.class));

			p_MA_MABCL0890_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0890_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0890_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0890_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0890_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0890.CndR up0() {
			return (mcframe.clientMABC.MABCP0890.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0890.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0890.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0890.DtlDescR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0890.DtlDescR>)down(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0890.LclR> down2() {
			return (MCList<mcframe.clientMABC.MABCP0890.LclR>)down(2);
		}
		protected MCList<mcframe.clientMABC.MABCP0890.LclDescR> down3() {
			return (MCList<mcframe.clientMABC.MABCP0890.LclDescR>)down(3);
		}

		protected void setupDownParam() {
			p_MA_MABCL0890_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0890.DtlR.class));
			p_MA_MABCL0890_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0890.DtlDescR.class));
			p_MA_MABCL0890_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0890.LclR.class));
			p_MA_MABCL0890_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0890.LclDescR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0890_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0890.DtlR>)p_MA_MABCL0890_Srch01.getContainerParam().getDownBlock(0));
			setDescAllL((MCList<mcframe.clientMABC.MABCP0890.DtlDescR>)p_MA_MABCL0890_Srch01.getContainerParam().getDownBlock(1));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0890.LclR>)p_MA_MABCL0890_Srch01.getContainerParam().getDownBlock(2));
			setLclDescAllL((MCList<mcframe.clientMABC.MABCP0890.LclDescR>)p_MA_MABCL0890_Srch01.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getDtlL().clear();
			getDescAllL().clear();
			getLclAllL().clear();
			getLclDescAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDescAllL());
			result.add(getLclAllL());
			result.add(getLclDescAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0890_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0890_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0890_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0890_Upd01Bridge() {
			p_MA_MABCL0890_Upd01 = new MCParam(PDef.MA_MABCL0890_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0890_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0890.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0890.DtlDescR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0890.LclR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0890.LclDescR.class));
			// Down

			p_MA_MABCL0890_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0890_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0890_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0890_Upd01.addUpBlock(getDescAllL().shallowClone());
			p_MA_MABCL0890_Upd01.addUpBlock(getLclAllL().shallowClone());
			p_MA_MABCL0890_Upd01.addUpBlock(getLclDescAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0890_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0890_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0890.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0890.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0890.DtlDescR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0890.DtlDescR>)up(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0890.LclR> up2() {
			return (MCList<mcframe.clientMABC.MABCP0890.LclR>)up(2);
		}
		protected MCList<mcframe.clientMABC.MABCP0890.LclDescR> up3() {
			return (MCList<mcframe.clientMABC.MABCP0890.LclDescR>)up(3);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0890_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDescAllL());
			result.add(getLclAllL());
			result.add(getLclDescAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL0890_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0890_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0890_Del01;

		/** コンストラクタ */
		protected MA_MABCL0890_Del01Bridge() {
			p_MA_MABCL0890_Del01 = new MCParam(PDef.MA_MABCL0890_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0890_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0890.DtlR.class));
			// Down

			p_MA_MABCL0890_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0890_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0890_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0890_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0890_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0890.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0890.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0890_Del01;
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