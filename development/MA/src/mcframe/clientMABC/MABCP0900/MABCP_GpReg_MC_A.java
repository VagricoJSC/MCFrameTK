package mcframe.clientMABC.MABCP0900;

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
import mcframe.clientMABC.MABCP0900.MABCP_GpReg_MC.MA_MABCL0900_Srch01Caller;
import mcframe.clientMABC.MABCP0900.MABCP_GpReg_MC.MA_MABCL0900_Upd01Caller;
import mcframe.clientMABC.MABCP0900.MABCP_GpReg_MC.MA_MABCL0900_Del01Caller;

/**
 * 画面"MABCP_GpReg"パネルクラスです。<p>
 *
 * 汎用マスタの検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_GpReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABCP0900";

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
	// [GpGrp]ブロック関連のField定義
	public MCPanel GpGrpPanel = null;
	public MCTitledBorder GpGrpTitledBorder = null;
	// [GpGrp]ブロックの項目のField定義
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
	public MCLabel Cnd_gp_grp_cd_Label = null;
	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gp_grp_cd = null;
	/**
	 * General purpose classification name 汎用分類名.<p>
	 *
	 */
	public MCTextField Cnd_gp_grp_nm = null;
	public MCLabel Cnd_key1_Label = null;
	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public MCTextField Cnd_key1 = null;
	public MCLabel Cnd_key2_Label = null;
	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public MCTextField Cnd_key2 = null;
	public MCLabel Cnd_key3_Label = null;
	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public MCTextField Cnd_key3 = null;
	public MCLabel Cnd_key4_Label = null;
	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public MCTextField Cnd_key4 = null;
	public MCLabel Cnd_key5_Label = null;
	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public MCTextField Cnd_key5 = null;
	public MCLabel Cnd_key6_Label = null;
	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public MCTextField Cnd_key6 = null;
	public MCLabel Cnd_key7_Label = null;
	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public MCTextField Cnd_key7 = null;
	public MCLabel Cnd_key8_Label = null;
	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public MCTextField Cnd_key8 = null;
	public MCLabel Cnd_key9_Label = null;
	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public MCTextField Cnd_key9 = null;
	public MCLabel Cnd_key10_Label = null;
	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public MCTextField Cnd_key10 = null;
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
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0900.DtlR> DtlTable = null;
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
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gp_grp_cd = null;
	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key1 = null;
	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key2 = null;
	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key3 = null;
	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key4 = null;
	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key5 = null;
	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key6 = null;
	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key7 = null;
	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key8 = null;
	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key9 = null;
	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_key10 = null;
	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char1 = null;
	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char2 = null;
	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char3 = null;
	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char4 = null;
	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char5 = null;
	/**
	 * String 6 文字列６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char6 = null;
	/**
	 * String 7 文字列７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char7 = null;
	/**
	 * String 8 文字列８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char8 = null;
	/**
	 * String 9 文字列９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char9 = null;
	/**
	 * String 10 文字列１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char10 = null;
	/**
	 * String 11 文字列１１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char11 = null;
	/**
	 * String 12 文字列１２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char12 = null;
	/**
	 * String 13 文字列１３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char13 = null;
	/**
	 * String 14 文字列１４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char14 = null;
	/**
	 * String 15 文字列１５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char15 = null;
	/**
	 * String 16 文字列１６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char16 = null;
	/**
	 * String 17 文字列１７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char17 = null;
	/**
	 * String 18 文字列１８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char18 = null;
	/**
	 * String 19 文字列１９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char19 = null;
	/**
	 * String 20 文字列２０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_char20 = null;
	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num1 = null;
	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num2 = null;
	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num3 = null;
	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num4 = null;
	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num5 = null;
	/**
	 * Numerical 6 数値６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num6 = null;
	/**
	 * Numerical 7 数値７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num7 = null;
	/**
	 * Numerical 8 数値８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num8 = null;
	/**
	 * Numerical 9 数値９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num9 = null;
	/**
	 * Numerical 10 数値１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_num10 = null;
	/**
	 * Date 1 日付１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt1 = null;
	/**
	 * Date 2 日付２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt2 = null;
	/**
	 * Date 3 日付３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt3 = null;
	/**
	 * Date 4 日付４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt4 = null;
	/**
	 * Date 5 日付５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt5 = null;
	/**
	 * Date 6 日付６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt6 = null;
	/**
	 * Date 7 日付７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt7 = null;
	/**
	 * Date 8 日付８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt8 = null;
	/**
	 * Date 9 日付９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt9 = null;
	/**
	 * Date 10 日付１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt10 = null;
	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg1 = null;
	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg2 = null;
	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg3 = null;
	/**
	 * Flg. 4 フラグ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg4 = null;
	/**
	 * Flg. 5 フラグ５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg5 = null;
	/**
	 * Flg. 6 フラグ６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg6 = null;
	/**
	 * Flg. 7 フラグ７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg7 = null;
	/**
	 * Flg. 8 フラグ８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg8 = null;
	/**
	 * Flg. 9 フラグ９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg9 = null;
	/**
	 * Flg. 10 フラグ１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_flg10 = null;
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
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0900.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_gp_grp_cd = null;
	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key1 = null;
	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key2 = null;
	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key3 = null;
	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key4 = null;
	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key5 = null;
	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key6 = null;
	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key7 = null;
	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key8 = null;
	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key9 = null;
	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public MCColumnConfig columnLcl_key10 = null;
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
	 * String 1 文字列１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char1 = null;
	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char2 = null;
	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char3 = null;
	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char4 = null;
	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char5 = null;
	/**
	 * String 6 文字列６.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char6 = null;
	/**
	 * String 7 文字列７.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char7 = null;
	/**
	 * String 8 文字列８.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char8 = null;
	/**
	 * String 9 文字列９.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char9 = null;
	/**
	 * String 10 文字列１０.<p>
	 *
	 */
	public MCColumnConfig columnLcl_char10 = null;
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
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

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0900_Srch01]のCallerの作成 */
	protected MABCP_GpReg_MC.MA_MABCL0900_Srch01Caller createMA_MABCL0900_Srch01() {
		MABCP_GpReg_MC.MA_MABCL0900_Srch01Caller<MABCP_GpReg, MA_MABCL0900_Srch01Bridge>
		caller = ((MABCP_GpReg_MC)this).new MA_MABCL0900_Srch01Caller<MABCP_GpReg, MA_MABCL0900_Srch01Bridge>(
					(MABCP_GpReg)this, new MA_MABCL0900_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0900_Srch01]の呼び出し */
	protected void callMA_MABCL0900_Srch01() {
		MCCaller caller = createMA_MABCL0900_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0900_Upd01]のCallerの作成 */
	protected MABCP_GpReg_MC.MA_MABCL0900_Upd01Caller createMA_MABCL0900_Upd01() {
		MABCP_GpReg_MC.MA_MABCL0900_Upd01Caller<MABCP_GpReg, MA_MABCL0900_Upd01Bridge>
		caller = ((MABCP_GpReg_MC)this).new MA_MABCL0900_Upd01Caller<MABCP_GpReg, MA_MABCL0900_Upd01Bridge>(
					(MABCP_GpReg)this, new MA_MABCL0900_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0900_Upd01]の呼び出し */
	protected void callMA_MABCL0900_Upd01() {
		MCCaller caller = createMA_MABCL0900_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0900_Del01]のCallerの作成 */
	protected MABCP_GpReg_MC.MA_MABCL0900_Del01Caller createMA_MABCL0900_Del01() {
		MABCP_GpReg_MC.MA_MABCL0900_Del01Caller<MABCP_GpReg, MA_MABCL0900_Del01Bridge>
		caller = ((MABCP_GpReg_MC)this).new MA_MABCL0900_Del01Caller<MABCP_GpReg, MA_MABCL0900_Del01Bridge>(
					(MABCP_GpReg)this, new MA_MABCL0900_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0900_Del01]の呼び出し */
	protected void callMA_MABCL0900_Del01() {
		MCCaller caller = createMA_MABCL0900_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0900.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0900.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0900.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0900.LclR> aLclAllL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0900.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0900.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0900.CndR createCndR() {
		return mcframe.clientMABC.MABCP0900.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0900.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0900.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0900.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0900.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0900.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0900.DtlR.class);
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
	public void setLclL(MCList<mcframe.clientMABC.MABCP0900.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0900.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0900.LclR createLclR() {
		return mcframe.clientMABC.MABCP0900.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0900.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0900.LclR.class);
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
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0900.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0900.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0900.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0900.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0900.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0900.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getLclAllL()) return "LclAll";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("LclAll")) return getLclAllL();
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
		ret.add(GpGrpPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(LclWrkPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_GpReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_GpReg_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_GpReg_MC.jbCreateScreenOpe((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateGpGrp((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateTop((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateFold((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateCnd((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateCtrl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateDtl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateDtlBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateLclWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateLcl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateLclBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbCreateEastBtn((MABCP_GpReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_GpReg p) {
	}

	/**
	 * [GpGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateGpGrp(MABCP_GpReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_GpReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_GpReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_GpReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_GpReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_GpReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_GpReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_GpReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_GpReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_GpReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_GpReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_GpReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_GpReg p) {
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

	
	/** [Cnd_gp_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gp_grp_cd_p = null;

	/**
	 * [Cnd_gp_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gp_grp_cd_ListPutter() {
		if (Cnd_gp_grp_cd_p == null) {
			Cnd_gp_grp_cd_p = createCnd_gp_grp_cd_ListPutter(Cnd_gp_grp_cd, "gp_grp_cd", "gp_grp_nm");

		}
		return Cnd_gp_grp_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_GpReg create(){
		MABCP_GpReg p = new MABCP_GpReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_GpReg create(String name){
		MABCP_GpReg p = new MABCP_GpReg(name);
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
		MABCP_GpReg_MC.jbfInitScreenOpe((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitGpGrp((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitTop((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitFold((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitCnd((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitCtrl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitDtl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitDtlBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitLclWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitLcl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitLclBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbfInitEastBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitScreenOpe((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitGpGrp((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitTop((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitFold((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitCnd((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitCtrl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitDtl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitDtlBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitLclWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitLcl((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitLclBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.jbInitEastBtn((MABCP_GpReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [GpGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitGpGrp(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.GpGrpPanel = p.beansFactory.createPanel("GpGrp");
		p.GpGrpTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_gp_grp_cd_Label = p.beansFactory.createLabel("Cnd.gp_grp_cd_Label");
		p.Cnd_gp_grp_cd = p.beansFactory.createTextComboBox("Cnd.gp_grp_cd");
		p.Cnd_gp_grp_cd.setLabel(p.Cnd_gp_grp_cd_Label);
		p.Cnd_gp_grp_nm = p.beansFactory.createTextField("Cnd.gp_grp_nm");
		p.Cnd_key1_Label = p.beansFactory.createLabel("Cnd.key1_Label");
		p.Cnd_key1 = p.beansFactory.createTextField("Cnd.key1");
		p.Cnd_key1.setLabel(p.Cnd_key1_Label);
		p.Cnd_key2_Label = p.beansFactory.createLabel("Cnd.key2_Label");
		p.Cnd_key2 = p.beansFactory.createTextField("Cnd.key2");
		p.Cnd_key2.setLabel(p.Cnd_key2_Label);
		p.Cnd_key3_Label = p.beansFactory.createLabel("Cnd.key3_Label");
		p.Cnd_key3 = p.beansFactory.createTextField("Cnd.key3");
		p.Cnd_key3.setLabel(p.Cnd_key3_Label);
		p.Cnd_key4_Label = p.beansFactory.createLabel("Cnd.key4_Label");
		p.Cnd_key4 = p.beansFactory.createTextField("Cnd.key4");
		p.Cnd_key4.setLabel(p.Cnd_key4_Label);
		p.Cnd_key5_Label = p.beansFactory.createLabel("Cnd.key5_Label");
		p.Cnd_key5 = p.beansFactory.createTextField("Cnd.key5");
		p.Cnd_key5.setLabel(p.Cnd_key5_Label);
		p.Cnd_key6_Label = p.beansFactory.createLabel("Cnd.key6_Label");
		p.Cnd_key6 = p.beansFactory.createTextField("Cnd.key6");
		p.Cnd_key6.setLabel(p.Cnd_key6_Label);
		p.Cnd_key7_Label = p.beansFactory.createLabel("Cnd.key7_Label");
		p.Cnd_key7 = p.beansFactory.createTextField("Cnd.key7");
		p.Cnd_key7.setLabel(p.Cnd_key7_Label);
		p.Cnd_key8_Label = p.beansFactory.createLabel("Cnd.key8_Label");
		p.Cnd_key8 = p.beansFactory.createTextField("Cnd.key8");
		p.Cnd_key8.setLabel(p.Cnd_key8_Label);
		p.Cnd_key9_Label = p.beansFactory.createLabel("Cnd.key9_Label");
		p.Cnd_key9 = p.beansFactory.createTextField("Cnd.key9");
		p.Cnd_key9.setLabel(p.Cnd_key9_Label);
		p.Cnd_key10_Label = p.beansFactory.createLabel("Cnd.key10_Label");
		p.Cnd_key10 = p.beansFactory.createTextField("Cnd.key10");
		p.Cnd_key10.setLabel(p.Cnd_key10_Label);
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
	protected static void jbfInitCtrl(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_gp_grp_cd = p.beansFactory.createTableColumn("Dtl.gp_grp_cd", MCColumnType.TEXT);
		p.columnDtl_key1 = p.beansFactory.createTableColumn("Dtl.key1", MCColumnType.TEXT);
		p.columnDtl_key2 = p.beansFactory.createTableColumn("Dtl.key2", MCColumnType.TEXT);
		p.columnDtl_key3 = p.beansFactory.createTableColumn("Dtl.key3", MCColumnType.TEXT);
		p.columnDtl_key4 = p.beansFactory.createTableColumn("Dtl.key4", MCColumnType.TEXT);
		p.columnDtl_key5 = p.beansFactory.createTableColumn("Dtl.key5", MCColumnType.TEXT);
		p.columnDtl_key6 = p.beansFactory.createTableColumn("Dtl.key6", MCColumnType.TEXT);
		p.columnDtl_key7 = p.beansFactory.createTableColumn("Dtl.key7", MCColumnType.TEXT);
		p.columnDtl_key8 = p.beansFactory.createTableColumn("Dtl.key8", MCColumnType.TEXT);
		p.columnDtl_key9 = p.beansFactory.createTableColumn("Dtl.key9", MCColumnType.TEXT);
		p.columnDtl_key10 = p.beansFactory.createTableColumn("Dtl.key10", MCColumnType.TEXT);
		p.columnDtl_char1 = p.beansFactory.createTableColumn("Dtl.char1", MCColumnType.TEXT);
		p.columnDtl_char2 = p.beansFactory.createTableColumn("Dtl.char2", MCColumnType.TEXT);
		p.columnDtl_char3 = p.beansFactory.createTableColumn("Dtl.char3", MCColumnType.TEXT);
		p.columnDtl_char4 = p.beansFactory.createTableColumn("Dtl.char4", MCColumnType.TEXT);
		p.columnDtl_char5 = p.beansFactory.createTableColumn("Dtl.char5", MCColumnType.TEXT);
		p.columnDtl_char6 = p.beansFactory.createTableColumn("Dtl.char6", MCColumnType.TEXT);
		p.columnDtl_char7 = p.beansFactory.createTableColumn("Dtl.char7", MCColumnType.TEXT);
		p.columnDtl_char8 = p.beansFactory.createTableColumn("Dtl.char8", MCColumnType.TEXT);
		p.columnDtl_char9 = p.beansFactory.createTableColumn("Dtl.char9", MCColumnType.TEXT);
		p.columnDtl_char10 = p.beansFactory.createTableColumn("Dtl.char10", MCColumnType.TEXT);
		p.columnDtl_char11 = p.beansFactory.createTableColumn("Dtl.char11", MCColumnType.TEXT);
		p.columnDtl_char12 = p.beansFactory.createTableColumn("Dtl.char12", MCColumnType.TEXT);
		p.columnDtl_char13 = p.beansFactory.createTableColumn("Dtl.char13", MCColumnType.TEXT);
		p.columnDtl_char14 = p.beansFactory.createTableColumn("Dtl.char14", MCColumnType.TEXT);
		p.columnDtl_char15 = p.beansFactory.createTableColumn("Dtl.char15", MCColumnType.TEXT);
		p.columnDtl_char16 = p.beansFactory.createTableColumn("Dtl.char16", MCColumnType.TEXT);
		p.columnDtl_char17 = p.beansFactory.createTableColumn("Dtl.char17", MCColumnType.TEXT);
		p.columnDtl_char18 = p.beansFactory.createTableColumn("Dtl.char18", MCColumnType.TEXT);
		p.columnDtl_char19 = p.beansFactory.createTableColumn("Dtl.char19", MCColumnType.TEXT);
		p.columnDtl_char20 = p.beansFactory.createTableColumn("Dtl.char20", MCColumnType.TEXT);
		p.columnDtl_num1 = p.beansFactory.createTableColumn("Dtl.num1", MCColumnType.NUMBER);
		p.columnDtl_num2 = p.beansFactory.createTableColumn("Dtl.num2", MCColumnType.NUMBER);
		p.columnDtl_num3 = p.beansFactory.createTableColumn("Dtl.num3", MCColumnType.NUMBER);
		p.columnDtl_num4 = p.beansFactory.createTableColumn("Dtl.num4", MCColumnType.NUMBER);
		p.columnDtl_num5 = p.beansFactory.createTableColumn("Dtl.num5", MCColumnType.NUMBER);
		p.columnDtl_num6 = p.beansFactory.createTableColumn("Dtl.num6", MCColumnType.NUMBER);
		p.columnDtl_num7 = p.beansFactory.createTableColumn("Dtl.num7", MCColumnType.NUMBER);
		p.columnDtl_num8 = p.beansFactory.createTableColumn("Dtl.num8", MCColumnType.NUMBER);
		p.columnDtl_num9 = p.beansFactory.createTableColumn("Dtl.num9", MCColumnType.NUMBER);
		p.columnDtl_num10 = p.beansFactory.createTableColumn("Dtl.num10", MCColumnType.NUMBER);
		p.columnDtl_dt1 = p.beansFactory.createTableColumn("Dtl.dt1", MCColumnType.DATE);
		p.columnDtl_dt2 = p.beansFactory.createTableColumn("Dtl.dt2", MCColumnType.DATE);
		p.columnDtl_dt3 = p.beansFactory.createTableColumn("Dtl.dt3", MCColumnType.DATE);
		p.columnDtl_dt4 = p.beansFactory.createTableColumn("Dtl.dt4", MCColumnType.DATE);
		p.columnDtl_dt5 = p.beansFactory.createTableColumn("Dtl.dt5", MCColumnType.DATE);
		p.columnDtl_dt6 = p.beansFactory.createTableColumn("Dtl.dt6", MCColumnType.DATE);
		p.columnDtl_dt7 = p.beansFactory.createTableColumn("Dtl.dt7", MCColumnType.DATE);
		p.columnDtl_dt8 = p.beansFactory.createTableColumn("Dtl.dt8", MCColumnType.DATE);
		p.columnDtl_dt9 = p.beansFactory.createTableColumn("Dtl.dt9", MCColumnType.DATE);
		p.columnDtl_dt10 = p.beansFactory.createTableColumn("Dtl.dt10", MCColumnType.DATE);
		p.columnDtl_flg1 = p.beansFactory.createTableColumn("Dtl.flg1", MCColumnType.CHECK);
		p.columnDtl_flg2 = p.beansFactory.createTableColumn("Dtl.flg2", MCColumnType.CHECK);
		p.columnDtl_flg3 = p.beansFactory.createTableColumn("Dtl.flg3", MCColumnType.CHECK);
		p.columnDtl_flg4 = p.beansFactory.createTableColumn("Dtl.flg4", MCColumnType.CHECK);
		p.columnDtl_flg5 = p.beansFactory.createTableColumn("Dtl.flg5", MCColumnType.CHECK);
		p.columnDtl_flg6 = p.beansFactory.createTableColumn("Dtl.flg6", MCColumnType.CHECK);
		p.columnDtl_flg7 = p.beansFactory.createTableColumn("Dtl.flg7", MCColumnType.CHECK);
		p.columnDtl_flg8 = p.beansFactory.createTableColumn("Dtl.flg8", MCColumnType.CHECK);
		p.columnDtl_flg9 = p.beansFactory.createTableColumn("Dtl.flg9", MCColumnType.CHECK);
		p.columnDtl_flg10 = p.beansFactory.createTableColumn("Dtl.flg10", MCColumnType.CHECK);
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
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_GpReg p) {
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
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_gp_grp_cd = p.beansFactory.createTableColumn("Lcl.gp_grp_cd", MCColumnType.TEXT);
		p.columnLcl_key1 = p.beansFactory.createTableColumn("Lcl.key1", MCColumnType.TEXT);
		p.columnLcl_key2 = p.beansFactory.createTableColumn("Lcl.key2", MCColumnType.TEXT);
		p.columnLcl_key3 = p.beansFactory.createTableColumn("Lcl.key3", MCColumnType.TEXT);
		p.columnLcl_key4 = p.beansFactory.createTableColumn("Lcl.key4", MCColumnType.TEXT);
		p.columnLcl_key5 = p.beansFactory.createTableColumn("Lcl.key5", MCColumnType.TEXT);
		p.columnLcl_key6 = p.beansFactory.createTableColumn("Lcl.key6", MCColumnType.TEXT);
		p.columnLcl_key7 = p.beansFactory.createTableColumn("Lcl.key7", MCColumnType.TEXT);
		p.columnLcl_key8 = p.beansFactory.createTableColumn("Lcl.key8", MCColumnType.TEXT);
		p.columnLcl_key9 = p.beansFactory.createTableColumn("Lcl.key9", MCColumnType.TEXT);
		p.columnLcl_key10 = p.beansFactory.createTableColumn("Lcl.key10", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_char1 = p.beansFactory.createTableColumn("Lcl.char1", MCColumnType.TEXT);
		p.columnLcl_char2 = p.beansFactory.createTableColumn("Lcl.char2", MCColumnType.TEXT);
		p.columnLcl_char3 = p.beansFactory.createTableColumn("Lcl.char3", MCColumnType.TEXT);
		p.columnLcl_char4 = p.beansFactory.createTableColumn("Lcl.char4", MCColumnType.TEXT);
		p.columnLcl_char5 = p.beansFactory.createTableColumn("Lcl.char5", MCColumnType.TEXT);
		p.columnLcl_char6 = p.beansFactory.createTableColumn("Lcl.char6", MCColumnType.TEXT);
		p.columnLcl_char7 = p.beansFactory.createTableColumn("Lcl.char7", MCColumnType.TEXT);
		p.columnLcl_char8 = p.beansFactory.createTableColumn("Lcl.char8", MCColumnType.TEXT);
		p.columnLcl_char9 = p.beansFactory.createTableColumn("Lcl.char9", MCColumnType.TEXT);
		p.columnLcl_char10 = p.beansFactory.createTableColumn("Lcl.char10", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABCP_GpReg p) {
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.GpGrpPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NWW");
		// ブロックの項目の初期化
	}

	/**
	 * [GpGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitGpGrp(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.GpGrpPanel.setBorder(p.GpGrpTitledBorder);
		p.add(p.GpGrpPanel);
		p.GpGrpPanel.setNextBeans(p.TopPanel);
		p.GpGrpPanel.setValueCheck(false);
		p.GpGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.GpGrpPanel.setLayoutPosition("NWC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.WrkPanel);
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
	protected static void jbInitFold(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_GpReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.ope_META);
		p.Cnd_gp_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_gp_grp_cd.setLinkBeans(p.Cnd_gp_grp_nm);
		p.GpGrpPanel.add(p.Cnd_gp_grp_cd_Label);
		p.GpGrpPanel.add(p.Cnd_gp_grp_cd);
		p.GpGrpPanel.setLastBeans(p.Cnd_gp_grp_cd);
		p.Cnd_gp_grp_cd.setNextBeans(p.Cnd_gp_grp_nm);
		p.Cnd_gp_grp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.gp_grp_cd_META);
		p.GpGrpPanel.add(p.Cnd_gp_grp_nm);
		p.Cnd_gp_grp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.gp_grp_nm_META);
		p.CndPanel.add(p.Cnd_key1_Label);
		p.CndPanel.add(p.Cnd_key1);
		p.CndPanel.setLastBeans(p.Cnd_key1);
		p.Cnd_key1.setNextBeans(p.Cnd_key2);
		p.Cnd_key1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key1_META);
		p.setPluralValueEnable(p.Cnd_key1, true);
		p.CndPanel.add(p.Cnd_key2_Label);
		p.CndPanel.add(p.Cnd_key2);
		p.Cnd_key2.setNextBeans(p.Cnd_key3);
		p.Cnd_key2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key2_META);
		p.setPluralValueEnable(p.Cnd_key2, true);
		p.CndPanel.add(p.Cnd_key3_Label);
		p.CndPanel.add(p.Cnd_key3);
		p.Cnd_key3.setNextBeans(p.Cnd_key4);
		p.Cnd_key3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key3_META);
		p.setPluralValueEnable(p.Cnd_key3, true);
		p.CndPanel.add(p.Cnd_key4_Label);
		p.CndPanel.add(p.Cnd_key4);
		p.Cnd_key4.setNextBeans(p.Cnd_key5);
		p.Cnd_key4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key4_META);
		p.setPluralValueEnable(p.Cnd_key4, true);
		p.CndPanel.add(p.Cnd_key5_Label);
		p.CndPanel.add(p.Cnd_key5);
		p.Cnd_key5.setNextBeans(p.Cnd_key6);
		p.Cnd_key5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key5_META);
		p.setPluralValueEnable(p.Cnd_key5, true);
		p.CndPanel.add(p.Cnd_key6_Label);
		p.CndPanel.add(p.Cnd_key6);
		p.Cnd_key6.setNextBeans(p.Cnd_key7);
		p.Cnd_key6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key6_META);
		p.setPluralValueEnable(p.Cnd_key6, true);
		p.CndPanel.add(p.Cnd_key7_Label);
		p.CndPanel.add(p.Cnd_key7);
		p.Cnd_key7.setNextBeans(p.Cnd_key8);
		p.Cnd_key7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key7_META);
		p.setPluralValueEnable(p.Cnd_key7, true);
		p.CndPanel.add(p.Cnd_key8_Label);
		p.CndPanel.add(p.Cnd_key8);
		p.Cnd_key8.setNextBeans(p.Cnd_key9);
		p.Cnd_key8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key8_META);
		p.setPluralValueEnable(p.Cnd_key8, true);
		p.CndPanel.add(p.Cnd_key9_Label);
		p.CndPanel.add(p.Cnd_key9);
		p.Cnd_key9.setNextBeans(p.Cnd_key10);
		p.Cnd_key9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key9_META);
		p.setPluralValueEnable(p.Cnd_key9, true);
		p.CndPanel.add(p.Cnd_key10_Label);
		p.CndPanel.add(p.Cnd_key10);
		p.Cnd_key10.setNextBeans(p.Cnd_memo1);
		p.Cnd_key10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.key10_META);
		p.setPluralValueEnable(p.Cnd_key10, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0900.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LclWrkPanel);
		p.WrkPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WrkPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_GpReg p) {
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
	protected static void jbInitDtlBtn(MABCP_GpReg p) {
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
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.add(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.BtnPanel);
		p.LclWrkPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABCP_GpReg p) {
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
	protected static void jbInitLclBtn(MABCP_GpReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_GpReg p) {
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
	protected static void jbInitEastBtn(MABCP_GpReg p) {
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
		MABCP_GpReg_MC.mcInitScreenOpe((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitGpGrp((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitTop((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitFold((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitCnd((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitCtrl((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitDtl((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitDtlBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitLclWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitLcl((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitLclBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.mcInitEastBtn((MABCP_GpReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_GpReg_MC.statusInitUPD_ScreenOpe((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_GpGrp((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_Top((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_Fold((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_Cnd((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_Ctrl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_Wrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_Dtl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_DtlBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_LclWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_Lcl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_LclAll((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_LclBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_Btn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitUPD_EastBtn((MABCP_GpReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_GpReg_MC.statusInitFIX_ScreenOpe((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_GpGrp((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_Top((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_Fold((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_Cnd((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_Ctrl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_Wrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_Dtl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_DtlBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_LclWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_Lcl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_LclAll((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_LclBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_Btn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitFIX_EastBtn((MABCP_GpReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_GpReg_MC.statusInitDEL_ScreenOpe((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_GpGrp((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_Top((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_Fold((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_Cnd((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_Ctrl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_Wrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_Dtl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_DtlBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_LclWrk((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_Lcl((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_LclAll((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_LclBtn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_Btn((MABCP_GpReg)this);
		MABCP_GpReg_MC.statusInitDEL_EastBtn((MABCP_GpReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_GpReg p) {
	}

	/**
	 *  [GpGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitGpGrp(MABCP_GpReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_GpReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_GpReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_GpReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_gp_grp_cd.setListListener(p);
		p.Cnd_gp_grp_cd.addAllListener(p);
		p.Cnd_gp_grp_nm.setListListener(p);
		p.Cnd_gp_grp_nm.addAllListener(p);
		p.Cnd_key1.setListListener(p);
		p.Cnd_key1.addAllListener(p);
		p.Cnd_key2.setListListener(p);
		p.Cnd_key2.addAllListener(p);
		p.Cnd_key3.setListListener(p);
		p.Cnd_key3.addAllListener(p);
		p.Cnd_key4.setListListener(p);
		p.Cnd_key4.addAllListener(p);
		p.Cnd_key5.setListListener(p);
		p.Cnd_key5.addAllListener(p);
		p.Cnd_key6.setListListener(p);
		p.Cnd_key6.addAllListener(p);
		p.Cnd_key7.setListListener(p);
		p.Cnd_key7.addAllListener(p);
		p.Cnd_key8.setListListener(p);
		p.Cnd_key8.addAllListener(p);
		p.Cnd_key9.setListListener(p);
		p.Cnd_key9.addAllListener(p);
		p.Cnd_key10.setListListener(p);
		p.Cnd_key10.addAllListener(p);
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
	protected static void mcInitCtrl(MABCP_GpReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_GpReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_GpReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_gp_grp_cd.addAllListener(p);
		p.columnDtl_gp_grp_cd.setListListener(p);
		p.columnDtl_key1.addAllListener(p);
		p.columnDtl_key1.setListListener(p);
		p.columnDtl_key2.addAllListener(p);
		p.columnDtl_key2.setListListener(p);
		p.columnDtl_key3.addAllListener(p);
		p.columnDtl_key3.setListListener(p);
		p.columnDtl_key4.addAllListener(p);
		p.columnDtl_key4.setListListener(p);
		p.columnDtl_key5.addAllListener(p);
		p.columnDtl_key5.setListListener(p);
		p.columnDtl_key6.addAllListener(p);
		p.columnDtl_key6.setListListener(p);
		p.columnDtl_key7.addAllListener(p);
		p.columnDtl_key7.setListListener(p);
		p.columnDtl_key8.addAllListener(p);
		p.columnDtl_key8.setListListener(p);
		p.columnDtl_key9.addAllListener(p);
		p.columnDtl_key9.setListListener(p);
		p.columnDtl_key10.addAllListener(p);
		p.columnDtl_key10.setListListener(p);
		p.columnDtl_char1.addAllListener(p);
		p.columnDtl_char1.setListListener(p);
		p.columnDtl_char2.addAllListener(p);
		p.columnDtl_char2.setListListener(p);
		p.columnDtl_char3.addAllListener(p);
		p.columnDtl_char3.setListListener(p);
		p.columnDtl_char4.addAllListener(p);
		p.columnDtl_char4.setListListener(p);
		p.columnDtl_char5.addAllListener(p);
		p.columnDtl_char5.setListListener(p);
		p.columnDtl_char6.addAllListener(p);
		p.columnDtl_char6.setListListener(p);
		p.columnDtl_char7.addAllListener(p);
		p.columnDtl_char7.setListListener(p);
		p.columnDtl_char8.addAllListener(p);
		p.columnDtl_char8.setListListener(p);
		p.columnDtl_char9.addAllListener(p);
		p.columnDtl_char9.setListListener(p);
		p.columnDtl_char10.addAllListener(p);
		p.columnDtl_char10.setListListener(p);
		p.columnDtl_char11.addAllListener(p);
		p.columnDtl_char11.setListListener(p);
		p.columnDtl_char12.addAllListener(p);
		p.columnDtl_char12.setListListener(p);
		p.columnDtl_char13.addAllListener(p);
		p.columnDtl_char13.setListListener(p);
		p.columnDtl_char14.addAllListener(p);
		p.columnDtl_char14.setListListener(p);
		p.columnDtl_char15.addAllListener(p);
		p.columnDtl_char15.setListListener(p);
		p.columnDtl_char16.addAllListener(p);
		p.columnDtl_char16.setListListener(p);
		p.columnDtl_char17.addAllListener(p);
		p.columnDtl_char17.setListListener(p);
		p.columnDtl_char18.addAllListener(p);
		p.columnDtl_char18.setListListener(p);
		p.columnDtl_char19.addAllListener(p);
		p.columnDtl_char19.setListListener(p);
		p.columnDtl_char20.addAllListener(p);
		p.columnDtl_char20.setListListener(p);
		p.columnDtl_num1.addAllListener(p);
		p.columnDtl_num1.setListListener(p);
		p.columnDtl_num2.addAllListener(p);
		p.columnDtl_num2.setListListener(p);
		p.columnDtl_num3.addAllListener(p);
		p.columnDtl_num3.setListListener(p);
		p.columnDtl_num4.addAllListener(p);
		p.columnDtl_num4.setListListener(p);
		p.columnDtl_num5.addAllListener(p);
		p.columnDtl_num5.setListListener(p);
		p.columnDtl_num6.addAllListener(p);
		p.columnDtl_num6.setListListener(p);
		p.columnDtl_num7.addAllListener(p);
		p.columnDtl_num7.setListListener(p);
		p.columnDtl_num8.addAllListener(p);
		p.columnDtl_num8.setListListener(p);
		p.columnDtl_num9.addAllListener(p);
		p.columnDtl_num9.setListListener(p);
		p.columnDtl_num10.addAllListener(p);
		p.columnDtl_num10.setListListener(p);
		p.columnDtl_dt1.addAllListener(p);
		p.columnDtl_dt1.setListListener(p);
		p.columnDtl_dt2.addAllListener(p);
		p.columnDtl_dt2.setListListener(p);
		p.columnDtl_dt3.addAllListener(p);
		p.columnDtl_dt3.setListListener(p);
		p.columnDtl_dt4.addAllListener(p);
		p.columnDtl_dt4.setListListener(p);
		p.columnDtl_dt5.addAllListener(p);
		p.columnDtl_dt5.setListListener(p);
		p.columnDtl_dt6.addAllListener(p);
		p.columnDtl_dt6.setListListener(p);
		p.columnDtl_dt7.addAllListener(p);
		p.columnDtl_dt7.setListListener(p);
		p.columnDtl_dt8.addAllListener(p);
		p.columnDtl_dt8.setListListener(p);
		p.columnDtl_dt9.addAllListener(p);
		p.columnDtl_dt9.setListListener(p);
		p.columnDtl_dt10.addAllListener(p);
		p.columnDtl_dt10.setListListener(p);
		p.columnDtl_flg1.addAllListener(p);
		p.columnDtl_flg2.addAllListener(p);
		p.columnDtl_flg3.addAllListener(p);
		p.columnDtl_flg4.addAllListener(p);
		p.columnDtl_flg5.addAllListener(p);
		p.columnDtl_flg6.addAllListener(p);
		p.columnDtl_flg7.addAllListener(p);
		p.columnDtl_flg8.addAllListener(p);
		p.columnDtl_flg9.addAllListener(p);
		p.columnDtl_flg10.addAllListener(p);
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
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_GpReg p) {
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
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_GpReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_GpReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_gp_grp_cd.addAllListener(p);
		p.columnLcl_gp_grp_cd.setListListener(p);
		p.columnLcl_key1.addAllListener(p);
		p.columnLcl_key1.setListListener(p);
		p.columnLcl_key2.addAllListener(p);
		p.columnLcl_key2.setListListener(p);
		p.columnLcl_key3.addAllListener(p);
		p.columnLcl_key3.setListListener(p);
		p.columnLcl_key4.addAllListener(p);
		p.columnLcl_key4.setListListener(p);
		p.columnLcl_key5.addAllListener(p);
		p.columnLcl_key5.setListListener(p);
		p.columnLcl_key6.addAllListener(p);
		p.columnLcl_key6.setListListener(p);
		p.columnLcl_key7.addAllListener(p);
		p.columnLcl_key7.setListListener(p);
		p.columnLcl_key8.addAllListener(p);
		p.columnLcl_key8.setListListener(p);
		p.columnLcl_key9.addAllListener(p);
		p.columnLcl_key9.setListListener(p);
		p.columnLcl_key10.addAllListener(p);
		p.columnLcl_key10.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_char1.addAllListener(p);
		p.columnLcl_char1.setListListener(p);
		p.columnLcl_char2.addAllListener(p);
		p.columnLcl_char2.setListListener(p);
		p.columnLcl_char3.addAllListener(p);
		p.columnLcl_char3.setListListener(p);
		p.columnLcl_char4.addAllListener(p);
		p.columnLcl_char4.setListListener(p);
		p.columnLcl_char5.addAllListener(p);
		p.columnLcl_char5.setListListener(p);
		p.columnLcl_char6.addAllListener(p);
		p.columnLcl_char6.setListListener(p);
		p.columnLcl_char7.addAllListener(p);
		p.columnLcl_char7.setListListener(p);
		p.columnLcl_char8.addAllListener(p);
		p.columnLcl_char8.setListListener(p);
		p.columnLcl_char9.addAllListener(p);
		p.columnLcl_char9.setListListener(p);
		p.columnLcl_char10.addAllListener(p);
		p.columnLcl_char10.setListListener(p);
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
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABCP_GpReg p) {
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_GpReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_GpReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_GpReg p){

	}

	/**
	 * [UPD]ステータスの[GpGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_GpGrp(MABCP_GpReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_GpReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_GpReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_GpReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_gp_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_gp_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_key1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_key10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_GpReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABCP_GpReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_GpReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_gp_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_key1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_key10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char11.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char12.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char13.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char14.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char15.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char16.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char17.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char18.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char19.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_char20.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_num10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dt10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_flg1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg2.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg3.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg4.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg5.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg6.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg7.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg8.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg9.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_flg10.putMode(p, UPD, MCMode.REQUIRED);
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
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_GpReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_GpReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_GpReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_gp_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key5.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key6.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key7.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key8.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key9.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_key10.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char4.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char5.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char6.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char7.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char8.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char9.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_char10.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABCP_GpReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_GpReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_GpReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[GpGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX_GpGrp(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_GpReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_gp_grp_cd.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_gp_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_key1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_key10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_GpReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_gp_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_key1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_key10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_char20.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_num10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dt10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_flg10.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_GpReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_GpReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_gp_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key5.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key6.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key7.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key8.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key9.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_key10.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_char10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_GpReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_GpReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_GpReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[GpGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_GpGrp(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_GpReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_gp_grp_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_gp_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_key1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_key10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_GpReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gp_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_key1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_key10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char11.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char12.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char13.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char14.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char15.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char16.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char17.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char18.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char19.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_char20.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_num10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dt10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_flg10.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_GpReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_GpReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_gp_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key4.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key5.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key6.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key7.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key8.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key9.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_key10.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_char10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABCP_GpReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_GpReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_GpReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_GpReg p){

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
		MABCP_GpReg_MC.setTableConfigDtl((MABCP_GpReg)this);
		MABCP_GpReg_MC.setTableConfigLcl((MABCP_GpReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_GpReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0900.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0900.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_gp_grp_cd.setMeta(mcframe.clientMABC.MABCP0900.DtlR.gp_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gp_grp_cd);
		p.columnDtl_key1.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key1);
		p.columnDtl_key2.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key2);
		p.columnDtl_key3.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key3);
		p.columnDtl_key4.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key4);
		p.columnDtl_key5.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key5);
		p.columnDtl_key6.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key6);
		p.columnDtl_key7.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key7);
		p.columnDtl_key8.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key8);
		p.columnDtl_key9.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key9);
		p.columnDtl_key10.setMeta(mcframe.clientMABC.MABCP0900.DtlR.key10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_key10);
		p.columnDtl_char1.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char1);
		p.columnDtl_char2.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char2);
		p.columnDtl_char3.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char3);
		p.columnDtl_char4.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char4);
		p.columnDtl_char5.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char5);
		p.columnDtl_char6.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char6);
		p.columnDtl_char7.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char7);
		p.columnDtl_char8.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char8);
		p.columnDtl_char9.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char9);
		p.columnDtl_char10.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char10);
		p.columnDtl_char11.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char11_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char11);
		p.columnDtl_char12.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char12_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char12);
		p.columnDtl_char13.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char13_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char13);
		p.columnDtl_char14.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char14_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char14);
		p.columnDtl_char15.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char15_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char15);
		p.columnDtl_char16.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char16_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char16);
		p.columnDtl_char17.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char17_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char17);
		p.columnDtl_char18.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char18_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char18);
		p.columnDtl_char19.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char19_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char19);
		p.columnDtl_char20.setMeta(mcframe.clientMABC.MABCP0900.DtlR.char20_META);
		p.DtlTable.addColumnConfig(p.columnDtl_char20);
		p.columnDtl_num1.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num1_META);
		p.columnDtl_num1.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num1);
		p.columnDtl_num2.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num2_META);
		p.columnDtl_num2.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num2);
		p.columnDtl_num3.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num3_META);
		p.columnDtl_num3.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num3);
		p.columnDtl_num4.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num4_META);
		p.columnDtl_num4.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num4);
		p.columnDtl_num5.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num5_META);
		p.columnDtl_num5.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num5);
		p.columnDtl_num6.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num6_META);
		p.columnDtl_num6.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num6);
		p.columnDtl_num7.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num7_META);
		p.columnDtl_num7.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num7);
		p.columnDtl_num8.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num8_META);
		p.columnDtl_num8.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num8);
		p.columnDtl_num9.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num9_META);
		p.columnDtl_num9.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num9);
		p.columnDtl_num10.setMeta(mcframe.clientMABC.MABCP0900.DtlR.num10_META);
		p.columnDtl_num10.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_num10);
		p.columnDtl_dt1.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt1_META);
		p.columnDtl_dt1.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt1);
		p.columnDtl_dt2.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt2_META);
		p.columnDtl_dt2.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt2);
		p.columnDtl_dt3.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt3_META);
		p.columnDtl_dt3.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt3);
		p.columnDtl_dt4.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt4_META);
		p.columnDtl_dt4.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt4);
		p.columnDtl_dt5.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt5_META);
		p.columnDtl_dt5.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt5);
		p.columnDtl_dt6.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt6_META);
		p.columnDtl_dt6.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt6);
		p.columnDtl_dt7.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt7_META);
		p.columnDtl_dt7.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt7);
		p.columnDtl_dt8.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt8_META);
		p.columnDtl_dt8.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt8);
		p.columnDtl_dt9.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt9_META);
		p.columnDtl_dt9.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt9);
		p.columnDtl_dt10.setMeta(mcframe.clientMABC.MABCP0900.DtlR.dt10_META);
		p.columnDtl_dt10.setFormatID("YMD");
		p.DtlTable.addColumnConfig(p.columnDtl_dt10);
		p.columnDtl_flg1.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg1);
		p.columnDtl_flg2.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg2);
		p.columnDtl_flg3.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg3);
		p.columnDtl_flg4.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg4);
		p.columnDtl_flg5.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg5);
		p.columnDtl_flg6.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg6);
		p.columnDtl_flg7.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg7);
		p.columnDtl_flg8.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg8);
		p.columnDtl_flg9.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg9);
		p.columnDtl_flg10.setMeta(mcframe.clientMABC.MABCP0900.DtlR.flg10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_flg10);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0900.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0900.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0900.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0900.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0900.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0900.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0900.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0900.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0900.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0900.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0900.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0900.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0900.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0900.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0900.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0900.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0900.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0900.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_GpReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0900.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_gp_grp_cd.setMeta(mcframe.clientMABC.MABCP0900.LclR.gp_grp_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_gp_grp_cd);
		p.columnLcl_key1.setMeta(mcframe.clientMABC.MABCP0900.LclR.key1_META);
		p.LclTable.addColumnConfig(p.columnLcl_key1);
		p.columnLcl_key2.setMeta(mcframe.clientMABC.MABCP0900.LclR.key2_META);
		p.LclTable.addColumnConfig(p.columnLcl_key2);
		p.columnLcl_key3.setMeta(mcframe.clientMABC.MABCP0900.LclR.key3_META);
		p.LclTable.addColumnConfig(p.columnLcl_key3);
		p.columnLcl_key4.setMeta(mcframe.clientMABC.MABCP0900.LclR.key4_META);
		p.LclTable.addColumnConfig(p.columnLcl_key4);
		p.columnLcl_key5.setMeta(mcframe.clientMABC.MABCP0900.LclR.key5_META);
		p.LclTable.addColumnConfig(p.columnLcl_key5);
		p.columnLcl_key6.setMeta(mcframe.clientMABC.MABCP0900.LclR.key6_META);
		p.LclTable.addColumnConfig(p.columnLcl_key6);
		p.columnLcl_key7.setMeta(mcframe.clientMABC.MABCP0900.LclR.key7_META);
		p.LclTable.addColumnConfig(p.columnLcl_key7);
		p.columnLcl_key8.setMeta(mcframe.clientMABC.MABCP0900.LclR.key8_META);
		p.LclTable.addColumnConfig(p.columnLcl_key8);
		p.columnLcl_key9.setMeta(mcframe.clientMABC.MABCP0900.LclR.key9_META);
		p.LclTable.addColumnConfig(p.columnLcl_key9);
		p.columnLcl_key10.setMeta(mcframe.clientMABC.MABCP0900.LclR.key10_META);
		p.LclTable.addColumnConfig(p.columnLcl_key10);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0900.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0900.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_char1.setMeta(mcframe.clientMABC.MABCP0900.LclR.char1_META);
		p.LclTable.addColumnConfig(p.columnLcl_char1);
		p.columnLcl_char2.setMeta(mcframe.clientMABC.MABCP0900.LclR.char2_META);
		p.LclTable.addColumnConfig(p.columnLcl_char2);
		p.columnLcl_char3.setMeta(mcframe.clientMABC.MABCP0900.LclR.char3_META);
		p.LclTable.addColumnConfig(p.columnLcl_char3);
		p.columnLcl_char4.setMeta(mcframe.clientMABC.MABCP0900.LclR.char4_META);
		p.LclTable.addColumnConfig(p.columnLcl_char4);
		p.columnLcl_char5.setMeta(mcframe.clientMABC.MABCP0900.LclR.char5_META);
		p.LclTable.addColumnConfig(p.columnLcl_char5);
		p.columnLcl_char6.setMeta(mcframe.clientMABC.MABCP0900.LclR.char6_META);
		p.LclTable.addColumnConfig(p.columnLcl_char6);
		p.columnLcl_char7.setMeta(mcframe.clientMABC.MABCP0900.LclR.char7_META);
		p.LclTable.addColumnConfig(p.columnLcl_char7);
		p.columnLcl_char8.setMeta(mcframe.clientMABC.MABCP0900.LclR.char8_META);
		p.LclTable.addColumnConfig(p.columnLcl_char8);
		p.columnLcl_char9.setMeta(mcframe.clientMABC.MABCP0900.LclR.char9_META);
		p.LclTable.addColumnConfig(p.columnLcl_char9);
		p.columnLcl_char10.setMeta(mcframe.clientMABC.MABCP0900.LclR.char10_META);
		p.LclTable.addColumnConfig(p.columnLcl_char10);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0900.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0900.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0900.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0900.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0900.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0900.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0900.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0900.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0900.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0900.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0900.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0900.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0900.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0900.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0900.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_gp_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gp_grp_cd.getListConfig().setPutter(getCnd_gp_grp_cd_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
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
	 * [Cnd_gp_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gp_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.GpGrp");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_gp_grp_cd) return getCnd_gp_grp_cd(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
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
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_gp_grp_cd) return doCnd_gp_grp_cd_VC(info);
		if (vc == Cnd_gp_grp_nm) return doCnd_gp_grp_nm_VC(info);
		if (vc == Cnd_key1) return doCnd_key1_VC(info);
		if (vc == Cnd_key2) return doCnd_key2_VC(info);
		if (vc == Cnd_key3) return doCnd_key3_VC(info);
		if (vc == Cnd_key4) return doCnd_key4_VC(info);
		if (vc == Cnd_key5) return doCnd_key5_VC(info);
		if (vc == Cnd_key6) return doCnd_key6_VC(info);
		if (vc == Cnd_key7) return doCnd_key7_VC(info);
		if (vc == Cnd_key8) return doCnd_key8_VC(info);
		if (vc == Cnd_key9) return doCnd_key9_VC(info);
		if (vc == Cnd_key10) return doCnd_key10_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_gp_grp_cd) return doDtl_gp_grp_cd_VC(info);
		if (vc == columnDtl_key1) return doDtl_key1_VC(info);
		if (vc == columnDtl_key2) return doDtl_key2_VC(info);
		if (vc == columnDtl_key3) return doDtl_key3_VC(info);
		if (vc == columnDtl_key4) return doDtl_key4_VC(info);
		if (vc == columnDtl_key5) return doDtl_key5_VC(info);
		if (vc == columnDtl_key6) return doDtl_key6_VC(info);
		if (vc == columnDtl_key7) return doDtl_key7_VC(info);
		if (vc == columnDtl_key8) return doDtl_key8_VC(info);
		if (vc == columnDtl_key9) return doDtl_key9_VC(info);
		if (vc == columnDtl_key10) return doDtl_key10_VC(info);
		if (vc == columnDtl_char1) return doDtl_char1_VC(info);
		if (vc == columnDtl_char2) return doDtl_char2_VC(info);
		if (vc == columnDtl_char3) return doDtl_char3_VC(info);
		if (vc == columnDtl_char4) return doDtl_char4_VC(info);
		if (vc == columnDtl_char5) return doDtl_char5_VC(info);
		if (vc == columnDtl_char6) return doDtl_char6_VC(info);
		if (vc == columnDtl_char7) return doDtl_char7_VC(info);
		if (vc == columnDtl_char8) return doDtl_char8_VC(info);
		if (vc == columnDtl_char9) return doDtl_char9_VC(info);
		if (vc == columnDtl_char10) return doDtl_char10_VC(info);
		if (vc == columnDtl_char11) return doDtl_char11_VC(info);
		if (vc == columnDtl_char12) return doDtl_char12_VC(info);
		if (vc == columnDtl_char13) return doDtl_char13_VC(info);
		if (vc == columnDtl_char14) return doDtl_char14_VC(info);
		if (vc == columnDtl_char15) return doDtl_char15_VC(info);
		if (vc == columnDtl_char16) return doDtl_char16_VC(info);
		if (vc == columnDtl_char17) return doDtl_char17_VC(info);
		if (vc == columnDtl_char18) return doDtl_char18_VC(info);
		if (vc == columnDtl_char19) return doDtl_char19_VC(info);
		if (vc == columnDtl_char20) return doDtl_char20_VC(info);
		if (vc == columnDtl_num1) return doDtl_num1_VC(info);
		if (vc == columnDtl_num2) return doDtl_num2_VC(info);
		if (vc == columnDtl_num3) return doDtl_num3_VC(info);
		if (vc == columnDtl_num4) return doDtl_num4_VC(info);
		if (vc == columnDtl_num5) return doDtl_num5_VC(info);
		if (vc == columnDtl_num6) return doDtl_num6_VC(info);
		if (vc == columnDtl_num7) return doDtl_num7_VC(info);
		if (vc == columnDtl_num8) return doDtl_num8_VC(info);
		if (vc == columnDtl_num9) return doDtl_num9_VC(info);
		if (vc == columnDtl_num10) return doDtl_num10_VC(info);
		if (vc == columnDtl_dt1) return doDtl_dt1_VC(info);
		if (vc == columnDtl_dt2) return doDtl_dt2_VC(info);
		if (vc == columnDtl_dt3) return doDtl_dt3_VC(info);
		if (vc == columnDtl_dt4) return doDtl_dt4_VC(info);
		if (vc == columnDtl_dt5) return doDtl_dt5_VC(info);
		if (vc == columnDtl_dt6) return doDtl_dt6_VC(info);
		if (vc == columnDtl_dt7) return doDtl_dt7_VC(info);
		if (vc == columnDtl_dt8) return doDtl_dt8_VC(info);
		if (vc == columnDtl_dt9) return doDtl_dt9_VC(info);
		if (vc == columnDtl_dt10) return doDtl_dt10_VC(info);
		if (vc == columnDtl_flg1) return doDtl_flg1_VC(info);
		if (vc == columnDtl_flg2) return doDtl_flg2_VC(info);
		if (vc == columnDtl_flg3) return doDtl_flg3_VC(info);
		if (vc == columnDtl_flg4) return doDtl_flg4_VC(info);
		if (vc == columnDtl_flg5) return doDtl_flg5_VC(info);
		if (vc == columnDtl_flg6) return doDtl_flg6_VC(info);
		if (vc == columnDtl_flg7) return doDtl_flg7_VC(info);
		if (vc == columnDtl_flg8) return doDtl_flg8_VC(info);
		if (vc == columnDtl_flg9) return doDtl_flg9_VC(info);
		if (vc == columnDtl_flg10) return doDtl_flg10_VC(info);
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
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_gp_grp_cd) return doLcl_gp_grp_cd_VC(info);
		if (vc == columnLcl_key1) return doLcl_key1_VC(info);
		if (vc == columnLcl_key2) return doLcl_key2_VC(info);
		if (vc == columnLcl_key3) return doLcl_key3_VC(info);
		if (vc == columnLcl_key4) return doLcl_key4_VC(info);
		if (vc == columnLcl_key5) return doLcl_key5_VC(info);
		if (vc == columnLcl_key6) return doLcl_key6_VC(info);
		if (vc == columnLcl_key7) return doLcl_key7_VC(info);
		if (vc == columnLcl_key8) return doLcl_key8_VC(info);
		if (vc == columnLcl_key9) return doLcl_key9_VC(info);
		if (vc == columnLcl_key10) return doLcl_key10_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_char1) return doLcl_char1_VC(info);
		if (vc == columnLcl_char2) return doLcl_char2_VC(info);
		if (vc == columnLcl_char3) return doLcl_char3_VC(info);
		if (vc == columnLcl_char4) return doLcl_char4_VC(info);
		if (vc == columnLcl_char5) return doLcl_char5_VC(info);
		if (vc == columnLcl_char6) return doLcl_char6_VC(info);
		if (vc == columnLcl_char7) return doLcl_char7_VC(info);
		if (vc == columnLcl_char8) return doLcl_char8_VC(info);
		if (vc == columnLcl_char9) return doLcl_char9_VC(info);
		if (vc == columnLcl_char10) return doLcl_char10_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
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
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[gp_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gp_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gp_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gp_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key10_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[gp_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gp_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_key10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[char20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_char20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[num10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_num10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_flg10_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[gp_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_gp_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_key10_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[char10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_char10_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_gp_grp_cd) doCnd_gp_grp_cd_NC(info);
		else if (nc == Cnd_gp_grp_nm) doCnd_gp_grp_nm_NC(info);
		else if (nc == Cnd_key1) doCnd_key1_NC(info);
		else if (nc == Cnd_key2) doCnd_key2_NC(info);
		else if (nc == Cnd_key3) doCnd_key3_NC(info);
		else if (nc == Cnd_key4) doCnd_key4_NC(info);
		else if (nc == Cnd_key5) doCnd_key5_NC(info);
		else if (nc == Cnd_key6) doCnd_key6_NC(info);
		else if (nc == Cnd_key7) doCnd_key7_NC(info);
		else if (nc == Cnd_key8) doCnd_key8_NC(info);
		else if (nc == Cnd_key9) doCnd_key9_NC(info);
		else if (nc == Cnd_key10) doCnd_key10_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_gp_grp_cd) doDtl_gp_grp_cd_NC(info);
		else if (nc == columnDtl_key1) doDtl_key1_NC(info);
		else if (nc == columnDtl_key2) doDtl_key2_NC(info);
		else if (nc == columnDtl_key3) doDtl_key3_NC(info);
		else if (nc == columnDtl_key4) doDtl_key4_NC(info);
		else if (nc == columnDtl_key5) doDtl_key5_NC(info);
		else if (nc == columnDtl_key6) doDtl_key6_NC(info);
		else if (nc == columnDtl_key7) doDtl_key7_NC(info);
		else if (nc == columnDtl_key8) doDtl_key8_NC(info);
		else if (nc == columnDtl_key9) doDtl_key9_NC(info);
		else if (nc == columnDtl_key10) doDtl_key10_NC(info);
		else if (nc == columnDtl_char1) doDtl_char1_NC(info);
		else if (nc == columnDtl_char2) doDtl_char2_NC(info);
		else if (nc == columnDtl_char3) doDtl_char3_NC(info);
		else if (nc == columnDtl_char4) doDtl_char4_NC(info);
		else if (nc == columnDtl_char5) doDtl_char5_NC(info);
		else if (nc == columnDtl_char6) doDtl_char6_NC(info);
		else if (nc == columnDtl_char7) doDtl_char7_NC(info);
		else if (nc == columnDtl_char8) doDtl_char8_NC(info);
		else if (nc == columnDtl_char9) doDtl_char9_NC(info);
		else if (nc == columnDtl_char10) doDtl_char10_NC(info);
		else if (nc == columnDtl_char11) doDtl_char11_NC(info);
		else if (nc == columnDtl_char12) doDtl_char12_NC(info);
		else if (nc == columnDtl_char13) doDtl_char13_NC(info);
		else if (nc == columnDtl_char14) doDtl_char14_NC(info);
		else if (nc == columnDtl_char15) doDtl_char15_NC(info);
		else if (nc == columnDtl_char16) doDtl_char16_NC(info);
		else if (nc == columnDtl_char17) doDtl_char17_NC(info);
		else if (nc == columnDtl_char18) doDtl_char18_NC(info);
		else if (nc == columnDtl_char19) doDtl_char19_NC(info);
		else if (nc == columnDtl_char20) doDtl_char20_NC(info);
		else if (nc == columnDtl_num1) doDtl_num1_NC(info);
		else if (nc == columnDtl_num2) doDtl_num2_NC(info);
		else if (nc == columnDtl_num3) doDtl_num3_NC(info);
		else if (nc == columnDtl_num4) doDtl_num4_NC(info);
		else if (nc == columnDtl_num5) doDtl_num5_NC(info);
		else if (nc == columnDtl_num6) doDtl_num6_NC(info);
		else if (nc == columnDtl_num7) doDtl_num7_NC(info);
		else if (nc == columnDtl_num8) doDtl_num8_NC(info);
		else if (nc == columnDtl_num9) doDtl_num9_NC(info);
		else if (nc == columnDtl_num10) doDtl_num10_NC(info);
		else if (nc == columnDtl_dt1) doDtl_dt1_NC(info);
		else if (nc == columnDtl_dt2) doDtl_dt2_NC(info);
		else if (nc == columnDtl_dt3) doDtl_dt3_NC(info);
		else if (nc == columnDtl_dt4) doDtl_dt4_NC(info);
		else if (nc == columnDtl_dt5) doDtl_dt5_NC(info);
		else if (nc == columnDtl_dt6) doDtl_dt6_NC(info);
		else if (nc == columnDtl_dt7) doDtl_dt7_NC(info);
		else if (nc == columnDtl_dt8) doDtl_dt8_NC(info);
		else if (nc == columnDtl_dt9) doDtl_dt9_NC(info);
		else if (nc == columnDtl_dt10) doDtl_dt10_NC(info);
		else if (nc == columnDtl_flg1) doDtl_flg1_NC(info);
		else if (nc == columnDtl_flg2) doDtl_flg2_NC(info);
		else if (nc == columnDtl_flg3) doDtl_flg3_NC(info);
		else if (nc == columnDtl_flg4) doDtl_flg4_NC(info);
		else if (nc == columnDtl_flg5) doDtl_flg5_NC(info);
		else if (nc == columnDtl_flg6) doDtl_flg6_NC(info);
		else if (nc == columnDtl_flg7) doDtl_flg7_NC(info);
		else if (nc == columnDtl_flg8) doDtl_flg8_NC(info);
		else if (nc == columnDtl_flg9) doDtl_flg9_NC(info);
		else if (nc == columnDtl_flg10) doDtl_flg10_NC(info);
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
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_gp_grp_cd) doLcl_gp_grp_cd_NC(info);
		else if (nc == columnLcl_key1) doLcl_key1_NC(info);
		else if (nc == columnLcl_key2) doLcl_key2_NC(info);
		else if (nc == columnLcl_key3) doLcl_key3_NC(info);
		else if (nc == columnLcl_key4) doLcl_key4_NC(info);
		else if (nc == columnLcl_key5) doLcl_key5_NC(info);
		else if (nc == columnLcl_key6) doLcl_key6_NC(info);
		else if (nc == columnLcl_key7) doLcl_key7_NC(info);
		else if (nc == columnLcl_key8) doLcl_key8_NC(info);
		else if (nc == columnLcl_key9) doLcl_key9_NC(info);
		else if (nc == columnLcl_key10) doLcl_key10_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_char1) doLcl_char1_NC(info);
		else if (nc == columnLcl_char2) doLcl_char2_NC(info);
		else if (nc == columnLcl_char3) doLcl_char3_NC(info);
		else if (nc == columnLcl_char4) doLcl_char4_NC(info);
		else if (nc == columnLcl_char5) doLcl_char5_NC(info);
		else if (nc == columnLcl_char6) doLcl_char6_NC(info);
		else if (nc == columnLcl_char7) doLcl_char7_NC(info);
		else if (nc == columnLcl_char8) doLcl_char8_NC(info);
		else if (nc == columnLcl_char9) doLcl_char9_NC(info);
		else if (nc == columnLcl_char10) doLcl_char10_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key10_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[gp_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gp_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char11_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char12_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char13_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char14_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char15_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char16_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char17_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char18_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char19_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char20_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg10_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[gp_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_gp_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key4_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key5_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key6_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key7_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key8_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key9_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key10_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char4_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char5_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char6_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char7_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char8_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char9_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char10_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_gp_grp_cd) doCnd_gp_grp_cd_NE(info);
		else if (ne == Cnd_gp_grp_nm) doCnd_gp_grp_nm_NE(info);
		else if (ne == Cnd_key1) doCnd_key1_NE(info);
		else if (ne == Cnd_key2) doCnd_key2_NE(info);
		else if (ne == Cnd_key3) doCnd_key3_NE(info);
		else if (ne == Cnd_key4) doCnd_key4_NE(info);
		else if (ne == Cnd_key5) doCnd_key5_NE(info);
		else if (ne == Cnd_key6) doCnd_key6_NE(info);
		else if (ne == Cnd_key7) doCnd_key7_NE(info);
		else if (ne == Cnd_key8) doCnd_key8_NE(info);
		else if (ne == Cnd_key9) doCnd_key9_NE(info);
		else if (ne == Cnd_key10) doCnd_key10_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_gp_grp_cd) doDtl_gp_grp_cd_NE(info);
		else if (ne == columnDtl_key1) doDtl_key1_NE(info);
		else if (ne == columnDtl_key2) doDtl_key2_NE(info);
		else if (ne == columnDtl_key3) doDtl_key3_NE(info);
		else if (ne == columnDtl_key4) doDtl_key4_NE(info);
		else if (ne == columnDtl_key5) doDtl_key5_NE(info);
		else if (ne == columnDtl_key6) doDtl_key6_NE(info);
		else if (ne == columnDtl_key7) doDtl_key7_NE(info);
		else if (ne == columnDtl_key8) doDtl_key8_NE(info);
		else if (ne == columnDtl_key9) doDtl_key9_NE(info);
		else if (ne == columnDtl_key10) doDtl_key10_NE(info);
		else if (ne == columnDtl_char1) doDtl_char1_NE(info);
		else if (ne == columnDtl_char2) doDtl_char2_NE(info);
		else if (ne == columnDtl_char3) doDtl_char3_NE(info);
		else if (ne == columnDtl_char4) doDtl_char4_NE(info);
		else if (ne == columnDtl_char5) doDtl_char5_NE(info);
		else if (ne == columnDtl_char6) doDtl_char6_NE(info);
		else if (ne == columnDtl_char7) doDtl_char7_NE(info);
		else if (ne == columnDtl_char8) doDtl_char8_NE(info);
		else if (ne == columnDtl_char9) doDtl_char9_NE(info);
		else if (ne == columnDtl_char10) doDtl_char10_NE(info);
		else if (ne == columnDtl_char11) doDtl_char11_NE(info);
		else if (ne == columnDtl_char12) doDtl_char12_NE(info);
		else if (ne == columnDtl_char13) doDtl_char13_NE(info);
		else if (ne == columnDtl_char14) doDtl_char14_NE(info);
		else if (ne == columnDtl_char15) doDtl_char15_NE(info);
		else if (ne == columnDtl_char16) doDtl_char16_NE(info);
		else if (ne == columnDtl_char17) doDtl_char17_NE(info);
		else if (ne == columnDtl_char18) doDtl_char18_NE(info);
		else if (ne == columnDtl_char19) doDtl_char19_NE(info);
		else if (ne == columnDtl_char20) doDtl_char20_NE(info);
		else if (ne == columnDtl_num1) doDtl_num1_NE(info);
		else if (ne == columnDtl_num2) doDtl_num2_NE(info);
		else if (ne == columnDtl_num3) doDtl_num3_NE(info);
		else if (ne == columnDtl_num4) doDtl_num4_NE(info);
		else if (ne == columnDtl_num5) doDtl_num5_NE(info);
		else if (ne == columnDtl_num6) doDtl_num6_NE(info);
		else if (ne == columnDtl_num7) doDtl_num7_NE(info);
		else if (ne == columnDtl_num8) doDtl_num8_NE(info);
		else if (ne == columnDtl_num9) doDtl_num9_NE(info);
		else if (ne == columnDtl_num10) doDtl_num10_NE(info);
		else if (ne == columnDtl_dt1) doDtl_dt1_NE(info);
		else if (ne == columnDtl_dt2) doDtl_dt2_NE(info);
		else if (ne == columnDtl_dt3) doDtl_dt3_NE(info);
		else if (ne == columnDtl_dt4) doDtl_dt4_NE(info);
		else if (ne == columnDtl_dt5) doDtl_dt5_NE(info);
		else if (ne == columnDtl_dt6) doDtl_dt6_NE(info);
		else if (ne == columnDtl_dt7) doDtl_dt7_NE(info);
		else if (ne == columnDtl_dt8) doDtl_dt8_NE(info);
		else if (ne == columnDtl_dt9) doDtl_dt9_NE(info);
		else if (ne == columnDtl_dt10) doDtl_dt10_NE(info);
		else if (ne == columnDtl_flg1) doDtl_flg1_NE(info);
		else if (ne == columnDtl_flg2) doDtl_flg2_NE(info);
		else if (ne == columnDtl_flg3) doDtl_flg3_NE(info);
		else if (ne == columnDtl_flg4) doDtl_flg4_NE(info);
		else if (ne == columnDtl_flg5) doDtl_flg5_NE(info);
		else if (ne == columnDtl_flg6) doDtl_flg6_NE(info);
		else if (ne == columnDtl_flg7) doDtl_flg7_NE(info);
		else if (ne == columnDtl_flg8) doDtl_flg8_NE(info);
		else if (ne == columnDtl_flg9) doDtl_flg9_NE(info);
		else if (ne == columnDtl_flg10) doDtl_flg10_NE(info);
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
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_gp_grp_cd) doLcl_gp_grp_cd_NE(info);
		else if (ne == columnLcl_key1) doLcl_key1_NE(info);
		else if (ne == columnLcl_key2) doLcl_key2_NE(info);
		else if (ne == columnLcl_key3) doLcl_key3_NE(info);
		else if (ne == columnLcl_key4) doLcl_key4_NE(info);
		else if (ne == columnLcl_key5) doLcl_key5_NE(info);
		else if (ne == columnLcl_key6) doLcl_key6_NE(info);
		else if (ne == columnLcl_key7) doLcl_key7_NE(info);
		else if (ne == columnLcl_key8) doLcl_key8_NE(info);
		else if (ne == columnLcl_key9) doLcl_key9_NE(info);
		else if (ne == columnLcl_key10) doLcl_key10_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_char1) doLcl_char1_NE(info);
		else if (ne == columnLcl_char2) doLcl_char2_NE(info);
		else if (ne == columnLcl_char3) doLcl_char3_NE(info);
		else if (ne == columnLcl_char4) doLcl_char4_NE(info);
		else if (ne == columnLcl_char5) doLcl_char5_NE(info);
		else if (ne == columnLcl_char6) doLcl_char6_NE(info);
		else if (ne == columnLcl_char7) doLcl_char7_NE(info);
		else if (ne == columnLcl_char8) doLcl_char8_NE(info);
		else if (ne == columnLcl_char9) doLcl_char9_NE(info);
		else if (ne == columnLcl_char10) doLcl_char10_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key10_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[gp_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gp_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char11_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char12_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char13_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char14_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char15_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char16_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char17_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char18_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char19_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char20_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg10_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[gp_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_gp_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key4_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key5_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key6_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key7_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key8_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key9_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key10_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char4_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char5_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char6_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char7_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char8_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char9_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char10_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_gp_grp_cd) doCnd_gp_grp_cd_NX(info);
		else if (nx == Cnd_gp_grp_nm) doCnd_gp_grp_nm_NX(info);
		else if (nx == Cnd_key1) doCnd_key1_NX(info);
		else if (nx == Cnd_key2) doCnd_key2_NX(info);
		else if (nx == Cnd_key3) doCnd_key3_NX(info);
		else if (nx == Cnd_key4) doCnd_key4_NX(info);
		else if (nx == Cnd_key5) doCnd_key5_NX(info);
		else if (nx == Cnd_key6) doCnd_key6_NX(info);
		else if (nx == Cnd_key7) doCnd_key7_NX(info);
		else if (nx == Cnd_key8) doCnd_key8_NX(info);
		else if (nx == Cnd_key9) doCnd_key9_NX(info);
		else if (nx == Cnd_key10) doCnd_key10_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_gp_grp_cd) doDtl_gp_grp_cd_NX(info);
		else if (nx == columnDtl_key1) doDtl_key1_NX(info);
		else if (nx == columnDtl_key2) doDtl_key2_NX(info);
		else if (nx == columnDtl_key3) doDtl_key3_NX(info);
		else if (nx == columnDtl_key4) doDtl_key4_NX(info);
		else if (nx == columnDtl_key5) doDtl_key5_NX(info);
		else if (nx == columnDtl_key6) doDtl_key6_NX(info);
		else if (nx == columnDtl_key7) doDtl_key7_NX(info);
		else if (nx == columnDtl_key8) doDtl_key8_NX(info);
		else if (nx == columnDtl_key9) doDtl_key9_NX(info);
		else if (nx == columnDtl_key10) doDtl_key10_NX(info);
		else if (nx == columnDtl_char1) doDtl_char1_NX(info);
		else if (nx == columnDtl_char2) doDtl_char2_NX(info);
		else if (nx == columnDtl_char3) doDtl_char3_NX(info);
		else if (nx == columnDtl_char4) doDtl_char4_NX(info);
		else if (nx == columnDtl_char5) doDtl_char5_NX(info);
		else if (nx == columnDtl_char6) doDtl_char6_NX(info);
		else if (nx == columnDtl_char7) doDtl_char7_NX(info);
		else if (nx == columnDtl_char8) doDtl_char8_NX(info);
		else if (nx == columnDtl_char9) doDtl_char9_NX(info);
		else if (nx == columnDtl_char10) doDtl_char10_NX(info);
		else if (nx == columnDtl_char11) doDtl_char11_NX(info);
		else if (nx == columnDtl_char12) doDtl_char12_NX(info);
		else if (nx == columnDtl_char13) doDtl_char13_NX(info);
		else if (nx == columnDtl_char14) doDtl_char14_NX(info);
		else if (nx == columnDtl_char15) doDtl_char15_NX(info);
		else if (nx == columnDtl_char16) doDtl_char16_NX(info);
		else if (nx == columnDtl_char17) doDtl_char17_NX(info);
		else if (nx == columnDtl_char18) doDtl_char18_NX(info);
		else if (nx == columnDtl_char19) doDtl_char19_NX(info);
		else if (nx == columnDtl_char20) doDtl_char20_NX(info);
		else if (nx == columnDtl_num1) doDtl_num1_NX(info);
		else if (nx == columnDtl_num2) doDtl_num2_NX(info);
		else if (nx == columnDtl_num3) doDtl_num3_NX(info);
		else if (nx == columnDtl_num4) doDtl_num4_NX(info);
		else if (nx == columnDtl_num5) doDtl_num5_NX(info);
		else if (nx == columnDtl_num6) doDtl_num6_NX(info);
		else if (nx == columnDtl_num7) doDtl_num7_NX(info);
		else if (nx == columnDtl_num8) doDtl_num8_NX(info);
		else if (nx == columnDtl_num9) doDtl_num9_NX(info);
		else if (nx == columnDtl_num10) doDtl_num10_NX(info);
		else if (nx == columnDtl_dt1) doDtl_dt1_NX(info);
		else if (nx == columnDtl_dt2) doDtl_dt2_NX(info);
		else if (nx == columnDtl_dt3) doDtl_dt3_NX(info);
		else if (nx == columnDtl_dt4) doDtl_dt4_NX(info);
		else if (nx == columnDtl_dt5) doDtl_dt5_NX(info);
		else if (nx == columnDtl_dt6) doDtl_dt6_NX(info);
		else if (nx == columnDtl_dt7) doDtl_dt7_NX(info);
		else if (nx == columnDtl_dt8) doDtl_dt8_NX(info);
		else if (nx == columnDtl_dt9) doDtl_dt9_NX(info);
		else if (nx == columnDtl_dt10) doDtl_dt10_NX(info);
		else if (nx == columnDtl_flg1) doDtl_flg1_NX(info);
		else if (nx == columnDtl_flg2) doDtl_flg2_NX(info);
		else if (nx == columnDtl_flg3) doDtl_flg3_NX(info);
		else if (nx == columnDtl_flg4) doDtl_flg4_NX(info);
		else if (nx == columnDtl_flg5) doDtl_flg5_NX(info);
		else if (nx == columnDtl_flg6) doDtl_flg6_NX(info);
		else if (nx == columnDtl_flg7) doDtl_flg7_NX(info);
		else if (nx == columnDtl_flg8) doDtl_flg8_NX(info);
		else if (nx == columnDtl_flg9) doDtl_flg9_NX(info);
		else if (nx == columnDtl_flg10) doDtl_flg10_NX(info);
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
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_gp_grp_cd) doLcl_gp_grp_cd_NX(info);
		else if (nx == columnLcl_key1) doLcl_key1_NX(info);
		else if (nx == columnLcl_key2) doLcl_key2_NX(info);
		else if (nx == columnLcl_key3) doLcl_key3_NX(info);
		else if (nx == columnLcl_key4) doLcl_key4_NX(info);
		else if (nx == columnLcl_key5) doLcl_key5_NX(info);
		else if (nx == columnLcl_key6) doLcl_key6_NX(info);
		else if (nx == columnLcl_key7) doLcl_key7_NX(info);
		else if (nx == columnLcl_key8) doLcl_key8_NX(info);
		else if (nx == columnLcl_key9) doLcl_key9_NX(info);
		else if (nx == columnLcl_key10) doLcl_key10_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_char1) doLcl_char1_NX(info);
		else if (nx == columnLcl_char2) doLcl_char2_NX(info);
		else if (nx == columnLcl_char3) doLcl_char3_NX(info);
		else if (nx == columnLcl_char4) doLcl_char4_NX(info);
		else if (nx == columnLcl_char5) doLcl_char5_NX(info);
		else if (nx == columnLcl_char6) doLcl_char6_NX(info);
		else if (nx == columnLcl_char7) doLcl_char7_NX(info);
		else if (nx == columnLcl_char8) doLcl_char8_NX(info);
		else if (nx == columnLcl_char9) doLcl_char9_NX(info);
		else if (nx == columnLcl_char10) doLcl_char10_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key10_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[gp_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gp_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char11_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char12_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char13_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char14_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char15_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char16_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char17_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char18_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char19_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char20_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_flg10_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[gp_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_gp_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key4_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key5_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key6_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key7_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key8_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key9_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key10_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char4_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char5_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char6_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char7_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char8_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char9_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char10_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_gp_grp_cd) doCnd_gp_grp_cd_LC(info);
		else if (lc == Cnd_gp_grp_nm) doCnd_gp_grp_nm_LC(info);
		else if (lc == Cnd_key1) doCnd_key1_LC(info);
		else if (lc == Cnd_key2) doCnd_key2_LC(info);
		else if (lc == Cnd_key3) doCnd_key3_LC(info);
		else if (lc == Cnd_key4) doCnd_key4_LC(info);
		else if (lc == Cnd_key5) doCnd_key5_LC(info);
		else if (lc == Cnd_key6) doCnd_key6_LC(info);
		else if (lc == Cnd_key7) doCnd_key7_LC(info);
		else if (lc == Cnd_key8) doCnd_key8_LC(info);
		else if (lc == Cnd_key9) doCnd_key9_LC(info);
		else if (lc == Cnd_key10) doCnd_key10_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_gp_grp_cd) doDtl_gp_grp_cd_LC(info);
		else if (lc == columnDtl_key1) doDtl_key1_LC(info);
		else if (lc == columnDtl_key2) doDtl_key2_LC(info);
		else if (lc == columnDtl_key3) doDtl_key3_LC(info);
		else if (lc == columnDtl_key4) doDtl_key4_LC(info);
		else if (lc == columnDtl_key5) doDtl_key5_LC(info);
		else if (lc == columnDtl_key6) doDtl_key6_LC(info);
		else if (lc == columnDtl_key7) doDtl_key7_LC(info);
		else if (lc == columnDtl_key8) doDtl_key8_LC(info);
		else if (lc == columnDtl_key9) doDtl_key9_LC(info);
		else if (lc == columnDtl_key10) doDtl_key10_LC(info);
		else if (lc == columnDtl_char1) doDtl_char1_LC(info);
		else if (lc == columnDtl_char2) doDtl_char2_LC(info);
		else if (lc == columnDtl_char3) doDtl_char3_LC(info);
		else if (lc == columnDtl_char4) doDtl_char4_LC(info);
		else if (lc == columnDtl_char5) doDtl_char5_LC(info);
		else if (lc == columnDtl_char6) doDtl_char6_LC(info);
		else if (lc == columnDtl_char7) doDtl_char7_LC(info);
		else if (lc == columnDtl_char8) doDtl_char8_LC(info);
		else if (lc == columnDtl_char9) doDtl_char9_LC(info);
		else if (lc == columnDtl_char10) doDtl_char10_LC(info);
		else if (lc == columnDtl_char11) doDtl_char11_LC(info);
		else if (lc == columnDtl_char12) doDtl_char12_LC(info);
		else if (lc == columnDtl_char13) doDtl_char13_LC(info);
		else if (lc == columnDtl_char14) doDtl_char14_LC(info);
		else if (lc == columnDtl_char15) doDtl_char15_LC(info);
		else if (lc == columnDtl_char16) doDtl_char16_LC(info);
		else if (lc == columnDtl_char17) doDtl_char17_LC(info);
		else if (lc == columnDtl_char18) doDtl_char18_LC(info);
		else if (lc == columnDtl_char19) doDtl_char19_LC(info);
		else if (lc == columnDtl_char20) doDtl_char20_LC(info);
		else if (lc == columnDtl_num1) doDtl_num1_LC(info);
		else if (lc == columnDtl_num2) doDtl_num2_LC(info);
		else if (lc == columnDtl_num3) doDtl_num3_LC(info);
		else if (lc == columnDtl_num4) doDtl_num4_LC(info);
		else if (lc == columnDtl_num5) doDtl_num5_LC(info);
		else if (lc == columnDtl_num6) doDtl_num6_LC(info);
		else if (lc == columnDtl_num7) doDtl_num7_LC(info);
		else if (lc == columnDtl_num8) doDtl_num8_LC(info);
		else if (lc == columnDtl_num9) doDtl_num9_LC(info);
		else if (lc == columnDtl_num10) doDtl_num10_LC(info);
		else if (lc == columnDtl_dt1) doDtl_dt1_LC(info);
		else if (lc == columnDtl_dt2) doDtl_dt2_LC(info);
		else if (lc == columnDtl_dt3) doDtl_dt3_LC(info);
		else if (lc == columnDtl_dt4) doDtl_dt4_LC(info);
		else if (lc == columnDtl_dt5) doDtl_dt5_LC(info);
		else if (lc == columnDtl_dt6) doDtl_dt6_LC(info);
		else if (lc == columnDtl_dt7) doDtl_dt7_LC(info);
		else if (lc == columnDtl_dt8) doDtl_dt8_LC(info);
		else if (lc == columnDtl_dt9) doDtl_dt9_LC(info);
		else if (lc == columnDtl_dt10) doDtl_dt10_LC(info);
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
		else if (lc == columnLcl_gp_grp_cd) doLcl_gp_grp_cd_LC(info);
		else if (lc == columnLcl_key1) doLcl_key1_LC(info);
		else if (lc == columnLcl_key2) doLcl_key2_LC(info);
		else if (lc == columnLcl_key3) doLcl_key3_LC(info);
		else if (lc == columnLcl_key4) doLcl_key4_LC(info);
		else if (lc == columnLcl_key5) doLcl_key5_LC(info);
		else if (lc == columnLcl_key6) doLcl_key6_LC(info);
		else if (lc == columnLcl_key7) doLcl_key7_LC(info);
		else if (lc == columnLcl_key8) doLcl_key8_LC(info);
		else if (lc == columnLcl_key9) doLcl_key9_LC(info);
		else if (lc == columnLcl_key10) doLcl_key10_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_char1) doLcl_char1_LC(info);
		else if (lc == columnLcl_char2) doLcl_char2_LC(info);
		else if (lc == columnLcl_char3) doLcl_char3_LC(info);
		else if (lc == columnLcl_char4) doLcl_char4_LC(info);
		else if (lc == columnLcl_char5) doLcl_char5_LC(info);
		else if (lc == columnLcl_char6) doLcl_char6_LC(info);
		else if (lc == columnLcl_char7) doLcl_char7_LC(info);
		else if (lc == columnLcl_char8) doLcl_char8_LC(info);
		else if (lc == columnLcl_char9) doLcl_char9_LC(info);
		else if (lc == columnLcl_char10) doLcl_char10_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[gp_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key10_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[gp_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gp_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_key10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char11_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char12_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char13_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char14_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char15_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char16_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char17_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char18_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char19_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[char20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_char20_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[num10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_num10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt10_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[gp_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_gp_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key4_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key5_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key6_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key7_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key8_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key9_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_key10_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char4_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char5_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char6_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char7_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char8_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char9_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[char10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_char10_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_gp_grp_cd]の作成メソッド
	 */
	public MCList getCnd_gp_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getGpGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0900.Srch01")) {
			return new MA_MABCL0900_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0900.Upd01")) {
			return new MA_MABCL0900_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0900.Del01")) {
			return new MA_MABCL0900_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0900_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0900_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0900_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0900_Srch01Bridge() {
			p_MA_MABCL0900_Srch01 = new MCParam(PDef.MA_MABCL0900_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0900_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0900.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0900.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0900.LclR.class));

			p_MA_MABCL0900_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0900_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0900_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0900_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0900_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0900.CndR up0() {
			return (mcframe.clientMABC.MABCP0900.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0900.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0900.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0900.LclR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0900.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL0900_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0900.DtlR.class));
			p_MA_MABCL0900_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0900.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0900_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0900.DtlR>)p_MA_MABCL0900_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0900.LclR>)p_MA_MABCL0900_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getLclAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0900_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0900_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0900_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0900_Upd01Bridge() {
			p_MA_MABCL0900_Upd01 = new MCParam(PDef.MA_MABCL0900_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0900_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0900.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0900.LclR.class));
			// Down

			p_MA_MABCL0900_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0900_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0900_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0900_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0900_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0900_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0900.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0900.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0900.LclR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0900.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0900_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL0900_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0900_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0900_Del01;

		/** コンストラクタ */
		protected MA_MABCL0900_Del01Bridge() {
			p_MA_MABCL0900_Del01 = new MCParam(PDef.MA_MABCL0900_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0900_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0900.DtlR.class));
			// Down

			p_MA_MABCL0900_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0900_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0900_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0900_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0900_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0900.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0900.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0900_Del01;
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